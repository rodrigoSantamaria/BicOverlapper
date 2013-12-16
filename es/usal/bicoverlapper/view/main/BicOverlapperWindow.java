package es.usal.bicoverlapper.view.main;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

//import org.jvnet.lafwidget.LafWidget;
//import org.jvnet.lafwidget.tabbed.DefaultTabPreviewPainter;
//import org.jvnet.substance.SubstanceLookAndFeel;

import es.usal.bicoverlapper.controller.data.parser.FileParser;
import es.usal.bicoverlapper.controller.kernel.Configuration;
import es.usal.bicoverlapper.controller.manager.AnalysisMenuManager;
import es.usal.bicoverlapper.controller.manager.FileMenuManager;
import es.usal.bicoverlapper.controller.manager.HelpMenuManager;
import es.usal.bicoverlapper.controller.manager.ViewMenuManager;
import es.usal.bicoverlapper.controller.util.Translator;
import es.usal.bicoverlapper.view.analysis.panel.TrickPanel;
import es.usal.bicoverlapper.view.data.monitor.MicroarrayAnnotationsLoadProgressBar;

/**
 * Class to build main BicOverlapper interface: menu and desktop panel
 * 
 * @author Javier Molpeceres and Rodrigo Santamaria
 * @version 3.2 22/3/2007
 */
public class BicOverlapperWindow extends JFrame {

	private static final long serialVersionUID = -8081801349787389293L;

	public final String titulo = Translator.instance.menuLabels
			.getString("s20");

	//Carlos
	//private JTabbedPane desktop;
	private JPanel desktop;
	
	private Vector<WorkDesktop> vistas;
	private WorkDesktop vistaActiva = null;
	//private DefaultTabPreviewPainter visor;
	/**
	 * Menu item to export selected entities
	 */
	private JMenuItem menuArchivoExportSelection;
	/**
	 * Menu item to export figures
	 */
	private JMenuItem menuArchivoExportFigure;
	/**
	 * Menu item to view heatmaps
	 */
	private JMenuItem menuViewHeatmap;
	//private JMenuItem menuViewHeatmap2;
	/**
	 * Menu item to view parallel coordinates
	 */
	private JMenuItem menuViewParallelCoordinates;
	/**
	 * Menu item to view transcription regulatory networks
	 */
	private JMenuItem menuViewTRN;
	/**
	 * Menu item to view bubble map
	 */
	private JMenuItem menuViewBubbles;
	/**
	 * Menu item to view overlapper
	 */
	private JMenuItem menuViewOverlapper;
	/**
	 * Menu item to view go tag cloud
	 */
	private JMenuItem menuViewCloud;
	/**
	 * Menu item to view kegg tool
	 */
	//private JMenuItem menuViewKegg;

	private JMenu analysisMenu, viewMenu;

	private FileMenuManager gestorMenuArchivo;
	
	private MicroarrayAnnotationsLoadProgressBar mlpb;
	
	private JMenuItem menuAnalysisRetrieveDescriptors;
	private JMenu analysisMenuBiclustering;
	private JMenuItem menuAnalysisGSEA;
	private JMenuItem menuAnalysisDifexp;
	private JMenuItem menuAnalysisBuildNetwork;
	
	private AnalysisMenuManager amm;

	private ViewMenuManager gestorMenuVer;

	private JMenuItem menuArchivoSaveGroup;

	private JMenuItem menuArchivoSaveNetwork;

