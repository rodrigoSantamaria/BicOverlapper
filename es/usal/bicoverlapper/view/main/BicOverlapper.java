package es.usal.bicoverlapper.view.main;

import java.util.Iterator;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceBusinessLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceGraphiteLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceNebulaLookAndFeel;

//import org.jvnet.substance.SubstanceLookAndFeel;

/*import test.QuickSoapTest;
import uk.ac.ebi.ook.web.services.Query;
import uk.ac.ebi.ook.web.services.QueryService;
import uk.ac.ebi.ook.web.services.QueryServiceLocator;
import uk.ac.ebi.ook.web.services.client.QueryServiceFactory;
*/
//import es.usal.bicoverlapper.data.EReader;
//import es.usal.bicoverlapper.data.AffyReader;
import es.usal.bicoverlapper.controller.data.parser.FileParser;
import es.usal.bicoverlapper.controller.data.parser.TRNParser;
import es.usal.bicoverlapper.controller.data.reader.NCBIReader;
import es.usal.bicoverlapper.controller.util.Translator;
import es.usal.bicoverlapper.model.microarray.ExpressionData;
import es.usal.bicoverlapper.view.analysis.panel.TrickPanel;
import es.usal.bicoverlapper.view.diagram.overlapper.Graph;



/**
 * Main class to run the application BicOverlapper. It just initializes an instance of BicOverlapperWindow
 * 
 * @author Rodrigo Santamaria (from a project of Javier Molpeceres)
 * 
*/
public class BicOverlapper {

	/**
	 * Default constructor
	 *
	 */
	public BicOverlapper() {		
		new BicOverlapperWindow();
	}
	
	/**
	 * Main method
	 * 
	 * @param args Arguments taken from command line (no arguments are considered by overlapper)
	 */
	public static void main(String[] args) {
		

		   System.out.println(System.getProperty("user.language"));
		   Translator.instance=new Translator("en");
		   Runtime runtime = Runtime.getRuntime();  
		   System.out.println("max memory: " + runtime.maxMemory() / 1024);  
		   JFrame.setDefaultLookAndFeelDecorated(true);
		//   SwingUtilities.invokeLater(new Runnable(){
		   java.awt.EventQueue.invokeLater(new Runnable(){
			   public void run(){
				   
				   try {
				          UIManager.setLookAndFeel(new SubstanceNebulaLookAndFeel());
				        } catch (Exception e) {
				          System.out.println("Substance Graphite failed to initialize");
				        }
				   
				   BicOverlapperWindow w=new BicOverlapperWindow();
				   w.setVisible(true);
			   }
		   });
				
	}
}