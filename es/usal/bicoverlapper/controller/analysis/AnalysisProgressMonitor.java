package es.usal.bicoverlapper.controller.analysis;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ProgressMonitor;
import javax.swing.SwingWorker;

import es.usal.bicoverlapper.model.annotations.GOTerm;


public class AnalysisProgressMonitor extends JPanel implements ActionListener,
		PropertyChangeListener, Runnable {
	private static final long serialVersionUID = 7679749397384459601L;
	private ProgressMonitor progressMonitor;
	private JProgressBar progressBar;
	private JTextArea taskOutput;
	private AnalysisTask task;
	private JFrame frame;
	private String title;

	public AnalysisTask getTask() {
		return task;
	}

	public void setTask(AnalysisTask task) {
		this.task = task;
	}

	public AnalysisProgressMonitor(Analysis b, int type,
			ArrayList<Object> params, String title) {
		super(new BorderLayout());
		this.setBounds(100, 100, 400, 500);
		taskOutput = new JTextArea(8, 40);
		taskOutput.setMargin(new Insets(5, 5, 5, 5));
		taskOutput.setEditable(false);
		this.title = title;
		task = new AnalysisTask(b, type, params);

		add(new JScrollPane(taskOutput), BorderLayout.CENTER);
		setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
	}

	public AnalysisProgressMonitor(Analysis b, int type,
			ArrayList<Object> params) {
		super(new BorderLayout());
		this.setBounds(100, 100, 400, 500);
		title = "Running analysis...";
		taskOutput = new JTextArea(8, 40);
		taskOutput.setMargin(new Insets(5, 5, 5, 5));
		taskOutput.setEditable(false);

		task = new AnalysisTask(b, type, params);

		add(new JScrollPane(taskOutput), BorderLayout.CENTER);
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

			if (progressMonitor.isCanceled() || task.isDone()) {
				if (progressMonitor.isCanceled()) {
					task.cancel(true);
					taskOutput.append("Task canceled.\n");
				} else {
					frame.dispose();
				}
			}
		} else if ("state" == evt.getPropertyName()) {
			if (evt.getNewValue() == SwingWorker.StateValue.DONE)
				frame.dispose();
		}
	}

	public void run() {
		if (task == null)
			return;

		progressMonitor = new ProgressMonitor(this, "Retrieving annotations",
				"Retrieving annotations...", 0, 100);
		progressMonitor.setMillisToDecideToPopup(1000);
		progressMonitor.setProgress(0);
		progressBar = new JProgressBar();
		progressBar.setIndeterminate(true);

		progressBar.setSize(500, 50);
		progressBar.setMinimumSize(new Dimension(150, 50));
		progressBar
				.setString("Computing analysis, this could take some time...");

		task.addPropertyChangeListener(this);

		frame = new JFrame(title);
		frame.setBounds(400, 200, 300, 50);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setMinimumSize(new Dimension(300, 50));
		JComponent newContentPane = progressBar;
		newContentPane.setOpaque(true); // content panes must be opaque
		frame.setContentPane(newContentPane);
		frame.setAlwaysOnTop(true);

		// Display the window.
		frame.pack();
		frame.setVisible(true);
		task.execute();
	}

	// @Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	public class AnalysisTask extends SwingWorker<String, Void>// implements
																// Runnable
	{
		public String message;
		private Analysis b;
		private ArrayList<Object> params;
		private int type = -1;
		public final static int BIMAX = 0;
		public final static int PLAID = 1;
		public final static int CHENG_CHURCH = 2;
		public final static int XMOTIFS = 3;
		public final static int SPECTRAL = 4;
		public final static int ISA = 5;
		public final static int LIMMA = 6; // diffexp between two efvs of a
											// given ef
		public final static int LIMMAEF = 7;// diffexp between an efv and every
											// other efv of a given ef
		public final static int LIMMAEFALL = 8; // diffexp between all the efvs
												// of a given ef
		public final static int LIMMAALL = 9;// diffexp between all the efvs for
												// each ef
		public final static int CORRELATION_NETWORK = 10;// diffexp between all
															// the efvs for each
															// ef
		public final static int GSEA = 11;// gsea between two efvs of a given ef
		public final static int GSEAEF = 12;// diffexp between an efv and every
											// other efv of a given ef
		public final static int GSEAPROG = 13;// diffexp between every pair of
												// consecutive efvs on a given
												// ef (for example, useful with
												// time)
		public final static int LOAD_MATRIX = 14;// load the matrix into R
													// console (usually done
													// inside other methods, but
													// sometimes alone)
		public final static int DOWNLOAD_MATRIX = 15;// download the matrix from
														// AE via ArrayExpress
														// BiocConductor package
		public final static int SEARCH_PATTERNS = 16;// search for similar
														// expression profiles
														// to the one selected
		public final static int DOWNLOAD_GEO_MATRIX = 17;// download the matrix from
							// GEO via GEOquery
							// BiocConductor package
		public final static int TOPGO_TEST = 18;// enrichment test
							public static final int LIMMASAMPLES = 19;

		public AnalysisTask(Analysis b, int type, ArrayList<Object> params) {
			this.b = b;
			this.type = type;
			this.params = params;
		}

		// @Override
		public String doInBackground() {
			String res = "";
			switch (type) {
			case DOWNLOAD_MATRIX:
				res = b.downloadArrayExpressExperiment((String) params.get(0),
						(String) params.get(1));
				break;
			case DOWNLOAD_GEO_MATRIX:
				res = b.downloadGEOExperiment((String) params.get(0),
						(String) params.get(1), ((Boolean) params.get(2)).booleanValue());
				break;
			case TOPGO_TEST:
				ArrayList<GOTerm> list=b.goEnrichment((Double) params.get(0), (String) params.get(1), (ArrayList<String>) (params.get(2)));
				//TODO: serialize and save on a res file: 'got.tmp'
				res="got.tmp";
				try{
					ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(res));
					oos.writeObject(list);
					oos.close();
				}catch(Exception e){e.printStackTrace();}
				
				break;
			case LOAD_MATRIX:
				b.loadMatrix((String) params.get(0));
				break;
			case SEARCH_PATTERNS:
				String[] profiles = b.getSimilarProfiles(
						(Integer) params.get(0), (String) params.get(1));
				for (String p : profiles)
					res += p + " ";
				break;
			case BIMAX:
				res = b.bimax(((Boolean) params.get(0)).booleanValue(),
						((Double) params.get(1)).doubleValue(),
						((Boolean) params.get(2)).booleanValue(),
						((Integer) params.get(3)).intValue(),
						((Integer) params.get(4)).intValue(),
						((Integer) params.get(5)).intValue(),
						((String) params.get(6)), ((String) params.get(7)));
				break;
			case PLAID:
				System.out.println(((String) params.get(0)));
				System.out.println(((Float) params.get(1)).floatValue());
				System.out.println(((Float) params.get(2)).floatValue());
				System.out.println(((String) params.get(3)));
				System.out.println(((String) params.get(4)));
				res = b.plaid(((String) params.get(0)),
						((Float) params.get(1)).floatValue(),
						((Float) params.get(2)).floatValue(),
						((String) params.get(3)), ((String) params.get(4)));
				break;
			case CHENG_CHURCH:
				res = b.chengChurch(((Float) params.get(0)).floatValue(),
						((Float) params.get(1)).floatValue(),
						((Integer) params.get(2)).intValue(),
						((String) params.get(3)), ((String) params.get(4)));
				break;
			case XMOTIFS:
				res = b.xmotifs(((Integer) params.get(0)).intValue(),
						((Boolean) params.get(1)).booleanValue(),
						((Integer) params.get(2)).intValue(),
						((Integer) params.get(3)).intValue(),
						((Integer) params.get(4)).intValue(),
						((Float) params.get(5)).floatValue(),
						((Integer) params.get(6)).intValue(),
						((String) params.get(7)), ((String) params.get(8)));
				break;
			case ISA:
				System.out.println(((Float) params.get(0)).floatValue());
				System.out.println(((Float) params.get(1)).floatValue());
				System.out.println(((Integer) params.get(2)).intValue());
				System.out.println(((String) params.get(3)));
				System.out.println(((String) params.get(4)));
				res = b.isa2(((Float) params.get(0)).floatValue(),
						((Float) params.get(1)).floatValue(),
						((Integer) params.get(2)).intValue(),
						((String) params.get(3)), ((String) params.get(4)));

				break;
			case LIMMA:
				System.out.println(((String) params.get(0)));
				System.out.println(((String) params.get(1)));
				System.out.println(((String) params.get(2)));
				System.out.println(((Boolean) params.get(3)).booleanValue());
				System.out.println(((Double) params.get(4)).doubleValue());
				System.out.println(((Double) params.get(5)).doubleValue());
				System.out.println(((String) params.get(6)));
				System.out.println(((String) params.get(7)));
				System.out.println(((String) params.get(8)));

				res = b.limma(
						((String) params.get(0)), ((String) params.get(1)),
						((String) params.get(2)),

						((Boolean) params.get(3)).booleanValue(),
						((Double) params.get(4)).doubleValue(),
						((Double) params.get(5)).doubleValue(),
						((String) params.get(6)), ((String) params.get(7)),
						((String) params.get(8)));

				break;
			case LIMMAEF:
				System.out.println(((String) params.get(0)));
				System.out.println(((String) params.get(1)));
				System.out.println(((Boolean) params.get(2)).booleanValue());
				System.out.println(((Double) params.get(3)).doubleValue());
				System.out.println(((Double) params.get(4)).doubleValue());
				System.out.println(((String) params.get(5)));
				System.out.println(((String) params.get(6)));
				System.out.println(((String) params.get(7)));

				res = b.limmaEF(((String) params.get(0)),
						((String) params.get(1)),
						((Boolean) params.get(2)).booleanValue(),
						((Double) params.get(3)).doubleValue(),
						((Double) params.get(4)).doubleValue(),
						((String) params.get(5)), ((String) params.get(6)),
						((String) params.get(7)));

				break;
			case LIMMASAMPLES:
				System.out.println((ArrayList<String>) params.get(0));
				System.out.println((ArrayList<String>) params.get(1));
				System.out.println(((String) params.get(2)));
				System.out.println(((String) params.get(3)));
				System.out.println(((Boolean) params.get(4)).booleanValue());
				System.out.println(((Double) params.get(5)).doubleValue());
				System.out.println(((Double) params.get(6)).doubleValue());
				System.out.println(((String) params.get(7)));
				System.out.println(((String) params.get(8)));
				System.out.println(((String) params.get(9)));

				res = b.limmaSampleNames(((ArrayList<String>) params.get(0)),
						((ArrayList<String>) params.get(1)),
						((String) params.get(2)), ((String) params.get(3)),
						((Boolean) params.get(4)).booleanValue(),
						((Double) params.get(5)).doubleValue(),
						((Double) params.get(6)).doubleValue(),
						((String) params.get(7)), ((String) params.get(8)),
						((String) params.get(9)));

				break;
			case LIMMAEFALL:
				System.out.println(((String) params.get(0)));
				System.out.println(((Boolean) params.get(1)).booleanValue());
				System.out.println(((Double) params.get(2)).doubleValue());
				System.out.println(((Double) params.get(3)).doubleValue());
				System.out.println(((String) params.get(4)));
				System.out.println(((String) params.get(5)));
				System.out.println(((String) params.get(6)));

				res = b.limmaEFall(((String) params.get(0)),
						((Boolean) params.get(1)).booleanValue(),
						((Double) params.get(2)).doubleValue(),
						((Double) params.get(3)).doubleValue(),
						((String) params.get(4)), ((String) params.get(5)),
						((String) params.get(6)));

				break;
			case LIMMAALL:
				System.out.println(((Boolean) params.get(0)).booleanValue());
				System.out.println(((Double) params.get(1)).doubleValue());
				System.out.println(((Double) params.get(2)).doubleValue());
				System.out.println(((String) params.get(3)));
				System.out.println(((String) params.get(4)));
				System.out.println(((String) params.get(5)));

				res = b.limmaAll(((Boolean) params.get(0)).booleanValue(),
						((Double) params.get(1)).doubleValue(),
						((Double) params.get(2)).doubleValue(),
						((String) params.get(3)), ((String) params.get(4)),
						((String) params.get(5)));

				break;
			case CORRELATION_NETWORK:
				System.out.println(((Double) params.get(0)).doubleValue());
				System.out.println(((String) params.get(1)));
				System.out.println(((Double) params.get(2)).doubleValue());
				System.out.println(((String) params.get(3)));

				res = b.buildCorrelationNetwork(
						((Double) params.get(0)).doubleValue(),
						((String) params.get(1)),
						((Double) params.get(2)).doubleValue(),
						((String) params.get(3)));

				break;
			case GSEA:
				System.out.println(((Double) params.get(0)).doubleValue());
				System.out.println(((Integer) params.get(1)).intValue());
				System.out.println(((String) params.get(2)));
				System.out.println(((Double) params.get(3)).doubleValue());
				System.out.println(((String) params.get(4)));
				System.out.println(((String) params.get(5)));
				System.out.println(((String) params.get(6)));
				System.out.println(((String) params.get(7)));
				System.out.println(((String) params.get(8)));

				res = b.gsea(((Double) params.get(0)).doubleValue(),
						((Integer) params.get(1)).intValue(),
						((String) params.get(2)),
						((Double) params.get(3)).doubleValue(),
						((String) params.get(4)), ((String) params.get(5)),
						((String) params.get(6)), ((String) params.get(7)),
						((String) params.get(8)));

				break;
			case GSEAEF:
				System.out.println(((Double) params.get(0)).doubleValue());
				System.out.println(((Integer) params.get(1)).intValue());
				System.out.println(((String) params.get(2)));
				System.out.println(((Double) params.get(3)).doubleValue());
				System.out.println(((String) params.get(4)));
				System.out.println(((String) params.get(5)));
				System.out.println(((String) params.get(6)));
				System.out.println(((String) params.get(7)));

				res = b.gseaEF(((Double) params.get(0)).doubleValue(),
						((Integer) params.get(1)).intValue(),
						((String) params.get(2)),
						((Double) params.get(3)).doubleValue(),
						((String) params.get(4)), ((String) params.get(5)),
						((String) params.get(6)), ((String) params.get(7)));

				break;
			case GSEAPROG:
				System.out.println(((Double) params.get(0)).doubleValue());
				System.out.println(((Integer) params.get(1)).intValue());
				System.out.println(((String) params.get(2)));
				System.out.println(((Double) params.get(3)).doubleValue());
				System.out.println(((String) params.get(4)));
				System.out.println(((String) params.get(5)));
				System.out.println(((String) params.get(6)));

				res = b.gseaProg(((Double) params.get(0)).doubleValue(),
						((Integer) params.get(1)).intValue(),
						((String) params.get(2)),
						((Double) params.get(3)).doubleValue(),
						((String) params.get(4)), ((String) params.get(5)),
						((String) params.get(6)));

				break;
			case SPECTRAL:
				break;
			}
			done();
			return res;
		}

		@Override
		public void done() {
			Toolkit.getDefaultToolkit().beep();
			message = "Biclustering finished";
			progressMonitor.setProgress(100);
		}
	}
}
