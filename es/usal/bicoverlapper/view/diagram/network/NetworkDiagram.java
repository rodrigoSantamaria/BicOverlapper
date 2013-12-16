package es.usal.bicoverlapper.view.diagram.network;


import java.awt.BasicStroke;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import prefuse.Constants;
import prefuse.Display;
import prefuse.Visualization;
import prefuse.action.ActionList;
import prefuse.action.RepaintAction;
import prefuse.action.ItemAction;
import prefuse.action.assignment.ColorAction;
import prefuse.action.assignment.DataColorAction;
import prefuse.action.layout.graph.ForceDirectedLayout;
import prefuse.controls.DragControl;
import prefuse.controls.PanControl;
import prefuse.controls.ZoomControl;
import prefuse.controls.ZoomToFitControl;
import prefuse.controls.WheelZoomControl;
import prefuse.controls.HoverActionControl;
import prefuse.data.Node;
import prefuse.render.DefaultRendererFactory;
import prefuse.render.EdgeRenderer;
import prefuse.render.LabelRenderer;
import prefuse.util.ColorLib;
import prefuse.visual.VisualItem;

import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;

//Search Panel
import prefuse.data.query.SearchQueryBinding;
import prefuse.data.search.SearchTupleSet;
import prefuse.data.Table;
import prefuse.util.FontLib;
import prefuse.util.collections.IntIterator;
import prefuse.util.display.ExportDisplayAction;
import prefuse.util.force.ForceConfigAction;
import prefuse.util.ui.JFastLabel;
import prefuse.util.ui.JSearchPanel;
import prefuse.util.ui.UILib;
import javax.swing.BorderFactory;
import javax.swing.Box;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.SwingConstants;
import javax.swing.BoxLayout;

import net.sf.epsgraphics.ColorMode;
import net.sf.epsgraphics.EpsGraphics;

import es.usal.bicoverlapper.controller.kernel.Selection;
import es.usal.bicoverlapper.controller.kernel.Session;
import es.usal.bicoverlapper.controller.manager.configurationManager.ConfigurationMenuManager;
import es.usal.bicoverlapper.controller.util.Translator;
import es.usal.bicoverlapper.model.network.NetworkData;
import es.usal.bicoverlapper.view.configuration.panel.NetworkParameterConfigurationPanel;
import es.usal.bicoverlapper.view.diagram.Diagram;
import es.usal.bicoverlapper.view.diagram.heatmap.ExpressionColorAction;
import es.usal.bicoverlapper.view.diagram.heatmap2.HeatmapDiagram2;

import prefuse.controls.ControlAdapter;
import prefuse.data.search.PrefixSearchTupleSet;//Search
import prefuse.data.tuple.TupleSet;

//Animación de color:
import prefuse.activity.SlowInSlowOutPacer;
import prefuse.action.animate.ColorAnimator;
import prefuse.action.animate.QualityControlAnimator;
import prefuse.action.animate.VisibilityAnimator;
import prefuse.data.event.TupleSetListener;
import prefuse.data.expression.parser.ExpressionParser;
import prefuse.data.Tuple;

/**
 * This Class implements the visualization of a TRN as a force-directed layout
 * graph, based in prefuse library
 * 
 * @author Rodrigo Santamaria TODO: Superslow for thousands of nodes
 * 
 */
public class NetworkDiagram extends Diagram {

	private static final long serialVersionUID = 1L;

	// atributos del panel del diagrama
	private Session sesion;
	// private MultidimensionalData datos; // @jve:decl-index=0:
	private int alto;
	private int ancho;
	private boolean atributosIniciados = false, configurando = false,
			diagramaPintado = false;

	// definicion de margenes del diagrama

	final int margenDer = 40;
	final int margenIzq = 40;
	final int margenSup = 25;
	final int margenInf = 40;
	final int margenDiagrama = 10; // porcentaje de exceso en intervalo de
									// representacion del diagrama

