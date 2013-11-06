package es.usal.bicoverlapper.controller.analysis;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

import org.rosuda.JRI.REXP;
import org.rosuda.JRI.RList;
import org.rosuda.JRI.Rengine;

import es.usal.bicoverlapper.model.annotations.GOTerm;
import es.usal.bicoverlapper.model.microarray.ExpressionData;
import es.usal.bicoverlapper.utils.RUtils;

/**
 * This class is a bridge to different R operations It will be the only one
 * maintaining an Rengine for the use of other classes too.
 * 
 * @author Rodrigo Santamaria
 * 
 */
public class Analysis {
	private ExpressionData microarrayData = null;
	public Rengine r = null;
	private REXP exp = null;
	private String defaultPath = "";
	private int[] filterOptions = null;
	private boolean matrixLoaded = false;
	private String groupDescription;	//description of the latest group analysis done
	private String networkDescription;	//description of the latest group analysis done

	public int[] getFilterOptions() {
		return filterOptions;
	}

	public void setFilterOptions(int[] filterOptions) {
		this.filterOptions = filterOptions;
	}

	/**
	 * Collapses conditions by experimental factor values, using averages: If ef
	 * is "time" and we have a matrix with columns "0 min" "0 min" "40 min"
	 * "40 min" "90 min" "90 min" this method collapses to "0 min" "40 min"
	 * "90 min" It's key to be able to simplify complex experiments but keep
	 * replicated in original matrix to allow limma/gsea analysis
	 * 
	 * @param ef
	 */
	public void mergeColumns(String ef, String path) {
		// 1) Merge
		String m = this.microarrayData.rMatrixName;
		if (!matrixLoaded)
			loadMatrix(m);
		loadRLibrary("MASS");

		// String label=this.microarrayData.rMatrixName+"merged";
		r.eval("aess=sapply(unique(" + m + "$FactorValue." + ef
				+ "), function(x) {  rowMeans(exprs(" + m + ")[,which(" + m
				+ "$FactorValue." + ef + "==x),drop=F])  })");
		r.eval("colnames(aess)=unique(" + m + "$FactorValue." + ef + ")");

		// 2) Save
		r.eval("towrite=cbind(featureNames(" + m + "), aess)");
		r.eval("towrite=rbind(c(\"" + ef + "\",unique(" + m + "$FactorValue."
				+ ef + ")), towrite)");// The only EF is the one we merged by
		r.eval("towrite=rbind(c(\"" + microarrayData.organism + "/"
				+ microarrayData.chip + ".db\",unique(" + m + "$FactorValue."
				+ ef + ")), towrite)");
		r.eval("colnames(towrite)=NULL");
		r.eval("write.matrix(towrite, file=\"" + path + "\", sep=\"\\t\")");
		r.eval("rm(towrite)");
		r.eval("rm(aess)");
	}
	
	/**
	 * Given a file with groups (biclustering format) returns principal component coordinates for each.
	 * Usually, comps must be a list with values 1 and 2, but this may be changed.
	 * @return
	 */
	public double[][] getPrincipalComponents(String groupFile, ArrayList<Integer> comps)
		{
		exp = r.eval("source(\"es/usal/bicoverlapper/source/codeR/helpers.R\")");
		exp = r.eval("source(\"es/usal/bicoverlapper/source/codeR/writeBiclusterResults.R\")");
		
		//Read groups
		r.eval("groups=readGroups(file=\""+groupFile+"\")");
		exp=r.eval("principalComponents(groups, log=TRUE)");
		return exp.asDoubleMatrix();
		}

	/**
	 * Collapses rows (probes), using some id: If id is "ENTREZID" and there are
	 * three probes a,b,c corresponding to entrez id e, the mean for the three
	 * is computed Any ID that it's in the microarrayData.chip annotation
	 * package is allowed. If the probe has no correspondence to entrez ids, it
	 * may or may not be discarded depending on discradNAs It's key to be able
	 * to simplify complex experiments but keep replicated in original matrix to
	 * allow limma/gsea analysis
	 * 
	 * @param ef
	 */
	public void mergeRows(String id, boolean discardNAs, String path) {
		id = "ENTREZID"; // TODO: by now only entrezid is allowed
		// 1) Merge
		String m = this.microarrayData.rMatrixName;
		if (!matrixLoaded)
			loadMatrix(m);
		loadRLibrary("MASS");

		exp = r.eval("ids=unlist(mget(featureNames("
				+ microarrayData.rMatrixName + "," + microarrayData.chip + id
				+ ", ifnotfound=NA))");
		if (discardNAs)
			r.eval("ids=ids[-which(is.na(ids))]");

		r.eval("ee=exprs(" + m + ")");
		r.eval("aess=t(sapply(unique(ids), function(x){colMeans(ee[which(ids==x),, drop=FALSE])}))"); // can
																										// take
																										// ~1min
																										// for
																										// human
		r.eval("rownames(aess)=unique(ids)");
		r.eval("rm(ee)");

		// 2) Save
		// Put all the efs in before saving
		r.eval("towrite=cbind(rownames(aess),aess)");
		for (String ef : microarrayData.experimentFactors)
			r.eval("towrite=rbind(c(\"" + ef + "\",unique(" + m
					+ "$FactorValue." + ef + ")), towrite)");// The only EF is
																// the one we
																// merged by
		r.eval("towrite=rbind(c(\"" + microarrayData.organism + "/" + id
				+ ",colnames(towrite[-1])), towrite)");
		r.eval("colnames(towrite)=NULL");
		r.eval("write.matrix(towrite, file=\"" + path + "\", sep=\"\\t\")");
		r.eval("rm(towrite)");
		r.eval("rm(aess)");
	}

