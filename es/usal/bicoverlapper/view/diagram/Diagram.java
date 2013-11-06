package es.usal.bicoverlapper.view.diagram;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import es.usal.bicoverlapper.controller.kernel.Session;
import es.usal.bicoverlapper.controller.manager.configurationManager.ConfigurationListener;
import es.usal.bicoverlapper.controller.manager.configurationManager.ConfigurationMenuManager;
import es.usal.bicoverlapper.controller.util.Translator;
import es.usal.bicoverlapper.utils.color.ColorChooser;
import es.usal.bicoverlapper.view.main.DiagramWindow;



/**
 * JPanel with functionality to manage linked visualizations.
 * 
 * @author Javier Molpeceres and Rodrigo Santamaria
 */
public abstract class Diagram extends JPanel {

	private static final long serialVersionUID = -8369598516391096478L;
	
	private Session sesion;
	//private DataLayer capaDatos = null;
	private Point ventanaPos;
	private DiagramWindow ventanaPanel;
	private JInternalFrame ventanaConfig;
	private JPanel panelParametros;
	private JPanel panelEscala;
	protected Color colorSeleccion;

	private boolean personas;
	
	private static final int tamMuestra = 5;
	
	//------------------------- Elementos para doble buffering y repintados selectivos ------------------
	/** Imagen necesaria para realizar un rendering con doble buffer */
	protected Image backBuffer = null;
	
	/** Contexto gr�fico necesario para realizar un rendering con doble buffer */	
	protected Graphics2D gbBuffer = null;
	
	/** Imagen que mantiene el estado estable de la gr�fica de coordenadas paralelas */
	protected Image img = null;
	
	
		
	/** Variable que indica si se ha producido un cambio que implica repintar la gr�fica al completo */
	protected boolean repaintAll = true;
	//
	
	/**
	 * Default constructor
	 * 
	 */
	public Diagram(){
		
		this.addMouseListener(new ConfigurationListener(this));
		
		this.ventanaPos = new Point(0,0);		
	}
	
	/**
	 * Constructor with the specified BorderLayout bl
	 * @param bl - the BorderLayout of the diagram
	 */
	public Diagram(BorderLayout bl){
		super(bl);
		this.addMouseListener(new ConfigurationListener(this));
		ventanaPos = new Point(0,0);		
	}
	/**
	 * Stablishes the session layer and its corresponding data layer
	 * 
	 * @param session <code>Session</code> associated to the diagram.
	 */
	public void setSession(Session session){
		this.sesion = session;
	//	this.capaDatos = sesion.getDataLayer();
	//	this.addFocusListener(sesion);	
		
	}
	
	/**
	 * Returns the <code>Session</code> linked to the diagram
	 * 
	 * @return <code>Session</code> linked to the panel
	 */
	public Session getSession(){
		return sesion;
	}
	
	/**
	 * Sets the top-left point of the diagram
	 * 
	 * @param p <code>Point</code> with coordinates of the top-left point.
	 */
	public void setPosition(Point p){
		this.ventanaPos = p;
	}
	
	/**
	 * Returns a <code>Point</code> with top-left coordinates of the diagram
	 * 
	 * @return <code>Point</code> with the diagram coordinates
	 */
	public Point getPosition(){
		return this.ventanaPos;
	}
	
	/**
	 * Sets the <code>PanelWindow</code> that contains this diagram
	 * 
	 * @param w PanelWindow with this diagram
	 */
	public void setWindow(DiagramWindow w){
		this.ventanaPanel = w;
	}
	
	/**
	 * Returns the <code>PanelWindow</code> that contains this diagram
	 * 
	 * @return <code>PanelWindow</code> containing this diagram
	 */
	public DiagramWindow getWindow(){
		return this.ventanaPanel;
	}
	
