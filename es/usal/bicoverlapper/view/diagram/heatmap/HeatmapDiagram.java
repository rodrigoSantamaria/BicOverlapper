package es.usal.bicoverlapper.view.diagram.heatmap;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.beans.PropertyVetoException;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import prefuse.Constants;
import prefuse.Display;
import prefuse.Visualization;
import prefuse.action.ActionList;
import prefuse.action.RepaintAction;
import prefuse.action.assignment.ColorAction;
import prefuse.action.assignment.DataColorAction;
import prefuse.action.layout.Layout;
import prefuse.controls.ControlAdapter;
import prefuse.controls.PanControl;
import prefuse.controls.WheelZoomControl;
import prefuse.controls.ZoomControl;
import prefuse.data.Table;
import prefuse.data.tuple.TupleSet;
import prefuse.data.util.Sort;
import prefuse.render.AbstractShapeRenderer;
import prefuse.render.LabelRenderer;
import prefuse.render.Renderer;
import prefuse.render.RendererFactory;
import prefuse.util.ColorLib;
import prefuse.util.ui.UILib;
import prefuse.visual.VisualItem;

import es.usal.bicoverlapper.controller.kernel.Selection;
import es.usal.bicoverlapper.controller.kernel.Session;
import es.usal.bicoverlapper.controller.manager.configurationManager.ConfigurationMenuManager;
import es.usal.bicoverlapper.controller.util.Translator;
import es.usal.bicoverlapper.model.microarray.ExpressionData;
import es.usal.bicoverlapper.utils.Sizeof;
import es.usal.bicoverlapper.view.configuration.panel.HeatmapParameterConfigurationPanel;
import es.usal.bicoverlapper.view.configuration.panel.KeggParameterConfigurationPanel;
import es.usal.bicoverlapper.view.diagram.Diagram;
import es.usal.bicoverlapper.view.main.DiagramWindow;

/**
 * This diagram represents a Microarray data matrix as the typical expression
 * level heatmap. It implements bifocal distortion to see gene and expression
 * profiles and it is linked to other views by the session layer. The structure
 * of the heatmap is based in Prefuse library.
 * 
 * @author Rodrigo Santamaria
 * 
 */
public class HeatmapDiagram extends Diagram {
	private static final long serialVersionUID = 1L;

	// atributos del panel del diagrama
	private Session sesion;
	// MultidimensionalData datos; // @jve:decl-index=0:
	private int alto;
	private int ancho;
	boolean atributosIniciados = false, configurando = false,
			diagramaPintado = false;

	// definicion de margenes del diagrama

	final int margenDer = 40;
	final int margenIzq = 40;
	final int margenSup = 25;
	final int margenInf = 40;
	final int margenDiagrama = 10; // porcentaje de exceso en intervalo de
									// representacion del diagrama

	// configuracion de color
	static final int lowColor = 0;
	static final int zeroColor = 1;
	static final int highColor = 2;
	static final int selectionColor = 3;
	static final int hoverColor = 4;
	// private Color[] paleta = {Color.BLUE, Color.WHITE, Color.RED, Color.BLUE,
	// Color.YELLOW};
	private Color[] paleta;
	String[] textoLabel = { "Lowest Expression", "Zero Expression",
			"Highest expression", "Selection", "Hover" };
	// JTextField[] muestraColor =new JTextField[paleta.length];
	JTextField[] muestraColor;

	// atributos de configuracion anclajes
	DiagramWindow itemToAdd, itemToRemove;

	// Información propia del heatmap
	ExpressionData md;
	Visualization v; // Visualization
	Visualization v2; // TODO: Visualization of conditions (testing)

	Display d; // Display (equivalente al frame en otros casos)
	// FisheyeDistortion fd;
	// BifocalDistortion fd;
	// private HeatmapFocusControl currentGenes;
	private HeatmapFocusControl currentLevels;

	int contName = 0;
	// int geneMargin=0;
	int geneMargin = 100;
	int conditionMargin = 100;
	// int conditionMargin=0;
	// private double m_scale=60;
	private double m_scale = 2 * 4; // OJOOO: Importantísimo: m_scale*rango debe
									// ser inexorablemente < 1, o salen escalas
									// negativas y todo se va a la mierda
	private int[] palette;
	MicroGridLayout gl;

	ExpressionColorAction exprColor;
	StrokeColorAction strokeColor;
	ColorAction rectangleStrokeColor;

	Selection bicAnt = null;// para evitar bucles infinitos create-update

	private HorizontalLineLayout xlabels;

	private boolean resort;

	private HeatmapHoverControl hoverController;

	private int scaleModeHeatMap;

	/**
	 * Default constructor
	 */
	public HeatmapDiagram() {
		super();
	}

	/**
	 * Session Constructor
	 * 
	 * @param sesion
	 *            Session to which this diagram is linked
	 * @param dim
	 *            Default dimensions for the diagram
	 */
	public HeatmapDiagram(Session sesion, Dimension dim) {
		super(new BorderLayout());
		int num = sesion.getNumHeatmapDiagrams();
		this.setName("Microarray Heatmap " + num);
		this.sesion = sesion;
		this.md = sesion.getMicroarrayData();
		System.out.println("HM dimensions: "+dim.getWidth()+", "+dim.getHeight());
		this.alto = (int) dim.getHeight();
		this.ancho = (int) dim.getWidth();
		this.setPreferredSize(dim);
		this.setSize(dim);
		this.paleta = new Color[] { sesion.getLowExpColor(),
				sesion.getAvgExpColor(), sesion.getHiExpColor(),
				sesion.getSelectionColor(), sesion.getHoverColor() };
		muestraColor = new JTextField[paleta.length];

		scaleModeHeatMap = sesion.getScaleMode();
	}

