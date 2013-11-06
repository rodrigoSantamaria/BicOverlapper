package es.usal.bicoverlapper.view.configuration;

import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

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


import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import es.usal.bicoverlapper.controller.kernel.Session;

/**
 * Abstract class to read/write configuration files
 * 
 * @author Javier Molpeceres and Rodrigo Santamaría
 */
public abstract class ConfigurationLoader {
	
	private static final boolean validarDoc = false;
	
	/**
	 * Loads the configuration in a file and sets it in a session
	 * 
	 * @param session <Session> layer in which we load the configuration profile 
	 * @param file XML file with configuration profile
	 */
	public static void loadConfiguration(Session session, File file){
		
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setValidating(validarDoc);
			DocumentBuilder builder = factory.newDocumentBuilder();
			builder.setErrorHandler(
				new org.xml.sax.ErrorHandler(){
					
					public void fatalError(SAXParseException exception) throws SAXException {}
					
					public void error(SAXParseException e) throws SAXParseException {
						throw e;
					}
					
					public void warning(SAXParseException err) throws SAXParseException{
						System.out.println("** Warning"
								+ ", line " + err.getLineNumber()
								+ ", uri " + err.getSystemId());
						System.out.println("   " + err.getMessage());
					}
				}
			);
			Document documento = builder.parse(file);
			
			ConfigurationHandler config = new ConfigurationHandler();
			NodeList ventanas = documento.getElementsByTagName("ventana");
			
			for(int i = 0; i < ventanas.getLength(); i++)
				{
				Element ventana = (Element) ventanas.item(i);
				// procesamos cada nodo ventana para construir su configuracion asociada
				Node nodo = ventana.getFirstChild();
				int identificador = new Integer(nodo.getFirstChild().getNodeValue()).intValue();
								
				nodo = nodo.getNextSibling();
				String nombre = nodo.getFirstChild().getNodeValue();
				
				nodo = nodo.getNextSibling();
				Element elemento = (Element)nodo;
				int posX, posY;
				posX = Integer.valueOf(elemento.getAttribute("posX")).intValue();
				posY = Integer.valueOf(elemento.getAttribute("posY")).intValue();
				
				nodo = nodo.getNextSibling();
				elemento = (Element)nodo;
				Dimension tam = new Dimension(Integer.valueOf(elemento.getAttribute("tamX")).intValue(),
											  Integer.valueOf(elemento.getAttribute("tamY")).intValue());
				
				nodo=nodo.getNextSibling();
				elemento=(Element)nodo;
				
				//ConfigVentana configventana = new ConfigVentana(identificador, nombre, posX, posY, tam);
				DiagramConfiguration configventana = new DiagramConfiguration(identificador, nombre, posX, posY, tam);
				
				// procesar paleta de colores
				if(nodo!=null)
					{
					//nodo = nodo.getNextSibling();
					NodeList colores = nodo.getChildNodes();
					for(int j = 0; j < colores.getLength(); j++)
						{
						Element color = (Element)colores.item(j);
						Color color2 = new Color(Integer.valueOf(color.getAttribute("red")).intValue(),
											     Integer.valueOf(color.getAttribute("green")).intValue(),
											     Integer.valueOf(color.getAttribute("blue")).intValue());
						configventana.addColor(color2);
						}
					}
				// procesar lista de anclajes
				nodo = nodo.getNextSibling();
				if(nodo != null){
					NodeList anclajes = nodo.getChildNodes();
					for(int j = 0; j < anclajes.getLength(); j++){
						configventana.addHook(anclajes.item(j).getFirstChild().getNodeValue());
					}
				}
				config.addWindowConfiguration(configventana);
			}
		session.setConfig(config);
		} catch (SAXException sxe) {
			// error generado durante el parsing
			Exception x = sxe;
			if(sxe.getException() != null)
				x = sxe.getException();
			x.printStackTrace();
		} catch (ParserConfigurationException pce) {
			// el parser con las opciones especificadas no se puede construir
			pce.printStackTrace();
		} catch (IOException ioe){
			// error E/S
			ioe.printStackTrace();
		}		
	}
	
	/**
	 * Saves a configuration in a XML file
	 * 
	 * @param config ConfigurationHandler with the profile to save
	 * @param file XML File where the profile is to be saved
	 */
	public static void saveConfiguration(ConfigurationHandler config, File file){
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			DOMImplementation implementation = builder.getDOMImplementation();
			
			DocumentType doctype = implementation.createDocumentType("configuracion", null,"config.dtd");
						
			Document documento = implementation.createDocument(null, "configuracion", doctype);
			
			Element config_Ventanas = documento.createElement("config_ventanas");
						
			DiagramConfiguration configVentana;
						
			for(int i = 0; i < config.getSizeConfig(); i++){
				
				configVentana = config.getWindowConfiguration(i);
				
				Element ventana = documento.createElement("ventana");
								
				Element identificador = documento.createElement("identificador");
				identificador.appendChild(documento.createTextNode(new Integer(configVentana.getId()).toString()));
				ventana.appendChild(identificador);
				
				Element nombre = documento.createElement("nombre");
				nombre.appendChild(documento.createTextNode(configVentana.getTitle()));
				ventana.appendChild(nombre);
								
				Element posicion = documento.createElement("posicion");
				Integer posX = new Integer(configVentana.getPosX());
				posicion.setAttribute("posX", posX.toString());
				Integer posY = new Integer(configVentana.getPosY());
				posicion.setAttribute("posY", posY.toString());
				ventana.appendChild(posicion);
				
				Element tamanyo = documento.createElement("tamanyo");
				Integer tamX = new Integer(configVentana.getDim().width);
				tamanyo.setAttribute("tamX", tamX.toString());
				Integer tamY = new Integer(configVentana.getDim().height);
				tamanyo.setAttribute("tamY", tamY.toString());
				ventana.appendChild(tamanyo);

				Element paleta = documento.createElement("paleta");
				for(int j = 0; j < configVentana.getNumberOfColors(); j++){
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
				
				if(configVentana.areHooks()){
					Element anclajes = documento.createElement("anclajes");
					for(int k = 0; k < configVentana.getNumberOfHooks(); k++){
						nombre = documento.createElement("nombre");
						nombre.appendChild(documento.createTextNode(configVentana.getHook(k)));
						anclajes.appendChild(nombre);
					}
					ventana.appendChild(anclajes);
				}
				config_Ventanas.appendChild(ventana);
			}
			
			documento.getDocumentElement().appendChild(config_Ventanas);
			documento.getDocumentElement().normalize();
			Source source = new DOMSource(documento);
			source.setSystemId("config.dtd");
			//System.out.println("systemId: "+source.getSystemId());
			Result result = new StreamResult(file);
			Result console = new StreamResult(System.out);
			
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.setURIResolver(transformer.getURIResolver());
			transformer.transform(source, result);
			transformer.transform(source, console);
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
}