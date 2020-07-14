package es.usal.bicoverlapper.controller.kernel;

import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.io.IOException;

/**
 * Class with initial dimensions and ids for each Diagram TODO: To be deprecated
 * 
 * @author Javier Molpeceres
 */
public class Configuration {

	private Dimension dimAplicacion = new Dimension(1300, 800);// 1000x600
	//private DisplayMode dimAplicacion=null;
	
	private Dimension dimParallelCoordinatesWindow = new Dimension(900, 300);
	private Dimension dimNetworkWindow = new Dimension(600, 430);
	private Dimension dimHeatmapWindow = new Dimension(355, 610);// for 1280x800
	private Dimension dimOverlapperWindow = new Dimension(900, 400);
	private Dimension dimWordCloudWindow = new Dimension(355, 250);// for
																	// 1280x800

	// Carlos
	// por ejemplo esta dimension inicial
	private Dimension dimKeggWindow = new Dimension(355, 610);

	private Dimension dimDataWindow = new Dimension(350, 300);
	private Dimension dimPanelPuntos = new Dimension(900, 300);
	private Dimension dimPanelHistograma = new Dimension(350, 300);
	private Dimension dimPanelMapeo = new Dimension(350, 300);
	private Dimension dimPanelDendrograma = new Dimension(900, 300);
	private Dimension dimPanelBubbles = new Dimension(300, 300);
	private Dimension dimPanelDataSelection = new Dimension(740, 560);

	private int marginInternalWindowWidth = 3 + 3; // margin of diagrams
	private int marginInternalWindowHeight = 20 + 3; // margin of diagrams
	private int marginExternalWindowWidth = 4 + 4;
	private int marginExternalWindowHeight = 70 + 4;

	private Point initPC, initHM, initWC, initBM, initO, initTRN, initKegg;

	public static final int NoId = 0;
	public static final int DiagramaPuntosId = 1;
	/**
	 * Unique identifier for Parallel Coordiantes Diagrams
	 */
	public static final int PARALLEL_COORDINATES_ID = 2;
	public static final int DendrogramaId = 3;
	public static final int HistogramaId = 4;
	public static final int MapeoId = 5;
	/**
	 * Unique identifier for Bubble map Diagrams
	 */
	public static final int BUBBLE_MAP_ID = 6;
	public static final int TreeMapId = 7;
	public static final int CloudId = 8;
	public static final int TablaDatosId = 9;
	public static final int DataFilterId = 10;
	public static final int DataPersonFilterId = 11;
	public static final int HEATMAP_ID = 12;
	public static final int OVERLAPPER_ID = 13;
	public static final int TRN_ID = 14;
	public static final int CLOUD_ID = 15;
	public static final int KEGG_ID = 16;

	public Configuration() {
		//dimAplicacion = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		DisplayMode dm = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode();
		
		dimAplicacion=new Dimension(dm.getWidth(), dm.getHeight());
		
		Dimension dimDesktop = new Dimension(dimAplicacion.width
				- marginExternalWindowWidth, dimAplicacion.height
				- marginExternalWindowHeight);
				
		
	
		System.out.println("Screen size: " + dimDesktop.width + ", "
				+ dimDesktop.height);
		dimParallelCoordinatesWindow = new Dimension(
				(int) (dimDesktop.width * 0.66),
				(int) (dimDesktop.height * 0.40));
		// dimHeatmapWindow=new Dimension((int)(dimDesktop.width*0.34),
		// (int)(dimDesktop.height)-marginInternalWindowHeight);
		dimHeatmapWindow = new Dimension((int) (dimDesktop.width * 0.34+8),
				(int) (dimDesktop.height * 0.66));
		dimOverlapperWindow = new Dimension((int) (dimDesktop.width * 0.66),
				(int) ((dimDesktop.height-40) * 0.60));
		dimNetworkWindow = new Dimension((int) (dimDesktop.width * 0.66),
				(int) (dimDesktop.height * 0.66));
		dimWordCloudWindow = new Dimension((int) (dimDesktop.width * 0.34+8),
				(int) ((dimDesktop.height-40) * 0.34));
		//dimPanelBubbles = new Dimension((int) (dimDesktop.width * 0.34),
		//		(int) (dimDesktop.height * 0.34));
		dimPanelBubbles=dimOverlapperWindow;
		
		
		dimKeggWindow = new Dimension((int) (dimDesktop.width * 0.50),
				(int) (dimDesktop.height * 0.57) - 30);

		initPC = new Point(0, 0);
		initHM = new Point(initPC.x + dimParallelCoordinatesWindow.width, 0);
		initO = new Point(0, initPC.y + dimParallelCoordinatesWindow.height
				- 43);
		initTRN = initO;
		initWC = new Point(initO.x + dimOverlapperWindow.width,
				(int) initHM.y+dimHeatmapWindow.height+10);
				//(dimDesktop.height) - dimWordCloudWindow.height);
		initBM = new Point(0, initPC.y + dimParallelCoordinatesWindow.height);
		
		initKegg = new Point(0, initPC.y + dimParallelCoordinatesWindow.height + 7);

	}