	// As create(), but uses less massive matrices
	/**
	 * Generate internal structure of the heatmap from the specified tables
	 * 
	 * @param expressions
	 *            table with expression levels, each row corresponding to a gene
	 * @param genes
	 *            table with gene names
	 * @param conditions
	 *            table with condition names
	 */
	public void create(Table expressions, Table genes, Table conditions) {
		cancelAllActions();
		v = new Visualization();
		v.addTable("matrix", expressions); // Le añadimos nuestra tabla
		v.addTable("geneLabels", genes); // Le añadimos nuestra tabla
		v.addTable("conditionLabels", conditions); // Le añadimos nuestra tabla
		generateRest();
	}

	public void update(Table expressions, Table genes, Table conditions) {
		if (v == null) {
			create(expressions, genes, conditions);
			return;
		}
		v.removeGroup("matrix");
		v.removeGroup("geneLabels");
		v.removeGroup("conditionLabels");
		v.addTable("matrix", expressions); // Add new sparse tables
		v.addTable("geneLabels", genes);
		v.addTable("conditionLabels", conditions);
	}

	/**
	 * Generates internal structure of the heatmap from the data taken from the
	 * session layer
	 * 
	 */
	public void create() {
		// --------------------------- visualization -----------------------
		cancelAllActions();
		v = new Visualization();
		// v.addTable("matrix", md.getExpressions()); //Le añadimos nuestra
		// tabla
		// v.addTable("geneLabels", md.getGeneLabels()); //Le añadimos nuestra
		// tabla
		v.addTable("matrix", md.getSparseExpressions()); // SPARSE
		v.addTable("geneLabels", md.getSparseGeneLabels()); // SPARSE
		v.addTable("conditionLabels", md.getConditionLabels()); // Le añadimos
																// nuestra tabla

		generateRest();
		update();
	}

