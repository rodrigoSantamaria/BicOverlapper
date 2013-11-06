package es.usal.bicoverlapper.view.diagram.overlapper;

import java.awt.Color;
import java.awt.Polygon;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import es.usal.bicoverlapper.model.geometry.GraphPoint2D;
import es.usal.bicoverlapper.utils.color.CustomColor;

/**
 * Force directed nodes for a Dual Graph. Each dual node will correspond to all nodes that are grouped in exactly the 
 * same list of biclusters, thus a zone of the equivalent dual graph.
 * In this case, mates only refers to dualNodes and clusters to all clusters in the zone represented by this DualNode.
 * In addition, a new map subNodes referes to all the ForcedNodes represented by this DualNode
 * @author Rodrigo Santamaría
 *
 */
public class DualNode extends ForcedNode {

	Map<String,Node>	subNodes;//List of nodes represented by this node
	public Polygon hull=null;			//Hull formed by the nodes in this dual node

  /**
   * Builds a DualNode at starting position v
   * @param v	Initial position as (x,y)
   */
  public DualNode(GraphPoint2D v) {
	    super(v);
	    subNodes=new TreeMap<String,Node>();
	  }
  
  /**
   * Builds a DualNode in Graph g at starting position v
   * @param g	Graph for this node
   * @param v	Starting position for this node
   * 
   */
  public DualNode(Graph g, GraphPoint2D v) {
	    super(g, v);
	    subNodes=new TreeMap<String,Node>();
	  }
  
  public DualNode(Graph g, Map<String,Group> zone, Map<String, Node> sub)
  	{
	super(g,new GraphPoint2D(0,0));
	clusters=new HashMap<String,Group>();
	clusters.putAll(zone);
	subNodes=new TreeMap<String,Node>();
	subNodes.putAll(sub);
	Point2D.Double p=getMiddlePoint();
	position=new GraphPoint2D(p.x,p.y);
	
	label="";
	String groups[]=clusters.keySet().toArray(new String[clusters.size()]);
	for(String s:groups)
		{
		label=label+s+"\n";
		}
	}
  
  /**
   * Sets the position of subnodes surrounding the position of this node on a circular fashion
   */
  public void positionSubNodes()
  	{
	Iterator<Node> it=subNodes.values().iterator();
	float radius=0;
	double r=0;
	double degree=0;
	double x0=position.getX();
	double y0=position.getY();
	int contCircles=0;
	double restRadius=0;//the part of the circumference in which another node can't fit,
	double restRadiusDegrees=0;//the rest radius divided by the number of circles for a determinate circunference
	
	while(it.hasNext())
		{	
		Node n=it.next();
		r=n.getWidth()/2+1;//supposed equal to getHeight() and referred to diameter, not radius (hence the /2)
		double x=x0+Math.cos(degree)*radius;
		double y=y0+Math.sin(degree)*radius;
		n.setPosition((float)x,(float)y);
		
		contCircles++;
		
		//if(contCircles>=(Math.PI*radius/r)-1) //PI*R/r is the maximum number of circles of radius r in a ring of radius R
		if(contCircles>=Math.floor(Math.PI*radius/r)) //PI*R/r is the maximum number of circles of radius r in a ring of radius R
			{//increase to the next ring
			radius+=r*2;
			contCircles=0;
			degree=0;
			restRadius=(Math.PI*radius/r)-Math.floor(Math.PI*radius/r);
			restRadiusDegrees=restRadius/Math.floor(Math.PI*radius/r);
			}
		else	//just increase the degree
			{
			//If PI*(R/r) is the number of circles, the radians for each one are: 2PI/(PI*R/r) -> 2r/R
			//degree+=2*r/radius;
			degree+=2*r/radius+restRadiusDegrees/2;
			}
		}
  	}
	  
    
  /**
   * Draw the dual node as a circle, with area proportional to the number of nodes that
   * are in the zone
   * @param dependent if true, dual node position is the middle point of all their related nodes, otherwise, it is assumed
   * 				that the dual node has its own position computed elsewhere
   */
  public void draw(boolean dependent) 
  	{
	 
    Overlapper p=(Overlapper)g.getApplet();
    float radius=getRadius();
    if(dependent)
    	{
	    Point2D.Double p0=getMiddlePoint();
	    this.position.setX(p0.x);
	    this.position.setY(p0.y);
    	}
    if(this.isDrawn())   		return;
       
    p.noFill();
	Color c=p.paleta[Overlapper.foregroundColor];
	p.stroke(c.getRed(),c.getGreen(),c.getBlue(),128);
    p.rectMode(Overlapper.CENTER);

  	p.ellipse((float)position.getX(), (float)position.getY(), radius, radius);
  	
  	this.setDrawn(true);
  }
  
