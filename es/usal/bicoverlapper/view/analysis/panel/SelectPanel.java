package es.usal.bicoverlapper.view.analysis.panel;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

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
public class SelectPanel extends javax.swing.JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8109152779477046952L;
	private JButton jButton2;
	private JScrollPane jScrollPane2;
	private JScrollPane jScrollPane1;
	private JCheckBox jCheckBox2;
	private JCheckBox jCheckBox1;
	private JComboBox jComboBox2;
	private JComboBox jComboBox1;
	private JButton jButton1;
	private JList jList2;
	private JList jList1;
	private Session session;
	private DefaultComboBoxModel jList1Model;
	private DefaultComboBoxModel jList2Model;

	public SelectPanel() {
		super();
		initGUI();
	}

	public SelectPanel(Session s) {
		super();
		session = s;
		initGUI();
	}

	private void initGUI() {
		try {
			this.setSize(355, 484);
			this.setPreferredSize(new Dimension(355, 484));
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);

			ExpressionData md = session.getMicroarrayData();
			ArrayList<String> efs = new ArrayList<String>();
			efs.add("rest");
			for (String ef : md.experimentFactors) {
				efs.add(ef);
				ArrayList<String> alreadyAdded = new ArrayList<String>();
				for (String efv : md.experimentFactorValues.get(ef)) {
					if (!alreadyAdded.contains(efv)) {
						alreadyAdded.add(efv);
						efs.add("   " + efv);
					}
				}
			}
			{
				jScrollPane1 = new JScrollPane();
				getContentPane().add(jScrollPane1);
				jScrollPane1.setBounds(32, 42, 294, 158);
				{
					jList1Model = new DefaultComboBoxModel(
							efs.toArray(new String[0]));
					jList1 = new JList();
					jScrollPane1.setViewportView(jList1);
					jList1.setModel(jList1Model);
					jList1.setSelectedIndex(0);
					jList1.setBorder(new LineBorder(
							new java.awt.Color(0, 0, 0), 1, false));
					jList1.setLayout(null);
					jList1.setBounds(32, 42, 294, 158);
					jList1.setAutoscrolls(true);
				}
			}
			{
				jScrollPane2 = new JScrollPane();
				getContentPane().add(jScrollPane2);
				jScrollPane2.setBounds(32, 239, 294, 158);
				{
					jList2Model = new DefaultComboBoxModel(
							efs.toArray(new String[0]));
					jList2 = new JList();
					jScrollPane2.setViewportView(jList2);
					jList2.setModel(jList2Model);
					jList2.setSelectedIndex(0);
					jList2.setBorder(new LineBorder(
							new java.awt.Color(0, 0, 0), 1, false));
					jList2.setLayout(null);
					jList2.setBounds(32, 239, 294, 158);
					jList2.setAutoscrolls(true);

				}
			}

			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("Select");
				jButton1.setBounds(81, 414, 75, 22);
				jButton1.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent e) {
						String highEF = null;
						if (jList1.getSelectedIndex() == 0)
							highEF = "rest";
						else {
							for (int i = jList1.getSelectedIndex() - 1; i >= 0; i--) {
								if (!jList1Model.getElementAt(i).toString()
										.startsWith(" ")) {
									highEF = jList1Model.getElementAt(i)
											.toString();
									break;
								}
							}
						}
						String lowEF = null;
						if (jList2.getSelectedIndex() == 0)
							lowEF = "rest";
						else {
							for (int i = jList2.getSelectedIndex() - 1; i >= 0; i--) {
								if (!jList2Model.getElementAt(i).toString()
										.startsWith(" ")) {
									lowEF = jList2Model.getElementAt(i)
											.toString();
									break;
								}
							}
						}
						int sdh = 3 - jComboBox1.getSelectedIndex();
						int sdl = 3 - jComboBox2.getSelectedIndex();
						if (jCheckBox2.isSelected() && jCheckBox1.isSelected())
							session.setSelection(jList1.getSelectedValue()
									.toString().trim(), highEF, sdh, jList2
									.getSelectedValue().toString().trim(),
									lowEF, sdl);
						else {
							if (jCheckBox1.isSelected())
								session.setSelection(jList1.getSelectedValue()
										.toString().trim(), highEF, sdh,
										"none333", "none333", sdl);
							if (jCheckBox2.isSelected())
								session.setSelection("none333", "none333", sdh,
										jList2.getSelectedValue().toString()
												.trim(), lowEF, sdl);
						}
						setVisible(false);
					}
				});

			}
			{
				jButton2 = new JButton();
				getContentPane().add(jButton2);
				jButton2.setText("Cancel");
				jButton2.setBounds(206, 414, 83, 22);
				jButton2.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent e) {
						setVisible(false);
					}
				});
			}
			{
				ComboBoxModel jComboBox1Model = new DefaultComboBoxModel(
						new String[] { "+3 sdev", "+2 sdev", "+1 sdev", "mean",
								"-1 sdev", "-2 sdev", "-3 sdev" });
				jComboBox1 = new JComboBox();
				getContentPane().add(jComboBox1);
				jComboBox1.setModel(jComboBox1Model);
				jComboBox1.setSelectedIndex(3);
				jComboBox1.setBounds(242, 17, 85, 22);
			}
			{
				ComboBoxModel jComboBox2Model = new DefaultComboBoxModel(
						new String[] { "+3 sdev", "+2 sdev", "+1 sdev", "mean",
								"-1 sdev", "-2 sdev", "-3 sdev" });
				jComboBox2 = new JComboBox();
				getContentPane().add(jComboBox2);
				jComboBox2.setModel(jComboBox2Model);
				jComboBox2.setSelectedIndex(3);
				jComboBox2.setBounds(255, 208, 71, 22);
			}
			{
				jCheckBox1 = new JCheckBox();
				getContentPane().add(jCheckBox1);
				jCheckBox1.setText("EFV(s) regulated above");
				jCheckBox1.setBounds(12, 19, 230, 19);
				jCheckBox1.setSelected(true);
			}
			{
				jCheckBox2 = new JCheckBox();
				getContentPane().add(jCheckBox2);
				jCheckBox2.setText("EFV(s) regulated below");
				jCheckBox2.setBounds(12, 210, 243, 19);
			}
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