	void generateRest() {
		Table rect = new Table();// Para el rectangulo que rodea a la seleccion
		rect.addColumn("rowId", int.class);
		rect.addColumn("colId", int.class);
		int row = rect.addRow();
		rect.setInt(row, "rowId", 0);
		rect.setInt(row, "colId", 0);

		// v.addTable("rectangle", rect);

		double ts = System.currentTimeMillis();
		double t1 = System.currentTimeMillis();
		double t2 = System.currentTimeMillis();
		Rectangle2D rc = new Rectangle2D.Double(geneMargin, 0, ancho
				- geneMargin, conditionMargin);
		Rectangle2D rg = new Rectangle2D.Double(0, conditionMargin, geneMargin,
				alto - conditionMargin);
		Rectangle2D rdata = new Rectangle2D.Double(geneMargin, conditionMargin,
				ancho - geneMargin, alto - conditionMargin);

		// El renderer tendrá tres partes ahora
		int paletteTemp[] = ColorLib.getInterpolatedPalette(255,
				paleta[HeatmapDiagram.lowColor].getRGB(),
				paleta[HeatmapDiagram.zeroColor].getRGB());
		int paletteTemp2[] = ColorLib.getInterpolatedPalette(255,
				paleta[HeatmapDiagram.zeroColor].getRGB(),
				paleta[HeatmapDiagram.highColor].getRGB());
		// TODO: revisar, hay dos niveles del average, el ultimo de temp y el
		// primero de temp2
		palette = new int[paletteTemp.length + paletteTemp2.length - 1];
		for (int i = 0; i < paletteTemp.length - 1; i++)
			palette[i] = paletteTemp[i];
		// for(int i=paletteTemp.length;i<palette.length;i++)
		// palette[i]=paletteTemp2[i-paletteTemp.length];
		for (int i = 0; i < paletteTemp2.length; i++)
			palette[i + paletteTemp.length - 1] = paletteTemp2[i];

		final int ngtot = md.getNumGenes();
		final int ng = md.getNumSparseGenes(); // SPARSE
		final int nc = md.getNumConditions();

		v.setRendererFactory(new RendererFactory() {
			AbstractShapeRenderer sr = new ExpressionRenderer(ng, nc, alto
					- conditionMargin, ancho - geneMargin);
			Renderer arY = new LabelRenderer2("name");
			Renderer arX = new RotationLabelRenderer("name", 300);// 270 or 300

			public Renderer getRenderer(VisualItem item) {
				if (item.isInGroup("geneLabels"))
					return arY;
				else {
					if (item.isInGroup("conditionLabels"))
						return arX;
					else
						return sr;
				}
			}
		});

		t1 = System.currentTimeMillis();

		// TODO: If max!=-(min), the filling won't be the middle color for
		// average values.

		// en función del tipo de escala seleccionado se entrará por un camino u
		// otro
		if (sesion.getScaleMode() == Session.quantile) {
			exprColor = new ExpressionColorAction("matrix", "level",
					Constants.ORDINAL, VisualItem.FILLCOLOR, palette);
		} else {
			exprColor = new ExpressionColorAction("matrix", "level",
					Constants.NUMERICAL, VisualItem.FILLCOLOR, palette);
		}

		// exprColor.setMaxScale(md.max);
		// exprColor.setMinScale(md.min);

		/*
		 * exprColor=new ExpressionColorAction("matrix", "level",
		 * Constants.ORDINAL, VisualItem.FILLCOLOR, palette); Map m_omap =
		 * DataLib.ordinalMap(md.getExpressions(), "level");
		 * System.out.println("Memory after ordinal map "+Sizeof.usedMemory());
		 * Object[] ar=m_omap.keySet().toArray();//from here on, momap is not
		 * needed m_omap=null; List<Object> al=Arrays.asList(ar);//from here on,
		 * ar is not needed ar=null; List<Double> ad=new ArrayList<Double>();
		 * for(Object o : al) { ad.add((Double)o); } Collections.sort(ad);
		 * exprColor.setOrdinalMap(ad.toArray());
		 */

		System.out
				.println("Memory after color selection" + Sizeof.usedMemory());

		// strokeColor=new StrokeColorAction("matrix", "level", palette,
		// sesion.getHoverColor(), sesion.getSelectionColor());
		ColorAction textColor = new ColorAction("matrix", VisualItem.TEXTCOLOR,
				ColorLib.gray(255, 0));
		Color ch = sesion.getHoverColor();

		ColorAction labelGeneTextColor = new ColorAction("geneLabels",
				VisualItem.TEXTCOLOR, ColorLib.gray(0));
		labelGeneTextColor.add("_hover",
				ColorLib.rgb(ch.getRed(), ch.getGreen(), ch.getBlue()));
		ColorAction labelGeneStroke = new ColorAction("geneLabels",
				VisualItem.STROKECOLOR, ColorLib.gray(100));

		ColorAction labelConditionTextColor = new ColorAction(
				"conditionLabels", VisualItem.TEXTCOLOR, ColorLib.gray(0));
		labelGeneTextColor.add("_hover",
				ColorLib.rgb(ch.getRed(), ch.getGreen(), ch.getBlue()));
		ColorAction labelConditionColor = new ColorAction("conditionLabels",
				VisualItem.FILLCOLOR, ColorLib.gray(255, 0));
		// ColorAction labelConditionStroke=new ColorAction("conditionLabels",
		// VisualItem.STROKECOLOR, ColorLib.gray(100));
		// labelGeneStroke.add("_hover", ColorLib.rgb(255,0,0));

		rectangleStrokeColor = new ColorAction("rectangle",
				VisualItem.STROKECOLOR, sesion.getSelectionColor().getRGB());
		ColorAction rectangleFillColor = new ColorAction("rectangle",
				VisualItem.FILLCOLOR, ColorLib.alpha(0));

		ActionList color = new ActionList();
		color.add(exprColor);
		// color.add(strokeColor);
		color.add(textColor);
		color.add(labelConditionColor);
		// color.add(labelConditionStroke);
		color.add(labelGeneTextColor);
		color.add(labelConditionTextColor);
		color.add(new RepaintAction());

		v.putAction("color", color);

		t2 = System.currentTimeMillis();
		// System.out.println("3) Colors: "+(t2-t1)/1000);

		// -----------------------------layout--------------------------
		VerticalLineLayout2 ylabels = new VerticalLineLayout2(
				(alto - conditionMargin), "geneLabels", ng, m_scale);
		ylabels.setLayoutBounds(rg);

		// xlabels = new
		// HorizontalLineLayout((ancho-geneMargin),"conditionLabels",
		// nc,m_scale/3);
		xlabels = new HorizontalLineLayout((ancho - geneMargin),
				"conditionLabels", nc, 1.5);
		xlabels.setLayoutBounds(rc);

		gl = new MicroGridLayout(
				"matrix",
				ng,
				ngtot,
				nc,
				// alto-conditionMargin, ancho-geneMargin, "actualRowId",
				// "colId",geneMargin, conditionMargin, m_scale/3, m_scale,
				// "MicroTal construido "+contName);//sparse
				alto - conditionMargin, ancho - geneMargin, "actualRowId",
				"colId", geneMargin, conditionMargin, 1.5, m_scale,
				"MicroTal construido " + contName);// sparse
		contName++;
		xlabels.setLayoutAnchor(new Point2D.Double(geneMargin, conditionMargin));// TODO:
																					// No
																					// podrían
																					// funcionar
																					// dos
																					// AxisLayout?
		gl.setLayoutBounds(rdata);

		ActionList layout = new ActionList();
		layout.add(gl);
		layout.add(xlabels);
		layout.add(ylabels);
		layout.add(new RepaintAction());

		v.putAction("layout", layout);

		t2 = System.currentTimeMillis();
		// System.out.println("4) Layouts: "+(t2-t1)/1000);

		// ---------------DISTORTION
		/*
		 * ActionList distortion = new ActionList(); MicroGridDistortion fd=new
		 * MicroGridDistortion
		 * (1.0/md.getNumConditions(),m_scale/2,1.0/ng,m_scale, rdata,ng,nc,
		 * "matrix", this.sesion, gl);
		 * 
		 * fd.setLayoutBounds(rdata); fd.setGroup("matrix"); distortion.add(fd);
		 * 
		 * BifocalDistortion2 fdc=new BifocalDistortion2(1.0/nc,m_scale/2,0,0);
		 * fdc.setLayoutBounds(rdata); fdc.setLayoutBounds(rc);
		 * fdc.setGroup("conditionLabels"); distortion.add(fdc);
		 * 
		 * 
		 * 
		 * //BifocalDistortion fdg=new BifocalDistortion(0,0,1.0/ng,m_scale);
		 * BifocalDistortion2 fdg=new BifocalDistortion2(0,0,1.0/ng,m_scale);
		 * fdg.setLayoutBounds(rg); fdg.setGroup("geneLabels");
		 * distortion.add(fdg); v.putAction("distortion", distortion);
		 * 
		 * t2=System.currentTimeMillis();
		 * //System.out.println("5) Distortions: "+(t2-t1)/1000);
		 */
		// ------------- display y controladores interactivos--------------
		d = new Display(v);
		d.setHighQuality(true);

		d.addControlListener(new PanControl()); // pan with background left-drag
		d.addControlListener(new ZoomControl()); // zoom with vertical
													// right-drag
		d.addControlListener(new WheelZoomControl()); // zoom to fit screen

		hoverController = new HeatmapHoverControl(sesion, "layout",
				Visualization.FOCUS_ITEMS, "matrix", "geneLabels",
				"conditionLabels", gl, ylabels, v);
		d.addControlListener(hoverController);
		d.addControlListener(new ConfigurationControl()); // zoom with vertical
															// right-drag

		// AnchorUpdateControl auc=new AnchorUpdateControl(new Layout[]{fd,
		// fdg,fdc},"distortion");//
		// d.addControlListener(auc);

		currentLevels = new HeatmapFocusControl(sesion, "layout",
				Visualization.FOCUS_ITEMS, "matrix", "geneLabels",
				"conditionLabels", gl, ylabels, xlabels, v, 10);
		d.addControlListener(currentLevels);
		t2 = System.currentTimeMillis();

		// ---------------- frame ----------------------
		this.getWindow().add(d);

		this.add(d, BorderLayout.CENTER); // El display con el grafo
		Color BACKGROUND = Color.WHITE;
		Color FOREGROUND = Color.DARK_GRAY;

		UILib.setColor(this, BACKGROUND, FOREGROUND);
		this.getWindow().setContentPane(this);
		this.getWindow().pack(); // layout components in window
	}

