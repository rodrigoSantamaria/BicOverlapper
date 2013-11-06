package es.usal.bicoverlapper.model.geometry;

/**
 * Interface for 2D Point implementation with some operations
 * @author Roberto Therón
 *
 */
public interface GraphPoint {
	
	/**
	 * Returns the x coordinate for this point
	 * @return the x coordinate for this point	
	 */
	double getX();
	
	/**
	 * Returns the y coordinate for this point
	 * @return the y coordinate for this point	
	 */
	double getY();
	
	/**
	 * Sets the x coordinate
	 * @param x	x coordinate
	 */
	void setX(double x);
	
	/**
	 * Sets the y coordinate
	 * @param y	y coordinate
	 */
	void setY(double y);

	/**
	 * Returns the distance from the origin of coordinates
	 * @return the distance from the origin of coordinates
	 */
	float magnitude();
	/**
	 * Multiplies coordinates by an scalar
	 * @param n multiplier
	 */
	GraphPoint multiply(float n);
	
	/**
	 * Divides the coordinates of the point by an scalar
	 * @param n division scalar
	 */
	void divide(float n);
	
	
	/**
	 * Divides the coordinates of the point by the distant to the origin of coordinates
	 */
	void normalize();
	
	/**
	 * Inverts the coordinates of the point
	 */
	void invert();
	
}
