package es.usal.bicoverlapper.view.configuration.panel;

import java.awt.BorderLayout;
import java.awt.Component;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

import es.usal.bicoverlapper.controller.kernel.Session;

import java.awt.Color;
import java.awt.Font;
import java.io.File;

public class SaveFigurePanel extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private File imageFile;
	private JLabel lblSelectTheOutput;
	private JRadioButton rdbtneps;
	private JRadioButton rdbtnPng;
	private String defaultPath;
	private JComboBox comboBox;
	private Session session;

	
	/**
	 * Create the frame.
	 */
	public SaveFigurePanel(Session sesion) {
		defaultPath=sesion.getMicroarrayData().path;
		this.session=sesion;
		setTitle("Print Figure");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 474, 228);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.setBounds(132, 20, 259, 23);
		contentPane.add(comboBox);
		
		for(int i=0;i<sesion.getDiagramWindows().size();i++)
			comboBox.addItem(sesion.getDiagramWindows().get(i).getTitle());
		comboBox.setSelectedIndex(0);
		comboBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
			lblSelectTheOutput.setText(defaultPath+"/"+comboBox.getSelectedItem()+"."+(rdbtneps.isSelected()?"eps":"png"));
			}
		});
		
		JLabel lblVisualization = new JLabel("Visualization:");
		lblVisualization.setBounds(29, 25, 126, 16);
		contentPane.add(lblVisualization);
		
		JLabel lblFile = new JLabel("File:");
		lblFile.setBounds(29, 61, 126, 16);
		contentPane.add(lblFile);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.setBounds(132, 53, 117, 23);
		contentPane.add(btnSelect);
		btnSelect.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
			JFileChooser selecFile = new JFileChooser();
			selecFile.setCurrentDirectory(new File(defaultPath));
			int returnval = selecFile.showSaveDialog((Component)e.getSource());
			
			if(returnval == JFileChooser.APPROVE_OPTION) {
				imageFile = selecFile.getSelectedFile();
				defaultPath=imageFile.getParent();
				lblSelectTheOutput.setText(imageFile.getAbsolutePath()+"."+(rdbtneps.isSelected()?"eps":"png"));
				}
			}
		});
		
		JLabel lblFormat = new JLabel("Format:");
		lblFormat.setBounds(29, 117, 126, 16);
		contentPane.add(lblFormat);
		

		rdbtnPng = new JRadioButton("PNG");
		rdbtnPng.setSelected(true);
		buttonGroup.add(rdbtnPng);
		rdbtnPng.setBounds(142, 113, 100, 23);
		contentPane.add(rdbtnPng);
		
		rdbtneps = new JRadioButton("EPS");
		buttonGroup.add(rdbtneps);
		rdbtneps.setBounds(249, 113, 100, 23);
		contentPane.add(rdbtneps);
		rdbtneps.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
			lblSelectTheOutput.setText(defaultPath+"/"+comboBox.getSelectedItem()+"."+(rdbtneps.isSelected()?"eps":"png"));
			}
		});
		rdbtnPng.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
			lblSelectTheOutput.setText(defaultPath+"/"+comboBox.getSelectedItem()+"."+(rdbtneps.isSelected()?"eps":"png"));
			}
		});
		
		
		String label=sesion.getMicroarrayData().path+"/"+comboBox.getSelectedItem()+(rdbtneps.isSelected()?".eps":".png");
		lblSelectTheOutput = new JLabel(label);
		lblSelectTheOutput.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblSelectTheOutput.setForeground(Color.BLUE);
		lblSelectTheOutput.setBounds(29, 89, 455, 16);
		contentPane.add(lblSelectTheOutput);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setBounds(164, 160, 117, 23);
		contentPane.add(btnPrint);
		btnPrint.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
			session.getDiagramWindow(""+comboBox.getSelectedItem()).getDiagram().printFigure(new File(lblSelectTheOutput.getText()), rdbtneps.isSelected()?1:0);
			setVisible(false);
			}
		});
		
	}
}
