package es.usal.bicoverlapper.view.diagram.overlapper;


import java.util.ArrayList;

import es.usal.bicoverlapper.utils.color.CustomColor;



/**
 * This class holds a set of groups (of any class, but originally designed for (bi)clusters)
 * A GroupSet is associated to a Graph into which its elements (treated as interconnected nodes) are represented.
 * As of today, a GroupSet only differentiates from another in the color of its groups 
 * @author Rodrigo Santamaria and Roberto Theron
 *
 */
public class GroupSet {
	private ArrayList<Group> clusters;
	CustomColor myColor = null;
	Graph myGraph = null;
	String label = "";
	
	/**
	 * Builds an empty ClusterSet
	 *
	 */
	public GroupSet() {
		clusters = new ArrayList<Group>();
		}
	
	/**
	 * Adds a new cluster to the ClusterSet
	 * @param c Cluster to add to de ClusterSet
	 */
	public void addCluster(Group c){
		clusters.add(c);   
	}
	
	/**
	 * Set the Graph in which this ClusterSet is to be drawn
	 * @param h	Graph for the ClusterSet
	 */	
    public void setGraph(Graph h) {
     myGraph = h;
    }
    
    /**
     * Sets the CustomColor associated to this ClusterSet
     * @param c Color for this ClusterSet
     */
    public void setColor(CustomColor c) {
        myColor = c;
       }
    
    /**
     * Sets the label (name or brief description) of this ClusterSet
     * @param s	String with the label of the ClusterSet
     */
    public void setLabel(String s) {
        label = s;
      }
    
    /**
     * Draw all the clusters (groups) in this ResultSet
     *
     */
    public void draw() {
    	for (int i=0; i<clusters.size(); i++) {
    	      MaximalCluster c = (MaximalCluster)clusters.get(i);
    	      c.draw();
    	    }  
    	}

    /**
     * Gets all the Clusters in this ClusterSet as an ArrayList
     * @return	ArrayList with all the Clusters in the ClusterSet
     */
	public ArrayList<Group> getClusters() {
		return clusters;
	}

	/**
	 * Sets all the clusters to be in this ClusterSet
	 * @param clusters	ArrayList with all the Clusters to be in this ClusterSet
	 */
	public void setClusters(ArrayList<Group> clusters) {
		this.clusters = clusters;
	}
	
	/**
	 * Removes a Cluster from the ClusterSet, if it is in
	 * @param c	Cluster to remove
	 */
	public void removeCluster(Group c)
		{
		clusters.remove(c);
		}
}