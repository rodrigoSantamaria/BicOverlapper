package es.usal.bicoverlapper.view.diagram.heatmap;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.Iterator;

import es.usal.bicoverlapper.controller.kernel.Selection;
import es.usal.bicoverlapper.controller.kernel.Session;
import es.usal.bicoverlapper.view.diagram.heatmap.ExpressionRenderer;


import prefuse.action.layout.Layout;
import prefuse.data.tuple.TupleSet;
import prefuse.visual.VisualItem;

/**
 * Class that implements distortion in a Microarray Matrix Grid.
 * 
 *
 * @version 1.0
 * @author <a href="http://carpex.fis.usal.es/~rodrigo">Rodrigo Santamaría</a>
 */
class MicroGridDistortion extends Layout {

    private Point2D m_tmp = new Point2D.Double();
    protected boolean m_distortSize = true;
    protected boolean m_distortX = true;
    protected boolean m_distortY = true;
    private String rowField;
    private String colField;
    
    double xMargin, yMargin;
    double rx, ry;
    double mx,my;
    Rectangle2D bounds;
    int n,m;
    
    Session s;
    private MicroGridLayout mgl;
    
    
    // ------------------------------------------------------------------------
    
    /**
     * Create a new Distortion instance.
     * To identify the row and column in which a VisualItem is, int fields must be
     * available in the item with names "rowId" and "colId"
     */
    public MicroGridDistortion() {
        super();
        rowField="rowId";
        colField="colId";
    }

    /**
     * Create a new Distortion instance that processes the given data group.
     * @param group the data group processed by this Distortion instance
     */
    public MicroGridDistortion(String group) {
        super(group);
        rowField="rowId";
        colField="colId";
    }
    
    /**
     * Create a new Distortion instance that processes the given data group.
     * It will use user field names for row and column identifying.
     * @param group the data group processed by this Distortion instance
     * @param rowID name of the int field that contains the row in which an item is
     * @param colID name of the int field that contains the column in which an item is
     */
    public MicroGridDistortion(String group, String rowID, String colID) {
        super(group);
        rowField=rowID;
        colField=colID;
    }
    
    /**
     * Complete constructor for a MicroGridDistorion
     * @param xrange	the x range of items being distorted. 1 is the maximum, for all items being distorted.	
     * @param xmag		the degree of x and width distortion of a distorted item.
     * @param yrange	the y range of items being distorted. 1 is the maximum, for all items being distorted.
     * @param ymag		the degree of y and height distortion of a distorted item.
     * @param b			BoundingBox in which to apply distortion
     * @param numRows	number of rows of the grid
     * @param numCols	number of columns of the grid
     * @param group 	the data group processed by this Distortion instance
     * @param session	session linked to the HeatmapDiagram this class is distorting	
     * @param micro		MicroGridLayout of the HeatmapDiagram this class is distorting.
     */
    public MicroGridDistortion(double xrange, double xmag, 
            double yrange, double ymag, Rectangle2D b, int numRows, int numCols, String group, Session session, MicroGridLayout micro)
    	{
    	super(group);
    	rx=xrange;
    	ry=yrange;
    	mx=xmag;
    	my=ymag;
    	bounds=b;
    	xMargin=b.getX();
    	yMargin=b.getY();
    	n=numRows;
    	m=numCols;
        rowField="rowId";
    	colField="colId";
        
        s=session;
        mgl=micro;
        }
    // ------------------------------------------------------------------------

    /**
     * Controls whether item sizes are distorted along with the item locations.
     * @param s true to distort size, false to distort positions only
     */
    public void setSizeDistorted(boolean s) {
        m_distortSize = s;
    }
    
    /**
     * Indicates whether the item sizes are distorted along with the item
     * locations.
     * @return true if item sizes are distorted by this action, false otherwise
     */
    public boolean isSizeDistorted() {
        return m_distortSize;
    }
    
    // ------------------------------------------------------------------------
    
