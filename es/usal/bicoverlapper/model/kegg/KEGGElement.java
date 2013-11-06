package es.usal.bicoverlapper.model.kegg;

import keggapi.PathwayElement;

/**
 * Class to save Kegg elements attributes
 * 
 * @author Carlos Martín Casado
 *
 */
public class KEGGElement {

	//elemento propiamente dicho
	private PathwayElement element;
	//coloreado
	private String foreground;
	private String background;
	
	public KEGGElement(PathwayElement _element, String _foreground, String _background){
		element = _element;
		foreground = _foreground;
		background = _background;	
	}

	public PathwayElement getElement() {
		return element;
	}

	/**
	 * Get the names of the element
	 * @return Names of the element
	 */
	public String[] getNames() {
		return element.getNames();
	}

	/**
	 * @return the foreground
	 */
	public String getForeground() {
		return foreground;
	}

	/**
	 * @return the background
	 */
	public String getBackground() {
		return background;
	}	
}
