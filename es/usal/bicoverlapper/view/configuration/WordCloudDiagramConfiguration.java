package es.usal.bicoverlapper.view.configuration;

import java.awt.Dimension;

public class WordCloudDiagramConfiguration extends DiagramConfiguration {
	
	private int textIndex=0;
	private int sizeIndex=0;
	private int splitIndex=0;
	private int ontologyIndex=0;
	
	public WordCloudDiagramConfiguration(int id, String name, int posX,
			int posY, Dimension dim) {
		super(id, name, posX, posY, dim);
		// TODO Auto-generated constructor stub
	}
	public WordCloudDiagramConfiguration(DiagramConfiguration dc)
		{
		super(dc.getId(), dc.getTitle(), dc.getPosX(), dc.getPosY(), dc.getDim());
		}
	/**
	 * @return the textIndex
	 */
	public int getTextIndex() {
		return textIndex;
	}
	/**
	 * @return the sizeIndex
	 */
	public int getSizeIndex() {
		return sizeIndex;
	}
	/**
	 * @return the splitIndex
	 */
	public int getSplitIndex() {
		return splitIndex;
	}
	/**
	 * @return the ontologyIndex
	 */
	public int getOntologyIndex() {
		return ontologyIndex;
	}
	/**
	 * @param textIndex the textIndex to set
	 */
	public void setTextIndex(int textIndex) {
		this.textIndex = textIndex;
	}
	/**
	 * @param sizeIndex the sizeIndex to set
	 */
	public void setSizeIndex(int sizeIndex) {
		this.sizeIndex = sizeIndex;
	}
	/**
	 * @param splitIndex the splitIndex to set
	 */
	public void setSplitIndex(int splitIndex) {
		this.splitIndex = splitIndex;
	}
	/**
	 * @param ontologyIndex the ontologyIndex to set
	 */
	public void setOntologyIndex(int ontologyIndex) {
		this.ontologyIndex = ontologyIndex;
	}
}