	/**
	 * Returns a <code>JPanel</code> with the interface for the configuration of diagram colors
	 * 
	 * @param paleta Array with the diagram colors
	 * @param textoLabel Array with labels that define each color
	 * @param muestra <code>JTextField</code> where the colors to be shown are to be drawn
	 * @return <code>JPanel</code> with the configuration interface of diagram colors
	 */
	protected JPanel getPanelPaleta(Color[] paleta, String[] textoLabel, JTextField[] muestra){
		
		//Configuramos el panel de configuracion de la paleta de colores
		JPanel panelColor = new JPanel();
		
		panelColor.setLayout(new GridBagLayout());
		
		JLabel[] etiqueta = new JLabel[paleta.length];
		JButton[] boton = new JButton[paleta.length];
		
		GridBagConstraints constraints = new GridBagConstraints();
		for(int i = 0; i < paleta.length; i++){
			boton[i] = new JButton();
			etiqueta[i] = new JLabel(textoLabel[i]);
			muestra[i] = new JTextField(Diagram.tamMuestra);
			muestra[i].setEditable(false);
			muestra[i].setBackground(paleta[i]);
			boton[i].setText(Translator.instance.configureLabels.getString("s7"));
			boton[i].addActionListener(new ColorChooser(boton[i],muestra[i]));
			
			constraints.gridx = 0;
			constraints.gridy = i;
			constraints.anchor = GridBagConstraints.WEST;
			panelColor.add(etiqueta[i],constraints);
			constraints.anchor = GridBagConstraints.CENTER;

			constraints.gridx = 1;
			constraints.fill = GridBagConstraints.HORIZONTAL;
			constraints.weightx = 1.0;
			panelColor.add(muestra[i],constraints);
			
			constraints.gridx = 2;
			constraints.weightx = 0.0;
			panelColor.add(boton[i],constraints);
		}
		
		return panelColor;
	}

	/**
	 * Devuelve un <code>JPanel</code> con la interfaz para la configuracion de los anclajes del diagrama.
	 * @param sesion <code>Sesion</code> asociada con el diagrama.
	 * @param gestor <code>Gestor>MenuConfiguracion</code> que gestiona el menu de configuracion del diagrama.
	 * @return <code>JPanel</code> con la interfaz de configuracion de los anclajes del diagrama.
	 */
	protected JPanel getPanelAnclajes(Session sesion, ConfigurationMenuManager gestor){
		
		//	Configuramos el panel manejo de anclajes
		
		JPanel panelAnclajes = new JPanel();
		
		panelAnclajes.setLayout(new GridLayout(2,2));
		panelAnclajes.setBackground(Color.LIGHT_GRAY);
										
		final Vector<DiagramWindow> ventanasH = sesion.getDiagramWindows();
		Vector<String> nombresVentanas = new Vector<String>(0,1);
		nombresVentanas.add(Translator.instance.configureLabels.getString("s25"));
		for(int i = 1; i < (ventanasH.size()+1); i++) {
			DiagramWindow ventana = ventanasH.elementAt(i-1);
			if(!ventana.getTitle().equals(this.getWindow().getTitle()) && !es.usal.bicoverlapper.controller.util.ArrayUtils.contains(this.getWindow().getHooks(),ventana.getTitle()))
				nombresVentanas.add(ventana.getTitle());
		}
		String[] listaAnclajes = new String[nombresVentanas.size()];
		for(int i = 0; i < listaAnclajes.length; i++)
			listaAnclajes[i] = nombresVentanas.elementAt(i);
		
		panelAnclajes.add(new JLabel(Translator.instance.configureLabels.getString("s24")));
		JComboBox addMenu = new JComboBox(listaAnclajes);
		addMenu.addActionListener(new AddHookManager(gestor,ventanasH));
		addMenu.setSelectedIndex(0);
		panelAnclajes.add(addMenu);
				
		final Vector<String> anclajes = this.getWindow().getHooks();
		if((anclajes != null) && !anclajes.isEmpty()){
			String[] nombresAnclajes = new String[anclajes.size()+1];
			nombresAnclajes[0] = Translator.instance.configureLabels.getString("s25");
			for(int i = 1; i < (anclajes.size()+1); i++){
				nombresAnclajes[i] = (String)anclajes.elementAt(i-1);
			}
			panelAnclajes.add(new JLabel(Translator.instance.configureLabels.getString("s32")));
			JComboBox menuEliminar = new JComboBox(nombresAnclajes);
			menuEliminar.addActionListener(new GestorEliminarAnclaje(gestor,anclajes));
			menuEliminar.setSelectedIndex(0);
			panelAnclajes.add(menuEliminar);
		}
		
		// Configuramos el panel con la lista de anclajes actuales
		
		JPanel panelListaAnclajes = new JPanel();
		
		panelListaAnclajes.setLayout(new GridLayout(2,1));
		
		panelListaAnclajes.add(new JLabel(Translator.instance.configureLabels.getString("s26")+":"));
		
		JTextArea area = null;
		
		if((anclajes != null) && !anclajes.isEmpty()){
			String texto = new String();
			for(int i = 0; i < anclajes.size(); i++){
				String nombre = (String)anclajes.elementAt(i);
				texto = texto + nombre + "\n";
				
			}
			area = new JTextArea(texto);
		} else
			area = new JTextArea(Translator.instance.configureLabels.getString("s27"));
		
		panelListaAnclajes.add(area);
		
		// Creamos el panel de configuracion de anclajes
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new GridBagLayout());
		
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.weightx = 1.0;
		constraints.anchor = GridBagConstraints.NORTHWEST;
		constraints.fill = GridBagConstraints.BOTH;
		panel.add(panelAnclajes,constraints);
		constraints.gridy = 1;
		constraints.weighty = 1.0;
		panel.add(panelListaAnclajes,constraints);		
		
