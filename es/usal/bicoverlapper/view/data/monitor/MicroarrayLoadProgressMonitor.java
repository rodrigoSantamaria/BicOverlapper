package es.usal.bicoverlapper.view.data.monitor;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ProgressMonitor;
//import javax.swing.SwingWorker;

import com.sun.media.sound.Toolkit;

import es.usal.bicoverlapper.model.microarray.ExpressionData;

public class MicroarrayLoadProgressMonitor extends JPanel implements
		ActionListener, PropertyChangeListener, Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7679749397384459601L;
	public ProgressMonitor progressMonitor; // @jve:decl-index=0:
	private JTextArea taskOutput;
	private ExpressionData.LoadTask task; // @jve:decl-index=0:
	private JFrame frame;
	private JButton closeButton;

	public ExpressionData.LoadTask getTask() {
		return task;
	}

	public void setTask(ExpressionData.LoadTask task) {
		this.task = task;
	}

	public MicroarrayLoadProgressMonitor() {
		super(new BorderLayout());
		this.setBounds(100, 100, 400, 550);
		taskOutput = new JTextArea(8, 40);
		taskOutput.setMargin(new Insets(5, 5, 5, 5));
		taskOutput.setEditable(false);
		add(new JScrollPane(taskOutput), BorderLayout.CENTER);
		closeButton = new JButton("Ok");
		closeButton.setEnabled(false);
		closeButton.setMaximumSize(new Dimension(20, 100));
		closeButton.setSize(20, 100);

		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.hide();
			}
		});
		add(closeButton, BorderLayout.SOUTH);

		setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
	}

	/**
	 * Invoked when task's progress property changes.
	 */
	public void propertyChange(PropertyChangeEvent evt) {
		if ("progress" == evt.getPropertyName()) {
			int progress = (Integer) evt.getNewValue();
			progressMonitor.setProgress(progress);

			String message = String.format(task.message + "\n");
			progressMonitor.setNote(message);
			taskOutput.append(message);
			
			if (progressMonitor.isCanceled() || task.isDone()
					|| progress >= 100) {
				if (progressMonitor.isCanceled()) {
					task.cancel(true);
					taskOutput.append("Task canceled.\n");
					this.setVisible(false);
				} else {
					frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					closeButton.setEnabled(true);
				}
			}
		}
	}

	public void run() {
		if (task == null)
			return;

		progressMonitor = new ProgressMonitor(
				MicroarrayLoadProgressMonitor.this, "Reading metadata",
				"Loading Microarray...", 0, 100);
		progressMonitor.setProgress(0);
		task.addPropertyChangeListener(MicroarrayLoadProgressMonitor.this);

		// JInternalFrame frame = new
		// JInternalFrame("Loading Microarray data matrix");
		frame = new JFrame("Loading Microarray data matrix");
		frame.setBounds(400, 200, 300, 100);
		// frame.setAlwaysOnTop(true);

		// frame.setClosable(false);
		// frame.validate();

		// frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		// Create and set up the content pane.
		JComponent newContentPane = this;
		newContentPane.setOpaque(true); // content panes must be opaque
		frame.setContentPane(newContentPane);

		// Display the window.
		frame.pack();
		frame.setVisible(true);

		task.execute();
	}

	// @Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
}