	public int getId() {
		return es.usal.bicoverlapper.controller.kernel.Configuration.HEATMAP_ID;
	}

	/**
	 * Run the diagram, making it visible and running prefuse actions
	 * 
	 */
	public synchronized void run() {
		this.getWindow().setVisible(true);

		v.run("colorRectangle");
		v.run("color"); // assign the colors
		v.run("distortion");
		v.run("layout"); // start up the animated layout
		v.runAfter("distortion", "layout");
		v.runAfter("layout", "color");
		v.runAfter("color", "colorRectangle");
	}

	void cancelAllActions() {
		if (v != null) {
			v.cancel("colorRectangle");
			v.cancel("color");
			v.cancel("distortion");
			v.cancel("layout");
		}
		if (d != null) {
			d.removeAll();
			d.invalidate();
			this.getWindow().remove(d);
		}
	}

	public void setOrder(int[] columnOrder) {
		if (v != null && sesion != null) {
			gl.setColumnOrder(columnOrder);
			resort = true;
		}
	}

	public void update() {
		if (v != null && sesion != null) {
			if (sesion.isOnlyHover()) // HOVER
			{
				System.out.println("Only hover!");
				if (sesion.getSelectedGenesBicluster().size() <= md
						.getNumSparseGenes()) {
					hoverController.addItemsForHover(sesion
							.getHoveredBicluster().getGenes(), sesion
							.getHoveredBicluster().getConditions());
				} else // TODO: by now nothing, but maybe to recover only that
						// one?
				{

				}
			} 
			else // SELECTION
			{
				if (sesion.getSelectedBicluster() != null
						&& sesion.getSelectedBicluster() != bicAnt
						&& sesion.getSelectedGenesBicluster().size() <= md
								.getNumSparseGenes()) {
					currentLevels.clear();

					md.sortColumns();
					md.buildSparse(sesion.getSelectedBicluster().getGenes());
					update(md.getSparseExpressions(), md.getSparseGeneLabels(),
							md.getConditionLabels());

					LinkedList<Integer> lg = sesion.getSelectedGenesBicluster();
					LinkedList<Integer> lc = sesion.getSelectedConditionsBicluster();
					currentLevels.addItems(lg, lc);
					resort = false;
				} else if (resort) {
					currentLevels.clear();

					md.sortColumns();
					update(md.getSparseExpressions(), md.getSparseGeneLabels(),
							md.getConditionLabels());

					LinkedList<Integer> lg = new LinkedList<Integer>();
					LinkedList<Integer> lc = new LinkedList<Integer>();
					currentLevels.addItems(lg, lc);
					resort = false;
				}
			}
		}
		synchronized (this) {
			run();
		}
	}

