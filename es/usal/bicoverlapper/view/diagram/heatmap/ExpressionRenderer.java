package es.usal.bicoverlapper.view.diagram.heatmap;

import java.awt.Shape;
import java.awt.geom.Rectangle2D;

import prefuse.Constants;
import prefuse.render.AbstractShapeRenderer;
import prefuse.visual.VisualItem;

/**
 * This class extends prefuse's AbstractShapeRenderer to represent microarray grids,
 * allowing the distortion of the size of rows and columns
 * @author Rodrigo Santamaria
 *
 */
class ExpressionRenderer extends AbstractShapeRenderer {

	private double m_baseHeight = 10;
	private double m_baseWidth = 10;
	private double endBaseHeight = 10;
	private double endBaseWidth = 10;
	private double[] baseHeights;
	private double[] baseWidths;
	private double[] endBaseHeights;
	private double[] endBaseWidths;
    
    private Rectangle2D m_rect = new Rectangle2D.Double();
    
    /**
     * Creates a new ExpressionRenderer with given number of rows, columns and
     * maximum size for the whole diagram.
     * @param numRows	the number of rows in the microarray heatmap checkerboard structure
     * @param numCols	the number of columns in the microarray heatmap checkerboard structure
     * @param totalHeight	total height of the diagram. Initially, each square will hava a height of totalHeight/numRows
     * @param totalWidth	total width of the diagram. Initially, each square will hava a width of totalWidth/numRows
     * 
     */
    public ExpressionRenderer(int numRows, int numCols, double totalHeight, double totalWidth) {
        m_baseHeight=totalHeight/numRows;
        m_baseWidth =totalWidth/numCols;
        endBaseHeight=totalHeight/numRows;
        endBaseWidth =totalWidth/numCols;
        baseHeights=new double[numRows];
        baseWidths=new double[numCols];
        endBaseHeights=new double[numRows];
        endBaseWidths=new double[numCols];
        for(int i=0;i<numRows;i++)	baseHeights[i]=endBaseHeights[i]=m_baseHeight;
        for(int i=0;i<numCols;i++)	baseWidths[i]=endBaseWidths[i]=m_baseWidth;
    }
    
    /**
     * Returns an square of the adequate dimensions for an item.
     * It takes field "colId" and "rowId" from the VisualItem to
     * determine the position of the square in the heatmap and
     * thus assign to it width and height
     * @param	item	VisualItem we want to get its shape
     * @see prefuse.render.AbstractShapeRenderer#getRawShape(prefuse.visual.VisualItem)
     */
//    protected Shape getRawShape(VisualItem item) {
    public Shape getRawShape(VisualItem item) {
    	        int stype = item.getShape();
        double x = item.getX();
        if ( Double.isNaN(x) || Double.isInfinite(x) )
            x = 0;
        double y = item.getY();
        if ( Double.isNaN(y) || Double.isInfinite(y) )
            y = 0;
        double width = baseWidths[item.getInt("colId")];
        double height = baseHeights[item.getInt("rowId")];
        
        switch ( stype ) {
        case Constants.SHAPE_NONE:
            return null;
        case Constants.SHAPE_RECTANGLE:
            return rectangle(x, y, width, height);//Esto es lo que importa, no los bounds
        default:
            throw new IllegalStateException("Unknown shape type: "+stype);
        }
    }

    /**
     * Returns a rectangle of the given dimensions.
     */
    public Shape rectangle(double x, double y, double width, double height) {
        m_rect.setFrame(x, y, width, height);
        return m_rect;
    }

    /**
     * Returns the basic height for a square in the checkerboard, when all squares have
     * the same size (that is, layoutHeight/numRows)
     */
    /*
	public double getBaseHeight() {
		return m_baseHeight;
	}
*/
    /**
     * Returns the basic width for a square in the checkerboard, when all squares have
     * the same size (that is, layoutWidth/numCols)
     */
	/*public double getBaseWidth() {
		return m_baseWidth;
	}
*/
	public void setHeight(double height, int i) {//a estos dos métodos son a los que hay que llamar para que me haga bien el ojo de pez
		if(height>0)	baseHeights[i] = height;
		else			System.err.println("Trying to set a negative size");
		}

	public double getHeight(int i) {//a estos dos métodos son a los que hay que llamar para que me haga bien el ojo de pez
		return baseHeights[i];
	}

	public double getWidth(int i) {//a estos dos métodos son a los que hay que llamar para que me haga bien el ojo de pez
		return baseWidths[i];
	}

	public void setWidth(double width, int i) {
		if(width>0)	baseWidths[i] = width;
		else			System.err.println("Trying to set a negative width");
	}

	/**
	 * Sets all the row heights and column widths to the base height and width
	 *
	 */
	public void restoreDimensions()
		{
		for(int i=0;i<baseWidths.length;i++)	baseWidths[i]=endBaseWidth;
		for(int i=0;i<baseHeights.length;i++)	baseHeights[i]=endBaseHeight;
		}
	
   /**
     * Returns the basic height for a square in the checkerboard, when all squares have
     * the same size (that is, layoutHeight/numRows)
     */
	public double getEndBaseHeight() {
		return endBaseHeight;
	}

    /**
     * Returns the basic width for a square in the checkerboard, when all squares have
     * the same size (that is, layoutWidth/numCols)
     */
	public double getEndBaseWidth() {
		return endBaseWidth;
	}
    
} // end of class ExpressionRenderer

