package es.usal.bicoverlapper.controller.manager;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import es.usal.bicoverlapper.controller.kernel.Configuration;
import es.usal.bicoverlapper.controller.kernel.Session;
import es.usal.bicoverlapper.controller.util.Translator;
import es.usal.bicoverlapper.view.diagram.bubbles.BubblesDiagram;
import es.usal.bicoverlapper.view.diagram.heatmap2.HeatmapDiagram2;
import es.usal.bicoverlapper.view.diagram.network.NetworkDiagram;
import es.usal.bicoverlapper.view.diagram.overlapper.OverlapperDiagram;
import es.usal.bicoverlapper.view.diagram.parallelCoordinates.ParallelCoordinatesDiagram;
import es.usal.bicoverlapper.view.diagram.wordcloud.WordCloudDiagram;
import es.usal.bicoverlapper.view.main.BicOverlapperWindow;
import es.usal.bicoverlapper.view.main.DiagramWindow;
import es.usal.bicoverlapper.view.diagram.kegg.KEGGDiagram;

/**
 * Class that handles the View Menu Options
 * 
 * @author Javier Molpeceres and Rodrigo Santamaria
 * @version 3.2, 26/3/2007
 */
public class ViewMenuManager implements ActionListener {

	private BicOverlapperWindow ventana;
	private Configuration config;

	/**
	 * Constructor to build a MenuManager
	 * 
	 * @param window
	 *            <code>BicOverlapperWindow</code> that will contain the menu
	 *            that this manager controls
	 * @param config
	 *            <code>Configuration</code> with initial configuration for the
	 *            views.
	 */
	public ViewMenuManager(BicOverlapperWindow window, Configuration config) {
		this.ventana = window;
		this.config = config;
	}

	/**
	 * Method invoked each time that an option in the view menu is clicked
	 */
	public void actionPerformed(ActionEvent e) {

		if (ventana.isActiveWorkDesktop()) {
			Session sesion = ventana.getActiveWorkDesktop().getSession();

			//-------------------------	PARALLEL COORDINATES  -----------------------	
			if (e.getActionCommand().equals(
					Translator.instance.menuLabels.getString("s8"))) {
				viewParallelCoordinates(sesion);
				
			//-------------------------	 BUBBLES -----------------------	
			} else if (e.getActionCommand().equals("Bubble Map")) {
				viewBubbles(sesion);
				
			//-------------------------	 NETWORK -----------------------	
			} else if (e.getActionCommand().equals("Biological Network")) {
				viewNetwork(sesion);
			} 
			
		/*	//-------------------------	 HEATMAP -----------------------	
			else if (e.getActionCommand().equals("Microarray Heatmap")) {
				viewHeatmap(sesion);
			}
			*/
			//-------------------------	 HEATMAP (NEW) -----------------------	
			else if (e.getActionCommand().equals("Microarray Heatmap")) 
				{
				viewHeatmap(sesion);
				
			//-------------------------	 OVERLAPPER -----------------------	
			} else if (e.getActionCommand().equals(Translator.instance.menuLabels.getString("s10"))) { //Overlapper
				viewOverlapper(sesion);
				
			} 
			
			//-------------------------	 WORD CLOUD -----------------------	
			else if (e.getActionCommand().equals(Translator.instance.menuLabels.getString("s13"))) {
				viewWordCloud(sesion);

			//-------------------------	 KEGG PATHS -----------------------	
			} else if(e.getActionCommand().equals(Translator.instance.menuLabels.getString("s26"))){//Kegg
					viewKegg(sesion);		
			}
		}
	}
	
	public void viewParallelCoordinates(Session sesion)
		{
		Dimension dim = config.getSizePanelCoordenadas();
		ParallelCoordinatesDiagram panel = new ParallelCoordinatesDiagram(
				sesion, dim);
		DiagramWindow ventana = new DiagramWindow(sesion,
				sesion.getDesktop(), panel);
		ventana.setLocation(config.getInitPC().x, config.getInitPC().y);

		panel.setWindow(ventana);

		sesion.setParallelCoordinates(ventana);
		}
	
	
	public final void viewHeatmap(final Session sesion)
		{
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
	
			Dimension dim = config.getDimPanelHeatmap();
			HeatmapDiagram2 panel = new HeatmapDiagram2(sesion, dim);
			DiagramWindow ventana = new DiagramWindow(sesion,
							sesion.getDesktop(), panel);
			panel.setWindow(ventana);
			sesion.setHeatmap2(ventana);
			ventana.setLocation(config.getInitHM().x, config.getInitHM().y);
		
			panel.update();
	
			}});
		
		}
	
	public void viewBubbles(final Session sesion)
		{
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
	
				Dimension dim = config.getDimPanelBubbles();
				BubblesDiagram panel = new BubblesDiagram(sesion, dim);

				DiagramWindow ventana = new DiagramWindow(sesion,
				sesion.getDesktop(), panel);
				panel.setWindow(ventana);
				ventana.setLocation(config.getInitBM().x, config.getInitBM().y);
				sesion.setBubbles(ventana);
				panel.createAxisLayout();
				panel.run();
			}});
		
		
		}
	
	public void viewOverlapper(final Session sesion)
		{
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
	
		if(!sesion.isTooManyGenes()){
			Dimension dim = config.getDimPanelBiclusVis();
			
			OverlapperDiagram panel = new OverlapperDiagram(sesion, dim);
			DiagramWindow ventana = new DiagramWindow(sesion, sesion.getDesktop(), panel);
			panel.setWindow(ventana);
			ventana.setLocation(0,
					config.getSizePanelCoordenadas().height + 30);

			sesion.setBubbleGraph(ventana);

			boolean ret = panel.create();
			//si el panel se ha creado sin errores se arranca
			if(ret){
				panel.run();
			}
			else{
				ventana.dispose();
			}
		}
		else{
			JOptionPane.showMessageDialog(
					null,
					"Too many genes found in the biclusters. Please, adjust the parameters in order to find less genes.",
					"Too many genes", JOptionPane.ERROR_MESSAGE);
			}
			}});
		}
	public void viewNetwork(final Session sesion)
		{
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
	
		Dimension dim = config.getDimPanelTRN();
		NetworkDiagram panel = new NetworkDiagram(sesion, dim);
		DiagramWindow ventana = new DiagramWindow(sesion,
				sesion.getDesktop(), panel);
		panel.setWindow(ventana);
		sesion.setTRN(ventana);
		ventana.setLocation(config.getInitTRN().x, config.getInitTRN().y);
		panel.create();
		panel.run();
			}});
		}
	public void viewWordCloud(final Session sesion)
		{
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				Dimension dim = config.getDimPanelWordCloud();
				WordCloudDiagram panel = new WordCloudDiagram(sesion, dim);
				DiagramWindow ventana = new DiagramWindow(sesion,
					sesion.getDesktop(), panel);
				panel.setWindow(ventana);
				ventana.setLocation(config.getInitWC().x, config.getInitWC().y);
				sesion.setWordCloud(ventana);
				panel.repaint();
			}});
		}
	
	public void viewKegg(Session sesion)
		{
		Dimension dim = config.getDimPanelKegg();
		KEGGDiagram panel = new KEGGDiagram(sesion, dim);
		DiagramWindow ventana = new DiagramWindow(sesion, sesion.getDesktop(), panel);
		panel.setWindow(ventana);
		sesion.setKegg(ventana);
		// aquí habrá que poner la localización por defecto
		ventana.setLocation(config.getInitKegg().x, config.getInitKegg().y);
		panel.create();
		panel.run();	
		}
}