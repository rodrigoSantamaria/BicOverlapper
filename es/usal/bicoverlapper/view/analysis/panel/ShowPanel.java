package es.usal.bicoverlapper.view.analysis.panel;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.ListModel;

import es.usal.bicoverlapper.controller.kernel.Session;
import es.usal.bicoverlapper.model.gene.GeneAnnotation;
import es.usal.bicoverlapper.model.microarray.ExpressionData;

public class ShowPanel extends JFrame {

	private JPanel contentPane;
	private Session session;
	private JList list;
	private JList list_1;

		/**
	 * Create the frame.
	 */
	public ShowPanel(Session s) {
			this.setSize(223, 396);
			this.setMinimumSize(new Dimension(223,396));
			this.getContentPane().setSize(223,396);
			this.getContentPane().setPreferredSize(new Dimension(223,396));
			setResizable(false);
			
			setTitle("Show labels");
		session=s;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 223, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRowNames = new JLabel("Row names");
		lblRowNames.setBounds(6, 6, 159, 16);
		contentPane.add(lblRowNames);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 23, 187, 121);
		contentPane.add(scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
		
		JLabel lblColumnNames = new JLabel("Column names");
		lblColumnNames.setBounds(6, 156, 197, 16);
		contentPane.add(lblColumnNames);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(16, 178, 187, 133);
		contentPane.add(scrollPane_1);
		
		list_1 = new JList();
		scrollPane_1.setViewportView(list_1);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(16, 334, 75, 29);
		contentPane.add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(117, 334, 86, 29);
		contentPane.add(btnCancel);
		
		btnCancel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				setVisible(false);
				}
		});
		
		btnOk.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				if(session!=null)	
					{
					String del=" - ";
					ExpressionData md=session.getMicroarrayData();
					for(int i=0;i<md.getNumConditions();i++)
						{
						md.columnLabels[i]="";
						for(int j=0;j<list_1.getSelectedValues().length;j++)
							{
							String s=list_1.getSelectedValues()[j].toString();
							if(s!="Column ID")	md.columnLabels[i]+=md.experimentFactorValues.get(s)[i]+del;
							else				md.columnLabels[i]+=md.getConditionName(i)+del;
							}
						md.columnLabels[i]=md.columnLabels[i].substring(0, md.columnLabels[i].length()-3);
						}
					for(int i=0;i<md.getNumGenes();i++)
						{
						md.rowLabels[i]="";
						for(int j=0;j<list.getSelectedValues().length;j++)
							{
							String s=list.getSelectedValues()[j].toString();
							if(s!=md.chip)		
								{
								String ss=null;
								if(md.geneAnnotations.get(i)!=null)
									{
									if(s.equals(md.rname))			ss=md.geneAnnotations.get(i).getName();
									if(s.equals(md.rdescription))	ss=md.geneAnnotations.get(i).getDescription();	
									if(s.equals("entrez id"))		ss=md.geneAnnotations.get(i).getEntrezId();
									if(s.equals("ensembl id"))		ss=md.geneAnnotations.get(i).getEnsemblId();
									if(s.equals("symbol"))			ss=md.geneAnnotations.get(i).getSymbol();
									if(s.equals("name"))			ss=md.geneAnnotations.get(i).getSymbol();
									if(ss==null)		ss=md.getGeneNames()[i];
									}
								else
									{
									md.rowLabels[i]=md.geneNames[i];
									System.err.println("No gene annotations for gene "+md.rowLabels[i]);
									}
								if(ss!=null && ss.length()>0)
									md.rowLabels[i]+=ss+del;
								}
							else	md.rowLabels[i]+=md.getGeneNames()[i]+del;
							}
						if(md.rowLabels[i].length()>0 && !md.rowLabels[i].equals(del))			md.rowLabels[i]=md.rowLabels[i].substring(0, md.rowLabels[i].length()-3);
						else										md.rowLabels[i]+=md.getGeneNames()[i];
						continue;
						}
					session.changeLabels();
					setVisible(false);
					}
				}
			});
		
		updateLists();
	}
	
	public void updateLists()
	{
	Map<Integer, GeneAnnotation> ga=session.getMicroarrayData().getGeneAnnotations();
	ArrayList<String> rowNames=new ArrayList<String>();
	rowNames.add(session.getMicroarrayData().chip);
	if(ga!=null && ga.values()!=null && ga.values().size()>0)
		{
		rowNames.add(session.getMicroarrayData().rname);
		if(session.getMicroarrayData().getNumDescriptions()>100)	rowNames.add(session.getMicroarrayData().rdescription);
		if(session.getMicroarrayData().getNumEntrezIds()>100)		rowNames.add("entrez id");
		if(session.getMicroarrayData().getNumEnsemblIds()>100)		rowNames.add("ensembl id");
		if(session.getMicroarrayData().getNumSymbols()>100)			rowNames.add("symbol");
		}
	
	if(list.getModel().getSize()!=rowNames.size())
		{
		ListModel jList1Model = 
			new DefaultComboBoxModel(rowNames.toArray(new String[0]));
		list.setModel(jList1Model);
		list.setSelectedIndex(0);
		}
	
	
	
	ArrayList<String> efs=session.getMicroarrayData().experimentFactors;
	String[] colNames=efs.toArray(new String[efs.size()+1]);
	for(int i=colNames.length-2;i>=0;i--)
		colNames[i+1]=colNames[i];
	colNames[0]="Column ID";
	
	rowNames.add(session.getMicroarrayData().chip);
	if(list_1.getModel().getSize()!=colNames.length)
		{
		ListModel jList2Model = 
			new DefaultComboBoxModel(colNames);
		list_1.setModel(jList2Model);
		list_1.setSelectedIndex(0);
		}
	}

}
