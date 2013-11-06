package es.usal.bicoverlapper.view.diagram.overlapper;

import java.awt.Color;
import java.util.ArrayList;

import es.usal.bicoverlapper.model.geometry.GraphPoint2D;

/**
 * This is basically a cluster but with the dummy nodes in Sugiyama2007
 * @author Rodrigo
 *
 */
public class SugiyamaCluster extends Group {
	protected ForcedNode center;
	protected ForcedNode top;
	protected ForcedNode bottom;
	protected ForcedNode left;
	protected ForcedNode right;
	
	protected Edge vertical;
	protected Edge horizontal;
	
	protected ArrayList<Edge> radials;//edges between the center node and exclusive group nodes
	protected ArrayList<Edge> axials;//edges between the center and the vertices (top, bottom, left, right)
	protected ArrayList<Edge> peripherals;//edges between the vertices and the non-exclusive group nodes
	/**
	 * Builds an empty MaximalCluster
	 *
	 */
  public SugiyamaCluster() {
	super();
	radials=new ArrayList<Edge>();
	axials=new ArrayList<Edge>();
	peripherals=new ArrayList<Edge>();
    }
  /**
   * Builds an empty MaximalCluster in the ClusterSet r
   * @param r	the ClusterSet in which the cluster is in
   */
  public SugiyamaCluster(GroupSet r) {
 	 super(r);
 	 radials=new ArrayList<Edge>();
 	 axials=new ArrayList<Edge>();
 	 peripherals=new ArrayList<Edge>();
     } 

  /**
   * Builds a MaximalCluster with name l in the ClusterSet r
   * @param r the ClusterSet in which the cluster is in
   * @param l the String used as label to name the Cluster
   */
  public SugiyamaCluster(GroupSet r, String l) {
	  super(r,l);
	  radials=new ArrayList<Edge>();
      axials=new ArrayList<Edge>();
	  peripherals=new ArrayList<Edge>();
	  } 
  
  /**
   * Adds a node
   * @param n	Node to be added to the MaximalCluster
   */
  public void addNode(Node n) {
	    clusterNodes.add(n);
	  }
  
  public void drawNodes()
  	{
	//draw normal nodes
	Overlapper bv=(Overlapper) myGraph.getApplet();
	for(int i=0;i<clusterNodes.size();i++)
	    {
		Node n=clusterNodes.get(i);
		if(bv.isDrawingOverview() || pointInScreen((GraphPoint2D)n.getPosition()))
			{
			if(!n.isDrawn())		n.draw();
			}
	    }

	//draw center node
	bv.rectMode(Overlapper.CENTER);
   	
	bv.stroke(255,255,255,128);
    bv.strokeWeight(3);
    bv.ellipse((float) center.getX(), (float) center.getY(), center.width*2, center.height*2);
  	center.setDrawn(true);
    
    //draw vertex nodes
  	bv.diamond((float) top.getX(), (float) top.getY(), top.width, top.height);
  	bv.diamond((float) bottom.getX(), (float) bottom.getY(), bottom.width, bottom.height);
  	bv.diamond((float) right.getX(), (float) right.getY(), right.width, right.height);
  	bv.diamond((float) left.getX(), (float) left.getY(), left.width, left.height);
  	}
  public GraphPoint2D getCenterPos()
  	{
	double x=0,y=0;
	for(int i=0;i<clusterNodes.size();i++)
	  	{
		Node n=(Node)clusterNodes.get(i);
		x+=n.getX();
		y+=n.getY();
	  	} 
	x/=clusterNodes.size();
	y/=clusterNodes.size();
	return new GraphPoint2D(x,y);
  	}
  
  public GraphPoint2D getTopPos()
	{
	double x=0,y=1000000;
	for(int i=0;i<clusterNodes.size();i++)
	  	{
		Node n=(Node)clusterNodes.get(i);
		x+=n.getX();
		if(y>n.getY())	y=n.getY();
	  	} 
	x/=clusterNodes.size();
	return new GraphPoint2D(x,y);
	}

  public GraphPoint2D getBottomPos()
	{
	double x=0,y=0;
	for(int i=0;i<clusterNodes.size();i++)
	  	{
		Node n=(Node)clusterNodes.get(i);
		x+=n.getX();
		if(y<n.getY())	y=n.getY();
	  	} 
	x/=clusterNodes.size();
	return new GraphPoint2D(x,y);
	}
  public GraphPoint2D getLeftPos()
	{
	double x=1000000,y=0;
	for(int i=0;i<clusterNodes.size();i++)
	  	{
		Node n=(Node)clusterNodes.get(i);
		y+=n.getY();
		if(x>n.getX())	x=n.getX();
	  	} 
	y/=clusterNodes.size();
	return new GraphPoint2D(x,y);
	}

  public GraphPoint2D getRightPos()
	{
	double x=0,y=0;
	for(int i=0;i<clusterNodes.size();i++)
	  	{
		Node n=(Node)clusterNodes.get(i);
		y+=n.getY();
		if(x<n.getX())	x=n.getX();
	  	} 
	y/=clusterNodes.size();
	return new GraphPoint2D(x,y);
	}
  /**
   * When the cluster is complete, to call this function makes to each node add the nodes in the cluster
   * to its mate list.
   *
   */
  public void notifyNodesInCluster()
	  {
	  for(int i=0;i<clusterNodes.size();i++)
	  	{
		Node n=(Node)clusterNodes.get(i);
		n.addCluster(this);
	  	}
	  }
  
