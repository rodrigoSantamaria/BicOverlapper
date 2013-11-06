package es.usal.bicoverlapper.controller.data.reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.pushingpixels.substance.api.skin.SubstanceNebulaLookAndFeel;

import prefuse.data.Node;

import es.usal.bicoverlapper.controller.kernel.Session;
import es.usal.bicoverlapper.model.bubble.GroupsData;
import es.usal.bicoverlapper.model.microarray.ExpressionData;
import es.usal.bicoverlapper.model.microarray.MicroarrayRequester;
import es.usal.bicoverlapper.model.network.NetworkData;
import es.usal.bicoverlapper.view.main.BicOverlapperWindow;
import es.usal.bicoverlapper.view.main.WorkDesktop;

/**
 * This class implements different methods to read data file formats required by
 * BicOverlapper
 * 
 * @author Rodrigo
 * 
 */
public class DataReader {
	private final int WINDOWS = 0;
	private final int LINUX = 1;
	private int OS;
	private String errorMessage;

	public DataReader() {
		if (System.getProperty("os.name").contains("indows"))
			OS = WINDOWS;
		else
			OS = LINUX;// it includes macOSX, now with Linux paths
	}

	// ----------------------------- FUNCIONES DE LECTURA MIAS
	// ------------------------
	/**
	 * Reads a microarray data file with the BicOverlapper format, that is:
	 * organism/chip col1 col2 ... colN row1 exp11 exp12 ... exp1N ... rowM
	 * expM1 expM2 ... expMN
	 */
	public void readMicroarray(File file, Session sesion,
			MicroarrayRequester mr) throws Exception {
		int skipColumns = 1;
		int skipRows = 1;
		double t1 = System.currentTimeMillis();
		double t2 = System.currentTimeMillis();
		ExpressionData md = new ExpressionData(file, false, skipRows,
				skipColumns, 1, mr, sesion.getAnalysis(), sesion);
		sesion.setMicroarrayData(md);
		t1 = System.currentTimeMillis();
		System.out.println("Time to load microarray data: " + (t1 - t2) / 1000
				+ " seconds");
		t2 = System.currentTimeMillis();
		System.out.println("Time to load fichero: " + (t2 - t1) / 1000
				+ " seconds");
	}