	// configuracion de color
	private static final int selectionColor = 0;
	private static final int searchColor = 1;
	private static final int hoverColor = 2;
	private static final int colorActivation = 3;
	private static final int colorInhibition = 4;
	private static final int colorBackground = 5;
	private static final int avgExpColor = 6;
	private static final int lowExpColor = 7;
	private static final int highExpColor = 8;

	protected ExpressionColorThread p;

	private Color[] paleta = { null, null, null, new Color(0, 0, 0, 123),
			new Color(200, 200, 200, 123), Color.WHITE, null, null, null };
	private String[] textoLabel = { "Selection", "Search", "Hover",
			"Activation edge", "Inhibition edge", "Background",
			"Low expression color", "Average expression color",
			"High expression color" };
	private JTextField[] muestraColor = new JTextField[paleta.length];

	private static final int discretizationLevels = 0;
	private int[] parameters = { 128 };
	private String[] parameterText = { "Discretization Levels" };

	/**
	 * If it's true and there's expression data loaded, the network is mapped to
	 * the expression of every sample, iteratively, in an animation
	 */
	private boolean animateExpressionMapping = false;

	// -------------- Información propia de nuestra representación
	Visualization v; // Visualization

	public Visualization getV() {
		return v;
	}

	public void setV(Visualization v) {
		this.v = v;
	}

	Display d; // Display
	JInternalFrame frame; // Frame
	NetworkData trnd; // @jve:decl-index=0:
	NetworkFocusControl currentGenes; // @jve:decl-index=0:
	ExpressionColorAction expressionColor;
	ItemAction noFillColor;
	ItemAction nodeColor;
	ActionList color;
	DataColorAction eFill, edges;
	int[] palette = new int[] { ColorLib.gray(0, 0) };

	private SearchQueryBinding sq;

	private ForceDirectedLayout fdl;

	private LinkedList<Integer> selg;

	private LinkedList<Integer> selc;

	private JFastLabel title;

	private ExportDisplayAction eda;

	/**
	 * Default constructor
	 */
	public NetworkDiagram() {
		super();
		// initialize();
	}

	/**
	 * Session Constructor
	 * 
	 * @param session
	 *            Session in which this diagram is in. It must have TRN data
	 *            loaded
	 * @param dim
	 *            Dimension for this diagram
	 */
	public NetworkDiagram(Session session, Dimension dim) {
		super(new BorderLayout());
		int num = session.getNumTRNDiagrams();
		this.setName("Biological Network " + num);
		this.sesion = session;
		this.trnd = session.getTRNData();
		this.alto = (int) dim.getHeight();
		this.ancho = (int) dim.getWidth();
		this.setPreferredSize(new Dimension(ancho, alto));
		this.setSize(ancho, alto);

		paleta[NetworkDiagram.selectionColor] = sesion.getSelectionColor();
		paleta[NetworkDiagram.searchColor] = sesion.getSearchColor();
		paleta[NetworkDiagram.hoverColor] = sesion.getHoverColor();

		paleta[NetworkDiagram.lowExpColor] = sesion.getLowExpColor();
		paleta[NetworkDiagram.avgExpColor] = sesion.getAvgExpColor();
		paleta[NetworkDiagram.highExpColor] = sesion.getHiExpColor();
		
		this.addKeyListener(sesion);	
		
	}

	/**
	 * Takes the TRN data again loaded in the Session an rebuilds the diagram
	 */
	public void updateData() {
		this.trnd = sesion.getTRNData();
		this.repaint();
	}

	private void iniciarAtributos() {
		trnd = sesion.getTRNData(); // Iniciamos los datos de la vista
		atributosIniciados = true;
	}

	/**
	 * Generates the trn graph
	 * 
	 */
	public void create() {
		iniciarAtributos();
		create(trnd);
	}

