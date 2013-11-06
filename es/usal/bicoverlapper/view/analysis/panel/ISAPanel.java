package es.usal.bicoverlapper.view.analysis.panel;

import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

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
public class ISAPanel extends javax.swing.JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7103442914936543776L;
	private JButton jButton1;
	private JLabel jLabel2;
	private JLabel jLabel21;
	private JTextField jTextField2211111;
	private JCheckBox jCheckBox3;
	private JCheckBox jCheckBox;
	private JTextField jTextField2211;
	private JTextField jTextField22111;
	private JTextField jTextField221111;
	private JCheckBox jCheckBox1;
	private JButton jButton;
	private JLabel jLabel211;
	private JLabel jLabel2111;
	private JLabel jLabel21111;
	private JTextField jTextField212;
	private JTextField jTextField3;
	private JTextField jTextField2;
	private JTextField jTextField1;
	private JLabel jLabel3;
	private JLabel jLabel1;

	private Session session = null;
	public File resultsFile = null;
	public String defaultPath = ""; // @jve:decl-index=0:

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ISAPanel inst = new ISAPanel();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public ISAPanel() {
		super();
		initGUI();
	}

	public ISAPanel(Session s) {
		super();
		session = s;
		initGUI();
	}

	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout(
					(JComponent) getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jButton1 = new JButton();
				jButton1.setText("Run ISA");
				jButton1.setLayout(null);

				jButton1.addActionListener(new java.awt.event.ActionListener() {
					private AnalysisTask t;

					public void actionPerformed(java.awt.event.ActionEvent e) {
						if (session != null) {
							session = session.getMainWindow()
									.getActiveWorkDesktop().getSession();
							Analysis b = session.getAnalysis();

							String fileName = "";
							if (resultsFile != null) {
								fileName = resultsFile.getPath().replace("\\",
										"/");
								if (!fileName.contains("."))
									fileName = fileName.concat(".bic");
							} else {
								if (jCheckBox.isSelected())
									fileName = defaultPath;
							}

							setVisible(false);// ((JFrame)(getJPanel2().getTopLevelAncestor())).dispose();

							int[] filterOptions = null;
							if (jCheckBox3.isSelected()) {
								filterOptions = new int[4];
								filterOptions[0] = new Integer(jTextField2211
										.getText()).intValue();
								filterOptions[1] = new Integer(
										jTextField2211111.getText()).intValue();
								filterOptions[2] = new Integer(jTextField221111
										.getText()).intValue();
								filterOptions[3] = new Integer(jTextField22111
										.getText()).intValue();
							}
							b.setFilterOptions(filterOptions);
							ArrayList<Object> p = new ArrayList<Object>();

							p.add(new Float(jTextField1.getText()).floatValue());
							p.add(new Float(jTextField2.getText()).floatValue());
							p.add(new Integer(jTextField3.getText()).intValue());
							p.add(fileName);
							p.add(jTextField212.getText());
							AnalysisProgressMonitor apm = new AnalysisProgressMonitor(
									b,
									AnalysisProgressMonitor.AnalysisTask.ISA, p);
							apm.run();
							t = apm.getTask();
							Thread wt = new Thread() {
								public void run() {
									try {
										String fileName = t.get();
										if (fileName == null)
											JOptionPane.showMessageDialog(null,"No groups found","Error",JOptionPane.ERROR_MESSAGE);
										else 
											session.getMainWindow().getFileMenuManager().readGroups(new File(fileName).getAbsolutePath(), new File(fileName), session);

										/*if (fileName == null)
											JOptionPane.showMessageDialog(null,
													"No biclusters found",
													"Error",
													JOptionPane.ERROR_MESSAGE);

										else {
											if (fileName.indexOf("/") > -1)
												session.getReader()
														.readBiclusterResults(
																fileName.substring(
																		0,
																		fileName.lastIndexOf("/")),
																fileName.substring(fileName
																		.lastIndexOf("/") + 1),
																fileName,
																session);
											else
												session.getReader()
														.readBiclusterResults(
																"", fileName,
																fileName,
																session);
										}*/
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
			{
				jTextField2 = new JTextField();
				jTextField2.setText("0.9");
			}
			{
				jTextField3 = new JTextField();
				jTextField3.setText("10");
			}
			{
				jTextField212 = new JTextField();
				jTextField212.setText("");
				jTextField212.setBounds(new Rectangle(37, 330, 181, 20));
			}
			{
				jLabel21111 = new JLabel();
				jLabel21111.setText("Max. # biclusters");
				jLabel21111.setEnabled(false);
				jLabel21111
						.setToolTipText("Biclusters with at least this number of conditions are searched");
				jLabel21111.setBounds(new Rectangle(32, 248, 145, 16));
			}
			{
				jLabel2111 = new JLabel();
				jLabel2111.setText("Max. # conditions");
				jLabel2111.setEnabled(false);
				jLabel2111
						.setToolTipText("Biclusters with at least this number of conditions are searched");
				jLabel2111.setBounds(new Rectangle(33, 228, 143, 16));
			}
			{
				jLabel211 = new JLabel();
				jLabel211.setText("Max. # genes");
				jLabel211.setEnabled(false);
				jLabel211
						.setToolTipText("Biclusters with at least this number of conditions are searched");
				jLabel211.setBounds(new Rectangle(32, 208, 144, 16));
			}
			{
				jLabel21 = new JLabel();
				jLabel21.setText("Max. % of overlap");
				jLabel21.setEnabled(false);
				jLabel21.setToolTipText("Biclusters with at least this number of conditions are searched");
				jLabel21.setBounds(new Rectangle(31, 188, 144, 16));
			}
			{
				jButton = new JButton();
				jButton.setText("Select");
				jButton.setEnabled(false);
				jButton.setBounds(new Rectangle(148, 280, 73, 17));
				jButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
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
			{
				jCheckBox1 = new JCheckBox();
				jCheckBox1.setText("Add description");
				jCheckBox1.setEnabled(false);
				jCheckBox1
						.setToolTipText("This brief description will be added to the biclustering results file");
				jCheckBox1.setBounds(new Rectangle(19, 302, 123, 24));
			}
			{
				jTextField2211111 = new JTextField();
				jTextField2211111.setText("50");
				jTextField2211111.setEnabled(false);
				jTextField2211111.setBounds(new Rectangle(186, 248, 33, 20));
			}
			{
				jTextField221111 = new JTextField();
				jTextField221111.setText("100");
				jTextField221111.setEnabled(false);
				jTextField221111.setBounds(new Rectangle(186, 228, 33, 20));
			}
			{
				jTextField22111 = new JTextField();
				jTextField22111.setText("100");
				jTextField22111.setEnabled(false);
				jTextField22111.setBounds(new Rectangle(186, 208, 33, 20));
			}
			{
				jTextField2211 = new JTextField();
				jTextField2211.setText("25");
				jTextField2211.setEnabled(false);
				jTextField2211.setBounds(new Rectangle(186, 188, 33, 20));
			}
			{
				jCheckBox = new JCheckBox();
				jCheckBox.setText("Write to file");
				jCheckBox
						.setToolTipText("If checked, biclustering results will be stored in the selected path");
				jCheckBox.setBounds(new Rectangle(10, 277, 107, 21));
				jCheckBox.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						if (jCheckBox.isSelected()) {
							try {
								BufferedReader pathReader = new BufferedReader(
										new FileReader(
												"es/usal/bicoverlapper/data/groupsPath.txt"));
								defaultPath = pathReader.readLine();
							} catch (IOException ex) {
								System.err
										.println("pathReader has no information");
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
			{
				jCheckBox3 = new JCheckBox();
				jCheckBox3.setText("Post-filter");
				jCheckBox3
						.setToolTipText("Check to perform post-filter and select filter options");
				jCheckBox3.setBounds(new Rectangle(10, 164, 155, 24));
				jCheckBox3.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
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
			{
				jTextField1 = new JTextField();
				jTextField1.setText("0.9");
			}
			{
				jLabel1 = new JLabel();
				jLabel1.setText("Row threshold");
				jLabel1.setLayout(null);
			}
			{
				jLabel2 = new JLabel();
				jLabel2.setText("Column threshold");
				jLabel2.setLayout(null);
			}
			{
				jLabel3 = new JLabel();
				jLabel3.setText("Number of seeds");
				jLabel3.setLayout(null);
			}
			thisLayout
					.setVerticalGroup(thisLayout
							.createSequentialGroup()
							.addContainerGap()
							.addGroup(
									thisLayout
											.createParallelGroup(
													GroupLayout.Alignment.BASELINE)
											.addComponent(
													jTextField1,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(
													jLabel1,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(
									LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(
									thisLayout
											.createParallelGroup(
													GroupLayout.Alignment.BASELINE)
											.addComponent(
													jTextField2,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(
													jLabel2,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(
									LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(
									thisLayout
											.createParallelGroup()
											.addGroup(
													GroupLayout.Alignment.LEADING,
													thisLayout
															.createSequentialGroup()
															.addComponent(
																	jLabel3,
																	GroupLayout.PREFERRED_SIZE,
																	GroupLayout.PREFERRED_SIZE,
																	GroupLayout.PREFERRED_SIZE)
															.addGap(7))
											.addComponent(
													jTextField3,
													GroupLayout.Alignment.LEADING,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE,
													GroupLayout.PREFERRED_SIZE))
							.addGap(16)
							.addComponent(jCheckBox3,
									GroupLayout.PREFERRED_SIZE, 24,
									GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(
									LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(
									thisLayout
											.createParallelGroup(
													GroupLayout.Alignment.BASELINE)
											.addComponent(
													jTextField2211,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													20,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(
													jLabel21,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													16,
													GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(
									LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(
									thisLayout
											.createParallelGroup(
													GroupLayout.Alignment.BASELINE)
											.addComponent(
													jTextField22111,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													20,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(
													jLabel2111,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													16,
													GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(
									LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(
									thisLayout
											.createParallelGroup(
													GroupLayout.Alignment.BASELINE)
											.addComponent(
													jTextField221111,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													20,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(
													jLabel211,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													16,
													GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(
									LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(
									thisLayout
											.createParallelGroup(
													GroupLayout.Alignment.BASELINE)
											.addComponent(
													jTextField2211111,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													20,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(
													jLabel21111,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													16,
													GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(
									LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(
									thisLayout
											.createParallelGroup(
													GroupLayout.Alignment.BASELINE)
											.addComponent(
													jCheckBox,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													21,
													GroupLayout.PREFERRED_SIZE)
											.addComponent(
													jButton,
													GroupLayout.Alignment.BASELINE,
													GroupLayout.PREFERRED_SIZE,
													17,
													GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(
									LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(jCheckBox1,
									GroupLayout.PREFERRED_SIZE, 24,
									GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(
									LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(jTextField212,
									GroupLayout.PREFERRED_SIZE, 20,
									GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(
									LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(jButton1, GroupLayout.PREFERRED_SIZE,
									GroupLayout.PREFERRED_SIZE,
									GroupLayout.PREFERRED_SIZE)
							.addContainerGap(17, Short.MAX_VALUE));
			thisLayout
					.setHorizontalGroup(thisLayout
							.createSequentialGroup()
							.addGap(6)
							.addGroup(
									thisLayout
											.createParallelGroup()
											.addGroup(
													thisLayout
															.createSequentialGroup()
															.addGroup(
																	thisLayout
																			.createParallelGroup()
																			.addComponent(
																					jLabel3,
																					GroupLayout.Alignment.LEADING,
																					GroupLayout.PREFERRED_SIZE,
																					125,
																					GroupLayout.PREFERRED_SIZE)
																			.addGroup(
																					GroupLayout.Alignment.LEADING,
																					thisLayout
																							.createSequentialGroup()
																							.addComponent(
																									jLabel2,
																									GroupLayout.PREFERRED_SIZE,
																									116,
																									GroupLayout.PREFERRED_SIZE)
																							.addGap(9))
																			.addGroup(
																					GroupLayout.Alignment.LEADING,
																					thisLayout
																							.createSequentialGroup()
																							.addComponent(
																									jLabel1,
																									GroupLayout.PREFERRED_SIZE,
																									116,
																									GroupLayout.PREFERRED_SIZE)
																							.addGap(9)))
															.addGap(7)
															.addGroup(
																	thisLayout
																			.createParallelGroup()
																			.addGroup(
																					thisLayout
																							.createSequentialGroup()
																							.addGap(0,
																									0,
																									Short.MAX_VALUE)
																							.addComponent(
																									jButton,
																									GroupLayout.PREFERRED_SIZE,
																									73,
																									GroupLayout.PREFERRED_SIZE))
																			.addGroup(
																					thisLayout
																							.createSequentialGroup()
																							.addGap(0,
																									11,
																									Short.MAX_VALUE)
																							.addGroup(
																									thisLayout
																											.createParallelGroup()
																											.addComponent(
																													jTextField3,
																													GroupLayout.Alignment.LEADING,
																													GroupLayout.PREFERRED_SIZE,
																													43,
																													GroupLayout.PREFERRED_SIZE)
																											.addComponent(
																													jTextField2,
																													GroupLayout.Alignment.LEADING,
																													GroupLayout.PREFERRED_SIZE,
																													42,
																													GroupLayout.PREFERRED_SIZE)
																											.addComponent(
																													jTextField1,
																													GroupLayout.Alignment.LEADING,
																													GroupLayout.PREFERRED_SIZE,
																													42,
																													GroupLayout.PREFERRED_SIZE))
																							.addGap(19))))
											.addGroup(
													GroupLayout.Alignment.LEADING,
													thisLayout
															.createSequentialGroup()
															.addComponent(
																	jCheckBox3,
																	GroupLayout.PREFERRED_SIZE,
																	155,
																	GroupLayout.PREFERRED_SIZE)
															.addGap(0,
																	50,
																	Short.MAX_VALUE))
											.addGroup(
													thisLayout
															.createSequentialGroup()
															.addPreferredGap(
																	jLabel3,
																	jCheckBox,
																	LayoutStyle.ComponentPlacement.INDENT)
															.addGroup(
																	thisLayout
																			.createParallelGroup()
																			.addGroup(
																					GroupLayout.Alignment.LEADING,
																					thisLayout
																							.createSequentialGroup()
																							.addGap(0,
																									0,
																									Short.MAX_VALUE)
																							.addComponent(
																									jCheckBox,
																									GroupLayout.PREFERRED_SIZE,
																									107,
																									GroupLayout.PREFERRED_SIZE)
																							.addGap(91))
																			.addGroup(
																					thisLayout
																							.createSequentialGroup()
																							.addPreferredGap(
																									jCheckBox,
																									jLabel21,
																									LayoutStyle.ComponentPlacement.INDENT)
																							.addGroup(
																									thisLayout
																											.createParallelGroup()
																											.addGroup(
																													GroupLayout.Alignment.LEADING,
																													thisLayout
																															.createSequentialGroup()
																															.addComponent(
																																	jCheckBox1,
																																	0,
																																	172,
																																	Short.MAX_VALUE)
																															.addGap(21))
																											.addGroup(
																													thisLayout
																															.createSequentialGroup()
																															.addComponent(
																																	jTextField212,
																																	GroupLayout.PREFERRED_SIZE,
																																	193,
																																	GroupLayout.PREFERRED_SIZE)
																															.addGap(0,
																																	0,
																																	Short.MAX_VALUE))
																											.addGroup(
																													thisLayout
																															.createSequentialGroup()
																															.addGroup(
																																	thisLayout
																																			.createParallelGroup()
																																			.addGroup(
																																					thisLayout
																																							.createSequentialGroup()
																																							.addPreferredGap(
																																									LayoutStyle.ComponentPlacement.RELATED)
																																							.addGroup(
																																									thisLayout
																																											.createParallelGroup()
																																											.addGroup(
																																													GroupLayout.Alignment.LEADING,
																																													thisLayout
																																															.createSequentialGroup()
																																															.addGap(0,
																																																	0,
																																																	Short.MAX_VALUE)
																																															.addComponent(
																																																	jLabel211,
																																																	GroupLayout.PREFERRED_SIZE,
																																																	144,
																																																	GroupLayout.PREFERRED_SIZE)
																																															.addPreferredGap(
																																																	LayoutStyle.ComponentPlacement.RELATED))
																																											.addGroup(
																																													GroupLayout.Alignment.LEADING,
																																													thisLayout
																																															.createSequentialGroup()
																																															.addGap(0,
																																																	0,
																																																	Short.MAX_VALUE)
																																															.addComponent(
																																																	jLabel2111,
																																																	GroupLayout.PREFERRED_SIZE,
																																																	143,
																																																	GroupLayout.PREFERRED_SIZE)
																																															.addPreferredGap(
																																																	LayoutStyle.ComponentPlacement.RELATED))
																																											.addGroup(
																																													GroupLayout.Alignment.LEADING,
																																													thisLayout
																																															.createSequentialGroup()
																																															.addGap(63)
																																															.addComponent(
																																																	jButton1,
																																																	GroupLayout.PREFERRED_SIZE,
																																																	84,
																																																	GroupLayout.PREFERRED_SIZE)
																																															.addGap(0,
																																																	0,
																																																	Short.MAX_VALUE))))
																																			.addGroup(
																																					GroupLayout.Alignment.LEADING,
																																					thisLayout
																																							.createSequentialGroup()
																																							.addComponent(
																																									jLabel21,
																																									GroupLayout.PREFERRED_SIZE,
																																									144,
																																									GroupLayout.PREFERRED_SIZE)
																																							.addGap(0,
																																									8,
																																									Short.MAX_VALUE))
																																			.addGroup(
																																					GroupLayout.Alignment.LEADING,
																																					thisLayout
																																							.createSequentialGroup()
																																							.addGap(0,
																																									0,
																																									Short.MAX_VALUE)
																																							.addComponent(
																																									jLabel21111,
																																									GroupLayout.PREFERRED_SIZE,
																																									145,
																																									GroupLayout.PREFERRED_SIZE)
																																							.addPreferredGap(
																																									LayoutStyle.ComponentPlacement.RELATED)))
																															.addPreferredGap(
																																	LayoutStyle.ComponentPlacement.RELATED)
																															.addGroup(
																																	thisLayout
																																			.createParallelGroup()
																																			.addComponent(
																																					jTextField2211111,
																																					GroupLayout.Alignment.LEADING,
																																					GroupLayout.PREFERRED_SIZE,
																																					33,
																																					GroupLayout.PREFERRED_SIZE)
																																			.addComponent(
																																					jTextField221111,
																																					GroupLayout.Alignment.LEADING,
																																					GroupLayout.PREFERRED_SIZE,
																																					33,
																																					GroupLayout.PREFERRED_SIZE)
																																			.addComponent(
																																					jTextField22111,
																																					GroupLayout.Alignment.LEADING,
																																					GroupLayout.PREFERRED_SIZE,
																																					33,
																																					GroupLayout.PREFERRED_SIZE)
																																			.addComponent(
																																					jTextField2211,
																																					GroupLayout.Alignment.LEADING,
																																					GroupLayout.PREFERRED_SIZE,
																																					33,
																																					GroupLayout.PREFERRED_SIZE))
																															.addGap(8)))))))
							.addContainerGap(33, 33));
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