  public float getRadius()
  	{
	  return (float)(this.getHeight()*Math.log(this.subNodes.size()+1));
        
  	}
  //Método mejorado para dibujar piecharts
  public void drawPie()
	{
	Overlapper bv=(Overlapper)g.getApplet();
	final float env = 1.3f;
	float ns=this.height;
	int numSectors=this.clusters.size();
	if(!isDrawnAsPiechart() && numSectors>=bv.nodeThreshold)
		{
		float x=(float)getX();
        float y=(float)getY();
       // float s=getSize();
        //float senv=s*env;
        float radius=getRadius();
        
        
        //Para saber qué porción de círculo toca;
        float step = Overlapper.TWO_PI / numSectors;
	    //Para hacer un sector por grupo al que pertenece
        int inter=0;
        if(bv.isOnlyIntersecting())	inter=1;
        if(numSectors>inter)
	        {
        	shownClusters=this.subNodes.values().iterator().next().shownClusters;
	        Iterator<Group> itDraw=shownClusters.values().iterator();
	        ArrayList<CustomColor> colors=new ArrayList<CustomColor>();
	        ArrayList<Integer> sizes=new ArrayList<Integer>();
	        for (int j=0; itDraw.hasNext(); j++)	//Tomamos el tamaño de las porciones por cada color
	           	{
	        	MaximalCluster c=(MaximalCluster)itDraw.next();
		    	GroupSet r = c.myResultSet;
		    	CustomColor col = r.myColor;
		    	if(!colors.contains(col))
		    		{
		    		colors.add(col);
		    		sizes.add(1);
		    		}
		    	else
		    		{
		    		int ind=colors.indexOf(col);
		    		int tam=sizes.get(ind);
		    		sizes.set(ind, tam+1);
		    		}
	           	}
	        
	        float init=0;
	        for(int i=0;i<colors.size();i++)
	        	{
	        	CustomColor col=colors.get(i);
	        	bv.rectMode(JProcessingPanel.CENTER);
	        	bv.fill(col.getR(), col.getG(), col.getB(),150);
	        	bv.noStroke();
	        	
		        float end=init+step*sizes.get(i);
		        
		        //bv.arc(x+1, y+1, senv, senv, init, end);//TODO: no sé por qué los arcos no me salen bien centrados, sol temp. poner el +1
		        bv.arc(x+1, y+1, radius, radius, init, end);//TODO: no sé por qué los arcos no me salen bien centrados, sol temp. poner el +1
		        
		        bv.stroke(255,255,255,255);
		        bv.strokeWeight(1);
		        for(int j=0;j<sizes.get(i);j++)
			        {
				   	//bv.line(x, y, (float)(x+ ns/2*Math.cos(init)), (float)(y+ ns/2*Math.sin(init)));
		        	bv.line(x, y, (float)(x+ radius/2.0*Math.cos(init)), (float)(y+ radius/2.0*Math.sin(init)));
		         	init+=step;
			        }
				bv.fill(0,0,0,255);
		    	}
		  	}
       // setDrawnAsPiechart(true);
		}//if(no ha sido ya pintada la piechart)
	}
  
  public void refreshPosition()
  	{
	    Point2D.Double p0=getMiddlePoint();
	    this.position.setX(p0.x);
	    this.position.setY(p0.y);
  	}
  
  /**
   * Returns the radius of the area covered by all the nodes in the dual node
   * @return
   */
  public double getGroupRadius()
  	{
	Iterator<Node> it=subNodes.values().iterator();
	double radius=0;
	double r=0;
	int contCircles=0;
	while(it.hasNext())
		{	
		Node n=it.next();
		r=n.getWidth()/2+1;//supposed equal to getHeight() and referred to diameter, not radius (hence the /2)
		
		contCircles++;
		if(contCircles>=(Math.PI*radius/r)-1) //PI*R/r is the maximum number of circles of radius r in a ring of radius R
			{//increase to the next ring
			radius+=r*2;
			contCircles=0;
			}
		}
	return radius;
  	}
  
  public boolean containsPoint(double x, double y) {
	    double dx = position.getX()-x;
	    double dy = position.getY()-y;
	    double r=getRadius();
	    
	    return (Math.abs((float) dx) < r/2 && Math.abs((float) dy)<r/2);
		 }
  /**
   * Returns the center of the cluster, computed as the mean of each cluster node's coordinates
   * returns	point with the coordinates of the middle point
   */
  public Point2D.Double getMiddlePoint()
  	{
	float meanx=0;
	float meany=0;
	Iterator<Node> it=subNodes.values().iterator();
	while(it.hasNext())
		{
		Node n = it.next();
		meanx+=n.getX();
		meany+=n.getY();
		}
	return new Point2D.Double(meanx/subNodes.size(), meany/subNodes.size());
  	}
  
  /**
   * Returns the number of clusters in common between this dual node and the dual node taken as parameter
   */
  public int clustersInCommon(DualNode dn)
  	{
	int num=0;
	Iterator<Group> it=this.clusters.values().iterator();
	while(it.hasNext())
		{
		Group c=it.next();
		if(dn.clusters.containsKey(c.label))	num++;
		}
	return num;
  	}
  
  /**
   * Returns the number of subnodes in common between this dual node and the dual node taken as parameter
   */
  public int nodesInCommon(DualNode dn)
  	{
	int num=0;
	Iterator<Node> it=subNodes.values().iterator();
	
	while(it.hasNext())
		{
		Node c=it.next();
		if(dn.subNodes.containsKey(c.label))	num++;
		}
	return num;
  	}
  
  
  /**
   * Determines if the dual node is adjacent to other dual node. Adjacency is defined as that both nodes share exactly the same number of
   * groups except one.
   * @param dn
   * @return
   */
  public boolean adjacent(DualNode dn)
  	{
	if(dn.clusters.size()>this.clusters.size()+1 || dn.clusters.size()<this.clusters.size()-1)	return false;
	int num=clustersInCommon(dn);
	int minSize=Math.min(this.clusters.size(), dn.clusters.size());
	if(num!=minSize)	return false;
	return true;
	}
}

