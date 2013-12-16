package es.usal.bicoverlapper.controller.manager;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.pushingpixels.substance.api.skin.SubstanceNebulaLookAndFeel;
import org.rosuda.JRI.REXP;
import org.rosuda.JRI.Rengine;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import prefuse.Display;

import es.usal.bicoverlapper.controller.analysis.AnalysisProgressMonitor;
import es.usal.bicoverlapper.controller.analysis.AnalysisProgressMonitor.AnalysisTask;
import es.usal.bicoverlapper.controller.data.filter.BiclusterResultsFilter;
import es.usal.bicoverlapper.controller.data.filter.GMLFilter;
import es.usal.bicoverlapper.controller.data.filter.MicroarrayFilter;
import es.usal.bicoverlapper.controller.data.filter.NetworkTabFileFilter;
import es.usal.bicoverlapper.controller.data.filter.SyntrenFilter;
import es.usal.bicoverlapper.controller.data.filter.PNGFileFilter;
import es.usal.bicoverlapper.controller.data.filter.TextFileFilter;
import es.usal.bicoverlapper.controller.data.filter.XmlFileFilter;
import es.usal.bicoverlapper.controller.data.parser.FileParser;
import es.usal.bicoverlapper.controller.kernel.Configuration;
import es.usal.bicoverlapper.controller.kernel.Selection;
import es.usal.bicoverlapper.controller.kernel.Session;
import es.usal.bicoverlapper.controller.util.Translator;
import es.usal.bicoverlapper.model.gene.GeneAnnotation;
import es.usal.bicoverlapper.model.microarray.MicroarrayRequester;
import es.usal.bicoverlapper.view.configuration.ConfigurationHandler;
import es.usal.bicoverlapper.view.configuration.DiagramConfiguration;
import es.usal.bicoverlapper.view.configuration.WordCloudDiagramConfiguration;
import es.usal.bicoverlapper.view.configuration.panel.DownloadAEPanel;
import es.usal.bicoverlapper.view.configuration.panel.DownloadGEOPanel;
import es.usal.bicoverlapper.view.configuration.panel.SaveFigurePanel;
import es.usal.bicoverlapper.view.diagram.heatmap2.HeatmapDiagram2;
import es.usal.bicoverlapper.view.diagram.kegg.KEGGDiagram;
import es.usal.bicoverlapper.view.diagram.kegg.KEGGDiagramConfiguration;
import es.usal.bicoverlapper.view.diagram.wordcloud.WordCloudDiagram;
import es.usal.bicoverlapper.view.main.BicOverlapperWindow;
import es.usal.bicoverlapper.view.main.WorkDesktop;

/**
 * Class that handles the File Menu Options
 * 
 * @author Javier Molpeceres and Rodrigo Santamaria
 * @version 3.2, 26/3/2007
 */
public class FileMenuManager implements ActionListener, MicroarrayRequester {

	private BicOverlapperWindow ventana;
	private BufferedReader pathReader;
	private BufferedWriter pathWriter;

	private MicroarrayFilter microFilter = new MicroarrayFilter();

	private Session sesion;
	private String path;
	private boolean addVista;
	private File fichero;
	private JDesktopPane desktop;
	private boolean loadingSession;
	private Document documento;
	private AnalysisTask t;
	private FileMenuManager receiver;
	public SaveFigurePanel sfp;

	/**
	 * Constructor to build a MenuManager
	 * 
	 * @param window
	 *            <code>BicOverlapperWindow</code> that will contain the menu
	 *            that this manager controls
	 */
	public FileMenuManager(BicOverlapperWindow window) {
		this.ventana = window;
		receiver = this;
	}

