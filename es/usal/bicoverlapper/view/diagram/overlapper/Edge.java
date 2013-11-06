package es.usal.bicoverlapper.view.diagram.overlapper;

import java.awt.Color;


/**
 * Edge class connects two nodes by a directed edge.
 * @author Roberto Therón & Rodrigo Santamaría
 *
 */
public class Edge {
  Node to;
  Node from;
  Graph g;
  int width=0;
  
  public Edge()	{}
  
  /**
   * Builds an edge
   * @param f	source node
   * @param t	target node
   */
  public Edge(Node f, Node t) {
    to = t;
    from = f;
  }
  
  /**
   * Sets the graph in which this edge is in
   * @param h	Graph in which this edge is in
   */
  public void setGraph(Graph h) {
    g = h;
  }
  
  /**
   * Draws the edge from as a line from source node to target node
   *
   */
  public void draw() {
	Overlapper p=g.getApplet();
	Color c=p.paleta[Overlapper.foregroundColor];
	p.stroke(c.getRed(),c.getGreen(),c.getBlue(),128);
  //p.stroke(255);
    if(width<0)	width=0;
    p.strokeWeight(width);
    p.line((float) from.getX(), (float) from.getY(), (float) to.getX(), (float) to.getY());
  }
  
  /**
   * Gets the target node of this edge
   * @return	the target node of this edge
   */
  public Node getTo() {
    return to;
  }
  
  /**
   * Gets the source node of this edge
   * @return	the soruce node
   */
  public Node getFrom() {
    return from;
  }
  
  /**
   * Sets the target node of this edge
   * @param n	target Node
   */
  public void setTo(Node n) {
    to = n;
  }
  
  /**
   * Sets the source node of this edge
   * @param n source @link Node
   */
  public void setFrom(Node n) {
    from = n;
  }
  
  /**
   * Gets the distantce in x axis between the source and the target node, that is, the x length of the edge
   * @return	the distance in x axis between the connected nodes
   */
  public double dX() {
    return (float) (to.getX() - from.getX());
  }
  
  /**
   * Gets the distantce in y axis between the source and the target node, that is, the y length of the edge
   * @return	the distance in y axis between the connected nodes
   */
  public double dY() {
    return (float) (to.getY() - from.getY());
  }
  
  public double length()
  	{
	  double dy=dY();
	  double dx=dX();
	  return(Math.sqrt(dx*dx+dy*dy));
  	}
    
}