	public void updateConfig() {
		paleta[HeatmapDiagram.selectionColor] = sesion.getSelectionColor();
		paleta[HeatmapDiagram.hoverColor] = sesion.getHoverColor();

		scaleModeHeatMap = sesion.getScaleMode();

		int paletteTemp[] = ColorLib.getInterpolatedPalette(255,
				paleta[HeatmapDiagram.lowColor].getRGB(),
				paleta[HeatmapDiagram.zeroColor].getRGB());
		int paletteTemp2[] = ColorLib.getInterpolatedPalette(255,
				paleta[HeatmapDiagram.zeroColor].getRGB(),
				paleta[HeatmapDiagram.highColor].getRGB());
		palette = new int[paletteTemp.length + paletteTemp2.length];
		for (int i = 0; i < paletteTemp.length; i++)
			palette[i] = paletteTemp[i];
		for (int i = paletteTemp.length; i < palette.length; i++)
			palette[i] = paletteTemp2[i - paletteTemp.length];

		// en función del tipo de escala seleccionado se entrará por un camino u
		// otro
		if (sesion.getScaleMode() == Session.quantile) {
			exprColor = new ExpressionColorAction("matrix", "level",
					Constants.ORDINAL, VisualItem.FILLCOLOR, palette);
		} else {
			exprColor = new ExpressionColorAction("matrix", "level",
					Constants.NUMERICAL, VisualItem.FILLCOLOR, palette);
		}

		// exprColor=new ExpressionColorAction("matrix", "level",
		// Constants.NUMERICAL, VisualItem.FILLCOLOR, palette);
		// exprColor.setMaxScale(md.max);
		// exprColor.setMinScale(md.min);

		// strokeColor=new StrokeColorAction("matrix", "level", palette,
		// sesion.getHoverColor(), sesion.getSelectionColor());
		ColorAction textColor = new ColorAction("matrix", VisualItem.TEXTCOLOR,
				ColorLib.gray(255, 0));

		ColorAction labelGeneTextColor = new ColorAction("geneLabels",
				VisualItem.TEXTCOLOR, ColorLib.gray(0));
		Color ch = sesion.getHoverColor();
		labelGeneTextColor.add("_hover",
				ColorLib.rgb(ch.getRed(), ch.getGreen(), ch.getBlue()));
		ColorAction labelGeneStroke = new ColorAction("geneLabels",
				VisualItem.STROKECOLOR, ColorLib.gray(100));

		ColorAction labelConditionTextColor = new ColorAction(
				"conditionLabels", VisualItem.TEXTCOLOR, ColorLib.gray(0));
		labelGeneTextColor.add("_hover",
				ColorLib.rgb(ch.getRed(), ch.getGreen(), ch.getBlue()));
		ColorAction labelConditionColor = new ColorAction("conditionLabels",
				VisualItem.FILLCOLOR, ColorLib.gray(255, 0));
		// ColorAction labelConditionStroke=new ColorAction("conditionLabels",
		// VisualItem.STROKECOLOR, ColorLib.gray(100));
		// labelGeneStroke.add("_hover", ColorLib.rgb(255,0,0));

		rectangleStrokeColor = new ColorAction("rectangle",
				VisualItem.STROKECOLOR, sesion.getSelectionColor().getRGB());
		ColorAction rectangleFillColor = new ColorAction("rectangle",
				VisualItem.FILLCOLOR, ColorLib.alpha(0));

		ActionList color = (ActionList) v.getAction("color");
		color.remove(exprColor);
		color.remove(textColor);
		color.remove(labelConditionColor);
		color.remove(labelGeneTextColor);
		color.remove(labelConditionTextColor);

		color.add(exprColor);
		color.add(textColor);
		color.add(labelConditionColor);
		color.add(labelGeneTextColor);
		color.add(labelConditionTextColor);
		color.add(new RepaintAction());

		v.putAction("color", color);

		run();
		this.repaint();
		this.configurando = false;
	}

	// --------------------- Private classes--------------
	private static class LevelColorAction extends DataColorAction {
		LevelColorAction(String group, String sel, int[] palette) {
			super(group, sel, Constants.ORDINAL, VisualItem.FILLCOLOR, palette);
		}

	} // end of inner class LevelColorAction

	static class StrokeColorAction extends DataColorAction {
		StrokeColorAction(String group, String sel, int[] palette, Color hc,
				Color sc) {
			super(group, sel, Constants.ORDINAL, VisualItem.STROKECOLOR,
					palette);
			add("_hover",
					ColorLib.rgb(hc.getRed(), hc.getGreen(), hc.getBlue()));
			add("ingroup('_focus_')",
					ColorLib.rgb(sc.getRed(), sc.getGreen(), sc.getBlue()));
		}
	} // end of inner class NodeColorAction

	static class LabelRenderer2 extends LabelRenderer {
		LabelRenderer2(String group) {
			super(group);
			setVerticalPadding(0);
			setHorizontalPadding(0);
			setHorizontalAlignment(Constants.RIGHT);
			setHorizontalTextAlignment(Constants.RIGHT);
		}
	}

	/**
	 * Lines up all VisualItems vertically. Also scales the size such that all
	 * items fit within the maximum layout size, and updates the Display to the
	 * final computed size.
	 */
	class VerticalLineLayout2 extends Layout {
		private double m_maxHeight = 600;
		private String grupo;
		private Double scale;
		private int[] geneOrder;
		private double distortion;
		private double maxDistortion = 0.7;
		private int[] hoverGenes;// En principio sólo uno

		VerticalLineLayout2(double maxHeight, String group, int rowNumber,
				double d) {
			m_maxHeight = maxHeight;
			grupo = group;
			geneOrder = new int[rowNumber];
			distortion = d;
			initialOrder();
		}

