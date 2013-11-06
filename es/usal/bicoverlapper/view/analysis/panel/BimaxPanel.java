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
 * This code was edited or generated using CloudGarden's Jigloo SWT/Swing GUI
 * Builder, which is free for non-commercial use. If Jigloo is being used
 * commercially (ie, by a corporation, company or business for any purpose
 * whatever) then you should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details. Use of Jigloo implies
 * acceptance of these licensing terms. A COMMERCIAL LICENSE HAS NOT BEEN
 * PURCHASED FOR THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED LEGALLY FOR
 * ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class BimaxPanel {

	private JPanel jPanel = null; // @jve:decl-index=0:visual-constraint="28,8"
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JTextField jTextField2 = null;
	private JLabel jLabel3 = null;
	private JRadioButton jRadioButton = null;
	private JRadioButton jRadioButton1 = null;
	private JTextField jTextField21 = null;
	private JTextField jTextField211 = null;
	private JTextField jTextField22 = null;
	private JTextField jTextField221 = null;
	private JCheckBox jCheckBox = null;
	private JButton jButton = null;
	private JCheckBox jCheckBox1 = null;
	private JTextField jTextField212 = null;
	private JButton jButton1 = null;
	private Session session = null;
	private File resultsFile = null;
	private String defaultPath = ""; // @jve:decl-index=0:
	protected AnalysisTask t;
	private JCheckBox jCheckBox2 = null;
	private JCheckBox jCheckBox3 = null;
	private JLabel jLabel21 = null;
	private JLabel jLabel211 = null;
	private JLabel jLabel2111 = null;
	private JLabel jLabel21111 = null;
	private JTextField jTextField2211 = null;
	private JTextField jTextField22111 = null;
	private JTextField jTextField221111 = null;
	private JTextField jTextField2211111 = null;

	public BimaxPanel() {
	}

	public BimaxPanel(Session s) {
		session = s;
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
			jLabel21111.setBounds(new Rectangle(32, 248, 145, 16));
			jLabel21111.setText("Max. # biclusters");
			jLabel21111.setEnabled(false);
			jLabel21111
					.setToolTipText("Biclusters with at least this number of conditions are searched");
			jLabel2111 = new JLabel();
			jLabel2111.setBounds(new Rectangle(33, 228, 143, 16));
			jLabel2111.setText("Max. # conditions");
			jLabel2111.setEnabled(false);
			jLabel2111
					.setToolTipText("Biclusters with at least this number of conditions are searched");
			jLabel211 = new JLabel();
			jLabel211.setBounds(new Rectangle(32, 208, 144, 16));
			jLabel211.setText("Max. # genes");
			jLabel211.setEnabled(false);
			jLabel211
					.setToolTipText("Biclusters with at least this number of conditions are searched");
			jLabel21 = new JLabel();
			jLabel21.setBounds(new Rectangle(31, 188, 144, 16));
			jLabel21.setText("Max. % of overlap");
			jLabel21.setEnabled(false);
			jLabel21.setToolTipText("Biclusters with at least this number of conditions are searched");
			jLabel3 = new JLabel();
			jLabel3.setText("Binary threshold");
			jLabel3.setBounds(new Rectangle(10, 75, 172, 16));
			jLabel3.setToolTipText("Microarray matrix must be binarized in order to run Bimax");
			jLabel2 = new JLabel();
			jLabel2.setText("Max. # of biclusters");
			jLabel2.setToolTipText("Biclusters with at least this number of conditions are searched");
			jLabel2.setBounds(new Rectangle(10, 48, 167, 16));
			jLabel1 = new JLabel();
			jLabel1.setText("Min. # of conditions");
			jLabel1.setToolTipText("Biclusters with at least this number of conditions are searched");
			jLabel1.setBounds(new Rectangle(10, 31, 168, 16));
			jLabel = new JLabel();
			jLabel.setText("Min. # of genes");
			jLabel.setToolTipText("Biclusters with at least this number of genes are searched");
			jLabel.setBounds(new Rectangle(10, 13, 165, 16));
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setSize(new Dimension(241, 406));
			jPanel.add(jLabel, null);
			jPanel.add(jLabel1, null);
			jPanel.add(jLabel2, null);
			jPanel.add(getJTextField2(), null);
			jPanel.add(jLabel3, null);
			jPanel.add(getJRadioButton(), null);
			jPanel.add(getJRadioButton1(), null);
			jPanel.add(getJTextField21(), null);
			jPanel.add(getJTextField211(), null);
			jPanel.add(getJTextField22(), null);
			jPanel.add(getJTextField221(), null);
			jPanel.add(getJCheckBox(), null);
			jPanel.add(getJButton(), null);
			jPanel.add(getJCheckBox1(), null);
			jPanel.add(getJTextField212(), null);
			jPanel.add(getJButton1(), null);
			jPanel.add(getJCheckBox2(), null);
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
	 * This method initializes jTextField2
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
			jTextField2.setText("20");
			jTextField2.setBounds(186, 49, 43, 20);
		}
		return jTextField2;
	}

	/**
	 * This method initializes jRadioButton
	 * 
	 * @return javax.swing.JRadioButton
	 */
	private JRadioButton getJRadioButton() {
		if (jRadioButton == null) {
			jRadioButton = new JRadioButton();
			jRadioButton.setSelected(true);
			jRadioButton
					.setToolTipText("This percentage of the highest levels will be 1, the rest will be 0");
			jRadioButton.setText("By percentage");
			jRadioButton.setBounds(new Rectangle(30, 92, 146, 24));
			jRadioButton
					.addChangeListener(new javax.swing.event.ChangeListener() {
						public void stateChanged(javax.swing.event.ChangeEvent e) {
							if (jRadioButton.isSelected()) {
								jRadioButton1.setSelected(false);
								jTextField21.setEnabled(true);
								jTextField211.setEnabled(false);
							} else {
								jRadioButton1.setSelected(true);
								jTextField21.setEnabled(false);
								jTextField211.setEnabled(true);
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
			jRadioButton1.setText("By expression value");
			jRadioButton1
					.setToolTipText("Expression levels above this value will be 1, the rest will be 0");

			jRadioButton1.setBounds(new Rectangle(30, 114, 151, 24));
			jRadioButton1
					.addChangeListener(new javax.swing.event.ChangeListener() {
						public void stateChanged(javax.swing.event.ChangeEvent e) {
							if (jRadioButton1.isSelected()) {
								jRadioButton.setSelected(false);
								jTextField211.setEnabled(true);
								jTextField21.setEnabled(false);
							} else {
								jRadioButton.setSelected(true);
								jTextField211.setEnabled(false);
								jTextField21.setEnabled(true);
							}
						}
					});

		}
		return jRadioButton1;
	}

	/**
	 * This method initializes jTextField21
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField21() {
		if (jTextField21 == null) {
			jTextField21 = new JTextField();
			jTextField21.setText("5");
			jTextField21.setBounds(187, 91, 42, 24);
		}
		return jTextField21;
	}

	/**
	 * This method initializes jTextField211
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField211() {
		if (jTextField211 == null) {
			jTextField211 = new JTextField();
			jTextField211.setText("0.95");
			jTextField211.setEnabled(false);
			jTextField211.setBounds(187, 115, 42, 24);
		}
		return jTextField211;
	}

	/**
	 * This method initializes jTextField22
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField22() {
		if (jTextField22 == null) {
			jTextField22 = new JTextField();
			jTextField22.setBounds(186, 29, 43, 20);
			jTextField22.setText("2");
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
			jTextField221.setBounds(186, 8, 43, 20);
			jTextField221.setText("2");
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
			jCheckBox.setBounds(new Rectangle(10, 277, 107, 21));
			jCheckBox.setText("Write to file");
			jCheckBox
					.setToolTipText("If checked, biclustering results will be stored in the selected path");
			jCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
				public void stateChanged(javax.swing.event.ChangeEvent e) {
					if (jCheckBox.isSelected()) {
						try {
							BufferedReader pathReader = new BufferedReader(
									new FileReader(
											"es/usal/bicoverlapper/data/groupsPath.txt"));
							defaultPath = pathReader.readLine();
						} catch (IOException ex) {
							System.err.println("pathReader has no information");
							defaultPath = "";
						}
						jCheckBox1.setEnabled(true);
						jButton.setEnabled(true);
					} else {
						defaultPath = "";
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
			jButton.setBounds(new Rectangle(148, 280, 73, 17));
			jButton.setText("Select");
			jButton.addActionListener(new java.awt.event.ActionListener() {

				public void actionPerformed(java.awt.event.ActionEvent e) {
					JFileChooser selecFile = new JFileChooser();
					selecFile
							.addChoosableFileFilter(new BiclusterResultsFilter());
					selecFile.setCurrentDirectory(new File(defaultPath));
					int returnval = selecFile.showSaveDialog((Component) e
							.getSource());

					if (returnval == JFileChooser.APPROVE_OPTION) {
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
			jCheckBox1
					.setToolTipText("This brief description will be added to the biclustering results file");
			jCheckBox1.setBounds(19, 302, 199, 24);
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
			jTextField212.setBounds(new Rectangle(37, 330, 181, 20));
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
			jButton1.setBounds(new Rectangle(63, 370, 106, 26));
			jButton1.setText("Run Bimax");
			jButton1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					session = session.getMainWindow().getActiveWorkDesktop()
							.getSession();
					if (session != null) {
						Analysis b = session.getAnalysis();

						String fileName = "";
						if (resultsFile != null) {
							fileName = resultsFile.getPath().replace("\\", "/");
							if (!fileName.contains("."))
								fileName = fileName.concat(".bic");
						} else {
							if (getJCheckBox().isSelected())
								fileName = defaultPath;
						}

						((JFrame) (getJPanel2().getTopLevelAncestor()))
								.dispose();

						int[] filterOptions = null;
						if (getJCheckBox3().isSelected()) {
							filterOptions = new int[4];
							filterOptions[0] = new Integer(getJTextField2211()
									.getText()).intValue();
							filterOptions[1] = new Integer(
									getJTextField2211111().getText())
									.intValue();
							filterOptions[2] = new Integer(
									getJTextField221111().getText()).intValue();
							filterOptions[3] = new Integer(getJTextField22111()
									.getText()).intValue();
						}
						b.setFilterOptions(filterOptions);
						ArrayList<Object> p = new ArrayList<Object>();
						p.add(getJRadioButton().isSelected() ? true : false);
						p.add(getJRadioButton().isSelected() ? new Double(
								getJTextField21().getText()).doubleValue()
								: new Double(getJTextField211().getText())
										.doubleValue());
						p.add(getJCheckBox2().isSelected() ? true : false);
						p.add(new Integer(getJTextField221().getText())
								.intValue());
						p.add(new Integer(getJTextField22().getText())
								.intValue());
						p.add(new Integer(getJTextField2().getText())
								.intValue());
						p.add(fileName);
						p.add(getJTextField212().getText());
						AnalysisProgressMonitor apm = new AnalysisProgressMonitor(
								b, AnalysisProgressMonitor.AnalysisTask.BIMAX,
								p);
						apm.run();
						t = apm.getTask();
						Thread wt = new Thread() {
							public void run() {
								try {
									String fileName = t.get();
									if (fileName == null)
										JOptionPane.showMessageDialog(null,
												"No biclusters found", "Note",
												JOptionPane.WARNING_MESSAGE);

									else {
										session.getMainWindow().getFileMenuManager().readGroups(new File(fileName).getAbsolutePath(), new File(fileName), session);

									}
								} catch (Exception e) {
									e.printStackTrace();
								}
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
	 * This method initializes jCheckBox2
	 * 
	 * @return javax.swing.JCheckBox
	 */
	private JCheckBox getJCheckBox2() {
		if (jCheckBox2 == null) {
			jCheckBox2 = new JCheckBox();
			jCheckBox2.setBounds(new Rectangle(30, 137, 157, 24));
			jCheckBox2.setText("Under threshold");
			jCheckBox2
					.setToolTipText("If checked, biclustering results will be stored in the selected path");
		}
		return jCheckBox2;
	}

	/**
	 * This method initializes jCheckBox3
	 * 
	 * @return javax.swing.JCheckBox
	 */
	private JCheckBox getJCheckBox3() {
		if (jCheckBox3 == null) {
			jCheckBox3 = new JCheckBox();
			jCheckBox3.setBounds(new Rectangle(10, 164, 155, 24));
			jCheckBox3.setText("Post-filter");
			jCheckBox3
					.setToolTipText("Check to perform post-filter and select filter options");
			jCheckBox3
					.addChangeListener(new javax.swing.event.ChangeListener() {
						public void stateChanged(javax.swing.event.ChangeEvent e) {
							if (jCheckBox3.isSelected()) {
								jLabel21.setEnabled(true);
								jLabel211.setEnabled(true);
								jLabel2111.setEnabled(true);
								jLabel21111.setEnabled(true);
								jTextField2211.setEnabled(true);
								jTextField22111.setEnabled(true);
								jTextField221111.setEnabled(true);
								jTextField2211111.setEnabled(true);
							} else {
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
			jTextField2211.setBounds(186, 188, 43, 20);
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
			jTextField22111.setBounds(186, 208, 43, 20);
			jTextField22111.setEnabled(false);
			jTextField22111.setText("100");
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
			jTextField221111.setBounds(186, 228, 43, 20);
			jTextField221111.setEnabled(false);
			jTextField221111.setText("100");
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
			jTextField2211111.setBounds(186, 247, 43, 20);
			jTextField2211111.setEnabled(false);
			jTextField2211111.setText("50");
		}
		return jTextField2211111;
	}

}
