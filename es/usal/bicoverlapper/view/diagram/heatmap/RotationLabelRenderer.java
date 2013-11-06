package es.usal.bicoverlapper.view.diagram.heatmap;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import java.awt.geom.RoundRectangle2D;

import prefuse.Constants;
import prefuse.render.AbstractShapeRenderer;
import prefuse.render.ImageFactory;
import prefuse.util.ColorLib;
import prefuse.util.FontLib;
import prefuse.util.GraphicsLib;
import prefuse.util.StringLib;
import prefuse.visual.VisualItem;

/**
 * 
 * CMC Modified copy of LabelRenderer v 2.2
 *  
 * Renderer that draws a label, which consists of a text string,
 * an image, or both.  Label is drawn rotated by the amount given in the
 * construction, or no rotated otherwise. 
 * It is basically a simplified Collins' RotationLabelRenderer 
 * 
 *
 * @author <a href="http://jheer.org">jeffrey heer</a>
 * @author <a href="http://www.cs.utoronto.ca/~ccollins>Christopher Collins</a>
 * @author <a href="http://vis.usal.es/~rodrigo>Rodrigo Santamaria</a>
 */
public class RotationLabelRenderer extends AbstractShapeRenderer {

    protected ImageFactory m_images = null;
    protected String m_delim = "\n";
    private Rectangle2D m_rect = new Rectangle2D.Double();

    protected String m_labelName = "label";
    protected String m_imageName = null;
    
   protected int m_xAlign = Constants.CENTER;
   // protected int m_xAlign = Constants.LEFT;
    protected int m_yAlign = Constants.CENTER;//no afecta cambiar a left/bottom en vez de center/center
    protected int m_hTextAlign = Constants.CENTER;
    protected int m_vTextAlign = Constants.CENTER;
    protected int m_hImageAlign = Constants.CENTER;
    protected int m_vImageAlign = Constants.CENTER;
    protected int m_imagePos = Constants.LEFT;
    
    protected int m_horizBorder = 2;//2
    protected int m_vertBorder  = 0;
    protected int m_imageMargin = 0;//2
    protected int m_arcWidth    = 0;
    protected int m_arcHeight   = 0;

    protected int m_maxTextWidth = -1;
    
    /** Transform used to scale and position images */
    AffineTransform m_transform = new AffineTransform();
    
    /** The holder for the currently computed bounding box */
    protected RectangularShape m_bbox  = new Rectangle2D.Double();
    protected Point2D m_pt = new Point2D.Double(); // temp point
    protected Font    m_font; // temp font holder
    protected String    m_text; // label text
    protected Dimension m_textDim = new Dimension(); // text width / height

    /** 
     * The rotation of the current item.
     */
    protected double itemRotation; // current item rotation

    //  set to -2 because this is an invalid row number
    //  -1 is the standard invalid row number that item.getRow() returns and we never want to match that
    protected int itemCacheRow = -2;  

    /**
     * Transform used to rotate shapes.
     */
    protected AffineTransform itemTransform = new AffineTransform();
    
    /**
     * Persistant shape used in transform calculations
     */
    protected RectangularShape itemRawShape;
    
    /**
     * Create a new LabelRenderer. By default the field "label" is used
     * as the field name for looking up text, and no image is used.
     */
    public RotationLabelRenderer() {
    }
    
    /**
     * Create a new LabelRenderer. Draws a text label using the given
     * text data field and does not draw an image.
     * @param textField the data field for the text label.
     */
    public RotationLabelRenderer(String textField) {
        this.setTextField(textField);
    }
    
