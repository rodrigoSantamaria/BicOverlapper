package es.usal.bicoverlapper.view.analysis.panel;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import es.usal.bicoverlapper.controller.analysis.AnalysisProgressMonitor.AnalysisTask;
import es.usal.bicoverlapper.controller.kernel.Selection;
import es.usal.bicoverlapper.controller.kernel.Session;


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
public class SearchPanel{
	
	private JPanel jPanel = null;  //  @jve:decl-index=0:visual-constraint="28,8"
	private JLabel jLabel = null;
	private JLabel jLabel2 = null;
	private JTextField jTextField221 = null;
	private JButton jButton1 = null;
	private JCheckBox exactMatch;
	public JButton getjButton1() {
		return jButton1;
	}
	public void setjButton1(JButton jButton1) {
		this.jButton1 = jButton1;
	}
	private Session session =null;
	public File resultsFile=null;
	public String defaultPath="";  //  @jve:decl-index=0:
	protected AnalysisTask t;
	private JComboBox jComboBox = null;
	private JButton jButton11 = null;
	public SearchPanel()
	{}	
	public SearchPanel(Session s)
	{
		session=s;
	}	

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	public JPanel getJPanel() {
		
		return jPanel;
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	public JPanel getJPanel2() {
		if (jPanel == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("in");
			jLabel2.setBounds(new Rectangle(10, 37, 78, 16));
			jLabel = new JLabel();
			jLabel.setText("Search for");
			jLabel.setBounds(new Rectangle(10, 13, 72, 16));
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setSize(new Dimension(241, 111));
			jPanel.setPreferredSize(new java.awt.Dimension(241, 130));
			jPanel.add(jLabel, null);
			jPanel.add(jLabel2, null);
			jPanel.add(getJTextField221(), null);
			jPanel.add(getJButton1(), null);
			jPanel.add(getJComboBox(), null);
			jPanel.add(getJButton11(), null);
			jPanel.add(getExactMatch());
		}
		return jPanel;
	}

	/**
	 * This method initializes jTextField221	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField221() {
		if (jTextField221 == null) {
			jTextField221 = new JTextField();
			jTextField221.setBounds(new Rectangle(95, 9, 124, 20));
			jTextField221.setText("");
		}
		return jTextField221;
	}

	/**
	 * This method initializes jButton1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setBounds(22, 92, 82, 26);
			jButton1.setToolTipText("Search for and select matching elements");
			jButton1.setText("Search");
			jButton1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					session=session.getMainWindow().getActiveWorkDesktop().getSession();
					
					if(session!=null)	
						{
						Selection sb=session.getMicroarrayData().search(jTextField221.getText(),jComboBox.getSelectedIndex(), exactMatch.isSelected(), null);
						if(sb.getGenes().size()>0 || sb.getConditions().size()>0)
							{
							session.setSelectedBiclustersExcept(sb,"");
							((JFrame)(getJPanel2().getTopLevelAncestor())).dispose();
							}
						else
							JOptionPane.showMessageDialog(null,
									"No genes or conditions found", 
									"Search failed", JOptionPane.INFORMATION_MESSAGE);
				    	    	
						
						}
					}
			});
		}
		return jButton1;
	}
	/**
	 * This method initializes jComboBox	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBox() {
		if (jComboBox == null) {
			jComboBox = new JComboBox();
			jComboBox.setBounds(new Rectangle(97, 34, 121, 19));
			jComboBox.addItem("Anywhere");
			jComboBox.addItem("Gene names");
			jComboBox.addItem("Condition names");
			jComboBox.addItem("Gene annotations");
		}
		return jComboBox;
	}
	/**
	 * This method initializes jButton11	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton11() {
		if (jButton11 == null) {
			jButton11 = new JButton();
			jButton11.setBounds(136, 92, 75, 26);
			jButton11.setToolTipText("Search for matching elements and add to current selection");
			jButton11.setText("Add");
			jButton11.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					if(session!=null)	
						{
						Selection sb=session.getMicroarrayData().search(jTextField221.getText(),jComboBox.getSelectedIndex(), exactMatch.isSelected(), null);
						if(sb.getGenes().size()>0 || sb.getConditions().size()>0)
							{
							Selection csb=session.getSelectedBicluster();
							if(csb!=null)
								{
								sb.getGenes().addAll(csb.getGenes());
								sb.getConditions().addAll(csb.getConditions());
								session.setSelectedBiclustersExcept(sb,"");
								}
							else
								session.setSelectedBiclustersExcept(sb,"");
							
							((JFrame)(getJPanel2().getTopLevelAncestor())).dispose();
							}
						else
							JOptionPane.showMessageDialog(null,
									"No genes or conditions found", 
									"Search failed", JOptionPane.INFORMATION_MESSAGE);
				    	}
					}
			});
	
		}
		return jButton11;
	}
	
	private JCheckBox getExactMatch() {
		if(exactMatch == null) {
			exactMatch = new JCheckBox();
			exactMatch.setText("Exact match");
			exactMatch.setBounds(82, 64, 121, 19);
		}
		return exactMatch;
	}

}
