package es.usal.bicoverlapper.model.network;


import java.io.File;

import prefuse.data.Graph;
import prefuse.data.io.DataIOException;
import prefuse.data.io.GraphMLReader;

import java.util.LinkedList;

import es.usal.bicoverlapper.controller.data.filter.SyntrenFilter;
import es.usal.bicoverlapper.controller.data.parser.TRNParser;


/**
 * Class with data of node and edges representing a TRN network, using Prefuse Graphs. 
 * Nodes and Edges will have the data information that GraphMLReader extracts from GML files. 
 * See prefuse API for more information.
 * @author Rodrigo Santamaría
 */

public class NetworkData
	{
	//XML file
	private File f = null;
	//Graph
	private GraphMLReader gr=null;
	private Graph g = null;			//Data
	//Properties of graph
	private int nNodes = 0;
	private int nEdges = 0;
	private LinkedList<int[]> ffls=null;
	
	/**
	 * Syntren File constructor. Builds a GML file from a Syntren file, saving it to disk and
	 * building the TRNData
	 * @param inputPath	Syntren input file path
	 * @param outputPath	GML output file path
	 */
	public NetworkData(String inputPath, String outputPath)
		{
		TRNParser.syntren2GML(inputPath,outputPath);
		//System.out.println("Termina el conversor");
		
		f=new File(outputPath);
		gr=new GraphMLReader();
			try{
		g=gr.readGraph(f);
			}catch(DataIOException dioe){System.out.println("Error reading "+f+": "+dioe.getMessage()); System.exit(1);}
	//	System.out.println("Hemos terminado de crear el grafo sin problemas");
		System.out.println("Network with "+g.getNodeCount()+" nodes");
		System.out.println("Network with "+g.getEdgeCount()+" edges");
		nNodes=g.getNodeCount();
		nEdges=g.getEdgeCount();
		
		
		//countFFLs();
		System.out.println("Number of FFLs found: "+ffls.size());
		}
	
	/**
	 * GML File constructor. 
	 * STILL IN DEVELOPMENT: If the file has .xml extension, it considers that it is a Syntren file, and converts it before building
	 * @param inputPath	File path with TRN information
	 */
	public NetworkData(String inputPath)
		{
		String ext=SyntrenFilter.getExtension(inputPath);
		if(ext.equals("xml"))	
			{
			TRNParser.syntren2GML(inputPath,"es/usal/bicoverlapper/data/TRN.xml");
			f=new File("es/usal/bicoverlapper/data/TRN.xml");
			}
		else if(ext.equals("txt"))
			{
			TRNParser.tab2GML(inputPath,"es/usal/bicoverlapper/data/TRN.xml");
			f=new File("es/usal/bicoverlapper/data/TRN.xml");
			}
		else	f=new File(inputPath);
		
		gr=new GraphMLReader();
			try{
		g=gr.readGraph(f);//takes some time for 2600 nodes, not too much
			}catch(DataIOException dioe){System.out.println("Error reading "+f+": "+dioe.getMessage()); System.exit(1);}
		nNodes=g.getNodeCount();
		nEdges=g.getEdgeCount();
		
		g.addColumn("id", int.class);
		
		//Motifs (pruebas)
		//countFFLs(); //TODO: Improve the search with long number of nodes, for 2600 is terribly slow
		}

	/**
	 * Returns the graph
	 * @return the prefuse Graph for this TRN
	 */
	public Graph getGraph()
		{
		return g;
		}
	
	/**
	 * Returns the number of Fast Forward Loops in the Graph
	 * @return the number of Fast Forward Loops in the Graph
	 */
	public int getNumberFFLs()
		{
		return ffls.size();
		}	
	
	
   
	/**
	 * Returns true if there is an edge directed from node id n1 to node id n2
	 * @param n1 - node id of the source node, as given in the Table of Graph
	 * @param n2 - node id of the target node, as given in the Table of Graph
	 * @return true if there is an edge directed from node id n1 to node id n2
	 */
	public boolean isEdgeFromTo(int n1, int n2)
	    {
		if(g.getEdge(n1,n2)>-1)	return true;
		else					return false;
	    }
	
    /** Returns the number of Fast Forward Loops (FFL) network motifs found at
     *  our TRN
     * In matrix form, an FFL has this appearance
     *  1|2|3
     *-------
     *1|0|1|1
     *2|0|0|1
     *3|0|0|0
     */
    private void countFFLs()
        {
        ffls=new LinkedList<int[]>();
        for(int i=0;i<nNodes;i++)
            for(int j=0;j<nNodes;j++)
                {
              	if(g.getEdge(i,j)>=0)
                    for(int k=j+1;k<nNodes;k++)
                        {
                    	if(g.getEdge(i,k)>=0)
                            {
                            if(k!=i && i!=j && k!=j) //Son tres nodos distintos (motif de 3)
                                {
                            	if(g.getEdge(j,k)>=0)                
                            		{
                            		ffls.add(new int[]{i,j,k});
                            		}
                            	if(g.getEdge(k,j)>=0)                
                            		{
                            		ffls.add(new int[]{i,k,j});
                            		}
                                }
                            }
                        }//recorremos k
                }//recorremos j
        }
    
    /**
     * Returns the Fast Forward Loops in the graph
     * STILL IN DEVELOPMENT
     * @return A linked list of int[3] arrays with the three node ids in the FFL
     */
	public LinkedList<int[]> getFFLs()
		{
		return ffls;
		}
	
	/**
     * Returns a Fast Forward Loop in the graph
     * STILL IN DEVELOPMENT
     * @param i	the number of the ffl to retrieve
     * @return An int[3] array with the three node ids in the FFL
     */
	public int[] getFFL(int i)
		{
		return (int[])ffls.get(i);
		}
	}//End of TRNData