	/**
	 * Method invoked each time that an option in the view menu is clicked
	 */
	public void actionPerformed(ActionEvent e) {

		String defaultPath = "";

		if (e.getActionCommand().equals("Load Network")) {
			try {
				pathReader = new BufferedReader(new FileReader(
						"es/usal/bicoverlapper/data/networkPath.txt"));
				defaultPath = pathReader.readLine();
				if (defaultPath == null)
					defaultPath = "";
			} catch (IOException ex) {
				System.err.println("pathReader has no information");
				defaultPath = "";
			}

			JFileChooser selecFile = new JFileChooser();
			GMLFilter gml = new GMLFilter();
			selecFile.addChoosableFileFilter(gml);
			selecFile.addChoosableFileFilter(new NetworkTabFileFilter());
			selecFile.addChoosableFileFilter(new SyntrenFilter());
			selecFile.setFileFilter(gml);
			selecFile.setCurrentDirectory(new File(defaultPath));
			int returnval = selecFile.showDialog((Component) e.getSource(),
					"Load Network");

			if (returnval == JFileChooser.APPROVE_OPTION) {
				// Si no hay TRN pero hay microarray dejamos en la misma sesión
				fichero = selecFile.getSelectedFile();
				path = fichero.getAbsolutePath();
				if (selecFile.getFileFilter().getDescription()
						.contains("yntren"))
					readNetwork(fichero.getAbsolutePath(), fichero, sesion, "syntren", true);
				else if (selecFile.getFileFilter().getDescription()
						.contains("*.txt"))
					readNetwork(fichero.getAbsolutePath(), fichero, sesion, "tab", true);
				else
					readNetwork(fichero.getAbsolutePath(), fichero, sesion, "gml", true);
			}
		} else if (e.getActionCommand().equals("Load Expression Data")) {
			try {
				pathReader = new BufferedReader(new FileReader(
						"es/usal/bicoverlapper/data/matrixPath.txt"));
				defaultPath = pathReader.readLine();
				if (defaultPath == null)
					defaultPath = "";
			} catch (IOException ex) {
				System.err.println("pathReader has no information");
				defaultPath = "";
			}

			JFileChooser selecFile = new JFileChooser();
			selecFile.addChoosableFileFilter(microFilter);
			selecFile.setFileFilter(microFilter);
			File f = new File(defaultPath);
			selecFile.setCurrentDirectory(f);
			int returnval = selecFile.showDialog((Component) e.getSource(),
					"Load Expression Data");

			if (returnval == JFileChooser.APPROVE_OPTION) {
				selecFile.setVisible(false);
				fichero = selecFile.getSelectedFile();
				path = fichero.getPath();
				readMicroarray();
			}
		} else if (e.getActionCommand().equals("Internal Load Expression Data")) {
			readMicroarray(sesion.microarrayPath);
		} else if (e.getActionCommand().equals("Load Groups")) {
			try {
				pathReader = new BufferedReader(new FileReader(
						"es/usal/bicoverlapper/data/groupsPath.txt"));
				defaultPath = pathReader.readLine();
				if (defaultPath == null)
					defaultPath = "";
			} catch (IOException ex) {
				System.err.println("pathReader has no information");
				defaultPath = "";
			}

			JFileChooser selecFile = new JFileChooser();
			BiclusterResultsFilter brf=new BiclusterResultsFilter();
			selecFile.addChoosableFileFilter(brf);
			selecFile.setFileFilter(brf);
			selecFile.setCurrentDirectory(new File(defaultPath));

			int returnval = selecFile.showDialog((Component) e.getSource(),
					"Load Groups");

			if (returnval == JFileChooser.APPROVE_OPTION) {
				fichero = selecFile.getSelectedFile();
				path = fichero.getAbsolutePath();
				readGroups(path, fichero, sesion);
			}
		}

		// ------------------- EXPORT SELECTION ------------------
		else if (e.getActionCommand().equals("Export Selection")) {
			JFileChooser selecFile = new JFileChooser();
			selecFile.addChoosableFileFilter(new TextFileFilter());
			selecFile.setCurrentDirectory(new File(defaultPath));

			int returnval = selecFile.showSaveDialog((Component) e.getSource());

			if (returnval == JFileChooser.APPROVE_OPTION) {
				File fichero = selecFile.getSelectedFile();

				writeSelection(fichero);
			}
		}
		// ------------------- EXPORT Figure ------------------
				else if (e.getActionCommand().equals("Export Figure")) {
					//if(sfp==null)
						sfp=new SaveFigurePanel(this.sesion);
					
					sfp.setVisible(true);
					}
		// ------------------- SAVE GROUPS ------------------
				else if (e.getActionCommand().equals("Save Groups...")) {
					JFileChooser selecFile = new JFileChooser();
					selecFile.addChoosableFileFilter(new TextFileFilter());
					selecFile.setCurrentDirectory(new File(defaultPath));

					int returnval = selecFile.showSaveDialog((Component) e.getSource());

					if (returnval == JFileChooser.APPROVE_OPTION) {
						File fichero = selecFile.getSelectedFile();

						writeSelection(fichero);
					}
				}
		// ------------------- SAVE NETWORK ------------------
				else if (e.getActionCommand().equals("Save Network...")) {
					JFileChooser selecFile = new JFileChooser();
					selecFile.addChoosableFileFilter(new TextFileFilter());
					selecFile.setCurrentDirectory(new File(defaultPath));

					int returnval = selecFile.showSaveDialog((Component) e.getSource());

					if (returnval == JFileChooser.APPROVE_OPTION) {
						File fichero = selecFile.getSelectedFile();

						writeSelection(fichero);
					}
				}

		// ------------------- Download AE experiment ------------------
		else if (e.getActionCommand().equals("Download from ArrayExpress...")) {
			DownloadAEPanel dp = new DownloadAEPanel(this);
			dp.setLocation((ventana.getWidth() - dp.getWidth()) / 2,
					(ventana.getHeight() - dp.getHeight()) / 2);
			dp.setVisible(true);
		}
		else if (e.getActionCommand().equals("Download from GEO...")) {
			DownloadGEOPanel dp = new DownloadGEOPanel(this);
			dp.setLocation((ventana.getWidth() - dp.getWidth()) / 2,
					(ventana.getHeight() - dp.getHeight()) / 2);
			dp.setVisible(true);
		}
		// ------------------------- CARGAR CONFIGURACION
		// -------------------------
		else if (e.getActionCommand().equals(
				Translator.instance.menuLabels.getString("s17"))) {
			JFileChooser selecFile = new JFileChooser();
			selecFile.addChoosableFileFilter(new XmlFileFilter());
			
			try{
				pathReader = new BufferedReader(new FileReader("es/usal/bicoverlapper/data/matrixPath.txt"));
				defaultPath = pathReader.readLine();
				}catch(Exception ex){ex.printStackTrace();}
			selecFile.setCurrentDirectory(new File(defaultPath));
						

			int returnval = selecFile.showDialog((Component) e.getSource(),
					Translator.instance.menuLabels.getString("s21"));

			if (returnval == JFileChooser.APPROVE_OPTION) {
				File fichero = selecFile.getSelectedFile();
				loadSession(fichero);
			}
		}
		// -------------------- GUARDAR CONFIGURACIÓN -------------------
		else if (e.getActionCommand().equals(
				Translator.instance.menuLabels.getString("s18"))
				&& ventana.isActiveWorkDesktop()) {
			JFileChooser selecFile = new JFileChooser();
			selecFile.addChoosableFileFilter(new XmlFileFilter());
			
			try{
				pathReader = new BufferedReader(new FileReader("es/usal/bicoverlapper/data/matrixPath.txt"));
				defaultPath = pathReader.readLine();
				}catch(Exception ex){ex.printStackTrace();}
			selecFile.setCurrentDirectory(new File(defaultPath));
			

			int returnval = selecFile.showSaveDialog((Component) e.getSource());
			if (returnval == JFileChooser.APPROVE_OPTION) {
				String s = selecFile.getSelectedFile().getAbsolutePath();
				s = s.contains(".") ? s : s.concat(".xml");
				saveSession(s);
			}
		} else if (e.getActionCommand().equals(
				Translator.instance.menuLabels.getString("openLastProject"))) {
			// if(sesion!=null) closeSession();
			if (sesion != null && ventana.getActiveWorkDesktop() != null) {
				ventana.getActiveWorkDesktop().getPanel().removeAll();
				ventana.getActiveWorkDesktop().getPanel().setName("");

				// Carlos
				// ventana.getDesktop().setTitleAt(0, "");

				// Carlos
				ventana.setTitle("");

			}
			loadSession(new File("es/usal/bicoverlapper/data/recent1.xml"));
		} else if (e.getActionCommand().charAt(1) == ')') {
			// if(sesion!=null) closeSession();
			if (sesion != null && ventana.getActiveWorkDesktop() != null)
				ventana.getActiveWorkDesktop().getPanel().setName("");
			loadSession(new File("es/usal/bicoverlapper/data/recent"
					+ e.getActionCommand().charAt(0) + ".xml"));
		}

		// ----------------------- SALIR -------------------------------
		else if (e.getActionCommand().equals(
				Translator.instance.menuLabels.getString("s19"))) {
			System.exit(0);
		}
	}

