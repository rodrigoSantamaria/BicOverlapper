package es.usal.bicoverlapper.model.geometry;


/**
 * 2D Point with some operations implemented
 * TODO: Mejor que usar esta usar Point2D.Double. Si acaso, cambiarla a int o short
 * @author Roberto Therón
 */
public class GraphPoint2D implements GraphPoint{
	public double x;
	public double y;
	
	
  	/**
  	 * Default constructor at position (0,0)
  	 *
  	 */
	public GraphPoint2D() {
	
		x = 0.0;
		y = 0.0;
	}

	/**
	 * Constructor that set position of the point to (x,y)
	 * @param x	x coordinate
	 * @param y	y coordinate
	 */
	public GraphPoint2D(double x, double y) {
		
		this.x = x;
		this.y = y;
  	}

	
	/**
	 * Returns the x coordinate for this point
	 * @return 	x coordinate
	 */
	public double getX() {
	
		return x;
		
	}
	
	/**
	 * Returns the y coordinate for this point
	 * @return 	y coordinate
	 */
	public double getY() {
		
		return y;
		
	}
	

	/**
	 * Sets the x coordinate for this point
	 * @param x_	x coordinate
	 */
	public void setX(double x_) {
		
		x = x_;
	
	}
	
	/**
	 * Sets the y coordinate for this point
	 * @param y_	y coordinate
	 */
	public void setY(double y_) {
		
		y = y_;
	
	}

	/**
	 * Sets the new coordinates of this point
	 * @param x_	x coordinate
	 * @param y_	y coordinate
	 */
	public void setXY(double x, double y) {
		this.x = x;
		this.y = y;
		}
	
	/**
	 * Sets the new coordinates of this point to the ones of the point passed as parameter
	 * @param v	point with the new coordinates for this point
	 */
	public void setPoint(GraphPoint v) {
	
		x = v.getX();
		y = v.getY();
	}
	
	
	public float magnitude() {
	
		return (float)Math.sqrt( x * x + y * y);
		
	}

	
	/**
	 * Adds two GraphPoint coordinates
	 * @param v	The point to add to this one
	 */
	public void add(GraphPoint2D v)
		{
		x+=v.getX();
		y+=v.getY();
		}

	/**
	 * Substracts two GraphPoint coordinates
	 * @param v	The point to subtract to this one
	 */
	public GraphPoint2D substract(GraphPoint2D v) {
		
		return new GraphPoint2D(x - v.getX(), y - v.getY());
		
	}

	
	public GraphPoint2D multiply(float n) {
	
		return new GraphPoint2D(x * n, y * n);
		
	}
	

	
	public void divide(float n)
		{
		x/=n;
		y/=n;
		}

	
	public void normalize() {
	
		float m = magnitude();
		
		x = x / m;
		y = y / m;
	}
	
	
	public void invert()
		{
		x=-x;
		y=-y;
		}
	}
	
