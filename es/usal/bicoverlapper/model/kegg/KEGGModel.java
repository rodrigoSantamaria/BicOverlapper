package es.usal.bicoverlapper.model.kegg;

import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import keggapi.Definition;
import es.usal.bicoverlapper.controller.kernel.Session;
import es.usal.bicoverlapper.model.gene.GeneAnnotation;

/**
 * Class to manage Kegg information
 * 
 * @author Carlos Martín Casado
 *
 */
public class KEGGModel {
	
	private List<KEGGElement> keggElements = new ArrayList<KEGGElement>();
	private Session sesion;
	private Definition[] definitionPathways;
	private List<LinkItem> listaElementosImg = null;
	private int scaleModeKegg;
	private int valorActualCondition = 0;
	private Definition[] list_organisms;
	private String urlPathwayMap;
	
	/**
	 * Binds the service to the soap port
	 * @throws Exception
	 */
	public KEGGModel(Session _sesion) {
		sesion = _sesion;
	}

	/**
	 * Get the medium of a list
	 * @param valoresExpresion List with values
	 * @return Float with the medium of the values
	 */
	public float calcularMedia(List<Double> valoresExpresion) {
		double suma = 0;
		for (Double valor : valoresExpresion) {
			suma += valor;
		}
		return (float) (suma/valoresExpresion.size());
	}

	/**
	 * Retrieves all the pathways for a given organism
	 * 
	 * @param organism Organism to seek its pathways
	 * @return String[] with pathways
	 * @throws Exception
	 */
	public String[] getPathwaysFromOrganism(Definition[] d) throws Exception {
		String[] paths = new String[d.length];
		for (int i = 0; i < d.length; i++) {
			System.out
					.println(d[i].getEntry_id() + ", " + d[i].getDefinition());
			paths[i] = d[i].getDefinition();
		}

		return paths;
	}

	/**
	 * Retrieves all the pathways for a given organism
	 * 
	 * @param organism Organism to seek its pathways
	 * @return Definition[] with pathways
	 * @throws RemoteException
	 */
	/*
	public Definition[] getDefinitionPathwaysFromOrganism(String organism) throws RemoteException {
		Definition[] d = serv.list_pathways(organism);
		return d;
	}
	*/

	/**
	 * Retrieves the pathway id for a given pathway definition
	 * 
	 * @param path Pathway to seek its id
	 * @param d Definition[] with all definition pathways
	 * @return String with the id
	 */
	public String getPathwayIdFromDefinition(String path, Definition[] d) {
		for (int i = 0; i < d.length; i++) {
			if (d[i].getDefinition().contains(path)) {
				return d[i].getEntry_id();
			}
		}
		return null;
	}

	/**
	 * Get list organisms
	 * 
	 * @return String[] with the organisms
	 */
	/*
	public String[] getOrganisms() {
		Definition[] d;
		try {
			d = serv.list_organisms();
			String[] paths = new String[d.length];
			for (int i = 0; i < d.length; i++) {
				paths[i] = d[i].getDefinition();
			}
			
			//se ordena por orden alfabético
			Arrays.sort(paths);

			return paths;			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return new String[0];
	}
	*/
	
	/**
	 * Get list organisms
	 * 
	 * @return String[] with the organisms
	 */
	public String[] getOrganisms() {
		if(list_organisms != null && list_organisms.length>0)
		{
			String[] paths = new String[list_organisms.length];
			for (int i = 0; i < list_organisms.length; i++) {
				paths[i] = list_organisms[i].getDefinition();
			}
			
			//se ordena por orden alfabético
			Arrays.sort(paths);
						
			return paths;
		}
		else
		{
			return new String[0];
		}
	}	

	/**
	 * Get the id of an organism
	 * 
	 * @param organism Organism to seek the id
	 * @return String with the id
	 * @throws Exception
	 */
	public String getOrganismId(String organism) throws Exception {
		for (int i = 0; i < list_organisms.length; i++) {
			if (list_organisms[i].getDefinition().startsWith(organism)) {
				System.out.println("organismId = "+list_organisms[i].getEntry_id());
				return list_organisms[i].getEntry_id();
			}
		}

		return null;
	}

