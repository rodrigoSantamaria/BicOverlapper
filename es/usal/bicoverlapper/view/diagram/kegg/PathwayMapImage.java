package es.usal.bicoverlapper.view.diagram.kegg;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.swing.*;

import es.usal.bicoverlapper.controller.kernel.Selection;
import es.usal.bicoverlapper.controller.kernel.Session;
import es.usal.bicoverlapper.model.gene.GeneAnnotation;
import es.usal.bicoverlapper.model.kegg.LinkItem;
import es.usal.bicoverlapper.view.diagram.Diagram;

/**
 * Class to manage Kegg images
 * 
 * @author Carlos Martín Casado
 *
 */
public class PathwayMapImage extends JLabel implements Scrollable, MouseListener {

	private static final long serialVersionUID = -8290814532621669389L;
	private int maxUnitIncrement = 1;
	private boolean missingPicture = false;
	private List<LinkItem> listaElementosImg;
	private Session sesion;
	private int valorActualCondition;
	
	private boolean dibujarBordeKeggElement = false;
	private List<Rectangle2D.Double> rectangles = new ArrayList<Rectangle2D.Double>();
	
	private Diagram panel;
	
	//parámetro que indica la distancia a la cual se dibujará el borde de selección del elemento
	public static final int distanciaAlElemento = 2;

	public PathwayMapImage(ImageIcon i, Session _sesion, Diagram _panel) {
		super(i);
		sesion = _sesion;
		panel = _panel;
		if (i == null) {
			missingPicture = true;
			setText("No picture found.");
			setHorizontalAlignment(CENTER);
			setOpaque(true);
			setBackground(Color.white);
		}

		//the movement of the scrollbar depends on the screen
		maxUnitIncrement = (int)((double)Toolkit.getDefaultToolkit().getScreenResolution() / (double)2.54);

		// Let the user scroll by dragging to outside the window.
		setAutoscrolls(true); // enable synthetic drag events
		addMouseListener(this); // handle mouse drags
	}

	public PathwayMapImage(ImageIcon i, List<LinkItem> listaElementosImg, Session _sesion, int numCondition, Diagram _panel) {
		super(i);
		sesion = _sesion;
		panel = _panel;
		valorActualCondition = numCondition;
		if (i == null) {
			missingPicture = true;
			setText("No picture found.");
			setHorizontalAlignment(CENTER);
			setOpaque(true);
			setBackground(Color.white);
		}
		
		//the movement of the scrollbar depends on the screen
		maxUnitIncrement = (int)((double)Toolkit.getDefaultToolkit().getScreenResolution() / (double)2.54);

		// Let the user scroll by dragging to outside the window.
		setAutoscrolls(true); // enable synthetic drag events
		addMouseListener(this); // handle mouse drags
		this.listaElementosImg = listaElementosImg;

		repaint();
	}

	// La diferencia entre presionar y hacer click, es que puedes presionar
	// sobre el panel, pero si no sueltas, no has hecho click, sólo has
	// presionado

	/**
	 * Invoked when a mouse button has been pressed on a component.
	 */
	public void mousePressed(MouseEvent e) {
		// System.out.println("mouse Pressed "+e.getX()+" "+e.getY());
	}

	/**
	 * Invoked when a mouse button has been released on a component.
	 */
	public void mouseReleased(MouseEvent e) {
		// System.out.println("mouse Released "+e.getX()+" "+e.getY());
	}

	/**
	 * Invoked when the mouse enters a component.
	 */
	public void mouseEntered(MouseEvent e) {
		// System.out.println("mouse Entered "+e.getX()+" "+e.getY());
	}

	/**
	 * Invoked when the mouse exits a component.
	 */
	public void mouseExited(MouseEvent e) {
		// System.out.println("mouse Exited "+e.getX()+" "+e.getY());
	}

