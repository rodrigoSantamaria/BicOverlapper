package es.usal.bicoverlapper.view.diagram.overlapper;

import java.awt.Image;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

import es.usal.bicoverlapper.model.geometry.GraphPoint2D;



/**
 * A node is an element that is subject to be in a group.
 * In microarray data bicluster analysis, samples (nucleotide sequences, genes) and conditions (experimental conditions patients)
 * biclustered at least once are expected to be Nodes. 
 * @author Rodrigo Santamaría
 *
 */

public class Node {
	  protected GraphPoint2D position;
	  protected float height = 10;
	  protected float width = 10;
	  protected String label = "";
	  public String labelId = "";
	  protected Graph g;
	  private boolean drawn=false;
	  private boolean drawnAsPiechart=false;
	  private boolean isDrawnAsLabel=false;

	  private float relevance=0;
	  protected String image="";
	  protected Image pimage;
	  protected String details="";
	  protected int numLines;
	  protected int maxChars;
	  public int id=-1;
	  private boolean gene=true;
	  protected float betweenness;
	  
	  
	  protected boolean fixed=false;
	  public boolean centerNode=false;

	  
	  Map<String,Group> clusters;//Lists of clusters where this node is
	  Map<String,Group> shownClusters;//Lists of clusters where this node is that are being shown
	  Map<String,Node>	mates;//List of nodes connected to this node

	  /**
	   * Builds an empty node
	   *
	   */
	  public Node() {
	    position= new GraphPoint2D();
	    clusters=new TreeMap<String,Group>();	
	    shownClusters=new TreeMap<String,Group>();	
	    mates=new TreeMap<String,Node>();
	  }
	  
	  /**
	   * Builds a node at the position v
	   * @param v	Position of the node, as (x,y)
	   */
	  public Node(GraphPoint2D v) {
		  	position = new GraphPoint2D(v.getX(), v.getY());
		    clusters=new TreeMap<String,Group>();	
		    shownClusters=new TreeMap<String,Group>();	
		    mates=new TreeMap<String,Node>();
		  }

	  /**
	   * Builds a node at the position v to be drawn in gr
	   * @param gr	Graph where the node will be
	   * @param v	Initial position of the node
	   */
	  public Node(Graph gr, GraphPoint2D v) {
		  	position=new GraphPoint2D(v.getX(), v.getY());
		    g=gr;
		   // clusters=new TreeMap<String,MaximalCluster>();	
		    clusters=new TreeMap<String,Group>();	
		    shownClusters=new TreeMap<String,Group>();	
		    mates=new TreeMap<String,Node>();
		  }

	  /**
	   * Sets the graph in which this node is
	   * @param h	Graph in which will be
	   */
	  public void setGraph(Graph h) 
	  {
	    g = h;
	  }
	  
	  /**
	   * Adds a Cluster to the lists of clusters (groups) in which this node is in
	   * @param c	a Cluster in which the node will be
	   */
	  public void addCluster(Group c) 
	  	{
		clusters.put(c.getLabel(), c);
		shownClusters.put(c.getLabel(), c);
		for(int i=0;i<c.getNodes().size();i++)
		  	{
			if(!mates.containsKey(c.getNode(i).getLabel()))	mates.put(c.getNode(i).getLabel(), c.getNode(i));
		  	}
		}
	  
	  /**
	   * Returns true if node n is in some of the clusters in which this node is
	   * @param n	Node to check if it is at least once clustered with this node
	   * @return true if node n is in some of the clusters in which this node is
	   */
	  protected boolean isInSameCluster(Node n) 
	  	{
		  if(mates.containsValue(n))	return true;
		  else							return false;
	  	}
	    
	  /**
	   * Sets the label name for this node
	   * @param s	String with the new nodes's name
	   */
	  public void setLabel(String s) {
	    label = s;
	  }
	  
	  /**
	   * Returns the label name for this node
	   * @return	A string with this node label
	   */
	  public String getLabel() {
		    return label;
		  }

	  /**
	   * Returns all the clusters in which this node is in
	   * @return	A Map with the list of clusters. The key of the map is the name of the cluster
	   */
	 public Map<String,Group> getClusters() 
	  	{
			  return clusters;
	  	}
	  
	 /**
	  * Returns true if the node (drawn as a little circle) contains position (x,y); false otherwise
	  * @param x	x coordinate of the position to check
	  * @param y	y coordinate of the position to check
	  * @return true if the position (x,y) is within the node; false otherwise
	  */
	  public boolean containsPoint(double x, double y) {
	    double dx = position.getX()-x;
	    double dy = position.getY()-y;
	    
	    return (Math.abs((float) dx) < width/2 && Math.abs((float) dy)<height/2);
		 }
	  
	  /**
	   * Gets the position (x,y) of this node
	   * @return	GraphPoint2D with the position of this node
	   */
	  public GraphPoint2D getPosition() {
	    return position;
	  }
	  
	  /**
	   * Sets the position of this node in the graph
	   * @param v	GraphPoint2D with the (x,y) coordinates for the node
	   */
	  public void setPosition(GraphPoint2D v) {
	   if(!fixed)	
		   position = v;
	  }
	  
	  /**
	   * Sets the position of this node in the graph
	   * @param x0	x coordinate of the new position
	   * @param y0	y coordinate of the new position
	   */
	  public void setPosition(float x0, float y0) {
	   if(!fixed)	
		   {
		   position.setX(x0);
		   position.setY(y0);
		   }
	  }
	  
	  /**
	   * Sets the x coordinate
	   * @param p x coordinate
	   */
	  public void setX(double p)
	  	{
		if(!fixed)	position.setX(p);
	  	}
	  