	/**
	 * * Retrieves all the organism for a given pathway
	 * 
	 * @param pathway Pathway to seek organisms
	 * @return String[] with organisms
	 * @throws Exception
	 */
	public String[] getOrganismsFromPathway(String pathway, String d ) throws Exception {
		//String d = serv.bfind("path " + pathway);
		String[] tokens = d.split("\n");
		ArrayList<String> orgs = new ArrayList<String>();
		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i].contains(" - ")) {
				String org = "";
				if (tokens[i].indexOf(");") > 0 || tokens[i].endsWith(")")) // Species with vulgar name
					org = tokens[i].substring(tokens[i].indexOf(" - ") + 3,
							tokens[i].indexOf("(")).trim();
				// Species without vulgar name
				else if (tokens[i].indexOf(";") >= 0)
					org = tokens[i].substring(tokens[i].indexOf(" - ") + 3,
							tokens[i].indexOf(";")).trim();
				if (org.length() > 0) {
					// System.out.println(org);
					if (!orgs.contains(org))
						orgs.add(org);
				}
			}
		}
		tokens = new String[orgs.size()];
		for (int i = 0; i < tokens.length; i++)
			tokens[i] = orgs.get(i);
		// System.out.println("getOrganismsFromPathway took "+(System.currentTimeMillis()-start)/1000+" seconds");
		return tokens;
	}
	
	/**
	 * Interpolate colors using quantile scale
	 * @param element_id_list List of elements
	 * @param samples Expression of elements
	 * @param fgs Foreground colors like #FF0000
	 * @param bgs Background colors like #00FF00
	 */
	public void interpolateColorsQuantile(int[] element_id_list, float[] samples, String[] fgs, String[] bgs) {
		try {
			for (int i = 0; i < element_id_list.length; i++) {
				fgs[i] = "#007700";

				int quantile = sesion.getMicroarrayData().getQuantile(samples[i]);

				int g = 0;
				int b = 0;
				int r = 0;

				if (quantile < 50) {
					b = 255;
					r = (int)Math.round(255-((50.0-quantile)/50)*255);
					g = r;
				} 
				
				else {
					r = 255;
					g = (int)Math.round(255-((quantile-50.0)/50)*255);
					b = g;
				}

				// System.out.println("Muestra número "+i+"\t"+r+"\t"+g+"\t"+b);
				bgs[i] = "#" + ColorToHex(r, g, b);

				//System.out.println("Adding element "+element_id_list[i]+"\tvalue sample="+samples[i]+"\t"+"quantile="+quantile+"\t"+bgs[i]+"\t"+fgs[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Interpolate colors using numerical scale
	 * @param element_id_list List of elements
	 * @param samples Expression of elements
	 * @param fgs Foreground colors like #FF0000
	 * @param bgs Background colors like #00FF00
	 */
	public void interpolateColorsNumerical(int[] element_id_list, float[] samples, String[] fgs, String[] bgs) {
		try {
			float[] ranks = this.getRanks(samples);

			for (int i = 0; i < element_id_list.length; i++) {
				fgs[i] = "#007700";

				int g = 0;
				int b = 0;
				int r = 0;

				if (0 <= ranks[i] && ranks[i] <= 0.5) {
					b = 255;
					r = (int) (2 * ranks[i] * 255); // se le multiplica por 2
													// porque sino nunca va a
													// llegar a acercarse al
													// blanco al estar cogiendo
													// sólo valores menores que
													// 0.5
					g = r;
				} else if (0.5 < ranks[i] && ranks[i] <= 1) {
					r = 255;
					g = (int) ((1.0 - 2 * (ranks[i] - 0.5)) * 255); // se le
																	// multiplica
																	// por 2 y
																	// se le
																	// resta 0.5
																	// para
																	// ajustar
																	// la escala
																	// al estar
																	// partiendo
																	// de 0.5
					b = g;
				}

				// System.out.println("Muestra número "+i+"\t"+r+"\t"+g+"\t"+b);
				bgs[i] = "#" + ColorToHex(r, g, b);

				System.out.println("Adding element "+element_id_list[i]+"\tvalue sample="+samples[i]+"\t"+"ranks[i]="+ranks[i]+"\t"+bgs[i]+"\t"+fgs[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Convers an RGB color to its corresponding hexadecimal value
	 * 
	 * @param r Red component
	 * @param g Green component
	 * @param b Blue component
	 * @return
	 */
	public String ColorToHex(int r, int g, int b) {
		Color c = new Color(r, g, b);
		String rgb = Integer.toHexString(c.getRGB());
		return rgb.substring(2, rgb.length()).toUpperCase();
	}

	/**
	 * Get ranks of a list os samples
	 * @param samples float[] with samples
	 * @return ranks
	 */
	public float[] getRanks(float[] samples) {
		if (samples.length < 1) {
			System.err.println("The sample is empty");
		}

		//de esta forma se cogería el máximo y el mínimo de la muestra
		//float max = Kegg.getMaxValue(samples);
		//float min = Kegg.getMinValue(samples);
		
		//pero para que funcione como se desea en BicOverlapper, hay que coger el máximo y mínimo de todas las muestras
		float max = (float) sesion.getMicroarrayData().max;
		float min = (float) sesion.getMicroarrayData().min;
		
		float[] ranks = new float[samples.length];

		for (int i = 0; i < samples.length; i++) {
			ranks[i] = (samples[i] - min) / (max - min);
			System.out.println("Para el sample="+samples[i]+" el rank="+ranks[i]+", con max = "+max+" y min = "+min);
		}

		return ranks;
	}

	/**
	 * Get max value of a list
	 * @param numbers float[] of numbers
	 * @return float with max value
	 */
	public static float getMaxValue(float[] numbers) {
		float maxValue = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > maxValue) {
				maxValue = numbers[i];
			}
		}

		return maxValue;
	}

	/**
	 * Get min value of a list
	 * @param numbers float[] of numbers
	 * @return float with min value
	 */
	public static float getMinValue(float[] numbers) {
		float minValue = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < minValue) {
				minValue = numbers[i];
			}
		}

		return minValue;
	}
	
	/**
	 * Convert List<Integer> to int[]
	 * @param list List of Integers
	 * @return int[] with the same elements as List<Integer>
	 */
    public static int[] toIntArray(List<Integer> list) {  
	    int[] intArray = new int[list.size()];  
	    int i = 0;  
	       
	    for (Integer integer : list)  
	    intArray[i++] = integer;  
	      
	    return intArray;  
    }  
    
	/**
	 * Convert List<Float> to float[]
	 * @param list List of Floats
	 * @return float[] with the same elements as List<Float>
	 */
    public static float[] toFloatArray(List<Float> list) {  
	    float[] floatArray = new float[list.size()];  
	    int i = 0;  
	       
	    for (Float f: list)  
	    	floatArray[i++] = f;  
	      
	    return floatArray;  
    }    
    
	/**
	 * Mapping internal ids with gen ids
	 * @param internalIdsSelected List with the internal ids
	 * @return Selected genes
	 */
	public List<String> mapearInternalIdconIdGen(List<Integer> internalIdsSelected) {
		//creación de la lista de genes seleccionados
		List<String> genesSeleccionados = new LinkedList<String>();
		//obtención de los genes presentes en el experimento
		Map<Integer, GeneAnnotation> mapaGenes = sesion.getMicroarrayData().getGeneAnnotations();
		//para cada uno de los genes presentes en el experimento...
		for (GeneAnnotation g : mapaGenes.values()) {
			//para cada uno de los internalId seleccionados
			for (Integer gen : internalIdsSelected) {
				//si coinciden
				if(g.getInternalId() == (gen)){
					//se añade el id del gen a la lista de genes seleccionados
					genesSeleccionados.add(g.getId());
				}
			}
		}
		return genesSeleccionados;
	}

	/**
	 * @return the definitionPathways
	 */
	public Definition[] getDefinitionPathways() {
		return definitionPathways;
	}

	/**
	 * @param definitionPathways the definitionPathways to set
	 */
	public void setDefinitionPathways(Definition[] definitionPathways) {
		this.definitionPathways = definitionPathways;
	}

	/**
	 * @return the listaElementosImg
	 */
	public List<LinkItem> getListaElementosImg() {
		return listaElementosImg;
	}

	/**
	 * @param listaElementosImg the listaElementosImg to set
	 */
	public void setListaElementosImg(List<LinkItem> listaElementosImg) {
		this.listaElementosImg = listaElementosImg;
	}

	/**
	 * @return the scaleModeKegg
	 */
	public int getScaleModeKegg() {
		return scaleModeKegg;
	}

	/**
	 * @param scaleModeKegg the scaleModeKegg to set
	 */
	public void setScaleModeKegg(int scaleModeKegg) {
		this.scaleModeKegg = scaleModeKegg;
	}

	public List<Rectangle2D.Double> buscarElementosConGenesSeleccionados() {
		//se recogen los id de los genes seleccionados
		List<String> genes = this.mapearInternalIdconIdGen(sesion.getSelectedGenesBicluster());
		List<Rectangle2D.Double> elementosKeggSeleccionados = new ArrayList<Rectangle2D.Double>();
		
		if (!genes.isEmpty() && this.getListaElementosImg() != null) {
			//se buscan coincidencias entre los genes seleccionados y los elementos de Kegg en la imagen
			for (LinkItem itm : this.getListaElementosImg()) {
				//si se dispone de los nombres de genes de ese elemento...
				if(null != itm.getGeneNames()){
					for (String gen : genes) {
						for (String genItm : itm.getGeneNames()) {
							if(genItm.equals(gen)){
								//si se encuentra coincidencia, se añade ese elemento para marcar como seleccionado en la imagen de Kegg
								elementosKeggSeleccionados.add(itm.getRectangle());
							}
						}
					}
				}								
			}
		}
		return elementosKeggSeleccionados;
	}

	/**
	 * @return the valorActualCondition
	 */
	public int getValorActualCondition() {
		return valorActualCondition;
	}

	/**
	 * @param valorActualCondition the valorActualCondition to set
	 */
	public void setValorActualCondition(int valorActualCondition) {
		this.valorActualCondition = valorActualCondition;
	}

	/**
	 * @return the keggElements
	 */
	public List<KEGGElement> getKeggElements() {
		return keggElements;
	}

	/**
	 * @param keggElements the keggElements to set
	 */
	public void setKeggElements(List<KEGGElement> keggElements) {
		this.keggElements = keggElements;
	}

	/**
	 * @return the list_organisms
	 */
	public Definition[] getList_organisms() {
		return list_organisms;
	}

	/**
	 * @param list_organisms the list_organisms to set
	 */
	public void setList_organisms(Definition[] list_organisms) {
		this.list_organisms = list_organisms;
	}

	/**
	 * @return the urlPathwayMap
	 */
	public String getUrlPathwayMap() {
		return urlPathwayMap;
	}

	/**
	 * @param urlPathwayMap the urlPathwayMap to set
	 */
	public void setUrlPathwayMap(String urlPathwayMap) {
		this.urlPathwayMap = urlPathwayMap;
	}    
}
