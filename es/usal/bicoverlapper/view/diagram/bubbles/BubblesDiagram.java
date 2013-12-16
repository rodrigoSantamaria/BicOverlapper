package es.usal.bicoverlapper.view.diagram.bubbles;

import java.awt.geom.Point2D;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

import prefuse.Constants;
import prefuse.Display;
import prefuse.Visualization;
import prefuse.action.ActionList;
import prefuse.action.RepaintAction;
import prefuse.action.ItemAction;
import prefuse.action.assignment.ColorAction;
import prefuse.action.assignment.DataColorAction;
import prefuse.action.assignment.ShapeAction;
import prefuse.action.assignment.DataSizeAction;
import prefuse.action.assignment.StrokeAction;
import prefuse.action.layout.AxisLayout;
import prefuse.controls.DragControl;
import prefuse.controls.PanControl;
import prefuse.controls.ZoomControl;
import prefuse.controls.ZoomToFitControl;
import prefuse.controls.WheelZoomControl;
import prefuse.controls.HoverActionControl;
import prefuse.render.AbstractShapeRenderer;
import prefuse.render.DefaultRendererFactory;
import prefuse.render.LabelRenderer;
import prefuse.render.ShapeRenderer;
import prefuse.util.ColorLib;
import prefuse.visual.VisualItem;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

//Search Panel
import prefuse.data.query.SearchQueryBinding;
import prefuse.data.search.SearchTupleSet;
import prefuse.data.Table;
import prefuse.util.FontLib;
import prefuse.util.display.ExportDisplayAction;
import prefuse.util.ui.JFastLabel;
import prefuse.util.ui.JSearchPanel;
import prefuse.util.ui.UILib;
import javax.swing.BorderFactory;
import javax.swing.Box;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Shape;
import java.beans.PropertyVetoException;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

import javax.swing.SwingConstants;
import javax.swing.BoxLayout;

import es.usal.bicoverlapper.controller.kernel.Selection;
import es.usal.bicoverlapper.controller.kernel.Session;
import es.usal.bicoverlapper.controller.manager.configurationManager.ConfigurationMenuManager;
import es.usal.bicoverlapper.controller.util.Translator;
import es.usal.bicoverlapper.model.bubble.GroupsData;
import es.usal.bicoverlapper.view.diagram.Diagram;
import es.usal.bicoverlapper.view.main.DiagramWindow;
import prefuse.controls.ControlAdapter;
import prefuse.data.search.PrefixSearchTupleSet;//Search
import prefuse.data.tuple.TupleSet;

//Animación de color:
import prefuse.activity.SlowInSlowOutPacer;
import prefuse.action.animate.ColorAnimator;
import prefuse.action.animate.QualityControlAnimator;
import prefuse.action.animate.VisibilityAnimator;
import prefuse.data.event.TupleSetListener;
import prefuse.data.Tuple;

/**
 * This Diagram gets a set of biclusters an represents them as transparent,
 * colored, maybe overlapped circles. Radius of the circles are determined by
 * the size in expression levels of the biclusters. Transparency is given by the
 * homogeneity of the bicluster (STILL IN DEVELOPMENT) Position is given by
 * considering gene and conditions as multidimensional points and projecting
 * them to 2D by some multidimensional technique (@see createAxisLayout for more
 * information of the projection implemented at this moment)
 * 
 * @author Rodrigo Santamaría
 * 
 */
public class BubblesDiagram extends Diagram {

	private static final long serialVersionUID = 1L;

	// atributos del panel del diagrama
	private Session sesion;
	private int alto;
	private int ancho;
	private boolean atributosIniciados = false, configurando = false,
			diagramaPintado = false;

	// definicion de margenes del diagrama

	private final int margenDer = 40;
	private final int margenIzq = 40;
	private final int margenSup = 25;
	private final int margenInf = 40;
	private final int margenDiagrama = 10; // porcentaje de exceso en intervalo
											// de representacion del diagrama

