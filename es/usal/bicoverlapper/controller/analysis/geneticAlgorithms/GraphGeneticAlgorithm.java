package es.usal.bicoverlapper.controller.analysis.geneticAlgorithms;

import java.util.Iterator;

import es.usal.bicoverlapper.view.diagram.overlapper.Graph;
import es.usal.bicoverlapper.view.diagram.overlapper.Node;

/**
 * Genetic Algorithm for graph repositioning of nodes
 * Population will be x,y positions of the n nodes involved (2*n chromosome length)
 * Fitness function will depend on various weighted metrics, but essentially the misplacement
 * ratio will be the most important
 * @author Rodrigo
 *
 */
public class GraphGeneticAlgorithm extends GeneticAlgorithm{
	
	public Graph graph;
	public int[] priorities={Graph.NODE, Graph.HULL};
	public String[] nodeNames;
	float[] initialPositions;
	
	public GraphGeneticAlgorithm(int NpopulationNumber, int NparentsNumber, int NmutationNumber,
               double NmutationFactor, int tipoSeleccion, int numeroElite, int tipoCruce,
               Graph g)
		{
		super(NpopulationNumber, NparentsNumber, NmutationNumber, NmutationFactor, tipoSeleccion, numeroElite, tipoCruce);
		graph=g;
		Iterator<Node> it=graph.getNodes().values().iterator();
		nodeNames=new String[g.getNodes().size()];
		for(int i=0;i<nodeNames.length;i++)		nodeNames[i]=it.next().getLabel();
		initialPositions=new float[nodeNames.length*2];//*2 para tener x e y
		int pos425=0;
		for(int i=0;i<nodeNames.length*2;i+=2)
			{
			Node n=graph.getNodes().get(nodeNames[i/2]);
			initialPositions[i]=(float)n.getX();
			initialPositions[i+1]=(float)n.getY();
			if(n.getLabel().equals("425"))	
				{
				pos425=i;
				System.out.println("Nodo "+nodeNames[i/2]+" está en "+pos425+": "+initialPositions[i]+", "+initialPositions[i+1]+")");
				}
			}
		//populate(initialPositions);
		//populate(initialPositions,200);
		populateFixedVar(initialPositions,20);
		//populateUniqueVar(initialPositions,20);
		//populateUniqueVar(initialPositions,20, nodeNames);
		
	/*	for(int i=0;i<this.population.length;i++)	
			if(i==pos425)
				{
				for(int j=0;j<population[i].getGenes().length;j++)
					
				}*/
		}
	
	/**
	 * Overwrites GeneticAlgorithm.computeFitness based in the Graph that is loaded
	 */
	public void computeFitness()
		{
		//System.out.println("Compute fitness ");
		maxAjuste=0;
		for(int i=0;i<population.length;i++)//Para cada elemento de la poblaciÃ³n
			{
			double metric=0;
				
			Chromosome individuo=population[i];
			for(int j=0;j<individuo.getGenes().length;j+=2)
				{
				float x=individuo.getGene(j);
				float y=individuo.getGene(j+1);
				//System.out.println("nuevo punto "+x+", "+y);
				//modificar puntos del grafo
				graph.getNodes().get(nodeNames[j/2]).setPosition(x,y);
				}
			
			//Para mejorar las posiciones
			//graph.draw(priorities);
			//metric=graph.getFailedPositionMetric();
			
			//Para hacer el layout minimizando LinLog
			metric=graph.getLinLogEnergy();	
	        individuo.setAjuste((float)metric);
	       // System.out.print(metric+"\t");
			maxAjuste+=metric;
			//restaurar puntos del grafo
			for(int j=0;j<nodeNames.length*2;j+=2)
				{
				graph.getNodes().get(nodeNames[j/2]).setPosition(initialPositions[j], initialPositions[j+1]);
				}
			}
		//System.out.println("---------------------------");
			
		}
	
    //********* EJECUTAR ******************
	/**
	 * Overrides GeneticAlgorithm method to include changes in the final graph
	 */
    public void ejecutar(int maxGeneraciones, double minError)
        {
    	System.out.println("GA con "+this.populationNumber+" individuos");
    	long start=System.currentTimeMillis();
		Chromosome adam=population[0];
	        
	    computeFitness();
	    sort();
		for(int i=0;i<maxGeneraciones;i++)
			{
			adam=population[0];
			System.out.println("-----------------------");
			System.out.println("Iteración "+i+" error: "+adam.getAjuste());
			if(adam.getAjuste()<=minError)	
				{
				System.out.println("Se ha minimizado el error: " + adam.getAjuste());
				break;
				}
	                
            generateOffspring();//Ordena, selecciona y procrea
            mutate();
            computeFitness();
            sort();
            System.out.println("Población ordenada: ");
            for(int j=0;j<population.length;j++)System.out.print(population[j].getAjuste()+"\t");
            
            System.out.println("\nPresiÃ³n Selectiva: "+getSelectivePressure()+", Diversidad: "+getDiversity());
			}	
		
		adam=population[0];//best individual
	    System.out.println("Mejor individuo tomado y dibujando");
	    for(int j=0;j<adam.getGenes().length;j+=2)
			{
			float x=adam.getGene(j);
			float y=adam.getGene(j+1);
			//modificar puntos del grafo
			graph.getNodes().get(nodeNames[j/2]).setPosition(x,y);
			}
		//graph.draw(priorities);
		System.out.println("Tiempo tardado "+(System.currentTimeMillis()-start));
		
        }
	}
