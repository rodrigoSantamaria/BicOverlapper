package es.usal.bicoverlapper.controller.manager.configurationManager;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;

import es.usal.bicoverlapper.controller.util.Translator;
import es.usal.bicoverlapper.view.diagram.Diagram;
import es.usal.bicoverlapper.view.main.DiagramWindow;




/**
 * Class that handles the Configuration Menu Options
 * It contains a list of colors and characteristics of the Diagram, so we can 
 * change colors of different characteristics of the Diagram, as, for example,
 * axes, selected entities, labels, etc.
 * <p>
 * STILL IN DEVELOPMENT
 * @author Javier Molpeceres and Rodrigo Santamaría
 */
public class ConfigurationMenuManager implements ActionListener{
		
	private Diagram panel;
	private JInternalFrame ventanaConfig;
	private Color[] paleta;
	private DiagramWindow addItem = null, removeItem = null;
	private JTextField[] muestra;
	private int posSel=0;
	
	/**
	 * Builds a Configuration manager for DiagramWindows
	 * @param panel <code>Diagram</code> to which this Manager will be linked
	 * @param configWindow <code>JInternalFrame</code> that contains this configuration menu
	 * @param palette Color array with color for the Diagram
	 * @param sample <code>JTextField</code> array that serves as sample of the color chosen
	 */
	public ConfigurationMenuManager(Diagram panel,JInternalFrame configWindow, Color[] palette, JTextField[] sample){
		this.panel = panel;
		this.ventanaConfig = configWindow;
		this.paleta = palette;
		this.muestra = sample;		
	}

	/**
	 * Builds a Configuration manager for DiagramWindows
	 * @param panel <code>Diagram</code> to which this Manager will be linked
	 * @param configWindow <code>JInternalFrame</code> that contains this configuration menu
	 * @param palette Color array with color for the Diagram
	 * @param sample <code>JTextField</code> array that serves as sample of the color chosen
	 */
	public ConfigurationMenuManager(Diagram panel,JInternalFrame configWindow, Color[] palette, JTextField[] sample, int pos){
		this.panel = panel;
		this.ventanaConfig = configWindow;
		this.paleta = palette;
		this.muestra = sample;	
		this.posSel = pos;
	}

	/**
	 * Listener to show, collect and hide colors for characteristics
	 */
	public void actionPerformed(ActionEvent e) {
		JButton botonAccion = (JButton)e.getSource();
		if(botonAccion.getText() == Translator.instance.configureLabels.getString("s9")){
			for(int i = 0; i < muestra.length; i++){
				paleta[i] = muestra[i].getBackground();
				if(i==posSel)	
					panel.setSelectionColor(paleta[i]);
			}
			ventanaConfig.dispose();
			panel.endConfig(true);
		}
		else if(botonAccion.getText() == Translator.instance.configureLabels.getString("s10")){
			ventanaConfig.dispose();
			panel.endConfig(false);
		}
		
	}
	
	/**
	 * Return the samples of the Configuration
	 * @return <code>JTextField</code> array with the color samples for the linked Diagram
	 */
	public JTextField[] getSamples(){
		return this.muestra;
	}
	
	/**
	 * STILL IN DEVELOPMENT
	 */
	public void setAddItem(DiagramWindow item){
		this.addItem = item; 
	}
	
	/**
		 *STILL IN DEVELOPMENT
	 */
	public void setRemoveItem(DiagramWindow item){
		this.removeItem = item;
	}
}