package es.usal.bicoverlapper.view.configuration.panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import es.usal.bicoverlapper.view.diagram.wordcloud.WordCloudDiagram;

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
public class WordCloudParameterConfigurationPanel extends javax.swing.JPanel
		implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5013773285290047138L;
	public JComboBox split;
	public JComboBox text;
	private JLabel labelText;
	private JLabel jLabel3;
	private JLabel jLabel2;
	private JLabel jLabel1;
	public JComboBox ontology;
	public JComboBox size;
	private String[] texts;
	private String[] splits;
	private String[] sizes;
	private String[] ontologies;
	private WordCloudDiagram parent;
	String antName = "";

	public static final String DESCRIPTION = "Description";
	public static final String GO_TERMS = "GO Terms";
	public static final String KEGG_PATHS = "KEGG paths";

	public static final int DEFINITION = 0;
	public static final int GO_TERM = 1;
	public static final int KEGG_PATH = 2;
	public static final int WORD1 = 0;
	public static final int WORD2 = 1;
	public static final int COMLETE = 2;
	public static final int GENES = 0;
	public static final int PVALUES = 1;
	public static final int OCCURRENCES = 2;// Deprecated
	public static final int ALL = 0;
	public static final int BP = 1;
	public static final int MF = 2;
	public static final int CC = 3;

	public WordCloudParameterConfigurationPanel(WordCloudDiagram wc) {
		super();
		parent = wc;
		initGUI();
	}

	private void initGUI() {
		try {
			this.setLayout(null);
			this.setPreferredSize(new java.awt.Dimension(405, 83));
			texts = new String[] { "definition", "go term", "kegg path" };
			splits = new String[] { "1 word", "2 words", "complete" };
			sizes = new String[] { "occurrence", "p-value" };
			ontologies = new String[] { "all", "bp", "mf", "cc" };

			{
				ComboBoxModel comboTextModel = new DefaultComboBoxModel(texts);
				text = new JComboBox();
				this.add(text);
				text.setModel(comboTextModel);
				text.setBounds(76, 10, 97, 22);
			}
			{
				ComboBoxModel jComboBox1Model = new DefaultComboBoxModel(splits);
				split = new JComboBox();
				this.add(split);
				split.setModel(jComboBox1Model);
				split.setBounds(75, 43, 99, 22);
			}
			{
				ComboBoxModel jComboBox1Model = new DefaultComboBoxModel(sizes);
				size = new JComboBox();
				this.add(size);
				size.setModel(jComboBox1Model);
				size.setBounds(282, 10, 101, 22);
			}
			{
				ComboBoxModel jComboBox1Model = new DefaultComboBoxModel(
						ontologies);
				ontology = new JComboBox();
				this.add(ontology);
				ontology.setModel(jComboBox1Model);
				ontology.setBounds(283, 43, 101, 22);
			}
			{
				labelText = new JLabel();
				this.add(labelText);
				labelText.setText("Text:");
				labelText.setBounds(12, 12, 64, 19);
				labelText
						.setToolTipText("Text to be considered for the words on the cloud");
			}
			{
				jLabel1 = new JLabel();
				this.add(jLabel1);
				jLabel1.setText("Split:");
				jLabel1.setBounds(12, 45, 64, 19);
				jLabel1.setToolTipText("Split text into single or double words, or do not split it");
			}
			{
				jLabel2 = new JLabel();
				this.add(jLabel2);
				jLabel2.setText("Size:");
				jLabel2.setBounds(200, 12, 64, 19);
				jLabel2.setToolTipText("Size of the words is determined by the number of elements sharing it or by its statistical significance");
			}
			{
				jLabel3 = new JLabel();
				this.add(jLabel3);
				jLabel3.setText("Ontology:");
				jLabel3.setBounds(201, 45, 82, 19);
				jLabel3.setToolTipText("In the case that GO terms are selected, which ontology to use");
			}

			text.setSelectedIndex(1);
			split.setSelectedIndex(2);
			size.setSelectedIndex(0);
			ontology.setSelectedIndex(1);
			text.addActionListener(this);
			split.addActionListener(this);
			size.addActionListener(this);
			ontology.addActionListener(this);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setIndices(int textIndex, int splitIndex, int sizeIndex,
			int ontologyIndex) {
		text.setSelectedIndex(textIndex);
		split.setSelectedIndex(splitIndex);
		size.setSelectedIndex(sizeIndex);
		ontology.setSelectedIndex(ontologyIndex);
		// parent.update();

	}

	public void actionPerformed(ActionEvent e) {

		if (parent.isDoNOTupdate()) {
			parent.setDoNOTupdate(false);
			return;
		}
		JComboBox cb = (JComboBox) e.getSource();
		if (cb == text) {
			if (!antName.equals((String) cb.getSelectedItem()))
				parent.setTextChanged(true);
			else
				parent.setTextChanged(false);
		} else
			parent.setTextChanged(false);

		if (cb == ontology && size.getSelectedIndex() == PVALUES)
			parent.setGot(null);
		parent.setInnerCall(true);
		if (cb == text && parent.isTextChanged()) {
			if (((String) cb.getSelectedItem()).equals("go term")) {
				split.addItem("complete");
				size.addItem("p-value");
				ontology.setEnabled(true);
			} else {
				split.removeItem("complete");
				size.removeItem("p-value");
				ontology.setEnabled(false);
			}
		}
		antName = (String) cb.getSelectedItem();
	}

}
