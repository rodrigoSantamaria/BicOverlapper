package es.usal.bicoverlapper.view.configuration.panel;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JCheckBox;

import javax.swing.WindowConstants;
import javax.swing.JFrame;


import prefuse.action.layout.graph.ForceDirectedLayout;
import prefuse.util.force.ForceConfigAction;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class NetworkParameterConfigurationPanel extends javax.swing.JPanel {
	private JCheckBox AnimateExpression;
	public JCheckBox getAnimateExpression() {
		return AnimateExpression;
	}

	private JButton Forces;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new NetworkParameterConfigurationPanel(null));
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public NetworkParameterConfigurationPanel(ForceDirectedLayout fdl) {
		super();
		initGUI(fdl);
	}
	
	private void initGUI(ForceDirectedLayout fdl) {
		try {
			this.setLayout(null);
			setPreferredSize(new Dimension(300, 100));
			{
				Forces = new JButton();
				this.add(Forces, "0, 0");
				Forces.setText("Change Forces");
				Forces.setBounds(87, 20, 123, 16);
				Forces.setToolTipText("Modify the forces schema for layout");
				ForceConfigAction fca=new ForceConfigAction(null, fdl.getForceSimulator());
			    Forces.addActionListener(fca);
			}
			{
				AnimateExpression = new JCheckBox();
				this.add(AnimateExpression, "1, 0");
				AnimateExpression.setText("Animate expression colors");
				AnimateExpression.setToolTipText("Iteratively colors the nodes with their expression for each sample");
				AnimateExpression.setBounds(62, 42, 233, 16);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