	  /**
	   * Sets the y coordinate
	   * @param p y coordinate
	   */
	  public void setY(double p)
	  	{
		if(!fixed)	position.setY(p);
	  	}
	  
	  /**
	   * Returns the x coordinate
	   * @return the x coordinate
	   */
	  public double getX() {
	    return position.getX();
	  }
	  
	  /**
	   * Returns the y coordinate
	   * @return the y coordinate
	   */
	  public double getY() {
	    return position.getY();
	  }
	  
	  /**
	   * Draws the node as a little circle
	   *
	   */
	  public void draw() {
		Overlapper p=(Overlapper)g.getApplet();
		if(p.nodeThreshold<=this.clusters.size())
			{
			p.stroke(0);
			p.fill(0);
			p.ellipse((float) getX(), (float) getY(), height, width);
			p.fill(255);
			p.ellipse((float) getX()-1, (float) getY()-1, height+2, width+2);
			   
		    drawn=true;
			}
	  }
	  
	  /**
	   * Returns the height of the node. This is the value of the y axis of the ellipse drawn or
	   * the height of the square 
	   * @return	the height of the node
	   */
	public float getHeight() {
		return height;
	}

	
	/**
	 * Sets the height for the node drawing
	 * @param height	height for node drawing, in pixels
	 */
	public void setHeight(float height) {
		this.height = height;
	}

	  /**
	   * Returns the width of the node. This is the value of the x axis of the ellipse drawn or
	   * the width of the square 
	   * @return	the width of the node
	   */
	public float getWidth() {
		return width;
	}

	/**
	 * Sets the with for the node drawing
	 * @param width	width for node drawing, in pixels
	 */
	public void setWidth(float width) {
		this.width = width;
	}

	/**
	 * Returns true if the node has already been drawn in its current state, just to avoid unnecesary redrawings
	 * @return true if the node has already been drawn 
	 */
	public boolean isDrawn() {
		return drawn;
	}
	
	/**
	 * Sets if this node has been drawn in its current state (position, shape, selection, etc.) .
	 * This way, unnecesary redrawings can be avoided
	 * @param drawn	if true, the nodes is marked as "drawn" and will not be redrawn until this flag is set to false
	 */
	public void setDrawn(boolean drawn) {
		this.drawn = drawn;
	}

	/**
	 * Returns the relevance of the node. Relevance is a value that can be used to measure any interesting
	 * quality for the node, for example degree of groups in which it is in.
	 * @return	the degree of relevance
	 */
	public float getRelevance() {
		return relevance;
	}

	/**
	 * Returns the relevance of this node, as a float measure
	 * @param relevance	relevance of the node
	 */
	public void setRelevance(float relevance) {
		this.relevance = relevance;
	}


	/**
	 * Gets the path to the image related to this node entity
	 */
	public String getImage() {
		return image;
	}

	/**
	 * Sets an image path to display with this node
	 * (STILL IN DEVELOPMENT)
	 * @param image	String with image path
	 */
	public void setImage(String image) {
		this.image = image;
		if(image.length()>0)
			{
			Overlapper p=(Overlapper)g.getApplet();
			this.pimage = p.loadImage(image);
			}
		else	this.pimage=null;
	}

	/**
	 * TODO: still in development
	 * @return	brief description of the entity that the node is representing
	 */
	public String getDetails() {
		return details;
	}
	
	/**
	 * Sets a brief text with details of this node
	 * (STILL IN DEVELOPMENT)
	 * @param details	String with a brief text of details about this node
	 */
	public void setDetails(String details) {
		this.details = details;
		if(details.length()>0)
			{
		  	StringTokenizer st=new StringTokenizer(details, "\n");
	    	numLines=st.countTokens();
	    	maxChars=0;
	    	while(st.hasMoreTokens())
	    		{
	    		String temp=st.nextToken();
	    		if(temp.length()>maxChars)	maxChars=temp.length();
	    		}
			}
		else			numLines=maxChars=0;
	}

	/**
	 * Fix the node position
	 * @param f if true, position of this node is fixed
	 */
	public void fix(boolean f)
		{
		fixed=f;
		}
	
	/**
	 * Returns true if the node is fixed
	 * @return true if the node is fixed
	 */
	public boolean isFixed()
		{
		return fixed;
		}

	/**
	 * Returns the node role
	 * @return	true if the node is a gene, false if it is a condition
	 */
	public boolean isGene() {
		return gene;
	}

	/**
	 * Sets if the node role
	 * @param gene	if true, node is a gene or samle (drawn as a circle), otherwise it is a condition or experiment (square)
	 */
	public void setGene(boolean gene) {
		this.gene = gene;
	}

	/**
	 * Returns true if the node piechart has already been drawn, in its current state, just for unnecessary redrawing control
	 * @return true if the node piechart has already been drawn, in its current state
	 */
	public boolean isDrawnAsPiechart() {
		return drawnAsPiechart;
	}

	/**
	 * Sets if the node piechart has already been drawn in this state, or not
	 * @param	drawnAsPiechart true if the node piechart has already been drawn, in its current state
	 */
	public void setDrawnAsPiechart(boolean drawnAsPiechart) {
		this.drawnAsPiechart = drawnAsPiechart;
	}

	/**
	 * Returns true if the node label has already been drawn, in its current state, just for unnecessary redrawing control
	 * @return true if the node label has already been drawn, in its current state
	 */
	public boolean isDrawnAsLabel() {
		return isDrawnAsLabel;
	}

	/**
	 * Sets if the node label has already been drawn in this state, or not
	 * @param	drawnAsLabels true if the node label has already been drawn, in its current state
	 */
	public void setDrawnAsLabel(boolean drawnAsLabels) {
		this.isDrawnAsLabel = drawnAsLabels;
	}

	
}
