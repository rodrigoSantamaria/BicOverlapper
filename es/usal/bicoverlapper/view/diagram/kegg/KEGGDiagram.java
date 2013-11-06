package es.usal.bicoverlapper.view.diagram.kegg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyVetoException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingWorker;

import keggapi.Definition;
import es.usal.bicoverlapper.controller.kegg.KEGGController;
import es.usal.bicoverlapper.controller.kernel.Session;
import es.usal.bicoverlapper.controller.manager.configurationManager.ConfigurationListener;
import es.usal.bicoverlapper.controller.manager.configurationManager.ConfigurationMenuManager;
import es.usal.bicoverlapper.controller.util.Translator;
import es.usal.bicoverlapper.model.kegg.KEGGModel;
import es.usal.bicoverlapper.view.configuration.panel.KeggParameterConfigurationPanel;
import es.usal.bicoverlapper.view.diagram.Diagram;

/**
 * Class to create Kegg view
 * 
 * @author Carlos Mart�n Casado
 *
 */
public class KEGGDiagram extends Diagram {
	private static final long serialVersionUID = 1L;
	private Session sesion;
	private int alto;
	private int ancho;
	private KEGGModel keggModel;
	private PathwayMapImage pathwayMapImage;
	private JScrollPane pathwayMapImageScrollPane;
	private JComponent panelImagen;
	private JComponent panelInferior;
	private JComponent panelComboBoxes;
	private JComponent panelProgressBar;
	private JComponent panelInferiorDerecha;
	private JComboBox combo1, combo2;
	private JButton botonFlechaIzq, botonFlechaDer;
	private JTextField jtf;
	private JButton botonObtenerImagen;
	
	private JProgressBar progressBar;
	
	private String organism;

	public static final String urlImagenPorDefecto = "es/usal/bicoverlapper/resources/images/keggDefaultImage.gif";	
	
	//�ndices para restaurar la vista
	private int indexCombo1 = -1;
	private int indexCombo2 = -1;
	
	//todo lo de aqu� para abajo son atributos para el tema de los cuantiles
	private boolean configurando = false;
		
	
	
	//configuraci�n del color
	/*
	private static final int lowColor = 0;
	private static final int zeroColor = 1;
	private static final int highColor = 2;
	*/
	private static final int selectionColor = 3;
	private static final int hoverColor = 4;
	
	private Color[] paleta;
	private JTextField[] muestraColor;
	private String[] textoLabel = { 	"Lowest Expression", "Zero Expression", 
										"Highest expression", "Selection", "Hover" 
								};	
	
	private KEGGController keggController;
	
	/**
	 * Default constructor
	 */	
	public KEGGDiagram(){
		super();
	}
	
	/**
	 * Session Constructor
	 * @param session Session in which this diagram is in. It must have microarrayData loaded
	 * @param dim Dimension for this diagram
	 */	
	public KEGGDiagram(Session sesion, Dimension dim) {
		super(new BorderLayout());
		
		this.setName("KEGG " + sesion.getNumKeggDiagrams());
		this.sesion = sesion;

		this.alto = (int) dim.getHeight();
		this.ancho = (int) dim.getWidth();
		this.setPreferredSize(new Dimension(ancho, alto));
		this.setSize(ancho, alto);

		//System.out.println("ESTO ES LA BIBLIOTECA sesion.getMicroarrayData().chip="+sesion.getMicroarrayData().chip);
		//System.out.println("ESTO ES EL NOMBRE DEL ORGANISMO sesion.getMicroarrayData().organism="+sesion.getMicroarrayData().organism);
		//System.out.println("ESTO ES LA BIBLIOTECA SI ARRIBA DA BIOMART sesion.getMicroarrayData().rname="+sesion.getMicroarrayData().rname);
		
		paleta = new Color[] { 	
								sesion.getLowExpColor(), sesion.getAvgExpColor(),
								sesion.getHiExpColor(), sesion.getSelectionColor(),
								sesion.getHoverColor() 
							};		
		muestraColor = new JTextField[paleta.length];
		
		this.keggModel = new KEGGModel(sesion);
		keggModel.setScaleModeKegg(sesion.getScaleMode());
		this.keggController = new KEGGController(this, keggModel, sesion);
	}
	