	// configuracion de color
	private static final int selectionColor = 0;
	private static final int searchColor = 1;
	private static final int hoverColor = 2;
	private static final int bicColor1 = 3;
	private static final int bicColor2 = 4;
	private static final int bicColor3 = 5;
	private static final int backgroundColor = 9;

	private Color[] paleta = { null, null, null, null, null, null, Color.WHITE };
	private String[] textoLabel = { "Selection", "Search", "Hover", "Set 1",
			"Set 2", "Set 3", "Background" };
	private JTextField[] muestraColor = new JTextField[paleta.length];

	// atributos de configuracion anclajes

	private DiagramWindow itemToAdd, itemToRemove;

	// Información propia de nuestra visualización
	private Visualization v; // Visualization
	private Display d; // Display
	private JInternalFrame frame; // Frame
	private GroupsData bd;
	private BubbleFocusControl currentBiclusters;
	private ItemAction nodeColor, nodeStroke;
	private JSearchPanel search;

	private ZoomToFitControl zfc;

	private JFastLabel label;

	private ExportDisplayAction eda;

	/**
	 * Default constructor
	 */
	public BubblesDiagram() {
		super();
	}

	/**
	 * Session constructor
	 * 
	 * @param session
	 *            Session layer linked to this diagram
	 * @param dim
	 *            Default dimension for this diagram
	 */
	public BubblesDiagram(Session session, Dimension dim) {
		super(new BorderLayout());//
		int num = session.getNumBubbleMapDiagrams();
		this.setName("Bubble Map " + num);
		this.sesion = session;
		this.bd = session.getBubbleData();
		this.alto = (int) dim.getHeight();
		this.ancho = (int) dim.getWidth();
		this.setPreferredSize(new Dimension(ancho, alto));
		this.setSize(ancho, alto);

		paleta[BubblesDiagram.selectionColor] = sesion.getSelectionColor();
		paleta[BubblesDiagram.searchColor] = sesion.getSearchColor();
		paleta[BubblesDiagram.hoverColor] = sesion.getHoverColor();
		paleta[BubblesDiagram.bicColor1] = sesion.getBicSet1();
		paleta[BubblesDiagram.bicColor2] = sesion.getBicSet2();
		paleta[BubblesDiagram.bicColor3] = sesion.getBicSet3();

		// Inicializamos los atributos si al iniciar el diagrama hay datos
		// cargados
		if (session.dataLoaded())
			this.iniciarAtributos();
		
		
	}

	private void iniciarAtributos() {
		atributosIniciados = true;
	}

	/**
	 * Updates the diagram with session layer information
	 */
	public void updateData() {
		this.bd = sesion.getBubbleData();
		this.repaint();
	}

	/**
	 * Override() Diagram.update to deal with gene or condition selections
	 */
	public void update() {
		Selection bs = sesion.getSelectedBicluster();
		currentBiclusters.setSelectedBiclustersIntersection(bs);
		v.run("color");
		repaint();
	}

	public int getId() {
		return es.usal.bicoverlapper.controller.kernel.Configuration.BUBBLE_MAP_ID;
	}