	/**
	 * Constructs a JPanel with all prefuse stuff to represent a Transcriptional
	 * Regulatory Network with a Directed Acylic Graph
	 * 
	 * @param trnd
	 *            - Graph to be represented
	 */
	void create(NetworkData trnd) {
		// ----------------------------------VISUALIZATION
		v = new Visualization();
		v.add("graph", trnd.getGraph()); // Le añadimos el grafo
		// v.addFocusGroup("ingroup('_bicluster_')");//Grupo de biclusters
		v.getGroup("graph.nodes").addColumn("expressionLevel", double.class);
		Iterator it = v.items("graph.nodes");
		while (it.hasNext()) {
			VisualItem item = (VisualItem) it.next();
			if(sesion.getMicroarrayData()!=null)
				item.setString("name",
					sesion.getMicroarrayData().getRowLabel(item.getInt("id")));
		}


		// Hacemos más gruesos los bordes para poderlos utilizar en la
		// interacción
		TupleSet ts = v.getGroup("graph.nodes");
		it = ts.tuples();
		BasicStroke bs = new BasicStroke(3);
		while (it.hasNext()) {
			VisualItem vi = (VisualItem) it.next();
			vi.setStroke(bs);
		}

		// Forma de los nodos (etiquetados por nombre, redondeados)
		LabelRenderer r = new LabelRenderer("name");
		r.setRoundedCorner(8, 8); // round the corners

		// Forma de las aristas (dirigidas, curvadas)
		EdgeRenderer edgeRenderer = null;
		if (trnd.getGraph().isDirected()) {
			edgeRenderer = new EdgeRenderer(Constants.EDGE_TYPE_CURVE,
					Constants.EDGE_ARROW_FORWARD);
			edgeRenderer.setArrowHeadSize(5, 10);
		} else
			edgeRenderer = new EdgeRenderer(Constants.EDGE_TYPE_CURVE,
					Constants.EDGE_ARROW_NONE);

		// Renderer con etiquetas y aristas
		v.setRendererFactory(new DefaultRendererFactory(r, edgeRenderer));

		// --------- color
		int[] ePalette = new int[] {
				paleta[NetworkDiagram.colorActivation].getRGB(),
				ColorLib.gray(100, 123),
				paleta[NetworkDiagram.colorInhibition].getRGB() };

		// Item action (colores de los nodos y sus etiquetas bajo distintas
		// circunstancias)
		nodeColor = new NodeColorAction("graph.nodes", VisualItem.STROKECOLOR,
				sesion.getHoverColor().darker(), sesion.getSearchColor(),
				sesion.getSelectionColor());
		// ItemAction textColor=new TextColorAction("graph.nodes");

		// map nominal data values to colors using our provided palette
		ColorAction text = new ColorAction("graph.nodes",
		// VisualItem.TEXTCOLOR, ColorLib.gray(200));
				VisualItem.TEXTCOLOR, ColorLib.gray(0));

		// use light grey for edges
		// ColorAction edges = new ColorAction("graph.edges",
		// VisualItem.STROKECOLOR, ColorLib.gray(200));
		edges = new DataColorAction("graph.edges", "type", Constants.NOMINAL,
				VisualItem.STROKECOLOR, ePalette);
		eFill = new DataColorAction("graph.edges", "type", Constants.NOMINAL,
				VisualItem.FILLCOLOR, ePalette);
		
		
		palette=sesion.getExpPalette();

		expressionColor = new ExpressionColorAction("graph.nodes",
				"expressionLevel", Constants.ORDINAL, VisualItem.FILLCOLOR,
				palette);
		
		noFillColor = new ColorAction("graph.nodes", VisualItem.FILLCOLOR,
				ColorLib.rgba(255, 255, 255, 200));
		// create an action list containing all color assignments
		color = new ActionList();
		color.add(text);
		color.add(edges);
		color.add(eFill);

		color.add(nodeColor);
		// color.add(textColor);

		color.add(noFillColor);

		color.add(new RepaintAction());
		v.putAction("color", color);

		// layout
		// ActionList layout = new ActionList(Activity.INFINITY);
		ActionList layout = new ActionList(10000);// Mejor, se queda quieto al
													// fin
		fdl = new ForceDirectedLayout("graph");
		fdl.setLayoutAnchor((Point2D) (new Point2D.Double(1024, 768)));
		layout.add(fdl);
		layout.add(new RepaintAction());
		v.putAction("layout", layout);

		// filtering
		ActionList filter = new ActionList();
		filter.add(nodeColor);
		filter.add(new RepaintAction());
		v.putAction("filter", filter);

		// animated transition
		ActionList animate = new ActionList(1250);
		animate.setPacingFunction(new SlowInSlowOutPacer());
		animate.add(new QualityControlAnimator());
		animate.add(new VisibilityAnimator("graph"));
		// animate.add(new PolarLocationAnimator("graph.nodes", linear));
		animate.add(new ColorAnimator("graph.nodes"));
		animate.add(new RepaintAction());
		v.putAction("animate", animate);
		v.alwaysRunAfter("filter", "animate");
		v.alwaysRunAfter("layout", "animate");// //Igual queda un poco mal

		// animate paint change
		ActionList animatePaint = new ActionList(400);
		animatePaint.add(new ColorAnimator("graph.nodes"));
		animatePaint.add(new RepaintAction());
		v.putAction("animatePaint", animatePaint);

		// Escucha por cambios en el conjunto de elementos encontrados
		SearchTupleSet sts = new PrefixSearchTupleSet();// Le añadimos un
														// conjunto de búsqueda
		v.addFocusGroup(Visualization.SEARCH_ITEMS, sts);
		sts.addTupleSetListener(new TupleSetListener() {
			public void tupleSetChanged(TupleSet t, Tuple[] add, Tuple[] rem) {
				v.cancel("animatePaint");
				v.run("color");
				v.run("animatePaint");
			}
		});

		// ----- display
		// create a new Display that pull from our Visualization
		if (d == null) {
			d = new Display(v);
			d.setSize(800, 600); // set display size
			d.setHighQuality(true);
			d.pan(400, 300);

			d.addControlListener(new DragControl()); // drag items around
			d.addControlListener(new PanControl()); // pan with background
													// left-drag
			d.addControlListener(new ZoomControl()); // zoom with vertical
														// right-drag
			d.addControlListener(new WheelZoomControl()); // zoom to fit screen
			d.addControlListener(new ZoomToFitControl()); // zoom to fit screen
			d.addControlListener(new HoverActionControl("color")); // zoom with
																	// vertical
																	// right-drag
			currentGenes = new NetworkFocusControl(sesion, "filter",
					Visualization.FOCUS_ITEMS, v);
			d.addControlListener(currentGenes); // zoom with vertical right-drag
			// FRAME
			this.getWindow().add(d);
		} else
			d.setVisualization(v);

		eda=new ExportDisplayAction(d);
		this.registerKeyboardAction(eda, "export display", KeyStroke.getKeyStroke("ctrl P"), WHEN_FOCUSED);
	
		title = new JFastLabel("                 ");
		title.setPreferredSize(new Dimension(350, 20));
		title.setVerticalAlignment(SwingConstants.BOTTOM);
		title.setBorder(BorderFactory.createEmptyBorder(3, 0, 0, 0));
		title.setFont(FontLib.getFont("Tahoma", Font.PLAIN, 16));

		Box box = new Box(BoxLayout.X_AXIS);
		box.add(Box.createHorizontalStrut(10));
		box.add(title);
		box.add(Box.createHorizontalGlue());

		this.add(d, BorderLayout.CENTER); // El display con el grafo
		this.add(box, BorderLayout.SOUTH); // La caja de búsqueda

		Color BACKGROUND = Color.WHITE;
		Color FOREGROUND = Color.DARK_GRAY;

		UILib.setColor(this, BACKGROUND, FOREGROUND);
		this.getWindow().setContentPane(this);
		this.getWindow().pack(); // layout components in window
	}

