package es.usal.bicoverlapper.view.diagram.overlapper;

import es.usal.bicoverlapper.model.geometry.GraphPoint2D;

/**
 * SpringEdge implements elastic edges. Elastic edges tend to a natural length and apply an (attractive or repulsive) lineal force
 * (greater with distance to its natural length) to the nodes it connects when not in it.
 * @author Roberto Theron and Rodrigo Santamaría
 *
 */
public class SpringEdge extends Edge {
	double k;//stiffness
	double nl;//natural length.
	GraphPoint2D nullVector=null;
	GraphPoint2D forceFrom=null;
	GraphPoint2D forceTo=null;
	
	double kf=1;//Factor for stiffness if not equal (in prove)
	double kt=1;
	  
   public SpringEdge()
   	{
	   super();
   	} 
  //This edge subclass applies a spring force between the two nodes it connects
  //The spring force formula is F = k(currentLength-nl)
  //This equation is one-dimensional, and applies to the straight line
  //between the two nodes.
	  /**
	   * Builds a spring edge
	   * @param a	source node
	   * @param b	target node
	   */
  public SpringEdge(Node a, Node b) {
		  super(a, b);
		  nullVector=new GraphPoint2D(0,0);
			forceFrom=new GraphPoint2D();
			forceTo=new GraphPoint2D();
	  }
  
  public SpringEdge(Node a, Node b, Graph graph, double length, double stiffness)
  	{
	super(a, b);  
    nullVector=new GraphPoint2D(0,0);
	forceFrom=new GraphPoint2D();
	forceTo=new GraphPoint2D();
	
	g=graph;
	k=stiffness;
	nl=length;
  	}
  
  /**
   * Sets the natural length of the spring. At this length the force that the edge applies to the connecting
   * nodes is zero
   * @param l	natural length of the spring
   */
  public void setNaturalLength(double l) 
  	{
    /*if (l > 10)
	  nl = l;
    else
      nl = 10;
      */
	if(l>=(this.to.width+this.from.width)) nl = l;
	//else	System.err.println("Error: spring length must greater than the size of the nodes");
  	}
  
  /**
   * Returns the natural length of the SpringEdge
   * @return the natural length of the SpringEdge
   */
  public double getNaturalLength() {
    return nl;
  }
  
  /**
   * Sets the stiffeness of the spring. The higher the stiffness, the higher the force applied to nodes when not
   * at the natural length
   * @param s	Stiffness of the spring (determines the force in which the spring tries to return to its natural length)
   */
  public void setStiffness(double s) {
	    k = s;
	  }
  
  public double getStiffness() {
	    return k;
	  }
  
  /**
   * Returns the force applied by the edge to the target node
   * @return	The point in which the node should be if only this force is applied to it
   */
  public GraphPoint2D getForceTo() {
	  Overlapper bv=(Overlapper)g.getApplet();
	    double dx = dX();
	    double dy = dY();
	    double l = Math.sqrt((float) (dx*dx + dy*dy));
	    k = bv.getStiffness();//TODO: mejor que cuando cambie se reactualice en todas las aristas y así no haya que rebuscarlo siempre con llamadas no?
		 k=k*kt;
	    
		nl = bv.getEdgeLength();//El nl se cambia con el handle, y así no vamos a permitir el cambio!
	    	    
	    double f = k*(l-nl);
	    
	    forceTo.setX(-f*dx/l);
		forceTo.setY(-f*dy/l);
	     
		//forceTo.setX(-f*dx);
		//forceTo.setY(-f*dy);
		return forceTo;
		
	  }
  /**
   * Returns the force applied by the edge to the source node 
   * (it will have the same magnitude an opposite direction
   * to the force applied to the target node
   * @return	The point in which the node should be if only this force is applied to it
   */
    public GraphPoint2D getForceFrom() 
	  	{  
		double dx = dX();
	    double dy = dY();
	    double l = Math.sqrt((float) (dx*dx + dy*dy));

	    Overlapper bv=(Overlapper)g.getApplet();
	    
	   // k = bv.getStiffness();
    	
	    k=k*kf;
	    //nl = bv.getEdgeLength();
		double f = k*(l-nl);
		if(l>0)
			{
			forceFrom.setX(f*dx/l);
			forceFrom.setY(f*dy/l);
			}
		else 
			{
			forceFrom.setX(0);//1
			forceFrom.setY(0);
			//System.out.print("0");
			//System.out.println("l es cero!!!----------------------");
			}
		//forceFrom.setX(f*dx);
		//forceFrom.setY(f*dy);
		
		return forceFrom;
	  }
    
    
    /**
     * Sugiyama force for horizontal dummy edges
     */
      public GraphPoint2D getSugiyamaForceS7() 
  	  	{  
  		double dx = dX();
  	    double dy = dY();
  	    double l = Math.sqrt((float) (dx*dx + dy*dy));
   	    double f = k*Math.log(l/nl);
  		forceFrom.setX(f*dx);		
  		forceFrom.setY(f*dy);	
		return forceFrom;
  	  }
      