	/**
	 * Reads a Transcription Regulatory Network in GML or Syntren's XML format
	 */
	public void readTRN(String path, File fichero, Session sesion,
			String fileType) throws FileNotFoundException, IOException {
		
	
		
		BufferedReader in = new BufferedReader(new FileReader(fichero));
		String variable = null;
		BicOverlapperWindow window = sesion.getMainWindow();
		JDesktopPane desktop = sesion.getDesktop();

		variable = in.readLine();
		// En función de esto determinamos qué es:
		// 1) Un fichero de tabla xml como los que usa Javi (usamos su método de
		// lectura) a DatosFile
		// 2) Un grafo xml de los que usamos nosotros, usamos nuestro parser a
		// TRN Data
		// 3) Un fichero txt de los que usamos para los resultados de
		// biclustering, usamos
		// nuestro lector a BubbleData
		BufferedReader in2 = in; // Para no estropear lo que se lea de in
		NetworkData trnd = null;
		if (variable.contains("GeneNetwork")) {
			trnd = new NetworkData(getPath(path));// Syntren format
		} else if (variable.contains("?xml")) {
			String linea2 = in2.readLine();
			if (linea2.contains("graphml")) {
				trnd = new NetworkData(getPath(path));// GraphML
			}
		} else {
			trnd = new NetworkData(getPath(path));
		}

		in.close();
		in2.close();
		if (sesion.getMicroarrayData() != null) {// Set ids equivalent to the
													// session ids
			for (int i = 0; i < trnd.getGraph().getNodeCount(); i++) {
				Node n = trnd.getGraph().getNode(i);
				n.setInt(
						"id",
						sesion.getMicroarrayData().getGeneId(
								n.getString("name").trim()));
			}
		} else {
			for (int i = 0; i < trnd.getGraph().getNodeCount(); i++) {
				Node n = trnd.getGraph().getNode(i);
				n.setInt("id", i);
			}
		}

		boolean error = false;// TODO: check possible errors
		if (!error) {
			window.getViewMenu().setEnabled(true);
			window.getMenuViewTRN().setEnabled(true);
			if (path != null && path.length() > 0) {
				try {
					BufferedWriter pathWriter = new BufferedWriter(
							new FileWriter(
									sesion.getReader()
											.getPath("es/usal/bicoverlapper/data/networkPath.txt")));
					pathWriter.write(path);
					pathWriter.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}

			if (window.getActiveWorkDesktop() == null)
				window.addWorkDesktop(new WorkDesktop(desktop, sesion));
			else {
				JDesktopPane p = window.getActiveWorkDesktop().getPanel();

				// Carlos
				String title = window.getTitle();
				if (title.contains(".bic") || title.contains(".tmp")) {
					if (title.endsWith(".bic") || title.endsWith(".tmp")) {
						if (title.contains("|"))
							title = title.substring(0, title.lastIndexOf("|"))
									.trim();
						else
							title = "";
					}
				}
				title = title + " | " + fichero.getName();
				window.setTitle(title);
				p.setName(title);
			}
		}
		sesion.setTRNData(trnd);
	}

	// TODO: @deprecated
	public String getPath(String path) {
		String p = path;
		switch (OS) {
		case WINDOWS:
			p = p.replace("/", "\\");
			break;
		case LINUX:
			p = p.replace("\\", "/");
			break;
		}
		return p;
	}

	/**
	 * Reads Biclustering Results in a BiMax format
	 * 
	 * @param path
	 * @param fichero
	 * @param sesion
	 * @throws Exception
	 */
	public void readBiclusterResults(String path, String fichero, Session sesion) {
		readBiclusterResults(path, fichero, path, sesion);
	}

	public void readBiclusterResults(String path, String fileName, String file,	Session sesion) {
		BicOverlapperWindow window = sesion.getMainWindow();
		JDesktopPane desktop = sesion.getDesktop();
		boolean error = false;

		try {
			sesion.setGroupsData(null);
			sesion.setGroupsDataFile(null);
			sesion.setBiclusterDataStatus(false);
			
			GroupsData bd = new GroupsData(file, sesion.getMicroarrayData(), sesion);
			bd.getGraph().getNodes().getClientProperty("name");
			
			sesion.setGroupsData(bd);
			sesion.setGroupsDataFile(file);
			sesion.setBiclusterDataStatus(true);
		} catch (FileNotFoundException e1) {
			errorMessage=e1.getMessage();
			 java.awt.EventQueue.invokeLater(new Runnable(){
				   public void run(){
					   JOptionPane.showMessageDialog(null, "File not fund " + errorMessage,
								"Error", JOptionPane.ERROR_MESSAGE);   
				   }
			   });
			error = true;
		} catch (IOException e2) {
			 errorMessage=e2.getMessage();
			 java.awt.EventQueue.invokeLater(new Runnable(){
				   public void run(){
					   JOptionPane.showMessageDialog(null, "I/O Error " + errorMessage,
								"Error", JOptionPane.ERROR_MESSAGE);   
				   }
			   });
			error = true;
		} catch (Exception e3) {
			errorMessage=e3.getMessage();
			 java.awt.EventQueue.invokeLater(new Runnable(){
				   public void run(){
					   JOptionPane.showMessageDialog(null, "Format Error " + errorMessage,
								"Error", JOptionPane.ERROR_MESSAGE);   
				   }
			   });
			error = true;
		}
		if (!error) {
			window.getViewMenu().setEnabled(true);
			window.getMenuViewOverlapper().setEnabled(true);
			window.getMenuViewBubbles().setEnabled(true);
			if (path != null && path.length() > 0) {
				try {
					BufferedWriter pathWriter = new BufferedWriter(
							new FileWriter(
									sesion.getReader()
											.getPath("es/usal/bicoverlapper/data/groupsPath.txt")));
					pathWriter.write(path);
					pathWriter.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}

			if (window.getActiveWorkDesktop() == null)
				window.addWorkDesktop(new WorkDesktop(desktop, sesion));
			else {
				JDesktopPane p = window.getActiveWorkDesktop().getPanel();

				// Carlos
				String title = window.getTitle();
				if (title.contains(".bic") || title.contains(".tmp")) {
					if (title.endsWith(".bic") || title.endsWith(".tmp")) {
						if (title.contains("|"))
							title = title.substring(0, title.lastIndexOf("|"))
									.trim();
						else
							title = "";
					}
				}
				title = title + " | " + fileName;
				window.setTitle(title);
				p.setName(title);
			}
		}
	}
	/**
	 * Metodo que nos parsea el parametro <code>variable</code> para obtener los
	 * datos contenidos y devolverlos en el parametro <code>vect</code>. Ademas
	 * nos devuelve un boolean, cuando dicho boolean es <code>true</code> nos
	 * indica que <code>variable</code> contenia los datos de una variable, en
	 * caso de que nos devuelva <code>false</code> nos indica que
	 * <code>variable</code> contenia las etiquetas de las tuplas formadas por
	 * las variables.
	 * 
	 * @param variable
	 *            <code>String</code> que va a ser parseado.
	 * @param vect
	 *            Vector de <code>String</code> que contiene el parseo de
	 *            <code>variable</code>.
	 * @return Devuelve un <code>true</code> si el parseo produce una variable,
	 *         y devuelve <code>false</code> si el parseo produce las etiquetas
	 *         de las tuplas.
	 */
	/*
	 * private boolean isVar(String variable, Vector<String> vect) {
	 * StringTokenizer tokens = new StringTokenizer(variable,","); boolean isVar
	 * = true;
	 * 
	 * vect.addElement(tokens.nextToken());
	 * 
	 * while(tokens.hasMoreTokens()){
	 * 
	 * String valor = tokens.nextToken(); try{ Double.valueOf(valor); } catch
	 * (NumberFormatException e){ isVar = false; } vect.addElement(valor); }
	 * return isVar; }
	 */

}
