package es.usal.bicoverlapper.model.bubble;

import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
 * Class that contains Bubble information. A bubble is considered as a group of
 * genes and conditions from a gene expression matrix. Bubble display properties
 * such as position, size, color or transparency should be defined by the user,
 * but are expected to be defined depending on elements grouped, number of
 * elements, nature and homogeneity, respectively.
 * 
 * @author Rodrigo Santamaria (rodri@usal.es)
 * 
 */
public class Bubble {
	/**
	 * Names of genes in this bubble
	 */
	private ArrayList<String> genes;
	/**
	 * Names of conditions in this bubble
	 */
	private ArrayList<String> conditions;
	/**
	 * Coordinates for this bubble
	 */
	private Point2D.Float position;
	/**
	 * Name of the biclustering methods that retrieved the bicluster represented
	 * by this bubble
	 */
	private String method;

	/**
	 * Name of the bicluster, if present
	 */
	private String name;
	/**
	 * Size, computed as genes.length x conditions.length
	 */
	private int size;

	/**
	 * Homogeneity of expression levels in the bubble STILL IN DEVELOPMENT
	 */
	private double homogeneity;

	/**
	 * Default constructor
	 * 
	 */
	public Bubble() {
		genes = new ArrayList<String>();
		conditions = new ArrayList<String>();
		position = new Point2D.Float(0, 0);
		method = "";
		name = "";
		size = 0;
		homogeneity = 0;
	}

	/**
	 * @return the genes
	 */
	public ArrayList<String> getGenes() {
		return genes;
	}

	/**
	 * @return the conditions
	 */
	public ArrayList<String> getConditions() {
		return conditions;
	}

	/**
	 * @return the position
	 */
	public Point2D.Float getPosition() {
		return position;
	}

	/**
	 * @return the method
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @return the homogeneity
	 */
	public double getHomogeneity() {
		return homogeneity;
	}

	/**
	 * @param genes
	 *            the genes to set
	 */
	public void setGenes(ArrayList<String> genes) {
		this.genes = genes;
	}

	/**
	 * @param conditions
	 *            the conditions to set
	 */
	public void setConditions(ArrayList<String> conditions) {
		this.conditions = conditions;
	}

	/**
	 * @param position
	 *            the position to set
	 */
	public void setPosition(Point2D.Float position) {
		this.position = position;
	}

	/**
	 * @param method
	 *            the method to set
	 */
	public void setMethod(String method) {
		this.method = method;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @param homogeneity
	 *            the homogeneity to set
	 */
	public void setHomogeneity(double homogeneity) {
		this.homogeneity = homogeneity;
	}
}