		public void run(double frac) {
			// first pass --> ponemos las etiquetas al tamaño máximo que
			// tendremos
			// double w = 0;
			double h = 0;

			TupleSet ts = v.getGroup(grupo);
			Sort orden = new Sort(new String[] { "rowRank" });
			Iterator iter = ts.tuples(null, orden);
			double h1 = 0;

			h1 = m_maxHeight / ts.getTupleCount();
			double canonicalh = 0;
			while (iter.hasNext()) {
				VisualItem item = (VisualItem) iter.next();
				item.setSize(1.0);
				canonicalh = item.getBounds().getHeight();
				h += item.getBounds().getHeight();
			}// A un tamaño de 1, vemos cuánto ocupan en altura

			scale = h > m_maxHeight ? m_maxHeight / h : 1.0; // Escalamos según
																// la altura
																// máxima qu
																// tengamos
			// 0) SELECTION OR HOVER
			if (sesion.getSelectedBicluster() != null
					|| (sesion.getHoveredBicluster() != null && sesion
							.getHoveredBicluster().getGenes().size() > 0)) {
				double normalh = h1;
				int ng = 0;
				int ns = 0;
				int nh = 0;
				int hoverGene = -1;

				if (sesion.getSelectedBicluster() != null)
					ns = sesion.getSelectedBicluster().getGenes().size();
				if (sesion.getHoveredBicluster() != null && hoverGenes != null) {
					if (sesion.getHoveredBicluster().getGenes().size() > 0)
						hoverGene = hoverGenes[0];
					nh = sesion.getHoveredBicluster().getGenes().size();
				}
				if (nh > 0 && (ns == 0 || hoverGene > ns))
					ng = ns + nh;
				else
					ng = ns;// hovering coincides with a selection

				// System.out.println("Número de filas a distorsionar: "+ng);

				double distortedh = normalh * distortion;
				double distorteds = distortedh / canonicalh;

				double minih = (this.getLayoutBounds().getHeight() - distortedh
						* ng)
						/ (geneOrder.length - ng);
				double minis = minih / canonicalh;
				int cont = 0;
				double height = this.getLayoutBounds().getHeight();

				if (distortedh * ng > maxDistortion * height) {
					distortedh = height * maxDistortion / ng;
					minih = (m_maxHeight - distortedh * ng)
							/ (geneOrder.length - ng);
					distorteds = distortedh / canonicalh;
					minis = minih / canonicalh;
				}

				h1 = m_maxHeight / ts.getTupleCount();
				Display d = v.getDisplay(0);
				Insets ins = d.getInsets();// espacio que el display deja en sus
											// bordes

				// second pass
				h = ins.top + conditionMargin;
				double ih, y = 0, x = ins.left + geneMargin - 10;
				iter = ts.tuples(null, orden);
				cont = 0;
				while (iter.hasNext()) {
					VisualItem item = (VisualItem) iter.next();
					if ((ns > 0 && cont < sesion.getSelectedBicluster()
							.getGenes().size())
							|| (hoverGenes != null && geneOrder[item
									.getInt("id")] == hoverGenes[0])) {
						item.setSize(distorteds);
						item.setEndSize(distorteds);
						ih = distortedh;
						cont++;
					} else {
						item.setSize(minis);
						item.setEndSize(minis);
						ih = minih;
					}

					y = h + (ih / 2);
					setX(item, null, x);
					setY(item, null, y);
					h += ih;
				}
			}
			// 3) NORMAL
			else {
				h1 = m_maxHeight / ts.getTupleCount();
				Display d = v.getDisplay(0);
				Insets ins = d.getInsets();// espacio que el display deja en sus
											// bordes

				// second pass
				h = ins.top + conditionMargin;
				double ih, y = 0, x = ins.left + geneMargin - 10;
				iter = ts.tuples(null, orden);

				while (iter.hasNext()) {
					VisualItem item = (VisualItem) iter.next();
					item.setSize(scale);
					item.setEndSize(scale);

					Rectangle2D b = item.getBounds();
					// w = Math.max(w, b.getWidth());
					ih = b.getHeight(); // Escalamos también los bordes, además
										// del tamaño del texto

					y = h + (ih / 2);
					setX(item, null, x);
					setY(item, null, y);
					h += h1;
				}
			}
		}

		void newOrder(int[] genesFirst) {
			/*
			 * int init=0; for(int i=0;i<genesFirst.length;i++) {
			 * geneOrder[init]=genesFirst[i];//El primero pasa a ocupar la
			 * posición de uno de los que tenemos
			 * geneOrder[genesFirst[i]]=init;//y viceversa init++; } init=0;
			 */
			int init = 0;
			if (genesFirst != null) {
				for (int i = 0; i < genesFirst.length; i++)// Primero añado
															// todos los que
															// tienen que ir
															// primero
				{
				if(genesFirst[i]>=0)
					{
						geneOrder[genesFirst[i]] = init;// El primero pasa a ocupar
														// la posición de uno de los
														// que tenemos
						init++;
					}
				}
				for (int i = 0; i < geneOrder.length; i++)// Luego el resto, si
															// no están entre
															// los iniciales
				{
					boolean add = true;
					for (int j = 0; j < genesFirst.length; j++)
						if (i == genesFirst[j]) {
							add = false;
							break;
						}
					if (add)
						geneOrder[i] = init++;
				}
			}
			return;
		}

		void newHover(int[] genes) {
			hoverGenes = genes;
			if (genes != null)
				for (int i = 0; i < hoverGenes.length; i++)
					hoverGenes[i] = geneOrder[hoverGenes[i]];
			return;
		}

		void initialOrder() {
			for (int i = 0; i < geneOrder.length; i++)
				geneOrder[i] = i;
		}

		Double getScale() {
			return scale;
		}

		void setScale(Double scale) {
			this.scale = scale;
		}
	} // end of inner class VerticalLineLayout2

	class ConfigurationControl extends ControlAdapter {
		ConfigurationControl() {
			super();
		}

		public void mouseReleased(MouseEvent e) {
			// System.out.println("Configuracion");
			if (e.getButton() == MouseEvent.BUTTON3) {
				configure();
			}
		}
	}

	/**
	 * Lines up all VisualItems horizontally. Also scales the size such that all
	 * items fit within the maximum layout size, and updates the Display to the
	 * final computed size.
	 */
	class HorizontalLineLayout extends Layout {
		private double m_maxWidth = 100;
		private String grupo;
		private Double scale;
		public int[] condOrder;
		public int[] initialCondOrder;
		private double distortion;
		// private double maxDistortion=0.7;
		private double maxDistortion = 120;

		HorizontalLineLayout(double maxWidth, String group, int colNumber,
				double d) {
			m_maxWidth = maxWidth;
			grupo = group;
			condOrder = new int[colNumber];
			initialCondOrder = new int[colNumber];
			distortion = d;
			initialOrder();
		}

