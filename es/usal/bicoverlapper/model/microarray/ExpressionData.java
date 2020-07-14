package es.usal.bicoverlapper.model.microarray;

import java.awt.Point;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

import org.rosuda.JRI.REXP;
import org.rosuda.JRI.RList;
import org.rosuda.JRI.Rengine;

import prefuse.data.Table;
import prefuse.data.expression.parser.ExpressionParser;
import prefuse.data.io.DelimitedTextTableReader;
import prefuse.data.util.Sort;
import prefuse.util.collections.IntIterator;
import es.usal.bicoverlapper.controller.analysis.Analysis;
import es.usal.bicoverlapper.controller.analysis.AnalysisProgressMonitor;
import es.usal.bicoverlapper.controller.analysis.AnalysisProgressMonitor.AnalysisTask;
import es.usal.bicoverlapper.controller.data.reader.NCBIReader;
import es.usal.bicoverlapper.controller.kernel.Selection;
import es.usal.bicoverlapper.controller.kernel.Session;
import es.usal.bicoverlapper.model.annotations.GOTerm;
import es.usal.bicoverlapper.model.gene.GeneAnnotation;
import es.usal.bicoverlapper.model.gene.GeneRequester;
import es.usal.bicoverlapper.model.stats.Stats;
import es.usal.bicoverlapper.utils.RUtils;
import es.usal.bicoverlapper.utils.Sizeof;
import es.usal.bicoverlapper.view.analysis.monitor.AnnotationProgressMonitor;
import es.usal.bicoverlapper.view.analysis.monitor.AnnotationProgressMonitor2;
import es.usal.bicoverlapper.view.analysis.monitor.EnrichmentTestProgressMonitor;
import es.usal.bicoverlapper.view.data.monitor.MicroarrayLoadProgressMonitor;
import es.usal.bicoverlapper.view.diagram.heatmap2.ExpressionSubset;
import es.usal.bicoverlapper.view.main.BicOverlapperWindow;
import gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType;
import gov.nih.nlm.ncbi.www.soap.eutils.esummary.DocSumType;

/**
 * Class with data of Microarray expression levels, using Prefuse Tables
 * <p>
 * 
 * MicroarrayData will contain:
 * <p>
 * For each gene/condition:
 * <p>
 * "name" - name of the gene/condition (String)-,
 * <p>
 * "id" - unique identifier for the gene/condition (int)- and
 * <p>
 * "rowRank"/"colRank" - order in which it is drawn (int).
 * <p>
 * For each expression level:
 * <p>
 * "gene" - name of the gene for this expression level (String)-,
 * <p>
 * "condition" - name of the condition for this expression level (String)-,
 * <p>
 * "rowId" - id of the gene for this expression level (int)-,
 * <p>
 * "colId" - id of the condition for this expression level (int)-,
 * <p>
 * "rowRank" - order in which the gene is drawn (int)-,
 * <p>
 * "colRank" - order in which the condition is drawn (int)- and
 * <p>
 * "level" - expression level (double)
 * <p>
 * 
 * In addition, an ancillary sparse matrix is built to avoid performance
 * downgrades with very large matrices. It contains only numSparseGenes,
 * typically a number around 200. The genes are randomly selected from the
 * original matrix, and can also be selected by rebuilding the matrix with
 * buildSparse(). It uses Prefuse Tables as described above, except it add a
 * actualRowId that refers to the id in the original matrix, while rowId is used
 * for the id in the sparse matrix.
 * 
 * @author Rodrigo Santamaria
 * 
 */
public class ExpressionData {
	Table levels;// Expresion levels as usual matrix
	Table expressions;// Expresion levels, each one as tuple (gene, condition,
						// level)
	/**
	 * matrix with expression levels replicated, to quicken some arithmetic
	 * operations TODO: remove, may lead to memory problems in large matrices
	 */
	public double matrix[][];
	Table geneLabels;
	Table conditionLabels;
	int maxGenes = 199;// A partir de 200
	Table sparseExpressions;// As above, but sparse (only a maximum number of
							// genes are shown)
	Table sparseGeneLabels;

	// Stores the different R names of matrices loaded. Typically raw, merged,
	// normalized, discretized, etc.
	// Typically, analysis and visualization will be done on the last matrix
	// computed, but this is not always the case
	// for example, limma and gsea analysis cannot be done on merged matrices
	// because they need several replicates of each efv
	// public String[] matrixLabels=new String[]{"eset.raw", "eset.merged",
	// "eset.normalized", "eset.discretized"};
	// public enum Status { RAW, MERGED, NORMALIZED, DISCRETIZED }
	// public String selectedMatrixLabel=matrixLabels[Status.RAW.ordinal()];
	public String filePath;// Absolute path with the file that corresponds to
							// this data structure
	public String path;// Path for the folder containing the file that
						// corresponds to this data structure
	public String name;// Name of the file that corresponds to this data
						// structure
	public String rMatrixName;// Name in R for this data structure
	// TODO: Selection panel for selection of the matrix over which to compute
	// and visualize. By now, everything is on the last one
	// computed, except if limma or gsea, on the raw matrix always

	/**
	 * Names for the conditions.
	 */
	public String[] conditionNames;
	/**
	 * Gene names.
	 */
	public String[] geneNames;

	/**
	 * Labels for the conditions. They are built initially from conditionNames
	 * and geneNames, but the user can change them to any combination of values
	 * present for gene ids or for experimental factors.
	 */
	public String[] columnLabels;
	/**
	 * Gene names.
	 */
	public String[] rowLabels;

	public ArrayList<String> experimentFactors;
	/**
	 * Every key is a experimental factor, every array contains all the values
	 * for that factor (e.g. key="Time", values="0 min, 0 min, 20 min, 40 min")
	 */
	public HashMap<String, String[]> experimentFactorValues;

	// For any other annotation present in the data in the first place (by now,
	// not used)
	public ArrayList<String> geneFactors;
	public HashMap<String, String[]> geneFactorValues;

	/**
	 * Session class into which this microarray data is loaded
	 */
	// Session session=null;

	/**
	 * Type of gene names used. If GENENAME, annotations are searched with
	 * Entrez Gene and QuickGO
	 */
	public String rname = "GENENAME";
	public String rdescription = "DESCRIPTION";
	public String rgo = "GO";
	/**
	 * Usually the R resource to search for gene annotations is an environment
	 * like for example illuminaHumanv1.db, but in some cases it is a database
	 * that cannot be accessed with get, mget; but with queries, and there is no
	 * environment counterpart. On these cases, in example Illumina Human HT12
	 * for which there is no environment db but there is lumiHumanIDMapping
	 * package, isRDatabase is set to true and the search is done by dbGetQuery
	 * in R.
	 */
	public boolean isRDatabase = false;
	/**
	 * As isRDatabase, but with bioMaRt package, where getGene will be used for
	 * annotations
	 */
	public boolean isBioMaRt = false;

	/**
	 * As isRDatabase, but with GO.db package, where annotations of GO terms are
	 * in GOTERM
	 */
	public boolean isGO = false;

	public Rengine re = null;
	private Analysis rManager = null;

	int numGenes;
	int numSparseGenes;// for sparse matrices
	int numConditions;
	private int[] decimals;

	/**
	 * Average expression value of the whole expression matrix
	 */
	public double average = 0;

	/**
	 * Maximum expression value of the whole expression matrix
	 */
	public double max;
	/**
	 * Minimum expression value of the whole expression matrix
	 */
	public double min;

	public String chip;// kind of microarray chip (any official for Affymetrix
						// permitted, by now), or kind of name taken by genes
						// (geneID and ORF permitted)
	public String organism;// Name of organism as registered in NCBI
	public Map<Integer, GeneAnnotation> geneAnnotations;// Gene Annotations from
														// NCBI and
														// GeneOntology. It is
														// also used as variable
														// for waiting/notifying
														// annotation searches
	public Map<String, GOTerm> GOTerms;// GO terms stored. The key is the go id.
	public boolean searchByR = false; // if there is information in the file
										// about an available R package, gene
										// annotations are taken from there,
										// otherwise they're searched in NCBI
	boolean annotationsRetrieved = false;

	public AnnotationTask annotTask;
	private AnnotationProgressMonitor annotProgressMon;

	// GeneAnnotation retrieval
	private GeneRequester geneRequester;
	private EnrichmentTestTask ht;
	private LoadTask loadTask;
	public MicroarrayRequester microarrayRequester;
	public int[] columnOrder;
	public double[] averageCols;
	public double[] minCols;
	public double[] maxCols;
	public double[] sdCols;
	public double sd; //average sd

	public double[] q75;// quantile 75 for each column
	public double[] q25;// quantile 25 for each column
	public double[] iqr;// interquantile range, computed as
						// quantile75-quantile25
	public double whiskerRange = 1.5;// this value multiplies iqr to get boxplot
										// whiskers
	public double[] median;
	public HashMap<Integer, int[]> outliers;// for each column, the gene
											// above/below iqr*whiskerRange

	private AnnotationTask at;
	private AnnotationProgressMonitor2 amd2;
	public String sortingFactor = "Column ID";
	
	private BicOverlapperWindow ventana;
	
	public double[] medianCols;
	private ArrayList<Double[]> quantileCols;
	private double[] quantiles=new double[100];//min. expression value to be in quantile i%
	private double mediana;
	private AnalysisTask t;
	private Session session;
	
	//clase que controla la barra de progreso cuando se est�n obteniendo las anotaciones
	//MicroarrayAnnotationsLoadProgressBar mlpb = null;
	
	/**
	 * Constructor from a file
	 * 
	 * @param path
	 *            Path to the file with microarray information
	 * @param invert
	 *            true if genes are columns (genes as rows are considered as the
	 *            usual option)
	 * @param rowHeader
	 *            Number of initial rows with row information (usually one)
	 * @param colHeader
	 *            Number of initial columns with column information (usually
	 *            one)
	 * @param nd
	 *            Number of decimals to be shown if numerically showing
	 *            expression levels
	 */
	public ExpressionData(File file, boolean invert, int rowHeader,
			int colHeader, int nd, MicroarrayRequester mr, Analysis a, Session sesion)
			throws Exception {
		MicroarrayLoadProgressMonitor pmd = new MicroarrayLoadProgressMonitor();
		loadTask = new LoadTask();
		loadTask.setFile(file);
		loadTask.invert = invert;
		loadTask.rowHeader = rowHeader;
		loadTask.colHeader = colHeader;
		loadTask.nd = nd;
		experimentFactors = new ArrayList<String>();
		experimentFactorValues = new HashMap<String, String[]>();
		this.path=file.getAbsolutePath();
		this.filePath = this.path; 
		this.session=sesion;
		
		this.ventana = sesion.getMainWindow();

		// a�adido para que funcione en windows (en principio en unix no dar�
		// problemas)
		path = path.replace("\\", "/");

		this.name = path.substring(path.lastIndexOf("/") + 1,
				path.lastIndexOf("."));
		this.path = path.substring(0, path.lastIndexOf("/"));
		this.rMatrixName = name.replace("-", "").replace(" ", ".");
		this.rManager = a;
		this.re = a.r;

		rManager.setMicroarrayData(this);

		at = new AnnotationTask();
		pmd.setTask(loadTask);
		pmd.run();
		if (mr != null) {
			microarrayRequester = mr;
			Thread wt = new Thread() {
				public void run() {
					try {
						microarrayRequester.receiveMatrix(loadTask.get());
					} catch (NumberFormatException e) {
						JOptionPane
								.showMessageDialog(
										null,
										"Possibly numeric values for expression factors. Change to unequivocal strings (e.g. 27 to 27 years) or start name by \"EF.\" (e.g. Age to EF.Age)\n\t"
												+ e.getMessage(), "Error",
										JOptionPane.ERROR_MESSAGE);
						e.printStackTrace();
					} catch (Exception e) {
						JOptionPane.showMessageDialog(
								null,
								"Error reading the expression matrix\n\t"
										+ e.getMessage(), "Error",
								JOptionPane.ERROR_MESSAGE);
						e.printStackTrace();
						//TODO: close properly everything
					}
				}
			};
			wt.start();
		}

	}

	/**
	 * Given an experimental factor (e.g. "Time") it returns its values for the
	 * conditions (e.g. "0 min", "0 min", "40 min", "40 min")
	 * 
	 * @param experimentFactor
	 * @return
	 */
	public String[] getExperimentFactorValues(String experimentFactor) {
		return this.experimentFactorValues.get(experimentFactor);
	}
	
	/**
	 * Returns the condition names that are labelled with one of the input value(s) for the given experiment factor
	 * @param experimentFactorValue
	 * @return
	 */
	public ArrayList<String> getConditionNames(String experimentFactor, ArrayList<String> values)
		{
		ArrayList<String> cn=new ArrayList<String>();
		String[] efvs = experimentFactorValues.get(experimentFactor);
		for(int i=0;i<efvs.length;i++)
			{
			for(String s:values)
				if(s.equals(efvs[i]))
					cn.add(conditionNames[i]);
			}
		return cn;
		}

	/**
	 * Sets the table geneLabels and conditionLabels to fit with rowLabels and
	 * columnLabels values
	 */
	public void changeLabels() {
		for (int i = 0; i < rowLabels.length; i++) {
			geneLabels.setString(i, "name", rowLabels[i]);
		}
		for (int i = 0; i < columnLabels.length; i++) {
			conditionLabels.setString(i, "name", columnLabels[i]);
		}
	}

	/**
	 * Corverts the expression matrix mat to a new matrix with information that
	 * Prefuse graphs can manage
	 * 
	 * @param mat
	 * @param skipColumns
	 *            number of columns to skip, as they are only informative
	 * @return
	 */
	private Table convert(Table mat, int skipRows, int skipColumns) {
		Table ret = new Table();
		ret.addColumn("gene", String.class);
		ret.addColumn("condition", String.class);
		ret.addColumn("level", double.class);
		ret.addColumn("rowRank", int.class);// For row/column reordering
		ret.addColumn("colRank", int.class);
		ret.addColumn("rowId", int.class);// For row/column selection
		ret.addColumn("colId", int.class);

		// Build sparse expression level matrix
		sparseExpressions = new Table();
		sparseExpressions.addColumn("gene", String.class);
		sparseExpressions.addColumn("condition", String.class);
		sparseExpressions.addColumn("level", double.class);
		sparseExpressions.addColumn("rowRank", int.class);
		sparseExpressions.addColumn("colRank", int.class);
		sparseExpressions.addColumn("rowId", int.class);
		sparseExpressions.addColumn("actualRowId", int.class);// Ids in the
																// whole matrix
																// ret
		sparseExpressions.addColumn("colId", int.class);

		int row = 0;
		int sparseRow = 0;
		int contGene = 0;
		int step = 1;
		if (numGenes > maxGenes)
			step = numGenes / maxGenes;
		matrix = new double[numGenes][numConditions];
		average = 0;
		averageCols = new double[numConditions];
		minCols = new double[numConditions];
		maxCols = new double[numConditions];
		sdCols = new double[numConditions];
		sd=0;
		for (int i = 0; i < numConditions; i++) {
			averageCols[i] = sdCols[i] = 0;
			String s = mat.getString(0 + skipRows, i + skipColumns);
			if (s == null || s.length() == 0)
			// NA values on matrix: by now they should be treated outside
			// TODO: allow NA values and its inside treatment
			{
				JOptionPane.showMessageDialog(
								null,
								"NA values on data matrix, please remove or impute NA values",
								"Error", JOptionPane.ERROR_MESSAGE);
				return null;
			}
			try{
			minCols[i] = maxCols[i] = new Double(mat.getString(0 + skipRows, i+ skipColumns)).doubleValue();
			}catch(NumberFormatException e)
				{
				JOptionPane.showMessageDialog(null, "NumberFormatException at "+mat.getString(0+skipRows, i+skipColumns), "Error", JOptionPane.ERROR_MESSAGE);
				return null;
				}
		}

		try{
			max = min = new Double(mat.getString(0 + skipRows, 0 + skipColumns))
				.doubleValue();
		}catch(NumberFormatException e)
		{
		JOptionPane.showMessageDialog(null, "NumberFormatException at "+mat.getString(0+skipRows, 0+skipColumns), "Error", JOptionPane.ERROR_MESSAGE);
		return null;
		}


		for (int i = 0; i < numGenes; i++) {
			for (int j = 0; j < numConditions; j++) {
				row = ret.addRow();
				ret.setString(row, "gene", geneNames[i].trim());
				ret.setString(row, "condition", conditionNames[j].trim());
				if(i==242 && j==0)
					System.out.println("here");
				try {
					matrix[i][j] = new Double(mat.getString(i + skipRows, j+ skipColumns)).doubleValue();
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(
									null,
									"Possible numeric expression factor: change to unequivocal strings (e.g. 27 to 27 years), or start expression factor name by \"EF.\"\n"
											+ e.getMessage(), "Read Error", JOptionPane.ERROR_MESSAGE);
					return null;
				}
				ret.setDouble(row, "level", matrix[i][j]);
				average += matrix[i][j];
				averageCols[j] += matrix[i][j];
				if (max < matrix[i][j])
					max = matrix[i][j];
				if (min > matrix[i][j])
					min = matrix[i][j];
				if (maxCols[j] < matrix[i][j])
					maxCols[j] = matrix[i][j];
				if (minCols[j] > matrix[i][j])
					minCols[j] = matrix[i][j];

				ret.setInt(row, "rowId", i);
				ret.setInt(row, "rowRank", i);
				ret.setInt(row, "colId", j);
				ret.setInt(row, "colRank", j);
				row++;
				if (i % step == 0) // replicate for sparse matrix
				{
					sparseRow = sparseExpressions.addRow();
					sparseExpressions.setString(sparseRow, "gene",
							geneNames[i].trim());
					sparseExpressions.setString(sparseRow, "condition",
							conditionNames[j].trim());

					sparseExpressions.setDouble(sparseRow, "level",
							matrix[i][j]);

					sparseExpressions.setInt(sparseRow, "rowId", contGene);
					sparseExpressions.setInt(sparseRow, "actualRowId", i);
					sparseExpressions.setInt(sparseRow, "rowRank", contGene);
					sparseExpressions.setInt(sparseRow, "colId", j);
					sparseExpressions.setInt(sparseRow, "colRank", j);
					sparseRow++;
				}
			}
			if (i % step == 0)
				contGene++;
		}

		for (int i = 0; i < numConditions; i++)
			averageCols[i] /= numGenes;
		average /= numGenes * numConditions;
		computeSd();
		
		this.computeQuantiles();
		
		return ret;
	}