    /**
     * Create a new LabelRenderer. Draws a text label using the given
     * text data field and does not draw an image, with the specified rotation
     * @param textField the data field for the text label.
     */
    public RotationLabelRenderer(String textField, double rotation) {
        this.setTextField(textField);
        this.itemRotation=rotation;
    	setVerticalPadding(0);
		setHorizontalPadding(0);
		
		/*this.setVerticalTextAlignment(Constants.BOTTOM);
		this.setVerticalImageAlignment(Constants.BOTTOM);
		this.setVerticalAlignment(Constants.BOTTOM);*/
		
		//setHorizontalAlignment(Constants.LEFT);
    	//this.setHorizontalImageAlignment(Constants.LEFT);
		setHorizontalTextAlignment(Constants.LEFT);
 	
    }
    
    /**
     * Create a new LabelRenderer. Draws a text label using the given text
     * data field, and draws the image at the location reported by the
     * given image data field.
     * @param textField the data field for the text label
     * @param imageField the data field for the image location. This value
     * in the data field should be a URL, a file within the current classpath,
     * a file on the filesystem, or null for no image. If the
     * <code>imageField</code> parameter is null, no images at all will be
     * drawn.
     */
    public RotationLabelRenderer(String textField, String imageField) {
        setTextField(textField);
        setImageField(imageField);
    }
    
    // ------------------------------------------------------------------------
    
    /**
     * Rounds the corners of the bounding rectangle in which the text
     * string is rendered. This will only be seen if either the stroke
     * or fill color is non-transparent.
     * @param arcWidth the width of the curved corner
     * @param arcHeight the height of the curved corner
     */
    public void setRoundedCorner(int arcWidth, int arcHeight) {
        if ( (arcWidth == 0 || arcHeight == 0) && 
            !(m_bbox instanceof Rectangle2D) ) {
            m_bbox = new Rectangle2D.Double();
        } else {
            if ( !(m_bbox instanceof RoundRectangle2D) )
                m_bbox = new RoundRectangle2D.Double();
            ((RoundRectangle2D)m_bbox)
                .setRoundRect(0,0,10,10,arcWidth,arcHeight);
            m_arcWidth = arcWidth;
            m_arcHeight = arcHeight;
        }
    }

    /**
     * Get the field name to use for text labels.
     * @return the data field for text labels, or null for no text
     */
    public String getTextField() {
        return m_labelName;
    }
    
    /**
     * Set the field name to use for text labels.
     * @param textField the data field for text labels, or null for no text
     */
    public void setTextField(String textField) {
        m_labelName = textField;
    }
    
    /**
     * Sets the maximum width that should be allowed of the text label.
     * A value of -1 specifies no limit (this is the default).
     * @param maxWidth the maximum width of the text or -1 for no limit
     */
    public void setMaxTextWidth(int maxWidth) {
        m_maxTextWidth = maxWidth;
    }
    
    /**
     * Returns the text to draw. Subclasses can override this class to
     * perform custom text selection.
     * @param item the item to represent as a <code>String</code>
     * @return a <code>String</code> to draw
     */
    protected String getText(VisualItem item) {
        String s = null;
        if ( item.canGetString(m_labelName) ) {
            return item.getString(m_labelName);            
        }
        return s;
    }

    // ------------------------------------------------------------------------
    // Image Handling
    
    /**
     * Get the data field for image locations. The value stored
     * in the data field should be a URL, a file within the current classpath,
     * a file on the filesystem, or null for no image.
     * @return the data field for image locations, or null for no images
     */
    public String getImageField() {
        return m_imageName;
    }
    
    /**
     * Set the data field for image locations. The value stored
     * in the data field should be a URL, a file within the current classpath,
     * a file on the filesystem, or null for no image. If the
     * <code>imageField</code> parameter is null, no images at all will be
     * drawn.
     * @param imageField the data field for image locations, or null for
     * no images
     */
    public void setImageField(String imageField) {
        if ( imageField != null ) m_images = new ImageFactory();
        m_imageName = imageField;
    }
    
