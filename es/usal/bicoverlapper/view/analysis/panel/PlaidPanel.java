package es.usal.bicoverlapper.view.analysis.panel;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import es.usal.bicoverlapper.controller.analysis.Analysis;
import es.usal.bicoverlapper.controller.analysis.AnalysisProgressMonitor;
import es.usal.bicoverlapper.controller.analysis.AnalysisProgressMonitor.AnalysisTask;
import es.usal.bicoverlapper.controller.data.filter.BiclusterResultsFilter;
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
public class PlaidPanel{
	
	private JPanel jPanel = null;  //  @jve:decl-index=0:visual-constraint="28,8"
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel3 = null;
	private JRadioButton jRadioButton = null;
	private JRadioButton jRadioButton1 = null;
	private JTextField jTextField22 = null;
	private JTextField jTextField221 = null;
	private JCheckBox jCheckBox = null;
	private JButton jButton = null;
	private JCheckBox jCheckBox1 = null;
	private JTextField jTextField212 = null;
	private JButton jButton1 = null;
	private Session session =null;
	public File resultsFile=null;
	public String defaultPath="";  //  @jve:decl-index=0:
	private JRadioButton jRadioButton11 = null;
	protected AnalysisTask t;
	private JCheckBox jCheckBox3 = null;
	private JLabel jLabel21 = null;
	private JLabel jLabel211 = null;
	private JLabel jLabel2111 = null;
	private JLabel jLabel21111 = null;
	private JTextField jTextField2211 = null;
	private JTextField jTextField22111 = null;
	private JTextField jTextField221111 = null;
	private JTextField jTextField2211111 = null;
	