	/**
	 * Computes the standard deviation of each column. Mean should be previously
	 * computed (right now it's done in convert())
	 */
	private void computeSd() {
		long t = System.currentTimeMillis();
		sd=0;
		for (int i = 0; i < numConditions; i++) 
			{
			for (int j = 0; j < numGenes; j++)
				sdCols[i] += Math.abs(averageCols[i] - matrix[j][i]);
			sdCols[i] /= numGenes;
			sd+=sdCols[i];
			}
		sd/=numConditions;
		System.out.println("Time to compute sd "
				+ (System.currentTimeMillis() - t) / 1000.0);
	}

	/**
	 * Inverts rows and columns
	 * 
	 * @param table
	 * @return
	 */
	private Table invert(Table table) {
		Table ret = new Table();

		for (int i = 0; i < table.getRowCount(); i++)// Ponemos tantas columnas
														// como filas
		{
			ret.addColumn(conditionNames[i], double.class);
		}
		int row = 0;
		for (int i = 0; i < table.getColumnCount(); i++) {
			row = ret.addRow();
			for (int j = 0; j < table.getRowCount(); j++)
				ret.setDouble(row, conditionNames[j],
						((Double) table.get(j, i)).doubleValue());
			row++;
		}
		return ret;
	}

	/**
	 * Builds an internal sparse matrix that contains the specified genes. A
	 * sparse matrix is a reduced matrix from the whole matrix, with just some
	 * genes to avoid visualization or computing downgrade. It contains only
	 * numSparseGenes (typically, a number around 200). The rest of genes up to
	 * numSparseGenes are randomly selected TODO: make the selection totally
	 * random after previous selections
	 * 
	 * @param genes
	 */
	public void buildSparse(LinkedList<Integer> genes) {
		buildSparseGeneMatrix();
		for (int i = 0; i < genes.size(); i++) {
			if(genes.get(i)>=0)
				{
				Table t = sparseGeneLabels.select(
						ExpressionParser.predicate("actualId = " + genes.get(i)
								+ ""), new Sort());
				if (t == null || t.getRowCount() == 0) {
					int j = 0;
					while (genes.contains(sparseGeneLabels.getTuple(j).getInt(
							"actualId")))
						j++;// mientras est� en genes, probamos con la sig.
					sparseGeneLabels.setString(j, "name", rowLabels[genes.get(i)]);// Nuevo
																					// nombre
																					// e
																					// id
																					// para
																					// �l,
																					// el
																					// resto
																					// no
																					// cambia
					sparseGeneLabels.setInt(j, "actualId", genes.get(i));
					int id = sparseGeneLabels.getInt(j, "id");
					int actualId = genes.get(i);
					int cont = j * numConditions;
					for (int k = 0; k < this.numConditions; k++) {
						this.sparseExpressions.setInt(cont + k, "actualRowId",
								actualId);
						this.sparseExpressions.setInt(cont + k, "rowId", id);
						this.sparseExpressions.setString(cont + k, "gene",
								rowLabels[actualId]);
						this.sparseExpressions.setDouble(cont + k, "level",
								matrix[actualId][k]);
					}
				}
			}
		}

		// sortColumns();//refresh the rowRanks to fit with the columnOrder
		// established
		return;
	}

	/**
	 * Builds a small form for the sample with id i
	 * 
	 * @param i
	 * @return
	 */
	public String getDetailedSampleForm(int i) {
		String form = "";
		form = form.concat("SampleId: " + conditionNames[i] + "\n");
		for (String s : experimentFactors) {
			form = form.concat(s + ": " + experimentFactorValues.get(s)[i]
					+ "\n");
		}
		form = form.concat("\n");
		return form;
		// TODO: Properly finish the from for samples
	}

	/**
	 * Given a geneId, searches for its Entrez ID and opens a browser with the
	 * corresponding EntrezGene webpage
	 * 
	 * @param geneId
	 */
	public void browseEntrezGene(int geneId) {
		try{
			String entrezLabel=null;
			if(getEntrezIds()!=null && getEntrezIds().length>0)
				entrezLabel=getEntrezIds()[geneId];
			//getGeneAnnotation(geneId);
			if(entrezLabel!=null && entrezLabel.length()>0)
				java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://www.ncbi.nlm.nih.gov/gene?term="+entrezLabel));
			else
				{
				GeneAnnotation ga=getGeneAnnotation(geneId);
				if(ga!=null && ga.getName()!=null)
						java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://www.ncbi.nlm.nih.gov/gene?term="+ga.getName()+"%20AND%20"+getOrganism().replace(" ", "%20")+"%5BOrganism%5D"));
				else	java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://www.ncbi.nlm.nih.gov/gene?term="+getGeneName(geneId)+"%20AND%20"+getOrganism().replace(" ", "%20")+"%5BOrganism%5D"));
				}
			}catch(IOException e){System.out.println("Error: cannot show webpage: "+e.getMessage()); e.printStackTrace();}
			
		}

	/**
	 * Returns the table with expression levels
	 * 
	 * @return Table with expression levels
	 */
	public Table getExpressions() {

		return expressions;
	}

	/**
	 * Returns the expression level of gene i under condition j
	 * 
	 * @param i
	 *            position in the matrix of the gene
	 * @param j
	 *            position in the matrix of the condition
	 * @return expression level in row i, column j
	 */
	public double getExpressionAt(int i, int j) {
		if (i >= 0 && i < this.numGenes && j >= 0 && j < this.numConditions)
			return matrix[i][j];
		else
			return this.average;// TODO: this should be NA
	}
	
	
	public double[] getExpressionProfile(int i)
	{
	double[] profile=new double[numConditions];
	for(int j=0;j<numConditions;j++)
		profile[j]=matrix[i][j];
	return profile;
	}

	public ArrayList<Float> getExpressionProfileArray(int i)
	{
	ArrayList<Float> profile=new ArrayList<Float>();
	for(int j=0;j<numConditions;j++)
		profile.add((float)matrix[i][j]);
	return profile;
	}
	
	public Map<String, ArrayList<Float>> getExpressionProfileMap(List<Integer> ids)
		{
		Map<String, ArrayList<Float>> map=new HashMap<String, ArrayList<Float>>();
		for(int id:ids)
			{
			if(id>=0)	map.put(this.getGeneName(id), getExpressionProfileArray(id));
			}
		return map;
		}
		
	public float[] getAverageExpressionProfile(ArrayList<Integer> l)
		{
		float[] profile=new float[numConditions];
		for(int j=0;j<numConditions;j++)
			{
			profile[j]=0;
			for(int i:l)
				profile[j]+=matrix[i][j];
			profile[j]/=l.size();
			}
		return profile;
		}

	/**
	 * Sets the table with expression levels
	 * 
	 * @param expressions
	 *            Table with expression levels (see the description of this
	 *            class)
	 */
	public void setExpressions(Table expressions) {
		this.expressions = expressions;
	}

	/**
	 * Returns the number of genes in the Microarray
	 * 
	 * @return the number of genes in the Microarray
	 */
	public int getNumGenes() {
		return numGenes;
	}

	/**
	 * Returns the number of conditions in the Microarray
	 * 
	 * @return the number of conditions in the Microarray
	 */
	public int getNumConditions() {
		return numConditions;
	}

	/**
	 * Returns the gene information
	 * 
	 * @return a Table with gene names, ids and ranks
	 */
	public Table getGeneLabels() {
		return geneLabels;
	}

	/**
	 * Returns the condition information
	 * 
	 * @return a Table with condition names, ids, and ranks
	 */
	public Table getConditionLabels() {
		return conditionLabels;
	}

	/**
	 * Returns the condition information
	 * 
	 * @return a Table with condition names, ids, and ranks
	 */
	public Table getConditionLabelsSameLength() {
		Table t = conditionLabels;
		int lmax = 0;
		for (int j = 0; j < t.getRowCount(); j++) {
			int l = t.getString(j, "name").length();
			if (l > lmax)
				lmax = l;
		}
		for (int j = 0; j < t.getRowCount(); j++) {
			String s = t.getString(j, "name");
			while (s.length() < lmax)
				s = s + " ";
		}
		return t;
	}

	/**
	 * Returns the condition names
	 * 
	 * @return an array of strings with condition names, ordered by id
	 */
	public String[] getConditionNames() {
		return conditionNames;
	}

	/**
	 * Returns the name of the condition at the specified position
	 * 
	 * @param pos
	 *            position of the condition in the matrix
	 * @return name of the condition
	 */
	public String getConditionName(int pos) {
		return conditionNames[pos];
	}

	/**
	 * Returns the name of the condition at the specified position
	 * 
	 * @param pos
	 *            position of the condition in the matrix
	 * @return name of the condition
	 */
	public String getColumnLabel(int pos) {
		return columnLabels[pos];
	}

	/**
	 * Returns the name of the condition at the specified position
	 * 
	 * @param pos
	 *            position of the condition in the matrix
	 * @return name of the condition
	 */
	public String getRowLabel(int pos) {
		if (pos >= 0 && pos < rowLabels.length)
			return rowLabels[pos];
		else
			return "NA";
	}

	/**
	 * Returns the gene names
	 * 
	 * @return an array of strings with gene names, ordered by id
	 */
	public String[] getGeneNames() {
		return geneNames;
	}
	public String[] getGeneNamesArray(List<Integer> geneIds) {
		ArrayList<String> names=new ArrayList<String>();
		for(int id:geneIds)
			if(id>=0)	names.add(this.getGeneName(id));
		return names.toArray(new String[0]);
	}

	public LinkedList<Integer> getGeneIds() {
		LinkedList<Integer> ret = new LinkedList<Integer>();
		for (int i = 0; i < geneNames.length; i++) {
			ret.add(i);
		}
		return ret;
	}

	public LinkedList<Integer> getNonAnnotatedGeneIds() {
		LinkedList<Integer> ret = new LinkedList<Integer>();
		for (int i = 0; i < geneNames.length; i++) {
			if (geneAnnotations.get(i) == null
					|| geneAnnotations.get(i).getGoTerms() == null)
				ret.add(i);
		}
		return ret;
	}

	/**
	 * Returns the condition id of a condition name
	 * 
	 * @param conditionName
	 *            condition name to know its id
	 * @return id for the condition name, or -1 if it is not found
	 */
	public int getConditionId(String conditionName) {
		int id = -1;
		for (int i = 0; i < conditionNames.length; i++)
			if (conditionNames[i].equals(conditionName))
				return i;
		return id;
	}

	/**
	 * Returns the gene id of a gene name
	 * 
	 * @param geneName
	 *            gene name to know its id
	 * @return id for the gene name, or -1 if it is not found
	 */
	public int getGeneId(String geneName) {
		int id = -1;
		for (int i = 0; i < geneNames.length; i++)
			if (geneNames[i].equals(geneName))
				return i;
		return id;
	}

	/**
	 * Return the sparse id of an actual gene id
	 * 
	 * @param geneId
	 * @returns sparse gene id, or -1 if not in the sparse matrix
	 */
	public int getSparseGeneId(int id) {
		int sid = -1;
		if(id<0)	return sid;
		IntIterator it = this.sparseGeneLabels.rows(ExpressionParser.predicate("actualId=" + id));
		Integer i=(Integer) it.next();
		if(i!=null)
			sid = sparseGeneLabels.getInt(i, "id");
		return sid;
	}

	/**
	 * Returns the constance by rows, columns or both, for a subset and genes
	 * and/or conditions The subset of genes and the subset of conditions may be
	 * null, but not both of them. If one of them is null, all gene/condition
	 * profile is considered.
	 * 
	 * @param genes
	 *            - subgroup of genes
	 * @param conditions
	 *            - subgroup of conditions
	 * @param type
	 *            - type of constance, by rows (0), by columns (1) or by both
	 *            rows and columns (2)
	 * @return the constance value for the subgroup
	 */
	public float getConstance(ArrayList<String> genes,
			ArrayList<String> conditions, int type){
		float constance = 0;
		double matrixBic[][] = new double[genes.size()][conditions.size()];
		// 1) Recuperamos la matriz sobre la que calcular la constancia
		for (int i = 0; i < genes.size(); i++) {
			String gene = genes.get(i);
			int row = getGeneId(gene.replaceAll("\\(", " \\("));
			for (int j = 0; j < conditions.size(); j++) 
				{
				String cond = conditions.get(j);
				int col = getConditionId(cond);
				
				if(row!=-1 && col!=-1)	matrixBic[i][j] = matrix[row][col];
				else				
					{
					if(row==-1)	System.err.println("Error: row "+gene+" not existing in expression data");
					if(col==-1)	System.err.println("Error: column "+cond+" not existing in expression data");
					matrixBic[i][j] = 0;
					}
				}
		}
		// 2) Calculamos la constancia
		float sum = 0;
		float sd = 0;
		int num = 0;
		switch (type) {
		case 0:
			num = genes.size();
			double[] midpoint = new double[conditions.size()];
			for (int i = 0; i < conditions.size(); i++)
				for (int j = 0; j < genes.size(); j++)
					midpoint[i] += matrixBic[j][i];
			for (int i = 0; i < conditions.size(); i++)
				midpoint[i] /= genes.size();
			for (int i = 0; i < genes.size(); i++) {
				double[] p0 = new double[conditions.size()];
				for (int j = 0; j < conditions.size(); j++)
					p0[j] = matrixBic[i][j];
				sd += euclideanDistance(p0, midpoint);
			}
			constance = (float) Math.sqrt(sd / num);

			break;
		case 1:
			num = conditions.size();
			break;
		case 2:
			num = genes.size() * conditions.size();
			for (int i = 0; i < genes.size(); i++)
				for (int j = 0; j < conditions.size(); j++)
					sum += matrixBic[i][j];
			for (int i = 0; i < genes.size(); i++)
				for (int j = 0; j < conditions.size(); j++)
					sd += Math.abs(matrixBic[i][j] - sum);
			constance = sd / num;
			break;
		}

		return constance;
	}

	/**
	 * Returns the euclidean distance between two points
	 * 
	 * @param p1
	 *            first point
	 * @param p2
	 *            second point
	 * @return euclidean distance TODO: move to utils
	 */
	private double euclideanDistance(double[] p1, double[] p2) {
		double ret = 0;
		for (int i = 0; i < p1.length; i++)
			ret += (p1[i] - p2[i]) * (p1[i] - p2[i]);
		return Math.sqrt(ret);
	}

	/**
	 * Returns a list of gene and condition names from two lists with genes and
	 * conditions ids
	 * 
	 * @param lg
	 *            list of gene ids
	 * @param lc
	 *            list of condition ids
	 * @return An ArrayList with Strings with corresponding gene and condition
	 *         names
	 */
	public ArrayList<String> getNames(LinkedList<Integer> lg,
			LinkedList<Integer> lc) {
		ArrayList<String> ret = new ArrayList<String>();
		for (int i = 0; i < lg.size(); i++)
			if(lg.get(i)>=0)	ret.add(geneNames[lg.get(i)]);
		for (int i = 0; i < lc.size(); i++)
			if(lc.get(i)>=0)	ret.add(conditionNames[lc.get(i)]);
		return ret;
	}

	/**
	 * Returns a list of gene names from a list with genes ids
	 * 
	 * @param lg
	 *            list of gene ids
	 * @return An ArrayList with Strings with corresponding gene and condition
	 *         names
	 */
	public ArrayList<String> getGeneNames(List<Integer> lg) {
		ArrayList<String> ret = new ArrayList<String>();
		for (int i = 0; i < lg.size(); i++)
			{
			if(lg.get(i)>=0)	ret.add(geneNames[lg.get(i)]);
			else
				System.out.println(lg.get(i)+" Non existing "+i);
			}
		return ret;
	}

	public String getGeneName(int lg) {
		if(lg>=0 && lg<geneNames.length)
			return geneNames[lg];
		else
			return null;
	}