		public double getSeparation(VisualItem item) {
			double h = ((RotationLabelRenderer) item.getRenderer())
					.getTextHeight(item);
			double r = ((RotationLabelRenderer) item.getRenderer()).itemRotation;

			double rc = r - 90;
			rc *= Math.PI / 180;
			double sep = h * Math.abs(Math.cos(rc));
			return sep;

		}

		public void run(double frac) {
			double w = 0;
			double w1 = (ancho - geneMargin) / condOrder.length;

			TupleSet ts = v.getGroup(grupo);
			Sort orden = new Sort(new String[] { "colRank" });
			Iterator iter = ts.tuples(null, orden);
			double canonicalw = 0;

			while (iter.hasNext()) {
				VisualItem item = (VisualItem) iter.next();
				item.setSize(1.0);
				w += getSeparation(item);

				canonicalw = ((RotationLabelRenderer) item.getRenderer())
						.getTextHeight(item);
			}// A un tamaño de 1, vemos cuánto ocupan en altura

			scale = w > m_maxWidth ? m_maxWidth / w : 1.0; // Escalamos según la
															// altura máxima qu
															// tengamos
			// System.out.println("Escala es "+scale+", "+ancho+" y ancho m‡ximo "+m_maxWidth);
			Display d = v.getDisplay(0);
			Insets ins = d.getInsets();// espacio que el display deja en sus
										// bordes

			// second pass
			w = geneMargin;
			double iw;
			double x = 0;
			double y = ins.top + conditionMargin - 10;
			iter = ts.tuples(null, orden);

			// 0) SELECTION OR HOVER
			if (sesion.getSelectedBicluster() != null
					|| (sesion.getHoveredBicluster() != null
							&& sesion.getHoveredBicluster().getConditions()
									.size() > 0 && sesion.getHoveredBicluster()
							.getConditions().size() < condOrder.length)) {

				int nc = 0;
				int ns = 0;
				int nh = 0;
				int hoverCondition = -1;
				if (sesion.getSelectedBicluster() != null)
					ns = sesion.getSelectedBicluster().getConditions().size();
				if (sesion.getHoveredBicluster() != null
						&& sesion.getHoveredBicluster().getConditions().size() > 0
						&& sesion.getHoveredBicluster().getConditions().size() < condOrder.length) {
					hoverCondition = condOrder[sesion.getHoveredBicluster()
							.getConditions().get(0)];
					nh = sesion.getHoveredBicluster().getConditions().size();
				}
				if (nh > 0 && nh < condOrder.length
						&& (ns == 0 || hoverCondition > ns))
					nc = ns + nh;
				else
					nc = ns;// hovering coincides with a selection

				double normalw = w1;
				double normals = normalw / canonicalw;
				double width = this.getLayoutBounds().getWidth();
				double distortedw = normalw * distortion;
				double distorteds = distortedw / canonicalw;

				double miniw = (width - distortedw * nc)
						/ (condOrder.length - nc);
				double minis = miniw / canonicalw;
				int cont = 0;

				if (distortedw * nc > maxDistortion * width) {
					distortedw = width * maxDistortion / nc;
					miniw = (m_maxWidth - distortedw * nc)
							/ (condOrder.length - nc);
					distorteds = distortedw / canonicalw;
					minis = miniw / canonicalw;
				}

				while (iter.hasNext()) {
					VisualItem item = (VisualItem) iter.next();
					if (nc == condOrder.length || nc == 0) {
						item.setSize(Math.min(normals, 1));
						item.setEndSize(Math.min(normals, 1));
						iw = normalw;

						x = w;
						setX(item, null, x + item.getBounds().getWidth());
						setY(item, null, y);
						w += iw;
					} else {
						if ((ns > 0 && cont < ns)
								|| condOrder[item.getInt("id")] == hoverCondition) {
							item.setSize(Math.min(distorteds, 2));
							item.setEndSize(Math.min(distorteds, 2));
							iw = distortedw;
							cont++;
						} else {
							item.setSize(Math.min(minis, 0.7));
							item.setEndSize(Math.min(minis, 0.7));
							iw = miniw;
						}

						x = w;
						setX(item, null, x + item.getBounds().getWidth());
						setY(item, null, y);
						w += iw;
					}
				}
				/*
				 * int nc=0;//total number of distorted conditions int
				 * ns=0;//number of selected conditions int nh=0;//number of
				 * hovered conditions int hoverCondition=-1;
				 * if(sesion.getSelectedBicluster()!=null)
				 * ns=sesion.getSelectedBicluster().getConditions().size();
				 * if(sesion.getHoveredBicluster()!=null &&
				 * sesion.getHoveredBicluster().getConditions().size()>0 &&
				 * sesion
				 * .getHoveredBicluster().getConditions().size()<condOrder.
				 * length) {
				 * hoverCondition=condOrder[sesion.getHoveredBicluster(
				 * ).getConditions().get(0)];
				 * nh=sesion.getHoveredBicluster().getConditions().size(); }
				 * if(nh>0 && nh<condOrder.length && (ns==0 ||
				 * hoverCondition>ns)) nc=ns+nh; else nc=ns;//hovering coincides
				 * with a selection
				 * 
				 * double normalw=w1;
				 * 
				 * double width=this.getLayoutBounds().getWidth(); double
				 * distortedw=normalw*distortion; double
				 * miniw=(width-distortedw*nc)/(condOrder.length-nc);
				 * 
				 * double normals=1; double
				 * minis=condOrder.length/(distortion*nc+(condOrder.length-nc));
				 * //the 2 will be distortion double
				 * distorteds=distortion*minis;
				 * 
				 * double distortedw=normalw*distorteds; double
				 * miniw=normalw*minis;
				 * 
				 * 
				 * int cont=0;
				 * 
				 * while ( iter.hasNext() ) { VisualItem item =
				 * (VisualItem)iter.next(); if(nc==condOrder.length || nc==0) {
				 * System.out.println("Normal size: "+normals);
				 * item.setSize(normals); item.setEndSize(normals); iw=normalw;
				 * } else { if((ns>0 && cont<ns) ||
				 * condOrder[item.getInt("id")]==hoverCondition) {
				 * System.out.println("Distorted size: "+distorteds);
				 * item.setSize(distorteds); item.setEndSize(distorteds);
				 * iw=distortedw; cont++; } else {
				 * System.out.println("Reduced size: "+minis);
				 * item.setSize(minis); item.setEndSize(minis); iw=miniw; } }
				 * 
				 * x = w; setX(item, null, x+item.getBounds().getWidth());
				 * setY(item, null, y); w += iw; }
				 */
			}

			// 3) NORMAL
			else {
				while (iter.hasNext()) {
					// System.out.println("escala normal:"+scale);
					VisualItem item = (VisualItem) iter.next();
					item.setSize(scale);
					item.setEndSize(scale);
					iw = (ancho - geneMargin) / (double) condOrder.length; // Escalamos
																			// también
																			// los
																			// bordes,
																			// además
																			// del
																			// tamaño
																			// del
																			// texto
					x = w;

					setX(item, null, x + item.getBounds().getWidth());
					setY(item, null, y);
					w += iw;
				}
			}
		}