	/**
	 * Runs the visualizations of the diagram.
	 * 
	 */
	public void run() {
		this.getWindow().setVisible(true);

		v.run("color"); // assign the colors
		v.run("layout"); // start up the animated layout
		v.run("filter");
		v.run("animate");
	}

	/**
	 * Repaints the Diagram, taking into account the selections in the Session
	 */
	public void repaint() {
		// Miramos qué tenemos que hacer con posibles selecciones de biclusters
		if (v != null && sesion != null){
			//	&& sesion.getSelectedBicluster() != null) {
			// LinkedList l=sesion.getSelectedGenesBicluster();
			// Quitamos todos los que estuvieran antes en el bicluster			
			//if (selg == null || !selg.equals(sesion.getSelectedGenesBicluster())) {
				currentGenes.clear();


				if (selg != null && selg.size() > 0) {// marcamos como
														// seleccionados todos
														// los nodos uqe estén
														// en l

					int inicio = 0;
					for (int i = inicio; i < selg.size(); i++)// Las que vienen
																// de las
																// burbujas
																// meten un
																// elemento
																// primero!!!
					{
						IntIterator it = trnd
								.getGraph()
								.getNodeTable()
								.rows(ExpressionParser.predicate("id="
										+ selg.get(i)));
						if (it.hasNext()) {
							Node n = trnd.getGraph().getNode(
									(Integer) it.next());
							VisualItem item = v.getVisualItem("graph.nodes", n);
							currentGenes.addItem(item);
						}
					}
				}
			//}
			if (selc != null && selc.size() >= 1 && selc.size()<sesion.getMicroarrayData().getNumConditions()) {
				Iterator it = v.items("graph.nodes");

				while (it.hasNext()) {
					VisualItem item = (VisualItem) it.next();
					double exp = 0;
					for (Object i : selc)
						// Compute average of expression levels for the condition
						exp += sesion.getMicroarrayData().getExpressionAt(
								item.getInt("id"), (Integer) i);
					exp /= selc.size();
					item.setDouble("expressionLevel", exp);
				}
				color.remove(noFillColor);
				color.add(expressionColor);
			} else {
				color.add(noFillColor);
				color.remove(expressionColor);
			}
			v.removeGroup("color");
			v.putAction("color", color);

			v.cancel("animatePaint");
			v.run("color");
			v.run("animatePaint");
		}
	}