	/**
	 * Kegg Diagram creation
	 */
	public void create() {		
		try {
			//La creaci�n se hace en un hilo para no congelar la interfaz gr�fica
	        final SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {  
	  
	            @Override  
	            protected Void doInBackground() throws Exception {  
	            	createAndShowKeggGUI();
					return null;  
	            }
	              
	        };  
	          
	        worker.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	/**
	 * Updates the diagram by retrieving the last selection of data
	 */
	public void update(){		
		keggController.update();
	}

	/**
	 * Makes the panel visible
	 */
	public synchronized void run() {
		this.getWindow().setVisible(true);
	}

	/**
	 * Create the Kegg GUI
	 */
	private void createAndShowKeggGUI() {
		//creaci�n del panel que albergar� la imagen
		this.creteImagePanel();
		
		//creaci�n de la barra de progreso que indicar� que se est�n cargando elementos de Kegg
		this.createProgressBar();
				
		//creaci�n del panel inferior
		//albergar� a los comboboxes, las opciones de selecci�n de condici�n y el bot�n para llamar al servidor y obtener la imagen		
		this.createLowerPanel();
	}
	
	/**
	 * Create the lower panel
	 */
	private void createLowerPanel() {		
		//creaci�n del panel inferior
		panelInferior = new JPanel(new BorderLayout(10, 10));
		panelInferior.setOpaque(true);
		
		//medidas predeterminadas principalmente por la altura, para que no se hagan demasiado anchos y antiest�ticos los combos
		panelInferior.setPreferredSize(new Dimension(100, 25));
		panelInferior.setMaximumSize(new Dimension(10000, 25));		
		
		//se a�ade el panel inferior al panel principal de la imagen
		panelImagen.add(panelInferior);		
				
		//creaci�n del panel de los comboboxes
		boolean comboboxesCreated = this.createComboBoxesPanel();
		//si ha habido alg�n problema creando el panel de los comboboxes, se aborta
		if(!comboboxesCreated){
			//se oculta la barra de progreso
			progressBar.setVisible(false);
			return;
		}
		
		//este panel contiene, en la parte central, al panel de los comboboxes
		panelInferior.add(panelComboBoxes, BorderLayout.CENTER);
				
		//creaci�n del panel de las condiciones
		this.createConditionsPanel();
	}

	/**
	 * Create the panel with the Kegg image
	 */	
	private void creteImagePanel() {
		//creaci�n del panel 
		panelImagen = new JPanel();
		panelImagen.setLayout(new BoxLayout(panelImagen, BoxLayout.LINE_AXIS));
		panelImagen.setOpaque(true);
		
		//se le establece al panel una imagen por defecto para que no est� en gris
		this.loadImage(urlImagenPorDefecto, true);
		
		//Se le establece un borde al panel
		panelImagen.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));		
		
		//se coloca el panel de la imagen en el centro de esta ventana
		this.add(panelImagen, BorderLayout.CENTER);
		panelImagen.setLayout(new BoxLayout(panelImagen, BoxLayout.PAGE_AXIS));
		
		//para que se muestre al menos el panel cuando se disponga de �l, dado que montar toda la interfaz tomar� un tiempo...
		panelImagen.revalidate();		
	}