    /**
     * Sets the maximum image dimensions, used to control scaling of loaded
     * images. This scaling is enforced immediately upon loading of the image.
     * @param width the maximum width of images (-1 for no limit)
     * @param height the maximum height of images (-1 for no limit)
     */
    public void setMaxImageDimensions(int width, int height) {
        if ( m_images == null ) m_images = new ImageFactory();
        m_images.setMaxImageDimensions(width, height);
    }
    
    /**
     * Returns a location string for the image to draw. Subclasses can override 
     * this class to perform custom image selection beyond looking up the value
     * from a data field.
     * @param item the item for which to select an image to draw
     * @return the location string for the image to use, or null for no image
     */
    protected String getImageLocation(VisualItem item) {
        return item.canGetString(m_imageName)
                ? item.getString(m_imageName)
                : null;
    }
    
    /**
     * Get the image to include in the label for the given VisualItem.
     * @param item the item to get an image for
     * @return the image for the item, or null for no image
     */
    protected Image getImage(VisualItem item) {
        String imageLoc = getImageLocation(item);
        return ( imageLoc == null ? null : m_images.getImage(imageLoc) );
    }
    
    
    // ------------------------------------------------------------------------
    // Rendering
    
    private String computeTextDimensions(VisualItem item, String text,
                                         double size)
    {
        // put item font in temp member variable
        m_font = item.getFont();
        // scale the font as needed
        if ( size != 1 ) {
            m_font = FontLib.getFont(m_font.getName(), m_font.getStyle(),
                                     size*m_font.getSize());
        }
        
        FontMetrics fm = DEFAULT_GRAPHICS.getFontMetrics(m_font);
        StringBuilder str = null;
        
        // compute the number of lines and the maximum width
        int nlines = 1, w = 0, start = 0, end = text.indexOf(m_delim);
        m_textDim.width = 0;
        String line;
        for ( ; end >= 0; ++nlines ) {
            w = fm.stringWidth(line=text.substring(start,end));
            // abbreviate line as needed
            if ( m_maxTextWidth > -1 && w > m_maxTextWidth ) {
                if ( str == null )
                    str = new StringBuilder(text.substring(0,start));
                str.append(StringLib.abbreviate(line, fm, m_maxTextWidth));
                str.append(m_delim);
                w = m_maxTextWidth;
            } else if ( str != null ) {
                str.append(line).append(m_delim);
            }
            // update maximum width and substring indices
            m_textDim.width = Math.max(m_textDim.width, w);
            start = end+1;
            end = text.indexOf(m_delim, start);
        }
        w = fm.stringWidth(line=text.substring(start));
        // abbreviate line as needed
        if ( m_maxTextWidth > -1 && w > m_maxTextWidth ) {
            if ( str == null )
                str = new StringBuilder(text.substring(0,start));
            str.append(StringLib.abbreviate(line, fm, m_maxTextWidth));
            w = m_maxTextWidth;
        } else if ( str != null ) {
            str.append(line);
        }
        // update maximum width
        m_textDim.width = Math.max(m_textDim.width, w);
        
        // compute the text height
        m_textDim.height = fm.getHeight() * nlines;
        
        return str==null ? text : str.toString();
    }
    