	/**
	 * Updates 
	 * @param id
	 */
	public void getSimilarPatterns(int id)
		{
		ArrayList<Object> params = new ArrayList<Object>();
		params.add(10);
		params.add(getGeneName(id));
		AnalysisProgressMonitor apm = new AnalysisProgressMonitor(
				this.rManager,
				AnalysisProgressMonitor.AnalysisTask.SEARCH_PATTERNS,
				params, "Searching similar patterns...");
		apm.run();
		t = apm.getTask();
		Thread wt = new Thread() {
			public void run() {
				try {
					LinkedList<Integer> genesSeleccionados = new LinkedList<Integer>();
					LinkedList<Integer> condicionesSeleccionadas = new LinkedList<Integer>();

					String simprofs = t.get();
					if (simprofs == null)
						JOptionPane
								.showMessageDialog(
										null,
										"No similar profiles found",
										"Error",
										JOptionPane.ERROR_MESSAGE);
					else {
						String[] neighbors = simprofs
								.split(" ");
						System.out.println(neighbors);
						for (String n : neighbors)
							genesSeleccionados.add(getGeneId(n));
						for (int i = 0; i < getNumConditions(); i++)
							condicionesSeleccionadas
									.add((Integer) i);
						session.setSelectionAndUpdate(
								new Selection(
										(LinkedList<Integer>) genesSeleccionados.clone(),
										(LinkedList<Integer>) condicionesSeleccionadas.clone()), null);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		wt.start();
		}
	/**
	 * Returns a list of gene names from a list with genes ids
	 * 
	 * @param lg
	 *            list of gene ids
	 * @return An ArrayList with Strings with corresponding gene and condition
	 *         names
	 */
	public ArrayList<String> getRowLabels(LinkedList<Integer> lg) {
		ArrayList<String> ret = new ArrayList<String>();
		for (int i = 0; i < lg.size(); i++)
			{
			int pos=lg.get(i);
			if(pos>=0)	ret.add(rowLabels[lg.get(i)]);
			}
		return ret;
	}

	/**
	 * Returns a list of condition names a lists and conditions ids
	 * 
	 * @param lc
	 *            list of condition ids
	 * @return An ArrayList with Strings with corresponding gene and condition
	 *         names
	 */
	public ArrayList<String> getConditionNames(LinkedList<Integer> lc) {
		ArrayList<String> ret = new ArrayList<String>();
		if (conditionNames != null)
			for (int i = 0; i < lc.size(); i++)
				ret.add(conditionNames[lc.get(i)]);
		return ret;
	}

	/**
	 * Returns a list of condition names a lists and conditions ids
	 * 
	 * @param lc
	 *            list of condition ids
	 * @return An ArrayList with Strings with corresponding gene and condition
	 *         names
	 */
	public ArrayList<String> getColumnLabels(LinkedList<Integer> lc) {
		ArrayList<String> ret = new ArrayList<String>();
		if (columnLabels != null)
			for (int i = 0; i < lc.size(); i++)
				ret.add(columnLabels[lc.get(i)]);
		return ret;
	}

	/**
	 * Returns the Prefuse Table with expression levels for the sparse matrix
	 */
	public Table getSparseExpressions() {
		return sparseExpressions;
	}

	/**
	 * Returns the Prefuse Table with gene labels for the sparse matrix.
	 * 
	 * @return
	 */
	public Table getSparseGeneLabels() {
		return sparseGeneLabels;
	}

	/**
	 * Returns the number of genes in the sparse matrix
	 * 
	 * @return
	 */
	public int getNumSparseGenes() {
		return numSparseGenes;
	}

	/**
	 * Sets the number of genes in the sparse matrix
	 * 
	 * @param numSparseGenes
	 */
	void setNumSparseGenes(int numSparseGenes) {
		this.numSparseGenes = numSparseGenes;
	}

	/**
	 * Searches for genes or conditions that contain the string "what" in the
	 * field where. If found, they are selected and the visualizations updated
	 * 
	 * @param what
	 * @param where
	 * @param exact
	 *            if exact is true, it searches for exact matches of the string
	 *            what (only for gene names search)
	 * @param whatGenes
	 *            if not null, it searched only on the annotations of these
	 *            genes. If null, it searched on all genes (only used in case 0)
	 */
	public Selection search(String what, int where, boolean exact,
			LinkedList<Integer> whatGenes) {
		LinkedList<Integer> genes = new LinkedList<Integer>();
		LinkedList<Integer> conditions = new LinkedList<Integer>();
		long t = System.currentTimeMillis();
		System.out.println("Searching for |" + what + "| in " + where);
		switch (where) {
		case 0:// anywhere
			genes.addAll(searchAnnotations(what, whatGenes, exact));
			conditions.addAll(searchConditions(what));
			break;
		case 1:// gene names
			genes.addAll(searchGenes(what, exact));
			break;
		case 2:// condition names
			conditions.addAll(searchConditions(what));
			break;
		case 3:// gene annotations (descriptions/go terms, etc.)
			searchAnnotations(what, null);
			break;
		}
		System.out.println("found " + genes.size() + " genes and "
				+ conditions.size() + " conditions");
		System.out.println("Time for the search: "
				+ (System.currentTimeMillis() - t) / 1000.0);
		return new Selection(genes, conditions);
	}

	public LinkedList<Integer> searchAnnotations(String what,
			LinkedList<Integer> alreadyIn) {
		LinkedList<Integer> genes = new LinkedList<Integer>();
		Iterator<GeneAnnotation> it = geneAnnotations.values().iterator();
		while (it.hasNext()) {
			GeneAnnotation ga = it.next();
			if (!alreadyIn.contains(getGeneId(ga.getId()))) {
				if ((ga.getId() != null && ga.getId().contains(what))
						|| (ga.getDescription() != null && ga.getDescription()
								.contains(what))
						|| (ga.getAliases() != null && ga.getAliases().contains(what))
						|| (ga.getSymbol() != null && ga.getSymbol().contains(what))
						|| (ga.getOrganism() != null && ga.getOrganism().contains(what))
						|| (ga.getLocus() != null && ga.getLocus().contains(what))
						|| (ga.getEntrezId() != null && ga.getEntrezId().contains(what))
						|| (ga.getName() != null && ga.getName().contains(what)))
					genes.add(getGeneId(ga.getId()));
				else if (ga.getGoTerms() != null) {
					for (GOTerm gt : ga.getGoTerms()) {
						if ((gt.getDefinition() != null && gt.getDefinition()
								.contains(what))
								|| (gt.getTerm() != null && gt.getTerm().contains(what))) {
							genes.add(getGeneId(ga.getId()));
							break;
						}
					}
				}
			}
		}
		return genes;
	}

	/**
	 * As searchAnnotation but on a given list of genes (where), instead of
	 * everywhere
	 * 
	 * @param what
	 * @param where
	 * @param exact
	 * @return
	 */
	public LinkedList<Integer> searchAnnotations(String what,
			LinkedList<Integer> where, boolean exact) {
		LinkedList<Integer> genes = new LinkedList<Integer>();
		if (where == null)// search on all
		{
			where = new LinkedList<Integer>();
			for (int i = 0; i < geneNames.length; i++)
				where.add(i);
		}

		for (int i : where) {
			if(geneNames[i].contains(what))
					genes.add(i);
			else
				{
				GeneAnnotation ga = geneAnnotations.get(i);
				if (ga != null) {
					if (!exact) {
						if ((ga.getId() != null && ga.getId().contains(what))
								|| (ga.getDescription() != null && ga.getDescription()
										.contains(what))
								|| (ga.getAliases() != null && ga.getAliases().contains(what))
								|| (ga.getSymbol() != null && ga.getSymbol().contains(what))
								|| (ga.getOrganism() != null && ga.getOrganism()
										.contains(what))
								|| (ga.getLocus() != null && ga.getLocus().contains(what))
								|| (ga.getEntrezId() != null && ga.getEntrezId()
										.contains(what))
								|| (ga.getName() != null && ga.getName().contains(what)))
							genes.add(getGeneId(ga.getId()));
						else if (ga.getGoTerms() != null) {
							for (GOTerm gt : ga.getGoTerms()) {
								if ((gt.getDefinition() != null && gt.getDefinition()
										.contains(what))
										|| (gt.getTerm() != null && gt.getTerm()
												.contains(what))) {
									genes.add(getGeneId(ga.getId()));
									break;
								}
							}
						}
					} //non exact search
					else {
						if ((ga.getId() != null && ga.getId().equals(what))
								|| (ga.getDescription() != null && ga.getDescription()
										.equals(what))
								|| (ga.getAliases() != null && ga.getAliases().equals(what))
								|| (ga.getSymbol() != null && ga.getSymbol().equals(what))
								|| (ga.getOrganism() != null && ga.getOrganism().equals(what))
								|| (ga.getLocus() != null && ga.getLocus().equals(what))
								|| (ga.getEntrezId() != null && ga.getEntrezId().equals(what))
								|| (ga.getName() != null && ga.getName().equals(what)))
							genes.add(getGeneId(ga.getId()));
						else if (ga.getGoTerms() != null) {
							for (GOTerm gt : ga.getGoTerms()) {
								if ((gt.getDefinition() != null && gt.getDefinition()
										.equals(what))
										|| (gt.getTerm() != null && gt.getTerm().equals(what))) {
									genes.add(getGeneId(ga.getId()));
									break;
								}
							}
						}
					}//exact search
				}//if has gene annotations
			}
		}//for each gene
		return genes;
	}

	/**
	 * @deprecated Searche a string in gene annotations, including id,
	 *             description, aliases, symbol, organism, locus, name and GO
	 *             terms
	 * @param what
	 * @param exact
	 * @return
	 */
	public LinkedList<Integer> searchAnnotations(String what, boolean exact) {
		LinkedList<Integer> genes = new LinkedList<Integer>();
		// TODO: si no tenemos todas las anotaciones, va a buscar s�lo en los
		// genes que tengan anotaciones...
		// -> O crear anotaciones para todos aunque est�n vac�as, o iterar luego
		// por los nombres para los que no tengan
		Iterator<GeneAnnotation> it = geneAnnotations.values().iterator();
		while (it.hasNext()) {
			GeneAnnotation ga = it.next();
			if (!exact) {
				if ((ga.getId() != null && ga.getId().contains(what))
						|| (ga.getDescription() != null && ga.getDescription()
								.contains(what))
						|| (ga.getAliases() != null && ga.getAliases().contains(what))
						|| (ga.getSymbol() != null && ga.getSymbol().contains(what))
						|| (ga.getOrganism() != null && ga.getOrganism().contains(what))
						|| (ga.getLocus() != null && ga.getLocus().contains(what))
						|| (ga.getEntrezId() != null && ga.getEntrezId().contains(what))
						|| (ga.getName() != null && ga.getName().contains(what)))
					genes.add(getGeneId(ga.getId()));
				else if (ga.getGoTerms() != null) {
					for (GOTerm gt : ga.getGoTerms()) {
						if ((gt.getDefinition() != null && gt.getDefinition()
								.contains(what))
								|| (gt.getTerm() != null && gt.getTerm().contains(what))) {
							genes.add(getGeneId(ga.getId()));
							break;
						}
					}
				}
			} else {
				if ((ga.getId() != null && ga.getId().equals(what))
						|| (ga.getDescription() != null && ga.getDescription()
								.equals(what))
						|| (ga.getAliases() != null && ga.getAliases().equals(what))
						|| (ga.getSymbol() != null && ga.getSymbol().equals(what))
						|| (ga.getOrganism() != null && ga.getOrganism().equals(what))
						|| (ga.getLocus() != null && ga.getLocus().equals(what))
						|| (ga.getEntrezId() != null && ga.getEntrezId().equals(what))
						|| (ga.getName() != null && ga.getName().equals(what)))
					genes.add(getGeneId(ga.getId()));
				else if (ga.getGoTerms() != null) {
					for (GOTerm gt : ga.getGoTerms()) {
						if ((gt.getDefinition() != null && gt.getDefinition()
								.equals(what))
								|| (gt.getTerm() != null && gt.getTerm().equals(what))) {
							genes.add(getGeneId(ga.getId()));
							break;
						}
					}
				}
			}
		}
		return genes;
	}

	public LinkedList<Integer> searchGenes(String what, boolean exact) {
		LinkedList<Integer> genes = new LinkedList<Integer>();
		for (String s : geneNames) {
			if (!exact) {
				if (s.contains(what)) {
					genes.add(getGeneId(s));
					// System.out.println("Adding gene "+s+"\t"+getGeneId(s)+"\t"+this.getGeneNames()[getGeneId(s)]);
				}
			} else {
				if (s.trim().equals(what.trim())) {
					genes.add(getGeneId(s));
					// System.out.println("Adding gene "+s+"\t"+getGeneId(s)+"\t"+this.getGeneNames()[getGeneId(s)]);
				}
			}

		}
		return genes;
	}

	public GeneAnnotation searchGene(String geneName) {
		GeneAnnotation ga = null;
		for (String s : geneNames) {
			if (s.trim().equals(geneName.trim())) {
				ga = geneAnnotations.get(getGeneId(s));
				// System.out.println("Adding gene "+s+"\t"+getGeneId(s)+"\t"+this.getGeneNames()[getGeneId(s)]);
			}
		}
		return ga;
	}

	public LinkedList<Integer> searchConditions(String what) {
		LinkedList<Integer> conditions = new LinkedList<Integer>();
		for (String s : conditionNames) {
			if (s.contains(what))
				conditions.add(getGeneId(s));
		}

		for (int i = 0; i < numConditions; i++)
			for (String cad : this.experimentFactors) {
				if (experimentFactorValues.get(cad)[i].contains(what))
					conditions.add(i);
			}

		return conditions;
	}

	/**
	 * Returns a string with the requested value as a text string, for a
	 * determinate dimension
	 * 
	 * @param value
	 *            value to format to text
	 * @param dim
	 *            dimension to which the value pertains (it determines the
	 *            number of decimals for that dimension)
	 * @return a text string with the value, formatted to have the number of
	 *         decimals set for its dimension
	 */
	public String format(double value, int dim) {
		int nc = decimals[dim];
		String cad;
		if (nc > 0)
			cad = new Double(value).toString();
		else
			cad = new Double(Math.abs(Math.rint(value))).toString();
		int pos = 0;
		if ((pos = cad.indexOf(".")) >= 0) {
			int pos2 = 0;
			if ((pos2 = cad.indexOf("E")) >= 0) {
				if (nc > 0)
					cad = cad.substring(0, pos)
							+ cad.substring(pos, pos + 1 + nc)
							+ cad.substring(pos2);
				else
					cad = cad.substring(0, pos) + cad.substring(pos2);
			} else {
				if (nc > 0) {
					if (pos + 1 + nc <= cad.length()) {
						double number;
						// double number =
						// (double)(int)((value+0.005)*100.0)/100.0;
						if (nc > 0)
							number = (double) (int) ((value + Math
									.signum(value) * ((0.1 * (nc)) / 2)) * (10.0 * (nc)))
									/ (10.0 * (nc));
						else
							number = Math.rint(value);
						cad = new Double(number).toString();
					} else
						;// En este caso ya esta, no tenemos que quitar
							// decimales
				} else
					cad = cad.substring(0, pos);
			}
		}

		return cad;
	}

	/**
	 * This class inits all the libraries and soap services required to get gene
	 * annotations
	 * 
	 * @author Rodrigo
	 * 
	 */
	private class AnnotationStartThread extends Thread {
		AnnotationStartThread() {
		}

		/**
		 * Loads R console and the required libraries. By now: annotate, GO.db,
		 * GOstats. It also loads the file GOgroups.R in the resources package
		 * and the annotation package specified in the microarray data file if
		 * available.
		 */
		public void run() {
			REXP exp = null;

			if (chip.contains("yeast") || chip.contains("YEAST")
					|| chip.contains("ygs98") || chip.contains("pombe")) {
				if (chip.equals("YEAST"))
					rgo = "GOTERM";
			} else if (chip.startsWith("org.")) {
				rname = "GENENAME";
				rdescription = "DESCRIPTION";
			}
			// There are some cases with no dedicated environment R annotation
			// package. On these cases (i.e. Illumina Human HT12), there are
			// either
			// database packages (lumiHumanIDMapping) or entries in biomaRt
			// (illumina_humanht_12) package
			// In the case of illumina databases, it must be specified as
			// follows: lumiHumanIDMapping.HumanHT12_V3_0_R2_11283641_A
			else if (chip.startsWith("lumiHumanIDMapping")) {
				rname = "Symbol";
				rdescription = "none";
				isRDatabase = true;
			}
			// Similar to the above situation, but in this case we use bioMaRt
			// instead of a dedicated environment database.
			else if (chip.startsWith("biomaRt")) {
				rname = chip.substring(chip.indexOf(".") + 1);
				chip = chip.substring(0, chip.indexOf("."));
				rdescription = "description";
				isBioMaRt = true;
			} else if (chip.startsWith("KEGG")) {
				rname = "PATHID2NAME";
				rdescription = null;// no description in KEGG.db
			} else if (chip.equals("GO.db")) {
				rname = "Term";
				rdescription = "Definition";
				isGO = true;
			} else {
				rname = "SYMBOL";
				rdescription = "GENENAME";
			}
			// R specific
			if (chip.equals("GeneName") || chip.equals("GeneID")) {
				searchByR = false;
				// Initial search by NCBI takes some time, do it in background
				// when loading
				Thread wt = new Thread() {
					public void run() {
						try {
							AnnotationTask at = new AnnotationTask(new int[] { getGeneId(geneNames[0]) });
							
							//Carlos
							//de momento en desuso porque las anotaciones no se cargan al arrancar
							at.addPropertyChangeListener(ventana.getMlpb());					
							at.execute();

						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				};
				wt.start();
			} else {
				// GO specific
				//rManager.loadBioconductorLibrary("GO.db");
				//rManager.loadBioconductorLibrary("GOstats");
				//rManager.loadBioconductorLibrary("annotate");
				
				int ret=rManager.loadBioconductorLibraries(new String[]{"GO.db", "GOstats", "annotate"});
				if(ret!=0)
					{
					System.err.println("Error: bioconductor libraries not available, annotation retrieval will stop");
					return;
					}
				//exp = re.eval("library(GOstats)");
				//if (exp == null)
					//installPackage(exp, "GOstats");
				//exp = re.eval("library(annotate)");
				//if (exp == null)
				//	installPackage(exp, "annotate");

				exp = re.eval("source(\"es/usal/bicoverlapper/source/codeR/GOgroups.R\")");
				exp = re.eval("source(\"es/usal/bicoverlapper/source/codeR/geneAnnotation.R\")");

				long t = System.currentTimeMillis();

				ret=rManager.loadBioconductorLibrary(chip);
				/*exp = re.eval("library(" + chip + ")");
				System.out.println("It takes "
						+ (System.currentTimeMillis() - t)
						+ " to load the library");
				if (exp == null)
					System.out
							.println("library " + chip + " returns null in R");
				else
					System.out.println("library " + chip + " loaded correctly");
				if (exp == null) {
					if (installPackage(exp, chip) < 0) // if it cannot find the
														// R package, tries
														// online via NCBI (very
														// slow)
														 * */

				if(ret==-1)
					{
					chip = "GeneName";
					searchByR = false;
					} 
				else
					searchByR = true;
				//} else
				//	searchByR = true;

				chip = chip.replace(".db", "");

				getGeneAnnotationsLite();
			}
		}
	}// end Thread class

	
	/**
	 * Returns a map with the GeneAnnotations for the genes that have been
	 * annotated right now (to not downgrade memory and computing performance by
	 * retrieving all the annotations at once, annotations are retrieved on
	 * demand). The Integer key refers to the Prefuse table "rowId".
	 * 
	 * @return
	 */
	public Map<Integer, GeneAnnotation> getGeneAnnotations() {
		return geneAnnotations;
	}

	/**
	 * Returns a list of gene annotations for the genes requested It is not
	 * checked if the annotations exists or not, so some might be null (use
	 * checkAnnotations to be sure all of them exists) The order they are
	 * returned is the order of the input genes, but no further mapping is done
	 * 
	 * @param genes
	 * @return
	 */
	public ArrayList<GeneAnnotation> getGeneAnnotations(
			LinkedList<Integer> genes) {
		ArrayList<GeneAnnotation> ret = new ArrayList<GeneAnnotation>();
		for (int i : genes) {
			ret.add(geneAnnotations.get(i));
		}
		return ret;
	}

	public GeneAnnotation getGeneAnnotation(int gene) {
		return geneAnnotations.get(gene);
		}

	/**
	 * Returns a list of GOTerms that appear in the list of genes passed as
	 * parameter Returns each occurring GOTerm just once, with the field
	 * occurrences recording how many times it appears in the gene set.
	 * 
	 * @param genes
	 * @return
	 */
	public List<GOTerm> getGOTermsCount(LinkedList<Integer> genes) {
		HashMap<String, GOTerm> terms = new HashMap<String, GOTerm>();

		for (int i : genes) {
			ArrayList<GOTerm> gt = geneAnnotations.get(i).getGoTerms();
			for (GOTerm g : gt) {
				if (terms.get(g) == null)
					terms.put(g.getId(), g);
				else
					terms.get(g).occurences++;
			}
		}

		return Arrays.asList(terms.values().toArray(new GOTerm[0]));
	}

	/**
	 * Returns true if every gene in genes has annotations (may be partially
	 * empty), false otherwise
	 * 
	 * @param genes
	 * @return
	 */
	public boolean checkAnnotations(LinkedList<Integer> genes) {
		boolean ret = true;
		for (int i : genes) {
			if (geneAnnotations.get(i) == null) {
				ret = false;
				return ret;
			}
		}
		return ret;
	}

	/**
	 * Returns true if every gene in genes has GO annotations (may be empty),
	 * false otherwise
	 * 
	 * @param genes
	 * @return
	 */
	public boolean checkGOAnnotations(LinkedList<Integer> genes) {
		boolean ret = true;
		for (int i : genes) {
			if (geneAnnotations.get(i) == null
					|| geneAnnotations.get(i).getGoTerms() == null) {
				System.out.println("Gene " + i + " has null terms");
				ret = false;
				return ret;
			}
		}
		return ret;
	}

	/**
	 * Returns the GOTerms associated to a group of genes (as a whole, not
	 * individually related to each gene) up to a given p-value cutoff.
	 * 
	 * @param genes
	 *            "rowId" identifiers of genes
	 * @param cutoff
	 *            typically 0.1 or lower
	 * @return
	 */
	public ArrayList<GOTerm> getGOTermsHypergeometric(
			LinkedList<Integer> genes, double cutoff) {
		return getGOTermsHypergeometric(getGeneNames(genes), cutoff);
	}

	/**
	 * Returns the GOTerms associated to a group of genes (as a whole, not
	 * individually related to each gene) up to a given p-value cutoff.
	 * 
	 * @param genes
	 *            gene names
	 * @param cutoff
	 *            typically 0.1 or lower
	 * @return
	 */
	public ArrayList<GOTerm> getGOTermsHypergeometric(ArrayList<String> genes,
			double cutoff) {
		String n = "c(\"";
		String universe = "c(\"";
		for (int i = 0; i < genes.size(); i++) {
			if (i < genes.size() - 1)
				n = n.concat(genes.get(i) + "\", \"");
			else
				n = n.concat(genes.get(i) + "\")");
		}
		for (int i = 0; i < this.geneNames.length; i++) {
			if (i < geneNames.length - 1)
				universe = universe.concat(geneNames[i] + "\", \"");
			else
				universe = universe.concat(geneNames[i] + "\")");
		}

		REXP exp = null;
		long t1 = System.currentTimeMillis();
		exp = re.eval("chipEntrezUniverse <- unique(unlist(mget(" + universe
				+ ", " + chip + "ENTREZID, ifnotfound=NA)))");
		exp = re.eval("chipEntrezUniverse <- chipEntrezUniverse[which(!is.na(chipEntrezUniverse))]");
		exp = re.eval("selectedEntrezIds <- unlist(mget(" + n + "," + chip
				+ "ENTREZID, ifnotfound=NA))");
		exp = re.eval("selectedEntrezIds <- selectedEntrezIds[which(!is.na(selectedEntrezIds))]");

		System.out.println("Time preparing Ids: "
				+ (System.currentTimeMillis() - t1) / 1000.0);
		t1 = System.currentTimeMillis();

		exp = re.eval("params <- new(\"GOHyperGParams\", geneIds = selectedEntrezIds,"
				+ "universeGeneIds = chipEntrezUniverse, annotation = \""
				+ chip
				+ "\","
				+ "ontology = \"BP\", pvalueCutoff = "
				+ cutoff
				+ ", conditional = FALSE," + "testDirection = \"over\")");
		exp = re.eval("hgOver <- hyperGTest(params)");
		System.out.println("Time hypergeometric test: "
				+ (System.currentTimeMillis() - t1) / 1000.0);
		t1 = System.currentTimeMillis();

		exp = re.eval("df=summary(hgOver, pvalue=0.1)");
		exp = re.eval("df$Term");
		String[] t = exp.asStringArray();
		exp = re.eval("df$GOBPID");
		String[] ids = exp.asStringArray();
		exp = re.eval("df$Count");
		int[] evs = exp.asIntArray();
		exp = re.eval("df$Pvalue");
		double[] pval = exp.asDoubleArray();

		System.out.println("Time preparing summary: "
				+ (System.currentTimeMillis() - t1) / 1000.0);

		if (evs != null && ids != null && t != null && t.length == evs.length
				&& t.length == ids.length && evs.length == ids.length
				&& ids.length == t.length) {
			ArrayList<GOTerm> got = new ArrayList<GOTerm>();
			for (int i = 0; i < evs.length; i++) {
				GOTerm g = new GOTerm(t[i], ids[i], "", "", "", evs[i]);
				g.setPvalue(pval[i]);
				got.add(g);
			}
			return got;
		}
		return null;
	}

	/**
	 * TODO: continue the checking from here on
	 * 
	 * @param genes
	 * @param oncePerGene
	 * @return
	 */
	public List<GOTerm> getGOTerms(ArrayList<String> genes, boolean oncePerGene) {
		// 1) Complete gene annotations
		if (this.searchByR)
			return getGOTermsR(genes);
		else
			return getGOTermsQuickGO(genes, oncePerGene);
	}

	/**
	 * Returns a list of GOTerms, the field occurrences in GOTerm defines the
	 * number of times that the GOTerm appears in genes in the input list.
	 * 
	 * @param genes
	 * @param oncePerGene
	 *            if true, each GOTerm is counted one time even if there are
	 *            several occurrences for a gene (it can happen that a gene has
	 *            been annotated several times with the same GOTerm, if the
	 *            annotations comes from several sources (at least, this is the
	 *            protocol of QuickGO)
	 * @return
	 */
	public List<GOTerm> getGOTermsQuickGO(ArrayList<String> genes,
			boolean oncePerGene) {
		HashMap<String, GOTerm> gom = new HashMap<String, GOTerm>();
		for (String gene : genes) {
			GeneAnnotation ga = geneAnnotations.get(this.getGeneId(gene));
			List<GOTerm> gol = null;

			if (ga.getGoTerms() == null || ga.getGoTerms().size() == 0)
				gol = getTermsQuickGO(ga, oncePerGene);
			else
				gol = ga.getGoTerms();
			for (GOTerm go : gol) {
				if (gom.containsKey(go.getTerm()))
					gom.get(go.getTerm()).occurences++;
				else
					gom.put(go.getTerm(), go);
			}
		}
		return Arrays.asList(gom.values().toArray(new GOTerm[0]));
	}

	public ArrayList<GOTerm> getGOTermsR(ArrayList<String> genes) {
		REXP exp = null;

		String n = "c(\"";
		for (int i = 0; i < genes.size(); i++) {
			if (i < genes.size() - 1)
				n = n.concat(genes.get(i) + "\", \"");
			else
				n = n.concat(genes.get(i) + "\")");
		}

		exp = re.eval("got=getGOTerms(" + n + ", " + chip + rgo + ")");
		if (exp == null)
			System.err.println("Error getting GO terms with R");
		exp = re.eval("got@terms");
		if (exp == null)
			return null;
		String[] t = exp.asStringArray();
		exp = re.eval("got@definitions");
		String[] d = exp.asStringArray();
		exp = re.eval("got@ontologies");
		String[] o = exp.asStringArray();
		exp = re.eval("got@ids");
		String[] ids = exp.asStringArray();
		exp = re.eval("got@evidences");
		int[] evs = exp.asIntArray();
		ArrayList<GOTerm> got = new ArrayList<GOTerm>();

		if (evs != null && ids != null && o != null && d != null && t != null
				&& t.length == d.length && o.length == ids.length
				&& evs.length == ids.length && ids.length == t.length) {
			System.out.println("Retrieved " + t.length + " genes");
			for (int i = 0; i < evs.length; i++) {
				GOTerm g = new GOTerm(t[i], ids[i], d[i], o[i], "", evs[i]);
				got.add(g);
			}
			return got;
		}
		return null;
	}

	public GOTerm getGOTermByID(String goid) {
		REXP exp = null;
		// long t1=System.currentTimeMillis();
		// String n="c(\"";
		exp = re.eval("got=getGOTerm(\"" + goid + "\")");
		if (exp == null)
			System.err.println("Error getting GO terms by ID with R");

		// System.out.println("La parte de R tarda "+(System.currentTimeMillis()-t1));
		// t1=System.currentTimeMillis();

		exp = re.eval("got@terms");
		if (exp == null)
			return null;
		String t = exp.asString();
		exp = re.eval("got@definitions");
		String d = exp.asString();
		exp = re.eval("got@ontologies");
		String o = exp.asString();
		exp = re.eval("got@ids");
		String ids = exp.asString();
		exp = re.eval("got@evidences");
		int evs = 1;

		// ArrayList<GOTerm> got=new ArrayList<GOTerm>();
		if (ids != null && o != null && d != null && t != null) {
			// System.out.println("El resto tarda "+(System.currentTimeMillis()-t1));
			return new GOTerm(t, ids, d, o, "", evs);
		}
		// System.out.println("El resto tarda "+(System.currentTimeMillis()-t1));
		return null;

	}

	public ArrayList<GOTerm> getGOTermsRbyID(String[] goids) {
		REXP exp = null;
		// long t1=System.currentTimeMillis();
		ArrayList<GOTerm> got = new ArrayList<GOTerm>();
		int toRetrieve = 0;

		String n = "c(\"";
		for (int i = 0; i < goids.length; i++) {
			GOTerm gt = GOTerms.get(goids[i]);
			if (gt != null)
				got.add(gt);
			else {
				toRetrieve++;
				n = n.concat(goids[i] + "\", \"");
			}
		}
		n = n.substring(0, n.length() - 3) + ")";
		exp = re.eval("got=getGOTermsByGOID(" + n + ")");// <-tarda entre 30 y
															// 100ms, lo cual
															// puede hacer m�s
															// de un minuto para
															// arrays de 10000
															// genes
		if (exp == null)
			System.err.println("Error getting GO terms by ID with R");

		exp = re.eval("got@terms");
		if (exp == null)
			return null;
		String[] t = exp.asStringArray();
		exp = re.eval("got@definitions");
		String[] d = exp.asStringArray();
		exp = re.eval("got@ontologies");
		String[] o = exp.asStringArray();
		exp = re.eval("got@ids");
		String[] ids = exp.asStringArray();
		exp = re.eval("got@evidences");
		int[] evs = exp.asIntArray();
		if (evs.length == 0) {
			evs = new int[toRetrieve];
			for (int i = 0; i < evs.length; i++)
				evs[i] = 1;
		}

		if (evs != null && ids != null && o != null && d != null && t != null)
		// if(evs!=null && ids !=null && o!=null && t!=null)
		{
			for (int i = 0; i < evs.length; i++) {
				GOTerm gt = new GOTerm(t[i], ids[i], d[i], o[i], "", evs[i]);
				this.GOTerms.put(ids[i], gt);
				got.add(gt);
				// got.add(new GOTerm(t[i], ids[i], "", o[i], "", evs[i]));
			}
			// System.out.println("El resto tarda "+(System.currentTimeMillis()-t1));
			return got;
		}
		// System.out.println("El resto tarda "+(System.currentTimeMillis()-t1));
		return null;
	}

	public void getGOTermsHypergeometric(LinkedList<Integer> genes,
			GeneRequester gr, Point location, String ontology) {
		ht = new EnrichmentTestTask(genes, ontology, EnrichmentTestTask.GOSTATS);
		EnrichmentTestProgressMonitor hpm = null;
		if (location != null)
			hpm = new EnrichmentTestProgressMonitor(location);
		else
			hpm = new EnrichmentTestProgressMonitor(new Point(0, 0));
		hpm.setTask(ht);
		hpm.run();
		if (gr != null) {
			geneRequester = gr;
			Thread wt = new Thread() {
				public void run() {
					try {
						geneRequester.receiveGOTerms(ht.get());
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			wt.start();
		}
	}
	
	public void getTopGOEnrichment(LinkedList<Integer> genes,
			GeneRequester gr, Point location, String ontology, Analysis a) {
		ht = new EnrichmentTestTask(genes, ontology, EnrichmentTestTask.TOPGO, a);
		EnrichmentTestProgressMonitor hpm = null;
		if (location != null)
			hpm = new EnrichmentTestProgressMonitor(location);
		else
			hpm = new EnrichmentTestProgressMonitor(new Point(0, 0));
		hpm.setTask(ht);
		hpm.run();
		if (gr != null) {
			geneRequester = gr;
			Thread wt = new Thread() {
				public void run() {
					try {
						geneRequester.receiveGOTerms(ht.get());
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			wt.start();
		}
	}

	/**
	 * Gets gene annotations for basic info, except thinks like GO terms that
	 * can take longer
	 */
	public void getGeneAnnotationsLite() {
		int[] listgenes = new int[numGenes];
		for (int i = 0; i < numGenes; i++)
			listgenes[i] = i;

		retrieveGeneAnnotations(listgenes, null, false, null, null, false,
				false);
	}

	public void retrieveGeneAnnotations(int[] genes, GeneRequester gr,
			boolean showProgress, JLabel label, Point location,
			boolean searchGO, boolean searchKEGG) {
		
		at = new AnnotationTask(genes);
		at.label=label;
		at.searchGO = searchGO;
		at.searchKEGG = searchKEGG;
		if (showProgress) {			
			if (location != null) {
				annotProgressMon = new AnnotationProgressMonitor(location);
				annotProgressMon.setTask(at);
				annotProgressMon.run();
			} else {
				//try{
					
			//	SwingUtilities.invokeAndWait(new Runnable(){public void run(){
						
					amd2 = new AnnotationProgressMonitor2(at.label);
					amd2.setTask(at);
					amd2.run();
				//}});
				//}catch(Exception e){e.printStackTrace();}
			}
		}

		if (gr != null) {
			geneRequester = gr;
			Thread wt = new Thread() {
				public void run() {
					try {
						geneRequester.receiveGeneAnnotations(at.get());
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			wt.start();
		} else {
			//de momento en desuso porque las anotaciones no se cargan al arrancar
			at.addPropertyChangeListener(ventana.getMlpb());
			at.execute();
		}
		System.out.println("retrieveGeneAnnotations finished");
	}

	public class EnrichmentTestTask extends
			SwingWorker<ArrayList<GOTerm>, Void>// implements Runnable
	{
		public LinkedList<Integer> genes;
		public ArrayList<GOTerm> golist = null;
		public String message = "";
		public String errorMessage = "";
		private int progress;
		public String ontology = "";
		private int type=0;
		private Analysis analysis=null;
		private int minAnnotations;
		private int maxAnnotations;
		private String correction;
		private float alpha;
		private ArrayList<GeneAnnotation> annot;
		public static final int TOPGO=0;
		public static final int GOSTATS=1;
		public static final int JAVA=2;
		
		
		public void getGOTermsHypergeometric(LinkedList<Integer> genes,
				GeneRequester gr, Point location, String ontology) {
			ht = new EnrichmentTestTask(genes, ontology, EnrichmentTestTask.GOSTATS);
			EnrichmentTestProgressMonitor hpm = null;
			if (location != null)
				hpm = new EnrichmentTestProgressMonitor(location);
			else
				hpm = new EnrichmentTestProgressMonitor(new Point(0, 0));
			hpm.setTask(ht);
			hpm.run();
			if (gr != null) {
				geneRequester = gr;
				Thread wt = new Thread() {
					public void run() {
						try {
							geneRequester.receiveGOTerms(ht.get());
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				};
				wt.start();
			}
		}
		
		public void getTopGOEnrichment(LinkedList<Integer> genes,
				GeneRequester gr, Point location, String ontology) {
			ht = new EnrichmentTestTask(genes, ontology, EnrichmentTestTask.TOPGO);
			EnrichmentTestProgressMonitor hpm = null;
			if (location != null)
				hpm = new EnrichmentTestProgressMonitor(location);
			else
				hpm = new EnrichmentTestProgressMonitor(new Point(0, 0));
			hpm.setTask(ht);
			hpm.run();
			if (gr != null) {
				geneRequester = gr;
				Thread wt = new Thread() {
					public void run() {
						try {
							geneRequester.receiveGOTerms(ht.get());
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				};
				wt.start();
			}
		}


		public EnrichmentTestTask(LinkedList<Integer> genes, String ontology, int type) {
			this.genes = genes;
			this.ontology = ontology;
			this.type=type;
			golist = new ArrayList<GOTerm>();
		}
		public EnrichmentTestTask(LinkedList<Integer> genes, String ontology, int type, Analysis a) {
			this.genes = genes;
			this.ontology = ontology;
			this.type=type;
			this.analysis=a;
			golist = new ArrayList<GOTerm>();
		}
		
		public EnrichmentTestTask(ArrayList<GeneAnnotation> annot, float alpha, String correction, int minAnnotations, int maxAnnotations, Analysis a) {
			this.annot = annot;
			this.minAnnotations=minAnnotations;
			this.maxAnnotations=maxAnnotations;
			this.correction=correction;
			this.alpha=alpha;
			this.analysis=a;
			this.type=EnrichmentTestTask.JAVA;
			golist = new ArrayList<GOTerm>();
		}


		@Override
		public ArrayList<GOTerm> doInBackground() {
			try {
				if(type==EnrichmentTestTask.GOSTATS)	golist = getGOTermsHypergeometric(genes, ontology, 0.001);
				if(type==EnrichmentTestTask.TOPGO)		golist = analysis.topGOenrichment(0.01, ontology, getGeneNames(genes));
				if(type==EnrichmentTestTask.JAVA)		golist=analysis.javaGOenrichment(annot, alpha, minAnnotations, maxAnnotations, correction);//much faster, only requires R to get annotations
				progress = 100;
				setProgress(progress);
				done();
			} catch (Exception e) {
				progress = 100;
				setProgress(progress);
				done();
				JOptionPane.showMessageDialog(
						null,
						"Error performing the hypergeometric test: "
								+ e.getMessage() + "\n" + errorMessage,
						"Analysis Error", JOptionPane.ERROR_MESSAGE);
			}

			return golist;
		}

		public ArrayList<GOTerm> getGOTermsHypergeometric(
				LinkedList<Integer> genes, String ontology, double cutoff) {
			return getGOTermsHypergeometric(getGeneNames(genes), ontology,
					cutoff);
		}

		/**
		 * Call to hyperGTest from GOstats Bioconductor library
		 * 
		 * @param genes
		 *            - list of gene ids. HyperGTest will use its corresponding
		 *            EntrezIDs to perform the test
		 * @param ontology
		 *            - either "BP", "MF" or "CC". Only in capitals, and only
		 *            this values, or R will fail
		 * @param cutoff
		 *            - Hypergeometric Test cutoff
		 * @return - all the GOTerms that pass the hypergeometric tests, with
		 *         pvalue below 0.1
		 */
		public ArrayList<GOTerm> getGOTermsHypergeometric(
				ArrayList<String> genes, String ontology, double cutoff) {
			long t1 = System.currentTimeMillis();
			String n = "c(\"";
			// String universe="c(\"";
			for (int i = 0; i < genes.size(); i++) {
				if (i < genes.size() - 1)
					n = n.concat(genes.get(i) + "\", \"");
				else
					n = n.concat(genes.get(i) + "\")");
			}
			

			REXP exp = null;

			// In the case of BioMaRt, we must select the corresponding species
			// package (org.*)
			String annotationPackage = chip;
			if (isBioMaRt)
				annotationPackage = getAnnotationPackage();

			// Prepare universe
			if (!chip.startsWith("org.")) {
				if (isBioMaRt) // ensembl ids -> the work is done via the
								// corresponding species annotation package
								// (org.*)
				{
					String env = annotationPackage.replace(".db", "ENSEMBL");
					exp = re.eval("universe <- mappedkeys(" + env + ")");
					exp = re.eval("ref=unlist(mget(universe, " + env
							+ ", ifnotfound=NA))");
				} else // platform packages have as ids the probe ids
				{
					System.out
							.println("Getting entrezids (unnecesary, should be already done!)");
					exp = re.eval("universe <- unique(unlist(mget(featureNames("
							+ rMatrixName
							+ "), "
							+ chip
							+ "ENTREZID, ifnotfound=NA)))");// TODO: This is
															// unnecessary, we
															// have these entrez
															// ids already!
					if (exp == null)
						errorMessage = chip
								+ " database does not have ENTREZIDs, hypergeometric test cannot be run";
				}
			} else // species (org.) packages has as base ids special ids
			{
				System.out.println("org database!");
				exp = re.eval("universe <- featureNames(" + rMatrixName + ")");
			}

			// Prepare selected Ids
			if (isBioMaRt) {
				exp = re.eval("selected=names(ref)[which(ref %in% " + n + ")]");
			} else {
				if (!chip.startsWith("org."))// EntrezIDs on no org.* annotation
												// packages
				{
					exp = re.eval("selected <- unlist(mget(" + n + "," + chip
							+ "ENTREZID, ifnotfound=NA))");
				} else// species ids for org. packages
				{
					exp = re.eval("selected <- " + n);
				}
			}

			exp = re.eval("params <- new(\"GOHyperGParams\", geneIds = selected,"
					+ "universeGeneIds = universe, annotation = \""
					+ annotationPackage
					+ "\","
					+ "ontology = \""
					+ ontology
					+ "\", pvalueCutoff = "
					+ cutoff
					+ ", conditional = FALSE,"
					+ "testDirection = \"over\")");

			System.out.println("Time in building params "
					+ (System.currentTimeMillis() - t1) / 1000.0);
			t1 = System.currentTimeMillis();

			exp = re.eval("hgOver <- hyperGTest(params)");

			System.out.println("Time in hypergeometric test "
					+ (System.currentTimeMillis() - t1) / 1000.0);
			t1 = System.currentTimeMillis();

			exp = re.eval("df=summary(hgOver, pvalue=" + cutoff + ")");
			exp = re.eval("df$Term");
			String[] t = exp.asStringArray();
			exp = re.eval("df$GOBPID");
			String[] ids = exp.asStringArray();
			exp = re.eval("df$Count");
			int[] evs = exp.asIntArray();
			exp = re.eval("df$Pvalue");
			double[] pval = exp.asDoubleArray();
			if (evs != null && ids != null && t != null
					&& t.length == evs.length && t.length == ids.length
					&& evs.length == ids.length && ids.length == t.length) {
				ArrayList<GOTerm> got = new ArrayList<GOTerm>();
				for (int i = 0; i < evs.length; i++) {
					GOTerm g = new GOTerm(t[i], ids[i], "", "", "", evs[i]);
					g.setPvalue(pval[i]);
					got.add(g);
				}

				System.out.println("Time in preparing the summary "
						+ (System.currentTimeMillis() - t1) / 1000.0);
				t1 = System.currentTimeMillis();

				return got;
			}
			return null;
		}

		@Override
		public void done() {
		}
	}

	/**
	 * Returns the corresponding annotation package for the organism of the
	 * loaded microarray
	 * 
	 * @return
	 */
	public String getAnnotationPackage() {
		String cad = null;
		StringTokenizer st = new StringTokenizer(organism);
		int numTokens = st.countTokens();
		String abbv = "" + st.nextToken().toUpperCase().charAt(0)
				+ st.nextToken().toLowerCase().charAt(0);
		if (numTokens == 2) {
			// it works for everything except E. coli and Malaria
			cad = "org." + abbv + ".eg.db";

			if (abbv.equals("Pf"))// this makes malaria
				cad = "org." + abbv + ".plasmo.db";
			if (abbv.equals("Sc"))// this makes malaria
				cad = "org." + abbv + ".sgd.db";
			if (cad.contains("Ec"))// this makes E. coli (default K12)
				cad = "org." + abbv + "K12.eg.db";
		} else {
			// this makes E. coli distinction
			if (organism.contains("K12"))
				cad = "org." + abbv + "K12.eg.db";
			else if (organism.contains("Sakai"))
				cad = "org." + abbv + "Sakai.eg.db";
		}
		return cad;
	}

	/**
	 * Returns a list of Entrez IDs for every gene in the sample (if available).
	 * NOTE: The returning list is unsorted
	 * 
	 * @return
	 */
	public String[] getEntrezIds() {
		Iterator<GeneAnnotation> it = geneAnnotations.values().iterator();
		ArrayList<String> ret = new ArrayList<String>();
		while (it.hasNext()) {
			GeneAnnotation ga = it.next();
			if (ga.getEntrezId() != null)
				ret.add(ga.getEntrezId());
			else
				ret.add("");
		}
		return ret.toArray(new String[ret.size()]);
	}

	// **********************************************************************
	public class AnnotationTask extends
			SwingWorker<ArrayList<GeneAnnotation>, Void>// implements Runnable
	{
		public JLabel label;
		private String gene;
		private String message;
		private int id;

		private int[] genes;
		private GeneAnnotation ga;
		public AnnotationProgressMonitor apm;
		private ArrayList<GeneAnnotation> galist = null;
		private boolean searchGO;
		private boolean searchKEGG;
		private int res;

		public AnnotationTask() {
			genes = null;
			galist = new ArrayList<GeneAnnotation>();
			searchGO = true;
		}

		public AnnotationTask(int id) {
			this.id = id;
			searchGO = true;
		}

		public AnnotationTask(int[] genes) {
			this.genes = genes;
			galist = new ArrayList<GeneAnnotation>();
			searchGO = true;
		}

		/**
		 * Annotations retrieved with method mget() from R Performance depends
		 * on the number of genes, the method used (biomaRt or annotation
		 * package), the info retrieved (only ids, names and descriptions, go
		 * terms...) It can go from a couple of seconds up to a minute or more
		 * 
		 * @return
		 */
		public ArrayList<GeneAnnotation> getMultipleGeneAnnotationsR() {
			System.out.println("---getMultipleGeneAnnotationsR---");
			if (genes == null || genes.length == 0)
				return null;

			galist = new ArrayList<GeneAnnotation>();
			int progress = 0;
			long t00 = System.currentTimeMillis();

			message = "searching for " + genes.length + " selected genes in "
					+ organism + " ...";
			System.out.println(message);
			setProgress(progress);

			// 0) Build the group of genes to search for
			long t0 = System.currentTimeMillis();
			REXP exp = null;
			String group = "";
			if (genes.length == numGenes) {
				if (!rManager.isMatrixLoaded()) {
					System.out.println("Esperando a que la matriz se cargue");
					try {
						synchronized (rManager) {
							rManager.wait(10000);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				System.out.println("Matrix loaded, getting feature names");
				if (!rManager.isMatrixLoaded())
					rManager.loadMatrix(rMatrixName);
				exp = re.eval("group=featureNames(" + rMatrixName + ")");
			} else {
				for (int i = 0; i < genes.length; i++)
					if(genes[i]>=0)	group = group + "\"" + geneNames[genes[i]] + "\",";
				group = group.substring(0, group.length() - 1);
				exp = re.eval("group=c(" + group + ")");
			}

			String[] names = null, descriptions = null, entrezs = null, ensembls = null, symbols=null;

			message = "searching for gene names...";
			System.out.println(message);
			progress += 5;
			setProgress(progress);

			System.out.println("Time in building the group to search for: "
					+ (System.currentTimeMillis() - t0) / 1000);
			t0 = System.currentTimeMillis();
			// 1) Search for gene names
			if (!searchGO && !searchKEGG) {
				if (!isBioMaRt) {
					
					//en principio se desactivar� por defecto y se activar� si se contesta que no en el cuadro de di�logo
					//ventana.menuAnalysisRetrieveDescriptors.setEnabled(false);					
					
					if (isGO) {
						exp = re.eval("golist=unlist(mget(group,GOTERM, ifnotfound=NA))");
						exp = re.eval("sapply(golist, function(x){x@Term})");
						if (exp != null) {
							names = exp.asStringArray();
						}
					} else {
						exp = re.eval("unlist(mget(group," + chip + rname+ ", ifnotfound=NA))");
						if (exp != null) {
							names = exp.asStringArray();
						}
						message = "searching for gene descriptions...";
						System.out.println(message);
						progress += 5;
						setProgress(progress);
						// 2) Search for gene descriptions
						// exp=re.eval("unlist(mget(group,"+chip+rdescription+", ifnotfound=NA))");
						// if(exp!=null)
						// descriptions=exp.asStringArray();
						// 3) Search for gene ids
						exp = re.eval("unlist(mget(group," + chip
								+ "ENTREZID, ifnotfound=NA))");
						if (exp != null)
							entrezs = exp.asStringArray();
						// exp=re.eval("unlist(mget(group,"+chip+"ENSEMBL, ifnotfound=NA))");
						// if(exp!=null)
						// ensembls=exp.asStringArray();
					}
				} 
				else// -------------------------------------BioMaRt
				{
					try{
					SwingUtilities.invokeAndWait(new Runnable(){
						public void run(){
							//res =JOptionPane.showConfirmDialog(null,"Would you like to search for names? (It could take several minutes)", "Search for names", JOptionPane.YES_NO_OPTION);
							res =JOptionPane.showConfirmDialog(null,"Would you like 'biomaRt' bioConductor package to search for annotations? (It could take several minutes)", "Search for annotations", JOptionPane.YES_NO_OPTION);
						}});}catch(Exception e){e.printStackTrace();}
					 
					//si el usuario no desea buscar los nombres en este momento...
					if(res == JOptionPane.NO_OPTION){
						//se activa la posibilidad de buscarlos manualmente
						ventana.getMenuAnalysisRetrieveDescriptors().setEnabled(true);
					}
					//si se desea buscar los nombres en este momento...
					else if(res == JOptionPane.YES_OPTION){
						//se visualiza la barra de progreso de carga de anotaciones
						ventana.getMlpb().visualize();
						
						//una vez que se buscan, ya no se podr� repetir la b�squeda
						//ventana.getMenuAnalysisRetrieveDescriptors().setEnabled(false);
						//tambi�n se inhabilitan durante este proceso las opciones que dependen de R (Biclustering, GSEA, Diffexp y Build correl network)
						//ventana.getAnalysisMenuBiclustering().setEnabled(false);
						//ventana.getMenuAnalysisGSEA().setEnabled(false);
						//ventana.getMenuAnalysisDifexp().setEnabled(false);
						//ventana.getMenuAnalysisBuildNetwork().setEnabled(false);
						
						
						if (re.eval("martEnsembl") == null)
							exp = re.eval("martEnsembl=getEnsemblMart(species=\""
									+ organism + "\")");
						if(exp==null)
							{
							SwingUtilities.invokeLater(new Runnable(){
								public void run(){
							
							try{JOptionPane.showMessageDialog(null, "No Ensembl Mart for organism '"+organism+"'\nCheck that the organism name is properly written (e.g. 'Homo sapiens')"
									,"Error retrieving annotations",
									JOptionPane.ERROR_MESSAGE);}catch(Exception e){}
								}});
							message = "Error retrieving annotations: no Ensembl Mart for organism "+organism;
							setProgress(100);
							return null;
							}
						
						String symbol="uniprot_genename";
						exp=re.eval("length(grep(\""+symbol+"\", listAttributes(martEnsembl)[,1]))");
						if(exp.asInt()==0)
							{
							symbol="genename";
							exp=re.eval("length(grep(\"^"+symbol+"$\", listAttributes(martEnsembl)[,1]))");
							}
						if(exp.asInt()==0)
							{
							symbol="symbol";
							exp=re.eval("length(grep(\""+symbol+"\", listAttributes(martEnsembl)[,1]))");
							}
						if(exp.asInt()==0)
							{
							symbol="external_gene_id";
							exp=re.eval("length(grep(\""+symbol+"\", listAttributes(martEnsembl)[,1]))");
							}
						if(exp.asInt()==0)
							{
							symbol="external_gene_name";
							exp=re.eval("length(grep(\""+symbol+"\", listAttributes(martEnsembl)[,1]))");
							}
						
								exp = RUtils.tryCatch("df<-getBMatts(group, mart=martEnsembl, type=\""+ rname+ "\", attributes=c(\"ensembl_gene_id\",\""+ rname+ "\",\"entrezgene_id\", \""+symbol+"\", \"description\"))$ids", re);
						
						if (!chip.equals(rname)) 
						{
							exp = re.eval("df[,\"" + rname + "\"]");
							if (exp != null)
								names = exp.asStringArray();
						}
						message = "searching for gene descriptions...";
						System.out.println(message);
						progress += 5;
						setProgress(progress);
	
						exp = re.eval("df[,\"" + rdescription + "\"]");
						if (exp != null) {
							System.out.println("And it has descriptions!");
							descriptions = exp.asStringArray();
						}
						exp = re.eval("df[,\"" + symbol + "\"]");
						if (exp != null) {
							System.out.println("And it has symbols!");
							symbols = exp.asStringArray();
						}
						
	
						if (rname.equals("entrezgene_id")) {
							entrezs = geneNames.clone();
						} else {
							exp = re.eval("df[,\"entrezgene_id\"]");
							if (exp != null) {
								int ints[] = exp.asIntArray();
								ArrayList<String> strings = new ArrayList<String>();
								for (int i : ints)
									if (i < 0)
										strings.add(null);
									else
										strings.add(new Integer(i).toString());
								entrezs = strings.toArray(new String[0]);
							}
						}
						if (!rname.equals("ensembl_gene_id")) {
							exp = re.eval("df[,\"ensembl_gene_id\"]");
							if (exp != null)
								ensembls = exp.asStringArray();
						}
					}
				}
			}

			message = "searching for go terms...";
			System.out.println(message);
			progress += 5;
			setProgress(progress);

			System.out.println("Time in the search for gene descriptions (entrez+symbol): "+ (System.currentTimeMillis() - t0) / 1000);
			t0 = System.currentTimeMillis();
			// 3) Search for GO terms
			RList go = null;
			if (searchGO) {
				String[] goids;

				// Search by platform of by biomart
				if (!isBioMaRt) {
					exp = re.eval("go=mget(group," + chip + rgo
							+ ", ifnotfound=NA)");
					System.out.println("Time in mget: "
							+ (System.currentTimeMillis() - t0) / 1000);
					t0 = System.currentTimeMillis();
					if (exp != null) {
						go = exp.asList();
						exp = re.eval("l=unique(unlist(go))");
						exp = re.eval("l=l[grep(\"GO:.*\", l)]");
						System.out.println("Time in unique and grep: "
								+ (System.currentTimeMillis() - t0) / 1000);
						t0 = System.currentTimeMillis();
					}
				} else {
					// BIOMART SEARCH
					if (re.eval("martEnsembl") == null)
						exp = re.eval("martEnsembl=getEnsemblMart(species=\""+ organism + "\")");

					re.eval("goType=c(\"go_id\")");
					int coincidence=re.eval("length(grep(goType, listAttributes(martEnsembl)[,1]))").asInt();
					if(coincidence==0)
						{
						re.eval("goType=c(\"go_accession\")");
						//coincidence=re.eval("length(grep(goType, listAttributes(martEnsembl)[,1]))").asInt();
						}
						
					
					exp = re.eval("group=gsub(\"\\\\(.*\\\\)\", \"\", group)");
					exp = re.eval("df=getBMGO(group, mart=martEnsembl, type=\""+ rname + "\", GOtypes=goType)");
					exp = re.eval("df");
					if (exp != null) {
						go = exp.asList();
						exp = re.eval("l=unique(unlist(df))");
						exp = re.eval("l=l[which(!is.na(l))]");
						exp = re.eval("l=l[grep(\"GO:.*\", l)]");
						} else {
						System.err.println("GO es null aqu� ya!!"
								+ re.eval("unique(unlist(df))"));
					}
				}

				// Either case, get GO definitions
				if (exp != null) {
					goids = re.eval("l").asStringArray();
					if (goids != null) {
						exp = re.eval("got=getGOTermsByGOID(l)");// <-tarda entre 30 y 100ms, lo cual puede hacer m�s  de un minuto para arrays de 10000 genes
						if (exp == null)
							System.err.println("Error getting GO terms by ID with R");

						// Add new ones to java map
						exp = re.eval("got@terms");
						String[] t = exp.asStringArray();
						exp = re.eval("got@definitions");
						String[] d = exp.asStringArray();
						exp = re.eval("got@ontologies");
						String[] o = exp.asStringArray();
						exp = re.eval("got@ids");
						String[] ids = exp.asStringArray();

						if (ids != null && o != null && d != null && t != null) {
							for (int i = 0; i < ids.length; i++) {
								if (!ids[i].equals("biological_process")
										&& !ids[i].equals("molecular_function")
										&& !ids[i].equals("cellular_component")) {
									message = "adding term " + ids[i];
									progress += 84.0 / ids.length;
									setProgress(progress);
									if(ids.length!=t.length)
										System.out.println("Ojo");
									if(i<t.length)
										{
										if(t!=null)
											{	
											System.out.println("Adding term "+t[i]);
											}
										
										GOTerm gt;
										if(GOTerms.containsKey(ids[i]))
											{
											gt=GOTerms.get(ids[i]);
											gt.setTerm(t[i]);
											gt.setDefinition(d[i]);
											gt.setOntology(o[i]);
											}
										else
											gt = new GOTerm(t[i], ids[i], d[i], o[i], "", 1);
										GOTerms.put(ids[i], gt);
										}
								}
							}
						}
					}// if/(goids!=null)
				}// if(exp!=null)
				System.out.println("Time in getting GO definitions: "
						+ (System.currentTimeMillis() - t0) / 1000);
				t0 = System.currentTimeMillis();
			}// if(searchGO)

			if (searchKEGG) {
				// TODO: add KEGG information
			}
			// 4) Add all the new information to the genes
			for (int g = 0; g < genes.length; g++) {
				Integer id = genes[g];
				if(id==-1)	continue;
				

				GeneAnnotation ga = geneAnnotations.get(id);
				if (ga == null) {
					ga = new GeneAnnotation();
					ga.setInternalId(id);
					if (descriptions != null)
						ga.setDescription(descriptions[g]);
					if (names != null) {
						if (names[g] == null || names[g].equals("NA"))
							ga.setName(geneNames[g]);// Set as gene name its id
						else
							ga.setName(names[g]);
					}
					if (entrezs != null)
						ga.setEntrezId(entrezs[g]);
					if (ensembls != null)
						ga.setEnsemblId(ensembls[g]);
					if (symbols != null)
						ga.setSymbol(symbols[g]);

					ga.setId(geneNames[g]);
					geneAnnotations.put(id, ga);
				} else {
					if (descriptions != null)
						ga.setDescription(descriptions[g]);
					if (names != null)
						ga.setName(names[g]);
					ga.setInternalId(id);
				}

				// In addition, if searched and found, we add the GO terms
				String[] goids = null;

				if (go != null) 
					{
					if (ga.getGoTerms() == null)
						ga.setGoTerms(new ArrayList<GOTerm>());
					RList goterms = null;

					if (isBioMaRt) 
						{
						//System.out.println(id+" "+getGeneName(id));
						if(go.at(g)!=null)		goids = go.at(getGeneName(id).replaceAll("\\(.*\\)", "")).asStringArray();
						}
					else 
						{
						goterms = go.at(ga.getId()).asList();
						if (goterms != null)
							goids = goterms.keys();
						}
					if (goids != null) 
						{
						for (int i = 0; i < goids.length; i++) 
							{
							if (goids[i].startsWith("GO:")) 
								{
								GOTerm gt = GOTerms.get(goids[i]);
								if (gt != null && !ga.getGoTerms().contains(gt) && gt.getTerm()!=null)
									if (!gt.getTerm().equals("biological_process")	&& !gt.getTerm().equals("molecular_function") && !gt.getTerm().equals("cellular_component"))
										ga.getGoTerms().add(gt);
								}
							}
						}
					}
				galist.add(ga);
			}

			System.out.println("Time in adding the info to java structures: "
					+ (System.currentTimeMillis() - t0) / 1000);

			System.out.println("Finished: annotations retrieved in "
					+ (System.currentTimeMillis() - t00) / 1000.0 + " secs.");
			message = "Finished: annotations retrieved in "
					+ (System.currentTimeMillis() - t00) / 1000.0 + " secs.";
			progress = 100;
			setProgress(progress);

			System.out.println("---END getMultipleGeneAnnotationsR---");
			
			//se habilitan las opciones inhabilitadas durante este m�todo (Biclustering, GSEA, Diffexp y Build correl network)
			ventana.getAnalysisMenuBiclustering().setEnabled(true);
			ventana.getMenuAnalysisGSEA().setEnabled(true);
			ventana.getMenuAnalysisDifexp().setEnabled(true);
			ventana.getMenuAnalysisBuildNetwork().setEnabled(true);			
			
			//se elimina la barra de progreso

			return galist;
		}

		/**
		 * Loop with use of method get() from R
		 * 
		 * @return
		 */
		public ArrayList<GeneAnnotation> getGeneAnnotationR() {
			int progress = 0;
			long t1 = System.currentTimeMillis();

			for (int g = 0; g < genes.length; g++) {
				Integer id = genes[g];
				String gene = geneNames[id];

				message = "searching for " + gene + " in " + organism + " ...";
				// progress+=100*0.5/genes.size();
				progress += 100 * 0.5 / genes.length;
				setProgress(progress);

				GeneAnnotation ga = geneAnnotations.get(id);
				if (ga == null) {
					ga = new GeneAnnotation();
					// System.out.println("GENE "+gene);
					REXP exp = re.eval("group=c(\"" + gene + "\")");
					ga.setId(gene);
					exp = re.eval("get(\"" + gene + "\"," + chip + rname + ")");
					if (exp != null) {
						// System.out.println("name: "+exp.asString());
						ga.setName(exp.asString());
					}
					exp = re.eval("get(\"" + gene + "\"," + chip + rdescription
							+ ")");
					if (exp != null) {
						// System.out.println("desc: "+exp.asString());
						ga.setDescription(exp.asString());
					}
					galist.add(ga);
				}
				if (ga != null && ga.getGoTerms() == null) {
					// GoTerms
					ArrayList<String> al = new ArrayList<String>();
					al.add(ga.getId());
					ga.setGoTerms(getGOTermsR(al));
					geneAnnotations.put(id, ga);
				}
			}

			// System.out.println("Finished: annotations retrieved in "+(System.currentTimeMillis()-t1)/1000+" secs.");
			message = "Finished: annotations retrieved in "
					+ (System.currentTimeMillis() - t1) / 1000.0 + " secs.";
			System.out.println(message);
			progress = 100;
			setProgress(progress);

			return galist;
		}

		public ArrayList<GeneAnnotation> getGeneAnnotationNCBI() {
			double progress = 0;
			long t1 = System.currentTimeMillis();
			
			int hora, minutos, segundos;
			Calendar calendario = new GregorianCalendar();
			hora =calendario.get(Calendar.HOUR_OF_DAY);
			minutos = calendario.get(Calendar.MINUTE);
			segundos = calendario.get(Calendar.SECOND);
			
			System.out.println("EMPIEZA LA B�SQUEDA DE LAS ANOTACIONES A LAS "+hora+":"+minutos+":"+segundos);
			
			// for(int g=0;g<genes.size();g++)
			for (int g = 0; g < genes.length; g++) {
				// String gene=geneNames[genes.get(g)];
				String gene = geneNames[genes[g]];
				ArrayList<String> ncbiIds = new ArrayList<String>();

				message = "searching for " + gene + " in " + organism + " ...";
				// progress+=100*0.5/genes.size();
				progress += 100 * 0.5 / genes.length;
				setProgress((int) progress);
								
				ga = geneAnnotations.get(genes[g]);
				if (ga == null) {
					IdListType list = null;
					System.out.println("Searching for gene " + gene);
					if (chip.equals("GeneName"))// if chip is GeneName
						list = NCBIReader.eGeneQuery(gene + "[gene] AND \""
								+ organism + "\"[organism]");
					else if (chip.equals("GeneID"))
						list = NCBIReader.eGeneQuery(gene + "[uid] AND \""
								+ organism + "\"[organism]");
					else if (chip.equals("anything"))
						list = NCBIReader.eGeneQuery(gene + " AND \""
								+ organism + "\"[organism]");

					if (list != null && list.getId() != null) {
						if (list.getId().length > 0) {
							if (list.getId().length > 1)
								System.out
										.println("WARNING: found "
												+ list.getId().length
												+ " coincidences, taking the first one as the best match");
							ncbiIds.add(list.getId(0));
						}

						message = "Annotations found, collecting ...";
						progress += 100 * 0.5 / genes.length;
						if (progress >= 100)
							progress = 99;
						setProgress((int) progress);
												
					} else {
						System.err.println("Nothing found for gene " + gene);
						ga = new GeneAnnotation();
						ga.setId(gene);

						geneAnnotations.put(genes[g], ga);

						message = "Nothing found for gene " + gene;
						progress += 100 * 0.5 / genes.length;
						if (progress >= 100)
							progress = 99;
						setProgress((int) progress);								
					}

					if (list != null && list.getId() != null) {
						DocSumType[] res = NCBIReader.eGeneSummary(list
								.getId(0));
						ga = new GeneAnnotation();
						for (int i = 0; i < res.length; i++) {
							for (int k = 0; k < res[i].getItem().length; k++) {
								if (res[i].getItem()[k].get_any() != null) {
									String cad = res[i].getItem(k).getName();
									ga.setEntrezId(res[i].getId());
									if (cad.contains("Description"))
										ga.setDescription(res[i].getItem()[k]
												.get_any()[0].getValue());
									else if (cad.contains("Name"))
										ga.setName(res[i].getItem()[k].get_any()[0]
												.getValue());
									else if (cad.contains("Orgname"))
										ga.setOrganism(res[i].getItem()[k]
												.get_any()[0].getValue());
									else if (cad.contains("Symbol"))
										ga.setSymbol(res[i].getItem()[k]
												.get_any()[0].getValue());
									else if (cad.contains("Gene type"))
										ga.setType(res[i].getItem()[k].get_any()[0]
												.getValue());
									else if (cad.contains("OtherAliases")) {
										ga.setAliases(new ArrayList<String>());
										String aliases = res[i].getItem()[k]
												.get_any()[0].getValue();
										String[] al = aliases.split(",");
										for (int j = 0; j < al.length; j++)
											ga.getAliases().add(al[j].trim());
									}
								}
							}
							ga.setId(gene);
							geneAnnotations.put(genes[g], ga);
						}
					}

					// Try to retrieve GOTerms via QuickGO
					getTermsQuickGO(ga, true);
				}
				galist.add(ga);
			}

			message = "Finished: annotations retrieved in "
					+ (System.currentTimeMillis() - t1) / 1000 + " secs.";
			System.out.println(message);
			progress = 100;
			setProgress((int) progress);
			
			calendario = new GregorianCalendar();
			hora =calendario.get(Calendar.HOUR_OF_DAY);
			minutos = calendario.get(Calendar.MINUTE);
			segundos = calendario.get(Calendar.SECOND);
			
			System.out.println("ACABA LA B�SQUEDA DE LAS ANOTACIONES A LAS "+hora+":"+minutos+":"+segundos);
			
			return galist;
		}

		@Override
		public ArrayList<GeneAnnotation> doInBackground() {
			synchronized (rManager) 
				{
				if (searchByR){
					getMultipleGeneAnnotationsR();
					}
				else{
					//Better to do nothing, this is too expensive, slow and unsuccessful
					//getGeneAnnotationNCBI();
					}
				
				rManager.notify();
				}
				return galist;
		}

		@Override
		public void done() {
			synchronized (geneAnnotations) {
				geneAnnotations.notify();
			}
			
			//se oculta la barra de progreso de la obtenci�n de anotaciones
			ventana.getMlpb().hide();
		}

		/**
		 * @return the message
		 */
		public String getMessage() {
			return message;
		}
	}

	/**
	 * Searches for GO Terms by using QuickGO web service GOTerms retrieved are
	 * stored in the GeneAnnotation object passed as parameter
	 * 
	 * @param ga
	 *            GeneAnnotation for the gene to search for. If available, it
	 *            will search for NCBI id, if nothing is found it will search
	 *            for symbol, if nothing again for name and if not for each one
	 *            of the aliases. NOTE: the QuickGO web service do not allow to
	 *            select the database, so when the NCBI id search is done, we
	 *            can get matches not coming from NCBI but from other databases.
	 *            This is solved by checking each entry with the gene symbol.
	 *            Anyway, it is a workaround i don't like
	 * @param unique
	 *            It is usual to find the same GO term coming from different
	 *            databases or evidences If unique is true, each GO term will be
	 *            only stored once.
	 */
	public List<GOTerm> getTermsQuickGO(GeneAnnotation ga, boolean unique) {
		ArrayList<GOTerm> gol = requestQuickGO(ga.getEntrezId(), unique);
		if (gol == null || gol.size() == 0) // try with symbol
			gol = requestQuickGO(ga.getSymbol(), unique);
		if (gol == null || gol.size() == 0) // try with name
			gol = requestQuickGO(ga.getName(), unique);

		if (gol == null || gol.size() == 0) {// try with aliases
			for (String alias : ga.getAliases()) {
				gol = requestQuickGO(alias, unique);
				if (gol.size() > 0)
					break;
			}
		}
		if (gol != null && gol.size() > 0)
			ga.setGoTerms(gol);
		return gol;
	}

	// public static ArrayList<GOTerm> requestQuickGO(String database, String
	// name, boolean unique)
	public static ArrayList<GOTerm> requestQuickGO(String name, boolean unique) {
		try {
			// URL u=new
			// URL("http://www.ebi.ac.uk/ego/GAnnotation?protein="+name+"&format=tsv");
			// URL u=new
			// URL("http://www.ebi.ac.uk/QuickGO/GAnnotation?protein="+name+"&format=tsv");
			// URL u=new
			// URL("http://www.ebi.ac.uk/QuickGO/GAnnotation?db="+database+"&protein="+name+"&format=tsv");//QuicGO
			// web service does not work if you specify db!
			URL u = new URL(
					"http://www.ebi.ac.uk/QuickGO/GAnnotation?&protein=" + name
							+ "&format=tsv");// so just this way... risky if the
												// NCBI id coincides with other
												// id from other database!
			// Connect
			HttpURLConnection urlConnection = (HttpURLConnection) u
					.openConnection();
			// Get data
			BufferedReader rd = new BufferedReader(new InputStreamReader(
					urlConnection.getInputStream()));
			// Read data
			List<String> columns = Arrays.asList(rd.readLine().split("\t"));
			// System.out.println(columns);
			// Collect the unique terms as a sorted set
			// ArrayList<GOTerm> terms=new ArrayList<GOTerm>();
			HashMap<String, GOTerm> terms = new HashMap<String, GOTerm>();

			// Find which column contains GO IDs
			int idIndex = columns.indexOf("GO ID");
			int termIndex = columns.indexOf("GO Name");
			int evIndex = columns.indexOf("Evidence");
			int aspectIndex = columns.indexOf("Aspect");
			// Read the annotations line by line
			String line;
			while ((line = rd.readLine()) != null) {
				// Split them into fields
				String[] fields = line.split("\t");
				String aspect = fields[aspectIndex];
				if (aspect.equals("Component"))
					aspect = "CC";
				else if (aspect.equals("Process"))
					aspect = "BP";
				else if (aspect.equals("Function"))
					aspect = "MF";
				GOTerm go = new GOTerm(fields[termIndex], fields[idIndex],
						null, aspect, fields[evIndex], 1);

				// Record the GO ID
				// if(!terms.contains(go)) terms.add(go);
				// else terms.get(terms.indexOf(go)).occurences++;
				if (!unique) {
					if (!terms.containsKey(go.getTerm()))
						terms.put(go.getTerm(), go);
					else
						terms.get(go.getTerm()).occurences++;
				} else if (!terms.containsKey(go.getTerm()))
					terms.put(go.getTerm(), go);
			}
			// close input when finished
			rd.close();
			// System.out.println("Found "+terms.size()+" terms");
			List<GOTerm> list = Arrays.asList(terms.values().toArray(
					new GOTerm[0]));
			// Write out the unique terms
			/*
			 * for (GOTerm term : list) { System.out.println(term.term); }
			 */
			return new ArrayList<GOTerm>(list);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public class LoadTask extends SwingWorker<Integer, Void> {
		private final static int FILE = 0;
		private int type = FILE;
		public File file;
		public String path;
		public boolean invert;
		public int nd;
		public String message = "";
		public int rowHeader, colHeader;// Row header is the number of initial
										// rows dedicated to information about
										// samples. colHeader is the number of
										// initial columns dedicated to
										// information about genes (by now, just
										// 1)
		public ArrayList<String> colHeaders;// names of column headers

		// Right now, rowHeader is computed as the number of rows before the
		// first one that contains numbers, which is 1 (sample IDs) or more, if
		// experimental factors are described
		// TODO colHeader is fixed to one by now.
		// TODO rowHeader right now cannot account for numeric experiment
		// factors
		@Override
		public Integer doInBackground() {
			switch (type) {
			case FILE:
				return loadFromFile();
			default:
				return -1;
			}
		}

		public void setFile(File f)
			{
			file=f;
			path=file.getAbsolutePath();
			}
		
		public int loadFromArrayExpress() {
			// 1) download and normalize

			// 2) load from file afterwards
			return loadFromFile();
		}

		public int loadFromFile() {
			int progress = 0;

			// antes hab�a esto
			/*
			 * String name = path.replace("\\", "/"); filePath = name;
			 */
			// modificado para que funcione en Windows (en principio en unix no
			// dar� problemas)
			String name = file.getName();
			//String name=path.replace("\\", "/");
			filePath = path;

			message = "Reading matrix "
					+ name;
			
			progress += 10;
			//System.err.println("MicroArrayData va a hacer en el primer setProgress(progress)="+progress+" y message="+message);
			setProgress(progress);
			
			//tiempo de espera para que el oyente recoja el mensaje
			try {
				Thread.sleep(200);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			

			String description = "";
			double t1 = System.currentTimeMillis();
			double start = System.currentTimeMillis();
			DelimitedTextTableReader tr = new DelimitedTextTableReader("\t");
			System.out.println("Loading " + path);
			tr.setHasHeader(true);
			Table levelsi = null;
			try {
				levelsi = tr.readTable(new FileInputStream(path)); // lector delimitado de Prefuse (rellena columnas con 0s)
			} catch (Exception e) {
				/*SwingUtilities.invokeLater(new Runnable(){
					public void run(){
				
				
					JOptionPane.showMessageDialog(null, "Error reading the file: "
							+ path, "I/O Error",
							JOptionPane.ERROR_MESSAGE);
					}});*/
				message = "Error reading the file: " + e.getMessage();
				//System.out.println("MicroArrayData en la excepci�n de error reading the file va a hacer setProgress(progress)="+progress+" y message="+message);
				System.err.println(message);
				setProgress(100);
				return -1;
			}
			if (invert) {
				numGenes = levelsi.getColumnCount();// Al rev�s te lo digo
													// para que me entiendas
				numConditions = levelsi.getRowCount();
			} else // We determine the number of EFs by finding the first
					// double. Therefore, EFVs should be strings that cannot be
					// interpreted as doubles!
			{
				try {
					BufferedReader in = new BufferedReader(new FileReader(path));
					int numLines = levelsi.getRowCount();
					rowHeader = 0;
					colHeader = 1; // by now, no col headers, apart from the ID
					boolean stop = false;
					for (int i = 0; i < numLines; i++) {
						String st = in.readLine();
						Scanner scanner = new Scanner(st);
						scanner.useDelimiter("\\t");
						String scan = "";
						// int colCont=0;
						if (i > 0) {
							while (scanner.hasNext()) {
								if (scanner.hasNextDouble()) {
									stop = true;
									break;
								}
								scan = scanner.next();
								if (scan.trim().startsWith("EF."))
									break; // To allow numeric values
								// colCont++;
								double scand = -333;
								try {
									scand = Double.parseDouble(scan.trim());
								} catch (NumberFormatException nfe) {
								}
								if (scand != -333) {
									stop = true;
									break;
								}
							}
							if (stop) {
								System.out.println("Out because of "
										+ scanner.next());
								// colHeader=colCont;
								break;
							}
						}
						rowHeader++;
					}
				} catch (Exception e) {
					e.printStackTrace();
					return 1;
				}
				System.out.println("Number of row headers: " + rowHeader);
				numConditions = levelsi.getColumnCount() - colHeader;
				numGenes = levelsi.getRowCount() - rowHeader + 1;
			}
			message = numGenes + " rows x " + numConditions + " columns";
			progress += 60;
			//System.err.println("MicroArrayData va a hacer en el segundo setProgress(progress)="+progress+" y message="+message);
			setProgress(progress);
			
			//tiempo de espera para que el oyente recoja el mensaje
			try {
				Thread.sleep(200);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			
		
			conditionNames = new String[numConditions];
			geneNames = new String[numGenes];
			decimals = new int[numConditions];
			for (int i = 0; i < numConditions; i++)
				decimals[i] = nd;
			columnOrder = new int[numConditions];
			for (int i = 0; i < numConditions; i++)
				columnOrder[i] = i;
			System.out.println("Matrix with " + numGenes + " rows and "
					+ numConditions + " columns");

			try {
				// Leemos la primera fila, que tiene los nombres de los genes
				if (invert) {
					if (rowHeader >= 1) {
						BufferedReader in = new BufferedReader(new FileReader(
								path));
						StringTokenizer st = new StringTokenizer(in.readLine(),
								"\t");// El delimitador en Syntren es un tab.
						for (int i = 0; i < numGenes; i++)
							geneNames[i] = st.nextToken();
					} else
						for (int i = 0; i < numGenes; i++)
							geneNames[i] = new Integer(i).toString();

					if (colHeader >= 1) {
						// TODO: get additional info about genes

					} else
						for (int i = 0; i < numConditions; i++)
							conditionNames[i] = new Integer(i).toString();
				} else // Si no est�n invertidas las primeras columnas tienen
						// informaci�n sobre los genes
				{ // Y las primeras filas sobre las condiciones
					BufferedReader in = new BufferedReader(new FileReader(path));
					StringTokenizer st = null;
					colHeaders = new ArrayList<String>();

					// Read sample related info
					if (rowHeader >= 0) {
						st = new StringTokenizer(in.readLine(), "\t"); // First
																		// row
																		// contains
																		// sample
																		// names
																		// and
																		// the
																		// different
																		// gene
																		// names
																		// maybe
						for (int i = 0; i < colHeader; i++) // Depending on the
															// colHeader, it can
															// also contain
															// additional
															// information. TODO
															// right now
															// colHeader is
															// always 1, with
															// organism/geneID
															// info
						{
							description = st.nextToken();// Pasamos los que no
															// tienen q ver, que
															// nombran las
															// columnas de
															// explicaci�n de
															// genes

							if (i == 0) {
								if (description.contains("/")) {
									chip = description.substring(description
											.indexOf("/") + 1);
									organism = description.substring(0,
											description.indexOf("/"));
									if (chip.length() < 2) {
										JOptionPane.showMessageDialog(null,
												"Chip name is wrong: " + chip,
												"Wrong format",
												JOptionPane.ERROR_MESSAGE);
										return 1;
									}
									if (organism.length() < 2) {
										JOptionPane.showMessageDialog(null,
												"Organism name is wrong: "
														+ organism,
												"Wrong format",
												JOptionPane.ERROR_MESSAGE);
										return 1;
									}
									colHeaders.add(chip);
								} else {
									JOptionPane.showMessageDialog(null,
											"Chip/Organism description is wrong, use \"/\" as separator: "
													+ description,
											"Wrong format",
											JOptionPane.ERROR_MESSAGE);
									return 1;
								}
							} else
								colHeaders.add(description);
						}

						for (int i = 0; i < numConditions; i++)
							conditionNames[i] = st.nextToken().trim();
						for (int i = 0; i < rowHeader - 1; i++) // Read
																// experiment
																// factors
						{
							st = new StringTokenizer(in.readLine(), "\t");
							String ef = st.nextToken().trim();
							for (int j = 0; j < colHeader - 1; j++)
								st.nextToken();// Avoid the blanks due to column
												// Headers
							String[] efvs = new String[numConditions];
							int cont = 0;
							while (st.hasMoreTokens())
								efvs[cont++] = st.nextToken().trim();// .replace("EF.",
																		// "")
							experimentFactors.add(ef);
							experimentFactorValues.put(ef, efvs);
						}
					} else
						// Use integers as identifiers
						for (int i = 0; i < numConditions; i++)
							conditionNames[i] = new Integer(i).toString()
									.trim();

					// TODO: Another thread reads in parallel the matrix into R
					if (!rManager.isMatrixLoaded()) {
						Thread rt = new Thread() {
							public void run() {
								rManager.loadMatrix(rMatrixName);
							}
						};
						rt.run();
					}

					if (geneAnnotations == null)
						geneAnnotations = new TreeMap<Integer, GeneAnnotation>();
					// Read gene related info (except expression levels)
					if (colHeader > 0) {
						for (int i = 0; i < numGenes; i++)// Read gene names
						{
							String cad = in.readLine();
							// System.out.println(cad);
							if (cad == null) {
								JOptionPane
										.showMessageDialog(
												null,
												"Possibly empty line at the end of the matrix, please remove.",
												"Wrong format",
												JOptionPane.ERROR_MESSAGE);
								return 1;
							}
							if (cad.contains("\t\t")) {
								JOptionPane
										.showMessageDialog(
												null,
												"Empty sample name(s) found, remove additional tabs between fields.",
												"Wrong format",
												JOptionPane.ERROR_MESSAGE);
								return 1;
							}
							st = new StringTokenizer(cad, "\t");// El
																// delimitador
																// en Syntren es
																// un tab.
							geneNames[i] = st.nextToken().trim();
							assignAnnotation(i, geneNames[i],
									colHeaders.get(0), true);
							if (colHeader > 1) {
								for (int j = 0; j < colHeader - 1; j++) // get
																		// gene
																		// annotations
																		// present
																		// in
																		// the
																		// array
								{
									String annot = st.nextToken().trim();
									GeneAnnotation ga = new GeneAnnotation();
									ga.setId(geneNames[i]);
									ga.setInternalId(i);
									assignAnnotation(i, annot,
											colHeaders.get(j), false);
								}
							}
							// System.out.println(geneNames[i]);
						}
					} else
						// Set up numbers as geneNames
						for (int i = 0; i < numGenes; i++)
							geneNames[i] = new Integer(i).toString().trim();
				}

				rowLabels = geneNames.clone();// TODO: check
				columnLabels = conditionNames.clone();

			} catch (Exception e) {
				System.err.println("doInBackground: Error reading file " + path);
				e.printStackTrace();
				setProgress(100);
				return 1;
			}
			double t2 = System.currentTimeMillis();

			message = "Organism: " + organism + "\nPlatform: " + chip
					+ "\nRetrieving gene annotations ... (in background)";
			progress += 10;
			//System.err.println("MicroArrayData va a hacer en el tercer setProgress(progress)="+progress+" y message="+message);
			setProgress(progress);
			
			//tiempo de espera para que el oyente recoja el mensaje
			try {
				Thread.sleep(200);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			geneAnnotations = new TreeMap<Integer, GeneAnnotation>();
			GOTerms = new TreeMap<String, GOTerm>();
			AnnotationStartThread p = new AnnotationStartThread();
			p.setPriority(Thread.MIN_PRIORITY);
			new Thread(p).start();

			// System.out.println("T1) Gene Names "+(t2-t1)/1000);

			if (invert)
				levels = invert(levelsi); // OJO: Para el caso de que est�n
											// invertidos (SynTReN por ejemplo)
			else
				levels = levelsi;
			t1 = System.currentTimeMillis();
			// System.out.println("T2) inversi�n "+(t1-t2)/1000);

			expressions = convert(levels, rowHeader - 1, colHeader);
			if(expressions==null)
				{
				setProgress(100);
				return 1;
				}

			t2 = System.currentTimeMillis();
			// System.out.println("T3) conversi�n "+(t2-t1)/1000);

			sparseGeneLabels = new Table();
			sparseGeneLabels.addColumn("name", String.class);
			sparseGeneLabels.addColumn("id", int.class);
			sparseGeneLabels.addColumn("actualId", int.class);
			sparseGeneLabels.addColumn("rowRank", int.class);// Orden en el que
																// ser�n
																// pintadas

			geneLabels = new Table();
			geneLabels.addColumn("name", String.class);
			geneLabels.addColumn("id", int.class);
			geneLabels.addColumn("rowRank", int.class);// Orden en el que
														// ser�n pintadas
			int row = 0;
			int sparseRow = 0;
			int step = 1;

			if (numGenes > maxGenes)
				step = numGenes / maxGenes;
			for (int i = 0; i < numGenes; i++) {
				row = geneLabels.addRow();
				geneLabels.setString(row, "name", rowLabels[i]);
				geneLabels.setInt(row, "id", i);
				geneLabels.setInt(row, "rowRank", i);
				row++;
				if (i % step == 0) {
					sparseRow = sparseGeneLabels.addRow();
					sparseGeneLabels.setString(sparseRow, "name", rowLabels[i]);
					sparseGeneLabels.setInt(sparseRow, "id", sparseRow);
					sparseGeneLabels.setInt(sparseRow, "actualId", i);
					sparseGeneLabels.setInt(sparseRow, "rowRank", sparseRow);
					sparseRow++;
				}
			}

			numSparseGenes = sparseRow;

			conditionLabels = new Table();
			conditionLabels.addColumn("name", String.class);
			conditionLabels.addColumn("id", int.class);
			conditionLabels.addColumn("colRank", int.class);
			row = 0;
			for (int i = 0; i < numConditions; i++) {
				row = conditionLabels.addRow();
				conditionLabels.setString(row, "name", columnLabels[i]);
				conditionLabels.setInt(row, "id", i);
				conditionLabels.setInt(row, "colRank", i);
			}

			message = "Computed sparse representation";
			progress += 10;
			//System.err.println("MicroArrayData va a hacer en el cuarto setProgress(progress)="+progress+" y message="+message);
			setProgress(progress);

			//tiempo de espera para que el oyente recoja el mensaje
			try {
				Thread.sleep(200);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return 1;
			}
			
			t1 = System.currentTimeMillis();
			message = "Microarray data loaded in " + (t1 - start) / 1000
					+ " seconds";
			progress = 100;
			//System.err.println("MicroArrayData va a hacer en el quinto setProgress(progress)="+progress+" y message="+message);
			
			setProgress(progress);
			System.out.println("Memory reserved after loading: "
					+ Sizeof.usedMemory());
			try {
				Sizeof.runGC(1);
			} catch (Exception e) {
				e.printStackTrace();
				return 1;
			}
			System.out.println("Memory reserved after loading & GC: "
					+ Sizeof.usedMemory());
			return 0;
		}

		@Override
		public void done() {
			Toolkit.getDefaultToolkit().beep();
		}
	}

	public void assignAnnotation(int id, String annotation,
			String annotationType, boolean isId) {
		GeneAnnotation ga = null;
		if ((ga = geneAnnotations.get(id)) == null) {
			ga = new GeneAnnotation();
			ga.setInternalId(id);
			geneAnnotations.put(id, ga);
		}
		if (isId)
			ga.setId(annotation);

		if (annotationType.equals("description"))
			ga.setDescription(annotation); // respecting biomart names on these
											// first three
		else if (annotationType.equals("ensembl_gene_id"))
			ga.setEnsemblId(annotation);
		else if (annotationType.equals("entrezgene_id"))
			ga.setEntrezId(annotation);
		else if (annotationType.equals("name"))
			ga.setName(annotation);
		// TODO: GO terms, KEGG paths, etc.
		return;
	}

	public void buildSparseGeneMatrix() {
		sparseGeneLabels = new Table();
		sparseGeneLabels.addColumn("name", String.class);
		sparseGeneLabels.addColumn("id", int.class);
		sparseGeneLabels.addColumn("actualId", int.class);
		sparseGeneLabels.addColumn("rowRank", int.class);// Orden en el que
															// ser�n pintadas

		int sparseRow = 0;
		int step = 1;

		if (numGenes > maxGenes)
			step = numGenes / maxGenes;
		for (int i = 0; i < numGenes; i += step) {
			sparseRow = sparseGeneLabels.addRow();
			sparseGeneLabels.setString(sparseRow, "name", rowLabels[i]);
			sparseGeneLabels.setInt(sparseRow, "id", sparseRow);
			sparseGeneLabels.setInt(sparseRow, "actualId", i);
			sparseGeneLabels.setInt(sparseRow, "rowRank", sparseRow);
			sparseRow++;
		}

		// Build sparse expression level matrix
		sparseExpressions = new Table();
		sparseExpressions.addColumn("gene", String.class);
		sparseExpressions.addColumn("condition", String.class);
		sparseExpressions.addColumn("level", double.class);
		sparseExpressions.addColumn("rowRank", int.class);
		sparseExpressions.addColumn("colRank", int.class);
		sparseExpressions.addColumn("rowId", int.class);
		sparseExpressions.addColumn("actualRowId", int.class);// Ids in the
																// whole matrix
																// ret
		sparseExpressions.addColumn("colId", int.class);

		int row = 0;
		sparseRow = 0;
		int contGene = 0;
		step = 1;
		if (numGenes > maxGenes)
			step = numGenes / maxGenes;
		for (int i = 0; i < numGenes; i += step) {
			for (int j = 0; j < numConditions; j++) {
				row++;
				sparseRow = sparseExpressions.addRow();
				sparseExpressions.setString(sparseRow, "gene", rowLabels[i]);
				sparseExpressions.setString(sparseRow, "condition",
						columnLabels[j]);

				// TODO This if else is probably stupid
				// if(levels.canGet(conditionNames[j],Double.class))
				// sparseExpressions.setDouble(sparseRow, "level",
				// ((Double)levels.get(i,j+1)).doubleValue());
				// else
				sparseExpressions.setDouble(sparseRow, "level", matrix[i][j]);

				sparseExpressions.setInt(sparseRow, "rowId", contGene);
				sparseExpressions.setInt(sparseRow, "actualRowId", i);
				sparseExpressions.setInt(sparseRow, "rowRank", contGene);
				sparseExpressions.setInt(sparseRow, "colId", j);
				sparseExpressions.setInt(sparseRow, "colRank", j);
				sparseRow++;
			}
			if (i % step == 0)
				contGene++;
		}
		return;
	}

	public void loadMicroarray(String path, boolean invert, int rowHeader,
			int colHeader, int nd) {
		int progress = 0;
		progress += 10;

		String description = "";
		DelimitedTextTableReader tr = new DelimitedTextTableReader("\t");
		System.out.println(path);
		tr.setHasHeader(true);
		Table levelsi = null;
		try {
			levelsi = tr.readTable(new FileInputStream(path)); // esto es lo que
																// m�s peso
																// tiene en
																// tiempo (5s
																// para 54000x9)
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Error reading the file: " + e.getMessage(), "I/O Error",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		if (invert) {
			numGenes = levelsi.getColumnCount();// Al rev�s te lo digo para
												// que me entiendas
			numConditions = levelsi.getRowCount();
		} else {
			numConditions = levelsi.getColumnCount() - rowHeader;
			numGenes = levelsi.getRowCount();
		}

		conditionNames = new String[numConditions];
		geneNames = new String[numGenes];
		decimals = new int[numConditions];
		for (int i = 0; i < numConditions; i++)
			decimals[i] = nd;
		System.out.println("Microarray matrix with " + numGenes + " genes and "
				+ numConditions + " conditions");

		try {
			// Leemos la primera fila, que tiene los nombres de los genes
			if (invert) {
				if (rowHeader >= 1) {
					BufferedReader in = new BufferedReader(new FileReader(path));
					StringTokenizer st = new StringTokenizer(in.readLine(),
							"\t");// El delimitador en Syntren es un tab.
					for (int i = 0; i < numGenes; i++)
						geneNames[i] = st.nextToken();
				} else
					for (int i = 0; i < numGenes; i++)
						geneNames[i] = new Integer(i).toString();

				if (colHeader >= 1) {
				} else
					for (int i = 0; i < numConditions; i++)
						conditionNames[i] = new Integer(i).toString();
			} else // Si no est�n invertidas las primeras columnas tienen
					// informaci�n sobre los genes
			{ // Y las primeras filas sobre las condiciones
				if (colHeader >= 0) {
					BufferedReader in = new BufferedReader(new FileReader(path));
					for (int i = 0; i < rowHeader; i++)
						in.readLine(); // Pasamos las filas con explicaciones
										// sobre los experimentos
					for (int i = 0; i < numGenes; i++) {
						String cad = in.readLine();
						if (cad.contains("\t\t")) {
							JOptionPane
									.showMessageDialog(
											null,
											"Empty sample name(s) found, remove additional tabs between fields.",
											"Wrong format",
											JOptionPane.ERROR_MESSAGE);
						}
						StringTokenizer st = new StringTokenizer(cad, "\t");// El
																			// delimitador
																			// en
																			// Syntren
																			// es
																			// un
																			// tab.
						geneNames[i] = st.nextToken();
					}
				} else
					for (int i = 0; i < numGenes; i++)
						geneNames[i] = new Integer(i).toString();

				if (rowHeader >= 1) {
					BufferedReader in = new BufferedReader(new FileReader(path));
					StringTokenizer st = new StringTokenizer(in.readLine(),
							"\t");// El delimitador en Syntren es un tab.
					for (int i = 0; i < colHeader; i++) {
						description = st.nextToken();// Pasamos los que no
														// tienen q ver, que
														// nombran las columnas
														// de explicaci�n de
														// genes
					}
					for (int i = 0; i < numConditions; i++)
						conditionNames[i] = st.nextToken();
				} else
					for (int i = 0; i < numConditions; i++)
						conditionNames[i] = new Integer(i).toString();
			}
		} catch (Exception e) {
			System.err.println("loadMicroarray: Error reading file " + path);
			e.printStackTrace();
			System.exit(1);
		}

		if (description.contains("/")) {
			chip = description.substring(description.indexOf("/") + 1);
			System.out.println("chip en loadMicroarray = "+chip);
			organism = description.substring(0, description.indexOf("/"));
			if (chip.length() < 2)
				JOptionPane.showMessageDialog(null, "Chip name is wrong: "
						+ chip, "Wrong format", JOptionPane.ERROR_MESSAGE);
			if (organism.length() < 2)
				JOptionPane.showMessageDialog(null, "Organism name is wrong: "
						+ organism, "Wrong format", JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null,
					"Chip/Organism description is wrong, use \"/\" as separator: "
							+ description, "Wrong format",
					JOptionPane.ERROR_MESSAGE);
		}

		geneAnnotations = new TreeMap<Integer, GeneAnnotation>();
		AnnotationStartThread p = new AnnotationStartThread();
		p.setPriority(Thread.MIN_PRIORITY);
		new Thread(p).start();

		if (invert)
			levels = invert(levelsi); // OJO: Para el caso de que est�n
										// invertidos (SynTReN por ejemplo)
		else
			levels = levelsi;

		expressions = convert(levels, rowHeader, colHeader);

		sparseGeneLabels = new Table();
		sparseGeneLabels.addColumn("name", String.class);
		sparseGeneLabels.addColumn("id", int.class);
		sparseGeneLabels.addColumn("actualId", int.class);
		sparseGeneLabels.addColumn("rowRank", int.class);// Orden en el que
															// ser�n pintadas

		geneLabels = new Table();
		geneLabels.addColumn("name", String.class);
		geneLabels.addColumn("id", int.class);
		geneLabels.addColumn("rowRank", int.class);// Orden en el que ser�n
													// pintadas
		int row = 0;
		int sparseRow = 0;
		int step = 1;

		if (numGenes > maxGenes)
			step = numGenes / maxGenes;
		for (int i = 0; i < numGenes; i++) {
			row = geneLabels.addRow();
			geneLabels.setString(row, "name", geneNames[i]);
			geneLabels.setInt(row, "id", i);
			geneLabels.setInt(row, "rowRank", i);
			row++;
			if (i % step == 0) {
				sparseRow = sparseGeneLabels.addRow();
				sparseGeneLabels.setString(sparseRow, "name", geneNames[i]);
				sparseGeneLabels.setInt(sparseRow, "id", sparseRow);
				sparseGeneLabels.setInt(sparseRow, "actualId", i);
				sparseGeneLabels.setInt(sparseRow, "rowRank", sparseRow);
				sparseRow++;
			}
		}

		numSparseGenes = sparseRow;

		conditionLabels = new Table();
		conditionLabels.addColumn("name", String.class);
		conditionLabels.addColumn("id", int.class);
		conditionLabels.addColumn("colRank", int.class);
		row = 0;
		for (int i = 0; i < numConditions; i++) {
			row = conditionLabels.addRow();
			conditionLabels.setString(row, "name", conditionNames[i]);
			conditionLabels.setInt(row, "id", i);
			conditionLabels.setInt(row, "colRank", i);
		}
	}

	/**
	 * Sorts columns (specially useful for parallel coordinates and heatmaps)
	 * 
	 * @param factor
	 */
	public int[] sortColumnsBy(String factor) {
		sortingFactor = factor;
		if (!factor.equals("Column ID")) {
			REXP exp = re.eval("as.integer(rank("
					+ RUtils.getRList(experimentFactorValues.get(factor))
					+ ", " + "ties.method=\"first\")-1)");// TODO: null pointer
															// if it's not a
															// factor but the
															// ids (it could
															// also be done by
															// sort(...,
															// dindex=T)$ix)
			columnOrder = exp.asIntArray();
		} else
			// Initial ordering
			for (int i = 0; i < numConditions; i++)
				columnOrder[i] = i;
		sortColumns();
		return getColumnOrder();
	}

	/**
	 * Refresh colRanks in sparse expressions and in condition labels with the
	 * current columnOrder
	 */
	public void sortColumns() {
		for (int i = 0; i < this.numSparseGenes; i++)
			for (int j = 0; j < this.numConditions; j++) {
				sparseExpressions.setInt(i * numConditions + j, "colRank",
						columnOrder[j]);
			}
		for (int i = 0; i < this.numConditions; i++) {
			conditionLabels.setInt(i, "colRank", columnOrder[i]);
		}
	}

	/**
	 * Returns the current columnOrder c, where c[i]=j means that the current
	 * position for column i is now j.
	 * 
	 * @return
	 */
	public int[] getColumnOrder() {
		int[] co = new int[columnOrder.length];
		for (int j = 0; j < columnOrder.length; j++)
			co[columnOrder[j]] = j;
		return co;
	}

	/**
	 * Selecciona los genes con valor de expresi�n por encima de sdsAbove
	 * desviaciones est�ndar de la media para todas las condiciones etiquetadas
	 * con el valor highEFV para el factor experimental highEF y por debajo de
	 * sdsBelow desviaciones est�ndar de la media para todas las condiciones
	 * etiquetadas con el valor lowEFV para el factor experimental lowEF highEF
	 * or lowEF (but not both) can be "none333" if we only want to filter by one
	 * condition. Example: we want to get every gene above 2 sd for "diseased"
	 * but below mean for "control" for experimental factor "cancer"
	 * selectHiLo("diseased", "cancer", 2, "control", "cancer", 0);
	 * 
	 * @param highEFV
	 * @param highEF
	 * @param sdsAbove
	 * @param lowEFV
	 * @param lowEF
	 * @param sdsBelow
	 * @return
	 */
	public LinkedList<Integer> selectHiLo(String highEFV, String highEF,
			int sdsAbove, String lowEFV, String lowEF, int sdsBelow) {
		if (!experimentFactors.contains(highEF) && !highEF.equals("none333")
				&& !highEF.equals("rest")) {
			System.err.println("Experimental factor " + highEF
					+ " does not exist");
			return null;
		}
		if (!experimentFactors.contains(lowEF) && !lowEF.equals("none333")
				&& !lowEF.equals("rest")) {
			System.err.println("Experimental factor " + highEF
					+ " does not exist");
			return null;
		}

		LinkedList<Integer> ret = new LinkedList<Integer>();
		String[] efvsH = experimentFactorValues.get(highEF);
		String[] efvsL = experimentFactorValues.get(lowEF);
		if (highEF.equals("rest"))
			efvsH = efvsL;
		if (lowEF.equals("rest"))
			efvsL = efvsH;

		for (int i = 0; i < numGenes; i++) {
			boolean add = true;
			for (int j = 0; j < numConditions; j++) {
				if (!highEFV.equals("none333")
						&& ((highEFV.equals("rest") 
								&& (efvsH==null || (null != efvsH && !efvsH[j].equals(lowEFV))) 
								|| (null != efvsH  && efvsH[j].equals(highEFV)))) ) // TODO:the first part of the if could be done less times.
					if (matrix[i][j] < averageCols[j] + sdsAbove * sdCols[j]) {
						add = false;
						break;
					}
				if (!lowEFV.equals("none333")
						&& ((lowEFV.equals("rest") && (efvsL==null || !efvsL[j].equals(highEFV))) || (null!=efvsL && efvsL[j].equals(lowEFV))))

					if (matrix[i][j] > averageCols[j] + sdsBelow * sdCols[j]) {
						add = false;
						break;
					}
			}
			if (add)
				ret.add(i);
		}
		return ret;
	}

	/**
	 * Returns the ids of the conditions that have the corresponding
	 * experimental factor value for a given experimental factor
	 * 
	 * @param ef
	 *            - experimental factor to be checked
	 * @param efv
	 *            - experimental factor value that have the conditions to be
	 *            returned
	 * @param notEqual
	 *            - if true, returns all the conditions except the ones
	 *            corresponding to the efv for ef
	 * @return
	 */
	public Integer[] getConditions(String ef, String efv, boolean notEqual) {
		if (ef == null || efv == null || ef.length() == 0 || efv.length() == 0) {
			System.err.println("No ef or efv specified");
			return null;
		}
		LinkedList<Integer> ret = new LinkedList<Integer>();
		String[] efvs = experimentFactorValues.get(ef);
		for (int i = 0; i < efvs.length; i++) {
			if (notEqual) {
				if (!efvs[i].equals(efv))
					ret.add(i);
			} else {
				if (efvs[i].equals(efv))
					ret.add(i);
			}
		}
		return ret.toArray(new Integer[ret.size()]);
	}

	/**
	 * Selecciona los genes con valor
	 * 
	 * @param highEFV
	 * @param highEF
	 * @param lowEFV
	 * @param lowEF
	 * @return
	 */
	public LinkedList<Integer> selectHiLo(String highEFV, String highEF,
			String lowEFV, String lowEF) {
		return selectHiLo(highEFV, highEF, 0, lowEFV, lowEF, 0);
	}

	/**
	 * Returns the string to identificate an organism in Kegg
	 * @return
	 */
	public String getOrganismKEGG(){
		String [] campos = organism.split("\\s+");
		String ogranismKegg = campos[0].charAt(0)+"" + campos[1].charAt(0)+"" + campos[1].charAt(1)+"";
		return ogranismKegg.toLowerCase();
	}
	
	/**
	 * Creates the quantile classification
	 */
	public void computeQuantiles() {
		medianCols = new double[numConditions];
		quantileCols = new ArrayList<Double[]>();

		long t = System.currentTimeMillis();
		double[] numbers = new double[numConditions * numGenes];
		int cont = 0;
		double step = numGenes * 0.01;

		for (int j = 0; j < numConditions; j++) {
			Double[] qq = new Double[100];
			double[] numberCols = new double[numGenes];
			for (int i = 0; i < numGenes; i++) {
				numbers[cont++] = matrix[i][j];
				numberCols[i] = matrix[i][j];
			}
			Arrays.sort(numberCols);
			medianCols[j] = numberCols[(int) (numGenes * 0.5)];
			for (int i = 0; i < 100; i++) {
				qq[i] = numberCols[(int) (step * i)];
				// System.out.println("quantile "+(i+1)+" for column "+j+" up to "+qq[i]);
			}

			quantileCols.add(qq);
		}
		Arrays.sort(numbers);
		mediana = numbers[(int) (numGenes * numConditions * 0.5)];

		step = numGenes * numConditions * 0.01;
		for (int i = 0; i < 100; i++) {
			quantiles[i] = numbers[(int) (step * i)];
			// System.out.println("quantile "+(i+1)+" up to "+quantiles[i]);
		}
		System.out.println("Median computation takes "
				+ (System.currentTimeMillis() - t) / 1000.0 + " mediana="
				+ mediana);
	}
	
	public int getNumSymbols()
		{
		int cont=0;
		for(int g=0;g<numGenes;g++)
			{
			GeneAnnotation ga=geneAnnotations.get(g);
			if(ga!=null && ga.getSymbol()!=null)	cont++;
			}
		return cont;
		}
	public int getNumEntrezIds()
		{
		int cont=0;
		for(int g=0;g<numGenes;g++)
			{
			GeneAnnotation ga=geneAnnotations.get(g);
			if(ga!=null && ga.getEntrezId()!=null)	cont++;
			}
		return cont;
		}
	public int getNumEnsemblIds()
		{
		int cont=0;
		for(int g=0;g<numGenes;g++)
			{
			GeneAnnotation ga=geneAnnotations.get(g);
			if(ga!=null && ga.getEnsemblId()!=null)	cont++;
			}
		return cont;
		}
	public int getNumDescriptions()
		{
		int cont=0;
		for(int g=0;g<numGenes;g++)
			{
			GeneAnnotation ga=geneAnnotations.get(g);
			if(ga!=null && ga.getDescription()!=null)	cont++;
			}
		return cont;
		}

	/**
	 * Get the quantile of an expression
	 * @param exp Expression to get the associated quantile
	 * @return The associated quantile
	 */
	public int getQuantile(float exp) {
		for (int i = 0; i < 100; i++)
			if (exp < quantiles[i])
				return i;
		return 100;
	}

	/**
	 * Get the quantile of an expression and a column
	 * @param exp Expression to get the associated quantile
	 * @param column Column of the quantile
	 * @return The associated quantile
	 */
	public int getQuantile(float exp, int column) {
		for (int i = 0; i < 100; i++)
			if (exp < this.quantileCols.get(column)[i])
				return i;
		return 100;
	}

	/**
	 * @return the rManager
	 */
	public Analysis getrManager() {
		return rManager;
	}

	/**
	 * @return the organism
	 */
	public String getOrganism() {
		return organism;
	}

	public void getGOEnrichment(ArrayList<GeneAnnotation> annot, int minAnnotations, int maxAnnotations, double minPvalue, String correction, GeneRequester gr, Point location, Analysis a, boolean showProgress) {
		//TODO: this shoul be done as an annotation task
		//0) Take number of occurrences if necessary (NOTE: occurences based in probes, no evidence filtering). Only for platform related experiments by now
			//public void getTopGOEnrichment(LinkedList<Integer> genes,
			//		GeneRequester gr, Point location, String ontology, Analysis a) {
			ht=new EnrichmentTestTask(annot, (float)(minPvalue), correction, minAnnotations, maxAnnotations,a);
			EnrichmentTestProgressMonitor hpm = null;
			if(showProgress)
				{
				if (location != null)
					hpm = new EnrichmentTestProgressMonitor(location);
				else
					hpm = new EnrichmentTestProgressMonitor(new Point(0, 0));
				hpm.setTask(ht);
				hpm.run();
				}
			else
				ht.run();
			/*					amd2 = new AnnotationProgressMonitor2(at.label);
					amd2.setTask(at);
					amd2.run();
*/
			
			if (gr != null) {
				geneRequester = gr;
				Thread wt = new Thread() {
					public void run() {
						try 
							{
							geneRequester.receiveGOTerms(ht.get());
							}
						catch (Exception e) 
							{
							e.printStackTrace();
							}
						}
					};
				wt.start();
				}

			}
}