	/**
	 * Create the panel with the available conditions
	 */
	private void createConditionsPanel() {
		//se crea un panel que albergar� lo correspondiente a la selecci�n de las condiciones
		//adem�s, tambi�n albergar� el bot�n "Get image" para realizar la llamada al servidor de Kegg y obtener la imagen coloreada
		panelInferiorDerecha = new JPanel(new BorderLayout(3, 3));
		panelInferiorDerecha.setOpaque(true);
		
		//creaci�n del bot�n izquierdo
		botonFlechaIzq = new JButton(KEGGDiagram.createImageIcon("es/usal/bicoverlapper/resources/images/playIzq.png"));
		botonFlechaIzq.setToolTipText("Use the arrows to choose the condition");
		//mientras se use el skin, estas opciones son ignoradas...
		botonFlechaIzq.setBorder(null);
        botonFlechaIzq.setFocusPainted(false);
        botonFlechaIzq.setContentAreaFilled(false);
        botonFlechaIzq.setBorderPainted(false);
        //cuando se pulse sobre el boton de la izquierda, aparecer� seleccionada la condici�n anterior
        //si se llega a la condici�n m�s baja, no se hace nada
		botonFlechaIzq.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
            	if(keggModel.getValorActualCondition()-1 >= 0){
            		keggModel.setValorActualCondition(keggModel.getValorActualCondition()-1);
            		String texto = sesion.getMicroarrayData().getConditionName(keggModel.getValorActualCondition());
            		jtf.setText(texto);
            		jtf.setToolTipText(texto);
            	}
            }
        });
		
		//creaci�n del bot�n derecho
		botonFlechaDer = new JButton(KEGGDiagram.createImageIcon("es/usal/bicoverlapper/resources/images/playDer.png"));
		botonFlechaDer.setToolTipText("Use the arrows to choose the condition");
        //cuando se pulse sobre el boton de la derecha, aparecer� seleccionada la condici�n siguiente
        //si se llega a la condici�n m�s alta, no se hace nada		
		botonFlechaDer.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
            	if(keggModel.getValorActualCondition()+1 < sesion.getMicroarrayData().getNumConditions()){
            		keggModel.setValorActualCondition(keggModel.getValorActualCondition()+1);
            		String texto = sesion.getMicroarrayData().getConditionName(keggModel.getValorActualCondition());
            		jtf.setText(texto);
            		jtf.setToolTipText(texto);
            	}            
        	}
        });	
		//mientras se use el skin, estas opciones son ignoradas...		
		botonFlechaDer.setBorder(null);
		botonFlechaDer.setFocusPainted(false);
		botonFlechaDer.setContentAreaFilled(false);		
		botonFlechaDer.setBorderPainted(false);
		
		//si el valor de la condici�n seleccionada es mayor que el n�mero de condiciones posibles, algo va mal y se resetea su valor a 0
		if(keggModel.getValorActualCondition() >= this.sesion.getMicroarrayData().getNumConditions())
		{
			keggModel.setValorActualCondition(0);
		}
		//creaci�n del campo de texto que contendr� el nombre de la condici�n
		jtf = new JTextField(this.sesion.getMicroarrayData().getConditionName(keggModel.getValorActualCondition()));
		jtf.setToolTipText(this.sesion.getMicroarrayData().getConditionName(keggModel.getValorActualCondition()));		
		jtf.setEditable(false);
		jtf.setPreferredSize(new Dimension(100, 25));
		jtf.setSize(new Dimension(100, 25));
		jtf.setHorizontalAlignment(JTextField.CENTER);
		
		//creaci�n del panel que albergar� los 3 elementos relativos a la selecci�n de la condici�n
		JPanel panelSeleccionCondicion = new JPanel(new BorderLayout(3, 3));
		//se a�aden los citados elementos al panel
		panelSeleccionCondicion.add(botonFlechaIzq, BorderLayout.WEST);
		panelSeleccionCondicion.add(botonFlechaDer, BorderLayout.EAST);
		panelSeleccionCondicion.add(jtf, BorderLayout.CENTER);
		
		//este panel con la selecci�n de la condici�n se colocar� en la parte derecha del panel inferior derecha
		panelInferiorDerecha.add(panelSeleccionCondicion, BorderLayout.WEST);
		
		//creaci�n del bot�n para realizar la llamada al servidor de Kegg y obtener la imagen
		botonObtenerImagen = new JButton("Get image");
		botonObtenerImagen.setToolTipText("Click here to get the image. You should choose 1 organism and 1 pathway first.");
		botonObtenerImagen.setEnabled(false);
		//este bot�n posee un oyente que har� que, cuando sea pulsado, se desactiven todos los dem�s botones de Kegg, se muestre una barra de progreso y se realice la llamada al servidor
		//todo esto adem�s se har� desde un hilo que no bloquear� la interfaz del programa
		botonObtenerImagen.setActionCommand("1");
		botonObtenerImagen.addActionListener(keggController);

		//se a�ade el citado bot�n al panel inferior derecha
		panelInferiorDerecha.add(botonObtenerImagen, BorderLayout.EAST);
		
		//el panel inferior derecha se a�ade, como parece l�gico, en la parte derecha del panel inferior
		panelInferior.add(panelInferiorDerecha, BorderLayout.EAST);
	}

	/**
	 * Create the panel with the progress bar
	 */	
	private void createProgressBar() {
		//creaci�n del panel para la barra de progreso
		panelProgressBar = new JPanel(new BorderLayout(10, 10));
		//creaci�n de la barra de progreso
		progressBar = new JProgressBar(0, 100);
		progressBar.setPreferredSize(new Dimension(70,15));
		//texto que aparecer� si se pasa el rat�n por encima de la barra de progreso
		progressBar.setToolTipText("Loading KEGG information...");
		//es indeterminada, es decir, no se puede saber qu� porcentaje del trabajo est� hecho 
		//esto es debido a que se realiza en un servidor externo ajeno a este programa
		progressBar.setIndeterminate(true);
		//se coloca la barra en la parte derecha del panel para as� aparecer en la parte superior derecha
		panelProgressBar.add(progressBar, BorderLayout.EAST);
		//el panel de la barra de progreso aparecer� en la parte superior de la ventana
		this.add(panelProgressBar, BorderLayout.NORTH);
		this.revalidate();		
	}

	/**
	 * Create the panel with comboboxes 
	 * 
	 * @return True if the panel was created, otherwise false.
	 */
	private boolean createComboBoxesPanel() {
		String msgError = "";
		
		//creaci�n del Layout para los comboboxes y sus separaciones
		GridLayout layoutComoBoxes = new GridLayout(1,2);
		layoutComoBoxes.setHgap(10);
		layoutComoBoxes.setVgap(10);
		
		//creaci�n del panel que albergar� los comboboxes
		panelComboBoxes = new JPanel(layoutComoBoxes);
		panelComboBoxes.setOpaque(true);
		
		//se obtiene la lista de organismos
		keggController.obtainOrganisms();
		
		String[] organismosSeleccionables = keggModel.getOrganisms();
		if(organismosSeleccionables.length == 0){
			msgError = "Unable to connect with KEGG server. Please, close this diagram, check your conexion and open this diagram again.";
			JOptionPane.showMessageDialog(null, msgError, "Error", JOptionPane.ERROR_MESSAGE);
			return false;
		}

		combo1 = new JComboBox();
		combo1.setToolTipText("Choose an organism");
		//se a�aden todos los organismos al desplegable
		ComboBoxModel comboBox1Model = new DefaultComboBoxModel(organismosSeleccionables);
		combo1.setModel(comboBox1Model);
		
		msgError = "Organism "+sesion.getMicroarrayData().getOrganism()+" not found among KEGG organisms, please select one from the leftmost combo box";		
		
		//si ya hay un �ndice del combobox1 seleccionado...
		if(indexCombo1 != -1){
			//si ese �ndice no se sale de los m�rgenes...
			if(indexCombo1 < organismosSeleccionables.length){
				combo1.setSelectedIndex(indexCombo1);
				organism = (String) combo1.getSelectedItem();
			}
			else{
				JOptionPane.showMessageDialog(null, msgError, "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
		//si no hay un �ndice del combobox1 seleccionado todav�a...
		else{
			int organismoSeleccionado = 0;
			//se busca en la lista el organismo cuyo microarray ha sido cargado por BicOverlapper
			for (String organismo : organismosSeleccionables) {
				if(organismo.contains(this.sesion.getMicroarrayData().getOrganism())){
					organism = organismo;
					break;
				}
				organismoSeleccionado++;
			}
			//se selecciona en el desplegable el organismo cuyo microarray ha sido cargado, siempre que este se encuentre entre los de la lista obtenida
			//o sea, que el �ndice de organismoSeleccionado sea menor que la longitud total de los organismosSeleccionables
			if(organismoSeleccionado < organismosSeleccionables.length){
				combo1.setSelectedIndex(organismoSeleccionado);
			}
			//en caso de no encontrarse en la lista, se avisa al usuario
			else{
				JOptionPane.showMessageDialog(null, msgError, "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
		//tama�o del combobox1, que contiene los organismos
		combo1.setPreferredSize(new Dimension(351, 23));
		combo1.setActionCommand("2");
		//acci�n asociada al combobox1
		combo1.addActionListener(keggController);

		//combobox2, que contiene los pathways
		combo2 = new JComboBox();
		combo2.setToolTipText("Choose a pathway");
		combo2.setActionCommand("3");
		//acci�n asociada al combobox2
		combo2.addActionListener(keggController);

		panelComboBoxes.add(combo1);
		panelComboBoxes.add(combo2);

		//a continuaci�n se rellena el combobox2
        final SwingWorker<Void, Void> workerCombo2 = new SwingWorker<Void, Void>(){  
      	  
            @Override  
            protected Void doInBackground() throws Exception {  
            	fillComboBox2();
                return null;  
            }
            
            @Override
            protected void done(){
            	//si se ha restaurado una sesi�n, se recarga la imagen
            	if(indexCombo1 != -1 && indexCombo2 != -1){
            		revalidate();
            		botonObtenerImagen.doClick();
            	}
            }
              
        };  
        //se ejecuta el rellenado del combobox2 que se hace en 2� plano  
        workerCombo2.execute();
        
        return true;
	}

	/**
	 * Fill combobox2 with the pathways
	 * @throws Exception
	 */
	public void fillComboBox2() throws Exception {
		//se deshabilita para que mientras se est� rellenando no se pueda tocar
		combo2.setEnabled(false);
		//se actualiza el organismo seleccionado
		organism = (String) combo1.getSelectedItem();
		
		// se desea mostrar los pathways del organismo seleccionado en el combobox1
		String organismId = keggModel.getOrganismId((String) combo1.getSelectedItem());

		//se obtienen los definition pathways del servidor
		keggController.obtainDefinitionPathwaysFromOrganism(organismId);
		
		//se recuperan del modelo
		Definition[] pathways = keggModel.getDefinitionPathways();		
		
		//se eliminan los elementos antiguos
		combo2.removeAllItems();
		combo2.addItem("");
		for (int i = 0; i < pathways.length; i++) {
			//s�lo se coge la cadena hasta el "-", ya que lo que hay despu�s es el nombre del organismo
			combo2.addItem(pathways[i].getDefinition().replace(" - "+organism, ""));
			//combo2.addItem(pathways[i].getDefinition());
		}
		
		//si hay un �ndice seleccionado y este �ndice no sobrepasa el n�mero de elementos en el combobox2, se mantiene
		if(indexCombo2 != -1 && indexCombo2 < combo2.getItemCount()){
			combo2.setSelectedIndex(indexCombo2);
		}
		
		//se habilita al estar relleno
		combo2.setEnabled(true);
		//se pone a invisible la progressbar
		progressBar.setVisible(false);
	}

	/**
	 * Mount panels of Kegg window with a new image
	 * @param url Image url
	 * @param isDefaultImage Boolean to indicate if the image to show is the default image or not
	 */
	public void mountPanelsWithNewImage(String url, boolean isDefaultImage) {
		//se eliminan todos los elementos del panel
		panelImagen.removeAll();
		//se carga la nueva imagen a mostrar
		loadImage(url, isDefaultImage);
		//se montan los elementos restantes del panel
		panelImagen.add(panelInferior);		
	}
	
	/**
	 * Load an image in the panelImagen
	 * @param url Image url
	 * @param isDefaultImage Boolean to indicate if the image to show is the default image or not
	 */
	private void loadImage(String url, boolean isDefaultImage) {
		// Get the image to use.
		ImageIcon imagen = null;
		imagen = KEGGDiagram.createImageIcon(url);

		//Se crea el scrollpane
		if(!isDefaultImage){
			pathwayMapImage = new PathwayMapImage(imagen, keggModel.getListaElementosImg(), this.sesion, keggModel.getValorActualCondition(), this);
		}
		else{
			pathwayMapImage = new PathwayMapImage(imagen, this.sesion, this);
		}
		pathwayMapImageScrollPane = new JScrollPane(pathwayMapImage);
		pathwayMapImageScrollPane.setPreferredSize(new Dimension(1024, 768));
		pathwayMapImageScrollPane.setViewportBorder(BorderFactory.createLineBorder(Color.black));
		
		//se a�ade el oyente para el panel de configuraci�n al ScrollPane que contendr� la imagen
		//pero tambi�n ser� necesario a�ad�rselo a la propia imagen si se desea que funcione este bot�n derecho sobre ella
		pathwayMapImageScrollPane.addMouseListener(new ConfigurationListener(this));

		//se a�ade el JScrollPane al panel de la imagen
		panelImagen.add(pathwayMapImageScrollPane);
		
		//para que se recargue el panel con la imagen nueva es necesario llamar a revalidate()
		panelImagen.revalidate();
	}
	
    /**
     * Returns an ImageIcon, or null if the path was invalid
     * @param path Image path
     * @return ImageIcon with the image of the path
     */
    public static ImageIcon createImageIcon(String path) {
    	URL imgURL = null;
    	//si la ruta empieza por http, ser� una imagen en internet
    	if(path.startsWith("http")){
    		try {
				imgURL = new URL(path);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
    	}
    	//si no, ser� una imagen local
    	else{
    		imgURL = ClassLoader.getSystemResource(path);
    	}
    	
    	//si se ha conseguido una imagen, se devuelve el ImageIcon correspondiente
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } 
        //si no, se devuelve null
        else {
            System.err.println("Couldn't find file:" + path);
            return null;
        }
    }    	
    
	public int getId() {
		return es.usal.bicoverlapper.controller.kernel.Configuration.KEGG_ID;
	}
    
	/**
	 * Pops up a configuration panel for heatmap visual properties
	 */
	public void configure() {
		if (!configurando) {
			configurando = true;
			JInternalFrame ventanaConfig = this.getVentanaConfig();

			// Obtenemos el gestor de eventos de configuracion
			ConfigurationMenuManager gestor = new ConfigurationMenuManager(this, ventanaConfig, paleta, muestraColor);

			JPanel panelColor = this.getPanelPaleta(paleta, textoLabel, muestraColor);
			JPanel panelEscala = new KeggParameterConfigurationPanel(sesion);
			this.setPanelEscala(panelEscala);
			JPanel panelBotones = this.getPanelBotones(gestor);

			// Configuramos la ventana de configuracion
			this.initPanelConfig(panelColor, null, null, panelBotones, panelEscala);
			//para que s�lo salgan los par�metros
			//this.initPanelConfig(null, null, panelParametros, panelBotones);

			ventanaConfig.setTitle(Translator.instance.configureLabels.getString("s1") + " " + this.getName());
			sesion.getDesktop().add(ventanaConfig);
			try {
				ventanaConfig.setSelected(true);
			} catch (PropertyVetoException e) {
				e.printStackTrace();
			}
			ventanaConfig.pack();

			//Con esto se mostrar�a como se muestra en todos los dem�s diagramas
			//ventanaConfig.setLocation(getPosition());
			//pero parece ser que quiere que salga centrada			
			int posicionX = (sesion.getMainWindow().getWidth()/2) - (ventanaConfig.getWidth()/2);
			int posicionY = (sesion.getMainWindow().getHeight()/2) - (ventanaConfig.getHeight()/2);
			//ventanaConfig.setLocation(sesion.getMainWindow().getWidth()/2, sesion.getMainWindow().getHeight()/2);
			ventanaConfig.setLocation(posicionX, posicionY);	
			
			//Se hace visible la ventana
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
		sesion.setSelectionColor(paleta[KEGGDiagram.selectionColor]);
		sesion.setHoverColor(paleta[KEGGDiagram.hoverColor]);

		//si el tipo de escala actual es diferente al que ha seleccionado el usuario...
		int scaleModeSelectedByUser = ((KeggParameterConfigurationPanel) this.getPanelEscala()).getScaleModeSelected();
		if(keggModel.getScaleModeKegg() != scaleModeSelectedByUser){
			//se establece ese tipo de escala en la sesi�n
			sesion.setScaleMode(scaleModeSelectedByUser);
			keggModel.setScaleModeKegg(scaleModeSelectedByUser);
			//se informa al usuario que la nueva escala se usar� en la pr�xima imagen que se cargue
			//String msgInfo = "The new scale mode will be applied when you get a new image";
			//JOptionPane.showMessageDialog(null, msgInfo, "Information", JOptionPane.INFORMATION_MESSAGE);			
			
			if(null != botonObtenerImagen){
				//se recarga la imagen directamente
				botonObtenerImagen.doClick();
			}
		}
		
		sesion.updateConfigExcept(this.getName());
		this.configurando = false;
		
		System.out.println("scaleModeKegg = "+keggModel.getScaleModeKegg());
	}
	
	/**
	 * Update the configuration
	 */
	public void updateConfig() {			
		paleta[KEGGDiagram.selectionColor] = sesion.getSelectionColor();
		paleta[KEGGDiagram.hoverColor] = sesion.getHoverColor();
		
		//si se ha actualizado la configuraci�n desde otro diagrama y se ha cambaido la escala
		//hay que actualizar los colores del mapa pathway
		if(sesion.getScaleMode() != keggModel.getScaleModeKegg() && null != botonObtenerImagen){
			botonObtenerImagen.doClick();
		}
		
		keggModel.setScaleModeKegg(sesion.getScaleMode());
		
		repaintAll = true;
		this.repaint();
	}

	/**
	 * @return the indexCombo1
	 */
	public int getIndexCombo1() {
		return indexCombo1;
	}

	/**
	 * @return the indexCombo2
	 */
	public int getIndexCombo2() {
		return indexCombo2;
	}

	/**
	 * @param indexCombo1 the indexCombo1 to set
	 */
	public void setIndexCombo1(int indexCombo1) {
		this.indexCombo1 = indexCombo1;
	}

	/**
	 * @param indexCombo2 the indexCombo2 to set
	 */
	public void setIndexCombo2(int indexCombo2) {
		this.indexCombo2 = indexCombo2;
	}

	/**
	 * @return the combo1
	 */
	public JComboBox getCombo1() {
		return combo1;
	}

	/**
	 * @return the combo2
	 */
	public JComboBox getCombo2() {
		return combo2;
	}

	/**
	 * @return the botonFlechaIzq
	 */
	public JButton getBotonFlechaIzq() {
		return botonFlechaIzq;
	}

	/**
	 * @return the botonFlechaDer
	 */
	public JButton getBotonFlechaDer() {
		return botonFlechaDer;
	}

	/**
	 * @return the botonObtenerImagen
	 */
	public JButton getBotonObtenerImagen() {
		return botonObtenerImagen;
	}

	/**
	 * @return the progressBar
	 */
	public JProgressBar getProgressBar() {
		return progressBar;
	}

	/**
	 * @return the pathwayMapImage
	 */
	public PathwayMapImage getPathwayMapImage() {
		return pathwayMapImage;
	}

	/**
	 * @return the keggModel
	 */
	public KEGGModel getKeggModel() {
		return keggModel;
	}
}