    protected int getTextWidth(VisualItem item)
		{
		m_text = getText(item);
	    double size = item.getSize();
	    
	    // get text dimensions
	    if ( m_text != null ) 
	    	{
	        m_text = computeTextDimensions(item, m_text, size);
	        return m_textDim.width;   
	    	}
	    return -1;
		}
    protected int getTextHeight(VisualItem item)
		{
		m_text = getText(item);
	    double size = item.getSize();
	    
	    // get text dimensions
	    if ( m_text != null ) 
	    	{
	        m_text = computeTextDimensions(item, m_text, size);
	        return m_textDim.height;   
	    	}
	    return -1;
		}

  
    /**
     * @see prefuse.render.AbstractShapeRenderer#getRawShape(prefuse.visual.VisualItem)
     */
    protected Shape getRawShape(VisualItem item) {
        // check if this raw shape is already cached due to transform lookup
    	if ((itemRawShape != null) && (item.getRow() == itemCacheRow))
    	{
    		return itemRawShape;
        }
    	
    	m_text = getText(item);
        Image  img  = getImage(item);
        double size = item.getSize();
        
        // get image dimensions
        double iw=0, ih=0;
        if ( img != null ) {
            ih = img.getHeight(null);
            iw = img.getWidth(null);    
        }
        
        // get text dimensions
        int tw=0, th=0;
        if ( m_text != null ) {
            m_text = computeTextDimensions(item, m_text, size);
            th = m_textDim.height;
            tw = m_textDim.width;   
        }
        
        
        // get bounding box dimensions
        double w=0, h=0;
        switch ( m_imagePos ) {
        case Constants.LEFT:
        case Constants.RIGHT:
            w = tw + size*(iw +2*m_horizBorder
                   + (tw>0 && iw>0 ? m_imageMargin : 0));
            h = Math.max(th, size*ih) + size*2*m_vertBorder;
            break;
        case Constants.TOP:
        case Constants.BOTTOM:
            w = Math.max(tw, size*iw) + size*2*m_horizBorder;
            h = th + size*(ih + 2*m_vertBorder
                   + (th>0 && ih>0 ? m_imageMargin : 0));
            break;
        default:
            throw new IllegalStateException(
                "Unrecognized image alignment setting.");
        }
        
        // get the top-left point, using the current alignment settings
        getAlignedPoint(m_pt, item, w, h, m_xAlign, m_yAlign);
        
        if ( m_bbox instanceof RoundRectangle2D ) {
            RoundRectangle2D rr = (RoundRectangle2D)m_bbox;
            rr.setRoundRect(m_pt.getX(), m_pt.getY(), w, h,
                            size*m_arcWidth, size*m_arcHeight);
        } else {
        	double r=((RotationLabelRenderer)item.getRenderer()).itemRotation;
        	double rc=r-90;
        	r*=Math.PI/180;//conversion to radians
        	rc*=Math.PI/180;
        	
        	m_bbox.setFrame(m_pt.getX(), m_pt.getY(), w, h);
        	}
        
        itemCacheRow = item.getRow();
        itemRawShape = m_bbox;
        return m_bbox;
    }
    
    /**
     * Helper method, which calculates the top-left co-ordinate of an item
     * given the item's alignment.
     */
    protected static void getAlignedPoint(Point2D p, VisualItem item, 
            double w, double h, int xAlign, int yAlign)
    {
        double x = item.getX(), y = item.getY();
        if ( Double.isNaN(x) || Double.isInfinite(x) )
            x = 0; // safety check
        if ( Double.isNaN(y) || Double.isInfinite(y) )
            y = 0; // safety check
        
        if ( xAlign == Constants.CENTER ) {
            x = x-(w/2);
        } else if ( xAlign == Constants.RIGHT ) {
            x = x-w;
        }
        if ( yAlign == Constants.CENTER ) {
            y = y-(h/2);
        } else if ( yAlign == Constants.BOTTOM ) {
            y = y-h;
        }
        p.setLocation(x,y);
    }
    
