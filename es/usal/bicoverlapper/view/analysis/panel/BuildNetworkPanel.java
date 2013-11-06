package es.usal.bicoverlapper.view.analysis.panel;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import es.usal.bicoverlapper.controller.analysis.Analysis;
import es.usal.bicoverlapper.controller.analysis.AnalysisProgressMonitor;
import es.usal.bicoverlapper.controller.analysis.AnalysisProgressMonitor.AnalysisTask;
import es.usal.bicoverlapper.controller.data.filter.GMLFilter;
import es.usal.bicoverlapper.controller.kernel.Session;
import java.awt.Dimension;


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
public class BuildNetworkPanel extends javax.swing.JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1359500023070611175L;
	private JLabel JLabel1;
	private JTextField sdThreshold;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel1;
	private JButton selecFile;
	private JCheckBox write;
	private JButton build;
	private JTextField distanceThreshold;
	private JComboBox distanceMethod;
	private JLabel jLabel2;

	private Session session;
	private String defaultPath;
	private File resultsFile;


	/**
	* Auto-generated main method to display this JFrame
	*/
	
	public BuildNetworkPanel() {
		super();
		initGUI();
	}

	public BuildNetworkPanel(Session s) {
		super();
		initGUI();
		session=s;
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setPreferredSize(new Dimension(450, 222));
			this.setSize(470, 222);
			
			{
				JLabel1 = new JLabel();
				getContentPane().add(JLabel1);
				JLabel1.setText("Include genes with expression variation above");
				JLabel1.setToolTipText("Keep only genes with an expression variation across conditions<br> above N standard deviations of average variation");
				JLabel1.setBounds(14, 42, 321, 14);
			}
			{
				sdThreshold = new JTextField();
				getContentPane().add(sdThreshold);
				sdThreshold.setText("0.5");
				sdThreshold.setBounds(347, 38, 40, 21);
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Link genes with ");
				jLabel2.setToolTipText("Of the selected genes, link only genes with a distance below N standard deviations of average distance among selected genes");
				jLabel2.setBounds(14, 68, 126, 21);
			}
			{
				ComboBoxModel distanceMethodModel = 
					new DefaultComboBoxModel(
							new String[] { "euclidean", "maximum", "manhattan", "canberra", "binary", "minkowsky", "mutualinfo"
									 });
				distanceMethod = new JComboBox();
				getContentPane().add(distanceMethod);
				distanceMethod.setModel(distanceMethodModel);
				distanceMethod.setBounds(126, 68, 112, 23);
				distanceMethod.setSelectedIndex(0);
			}
			{
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("distance below");
				jLabel3.setBounds(241, 71, 105, 14);
			}
			{
				distanceThreshold = new JTextField();
				getContentPane().add(distanceThreshold);
				distanceThreshold.setText("1.0");
				distanceThreshold.setBounds(347, 67, 40, 21);
			}
			{
				build = new JButton();
				getContentPane().add(build);
				build.setText("Build Correlation Network");
				build.setBounds(126, 149, 189, 21);
				build.addActionListener(new java.awt.event.ActionListener() {
					private AnalysisTask t;
					
					public void actionPerformed(java.awt.event.ActionEvent e) {
						
						String fileName="";
						if(resultsFile!=null)			
							{
							fileName=resultsFile.getPath().replace("\\", "/");
							if(!fileName.contains(".")) 	fileName=fileName.concat(".gml");
							}
						else 
							{
							if(write.isSelected())	fileName=defaultPath;
							}
						session=session.getMainWindow().getActiveWorkDesktop().getSession();
						
						 Analysis b=session.getAnalysis();
						 b.setFilterOptions(null);
						
						 System.out.println("Build network");
						 ArrayList<Object> p=new ArrayList<Object>();
						   p.add(new Double(sdThreshold.getText()).doubleValue());
						   p.add(distanceMethod.getSelectedItem());
						   p.add(new Double(distanceThreshold.getText()).doubleValue());
						   p.add(fileName);
						   
						AnalysisProgressMonitor apm=new AnalysisProgressMonitor(b, AnalysisProgressMonitor.AnalysisTask.CORRELATION_NETWORK, p);
						   apm.run();
						   t=apm.getTask();
						   Thread wt=new Thread() {
								public void run() {
									try{
										String fileName=t.get();
										if(fileName==null)	
											SwingUtilities.invokeLater(new Runnable(){
												public void run(){
													JOptionPane.showMessageDialog(null,
								                    "Network not generated",
								                    "Error",JOptionPane.ERROR_MESSAGE);
												}});
										
										else
											{
											File file=new File(fileName);
											boolean update=false;
											if(write.isSelected())	update=true;
											session.getMainWindow().getFileMenuManager().readNetwork(file.getAbsolutePath(), file, session, "gml", update);
											}
										}catch(Exception e){e.printStackTrace();}
								}
							};
						wt.start();
						setVisible(false);
						}
				});
			}
			{
				write = new JCheckBox();
				getContentPane().add(write);
				write.setText("Write to File ...");
				write.setBounds(26, 116, 126, 21);
				write.setEnabled(true);
				write.addChangeListener(new javax.swing.event.ChangeListener() {
					public void stateChanged(javax.swing.event.ChangeEvent e) {
						if(write.isSelected())	
							{
							try{
								BufferedReader pathReader=new BufferedReader(new FileReader("es/usal/bicoverlapper/data/networkPath.txt"));
								defaultPath=pathReader.readLine();
								}catch(IOException ex){System.err.println("pathReader has no information"); defaultPath="";}
							write.setEnabled(true);
							selecFile.setEnabled(true);
							}
						else
							{
							defaultPath="";
							selecFile.setEnabled(false);
							}
					}
				});
			}
			{
				selecFile = new JButton();
				getContentPane().add(selecFile);
				selecFile.setText("Select");
				selecFile.setBounds(152, 116, 70, 21);
				selecFile.setEnabled(false);
				selecFile.addActionListener(new java.awt.event.ActionListener() {

					public void actionPerformed(java.awt.event.ActionEvent e) {
					JFileChooser selecFile = new JFileChooser();
					selecFile.addChoosableFileFilter(new GMLFilter());
					selecFile.setCurrentDirectory(new File(defaultPath));
					int returnval = selecFile.showSaveDialog((Component)e.getSource());
					
					if(returnval == JFileChooser.APPROVE_OPTION) {
						resultsFile = selecFile.getSelectedFile();
						}
					}
				});
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("s dev");
				jLabel1.setBounds(397, 41, 57, 17);
			}
			{
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("s dev");
				jLabel4.setBounds(399, 71, 50, 15);
			}
			pack();
			this.setSize(417, 222);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