  public ForcedNode getCenter() {
		return center;
	}
 public Edge getVertical() {
		return vertical;
	}
	public void setVertical(Edge vertical) {
		this.vertical = vertical;
	}
	public Edge getHorizontal() {
		return horizontal;
	}
	public void setHorizontal(Edge horizontal) {
		this.horizontal = horizontal;
	}
	public ArrayList<Edge> getRadials() {
		return radials;
	}
	public void setRadials(ArrayList<Edge> radials) {
		this.radials = radials;
	}
	public ArrayList<Edge> getPeripherals() {
		return peripherals;
	}
	public void setPeripherals(ArrayList<Edge> peripherals) {
		this.peripherals = peripherals;
	}
	public ForcedNode getTop() {
		return top;
	}
	public void setTop(ForcedNode top) {
		this.top = top;
	}
	public ForcedNode getBottom() {
		return bottom;
	}
	public void setBottom(ForcedNode bottom) {
		this.bottom = bottom;
	}
	public ForcedNode getLeft() {
		return left;
	}
	public void setLeft(ForcedNode left) {
		this.left = left;
	}
	public ForcedNode getRight() {
		return right;
	}
	public void setRight(ForcedNode right) {
		this.right = right;
	}
	public void setCenter(ForcedNode center) {
		this.center = center;
	}
	
	  /**
	   * Draw the hull of the cluster. The hull of the cluster is its surrounding area, determined by their most peripheral nodes
	   *
	   */
	  void drawHull()
		{
		Overlapper bv=(Overlapper) myGraph.getApplet();
		if(bv.drawDual)
			{
			drawHullsDual();
			return;
			}
	    int trans=255/myGraph.maxZones;
		
	    if(myGraph.getHoverClusters().containsKey(this.label))
	 	{
	    Color c=bv.paleta[Overlapper.hoverColor];
		bv.fill(c.getRed(), c.getGreen(), c.getBlue(), trans);
		bv.stroke(c.getRed(), c.getGreen(), c.getBlue(),255);
		}
	    else
	    	{
	    	if(myGraph.getSelectedClusters().containsKey(this.label))
	    	 	{
	    		Color c=bv.paleta[Overlapper.selectionColor];
				 bv.fill(c.getRed(), c.getGreen(), c.getBlue(), trans);
				 bv.stroke(c.getRed(), c.getGreen(), c.getBlue(),255);
		 		}
	    	else
	    	 	{
	    		bv.fill(myResultSet.myColor.getR(), myResultSet.myColor.getG(), myResultSet.myColor.getB(), myResultSet.myColor.getA());
	    		bv.fill(myResultSet.myColor.getR(), myResultSet.myColor.getG(), myResultSet.myColor.getB(), trans);
				if(bv.isDrawContour()) bv.stroke(myResultSet.myColor.getR(), myResultSet.myColor.getG(), myResultSet.myColor.getB(),255);
				else				   bv.noStroke();
		 	    }
	 	   }
			 
		 group=new GraphPoint2D[4];
		 float meanx=0;
		 float meany=0;
		  //----------------------------- HULL DRAWING --------------------------
		  boolean hullInScreen=false;
		  int cont=0;
		  for (int i=0; i<4; i++) 
		  	{
			Node n=null;
			switch(i)
				{
				case 1:	n = top; break;
				case 2:	n = bottom; break;
				case 3:	n = right; break;
				case 4:
				default:n = left; break;
				}
	       if(!hullInScreen && !bv.isDrawingOverview() && pointInScreen((GraphPoint2D)n.getPosition()))	hullInScreen=true;
	       group[cont++] = convertRefFrame((GraphPoint2D)n.getPosition());
	       meanx+=n.getX();
	       meany+=n.getY();
		   }
		  
		  if(bv.isDrawingOverview() || hullInScreen)
		  {
		  if(clusterNodes.size()>1)
			  {
			  presort(group);
			  
			  ArrayList<GraphPoint2D> groupHull;
			  groupHull = chainHull_2D(group, group.length);
			  
			  bv.beginShape();
			  for (int i=0; i<groupHull.size(); i++) 
			  	{
			      GraphPoint2D p = convertRefFrame((GraphPoint2D)groupHull.get(i));
			      if(bv.isUseCurves()) 
			    	 bv.curveVertex((float)p.getX(), (float)p.getY());
			      else	  
			         bv.vertex((float)p.getX(), (float)p.getY());
			    }
			  //Para cerrar la curva
			  if(bv.isUseCurves())
			     bv.curveVertex((float)(convertRefFrame((GraphPoint2D)groupHull.get(0))).getX(), (float)(convertRefFrame((GraphPoint2D)groupHull.get(0))).getY());
			
			  hull=bv.endShape(JProcessingPanel.CLOSE);
			  bv.noStroke();
			  }
		  }
		}


	
	
}