	/**
	 * Sets ups any possible environment variables required for the proper
	 * functioning of the program Environment variables should not be modified
	 * from code. Instructions for setting up on different OS:
	 * 
	 * 1) MACOS We can generate an app following
	 * http://www.centerkey.com/mac/java/ Atfer creating the app ad step 8, we
	 * need to create a prelude script and add it to the content of the app,
	 * following this one:
	 * http://www.amug.org/~glguerin/howto/More-open-files.html#prelude On this
	 * prelude script we can add everything we need, for BicOverlapper the
	 * export of R_HOME at least Then continue with step 9 for generating the
	 * installer.
	 * 
	 * NOTE: The Prelude thing does not work. It apparently works if you run the
	 * Prelude script inside the app, but not when double clicking the app. It
	 * seems we need to go Apparently Prelude solution will only work on 10.2
	 * and up (or might be done, but it will work in previous ones?)
	 * LSEnvironment only works on 10.3 and up
	 * 
	 * 
	 */
	/*
	 * public void configureEnvironment() {
	 * System.out.println(System.getProperty("os.name")); String
	 * os=System.getProperty("os.name"); try { if(os.contains("indows")) {} else
	 * if(os.contains("ac")) {
	 * System.out.println("Setting up environment for Mac"); //By now only
	 * setting up things for this one //Runtime.getRuntime().exec(
	 * "set R_HOME=/Library/Frameworks/R.framework/Resources"); } else
	 * if(os.contains("ux")) {
	 * 
	 * } } catch (IOException e) { e.printStackTrace(); }
	 * 
	 * }
	 */
	/**
	 * Devuelve la dimension por defecto de la ventana principal de la
	 * aplicacion.
	 * 
	 * @return <code>Dimension</code> por defecto de la ventana principal de la
	 *         aplicacion.
	 */
	public Dimension getApplicationSize() {
		return dimAplicacion;
	}

	/**
	 * Devuelve la dimension por defecto del panel del diagrama de puntos.
	 * 
	 * @return <code>Dimension</code> por defecto del panel del diagrama de
	 *         puntos.
	 */
	public Dimension getSizePanelPuntos() {
		return dimPanelPuntos;
	}

	/**
	 * Returns the initial dimension for Parallel Coordinates Diagrams
	 * 
	 * @return default <code>Dimension</code> for Parallel Coordinates Diagrams
	 */
	public Dimension getSizePanelCoordenadas() {
		return new Dimension(dimParallelCoordinatesWindow.width
				- marginInternalWindowWidth,
				dimParallelCoordinatesWindow.height
						- marginInternalWindowHeight);
	}

	/**
	 * Devuelve la dimension por defecto del panel del diagrama del histograma.
	 * 
	 * @return <code>Dimension</code> por defecto del panel del diagrama del
	 *         histograma.
	 */
	public Dimension getSizePanelHistograma() {
		return new Dimension(
				dimHeatmapWindow.width - marginInternalWindowWidth,
				dimHeatmapWindow.height - marginInternalWindowHeight);
	}

	/**
	 * Devuelve la dimension por defecto del panel del diagrama del mapeo de
	 * color.
	 * 
	 * @return <code>Dimension</code> por defecto del panel del diagrama del
	 *         mapeo de color.
	 */
	public Dimension getSizePanelMapeo() {
		return dimPanelMapeo;
	}

