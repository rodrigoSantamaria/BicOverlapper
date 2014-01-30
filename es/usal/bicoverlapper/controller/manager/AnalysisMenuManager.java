package es.usal.bicoverlapper.controller.manager;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JFrame;

import es.usal.bicoverlapper.controller.kernel.Configuration;
import es.usal.bicoverlapper.controller.kernel.Session;
import es.usal.bicoverlapper.controller.util.Translator;
import es.usal.bicoverlapper.view.analysis.panel.BimaxPanel;
import es.usal.bicoverlapper.view.analysis.panel.BuildNetworkPanel;
import es.usal.bicoverlapper.view.analysis.panel.CCPanel;
import es.usal.bicoverlapper.view.analysis.panel.DiffExpPanel;
import es.usal.bicoverlapper.view.analysis.panel.GSEAPanel;
import es.usal.bicoverlapper.view.analysis.panel.ISAPanel;
import es.usal.bicoverlapper.view.analysis.panel.PlaidPanel;
import es.usal.bicoverlapper.view.analysis.panel.SelectPanel;
import es.usal.bicoverlapper.view.analysis.panel.XMotifsPanel;
import es.usal.bicoverlapper.view.main.BicOverlapperWindow;

/**
 * Class that handles Analysis options (Biclustering)
 * 
 * @author Rodrigo Santamaria
 * @version 3.2, 26/3/2007
 */
public class AnalysisMenuManager implements ActionListener {

	private BicOverlapperWindow ventana;
	private Configuration config;
	private BimaxPanel bimaxPanel = null;
	private PlaidPanel plaidPanel = null;
	private XMotifsPanel xmotifsPanel = null;
	private CCPanel ccPanel = null;
	private ISAPanel isaPanel = null;
	private SelectPanel selectPanel = null;
	private boolean ctrlPressed;
	private DiffExpPanel difExpPanel;
	private BuildNetworkPanel buildNetPanel;
	private GSEAPanel gseaPanel;

	/**
	 * Constructor to build a MenuManager
	 * 
	 * @param window
	 *            <code>BicOverlapperWindow</code> that will contain the menu
	 *            that this manager controls
	 */
	public AnalysisMenuManager(BicOverlapperWindow window) {
		this.ventana = window;

	}

	public void cleanPanels()
		{
		gseaPanel=null;
		difExpPanel=null;
		selectPanel=null;
		}
	
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
	public AnalysisMenuManager(BicOverlapperWindow window, Configuration config) {
		this.ventana = window;
		this.config = config;
	}