	/**
	 * Invoked when the mouse button has been clicked (pressed and released) on a component.
	 */
	public void mouseClicked(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON3){
			//se escucha el botón derecho para lanzar el panel de configuración de KeggDiagram
			this.panel.configure();
		}
		else{
			this.detectarYColorearSeleccion(e);
		}
	}
	
	/**
	 * When a colored element is clicked, this method paints a rectangle around it
	 * @param e MouseEvent
	 */
	private void detectarYColorearSeleccion(MouseEvent e) {
		//si hay elementos que han sido mapeados en esta imagen
		if (listaElementosImg != null) {
			//se recorren y comprueban todos ellos
			for (LinkItem itm : listaElementosImg) {
				if (itm.getRectangle() != null && itm.getRectangle().outcode(e.getX(), e.getY()) == 0) {
					System.out.println("Rectangle: Has picado sobre "+ itm.getTitle());
					
					//se actualizan el resto de vistas con la selección
					LinkedList<Integer> conditions = new LinkedList<Integer>();
					conditions.add(valorActualCondition);
										
					//si se dispone de los nombres de genes de ese elemento...
					if(null != itm.getGeneNames()){
						LinkedList<Integer> genesSeleccionados = this.mapearGenesConInternalId(itm.getGeneNames());
						if(null != genesSeleccionados){
							//parámetros para pintar el reborde del rectángulo
							dibujarBordeKeggElement = true;
							rectangles.add(itm.getRectangle());
							
							//si está el shift apretado se unirán los nuevos elementos seleccionados a los que ya hubiera (si es que había alguno)
							if(e.isShiftDown() && null != sesion.getSelectedBicluster() && null != sesion.getSelectedGenesBicluster()){
								genesSeleccionados.addAll(sesion.getSelectedGenesBicluster());
							}
							
							//Si se desea actualizar la propia vista Kegg (así se consigue que si se selecciona un elemento y hay repetidos en la imagen, se autoseleccionen)
							sesion.setSelectedBicluster(new Selection(genesSeleccionados, conditions));	
							sesion.updateAll();
							
							//una vez encontrada coincidencia, en principio no habría problema en salir del bucle
							break;
						}
						else{
							JOptionPane.showMessageDialog(null, "Sorry, views can't be updated", "Error", JOptionPane.ERROR_MESSAGE);	
						}
					}
					
				} else if (itm.getCircle() != null && itm.getCircle().contains(new Point(e.getX(), e.getY()))) {
					System.out.println("Circle: Has picado sobre "+ itm.getTitle());
				}
				else{
					//en principio se mantiene la selección si se pica sobre una posición sin elementos, así que este código queda comentado
					//si se hace clic y no hay coincidencias, se pintará la imagen sin nada seleccionado
					//dibujarBordeKeggElement = false;
					//rectangles.clear();
					//repaint();
				}
			}
		}		
	}

	/**
	 * Paint rectangles around elements selected
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		if(dibujarBordeKeggElement){
			//se modifica el grosor de las líneas
		    g2.setStroke(new BasicStroke(3.0f));			
		    //se modifica el color de las líneas, utilizando el que esté marcado en la sesión como color de selección
		    g2.setPaint(sesion.getSelectionColor());
		    for (Rectangle2D.Double rectangle : rectangles) {
		    	g2.drawRect((int)rectangle.getX() - distanciaAlElemento, (int)rectangle.getY() - distanciaAlElemento, (int)rectangle.getWidth()+(2*distanciaAlElemento), (int)rectangle.getHeight()+(2*distanciaAlElemento));
			}
		}
	}		

	/**
	 * Mapping genes with internal ids
	 * @param geneNames List of gene names
	 * @return LinkedList<Integer> whit internal ids
	 */
	private LinkedList<Integer> mapearGenesConInternalId(String[] geneNames) {
		LinkedList<Integer> genesSeleccionados = new LinkedList<Integer>();
		Map<Integer, GeneAnnotation> mapaGenes = sesion.getMicroarrayData().getGeneAnnotations();
		for (GeneAnnotation g : mapaGenes.values()) {
			for (String gen : geneNames) {
				if(g.getId().equals(gen)){
					genesSeleccionados.add(g.getInternalId());
				}
			}
		}
		return genesSeleccionados;
	}

	/**
	 * Get the preferred size
	 */
	public Dimension getPreferredSize() {
		if (missingPicture) {
			return new Dimension(320, 480);
		} else {
			return super.getPreferredSize();
		}
	}

	/**
	 * Get the preferred scrollable viewport size
	 */
	public Dimension getPreferredScrollableViewportSize() {
		return getPreferredSize();
	}

	/**
	 * Get the scrollable tracks viewport width
	 */
	public boolean getScrollableTracksViewportWidth() {
		return false;
	}

	/**
	 * Get the scrollable tracks viewport height
	 */
	public boolean getScrollableTracksViewportHeight() {
		return false;
	}

	/**
	 * Set max unit increment
	 * @param pixels Number of pixels
	 */
	public void setMaxUnitIncrement(int pixels) {
		maxUnitIncrement = pixels;
	}
	
	//Estos métodos sirven para desplazar el scroll tantos píxeles como se devuelven en el return
	//si hiciesen return 0 no se podría mover el scroll pinchando en las flechitas o en una parte del scroll donde no esté la barra
	/**
	 * Get scrollable unit increment
	 */
	public int getScrollableUnitIncrement(Rectangle visibleRect,
			int orientation, int direction) {
		// Get the current position.
		int currentPosition = 0;
		if (orientation == SwingConstants.HORIZONTAL) {
			currentPosition = visibleRect.x;
		} else {
			currentPosition = visibleRect.y;
		}

		// Return the number of pixels between currentPosition
		// and the nearest tick mark in the indicated direction.
		if (direction < 0) {
			int newPosition = currentPosition
					- (currentPosition / maxUnitIncrement) * maxUnitIncrement;
			return (newPosition == 0) ? maxUnitIncrement : newPosition;
		} else {
			return ((currentPosition / maxUnitIncrement) + 1)
					* maxUnitIncrement - currentPosition;
		}
	}

	/**
	 * Get scrollable block increment
	 */
	public int getScrollableBlockIncrement(Rectangle visibleRect,
			int orientation, int direction) {
		if (orientation == SwingConstants.HORIZONTAL) {
			return visibleRect.width - maxUnitIncrement;
		} else {
			return visibleRect.height - maxUnitIncrement;
		}
	}

	/**
	 * @return the dibujarBordeKeggElement
	 */
	public boolean isDibujarBordeKeggElement() {
		return dibujarBordeKeggElement;
	}

	/**
	 * @param dibujarBordeKeggElement the dibujarBordeKeggElement to set
	 */
	public void setDibujarBordeKeggElement(boolean dibujarBordeKeggElement) {
		this.dibujarBordeKeggElement = dibujarBordeKeggElement;
	}

	/**
	 * @return the rectangles
	 */
	public List<Rectangle2D.Double> getRectangles() {
		return rectangles;
	}

	/**
	 * @param rectangles the rectangles to set
	 */
	public void setRectangles(List<Rectangle2D.Double> rectangles) {
		this.rectangles = rectangles;
	}
}