	/**
	 * Initiates the biclustering analyzer by loading the required R libraries
	 * and sourcing files, and by loading the microarray data matrix into R
	 * 
	 * @param session
	 */
	public Analysis(Rengine r) {
		try {
			BufferedReader pathReader = new BufferedReader(new FileReader(
					"es/usal/bicoverlapper/data/matrixPath.txt"));
			defaultPath = pathReader.readLine();
			if (r != null)
				this.r = r;

			else
				startR();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void startR() {
		System.out.println("Library is: "
				+ System.getProperty("java.library.path"));
		System.out.println("Creating Rengine (with arguments)");
		System.out.println("R_HOME is: " + System.getenv("R_HOME"));
		if (Rengine.getMainEngine() != null)
			r = Rengine.getMainEngine();
		else if (r == null || !r.isAlive()) {
			r = new Rengine(
					new String[] { "--vanilla"},
					false, null);
			System.out.println("Rengine created, waiting for R");
			// the engine creates R in a new thread, so we should wait until
			// it's ready
			if (!r.waitForR()) {
				System.err.println("Cannot load R");
				return;
			}
		}
		System.out.println("R started");
		loadRscripts();
		System.out.println("required R scripts loaded");
	}

	/**
	 * Loads the libraries in R. An R console must have been started in the
	 * session to do this. Right now, the library to load is "biclust" It also
	 * loads some internal r scripts that extend the biclust package. TODO:
	 * LoadR and loadMatrix should possibly be loaded with the microarra, we
	 * should check the memory/loadtime trade-off
	 */
	public void loadRscripts() {
		if (r == null) {
			System.err.println("No R console started");
			return;
		}

		exp = r.eval("source(\"es/usal/bicoverlapper/source/codeR/binarize.r\")");
		exp = r.eval("source(\"es/usal/bicoverlapper/source/codeR/helpers.r\")");
		exp = r.eval("source(\"es/usal/bicoverlapper/source/codeR/writeBiclusterResults.r\")");
		return;
	}

	public void loadRscript(String name) {
		if (r == null) {
			System.err.println("No R console started");
			return;
		}

		exp = r.eval("source(\"" + name + "\")");
	}

	public int loadRLibrary(String library) {
		exp = r.eval("library(" + library + ")");
		System.out.println("loadRLibrary de " + library + " = " + exp);
		if (exp == null) {
			JOptionPane
			.showMessageDialog(
					null,
					"Package '"+ library + "' is not installed in R\n\nWithout this library some options may malfuction or remain inactive.\nYou may install the package at the R console with:\n\tinstallPackages(\""+library+"\")",
					"Missing R package",
					JOptionPane.WARNING_MESSAGE);
			
			return -1;
		}
		return 0;
	}
	
	public int loadBioconductorLibrary(String library)
		{
		exp = r.eval("library(" + library + ")");
		System.out.println("loadRLibrary de " + library + " = " + exp);
		if (exp == null) {
			JOptionPane
			.showMessageDialog(
					null,
					"Package '"+ library + "' is not installed or cannot be loaded in R\n\nWithout this library some options may malfuction or remain inactive.\nYou may install the package at the R console with:\n    source(\"http://bioconductor.org/biocLite.R\")\n    biocLite(\""+library+"\")",
					"Missing BioConductor package",
					JOptionPane.WARNING_MESSAGE);
			
			return -1;
		}
		return 0;
		}
	
	
	public int loadBioconductorLibraries(String[] libraries)
		{
		ArrayList<String> libErr=new ArrayList<String>();
		for(String library : libraries)
			{
			exp = r.eval("library(" + library + ")");
			System.out.println("loadRLibrary de " + library + " = " + exp);
			if (exp == null) 
				{
				libErr.add(library);
				}
			}
		
		if(libErr.size()>0)
			{
			if(libErr.size()==1)
				JOptionPane.showMessageDialog(null, "Package '"+ libErr.get(0) + "' is not installed or cannot be loaded in R\n\nWithout this library some options may malfuction or remain inactive.\nYou may install the package at the R console with:\n    source(\"http://bioconductor.org/biocLite.R\")\n    biocLite(\""+libErr.get(0)+"\")",
													"Missing BioConductor package", JOptionPane.WARNING_MESSAGE);
			else
				{
				String message="";
				for(String lib:libErr)		message+=lib+", ";
				message=message.substring(0, message.length()-2);
				JOptionPane.showMessageDialog(null, "Packages "+ message + " are not installed or cannot be loaded in R\n\nWithout these libraries, some options may malfuction or remain inactive.\nYou may install the packages at the R console with:\n    source(\"http://bioconductor.org/biocLite.R\")\n    biocLite(\"packageName\")",
						"Missing BioConductor package", JOptionPane.WARNING_MESSAGE);
				
				}
			return -1;
			}
		
		return 0;
		}

	/**
	 * Loads the gene expression matrix into the R session from MicroarrayData
	 * structure TODO: change exprs to different names for each of the sessions
	 * opened (only 1 R session but several possible java sessions!)
	 * 
	 * @label - label to add in R to the expression matrix. If no label, the
	 *        name will be exprs. Otherwise, it will be exprs.label
	 * 
	 */
	// TODO: esto ser’a mucho m‡s r‡pido si leyŽramos la matriz directamente,
	// no???
	public void loadMatrix(String label) {
		if (microarrayData != null) {
			synchronized (this) {
				try{
				System.out.println("loading matrix into R");
				long t0 = System.currentTimeMillis();
				
				// modificación para que funcione en windows
				String os = System.getProperty("os.name").toLowerCase();
				if (os.indexOf("win") >= 0) {
					// si estamos en windows
					exp = r.eval("source(\"es\\\\usal\\\\bicoverlapper\\\\source\\\\codeR\\\\loadMatrix.R\")");
					System.out.println("En r.eval source de windows y exp = "+ exp);
				} else {
					// si estamos en unix
					exp = r.eval("source(\"es/usal/bicoverlapper/source/codeR/loadMatrix.R\")");
					System.out.println("En r.eval source de unix y exp = "+ exp);
				}

				// R necesita las barras de dirección duplicadas, y la forma de
				// hacerlo es ésta
				String rutaWindowsParaR = microarrayData.filePath.replaceAll(
						"\\\\", "\\\\\\\\");

				exp = r.eval(label + "=loadMatrix(filePath=\""
						+ rutaWindowsParaR + "\", numEFs="
						+ microarrayData.experimentFactors.size() + ")");
				
				
				System.out.println("En el exp de loadMatrix y exp = "+exp);
				
				if(r.eval("dim(exprs("+label+"))[1]").asInt()!=microarrayData.getNumGenes())
					{
					try{
						SwingUtilities.invokeLater(new Runnable(){public void run(){
											JOptionPane.showMessageDialog(null, "Duplicated row names found, please remove duplicates. \nBicOverlapper will load the data, but notice that it can become unstable."
									, "Duplicated row names",
									JOptionPane.ERROR_MESSAGE);
							}});
					}catch(Exception e){e.printStackTrace();}
					}
				
				// hasta aquí la modificación para que funcione en windows

				System.out.println("matrix loaded, computing some statistics");
				// compute median by column and quantiles
				exp = r.eval("m=exprs(" + label + ")");
				
				System.out.println("m=exprs(" + label + ") y exp = "+exp);
				
				exp = r.eval("med=apply(m, 2, median)");
				
				System.out.println("med=apply(m, 2, median) y exp = "+exp);
				
				microarrayData.median = r.eval("med").asDoubleArray();
				exp = r.eval("q25=apply(m, 2, quantile)[2,]");
				microarrayData.q25 = r.eval("q25").asDoubleArray();
				r.eval("q75=apply(m, 2, quantile)[4,]");
				microarrayData.q75 = r.eval("q75").asDoubleArray();
				r.eval("iqr=apply(m, 2, quantile)[4,]-apply(m, 2, quantile)[2,]");
				microarrayData.iqr = r.eval("iqr").asDoubleArray();

				RList outliers = r.eval(
						"as.array(sapply(1:dim(m)[2],function(x){c(which(m[,x]>q75[x]+ "
								+ microarrayData.whiskerRange
								+ "*iqr[x]),  which(m[,x]<q25[x]- "
								+ microarrayData.whiskerRange + "*iqr[x]))}))")
						.asList();
				microarrayData.outliers = new HashMap<Integer, int[]>();

				for (int i = 0; i < microarrayData.getNumConditions(); i++)
					microarrayData.outliers.put(new Integer(i), outliers.at(i)
							.asIntArray());

				r.eval("rm(iqr)");
				r.eval("rm(q25)");
				r.eval("rm(q75)");
				r.eval("rm(med)");
				r.eval("rm(tal)");
				exp = r.eval("rm(m)");

				matrixLoaded = true;
				System.out.println("Time to load the matrix into R: "
						+ (System.currentTimeMillis() - t0) / 1000);
				this.notify();
				}catch(Exception e){System.err.println("ERROR loading matrix into R"); e.printStackTrace();}
			}
		} else {
			System.err.println("No matrix loaded");
			return;
		}
	}

	/**
	 * Removes any possible stored data about the expression matrix By now, I
	 * feel no need of unloading packages/sources, etc. (should go to unloadR)
	 */
	public void unloadMatrix() {
		// for(String s:microarrayData.matrixLabels)
		// unloadMatrix(s);
		unloadMatrix(microarrayData.name);
	}

	public void unloadMatrix(String label) {
		if (r != null) {
			r.eval("rm(" + label + ")");
		}
	}
	
	/**
	 * Performs topGO bioConductor enrichment, and returns a table with GO terms and p-values
	 * NOTE: it is working for GSE1000.txt
	 * TODO: only working now wiht xxxx.db files
	 * TODO: might be a little slow, check timings
	 * TODO: check different filtering options
	 * TODO: GO terms are trimmed, be may better get GO IDs and retrieve terms by ourselves
	 * TODO: data change if ontology changes
	 * @param alpha
	 * @param ontology
	 * @param selection
	 * @return
	 */
	public ArrayList<GOTerm> goEnrichment(double alpha, String ontology, ArrayList<String> selection)
		{
		String m = this.microarrayData.rMatrixName;
			if (r == null) {
				System.err.println("No R console");
				return null;
			}
			System.out.println("tab=GOenrichment(alpha="+alpha+", filter=\"classic\", sampleGOdata=data, universeGenes=featureNames("+m+"), selectedGenes="+RUtils.getRList((String[])selection.toArray(new String[0]))+")");
		if (!matrixLoaded)
			loadMatrix(m);
		if(loadBioconductorLibrary("topGO")==-1)	{System.err.println("package topGO not installed in R"); return null;}
		exp=r.eval("source(\"es/usal/bicoverlapper/source/codeR/enrichment.R\")");
		if(r.eval("description(data)")==null || !ontology.equals(r.eval("ontology").asString()))
			{
			r.eval("data=createTopGO(onto=\""+ontology+"\", universeGenes=featureNames("+m+"), ns=5, lib=annotation("+m+"))");
			r.eval("ontology=\""+ontology+"\"");
			}
		exp=r.eval("tab=GOenrichment(alpha="+alpha+", filter=\"classic\", sampleGOdata=data, universeGenes=featureNames("+m+"), selectedGenes="+RUtils.getRList((String[])selection.toArray(new String[0]))+")");
		if(exp==null)
			{System.err.println("Error: an error occurred during enrichment"); return null;}
		String[] terms=r.eval("tab[, \"Term\"]").asStringArray();
		String[] pvals=r.eval("tab[, \"classic\"]").asStringArray();
		String[] ids=r.eval("tab[, \"GO.ID\"]").asStringArray();
		int[] ocs=r.eval("tab[, \"Significant\"]").asIntArray();
		
		ArrayList<GOTerm> table=new ArrayList<GOTerm>();
		for(int i=0;i<terms.length;i++)
			{
			GOTerm got=new GOTerm();
			got.setTerm(terms[i]);
			got.setPvalue(new Double(pvals[i]).doubleValue());
			got.setId(ids[i]);
			got.setOccurences(ocs[i]);
			got.setOntology(ontology);
			table.add(got);
			}
		return table;
		}

	/**
	 * Performs the BiMax biclustering with the R implementation in package
	 * biclust
	 * 
	 * @param percentage
	 *            - if true the previous binarization step is done by percentage
	 *            (only the specified percentage of expression levels will be 1)
	 * @param threshold
	 *            - the expression or percentage limit for binarization
	 * @param under
	 *            - if true, the values under the threshold are set to 1 and the
	 *            expression levels above the threshold are set to 0 (viceversa
	 *            if false)
	 * @param minr
	 *            - minimum number of rows (genes) that biclusters must have
	 * @param minc
	 *            - minimum number of columns (conditions) that biclusters must
	 *            have
	 * @param maxNumber
	 *            - maximum number of biclusters to find TODO: check that they
	 *            are the larger biclusters
	 * @param outFile
	 *            - file to write down the results
	 * @param description
	 *            - description about the biclustering to add to header of the
	 *            file
	 * @return The name of the file where the results are stored
	 */
	public String bimax(boolean percentage, double threshold, boolean under,
			int minr, int minc, int maxNumber, String outFile,
			String description) {
		// TODO: La binarizaci—n por porcentaje no rula
		// TODO: El post-filtrado por % de solapamiento no rula
		String m = this.microarrayData.rMatrixName;
		if (r == null) {
			System.err.println("No R console");
			return "";
		}
		if (!matrixLoaded)
			loadMatrix(m);
		if(loadRLibrary("biclust")==-1)	{System.err.println("package biclust not installed in R"); return "";}
		exp = r.eval("source(\"es/usal/bicoverlapper/source/codeR/binarize.r\")");// the
																					// load
																					// of
																					// biclust
																					// removes
																					// the
																					// newer
																					// version
																					// of
																					// binarize
																					// if
																					// not

		String lowCad = "TRUE";
		if (under == false)
			lowCad = "FALSE";
		if (percentage)
			exp = r.eval("loma<- binarizeByPercentage2(exprs(" + m + "),"
					+ threshold + ", error=0.1, gap=(max(exprs(" + m
					+ "))-min(exprs(" + m + ")))/1000, low=" + lowCad + ")");
		// if(percentage)
		// exp=r.eval("loma<- binarizeByPercentage(exprs("+m+"),"+threshold+")");
		else
			exp = r.eval("loma<- binarize2(exprs(" + m + ")," + threshold
					+ ", low=" + lowCad + ")");
		exp = r.eval("res <- biclust(x=loma, method=BCBimax(), minr=" + minr
				+ ", minc=" + minc + ", number=" + maxNumber + ")");
		exp = r.eval("res@Number");
		if (exp == null) {
			System.err.println("Bimax did not run correctly");
			return "";
		}

		if (outFile.length() == 0) // tempfile
		{
			outFile = "bimax" + (int) (100000 * Math.random()) + ".tmp";
		} else {
			if (!outFile.contains(".")) // automatic name
			{
				outFile = outFile.replace("\\", "/");
				if (!outFile.endsWith("\\") && !outFile.endsWith("/"))
					outFile = outFile.concat("/");
				if (percentage)
					outFile = outFile.concat("bimax_mr" + minr + "_mc" + minc
							+ "_mb" + maxNumber + "_perc" + threshold);
				else
					outFile = outFile.concat("bimax_mr" + minr + "_mc" + minc
							+ "_mb" + maxNumber + "_value" + threshold);
				outFile = outFile.replace(".", "-");
				outFile = outFile.concat(".bic");
			}

		}
		if (description.length() == 0) {
			description = "Bimax";
		}
		
		this.groupDescription=description;
		exp = r.eval("res2=convertclust(res)");
		exp = r.eval("length(res2)");
		filter();
		exp = r.eval("length(res2)");
		// TODO: if length>0
		exp = r.eval("writeBiclusterResults(\""
				+ outFile
				+ "\", res2, \""
				+ description.replace(" ", "_")
				+ "\", paste(\"B\",+c(1:length(res2)), sep=\"\"), featureNames("
				+ m + "), sampleNames(" + m + "))");
		exp = r.eval("rm(loma)");
		exp = r.eval("rm(res)");
		exp = r.eval("rm(res2)");
		return outFile;
	}
	
	/*public void saveGroups(String outFile)
		{
		String m = this.microarrayData.rMatrixName;
		exp = r.eval("writeBiclusterResults(\""
				+ outFile
				+ "\", res2, \""
				+ groupDescription.replace(" ", "_")
				+ "\", paste(\"B\",+c(1:length(res2)), sep=\"\"), featureNames("
				+ m + "), sampleNames(" + m + "))");
		}

	public void saveNetwork(String outFile)
		{	
		
		String m = this.microarrayData.rMatrixName;
		exp = r.eval("writeGML(gmlFile=\""
				+ outFile
				+nodeids=ids, nodenames=names, edges=list(n1=ic, n2=jc))"writeBiclusterResults(\""
				+ "\", nodeids=, \""
				+ groupDescription.replace(" ", "_")
				+ "\", paste(\"B\",+c(1:length(res2)), sep=\"\"), featureNames("
				+ m + "), sampleNames(" + m + "))");
		}

	/**
	 * Filters the bicluster results by using the current filter options.
	 */
	public void filter() {
		if (filterOptions == null || filterOptions.length != 4)
			return;
		exp = r.eval("length(res2)");
		exp = r.eval("res2=filterclust(res2, overlapThreshold="
				+ filterOptions[0] / 100.0 + ", maxNumber=" + filterOptions[1]
				+ ", maxRows=" + filterOptions[3] + ", maxCols="
				+ filterOptions[2] + ")");
		exp = r.eval("length(res2)");
		return;
	}

	public int[] select(double[] lowt, double[] hight)
		{
		String m = microarrayData.rMatrixName;
		if (!matrixLoaded)
			loadMatrix(m);
		
		String mm="exprs("+m+")";
		String cad="";
		for(int i=0;i<this.microarrayData.getNumConditions();i++)
			{
			if(i==0)	cad+=mm+"[,"+(i+1)+"]>"+lowt[i]+" && "+mm+"[,"+(i+1)+"]<"+hight[i];
			else		cad+=" && "+mm+"[,"+(i+1)+"]>"+lowt[i]+" && "+mm+"[,"+(i+1)+"]<"+hight[i];
			}
		exp = r.eval("which("+cad+")");
		return exp.asIntArray();
		}
	/**
	 * Executes Plaid Model algorithm as implemented in R package biclust
	 * 
	 * @param outFile
	 *            - file to write down the results
	 * @param description
	 *            - description about the biclustering to add to header of the
	 *            file
	 * @return the name of the file with the results
	 */
	public String plaid(String cluster, float rrel, float crel, String outFile,
			String description) {
		if (r == null) {
			System.err.println("Bimax: no R console");
			return "";
		}
		String m = microarrayData.rMatrixName;
		if (!matrixLoaded)
			loadMatrix(m);
		loadRLibrary("biclust");

		exp = r.eval("res <- biclust(x=exprs(" + m
				+ "), method=BCPlaid(), cluster=\"" + cluster
				+ "\", row.release=" + rrel + ", col.release=" + crel + ")");
		exp = r.eval("res@Number");
		if (exp == null) {
			System.err.println("Plaid model algorithm did not run correctly");
			return null;
		}

		if (outFile.length() == 0) // tempfile
		{
			outFile = "plaid" + (int) (100000 * Math.random()) + ".tmp";// TODO:
																		// erase
																		// when
																		// exiting
		} else {
			if (!outFile.contains(".")) // automatic name
			{
				outFile = outFile.replace("\\", "/");
				if (!outFile.endsWith("\\") && !outFile.endsWith("/"))
					outFile = outFile.concat("/");
				outFile = outFile.concat("plaid");
				outFile = outFile.replace(".", "-");
				outFile = outFile.concat(".bic");
			}

		}
		if (description.length() == 0) {
			description = "Plaid";
		}

		exp = r.eval("res2=convertclust(res)");
		filter();
		exp = r.eval("length(res2)");
		exp = r.eval("writeBiclusterResults(\""
				+ outFile
				+ "\", res2, \""
				+ description.replace(" ", "_")
				+ "\", paste(\"B\",+c(1:length(res2)), sep=\"\"), featureNames("
				+ m + "), sampleNames(" + m + "))");
		exp = r.eval("rm(res)");
		exp = r.eval("rm(res2)");
		return outFile;
	}

	/**
	 * Executes ISA algorithm as implemented in R package isa2 ISA takes random
	 * gene profiles and starts computing the similarity of other gene profiles,
	 * similarly to other algorithms like Cheng and Church
	 * 
	 * @param rowThreshold
	 *            - threshold for rows. NOTE that this is not the threshold used
	 *            as parameter of isa() but in a postfiltering of biclusters
	 * @param colThershold
	 *            - threshold for columns. NOTE that this is not the threshold
	 *            used as parameter of isa() but in a postfiltering of
	 *            biclusters
	 * @param numSeeds
	 *            - number of initial seeds. They are chosen randomly and one
	 *            bicluster is generated for each
	 * @param outFile
	 *            - file to write down the results
	 * @param description
	 *            - description about the biclustering to add to header of the
	 *            file
	 * @return the name of the file with the results
	 */
	public String isa2(float rowThreshold, float colThreshold, int numSeeds,
			String outFile, String description) {
		// TODO: ISA sometimes returns 1 column biclusters!
		if (r == null) {
			System.err.println("No R console");
			return "";
		}
		String m = microarrayData.rMatrixName;
		if (!matrixLoaded)
			loadMatrix(m);
		loadRLibrary("isa2");

		// Checks for 1, 1.5, 2, 2.5, 3, as in default (TODO: allow to change it
		// in the interface)
		exp = r.eval("res <- isa(exprs(" + m + "), no.seeds=" + numSeeds + ")");
		exp = r.eval("res$columns");
		if (exp == null) {
			System.err.println("ISA algorithm did not run correctly");
			return null;
		}
		exp = r.eval("dim(res$columns)[2]");
		if (exp.asInt() == 0) {
			System.err.println("ISA algorithm did not find any bicluster");
			return null;
		}

		if (outFile.length() == 0) // tempfile
		{
			outFile = "isa" + (int) (100000 * Math.random()) + ".tmp";// TODO:
																		// erase
																		// when
																		// exiting
		} else {
			if (!outFile.contains(".")) // automatic name
			{
				outFile = outFile.replace("\\", "/");
				if (!outFile.endsWith("\\") && !outFile.endsWith("/"))
					outFile = outFile.concat("/");
				outFile = outFile.concat("isa");
				outFile = outFile.replace(".", "-");
				outFile = outFile.concat(".bic");
			}

		}
		if (description.length() == 0) {
			description = "ISA";
		}

		// exp=r.eval("res2=convertISAclust(res)");
		exp = r.eval("res2=convertISAclust(res, row.thr=" + rowThreshold
				+ ", col.thr=" + colThreshold + ")");
		filter();
		exp = r.eval("length(res2)");
		exp = r.eval("writeBiclusterResults(\""
				+ outFile
				+ "\", res2, \""
				+ description.replace(" ", "_")
				+ "\", paste(\"B\",+c(1:length(res2)), sep=\"\"), featureNames("
				+ m + "), sampleNames(" + m + "))");
		exp = r.eval("rm(res)");
		exp = r.eval("rm(res2)");
		return outFile;
	}

	/**
	 * Executes xMotifs algorithm as implemented in R package biclust
	 * 
	 * @param disc
	 *            Number of levels to use to discretize the gene expression
	 *            matrix
	 * @param quantiles
	 *            if true, levels are computed by means of quantiles, otherwise
	 *            by their raw expression levels
	 * @param ns
	 *            see biclust xMotifs help
	 * @param nd
	 *            see biclust xMotifs help
	 * @param sd
	 *            see biclust xMotifs help
	 * @param alpha
	 *            see biclust xMotifs help
	 * @param number
	 *            see biclust xMotifs help
	 * @param outFile
	 *            - file to write down the results
	 * @param description
	 *            - description about the biclustering to add to header of the
	 *            file
	 * @return the name of the file with the results
	 */
	public String xmotifs(int disc, boolean quantiles, int ns, int nd, int sd,
			double alpha, int number, String outFile, String description) {
		if (r == null) {
			System.err.println("No R console");
			return "";
		}
		String m = microarrayData.rMatrixName;
		if (!matrixLoaded)
			loadMatrix(m);
		loadRLibrary("biclust");

		String boolCad = "TRUE";
		if (quantiles == false)
			boolCad = "FALSE";

		exp = r.eval("dima=discretize(x=exprs(" + m + "), nof=" + disc
				+ ", quant=" + boolCad + ")");
		exp = r.eval("res <- biclust(x=dima, method=BCXmotifs(), ns=" + ns
				+ ", nd=" + nd + ", sd=" + sd + ", alpha=" + alpha
				+ ", number=" + number + ")");
		exp = r.eval("res@Number");
		if (exp == null) {
			System.err.println("Xmotifs biclustering did not run correctly");
			return null;
		}

		if (outFile.length() == 0) // tempfile
		{
			outFile = "xmotifs" + (int) (100000 * Math.random()) + ".tmp";// TODO:
																			// erase
																			// when
																			// exiting
		} else {
			if (!outFile.contains(".")) // automatic name
			{
				outFile = outFile.replace("\\", "/");
				if (!outFile.endsWith("\\") && !outFile.endsWith("/"))
					outFile = outFile.concat("/");
				outFile = outFile.concat("xmotifs");
				outFile = outFile.replace(".", "-");
				outFile = outFile.concat(".bic");
			}

		}
		if (description.length() == 0) {
			description = "XMotifs";
		}

		exp = r.eval("res2=convertclust(res)");
		filter();
		exp = r.eval("length(res2)");
		exp = r.eval("writeBiclusterResults(\""
				+ outFile
				+ "\", res2, \""
				+ description.replace(" ", "_")
				+ "\", paste(\"B\",+c(1:length(res2)), sep=\"\"),  featureNames("
				+ m + "), sampleNames(" + m + "))");
		exp = r.eval("rm(dima)");
		exp = r.eval("rm(res)");
		exp = r.eval("rm(res2)");
		return outFile;
	}

	/**
	 * Executes Cheng and Church algorithm as implemented in R package biclust
	 * 
	 * @param delta
	 *            see biclust xMotifs help
	 * @param alpha
	 *            see biclust xMotifs help
	 * @param number
	 *            maximum number of biclusters to find
	 * @param outFile
	 *            - file to write down the results
	 * @param description
	 *            - description about the biclustering to add to header of the
	 *            file
	 * @return the name of the file with the results
	 */
	public String chengChurch(float delta, float alpha, int number,
			String outFile, String description) {
		String m = microarrayData.rMatrixName;
		if (r == null) {
			System.err.println("No R console");
			return "";
		}
		if (!matrixLoaded)
			loadMatrix(m);
		loadRLibrary("biclust");

		exp = r.eval("res <- biclust(x=exprs(" + m + "), method=BCCC(), delta="
				+ delta + ", alpha=" + alpha + ", number=" + number + ")");
		exp = r.eval("res@Number");
		if (exp == null) {
			System.err
					.println("Cheng and Church biclustering did not run correctly");
			return null;
		}

		if (outFile.length() == 0) // tempfile
		{
			outFile = "cc" + (int) (100000 * Math.random()) + ".tmp";// TODO:
																		// erase
																		// when
																		// exiting
		} else {
			if (!outFile.contains(".")) // automatic name
			{
				outFile = outFile.replace("\\", "/");
				if (!outFile.endsWith("\\") && !outFile.endsWith("/"))
					outFile = outFile.concat("/");
				outFile = outFile.concat("chengchurch");
				outFile = outFile.replace(".", "-");
				outFile = outFile.concat(".bic");
			}

		}
		if (description.length() == 0) {
			description = "ChengChurch";
		}

		exp = r.eval("res2=convertclust(res)");
		filter();
		exp = r.eval("length(res2)");
		exp = r.eval("writeBiclusterResults(\""
				+ outFile
				+ "\", res2, \""
				+ description.replace(" ", "_")
				+ "\", paste(\"B\",+c(1:length(res2)), sep=\"\"),  featureNames("
				+ m + "), sampleNames(" + m + "))");
		exp = r.eval("rm(res)");
		exp = r.eval("rm(res2)");
		return outFile;
	}

	/**
	 * Returns the top threshold ids that have a distance lower than the
	 * threshold respect to the gene passed as argument
	 * 
	 * @param maxDistance
	 * @param gene
	 * @return
	 */
	//TODO: possibly be more flexible with the options: number/distance and value
	// public ArrayList<Integer> getSimilarProfiles(double threshold, int gene)
	public String[] getSimilarProfiles(int threshold, String gene) {
		if (r == null) {
			System.err.println("no R console");
			return null;
		}
		if (microarrayData == null) {
			System.err.println("no microarray data");
			return null;
		}
		String m = microarrayData.rMatrixName;
		if (!matrixLoaded)
			loadMatrix(m);

		exp=r.eval("dif=exprs("+m+")-matrix(rep(exprs("+m+")[\""+gene+"\",],dim("+m+")[1]), nrow=dim("+m+")[1], ncol=dim("+m+")[2], byrow=TRUE)");
		exp=r.eval("d=sqrt(rowSums(dif*dif))");
		r.eval("rm(dif)");
		exp = r.eval("featureNames(" + m + ")[order(d)][1:" + (threshold + 1)
				+ "]");// the first one is actually itself
		if (exp != null)
			return (exp.asStringArray());
		else {
			System.err.println("Error: getSimilarProfiles returned null");
			return null;
		}
	}

	/**
	 * Downloads a microarray experiment from ArrayExpress and normalizes it,
	 * using RMA. It relies on the BioConductor package ArrayExpress, so
	 * accession IDs that cannot be loaded via this package are unavailable.
	 * 
	 * @param id
	 *            - ArrayExpress accession ID
	 * @param path
	 *            - location file were the expression level matrix (in
	 *            BicOverlapper format) is to be stored
	 */
	public String downloadArrayExpressExperiment(String id, String path) {
		loadBioconductorLibrary("ArrayExpress");
		loadBioconductorLibrary("affy");
		exp = r.eval("source(\"es/usal/bicoverlapper/source/codeR/downloadAndNormalize.R\")");
		System.out.println("Calling download and normalize");
				
		//para que funcione tanto si la ruta se da con \ como si se da con /
		path = path.replace("\\", "/");
		
		System.out.println("path completo = "+path);
		
		String fileName = path.substring(path.lastIndexOf("/") + 1);
		path = path.substring(0, path.lastIndexOf("/"));		
				
		System.out.println("path = "+path);
		System.out.println("fileName = "+fileName);
		
		exp = r.eval("downloadAndNormalize(experimentID=\"" + id
				+ "\", path=\"" + path + "\", fileName=\"" + fileName + "\")");
		if (exp == null) {
			if (exp != null && exp.asString() != null
					&& exp.asString().startsWith("Error")) {
				System.err
						.println("Error, cannot download and normalize experiment");
				JOptionPane.showMessageDialog(null, exp.asString(), "Error",
						JOptionPane.ERROR_MESSAGE);
				return null;
			}
		} else
			System.out.println("Experiment downloaded and normalized");
		return path + "/" + fileName;
	}

	
	/**
	 * Downloads a microarray experiment from ArrayExpress and normalizes it,
	 * using RMA. It relies on the BioConductor package ArrayExpress, so
	 * accession IDs that cannot be loaded via this package are unavailable.
	 * 
	 * @param id
	 *            - ArrayExpress accession ID
	 * @param path
	 *            - location file were the expression level matrix (in
	 *            BicOverlapper format) is to be stored
	 */
	public String downloadGEOExperiment(String id, String path, boolean logTransform) {
		loadBioconductorLibrary("GEOquery");
		exp = r.eval("source(\"es/usal/bicoverlapper/source/codeR/downloadAndNormalize.R\")");
		System.out.println("Calling download");
				
		//para que funcione tanto si la ruta se da con \ como si se da con /
		path = path.replace("\\", "/");
		
		System.out.println("path completo = "+path);
		
		String fileName = path.substring(path.lastIndexOf("/") + 1);
		path = path.substring(0, path.lastIndexOf("/"));		
				
		System.out.println("path = "+path);
		System.out.println("fileName = "+fileName);
		
		exp = r.eval("downloadGEO(experimentID=\"" + id
				+ "\", path=\"" + path + "\", fileName=\"" + fileName + "\", log="+new String(""+logTransform).toUpperCase()+" )");
		if (exp == null) {
			if (exp != null && exp.asString() != null
					&& exp.asString().startsWith("Error")) {
				System.err
						.println("Error, cannot download and normalize experiment");
				JOptionPane.showMessageDialog(null, exp.asString(), "Error",
						JOptionPane.ERROR_MESSAGE);
				return null;
			}
		} else
			System.out.println("Experiment downloaded and normalized");
		return path + "/" + fileName;
	}
	/**
	 * Performs differential expression analysis via limma TODO: make it
	 * iterative so we can do every single group/combination upon the selection
	 * 
	 * @param group1
	 *            - first group of samples
	 * @param group2
	 *            - second group of samples
	 * @param bh
	 *            - if true, Benjamini and Hochberg correction to p-values is
	 *            computed
	 * @param pvalue
	 *            - threshold for statistical significance
	 * @param elevel
	 *            - threshold for differential expression (log10)
	 * @param reg
	 *            - regulation (can be up, down or all)
	 */
	public String limma(String ef, String nameGroup1, String nameGroup2,
			boolean bh, double pvalue, double elevel, String reg,
			String outFile, String description) {
		String m = this.microarrayData.rMatrixName;
		if (!matrixLoaded)
			loadMatrix(m);
		loadBioconductorLibrary("limma");
		exp = r.eval("source(\"es/usal/bicoverlapper/source/codeR/difAnalysis.R\")");
		//TODO: if nameGroup1 or 2 is rest, perform the proper condition identification.
		//if(nameGroup1.equals("rest"))
		if(r.eval("length(grep(\"^"+nameGroup1+"$\", "+RUtils.getRList(microarrayData.getExperimentFactorValues(ef))+"))").asInt()<=1 ||
				r.eval("length(grep(\"^"+nameGroup2+"$\", "+RUtils.getRList(microarrayData.getExperimentFactorValues(ef))+"))").asInt()<=1)
			{
			System.err.println("Error, not enough replicates of "+nameGroup1+" or"+ nameGroup2);
			JOptionPane.showMessageDialog(null, "Differential expression cannot be done. Experimental factors must have two or more replicates.", "Error", JOptionPane.ERROR_MESSAGE);
			return null;
			}
		
		System.out.println("degs=diffAnalysis(exprs(" + m + "), g="
				+ RUtils.getRList(microarrayData.getExperimentFactorValues(ef))
				+ ", g1=\"" + nameGroup1 + "\", g2=\"" + nameGroup2 + "\", "
				+ "pvalT=" + pvalue + ", diffT=" + elevel + ", byRank=FALSE, "
				+ "numRank=50, return =\"" + reg + "\")");

		exp = r.eval("degs=diffAnalysis(exprs(" + m + "), g="
				+ RUtils.getRList(microarrayData.getExperimentFactorValues(ef))
				+ ", g1=\"" + nameGroup1 + "\", g2=\"" + nameGroup2 + "\", "
				+ "pvalT=" + pvalue + ", diffT=" + elevel + ", byRank=FALSE, "
				+ "numRank=50, return =\"" + reg + "\")");
		if (exp == null) {
			System.out.println("Error, cannot perform differential expression analysis");
			return null;
		}

		if(r.eval("length(degs)").asInt()==0)
			{
			System.err.println("Error, no differentially expressed genes found");
			JOptionPane.showMessageDialog(null, "No differentially expressed genes found under current settings.", "Error", JOptionPane.ERROR_MESSAGE);
			return null;
			}
		exp = r.eval("lr=list(featureNames(" + m + ")[degs])");

		if (outFile.length() == 0) // tempfile
		{
			outFile = "limma" + (int) (100000 * Math.random()) + ".tmp";
		} else {
			if (!outFile.contains(".")) // automatic name
			{
				outFile = outFile.replace("\\", "/");
				if (!outFile.endsWith("\\") && !outFile.endsWith("/"))
					outFile = outFile.concat("/");
				outFile = outFile.replace(".", "-");
				outFile = outFile.concat(".bic");
			}
		}
		String status = "under- or over-";
		if (reg.equals("up"))
			status = "over-";
		if (reg.equals("down"))
			status = "under-";
		String desc = "Differentially " + status
				+ "expressed genes found with limma in " + nameGroup1
				+ " respect to " + nameGroup2 + " (dexp=" + elevel
				+ ", p-val=10e-" + pvalue;
		if (!bh)
			desc += ")";
		else
			desc += " (BH corrected))";
		if (description != null && description.length() > 0)
			desc = description;

		exp = r.eval("writeBiclusterResultsFromList(\"" + outFile
				+ "\", lr, NA, bicNames=c(\"" + nameGroup1 + " vs "
				+ nameGroup2 + "\"), biclusteringDescription=\"" + desc + "\")");
		return outFile;
	}

	/**
	 * Like limma, but in this case the differential expression analysis is
	 * performed for every Experimental factor value on a experimental factor
	 * against a given factor value
	 * 
	 * @param ef
	 *            - experimental factor
	 * @param efv
	 *            - experimental factor value for differential expression
	 *            against the rest
	 * @param bh
	 *            - if true, Benjamini and Hochberg correction to p-values is
	 *            computed
	 * @param pvalue
	 *            - threshold for statistical significance
	 * @param elevel
	 *            - threshold for differential expression (log10)
	 * @param reg
	 *            - regulation (can be up, down or all)
	 */
	public String limmaEF(String ef, String efv, boolean bh, double pvalue,
			double elevel, String reg, String outFile, String description) {
		String m = this.microarrayData.rMatrixName;
		if (!matrixLoaded)
			loadMatrix(m);
		loadBioconductorLibrary("limma");

		exp = r.eval("source(\"es/usal/bicoverlapper/source/codeR/writeBiclusterResults.r\")");
		exp = r.eval("source(\"es/usal/bicoverlapper/source/codeR/difAnalysis.R\")");
		System.out.println("degs=diffAnalysisEF(exprs(" + m + "), ef="
				+ RUtils.getRList(microarrayData.getExperimentFactorValues(ef))
				+ ", efv=\"" + efv + "\", " + "interestingNames=c(), pvalT="
				+ pvalue + ", diffT=" + elevel + ", byRank=FALSE, "
				+ "numRank=50, return =\"" + reg + "\")");
		exp = r.eval("degs=diffAnalysisEF(exprs(" + m + "), ef="
				+ RUtils.getRList(microarrayData.getExperimentFactorValues(ef))
				+ ", efv=\"" + efv + "\", " + "interestingNames=c(), pvalT="
				+ pvalue + ", diffT=" + elevel + ", byRank=FALSE, "
				+ "numRank=50, return =\"" + reg + "\")");
		if (exp == null) {
			System.out
					.println("Error, cannot perform differential expression analysis");
			return null;
		}

		if (outFile.length() == 0) // tempfile
		{
			outFile = "limma" + (int) (100000 * Math.random()) + ".tmp";
		} else {
			if (!outFile.contains(".")) // automatic name
			{
				outFile = outFile.replace("\\", "/");
				if (!outFile.endsWith("\\") && !outFile.endsWith("/"))
					outFile = outFile.concat("/");
				outFile = outFile.concat(".bic");
			}
		}
		String status = "under- or over-";
		if (reg.equals("up"))
			status = "over-";
		if (reg.equals("down"))
			status = "under-";
		String desc = "Differentially " + status
				+ "expressed genes found with limma for " + ef
				+ " respect to other experimental factor values on " + ef
				+ " (dexp=" + elevel + ", p-val=10e-" + pvalue;
		if (!bh)
			desc += ")";
		else
			desc += " (BH corrected))";
		if (description != null && description.length() > 0)
			desc = description;

		exp = r.eval("writeBiclusterResultsFromList(\""
				+ outFile
				+ "\", degs, NA, bicNames=names(degs), biclusteringDescription=\""
				+ desc + "\")");
		return outFile;
	}

	
	/**
	 * Like limmaEF, but in this case the differential expression analysis is
	 * performed for every possible combination of experimental factor values of
	 * the experimental factor passed as argument
	 * 
	 * @param ef
	 *            - experimental factor
	 * @param bh
	 *            - if true, Benjamini and Hochberg correction to p-values is
	 *            computed
	 * @param pvalue
	 *            - threshold for statistical significance
	 * @param elevel
	 *            - threshold for differential expression (log10)
	 * @param reg
	 *            - regulation (can be up, down or all)
	 */
	public String limmaEFall(String ef, boolean bh, double pvalue,
			double elevel, String reg, String outFile, String description) {
		String m = this.microarrayData.rMatrixName;
		if (!matrixLoaded)
			loadMatrix(m);
		loadBioconductorLibrary("limma");

		exp = r.eval("source(\"es/usal/bicoverlapper/source/codeR/writeBiclusterResults.r\")");
		exp = r.eval("source(\"es/usal/bicoverlapper/source/codeR/difAnalysis.R\")");
		
		int reps=0;
		for(String e:microarrayData.getExperimentFactorValues(ef))
			{
			if(r.eval("length(grep(\"^"+e+"$\", "+RUtils.getRList(microarrayData.getExperimentFactorValues(ef))+"))").asInt()>1)
				reps++;
			}
		if(reps<2)
			{
			System.err.println("Error, not enough replicates of the values of "+ef);
			JOptionPane.showMessageDialog(null, "There are no replicates for the factor values of "+ef+". Please select an experimental factor with replicates.", "Error", JOptionPane.ERROR_MESSAGE);
			return null;
			}
		
		System.out.println("degs=diffAnalysisEFall(exprs(" + m + "), ef="
				+ RUtils.getRList(microarrayData.getExperimentFactorValues(ef))
				+ ", " + "pvalT=" + pvalue + ", diffT=" + elevel
				+ ", byRank=FALSE, " + "numRank=50, return =\"" + reg + "\")");
		exp = r.eval("degs=diffAnalysisEFall(exprs(" + m + "), ef="
				+ RUtils.getRList(microarrayData.getExperimentFactorValues(ef))
				+ ", " + "pvalT=" + pvalue + ", diffT=" + elevel
				+ ", byRank=FALSE, " + "numRank=50, return =\"" + reg + "\")");
		if (exp == null) {
			System.out
					.println("Error, cannot perform differential expression analysis");
			return null;
		}
		
		/*if(r.eval("length(degs)").asInt()==0)
			{
			System.err.println("Error, no differentially expressed genes found");
			JOptionPane.showMessageDialog(null, "No differentially expressed genes found under current settings.", "Error", JOptionPane.ERROR_MESSAGE);
			return null;
			}*/


		if (outFile.length() == 0) // tempfile
		{
			outFile = "limma" + (int) (100000 * Math.random()) + ".tmp";
		} else {
			if (!outFile.contains(".")) // automatic name
			{
				outFile = outFile.replace("\\", "/");
				if (!outFile.endsWith("\\") && !outFile.endsWith("/"))
					outFile = outFile.concat("/");
				outFile = outFile.concat(".bic");
			}
		}
		String status = "under- or over-";
		if (reg.equals("up"))
			status = "over-";
		if (reg.equals("down"))
			status = "under-";
		String desc = "Differentially "
				+ status
				+ "expressed genes found with limma for every combination of EFVs on "
				+ ef + " (dexp=" + elevel + ", p-val=10e-" + pvalue;
		if (!bh)
			desc += ")";
		else
			desc += " (BH corrected))";
		if (description != null && description.length() > 0)
			desc = description;
		exp = r.eval("writeBiclusterResultsFromList(\""
				+ outFile
				+ "\", degs$degs, NA, bicNames=degs$names, biclusteringDescription=\""
				+ desc + "\")");
		return outFile;
	}

	/**
	 * Like limmaEFall, but now we perform over every combination of EFVs FOR
	 * EACH EF on the microarray
	 * 
	 * @param bh
	 *            - if true, Benjamini and Hochberg correction to p-values is
	 *            computed
	 * @param pvalue
	 *            - threshold for statistical significance
	 * @param elevel
	 *            - threshold for differential expression (log10)
	 * @param reg
	 *            - regulation (can be up, down or all)
	 */
	public String limmaAll(boolean bh, double pvalue, double elevel,
			String reg, String outFile, String description) {
		String m = this.microarrayData.rMatrixName;
		if (!matrixLoaded)
			loadMatrix(m);
		loadBioconductorLibrary("limma");

		exp = r.eval("source(\"es/usal/bicoverlapper/source/codeR/writeBiclusterResults.r\")");
		exp = r.eval("source(\"es/usal/bicoverlapper/source/codeR/difAnalysis.R\")");
		exp = r.eval("efs=list()");
		for (int i = 0; i < microarrayData.experimentFactors.size(); i++)
			exp = r.eval("efs=c(efs, list("
					+ RUtils.getRList(microarrayData.experimentFactorValues
							.get(microarrayData.experimentFactors.get(i)))
					+ "))");

		System.out.println("degs=diffAnalysisAll(exprs("
				+ m
				+ "), ef=efs, "
				+ "efNames="
				+ RUtils.getRList(microarrayData.experimentFactors
						.toArray(new String[0])) + ", " + "pvalT=" + pvalue
				+ ", diffT=" + elevel + ", byRank=FALSE, "
				+ "numRank=50, return =\"" + reg + "\")");
		exp = r.eval("degs=diffAnalysisAll(exprs("
				+ m
				+ "), ef=efs, "
				+ "efNames="
				+ RUtils.getRList(microarrayData.experimentFactors
						.toArray(new String[0])) + ", " + "pvalT=" + pvalue
				+ ", diffT=" + elevel + ", byRank=FALSE, "
				+ "numRank=50, return =\"" + reg + "\")");
		if (exp == null) {
			System.out
					.println("Error, cannot perform differential expression analysis");
			return null;
		}

		if (outFile.length() == 0) // tempfile
		{
			outFile = "limma" + (int) (100000 * Math.random()) + ".tmp";
		} else {
			if (!outFile.contains(".")) // automatic name
			{
				outFile = outFile.replace("\\", "/");
				if (!outFile.endsWith("\\") && !outFile.endsWith("/"))
					outFile = outFile.concat("/");
				outFile = outFile.concat(".bic");
			}
		}
		String status = "under- or over-";
		if (reg.equals("up"))
			status = "over-";
		if (reg.equals("down"))
			status = "under-";
		String[] desc = new String[microarrayData.experimentFactors.size()];
		for (int i = 0; i < desc.length; i++) {
			desc[i] = "Differentially "
					+ status
					+ "expressed genes found with limma for every combination of EFVs on "
					+ microarrayData.experimentFactors.get(i) + " (dexp="
					+ elevel + ", p-val=10e-" + pvalue;
			if (!bh)
				desc[i] += ")";
			else
				desc[i] += " (BH corrected))";
			if (description != null && description.length() > 0)
				desc[i] = description;
		}
		exp = r.eval("lr=lapply(degs, function(x){x$deg})");
		exp = r.eval("ln=lapply(degs, function(x){x$names})");
		exp = r.eval("writeBiclusterResultsFromListArray(\""
				+ outFile
				+ "\", lr, listArrayColumns=NA, listArrayNames=ln, descriptions="
				+ RUtils.getRList(desc) + ")");

		return outFile;
	}

	/**
	 * Builds a network that links nodes with a correlation lower than a given
	 * threshold
	 * 
	 * @param sdThreshold
	 * @param distanceMethod
	 *            - method used to compute the correlation ("euclidean", etc)
	 * @param distanceThreshold
	 * @param outFile
	 *            - file where the resulting network is to be written. If an
	 *            empty string, a random name with .tmp extension is given to
	 *            the file
	 * @return
	 */
	public String buildCorrelationNetwork(double sdThreshold,
			String distanceMethod, double distanceThreshold, String outFile) {
		String m = microarrayData.rMatrixName;
		if (!matrixLoaded)
			loadMatrix(m);

		if (outFile.length() == 0) // tempfile
		{
			outFile = "correlationNetwork" + (int) (100000 * Math.random())
					+ ".tmp";
		} else {
			if (!outFile.contains(".")) // automatic name
			{
				outFile = outFile.replace("\\", "/");
				if (!outFile.endsWith("\\") && !outFile.endsWith("/"))
					outFile = outFile.concat("/");
				outFile = outFile.concat(".gml");
			}
		}

		exp = r.eval("source(\"es/usal/bicoverlapper/source/codeR/buildNetwork.R\")");
		System.out.println("buildCorrelationNetwork0(gmlFile=\"" + outFile
				+ "\", " + "mat=exprs(" + m + "), distanceMethod=\""
				+ distanceMethod + "\", deviationThreshold=" + sdThreshold
				+ ", distanceThreshold=" + distanceThreshold + ")");

		exp = r.eval("buildCorrelationNetwork0(gmlFile=\"" + outFile + "\", "
				+ "mat=exprs(" + m + "), distanceMethod=\"" + distanceMethod
				+ "\", deviationThreshold=" + sdThreshold
				+ ", distanceThreshold=" + distanceThreshold + ")");

		if (exp == null) {
			System.err.println("buildCorrelationNetwork: Error");
			JOptionPane.showMessageDialog(null,
					"An error occurred while building the correlation network",
					"Error", JOptionPane.ERROR_MESSAGE);
			return null;
		} else if (exp.asString() != null && exp.asString().startsWith("Error")) {
			System.err.println("buildCorrelationNetwork: " + exp.asString());
			JOptionPane.showMessageDialog(null, exp.asString(), "Error",
					JOptionPane.ERROR_MESSAGE);
			return null;
		}
		return outFile;
	}

	/**
	 * Performs Gene Set Enrichment Analysis via BioConductor package GSEAlm
	 * 
	 * @param filterCutoff
	 *            Percentage of genes with low differential expression that
	 *            should be discarded for the analysis
	 * @param minGenesInGS
	 *            Minimum number of genes in the epxression matrix that should
	 *            be in the GeneSet in order to consider it
	 * @param type
	 *            Type of gene set. By now, only "GO" and "KEGG" are allowed.
	 *            Soon "PubMed" also
	 * @param sd
	 *            Only the gene sets with a difference of p-values between the
	 *            two compared conditions above the mean plus this number times
	 *            the standard deviation will be returned
	 * @param ef
	 *            Experimental Factor for which the enrichment is computed
	 * @param efv1
	 *            One of the experimental factor values for the enrichment
	 * @param efv2
	 *            The other experimental factor value for the enrichment
	 * @param outFile
	 *            Path to the file where the results will be stored
	 * @return
	 */
	public String gsea(double filterCutoff, int minGenesInGS, String type,
			double sdThreshold, String ef, String efv1, String efv2,
			String outFile, String description) {
		String m = this.microarrayData.rMatrixName;
		if (!matrixLoaded)
			loadMatrix(m);
		
		if(loadBioconductorLibrary("GSEAlm")==-1)	{System.err.println("package GSEAlm not installed in R"); return "";}
		if(type.equals("PATH"))		if(loadBioconductorLibrary("KEGG.db")==-1)	{System.err.println("required package KEGG.db not installed in R"); return "";}
			
		if(getMicroarrayData().isBioMaRt)
			{
			System.err.println("GSEA Error: biomart ids not supported");
			JOptionPane.showMessageDialog(null,
					"GSEA does not support biomaRt ids, only platforms corresponding to BioConductor annotation packages are supported (e.g. hgu133av2.db)", "Error",
					JOptionPane.ERROR_MESSAGE);
			return null;
			}
	
		if(r.eval("length(grep(\"^"+efv1+"$\", "+RUtils.getRList(microarrayData.getExperimentFactorValues(ef))+"))").asInt()<=1 ||
				r.eval("length(grep(\"^"+efv2+"$\", "+RUtils.getRList(microarrayData.getExperimentFactorValues(ef))+"))").asInt()<=1)
			{
			System.err.println("Error, not enough replicates of "+efv1+" or"+ efv2);
			JOptionPane.showMessageDialog(null, "GSEA cannot be performed. Experimental factors must have two or more replicates.", "Error", JOptionPane.ERROR_MESSAGE);
			return null;
			}
	
		if (outFile.length() == 0) // tempfile
		{
			outFile = "gsea" + (int) (100000 * Math.random()) + ".tmp";
		} else {
			if (!outFile.contains(".")) // automatic name
			{
				outFile = outFile.replace("\\", "/");
				if (!outFile.endsWith("\\") && !outFile.endsWith("/"))
					outFile = outFile.concat("/");
				outFile = outFile.concat(".bic");
			}
		}
	

		exp = r.eval("source(\"es/usal/bicoverlapper/source/codeR/getGeneSet.R\")");
		exp = r.eval("source(\"es/usal/bicoverlapper/source/codeR/GSEA.R\")");
		exp = r.eval("en=" + getMicroarrayData().chip + type);
		exp = r.eval("ret=gsea(eset=" + m + ", filterCutoff=" + filterCutoff
				/ 100 + ", envir=en, type=\"" + type
				+ "\", model=~as.factor(FactorValue." + ef + "), ef=" + m
				+ "$FactorValue." + ef + ", efv1=\"" + efv1 + "\", efv2=\""
				+ efv2 + "\", sdThreshold=" + sdThreshold + ", outputPath=\""
				+ outFile + "\")");

		if (exp != null && exp.asString() != null
				&& exp.asString().startsWith("Error")) {
			System.err.println("GSEA: " + exp.asString());
			JOptionPane.showMessageDialog(null, exp.asString(), "Error",
					JOptionPane.ERROR_MESSAGE);
			return null;
		} else if (exp == null) {
			System.err.println("GSEA: Error");
			JOptionPane.showMessageDialog(null,
					"An error occurred while computing GSEA", "Error",
					JOptionPane.ERROR_MESSAGE);
			return null;
		}

		// Write results
		String groups = "gene sets";
		if (type.equals("GO"))
			groups = "GO terms";
		if (type.equals("PATH"))
			groups = "KEGG pathways";
		String desc = "Differentially enriched " + groups
				+ " found with GSEAlm for " + efv1 + " respect to " + efv2
				+ " (min number of genes in the set=" + minGenesInGS
				+ ", only sets above " + sdThreshold
				+ " stdevs from the average difference in p-values)";
		if (description != null && description.length() > 0)
			desc = description;
		exp = r.eval("writeBiclusterResultsFromList(\""
				+ outFile
				+ "\", ret, NA, bicNames=names(ret), biclusteringDescription=\""
				+ desc + "\")");
		
		return outFile;
	}

	/**
	 * Performs Gene Set Enrichment Analysis via BioConductor package GSEAlm
	 * 
	 * @param filterCutoff
	 *            Percentage of genes with low differential expression that
	 *            should be discarded for the analysis
	 * @param minGenesInGS
	 *            Minimum number of genes in the epxression matrix that should
	 *            be in the GeneSet in order to consider it
	 * @param type
	 *            Type of gene set. By now, only "GO" and "KEGG" are allowed.
	 *            Soon "PubMed" also
	 * @param sd
	 *            Only the gene sets with a difference of p-values between the
	 *            two compared conditions above the mean plus this number times
	 *            the standard deviation will be returned
	 * @param ef
	 *            Experimental Factor for which the enrichment is computed
	 * @param efv1
	 *            One of the experimental factor values for the enrichment
	 * @param efv2
	 *            The other experimental factor value for the enrichment
	 * @param outFile
	 *            Path to the file where the results will be stored
	 * @return
	 */
	public String gseaEF(double filterCutoff, double minGenesInGS, String type,
			double sdThreshold, String ef, String efv, String outFile,
			String description) {
		String m = this.microarrayData.rMatrixName;
		if (!matrixLoaded)
			loadMatrix(m);
		if(loadBioconductorLibrary("GSEAlm")==-1)	{System.err.println("package GSEAlm not installed in R"); return "";}
		if(type.equals("PATH"))		if(loadBioconductorLibrary("KEGG.db")==-1)	{System.err.println("required package KEGG.db not installed in R"); return "";}
		
		if(getMicroarrayData().isBioMaRt)
			{
			System.err.println("GSEA Error: biomart ids not supported");
			JOptionPane.showMessageDialog(null,
					"GSEA does not support biomaRt ids, only platforms corresponding to BioConductor annotation packages are supported (e.g. hgu133av2.db)", "Error",
					JOptionPane.ERROR_MESSAGE);
			return null;
			}
		if (outFile.length() == 0) // tempfile
		{
			outFile = "gsea" + (int) (100000 * Math.random()) + ".tmp";
		} else {
			if (!outFile.contains(".")) // automatic name
			{
				outFile = outFile.replace("\\", "/");
				if (!outFile.endsWith("\\") && !outFile.endsWith("/"))
					outFile = outFile.concat("/");
				outFile = outFile.concat(".bic");
			}
		}

		exp = r.eval("source(\"es/usal/bicoverlapper/source/codeR/getGeneSet.R\")");
		exp = r.eval("source(\"es/usal/bicoverlapper/source/codeR/GSEA.R\")");
		
		
		
		exp = r.eval("en=" + getMicroarrayData().chip + type);
		exp = r.eval("ret=gseaEF(" + m + ", filterCutoff=" + filterCutoff / 100
				+ ", envir=en, model=~as.factor(FactorValue." + ef + "), ef="
				+ m + "$FactorValue." + ef + ", efv=\"" + efv + "\", type=\""
				+ type + "\", sdThreshold=" + sdThreshold + ", outputPath=\""
				+ outFile + "\")");

		if (exp != null && exp.asString() != null
				&& exp.asString().startsWith("Error")) {
			System.err.println("GSEA: " + exp.asString());
			JOptionPane.showMessageDialog(null, exp.asString(), "Error",
					JOptionPane.ERROR_MESSAGE);
			return null;
		} else if (exp == null) {
			System.err.println("GSEA: Error");
			JOptionPane.showMessageDialog(null,
					"An error occurred while computingGSEA", "Error",
					JOptionPane.ERROR_MESSAGE);
			return null;
		}

		// Write results
		String groups = "gene sets";
		if (type.equals("GO"))
			groups = "GO terms";
		if (type.equals("PATH"))
			groups = "KEGG pathways";
		String desc1 = "Differentially enriched " + groups
				+ " found with GSEAlm for";
		String desc2 = "on " + ef + " (min number of genes in the set="
				+ minGenesInGS + ", only sets above " + sdThreshold
				+ " stdevs from the average difference in p-values)";
		exp = r.eval("labels=paste(\"" + desc1 + "\",ret$names,\"" + desc2
				+ "\")");
		exp = r.eval("ln=lapply(ret$degs, function(x){names(x)})");
		exp = r.eval("writeBiclusterResultsFromListArray(fileName=\""
				+ outFile
				+ "\", listArrayRows=ret$degs, listArrayNames=ln, descriptions=labels)");
		return outFile;
	}

	/**
	 * Performs Gene Set Enrichment Analysis via BioConductor package GSEAlm, in
	 * this case, it compares every two consecutive efvs on a given ef, which is
	 * quite useful for example in the case of time series
	 * 
	 * @param filterCutoff
	 *            Percentage of genes with low differential expression that
	 *            should be discarded for the analysis
	 * @param minGenesInGS
	 *            Minimum number of genes in the epxression matrix that should
	 *            be in the GeneSet in order to consider it
	 * @param type
	 *            Type of gene set. By now, only "GO" and "KEGG" are allowed.
	 *            Soon "PubMed" also
	 * @param sd
	 *            Only the gene sets with a difference of p-values between the
	 *            two compared conditions above the mean plus this number times
	 *            the standard deviation will be returned
	 * @param ef
	 *            Experimental Factor for which the enrichment is computed
	 * @param outFile
	 *            Path to the file where the results will be stored
	 * @return
	 */
	public String gseaProg(double filterCutoff, double minGenesInGS,
			String type, double sdThreshold, String ef, String outFile,
			String description) {
		String m = microarrayData.rMatrixName;
		if (!matrixLoaded)
			loadMatrix(m);
		if(loadBioconductorLibrary("GSEAlm")==-1)	{System.err.println("package GSEAlm not installed in R"); return "";}
		if(type.equals("PATH"))		if(loadBioconductorLibrary("KEGG.db")==-1)	{System.err.println("required package KEGG.db not installed in R"); return "";}
		

		if(getMicroarrayData().isBioMaRt)
			{
			System.err.println("GSEA Error: biomart ids not supported");
			JOptionPane.showMessageDialog(null,
					"GSEA does not support biomaRt ids, only platforms corresponding to BioConductor annotation packages are supported (e.g. hgu133av2.db)", "Error",
					JOptionPane.ERROR_MESSAGE);
			return null;
			}
		
		if (outFile.length() == 0) // tempfile
		{
			outFile = "gsea" + (int) (100000 * Math.random()) + ".tmp";
		} else {
			if (!outFile.contains(".")) // automatic name
			{
				outFile = outFile.replace("\\", "/");
				if (!outFile.endsWith("\\") && !outFile.endsWith("/"))
					outFile = outFile.concat("/");
				outFile = outFile.concat(".bic");
			}
		}

		exp = r.eval("source(\"es/usal/bicoverlapper/source/codeR/getGeneSet.R\")");
		exp = r.eval("source(\"es/usal/bicoverlapper/source/codeR/GSEA.R\")");
		
		int reps=0;
		for(String e:microarrayData.getExperimentFactorValues(ef))
			{
			if(r.eval("length(grep(\"^"+e+"$\", "+RUtils.getRList(microarrayData.getExperimentFactorValues(ef))+"))").asInt()>1)
				reps++;
			}
		if(reps<2)
			{
			System.err.println("Error, not enough replicates of the values of "+ef);
			JOptionPane.showMessageDialog(null, "There are no replicates for the factor values of "+ef+". Please select an experimental factor with replicates.", "Error", JOptionPane.ERROR_MESSAGE);
			return null;
			}
		
		exp = r.eval("en=" + getMicroarrayData().chip + type);		//This won't work in the case of biomaRt!
		exp = r.eval("ret=gseaProg(" + m + ", filterCutoff=" + filterCutoff/ 100 + ", envir=en, model=~as.factor(FactorValue." + ef	+ "), ef=" + m + "$FactorValue." + ef + ", type=\"" + type+ "\", sdThreshold=" + sdThreshold + ", outputPath=\""+ outFile + "\")");

		if (exp != null && exp.asString() != null
				&& exp.asString().startsWith("Error")) {
			System.err.println("GSEA: " + exp.asString());
			JOptionPane.showMessageDialog(null, exp.asString(), "Error",
					JOptionPane.ERROR_MESSAGE);
			return null;
		} else if (exp == null) {
			System.err.println("GSEA: Error");
			JOptionPane.showMessageDialog(null,
					"An error occurred while computingGSEA", "Error",
					JOptionPane.ERROR_MESSAGE);
			return null;
		}

		// Write results
		String groups = "gene sets";
		if (type.equals("GO"))
			groups = "GO terms";
		if (type.equals("PATH"))
			groups = "KEGG pathways";
		String desc1 = "Differentially enriched " + groups
				+ " found with GSEAlm for";
		String desc2 = "between consecutive values on " + ef
				+ " (min number of genes in the set=" + minGenesInGS
				+ ", only sets above " + sdThreshold
				+ " stdevs from the average difference in p-values)";
		exp = r.eval("labels=paste(\"" + desc1 + "\",ret$names,\"" + desc2
				+ "\")");
		exp = r.eval("ln=lapply(ret$degs, function(x){names(x)})");
		exp = r.eval("writeBiclusterResultsFromListArray(fileName=\""
				+ outFile
				+ "\", listArrayRows=ret$degs, listArrayNames=ln, descriptions=labels)");

		return outFile;
	}

	public ExpressionData getMicroarrayData() {
		return microarrayData;
	}

	public void setMicroarrayData(ExpressionData md) {
		this.microarrayData = md;
		// loadMatrix(microarrayData.rMatrixName);//TODO: By now, this means we
		// have two copies of the matrix, one in MicroarrayData class and
		// another one in R ExpressionSet eset. This is highly memory
		// innefficient...
	}

	/**
	 * @return the matrixLoaded
	 */
	public boolean isMatrixLoaded() {
		return matrixLoaded;
	}
	
	

public class TopGOTask extends
	SwingWorker<ArrayList<GOTerm>, Void>// implements Runnable
	{
	public ArrayList<String> genes;
	public String ontology = "";
	public double alpha=0.01;
	
	public ArrayList<GOTerm> golist = null;
	public String message = "";
	public String errorMessage = "";
	private int progress;
	
	public TopGOTask(ArrayList<String> genes, String ontology, double alpha) 
		{
		this.genes = genes;
		this.ontology = ontology;
		this.alpha=alpha;
		golist = new ArrayList<GOTerm>();
		}
	
	@Override
	public ArrayList<GOTerm> doInBackground() 
		{
		try {
			golist = goEnrichment(alpha, ontology,  genes);
			progress = 100;
			setProgress(progress);
			done();
			}
		catch (Exception e) {
			progress = 100;
			setProgress(progress);
			done();
			JOptionPane.showMessageDialog(
					null,
					"Error performing the enrichemnt analysis: "
							+ e.getMessage() + "\n" + errorMessage,
					"Analysis Error", JOptionPane.ERROR_MESSAGE);
			}
		
		return golist;
		}
	}


}