	/**
	 * Method invoked each time that an option in the view menu is clicked
	 */
	public void actionPerformed(ActionEvent e) {
		if (ventana.isActiveWorkDesktop()) {
			Session sesion = ventana.getActiveWorkDesktop().getSession();

			// ------------------------------- SHOW BICLUSTERING
			// WINDOWS---------------------
			if (e.getActionCommand().equals(
					Translator.instance.menuLabels.getString("bimax"))) {
				if (bimaxPanel == null)
					bimaxPanel = new BimaxPanel(sesion);
				
				// Mostramos la ventana de configuracion
				JFrame window = new JFrame();
				window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				window.setTitle("Bimax biclustering");
				JComponent newContentPane = bimaxPanel.getJPanel2();
				newContentPane.setOpaque(true); // content panes must be opaque
				window.setContentPane(newContentPane);
				window.setAlwaysOnTop(true);
				// Display the window.
				window.pack();
				window.setSize(new Dimension(241, 435));
				window.setLocation(200, 200);
				window.setVisible(true);
			} else if (e.getActionCommand().equals(
					Translator.instance.menuLabels.getString("plaid"))) {
				if (plaidPanel == null)
					plaidPanel = new PlaidPanel(sesion);

				// Mostramos la ventana de configuracion
				// Mostramos la ventana de configuracion
				JFrame window = new JFrame();
				window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				window.setTitle("Plaid Model biclustering");
				JComponent newContentPane = plaidPanel.getJPanel2();
				newContentPane.setOpaque(true); // content panes must be opaque
				window.setContentPane(newContentPane);
				window.setAlwaysOnTop(true);
				// Display the window.
				window.pack();
				window.setSize(new Dimension(241, 411));
				window.setLocation(200, 200);
				window.setVisible(true);
			} else if (e.getActionCommand().equals(
					Translator.instance.menuLabels.getString("opsm"))) {

			} else if (e.getActionCommand().equals(
					Translator.instance.menuLabels.getString("isa"))) {
				if (isaPanel == null)
					isaPanel = new ISAPanel(sesion);

				// Mostramos la ventana de configuracion
				// Mostramos la ventana de configuracion
				JFrame window = new JFrame();
				isaPanel.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				isaPanel.setTitle("ISA biclustering");
				isaPanel.setAlwaysOnTop(true);
				// Display the window.
				isaPanel.pack();
				// window.setSize(new Dimension(241, 355));
				isaPanel.setLocation(200, 200);
				isaPanel.setVisible(true);
			}

			else if (e.getActionCommand().equals(
					Translator.instance.menuLabels.getString("spectral"))) {

			} else if (e.getActionCommand().equals(
					Translator.instance.menuLabels.getString("cc"))) {
				if (ccPanel == null)
					ccPanel = new CCPanel(sesion);

				// Mostramos la ventana de configuracion
				// Mostramos la ventana de configuracion
				JFrame window = new JFrame();
				window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				window.setTitle("Cheng&Church biclustering");
				JComponent newContentPane = ccPanel.getJPanel2();
				newContentPane.setOpaque(true); // content panes must be opaque
				window.setContentPane(newContentPane);
				window.setAlwaysOnTop(true);
				// Display the window.
				window.pack();
				window.setSize(new Dimension(241, 355));
				window.setLocation(200, 200);
				window.setVisible(true);
			}

			else if (e.getActionCommand().equals(
					Translator.instance.menuLabels.getString("xmotifs"))) {
				if (xmotifsPanel == null)
					xmotifsPanel = new XMotifsPanel(sesion);

				// Mostramos la ventana de configuracion
				// Mostramos la ventana de configuracion
				JFrame window = new JFrame();
				window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				window.setTitle("XMotifs biclustering");
				JComponent newContentPane = xmotifsPanel.getJPanel2();
				newContentPane.setOpaque(true); // content panes must be opaque
				window.setContentPane(newContentPane);
				window.setAlwaysOnTop(true);
				// Display the window.
				window.pack();
				// window.setBounds(window.getContentPane().getBounds());
				window.setSize(new Dimension(241, 443));
				window.setLocation(200, 200);
				window.setVisible(true);
			}
			//-------------- 
			else if (e.getActionCommand().equals(
					Translator.instance.menuLabels.getString("search")))
				sesion.search();

			else if (e.getActionCommand().equals(
					Translator.instance.menuLabels.getString("show")))
				sesion.show();
			else if (e.getActionCommand().equals(
					Translator.instance.menuLabels.getString("sort"))) {
				sesion.sort();
			} else if (e.getActionCommand().equals(
					Translator.instance.menuLabels.getString("merge"))) {
				sesion.merge();
			} else if (e.getActionCommand().equals(
					Translator.instance.menuLabels.getString("mergeRows"))) {
				sesion.mergeRows();
			} else if (e.getActionCommand().equals(
					Translator.instance.menuLabels.getString("retrieve"))) {
				sesion.getMicroarrayData().getGeneAnnotationsLite();
			}

			else if (e.getActionCommand().equals(
					Translator.instance.menuLabels.getString("select"))) {
				// Show label names box
				if (selectPanel == null)
					selectPanel = new SelectPanel(sesion);
				// else selectPanel.updateLists();
				selectPanel.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				selectPanel.setTitle("Select Profiles");
				//selectPanel.setAlwaysOnTop(true);

				// Display the window.
				selectPanel.pack();
				selectPanel.setVisible(true);
			} else if (e.getActionCommand().equals(
					Translator.instance.menuLabels.getString("difexp"))) {
				// Show label names box
				if (difExpPanel == null)
					difExpPanel = new DiffExpPanel(sesion);
				// else selectPanel.updateLists();
				difExpPanel.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				difExpPanel.setTitle("Differential Expression Analysis");
				//difExpPanel.setAlwaysOnTop(true);
				difExpPanel.setLocation(
						(sesion.getDesktop().getWidth() - difExpPanel
								.getWidth()) / 2, (sesion.getDesktop()
								.getHeight() - difExpPanel.getHeight()) / 2);

				// Display the window.
				difExpPanel.pack();
				difExpPanel.setVisible(true);
			} else if (e.getActionCommand().equals(
					Translator.instance.menuLabels.getString("buildnet"))) {
				// Show label names box
				if (buildNetPanel == null)
					buildNetPanel = new BuildNetworkPanel(sesion);
				// else selectPanel.updateLists();
				buildNetPanel.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				buildNetPanel.setTitle("Build Correlation Network");
				//buildNetPanel.setAlwaysOnTop(true);
				buildNetPanel.setLocation(
						(sesion.getDesktop().getWidth() - buildNetPanel
								.getWidth()) / 2, (sesion.getDesktop()
								.getHeight() - buildNetPanel.getHeight()) / 2);

				// Display the window.
				buildNetPanel.pack();
				buildNetPanel.setVisible(true);
			} else if (e.getActionCommand().equals(
					Translator.instance.menuLabels.getString("gsea"))) {
				// Show label names box
				if (gseaPanel == null)
					gseaPanel = new GSEAPanel(sesion);
				// else selectPanel.updateLists();
				gseaPanel.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				gseaPanel.setTitle("Gene Set Enrichment Analysis");
				gseaPanel.setAlwaysOnTop(true);
				gseaPanel
						.setLocation(
								(sesion.getDesktop().getWidth() - gseaPanel
										.getWidth()) / 2,
								(sesion.getDesktop().getHeight() - gseaPanel
										.getHeight()) / 2);

				// Display the window.
				gseaPanel.pack();
				gseaPanel.setVisible(true);
			}

		}
	}

}