	/*
	 * Add a search box binded to TRN View
	 */
	void setSearchQueryBinding(SearchQueryBinding sq) {
		// Caja de búsqueda:
		JSearchPanel search = sq.createSearchPanel();
		search.setShowResultCount(true);
		search.setBorder(BorderFactory.createEmptyBorder(5, 5, 4, 0));
		search.setFont(FontLib.getFont("Tahoma", Font.PLAIN, 11));

		final JFastLabel title = new JFastLabel("                 ");
		title.setPreferredSize(new Dimension(200, 20));
		title.setVerticalAlignment(SwingConstants.BOTTOM);
		title.setBorder(BorderFactory.createEmptyBorder(3, 0, 0, 0));
		title.setFont(FontLib.getFont("Tahoma", Font.PLAIN, 16));

		d.addControlListener(new ControlAdapter() {
			public void itemEntered(VisualItem item, MouseEvent e) {
				if (item.canGetString("id"))
					title.setText(item.getString("resultType") + " "
							+ item.getString("id"));
			}

			public void itemExited(VisualItem item, MouseEvent e) {
				title.setText(null);
			}
		});

		Box box = new Box(BoxLayout.X_AXIS);
		box.add(Box.createHorizontalStrut(10));
		box.add(title);
		box.add(Box.createHorizontalGlue());
		box.add(search);
		box.add(Box.createHorizontalStrut(3));

		frame.getContentPane().add(box, BorderLayout.SOUTH);
	}

