package es.usal.bicoverlapper.view.diagram.heatmap;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

import javax.swing.JOptionPane;


import es.usal.bicoverlapper.controller.analysis.AnalysisProgressMonitor;
import es.usal.bicoverlapper.controller.analysis.AnalysisProgressMonitor.AnalysisTask;
import es.usal.bicoverlapper.controller.kernel.Selection;
import es.usal.bicoverlapper.controller.kernel.Session;

import prefuse.Visualization;
import prefuse.controls.FocusControl;
import prefuse.util.ui.UILib;
import prefuse.visual.VisualItem;

/**
 * Extension of prefuse FocusControl for mouse interaction management in HeatmapDiagram
 * @author Rodrigo Santamaria
 *
 */
class HeatmapFocusControl extends FocusControl
{
    private boolean enabled;
    private Session sesion;
    String group;//Visualization.FOCUS
    private String activity;
    private LinkedList<Integer> genesSeleccionados;
    private LinkedList<Integer> genesSparseSeleccionados;
    private LinkedList<Integer> condicionesSeleccionadas;
    private Visualization visualization;
    private String field;//la tabla
    private String fieldGeneLabels;
    private String fieldConditionLabels;
    private MicroGridLayout gl;
    private HeatmapDiagram.VerticalLineLayout2 vl2;
    private HeatmapDiagram.HorizontalLineLayout hl;
    private int [] columnOrder;
    public int numNeighbors=10;
	private AnalysisTask t;
    
    /**
     * Session constructor
     * @param session Session to which this controller has to listen/update for changes
     * @param activity Name of the ActionList linked to this FocusControl
	 * @param group		Group linked to this FocusControl (usually, the Visualization.FOCUS_ITEMS)
     * @param expressionsGroup		name of the group that contains the exrpression levels	
     * @param geneNamesGroup	name of the group that contains the gene names
     * @param conditionNamesGroup	name of  the group that contains the condition names
     * @param mgl		MicroGridLayout to which this HeatmapFocusControl is linked
	 * @param v			Visualization linked to this FocusControl
     */
    public HeatmapFocusControl(Session session, String activity, 
		   String group, String expressionsGroup, String geneNamesGroup, String conditionNamesGroup, 
		   MicroGridLayout mgl,  HeatmapDiagram.VerticalLineLayout2 vl2, HeatmapDiagram.HorizontalLineLayout hl, Visualization v, int numNeighbors)
		{
		super(group, 1, activity);
		this.activity=activity;
		this.group=group;
		enabled=true;
		this.sesion=session;
		genesSeleccionados=new LinkedList<Integer>();
		genesSparseSeleccionados=new LinkedList<Integer>();
		condicionesSeleccionadas=new LinkedList<Integer>();
		visualization=v;
		this.field=expressionsGroup;
		this.fieldGeneLabels=geneNamesGroup;
		this.fieldConditionLabels=conditionNamesGroup;
		gl=mgl;
		this.vl2=vl2;
		this.hl=hl;
		this.numNeighbors=numNeighbors;
		}

    /**
     * Indicates if this Control is currently enabled.
     * @return true if the control is enabled, false if disabled
     */
    public boolean isEnabled(){ return enabled;}
    
    /**
     * Sets the enabled status of this control.
     * @param enabled true to enable the control, false to disable it
     */
    public void setEnabled(boolean enabled){this.enabled=enabled;}
    
//  -- Actions performed on VisualItems ------------------------------------

