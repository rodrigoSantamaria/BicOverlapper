package es.usal.bicoverlapper.view.analysis.monitor;

import java.awt.BorderLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ProgressMonitor;
import javax.swing.SwingUtilities;
//import javax.swing.SwingWorker;

import com.sun.media.sound.Toolkit;

import es.usal.bicoverlapper.model.microarray.ExpressionData;

public class AnnotationProgressMonitor2 extends JPanel implements ActionListener,
           PropertyChangeListener, Runnable {

private static final long serialVersionUID = 7679749397384459601L;
public ProgressMonitor progressMonitor;
public JTextArea taskOutput;
private ExpressionData.AnnotationTask task;
public JFrame frame;
private Point location=null;
private JLabel label;

public ExpressionData.AnnotationTask getTask() {
	return task;
}


public void setTask(ExpressionData.AnnotationTask task) {
	this.task = task;
	//task.apm=this;
}

public AnnotationProgressMonitor2() {
	super(new BorderLayout());
	this.setBounds(100, 100, 400, 500);
	taskOutput = new JTextArea(8, 40);
	taskOutput.setMargin(new Insets(5,5,5,5));
	taskOutput.setEditable(false);
	
	add(new JScrollPane(taskOutput), BorderLayout.CENTER);
	setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
	}

public AnnotationProgressMonitor2(JLabel l) {
	super(new BorderLayout());
	taskOutput = new JTextArea(8, 40);
	taskOutput.setMargin(new Insets(5,5,5,5));
	taskOutput.setEditable(false);
	label=l;
	
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
		
		//String message =String.format(task.getMessage()+"\n");
		if(label!=null)
			{
			label.setText(progress+"%");
			label.setToolTipText(task.getMessage());
			}
		}
	}


public void run()
	{
	if(task==null)	return;
	 
	/*progressMonitor = new ProgressMonitor(AnnotationProgressMonitor2.this,
			 "Retrieving annotations",
			 "Retrieving annotations...", 0, 100);
	progressMonitor.setMillisToDecideToPopup(1000);
	progressMonitor.setProgress(0);
	*/
	task.addPropertyChangeListener(AnnotationProgressMonitor2.this);
	this.hide();
	
	/*frame = new JFrame("Retrieving annotations ...");
	if(location==null)	frame.setBounds(400, 200, 300, 100);
	else				frame.setBounds(location.x+20,location.y+20, 300, 100);
	frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

	JComponent newContentPane = this;
	newContentPane.setOpaque(true); //content panes must be opaque
	frame.setContentPane(newContentPane);
	frame.setAlwaysOnTop(true);
	//Display the window.
	frame.pack();
	frame.setVisible(true);*/
	task.execute();
	//task.doInBackground();
	}


//@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