	/**
	 * Updates the Diagram with the session layer current information.
	 */
	public void update() {
		if (v != null && sesion != null
				&& sesion.getSelectedBicluster() != null) {
			selg = sesion.getSelectedGenesBicluster();
			selc = sesion.getSelectedConditionsBicluster();
		}
		else if(sesion.getSelectedBicluster()==null && selg!=null && selc!=null)
			{
			selg.clear();
			selc.clear();
			}
		
		synchronized (this) {
			this.repaint();
		}
	}
	
	public void printFigure(File f, int type)
		{
		eda.actionPerformed(new ActionEvent(this,43,"export"));
		}

	public void changeLabels() {
		Iterator it = v.items("graph.nodes");
		while (it.hasNext()) {
			VisualItem item = (VisualItem) it.next();
			item.setString("name",
					sesion.getMicroarrayData().getRowLabel(item.getInt("id")));
		}

		sq = new SearchQueryBinding((Table) v.getGroup("graph.nodes"), "name",
				(SearchTupleSet) v.getGroup(Visualization.SEARCH_ITEMS));
		JSearchPanel search = sq.createSearchPanel();
		search.setShowResultCount(true);
		search.setBorder(BorderFactory.createEmptyBorder(5, 5, 4, 0));
		search.setFont(FontLib.getFont("Tahoma", Font.PLAIN, 11));
	}

	public void updateConfig() {
		paleta[NetworkDiagram.selectionColor] = sesion.getSelectionColor();
		paleta[NetworkDiagram.searchColor] = sesion.getSearchColor();
		paleta[NetworkDiagram.hoverColor] = sesion.getHoverColor();

		nodeColor = new NodeColorAction("graph.nodes", VisualItem.STROKECOLOR,
				sesion.getHoverColor().darker(), sesion.getSearchColor(),
				sesion.getSelectionColor());

		// create an action list containing all color assignments
		ActionList color = (ActionList) v.getAction("color");
		color.remove(nodeColor);
		color.add(nodeColor);
		v.putAction("color", color);

		// filtering
		ActionList filter = (ActionList) v.getAction("filter");
		filter.remove(nodeColor);
		filter.add(nodeColor);
		v.putAction("filter", filter);

		ActionList animate = (ActionList) v.getAction("layout");
		animate.setDuration(0);

		// Color
		expressionColor = new ExpressionColorAction("graph.nodes",
				"expressionLevel", Constants.NUMERICAL, VisualItem.FILLCOLOR,
				//palette);
				sesion.getExpPalette());
		expressionColor.setMaxScale(sesion.getMicroarrayData().max);
		expressionColor.setMinScale(sesion.getMicroarrayData().min);

		synchronized (this) {
			run();
			this.repaint();
			this.configurando = false;
		}
	}

		public int getId() {
		return es.usal.bicoverlapper.controller.kernel.Configuration.TRN_ID;
	}

