package es.usal.bicoverlapper.view.configuration.panel;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import es.usal.bicoverlapper.controller.data.filter.TextFileFilter;
import es.usal.bicoverlapper.controller.manager.FileMenuManager;
import info.clearthought.layout.TableLayout;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
public class DownloadGEOPanel extends javax.swing.JFrame implements ActionListener, KeyListener{
	private JLabel name;
	private JTextField jTextField1;
	private JLabel jLabel2;
	private JCheckBox logScale;
	private JButton selectFile;
	private JButton DownloadButton;
	private JLabel filePath;
	private String path;
	private FileMenuManager fmm;
	private JLabel jLabel1;

	
	public DownloadGEOPanel() {
		super();
		initGUI();
	}
	
	public DownloadGEOPanel(FileMenuManager fmm1) {
		super();
		fmm=fmm1;
		initGUI();
	}
	
	private void initGUI() {
		try {
			getContentPane().setLayout(null);
			this.setPreferredSize(new java.awt.Dimension(484, 164));
			this.setSize(484, 164);
			{
				name = new JLabel();
				getContentPane().add(name, new CellConstraints("1, 1, 1, 1, default, default"));
				name.setText("Accession name of the experiment (e.g. GSE7561)   ");
				name.setToolTipText("Only experiments with raw data from main platforms are supported in the current version");
				name.setBounds(6, 10, 368, 14);
			}
			{
				jTextField1 = new JTextField();
				getContentPane().add(jTextField1, new CellConstraints("2, 1, 1, 1, default, default"));
				jTextField1.setActionCommand("accessionName");
				jTextField1.setBounds(381, 2, 91, 22);
				jTextField1.addKeyListener(this);
			}
			{
				filePath = new JLabel();
				getContentPane().add(filePath, new CellConstraints("1, 2, 1, 1, default, default"));
				filePath.setText("Select a path to store the processed experiment");
				filePath.setBounds(6, 32, 339, 14);
			}
			{
				selectFile = new JButton();
				getContentPane().add(selectFile, new CellConstraints("2, 2, 1, 1, default, default"));
				selectFile.setActionCommand("select");
				selectFile.addActionListener(this);
				selectFile.setText("select");
				selectFile.setBounds(381, 25, 91, 21);
			}
			{
				DownloadButton = new JButton();
				getContentPane().add(DownloadButton, new CellConstraints("2, 4, 1, 1, default, default"));
				DownloadButton.setText("download");
				DownloadButton.setBounds(362, 108, 116, 23);
				DownloadButton.addActionListener(this);
				
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1, new CellConstraints("1, 3, 1, 1, default, default"));
				jLabel1.setBounds(12, 55, 416, 14);
				jLabel1.setFont(new java.awt.Font("Tahoma",0,11));
				jLabel1.setForeground(new java.awt.Color(128,128,255));
			}
			{
				logScale = new JCheckBox();
				getContentPane().add(logScale);
				logScale.setText("Perform log scale transform");
				logScale.setBounds(6, 75, 307, 19);
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Download processed experiment");
				jLabel2.setBounds(6, 116, 348, 15);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void actionPerformed(ActionEvent e) {
	    if("select".equals(e.getActionCommand())) 
	    	{
			JFileChooser selecFile = new JFileChooser();
			selecFile.addChoosableFileFilter(new TextFileFilter());
			try{
				BufferedReader pathReader=new BufferedReader(new FileReader("es/usal/bicoverlapper/data/matrixPath.txt"));
				selecFile.setCurrentDirectory(new File(pathReader.readLine()));
				}catch(Exception ex){ex.printStackTrace();}
			
			
			int returnval = selecFile.showSaveDialog((Component)e.getSource());
			 
			if(returnval == JFileChooser.APPROVE_OPTION) 
				{
				File fichero = selecFile.getSelectedFile();
				path=selecFile.getSelectedFile().getAbsolutePath();
				if(!path.endsWith(".txt"))	path=path+".txt";
				jLabel1.setText(path);
				}
	    	}
	    else if("download".equals(e.getActionCommand()))
			{
	    	this.setVisible(false);
			fmm.downloadExperiment(jTextField1.getText(), path, true, logScale.isSelected());	
			}
	  		}

	@Override
	public void keyPressed(KeyEvent arg0) {
		  
			   
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if(jTextField1.equals(arg0.getSource()))
	    	{
	    	try{
	    	BufferedReader pathReader=new BufferedReader(new FileReader("es/usal/bicoverlapper/data/matrixPath.txt"));
			String defaultPath=pathReader.readLine();
			defaultPath=defaultPath.replace("\\", "/");
			defaultPath=defaultPath.substring(0, defaultPath.lastIndexOf("/"))+"/";
			
			path=defaultPath+jTextField1.getText()+".txt";
			int maxLength=75;
			String labelPath=path;
			if(labelPath.length()>maxLength)	labelPath=path.substring(0,10)+"..."+path.substring(path.length()-(maxLength-13), path.length());
	    	jLabel1.setText(labelPath);
	    	}catch(Exception ex){ex.printStackTrace();}
	    	}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	} 
	}
