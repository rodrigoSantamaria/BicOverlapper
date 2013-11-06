package es.usal.bicoverlapper.view.diagram.overlapper;


import java.awt.Color;
import java.awt.Polygon;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import prefuse.util.ColorLib;

import es.usal.bicoverlapper.controller.util.ArrayUtils;
import es.usal.bicoverlapper.model.geometry.GraphPoint2D;
import es.usal.bicoverlapper.model.geometry.Line;
import es.usal.bicoverlapper.utils.color.CustomColor;
import es.usal.bicoverlapper.view.diagram.heatmap.HeatmapDiagram;


/**
 * Abstract class for group representation. Methods to manage edges are left to child classes.
 * A Group represents any group of elements (nodes), overlapped or not. For this documentation purposes,
 * cluster, bicluster and group are synonyms, although of course they actually mean very different things.
 * This class evolved from representing biclusters (specific) to clusters and now just to groups (general)
 */
public abstract class Group 
	{
	protected Graph myGraph = null;
	protected GroupSet myResultSet = null;
	protected ArrayList<Node> clusterNodes;//Nodes in the cluster
	protected ArrayList<DualNode> clusterDualNodes;
	CustomColor labelColor = new CustomColor(0,200,200,150);
	protected String label;//Name of the group
	public int labelDisplacement;//In the case of several groups with exactly the same elements, this is used to avoid label superposition
	protected int order;
	protected GraphPoint2D group[]=null; //Positions of all nodes in this cluster
	Polygon hull=null;
	
	//----- constructors
	/**
	 * Builds an empty Cluster
	 */
	public Group() {
		clusterNodes = new ArrayList<Node>();
		clusterDualNodes = new ArrayList<DualNode>();
	  }
	 
	
	/**
	   * New drawing of intersecting zones despite original zones
	   * By now only the overall zones.
	   */
	/*
	  void drawTopography(Map<String, Node> nodes)
	  	  {
		  Overlapper bv=this.myGraph.getApplet();
		   
		  int cont=0;
		  int contZones=0;
		  boolean stop=false;
		  int maxZones=0;
		  
		  while(!stop)
			  {
			  cont=0;
			  Iterator<Node> it=nodes.values().iterator();
			  int numNodes=0;
			  while(it.hasNext())
			  	{
				  Node n=it.next();
				  if(n.clusters.size()>contZones) numNodes++;
				  if(n.clusters.size()>maxZones) maxZones=n.clusters.size();
			  	}
			  GraphPoint2D[] group=new GraphPoint2D[numNodes];
				
			  it=nodes.values().iterator();
			  while(it.hasNext())
			  		{
			        Node n = it.next();
		            if(n.clusters.size()>contZones)
		        	    group[cont++] = convertRefFrame((GraphPoint2D)n.getPosition());
			  		}
			  if(cont>2)
				  {
				  presort(group);
				  ArrayList<GraphPoint2D> groupHull;
				  groupHull = chainHull_2D(group, group.length);
				  
				  bv.fill(0, 0, 255, 255/(maxZones*5));
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
				  contZones++;
				  }
			  else	stop=true;
			  }
		  myGraph.topographyDrawn=true;
	  	}
	  */
	  
	  /**
	   * New drawing of intersecting zones despite original zones
	   * By nodes that share exactly the same clusters
	   * TODO: implementar laxitud
	   */
	  void drawSurfaces(Map<Integer, DualNode> nodes, int maxZones)
  	  {
	  Overlapper bv=this.myGraph.getApplet();
	  int cont=0;
	  int coincidence=1;
	  boolean stop=false;
	  TreeMap<String,Node> layerNodes=new TreeMap<String,Node>();
	  
	  while(coincidence<=maxZones)
		  {
		  Iterator<DualNode> it=nodes.values().iterator();
		  int numNodes;
		  while(it.hasNext())	//Para cada nodo dual
		      {
			  cont=0;
			  DualNode dn=it.next();
			  if(dn.clusters.size()>=coincidence)
				  {
				  layerNodes.clear();
				  layerNodes.putAll(dn.subNodes);
				  Iterator<DualNode> it2=nodes.values().iterator();
				  while(it2.hasNext())	//Comprobamos su grado de parentesco con otros nodos duales
				  	{
					DualNode dn2=it2.next();
					if(dn.clusters.size()<dn2.clusters.size() && dn2.clusters.size()>=coincidence)
						if(myGraph.clustersInCommon(dn, dn2)>=coincidence)//Si tienen más en comun que el grado de coincidencia señalado
							layerNodes.putAll(dn2.subNodes);
				  	}
				  //Ya tenemos todos los nodos que tienen que ir en esta capa
				  numNodes=layerNodes.size();
				  Point2D.Double center=new Point2D.Double(0,0);//To make the hulls slightly larger
				  Iterator<Node> its=layerNodes.values().iterator();
				  while(its.hasNext())
						{
					  	Node n = its.next();
		        	    center.x+=n.getX();
				    	center.y+=n.getY();
				    	}
				  center.x/=numNodes;
				  center.y/=numNodes;
				  if(numNodes==2)	numNodes+=2;
				  	
				  GraphPoint2D[] group=new GraphPoint2D[numNodes];
				  its=layerNodes.values().iterator();
				  while(its.hasNext())
				  		{
				        Node n = its.next();
		        	    //group[cont++] = convertRefFrame((GraphPoint2D)n.getPosition());
		        	    Line l=new Line(center.x, center.y, n.getX(), n.getY());
				        Point2D.Double pro=l.getProlongationPoint(n.height);
				        group[cont++] = convertRefFrame(new GraphPoint2D(pro.x, pro.y));
				        }
				  
				  if(layerNodes.size()==2)//inflate 2-groups
					{
					its=layerNodes.values().iterator();
					Node n1=its.next();
					Node n2=its.next();
					Line l=new Line(group[0].getX(), group[0].getY(), group[1].getX(), group[1].getY());
					Point2D.Double p1=l.getPerpendicularPoint((n1.getX()+n2.getX())/2, (n1.getY()+n2.getY())/2, -10);
					Point2D.Double p2=l.getPerpendicularPoint((n1.getX()+n2.getX())/2, (n1.getY()+n2.getY())/2, 10);
					
					//add two anchor points to improve the hull
		            l=new Line(center, p1);
					Point2D.Double pro=l.getProlongationPoint(this.getNode(0).height);
				    group[numNodes-2]=convertRefFrame(new GraphPoint2D(pro.x, pro.y));
				    l=new Line(center, p2);
					pro=l.getProlongationPoint(this.getNode(0).height);
				    group[numNodes-1]=convertRefFrame(new GraphPoint2D(pro.x, pro.y));
					}
				  
				  if(cont>1)
					  {
					  presort(group);
					  ArrayList<GraphPoint2D> groupHull;
					  groupHull = chainHull_2D(group, group.length);
					  
					  //int [] palette=ColorLib.getInterpolatedPalette(new Color(20,20,20).getRGB(), new Color(255,255,255).getRGB());
					  int [] palette=ColorLib.getInterpolatedPalette(new Color(Math.max(0, bv.paleta[Overlapper.backgroundColor].getRed()-10),Math.max(0,bv.paleta[Overlapper.backgroundColor].getGreen()-10),Math.max(0,bv.paleta[Overlapper.backgroundColor].getBlue()-10)).getRGB(), new Color(0,0,0).getRGB());
					  int step2=palette.length/(maxZones);
					  Color c=new Color(palette[coincidence*step2-1]);
					  
					  bv.fill(c.getRed(), c.getGreen(), c.getBlue());
					  bv.noStroke();
				      
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
				  }//if(numClusters>=coincidence)
		      }
		  coincidence++;
		  }
	  myGraph.topographyDrawn=true;
  	}
	  
	  void drawTopography(Map<Integer, DualNode> nodes, int maxZones)
	  	  {
		  Overlapper bv=this.myGraph.getApplet();
		  int cont=0;
		  
		  Iterator<DualNode> it=nodes.values().iterator();
		  int numNodes;
		  while(it.hasNext())
		      {
			  cont=0;
			  DualNode dn=it.next();
			  numNodes=dn.subNodes.size();
			  GraphPoint2D[] group=new GraphPoint2D[numNodes];
			  Iterator<Node> its=dn.subNodes.values().iterator();
			  while(its.hasNext())
			  		{
			        Node n = its.next();
	        	    group[cont++] = convertRefFrame((GraphPoint2D)n.getPosition());
			  		}
			  if(cont>1)
				  {
				  presort(group);
				  ArrayList<GraphPoint2D> groupHull;
				  groupHull = chainHull_2D(group, group.length);
				  
			     // bv.fill(0, 0, 255, 255/maxZones);
				  //bv.fill(0, 0, (255*dn.clusters.size())/(maxZones), 100);
				  bv.noFill();
				 // bv.stroke(255, 255, 255);
				  bv.stroke(200, 150, 0);
				  bv.strokeWeight(2);
				  // bv.fill(0, 0, 255);
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
				
				  dn.hull=bv.endShape(JProcessingPanel.CLOSE);
				  bv.noStroke();
				  }
			  
			  //Por último, si está seleccionado, le dibujamos aristas y tal
			  if(myGraph.getHoverDualZones().containsKey(dn.label))
			  	{
				ArrayList<Edge> list=myGraph.getDualEdges(dn);
				for(int i=0;i<list.size();i++)
					{
					Node dn2=list.get(i).to;
					if(dn==dn2)	dn2=list.get(i).to;
					Iterator<Group> itc=dn2.clusters.values().iterator();
					int wide=0;
					while(itc.hasNext())	
						{
						Group c=itc.next();
						if(dn.clusters.containsKey(c.label))	wide++;
						}
					bv.stroke(wide);
					bv.stroke(255, 255,0, myResultSet.myColor.getA());
				
					bv.line((int)dn.getX(), (int)dn.getY(), (int)dn2.getX(), (int)dn2.getY());
					bv.noStroke();
					}
			  	}
		      }
		  myGraph.topographyDrawn=true;
	  	}
	
	/**
	 * Builds a cluster that correponds to the cluster set r
	 * @param r	The ClusterSet in which this cluster is
	 */  
	public Group(GroupSet r) {
			clusterNodes = new ArrayList<Node>();
			clusterDualNodes = new ArrayList<DualNode>();
			myResultSet = r;
			myGraph = myResultSet.myGraph;
		  } 
	
	/**
	 * Builds a cluster with name l that is in the ClusterSet r
	 * @param r	ClusterSet in whith this cluster is
	 * @param l	name for this cluster
	 */
	  public Group(GroupSet r, String l) {
			clusterNodes = new ArrayList<Node>();
			clusterDualNodes = new ArrayList<DualNode>();
			myResultSet = r;
			label=l;
			myGraph = myResultSet.myGraph;
		  } 

	 //---- drawing functions
	  /**
	   * Draws the Cluster. Which means drawing all their nodes, the surrounding hull, and node and title labels
	   * if corresponding flags are on
	   */
	  
	  public void draw()
	  	{
		 draw(true, true);
	  	}
	  
	  public void drawHull(CustomColor c)
	  	{
		Overlapper bv=(Overlapper) myGraph.getApplet();
		int trans=Math.max(30, 255/myGraph.maxZones);
		if(myGraph.maxZones==1)	trans=trans/2;
		
		bv.fill(c.getR(), c.getG(), c.getB(), trans);
		if(c==myResultSet.myColor)
			{
			bv.strokeWeight(1);
			if(bv.isDrawContour()) bv.stroke(c.getR(), c.getG(), c.getB(),255);
			else				   bv.noStroke();
			}
		else
			{
			bv.strokeWeight(2);
			bv.stroke(c.getR(), c.getG(), c.getB(),255);
			}
		
	  		 
		 int numNodes=0;
		 Point2D.Double center=new Point2D.Double(0,0);//To make the hulls slightly larger
		 ArrayList<Point2D.Double> additionalPoints=new ArrayList<Point2D.Double>();//TODO: in order to add new points if necessary
		 
		 for(int i=0;i<clusterNodes.size();i++)
		 	{
			Node n = (Node)clusterNodes.get(i);
		    if(n.clusters.size()>=bv.nodeThreshold)	
		    	{
		    	numNodes++;
		    	center.x+=n.getX();
		    	center.y+=n.getY();
		    	//ep.add(new Point2D.Double(n.getX(),n.getY()));
		    	}
		 	}
		 center.x/=numNodes;
		 center.y/=numNodes;
		
		 boolean inflate2=false;
		 boolean inflate3=false;
		 if(numNodes==2)
		 	 {
			 numNodes+=2;
			 inflate2=true;
		 	 }
		 if(numNodes==1)	
		 	{
			 numNodes=4;
			 inflate3=true;
		 	}
		 
 			group=new GraphPoint2D[numNodes];
		 
		  float meanx=0;
		  float meany=0;
		  //----------------------------- HULL DRAWING --------------------------
		  boolean hullInScreen=false;
		  int cont=0;
		  for (int i=0; i<clusterNodes.size(); i++) 
		 	   {
		       Node n = (Node)clusterNodes.get(i);
		       if(n.clusters.size()>=bv.nodeThreshold)
			       {
			       if(!hullInScreen && !bv.isDrawingOverview() && pointInScreen((GraphPoint2D)n.getPosition()))	hullInScreen=true;
		           Line l=new Line(center.x, center.y, n.getX(), n.getY());
		           Point2D.Double pro=l.getProlongationPoint(n.height);
		           group[cont++] = convertRefFrame(new GraphPoint2D(pro.x, pro.y));
		           meanx+=pro.x;
		    	   meany+=pro.y;
			       }
		  	  }
		  if(inflate2)
			{
			Line l=new Line(group[0].getX(), group[0].getY(), group[1].getX(), group[1].getY());
			Point2D.Double p1=l.getPerpendicularPoint((clusterNodes.get(0).getX()+clusterNodes.get(1).getX())/2, (clusterNodes.get(0).getY()+clusterNodes.get(1).getY())/2, -10);
			Point2D.Double p2=l.getPerpendicularPoint((clusterNodes.get(0).getX()+clusterNodes.get(1).getX())/2, (clusterNodes.get(0).getY()+clusterNodes.get(1).getY())/2, 10);
			//add two anchor points to improve the hull
            l=new Line(center, p1);
			Point2D.Double pro=l.getProlongationPoint(this.getNode(0).height);
		    group[numNodes-2]=convertRefFrame(new GraphPoint2D(pro.x, pro.y));
		    l=new Line(center, p2);
			pro=l.getProlongationPoint(this.getNode(0).height);
		    group[numNodes-1]=convertRefFrame(new GraphPoint2D(pro.x, pro.y));
			}
		  if(inflate3)
		  	{
			Node n = (Node)clusterNodes.get(0);
		       
			group[1]=convertRefFrame(new GraphPoint2D(n.getX()-10, n.getY()));
			group[2]=convertRefFrame(new GraphPoint2D(n.getX(), n.getY()-10));
			group[3]=convertRefFrame(new GraphPoint2D(n.getX()+10, n.getY()));
			group[0]=convertRefFrame(new GraphPoint2D(n.getX(), n.getY()+10));
		  	}
		  
		  hullInScreen=true;//TODO: Sólo para pruebas de métricas!
		  if(bv.isDrawingOverview() || hullInScreen)
			  {
		  if(group.length>0)
			  {
			  presort(group);
			  
			  ArrayList<GraphPoint2D> groupHull;
			  groupHull = chainHull_2D(group, group.length);
			  
			  bv.beginShape();
			  for (int i=0; i<groupHull.size(); i++) 
			  	{
			      GraphPoint2D p = convertRefFrame((GraphPoint2D)groupHull.get(i));
			      //bv.ellipse((int)p.getX(), (int)p.getY(), 5, 5);
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
	  /**
	   * Draw the hull of the cluster. The hull of the cluster is its surrounding area, determined by their most peripheral nodes
	   *
	   */
	  void drawHull()
		{
		drawHull(myResultSet.myColor);	
		}
	
	  /**
	   * Adds additional anchor points to avoid too polygonal hulls
	   */
	  void makeHullRound(ArrayList<GraphPoint2D> h, float distance)
	  	{
		for(int i=0;i<h.size()-1;i++)
			{
			GraphPoint2D p1=h.get(i);
			GraphPoint2D p2=h.get(i+1);
			double dist=Math.sqrt((p1.getX()-p2.getX())*(p1.getX()-p2.getX())+(p1.getY()-p2.getY())*(p1.getY()-p2.getY()));
			if(dist>distance)
				h.add(i+1, new GraphPoint2D((p1.getX()+p2.getX())/2, (p1.getY()+p2.getY())/2));
			
			}
	  	}
	  
	  
	  void drawHullsDual()
		{
	    Overlapper bv=(Overlapper) myGraph.getApplet();
		  
	    if(myGraph.getHoverClusters().containsKey(this.label))
	 		{
	    	Color c=bv.paleta[Overlapper.hoverColor];
			 bv.fill(c.getRed(), c.getGreen(), c.getBlue(), myResultSet.myColor.getA());
			 bv.stroke(c.getRed(), c.getGreen(), c.getBlue(),255);
	 	    }
	    else
	    	{
	    	if(myGraph.getSelectedClusters().containsKey(this.label))
	    	 	{
	    		Color c=bv.paleta[Overlapper.selectionColor];
				 bv.fill(c.getRed(), c.getGreen(), c.getBlue(), myResultSet.myColor.getA());
				 bv.stroke(c.getRed(), c.getGreen(), c.getBlue(),255);
		 		}
	    	else
	    	 	{
				 bv.fill(myResultSet.myColor.getR(), myResultSet.myColor.getG(), myResultSet.myColor.getB(), myResultSet.myColor.getA());
				 bv.stroke(myResultSet.myColor.getR(), myResultSet.myColor.getG(), myResultSet.myColor.getB(),255);
		 	    }
	 	   }
			 
		 int numNodes=0;
			 
		 for(int k=0;k<clusterDualNodes.size();k++)
		 	{
			DualNode dn = (DualNode)clusterDualNodes.get(k);
			
		    numNodes=dn.subNodes.size();
		    if(numNodes==2)	numNodes+=2;
		    if(numNodes==1)	numNodes=4;
			group=new GraphPoint2D[numNodes];
			 
			float meanx=0;
			float meany=0;
			//----------------------------- HULL DRAWING --------------------------
			boolean hullInScreen=false;
			int cont=0;
			Iterator<Node> it=dn.subNodes.values().iterator();
			if(dn.subNodes.size()>1)
				{
				while(it.hasNext())
				 	{
				    Node n = it.next();
		            if(!hullInScreen && !bv.isDrawingOverview() && pointInScreen((GraphPoint2D)n.getPosition()))	hullInScreen=true;
		            group[cont++] = convertRefFrame((GraphPoint2D)n.getPosition());
		            meanx+=n.getX();
		    	    meany+=n.getY();
				 	}
				if(dn.subNodes.size()==2)//"inflate 2-groups
					{
					Line l=new Line(group[0].getX(), group[0].getY(), group[1].getX(), group[1].getY());
					Point2D.Double p1=l.getPerpendicularPoint((group[0].getX()+group[1].getX())/2, (group[0].getY()+group[1].getY())/2, -10);
					Point2D.Double p2=l.getPerpendicularPoint((group[0].getX()+group[1].getX())/2, (group[0].getY()+group[1].getY())/2, 10);
					
					//add two anchor points to improve the hull
					group[numNodes-2]=new GraphPoint2D(p1.x, p1.y);
					group[numNodes-1]=new GraphPoint2D(p2.x, p2.y);
					}
				}
			else	return;
			
		    if(bv.isDrawingOverview() || hullInScreen)
		        {
			    presort(group);
			  
			    ArrayList<GraphPoint2D> groupHull;
			    groupHull = chainHull_2D(group, group.length);
			  
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
			
			  hull=bv.endShape(JProcessingPanel.CLOSE);
			  bv.noStroke();
		      }
		 	}//for each dual node
		}
		
	  /**
	   * Draw the label of the Cluster in the center of its hull
	   *
	   */
	void drawHullLabels()
		{
		Overlapper bv=(Overlapper) myGraph.getApplet();
		  
		int lcs=(int)Math.min(bv.getLabelClusterSize()+this.getNodes().size()*0.5, 30);
		float meanx=0;
		float meany=0;
		  
		  
		  //----------------------------- HULL DRAWING --------------------------
		  for (int i=0; i<clusterNodes.size(); i++) 
		  		{
			    Node n = (Node)clusterNodes.get(i);
			    meanx+=n.getX();
		    	meany+=n.getY();
		  		}
		  
		  if(!bv.isDrawingOverview())	
			  {
			  if(getLabel()!=null)
			  	{
				bv.textAlign(JProcessingPanel.CENTER);
				bv.textSize(lcs);
				Color c=bv.paleta[Overlapper.bicLabelColor];
	    		bv.fill(c.getRed(), c.getGreen(), c.getBlue(), 150);
				bv.text( ArrayUtils.chopArray(getLabel().toUpperCase(), 5, " "), meanx/clusterNodes.size(), lcs*labelDisplacement+(meany/clusterNodes.size()));  
			  	}
			  }
		}
	
	/**
	 * Draw all the nodes in the Cluster as pie charts.
	 */
	void drawPiecharts()
		{
		Overlapper bv=(Overlapper) myGraph.getApplet();
		final float env = 1.3f;
		float ns=bv.getNodeSize();
		bv.rectMode(JProcessingPanel.CENTER);
		
		for(int i=0;i<clusterNodes.size();i++)
		    {
			Node n=clusterNodes.get(i);
			if(!n.isDrawnAsPiechart() && n.shownClusters.size()>=bv.nodeThreshold)
				{
				if(bv.isDrawingOverview() || pointInScreen((GraphPoint2D)n.getPosition()))
					{
			    	float x=(float)n.getX();
			        float y=(float)n.getY();
			        float s=((ForcedNode)n).getSize();
			        float senv=s*env;
					 
			        
			        //Para saber qué porción de círculo toca;
			        float arc = Overlapper.TWO_PI / n.shownClusters.size();
				    //Para hacer un sector por grupo al que pertenece
			        int inter=0;
			        if(bv.isOnlyIntersecting())	inter=1;
			        if(n.shownClusters.size()>inter)
				        {
				        Iterator<Group> itDraw=n.shownClusters.values().iterator();
				        for (int j=0; itDraw.hasNext(); j++)
				           	{
				        	MaximalCluster c=(MaximalCluster)itDraw.next();
					    	GroupSet r = c.myResultSet;
					    	CustomColor col = r.myColor;
					    	bv.fill(col.getR(), col.getG(), col.getB(),100);
					    	bv.strokeWeight(ns/3);
					        bv.stroke(col.getR(), col.getG(), col.getB(), col.getA()+50);
					        
					        float arcj=arc*j;
					       
					        bv.arc(x, y, senv, senv, arcj, arc*(j+1));
					        
					        bv.stroke(255,255,255,255);
					        bv.strokeWeight(1);
						   	bv.line(x, y, (float)(x+ ns/2*Math.cos(arcj)), (float)(y+ ns/2*Math.sin(arcj)));		    
						    bv.fill(0,0,0,255);
				        	}
			        	}
			        
			        n.setDrawnAsPiechart(true);
				    }//if(punto en pantalla)
				}//if(no ha sido ya pintada la piechart)
		    }
		}
	
	/**
	 * Draws the labels of all the nodes in the Cluster
	 */
	void drawNodeLabels()
		{
		Overlapper bv=(Overlapper) myGraph.getApplet();
		int max=myGraph.maxZones;
		int min=1;
		
		int ls=bv.getLabelSize();
		float maxLs=bv.getMaxLabelSize();
		double step=0;
		if(max-min==0)	step=maxLs;
		else			step=(maxLs-ls)/(max-min);
	
		Color cg=bv.paleta[Overlapper.geneLabelColor];
    	Color cc=bv.paleta[Overlapper.conditionLabelColor];
    	Color cb=bv.paleta[Overlapper.nodeLabelBackgroundColor];
    	
		
		for(int i=0;i<clusterNodes.size();i++)
		    {
			Node n=clusterNodes.get(i);
			
			if(!n.isDrawnAsLabel() && n.clusters.size()>=bv.nodeThreshold)
			{
			if(!bv.isDrawingOverview())
			{
			if (n!=bv.g.getHoverNode() && !bv.g.getSelectedNodes().containsKey(n.getLabel()) && n.getImage().length()==0)
				{
			    bv.fill(labelColor.getR(), labelColor.getG(), labelColor.getB(), labelColor.getA());
			   
			    bv.fill(cb.getRed(),cb.getGreen(),cb.getBlue(),cb.getAlpha());
			    double tam=ls+step*n.getClusters().size();
		    	bv.textSize((int)tam);
		    	double finalTam=tam;
		    	if(bv.isAbsoluteLabelSize())	finalTam=ls;
	    		if(finalTam<0)	finalTam=0;
		    	bv.textSize((int)finalTam);
		    	
	        	if(n.isGene())	
	        		bv.fill(cg.getRed(), cg.getGreen(), cg.getBlue(), cg.getAlpha());
	        	else
	        		bv.fill(cc.getRed(), cc.getGreen(), cc.getBlue(), cc.getAlpha());
	        	
		    	bv.text(n.getLabel(), (float)Math.floor(n.getX()), (float)Math.floor(n.getY()-n.getHeight()));
		    	}
			n.setDrawnAsLabel(true);
		    }//if(punto en pantalla)
			}
		  }
		  bv.textSize(10);
		}
	
	/**
	 * Draws nodes as circles
	 */
	void drawNodes()//TODO: Ojo, esto va a ForcedNode.draw, que dibuja aparte de la forma los details
		{
		Overlapper bv=(Overlapper) myGraph.getApplet();
		for(int i=0;i<clusterNodes.size();i++)
		    {
			Node n=clusterNodes.get(i);
			if(n.label.contains("udp"))
				{
				}
			//if(n.clusters.size()>=bv.nodeThreshold && (bv.isDrawingOverview() || pointInScreen((GraphPoint2D)n.getPosition())))
			if(n.clusters.size()>=bv.nodeThreshold)
				{
				if(!n.isDrawn())		n.draw();
				}//if(punto en pantalla)
		
		    }
		}
	
	/**
	 * STILL UNDER DEVELOPMENT
	 *
	 */
	void drawDetails()
		{
		
		}

	/**
	 * STILL UNDER DEVELOPMENT
	 *
	 */
	void drawEdges()
		{
		return;
		}
	
	/**
	 * Draws the cluster
	 * @param drawHulls	If true, the wrapping hull is drawn
	 * @param drawNodes	If true, the included nodes are drawn
	 */
	  void draw (boolean drawHulls, boolean drawNodes)
	  		{
		  Overlapper bv=(Overlapper) myGraph.getApplet();
		  
		   float ns=bv.getNodeSize();
			  int ls=bv.getLabelSize();
			  int lcs=bv.getLabelClusterSize();
	     
		  final float env = 1.3f;
		  bv.fill(myResultSet.myColor.getR(), myResultSet.myColor.getG(), myResultSet.myColor.getB(), myResultSet.myColor.getA());
		 bv.stroke(myResultSet.myColor.getR(), myResultSet.myColor.getG(), myResultSet.myColor.getB(),255);
		  
		 if(group==null || group.length!=clusterNodes.size())	group=new GraphPoint2D[clusterNodes.size()];
		  
		  float meanx=0;
		  float meany=0;
		  
		  
		  //----------------------------- HULL DRAWING --------------------------
		  if(drawHulls)
		  {
		  boolean hullInScreen=false;
		  for (int i=0; i<clusterNodes.size(); i++) 
		  		{
		       Node n = (Node)clusterNodes.get(i);
		       if(!hullInScreen && !bv.isDrawingOverview() && pointInScreen((GraphPoint2D)n.getPosition()))	hullInScreen=true;
	           group[i] = convertRefFrame((GraphPoint2D)n.getPosition());
	           meanx+=n.getX();
	    	   meany+=n.getY();
		  		}
		  
		  
		  if(bv.isDrawingOverview() || hullInScreen)
		  {
		  if(bv.isDrawHull() && clusterNodes.size()>1)
			  {
			  presort(group);
			  
			  ArrayList<GraphPoint2D> groupHull;
			  //No funciona para un hull de menos de 3 elementos
			  //groupHull = simpleHull_2D(group, clusterNodes.size());
			  
			  groupHull = chainHull_2D(group, clusterNodes.size());
			  
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
		  if(bv.isDrawingOverview() || hullInScreen)
		  {
		  if(bv.isDrawClusterLabels()&& getLabel()!=null)
		  	{
			bv.textAlign(JProcessingPanel.CENTER);
			//bv.textSize(ls*3);
			bv.textSize(lcs);
			Color c=bv.paleta[Overlapper.bicLabelColor];
    		bv.fill(c.getRed(), c.getGreen(), c.getBlue(), 150);
			
			//bv.fill(bv.paleta[bv.colorTitle].getRed(), bv.paleta[bv.colorTitle].getGreen(), bv.paleta[bv.colorTitle].getBlue(), 150);
		    bv.text(getLabel().toUpperCase(), meanx/clusterNodes.size(), meany/clusterNodes.size());  
		  	}
		  }
		  }//if(drawHulls)
		  
		  //------------------ DRAW NODES ---------------------------
		  if(drawNodes)
		  {
		  for(int i=0;i<clusterNodes.size();i++)
		    {
			Node n=clusterNodes.get(i);
			if(bv.isDrawingOverview() || pointInScreen((GraphPoint2D)n.getPosition()))
			{
			if(!n.isDrawn())
				{
		        if(bv.isDrawPiecharts())
			        {
		        	float x=(float)n.getX();
			        float y=(float)n.getY();
			        float s=((ForcedNode)n).getSize();
			        float senv=s*env;
					 
			        
			        //Para saber qué porción de círculo toca;
			        float arc = Overlapper.TWO_PI / n.getClusters().size();
				    //Para hacer un sector por grupo al que pertenece
			        int inter=0;
			        if(bv.isOnlyIntersecting())	inter=1;
			        if(n.getClusters().size()>inter)
			        	{
				        Iterator<Group> itDraw=n.getClusters().values().iterator();
				        for (int j=0; itDraw.hasNext(); j++)
				           	{
				        	MaximalCluster c=(MaximalCluster)itDraw.next();
					    	GroupSet r = c.myResultSet;
					    	CustomColor col = r.myColor;
					    	bv.rectMode(JProcessingPanel.CENTER);
					    	bv.fill(col.getR(), col.getG(), col.getB(),100);
					    	bv.strokeWeight(ns/3);
					        bv.stroke(col.getR(), col.getG(), col.getB(), col.getA()+50);
					        
					        float arcj=arc*j;
					       
					        System.out.print("Dibujo arco centrado en "+x+", "+y);
					        bv.arc(x, y, senv, senv, arcj, arc*(j+1));
					        
					        bv.stroke(255,255,255,255);
					        bv.strokeWeight(1);
						   	bv.line(x, y, (float)(x+ ns/2*Math.cos(arcj)), (float)(y+ ns/2*Math.sin(arcj)));		    
						    bv.fill(0,0,0,255);
						    }
			        	}
			        }
			    if (bv.isShowLabel() && n!=bv.g.getHoverNode() && !bv.g.getSelectedNodes().containsKey(n.getLabel()) && n.getDetails().length()==0 && n.getImage().length()==0)
			    	{
			    	bv.fill(labelColor.getR(), labelColor.getG(), labelColor.getB(), labelColor.getA());
			    		{
			    		bv.fill(0,0,0,255);
			    		if(ls+n.getClusters().size()*2>20)		bv.textSize(20);
			    		else									bv.textSize(ls+n.getClusters().size()*2); 
			        	bv.text(n.getLabel(), (float)(n.getX()+0.5), (float)(n.getY()-n.getHeight()+0.5));

			        	
			        	if(n.isGene())	bv.fill(195, 250, 190, 255);
			        	else			bv.fill(165, 175, 250, 255);	

			    		if(bv.isAbsoluteLabelSize())	bv.textSize(ls);
			    		else						
			    			{
				    		if(ls+n.getClusters().size()*2>20)		bv.textSize(20);
				    		else									bv.textSize(ls+n.getClusters().size()*2);
			    			}
			    		}
		        	bv.text(n.getLabel(), (float)n.getX(), (float)n.getY()-n.getHeight());
			    	}
			    
			    //Finalmente pintamos el nodo en sí
			    ((ForcedNode)n).draw();

				}
		    }//if(punto en pantalla)
		    }
		  }
		  bv.textSize(10);
	  }
	  
	  /**
	   * For each other node in the cluster, an edge is added from n to it.
	   * @param n - node to which attach new edges
	   */
	  void buildEdges(Node n){
	  	Overlapper bv= (Overlapper)myGraph.getApplet();
		    for (int i=0; i<clusterNodes.size(); i++) {
		       Node m = (Node)clusterNodes.get(i);
			      
		       SpringEdge e1=alreadyConnected(n,m);
		       if (e1!=null)
		       		{
		    	   	e1.setNaturalLength(e1.getNaturalLength()*0.8);
		    	    if(e1.getStiffness()>0.02)
		    	    	; //System.out.println("Estamos en "+e1.getStiffness()+" entre "+n.label+" y "+m.label);
		    	    else	e1.setStiffness(e1.getStiffness()*1.2);
		    	    //System.out.println(e1.getStiffness());
		    	   }
		       else
		       		{
		    	   if(n!=m)
		    	   		{
		    	        SpringEdge e = new SpringEdge(n, m);
		 	       		e.setNaturalLength(bv.getEdgeLength());
		 	       		e.setStiffness(bv.getStiffness());
		    	     	myResultSet.myGraph.addEdge(e);
		    	   		}
		       		}
		       
		       }
	  }

	
	//------------ getters and setters -----
	/**
	 * Sets the graph in which this cluster is to be drawn
	 * @param h the graph
	 */
	public void setGraph(Graph h) {
        myGraph = h;
      }
    
	/**
	 * Sets the ClusterSet in which this node is
	 * @param rs	the ClusterSet
	 */
    public void setClusterSet(GroupSet rs) {
        myResultSet = rs;
	      }
    
    /**
     * Returns the ClusterSet in which this node is
     * @return	the ClusterSet
     */
    public GroupSet getClusterSet() {
		return myResultSet;
	}
	
    /**
     * Removes all nodes in the cluster
     *
     */
	public void removeNodes()
		{
		clusterNodes.clear();
		}
	
	/**
	 * Gets the cluster's name
	 * @return	String with the cluster's label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * Sets the cluster's name
	 * @param label	String with the cluster's name
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * Returns the order of the cluster, in the case of initial ordering of cluster for a better layour
	 * STILL IN DEVELOPMENT
	 */
	public int getOrder() {
		return order;
	}

	
	/**
	 * Sets the order of the cluster, in the case of initial ordering of cluster for a better layour
	 * STILL IN DEVELOPMENT
	 */
	public void setOrder(int order) {
		this.order = order;
	}


	/**
	 * Gets the color used for labelling cluster names
	 * @return color used for labelling cluster names
	 */
	public CustomColor getLabelColor() {
		return labelColor;
	}

	
	/**
	 * Sets the color used for labelling cluster names
	 * @param labelColor color used for labelling cluster names
	 */
	public void setLabelColor(CustomColor labelColor) {
		this.labelColor = labelColor;
	}
	 
	/**
	 * Gets the nodes grouped in this cluster
	 * @return	nodes grouped in this cluster
	 */
	ArrayList<Node> getNodes() {
		    return clusterNodes;
		  }
	
	/**
	 * Get the nodes grouped in this cluster at position i
	 * @param pos	postion of the node requested. Position is detemined by the order in which the nodes are added
	 * @return	a node grouped in this cluster
	 */
	ForcedNode getNode(int pos) {
		    return (ForcedNode)clusterNodes.get(pos);
		  }
	 
	  //-------------- UTILS FOR CLUSTER DRAWING ------------
	  /**
	   * Returns the center of the cluster, computed as the mean of each cluster node's coordinates
	   * returns	point with the coordinates of the middle point
	   */
	  public Point2D.Double getMiddlePoint()
	  	{
		float meanx=0;
		float meany=0;
		
		for (int i=0; i<clusterNodes.size(); i++) 
			{
			Node n = (Node)clusterNodes.get(i);
			meanx+=n.getX();
			meany+=n.getY();
			}
		return new Point2D.Double(meanx/clusterNodes.size(), meany/clusterNodes.size());
	  	}
	  
	    /**
	     * Computes the wrapping hull by using Melkman algorithm
	     * @param V
	     * @param n
	     * @return
	     */
	    protected ArrayList<GraphPoint2D> simpleHull_2D(GraphPoint2D V[], int n)
	    {
	        // initialize a deque D[] from bottom to top so that the
	        // 1st three vertices of V[] are a counterclockwise triangle
	  	  
	        
	  	  GraphPoint2D D[] = new GraphPoint2D[2*n+1];
	  	  
	  	  int bot = n-2, top = bot+3;   // initial bottom and top deque indices
	  	    D[bot] = D[top] = V[2];       // 3rd vertex is at both bot and top
	  	    if (isLeft(V[0], V[1], V[2]) > 0) {
	  	        D[bot+1] = V[0];
	  	        D[bot+2] = V[1];          // ccw vertices are: 2,0,1,2
	  	    }
	  	    else {
	  	        D[bot+1] = V[1];
	  	        D[bot+2] = V[0];          // ccw vertices are: 2,1,0,2
	  	    }
	       
	  	    // compute the hull on the deque D[]
	  	    for (int i=3; i < n; i++) {   // process the rest of vertices
	  	        // test if next vertex is inside the deque hull
	  	        if ((isLeft(D[bot], D[bot+1], V[i]) > 0) &&
	  	            (isLeft(D[top-1], D[top], V[i]) > 0) )
	  	             continue;// skip an interior vertex
	  	        
	  	        // incrementally add an exterior vertex to the deque hull
	  	        // get the rightmost tangent at the deque bot
	  	        while (isLeft(D[bot], D[bot+1], V[i]) <= 0)
	  	            ++bot;                // remove bot of deque
	  	        D[--bot] = V[i];          // insert V[i] at bot of deque
	  	      
	  	        // get the leftmost tangent at the deque top
	  	        while (isLeft(D[top-1], D[top], V[i]) <= 0)
	  	            --top;                // pop top of deque
	  	        D[++top] = V[i];          // push V[i] onto top of deque
	  	       
	  	    }


	        // transcribe deque D[] to the output hull array H[]
	        // h hull vertex counter
	        ArrayList<GraphPoint2D> hull = new ArrayList<GraphPoint2D>((top-bot)+1);
	        for (int h=0; h <= (top-bot); h++)
	            hull.add(D[bot + h]);

	      
	        return hull;
	    }
	   
	protected ArrayList<GraphPoint2D> chainHull_2D( GraphPoint2D P[], int n)
	    {
		    GraphPoint2D Hu[] = new GraphPoint2D[2*n];
		    int realSize = n;
	        // the output array H[] will be used as the stack
	        int    bot=0, top=(-1);  // indices for bottom and top of the stack
	        int    i;                // array scan index

	        // Get the indices of points with min x-coord and min|max y-coord
	        int minmin = 0, minmax;
	        double xmin = P[0].getX();
	        for (i=1; i<n; i++)
	            if (P[i].getX() != xmin) break;
	        minmax = i-1;
	        if (minmax == n-1) {       // degenerate case: all x-coords == xmin
	            Hu[++top] = P[minmin];
	            if (P[minmax].getY() != P[minmin].getY()) // a nontrivial segment
	                Hu[++top] = P[minmax];
	            Hu[++top] = P[minmin];           // add polygon endpoint
	            //realSize = top + 1;
	        }

	        // Get the indices of points with max x-coord and min|max y-coord
	        int maxmin, maxmax = n-1;
	        double xmax = P[n-1].getX();

	        for (i=n-2; i>=0; i--)
	            if (P[i].getX() != xmax) break;
	        maxmin = i+1;

	        // Compute the lower hull on the stack H
	        Hu[++top] = P[minmin];      // push minmin point onto stack
	        i = minmax;
	        while (++i <= maxmin)
	        {
	            // the lower line joins P[minmin] with P[maxmin]
	            if (isLeft( P[minmin], P[maxmin], P[i]) >= 0 && i < maxmin)
	                continue;          // ignore P[i] above or on the lower line

	            while (top > 0)        // there are at least 2 points on the stack
	            {
	                // test if P[i] is left of the line at the stack top
	                if (isLeft( Hu[top-1], Hu[top], P[i]) > 0)
	                    break;         // P[i] is a new hull vertex
	                else
	                    top--;         // pop top point off stack
	            }
	            Hu[++top] = P[i];       // push P[i] onto stack
	        }

	        // Next, compute the upper hull on the stack H above the bottom hull
	        if (maxmax != maxmin)      // if distinct xmax points
	            Hu[++top] = P[maxmax];  // push maxmax point onto stack
	        bot = top;                 // the bottom point of the upper hull stack
	        i = maxmin;
	        while (--i >= minmax)
	        {
	            // the upper line joins P[maxmax] with P[minmax]
	            if (isLeft( P[maxmax], P[minmax], P[i]) >= 0 && i > minmax)
	                continue;          // ignore P[i] below or on the upper line

	            while (top > bot)    // at least 2 points on the upper stack
	            {
	                // test if P[i] is left of the line at the stack top
	                if (isLeft( Hu[top-1], Hu[top], P[i]) > 0)
	                    break;         // P[i] is a new hull vertex
	                else
	                    top--;         // pop top point off stack
	            }
	            Hu[++top] = P[i];       // push P[i] onto stack
	        }
	        if (minmax != minmin)
	            Hu[++top] = P[minmin];  // push joining endpoint onto stack

	        realSize = top + 1;
	        //ArrayList<GraphPoint2D> hull = new ArrayList<GraphPoint2D>(Hu.length);
	        ArrayList<GraphPoint2D> hull = new ArrayList<GraphPoint2D>();
	        double mX=0;
	        double mY=0;
	        for (int h=0; h < realSize; h++)
	        	{
	        	mY+=Hu[h].y;
	        	mX+=Hu[h].x;
	        	hull.add(Hu[h]);
	        	}
	        mY/=hull.size();
	        mX/=hull.size();
	        

	      //Add additional points among very distant ones
	        GraphPoint2D pant=hull.get(0);
	        GraphPoint2D p=null;
	        for(i=1;i<hull.size();i++)
	        	{
	        	p=hull.get(i);
	        	double d=Point2D.Double.distance(p.x, p.y, pant.x, pant.y);
	        	if(d>100)
	        		{
	        		Line ml=new Line(mX, mY, (p.x+pant.x)/2, (p.y+pant.y)/2);
		        	Point2D.Double ap=ml.getProlongationPoint(20);
		        	hull.add(i,new GraphPoint2D(ap.x,ap.y));
	        		}
	        	pant=p;	
	        	}
	        return hull;
	    }

	    
	  /**
	   * Método auxiliar para indicar si 
	   * un punto está Left|On|Right de una línea infinita.
	   * Usa http://softsurfer.com/Archive/algorithm_0101/algorithm_0101.htm
	   * @param P0
	   * @param P1
	   * @param P2
	   * @return >0 for P2 left of the line through P0 and P1, =0 for P2 on the line, <0 for P2 right of the line

	   */  
	    private double isLeft( GraphPoint2D P0, GraphPoint2D P1, GraphPoint2D P2 )
	    {
	    	double res;
	    	res = (P1.getX() - P0.getX()) * (P2.getY() - P0.getY());
	    	res = res - ((P2.getX() - P0.getX()) * (P1.getY() - P0.getY())); 
	    	return res; 
	    }

	    /**
	     * Returns true if Edge e is in this Cluster
	     * @param e 
	     * @return true if Edge e is in this Cluster
	     */
	    public boolean alreadyConnected(Edge e)
	    {
	    	
	    	for (int i = 0; i < myGraph.getEdges().size(); i++)
	    	  {
	    		Edge f = (Edge) myGraph.getEdges().get(i);
	    		if (e.getFrom() == f.getFrom() &&
	    		    e.getTo() == f.getTo())
	    			return true;
	    	  }
	    	
	        return false;        
	    }

	    /**
	     * Returns the edge connecting n and m (despite the direction), or null if it does not exist
	     * @param n	Node to see if it's connected by any edge with m
	     * @param m	Node to see if its's connected by any edge with n
	     * @return	the edge connecting n and m, or null if no edge connects them
	     */
	    protected final SpringEdge alreadyConnected(Node n, Node m)
	    	{
	    	SpringEdge ret=(SpringEdge)myGraph.getEdges().get(n.getLabel()+"->"+m.getLabel());	//MIramos a ver si está en un sentido
	    	if(ret==null)	ret=(SpringEdge)myGraph.getEdges().get(m.getLabel()+"->"+n.getLabel());//O en el otro
	    	return ret; //Devolvemos n->m, m->n o null si no está.
	    	}

	    protected GraphPoint2D convertRefFrame(GraphPoint2D p)
	    	{
	    	Overlapper bv=(Overlapper)myGraph.getApplet();
	    	return (new GraphPoint2D(p.getX(), bv.getScreenHeight() - p.getY()));        
	    	}
	   
	    /**
	     * Orders vectors
	     * @param dataSet
	     */
	    protected void presort(GraphPoint2D dataSet[])
	    {
	    try{
		int j = 0;
		boolean exchanged;
		
		do 
			{
			exchanged = false;
			for (int i = 1; i < dataSet.length - j; i++)
				{
				if (dataSet[i].getX() < dataSet[i-1].getX())
				//if (dataSet[i].getY() <= dataSet[i-1].getY())
						{ 
					   double tmpX, tmpY;
					   
					   tmpX = dataSet[i-1].getX();
					   dataSet[i-1].setX(dataSet[i].getX());
					   dataSet[i].setX(tmpX);
					   
					   tmpY = dataSet[i-1].getY();
					   dataSet[i-1].setY(dataSet[i].getY());
					   dataSet[i].setY(tmpY);
					   
					   exchanged = true;
				    //}//if
					}//if	
				} //for
				
			j++;
			}while(exchanged == true);
	    }catch(Exception e)
	    	{
	    	e.printStackTrace();
	    	}
	    }
	    
	protected boolean pointInScreen(GraphPoint2D point)
		{
		Overlapper bv=(Overlapper) myGraph.getApplet();
		float x=-bv.getOffsetX();
		float y=-bv.getOffsetY();
		float w=bv.getScreenWidth();//bv.zoomFactor;
		float h=bv.getScreenHeight();//bv.zoomFactor;
		if(point.getX()>x && point.getX()<(x+w) && point.getY()>y && point.getY()<(y+h))	return true;
		else																				return false;
		}
	
	/**
	 * Returns the number of nodes that are in both clusters
	 * @param c The cluster with which compare
	 * @return The number of nodes that c and this cluster have in common
	 */
	public int nodesInCommon(Group c)
		{
		int ret=0;
		for(int i=0;i<this.clusterNodes.size();i++)
			{
			Node n=clusterNodes.get(i);
			if(n.clusters.containsKey(c.label))	ret++;
			}
		return ret;
		}
	}
