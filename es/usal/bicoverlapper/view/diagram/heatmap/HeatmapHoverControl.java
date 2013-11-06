package es.usal.bicoverlapper.view.diagram.heatmap;

import java.awt.event.MouseEvent;
import java.util.LinkedList;

import es.usal.bicoverlapper.controller.kernel.Selection;
import es.usal.bicoverlapper.controller.kernel.Session;

import prefuse.Visualization;
import prefuse.controls.FocusControl;
import prefuse.visual.VisualItem;

/**
 * Extension of prefuse FocusControl for mouse interaction management in
 * HeatmapDiagram
 * 
 * @author Rodrigo Santamaria
 * 
 */
class HeatmapHoverControl extends FocusControl {
	private boolean enabled;
	private Session sesion;
	String group;// Visualization.FOCUS
	private String activity;
	private LinkedList<Integer> genesSeleccionados;
	private LinkedList<Integer> genesSparseSeleccionados;
	private LinkedList<Integer> condicionesSeleccionadas;
	private Visualization visualization;
	private String field;// la tabla
	private String fieldGeneLabels;
	private String fieldConditionLabels;
	private MicroGridLayout gl;
	private HeatmapDiagram.VerticalLineLayout2 vl2;

	/**
	 * Session constructor
	 * 
	 * @param session
	 *            Session to which this controller has to listen/update for
	 *            changes
	 * @param activity
	 *            Name of the ActionList linked to this FocusControl
	 * @param group
	 *            Group linked to this FocusControl (usually, the
	 *            Visualization.FOCUS_ITEMS)
	 * @param expressionsGroup
	 *            name of the group that contains the exrpression levels
	 * @param geneNamesGroup
	 *            name of the group that contains the gene names
	 * @param conditionNamesGroup
	 *            name of the group that contains the condition names
	 * @param mgl
	 *            MicroGridLayout to which this HeatmapFocusControl is linked
	 * @param v
	 *            Visualization linked to this FocusControl
	 */
	public HeatmapHoverControl(Session session, String activity, String group,
			String expressionsGroup, String geneNamesGroup,
			String conditionNamesGroup, MicroGridLayout mgl,
			HeatmapDiagram.VerticalLineLayout2 vl2, Visualization v) {
		super(group, 1, activity);
		this.activity = activity;
		this.group = group;
		enabled = true;
		this.sesion = session;
		genesSeleccionados = new LinkedList<Integer>();
		genesSparseSeleccionados = new LinkedList<Integer>();
		condicionesSeleccionadas = new LinkedList<Integer>();
		visualization = v;
		this.field = expressionsGroup;
		this.fieldGeneLabels = geneNamesGroup;
		this.fieldConditionLabels = conditionNamesGroup;
		gl = mgl;
		this.vl2 = vl2;
	}

	/**
	 * Indicates if this Control is currently enabled.
	 * 
	 * @return true if the control is enabled, false if disabled
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * Sets the enabled status of this control.
	 * 
	 * @param enabled
	 *            true to enable the control, false to disable it
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	// -- Actions performed on VisualItems ------------------------------------

	/**
	 * Checks for mouse entering, this change the layout It is easier to control
	 * than to use bifocal distortion
	 */
	public void itemEntered(VisualItem item, MouseEvent e) {
		if (!filterCheck(item))
			return;
		if (item != curFocus) // Añadimos al foco uno que no es el último
								// añadido
		{
			Visualization vis = item.getVisualization();

			boolean genSeleccionado = false;
			boolean condicionSeleccionada = false;
			boolean expresionSeleccionada = false;

			if (item.getGroup().equals(field))
				expresionSeleccionada = true;
			else if (item.getGroup().equals(fieldGeneLabels))
				genSeleccionado = true;
			else if (item.getGroup().equals(fieldConditionLabels))
				condicionSeleccionada = true;

			boolean ctrl = e.isControlDown();
			if (!ctrl) // Este es el único que estará en el focus
			{
				curFocus = item;
				clearPreviousHover();
			}

			if (genSeleccionado) {
				// System.out.println("Añadiendo gen "+item.getInt("actualId")+" "+item.getString("name"));
				genesSeleccionados.add(item.getInt("actualId"));
				for (int i = 0; i < sesion.getMicroarrayData()
						.getNumConditions(); i++) {
					condicionesSeleccionadas.add((Integer) i);
					// TODO: add todos los items a esta
				}
			}
			if (condicionSeleccionada) {
				condicionesSeleccionadas.add(item.getInt("id"));
			}
			if (expresionSeleccionada) {
				// System.out.println("Añadiendo expr "+item.getInt("rowId")+" "+item.getString("colId"));
				genesSeleccionados.add(item.getInt("actualRowId"));// Sparse
				// genesSeleccionados.add(item.getInt("rowId"));
				condicionesSeleccionadas.add(item.getInt("colId"));
			}
			addItemsForHover(genesSeleccionados, condicionesSeleccionadas);
			sesion.setHoveredBicluster(new Selection(genesSeleccionados, condicionesSeleccionadas), "Heatmap");

			runActivity(vis);
		}
	}

	public void itemExited(VisualItem item, MouseEvent e) {
		clearPreviousHover();
	}

	void clearPreviousHover() {
		condicionesSeleccionadas.clear();
		genesSeleccionados.clear();
		sesion.setHoveredBicluster(null, "Heatmap");
	}

	/**
	 * Like addItems, but it only for hovering. That is, the position is not
	 * changed, they are only distorted
	 */
	void addItemsForHover(LinkedList<Integer> gid, LinkedList<Integer> cid) {
		int[] genes = null;
		int[] conds = null;
		if (gid.size() > 0)
			genes = new int[gid.size()];
		if (cid.size() > 0)
			conds = new int[cid.size()];

		for (int i = 0; i < gid.size(); i++)
			genes[i] = sesion.getMicroarrayData().getSparseGeneId(gid.get(i));

		for (int i = 0; i < cid.size(); i++)
			conds[i] = (new Integer((cid.get(i)).toString())).intValue();
		gl.newHover(genes, conds);
		vl2.newHover(genes);
	}

	private void runActivity(Visualization vis) {
		if (activity != null) {
			vis.run(activity);
			vis.run("color");
		}
	}

}