	public PlaidPanel()
	{}	
	public PlaidPanel(Session s)
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
			jLabel21111 = new JLabel();
			jLabel21111.setBounds(new Rectangle(29, 230, 140, 16));
			jLabel21111.setToolTipText("Biclusters with at least this number of conditions are searched");
			jLabel21111.setText("Max. # biclusters");
			jLabel21111.setEnabled(false);
			jLabel2111 = new JLabel();
			jLabel2111.setBounds(new Rectangle(30, 210, 139, 16));
			jLabel2111.setToolTipText("Biclusters with at least this number of conditions are searched");
			jLabel2111.setText("Max. # conditions");
			jLabel2111.setEnabled(false);
			jLabel211 = new JLabel();
			jLabel211.setBounds(new Rectangle(30, 190, 141, 16));
			jLabel211.setToolTipText("Biclusters with at least this number of conditions are searched");
			jLabel211.setText("Max. # genes");
			jLabel211.setEnabled(false);
			jLabel21 = new JLabel();
			jLabel21.setBounds(new Rectangle(30, 170, 147, 16));
			jLabel21.setToolTipText("Biclusters with at least this number of conditions are searched");
			jLabel21.setText("Max. % of overlap");
			jLabel21.setEnabled(false);
			jLabel3 = new JLabel();
			jLabel3.setText("Cluster");
			jLabel3.setBounds(new Rectangle(10, 62, 93, 16));
			jLabel3.setToolTipText("Select among gene clustering, condition clustering or biclustering");
			jLabel1 = new JLabel();
			jLabel1.setText("Column release");
			jLabel1.setToolTipText("As above, with columns");
			jLabel1.setBounds(new Rectangle(10, 31, 109, 16));
			jLabel = new JLabel();
			jLabel.setText("Row release");
			jLabel.setToolTipText("Scalar in [0,1] (recommended [0.5-0.7]) used as threshold to select rows based on row homogeneity");
			jLabel.setBounds(new Rectangle(10, 13, 85, 16));
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setSize(new Dimension(241, 381));
			jPanel.add(jLabel, null);
			jPanel.add(jLabel1, null);
			jPanel.add(jLabel3, null);
			jPanel.add(getJRadioButton(), null);
			jPanel.add(getJRadioButton1(), null);
			jPanel.add(getJTextField22(), null);
			jPanel.add(getJTextField221(), null);
			jPanel.add(getJCheckBox(), null);
			jPanel.add(getJButton(), null);
			jPanel.add(getJCheckBox1(), null);
			jPanel.add(getJTextField212(), null);
			jPanel.add(getJButton1(), null);
			jPanel.add(getJRadioButton11(), null);
			jPanel.add(getJCheckBox3(), null);
			jPanel.add(jLabel21, null);
			jPanel.add(jLabel211, null);
			jPanel.add(jLabel2111, null);
			jPanel.add(jLabel21111, null);
			jPanel.add(getJTextField2211(), null);
			jPanel.add(getJTextField22111(), null);
			jPanel.add(getJTextField221111(), null);
			jPanel.add(getJTextField2211111(), null);
		}
		return jPanel;
	}

	
	/**
	 * This method initializes jRadioButton	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getJRadioButton() {
		if (jRadioButton == null) {
			jRadioButton = new JRadioButton();
			jRadioButton.setSelected(false);
			jRadioButton.setToolTipText("Gene Clustering");
			jRadioButton.setText("Genes");
			jRadioButton.setBounds(new Rectangle(30, 78, 107, 24));
			jRadioButton.addChangeListener(new javax.swing.event.ChangeListener() {
				public void stateChanged(javax.swing.event.ChangeEvent e) {
					if(jRadioButton.isSelected())	
						{
						jRadioButton1.setSelected(false);
						jRadioButton11.setSelected(false);
						}
				}
			});
			
		}
		return jRadioButton;
	}

	/**
	 * This method initializes jRadioButton1	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getJRadioButton1() {
		if (jRadioButton1 == null) {
			jRadioButton1 = new JRadioButton();
			jRadioButton1.setText("Conditions");
			jRadioButton1.setToolTipText("Condition clustering");

			jRadioButton1.setBounds(new Rectangle(30, 96, 151, 24));
			jRadioButton1.addChangeListener(new javax.swing.event.ChangeListener() {
				public void stateChanged(javax.swing.event.ChangeEvent e) {
					if(jRadioButton1.isSelected())	
						{
						jRadioButton.setSelected(false);
						jRadioButton11.setSelected(false);
						}
				}
			});
		
		}
		return jRadioButton1;
	}

	/**
	 * This method initializes jTextField22	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField22() {
		if (jTextField22 == null) {
			jTextField22 = new JTextField();
			jTextField22.setBounds(new Rectangle(186, 29, 33, 20));
			jTextField22.setText("0.7");
		}
		return jTextField22;
	}

	/**
	 * This method initializes jTextField221	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField221() {
		if (jTextField221 == null) {
			jTextField221 = new JTextField();
			jTextField221.setBounds(new Rectangle(186, 8, 33, 20));
			jTextField221.setText("0.7");
		}
		return jTextField221;
	}

	/**
	 * This method initializes jCheckBox	
	 * 	
	 * @return javax.swing.JCheckBox	
	 */
	private JCheckBox getJCheckBox() {
		if (jCheckBox == null) {
			jCheckBox = new JCheckBox();
			jCheckBox.setBounds(new Rectangle(10, 259, 107, 21));
			jCheckBox.setText("Write to file");
			jCheckBox.setToolTipText("If checked, biclustering results will be stored in the selected path");
			jCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
				public void stateChanged(javax.swing.event.ChangeEvent e) {
					if(jCheckBox.isSelected())	
						{
						try{
							BufferedReader pathReader=new BufferedReader(new FileReader("es/usal/bicoverlapper/data/groupsPath.txt"));
							defaultPath=pathReader.readLine();
							}catch(IOException ex){System.err.println("pathReader has no information"); defaultPath="";}
						jCheckBox1.setEnabled(true);
						jButton.setEnabled(true);
						}
					else
						{
						defaultPath="";
						jButton.setEnabled(false);
						jCheckBox1.setEnabled(false);
						}
				}
			});
		}
		return jCheckBox;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setEnabled(false);
			jButton.setBounds(new Rectangle(146, 264, 73, 17));
			jButton.setText("Select");
			jButton.addActionListener(new java.awt.event.ActionListener() {

				
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JFileChooser selecFile = new JFileChooser();
					selecFile.addChoosableFileFilter(new BiclusterResultsFilter());
					selecFile.setCurrentDirectory(new File(defaultPath));
					int returnval = selecFile.showSaveDialog((Component)e.getSource());
					
					if(returnval == JFileChooser.APPROVE_OPTION) {
						resultsFile = selecFile.getSelectedFile();
						}

				}
			});
		}
		return jButton;
	}

	/**
	 * This method initializes jCheckBox1	
	 * 	
	 * @return javax.swing.JCheckBox	
	 */
	private JCheckBox getJCheckBox1() {
		if (jCheckBox1 == null) {
			jCheckBox1 = new JCheckBox();
			jCheckBox1.setToolTipText("This brief description will be added to the biclustering results file");
			jCheckBox1.setBounds(24, 285, 195, 24);
			jCheckBox1.setText("Add description line");
			jCheckBox1.setEnabled(false);
		}
		return jCheckBox1;
	}

	/**
	 * This method initializes jTextField212	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField212() {
		if (jTextField212 == null) {
			jTextField212 = new JTextField();
			jTextField212.setBounds(new Rectangle(39, 315, 181, 20));
			jTextField212.setText("");
		}
		return jTextField212;
	}

	/**
	 * This method initializes jButton1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setBounds(new Rectangle(71, 344, 106, 26));
			jButton1.setText("Run Plaid");
			jButton1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					if(session!=null)	
						{
						session=session.getMainWindow().getActiveWorkDesktop().getSession();
						Analysis b=session.getAnalysis();
					    
						String fileName="";
						if(resultsFile!=null)			
							{
							fileName=resultsFile.getPath().replace("\\", "/");
							if(!fileName.contains(".")) 	fileName=fileName.concat(".bic");
							}
						else 
							{
							if(getJCheckBox().isSelected())	fileName=defaultPath;
							}
					
						((JFrame)(getJPanel2().getTopLevelAncestor())).dispose();
					
						String cluster="b";
						if(getJRadioButton().isSelected())	cluster="r";
						if(getJRadioButton1().isSelected())	cluster="c";
						
						int[] filterOptions=null;
						if(getJCheckBox3().isSelected())
						   	{
							filterOptions=new int[4];
							filterOptions[0]=new Integer(getJTextField2211().getText()).intValue();
							filterOptions[1]=new Integer(getJTextField2211111().getText()).intValue();
							filterOptions[2]=new Integer(getJTextField221111().getText()).intValue();
							filterOptions[3]=new Integer(getJTextField22111().getText()).intValue();
						   	}
						b.setFilterOptions(filterOptions);
						ArrayList<Object> p=new ArrayList<Object>();
						   p.add(cluster);
						   p.add(new Float(getJTextField221().getText()).floatValue());
						   p.add(new Float(getJTextField22().getText()).floatValue());
						   p.add(fileName);
						   p.add(getJTextField212().getText());
						   AnalysisProgressMonitor apm=new AnalysisProgressMonitor(b, AnalysisProgressMonitor.AnalysisTask.PLAID, p);
						   apm.run();
						   t=apm.getTask();
						   Thread wt=new Thread() {
								public void run() {
									try{
										String fileName=t.get();
										if (fileName == null)
											JOptionPane.showMessageDialog(null,"No groups found","Error",JOptionPane.ERROR_MESSAGE);
										else 
											session.getMainWindow().getFileMenuManager().readGroups(new File(fileName).getAbsolutePath(), new File(fileName), session);

										/*if(fileName==null)	
											JOptionPane.showMessageDialog(null,
								                    "No biclusters found",
								                    "Error",JOptionPane.ERROR_MESSAGE);
										
										else
											{
											if(fileName.indexOf("/")>-1)
												session.getReader().readBiclusterResults(fileName.substring(0, fileName.lastIndexOf("/")),fileName.substring(fileName.lastIndexOf("/")+1), fileName, session);
											else
												session.getReader().readBiclusterResults("",fileName, fileName, session);
											}*/
										}catch(Exception e){e.printStackTrace();}
								}
							};
							wt.start();
							}
					}
			});
		}
		return jButton1;
	}
	/**
	 * This method initializes jRadioButton11	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getJRadioButton11() {
		if (jRadioButton11 == null) {
			jRadioButton11 = new JRadioButton();
			jRadioButton11.setBounds(new Rectangle(30, 114, 64, 24));
			jRadioButton11.setText("Both");
			jRadioButton11.setSelected(true);
			jRadioButton11.setToolTipText("Biclustering");
			jRadioButton11.addChangeListener(new javax.swing.event.ChangeListener() {
				public void stateChanged(javax.swing.event.ChangeEvent e) {
					if(jRadioButton11.isSelected())	
						{
						jRadioButton.setSelected(false);
						jRadioButton1.setSelected(false);
						}
				}
			});
		}
		return jRadioButton11;
	}
	/**
	 * This method initializes jCheckBox3	
	 * 	
	 * @return javax.swing.JCheckBox	
	 */
	private JCheckBox getJCheckBox3() {
		if (jCheckBox3 == null) {
			jCheckBox3 = new JCheckBox();
			jCheckBox3.setBounds(10, 139, 120, 24);
			jCheckBox3.setText("Post-filter");
			jCheckBox3.setToolTipText("Check to perform post-filter and select filter options");
			jCheckBox3.addChangeListener(new javax.swing.event.ChangeListener() {
				public void stateChanged(javax.swing.event.ChangeEvent e) {
					if(jCheckBox3.isSelected())	
						{
						jLabel21.setEnabled(true);
						jLabel211.setEnabled(true);
						jLabel2111.setEnabled(true);
						jLabel21111.setEnabled(true);
						jTextField2211.setEnabled(true);
						jTextField22111.setEnabled(true);
						jTextField221111.setEnabled(true);
						jTextField2211111.setEnabled(true);
						}
					else
						{
						jLabel21.setEnabled(false);
						jLabel211.setEnabled(false);
						jLabel2111.setEnabled(false);
						jLabel21111.setEnabled(false);
						jTextField2211.setEnabled(false);
						jTextField22111.setEnabled(false);
						jTextField221111.setEnabled(false);
						jTextField2211111.setEnabled(false);
						}
					}
					});
				}
		return jCheckBox3;
	}
	/**
	 * This method initializes jTextField2211	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField2211() {
		if (jTextField2211 == null) {
			jTextField2211 = new JTextField();
			jTextField2211.setBounds(new Rectangle(186, 170, 33, 20));
			jTextField2211.setText("25");
			jTextField2211.setEnabled(false);
		}
		return jTextField2211;
	}
	/**
	 * This method initializes jTextField22111	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField22111() {
		if (jTextField22111 == null) {
			jTextField22111 = new JTextField();
			jTextField22111.setBounds(new Rectangle(186, 190, 33, 20));
			jTextField22111.setText("100");
			jTextField22111.setEnabled(false);
		}
		return jTextField22111;
	}
	/**
	 * This method initializes jTextField221111	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField221111() {
		if (jTextField221111 == null) {
			jTextField221111 = new JTextField();
			jTextField221111.setBounds(new Rectangle(186, 210, 33, 20));
			jTextField221111.setText("100");
			jTextField221111.setEnabled(false);
		}
		return jTextField221111;
	}
	/**
	 * This method initializes jTextField2211111	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField2211111() {
		if (jTextField2211111 == null) {
			jTextField2211111 = new JTextField();
			jTextField2211111.setBounds(new Rectangle(186, 230, 33, 20));
			jTextField2211111.setText("50");
			jTextField2211111.setEnabled(false);
		}
		return jTextField2211111;
	}

}
