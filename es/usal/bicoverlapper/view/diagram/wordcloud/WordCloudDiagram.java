package es.usal.bicoverlapper.view.diagram.wordcloud;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.Rectangle2D;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import es.usal.bicoverlapper.controller.analysis.Analysis;
import es.usal.bicoverlapper.controller.analysis.AnalysisProgressMonitor;
import es.usal.bicoverlapper.controller.kernel.Selection;
import es.usal.bicoverlapper.controller.kernel.Session;
import es.usal.bicoverlapper.controller.manager.configurationManager.ConfigurationMenuManager;
import es.usal.bicoverlapper.controller.util.ArrayUtils;
import es.usal.bicoverlapper.controller.util.Translator;
import es.usal.bicoverlapper.model.annotations.GOTerm;
import es.usal.bicoverlapper.model.gene.GeneAnnotation;
import es.usal.bicoverlapper.model.gene.GeneRequester;
import es.usal.bicoverlapper.view.configuration.panel.WordCloudParameterConfigurationPanel;
import es.usal.bicoverlapper.view.diagram.Diagram;
import es.usal.bicoverlapper.view.diagram.parallelCoordinates.ParallelCoordinatesDiagram;

public class WordCloudDiagram extends Diagram implements ChangeListener,
		MouseListener, GeneRequester {
	private static final long serialVersionUID = 1L;

	// atributos del panel del diagrama
	private Session sesion;
	private boolean atributosIniciados = false, configurando = false,
			diagramaPintado = false;

	// definicion de margenes del diagrama
	private float zoom = (float) 100;
	private final int margenDer = 40;
	private final int margenIzq = 40;
	private final int margenSup = 25;
	private final int margenInf = 40;
	private final int margenDiagrama = 10; // porcentaje de exceso en intervalo
											// de representacion del diagrama

	// configuracion de color
	private static final int colorEtiquetaVar = 0;
	private static final int colorVarSelec = 1;
	private static final int colorFondo = 2;
	private Color[] paleta = { Color.BLUE, Color.RED, Color.WHITE };
	private String[] textoLabel = { "Word", "Selected word", "Background" };
	private JTextField[] muestraColor = new JTextField[paleta.length];

	private List<GOTerm> got = null;
	private ArrayList<GeneAnnotation> annot = null;
	private boolean textChanged = false; // to not repeat hypergeometric tests
											// and other R calls
	private boolean innerCall = false;// to differentiate updates from combo
										// boxes from internal updates

	// Atributos propios de la clase --------------------
	private float maxFontSize = (float) 400;
	private float minFontSize = (float) 1.5;
	private double maxCont = 0;
	private int contChar = 0;
	private int maxWord = 0;
	private double Y = 0;
	private double X = 0;
	private int maxChar = 0;
	private String nameC = WordCloudParameterConfigurationPanel.GO_TERMS;
	private ArrayList<String> nameSelected;
	// private Color colorNameSelected;
	private WordCloudParameterConfigurationPanel menuCloud = null;

	private TreeMap<String, Word> words;
	private boolean newSelection = true;

	private int contWord;

	private int contZoom = 0;
	private boolean Ajusta = true;
	private boolean Enought = true;
	private List<String> sortedWords = null;

	private boolean doNOTupdate = false;

	private JLabel progress;

	private boolean waitingEnrichment;

	public WordCloudDiagram(Session sesion, Dimension dim) {
		super(new BorderLayout());//
		int num = sesion.getNumWordClouds();
		this.setName("Keyword Cloud " + num);
		this.sesion = sesion;
		int alto = (int) dim.getHeight();
		int ancho = (int) dim.getWidth();
		this.setLayout(null);
		this.setPreferredSize(new Dimension(ancho, alto));
		this.setSize(ancho, alto);
		// menuCloud=new MenuPanel();

		menuCloud = new WordCloudParameterConfigurationPanel(this);
		progress = new JLabel("");
		progress.setForeground(Color.LIGHT_GRAY);
		progress.setFont(new Font("Arial", Font.PLAIN, 10));
		progress.setBounds(this.getWidth() - 32, this.getHeight() - 12, 30, 10);

		paleta[WordCloudDiagram.colorEtiquetaVar] = sesion.getSelectionColor().darker();
		paleta[WordCloudDiagram.colorVarSelec] = sesion.getSelectionColor().darker();
		paleta[WordCloudDiagram.colorFondo] = sesion.getBackgroundColor();
		this.colorSeleccion = paleta[colorEtiquetaVar];
		this.setBackground(paleta[colorFondo]);

		this.add(progress);
		this.addMouseListener(this);
		nameSelected = new ArrayList<String>();
		Ajusta = true;

		words = new TreeMap<String, Word>();
		update();
	}

	public WordCloudParameterConfigurationPanel getMenuCloud() {
		return menuCloud;
	}

	public void setMenuCloud(WordCloudParameterConfigurationPanel menuCloud) {
		this.menuCloud = menuCloud;
	}

	public synchronized void update() {
		/*
		 * Changes color to the terms that are related to the hovered gene (only
		 * if <200 genes are selected)
		 */
		if (sesion.isOnlyHover())
			return;
		if (sesion.getSelectedBicluster()==null || sesion.getSelectedGenesBicluster()==null || sesion.getSelectedGenesBicluster().size()==0 || sesion.isTooManyGenes()) {
			if (this.getGraphics() != null)
				this.paintComponent(this.getGraphics());
			return;
		} 
		
		
		
		
		if(getGraphics()!=null)
			{
			drawFondo((Graphics2D)this.getGraphics());
			drawText((Graphics2D)this.getGraphics(), "Compiling annotations...");
			}
			
	
		contZoom = 0;
		maxChar = 0;
		contChar = 0;
		maxWord = 0;
		contWord = 0;
		maxCont = 0;
		Ajusta = true;
		Enought = true;

		words.clear();

		if (innerCall == false) {
			got = null;
			annot = null;
			textChanged = true;
		}

		boolean reqSearch = true;

		boolean annotOK = sesion.getMicroarrayData().checkAnnotations(
				sesion.getSelectedGenesBicluster());
		if (annotOK) {
			annot = sesion.getMicroarrayData().getGeneAnnotations(
					sesion.getSelectedGenesBicluster());
		}

		if (annotOK && menuCloud.text.getSelectedIndex() == WordCloudParameterConfigurationPanel.DEFINITION)
			reqSearch = false;
		
		boolean gotOK = sesion.getMicroarrayData().checkGOAnnotations(
				sesion.getSelectedGenesBicluster());
		
		if (annotOK
				&& gotOK
				&& menuCloud.text.getSelectedIndex() == WordCloudParameterConfigurationPanel.GO_TERM
				&& menuCloud.size.getSelectedIndex() != WordCloudParameterConfigurationPanel.PVALUES) {
			got = sesion.getMicroarrayData().getGOTermsCount(
					sesion.getSelectedGenesBicluster());
			reqSearch = false;
		}

		//The annotations are not present, search for them
//		if (reqSearch && (!innerCall || annot == null || (got == null && menuCloud.size.getSelectedIndex() == WordCloudParameterConfigurationPanel.PVALUES))) 
		if (reqSearch && (!innerCall || annot == null || got == null || menuCloud.size.getSelectedIndex() == WordCloudParameterConfigurationPanel.PVALUES)) 
			{
			Point p = new Point(0, 0);
			if (this.getParent() != null)
				p = this.sesion.getDiagramWindow(this.getName())
						.getLocation();
			
			//Search+hypergeometric test
			if (menuCloud.size.getSelectedIndex() == WordCloudParameterConfigurationPanel.PVALUES) 
				{
				String ont = "";
				switch (menuCloud.ontology.getSelectedIndex()) 
					{
					case (WordCloudParameterConfigurationPanel.ALL):
						doNOTupdate = true;
						menuCloud.ontology
								.setSelectedIndex(WordCloudParameterConfigurationPanel.BP);// NOTA:
					case (WordCloudParameterConfigurationPanel.BP):
						ont = "BP";
						break;
					case (WordCloudParameterConfigurationPanel.MF):
						ont = "MF";
						break;
					case (WordCloudParameterConfigurationPanel.CC):
						ont = "CC";
						break;
					}
				if (this.sesion.getMicroarrayData().isBioMaRt) 
					{
					System.out
								.println("No annotation package especified, trying with "
										+ sesion.getMicroarrayData()
												.getAnnotationPackage());
					sesion.getAnalysis().loadBioconductorLibrary(
								sesion.getMicroarrayData()
										.getAnnotationPackage());
					}
				
				waitingEnrichment=true;
				//----- VIA GOSTATS
				//this.sesion.getMicroarrayData().getGOTermsHypergeometric(sesion.getSelectedGenesBicluster(), this, p, ont);
				
				//----- VIA TOPGO
				//TODO: continue from here on -- trying pvals from topGO (faster? --> after the initial load)
				final long t=System.currentTimeMillis();
				this.sesion.getMicroarrayData().getTopGOEnrichment(sesion.getSelectedGenesBicluster(), this, p, ont, sesion.getAnalysis());
				//ArrayList<GOTerm> table=sesion.getAnalysis().goEnrichment(0.01,"BP", sesion.getMicroarrayData().getGeneNames(sesion.getSelectedBicluster().getGenes()));
				//receiveGOTerms(table);
				//ArrayList<GOTerm> table=sesion.getAnalysis().goEnrichment(0.01,"BP", sesion.getMicroarrayData().getGeneNames(sesion.getSelectedBicluster().getGenes()));
				System.out.println("Time in enrichment: "+(System.currentTimeMillis()-t));
				}
			//Just search for annotations
			else {
				switch (menuCloud.text.getSelectedIndex()) 
					{
					case (WordCloudParameterConfigurationPanel.GO_TERM):
						this.sesion
								.getMicroarrayData()
								.retrieveGeneAnnotations(
										ArrayUtils.toIntArray(sesion
												.getSelectedGenesBicluster()),
										this, true, progress, null, true, false);
						break;
					case (WordCloudParameterConfigurationPanel.DEFINITION):
						this.sesion.getMicroarrayData()
								.retrieveGeneAnnotations(
										ArrayUtils.toIntArray(sesion
												.getSelectedGenesBicluster()),
										this, true, progress, null, false,
										false);
						break;
					case (WordCloudParameterConfigurationPanel.KEGG_PATH):
						this.sesion
								.getMicroarrayData()
								.retrieveGeneAnnotations(
										ArrayUtils.toIntArray(sesion
												.getSelectedGenesBicluster()),
										this, true, progress, null, false, true);
						break;
					default:
						break;
					}
				}

			return;
			}
		//The annotations are present, no need to search for them
		else {
			addWords();
			}
	}

	private void addWords() {
		long t1 = System.currentTimeMillis();
		int cont = 0;
		if (annot == null || annot.size() == 0) {
			System.err.println("WordCloudDiagram: addWords no annotations found");
			return;
		}

		switch (this.menuCloud.text.getSelectedIndex()) {
		case WordCloudParameterConfigurationPanel.GO_TERM:// ----------------------------------------------
			switch (this.menuCloud.size.getSelectedIndex()) {
			case WordCloudParameterConfigurationPanel.GENES:
				cont = 0;
				for (GeneAnnotation a : annot) {
					ArrayList<String> added = new ArrayList<String>();
					if (a.getGoTerms() != null) {
						if (a.getGoTerms().size() > 0)
							cont++;
						for (GOTerm go : a.getGoTerms()) {
							if (go != null) {
								boolean add = true;
								switch (menuCloud.ontology.getSelectedIndex()) {
								case WordCloudParameterConfigurationPanel.BP:
									if (!go.getOntology().equals("BP"))
										add = false;
									break;
								case WordCloudParameterConfigurationPanel.CC:
									if (!go.getOntology().equals("CC"))
										add = false;
									break;
								case WordCloudParameterConfigurationPanel.MF:
									if (!go.getOntology().equals("MF"))
										add = false;
									break;
								}
								if (add) {
									String desc = go.getTerm();
								//	if(desc.contains("small GTPase"))
									//	System.out.println("Adding desc "+desc);
									if (!added.contains(desc)) {
										splitAndAdd(desc, 1, 1,
												this.colorSeleccion, true,
												added);
										added.add(desc);
									}
								}
							}
						}
					}
				}

				break;
			case WordCloudParameterConfigurationPanel.OCCURRENCES:
				for (GeneAnnotation a : annot) {
					if (a.getGoTerms() != null) {
						for (GOTerm go : a.getGoTerms()) {
							if (go != null) {
								boolean add = true;
								switch (menuCloud.ontology.getSelectedIndex()) {
								case WordCloudParameterConfigurationPanel.BP:
									if (!go.getOntology().equals("BP"))
										add = false;
									break;
								case WordCloudParameterConfigurationPanel.CC:
									if (!go.getOntology().equals("CC"))
										add = false;
									break;
								case WordCloudParameterConfigurationPanel.MF:
									if (!go.getOntology().equals("MF"))
										add = false;
									break;
								}
								if (add) {
									String desc = go.getTerm();
									int oc = go.occurences;
									splitAndAdd(desc, oc, oc,
											this.colorSeleccion, false, null);
								}
							}
						}
					}
				}
				break;

			case WordCloudParameterConfigurationPanel.PVALUES:
				cont = 0;
				for (GeneAnnotation a : annot)
					if (a.getGoTerms() != null && a.getGoTerms().size() > 0)
						cont++;

				for (GOTerm go : got) {
					if (go != null) {
						String desc = go.getTerm();
						double size = Math.abs(Math.log10(go.getPvalue()));
						splitAndAdd(desc, go.getPvalue(), size,
								this.colorSeleccion, false, null);
					}
				}
				break;
			}
			break;
		case WordCloudParameterConfigurationPanel.DEFINITION:// ---------------------------------------------
		default:
			cont = 0;
			for (int i = 0; i < annot.size(); i++) {
				GeneAnnotation ga = annot.get(i);
				if (ga != null) {
					if (ga.getDescription() != null) {
						if (ga.getDescription().length() > 0)
							cont++;
						String desc = ga.getDescription();
						int oc = 1;
						switch (this.menuCloud.size.getSelectedIndex()) {
						case WordCloudParameterConfigurationPanel.OCCURRENCES:
							splitAndAdd(desc, oc, oc, this.colorSeleccion,
									false, null);
							break;
						case WordCloudParameterConfigurationPanel.GENES:
						default:
							splitAndAdd(desc, oc, oc, this.colorSeleccion,
									true, null);
							break;
						}
					}
				}
			}
			break;
		}

		System.out.println("Time in adding the words: "
				+ (System.currentTimeMillis() - t1) / 1000.0 + " s");

		synchronized (this) {
			textChanged = true;
			t1 = System.currentTimeMillis();
			menuCloud.setVisible(true);
			menuCloud.repaint();
			System.out.println("Time in painting: "
					+ (System.currentTimeMillis() - t1) / 1000.0 + " s");
			
			innerCall = false;
			if (cont >= 0
					&& cont <= sesion.getSelectedBicluster().getGenes().size()) {
				System.out.println(cont + "/"
						+ sesion.getSelectedBicluster().getGenes().size());
				progress.setText(cont + "/"
						+ sesion.getSelectedBicluster().getGenes().size());
				progress.setToolTipText("Annotations retrieved for " + cont
						+ " of the "
						+ sesion.getSelectedBicluster().getGenes().size()
						+ " selected genes");
			}
		}

	}

	public synchronized void receiveGOTerms(ArrayList<GOTerm> goterms) {
		System.out.println("receiveGOTerms");
		this.got = goterms;
		waitingEnrichment=false;
		
		if (got == null)
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
			
				JOptionPane.showMessageDialog(null,
						"ERROR: enrichemnt test could not be completed",
						"Error", JOptionPane.ERROR_MESSAGE);
				}});
		
		if (got.size() == 0)
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
			
				JOptionPane.showMessageDialog(null,
						"No relevant GO terms on hypergeometric test for onthology: "
								+ (String) (menuCloud.ontology.getSelectedItem()),
						"Warning", JOptionPane.WARNING_MESSAGE);
				}});
		
		addWords();
	}

	public synchronized void receiveGeneAnnotations(
			ArrayList<GeneAnnotation> annot) {
		System.out.println("\n\nen el geneRequester.receiveGeneAnnotations de WORD CLOUD\n\n");
		waitingEnrichment=false;
		if (doNOTupdate) {
			doNOTupdate = false;
			try {
				synchronized (sesion.getMicroarrayData().getGeneAnnotations()) 
					{
					sesion.getMicroarrayData().getGeneAnnotations().notify();
					}
				} catch (Exception ex) {
					ex.printStackTrace();
					return;
					}
			return;
		}
		this.annot = annot;
		addWords();
	}

	/**
	 * Separates the text desc in words (use blank space as separator), and adds
	 * each word with color c. Usually oc is 1, but if greater, it counts each
	 * word as this number of occurences. Finally, if unique is true, it adds
	 * each word just one, even if it appears several times.
	 * 
	 * @param desc
	 * @param oc
	 * @param c
	 * @param unique
	 */
	private void splitAndAdd(String desc, double value, double size, Color c,
			boolean unique, ArrayList<String> alreadyAdded) {
		ArrayList<String> added = new ArrayList<String>();
		if (alreadyAdded != null)
			added = alreadyAdded;
		// 1) split and format
		String[] dw = splitterAndFormat(desc);
		// 2) add
		for (int j = 0; j < dw.length; j++) {
			if (!unique || !added.contains(dw[j]))
				addWord(dw[j], value, size, c);
			if(!added.contains(dw[j]))	added.add(dw[j]);
		}

		return;
	}

	/**
	 * As splitter, but it also makes some visualization formatting (remove
	 * parenthesis, add final space)
	 * 
	 * @param desc
	 * @return
	 */
	private String[] splitterAndFormat(String desc) {
		String[] dw = splitter(desc);
		for (int j = 0; j < dw.length; j++) {
			dw[j] = dw[j].replace("(", "").replace(")", "").trim();
			// .toLowerCase();
			dw[j] = dw[j] + " ";
		}
		return dw;
	}

	/**
	 * Splits the word depending on the configurated options
	 * 
	 * @param desc
	 * @return
	 */
	private String[] splitter(String desc) {
		String[] dw = null;
		ArrayList<String> added = new ArrayList<String>();
		switch (this.menuCloud.split.getSelectedIndex()) {
		case 0:// 1-word
			return desc.split(" ");
		case 1:// 2-word
			dw = desc.split(" ");
			for (int j = 0; j < dw.length; j++) {
				if (j < dw.length - 1) {
					String diword = (dw[j] + " " + dw[j + 1]).trim();
					added.add(diword);
				}
			}
			return added.toArray(new String[added.size()]);
		case 2:// complete
			return new String[] { desc };
		}
		return null;
	}

	private void addWord(String w, double value, double size, Color colorW) {
		if (!valid(w))
			return;
		if (words != null && words.containsKey(w)) {
			Word nW = (Word) words.get(w);
			// colorW=getColorW(w);
			nW.setCont(nW.size + size);
			if (nW.size > maxCont)
				maxCont = nW.size;
		} else {
			// colorW=getColorW(w);
			words.put(w, new Word(null, 0, 0, value, size, colorW));
			contChar += w.length();
			contWord += size;
		}
		maxWord += size;
		maxChar += w.length();
	}

	private boolean valid(String w) {
		if (w.length() < 2)
			return false;
		if (w.length() > 4)
			return true;
		if (w.equals("of") || w.equals("in") || w.equals("the")
				|| w.equals("and"))
			return false;
		if (w.equals("or") || w.equals("on") || w.equals("at")
				|| w.equals("for"))
			return false;
		if (w.equals("is") || w.equals("as") || w.equals("an")
				|| w.equals("to"))
			return false;
		if (w.equals("with") || w.equals("some") || w.equals("also")
				|| w.equals("that"))
			return false;
		if (w.equals("by") || w.equals("into") || w.equals("from")
				|| w.equals("has"))
			return false;
		if (w.equals("have") || w.equals("be") || w.equals("which")
				|| w.equals("may"))
			return false;
		return true;
	}

	public void create() {
		// add el display o papplet o frame de visualización a la ventana
		// Asociar este panel a la ventana:
		// Opcionalmente, se pueden inicializar aquí los datos del frame, en vez
		// de hacerlo en el constructor
		this.getWindow().setContentPane(this);
		this.getWindow().pack();
	}

	public void run() {
		this.getWindow().setVisible(true); // show the window
		// TODO: Lo necesario para que empiece a correr la visualización (p. ej.
		// en prefuse, los Visualization.run())
	}

	private void drawFondo(Graphics2D g2) {
		g2.setPaint(paleta[colorFondo]);
		Rectangle2D.Double fondo = new Rectangle2D.Double(0, 0,
				this.getWidth(), this.getHeight());
		g2.fill(fondo);
		g2.draw(fondo);
	}

	private float getProportion(String w, int c, int ww, int wh) {
		float hipo, size, cMaxProportion;
		hipo = (float) (Math.sqrt((this.getHeight() * this.getWidth())
				+ ((this.getHeight() - this.menuCloud.getHeight()) * (this
						.getHeight() - this.menuCloud.getHeight()))));
		cMaxProportion = (float) (hipo) / (float) (Math.sqrt(maxChar));
		minFontSize = (float) (((float) contWord / (float) maxWord));// *(float)0.15);//(-0.1)
		maxFontSize = (float) (float) zoom * (float) (cMaxProportion);// *((float)hipo)
		float newMax = (float) maxFontSize;
		float newMin = (float) minFontSize;
		float max = (float) maxCont;
		float min = (float) 1;
		float key = (float) c;
		size = (float) getInterpolation(key, max, min, newMax, newMin);
		return size;
	}

	private float getInterpolation(float key, float maxKey, float minKey,
			float newMax, float newMin) {
		return (float) (key - minKey) * (newMax - newMin + 1)
				/ (maxKey - minKey) + newMin;
	}

	private void drawText(Graphics2D g2, String s) {
		
		drawFondo(g2);
		TextLayout text = new TextLayout(s, g2.getFont(),	g2.getFontRenderContext());
		g2.setPaint(sesion.getForegroundColor());
		g2.drawString(s, (int)(getWidth()*0.5-text.getBounds().getWidth()*0.5), (int) (this.getHeight() * 0.5 - 10));
	}

	public synchronized void drawWords(Graphics2D g2) {
		drawFondo(g2);
		RenderingHints qualityHints = new RenderingHints(null);
		qualityHints.put(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		qualityHints.put(RenderingHints.KEY_RENDERING,
				RenderingHints.VALUE_RENDER_SPEED);
		g2.setRenderingHints(qualityHints);

		//System.out.println("Drawing words");
		Iterator<Word> it = words.values().iterator();
		if (sortedWords != null && sortedWords.size() == words.size())
			for (int i = 0; i < words.size(); i++) 
				{
				Word w = words.get(sortedWords.get(i));
				g2.setPaint(w.getColor());
				((TextLayout) w.getText()).draw(g2, (float) (w.getX()),
						(float) (w.getY()));
				}
		else
			while (it.hasNext()) 
				{
				//System.out.println("dr");
				Word w = it.next();
				if (w.getText() == null)
					return;// Words still not selected/set up
				g2.setPaint(w.getColor());

				((TextLayout) w.getText()).draw(g2, (float) (w.getX()),
						(float) (w.getY()));// +maxAlto
				}

		progress.setBounds(this.getWidth() - progress.getWidth() - 2,
				this.getHeight() - progress.getHeight() - 2, 50, 10);
		//System.out.println("Words drawn");
	}

	public void resize() {
		textChanged = true;
	}

	public String formatNumber(double n) {
		String cad = "";
		int exp = 0;
		while (n * 10 < 1) {
			n = n * 10;
			exp--;
		}
		if (exp < 0)
			cad = Math.round(n * 10) + "e" + (exp - 1);
		else
			cad = "" + (Math.round(n));
		return cad;
	}

	public void setWords(Graphics2D g2) {
		double y = 0;
		double x = 0;
		double altoTexto = 0;
		double anchoTexto = 0;
		double maxAlto = 0;
		double maxAncho = 0;
		double separationSpace = 1.5;

		double posicionXWord, separacionXWord;
		double xMaxima;
		
		//por defecto end está a true porque es posible que no se encuentren palabras a dibujar
		//si no se tiene en cuenta esto se entraría en bucle infinito al incrementar la escala hasta infinito
		//se pondrá end a false cuando se encuentra en "1) Primera vuelta" al menos una palabra
		boolean end = true;
		boolean increase = false;

		if (g2 == null)
			return;
		FontRenderContext frc = g2.getFontRenderContext();

		//System.out.println("Setting words");

		sortedWords = null;

		// 0) Alphabetic sort of words
		if (words != null && words.size() > 0) {
			String[] tal = words.keySet().toArray(new String[0]);
			sortedWords = Arrays.asList(tal);
			Collections.sort(sortedWords);
		}
		if (sortedWords == null)
			{
			textChanged=false;
			super.repaint();
			return;
			}

		//System.out.println("First loop");
		// 1) Primera vuelta, chequeamos el tamaño		
		for (String w : sortedWords) {

			//System.out.println("word = " + w);

			Word nW = words.get(w);
			if (w.length() > 0 && nW != null) {
				
				//al menos se ha encontrado una palabra, así que ya se podrá entrar al bucle que incrementa el tamaño
				end = false;
								
				String wc = "";
				if (this.menuCloud.size.getSelectedIndex() == WordCloudParameterConfigurationPanel.PVALUES)
					wc = w.concat("(" + formatNumber(nW.value) + ") ");
				else
					wc = w.concat("(" + (int) (nW.size) + ") ");
				double num = nW.size;

				Font f = g2.getFont().deriveFont((float) num);
				TextLayout texto = new TextLayout(wc, f, frc);
				altoTexto = texto.getBounds().getHeight();
				anchoTexto = texto.getBounds().getWidth() + separationSpace
						* nW.size;
				// si la palabra es mas ancha que el espacio disponible se pone
				// a la izquierda del todo y se baja una línea
				if (x + anchoTexto > this.getWidth()) {
					x = 0;
					y += maxAlto;
					maxAlto = altoTexto;
				}
				// se actualiza el valor de la altura máxima
				if (maxAlto < altoTexto)
					maxAlto = altoTexto;
				// se actualiza el valor de la anchura máxima
				if (maxAncho < anchoTexto)
					maxAncho = anchoTexto;
				nW.setX(x);
				nW.setY(y);
				nW.setText(texto);

				// se desplaza la coordenada x a la derecha para la siguiente
				// palabra si ello es posible
				if (x + anchoTexto <= this.getWidth())
					x += anchoTexto;

				// Carlos
				// no sé muy bien las consecuencias de esto, porque en principio
				// es que la palabra es demasiado ancha para la ventana...
				// para esto ya se ha introducido el xMaxima
				if (anchoTexto > this.getWidth()) {
					y += altoTexto;
					maxAlto = 0;
				}
			}
		}
		y += maxAlto;// Si no el último salto no se tiene en cuenta.

		// 2) Determinamos el factor de escala
		//System.out.println("2) Determine scale factor");

		double scale = Math.min(this.getHeight() / y, this.getWidth() / maxAncho);
		
		//sólo para probar por qué sale infinity
		double scaleInicial = scale;

		// 3) Segunda vuelta vuelta, con los tamaños adecuados
		// como puede haber saltos de línea por el escalado, lo hacemos en un
		// bucle donde vamos disminuyendo poco a poco la escala
		System.out.println("3) 2nd loop");
		// boolean increaseAnt=increase;
		// boolean first=true;

		// Carlos
		boolean hasDecreased = false;

		maxAncho = 0;

		// 3) Calculamos el tamaño del as palabras
		System.out.println("3) Determine words size");		
		do {
			// en cada vuelta se actualiza la xMaxima
			xMaxima = 0;

			x = 0;
			y = 0;
			ArrayList<Word> wordsInLine = new ArrayList<Word>();
			for (String w : sortedWords) {
				Word nW = words.get(w);

				if (w.length() > 0 && nW != null) {
					String wc = "";
					if (this.menuCloud.size.getSelectedIndex() == WordCloudParameterConfigurationPanel.PVALUES)
						wc = w.concat("(" + formatNumber(nW.value)) + ")";
					else
						wc = w.concat("(" + (int) nW.size + ")");
					double num = nW.size;
					Font f = g2.getFont().deriveFont((float) (num * scale));
					TextLayout texto = new TextLayout(wc, f, frc);

					altoTexto = texto.getBounds().getHeight();
					anchoTexto = texto.getBounds().getWidth() + separationSpace
							* nW.size;

					if (x + anchoTexto > this.getWidth()) // change to next line
					{
						// Sumamos a todas las de la línea anterior el maxAlto
						// de esa línea
						// de esta forma no se intercalarán las alturas y todas
						// las de la línea siguiente empezarán a la misma altura
						for (int k = 0; k < wordsInLine.size(); k++) {
							Word w2 = wordsInLine.get(k);
							w2.setY(w2.getY() + .75 * maxAlto);
						}
						wordsInLine.clear();
						if (maxAncho < x)
							maxAncho = x;
						x = 0;
						y += maxAlto;
						maxAlto = altoTexto;

						if ((x + texto.getBounds().getWidth() + (separationSpace
								* nW.size / 2)) > xMaxima) {
							xMaxima = x + texto.getBounds().getWidth()
									+ (separationSpace * nW.size / 2);
							// System.out.println("xMaxima="+xMaxima+", getWidth()="+this.getWidth());
						}

					}
					if (maxAlto < altoTexto)
						maxAlto = altoTexto;

					// si se desea posicionar la palabra en el centro de todo el
					// espacio reservado en anchoTexto en vez de dejar todo el
					// espacio a la derecha
					// se colocará la coordenada X de la palabra en
					// posicionXWord
					// si se desea dejar a la izquierda y todo el espacio
					// sobrante a la derecha, basta con hacer nW.setX(x);
					separacionXWord = (separationSpace * nW.size);
					posicionXWord = x + (separacionXWord / 2);

					nW.setX(posicionXWord);
					nW.setY(y);// debería ser directamente +maxAlto, pero no
								// queda bien y no sé por qué.
								// luego está el tema de que cuando se está
								// viendo una, si luego hay otra mayor, no va a
								// tener en cuenta el maxAlto total.
								// habría que ir guardando todas las que van en
								// una línea y luego sumarlas a todas el
								// maxAlto, durante el cambio de línea
					nW.setText(texto);
					nW.label = w;
					wordsInLine.add(nW);
					x += anchoTexto;
				}
			}
			y += maxAlto;// si no la última línea no se tiene en cuenta
			for (int i = 0; i < wordsInLine.size(); i++)// y recolocación por el
														// tamaño máximo tb en
														// la última línea
			{
				Word w2 = wordsInLine.get(i);
				w2.setY(w2.getY() + .75 * maxAlto);
			}

			int limitX = this.getWidth();
			int limitY = this.getHeight() - menuCloud.getBounds().height;
			// System.out.println("Occupied size: "+Math.floor((x/limitX)*100)+", "+Math.floor((y/limitY)*100));

			//System.out.println("y = "+y+", limitY="+limitY+", xMaxima="+xMaxima+", limitX="+limitX+", hasDecreased="+hasDecreased+", end="+end+", scale="+scale+", scaleInicial="+scaleInicial);
			
			if ((y <= limitY && xMaxima <= limitX)) {
				if (hasDecreased) {
					end = true;
				}
				increase = true;
			//	System.out.println("increase="+increase);

			} else// larger
			{
				increase = false;
				hasDecreased = true;
			//	System.out.println("decreased, y=" + y + ", x=" + x
			//			+ ", limitY=" + limitY + ", limitX=" + limitX);
			}

			if (!end) {
				if (increase) {
					
					if(scale*1.5 == Double.POSITIVE_INFINITY){
			//			System.out.println("\n\n\n\n\n\nPOSITIVE_INFINITY ALCANZADO AL HACER scale*1.5 y scale valía "+scale);
					}
					
					scale *= 1.5;
				} else {
					if(scale/1.2 == Double.POSITIVE_INFINITY){
			//			System.out.println("\n\n\n\n\n\nPOSITIVE_INFINITY ALCANZADO AL HACER scale/1.2 y scale valía "+scale);
					}					
					
					scale /= 1.2;
				}
			}
			
		} while (!end);

		textChanged = false;
		
		//System.out.println("4) Words set");

		// necesita un repaint para que al redimensionar se actualice la vista
		super.repaint();
	}

	public synchronized void paintComponent(Graphics g) {
		
		drawFondo((Graphics2D)g);
		if(sesion.getSelectedBicluster()==null || sesion.getSelectedGenesBicluster()==null || sesion.getSelectedGenesBicluster().size()==0)
			drawText((Graphics2D) g, "No selection, please select some elements");
		else if (sesion.isTooManyGenes()) 
			drawText((Graphics2D) g, "Too many elements selected for this view");
		else if(waitingEnrichment)
			drawText((Graphics2D) g, "Performing statistical enrichment (it might take a while)...");
		else if(words==null || words.size()==0)
			drawText((Graphics2D) g, "No annotations found for the selected elements");
		else
			{
			if(textChanged)											setWords((Graphics2D) g);
			else													drawWords((Graphics2D) g);
			}
	}

	public int getId() {
		return es.usal.bicoverlapper.controller.kernel.Configuration.CLOUD_ID;
	}

	public void stateChanged(ChangeEvent i) {
		this.repaint();
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {

	}

	public void mousePressed(MouseEvent e) {
		// if
		// (!this.myColor.equals(this.sesion.getDataLayer().getSelectedTupleColor())){
		// this.colorSeleccion=this.myColor;
		// this.sesion.getDataLayer().setSelectionColor(this.colorSeleccion);
	}

	public void mouseReleased(MouseEvent e) {
		if(this.configurando)	
			return;
		
		nameSelected = new ArrayList<String>();
		newSelection = true;
		
		X = e.getX();
		Y = e.getY();
		Iterator<String> itw = words.keySet().iterator();
		while (itw.hasNext()) {
			String w = itw.next();
			if (w.length() > 0)// && words.get(w).x!=0.0 && words.get(w).y!=0.0)
			{
				TextLayout T = (TextLayout) words.get(w).text;
				if (T != null) {
					if (newSelection)
						words.get(w).setColor(this.colorSeleccion);
					// System.out.println("T.with"+rW.getWidth());
					if (X < (T.getBounds().getWidth() + words.get(w).x)
							&& X > words.get(w).x && Y < (words.get(w).y)
							&& Y > (words.get(w).y - T.getBounds().getHeight())) {
						if (nameSelected.contains(w)) {
							nameSelected.remove(w);
							words.get(w).setColor(this.colorSeleccion);
							System.out.println("W: " + nameSelected.toString());
						} else {
							nameSelected.add(w);
							words.get(w).setColor(paleta[colorVarSelec]);
							System.out.println("W: " + nameSelected.toString());
							// We should focus on the ones selected, or on the
							// whole (with Ctrl pressed, for example) by making
							// first a whole search
							Selection s = null;
							if (!e.isControlDown()) {
								s = sesion.getMicroarrayData().search(
										nameSelected.get(0).trim(), 0, true,
										sesion.getSelectedGenesBicluster());
							} else {
								this.doNOTupdate = true;
								sesion.getMicroarrayData().retrieveGeneAnnotations(
												ArrayUtils.toIntArray(sesion.getMicroarrayData().getNonAnnotatedGeneIds()),
												this, true, progress, null,
												true, false);

								System.out.println("Waiting for annotation retrieval");
								try {
									synchronized (sesion.getMicroarrayData().getGeneAnnotations()) {
										sesion.getMicroarrayData().getGeneAnnotations().wait();
									}
								} catch (Exception ex) {
									ex.printStackTrace();
									return;
								}

								System.out.println("Searching genes");
								s = sesion.getMicroarrayData().search(
										nameSelected.get(0).trim(), 0, true,
										null);
							}

							if (s != null && s.getGenes().size() > 0) {
								sesion.setSelectedBicluster(s);
								sesion.updateAll();
							} else {
								System.err.println("No genes found");
							}
						}
						break;
					}
				}
			}
		}
	}

	/**
	 * Pops up a configuration panel for heatmap visual properties
	 */
	public void configure() {
		if (!configurando) {
			configurando = true;
			JInternalFrame ventanaConfig = this.getVentanaConfig();

			// Obtenemos el gestor de eventos de configuracion
			ConfigurationMenuManager gestor = new ConfigurationMenuManager(
					this, ventanaConfig, paleta, muestraColor);

			JPanel panelColor = this.getPanelPaleta(paleta, textoLabel,
					muestraColor);
			// JPanel panelParametros=new
			// WordCloudParameterConfigurationPanel(this);
			JPanel panelParametros = menuCloud;
			this.setPanelParametros(panelParametros);
			JPanel panelBotones = this.getPanelBotones(gestor);

			// Configuramos la ventana de configuracion
			this.initPanelConfig(panelColor, null, panelParametros,
					panelBotones);

			// Mostramos la ventana de configuracion
			ventanaConfig.setLocation(getPosition());
			ventanaConfig.setTitle(Translator.instance.configureLabels
					.getString("s1") + " " + this.getName());
			sesion.getDesktop().add(ventanaConfig);
			try {
				ventanaConfig.setSelected(true);
			} catch (PropertyVetoException e) {
				e.printStackTrace();
			}
			ventanaConfig.pack();
			ventanaConfig.setVisible(true);
		}
	}

	/**
	 * Notifies the end of configuration
	 */
	public void endConfig(boolean ok) {
		if (!ok) {
			configurando = false;
			return;
		}

		colorSeleccion = paleta[colorEtiquetaVar];
		this.configurando = false;
		sesion.setSelectionColor(colorSeleccion);
		sesion.updateConfigExcept(this.getName());
		this.update();
	}

	private class Word {
		private TextLayout text;
		private TextLayout contText;
		private String label;
		private double x;
		private double y;
		private double size;// size for this word, usually related to the figure
							// of
		// merit
		private double value;// figure of merit for this word (number of
								// occurences,
		// p-value, etc.)
		private Color color;

		public Word(TextLayout text, double x, double y, double value,
				double size, Color c) {
			this.text = text;
			this.x = x;
			this.y = y;
			this.value = value;
			this.size = size;
			this.color = c;
		}

		public double getSize() {
			return this.size;
		}

		public double getX() {
			return this.x;
		}

		public double getY() {
			return this.y;
		}

		public TextLayout getText() {
			return this.text;
		}

		public void setText(TextLayout text) {
			this.text = text;
		}

		public void setX(double x) {
			this.x = x;
		}

		public void setY(double y) {
			this.y = y;
		}

		public void setCont(double cont) {
			this.size = cont;
		}

		public Color getColor() {
			return color;
		}

		public void setColor(Color color) {
			this.color = color;
		}
	}

	/**
	 * @return the got
	 */
	public List<GOTerm> getGot() {
		return got;
	}

	/**
	 * @param got
	 *            the got to set
	 */
	public void setGot(List<GOTerm> got) {
		this.got = got;
	}

	/**
	 * @return the textChanged
	 */
	public boolean isTextChanged() {
		return textChanged;
	}

	/**
	 * @param textChanged
	 *            the textChanged to set
	 */
	public void setTextChanged(boolean textChanged) {
		this.textChanged = textChanged;
	}

	/**
	 * @param innerCall
	 *            the innerCall to set
	 */
	public void setInnerCall(boolean innerCall) {
		this.innerCall = innerCall;
	}

	/**
	 * @return the doNOTupdate
	 */
	public boolean isDoNOTupdate() {
		return doNOTupdate;
	}

	/**
	 * @param doNOTupdate
	 *            the doNOTupdate to set
	 */
	public void setDoNOTupdate(boolean doNOTupdate) {
		this.doNOTupdate = doNOTupdate;
	}
}