    /**
     * @see prefuse.action.Action#run(double)
     */
    public void run(double frac) {
    	double t1=System.currentTimeMillis();
        Rectangle2D bounds = getLayoutBounds();
        Point2D anchor = correct(m_anchor, bounds);
        if(anchor==null)	return;

        //0) Initialization
 	    double x=0;
        double y=0;

        double stepx=bounds.getWidth()*rx;
        double stepy=bounds.getHeight()*ry;
        x=xMargin;
        y=yMargin;
        TupleSet ts=getVisualization().getGroup("matrix");
        VisualItem item=null;
        double h=0;
        double w=0;
        int contx=0;
        int conty=0;

        double normalw=bounds.getWidth()/m;
        double normalh=bounds.getHeight()/n;
        double distortedw=normalw*mx;
        double distortedh=normalh*my;
        double miniw=(bounds.getWidth()-distortedw)/(m-1);
        double minih=(bounds.getHeight()-distortedh)/(n-1);
        
        //0.1) In this case, all must be leaved as it was
        if(!bounds.contains(anchor))	
        	{
        	final Iterator iter = getVisualization().visibleItems(m_group);
            while(iter.hasNext())
            	{
            	item=(VisualItem)iter.next();
            
            	int i=mgl.geneOrder[item.getInt(rowField)];
            	//int i=mgl.geneOrder[item.getInt("actualRowId")];//sparse
            	//int actuali=item.getInt("actualRowId");
            	int j=mgl.conditionOrder[item.getInt(colField)];
            	
            	h=normalh;
            	w=normalw;
    		
                ExpressionRenderer er=((ExpressionRenderer)item.getRenderer());
                er.setHeight(h, i);
                er.setWidth(w, j);
                
                x=xMargin+j*miniw;
                y=yMargin+i*minih;
                setX(item, null, x);
    	        setY(item, null, y);
    	        }
            
        	return;
        	}
        
        
        //Versión que tiene en cuenta distorsiones previas
    	Selection sb=s.getSelectedBicluster();
    	int colSelected=0;
    	int rowSelected=0;
    	if(sb!=null)
        	{
        	rowSelected=sb.getGenes().size();
    		double height=bounds.getHeight();
    		if(rowSelected>0 && distortedh*rowSelected>mgl.maxDistortion*height)
            	{
    	    	distortedh=mgl.maxDistortion*height/rowSelected;
    	    	minih=(this.getLayoutBounds().getHeight()-distortedh*rowSelected)/(n-rowSelected);
    	        }
    		colSelected=sb.getConditions().size();
    		double width=bounds.getWidth();
            if(colSelected>0 && distortedw*colSelected>mgl.maxDistortion*width)
    	    	{
    	    	distortedw=mgl.maxDistortion*width/colSelected;
    	    	miniw=(this.getLayoutBounds().getWidth()-distortedw*colSelected)/(m-colSelected);
    	        }
        	}
        
        while(x<anchor.getX())
	    	{
        	if(sb==null)			x+=stepx;
        	else
        		{
		    	if(contx<colSelected)	x+=distortedw;
		    	else					x+=miniw;
        		}
	    	contx++;
	    	}
	    while(y<anchor.getY())
	    	{
	    	if(sb==null)			y+=stepy;
        	else
        		{
		    	if(conty<rowSelected)	y+=distortedh;
		    	else					y+=minih;
        		}
	    	conty++;
	    	}
	    if(contx>0)	contx--;
	    if(conty>0)	conty--;
    
        
        x=xMargin;
        y=yMargin;
        //2) Distortion
        final Iterator iter = getVisualization().visibleItems(m_group);
        while(iter.hasNext())
        	{
        	item=(VisualItem)iter.next();
        
        	int ii=item.getInt(rowField);		//id. en la matriz sparse
        	int jj=item.getInt(colField);
        	int i=mgl.geneOrder[item.getInt(rowField)];//Orden en la matriz sparse
        	int j=mgl.conditionOrder[item.getInt(colField)];
        	
        	if(i!=conty)	h=minih;
        	else			h=distortedh;
        	
        	if(j!=contx)	w=miniw;
        	else			w=distortedw;
		
        	//distortion
        //	if(sb!=null && sb.getGenes().contains(ii))//alteramos h
        	if(sb!=null && sb.getGenes().contains(item.getInt("actualRowId")))//alteramos h	//SPARSE
            	h=distortedh;
        	if(sb!=null && sb.getConditions().contains(jj))//alteramos w
                w=distortedw;
        	if(sb!=null && (colSelected==0 || colSelected==m-1))//we have selected gene profiles only
        		w=normalw;
        	
        	
        	ExpressionRenderer er=((ExpressionRenderer)item.getRenderer());
        	er.setHeight(h, ii);
            er.setWidth(w, jj);
            
        /*  All this was actually doing nothing, cause x and y cannot be modified outside the getRawShape parser. Unless we make like with height and width, x and y should be modified during the construction of visual items 
            if(sb==null)
            	{
            	if(j<=contx)	x=xMargin+j*miniw;
                else			x=xMargin+(j-1)*miniw+distortedw;
                if(ii<=conty)	y=yMargin+ii*minih;					//SPARSE
                else			y=yMargin+(ii-1)*minih+distortedh;	//SPARSE
            	}
            
            else
            	{
            	if(colSelected==0 || colSelected==m-1)	x=xMargin+j*normalw;
            	else
            		{
            		if(j<sb.getConditions().size())	x=xMargin+j*distortedw;
	            	else
	            		{
	            		if(j<=contx)	x=xMargin+sb.getConditions().size()*distortedw+(j-sb.getConditions().size())*miniw;
	            		else
	            			{
	            			if(contx<sb.getConditions().size())	x=xMargin+(sb.getConditions().size())*distortedw+(j-sb.getConditions().size()-1)*miniw;
	            			else								x=xMargin+(sb.getConditions().size()+1)*distortedw+(j-sb.getConditions().size()-1)*miniw;
	            			}
	            		}
            		}
            	
              	if(i<sb.getGenes().size())	y=yMargin+i*distortedh;
            	else
            		{
            		if(i<=conty)	y=yMargin+sb.getGenes().size()*distortedh+(i-sb.getGenes().size())*minih;//los distorsionados de la selección más otros los que haya entre medias mini
            		else		
	        			{
	        			if(conty<sb.getGenes().size())	y=yMargin+(sb.getGenes().size())*distortedh+(i-sb.getGenes().size()-1)*minih;
	        			else							y=yMargin+(sb.getGenes().size()+1)*distortedh+(i-sb.getGenes().size()-1)*minih;
	        			}
            		}
            	}
            
        	setX(item, null, x);
	        setY(item, null, y);*/
	    	}
        //System.out.println("Tiempo en MicroGridDistortion.run() "+(System.currentTimeMillis()-t1)/1000);
           }

    /**
     * Para correrlo con el anchor que queramos
     * @see prefuse.action.Action#run(double)
     */
    void run(Point2D anchor) {
    	    }
    
    
    /**
     * Corrects the anchor position, such that if the anchor is outside the
     * layout bounds, the anchor is adjusted to be the nearest point on the
     * edge of the bounds.
     * @param anchor the un-corrected anchor point
     * @param bounds the layout bounds
     * @return the corrected anchor point
     */
    protected Point2D correct(Point2D anchor, Rectangle2D bounds) {
        if ( anchor == null ) return anchor;
        double x = anchor.getX(), y = anchor.getY();
        double x1 = bounds.getMinX(), y1 = bounds.getMinY();
        double x2 = bounds.getMaxX(), y2 = bounds.getMaxY();
        x = (x < x1 ? x1 : (x > x2 ? x2 : x));
        y = (y < y1 ? y1 : (y > y2 ? y2 : y));
        
        m_tmp.setLocation(x,y);
        return m_tmp;
    }
    

} // end of abstract class Distortion