    /**
     * Checks for mouse clicks, changing Session status if necessary
     */
    public void itemClicked(VisualItem item, MouseEvent e)
     	{
        if ( !filterCheck(item) ) return;
       
	        if ( (UILib.isButtonPressed(e, button) || e.getButton()==MouseEvent.BUTTON3) &&
	             e.getClickCount() == ccount )
	        	{
	        	Visualization vis = item.getVisualization();
                
                boolean genSeleccionado=false;
                boolean condicionSeleccionada=false;
                boolean expresionSeleccionada=false;
                
                if(item.getGroup().equals(field))               		expresionSeleccionada=true;
                else if(item.getGroup().equals(fieldGeneLabels))   		genSeleccionado=true;
                else if(item.getGroup().equals(fieldConditionLabels))  	condicionSeleccionada=true;
                
                
	            if(e.isControlDown()) //Do a search+selection of similar patterns
		         	{
	        		if(genSeleccionado)
	        			{
        				ArrayList<Object> params=new ArrayList<Object>();
	    				params.add(numNeighbors);
	    				params.add(sesion.getMicroarrayData().getGeneName(item.getInt("actualId")));
	    				AnalysisProgressMonitor apm=new AnalysisProgressMonitor(sesion.getAnalysis(), AnalysisProgressMonitor.AnalysisTask.SEARCH_PATTERNS, params, "Searching similar patterns...");
	    				apm.run();
	    				t=apm.getTask();
						Thread wt=new Thread() {
							public void run() {
								try{
									String simprofs=t.get();
									if(simprofs==null)	
										JOptionPane.showMessageDialog(null,
							                    "No similar profiles found",
							                    "Error",JOptionPane.ERROR_MESSAGE);
									else
										{
										String [] neighbors=simprofs.split(" ");
										 System.out.println(neighbors);
					        			 for(String n : neighbors)
					        				genesSeleccionados.add(sesion.getMicroarrayData().getGeneId(n));
					        			condicionesSeleccionadas.clear();
					        			for(int i=0;i<sesion.getMicroarrayData().getNumConditions();i++)
											condicionesSeleccionadas.add((Integer)i);
										sesion.setSelectedBiclustersExcept(new Selection((LinkedList<Integer>)genesSeleccionados.clone(), (LinkedList<Integer>)condicionesSeleccionadas.clone()), "XXX");
										}
									}catch(Exception e){e.printStackTrace();}
							}
						};
						wt.start();
						}
		         	}
                else if(e.isAltDown())
                	{
                	sesion.getMicroarrayData().browseEntrezGene(item.getInt("actualId"));
                	}
                else
	        	 	{
		            if ( item != curFocus ) //Añadimos al foco uno que no es el último añadido
		            	{
	                	if(!e.isShiftDown())
		                	{
		                	curFocus = item;
		                    clear();
		                	}
		                
		                if(genSeleccionado)			
		                	{
		                	genesSeleccionados.add(item.getInt("actualId"));
		                	condicionesSeleccionadas.clear();
		                	for(int i=0;i<sesion.getMicroarrayData().getNumConditions();i++)
								{
								condicionesSeleccionadas.add((Integer)i);
								//TODO: add todos los items a esta
								}
							}
		                if(condicionSeleccionada)
		                	{
		                	if(!condicionesSeleccionadas.contains(item.getInt("id")))	condicionesSeleccionadas.add(item.getInt("id"));
		                	sendExpressionLevels(item.getInt("id"));
		                	}
		                if(expresionSeleccionada)
		                	{
		                	genesSeleccionados.add(item.getInt("actualRowId"));//Sparse
		                	if(!condicionesSeleccionadas.contains(item.getInt("colId")))	condicionesSeleccionadas.add(item.getInt("colId"));
		                	}
		                
		                this.addItems(genesSeleccionados, condicionesSeleccionadas);
		            	sesion.setSelectedBiclustersExcept(new Selection(genesSeleccionados, condicionesSeleccionadas), "Heatmap");
		        
		            runActivity(vis);
		         	}
	        	}
            }
     	}
    
    //Cuando se llama, se ponen como uno de los primeros a este perfil genético
	void addItem(VisualItem item)
		{
		Visualization vis=item.getVisualization();
		
//		Cambiamos su orden en la visualización
		item.setInt("rowRank", -1);	
		
//		Cambiamos también el orden en los nombres
		Iterator it=vis.items(fieldGeneLabels, "name=\""+item.getString("gene")+"\"");
		VisualItem geneLabel=(VisualItem)it.next();//Debería haber sólo uno
		geneLabel.setInt("rowRank",-1);
		
		genesSeleccionados.add(item.getRow());
		runActivity(vis);
		}
	
	void addItems(VisualItem[] item)
		{
		for(int i=0;i<item.length;i++)	addItem(item[i]);
		}
	
	
	/**
	 * Like addItems, but it only for hovering. That is, the position is not changed, they are only distorted
	 */
	/*void addItemsForHover(LinkedList<Integer> gid, LinkedList<Integer> cid)
		{
		int [] genes=null;
		int [] conds=null;
		if(gid.size()>0)	genes= new int[gid.size()];
		if(cid.size()>0)	conds=new int[cid.size()];

		for(int i=0;i<gid.size();i++)	
			genes[i]=sesion.getMicroarrayData().getSparseGeneId(gid.get(i));
	
		for(int i=0;i<cid.size();i++)	
			conds[i]=(new Integer((cid.get(i)).toString())).intValue();
		
		gl.newHover(genes, conds);
		Iterator it;
		String condition;
		
		//Cambiamos las etiquetas de los genes y condiciones para que estén los primeros los seleccionados
		for(int i=0;i<gid.size();i++)
			{
			//it=visualization.items(fieldGeneLabels,"id="+gid.get(i));//Cogemos la etiqueta de gen
			it=visualization.items(fieldGeneLabels,"actualId="+gid.get(i));//Cogemos la etiqueta de gen, en el caso de sparse tiene que ser por el actualId!
			VisualItem glabel=(VisualItem)it.next();
			glabel.setInt("rowRank",-(gid.size()-i));//the same order that puts gl.newOrder()
			}

		for(int i=0;i<cid.size();i++)
			{
			condition=(cid.get(i)).toString();
			it=visualization.items(fieldConditionLabels,"id="+condition);//Cogemos la etiqueta de gen
			//it=visualization.items(fieldConditionLabels,"colRank="+condition);//Cogemos la etiqueta de gen
			VisualItem clabel=(VisualItem)it.next();//there should be only one
			clabel.setInt("colRank",-(gid.size()-i));
			}
		runActivity(visualization);
		//runActivity("color");
		}*/

