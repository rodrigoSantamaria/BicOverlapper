package es.usal.bicoverlapper.controller.kegg;

import java.awt.Point;
import java.awt.geom.Rectangle2D;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.text.MutableAttributeSet;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;

import es.usal.bicoverlapper.model.kegg.Circle;
import es.usal.bicoverlapper.model.kegg.KEGGElement;
import es.usal.bicoverlapper.model.kegg.LinkItem;

/**
 * Extract links from HTML
 * 
 * @author Carlos Martín Casado
 */
public class ExtractLinks {

	private List<KEGGElement> keggElements;

	/**
	 * Swing HTMLEditorKit Parser
	 */
	class ParserHTML extends HTMLEditorKit.ParserCallback {
		private static final int SIZE = 128;
		private static final int INSIDE_LINK = 0;
		private static final int OUTSIDE_LINK = 1;
		private int state = OUTSIDE_LINK;
		private List<LinkItem> links;
		private String href;
		private String title;
		private String shape;
		private String coords;
		private StringBuilder text;

		public ParserHTML(List<LinkItem> links) {
			this.links = links; //pass in our list
		}

		@Override
		public void handleStartTag(HTML.Tag tag, MutableAttributeSet attrSet, int pos) {
			if (tag == HTML.Tag.MAP) {  //check what kind of tag
				//get the attributes
				href = (String) attrSet.getAttribute(HTML.Attribute.HREF);
				title = (String) attrSet.getAttribute(HTML.Attribute.TITLE);
				text = new StringBuilder(SIZE);
				state = INSIDE_LINK;
			}
		}

		@Override
		public void handleText(char[] data, int pos) {
			if (state == INSIDE_LINK) {
				text.append(data);
			}
		}

		@Override
		public void handleEndTag(HTML.Tag tag, int pos) {
			if (tag == HTML.Tag.MAP && state == INSIDE_LINK) {
				LinkItem itm = new LinkItem();
				links.add(itm);
				
				state = OUTSIDE_LINK;
			}
		}
		
		@Override
        public void handleSimpleTag(HTML.Tag tag, MutableAttributeSet attrSet, int pos) 
        {
			//se comprueba el tipo de etiqueta
			if (tag == HTML.Tag.AREA) {
				//get the attributes
				href = (String) attrSet.getAttribute(HTML.Attribute.HREF);
				title = (String) attrSet.getAttribute(HTML.Attribute.TITLE);
				shape = (String) attrSet.getAttribute(HTML.Attribute.SHAPE);
				coords = (String) attrSet.getAttribute(HTML.Attribute.COORDS);
				text = new StringBuilder(SIZE);

				LinkItem itm = new LinkItem();
				itm.setLink("http://www.genome.jp"+href);
				itm.setTitle(title);
				itm.setShape(shape);
				itm.setCoords(coords);
				if(shape.equals("circle")){
					//los 2 primeros valores son el centro y el otro supongo que el radio
					itm.setCircle(createCircle(coords));
				}
				if(shape.equals("rect")){
					itm.setRectangle(createRectangle(coords));
				}
				
				//ahora se mapea lo que se lee del html con un keggElement
				//la forma de hacerlo es con el título y el campo names de kegg
				for (KEGGElement ke : keggElements) {					
					//si se encuentra alguna coincidencia, se setea el fg y el bg y se sale
					if(checkElement(title, ke.getNames())){
						itm.setFg(ke.getForeground());
						itm.setBg(ke.getBackground());
						itm.setGeneNames(ke.getNames());
						break;
					}
				}
				
				itm.setText(text.toString());
				links.add(itm);			
			}
        }
	}
	
	public ExtractLinks(List<KEGGElement> _keggElements){
		keggElements = _keggElements;
	}	
	
	/**
	 * Check if title contains the name of Kegg elements
	 * @param title
	 * @param names
	 * @return
	 */
	public boolean checkElement(String title, String[] names) {
		boolean contains = true;
		
		//en primer lugar hay que eliminar la parte anterior al caracter ":" ya que no siempre aparece esa parte anterior en el título
        for (int i = 0; i < names.length; i++) {
        	names[i] = names[i].substring(names[i].indexOf(":")+1);
        }
               
        for (int i = 0; i < names.length; i++) {
        	//System.out.println("names[i]="+names[i]+", title="+title);
            if(title.indexOf(names[i]) == -1)
            	contains = false;
        }
        
        return contains;
	}

	//revisar si debería hacer algún tratamiento por si acaso no fuesen 4 coordenadas
	//las coordenadas del rectángulo son 4, la primera indica la izquierda, la segunda la parte superior, la tercera la derecha y la cuarta la parte inferior
	/**
	 * Get Rectangle2D.Double of a list of coordinates
	 * @param coords Coordinates
	 * @return rectangle
	 */
	public Rectangle2D.Double createRectangle(String coords){
		StringTokenizer tk = new StringTokenizer(coords, ","); //El separador de los valores es ","
		double[] coordsList = new double[tk.countTokens()];
		int i=0;
		while(tk.hasMoreTokens()){
		  coordsList[i] = Double.parseDouble(tk.nextToken());
		  i++;
		}
		return new Rectangle2D.Double(coordsList[0], coordsList[1], (coordsList[2]-coordsList[0]), (coordsList[3]-coordsList[1]));
	}
	
	public Circle createCircle(String coords){
		StringTokenizer tk = new StringTokenizer(coords, ","); //El separador de los valores es ","
		double[] coordsList = new double[tk.countTokens()];
		int i=0;
		while(tk.hasMoreTokens()){
		  coordsList[i] = Double.parseDouble(tk.nextToken());
		  i++;
		}
		return new Circle(new Point((int) coordsList[0],(int) coordsList[1]), coordsList[2]);
	}	

	/**
	 * Get list of links from HTML string
	 * @param htmlContent HTML string
	 * @return List<Item>
	 * @throws Exception
	 */
	public List<LinkItem> getLinks(String htmlContent) throws Exception {
		List<LinkItem> links = new ArrayList<LinkItem>();
		Reader reader = new StringReader(htmlContent);
		new ParserDelegator().parse(reader, new ParserHTML(links), true);
		return links;
	}

	/**
	 * Get list of links from HTML string
	 * @param reader HTML reader
	 * @return List<Item>
	 * @throws Exception
	 */
	public List<LinkItem> getLinks(InputStreamReader reader) throws Exception {
		List<LinkItem> links = new ArrayList<LinkItem>();
		new ParserDelegator().parse(reader, new ParserHTML(links), true);
		return links;
	}
}
