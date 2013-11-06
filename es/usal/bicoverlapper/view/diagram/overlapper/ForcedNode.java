package es.usal.bicoverlapper.view.diagram.overlapper;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

import es.usal.bicoverlapper.model.geometry.GraphPoint2D;
import es.usal.bicoverlapper.utils.color.CustomColor;

/**
 * Force directed nodes. A ForcedNode is a Node to which different forces can be applied to modify its position
 * @author Roberto Therón and Rodrigo Santamaría
 *
 */
public class ForcedNode extends Node {
  GraphPoint2D f;
  float mass = 1;
  
  /**
   * Builds a ForcedNode at starting position v
   * @param v	Initial position as (x,y)
   */
  public ForcedNode(GraphPoint2D v) {
	    super(v);
	    f=new GraphPoint2D(v.getX(), v.getY());
	    height = 20;
	    width = 20;
	  }
  
  /**
   * Builds a ForcedNode in Graph g at starting position v
   * @param g	Graph for this node
   * @param v	Starting position for this node
   * 
   */
  public ForcedNode(Graph g, GraphPoint2D v) {
	    super(g, v);
	    f=new GraphPoint2D(v.getX(), v.getY());
	    height = 20;
	    width = 20;
	  }
	  
  /**
   * Returns the mass of the ForcedNode. Some kind of forces, as gravitational forces, can have the mass of a node as a parameter to use
   * TODO: By now, this parameter is not being used to compute forces (all nodes have mass 1)
   * @return the mass of the ForcedNode.
   */
  public float getMass() {
    return mass;
  }
  
  /**
   * Sets the mass of the ForcedNode. Some kind of forces, as gravitational forces, can have the mass of a node as a parameter to use
   * @param	m the mass of the ForcedNode.
   */
  public void setMass(double m) {
  
	mass = (float)m;  
  }
  
  /**
   * Sets the force applied to it as a point v (the new position at which this node must be with the force applied)
   * @param v	the position at which this node must be with the force applied
   */
  public void setForce(GraphPoint2D v) {
		  f.setX(v.getX());
		  f.setY(v.getY());
	  }
  
  /**
   * Sets the force applied to it as the point (x,y), the new position at which this node must be with the force applied
   * @param x	x coordinate of the position at which this node must be with the force applied
   * @param y	y coordinate of the position at which this node must be with the force applied
   */
  public void setForce(double x, double y) {
	      f.setX(x);
		  f.setY(y);
	  }
 
  /**
   * Sets the size of the node, in pixels
   * @param x size of the node, in pixels
   */
  public void setSize(float x) {
	    height = width = x;
	  }
 
  /**
   * Gets the size of the node, in pixels
   * @return size of the node, in pixels
   */
  public float getSize() {
	    return height;
	  }
  
  /**
   * Returns the force applied to it as the point at which this node must be with the force applied
   * @return the point at which this node must be with the force applied
   */
  public GraphPoint2D getForce() {
    return f;
  }
  
  /**
   * Adds a force to the current total force applied to the node
   * @param v	position that the node must have if this force alone applies to it
   */
  public void applyForce(GraphPoint2D v) {
	  f.add(v);
  }
  
  /**
   * Draw the node as a circle if it is a gene, or as a square if it is a condition.
   * The node is only draw if node.isDrawn() is set to false
   */
  public void draw() 
  	{
    Overlapper p=(Overlapper)g.getApplet();
    if(!p.isDrawNodes() || this.isDrawn())
    	if(!centerNode && p.nodeThreshold>this.clusters.size())
    		return;
    
    int factor=1;
    if(p.isSizeRelevant())    	factor=this.clusters.size();
        
    p.noFill();
	Color c=p.paleta[Overlapper.foregroundColor];
	p.stroke(c.getRed(),c.getGreen(),c.getBlue(),128);
	p.strokeWeight(2);
    p.rectMode(Overlapper.CENTER);

   	if(isGene())	p.ellipse((float) getX(), (float) getY(), width*factor, height*factor);
	else			p.rect((float) getX(), (float) getY(), width*factor, height*factor);
    float x0=0,y0=0,w=0,h=0;
    
  	p.fill(50,50,50,100);
    if(image.length()>0)
    	{
    	p.rectMode(JProcessingPanel.CORNER);
    	if(details.length()>0) 
    		{
    		x0=(float)getX()-5*label.length()-5;
    		y0=(float)getY()+5*factor;
    		w=90+(float)maxChars*5;
    		h=(float)100;
    		}
    	else
    		{
    		x0=(float)getX()-5*label.length()-5;
    		y0=(float)getY()+5*factor;
    		w=(float)80;
    		h=(float)100;
    		}
    	}
    else if(details.length()>0)   	
    	{
    	p.rectMode(JProcessingPanel.CORNER);
    	x0=(float)getX();
    	y0=(float)(int)getY();
    	w=10+(float)maxChars*5;
    	h=(float)(numLines*10.2)+4;
    	}
	p.rect(x0,y0,w,h);
    	
    if(image.length()>0)    
    	{
    	p.image(pimage, (int)x0+5, (int)y0+5, 60, 90);
    	}
    if(details.length()>0)	
    	{
    	p.textAlign(Overlapper.LEFT);
    	p.textSize(9);
    	p.fill(255,255,255,255);
    	p.stroke(1);
    	p.text(details, (int)x0+5, (int)y0+10);
    	p.textAlign(Overlapper.CENTER);
    	}
   this.setDrawn(true);
  }
  
  //Método mejorado para dibujar piecharts
  public void drawPie()
	{
	Overlapper bv=(Overlapper)g.getApplet();
	//final float env = 1.3f;
	float ns=bv.getNodeSize();
	int env=1;
	if(bv.isSizeRelevant())    	env=this.clusters.size();
	 	
	if(!isDrawnAsPiechart() && shownClusters.size()>=bv.nodeThreshold)
		{
		float x=(float)getX();
        float y=(float)getY();
        float s=getSize();
        float senv=s*env;
        
        
        //Para saber qué porción de círculo toca;
        float step = Overlapper.TWO_PI / shownClusters.size();
	    //Para hacer un sector por grupo al que pertenece
        int inter=0;
        if(bv.isOnlyIntersecting())	inter=1;
        if(shownClusters.size()>inter)
	        {
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
		        
		        //bv.arc((float)(x+.5), (float)(y+.5), senv, senv, init, end);//TODO: no sé por qué los arcos no me salen bien centrados, sol temp. poner el +1
		        bv.arc(x, y, width*env, height*env, init, end);//TODO: no sé por qué los arcos no me salen bien centrados, sol temp. poner el +1
		        for(int j=0;j<sizes.get(i);j++)		init+=step;
		        }
	        for(int i=0;i<colors.size();i++)
	        	{
	        	bv.rectMode(JProcessingPanel.CENTER);
	            bv.stroke(255,255,255,255);
		        bv.strokeWeight(1);
		        for(int j=0;j<sizes.get(i);j++)
			        {
				   float x2=(x+(float)(width*env/2*Math.cos(init)));
		        	float y2=(y+ (float)(height*env/2*Math.sin(init)));
		        	bv.line(x, y, x2, y2);
				   	init+=step;
			        }
				bv.fill(0,0,0,255);
		    	}
		  	}
        setDrawnAsPiechart(true);
		}//if(no ha sido ya pintada la piechart)
	}

}