    /**
     * @see prefuse.render.Renderer#render(java.awt.Graphics2D, prefuse.visual.VisualItem)
     */
    public void render(Graphics2D g, VisualItem item) {
    	RectangularShape shape = (RectangularShape)getRawShape(item);
        if ( shape == null ) return;
        // now render the image and text
        String text = m_text;
        Image  img  = getImage(item);
        
        if ( text == null && img == null )
            return;
                        
        double size = item.getSize();
        boolean useInt = 1.5 > Math.max(g.getTransform().getScaleX(),
                                        g.getTransform().getScaleY());
        double x = shape.getMinX() + size*m_horizBorder;
        double y = shape.getMinY() + size*m_vertBorder;
        
        // CMC rotate before drawing; rotation in degrees
        double rotation = this.itemRotation;
        if (item.canGetDouble("rotation")) 
            rotation = item.getDouble("rotation");
        
        
        // do transform on graphics context instead of shape; allows rendering as a rectangular shape (faster)
        AffineTransform oldTrans = g.getTransform();
        if ((rotation > 90) && (rotation < 270)) 
            rotation += 180;
        if (rotation != 0)
        	g.rotate(rotation* 2*Math.PI/360, shape.getX(), shape.getY()+shape.getHeight());//bottom-left
        
        // fill the shape, if requested
        int type = getRenderType(item);
        if ( type==RENDER_TYPE_FILL || type==RENDER_TYPE_DRAW_AND_FILL )
            GraphicsLib.paint(g, item, shape, getStroke(item), RENDER_TYPE_FILL);
        
        item.setBounds(shape.getX(), shape.getY(), shape.getWidth(), shape.getHeight());
        //lo mismo que lo de arriba pero de otro modo      //item.set(VisualItem.BOUNDS, new Rectangle2D.Double(shape.getX(), shape.getY(), shape.getWidth(), shape.getHeight()));
        
             // render image
        if ( img != null ) {            
            double w = size * img.getWidth(null);
            double h = size * img.getHeight(null);
            double ix=x, iy=y;
            
            // determine one co-ordinate based on the image position
            switch ( m_imagePos ) {
            case Constants.LEFT:
                x += w + size*m_imageMargin;
                break;
            case Constants.RIGHT:
                ix = shape.getMaxX() - size*m_horizBorder - w;
                break;
            case Constants.TOP:
                y += h + size*m_imageMargin;
                break;
            case Constants.BOTTOM:
                iy = shape.getMaxY() - size*m_vertBorder - h;
                break;
            default:
                throw new IllegalStateException(
                        "Unrecognized image alignment setting.");
            }
            
            // determine the other coordinate based on image alignment
            switch ( m_imagePos ) {
            case Constants.LEFT:
            case Constants.RIGHT:
                // need to set image y-coordinate
                switch ( m_vImageAlign ) {
                case Constants.TOP:
                    break;
                case Constants.BOTTOM:
                    iy = shape.getMaxY() - size*m_vertBorder - h;
                    break;
                case Constants.CENTER:
                    iy = shape.getCenterY() - h/2;
                    break;
                }
                break;
            case Constants.TOP:
            case Constants.BOTTOM:
                // need to set image x-coordinate
                switch ( m_hImageAlign ) {
                case Constants.LEFT:
                    break;
                case Constants.RIGHT:
                    ix = shape.getMaxX() - size*m_horizBorder - w;
                    break;
                case Constants.CENTER:
                    ix = shape.getCenterX() - w/2;
                    break;
                }
                break;
            }
            
            if ( useInt && size == 1.0 ) {
                // if possible, use integer precision
                // results in faster, flicker-free image rendering
                g.drawImage(img, (int)ix, (int)iy, null);
            } else {
                m_transform.setTransform(size,0,0,size,ix,iy);
                g.drawImage(img, m_transform, null);
            }
        }
        
        // render text
        int textColor = item.getTextColor();
        if ( text != null && ColorLib.alpha(textColor) > 0 ) {
            g.setPaint(ColorLib.getColor(textColor));
            g.setFont(m_font);
            FontMetrics fm = DEFAULT_GRAPHICS.getFontMetrics(m_font);

            // compute available width
            double tw;
            switch ( m_imagePos ) {
            case Constants.TOP:
            case Constants.BOTTOM:
                tw = shape.getWidth() - 2*size*m_horizBorder;
                break;
            default:
                tw = m_textDim.width;
            }
            
            // compute available height
            double th;
            switch ( m_imagePos ) {
            case Constants.LEFT:
            case Constants.RIGHT:
                th = shape.getHeight() - 2*size*m_vertBorder;
                break;
            default:
                th = m_textDim.height;
            }
            
            // compute starting y-coordinate
            y += fm.getAscent();
            switch ( m_vTextAlign ) {
            case Constants.TOP:
                break;
            case Constants.BOTTOM:
                y += th - m_textDim.height;
                break;
            case Constants.CENTER:
                y += (th - m_textDim.height)/2;
            }
            
            // render each line of text
            int lh = fm.getHeight(); // the line height
            int start = 0, end = text.indexOf(m_delim);
            for ( ; end >= 0; y += lh ) {
                drawString(g, fm, text.substring(start, end), useInt, x, y, tw, item.getBounds().getCenterX(), item.getBounds().getCenterY(), 0);
                start = end+1;
                end = text.indexOf(m_delim, start);   
            }
            drawString(g, fm, text.substring(start), useInt, x, y, tw, item.getBounds().getCenterX(),item.getBounds().getCenterY(), 0);
        }
        // draw border
        if (type==RENDER_TYPE_DRAW || type==RENDER_TYPE_DRAW_AND_FILL) {
            GraphicsLib.paint(g,item,shape,getStroke(item),RENDER_TYPE_DRAW);
        }
        g.setTransform(oldTrans);
        
 	   //TODO: tests
      //  g.drawRect((int)item.getBounds().getX(), (int)item.getBounds().getY(), (int)item.getBounds().getWidth(), (int)item.getBounds().getHeight());
    }
    
