package es.usal.bicoverlapper.model.kegg;

import java.awt.geom.Rectangle2D;

/**
 * LinkItem is used to save the attributes from HTML
 * 
 * @author Carlos Martín Casado
 *
 */
public class LinkItem {
	private String link;
	private String title;
	private String text;
	private String shape;
	private String coords;
	private Rectangle2D.Double rectangle;
	private Circle circle;
	// inicializo los colores en blano por si no se encontrase el color del
	// elemento para que no falle el programa
	private String fg = "#000000";;
	private String bg = "#000000";;
	
	private String[] geneNames;

	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @return the shape
	 */
	public String getShape() {
		return shape;
	}

	/**
	 * @return the coords
	 */
	public String getCoords() {
		return coords;
	}

	/**
	 * @return the rectangle
	 */
	public Rectangle2D.Double getRectangle() {
		return rectangle;
	}

	/**
	 * @return the circle
	 */
	public Circle getCircle() {
		return circle;
	}

	/**
	 * @return the fg
	 */
	public String getFg() {
		return fg;
	}

	/**
	 * @return the bg
	 */
	public String getBg() {
		return bg;
	}

	/**
	 * @return the geneNames
	 */
	public String[] getGeneNames() {
		return geneNames;
	}

	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @param shape the shape to set
	 */
	public void setShape(String shape) {
		this.shape = shape;
	}

	/**
	 * @param coords the coords to set
	 */
	public void setCoords(String coords) {
		this.coords = coords;
	}

	/**
	 * @param rectangle the rectangle to set
	 */
	public void setRectangle(Rectangle2D.Double rectangle) {
		this.rectangle = rectangle;
	}

	/**
	 * @param circle the circle to set
	 */
	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	/**
	 * @param fg the fg to set
	 */
	public void setFg(String fg) {
		this.fg = fg;
	}

	/**
	 * @param bg the bg to set
	 */
	public void setBg(String bg) {
		this.bg = bg;
	}

	/**
	 * @param geneNames the geneNames to set
	 */
	public void setGeneNames(String[] geneNames) {
		this.geneNames = geneNames;
	}


}