	/**
	 * Pops up a configuration panel for parallel coordinates properties TODO:
	 * Still in development
	 */
	public void configure() {
		if (!configurando) {
			configurando = true;

			// Obtenemos y configuramos la ventana de configuracion

			JInternalFrame ventanaConfig = this.getVentanaConfig();

			// Obtenemos el gestor de eventos de configuracion

			// GestorMenuConfiguracion gestor = new
			// GestorMenuConfiguracion(this,ventanaConfig,paleta,muestraColor);
			// ConfigurationMenuManager gestor = new
			// ConfigurationMenuManager(this,ventanaConfig,paleta,muestraColor,
			// colorVarSelec);
			ConfigurationMenuManager gestor = new ConfigurationMenuManager(
					this, ventanaConfig, paleta, muestraColor);

			// Creamos los paneles de configuracion

			// this.crearPanelParametros();

			JPanel panelColor = this.getPanelPaleta(paleta, textoLabel,
					muestraColor);
			// JPanel panelParametros = this.getParameterPanel();
			if (this.getPanelParametros() == null)
				this.setPanelParametros(new NetworkParameterConfigurationPanel(
						fdl));
			// this.setPanelParametros(panelParametros);

			// JPanel panelAnclajes = this.getPanelAnclajes(sesion, gestor);
			// JPanel panelParametros = this.getPanelParametros();
			JPanel panelBotones = this.getPanelBotones(gestor);

			// Configuramos la ventana de configuracion

			// this.initPanelConfig(panelColor, panelAnclajes, panelParametros,
			// panelBotones);
			// this.initPanelConfig(panelColor, null, null, panelBotones);
			this.initPanelConfig(panelColor, null, this.getPanelParametros(),
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

	private JPanel getParameterPanel() {
		JPanel forcesPanel = new JPanel();
		forcesPanel.setLayout(new BoxLayout(forcesPanel, BoxLayout.Y_AXIS));

		ForceConfigAction fca = new ForceConfigAction(null,
				fdl.getForceSimulator());
		JButton jb = new JButton("Forces");
		jb.addActionListener(fca);
		forcesPanel.add(jb);

		JCheckBox jcb = new JCheckBox("Start expression animation");
		jcb.setSelected(false);
		jcb.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					if (p != null) {
						p = new ExpressionColorThread();
						p.setPriority(Thread.MIN_PRIORITY);
					}
					p.start();
				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					if (p != null)
						p.stop = true;
				}

			}
		});

