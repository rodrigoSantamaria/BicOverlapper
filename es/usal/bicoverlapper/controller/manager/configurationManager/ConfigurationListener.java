package es.usal.bicoverlapper.controller.manager.configurationManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import es.usal.bicoverlapper.view.diagram.Diagram;



/**
 * MouseAdapter to listen to configuration requests under a Diagram
 * 
 * @author Javier Molpeceres
 *
 */
public class ConfigurationListener extends MouseAdapter {
	
	private Diagram panel;
	
	/**
	 * Default constructor
	 * 
	 * @param panel <code>Diagram</code> to listen for
	 */
	public ConfigurationListener(Diagram panel){
		this.panel = panel;
	}
	
	/**
	 * This method call to configure method on the <code>Diagram</code>
	 * 
	 * @param e MouseEvent, it activates configuration when MouseEvent.BUTTON3 is presssed
	 */
	public void mouseClicked(MouseEvent e){
		if(e.getButton() == MouseEvent.BUTTON3){
			this.panel.configure();
		}
	}	
}