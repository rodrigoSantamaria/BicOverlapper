package es.usal.bicoverlapper.view.analysis.monitor;

	import java.awt.BorderLayout;
import java.awt.Dimension;
	import java.awt.Insets;
	import java.awt.Point;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.beans.PropertyChangeEvent;
	import java.beans.PropertyChangeListener;
	
	import javax.swing.BorderFactory;
	import javax.swing.JComponent;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.JProgressBar;
	import javax.swing.JScrollPane;
	import javax.swing.JTextArea;
	import javax.swing.ProgressMonitor;

import es.usal.bicoverlapper.model.microarray.ExpressionData;

	public class EnrichmentTestProgressMonitor extends JPanel implements ActionListener,
	           PropertyChangeListener, Runnable {

	private static final long serialVersionUID = 7679749397384459601L;
	public ProgressMonitor progressMonitor;
	public JTextArea taskOutput;
	private ExpressionData.EnrichmentTestTask task;
	public JFrame frame;
	private Point location=null;
	private JProgressBar progressBar;

	public ExpressionData.EnrichmentTestTask getTask() {
		return task;
	}


	public void setTask(ExpressionData.EnrichmentTestTask task) {
		this.task = task;
		}

	public EnrichmentTestProgressMonitor() {
		super(new BorderLayout());
		this.setBounds(100, 100, 400, 500);
		taskOutput = new JTextArea(8, 40);
		taskOutput.setMargin(new Insets(5,5,5,5));
		taskOutput.setEditable(false);
		
		add(new JScrollPane(taskOutput), BorderLayout.CENTER);
		setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		}

	public EnrichmentTestProgressMonitor(Point p) {
		super(new BorderLayout());
		this.setBounds((int)p.getX(), (int)p.getY(), 400, 500);
		this.setLocation(p);
		taskOutput = new JTextArea(8, 40);
		taskOutput.setMargin(new Insets(5,5,5,5));
		taskOutput.setEditable(false);
		
		location=p;
		
		add(new JScrollPane(taskOutput), BorderLayout.CENTER);
		setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		}


	/**
	* Invoked when task's progress property changes.
	*/

	public void propertyChange(PropertyChangeEvent evt) 
		{
		if ("progress" == evt.getPropertyName() ) 
			{
			int progress = (Integer) evt.getNewValue();
			progressMonitor.setProgress(progress);
			
			String message =String.format(task.message+"\n");
			progressMonitor.setNote(message);
			taskOutput.append(message);
			
			if (progressMonitor.isCanceled() || task.isDone()) 
				{
				if (progressMonitor.isCanceled()) 
					{
					task.cancel(true);
					taskOutput.append("Task canceled.\n");
					} 
				else
					{
					frame.dispose();
					}
				}
			}
		}


	public void run()
		{
		if(task==null)	return;
		 
		progressMonitor = new ProgressMonitor(EnrichmentTestProgressMonitor.this,
				 "Enrichment analysis",
				 "Enrichemnt analysis...", 0, 100);
		//progressMonitor.setMillisToDecideToPopup(1000);
		progressMonitor.setProgress(0);
		progressMonitor.setProgress(1);
		progressBar = new JProgressBar();
		progressBar.setIndeterminate(true);
		
		progressBar.setString("Computing enrichment analysis, this could take some time...");
		
		task.addPropertyChangeListener(EnrichmentTestProgressMonitor.this);
		
		frame = new JFrame("Enrichment analysis...");
		if(location==null)	frame.setBounds(500, 300, 300, 50);
		else				frame.setBounds(location.x+100,location.y+100, 300, 50);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setMinimumSize(new Dimension(300,50));
		//JComponent newContentPane = this;
		JComponent newContentPane = progressBar;
		newContentPane.setOpaque(true); //content panes must be opaque
		frame.setContentPane(newContentPane);
		frame.setAlwaysOnTop(true);
		//Display the window.
		frame.pack();
		frame.setVisible(true);
		task.execute();
		}


//	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	}

