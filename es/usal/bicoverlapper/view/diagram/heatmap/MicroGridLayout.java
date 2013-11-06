package es.usal.bicoverlapper.view.diagram.heatmap;

import java.util.Iterator;

import prefuse.action.layout.Layout;
import prefuse.data.expression.Predicate;
import prefuse.data.expression.parser.ExpressionParser;
import prefuse.data.tuple.TupleSet;
import prefuse.data.util.Sort;
import prefuse.visual.VisualItem;

/**
 * Class that displays all VisualItems in a grid. 
 * 
 */
class MicroGridLayout extends Layout {
    private double cellHeight;
    private double cellWidth;
    private int n;//total number of genes and conditions
    private int ntot;
    private int m;
   // private static final int maxLines=2000;
    
    private String grupo;//prefuse table group on which operations are made
   // private Double scale;//substituted by distortion factors
    public static double maxDistortion=0.7;//maximum area, in percentage, devoted to distortion
    public int[] geneOrder;//order in which genes and conditions must be laid out
    //public HashMap<Integer, Integer> geneOrder;
    public int[] conditionOrder;//The actual order after reordering by bicluster selection, etc.
    public int[] initialConditionOrder;//The initial order, usually 1...M but it could change if the columns are sorted
    public int[] hoverGenes, hoverConditions;
    private String colField;//prefuse table colum field names for row and column ids
    private String rowField;
    private int xMargin;//margin to start layout
    private int yMargin;
    private int rowSelected;//number of rows/columns selected
    private int colSelected;
    private int rowHovered;//number of rows/columns hovered
    private int colHovered;
    private double mx;//distortion factors
    private double my;
    private double height;
    private double width;
    
    public String name;
    
    /**
     * Constructs the layout
     * @param group		group in which VisualItems are
     * @param numRows	number of rows for the grid	
     * @param numCols	number of columns for the grid
     * @param height	height in pixels of the grid
     * @param width		width in pixels of the grid
     * @param rowName	field name in the items for the int identifier of its row
     * @param colName	field name in the items for the int identifier of its column
     * @param xMargin	x coordinate of the top-left square of the layout
     * @param yMargin	y coordinate of the top-left square of the layout
     * @param mx		factor for distortion of width	
     * @param my		factor for distortion of height
     */
    public MicroGridLayout(String group, int numRows, int numTotRows, int numCols, double height, double width, String rowName, String colName, int xMargin, int yMargin, double mx, double my, String name) 
        {
        grupo=group;
        n=numRows;
        m=numCols;
        ntot=numTotRows;
        cellHeight=height/n;	//No influyen, son determinados por el ERenderer
        cellWidth=width/m;
        this.height=height;
        this.width=width;
        geneOrder=new int[n];
        conditionOrder=new int[m];
        for(int i=0;i<n;i++)	geneOrder[i]=i;
        for(int i=0;i<m;i++)	conditionOrder[i]=i;
        initialConditionOrder=conditionOrder.clone();
        colField=colName;
        rowField=rowName;
        this.xMargin=xMargin;
        this.yMargin=yMargin;
        rowSelected=0;
        colSelected=0;
        rowHovered=0;
        colHovered=0;
        this.mx=mx;
        this.my=my;
        this.name=name;
    	}
    
    /**
     * @see prefuse.action.Action#run()
     */
    public void run()
    	{
    	}
  
