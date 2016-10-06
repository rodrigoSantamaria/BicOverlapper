package es.usal.bicoverlapper.view.analysis.panel;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;

import es.usal.bicoverlapper.controller.analysis.Analysis;
import es.usal.bicoverlapper.controller.analysis.AnalysisProgressMonitor;
import es.usal.bicoverlapper.controller.analysis.AnalysisProgressMonitor.AnalysisTask;
import es.usal.bicoverlapper.controller.data.filter.BiclusterResultsFilter;
import es.usal.bicoverlapper.controller.kernel.Session;
import es.usal.bicoverlapper.model.microarray.ExpressionData;

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
public class DiffExpPanel extends javax.swing.JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton OK;
	private JTextField pvalueValue;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private JList group2;
	private JList group1;
	private JComboBox regulation;
	private JTextField expressionValue;
	private JLabel differentialExpression;
	private JLabel pvalue;
	private Session session;
	private JScrollPane jScrollPane1;
	private JScrollPane jScrollPane2;
	private JCheckBox addDescription;
	private JButton select;
	private JCheckBox writeToFile;
	private JTextField description;
	private DefaultComboBoxModel group1Model;
	private DefaultComboBoxModel group2Model;

	private String defaultPath;
	private File resultsFile;

	public DiffExpPanel() {
		super();
		initGUI();
	}

	public DiffExpPanel(Session s) {
		super();
		session = s;
		initGUI();
	}

	private void initGUI() {
		try {
			{
				this.setSize(286, 225);
			}
			this.setPreferredSize(new java.awt.Dimension(497, 490));
			getContentPane().setLayout(null);
			this.setSize(497, 490);
			this.setAlwaysOnTop(false);
			// this.setToolTipText("Limma differential expression analysis between groups 1 and 2.\r\nThe genes above the thresholds are selected.");
			{
				OK = new JButton();
				getContentPane().add(OK);
				OK.setText("Differential Expression Analysis");
				OK.setBounds(120, 425, 241, 21);
				OK.addActionListener(new java.awt.event.ActionListener() {
					private AnalysisTask t;

					/*
					 * Possible combinations: 1) rest vs rest - diffexp among
					 * every combination of efvs for every ef 2) efv1 vs efv2
					 * (different efs) - error 3) efv1 vs efv2 (same ef) - diff
					 * exp between both groups of samples. If one of the groups
					 * has only 1 sample, error 4) efv vs rest - diff exp
					 * between the efv samples and the rest of samples 4b) ef vs
					 * rest - diff exp between every efv on the ef and the rest
					 * of the samples 5) efv vs ef (other ef) - error 6) efv vs
					 * ef (its ef) - diff exp between efv and each of the groups
					 * for the others efvs on that ef. All the efvs must have 2+
					 * samples 7) ef vs ef (same ef) - diff exp among every
					 * combination of efvs for the given ef 8) ef vs ef
					 * (different efs) - error (non-Javadoc)
					 * 
					 * @see
					 * java.awt.event.ActionListener#actionPerformed(java.awt
					 * .event.ActionEvent) TODO: he quitado el caso de rest, es
					 * poco intuitivo y ahora mismo no funciona Adem‡s se puede
					 * hacer con los otros.
					 */
					public void actionPerformed(java.awt.event.ActionEvent e) {
						String ef1 = null;
						String efv1 = null;
						
						//NO GROUP SELECTED
						if (null == group1.getSelectedValue()
								|| null == group2.getSelectedValue()) {
							try{
								SwingUtilities.invokeLater(new Runnable(){public void run(){
									String msgError = "There is no information about experimental factor in the expression file, so no differential expression analysis can be done. Please add this information as described in the help (format section).";
									JOptionPane.showMessageDialog(null, msgError,
											"Error", JOptionPane.ERROR_MESSAGE);
									}});
								}catch(Exception ex){ex.printStackTrace();}
							
							return;
						}

						String g1 = group1.getSelectedValue().toString();
						String g2 = group2.getSelectedValue().toString();

						//BOTH EFs
						if (!g1.startsWith(" ") && !g2.startsWith(" ") && !g1.equals("rest") && !g2.equals("rest"))// both are efs
							{
								if (!g1.equals(g2))// 8)
								{
									try{
										SwingUtilities.invokeLater(new Runnable(){public void run(){
											JOptionPane.showMessageDialog(null,
													"Different experimental factors (EFs) cannot be compared.\n Please choose the same EF or EF values from the same EF",
													"Error", JOptionPane.ERROR_MESSAGE);
											}});
										}catch(Exception ex){ex.printStackTrace();}
									return;
								}
							}
						
						//EF1 is REST
						if (g1.equals("rest")) {
							ef1 = efv1 = "rest";
						}// 4), 4b)
						else {
							efv1 = g1.toString().trim();
							for (int i = group1.getSelectedIndex(); i >= 0; i--)// search
																				// for
																				// its
																				// ef
							{
								if (!group1Model.getElementAt(i).toString()
										.startsWith(" ")) {
									ef1 = group1Model.getElementAt(i)
											.toString();
									break;
								}
							}
						}
						String ef2 = null;
						String efv2 = null;
						
						//EF2 is REST
						if (g2.equals("rest")) {
							ef2 = "rest";
							efv2 = "rest";
						} else {
							efv2 = g2.toString().trim();
							for (int i = group2.getSelectedIndex(); i >= 0; i--) {
								if (!group2Model.getElementAt(i).toString()
										.startsWith(" ")) {
									ef2 = group2Model.getElementAt(i)
											.toString();
									break;
								}
							}
						}
						
						//DIFFERENT EFS (ERROR)
						if (!ef1.equals("rest") && !ef2.equals("rest")
								&& ef1 != null && ef2 != null
								&& !ef1.equals(ef2)) // 2)
						{
							JOptionPane
									.showMessageDialog(
											null,
											"Experimental factors values must come from the same experimental factor",
											"Error", JOptionPane.ERROR_MESSAGE);
							return;
						}

						String reg = "";
						switch (regulation.getSelectedIndex()) {
						case 0:
							reg = "up";
							break;
						case 1:
							reg = "down";
							break;
						case 2:
							reg = "all";
							break;
						default:
							reg = "all";
							break;
						}

						String fileName = "";
						if (resultsFile != null) {
							fileName = resultsFile.getPath().replace("\\", "/");
							if (!fileName.contains("."))
								fileName = fileName.concat(".bic");
						} else {
							if (writeToFile.isSelected())
								fileName = defaultPath;
						}
						session = session.getMainWindow()
								.getActiveWorkDesktop().getSession();
						Analysis b = session.getAnalysis();
						b.setFilterOptions(null);

						//--------------------------------------------------
						//----------    1 EVERY COMBINATION OF AN EF -------
						//--------------------------------------------------
						if (ef1.equals(ef2) && efv1.equals(efv2) && group1.getSelectedIndices().length==1 && group2.getSelectedIndices().length==1) 
							{
							// 7) Same ef, do every possible combination
							System.out.println("Same EF case");
							if (ef1.equals("Sample names"))
								{
								try{
									SwingUtilities.invokeLater(new Runnable(){public void run(){
										JOptionPane.showMessageDialog(null, "General selection is only allowed on Experimental Factors with replicates.\nFor Sample names, please select two or more names for each group", "Error", JOptionPane.ERROR_MESSAGE);
										}});
									}catch(Exception ex){ex.printStackTrace();}
								return;
							}
							ArrayList<Object> p = new ArrayList<Object>();
							p.add(ef1);
							p.add(true);
							p.add(new Double(pvalueValue.getText())
									.doubleValue());
							p.add(new Double(expressionValue.getText())
									.doubleValue());
							p.add(reg);
							p.add(fileName);
							p.add(description.getText());

							AnalysisProgressMonitor apm = new AnalysisProgressMonitor(
									b,
									AnalysisProgressMonitor.AnalysisTask.LIMMAEFALL,
									p);
							apm.run();
							t = apm.getTask();
							Thread wt = new Thread() {
								public void run() {
									try {
										String fileName = t.get();
										if (fileName == null)
											{
											try{
												SwingUtilities.invokeLater(new Runnable(){public void run(){
													JOptionPane.showMessageDialog(null,"No differentially expressed genes found","Error",JOptionPane.ERROR_MESSAGE);
													}});
												}catch(Exception e){e.printStackTrace();}
											return;
											}
										else session.getMainWindow().getFileMenuManager().readGroups(new File(fileName).getAbsolutePath(), new File(fileName), session);
									} catch (Exception e) {
										e.printStackTrace();
									}
								}
							};
							wt.start();
							setVisible(false);
							}
						
						//--------------------------------------------------
						//----------    2 One EFV against the rest of EFVs of a single EF -------
						//--------------------------------------------------
						//EF vs EFV
						else if (!efv1.equals("rest") && !efv2.equals("rest") && !efv1.equals("Sample names") && !efv2.equals("Sample names")
								&& (efv1.equals(ef1) || efv2.equals(ef2))
								&& ef1.equals(ef2))// same ef, not rest
							{ // TODO: 4b, 5, 6
							System.out.println("EF vs EFV case");
							String ef = null, efv = null;
							if (efv1.equals(ef1)) 
								{
								ef = ef1;
								efv = efv2;
								}
							else if (efv2.equals(ef2)) 
								{
								ef = ef2;
								efv = efv1;
								}

							ArrayList<Object> p = new ArrayList<Object>();
							p.add(ef);
							p.add(efv);
							p.add(true);
							p.add(new Double(pvalueValue.getText()).doubleValue());
							p.add(new Double(expressionValue.getText()).doubleValue());
							p.add(reg);
							p.add(fileName);
							p.add(description.getText());

							AnalysisProgressMonitor apm = new AnalysisProgressMonitor(
									b,
									AnalysisProgressMonitor.AnalysisTask.LIMMAEF,
									p);
							apm.run();
							t = apm.getTask();
							Thread wt = new Thread() {
								public void run() {
									try {
										String fileName = t.get();
										if (fileName == null)
											{
											try{
												SwingUtilities.invokeLater(new Runnable(){public void run(){
													JOptionPane.showMessageDialog(null, "No groups found", "Error", JOptionPane.ERROR_MESSAGE);
													}});
												}catch(Exception e){e.printStackTrace();}
											return;
											}
										else {
											session.getMainWindow().getFileMenuManager().readGroups(new File(fileName).getAbsolutePath(), new File(fileName), session);
										}
									} catch (Exception e) {
										e.printStackTrace();
									}
								}
							};
							wt.start();
							setVisible(false);
							}
							
						//--------------------------------------------------
						//----------    3 Just two EFVs comparison   -------
						//--------------------------------------------------
						//EFV vs EFV
						//TODO: distinguish between multiple EFVs select or just one against one.
						//TODO: decide about rest, right now rest vs EF or EFV is coming here
						else {
							if(group1.getSelectedIndices().length==1 && group2.getSelectedIndices().length==1)	//take them as single EFVs and take confidence on replicates for them
							{	
							// 3,4) ---------------- EFVs case
							System.out.println("EFV vs EFV case");
							String nameG1 = efv1;
							String nameG2 = efv2;
							if (ef2.equals("rest")) {
								efv2 = efv1;
								ef2 = ef1;
							}// 4)
							if (ef1.equals("rest")) {
								efv1 = efv2;
								ef1 = ef2;
							}// 4)

							ArrayList<Object> p = new ArrayList<Object>();
							p.add(ef1);
							p.add(nameG1);
							p.add(nameG2);
							p.add(true);
							p.add(new Double(pvalueValue.getText())
									.doubleValue());
							p.add(new Double(expressionValue.getText())
									.doubleValue());
							p.add(reg);
							p.add(fileName);
							p.add(description.getText());

							AnalysisProgressMonitor apm = new AnalysisProgressMonitor(
									b,
									AnalysisProgressMonitor.AnalysisTask.LIMMA,
									p);
							apm.run();
							t = apm.getTask();
							Thread wt = new Thread() {
								public void run() {
									try {
										String fileName = t.get();
										if (fileName == null)
											{
											try{
												SwingUtilities.invokeLater(new Runnable(){public void run(){
													JOptionPane.showMessageDialog(null, "No groups found", "Error", JOptionPane.ERROR_MESSAGE);
													}});
												}catch(Exception e){e.printStackTrace();}
											return;
											}
										else {
											session.getMainWindow().getFileMenuManager().readGroups(new File(fileName).getAbsolutePath(), new File(fileName), session);
											}
									} catch (Exception e) {
										e.printStackTrace();
									}
								}
							};
							wt.start();
							setVisible(false);
						}
						//Several EFVs selected, but not all
						else if(!ef1.equals("Sample names") && !ef2.equals("Sample names"))
							{
							System.out.println("---->Several EFVs selected, but not all");
							//TODO: create method in Analysis.java to call diffAnalysisEFsel

							setVisible(false);
							}
						//--------------------------------------------------
						//----------    4 Sample names as replicates -------
						//--------------------------------------------------
						else if(ef1.equals("Sample names") && ef2.equals("Sample names"))
							{
							// 3,4) ---------------- EFVs case
							System.out.println("Sample names case");
							if(group1.getSelectedIndices().length<2 || group2.getSelectedIndices().length<2)
								{
								try{
									SwingUtilities.invokeLater(new Runnable(){public void run(){
										JOptionPane.showMessageDialog(null, "Differential expression requires two or more replicates on each group.\n Please select several sample names for each group.", "Error", JOptionPane.ERROR_MESSAGE);
										}});
									}catch(Exception ex){ex.printStackTrace();}
								return;
								}
							ArrayList<Object> p = new ArrayList<Object>();
							ArrayList<String> sg1=new ArrayList<String>();
							for(int i=0; i<group1.getSelectedValues().length;i++)
								sg1.add(((String)group1.getSelectedValues()[i]).trim());
							ArrayList<String> sg2=new ArrayList<String>();
							for(int i=0; i<group2.getSelectedValues().length;i++)
								sg2.add(((String)group2.getSelectedValues()[i]).trim());
							
							p.add(sg1);
							p.add(sg2);
							p.add("Group 1");
							p.add("Group 2");
							p.add(true);
							p.add(new Double(pvalueValue.getText())
									.doubleValue());
							p.add(new Double(expressionValue.getText())
									.doubleValue());
							p.add(reg);
							p.add(fileName);
							p.add(description.getText());

							AnalysisProgressMonitor apm = new AnalysisProgressMonitor(
									b,
									AnalysisProgressMonitor.AnalysisTask.LIMMASAMPLES,
									p);
							apm.run();
							t = apm.getTask();
							Thread wt = new Thread() {
								public void run() {
									try {
										String fileName = t.get();
										if (fileName == null)
											{
											try{
												SwingUtilities.invokeLater(new Runnable(){public void run(){
													JOptionPane.showMessageDialog(null, "No groups found", "Error", JOptionPane.ERROR_MESSAGE);
													}});
												}catch(Exception e){e.printStackTrace();}
											return;
											}
										else {
											session.getMainWindow().getFileMenuManager().readGroups(new File(fileName).getAbsolutePath(), new File(fileName), session);
											}
									} catch (Exception e) {
										e.printStackTrace();
									}
								}
							};
							wt.start();
							setVisible(false);
							}
						//--------------------------------------------------
						//----------    5 Same as 3 but taking several EFVs on each side -------
						//--------------------------------------------------
						else if(ef1.equals(ef2))
							{
							System.out.println("EFV(s) vs EFV(s) case");
							
							ArrayList<Object> p = new ArrayList<Object>();
							ArrayList<String> sg1=new ArrayList<String>();
							String ng1="", ng2="";
							for(Object o:group1.getSelectedValues())
								{
								String s=((String)o).trim();
								sg1.add(s);
								ng1+=s+", ";
								}
							ng1=ng1.substring(0, ng1.length()-2);
							ArrayList<String> sg2=new ArrayList<String>();
							for(Object o:group2.getSelectedValues())
								{
								String s=((String)o).trim();
								sg2.add(s);
								ng2+=s+", ";
								}
							ng2=ng2.substring(0, ng2.length()-2);
							ArrayList<String> cn1=session.getMicroarrayData().getConditionNames(ef1, sg1);
							ArrayList<String> cn2=session.getMicroarrayData().getConditionNames(ef2, sg2);
							
							p.add(cn1);
							p.add(cn2);
							p.add(ng1);
							p.add(ng2);
							p.add(true);
							p.add(new Double(pvalueValue.getText())
									.doubleValue());
							p.add(new Double(expressionValue.getText())
									.doubleValue());
							p.add(reg);
							p.add(fileName);
							p.add(description.getText());
	
							AnalysisProgressMonitor apm = new AnalysisProgressMonitor(
									b,
									AnalysisProgressMonitor.AnalysisTask.LIMMASAMPLES,
									p);
							apm.run();
							t = apm.getTask();
							Thread wt = new Thread() {
								public void run() {
									try {
										String fileName = t.get();
										if (fileName == null)
											{
											try{
												SwingUtilities.invokeLater(new Runnable(){public void run(){
													JOptionPane.showMessageDialog(null, "No groups found", "Error", JOptionPane.ERROR_MESSAGE);
													}});
												}catch(Exception e){e.printStackTrace();}
											return;
											}
										else {
											session.getMainWindow().getFileMenuManager().readGroups(new File(fileName).getAbsolutePath(), new File(fileName), session);
											}
									} catch (Exception e) {
										e.printStackTrace();
									}
								}
							};
							wt.start();
							setVisible(false);
							}
						else
								{
								ArrayList<String> sg1=new ArrayList<String>();
								for(Object o:group1.getSelectedValues())
									sg1.add((String)o);
								ArrayList<String> sg2=new ArrayList<String>();
								for(Object o:group2.getSelectedValues())
									sg2.add((String)o);
								setVisible(false);
								System.err.println("Multiple EFVs selected");
								try{
									SwingUtilities.invokeLater(new Runnable(){public void run(){
										JOptionPane.showMessageDialog(null, "Only one experimental factor value (EFV) can be selected per group.\n If you want to select all EFVs, select the experimental factor itself", "Error", JOptionPane.ERROR_MESSAGE);
										}});
									}catch(Exception ex){ex.printStackTrace();}
								}
						}
					}
				});
			}
			{
				pvalue = new JLabel();
				getContentPane().add(pvalue);
				pvalue.setText("BH corrected p-value          <");
				pvalue.setBounds(13, 15, 207, 14);
				pvalue.setToolTipText("-log10 scale means that a p-value of 10e-6 must be specified as 6");
			}
			{
				pvalueValue = new JTextField();
				getContentPane().add(pvalueValue);
				pvalueValue.setText("0.01");
				pvalueValue.setBounds(205, 11, 43, 21);
			}
			{
				differentialExpression = new JLabel();
				getContentPane().add(differentialExpression);
				differentialExpression
						.setText("Differential expression       >");
				differentialExpression.setBounds(13, 58, 207, 14);
				differentialExpression
						.setToolTipText("Genes with differential expression lower than this threshold will be filtered out");
			}
			{
				expressionValue = new JTextField();
				getContentPane().add(expressionValue);
				expressionValue.setText(""+(double)Math.round(session.getMicroarrayData().sd * 20) / 10);
				expressionValue.setBounds(205, 54, 43, 21);
				expressionValue.setToolTipText("Default value is two std. deviations");
			}
			{
				ComboBoxModel regulationModel = new DefaultComboBoxModel(
						new String[] { "up regulated in group 1",
								"down regulated in group 1",
								"up or down regulated in group 1"});
				regulation = new JComboBox();
				getContentPane().add(regulation);
				regulation.setModel(regulationModel);
				regulation.setSelectedIndex(0);
				regulation.setBounds(48, 84, 230, 21);
			}

			ExpressionData md = session.getMicroarrayData();
			//Add experimental factors
			ArrayList<String> efs = new ArrayList<String>();
			for (String ef : md.experimentFactors) 
				{
				efs.add(ef);
				ArrayList<String> alreadyAdded = new ArrayList<String>();
				for (String efv : md.experimentFactorValues.get(ef)) 
					{
					if (!alreadyAdded.contains(efv)) 
						{
						alreadyAdded.add(efv);
						efs.add("   " + efv);
						}
					}
				}
			efs.add("Sample names");
			for(String c:md.conditionNames)	efs.add("   "+c);
				

			{
				jScrollPane1 = new JScrollPane();
				getContentPane().add(jScrollPane1);
				jScrollPane1.setBounds(13, 136, 241, 178);
				{
					group1Model = new DefaultComboBoxModel(
							efs.toArray(new String[0]));
					group1 = new JList();
					jScrollPane1.setViewportView(group1);

					group1.setModel(group1Model);
					group1.setSelectedIndex(0);
					group1.setBorder(new LineBorder(
							new java.awt.Color(0, 0, 0), 1, false));
					group1.setLayout(null);
					group1.setBounds(13, 136, 134, 89);
					group1.setAutoscrolls(true);

				}
			}

			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("Group 1");
				jLabel1.setBounds(15, 116, 79, 14);
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Group 2");
				jLabel2.setBounds(267, 116, 81, 14);
			}
			{
				writeToFile = new JCheckBox();
				getContentPane().add(writeToFile);
				writeToFile.setText("Write to file");
				writeToFile.setBounds(25, 336, 129, 18);
				writeToFile
						.addChangeListener(new javax.swing.event.ChangeListener() {
							public void stateChanged(
									javax.swing.event.ChangeEvent e) {
								if (writeToFile.isSelected()) {
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
									select.setEnabled(true);
									addDescription.setEnabled(true);
									description.setEnabled(true);
								} else {
									defaultPath = "";
									select.setEnabled(false);
									addDescription.setEnabled(false);
									description.setEnabled(false);
								}
							}
						});
			}
			{
				select = new JButton();
				getContentPane().add(select);
				select.setText("Select");
				select.setBounds(188, 331, 79, 21);
				select.setEnabled(false);
				select.addActionListener(new java.awt.event.ActionListener() {

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
			{
				addDescription = new JCheckBox();
				getContentPane().add(addDescription);
				addDescription.setText("Add description line");
				addDescription.setBounds(37, 355, 194, 18);
				addDescription.setEnabled(false);
			}
			{
				description = new JTextField();
				getContentPane().add(description);
				description.setBounds(37, 382, 422, 21);
				description.setEnabled(false);
			}
			{
				jScrollPane2 = new JScrollPane();
				getContentPane().add(jScrollPane2);
				jScrollPane2.setBounds(265, 137, 216, 177);
				{
					group2Model = new DefaultComboBoxModel(
							efs.toArray(new String[0]));
					group2 = new JList();
					jScrollPane2.setViewportView(group2);
					group2.setModel(group2Model);
					group2.setSelectedIndex(0);
					group2.setBorder(new LineBorder(
							new java.awt.Color(0, 0, 0), 1, false));
					group2.setLayout(null);
					group2.setBounds(265, 137, 216, 177);
					group2.setAutoscrolls(true);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
