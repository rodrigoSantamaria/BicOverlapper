package es.usal.bicoverlapper.view.diagram.overlapper;


import java.util.ArrayList;

import es.usal.bicoverlapper.model.geometry.GraphPoint2D;


/**
 * RadialCluster class is an extension of Cluster, where an dummy node is added, called centerNode. 
 * Radial Clusters has only edges between the centerNode and the rest of the nodes.
 * The edge complexity is reduced, but the quality of the shape of clusters is worse 
 * @author Roberto Therón and Rodrigo Santamaría
 *
 */
public class RadialCluster extends Group
{
private Node centerNode;
private Overlapper bv;

/**
 * Builds an empty RadialCluster
 *
 */
public RadialCluster() 
	{
	super();
	bv=(Overlapper)myGraph.getApplet();
	}
	  
/**
 * Builds an empty RadialCluster in the ClusterSet r
 * @param r ClusterSet in which this cluster is in 
 */
public RadialCluster(GroupSet r) 
	{
	super(r);
	bv=(Overlapper)myGraph.getApplet();
	}

/**
 * Builds RadialCluster with the nodes in MaximalCluster c, and puts it in ClusterSet r
 * @param r ClusterSet in which this cluster is in 
 * @param c	MaximalCluster to copy as RadialCluster
 */
public RadialCluster(GroupSet r, MaximalCluster c) 
	{
	super(r);
	bv=(Overlapper)myGraph.getApplet();
	setLabel(c.getLabel());  
	setLabel(c.getLabel());
	clusterNodes=c.getNodes();
	centerNode=null;
	}

/**
 * Adds node n to the RadialCluster, adding also an edge from the center node to n
 * @param n	Node to add to the RadialCluster
 */
  public void addNode(Node n) {
	    clusterNodes.add(n);
	    n.addCluster(this);
	    SpringEdge e=new SpringEdge(n,centerNode);
		e.setNaturalLength(bv.getEdgeLength());
	    myResultSet.myGraph.addEdge(e);
	  }
/**
 * Returns the center, dummy node
 * @return the center, dummy <code>Node</code> for this RadialCluster
 */  
public Node getCenterNode() {
			return centerNode;
}


/**
 * Sets the center, dummy node
 * @param centerNode the center, dummy <code>Node</code> for this RadialCluster
 */  
public void setCenterNode(Node centerNode) {
		this.centerNode = centerNode;
	clusterNodes.add(centerNode);
} 

/**
 * Removes the center node
 */
public void deleteCenterNode()
	{
	clusterNodes.remove(centerNode);
	centerNode=null;
	}

/**
 * Builds Spring edges from ceter node to every other node in the cluster
 *
 */
public void buildEdges()
	{	
	for (int i=0; i<clusterNodes.size(); i++) 
	  	{
		Node m = (Node)clusterNodes.get(i);
		SpringEdge e = new SpringEdge(centerNode,m);
		e.setStiffness(clusterNodes.size());
		myResultSet.myGraph.addEdge(e);
		//e = new SpringEdge(m, centerNode);
		//myResultSet.myGraph.addEdge(e);
       	}
	}

/**
 * Overrides Cluster.drawHulls(). Center node is not taken into account to build the wrapping hull
 */
public void drawHull()
	{
	 Overlapper bv=(Overlapper) myGraph.getApplet();
	  
	 bv.fill(myResultSet.myColor.getR(), myResultSet.myColor.getG(), myResultSet.myColor.getB(), myResultSet.myColor.getA());
	 bv.stroke(myResultSet.myColor.getR(), myResultSet.myColor.getG(), myResultSet.myColor.getB(),255);
	  
	 if(group==null || group.length!=clusterNodes.size())	group=new GraphPoint2D[clusterNodes.size()-1];
	  
	  float meanx=0;
	  float meany=0;
	  //----------------------------- HULL DRAWING --------------------------
	  boolean hullInScreen=false;
	  for (int i=0; i<clusterNodes.size(); i++) 
	  		{
	       Node n = (Node)clusterNodes.get(i);
	       if(n!=centerNode)
		       {
		       if(!hullInScreen && !bv.isDrawingOverview() && pointInScreen((GraphPoint2D)n.getPosition()))	hullInScreen=true;
		       group[i] = convertRefFrame((GraphPoint2D)n.getPosition());
		       meanx+=n.getX();
			   meany+=n.getY();
		       }
	  		}
	  
	  
	  if(bv.isDrawingOverview() || hullInScreen)
	  {
		if(clusterNodes.size()>1)
		  {
		  presort(group);
		  
		  ArrayList groupHull;
		  groupHull = chainHull_2D(group, clusterNodes.size()-1);
		  
	      bv.strokeWeight(1);//2 para fotos pequeñas
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
		
		  bv.endShape(JProcessingPanel.CLOSE);
		  bv.noStroke();
		  }
	  }
	}

}

