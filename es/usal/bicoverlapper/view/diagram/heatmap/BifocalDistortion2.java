package es.usal.bicoverlapper.view.diagram.heatmap;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import prefuse.action.distortion.BifocalDistortion;
import prefuse.action.distortion.Distortion;

/**
 * <p>
 * Prefuse BifocalDistortion with maximum distortion limits
 * </p>
 * 
 * <p>
 * For more details on this form of transformation, see Y. K. Leung and 
 * M. D. Apperley, "A Review and Taxonomy of Distortion-Oriented Presentation
 * Techniques", in Transactions of Computer-Human Interaction (TOCHI),
 * 1(2): 126-160 (1994). Available online at
 * <a href="portal.acm.org/citation.cfm?id=180173&dl=ACM">
 * portal.acm.org/citation.cfm?id=180173&dl=ACM</a>.
 * </p>
 * 
 * @author <a href="http://jheer.org">jeffrey heer</a>
 */
public class BifocalDistortion2 extends BifocalDistortion {
    
    private double rx, ry; // magnification ranges
    private double mx, my; // magnification factor
    private double maxDistortion;//magnificationLimit
    
    /**
     * Create a new BifocalDistortion with default range and magnification.
     */
    public BifocalDistortion2() {
        this(0.1,3,1);
    }
    
    /**
     * <p>Create a new BifocalDistortion with the specified range and
     * magnification. The same range and magnification is used for both
     * axes.</p>
     * 
     * <p><strong>NOTE:</strong>if the range value times the magnification
     * value is greater than 1, the resulting distortion can exceed the
     * display bounds.</p>
     * 
     * @param range the range around the focus that should be magnified. This
     *  specifies the size of the magnified focus region, and should be in the
     *  range of 0 to 1, 0 being no magnification range and 1 being the whole
     *  display.
     * @param mag how much magnification should be used in the focal area
     */
    public BifocalDistortion2(double range, double mag, double max) {
        this(range,mag,range,mag);
        this.maxDistortion=max;
    } //
    
    /**
     * <p>Create a new BifocalDistortion with the specified range and 
     * magnification along both axes.</p>
     * 
     * <p><strong>NOTE:</strong>if the range value times the magnification
     * value is greater than 1, the resulting distortion can exceed the
     * display bounds.</p>
     * 
     * @param xrange the range around the focus that should be magnified along
     *  the x direction. This specifies the horizontal size of the magnified 
     *  focus region, and should be a value between 0 and 1, 0 indicating no
     *  focus region and 1 indicating the whole display.
     * @param xmag how much magnification along the x direction should be used
     *  in the focal area
     * @param yrange the range around the focus that should be magnified along
     *  the y direction. This specifies the vertical size of the magnified 
     *  focus region, and should be a value between 0 and 1, 0 indicating no
     *  focus region and 1 indicating the whole display.
     * @param ymag how much magnification along the y direction should be used
     *  in the focal area
     */
    public BifocalDistortion2(double xrange, double xmag, 
                             double yrange, double ymag)
    {
        rx = xrange;
        mx = xmag;
        ry = yrange;
        my = ymag;
        m_distortX = !(rx == 0 || mx == 1.0);
        m_distortY = !(ry == 0 || my == 1.0);
        maxDistortion=6;
    }
    
    /**
     * @see prefuse.action.distortion.Distortion#distortX(double, java.awt.geom.Point2D, java.awt.geom.Rectangle2D)
     */
    protected double distortX(double x, Point2D a, Rectangle2D b) {
        return bifocal(x, a.getX(), rx, mx, b.getMinX(), b.getMaxX());
    }
    
    /**
     * @see prefuse.action.distortion.Distortion#distortY(double, java.awt.geom.Point2D, java.awt.geom.Rectangle2D)
     */
    protected double distortY(double y, Point2D a, Rectangle2D b) {
        return bifocal(y, a.getY(), ry, my, b.getMinY(), b.getMaxY());
    }
    
    /**
     * @see prefuse.action.distortion.Distortion#distortSize(java.awt.geom.Rectangle2D, double, double, java.awt.geom.Point2D, java.awt.geom.Rectangle2D)
     */
    protected double distortSize(Rectangle2D bbox, double x, double y, 
            Point2D anchor, Rectangle2D bounds)
    {
        boolean xmag = false, ymag = false;
        double m;
        
        if ( m_distortX ) {
            double cx = bbox.getCenterX(), ax = anchor.getX();
            double minX = bounds.getMinX(), maxX = bounds.getMaxX();
            m = (cx<ax ? ax-minX : maxX-ax);
            if ( m == 0 ) m = maxX-minX;
            if ( Math.abs(cx-ax) <= rx*m )
                xmag = true;
        }
        
        if ( m_distortY ) {
            double cy = bbox.getCenterY(), ay = anchor.getY();
            double minY = bounds.getMinY(), maxY = bounds.getMaxY();
            m = (cy<ay ? ay-minY : maxY-ay);
            if ( m == 0 ) m = maxY-minY;
            if ( Math.abs(cy-ay) <= ry*m )
                ymag = true;
        }
        
        if(bbox.getWidth()*Math.min(mx,my)>maxDistortion)	
	    	{
	    	System.out.println("Distorsión controlada: "+bbox.getWidth()+" "+Math.min(mx,my));
	    	System.out.println("Se va a distorsionar con "+Math.min((1-rx*mx)/(1-rx), (1-ry*my)/(1-ry)));
	    	return 0;
	    	}
        if ( xmag && !m_distortY ) {
            return mx;
        } else if ( ymag && !m_distortX ) {
            return my;
        } else if ( xmag && ymag ) {
            return Math.min(mx,my);
        	// return Math.min(Math.min(mx,my), maxDistortion);
             } else {
            return Math.min((1-rx*mx)/(1-rx), (1-ry*my)/(1-ry));
          // return Math.min(maxDistortion,Math.min((1-rx*mx)/(1-rx), (1-ry*my)/(1-ry)));
             }
    }
    