		forcesPanel.add(jcb);
		return forcesPanel;
	}

	/**
	 * Notifies the end of configuration
	 */
	public void endConfig(boolean ok) {
		if (!ok) {
			configurando = false;
			return;
		}

		sesion.setSelectionColor(paleta[NetworkDiagram.selectionColor]);
		sesion.setSearchColor(paleta[NetworkDiagram.searchColor]);
		sesion.setHoverColor(paleta[NetworkDiagram.hoverColor]);

		int[] ePalette = new int[] {
				paleta[NetworkDiagram.colorActivation].getRGB(),
				ColorLib.gray(100, 123),
				paleta[NetworkDiagram.colorInhibition].getRGB() };
		nodeColor = new NodeColorAction("graph.nodes", VisualItem.STROKECOLOR,
				sesion.getHoverColor().darker(), sesion.getSearchColor(),
				sesion.getSelectionColor());

		edges = new DataColorAction("graph.edges", "type", Constants.NOMINAL,
				VisualItem.STROKECOLOR, ePalette);
		eFill = new DataColorAction("graph.edges", "type", Constants.NOMINAL,
				VisualItem.FILLCOLOR, ePalette);

		sesion.setAvgExpColor(paleta[NetworkDiagram.avgExpColor]);
		sesion.setLowExpColor(paleta[NetworkDiagram.lowExpColor]);
		sesion.setHiExpColor(paleta[NetworkDiagram.highExpColor]);
		sesion.buildPalette();
		
		expressionColor = new ExpressionColorAction("graph.nodes",
				"expressionLevel", Constants.ORDINAL, VisualItem.FILLCOLOR,
//				palette);
				sesion.getExpPalette());
		
		// create an action list containing all color assignments
		ActionList color = (ActionList) v.getAction("color");
		color.remove(nodeColor);
		color.remove(edges);
		color.remove(eFill);
		color.remove(expressionColor);

		color.add(edges);
		color.add(eFill);
		color.add(nodeColor);
		color.add(expressionColor);

		v.putAction("color", color);

		// filtering
		ActionList filter = (ActionList) v.getAction("filter");
		filter.remove(nodeColor);
		filter.add(nodeColor);
		v.putAction("filter", filter);

		this.run();
		this.configurando = false;

		if (((NetworkParameterConfigurationPanel) this.getPanelParametros())
				.getAnimateExpression().isSelected()) {
			if (sesion.getMicroarrayData() != null) {
				if (p == null) {
					p = new ExpressionColorThread();
					p.setPriority(Thread.MIN_PRIORITY);
				}
				p.start();
			}
		} else {
			if (p != null)
				p.stop = true;
		}
	}

	/**
	 * Set node fill colors
	 */
	/*
	 * static class ExpressionColorAction extends DataColorAction {
	 * ExpressionColorAction(String group, String sel, int[] palette) {
	 * super(group, sel, Constants.ORDINAL, VisualItem.FILLCOLOR, palette);
	 * //add("_hover", ColorLib.gray(120,229)); //Pinta amarillo si pasamos por
	 * encima de un nodo // add("ingroup('_search_')",
	 * ColorLib.rgba(0,255,0,250)); // add("ingroup('_focus_')",
	 * ColorLib.rgba(255,0,255,229));//Pinta morado si pinchamos en un nodo //
	 * add("ingroup('_bicluster_')", ColorLib.rgba(255,255,0,229));//Pinta
	 * morado si pinchamos en un nodo } } // end of inner class NodeColorAction
	 */
	static class NodeColorAction extends ColorAction {
		NodeColorAction(String group, String field, Color hoverColor,
				Color searchColor, Color selectionColor) {
			super(group, field, ColorLib.gray(0, 0));

			// add("_hover", ColorLib.gray(120,229)); //Pinta amarillo si
			// pasamos por encima de un nodo
			add("_hover", ColorLib.rgba(hoverColor.getRed(),
					hoverColor.getGreen(), hoverColor.getBlue(),
					hoverColor.getAlpha())); // Pinta amarillo si pasamos por
												// encima de un nodo
			add("ingroup('_search_')", ColorLib.rgba(searchColor.getRed(),
					searchColor.getGreen(), searchColor.getBlue(),
					searchColor.getAlpha()));// Verde los buscados
			add("ingroup('_focus_')", ColorLib.rgba(selectionColor.getRed(),
					selectionColor.getGreen(), selectionColor.getBlue(),
					selectionColor.getAlpha()));

			add("ingroup('_bicluster_')", ColorLib.rgba(255, 255, 0, 229));
		}
	} // end of inner class NodeColorAction

	/**
	 * Set node label colors
	 */
	static class TextColorAction extends ColorAction {
		TextColorAction(String group) {
			super(group, VisualItem.TEXTCOLOR, ColorLib.gray(0));
			add("_hover", ColorLib.rgb(255, 0, 0));
		}
	} // end of inner class NodeColorAction

	/**
	 * This class inits all the libraries and soap services required to get gene
	 * annotations
	 * 
	 * @author Rodrigo
	 * 
	 */
	private class ExpressionColorThread extends Thread {
		public boolean stop = false;

		ExpressionColorThread() {
		}

		/**
		 * Iterated over each sample coloring the network in an animation until
		 * it is stopped
		 */
		public void run() {
			if (sesion.getMicroarrayData() == null)
				return;
			try {
				Iterator it = v.items("graph.nodes");
				color.remove(noFillColor);
				color.add(expressionColor);

				selg = new LinkedList<Integer>();
				if (sesion != null && sesion.getSelectedBicluster() != null)
					selg = sesion.getSelectedGenesBicluster();
				selc = new LinkedList<Integer>();
				
				// TODO: smooth transitions? -> use of end/start color in 3s.
				while (!stop) {
					//System.out.println("running the animation");
					for (int i = 0; i < sesion.getMicroarrayData()
							.getNumConditions(); i++) {
						title.setText(sesion.getMicroarrayData()
								.getColumnLabel(i));
						System.out.println("for condition " + i);
						selc.clear();
						selc.add(i);
						Selection bs = new Selection(selg, selc);
						Selection bsant = new Selection(
								new LinkedList<Integer>(),
								new LinkedList<Integer>());
						if (sesion != null
								&& sesion.getSelectedBicluster() != null)
							bsant = sesion.getSelectedBicluster();

						sesion.setSelectedBiclustersOnly(bs, "etwork");
						update();

						Thread.sleep(3000);
						sesion.setSelectedBicluster(bsant);
					}
					stop=true;
				}
				color.remove(expressionColor);
				color.add(noFillColor);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