		void setColumnOrder(int[] co) {
			condOrder = initialCondOrder.clone();
		}

		void newOrder(int[] conditionsFirst) {
			if (conditionsFirst != null) {
				if (conditionsFirst.length < condOrder.length) {
					int init = 0;
					for (int i = 0; i < conditionsFirst.length; i++) {
						condOrder[init] = conditionsFirst[i];// El primero pasa
																// a ocupar la
																// posición de
																// uno de los
																// que tenemos
						condOrder[conditionsFirst[i]] = init;// y viceversa
						init++;
					}
				}
			}
		}

		void initialOrder() {
			for (int i = 0; i < condOrder.length; i++)
				initialCondOrder[i] = i;
			condOrder = initialCondOrder.clone();
		}

		Double getScale() {
			return scale;
		}

		void setScale(Double scale) {
			this.scale = scale;
		}
	} // end of inner class HorizontalLineLayout

	/**
	 * Sets the expression level palette. About a hundred colors are enough for
	 * a nice palette
	 * 
	 * @param palette
	 *            the colors of the palette
	 */
	void setPalette(int[] palette) {
		this.palette = palette;
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
			JPanel panelParametros = new HeatmapParameterConfigurationPanel();
			this.setPanelParametros(panelParametros);
			JPanel panelEscala = new KeggParameterConfigurationPanel(sesion);
			this.setPanelEscala(panelEscala);
			JPanel panelBotones = this.getPanelBotones(gestor);

			// Configuramos la ventana de configuracion
			// this.initPanelConfig(panelColor, null, panelParametros,
			// panelBotones);
			this.initPanelConfig(panelColor, null, panelParametros,
					panelBotones, panelEscala);

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
		sesion.setSelectionColor(paleta[HeatmapDiagram.selectionColor]);
		sesion.setHoverColor(paleta[HeatmapDiagram.hoverColor]);

		int paletteTemp[] = ColorLib.getInterpolatedPalette(255,
				paleta[HeatmapDiagram.lowColor].getRGB(),
				paleta[HeatmapDiagram.zeroColor].getRGB());
		int paletteTemp2[] = ColorLib.getInterpolatedPalette(255,
				paleta[HeatmapDiagram.zeroColor].getRGB(),
				paleta[HeatmapDiagram.highColor].getRGB());
		palette = new int[paletteTemp.length + paletteTemp2.length];
		for (int i = 0; i < paletteTemp.length; i++)
			palette[i] = paletteTemp[i];
		for (int i = paletteTemp.length; i < palette.length; i++)
			palette[i] = paletteTemp2[i - paletteTemp.length];

		// si el tipo de escala actual es diferente al que ha seleccionado el
		// usuario...
		int scaleModeSelectedByUser = ((KeggParameterConfigurationPanel) this
				.getPanelEscala()).getScaleModeSelected();
		if (scaleModeHeatMap != scaleModeSelectedByUser) {
			// se establece ese tipo de escala en la sesión
			sesion.setScaleMode(scaleModeSelectedByUser);
			scaleModeHeatMap = scaleModeSelectedByUser;

			/*
			 * if(null != botonObtenerImagen){ botonObtenerImagen.doClick(); }
			 */
		}

		// en función del tipo de escala seleccionado se entrará por un camino u
		// otro
		if (sesion.getScaleMode() == Session.quantile) {
			exprColor = new ExpressionColorAction("matrix", "level",
					Constants.ORDINAL, VisualItem.FILLCOLOR, palette);
		} else {
			exprColor = new ExpressionColorAction("matrix", "level",
					Constants.NUMERICAL, VisualItem.FILLCOLOR, palette);
		}

		// exprColor.setMaxScale(md.max);
		// exprColor.setMinScale(md.min);

		ActionList color = (ActionList) v.getAction("color");
		color.remove(exprColor);
		color.add(exprColor);

		v.putAction("color", color);

		currentLevels.numNeighbors = new Integer(
				((HeatmapParameterConfigurationPanel) this.getPanelParametros())
						.getNumNeighbors().getText()).intValue();

		this.run();
		sesion.updateConfigExcept(this.getName());
		this.configurando = false;
	}

}
