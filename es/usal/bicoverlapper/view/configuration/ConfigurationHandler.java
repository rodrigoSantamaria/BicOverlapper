package es.usal.bicoverlapper.view.configuration;

import java.util.Vector;

/**
 * Class to store the {@link DiagramConfiguration}s of the {@link es.usal.bicoverlapper.view.main.DiagramWindow}s in the desktop,
 * so it can be saved and loaded
 * TO BE REPLACED BY AN ArrayList<DiagramConfiguration>
 * @author Javier Molpeceres and Rodrigo Santamaria
 */

public class ConfigurationHandler {
	
	private Vector<DiagramConfiguration> configVentanas;
	
	/**
	 * Default constructor with no configuration information
	 *
	 */
	public ConfigurationHandler(){
		configVentanas = new Vector<DiagramConfiguration>(0,1);
	}
	
	/**
	 * Gets the number of WindowConfigurations stored
	 * 
	 * @return the number of WindowConfigurations
	 */
	public int getSizeConfig(){
		return this.configVentanas.size();
	}
	
	/**
	 * Returns the i-WindowConfiguration
	 * 
	 * @param i index of the WindowConfiguration required
	 * @return the i-WindowConfiguration
	 */
	public DiagramConfiguration getWindowConfiguration(int i){
		return (DiagramConfiguration)this.configVentanas.get(i);
	}
	
	/**
	 * Adds as WindowConfiguration
	 * 
	 * @param config the WindowConfiguration to be added
	 */
	public void addWindowConfiguration(DiagramConfiguration config){
		configVentanas.add(config);		
	}
}