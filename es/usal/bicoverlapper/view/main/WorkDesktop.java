package es.usal.bicoverlapper.view.main;

import javax.swing.JDesktopPane;

import es.usal.bicoverlapper.controller.kernel.Session;

/**
 * Class that encapsulates the different views applied to a working set.
 * All these data are managed by a Session layer that interconnects them and 
 * make the different views to be linked.
 * 
 * 
 * @author Javier Molpeceres and Rodrigo Santamaria
 */
public class WorkDesktop {
	
	private JDesktopPane panel;
	private Session sesion;
	
	/**
	 * Construct ad new <code>WorkingSet</code> with its own work <code>JDesktopPane</code> and 
	 * <code>Session</code> layer.
	 *  
	 * @param panel <code>JDesktopPane</code> where diagrams for this set of data are to be added
	 * @param s <code>Session</code> layer linked to the WorkDesktop, registering and linking diagrams
	 * 
	 */
	public WorkDesktop(JDesktopPane panel,Session s){
		this.panel = panel;
		this.sesion = s;
	}
	
	/**
	 * Gets the <code>JDesktopPane</code> of this WorkDesktop
	 * 
	 * @return <code>JDesktopPanel</code> of this WorkDesktop
	 */
	public JDesktopPane getPanel(){
		return this.panel;
	}
	
	/**
	 * Gets the <code>Session</code> layer of this WorkDesktop
	 * 
	 * @return <code>Session</code> layer of this WorkDesktop
	 */
	public Session getSession(){
		return this.sesion;
	}
}
