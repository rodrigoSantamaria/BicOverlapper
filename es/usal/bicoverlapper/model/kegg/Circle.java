package es.usal.bicoverlapper.model.kegg;

import java.awt.Point;

/**
 * Circle is used to save the attributes of circle elements in Kegg image
 * 
 * @author Carlos Martín Casado
 *
 */
public class Circle{ 
    private Point center;
    private double radius;

    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    /**
     * Determinate if a point is inside
     * @param p Point to check
     * @return True if point is inside, false otherwise
     */
    public boolean contains(Point p){  
    	double dx = Math.abs(p.getX()-center.getX());
		double dy = Math.abs(p.getY()-center.getY());
		
		if(Math.pow(dx, 2) + Math.pow(dy, 2) <= Math.pow(radius, 2))
			return true;
		else
			return false;
    }

    /**
     * Calculate the area
     * @return area
     */
    public double area(){ 
    	return Math.PI * radius * radius; 
    }

    /**
     * Calculate the perimeter
     * @return perimeter
     */
    public double perimeter(){ 
    	return 2 * Math.PI * radius;    
	}

	/**
	 * @return the center
	 */
	public Point getCenter() {
		return center;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param center the center to set
	 */
	public void setCenter(Point center) {
		this.center = center;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
}