    /**
     * Return the graphics space transform applied to this item's shape, based on rotation.
     * 
     * CMC test code Dec 17, 2006
     * 
     * @param item the VisualItem
     * @return the graphics space transform, or null if none
     */
    protected AffineTransform getTransform(VisualItem item) {
    	/*if (!item.canGetDouble("rotation")) { 
    		return null;
    	}*/
        
        // assume shape has just been calculated and stored
        itemRawShape = (RectangularShape)getRawShape(item);
    	
    	itemTransform.setToIdentity();
    	
    	if ((itemRotation > 90) && (itemRotation < 270)) 
    		itemRotation += 180;
    	
    	itemTransform.rotate(itemRotation* 2*Math.PI/360, itemRawShape.getX(), itemRawShape.getY()+itemRawShape.getHeight());
        return itemTransform;
    }
    
    private final void drawString(Graphics2D g, FontMetrics fm, String text,
            boolean useInt, double x, double y, double w, double cx, double cy, double rotation)
    {
        // compute the x-coordinate
        double tx;
        switch ( m_hTextAlign ) {
        case Constants.LEFT:
            tx = x;
            break;
        case Constants.RIGHT:
            tx = x + w - fm.stringWidth(text);
            break;
        case Constants.CENTER:
            tx = x + (w - fm.stringWidth(text)) / 2;
            break;
        default:
            throw new IllegalStateException(
                    "Unrecognized text alignment setting.");
        }
        
        if (rotation != 0) {
        	AffineTransform oldTrans = g.getTransform();
        	if ((rotation > 90) && (rotation < 270)) 
        		rotation += 180;
        	g.rotate(rotation* 2*Math.PI/360, cx, cy);
        	
        	if ( useInt ) {
        		g.drawString(text, (int)tx, (int)y);
        	} else {
        		g.drawString(text, (float)tx, (float)y);
        	}
         
        	g.setTransform(oldTrans);
        } else {
        	if ( useInt ) {
        		g.drawString(text, (int)tx, (int)y);
        	} else {
        		g.drawString(text, (float)tx, (float)y);
        	}
        }
    }
    
    /**
     * Returns the image factory used by this renderer.
     * @return the image factory
     */
    public ImageFactory getImageFactory() {
        if ( m_images == null ) m_images = new ImageFactory();
        return m_images;
    }
    
    /**
     * Sets the image factory used by this renderer.
     * @param ifact the image factory
     */
    public void setImageFactory(ImageFactory ifact) {
        m_images = ifact;
    }
    