	/**
	 * Devuelve la dimension por defecto del panel del diagrama del dendrograma.
	 * 
	 * @return <code>Dimension</code> por defecto del panel del diagrama del
	 *         dendrograma.
	 */
	public Dimension getSizePanelDendrograma() {
		return dimPanelDendrograma;
	}

	/**
	 * Devuelve la dimension por defecto de la ventana de datos.
	 * 
	 * @return <code>Dimension</code> por defecto de la ventana de datos.
	 */
	public Dimension getSizePanelDatos() {
		return dimDataWindow;
	}

	/**
	 * Returns the initial dimension for BubbleMap Diagrams
	 * 
	 * @return default <code>Dimension</code> for Bubble Map Diagrams
	 */
	public Dimension getDimPanelBubbles() {
		return dimPanelBubbles;
	}

	public void setDimPanelBubbles(Dimension dimPanelBubbles) {
		this.dimPanelBubbles = dimPanelBubbles;
	}

	/**
	 * Returns the initial dimension for TRN Diagrams
	 * 
	 * @return default <code>Dimension</code> for TRN Diagrams
	 */
	public Dimension getDimPanelTRN() {
		return new Dimension(
				dimNetworkWindow.width - marginInternalWindowWidth,
				dimNetworkWindow.height - marginInternalWindowHeight);
	}

	public void setDimPanelTRN(Dimension dimPanelTRN) {
		this.dimNetworkWindow = dimPanelTRN;
	}

	/**
	 * Returns the initial dimension for Microarray Heatmap Diagrams
	 * 
	 * @return default <code>Dimension</code> for Microarray Heatmap Diagrams
	 */
	public Dimension getDimPanelHeatmap() {
		return new Dimension(
				dimHeatmapWindow.width - marginInternalWindowWidth,
				dimHeatmapWindow.height - marginInternalWindowHeight);
	}

	public void setDimPanelHeatmap(Dimension dimPanelHeatmap) {
		this.dimHeatmapWindow = dimPanelHeatmap;
	}

	/**
	 * Returns the initial dimension for BiclusVis Diagrams
	 * 
	 * @return default <code>Dimension</code> for BiclusVis Diagrams
	 */
	public Dimension getDimPanelBiclusVis() {
		return new Dimension(dimOverlapperWindow.width
				- marginInternalWindowWidth, dimOverlapperWindow.height
				- marginInternalWindowHeight);
	}

	/**
	 * Returns the initial dimension for BiclusVis Diagrams
	 * 
	 * @return default <code>Dimension</code> for BiclusVis Diagrams
	 */
	public Dimension getDimPanelWordCloud() {
		return new Dimension(dimWordCloudWindow.width
				- marginInternalWindowWidth, dimWordCloudWindow.height
				- marginInternalWindowHeight);
	}

	public void setDimPanelWordCloud(Dimension dimPanelWords) {
		this.dimWordCloudWindow = dimPanelWords;
	}

	public void setDimPanelBubbleGraph(Dimension dimPanelBubbleGraph) {
		this.dimOverlapperWindow = dimPanelBubbleGraph;
	}

	public Dimension getDimPanelDataSelection() {
		return dimPanelDataSelection;
	}

	public void setDimPanelDataSelection(Dimension dimPanelDataSelection) {
		this.dimPanelDataSelection = dimPanelDataSelection;
	}

	/**
	 * Returns the initial dimension for Kegg Diagrams
	 * 
	 * @return default <code>Dimension</code> for Kegg Diagrams
	 */
	public Dimension getDimPanelKegg() {
		return dimKeggWindow;
	}

	public void setDimPanelKegg(Dimension dimPanelKegg) {
		this.dimKeggWindow = dimPanelKegg;
	}

	/**
	 * @return the initPC
	 */
	public Point getInitPC() {
		return initPC;
	}

	/**
	 * @return the initHM
	 */
	public Point getInitHM() {
		return initHM;
	}

	/**
	 * @return the initWC
	 */
	public Point getInitWC() {
		return initWC;
	}

	/**
	 * @return the initBM
	 */
	public Point getInitBM() {
		return initBM;
	}

	/**
	 * @return the initO
	 */
	public Point getInitO() {
		return initO;
	}

	/**
	 * @return the initTRN
	 */
	public Point getInitTRN() {
		return initTRN;
	}

	/**
	 * @return the initKegg
	 */
	public Point getInitKegg() {
		return initKegg;
	}
}