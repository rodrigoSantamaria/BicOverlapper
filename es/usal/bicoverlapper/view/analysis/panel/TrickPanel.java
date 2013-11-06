package es.usal.bicoverlapper.view.analysis.panel;

import java.awt.Component;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;

import javax.swing.JCheckBox;

import javax.swing.JFileChooser;
import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import es.usal.bicoverlapper.controller.data.filter.BiclusterResultsFilter;

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
public class TrickPanel extends javax.swing.JFrame {
	private JCheckBox jCheckBox1;
	private JButton jButton1;
	private JTextPane trick;
	private ArrayList<String> tricks=new ArrayList<String>();

	public TrickPanel() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			this.setPreferredSize(new java.awt.Dimension(480, 163));
			setTitle("Did you know that...?");
			//gene selection
			tricks.add("Alt+Click on a gene on Parallel Coordinates or Heatmap opens up its NCBI webpage (if found)");
			tricks.add("Right-click on Parallel Coordinates or Heatmap opens up a configuration panel for their visualizations");
			tricks.add("Shift+Click add up to current selection instead of setting a new selection");
			tricks.add("Ctrl+click on a gene on the Heatmap or Parallel Coordinates searches for and selects similar profiles");
			tricks.add("Ctrl-Z and Ctrl-Y can be used to go back and forth among selections");
			tricks.add("Ctrl-0 can be used to remove any selection done");
			//parallel coorinates
			tricks.add("On Parallel Coordinates, you can select profiles by threshold, \n" +
					"by dragging the tiny scrolls at the ends of each coordinate\n" +
					"(Ctrl+drag scrolling resets previous thresholds)");
			//heatmaps
			tricks.add("You can use the mouse wheel to zoom in/out on Heatmaps");
			tricks.add("You can use the mouse drag to displace Heatmaps");
			//shortcuts
			tricks.add("Ctrl-F opens up the search box");
			tricks.add("Ctrl-L opens up the label selection box");
			tricks.add("Ctrl-S opens up the column sort box");
			//Overlapper
			tricks.add("Pressing \"u\" on Overlapper shows/hides every gene on the groups");
			tricks.add("Pressing \"p\" on Overlapper pauses/resumes the animation");
			tricks.add("You can drag a line on Overlapper to select the genes inside it");
			tricks.add("You can use the mouse wheel to zoom in/out on Overlapper");
			//Annotations
			tricks.add("You can use biomaRt.id_type for chip info\n" +
					" (id_type can be, for example, \"external_gene_id\" or \"entrezgene\",\n " +
					"and be available as a filter for the species mart on biomaRt package)");
			tricks.add("You can use any Bioconductor annotation package names for chip info, \n" +
					"for example hgu95av2.db (row names should be valid ids for that platform)");
			//tricks.add("");
			//trick = new JTextArea(tricks.get((int)(Math.random()*tricks.size())));
			
			this.setLayout(null);
			{
				jCheckBox1 = new JCheckBox();
				this.add(jCheckBox1);
				jCheckBox1.setText("Do not show this message again");
				jCheckBox1.setBounds(12, 95, 365, 19);
				jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
					public void stateChanged(javax.swing.event.ChangeEvent e) {
						BufferedWriter pathWriter;
						if(jCheckBox1.isSelected())	
							{
							try{
								pathWriter=new BufferedWriter(new FileWriter("es/usal/bicoverlapper/data/config.txt", false));
								pathWriter.append("tricks\tfalse");
								pathWriter.close();
								}catch(IOException ex){System.err.println("config.txt has no information");}
							}
						else
							{
							try{
								pathWriter=new BufferedWriter(new FileWriter("es/usal/bicoverlapper/data/config.txt", false));
								pathWriter.append("tricks\ttrue");
								pathWriter.close();
								}catch(IOException ex){System.err.println("config.txt has no information");}
							}
					}
				});
				
			}
			{
				trick = new JTextPane();
				trick.setText(tricks.get((int)(Math.random()*tricks.size())));
				StyledDocument doc = trick.getStyledDocument();
				SimpleAttributeSet center = new SimpleAttributeSet();
				StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
				doc.setParagraphAttributes(0, doc.getLength(), center, false);
				getContentPane().add(trick);
				trick.setEditable(false);
				trick.setBounds(12, 12, 456, 79);
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("Next");
				jButton1.setBounds(402, 97, 61, 22);
				jButton1.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent e) {
						trick.setText(tricks.get((int)(Math.random()*tricks.size())));
					}
				});
			}

			this.setVisible(true);
			this.setSize(480, 163);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