    // ------------------------------------------------------------------------
    
    /**
     * Get the horizontal text alignment within the layout. One of
     * {@link prefuse.Constants#LEFT}, {@link prefuse.Constants#RIGHT}, or
     * {@link prefuse.Constants#CENTER}. The default is centered text.
     * @return the horizontal text alignment
     */
    public int getHorizontalTextAlignment() {
        return m_hTextAlign;
    }
    
    /**
     * Set the horizontal text alignment within the layout. One of
     * {@link prefuse.Constants#LEFT}, {@link prefuse.Constants#RIGHT}, or
     * {@link prefuse.Constants#CENTER}. The default is centered text.
     * @param halign the desired horizontal text alignment
     */
    public void setHorizontalTextAlignment(int halign) {
        if ( halign != Constants.LEFT &&
             halign != Constants.RIGHT &&
             halign != Constants.CENTER )
           throw new IllegalArgumentException(
                   "Illegal horizontal text alignment value.");
        m_hTextAlign = halign;
    }
    
    /**
     * Get the vertical text alignment within the layout. One of
     * {@link prefuse.Constants#TOP}, {@link prefuse.Constants#BOTTOM}, or
     * {@link prefuse.Constants#CENTER}. The default is centered text.
     * @return the vertical text alignment
     */
    public int getVerticalTextAlignment() {
        return m_vTextAlign;
    }
    
    /**
     * Set the vertical text alignment within the layout. One of
     * {@link prefuse.Constants#TOP}, {@link prefuse.Constants#BOTTOM}, or
     * {@link prefuse.Constants#CENTER}. The default is centered text.
     * @param valign the desired vertical text alignment
     */
    public void setVerticalTextAlignment(int valign) {
        if ( valign != Constants.TOP &&
             valign != Constants.BOTTOM &&
             valign != Constants.CENTER )
            throw new IllegalArgumentException(
                    "Illegal vertical text alignment value.");
        m_vTextAlign = valign;
    }
    
    /**
     * Get the horizontal image alignment within the layout. One of
     * {@link prefuse.Constants#LEFT}, {@link prefuse.Constants#RIGHT}, or
     * {@link prefuse.Constants#CENTER}. The default is a centered image.
     * @return the horizontal image alignment
     */
    public int getHorizontalImageAlignment() {
        return m_hImageAlign;
    }
    
    /**
     * Set the horizontal image alignment within the layout. One of
     * {@link prefuse.Constants#LEFT}, {@link prefuse.Constants#RIGHT}, or
     * {@link prefuse.Constants#CENTER}. The default is a centered image.
     * @param halign the desired horizontal image alignment
     */
    public void setHorizontalImageAlignment(int halign) {
        if ( halign != Constants.LEFT &&
             halign != Constants.RIGHT &&
             halign != Constants.CENTER )
           throw new IllegalArgumentException(
                   "Illegal horizontal text alignment value.");
        m_hImageAlign = halign;
    }
    
    /**
     * Get the vertical image alignment within the layout. One of
     * {@link prefuse.Constants#TOP}, {@link prefuse.Constants#BOTTOM}, or
     * {@link prefuse.Constants#CENTER}. The default is a centered image.
     * @return the vertical image alignment
     */
    public int getVerticalImageAlignment() {
        return m_vImageAlign;
    }
    
    /**
     * Set the vertical image alignment within the layout. One of
     * {@link prefuse.Constants#TOP}, {@link prefuse.Constants#BOTTOM}, or
     * {@link prefuse.Constants#CENTER}. The default is a centered image.
     * @param valign the desired vertical image alignment
     */
    public void setVerticalImageAlignment(int valign) {
        if ( valign != Constants.TOP &&
             valign != Constants.BOTTOM &&
             valign != Constants.CENTER )
            throw new IllegalArgumentException(
                    "Illegal vertical text alignment value.");
        m_vImageAlign = valign;
    }
    