    /**
     * Pone un nuevo orden, ojo, teniendo en cuenta sólo los genes que están en la matriz, es decir, si sale sparse
     * no se le puden pasar genesFirst con ids de genes totales
     * @param genesFirst	genes that come first in the matrix
     * @param conditionsFirst	conditions that come first in the matrix
     */
    void newOrder(int[] genesFirst, int[] conditionsFirst)//blue monday :)
    	{
    	int init=0;
    	if(genesFirst!=null)
	    	{
	    	for(int i=0;i<genesFirst.length;i++)//Primero añado todos los que tienen que ir primero
	    		{
	    		if(genesFirst[i]>=0)
	    			{
	    			geneOrder[genesFirst[i]]=init;//El primero pasa a ocupar la posición de uno de los que tenemos
	    			init++;
	    			}
	    		}
	    	for(int i=0;i<n;i++)//Luego el resto, si no están entre lo iniciales
	    		{
	    		boolean add=true;
	    		for(int j=0;j<genesFirst.length;j++)	
	    			if(i==genesFirst[j])	
	    				{add=false;break;}
	    		if(add)	
	    			geneOrder[i]=init++;
	    		}
	    	rowSelected=genesFirst.length;
	    	}
    	else
    		{
    		for(int i=0;i<n;i++)	geneOrder[i]=i;
    		rowSelected=0;
    		}
    	
     	if(conditionsFirst!=null)
	    	{
	    	init=0;
	    	if(conditionsFirst.length<conditionOrder.length)
		    	{
		    	for(int i=0;i<conditionsFirst.length;i++)//Primero añado todos los que tienen que ir primero
		    		{
		    		conditionOrder[conditionsFirst[i]]=init;//y viceversa
		    		init++;
		         	}
		    	for(int i=0;i<m;i++)//Luego el resto, si no están entre lo iniciales
		    		{
		    		boolean add=true;
		    		for(int j=0;j<conditionsFirst.length;j++)	if(i==conditionsFirst[j])	{add=false;break;}
		    		if(add)	conditionOrder[i]=init++;
		    		}
		    	}
	    	colSelected=conditionsFirst.length;
	    	}
    	
     	return;
    	}
    
    public void setColumnOrder(int [] co)
    	{
    	for(int i=0;i<co.length;i++)
    		conditionOrder[co[i]]=i;
    	}
    /**
     * Sets the elemnts that are hovered at a moment
     * @param genesFirst	genes that come first in the matrix
     * @param conditionsFirst	conditions that come first in the matrix
     */
    void newHover(int[] genes, int[] conditions)
    	{
    	if(genes!=null)
    		{
	    	hoverGenes=new int[genes.length];
	    	for(int i=0;i<hoverGenes.length;i++)	hoverGenes[i]=geneOrder[genes[i]];
    		}
    	else			hoverGenes=null;
    	hoverConditions=conditions;
    	if(conditions!=null)	for(int i=0;i<hoverConditions.length;i++)	hoverConditions[i]=conditionOrder[hoverConditions[i]];
    	if(hoverConditions!=null)	colHovered=hoverConditions.length;
    	else						colHovered=0;
    	if(hoverGenes!=null)	rowHovered=hoverGenes.length;
    	else					rowHovered=0;
    	}
    

    void initialOrder()
    	{
    	for(int i=0;i<n;i++)	geneOrder[i]=i;
    	for(int i=0;i<m;i++)	conditionOrder[i]=i;
    	}
    