	/**
	 * Changes rowRank, colRank to -1 in "geneLabels", "conditionLabels" y "matrix" elements which
	 *  "id" (two first cases) or "rowId" and "colId" coincide with gid and cid.
	 * Deben pasársele rowIds, no actualRowIds!
	 */
	void addItems(LinkedList<Integer> gid, LinkedList<Integer> cid)
		{
		int [] genes=null;
		int [] conds=null;
		if(gid.size()>0)	genes= new int[gid.size()];
		if(cid.size()>0)	conds=new int[cid.size()];

		for(int i=0;i<gid.size();i++)	
			genes[i]=sesion.getMicroarrayData().getSparseGeneId(gid.get(i));
		for(int i=0;i<cid.size();i++)	
			conds[i]=(new Integer((cid.get(i)).toString())).intValue();
		
		gl.newOrder(genes, conds);
		vl2.newOrder(genes);
		hl.newOrder(conds);
		Iterator it;
		String condition;
		
		//Cambiamos las etiquetas de los genes y condiciones para que estén los primeros los seleccionados
		for(int i=0;i<gid.size();i++)
			{
			if(gid.get(i)>=0)
				{
				it=visualization.items(fieldGeneLabels,"actualId="+gid.get(i));//Cogemos la etiqueta de gen, en el caso de sparse tiene que ser por el actualId!
				VisualItem glabel=(VisualItem)it.next();
				glabel.setInt("rowRank",-(gid.size()-i));//the same order that puts gl.newOrder()
				}
			}

		for(int i=0;i<cid.size();i++)
			{
			condition=(cid.get(i)).toString();
			it=visualization.items(fieldConditionLabels,"id="+condition);//Cogemos la etiqueta de gen
			VisualItem clabel=(VisualItem)it.next();//there should be only one
			
			int rank=sesion.getMicroarrayData().columnOrder[new Integer(condition).intValue()] - sesion.getMicroarrayData().getNumConditions(); //this works for sorting, on all columns, but not for selection since then cid.size is less than the total number of conditions
			clabel.setInt("colRank",rank);
			//clabel.setInt("colRank",i-cid.size());//this works for bicluster selection but does not have into account sorting order
			}
		
		runActivity(visualization);
		}
	
	//Añade todos los niveles de expresión que tengan un gen con ese id
	void addItems(String name)
		{
		Iterator it=visualization.items(field,"gene=\""+name+"\"");
		
		while(it.hasNext())
			addItem((VisualItem)it.next());
		}

	
	void clear()
		{
		//Set original ranks (the ids, or, in the case of conditions, the sorted ids)
		//Y de la etiqueta
		Iterator it2=visualization.items(fieldGeneLabels, "rowRank<0");
		while(it2.hasNext())
			{
			VisualItem itemLabel=((VisualItem)it2.next());
			itemLabel.setInt("rowRank", itemLabel.getInt("id"));
			}

//			Y de la etiqueta de condiciones
		Iterator it3=visualization.items(fieldConditionLabels, "colRank<0");
		while(it3.hasNext())
			{
			VisualItem itemLabel=((VisualItem)it3.next());
			itemLabel.setInt("colRank", sesion.getMicroarrayData().columnOrder[itemLabel.getInt("id")]);
			}
		genesSeleccionados.clear();
		condicionesSeleccionadas.clear();
		}
    
	private void sendExpressionLevels(int colid)
		{
		Vector<Double> vect=new Vector<Double>(0,1);
		Iterator it=visualization.items(field,"colId="+colid);
		while(it.hasNext())
			vect.add( ((VisualItem)it.next()).getDouble("level"));
		
		sesion.setConditionExpressions(vect);
		}
	
    private void runActivity(Visualization vis) 
    	{
        if ( activity != null )        
        	{
        	vis.run(activity);
        	//vis.run("color");
        	}
    	}


}
