package es.usal.bicoverlapper.view.diagram.overlapper;

import java.util.ArrayList;

/**
 * Extension of Cluster, where each node is connected to any other in the Cluster (maximal graph or clique)
 * @author Roberto Therón and Rodrigo Santamaría
 *
 */
public class MaximalCluster extends Group {
  
	/**
	 * Builds an empty MaximalCluster
	 *
	 */
  public MaximalCluster() {
	super();
  }
  /**
   * Builds an empty MaximalCluster in the ClusterSet r
   * @param r	the ClusterSet in which the cluster is in
   */
  public MaximalCluster(GroupSet r) {
 	  super(r);
	  } 

  /**
   * Builds a MaximalCluster with name l in the ClusterSet r
   * @param r the ClusterSet in which the cluster is in
   * @param l the String used as label to name the Cluster
   */
  public MaximalCluster(GroupSet r, String l) {
	  super(r,l);
	  } 
 
  /**
   * Adds a node and builds edges to any other node in the cluster
   * @param n	Node to be added to the MaximalCluster
   */
  public void addNode(Node n) {
	    clusterNodes.add(n);
	    buildEdges(n);
	  }
  
  /**
   * When the cluster is complete, to call this function makes to each node add the nodes in the cluster
   * to its mate list.
   *
   */
  public void notifyNodesInCluster()
	  {
	  for(int i=0;i<clusterNodes.size();i++)
	  	{
		Node n=(Node)clusterNodes.get(i);
		n.addCluster(this);
	  	}
	  }
  
  /**
   * 
   * Remove all the edges from this Cluster an returns them as an ArrayList<Edge>
   * @return An ArrayList with all the edges thas this Cluster have
   */
 	public ArrayList<Edge> removeEdges()
		{
		ArrayList<Edge> ret=new ArrayList<Edge>();
		for(int i=0;i<clusterNodes.size();i++)
			{
			Node n=(Node)clusterNodes.get(i);
			for(int j=0;j<clusterNodes.size();j++)
				{
				if(j!=i)	
					{
					Node m=(Node)clusterNodes.get(j);
					
					//System.out.println("Eliminando arista "+clusterNodes.get(i).getLabel()+"->"+clusterNodes.get(j).getLabel());
					SpringEdge e=(SpringEdge)myGraph.getEdges().get(n.getLabel()+"->"+m.getLabel());
					
					if(e!=null)
						{
						if(e.getNaturalLength()<((Overlapper)myGraph.getApplet()).getEdgeLength())	
							{
							//e.setLengthFactor(e.getLengthFactor()/0.8);
							e.setNaturalLength(e.getNaturalLength()/0.8);
							ret.add(e);//La metemos para que la restaure luego
							}
						else		
							{
							myGraph.getEdges().remove(n.getLabel()+"->"+m.getLabel());
							myGraph.getEdgesFrom(n).remove(n.getLabel()+"->"+m.getLabel());
							myGraph.getEdgesTo(n).remove(n.getLabel()+"->"+m.getLabel());
							myGraph.getEdgesFrom(m).remove(n.getLabel()+"->"+m.getLabel());
							myGraph.getEdgesTo(m).remove(n.getLabel()+"->"+m.getLabel());
							ret.add(e);
							}
						}
					}
				}
			}
		return ret;
		}
	

}