    boolean contained(int c, int[] vector, int max)
    	{
    	for(int i=0;i<vector.length;i++)
    		{
    		if(i>=max)	break;
    		if(vector[i]==c)	return true;
    		}
    	
    	return false;
    	}
    //NOTA: OJO, sólo se toca al principio, y con cada selecci'on en otras vistas
    /**
     * @see prefuse.action.Action#run(double)
     */
    public void run(double frac) 
    	{
    	TupleSet ts=getVisualization().getGroup(grupo);
 	    Iterator iter=ts.tuples();
        double x=0;
        double y=0;

        
        double normalw=cellWidth;
        double normalh=cellHeight;
        double distortedw=normalw*mx;
        double distortedh=normalh*my;
        
        double miniw, minih;
        
        if(rowSelected>0 || colSelected>0 || rowHovered>0 || colHovered>0)//In case there are something selected and/or hovered it is distorted
        {
        int numRows, numCols;
        if(rowHovered>0 && (rowSelected==0 || hoverGenes[0]>rowSelected))  	numRows=rowSelected+rowHovered;
        else								        	numRows=rowSelected;//hovering coincides with a selection
        if(colHovered>0 && (colSelected==0 || hoverConditions[0]>colSelected))  numCols=colSelected+colHovered;
        else        										numCols=colSelected;//hovering coincides with a selection
        
        
    	miniw=(this.getLayoutBounds().getWidth()-distortedw*numCols)/(m-numCols);
        minih=(this.getLayoutBounds().getHeight()-distortedh*numRows)/(n-numRows);

        if(numCols>0 && distortedw*numCols>maxDistortion*width)
	    	{
	    	distortedw=maxDistortion*width/numCols;
	    	miniw=(this.getLayoutBounds().getWidth()-distortedw*numCols)/(m-numCols);
	        }
	    if(numRows>0 && distortedh*numRows>maxDistortion*height)
        	{
	    	distortedh=maxDistortion*height/numRows;
	    	minih=(this.getLayoutBounds().getHeight()-distortedh*numRows)/(n-numRows);
	        }
        while(iter.hasNext())
        	{
        	VisualItem item = (VisualItem)iter.next();
        	int i=geneOrder[item.getInt("rowId")];
        	int j=conditionOrder[item.getInt("colId")];//we get the order from the colRank, that may or not be ordered
        	int icont=item.getInt("rowId");//Sparse
            int jcont=item.getInt(colField);
            
        	double h=0;
        	double w=0;
        	if(i>=rowSelected)	
        		{
        		h=minih;//not selected... hovered?
        		if(hoverGenes!=null)	
        			for(int k:hoverGenes)	
        				if(k==i)	
        					{
        					h=distortedh;//hovered one 
        					break;
        					}	
    	        }
        	else		   		h=distortedh;//selected one
        	
        	if((colSelected==0 && colHovered==0) || colSelected==m || (colSelected==0 && colHovered==m))//we have selected gene profiles only
        		w=normalw;
        	else
        		{
        		if(j>=colSelected)	
        			{
        			w=miniw;//non selected... hovered?
        			if(hoverConditions!=null)	for(int k:hoverConditions)	if(k==j)	{w=distortedw; break;}	//hovered one
    	        	}
            	else				w=distortedw;//selected one
        		}
        	
        	ExpressionRenderer er=(ExpressionRenderer)item.getRenderer();
        	er.setHeight(h, icont);
            er.setWidth(w, jcont);
           
           if(i>=rowSelected)	
        	   {
        	   if(hoverGenes!=null && hoverGenes[0]>=rowSelected  && i>hoverGenes[0])   y=yMargin+(rowSelected+1)*distortedh+(i-rowSelected-1)*minih;
        	   else				   	 y=yMargin+(rowSelected)*distortedh+(i-rowSelected)*minih;
        	   }
	       else					y=yMargin+i*distortedh;
        	
        	if(colSelected==m || (colSelected==0 && colHovered==m))//we have selected/hovered gene profiles only (all conditions selected)
        		x=xMargin+j*normalw;
        	else
        		{
	        	if(j>=colSelected)	
	        		{
	        		if(hoverConditions!=null && hoverConditions[0]>=colSelected && j>hoverConditions[0])	x=xMargin+(colSelected+1)*distortedw+(j-colSelected-1)*miniw;
	        		else						x=xMargin+colSelected*distortedw+(j-colSelected)*miniw;
	        		}
	        	else				x=xMargin+j*distortedw;
        		}
	        	
        	setX(item, null, x);
            setY(item, null, y);
            }
         }

        //-------------------- NON DISTORTED BUILD ---------------------
        else
        	{//otherwise, it is built as normal
        	x=xMargin;
	        y=yMargin;
	        
	    	ts=getVisualization().getGroup(grupo);
	 	    iter=ts.tuples();
	        x=0;
	        y=0;
	        
	        while(iter.hasNext())
	        	{
	        	VisualItem item = (VisualItem)iter.next();
	        	ExpressionRenderer er=((ExpressionRenderer)item.getRenderer());
	        	//int ci=item.getInt("colId");
	        	int ci=item.getInt("colRank");
	        	int ri=item.getInt("rowId");
	        	double w=er.getWidth(ci);
	        	double h=er.getHeight(ri);
	            x=xMargin+conditionOrder[ci]*w;
	            y=yMargin+geneOrder[ri]*h;
	            
	            item.setX(x);//mas rápido que this.setX()
	            item.setY(y);
	            }
	        
//	      Rectangle surrounding the selection
	      /*  VisualItem rect=(VisualItem)this.getVisualization().getGroup("rectangle").tuples().next();
	        setX(rect,null, xMargin);
	        setY(rect,null, yMargin);
	       // ExpressionRenderer sr=(ExpressionRenderer)rect.getRenderer();
	        //sr.setBaseHeight(0, 0);
	        //sr.setBaseWidth(0, 0);*/

	        }
      }
} // end of inner class MicroGridLayout