	/**
	 * Constructs all prefuse internal structure to represent a bubble diagram
	 * with the following projection. 1) Take the conditions, in order, as a
	 * m-dimensional point c1,c2, ...,cm. 2) Take the genes, in order, as a
	 * n-dimensional point g1,g2, ...,gn. 3) Determine each bicluster (Bk)
	 * points Ck and Gk, where Ck=ck1,...ckm, with cki=1 if condition i is in
	 * the bicluster Bk and 0 otherwise (the same for Gk and genes). 4) Multiply
	 * Ck and Gk by CC=(1,2,3...,m) and GG=(1,2,3,...,n). 5) An divide the
	 * results by m and n, respectively. 6) Take the following results as x (Gk)
	 * and y (Ck). 7) Draw the corresponding bubble at (x,y).
	 */
	public void createAxisLayout() {
		// ----------------------------------VISUALIZATION
		v = new Visualization();
		ArrayList<Integer> components=new ArrayList<Integer>();
		components.add(1);	components.add(2);
		double[][] coords=sesion.getAnalysis().getPrincipalComponents(sesion.getBiclusterDataFile(), components);
		double[]x=new double[bd.getGraph().getNodeCount()];
		double[]y=new double[bd.getGraph().getNodeCount()];
		for(int i=0;i<bd.getGraph().getNodeCount();i++)
			{
			x[i]=coords[i][0];
			y[i]=coords[i][1];
			}
		bd.setCoordinates(x, y);
		bd.buildGraphFromProjection();
		v.add("graph", bd.getGraph()); // Le añadimos el grafo

		v.setRendererFactory(new DefaultRendererFactory(new ShapeRenderer()));
		//LabelRenderer lr=new LabelRenderer("name");
		//lr.setRoundedCorner(100, 100);
		//v.setRendererFactory(new DefaultRendererFactory(lr));
		/*DefaultRendererFactory rf=new DefaultRendererFactory();
		rf.setDefaultRenderer(new ShapeRenderer());
		
		LabelRenderer lr=new LabelRenderer("name");
		//lr.setRenderType(AbstractShapeRenderer.RENDER_TYPE_DRAW);
		rf.add("graph.nodes", lr);
	
		v.setRendererFactory(rf);
		*/
		int[] paletaTipos = new int[] { sesion.getBicSet1().getRGB(),
				sesion.getBicSet2().getRGB(), sesion.getBicSet3().getRGB() };

		nodeColor = new NodeColorAction("graph.nodes", "resultType",
				"homogeneity", paletaTipos, v);// Pasarle homogeneidad
		ItemAction nodeShape = new NodeShapeAction("graph.nodes",
				Constants.SHAPE_ELLIPSE);
		ItemAction nodeSize = new NodeSizeAction("graph.nodes", "size", 100,
				Constants.LINEAR_SCALE);// En el futuro, tb goodness TODO:
										// linear scale no es la mejor manera si
										// son círculos

		ItemAction nodeWidth = new NodeSizeAction("graph.nodes", "width", 100,
				Constants.LINEAR_SCALE);// En el futuro, tb goodness TODO:
										// linear scale no es la mejor manera si
										// son círculos
		ItemAction nodeHeight = new NodeSizeAction("graph.nodes", "height",
				100, Constants.LINEAR_SCALE);// En el futuro, tb goodness TODO:
												// linear scale no es la mejor
												// manera si son círculos

		
		nodeStroke = new NodeStrokeAction("graph.nodes",
				sesion.getHoverColor(), sesion.getSelectionColor(),
				sesion.getSearchColor());// En el futuro, tb goodness TODO:
											// linear scale no es la mejor
											// manera si son círculos
		
		NodeStrokeWidthAction strokeWidth=new NodeStrokeWidthAction("graph.nodes",1,3);
		ItemAction textColor = new TextColorAction("graph.nodes");

		// create an action list containing all color assignments
		ActionList color = new ActionList();
		color.add(nodeColor);
		color.add(nodeSize);
		color.add(nodeWidth);
		color.add(nodeHeight);
		color.add(nodeShape);
		color.add(nodeStroke);
		color.add(strokeWidth);
		//color.add(textColor);
		color.add(new RepaintAction());
		v.putAction("color", color);

		// layout
		ActionList layout = new ActionList(5);
		AxisLayout al = new AxisLayout("graph.nodes", "x", Constants.X_AXIS);
		AxisLayout a2 = new AxisLayout("graph.nodes", "y", Constants.Y_AXIS);
		al.setLayoutAnchor((Point2D) (new Point2D.Double(1024, 768)));
		a2.setLayoutAnchor((Point2D) (new Point2D.Double(1024, 768)));
		al.setMargin(50, 50, 50, 50);
		a2.setMargin(50, 50, 50, 50);
		layout.add(al);
		layout.add(a2);
		layout.add(new RepaintAction());

		v.putAction("layout", layout);

		// filtering
		ActionList filter = new ActionList();
		//filter.add(textColor);
		filter.add(nodeColor);
		filter.add(new RepaintAction());
		v.putAction("filter", filter);

		// animated transition
		ActionList animate = new ActionList(1250);
		animate.setPacingFunction(new SlowInSlowOutPacer());
		animate.add(new QualityControlAnimator());
		animate.add(new VisibilityAnimator("graph"));
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
				v.run("layout");
				v.run("filter");
				v.run("animate");
			}
		});

		// ----- display
		// create a new Display that pull from our Visualization
		//try{
		 //java.awt.EventQueue.invokeAndWait(new Runnable(){
		//	   public void run(){
				   d = new Display(v);
		//		 }
		//   });
		//}catch(Exception e){e.printStackTrace();}
		
		//d = new Display(v);
		d.setHighQuality(true);

		d.addControlListener(new DragControl()); // drag items around
		d.addControlListener(new PanControl()); // pan with background left-drag
		d.addControlListener(new ZoomControl()); // zoom with vertical
													// right-drag
		
		zfc=new ZoomToFitControl();
		d.addControlListener(new WheelZoomControl()); // zoom to fit screen
		d.addControlListener(zfc); // zoom to fit screen
		d.addControlListener(new HoverActionControl("color")); // changes color of passing by biclusters
		currentBiclusters = new BubbleFocusControl(sesion, "filter",
				Visualization.FOCUS_ITEMS, v);
		d.addControlListener(currentBiclusters);

	/*
		//try{
		//SwingUtilities.invokeLater(new Runnable(){
		//SwingUtilities.invokeAndWait(new Runnable(){
						
		//	public void run(){
				// Caja de búsqueda:
				SearchQueryBinding sq = new SearchQueryBinding(
						(Table) v.getGroup("graph.nodes"), "genes", // TODO: Parece que no me encuentra el primero!
						(SearchTupleSet) v.getGroup(Visualization.SEARCH_ITEMS));
				search = sq.createSearchPanel();
				search.setShowResultCount(true);
				search.setBorder(BorderFactory.createEmptyBorder(5, 5, 4, 0));
				search.setFont(FontLib.getFont("Tahoma", Font.PLAIN, 11));
		//	}});
		//}catch(Exception e){e.printStackTrace();}
		*/
		final JFastLabel title = new JFastLabel("                 ");
		title.setPreferredSize(new Dimension(500, 20));
		title.setSize(500, 20);
		title.setVerticalAlignment(SwingConstants.BOTTOM);
		title.setBorder(BorderFactory.createEmptyBorder(3, 0, 0, 0));
		title.setFont(FontLib.getFont("Tahoma", Font.PLAIN, 16));

		d.addControlListener(new ControlAdapter() {
			public void itemEntered(VisualItem item, MouseEvent e) {
				if (item.canGetString("name"))
					title.setText(item.getString("name") + " ("
							+ item.getString("height") + "x"
							+ item.getString("width") + ")");
			}

			public void itemExited(VisualItem item, MouseEvent e) {
				title.setText(null);
			}
		});

		Box box = new Box(BoxLayout.X_AXIS);
		box.add(Box.createHorizontalStrut(10));
		box.add(title);
	
		
		eda=new ExportDisplayAction(d);
		this.registerKeyboardAction(eda, "export display", KeyStroke.getKeyStroke("ctrl P"), WHEN_FOCUSED);
	
		this.add(d, BorderLayout.CENTER); // El display con el grafo
		this.add(box, BorderLayout.SOUTH); // La caja de búsqueda
											// Se podrían add otras historias
		
		Color BACKGROUND = Color.WHITE;
		Color FOREGROUND = Color.DARK_GRAY;
		
		
		UILib.setColor(this, BACKGROUND, FOREGROUND);
		this.getWindow().setContentPane(this);
		this.getWindow().pack();
	}

	LinkedList<Integer> getListFrom(ArrayList<String> l, boolean genes) {
		LinkedList<Integer> lista = new LinkedList<Integer>();
		String names[];
		if (genes)
			names = this.sesion.getMicroarrayData().rowLabels;
		else
			names = this.sesion.getMicroarrayData().columnLabels;

		// System.out.println("Elementos "+l.size());
		for (int i = 0; i < l.size(); i++) {
			String name = (String) l.get(i);
			int pos = 0;

			for (int j = 0; j < names.length; j++) {
				if (names[j].equals(name)) {
					pos = j;
					break;
				}
			}
			// System.out.println("Añadiendo "+name+" de pos "+pos);
			lista.add(Integer.valueOf(pos));
		}

		return lista;
	}

	/*
	 * Add a search box binded to TRN View
	 */
	private void setSearchQueryBinding(SearchQueryBinding sq) {
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

	public void configure() {
		if (!configurando) {
			configurando = true;

			// Obtenemos y configuramos la ventana de configuracion
			JInternalFrame ventanaConfig = this.getVentanaConfig();
			// Obtenemos el gestor de eventos de configuracion

			ConfigurationMenuManager gestor = new ConfigurationMenuManager(
					this, ventanaConfig, paleta, muestraColor);

			JPanel panelColor = this.getPanelPaleta(paleta, textoLabel,
					muestraColor);
			JPanel panelBotones = this.getPanelBotones(gestor);

			// Configuramos la ventana de configuracion
			this.initPanelConfig(panelColor, null, null, panelBotones);

			// Mostramos la ventana de configuracion
			ventanaConfig
					.setLocation(this.getWidth() / 2, this.getHeight() / 2);
			ventanaConfig.setTitle(Translator.instance.configureLabels
					.getString("s1") + " " + this.getName());
			sesion.getDesktop().add(ventanaConfig);
			try {
				ventanaConfig.setSelected(true);
			} catch (PropertyVetoException e) {
				e.printStackTrace();
			}
			ventanaConfig.pack();
			ventanaConfig.moveToFront();
			ventanaConfig.setVisible(true);
		}
	}

	public void endConfig(boolean ok) {
		if (!ok) {
			configurando = false;
			return;
		}

		sesion.setSelectionColor(paleta[BubblesDiagram.selectionColor]);
		sesion.setSearchColor(paleta[BubblesDiagram.searchColor]);
		sesion.setHoverColor(paleta[BubblesDiagram.hoverColor]);
		sesion.setBicSet1Color(new Color(paleta[BubblesDiagram.bicColor1]
				.getRed(), paleta[BubblesDiagram.bicColor1].getGreen(),
				paleta[BubblesDiagram.bicColor1].getBlue(), 100));
		sesion.setBicSet2Color(new Color(paleta[BubblesDiagram.bicColor2]
				.getRed(), paleta[BubblesDiagram.bicColor2].getGreen(),
				paleta[BubblesDiagram.bicColor2].getBlue(), 100));
		sesion.setBicSet3Color(new Color(paleta[BubblesDiagram.bicColor3]
				.getRed(), paleta[BubblesDiagram.bicColor3].getGreen(),
				paleta[BubblesDiagram.bicColor3].getBlue(), 100));

		
		LabelRenderer r = new LabelRenderer("name");
		//r.setRoundedCorner(8, 8); // round the corners
		v.setRendererFactory(new DefaultRendererFactory(r, null));

		int[] paletaTipos = new int[] { sesion.getBicSet2().getRGB(),
				sesion.getBicSet3().getRGB(), sesion.getBicSet1().getRGB() };
		nodeColor = new DataColorAction("graph.nodes", "resultType",
				Constants.NOMINAL, VisualItem.FILLCOLOR, paletaTipos);// Pasarle
																		// homogeneidad
		ColorAction text = new ColorAction("graph.nodes",
				// VisualItem.TEXTCOLOR, ColorLib.gray(200));
						VisualItem.TEXTCOLOR, ColorLib.blue(50));

		nodeStroke = new NodeStrokeAction("graph.nodes",
				sesion.getHoverColor(), sesion.getSelectionColor(),
				sesion.getSearchColor());// En el futuro, tb goodness TODO:
											// linear scale no es la mejor
											// manera si son círculos

		// create an action list containing all color assignments
		ActionList color = (ActionList) v.getAction("color");
		color.remove(nodeColor);
		color.remove(nodeStroke);
		color.add(nodeColor);
		color.add(nodeStroke);
		color.add(text);
		v.putAction("color", color);

		// filtering
		ActionList filter = (ActionList) v.getAction("filter");
		filter.remove(nodeStroke);
		filter.add(nodeColor);
		v.putAction("filter", filter);

		run();
		this.repaint();
		sesion.updateConfigExcept(this.getName());
		this.configurando = false;

	}

	public void updateConfig() {
		paleta[BubblesDiagram.selectionColor] = sesion.getSelectionColor();
		paleta[BubblesDiagram.searchColor] = sesion.getSearchColor();
		paleta[BubblesDiagram.hoverColor] = sesion.getHoverColor();
		paleta[BubblesDiagram.bicColor1] = sesion.getBicSet1();
		paleta[BubblesDiagram.bicColor2] = sesion.getBicSet2();
		paleta[BubblesDiagram.bicColor3] = sesion.getBicSet3();

		int[] paletaTipos = new int[] { sesion.getBicSet2().getRGB(),
				sesion.getBicSet3().getRGB(), sesion.getBicSet1().getRGB() };
		nodeColor = new DataColorAction("graph.nodes", "resultType",
				Constants.NOMINAL, VisualItem.FILLCOLOR, paletaTipos);// Pasarle
																		// homogeneidad

		nodeStroke = new NodeStrokeAction("graph.nodes",
				sesion.getHoverColor(), sesion.getSelectionColor(),
				sesion.getSearchColor());// En el futuro, tb goodness TODO:
											// linear scale no es la mejor
											// manera si son círculos

		// create an action list containing all color assignments
		ActionList color = (ActionList) v.getAction("color");
		color.remove(nodeColor);
		color.remove(nodeStroke);
		color.add(nodeColor);
		color.add(nodeStroke);
		//color.add(text);
		v.putAction("color", color);

		// filtering
		ActionList filter = (ActionList) v.getAction("filter");
		filter.remove(nodeStroke);
		filter.add(nodeColor);
		v.putAction("filter", filter);

		run();
		this.repaint();
		this.configurando = false;
	}

	/**
	 * Makes the diagram visible and run Prefuse Visualizations for this diagram
	 * 
	 */
	public void run() {
		this.getWindow().setVisible(true); // show the window
		
		v.run("color"); // assign the colors
		v.run("layout"); // start up the animated layout
		v.run("filter");
		v.run("animate");
	}
	
	public void printFigure(File f, int type)
	{
	eda.actionPerformed(new ActionEvent(this,43,"export"));
	}


	private static class EdgeColorAction extends ColorAction {
		static int[] palette = new int[] { ColorLib.gray(0, 123),
				ColorLib.gray(100, 123), ColorLib.gray(200, 123) };

		EdgeColorAction(String group) {
			super(group, VisualItem.STROKECOLOR, ColorLib.gray(0, 100));
		}
	} // end of inner class EdgeColorAction

	static class NodeSizeAction extends DataSizeAction {
		NodeSizeAction(String group, String sel, int bins, int scale) {
			super(group, sel, bins, scale);
		}
	} // end of inner class NodeSizeAction

	/**
	 * Set node fill colors. Different colors for different "sel" values
	 * Transparency varies with "sel2" values.
	 */
	static class NodeColorAction extends ItemAction// extends DataColorAction
	{
		private int[] palette;
		private String sel, sel2;
		private Vector<String> tipo;

		NodeColorAction(String group, String sel, String sel2, int[] palette,
				Visualization vis) {
			super(group);
			this.palette = palette;
			this.sel = sel;
			this.sel2 = sel2;
			tipo = new Vector<String>(0, 1);
			Iterator it = vis.items(group);
			while (it.hasNext()) {
				VisualItem item = (VisualItem) it.next();
				boolean add = true;
				if (tipo.size() > 0) {
					for (int i = 0; i < tipo.size(); i++)
						if (item.getString(sel).equals(tipo.get(i))) {
							add = false;
							break;
						}
				}
				if (add) {
					tipo.add(item.getString(sel));
				}
			}
		}

		public void process(VisualItem item, double frac) {
			int homogeneity = (int) ((1 - item.getDouble(sel2)) * 255);
			if (homogeneity < 20)
				homogeneity = 20;// Para que se vean un poco los más
									// transparentes
			int colorIndex = tipo.indexOf(item.getString(sel));
			int colorInicial = palette[colorIndex];
			int color = ColorLib.setAlpha(colorInicial, homogeneity);// En
																		// homogeneity
																		// realmente
																		// ahora
																		// tenemos
																		// su
																		// inversa,
																		// la
																		// varianza,
																		// normalizada
																		// entre
																		// 0 y 1
			// System.out.println("Color: "+color);
			item.setInt("_fillColor", color);
		}
	} // end of inner class NodeColorAction

	static class NodeShapeAction extends ShapeAction {
		NodeShapeAction(String group, int shape) {// Hacemos el tamaño en
													// función del número de
													// genes y condiciones que
													// contenga
			super(group, shape);
		}
	} // end of inner class NodeShapeAction

	static class NodeStrokeWidthAction extends StrokeAction{
		NodeStrokeWidthAction(String group, int basic, int selected) {
			super(group, new BasicStroke(basic));
			add("_hover", new BasicStroke(selected));
			add("ingroup('_search_')", new BasicStroke(selected));
			add("ingroup('_focus_')", new BasicStroke(selected));
			add("ingroup('_bicluster_')", new BasicStroke(selected));
			}
	}
	/**
	 * Set node stroke colors
	 */
	static class NodeStrokeAction extends ColorAction {
		NodeStrokeAction(String group, Color hc, Color selc, Color sc) {
			super(group, VisualItem.STROKECOLOR, ColorLib.gray(0, 135));// Sin
																		// borde
																		// por
																		// defecto
			add("_hover",
					ColorLib.getColor(hc.getRed(), hc.getGreen(), hc.getBlue(),
							hc.getAlpha()).getRGB());// Negro al pasar por
														// encima
			add("ingroup('_search_')",
					ColorLib.getColor(sc.getRed(), sc.getGreen(), sc.getBlue(),
							sc.getAlpha()).getRGB());
			add("ingroup('_focus_')",
					ColorLib.getColor(selc.getRed(), selc.getGreen(),
							selc.getBlue(), selc.getAlpha()).getRGB());
			add("ingroup('_bicluster_')", ColorLib.gray(0));
		}
	} // end of inner class NodeColorAction

	
	/**
	 * Set node label colors
	 */
	static class TextColorAction extends ColorAction {
		TextColorAction(String group) {
			super(group, VisualItem.TEXTCOLOR, ColorLib.gray(255, 255));
			add("_hover", ColorLib.gray(255));
			add("ingroup('_search_')", ColorLib.gray(0));
		}
	} // end of inner class NodeColorAction

}
