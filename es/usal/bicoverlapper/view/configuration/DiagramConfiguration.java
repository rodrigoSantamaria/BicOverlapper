package es.usal.bicoverlapper.view.configuration;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Vector;

import es.usal.bicoverlapper.view.diagram.Diagram;



/**
 * Class for the Configuration of a Window containing a {@link Diagram}.
 * This configuration is mainly used to change colors of the different objects in the diagrams
 * (axes, points, labels, etc).
 * 
 * This includes: position of the window in the desktop, dimension of the window, name used as title for the window
 * 	and identifier of the kind of diagram in this window
 * 
 * 
 * @author Javier Molpeceres
 */
public class DiagramConfiguration {
	
	private int identificador;
	private String nombre;
	private int posX, posY;
	private Dimension size;
	
	private Vector<Color> paleta;
	private Vector<String> anclajes;
	
	/**
	 * Builds a window configuration.
	 * 
	 * @param id Identifier of the kind of diagram to which this ConfigurationWindow refers
	 * @param name Name (title) of the window
	 * @param posX X coordinate of the top-left point of the window
	 * @param posY Y coordinate of the top-left point of the window
	 * @param dim Dimension of the window
	 */
	public DiagramConfiguration(int id, String name, int posX, int posY, Dimension dim){
		this.identificador = id;
		this.nombre = name;
		this.posX = posX;
		this.posY = posY;
		this.size = dim;
		
		paleta = new Vector<Color>(0,1);
		anclajes = new Vector<String>(0,1);
	}
	
	/**
	 * Returns the identifier of the Diagram contained in the window
	 * 
	 * @return the identifier of the Diagram contained in the window
	 */
	public int getId(){
		return this.identificador;
	}
	
	/**
	 * Returns the title of the configuration window
	 * 
	 * @return the title of the configuration window
	 */
	public String getTitle(){
		return this.nombre;
	}
	
	/**
	 * Returns the X coordinate of the top-left corner of the window
	 * 
	 * @return X coordinate of the top-left corner of the window
	 */
	public int getPosX(){
		return this.posX;
	}
	
	/**
	 * Returns the Y coordinate of the top-left corner of the window
	 * 
	 * @return Y coordinate of the top-left corner of the window
	 */
	public int getPosY(){
		return this.posY;
	}
	
	/**
	 * Returns the window dimension
	 * 
	 * @return {@link Dimension} of the window
	 */
	public Dimension getDim(){
		return this.size;
	}
	
	/**
	 * Returns the number of components with different color in the Diagram contained by the window
	 * STILL IN DEVELOPMENT
	 * @return Number of components of the palette
	 */
	public int getNumberOfColors(){
		return this.paleta.size();
	}
	
	/**
	 * Returns the number of hooks for this window.
	 * A hook is used to tell wich windows must be updated if changes in this window occur
	 * STILL IN DEVELOPMENT
	 * 
	 * @return number of hooks for this window
	 */
	public int getNumberOfHooks(){
		return this.anclajes.size();
	}
	
	/**
	 * Checks if this window has hooks
	 * STILL IN DEVELOPMENT
	 * @return true if the window has any hook, false otherwise
	 */
	public boolean areHooks(){
		return !anclajes.isEmpty();
	}
	
	/**
	 * Gets the i color from the palette
	 * STILL IN DEVELOPMENT
	 * @param i index of the color required
	 * @return Color required
	 */
	public Color getColor(int i){
		return (Color)this.paleta.get(i);
	}
	
	/**
	 * Returns the i hook for this window
	 * STILL IN DEVELOPMENT
	 * @param i index of the hook required
	 * @return String with the name of the window with hooked at index i
	 */
	public String getHook(int i){
		return (String)this.anclajes.get(i);
	}
	
	/**
	 * Adds a color to the palette
	 * 
	 * @param col Color to add
	 */
	public void addColor(Color col){
		paleta.add(col);
	}
	
	/**
	 * Adds a hook to the hook list
	 * STILL IN DEVELOPMENT
	 * 
	 * @param anclaje String name of the DiagramWindow to add
	 */
	public void addHook(String anclaje){
		anclajes.add(anclaje);
	}
}