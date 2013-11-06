package es.usal.bicoverlapper.view.diagram.network;

import prefuse.action.layout.Layout;

/**
 * This class implements a Network layout as the one described by Martin Krzywinski
 * at http://mkweb.bcgsc.ca/linnet/talks/linnet-introduction.pdf
 * 
 * @author rodri
 * 
 *
 */
public class HiveNetworkLayout extends Layout
	{
	//axes -> nodes should be automatically assigned to axis based on some criteria
	//	For example, in, out or in/out on a directed graph
	//	Or the degree of connections on an undirected one
	private String axisAssignment="direction";	//defaulted to directed layouts (it automatically defaults numAxis to 3)
	private int numAxes=3;
	//values -> the nodes on a determinate axis are positioned following another additional criteria
	// such as degree of connections, etc. All the axes follow the same criteria
	private String axisPosition="degree";
	
	public HiveNetworkLayout(String graph)
		{
		this(graph, "direction", 3, "degree");
		}
	
	public HiveNetworkLayout(String graph, String axisAssignment, int numAxes, String axisPosition)
		{
		super(graph);		
		this.axisAssignment=axisAssignment;
		this.numAxes=numAxes;
		this.axisPosition=axisPosition;
		}
	
	/**
	 * @see prefuse.action.Action#run(double)
	 */
	public void run(double frac)
		{
		
		}
	}