		return panel;
	}
	
	/**
	 * Establece y configura el panel de los parametros del diagrama.
	 * 
	 * @param panel <code>JPanel</code> que contiene la configuracion de los parametros del diagrama.
	 */
	protected void setPanelParametros(JPanel panel){
		// Configuramos el panel de configuracion de los parametros propios del panel
		
		if(this.panelParametros != null)
			this.panelParametros.setBackground(Color.LIGHT_GRAY);
		
		this.panelParametros = panel;
	}
	
	/**
	 * Devuelve el panel de configuracion de los parametros del diagrama.
	 * 
	 * @return <code>JPanel</code> con la configuracion de los parametros del diagrama.
	 */
	protected JPanel getPanelParametros(){
		return this.panelParametros;
	}
	
	/**
	 * Establece y configura el panel de la escala del diagrama.
	 * 
	 * @param panel <code>JPanel</code> que contiene la configuracion de la escala del diagrama.
	 */
	protected void setPanelEscala(JPanel panel){
		// Configuramos el panel de configuracion de los parametros propios del panel
		
		if(this.panelEscala != null)
			this.panelEscala.setBackground(Color.LIGHT_GRAY);
		
		this.panelEscala = panel;
	}
	
	/**
	 * Devuelve el panel de configuracion de la escala del diagrama.
	 * 
	 * @return <code>JPanel</code> con la configuracion de la escala del diagrama.
	 */
	protected JPanel getPanelEscala(){
		return this.panelEscala;
	}	
	
	/**
	 * Collects the configured paremeters for the diagram
	 *	@deprecated
	 */
	public void collectParameters(){};
	
	/**
	 * Devuelve el panel con los botones para aceptar o cancelar la configuracion realizada, tanto de la paleta de colores, como de
	 * los anclajes y los parametros del diagrama.
	 * 
	 * @param gestor <code>GestorMenuConfiguracion</code> que gestiona el menu de configuracion del diagrama.
	 * @return <code>JPanel</code> Devuelve el panel que contiene los botones que permiten aceptar o cancelar la configuracion realizada.
	 */
	protected JPanel getPanelBotones(ConfigurationMenuManager gestor){
		
		// Configuramos el panel con botones aceptar y cancelar
		
		JPanel panelBotones = new JPanel();
		
		panelBotones.setBackground(Color.LIGHT_GRAY);
		
		JButton botonOK = new JButton(Translator.instance.configureLabels.getString("s9"));
		panelBotones.add(botonOK);
		botonOK.addActionListener(gestor);
		
		JButton botonCancel = new JButton(Translator.instance.configureLabels.getString("s10"));
		panelBotones.add(botonCancel);
		botonCancel.addActionListener(gestor);
		
		return panelBotones;				
	}
	
	/**
	 * Devuelve el <code>JInternalFrame</code> que va a contener los paneles de configuracion del diagrama.
	 * 
	 * @return <code>JInternalFrame</code> que va a contener los paneles de configuracion del diagrama.
	 */
	protected JInternalFrame getVentanaConfig(){
				
		JInternalFrame frame = new JInternalFrame();
		this.ventanaConfig = frame;
		return frame;
	}
	
	/**
	 * Crea el panel de configuracion y lo establece como el panel de contenido de la ventana de configuracion.
	 * 
	 * @param panelPaleta <code>JPanel</code> con la interfaz de configuracion de la paleta de colores.
	 * @param panelAnclajes <code>JPanel</code> con la interfaz de configuracion de los anclajes.
	 * @param panelParametros <code>JPanel</code> con la interfaz de configuracion de los parametros.
	 * @param panelBotones <code>JPanel</code> con la interfaz para aceptar y cancelar la configuracion establecida.
	 */
	protected void initPanelConfig(JPanel panelPaleta, JPanel panelAnclajes, JPanel panelParametros, JPanel panelBotones){
		JTabbedPane tabbedPane = new JTabbedPane();
		
		if(panelPaleta != null)
			tabbedPane.addTab(Translator.instance.configureLabels.getString("s31"), panelPaleta);
		
		if(panelAnclajes != null)
			tabbedPane.addTab(Translator.instance.configureLabels.getString("s23"), panelAnclajes);
		
		if(panelParametros != null){
			this.panelParametros = panelParametros;
			tabbedPane.addTab(Translator.instance.configureLabels.getString("s8"), panelParametros);
		}
		
		tabbedPane.setSelectedIndex(0);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.weightx = 1.0;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		panel.add(tabbedPane,constraints);
		constraints.weightx = 0.0;
		constraints.gridy = 1;
		panel.add(panelBotones,constraints);
		ventanaConfig.setContentPane(panel);
	}
	
	/**
	 * Crea el panel de configuracion y lo establece como el panel de contenido de la ventana de configuracion.
	 * 
	 * @param panelPaleta <code>JPanel</code> con la interfaz de configuracion de la paleta de colores.
	 * @param panelAnclajes <code>JPanel</code> con la interfaz de configuracion de los anclajes.
	 * @param panelParametros <code>JPanel</code> con la interfaz de configuracion de los parametros.
	 * @param panelBotones <code>JPanel</code> con la interfaz para aceptar y cancelar la configuracion establecida.
	 */
	protected void initPanelConfig(JPanel panelPaleta, JPanel panelAnclajes, JPanel panelParametros, JPanel panelBotones, JPanel panelEscala)
	{
		JTabbedPane tabbedPane = new JTabbedPane();
		
		if(panelPaleta != null)
			tabbedPane.addTab(Translator.instance.configureLabels.getString("s31"), panelPaleta);
		
		if(panelAnclajes != null)
			tabbedPane.addTab(Translator.instance.configureLabels.getString("s23"), panelAnclajes);
		
		if(panelParametros != null){
			this.panelParametros = panelParametros;
			tabbedPane.addTab(Translator.instance.configureLabels.getString("s8"), panelParametros);
		}
		
		if(panelEscala != null){
			this.panelEscala = panelEscala;
			tabbedPane.addTab(Translator.instance.configureLabels.getString("s42"), panelEscala);		
		}
		
		tabbedPane.setSelectedIndex(0);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.weightx = 1.0;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		panel.add(tabbedPane,constraints);
		constraints.weightx = 0.0;
		constraints.gridy = 1;
		panel.add(panelBotones,constraints);
		ventanaConfig.setContentPane(panel);
	}
	
	/**
	 * As above, but also sets the tabbed pane to be selected by default
	 * 
	 * @param panelPaleta <code>JPanel</code> con la interfaz de configuracion de la paleta de colores.
	 * @param panelAnclajes <code>JPanel</code> con la interfaz de configuracion de los anclajes.
	 * @param panelParametros <code>JPanel</code> con la interfaz de configuracion de los parametros.
	 * @param panelBotones <code>JPanel</code> con la interfaz para aceptar y cancelar la configuracion establecida.
	 * @param select panel index to get selected by default
	 */
	protected void initPanelConfig(JPanel panelPaleta, JPanel panelAnclajes, JPanel panelParametros, JPanel panelBotones, int select)
		{
		JTabbedPane tabbedPane = new JTabbedPane();
		
		if(panelPaleta != null)
			tabbedPane.addTab(Translator.instance.configureLabels.getString("s31"), panelPaleta);
		
		if(panelAnclajes != null)
			tabbedPane.addTab(Translator.instance.configureLabels.getString("s23"), panelAnclajes);
		
		if(panelParametros != null){
			this.panelParametros = panelParametros;
			tabbedPane.addTab(Translator.instance.configureLabels.getString("s8"), panelParametros);
		}
		
		tabbedPane.setSelectedIndex(select);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.weightx = 1.0;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		panel.add(tabbedPane,constraints);
		constraints.weightx = 0.0;
		constraints.gridy = 1;
		panel.add(panelBotones,constraints);
		ventanaConfig.setContentPane(panel);
		}
	
	/**
	 * Returns the diagram id
	 * 
	 * @return <code>int</code> diagram id
	 */
	public int getId(){return 0;};
	
	/**
	 * Sets the color palette for the diagram
	 * 
	 * @param palette <code>Color</code>  array with palette color
	 */
	public void setPalette(Color[] palette){};
	
	/**
	 * Returns the diagram color palette
	 * 
	 * @return color array with diagram colors
	 */
	public Color[] getColors(){return null;};
	
	/**
	 * This method is called when the Panel that contains the diagram is resized
	 *
	 */
	public void resize(){};
	
	/**
	 * Updates the diagram by retrieving again the data file
	 *
	 */
	public void updateData(){};
	
	/**
	 * Updates the diagram by retrieving the last selection of data
	 *
	 */
	public void update(){};
	
	/**
	 * Sets the height of the diagram
	 * 
	 * @param h <code>int</code> with diagram's height
	 */
	public void setHeight(int h){};
	
	/**
	 * Sets the width of the diagram
	 * 
	 * @param w <code>int</code> with diagram's width
	 */
	public void setWidth(int w){};
	
	/**
	 * Pops up a configuration window for the diagram, where colors for each characteristic
	 * can be selected
	 * TODO: Still in development for most Diagram-derived classes
	 */
	public void configure(){};
	
	/**
	 * Commits the color configuration changes
	 */
	public void endConfig(boolean ok){};
	
	/**
	 * Updates the color configuration with the sesion configuration information
	 */
	public void updateConfig(){};
	
	/**
	 * Esta clase implementa un gestor para a�adir un anclaje a trav�s del panel correspondiente en la ventana de configuracion.
	 * 
	 */
	private class AddHookManager implements ActionListener{
		
		private ConfigurationMenuManager gestor;
		private Vector<DiagramWindow> ventanasH;
		private DiagramWindow itemToAdd;
		
		public AddHookManager(ConfigurationMenuManager gestor, Vector<DiagramWindow> ventanasH){
			this.gestor = gestor;
			this.ventanasH = ventanasH;
		}
		
		public void actionPerformed(ActionEvent e) {
			JComboBox combo = (JComboBox)e.getSource();
			if(combo.getSelectedIndex() != 0){
				String nombreVentana = (String)combo.getSelectedItem();
				int index = 0;
				for(int i = 0; i < ventanasH.size(); i++){
					if(nombreVentana.equals(ventanasH.elementAt(i).getTitle())){
						index = i;
						break;
					}
				}
				itemToAdd = ventanasH.elementAt(index);
			}
			else
				itemToAdd = null;
			
			gestor.setAddItem(itemToAdd);
		}		
	}
	
	/**
	 * Esta clase implementa un gestor para eliminar un anclaje a trav�s del panel correspondiente en la ventana de configuracion.
	 * 
	 * @author Javier Molpeceres Ortego
	 *
	 */
	private class GestorEliminarAnclaje implements ActionListener{
		
		private ConfigurationMenuManager gestor;
		private Vector<String> anclajes;
		private DiagramWindow itemEliminar;
		
		public GestorEliminarAnclaje(ConfigurationMenuManager gestor, Vector<String> anclajes){
			this.gestor = gestor;
			this.anclajes = anclajes;
		}
		
		public void actionPerformed(ActionEvent e) {
			JComboBox combo = (JComboBox)e.getSource();
			if(combo.getSelectedIndex() != 0){
				itemEliminar = sesion.getDiagramWindow(anclajes.elementAt(combo.getSelectedIndex()-1));
			}
			else
				itemEliminar = null;
			
			gestor.setRemoveItem(itemEliminar);
		}	
	}

	boolean isPersonas() {
		return personas;
	}

	void setPersonas(boolean personas) {
		this.personas = personas;
	}

	boolean isRepaintAll() {
		return repaintAll;
	}

	void setRepaintAll(boolean repaintAll) {
		this.repaintAll = repaintAll;
	}

	/**
	 * Returns the color used when selection are done in a diagram
	 * @param cs	the selection color
	 */
	Color getSelectionColor() {
		return colorSeleccion;
	}

	/**
	 * Sets the color used when selection are done in a diagram
	 * @param cs	the selection color
	 */
	public void setSelectionColor(Color cs) {
		this.colorSeleccion = cs;
	}
}