	/**
	 * Default constructor
	 * 
	 */
	public BicOverlapperWindow() {

		//Carlos
		//this.desktop = new JTabbedPane();
		this.desktop = new JPanel(new BorderLayout());
		
		this.initDesktop();

		Configuration config = new Configuration();

		JMenuBar menu = crearMenu(config);
		
		this.setJMenuBar(menu);
		this.setTitle(titulo);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(config.getApplicationSize());
		this.setVisible(true);
		this.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.out.println("Closing...");
				FileParser.deleteFiles(".", "tmp");
			}
		});
		desktop.setFocusable(true);

		// tricks panel
		BufferedReader pathReader;
		try {
			pathReader = new BufferedReader(new FileReader(
					"es/usal/bicoverlapper/data/config.txt"));
			String tricks = pathReader.readLine();
			if (tricks.split("\t")[1].equals("true")) {
				TrickPanel tp = new TrickPanel();
				tp.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				tp.setAlwaysOnTop(true);

				tp.pack();
				tp.setLocation((desktop.getWidth() - tp.getWidth()) / 2,
						(desktop.getHeight() - tp.getHeight()) / 2);
				tp.setVisible(true);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		//se crea la barra de progreso para la obtención de anotaciones, que se activará cuando convenga
		mlpb = new MicroarrayAnnotationsLoadProgressBar(this);
	}

	private void initDesktop() {

		this.vistas = new Vector<WorkDesktop>(0, 1);
		this.getContentPane().add(desktop);
	}

	private JMenuBar crearMenu(Configuration config) {

		// Creamos menu "Archivo"
		JMenu fileMenu = new JMenu(
				Translator.instance.menuLabels.getString("s1"));

		// Añadimos item "Abrir Microarray" al menu "Archivo"
		JMenuItem menuArchivoAbrirMicroarray = new JMenuItem(
				"Load Expression Data");
		fileMenu.add(menuArchivoAbrirMicroarray);

		// Añadimos item "Abrir Bicluster" al menu "Archivo"
		JMenuItem menuArchivoAbrirBicluster = new JMenuItem("Load Groups");
		fileMenu.add(menuArchivoAbrirBicluster);

		// Añadimos item "Abrir TRN" al menu "Archivo"
		JMenuItem menuArchivoAbrirTRN = new JMenuItem("Load Network");
		fileMenu.add(menuArchivoAbrirTRN);
		//

		// Añadimos separador al menu
		fileMenu.addSeparator();

		// Añadimos item "Download expression data"
		JMenuItem downloadAEmenu = new JMenuItem("Download from ArrayExpress...");
		fileMenu.add(downloadAEmenu);

		// Añadimos item "Download expression data"
		JMenuItem downloadGEOmenu = new JMenuItem("Download from GEO...");
		fileMenu.add(downloadGEOmenu);
		
		// Añadimos separador al menu
		fileMenu.addSeparator();

		menuArchivoExportSelection = new JMenuItem("Export Selection");
		fileMenu.add(menuArchivoExportSelection);
		menuArchivoExportFigure = new JMenuItem("Export Figure");
		fileMenu.add(menuArchivoExportFigure);
		menuArchivoSaveGroup = new JMenuItem("Save Groups...");
		//fileMenu.add(menuArchivoExportSelection);
		menuArchivoSaveNetwork = new JMenuItem("Save Network...");
		//fileMenu.add(menuArchivoExportSelection);

		// Añadimos separador al menu
		fileMenu.addSeparator();

		// Añadimos item "Cargar Configuracion" al menu "Archivo"
		JMenuItem menuArchivoCargarConfig = new JMenuItem(
				Translator.instance.menuLabels.getString("s17"));
		fileMenu.add(menuArchivoCargarConfig);

		// Añadimos item "Guardar Configuracion" al menu "Archivo"
		JMenuItem menuArchivoGuardarConfig = new JMenuItem(
				Translator.instance.menuLabels.getString("s18"));
		fileMenu.add(menuArchivoGuardarConfig);

				JMenu fileMenuRecentProjects = new JMenu(
				Translator.instance.menuLabels.getString("recentProjects"));

		// Añadimos el gestor de eventos a los items del menu "Archivo"
		gestorMenuArchivo = new FileMenuManager(this);

		ArrayList<String> list = gestorMenuArchivo.recentFileList();
		for (String s : list) {
			JMenuItem jmi = new JMenuItem(s);
			fileMenuRecentProjects.add(jmi);
			jmi.addActionListener(gestorMenuArchivo);
		}
		fileMenu.add(fileMenuRecentProjects);

		menuArchivoAbrirTRN.addActionListener(gestorMenuArchivo);
		menuArchivoAbrirMicroarray.addActionListener(gestorMenuArchivo);
		downloadAEmenu.addActionListener(gestorMenuArchivo);
		downloadGEOmenu.addActionListener(gestorMenuArchivo);
		menuArchivoAbrirBicluster.addActionListener(gestorMenuArchivo);

		menuArchivoExportSelection.addActionListener(gestorMenuArchivo);
		menuArchivoExportFigure.addActionListener(gestorMenuArchivo);
		menuArchivoSaveGroup.addActionListener(gestorMenuArchivo);
		menuArchivoSaveNetwork.addActionListener(gestorMenuArchivo);

		menuArchivoGuardarConfig.addActionListener(gestorMenuArchivo);
		menuArchivoCargarConfig.addActionListener(gestorMenuArchivo);
		//fileMenuOpenLastProject.addActionListener(gestorMenuArchivo);

		// menuArchivoSalir.addActionListener(gestorMenuArchivo);

		// Create menu "Analysis"
		amm = new AnalysisMenuManager(this);
		analysisMenu = new JMenu(
				Translator.instance.menuLabels.getString("analysis"));
		analysisMenu.setEnabled(false);
		analysisMenuBiclustering = new JMenu(
				Translator.instance.menuLabels.getString("biclustering"));

		JMenuItem menuAnalysisBimax = new JMenuItem(
				Translator.instance.menuLabels.getString("bimax"));
		JMenuItem menuAnalysisPlaid = new JMenuItem(
				Translator.instance.menuLabels.getString("plaid"));
		JMenuItem menuAnalysisISA = new JMenuItem(
				Translator.instance.menuLabels.getString("isa"));
		JMenuItem menuAnalysisXMotifs = new JMenuItem(
				Translator.instance.menuLabels.getString("xmotifs"));
		JMenuItem menuAnalysisCChurch = new JMenuItem(
				Translator.instance.menuLabels.getString("cc"));
		analysisMenuBiclustering.add(menuAnalysisBimax);
		analysisMenuBiclustering.add(menuAnalysisPlaid);
		analysisMenuBiclustering.add(menuAnalysisISA);
		analysisMenuBiclustering.add(menuAnalysisXMotifs);
		analysisMenuBiclustering.add(menuAnalysisCChurch);

		JMenuItem menuAnalysisSearch = new JMenuItem(
				Translator.instance.menuLabels.getString("search"));
		JMenuItem menuAnalysisShow = new JMenuItem(
				Translator.instance.menuLabels.getString("show"));
		JMenuItem menuAnalysisSort = new JMenuItem(
				Translator.instance.menuLabels.getString("sort"));
		JMenuItem menuAnalysisMerge = new JMenuItem(
				Translator.instance.menuLabels.getString("merge"));
		//JMenuItem menuAnalysisMergeRows = new JMenuItem(
		//		Translator.instance.menuLabels.getString("mergeRows"));
		menuAnalysisRetrieveDescriptors = new JMenuItem(
				Translator.instance.menuLabels.getString("retrieve"));
		//por defecto estará desactivado. Cuando se conteste que NO a la pregunta de si se desean buscar anotaciones se activará
		menuAnalysisRetrieveDescriptors.setEnabled(false);
		JMenuItem menuAnalysisSelect = new JMenuItem(
				Translator.instance.menuLabels.getString("select"));
		menuAnalysisDifexp = new JMenuItem(
				Translator.instance.menuLabels.getString("difexp"));
		menuAnalysisBuildNetwork = new JMenuItem(
				Translator.instance.menuLabels.getString("buildnet"));
		menuAnalysisGSEA = new JMenuItem(
				Translator.instance.menuLabels.getString("gsea"));
		
		menuAnalysisSort.setMnemonic('S');
		menuAnalysisSearch.setMnemonic('F');
		menuAnalysisShow.setMnemonic('L');
		menuAnalysisMerge.setMnemonic('M');
		//menuAnalysisMergeRows.setMnemonic('R');

		analysisMenu.add(menuAnalysisSearch);
		analysisMenu.add(menuAnalysisShow);
		analysisMenu.add(menuAnalysisSort);
		analysisMenu.add(menuAnalysisMerge);
		//analysisMenu.add(menuAnalysisMergeRows);
		analysisMenu.add(menuAnalysisRetrieveDescriptors);
		analysisMenu.addSeparator();
		analysisMenu.add(menuAnalysisSelect);
		analysisMenu.add(menuAnalysisDifexp);
		analysisMenu.add(menuAnalysisGSEA);
		analysisMenu.add(analysisMenuBiclustering);
		analysisMenu.addSeparator();
		analysisMenu.add(menuAnalysisBuildNetwork);

		menuAnalysisBimax.addActionListener(amm);
		menuAnalysisPlaid.addActionListener(amm);
		menuAnalysisISA.addActionListener(amm);
		menuAnalysisXMotifs.addActionListener(amm);
		menuAnalysisCChurch.addActionListener(amm);
		menuAnalysisSearch.addActionListener(amm);
		menuAnalysisShow.addActionListener(amm);
		menuAnalysisSort.addActionListener(amm);
		menuAnalysisMerge.addActionListener(amm);
		menuAnalysisRetrieveDescriptors.addActionListener(amm);
		//menuAnalysisMergeRows.addActionListener(amm);
		menuAnalysisSelect.addActionListener(amm);
		menuAnalysisDifexp.addActionListener(amm);
		menuAnalysisGSEA.addActionListener(amm);
		menuAnalysisBuildNetwork.addActionListener(amm);

		//menuAnalysisMergeRows.setEnabled(false);// TODO: in test phase

		// Creamos menu "Ver"
		viewMenu = new JMenu(Translator.instance.menuLabels.getString("s2"));
		viewMenu.setEnabled(false);
		/*
		 * // Añadimos item "Diagrama Puntos" al menu "Ver" JMenuItem
		 * menuVerDiagPuntos = new
		 * JMenuItem(Translator.instance.menuLabels.getString("s5"));
		 * 
		 * menuVer.add(menuVerDiagPuntos);
		 * 
		 * // Añadimos item "Histograma" al menu "Ver" JMenuItem
		 * menuVerHistograma = new
		 * JMenuItem(Translator.instance.menuLabels.getString("s6"));
		 * 
		 * menuVer.add(menuVerHistograma);
		 * 
		 * // Añadimos item "Mapeo de Color" al menu "Ver" JMenuItem
		 * menuVerMapeo = new
		 * JMenuItem(Translator.instance.menuLabels.getString("s7"));
		 * 
		 * menuVer.add(menuVerMapeo);
		 */
		// Añadimos item "Coordenadas Paralelas" al menu "Ver"
		menuViewParallelCoordinates = new JMenuItem(
				Translator.instance.menuLabels.getString("s8"));

		viewMenu.add(menuViewParallelCoordinates);

		// Añadimos item "Microarray Heatmap" al menu "Ver"
		menuViewHeatmap = new JMenuItem("Microarray Heatmap");

		viewMenu.add(menuViewHeatmap);

		// Añadimos item "Microarray Heatmap" al menu "Ver"
		/*menuViewHeatmap2 = new JMenuItem("Microarray Heatmap 2");

		viewMenu.add(menuViewHeatmap2);*/
		/*
		 * // Añadimos item "Dendrograma" al menu "Ver" JMenuItem
		 * menuVerDendrograma = new
		 * JMenuItem(Translator.instance.menuLabels.getString("s9"));
		 * 
		 * menuVer.add(menuVerDendrograma);
		 */

		// Añadimos separador al menu
		viewMenu.addSeparator();

		// Añadimos item "Bubbles" al menu "Ver"
		menuViewBubbles = new JMenuItem("Bubble Map");

		viewMenu.add(menuViewBubbles);

		// Añadimos item "Microarray Heatmap" al menu "Ver"
		menuViewOverlapper = new JMenuItem(
				Translator.instance.menuLabels.getString("s10"));

		viewMenu.add(menuViewOverlapper);

		// Añadimos separador al menu
		viewMenu.addSeparator();

		// Añadimos item "WordCloud" al menu "Ver"
		menuViewCloud = new JMenuItem(
				Translator.instance.menuLabels.getString("s13"));
		viewMenu.add(menuViewCloud);

		// Añadimos item "Biological Network" al menu "Ver"
		menuViewTRN = new JMenuItem("Biological Network");

		viewMenu.add(menuViewTRN);
		
		// Añadimos el item "Kegg"	//KEGG migrated from SOAP to REST but this view does not support it yet
	/*	menuViewKegg = new JMenuItem(
				Translator.instance.menuLabels.getString("s26"));
		viewMenu.add(menuViewKegg);	*/

		// Añadimos el gestor de eventos a los items del menu "Ver"
		gestorMenuVer = new ViewMenuManager(this, config);
		menuViewParallelCoordinates.addActionListener(gestorMenuVer);
		menuViewHeatmap.addActionListener(gestorMenuVer);
		//menuViewHeatmap2.addActionListener(gestorMenuVer);
		menuViewTRN.addActionListener(gestorMenuVer);

		// menuVerDendrograma.addActionListener(gestorMenuVer);
		/*
		 * menuVerTreeMap.addActionListener(gestorMenuVer);
		 * menuVerDetails.addActionListener(gestorMenuVer);
		 */

		menuViewCloud.addActionListener(gestorMenuVer);

		menuViewOverlapper.addActionListener(gestorMenuVer);
		menuViewBubbles.addActionListener(gestorMenuVer);
		
		//menuViewKegg.addActionListener(gestorMenuVer);

		// Creamos menu Ayuda
		JMenu helpMenu = new JMenu(
				Translator.instance.menuLabels.getString("s23"));
		HelpMenuManager gestorMenuAyuda = new HelpMenuManager();

		// Añadimos item "Abrir Microarray" al menu "Archivo"
		JMenuItem menuAyudaAcercaDe = new JMenuItem(
				Translator.instance.menuLabels.getString("s24"));
		JMenuItem menuAyudaContents = new JMenuItem(
				Translator.instance.menuLabels.getString("s25"));
		helpMenu.add(menuAyudaContents);
		helpMenu.add(menuAyudaAcercaDe);

		menuAyudaContents.addActionListener(gestorMenuAyuda);
		menuAyudaAcercaDe.addActionListener(gestorMenuAyuda);

		// Creamos una barra de menu a la que añadimos los menus
		JMenuBar menu = new JMenuBar();

		menu.add(fileMenu);
		menu.add(analysisMenu);
		menu.add(viewMenu);
		menu.add(helpMenu);

		// Inicialmente, todas las vistas están deshabilitadas en lo que no se
		// carguen los ficheros adecuados
		menuArchivoExportSelection.setEnabled(false);
		menuArchivoExportFigure.setEnabled(false);
		menuArchivoSaveGroup.setEnabled(false);
		menuArchivoSaveNetwork.setEnabled(false);

		menuViewParallelCoordinates.setEnabled(false);
		menuViewHeatmap.setEnabled(false);
		//menuViewHeatmap2.setEnabled(false);

		menuViewTRN.setEnabled(false);

		menuViewBubbles.setEnabled(false);
		menuViewOverlapper.setEnabled(false);

		//menuViewKegg.setEnabled(false);
		
		// menuViewCloud.setEnabled(false);

		// TODO: Además, para una versión oficial, de momento deshabilitamos el
		// resto también
		// menuArchivoAbrirTRN.setEnabled(false);
		// menuArchivoAbrirMicroarray.setEnabled(false);

		return menu;
	}

	public ViewMenuManager getViewMenuManager()
		{return gestorMenuVer;}
	public FileMenuManager getFileMenuManager()
		{return gestorMenuArchivo;}
/**
	 * Actualiza la vista del mosaico de pestañas.
	 * 
	 */
	void actualizarTabPreview() {
		this.desktop.revalidate();
		this.desktop.repaint();
	}

	/**
	 * Adds a work desktop, where visualization for a working data set will be
	 * added. Each WorkDesktop is a Tab added to the application desktop STILL
	 * IN DEVELOPMENT: By now, ony one working desktop is built. Besides, it has
	 * no much more sene to have more than one work desktop, since only one can
	 * be active at the same time
	 * 
	 * @param wd
	 *            WorkDesktop to add
	 */
	public void addWorkDesktop(WorkDesktop wd) {

		//Carlos
		/*
		if (this.vistas.size() == 0) {
			this.getContentPane().remove(this.desktop);
			
			//Carlos
			//this.desktop = new JTabbedPane();
			this.desktop = new JPanel(new BorderLayout());
			
			this.initDesktop();
			this.desktop.putClientProperty(
					LafWidget.TABBED_PANE_PREVIEW_PAINTER, this.visor);
		}
		*/
		
		//Carlos
		//en teoría, quitando el JTabbedPane, esto debería hacerlo siempre que se añada un WorkDesktop
		//y el atributo "vistas" sobraría
		this.getContentPane().remove(this.desktop);
		this.desktop = new JPanel(new BorderLayout());
		
		this.initDesktop();
		//this.desktop.putClientProperty(
		//		LafWidget.TABBED_PANE_PREVIEW_PAINTER, this.visor);
		//hasta aquí el código que debería ejecutarse siempre
		
		
		//wd.getPanel().putClientProperty(
		//		SubstanceLookAndFeel.TABBED_PANE_CLOSE_BUTTONS_PROPERTY,
		//		Boolean.TRUE);
		this.vistas.add(wd);
		
		//Carlos
		//this.desktop.addTab(wd.getPanel().getName(), wd.getPanel());
		this.desktop.add(wd.getPanel());
		
		this.setTitle(this.getTitle()+" | "+wd.getPanel().getName());
		
		//Carlos
		//this.desktop.setSelectedIndex(desktop.getTabCount() - 1);
		
		this.setActiveWorkDesktop(wd);
		this.actualizarTabPreview();

	}

	/**
	 * Stablishes the active WorkDesktop
	 * 
	 * @param wd
	 *            the WorkDesktop to activate
	 */
	public void setActiveWorkDesktop(WorkDesktop wd) {
		this.vistaActiva = wd;
	}

	/**
	 * Gets the active WorkDesktop
	 * 
	 * @return the active WorkDesktop
	 */
	public WorkDesktop getActiveWorkDesktop() {
		return this.vistaActiva;
	}

	/**
	 * Checks if there is an active WorkDesktop
	 * 
	 * @return true if there is an active WorkDesktop
	 */
	public boolean isActiveWorkDesktop() {
		return (this.vistaActiva != null);
	}

	/**
	 * Returns the title of the application
	 * 
	 * @return String with the title of the application
	 */
	public String getWindowTitle() {
		return this.titulo;
	}

	/**
	 * Returns the application desktop in which WorkDesktop are added
	 * 
	 * @return the application desktop
	 */
	//Carlos
	//public JTabbedPane getDesktop() {
	public JPanel getDesktop() {
		return desktop;
	}

	public void cleanPanels()
		{
		amm.cleanPanels();
		}
	/**
	 * Sets the application desktop
	 * 
	 * @param desktop
	 *            the application desktop
	 */
	//Carlos
	//public void setDesktop(JTabbedPane desktop) {
	public void setDesktop(JPanel desktop) {
		this.desktop = desktop;
	}

	public MicroarrayAnnotationsLoadProgressBar getMlpb() {
		return mlpb;
	}

	/**
	 * @return the menuAnalysisRetrieveDescriptors
	 */
	public JMenuItem getMenuAnalysisRetrieveDescriptors() {
		return menuAnalysisRetrieveDescriptors;
	}

	/**
	 * @return the analysisMenuBiclustering
	 */
	public JMenu getAnalysisMenuBiclustering() {
		return analysisMenuBiclustering;
	}

	/**
	 * @return the menuAnalysisGSEA
	 */
	public JMenuItem getMenuAnalysisGSEA() {
		return menuAnalysisGSEA;
	}

	/**
	 * @return the menuAnalysisDifexp
	 */
	public JMenuItem getMenuAnalysisDifexp() {
		return menuAnalysisDifexp;
	}

	/**
	 * @return the menuAnalysisBuildNetwork
	 */
	public JMenuItem getMenuAnalysisBuildNetwork() {
		return menuAnalysisBuildNetwork;
	}

	/**
	 * @return the menuArchivoExportSelection
	 */
	public JMenuItem getMenuArchivoExportSelection() {
		return menuArchivoExportSelection;
	}
	/**
	 * @return the menuArchivoExportFigure
	 */
	public JMenuItem getMenuArchivoExportFigure() {
		return menuArchivoExportFigure;
	}

	/**
	 * @return the menuViewHeatmap
	 */
	public JMenuItem getMenuViewHeatmap() {
		return menuViewHeatmap;
	}
	/**
	 * @return the menuViewHeatmap
	 */
	/*public JMenuItem getMenuViewHeatmap2() {
		return menuViewHeatmap2;
	}
*/
	/**
	 * @return the menuViewParallelCoordinates
	 */
	public JMenuItem getMenuViewParallelCoordinates() {
		return menuViewParallelCoordinates;
	}

	/**
	 * @return the menuViewTRN
	 */
	public JMenuItem getMenuViewTRN() {
		return menuViewTRN;
	}

	/**
	 * @return the menuViewBubbles
	 */
	public JMenuItem getMenuViewBubbles() {
		return menuViewBubbles;
	}

	/**
	 * @return the menuViewOverlapper
	 */
	public JMenuItem getMenuViewOverlapper() {
		return menuViewOverlapper;
	}

	/**
	 * @return the menuViewCloud
	 */
	public JMenuItem getMenuViewCloud() {
		return menuViewCloud;
	}

	/**
	 * @return the menuViewKegg
	 */
	/*public JMenuItem getMenuViewKegg() {
		return menuViewKegg;
	}*/

	/**
	 * @return the viewMenu
	 */
	public JMenu getViewMenu() {
		return viewMenu;
	}

	/**
	 * @return the analysisMenu
	 */
	public JMenu getAnalysisMenu() {
		return analysisMenu;
	}
}