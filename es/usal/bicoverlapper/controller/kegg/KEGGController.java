package es.usal.bicoverlapper.controller.kegg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.SwingWorker;
import javax.xml.rpc.ServiceException;

import keggapi.Definition;
import keggapi.KEGGLocator;
import keggapi.KEGGPortType;
import keggapi.PathwayElement;

import es.usal.bicoverlapper.controller.kernel.Session;
import es.usal.bicoverlapper.model.gene.GeneAnnotation;
import es.usal.bicoverlapper.model.kegg.KEGGElement;
import es.usal.bicoverlapper.model.kegg.KEGGModel;
import es.usal.bicoverlapper.view.diagram.kegg.KEGGDiagram;

public class KEGGController implements ActionListener {
	
	private KEGGDiagram keggDiagram;
	private KEGGModel keggModel;
	private Session sesion;
	private KEGGPortType serv;
	
	public KEGGController(KEGGDiagram _keggDiagram, KEGGModel _kegg, Session _sesion){
		keggDiagram = _keggDiagram;
		keggModel = _kegg;
		sesion = _sesion;
		KEGGLocator locator = new KEGGLocator();
		try {
			serv = locator.getKEGGPort();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		
		int opcion = Integer.parseInt(evt.getActionCommand());
		
		switch(opcion){
			//se ha pulsado el botón obtener imagen
			case 1: 
				this.accionObtenerImagen();
				break;
			case 2:
				this.accionSeleccionarOrganismoCombo1();
				break;
			case 3:
				this.accionSeleccionarPathwayCombo2();
				break;
		}
	}

	private void accionSeleccionarPathwayCombo2() {
		try {
			//si se ha seleccionado un pathway, se habilita el botón de obtener imagen
			if (keggDiagram.getCombo2().getSelectedItem() != null && !keggDiagram.getCombo2().getSelectedItem().equals("")){
				keggDiagram.getBotonObtenerImagen().setEnabled(true);				
			}
			//si no, se deshabilita
			else{
				keggDiagram.getBotonObtenerImagen().setEnabled(false);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	private void accionSeleccionarOrganismoCombo1() {
		try {	
	        final SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>(){  
	        	  
	            @Override  
	            protected Void doInBackground() throws Exception {  
	            	keggDiagram.getBotonObtenerImagen().setEnabled(false);
	            	//se pone visible la progressbar para que el usuario sepa que se está trabajando en 2º plano
	            	keggDiagram.getProgressBar().setVisible(true);
	            	keggDiagram.fillComboBox2();
	                return null;  
	            }
	              
	        };  
	          
	        worker.execute();					
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	private void accionObtenerImagen() {
        final SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>(){  
      	  
            @Override  
            protected Void doInBackground() throws Exception {  
            	//se deshabilitan los botones y combos
            	keggDiagram.getBotonObtenerImagen().setEnabled(false);
            	keggDiagram.getBotonFlechaIzq().setEnabled(false);
            	keggDiagram.getBotonFlechaDer().setEnabled(false);
            	keggDiagram.getCombo1().setEnabled(false);
            	keggDiagram.getCombo2().setEnabled(false);		            	
            	//se pone visible la progressBar para que el usuario sepa que se está trabajando en 2º plano
            	keggDiagram.getProgressBar().setVisible(true);				         
            	//se monta en el panel la imagen por defecto
            	keggDiagram.mountPanelsWithNewImage(KEGGDiagram.urlImagenPorDefecto, true);
            	//se realiza la obtención de la imagen
            	getKeggImage();
            	//se habilitan de nuevo los botones y combox
            	keggDiagram.getBotonObtenerImagen().setEnabled(true);
            	keggDiagram.getBotonFlechaIzq().setEnabled(true);
            	keggDiagram.getBotonFlechaDer().setEnabled(true);
            	keggDiagram.getCombo1().setEnabled(true);
            	keggDiagram.getCombo2().setEnabled(true);	                    	
        		//se desactiva de la vista la progressBar
            	keggDiagram.getProgressBar().setVisible(false);
            	
                return null;  
            }
              
        };  
          
        worker.execute();		
	}

	
	public void getKeggImage() {
		//se obtiene el identificador del pathway
		String id_pathway = keggModel.getPathwayIdFromDefinition((String) keggDiagram.getCombo2().getSelectedItem(), keggModel.getDefinitionPathways());
		
		System.out.println("id_pathway = "+id_pathway);
		
		//se almacenan los índices para cuando haya que restaurar esta vista
		keggDiagram.setIndexCombo1(keggDiagram.getCombo1().getSelectedIndex());
		keggDiagram.setIndexCombo2(keggDiagram.getCombo2().getSelectedIndex());
				
		if (id_pathway != null) {
			//se muestra la imagen
			this.showImage(id_pathway);			
			//una vez mostrada la iamgen, se actualiza el Diagram por si hay elementos seleccionados
			keggDiagram.update();
		}
	}	
	
	/**
	 * Show the image
	 * @param pathway Pathway of the image
	 */
	private void showImage(String pathway) {
		try {
			//se genera el mapa pathway coloreado
			this.generateKeggImage(pathway, keggModel.getValorActualCondition());

			URL u = new URL(keggModel.getUrlPathwayMap());
			InputStream in = u.openStream();
			InputStreamReader readerURL = new InputStreamReader(in);

			ExtractLinks fl = new ExtractLinks(keggModel.getKeggElements());

			keggModel.setListaElementosImg(fl.getLinks(readerURL));

			//para que se monte el coloreado desde el programa java se pone false
			//mountPanelsWithNewImage(url.replace("html", "png"), false);
			//pero para poder extraer los links y que actúe el oyente he comentado el paintComponent en ScrollablePicture
			//así, aquí pondré ahora false y no se coloreará en java, sólo se activará el mouseListener
			keggDiagram.mountPanelsWithNewImage(keggModel.getUrlPathwayMap().replace("html", "png"), false);
		} catch (MalformedURLException mURLe) {
			mURLe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update() {
		//si onlyHover es false y hay genes seleccionados...
		//hay que meter la comprobación de "null != sesion.getSelectedBicluster()" porque si esto es nulo, el método sesion.getSelectedGenesBicluster() da nullpointerexception
		//esto debería estar controlado en Session, pero yo no lo toco no siendo que repercuta en otro lado...
		if(!sesion.isOnlyHover() && null != sesion.getSelectedBicluster() && null != sesion.getSelectedGenesBicluster()){
			List<Rectangle2D.Double> elementosKeggSeleccionados = keggModel.buscarElementosConGenesSeleccionados();
			
			//si hay algún elemento que contenga algún gen seleccionado, se marcará
			if(!elementosKeggSeleccionados.isEmpty()){
				keggDiagram.getPathwayMapImage().setRectangles(elementosKeggSeleccionados);
				keggDiagram.getPathwayMapImage().setDibujarBordeKeggElement(true);
				keggDiagram.getPathwayMapImage().repaint();
			}
			//si no hay ningún elemento con ninguno de los genes seleccionadios, se dejará la imagen tal cual
			else{
				keggDiagram.getPathwayMapImage().getRectangles().clear();
				keggDiagram.getPathwayMapImage().setDibujarBordeKeggElement(false);
				keggDiagram.getPathwayMapImage().repaint();
			}
		}
		//si no se ha seleccionado ningún gen
		else if(!sesion.isOnlyHover()){
			//si no se ha seleccionado ningún gen, y se quiere dejar la imagen original
			keggDiagram.getPathwayMapImage().getRectangles().clear();
			keggDiagram.getPathwayMapImage().setDibujarBordeKeggElement(false);
			keggDiagram.getPathwayMapImage().repaint();
		}
	}

	/**
	 * Generate Kegg image as from the selected pathway and the expression of genes in the experiment loaded
	 * @param pathway Pathway of the organism
	 * @param numCondition Condition selected
	 * @return URL with the image generated
	 * @throws Exception 
	 */
	public void generateKeggImage(String pathway, int numCondition) throws Exception {
		int[] element_id_list = null;
		String[] bgs = null;
		String[] fgs = null;
		//variable que servirá para comprobar qué tipo de identificador de gen ha sido probado
		//0 = id
		//1 = entrezId
		//2 = ensemblId
		//3 => dejar de probar ya que no hay coincidencias
		int tipoIdentificador = 0;
		
		long start = System.currentTimeMillis();
		
		List<PathwayElement> resultadosValidos = new ArrayList<PathwayElement>();
		
		System.out.println("pathway = "+pathway);
		// se consultan los elementos del pathway
		PathwayElement[] pathwayElements = this.serv.get_elements_by_pathway(pathway);
		// se crea la lista con los resultados
		List<Integer> elementIdList = new ArrayList<Integer>();
		// lista de samples
		List<Float> samplesList = new ArrayList<Float>();
		
		//creo una lista de elementos que tendrá todos los elementos y que sólo usaré para obtener la imagen de KEGG en blanco
		//int[] element_id_listAux = new int[results.length];
		
		//se recogen los genes de MicroarrayData
		Map<Integer, GeneAnnotation> mapaGenes = sesion.getMicroarrayData().getGeneAnnotations();
		System.out.println("mapaGenes.size()="+mapaGenes.size());
		
		System.out.println("pathwayElements.length es "+pathwayElements.length);

		do{
			//se recorren todos los pathway elements
			for (int i = 0; i < pathwayElements.length; i++) {
				//si el elemento es de tipo gen (ya que para otro tipo de elementos no se coloreará)
				if(pathwayElements[i].getType().equals("gene")){
					ArrayList<Double> valoresExpresion = null;
					boolean hayExpresion = false;
					valoresExpresion = new ArrayList<Double>();
					//se obtienen los nombres de ese pathwayElement (nótese que puede ser 1 nombre o más de uno)
					String[] nombresGenes = pathwayElements[i].getNames();
					
					//extrañamente montando este TreeMap previo tarda menos que recorriendo nombresKO abajo directamente
					//así, se prepara un mapa que tiene por clave el nombre correspondiente y una lista 
					//esa lista tendrá el nombre pero sin la identificación del organismo, es decir, si hay algo del tipo mmu:12345 se eliminará "mmu:"
					TreeMap<String, ArrayList<String>> mapaGenesEnPathwayElement = new TreeMap<String, ArrayList<String>>();
					for (String nombreGen : nombresGenes){
						ArrayList<String> listaNombresGenes = new ArrayList<String>();
						//se comprueba que el comienzo del gen coincida con el organismo cargado en el experimento
						if(nombreGen.startsWith(sesion.getMicroarrayData().getOrganismKEGG())){
							//se guarda el nombre del gen sin el identificador del organismo
							listaNombresGenes.add(nombreGen.split("\\:")[1]);
							mapaGenesEnPathwayElement.put(nombreGen, listaNombresGenes);
						}
						//System.out.println("nombreKO = "+nombreKO+", pathwayElements[i].getType() = "+pathwayElements[i].getType()+ " orgamismKegg = "+sesion.getMicroarrayData().getOrganismKEGG());
					}
					
					//para cada gen en el microarray
					for (GeneAnnotation g : mapaGenes.values()) {		
						//para cada gen en el pathway
						for (ArrayList<String> listaGenes: mapaGenesEnPathwayElement.values()) {	
							for(String gen: listaGenes){
								//si coinciden con el identificador que se esté comparando en cada momento, se marca la coincidencia y se guarda el valor de su expresión para calcular posteriormente su media
								if(tipoIdentificador == 0 && null != g.getId() && gen.equals(g.getId())){									
									hayExpresion = true;
									double valorExp = sesion.getMicroarrayData().getExpressionAt(g.getInternalId(), numCondition);
									valoresExpresion.add(valorExp);			
									//System.out.println("gen = "+gen+"\tvalorExp = "+valorExp+"\tpathwayElements[i].getElement_id() = "+pathwayElements[i].getElement_id());
								}
								else if(tipoIdentificador == 1 && null != g.getEntrezId() && gen.equals(g.getEntrezId())){									
									hayExpresion = true;
									double valorExp = sesion.getMicroarrayData().getExpressionAt(g.getInternalId(), numCondition);
									valoresExpresion.add(valorExp);			
									//System.out.println("gen = "+gen+"\tvalorExp = "+valorExp+"\tpathwayElements[i].getElement_id() = "+pathwayElements[i].getElement_id());
								}
								else if(tipoIdentificador == 2 && null != g.getEnsemblId() && gen.equals(g.getEnsemblId())){									
									hayExpresion = true;
									double valorExp = sesion.getMicroarrayData().getExpressionAt(g.getInternalId(), numCondition);
									valoresExpresion.add(valorExp);			
									//System.out.println("gen = "+gen+"\tvalorExp = "+valorExp+"\tpathwayElements[i].getElement_id() = "+pathwayElements[i].getElement_id());
								}								
							}
						}
					}
					
					//si se han producido coincidencias, entonces quiere decir que para ese elemento habrá que calcular un coloreado
					if(hayExpresion){
						//por tanto se añade el elemento a la lista
						elementIdList.add(pathwayElements[i].getElement_id());
						resultadosValidos.add(pathwayElements[i]);
						//se calcula el valor medio para todos los genes de ese elemento
						float media = keggModel.calcularMedia(valoresExpresion);
						
						//System.out.println("ELEMENTO "+pathwayElements[i].getElement_id());
						/*
						for (Double valorExp : valoresExpresion) {
							System.out.println(valorExp);
						}
						*/
						//System.out.println("Media = "+media);
						
						//se guarda esta media en la lista de muestras con la que se coloreará la imagen
						samplesList.add(media);
					}
				}
				else{
					//TODO: en principio nada con los elementos que no sean genes, pero en un futuro podría necesitarse hacer algo con ellos
				}
			}
			
			//al llegar a este punto significa que se han buscado todos los elementos
			//por tanto, el tipoIdentificador se incrementará por si hay que seguir buscando
			tipoIdentificador++;
			
		} while(resultadosValidos.isEmpty() && tipoIdentificador < 3);
		
		System.out.println("for principal took " + (System.currentTimeMillis() - start) / 1000 + " seconds y tipoIdentificador usado es "+(tipoIdentificador-1));		

		if(!elementIdList.isEmpty()){
			//se convierten las colecciones anteriores en arrays
			element_id_list = KEGGModel.toIntArray(elementIdList);
			float[] samples = KEGGModel.toFloatArray(samplesList);		
								
			fgs = new String[element_id_list.length];
			bgs = new String[element_id_list.length];
	
			//se interpolan los colores de la muestra
			if(sesion.getScaleMode() == Session.numerical){
				keggModel.interpolateColorsNumerical(element_id_list, samples, fgs, bgs);
			}
			else if(sesion.getScaleMode() == Session.quantile){
				keggModel.interpolateColorsQuantile(element_id_list, samples, fgs, bgs);
			}
			// como todo en principio debería haber mantenido el orden, ahora ya
			// tendría cada elemento con su fg y bg correspondiente
			// como el id es único para cada resultado, añado el resultado que es lo
			// que tiene más información
			int i = 0;
			for (PathwayElement resultadoValido: resultadosValidos) {
				keggModel.getKeggElements().add(new KEGGElement(resultadoValido, fgs[i], bgs[i]));
				i++;
			}
		}
		
		System.out.println("El número de resultados válidos encontrados es "+keggModel.getKeggElements().size());
		
		//para medir sólo lo que tarda este método
		long startColorKegg = System.currentTimeMillis();
		System.out.println("Llamando a colorKeggInTheCloud");
		
		//aquí creo que me dan igual fgs y bgs porque van a ir en blanco
		//pongo element_id_listAux en vez de element_id_list porque quiero todos los elementos de la imagen en blanco
		//String url = k.colorKegg2(pathway, element_id_listAux, fgs, bgs);

		String url = this.colorKeggInTheCloudHTML(pathway, element_id_list, fgs, bgs);
		
		System.out.println("colorKeggInTheCloud took "
				+ (System.currentTimeMillis() - startColorKegg) / 1000 + " seconds");		
		
		System.out.println("generarImagenKegg took "
				+ (System.currentTimeMillis() - start) / 1000 + " seconds");

		keggModel.setUrlPathwayMap(url);
	}	
	
	/**
	 * Color the elements in ids in the Kegg pathway pathid, with the
	 * foreground and background colors specified
	 * 
	 * @param pathid  something like pathway:hsa4031
	 * @param ids ko ids like ko:K010267
	 * @param fgs Foreground colors like #FF0000
	 * @param bgs Background colors like #00FF00
	 * @return - the url to the colored kegg pathway in html
	 */
	public String colorKeggInTheCloudHTML(String pathid, int[] element_id_list, String[] fgcolors, String[] bgcolors) {
		String colored = null;
		try {
			colored = serv.get_html_of_colored_pathway_by_elements(pathid, element_id_list, fgcolors, bgcolors);
			if(null != element_id_list){
				System.out.println("Finished " + colored);
			}
			else{
				System.out.println("Finished "+ colored);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return colored;
	}	

	/**
	 * Color the elements in ids in the Kegg pathway pathid, with the
	 * foreground and background colors specified
	 * 
	 * @param pathid  something like pathway:hsa4031
	 * @param ids ko ids like ko:K010267
	 * @param fgs Foreground colors like #FF0000
	 * @param bgs Background colors like #00FF00
	 * @return - the url to the colored kegg pathway in png
	 */
	public String colorKeggInTheCloudPNG(String pathid, int[] element_id_list,
			String[] fgcolors, String[] bgcolors) {
		String colored = null;
		try {
			colored = serv.color_pathway_by_elements(pathid, element_id_list,
					fgcolors, bgcolors);
			System.out.println("Finished " + colored);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return colored;
	}	
	
	/**
	 * Retrieves all the pathways for a given organism
	 * 
	 * @param organism Organism to seek its pathways
	 * @return Definition[] with pathways
	 * @throws RemoteException
	 */
	public void obtainDefinitionPathwaysFromOrganism(String organism) throws RemoteException {
		Definition[] d = serv.list_pathways(organism);
		keggModel.setDefinitionPathways(d);
	}
	
	/**
	 * Obtain list organisms
	 * 
	 * @return String[] with the organisms
	 */
	public void obtainOrganisms() {
		Definition[] listOrganisms;
		try {
			listOrganisms = serv.list_organisms();
			keggModel.setList_organisms(listOrganisms);
		} catch (RemoteException e) {
			keggModel.setList_organisms(null);
		}
	}	
}
