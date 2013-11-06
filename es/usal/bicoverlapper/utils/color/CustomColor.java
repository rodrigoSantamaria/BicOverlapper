package es.usal.bicoverlapper.utils.color;

import java.awt.Color;
import java.util.ArrayList;

/**
 * Customized Color class with transparency properties. TODO: to be converted in java.awt.Color extension
 * @author Roberto Theron and Rodrigo Santamaría
 *
 */
public class CustomColor {
  int r;
  int g;
  int b;
  int a;

  public static final int RED=7;
  public static final int BLUE=8;
  public static final int GREEN=9;
  public static final int YELLOW=10;
  public static final int ORANGE=1;
  public static final int BRIGHT_PURPLE=11;
  /**
   * Mix of pink and red
   */
  public static final int FUCSIA=12;
  /**
   * A bright mix of green and blue
   */
  public static final int SPINDRIFT=2;
  /**
   * Mix of pink and orange
   */
  //public static final int SALMON=8;
  public static final int PINK=13;
  public static final int BRIGHT_BROWN=6;
 // public static final int BRIGHT_GREEN=11;
  public static final int CYAN=4;
  public static final int PURPLE=0;
  
  /**
   * Default constructor: black, transparent
   */
  public CustomColor() {
    r=g=b=a=0;
  }
  
  /**
   * Initializes to the specified color in RGB coordinates
   * @param red - Red coordinate (scale from 0 to 255, 256 mean 0 again)
   * @param blue - Blue coordinate (scale from 0 to 255, 256 mean 0 again)
   * @param green - Green coordinate (scale from 0 to 255, 256 mean 0 again)
   * @param alpha - Degree of transparency (0 means invisible, 255 solid)
   */
  public CustomColor(int red, int green, int blue, int alpha) {
	    r = red;
	    g = green;
	    b = blue;
	    a = alpha;
	  }
  
  /**
   * Builds a CustomColor from the color components of java.awt.Color
   * @param c java.awtColor from which we take the color components
   */
  public CustomColor(java.awt.Color c)
	{
	  r=c.getRed();
	  g=c.getGreen();
	  b=c.getBlue();
	  a=20;
	  
	}
  /**
   * Returns the red component
   * @return	A number from 0 (no red) to 255 (full red)
   */
  public int getR() {
	    return r;
	  }
  /**
   * Setter for red coordinate
   * @param red from 0 (black) to 255 (red)
   */
  public void setR(int red) {
	    r = red;
	  }
  
  /**
   * Returns the green component
   * @return	A number from 0 (no green) to 255 (full green)
   */
  public int getG() {
	    return g;
	  }
  /**
   * Setter for green coordinate
   * @param green from 0 (black) to 255 (green)
   */
  public void setG(int green) {
	    g = green;
	  }
  
  /**
   * Returns the blue component
   * @return	A number from 0 (no blue) to 255 (full blue)
   */
 public int getB() {
	    return b;
	  }

  /**
   * Setter for blue coordinate
   * @param blue from 0 (black) to 255 (blue)
   */
  public void setB(int blue) {
	    b = blue;
	  }

  /**
   * Returns the alpha (transparency) component
   * @return	A number from 0 (transparent) to 255 (opaque)
   */
  public int getA() {
	    return a;
	  }

  /**
   * Setter for the degree of transparency
   * @param alpha Degree of transparency from 0 (invisible) to 255 (solid)
   */
  public void setA(int alpha) {
	    a = alpha;
	  }
  
  /**
   * Returns the opposite color to an ArrayList of Colors. All Color coordinates in the array are added, and then the opposite is built. 
   * Transparency is not considered.
   * @param used ArrayList with colors to add and get its opposite color
   * @return the opposite color to a list of colors
   */
  public CustomColor getOppositeColorToList(ArrayList used) {
	  CustomColor c = new CustomColor();
	  CustomColor o = new CustomColor();
	  
	  for (int i = 0; i < used.size(); i++){
		c.addColor((CustomColor)used.get(i));  
	  }
		
	  o.getOppositeColor(c); 
	  
	  return o; 
	}
  
  /**
   * Adds the color RGB coordinates of Color c to this Color. 
   * If resulting coordinates exceed 255 we restart at 0. Transparency is not added.
   * @param c - Color to be added
   */
  public void addColor(CustomColor c) {
	  
	  r += c.getR();
	  r = r % 256;
	  
	  g += c.getG();
	  g = g % 256;
	  
	  b += c.getR();
	  b = b % 256;
	}
  
  /**
   * Gets the opposite solid color to color c (transparency not considered)
   * @param c Color to obtain the opposite
   * @return The opposite color
   */
  public CustomColor getOppositeColor(CustomColor c) {
	  CustomColor o = new CustomColor();
	  
	  o.setR(256 - c.getR());
	  o.setG(256 - c.getG());
	  o.setB(256 - c.getB());
	  
	  return o;
	}
  
  
  /**
   * Returns a color with one of the color identifiers defined
   * @param n Identifier of the color to obtain
   * @return the corresponding color
   */
  
  /*
   * NOTE: the best color from Ware1999 (p 126) are
   * Red, Green, Yellow, Blue, Black, White
   * Pink, Cyan, Gray, Orange, Brown, Purple
   * The first set of six must be chosen prior to the
   * second set.
   */
  public static Color getGoodColor(int n)
  	{
	  int max=12;
	 /* int  colors[][]  = {		//The exact ones from Ware2004
				  {240,78,82},//red
				  {247,230,92},//yellow
					  {55,53,53},//black
				 	{113,192,97},//green
		           	  {54,100,173},//blue
				  {255,255,255},//white
				  
				  {242,150,178},//pink
	              {158, 162, 152},//grey
		             {179, 71, 64},//dark red
		             {133, 209, 210},//spindrift blue
	                  {248,161,98},//orange
	              {162,75,150},//purple
	                        };
		  */
	
	  
	  //Exact colors from Ware2004
	  int colors[][]={
			  {162,75,150},//purple
			 	{80,82,217},//pale blue
			  	{194,176,41},//pale yellow
			 	{113,192,97},//green
			 	{179, 71, 64},//dark red
			 	{242,150,178},//pink
			 	{158, 162, 152},//grey
			 	{133, 209, 210},//spindrift blue
			 	{55,53,53},//black
		    	{255,255,255},//white
		    	{247,230,92},//yellow
				{240,78,82}};//red
		    	
	  
	  int r = colors[n%max][0];
	  int g = colors[n%max][1];
	  int b = colors[n%max][2];
	  int a = 100;
	  return new Color(r,g,b,a);
  
  	}

  /**
   * Returns a color with one of the color identifiers defined
   * @param n Identifier of the color to obtain
   * @return the corresponding color
   */
  public static CustomColor getGoodCustomColor(int n) 
  	{
	 	  /* COLORES PRIMARIOS */
	  int max=14;
	 
	  int  colors[][]  = {
			  {153,74,237},//morado
			  {254,127,13},//orange
			  {49,79,79},
			 	{244,238,224},//honeydew
	           	  {200,100,255},//azul cielo
			  {153,74,237},//morado
			  {240,189,139},//marrón claro
              {200, 0, 0},//red
	             {0, 0, 200},//blue
	             {0, 200, 0},//green
                  {255,199,38},//yellow
              {170,177,206},//malva
              {199,30,199}, //fucsia
           	{255,168,251}, //pink
                        };
	  
	  
	  int r = colors[n%max][0];
	  int g = colors[n%max][1];
	  int b = colors[n%max][2];
	  int a = 20;
	  return new CustomColor(r,g,b,a);
	}
}