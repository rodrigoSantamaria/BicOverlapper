package es.usal.bicoverlapper.view.configuration.panel;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JTextField;


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
public class HeatmapParameterConfigurationPanel extends javax.swing.JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8885170378283133582L;
	private JTextField NumNeighbors;
	public JTextField getNumNeighbors() {
		return NumNeighbors;
	}

	private JLabel NumNeighborsLabel;


	
	public HeatmapParameterConfigurationPanel() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setPreferredSize(new Dimension(300, 50));
			{
				NumNeighborsLabel = new JLabel();
				this.add(NumNeighborsLabel);
				NumNeighborsLabel.setText("Number of neighbor profiles to select");
				NumNeighborsLabel.setPreferredSize(new java.awt.Dimension(248, 15));
				NumNeighborsLabel.setToolTipText("You can shift+click a gene to select a list of its top neighbor profiles");
			}
			{
				NumNeighbors = new JTextField();
				this.add(NumNeighbors);
				NumNeighbors.setText("10");
				NumNeighbors.setPreferredSize(new java.awt.Dimension(38, 22));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