	public void downloadExperiment(String id, String downloadPath, boolean geo, boolean logTransform) {
		System.out.println("Downloading experiments " + downloadPath);
		
		//si no se ha introducido nada el campo solicitado...
		if(downloadPath == null || downloadPath.equals("") || downloadPath.equals(".txt")){
			try{
				SwingUtilities.invokeLater(new Runnable(){
					public void run(){
						String msgError = "Please introduce an ArrayExpress accession number to download and normalize";
						JOptionPane.showMessageDialog(null,msgError, "Error",JOptionPane.ERROR_MESSAGE);
					}});}catch(Exception e){e.printStackTrace();}
				
			return;
		}
		
		fichero = new File(downloadPath);
		prepareDesktop();
		try {
			sesion.getAnalysis().loadRscripts();
			ArrayList<Object> p = new ArrayList<Object>();
			p.add(id);
			p.add(downloadPath);
			
			AnalysisProgressMonitor apm;
			if(geo)
				{
				p.add(logTransform);
				apm = new AnalysisProgressMonitor(
						sesion.getAnalysis(),
						AnalysisProgressMonitor.AnalysisTask.DOWNLOAD_GEO_MATRIX, p,
						"Downloading data...");
				}
			else
				apm = new AnalysisProgressMonitor(
					sesion.getAnalysis(),
					AnalysisProgressMonitor.AnalysisTask.DOWNLOAD_MATRIX, p,
					"Downloading data...");
			apm.run();
			t = apm.getTask();
			Thread wt = new Thread() {
				public void run() {
					try {
						String fileName = t.get();
						if (fileName == null) {
							try{
								SwingUtilities.invokeLater(new Runnable(){
									public void run(){
										JOptionPane.showMessageDialog(null, "Experiment cannot be loaded", "Error", JOptionPane.ERROR_MESSAGE);
									}});}catch(Exception e){e.printStackTrace();}
							t.message = "Error: experiment cannot be loaded";
						}

						else {
							sesion.getReader().readMicroarray(fichero, sesion,
									receiver);
							sesion.microarrayPath = fichero.getAbsolutePath();
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			wt.start();

		}catch (Exception e3) {
			JOptionPane.showMessageDialog(null,
					"Format Error: " + e3.getMessage(), "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Finish the load of a matrix
	 */
	public void receiveMatrix(int status) {
		System.out.println("Finished microarray data reading with status: "
				+ status);
		// ---
		if (status == 0)
		{
			// Actualizar las ventanas activas
			sesion.getAnalysis().setMicroarrayData(sesion.getMicroarrayData());
			sesion.microarrayPath = fichero.getAbsolutePath();
			try {
				pathWriter = new BufferedWriter(new FileWriter(
						"es/usal/bicoverlapper/data/matrixPath.txt"));
				pathWriter.write(sesion.microarrayPath);
				pathWriter.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}

			sesion.updateData();

			ventana.getAnalysisMenu().setEnabled(true);

			ventana.getViewMenu().setEnabled(true);
			ventana.getMenuViewParallelCoordinates().setEnabled(true);
			ventana.getMenuViewHeatmap().setEnabled(true);
			//ventana.getMenuViewHeatmap2().setEnabled(true);
			ventana.getMenuViewCloud().setEnabled(true);
			//ventana.getMenuViewKegg().setEnabled(true);
			
			ventana.getMenuArchivoExportSelection().setEnabled(true);
			ventana.getMenuArchivoExportFigure().setEnabled(true);
			ventana.getMenuViewCloud().setEnabled(true);

			SwingUtilities.invokeLater(new Runnable(){
				public void run(){
					
			if (addVista)
				ventana.addWorkDesktop(new WorkDesktop(desktop, sesion));
			else {
				JDesktopPane p = ventana.getActiveWorkDesktop().getPanel();
				if (p.getName().length() > 0 && !p.getName().contains(".txt")) {
					p.setName(p.getName() + " | " + fichero.getName());

					ventana.setTitle(ventana.getTitle() + " | "
							+ fichero.getName());

				} else {
					p.setName(fichero.getName());

					ventana.setTitle(ventana.getTitle() + " | "
							+ fichero.getName());
				}
			}

			if (loadingSession)
				loadSessionAfterMicroarray();
			else
				{
				ventana.getViewMenuManager().viewParallelCoordinates(sesion);
				ventana.getViewMenuManager().viewHeatmap(sesion);
				}
			
			}});
			

		}
	else
		{
		//TODO: properly deal with errors here: especially about retrieving annotations (should be stopped)
		}

	}

	/**
	 * Closes the current session
	 */
	public void closeSession() {
		sesion.restart();
		ventana.getDesktop().removeAll();
	}

	public void loadSession(File file) {

		try {
			loadingSession = true;
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			// factory.setValidating(true);
			DocumentBuilder builder = factory.newDocumentBuilder();
			builder.setErrorHandler(new org.xml.sax.ErrorHandler() {

				public void fatalError(SAXParseException exception)
						throws SAXException {
				}

				public void error(SAXParseException e) throws SAXParseException {
					throw e;
				}

				public void warning(SAXParseException err)
						throws SAXParseException {
					System.out.println("** Warning" + ", line "
							+ err.getLineNumber() + ", uri "
							+ err.getSystemId());
					System.out.println("   " + err.getMessage());
				}
			});
			documento = builder.parse(file);

			// 1) Load files in paths
			NodeList micro = documento.getElementsByTagName("microarray_path");
			if(micro != null && null != micro.item(0)){
				String mp = ((Element) micro.item(0)).getFirstChild().getNodeValue();
				fichero = new File(mp);
				path = fichero.getPath();
				readMicroarray();
				// When the microarray is read, the session continues loading at
				// loadSessionAfterMicroarray
			}
			else{
				//this.prepareDesktop();
				this.loadSessionAfterMicroarray();
			}

		} catch (SAXException sxe) {
			// error generado durante el parsing
			Exception x = sxe;
			if (sxe.getException() != null)
				x = sxe.getException();
			x.printStackTrace();
		} catch (ParserConfigurationException pce) {
			// el parser con las opciones especificadas no se puede construir
			pce.printStackTrace();
		} catch (IOException ioe) {
			// error E/S
			ioe.printStackTrace();
		} catch (Exception e) {
			// error E/S
			e.printStackTrace();
		}
	}

	public void loadSessionAfterMicroarray() {
		try {
			loadingSession = false;
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			// factory.setValidating(true);
			DocumentBuilder builder = factory.newDocumentBuilder();
			builder.setErrorHandler(new org.xml.sax.ErrorHandler() {
				public void fatalError(SAXParseException exception)
						throws SAXException {
				}

				public void error(SAXParseException e) throws SAXParseException {
					throw e;
				}

				public void warning(SAXParseException err)
						throws SAXParseException {
					System.out.println("** Warning" + ", line "
							+ err.getLineNumber() + ", uri "
							+ err.getSystemId());
					System.out.println("   " + err.getMessage());
				}
			});

			// 1) Load biclusters and trn
			NodeList bic = documento.getElementsByTagName("biclusters_path");
			if (bic != null && bic.item(0) != null) {
				String rutaFichero = ((Element) bic.item(0)).getFirstChild().getNodeValue();
				fichero = new File(rutaFichero);
				path = fichero.getAbsolutePath();
				readGroups(path, fichero, sesion);
				sesion.biclusteringPath = rutaFichero;
			}

			NodeList trn = documento.getElementsByTagName("trn_path");
			if (trn != null && trn.item(0) != null) {
				String rutaFichero = ((Element) trn.item(0)).getFirstChild().getNodeValue();
				fichero = new File(rutaFichero);
				path = fichero.getAbsolutePath();

				readNetwork(fichero.getAbsolutePath(), fichero, sesion,"syntren", true);// TODO: Change to different types
				sesion.trnPath = rutaFichero;
			}

			// 2) Load Visualizations
			ConfigurationHandler config = new ConfigurationHandler();
			NodeList ventanas = documento.getElementsByTagName("window");

			for (int i = 0; i < ventanas.getLength(); i++) {
				Element ventana = (Element) ventanas.item(i);
				// procesamos cada nodo ventana para construir su configuracion
				// asociada
				Node nodo = ventana.getFirstChild();
				int identificador = new Integer(nodo.getFirstChild()
						.getNodeValue()).intValue();

				nodo = nodo.getNextSibling();
				String nombre = nodo.getFirstChild().getNodeValue();

				nodo = nodo.getNextSibling();
				Element elemento = (Element) nodo;
				int posX, posY;
				posX = Integer.valueOf(elemento.getAttribute("x")).intValue();
				posY = Integer.valueOf(elemento.getAttribute("y")).intValue();

				nodo = nodo.getNextSibling();
				elemento = (Element) nodo;
				Dimension tam = new Dimension(Integer.valueOf(
						elemento.getAttribute("width")).intValue(), Integer
						.valueOf(elemento.getAttribute("height")).intValue());

				nodo = nodo.getNextSibling();
				elemento = (Element) nodo;

				DiagramConfiguration configventana = new DiagramConfiguration(
						identificador, nombre, posX, posY, tam);
				
				// procesar paleta de colores
				if (nodo != null) {
					NodeList colores = nodo.getChildNodes();
					for (int j = 0; j < colores.getLength(); j++) {
						Element color = (Element) colores.item(j);
						Color color2 = new Color(Integer.valueOf(
								color.getAttribute("red")).intValue(), Integer
								.valueOf(color.getAttribute("green"))
								.intValue(), Integer.valueOf(
								color.getAttribute("blue")).intValue());
						configventana.addColor(color2);
					}
				}
				
				// process settings depend on the type of window
				if (identificador == Configuration.CLOUD_ID) {
					WordCloudDiagramConfiguration wccd = new WordCloudDiagramConfiguration(
							configventana);
					nodo = nodo.getNextSibling();
					elemento = (Element) nodo;
					wccd.setTextIndex(Integer.valueOf(
							elemento.getAttribute("text")).intValue());
					wccd.setSplitIndex(Integer.valueOf(
							elemento.getAttribute("split")).intValue());
					wccd.setSizeIndex(Integer.valueOf(
							elemento.getAttribute("size")).intValue());
					wccd.setOntologyIndex(Integer.valueOf(
							elemento.getAttribute("ontology")).intValue());

					config.addWindowConfiguration(wccd);
				} 
				else if(identificador == Configuration.KEGG_ID){
					KEGGDiagramConfiguration kdc = new KEGGDiagramConfiguration(configventana);
					nodo = nodo.getNextSibling();
					elemento = (Element) nodo;
					kdc.setIndexCombo1(Integer.valueOf(elemento.getAttribute("combo1")).intValue());
					kdc.setIndexCombo2(Integer.valueOf(elemento.getAttribute("combo2")).intValue());
					kdc.setValorActualCondition(Integer.valueOf(elemento.getAttribute("condition")).intValue());

					//se restablece la escala
					sesion.setScaleMode(Integer.valueOf(elemento.getAttribute("scale")).intValue());
					
					config.addWindowConfiguration(kdc);
				}
				else{
					config.addWindowConfiguration(configventana);
				}
			}
			this.sesion.setConfig(config);

			// 2) Set selection
			//variable para notificar la lectura de genes erróneos
			boolean genesErroneos = false;
			LinkedList<Integer> g = new LinkedList<Integer>();
			//se obtienen los genes del XML
			NodeList genesXML = documento.getElementsByTagName("gene");
			
			//si se ha leído un microarray se contrastarán con él los genes leídos
			if(null != sesion.getMicroarrayData()){
				for (int i = 0; i < genesXML.getLength(); i++) {
					//para cada gen del XML
					Element gene = (Element) genesXML.item(i);
					int gen = new Integer(gene.getFirstChild().getNodeValue());
					if(sesion.getMicroarrayData().getGeneName(gen)==null)
						genesErroneos = true;
					else
						g.add(gen);
					}
				}
			//si no se ha leído un microarray se leen los genes sin comprobar
			else{
				for (int i = 0; i < genesXML.getLength(); i++) {
					//para cada gen del XML
					Element gene = (Element) genesXML.item(i);
					int gen = new Integer(gene.getFirstChild().getNodeValue());
					g.add(gen);
				}
			}
			
			LinkedList<Integer> c = new LinkedList<Integer>();
			boolean condicionesErroneas = false;
			NodeList conditions = documento.getElementsByTagName("condition");
			for (int i = 0; i < conditions.getLength(); i++) {
				//para cada condición del XML
				Element condition = (Element) conditions.item(i);
				int cond = new Integer(condition.getFirstChild().getNodeValue());
					
					//si se ha leído un microarray se podrá realizar la comprobación
					if(null != sesion.getMicroarrayData()){
						//se comprueba que esa condición cuadra entre las leídas del microarray
						if(cond >= 0 && cond < sesion.getMicroarrayData().getNumConditions()){
							c.add(cond);
						}
						else{
							condicionesErroneas = true;
						}
					}
					//si no se ha leído un microarray no es posible realizar la comprobación anterior
					else{
						c.add(cond);
					}
			}
			
			//se notifica al usuario la existencia de condiciones erróneas en el fichero XML
			if(genesErroneos || condicionesErroneas){
				//el mensaje mostrado dependerá de los errores
				String msgError = "";
				if(genesErroneos && condicionesErroneas){
					msgError = "Some genes and conditions of the project are not on the associated expression data. This may lead to errors.";
				}
				else if(genesErroneos){
					msgError = "Some genes of the xml file are wrong. This may lead to errors.";
				}
				else if(condicionesErroneas){
					msgError = "Some conditions of the xml file are wrong. This may lead to errors.";					
				}
				
				JOptionPane.showMessageDialog(null, msgError, "Error", JOptionPane.ERROR_MESSAGE);	
			}			
		
		//	this.wait(100000);
			Selection bs = new Selection(g, c);
			if (bs.getGenes().size() > 0 || bs.getConditions().size() > 0)
				sesion.setSelectedBiclustersExcept(bs, "");
		} catch (ParserConfigurationException pce) {
			// el parser con las opciones especificadas no se puede construir
			pce.printStackTrace();
		} catch (Exception e) {
			// error E/S
			e.printStackTrace();
		}
	}

	public ArrayList<String> recentFileList() {
		ArrayList<String> recent = new ArrayList<String>();
		try {
			for (int i = 1; i <= 5; i++) {
				File file = new File("es/usal/bicoverlapper/data/recent" + i
						+ ".xml");
				if (!file.exists())
					break;

				DocumentBuilderFactory factory = DocumentBuilderFactory
						.newInstance();
				DocumentBuilder builder = factory.newDocumentBuilder();
				builder.setErrorHandler(new org.xml.sax.ErrorHandler() {

					public void fatalError(SAXParseException exception)
							throws SAXException {
					}

					public void error(SAXParseException e)
							throws SAXParseException {
						throw e;
					}

					public void warning(SAXParseException err)
							throws SAXParseException {
						System.out.println("** Warning" + ", line "
								+ err.getLineNumber() + ", uri "
								+ err.getSystemId());
						System.out.println("   " + err.getMessage());
					}
				});
				documento = builder.parse(file);

				// 1) Load files in paths
				String name = i + ") ";
				/*
				 * NodeList node =
				 * documento.getElementsByTagName("microarray_path");
				 * if(node!=null && node.item(0)!=null) { String
				 * s=((Element)node
				 * .item(0)).getFirstChild().getNodeValue().replace("\\", "/");
				 * name+=s.substring(s.lastIndexOf("/")+1)+" | "; } node =
				 * documento.getElementsByTagName("biclusters_path");
				 * if(node!=null && node.item(0)!=null) { String
				 * s=((Element)node
				 * .item(0)).getFirstChild().getNodeValue().replace("\\", "/");
				 * name+=s.substring(s.lastIndexOf("/")+1)+" | "; } node =
				 * documento.getElementsByTagName("trn_path"); if(node!=null &&
				 * node.item(0)!=null) { String
				 * s=((Element)node.item(0)).getFirstChild
				 * ().getNodeValue().replace("\\", "/");
				 * name+=s.substring(s.lastIndexOf("/"))+" | "; }
				 */
				NodeList node = documento.getElementsByTagName("project_path");
				if (node != null && node.item(0) != null) {
					String s = ((Element) node.item(0)).getFirstChild()
							.getNodeValue().replace("\\", "/");
					name += s.substring(s.lastIndexOf("/") + 1);
				}
				recent.add(name);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return recent;
	}

	public void printFigure(File file)
		{
		sesion.getDiagramWindow("Microarray Heatmap 1").getDiagram().printFigure(file,0);
		}
	public void saveSession(String fileName) {
		try {
			if (fileName == null)
				return;
			
			//se comprueba si hay ficheros temporales para, en tal caso, avisar al usuario de que debería guardarlos para restaurar sesión
			String[] tmpFiles = FileParser.getFilesInDirectory(".", ".tmp");
			if(tmpFiles.length != 0){
				String tmpf ="";
				for (String f : tmpFiles) {
					tmpf += f+", ";
				}
				
				//se elimina ", " añadidos al final para mostrar la cadena correctamente
				tmpf = tmpf.substring(0, tmpf.length()-2);
				
				String msgError = "There are temporary files: "+tmpf+". To restore the project correctly, please save this files.";
				JOptionPane.showMessageDialog(
						null,
						msgError,
						"Warning",
						JOptionPane.WARNING_MESSAGE);
			}
			
			File file = null;
			// TODO: Pass recent1 to recent2... and delete recent5, for example
			int cont = 5;
			file = new File("es/usal/bicoverlapper/data/recent" + cont + ".xml");
			while (!file.exists() && cont > 0) {
				cont--;
				file = new File("es/usal/bicoverlapper/data/recent" + cont
						+ ".xml");
			}
			for (int i = cont; i > 0; i--) {
				file = new File("es/usal/bicoverlapper/data/recent" + i
						+ ".xml");
				if (i == 5)
					file.delete();
				else
					file.renameTo(new File("es/usal/bicoverlapper/data/recent"
							+ (i + 1) + ".xml"));
			}

			file = new File(fileName);
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			DOMImplementation implementation = builder.getDOMImplementation();
			DocumentType doctype = implementation.createDocumentType("project",
					null, "project.dtd");
			Document documento = implementation.createDocument(null, "project",
					doctype);

			// 1) Write paths of the open files
			Element paths = documento.createElement("paths");

			Element projectPath = documento.createElement("project_path");
			projectPath.appendChild(documento.createTextNode(fileName));
			paths.appendChild(projectPath);

			if (this.sesion.microarrayPath != null) {
				Element microPath = documento.createElement("microarray_path");
				microPath.appendChild(documento
						.createTextNode(sesion.microarrayPath));
				paths.appendChild(microPath);
			}
			if (sesion.biclusteringPath != null) {
				Element bicPath = documento.createElement("biclusters_path");
				bicPath.appendChild(documento
						.createTextNode(sesion.biclusteringPath));
				paths.appendChild(bicPath);
			}
			if (sesion.trnPath != null) {
				Element netPath = documento.createElement("trn_path");
				netPath.appendChild(documento.createTextNode(sesion.trnPath));
				paths.appendChild(netPath);
			}
			documento.getDocumentElement().appendChild(paths);

			// 2) Write selection if any
			if (this.sesion.getSelectedBicluster() != null) {
				Element selection = documento.createElement("selection");
				Element genes = documento.createElement("genes");
				for (Integer g : sesion.getSelectedBicluster().getGenes()) {
					Element gene = documento.createElement("gene");
					gene.appendChild(documento.createTextNode(g.toString()));
					genes.appendChild(gene);
				}
				selection.appendChild(genes);
				Element conditions = documento.createElement("conditions");
				for (Integer c : sesion.getSelectedBicluster().getConditions()) {
					Element condition = documento.createElement("condition");
					condition
							.appendChild(documento.createTextNode(c.toString()));
					conditions.appendChild(condition);
				}
				selection.appendChild(conditions);
				documento.getDocumentElement().appendChild(selection);
			}

			// 3) Write configuration of the open windows
			ConfigurationHandler config = sesion.getConfig();

			Element config_Ventanas = documento.createElement("windows");

			DiagramConfiguration configVentana;

			for (int i = 0; i < config.getSizeConfig(); i++) {

				configVentana = config.getWindowConfiguration(i);

				Element ventana = documento.createElement("window");

				Element identificador = documento.createElement("id");
				identificador.appendChild(documento.createTextNode(new Integer(
						configVentana.getId()).toString()));
				ventana.appendChild(identificador);

				Element nombre = documento.createElement("name");
				nombre.appendChild(documento.createTextNode(configVentana
						.getTitle()));
				ventana.appendChild(nombre);

				Element posicion = documento.createElement("location");
				Integer posX = new Integer(configVentana.getPosX());
				posicion.setAttribute("x", posX.toString());
				Integer posY = new Integer(configVentana.getPosY());
				posicion.setAttribute("y", posY.toString());
				ventana.appendChild(posicion);

				Element tamanyo = documento.createElement("size");
				Integer tamX = new Integer(configVentana.getDim().width);
				tamanyo.setAttribute("width", tamX.toString());
				Integer tamY = new Integer(configVentana.getDim().height);
				tamanyo.setAttribute("height", tamY.toString());
				ventana.appendChild(tamanyo);

				Element paleta = documento.createElement("palette");
				for (int j = 0; j < configVentana.getNumberOfColors(); j++) {
					Element color = documento.createElement("color");
					Color color2 = configVentana.getColor(j);

					Integer componente = new Integer(color2.getRed());
					color.setAttribute("red", componente.toString());
					componente = new Integer(color2.getGreen());
					color.setAttribute("green", componente.toString());
					componente = new Integer(color2.getBlue());
					color.setAttribute("blue", componente.toString());

					paleta.appendChild(color);
				}
				ventana.appendChild(paleta);

				// TODO: Configuration of specific windows (for example,
				// comboboxes on wc)
				if (configVentana.getId() == Configuration.CLOUD_ID) {
					Element configwc = documento
							.createElement("wordCloudSettings");

					WordCloudDiagram wc = (WordCloudDiagram) (sesion
							.getDiagramWindow(configVentana.getTitle())
							.getDiagram());
					configwc.setAttribute("text",
							wc.getMenuCloud().text.getSelectedIndex() + "");
					configwc.setAttribute("split",
							wc.getMenuCloud().split.getSelectedIndex() + "");
					configwc.setAttribute("size",
							wc.getMenuCloud().size.getSelectedIndex() + "");
					configwc.setAttribute("ontology",
							wc.getMenuCloud().ontology.getSelectedIndex() + "");
					ventana.appendChild(configwc);
				}
				
				//Configuration of KEGG 
				if(configVentana.getId() == Configuration.KEGG_ID){
					Element configkd = documento
							.createElement("keggSettings");
					
					KEGGDiagram kd = (KEGGDiagram) (sesion
							.getDiagramWindow(configVentana.getTitle())
							.getDiagram());
					configkd.setAttribute("combo1",
							kd.getIndexCombo1()+ "");		
					configkd.setAttribute("combo2",
							kd.getIndexCombo2()+ "");	
					configkd.setAttribute("condition",
							kd.getKeggModel().getValorActualCondition()+ "");			
					configkd.setAttribute("scale", sesion.getScaleMode()+"");
					ventana.appendChild(configkd);
				}
				
				config_Ventanas.appendChild(ventana);
			}

			documento.getDocumentElement().appendChild(config_Ventanas);
			documento.getDocumentElement().normalize();
			Source source = new DOMSource(documento);
			source.setSystemId("project.dtd");
			Result result = new StreamResult(file);

			Transformer transformer = TransformerFactory.newInstance()
					.newTransformer();
			transformer.setURIResolver(transformer.getURIResolver());
			transformer.transform(source, result);

			if (fileName != null)
				copy(file, new File("es/usal/bicoverlapper/data/recent1.xml"));
		} catch (ParserConfigurationException pce) {
			// el parser con las opciones especificadas no se puede construir
			pce.printStackTrace();
		} catch (TransformerConfigurationException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		} catch (TransformerFactoryConfigurationError e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}

	}

	private void copy(File fromFile, File toFile) {
		FileInputStream from = null;
		FileOutputStream to = null;
		try {
			from = new FileInputStream(fromFile);
			to = new FileOutputStream(toFile);
			byte[] buffer = new byte[4096];
			int bytesRead;

			while ((bytesRead = from.read(buffer)) != -1)
				to.write(buffer, 0, bytesRead); // write
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (from != null)
				try {
					from.close();
				} catch (IOException e) {
					;
				}
			if (to != null)
				try {
					to.close();
				} catch (IOException e) {
					;
				}
		}
	}

	//Carlos
	private void writeSelection(File file) {
		try {
			BufferedWriter bw;
			if (!file.toString().contains("."))
				bw = new BufferedWriter(new FileWriter(new File (file.toString()+".txt")));
			else
				bw = new BufferedWriter(new FileWriter(file));

			if (ventana.getActiveWorkDesktop() != null
					&& ventana.getActiveWorkDesktop().getSession().getSelectedBicluster() != null) {
				Selection bs = ventana.getActiveWorkDesktop().getSession().getSelectedBicluster();

				//se escribe el número de grupos
				bw.write("1");
				bw.newLine();
				
				bw.write("User selection");
				bw.newLine();
				
				bw.write("G1 : "+bs.getGenes().size()+"\t"+bs.getConditions().size());
				bw.newLine();
				ArrayList<String> g = ventana.getActiveWorkDesktop().getSession().getMicroarrayData().getGeneNames(bs.getGenes());

				for (int i = 0; i < bs.getGenes().size(); i++) {
					bw.write(g.get(i) + "\t");
				}
				bw.newLine();
				ArrayList<String> c = ventana.getActiveWorkDesktop().getSession().getMicroarrayData().getConditionNames(bs.getConditions());
				for (int i = 0; i < c.size(); i++) {
					bw.write(c.get(i) + " ");
				}
				bw.close();
			} else {
				JOptionPane.showMessageDialog(
								null,
								"No selection done, select some genes or conditions first",
								Translator.instance.warningLabels.getString("s2"),
								JOptionPane.ERROR_MESSAGE);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	public void readNetwork(String path, File fichero, Session sesion, String fileType, boolean updatePath) {
		
		boolean error = false;
		if (this.ventana.getActiveWorkDesktop() != null)
			sesion = this.ventana.getActiveWorkDesktop().getSession();
		else {
			desktop = new JDesktopPane();
			desktop.setName(fichero.getName());
			System.out.println("En el Session de readTRN\n");
			sesion = new Session(desktop, ventana);
		}

		try {
			sesion.getReader().readTRN(path, fichero, sesion, fileType);
			if(updatePath)	sesion.trnPath = fichero.getAbsolutePath();

		} catch (FileNotFoundException e1) {
			JOptionPane.showMessageDialog(null,
					"File not Found: " + fichero.getName(), "Error",
					JOptionPane.ERROR_MESSAGE);
			error = true;
		} catch (IOException e2) {
			JOptionPane.showMessageDialog(null, "I/O Error" + e2.getMessage(),
					"Error", JOptionPane.ERROR_MESSAGE);
			error = true;
		} catch (Exception e3) {
			JOptionPane.showMessageDialog(null,
					"Format Error" + e3.getMessage(), "Error",
					JOptionPane.ERROR_MESSAGE);
			error = true;
		}

		if (!error) {
			// Actualizar las ventanas activas
			sesion.updateData();

			try {
				pathWriter = new BufferedWriter(new FileWriter(
						"es/usal/bicoverlapper/data/networkPath.txt"));
				pathWriter.write(path);
				pathWriter.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}

			ventana.getViewMenu().setEnabled(true);
			ventana.getMenuViewTRN().setEnabled(true);
			ventana.getAnalysisMenu().setEnabled(true);
			
		
			ventana.getViewMenuManager().viewNetwork(sesion);
		}
	}

	public void prepareDesktop() {
		desktop = new JDesktopPane();
		desktop.setName(fichero.getName());

		if (sesion == null) {
			addVista = true;
			System.out.println("En el Session del if de prepareDesktop\n");
			sesion = new Session(desktop, ventana);
		} else {
			// TODO: Maybe it's better to limit to just one dataset
			addVista = true;
			System.out.println("En el Session del else de prepareDesktop\n");
			sesion = new Session(desktop, ventana);
		}

		ventana.getAnalysisMenu().setEnabled(false);
		ventana.cleanPanels();
		
		ventana.getViewMenu().setEnabled(false);
	}

	public void readMicroarray() {	
		prepareDesktop();
		
		// hay que comprobar que bioConductor está instalado
		REXP exp = sesion.getAnalysis().r.eval("library(Biobase)");
		if(exp == null){
			JOptionPane.showMessageDialog(null,
					"Bioconductor is not installed in R.\n Please install Bioconductor core manually through the R console (check http://www.bioconductor.org/install).",
					"Missing R package",
					JOptionPane.WARNING_MESSAGE);
			
			return;
		}
		
		System.out.println("---desktop ready, session started");
		try {
			sesion.getReader().readMicroarray(fichero, sesion, this);
			sesion.microarrayPath = fichero.getAbsolutePath();

		} catch (FileNotFoundException e1) {
			JOptionPane.showMessageDialog(null,
					"File not found: " + fichero.getName(), "Error",
					JOptionPane.ERROR_MESSAGE);
		} catch (IOException e2) {
			JOptionPane.showMessageDialog(null,
					"I/O Error: " + e2.getMessage(), "Error",
					JOptionPane.ERROR_MESSAGE);
		} catch (Exception e3) {
			JOptionPane.showMessageDialog(null,
					"Format Error: " + e3.getMessage(), "Error",
					JOptionPane.ERROR_MESSAGE);
		}
		
	}

	/**
	 * Reads a micorarray from a given path, but does not modify the internal
	 * path variable
	 * 
	 * @param path
	 */
	public void readMicroarray(String path) {
		prepareDesktop();
		try {
			sesion.getAnalysis().loadRscripts();
			sesion.getReader().readMicroarray(fichero, sesion, this);
			sesion.microarrayPath = fichero.getAbsolutePath();
		} catch (FileNotFoundException e1) {
			JOptionPane.showMessageDialog(null,
					"File not found: " + fichero.getName(), "Error",
					JOptionPane.ERROR_MESSAGE);
		} catch (IOException e2) {
			JOptionPane.showMessageDialog(null,
					"I/O Error: " + e2.getMessage(), "Error",
					JOptionPane.ERROR_MESSAGE);
		} catch (Exception e3) {
			JOptionPane.showMessageDialog(null,
					"Format Error: " + e3.getMessage(), "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	public void readGroups(String path, File fichero, Session sesion) {
		if (this.ventana.getActiveWorkDesktop() != null)
			sesion = this.ventana.getActiveWorkDesktop().getSession();
		else {
			desktop = new JDesktopPane();
			desktop.setName(fichero.getName());
			System.out.println("En el Session de readGroups\n");
			sesion = new Session(desktop, ventana);
		}

		sesion.getReader().readBiclusterResults(path, fichero.getName(), sesion);
		sesion.biclusteringPath = fichero.getAbsolutePath();
		sesion.closeGroupWindows();
		 if(sesion.getBubbleData()!=null)
			{
			if(!sesion.isTooManyGenes())	ventana.getViewMenuManager().viewOverlapper(sesion);
			else							ventana.getViewMenuManager().viewBubbles(sesion);
			}
		 sesion.close();
			
	}

	/**
	 * @return the sesion
	 */
	public Session getSesion() {
		return sesion;
	}

	/**
	 * @param sesion the sesion to set
	 */
	public void setSesion(Session sesion) {
		this.sesion = sesion;
	}

	/**
	 * @return the fichero
	 */
	public File getFichero() {
		return fichero;
	}

	/**
	 * @param fichero the fichero to set
	 */
	public void setFichero(File fichero) {
		this.fichero = fichero;
	}
}