    private double bifocal(double x, double a, double r, 
                           double mag, double min, double max)
    {
        double m = (x<a ? a-min : max-a);
        if ( m == 0 ) m = max-min;
        double v = x - a, s = m*r;
        if ( Math.abs(v) <= s ) {  // in focus
            {
            return x = v*mag + a;
            }
        } else {                   // out of focus
            double bx = r*mag;
            x = ((Math.abs(v)-s) / m) * ((1-bx)/(1-r));
            return (v<0?-1:1)*m*(x + bx) + a;
        }
    }

    /**
     * Returns the magnification factor for the x-axis.
     * @return Returns the magnification factor for the x-axis.
     */
    public double getXMagnification() {
        return mx;
    }

    /**
     * Sets the magnification factor for the x-axis.
     * @param mx The magnification factor for the x-axis.
     */
    public void setXMagnification(double mx) {
        this.mx = mx;
    }

    /**
     * Returns the magnification factor for the y-axis.
     * @return Returns the magnification factor for the y-axis.
     */
    public double getYMagnification() {
        return my;
    }

    /**
     * Sets the magnification factor for the y-axis.
     * @param my The magnification factor for the y-axis.
     */
    public void setYMagnification(double my) {
        this.my = my;
    }

    /**
     * Returns the range of the focal area along the x-axis.
     * @return Returns the range of the focal area along the x-axis.
     */
    public double getXRange() {
        return rx;
    }

    /**
     * Sets the range of the focal area along the x-axis.
     * @param rx The focal range for the x-axis, a value between 0 and 1.
     */
    public void setXRange(double rx) {
        this.rx = rx;
    }

    /**
     * Returns the range of the focal area along the y-axis.
     * @return Returns the range of the focal area along the y-axis.
     */
    public double getYRange() {
        return ry;
    }

    /**
     * Sets the range of the focal area along the y-axis.
     * @param ry The focal range for the y-axis, a value between 0 and 1.
     */
    public void setYRange(double ry) {
        this.ry = ry;
    }

    protected double distortHeight(Rectangle2D bbox, Point2D anchor, Rectangle2D bounds)
		{
	    boolean ymag = false;
	    double m;
	    
	    if ( m_distortY ) {
	        double cy = bbox.getCenterY(), ay = anchor.getY();
	        double minY = bounds.getMinY(), maxY = bounds.getMaxY();
	        m = (cy<ay ? ay-minY : maxY-ay);
	        if ( m == 0 ) m = maxY-minY;
	        if ( Math.abs(cy-ay) <= ry*m )
	            ymag = true;
	    	}
	    
	    if ( ymag ) {
	    	//System.out.println("In focus by height");
	
	        return my;
	    	// return Math.min(maxDistortion, my);
		    	}
	    else {
	    	//System.out.println("In focus by height");
	        return Math.min((1-rx*mx)/(1-rx), (1-ry*my)/(1-ry));
	    	// return Math.min(maxDistortion, Math.min((1-rx*mx)/(1-rx), (1-ry*my)/(1-ry)));
		    	}
	}

protected double distortWidth(Rectangle2D bbox, Point2D anchor, Rectangle2D bounds)
	{
		//System.out.println("WIDTH: x="+bbox.getCenterX()+" anchor="+anchor.getX()+" minX="+bounds.getMinX()+" maxX="+bounds.getMaxX());
	    boolean xmag = false;
	    double m;
	    if ( m_distortX ) {
	        double cx = bbox.getCenterX(), ax = anchor.getX();
	        double minX = bounds.getMinX(), maxX = bounds.getMaxX();
	        m = (cx<ax ? ax-minX : maxX-ax);
	        if ( m == 0 ) m = maxX-minX;
	        
	        if ( Math.abs(cx-ax) <= rx*m )	//Si la distancia al centro de la figura a la que está el puntero es menor que la mayor distancia a sus bordes * rango, hay que agrandar
	        	{
	        	xmag = true;
	        	}
	    	}
	    
	    if ( xmag ) {
	        return mx;
	    	//  return Math.min(maxDistortion, mx);
		    	} 
	    else {
	        return Math.min((1-rx*mx)/(1-rx), (1-ry*my)/(1-ry));
	    	//return Math.min(maxDistortion, Math.min((1-rx*mx)/(1-rx), (1-ry*my)/(1-ry)));
	    	}
	}
	protected double distortX(double x, double center, Point2D anchor, Rectangle2D bounds){return -133;}
	protected double distortY(double x, double center, Point2D anchor, Rectangle2D bounds){return -133;}
    

} // end of class BifocalDistortion