      /**
       * Sugiyama force for vertical dummy edges
       */
        public GraphPoint2D getSugiyamaForceS8() 
    	  	{  
    		double dx = dX();
    	    double dy = dY();
    	    double l = Math.sqrt((float) (dx*dx + dy*dy));
     	    double f = k*Math.log(l/nl);
    	    forceFrom.setX(f*dx);		
    	    forceFrom.setY(f*dy);	
    	    return forceFrom;
    	    }
     	   
        
        /**
         * Sugiyama spring force between center dummy nodes and exclusive group nodes
         */
          public GraphPoint2D getSugiyamaForceS5() 
      	  	{  
      		double dx = dX();
      	    double dy = dY();
      	    double l = Math.sqrt((float) (dx*dx + dy*dy));
       	    double f = k*Math.log(l/nl);
      		forceFrom.setX(f*dx);
      		forceFrom.setY(f*dy);	
       	    return forceFrom;
      	  }
          
          
          /**
           * Sugiyama attraction force between vertex dummy nodes and intersection group nodes
           */
            public GraphPoint2D getSugiyamaForceA1() 
        	  	{  
        		double dx = dX();
        	    double dy = dY();
        	    double l = Math.sqrt((float) (dx*dx + dy*dy));
         	    double f = k*l;
        		//if(l<nl)	{	forceFrom.setX(f*dx/l);		forceFrom.setY(f*dy/l);	}
         	   	forceFrom.setX(f*dx);		
         	   	forceFrom.setY(f*dy);	
         	   	return forceFrom;
         	   
        	  }
            
            /**
             * Sugiyama attraction force between vertex dummy nodes and center dummy node
             */
              public GraphPoint2D getSugiyamaForceA2() 
          	  	{  
          		double dx = dX();
          	    double dy = dY();
          	    double l = Math.sqrt((float) (dx*dx + dy*dy));
           	    double f = k*l;
          		if(l>0)	{	forceFrom.setX(f*dx/l);		forceFrom.setY(f*dy/l);	}
          		else		System.out.println("l es cero en A2!!!----------------------");
          		return forceFrom;
          	  }
            
            //NOTE:!!! these last two are not really edges!!!
            /**
             * Sugiyama repulsion force between nodes in different groups
             * or between a dummy center node and a node in a different group
             */
              public GraphPoint2D getSugiyamaForceR1() 
          	  	{  
          		double dx = dX();
          	    double dy = dY();
          	    double l = Math.sqrt((float) (dx*dx + dy*dy));
          	    double f=0;
           	    if(l<nl)	f = -k*l;
           	    
           	    if(l>0)	{	forceFrom.setX(f*dx/l);		forceFrom.setY(f*dy/l);	}
          		else		System.out.println("l es cero en R1!!!----------------------");
          		return forceFrom;
          	  }     
              /**
               * Sugiyama repulsion force between center dummy nodes
               */
                public GraphPoint2D getSugiyamaForceR2() 
            	  	{  
            		double dx = dX();
            	    double dy = dY();
            	    double l = Math.sqrt((float) (dx*dx + dy*dy));
            	    double f=0;
            	    
             	    if(l<nl)	f = -k*l;
             	    
             	    if(l>0)	{	forceFrom.setX(f*dx/l);		forceFrom.setY(f*dy/l);	}
            		else		System.out.println("l es cero en R2!!!----------------------");
            		return forceFrom;
            	  }

    /**
     * Returns the force applied by the edge to the source dual node 
     * (it will have the same magnitude an opposite direction
     * to the force applied to the target node)
     * It is identical to getForceFrom, but now nl and k are not checked from Overlapper natural lenght /stiffness constant value, so it must be
     * set to each dual edge.
     * @return	The point in which the node should be if only this force is applied to it
     */
      public GraphPoint2D getDualForceFrom() 
  	  	{
  		double dx = dX();
  	    double dy = dY();
  	    double l = Math.sqrt((float) (dx*dx + dy*dy));

  	    Overlapper bv=(Overlapper)g.getApplet();
  	    
  	   // k = bv.getStiffness();
  	  	
  	    k=k*kf;
  	   // nl = bv.getEdgeLength();
  		double f = k*(l-nl);

  		if(l>0)
  			{
  			forceFrom.setX(f*dx/l);
  			forceFrom.setY(f*dy/l);
  			}
  		else
  			{
  			forceFrom.setX(0);
  			forceFrom.setY(0);
  			System.out.println("l es cero!!!----------------------");
  			}
  		
  		return forceFrom;
  	   }

    
/*
public double getKf() {
	return kf;
}

public void setKf(double kf) {
	this.kf = kf;
}

public double getKt() {
	return kt;
}

public void setKt(double kt) {
	this.kt = kt;
}
 */
}