    /**
     * Get the image position, determining where the image is placed with
     * respect to the text. One of {@link Constants#LEFT},
     * {@link Constants#RIGHT}, {@link Constants#TOP}, or
     * {@link Constants#BOTTOM}.  The default is left.
     * @return the image position
     */
    public int getImagePosition() {
        return m_imagePos;
    }
    
    /**
     * Set the image position, determining where the image is placed with
     * respect to the text. One of {@link Constants#LEFT},
     * {@link Constants#RIGHT}, {@link Constants#TOP}, or
     * {@link Constants#BOTTOM}.  The default is left.
     * @param pos the desired image position
     */
    public void setImagePosition(int pos) {
        if ( pos != Constants.TOP &&
             pos != Constants.BOTTOM &&
             pos != Constants.LEFT &&
             pos != Constants.RIGHT &&
             pos != Constants.CENTER )
           throw new IllegalArgumentException(
                   "Illegal image position value.");
        m_imagePos = pos;
    }
    
    // ------------------------------------------------------------------------
    
    /**
     * Get the horizontal alignment of this node with respect to its
     * x, y coordinates.
     * @return the horizontal alignment, one of
     * {@link prefuse.Constants#LEFT}, {@link prefuse.Constants#RIGHT}, or
     * {@link prefuse.Constants#CENTER}.
     */
    public int getHorizontalAlignment() {
        return m_xAlign;
    }
    
    /**
     * Get the vertical alignment of this node with respect to its
     * x, y coordinates.
     * @return the vertical alignment, one of
     * {@link prefuse.Constants#TOP}, {@link prefuse.Constants#BOTTOM}, or
     * {@link prefuse.Constants#CENTER}.
     */
    public int getVerticalAlignment() {
        return m_yAlign;
    }
    
    /**
     * Set the horizontal alignment of this node with respect to its
     * x, y coordinates.
     * @param align the horizontal alignment, one of
     * {@link prefuse.Constants#LEFT}, {@link prefuse.Constants#RIGHT}, or
     * {@link prefuse.Constants#CENTER}.
     */ 
    public void setHorizontalAlignment(int align) {
        m_xAlign = align;
    }
    
    /**
     * Set the vertical alignment of this node with respect to its
     * x, y coordinates.
     * @param align the vertical alignment, one of
     * {@link prefuse.Constants#TOP}, {@link prefuse.Constants#BOTTOM}, or
     * {@link prefuse.Constants#CENTER}.
     */ 
    public void setVerticalAlignment(int align) {
        m_yAlign = align;
    }
    
    /**
     * Returns the amount of padding in pixels between the content 
     * and the border of this item along the horizontal dimension.
     * @return the horizontal padding
     */
    public int getHorizontalPadding() {
        return m_horizBorder;
    }
    
    /**
     * Sets the amount of padding in pixels between the content 
     * and the border of this item along the horizontal dimension.
     * @param xpad the horizontal padding to set
     */
    public void setHorizontalPadding(int xpad) {
        m_horizBorder = xpad;
    }
    
    /**
     * Returns the amount of padding in pixels between the content 
     * and the border of this item along the vertical dimension.
     * @return the vertical padding
     */
    public int getVerticalPadding() {
        return m_vertBorder;
    }
    
    /**
     * Sets the amount of padding in pixels between the content 
     * and the border of this item along the vertical dimension.
     * @param ypad the vertical padding
     */
    public void setVerticalPadding(int ypad) {
        m_vertBorder = ypad;
    }
    
    /**
     * Get the padding, in pixels, between an image and text.
     * @return the padding between an image and text
     */
    public int getImageTextPadding() {
        return m_imageMargin;
    }
    
    /**
     * Set the padding, in pixels, between an image and text.
     * @param pad the padding to use between an image and text
     */
    public void setImageTextPadding(int pad) {
        m_imageMargin = pad;
    }
    
} // end of class LabelRenderer

