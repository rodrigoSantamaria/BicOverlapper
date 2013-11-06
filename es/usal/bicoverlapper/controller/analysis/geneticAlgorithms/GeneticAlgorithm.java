package es.usal.bicoverlapper.controller.analysis.geneticAlgorithms;


/** 
 * 
 * This class implements a classic Genetic Algorithm, that uses individuals with 
 * characteristics defined in a Chromosome.
 * This class must be extended for each concrete problem to rewrite the computeFitness
 * function, and eventually other functions, depending on the problem
 * @author  ADMIN
 */
public class GeneticAlgorithm {
    
    protected Chromosome population[];
    protected int populationNumber;
    protected int parentsNumber;
    protected int mutationNumber;
    protected double mutationFactor;
    protected int generation;
    protected int numeroElite;
    
    protected float maxAjuste;//Sum of the fitness of all individuals of the population


    protected int tipoSeleccion;//0-Ruleta, 1-MEU
    protected int tipoCruce;//0-Aritmético Ponderado, 1-Simple
    
    /** Creates a new instance of GeneticAlgorithm */
    public GeneticAlgorithm() 
        {
        populationNumber=0;
        parentsNumber=0;
        mutationNumber=0;
        mutationFactor=0;
        generation=0;
        tipoSeleccion=0;
        numeroElite=0;
        }
    
    public GeneticAlgorithm(int NpopulationNumber, int NparentsNumber, int NmutationNumber,
                double NmutationFactor, Chromosome[] Npopulation) 
        {
        populationNumber=NpopulationNumber;
        parentsNumber=NparentsNumber;
        mutationNumber=NmutationNumber;
        mutationFactor=NmutationFactor;
        population=Npopulation;
        generation=0;
        numeroElite=0;
        tipoSeleccion=0;
        }
    
  //Constructor que saca la información del espectro necesario de un fichero, y
    //la de los centroides de otro fichero centroidesBD
   public GeneticAlgorithm(int NpopulationNumber, int NparentsNumber, int NmutationNumber,
                double NmutationFactor, int tipoSeleccion, int numeroElite, int tipoCruce) 
   		{
	   populationNumber=NpopulationNumber;
       parentsNumber=NparentsNumber;
       mutationNumber=NmutationNumber;
       mutationFactor=NmutationFactor;
       generation=0;
       this.tipoSeleccion=tipoSeleccion;
       this.tipoCruce=tipoCruce;
       this.numeroElite=numeroElite;
   		}
 
   //Constructor que saca la información del espectro necesario de un fichero, y
   //la de los centroides de otro fichero centroidesBD
  public GeneticAlgorithm(int NpopulationNumber, int NparentsNumber, int NmutationNumber,
               double NmutationFactor, int tipoSeleccion, int numeroElite, int tipoCruce,
               float[] initialGenes) 
  		{
	   populationNumber=NpopulationNumber;
      parentsNumber=NparentsNumber;
      mutationNumber=NmutationNumber;
      mutationFactor=NmutationFactor;
      generation=0;
      this.tipoSeleccion=tipoSeleccion;
      this.tipoCruce=tipoCruce;
      this.numeroElite=numeroElite;
      populate(initialGenes);
  		}
  
    public GeneticAlgorithm(int NpopulationNumber, int NparentsNumber, int NmutationNumber,
                double NmutationFactor) 
        {
        populationNumber=NpopulationNumber;
        parentsNumber=NparentsNumber;
        mutationNumber=NmutationNumber;
        mutationFactor=NmutationFactor;
        generation=0;
        }

    //FUNCIONES DE INICIALIZACIÓN
    //**************** POPULATE ********************
    /* Generates a random initial population with each individual having values around genes initial values (v0-1,v0+1)
     */
    public void populate(float[] genes)
        {
        population=new Chromosome[populationNumber];
		for(int i=0;i<populationNumber;i++)
			{
			population[i]=new Chromosome(genes.length);
	        for(int j=0;j<genes.length;j++)
				{
	            float aleatorio=(float)(-1.0 + 2.0*Math.random());//Valor entre -1 y 1
				float centroideDesplazado=genes[j]+aleatorio;
				population[i].setGene(centroideDesplazado, j);
				}
			}
        }
    
  //**************** POPULATE ********************
    /* Generates a random initial population with each individual having values around genes initial values (v0-v,v0+v)
     */
    public void populate(float[] genes, float variation)
        {
        population=new Chromosome[populationNumber];
		for(int i=0;i<populationNumber;i++)
			{
			population[i]=new Chromosome(genes.length);
	        for(int j=0;j<genes.length;j++)
				{
	            float aleatorio=(float)(-variation + variation*Math.random());//Valor entre -v y v
				float displacedGene=genes[j]+aleatorio;
				population[i].setGene(displacedGene, j);
				}
			}
        }
    
    //**************** POPULATE ********************
    /** Generates a random initial population with each individual randomly increasing or decreasing its value to +-v
     */
    public void populateFixedVar(float[] genes, float variation)
        {
        population=new Chromosome[populationNumber];
		for(int i=0;i<populationNumber;i++)
			{
			population[i]=new Chromosome(genes.length);
	        for(int j=0;j<genes.length;j++)
				{
	            //float aleatorio=(float)(-variation + variation*Math.random());//Valor entre -v y v
	        	float aleatorio=(float)(-0.5+Math.random());
				float displacedGene=genes[j]+Math.signum(aleatorio)*variation;
				population[i].setGene(displacedGene, j);
				}
			}
        }
    
  //**************** POPULATE ********************
    /** Generates a random initial population with only one(random) chromosome varied from the initial population
     * It is designed so that a population of 2n individuals with n genes in the cromosome takes all the possibilites of
     * gene[i]+-variation
     */
    public void populateUniqueVar(float[] genes, float variation, String[] nodeNames)
        {
        population=new Chromosome[populationNumber];
        
		for(int i=0;i<populationNumber;i++)
			{
			population[i]=new Chromosome(genes.length);
			int k=(int)Math.floor(i/2);
			switch(i%2)
				{
				case 0:
					population[i].setGene(genes[k]+variation, k);
					System.out.println(k+": Modificando nodo "+nodeNames[k/2]+"de"+genes[k]+" a "+(genes[k]+variation));
					break;
				case 1:
					population[i].setGene(genes[k]-variation, k);
					System.out.println(k+": Modificando nodo "+nodeNames[k/2]+"de"+genes[k]+" a "+(genes[k]-variation));
					break;
				}
			for(int j=0;j<genes.length;j++)//El resto son iguales
				{
	        	if(j!=k)	population[i].setGene(genes[j], j);
				}
			}
        }
    
   //************* DEBUG METHODS ***********
   public void printPopulation()
        {
        for(int i=0;i<populationNumber;i++)
            {
            System.out.println(i+" Citizen has ("+population[i].getGene(0)+" with fitness = "+population[i].getAjuste());
            }
        }
   
    //********* ORDENAR ***********
    public void sort()
        {
        Chromosome temp;
		int posMinimo=0;
		float valMinimo;
	   // int np=population[0].getGenes().length;
	
		for(int i=0;i<populationNumber;i++)
			{
	                valMinimo=population[i].getAjuste();
			posMinimo=i;
			for(int j=i+1;j<populationNumber;j++)//NOTA: Se podría reducir 		
				{
				if(population[j].getAjuste() < valMinimo)
					{
					valMinimo=population[j].getAjuste();
					posMinimo=j;
					}
				}
			temp=population[posMinimo];
	        population[posMinimo]=population[i];
	        population[i]=temp;
	        }
        }
    
    //************** HACER RULETA *******************
    /* Devuelve una ruleta correspondiente a la generación actual, donde los
     *individuos con mejor ajuste tienen un mayor peso.
     *Será usada por varias funciones de selección
     */
    public float[] hacerRuleta()
        {
        float ruleta[]=new float[parentsNumber*2];
        Chromosome citizen;
        float maxRuleta=0;

	   	for(int i=0;i<parentsNumber;i++)
			{
			citizen=population[i];
	                ruleta[i] = 1/(citizen.getAjuste()/maxAjuste);
	                //System.out.println("ruleta["+i+"] = 1/"+citizen.getAjuste()+"/"+maxAjuste+" = "+ruleta[i]);    
	          	maxRuleta+=ruleta[i];
			}		
		
	//        System.out.println("PROBABILIDADES DE ÉXITO DE CADA PADRE");
		for(int i=0;i<parentsNumber;i++)	
	            {
	           // System.out.println("ruleta["+i+"] = "+ruleta[i]+"/"+maxRuleta+" = "+ruleta[i]/maxRuleta);    
	            ruleta[i]=ruleta[i]/maxRuleta;
	            }
        return ruleta;
        }
    
    //********* SELECCIONAR ****************
    /* Selección de los padres de la nueva generación mediante el método de la
     * ruleta.
     */
    public int[] select()
        {
	//float maxRuleta=0;
	//Chromosome citizen;
//        System.out.println("Ruleta");
        
        float ruleta[]=hacerRuleta();
		int progenitores[]=new int[populationNumber*2];
		//Calculamos los progenitores en función de la ruleta de la vida
		//Mejor ajuste -> más probabilidad de procrear
		for(int i=0;i<populationNumber*2;i++)
			{
			//Cogemos progenitor.
			float aleatorio=(float)(((Math.random()*100)%100)/100.0);
			int j=0;
			float temp=0;
			while(temp<=aleatorio && j<parentsNumber)	
				temp+=ruleta[j++];
			progenitores[i]=j-1;	
	                //System.out.println("Cogemos el progenitor que está en "+aleatorio+" %, que es "+progenitores[i]);
			}
	        
		return progenitores;
        }
    
    //******************** MUESTREO ESTOC�STICO UNIVERSAL *****************
    public int[] muestreoEstocasticoUniversal()
        {
  //         System.out.println("Muestreo Estocástico Universal\n");
		int muestreo[]=new int[populationNumber*2];
		double aleatorio=((Math.random()%100))/100.0;
		float offset=(float)(1.0/(populationNumber*2));
	        int progenitores[]=new int[populationNumber*2];
		
	        float ruleta[]=hacerRuleta();
	        
		for(int i=0;i<populationNumber*2;i++)
			{
			double temp=0.0;
			//Cogemos progenitor.
			int j=0;
			float cuenta=(float)(aleatorio+offset*i);
			if(cuenta>1)	cuenta=cuenta-1;
			while(cuenta>temp && j<parentsNumber)	temp+=ruleta[j++];
			muestreo[i]=j;
			}
	
	//Ya tenemos a los padres elegidos por un muestreo estocástico, pero ordenados
	//secuencialmente. Los ordenamos aleatoriamente para que no se reproduzcan consigo
	//mismos
		for(int i=0;i<populationNumber*2;i++)	
			{
			aleatorio=(Math.random()%(populationNumber*2-i));
			progenitores[i]=muestreo[(int)aleatorio];
			for(int j=(int)aleatorio;j<(populationNumber*2-i-1);j++)//NOTA: el -1 es nuevo
				muestreo[j]=muestreo[j+1]; //Pisamos el que ya está pasado
			}
        
        return progenitores;
        }
    
    //****************** SELECCIONAR ÉLITE ******************
    /*  Seleccionamos el número de cromosomas que pasarán directamente
     *a la siguiente generación. Serán los "numeroElite" mejores cromosomas
     *En principio tener una "élite" mejora la convergencia del AG.
     */
    public int[] seleccionarElite()
        {
        int elite[]=new int[numeroElite];
        float ruleta[]=hacerRuleta();
        float max=0;
        int mejor=0;
        
        for(int i=0;i<numeroElite;i++)
            {
            //Tomamos los numeroElite mejores individuos
            for(int j=0;j<ruleta.length;j++)
                {
                if(ruleta[j]>max)   {max=ruleta[j]; mejor=j; ruleta[j]=-1;}
                }
            elite[i]=mejor;
            }
        return elite;
        }
    
    //*************** SIMPLE CROSS *********************
    //NOTA: Los resultados con el cruce simple son bastante malos comparativamente
    /* Cruce simple. El valor de cada gen de los cromosomas de la generación siguiente
     *dependerá de un punto fijo determinado aleatoriamente. Todos los genes anteriores
     *a dicho punto se copiarán del padre, todos los posteriores de la madre
     */
    public void simpleCross(int padres[])
        {
        Chromosome padre, madre; //Realmente los individuos son hermafroditas, pero usemos esta distinción universal de individuos: Binah y Hokhmah
        Chromosome hijo;
        Chromosome[] nextGeneration=new Chromosome[populationNumber];
  //      System.out.println("SIMPLE CROSS");
        int numParametros=population[0].getGenes().length;	
        float genesHijo[];
        int numPadre, numMadre;
       // float ajustePadre, ajusteMadre;
        
        
        for(int i=0;i<populationNumber;i++)
            {
            genesHijo=new float[numParametros];
            
            numPadre=padres[i*2];
            numMadre=padres[i*2+1];
            
            padre=population[numPadre];
            madre=population[numMadre];

            int puntoCruce = (int)((Math.random()*100 % (numParametros*2+1)));	
            //NOTA: Podría darse el caso de que un individuo generara él sólo un individuo sin la comprobación anterior(onanismo fértil!!!)
            for(int j=0;j<puntoCruce;j++)	//La mitad primera es la del padre
				{
		        genesHijo[j]=padre.getGene(j);
				}
					
            for(int j=puntoCruce;j<numParametros*2+1;j++)
				{
            	genesHijo[j]=madre.getGene(j);
				}
		    //Condiciones para mantenerse en el ROI
            hijo=new Chromosome(genesHijo, numPadre, numMadre);
            nextGeneration[i]=hijo;
            }
        
        population=nextGeneration;
        generation++;
        }
    
    //*************** MULTIPLE CROSS *********************
    //NOTA: Los resultados con el cruce simple son bastante malos comparativamente
    /* Cruce simple. El valor de cada gen de los cromosomas de la generación siguiente
     *dependerá de un punto fijo determinado aleatoriamente. Todos los genes anteriores
     *a dicho punto se copiarán del padre, todos los posteriores de la madre
     */
    public void multipleCross(int padres[])
        {
        Chromosome padre, madre; //Realmente los individuos son hermafroditas, pero usemos esta distinción universal de individuos: Binah y Hokhmah
        Chromosome hijo;
        Chromosome[] nextGeneration=new Chromosome[populationNumber];
        System.out.println("MULTIPLE CROSS");
        int numParametros=population[0].getGenes().length;	
        float genesHijo[];
        int numPadre, numMadre;
        
        
        for(int i=0;i<populationNumber;i++)
            {
            genesHijo=new float[numParametros];
            
            numPadre=padres[i*2];
            numMadre=padres[i*2+1];
            
            padre=population[numPadre];
            madre=population[numMadre];

            int numCruces =(int)(3+(Math.random()*100 % (numParametros*2+1-1)));//Marcamos como cruces el inicial y el final
            
            int puntoCruces[]=new int[numCruces];
            for(int j=1;j<numCruces-1;j++)  //NOTA: OJO!!! -> Con este método estamos cogiendo por lo general trozos más grandes en la parte inicial 
                {
                puntoCruces[j]=puntoCruces[j-1]+1+(int)((Math.random()*100 % (numParametros*2+1-puntoCruces[j-1]-1)));	
                if(puntoCruces[j]>numParametros*2+1)   puntoCruces[j]=numParametros*2+1;
                }
            puntoCruces[0]=0;               //Inicial y final
            puntoCruces[numCruces-1]=numParametros*2+1;
//            for(int j=0;j<numCruces;j++)    System.out.println("puntoCruces["+j+"]= "+puntoCruces[j]);
            //NOTA: Podría darse el caso de que un individuo generara él sólo un individuo sin la comprobación anterior(onanismo fértil!!!)
            for(int j=0;j<numCruces-1;j++)
            	{
                if(j%2==0)//Intervalos pares para el padre
                    {
                    //System.out.println("PADRE del "+puntoCruces[j]+" al "+puntoCruces[j+1]);
                    for(int k=puntoCruces[j];k<puntoCruces[j+1];k++)
                        {
                        genesHijo[k]=padre.getGene(k);
                        }
                       
                    }
                else//Intervalos impares para la madre
                    {
                    //System.out.println("MADRE del "+puntoCruces[j]+" al "+puntoCruces[j+1]);
                    for(int k=puntoCruces[j];k<puntoCruces[j+1];k++)
                        {
                        genesHijo[j]=madre.getGene(j);
                        }
                    }
            	}
			
            hijo=new Chromosome(genesHijo, numPadre, numMadre);
            nextGeneration[i]=hijo;
            }
        
        population=nextGeneration;
        generation++;
        }
 
    
    //*********** WEIGHTED ARITHMETIC CROSS ***************
    /*  Cruce aritmético ponderado. El valor de cada gen de los cromosomas de la
     *próxima generación es la media de los valores del gen para cada uno de sus 
     *dos progenitores, ponderada según el ajuste de cada uno.
     */
    public void weightedArithmeticCross(int padres[])
        {
        Chromosome padre, madre; //Realmente los individuos son hermafroditas, pero usemos esta distinción universal de individuos: Binah y Hokhmah
        Chromosome hijo;
        Chromosome[] nextGeneration=new Chromosome[populationNumber];
        //    System.out.println("SIMPLE CROSS");
        int numParametros=population[0].getGenes().length;	
        float genesHijo[];
        int numPadre, numMadre;
        float ajustePadre, ajusteMadre;
     //   System.out.println("WEIGHTED ARITHMETIC CROSS");
        for(int i=0;i<populationNumber;i++)
			{
        	genesHijo=new float[numParametros];
                
			numPadre=padres[i*2];
			numMadre=padres[i*2+1];
		
            padre=population[numPadre];
            madre=population[numMadre];
            ajustePadre=padre.getAjuste();
            ajusteMadre=madre.getAjuste();
                
			//Podría darse el caso de que un individuo generara él sólo un individuo sin la comprobación anterior(onanismo fértil!!!)
			for(int j=0;j<numParametros;j++)
				{
				genesHijo[j]=(madre.getGene(j)/ajusteMadre+padre.getGene(j)/ajustePadre)/(1/ajustePadre+1/ajusteMadre);
				}
        	hijo=new Chromosome(genesHijo, numPadre, numMadre);
            nextGeneration[i]=hijo;
			}
        
        //La procreación es radical, una vez todos los hijos han nacido, no conviven con sus padres, sino que estos son sacrificados en masa al gran dios Cthulhu.
        population=nextGeneration;
        generation++;       
        }

    //********* PROCREAR ***********
    /*  Se realiza un cruce aritmético ponderado, de forma que cada uno de los 
     *genes del próximo individuo serán la media ponderada según el ajuste de los
     *genes de sus padres
     */
    public void generateOffspring()
        {
        int padres[];
        System.out.print(tipoSeleccion);
        switch(tipoSeleccion)
            {
            case 0:  padres=select(); break;
            case 1:  padres=muestreoEstocasticoUniversal(); break;
            default: padres=select(); break;
            }
        if(numeroElite>0)
            {
            if(numeroElite>populationNumber)    numeroElite=populationNumber;//Comprobación (quizás convendría un mensaje o directamente una excepción)
	    int elite[]=new int[numeroElite];
            elite=seleccionarElite();
	    for(int i=0;i<numeroElite;i++)  padres[i]=elite[i];
            }
        
        System.out.print(tipoCruce);
        switch(tipoCruce)
            {
            case 0: weightedArithmeticCross(padres); break;
            case 1: simpleCross(padres); break;
            case 2: multipleCross(padres); break;
            default: weightedArithmeticCross(padres); break;
            }
        }
    
    /**
     * Random modification of some of the genes in some of the individuals. The number of mutant individuals depends on 
     * mutationNumber and the impact of the mutation on mutationFactor
     * The mutation changes the value of the node in [-mutationFactor, mutationFactor], for different mutation behavior, extend
     * this class and overwrite the method.
     */
    public void mutate()
        {
	Chromosome mutant;
	int genX=0;
	float valorMutado=0;
	float valorMutacion=0;
    int numParametros=population[0].getGenes().length;
    
    for(int i=0;i<mutationNumber;i++)
		{
		mutant=population[(int)((Math.random()*populationNumber)%populationNumber)];
		//genX=(int)((Math.random()*(2*numParametros+1))%(2*numParametros+1));
		genX=(int)(Math.random()*(numParametros));
        //valorMutacion=(float)((1-2*((float)((Math.random()*100)%100)/100.0))*mutationFactor);//Fluctuará en [-fM,fM]
		valorMutacion=(float)((1-2*Math.random())*mutationFactor);//Fluctuará en [-fM,fM]
	    
        valorMutado=mutant.getGene(genX)+valorMutacion;
		mutant.setGene(valorMutado, genX);
		}		
     }
    
    
    //********* EJECUTAR ******************
    public void ejecutar(int maxGeneraciones, double minError)
        {
		Chromosome adam=population[0];
	        
	    computeFitness();
		for(int i=0;i<maxGeneraciones;i++)
			{
			adam=population[0];
			System.out.println("Iteraci�n "+i+" error"+adam.getAjuste());
			if(adam.getAjuste()<=minError)	
				{
				System.out.println("Se ha minimizado el error: " + adam.getAjuste());
				return;
				}
	                
            generateOffspring();//Ordena, selecciona y procrea
            mutate();
            computeFitness();
            sort();
            System.out.println("Poblaci�n ordenada: ");
            for(int j=0;j<population.length;j++)System.out.print(population[j].getAjuste()+"\t");
            
            System.out.println("\nPresión Selectiva: "+getSelectivePressure()+", Diversidad: "+getDiversity());
			}	
	    adam=population[0];
        }
    
    //*************** GET DIVERSITY *******************
    /*  La diversidad es una medida del desvío general con respecto al ajuste
     *medio. Es una medida de lo parecida que es la población
     */
    public double getDiversity()
        {
	double temp=0;
	double resta=0;
	double media=getAverageScore();
	for(int i=0;i<populationNumber;i++)
		{
		resta=getScore(i)-media;
		temp+=resta*resta;
		}
	return Math.sqrt(temp);
        }
    
    //************* GET SELECTIVE PRESSURE **************
    /*  La presión selectiva es una medida de la tendencia a favorecer a los 
     *individuos más aptos. Según Whitley, debería mantenerse entorno al 1.5
     */
    public double getSelectivePressure()
        {
        return populationNumber*getMaxScore();
        }
    
    //******************* GET MAX SCORE *****************
    /*  Devuelve el score más alto de la población
     */
    public double getMaxScore()
        {
        //return getMejorAjuste()/getSumaAjustes();
        return getBestFitness()/getSumFitness();
        }
    
    //*****************GET SCORE ******************
    //NOTA: TEMA: nuestros ajustes son cuanto menos mejor, no sé cómo influye esto
    /*      Mi teoría es que visto así todo va a ir justo a la inversa. Y nos va 
     *    a salir lo contrario de lo que queremos. Por ello voy a invertir los 
     *    valores que devuelve getAjuste y getMejorAjuste, y también getSumaAjustes
     *     MEJOR: Voy a crear unas funciones getFitness, con lo que el fitness se referirá
     *    a lo bueno que resulta el ajuste, mientras que el ajuste seguirá siendo la
     *    diferencia entre áreas: ajuste-cuanto menor mejor y fitness-cuanto mayor mejor
     */
    /*  El score nos indica el porcentaje de relevancia de un elemento respecto al
     *resto de la población, según el criterio del ajuste: mejor ajuste, mayor relevancia
     */
    public double getScore(int pos)
        {
        return getFitness(pos)/getSumFitness();
        }
    
    //************** GET AVERAGE SCORE **************
    public double getAverageScore()
        {
        return getSumScore()/populationNumber;
        }
    
    //************** GET SUM SCORE *******************
    public double getSumScore()
        {
        double temp=0;
        for(int i=0;i<populationNumber;i++) temp+=getScore(i);
        return temp;
        }

    //******************* GET SUMA AJUSTES *****************
    public float getSumaAjustes()
        {
        double temp=0.0;
        for(int i=0;i<populationNumber;i++) temp+=population[i].getAjuste();
	return (float)temp;
        }
    
    //********* GET MEJOR AJUSTE ******************
    /*  Tomamos el mejor ajuste, que es el más pequeño
     */
    public float getMejorAjuste()
        {
       	computeFitness();
        double temp=population[0].getAjuste();
        for(int i=0;i<populationNumber;i++) if(population[i].getAjuste()<temp)  temp=population[i].getAjuste();
	return (float)temp;
        }
    
    //********* GET AJUSTE MEDIO *******************
    public float getAjusteMedio()
        {
        float temp=0;
        for(int i=0;i<getPopulationNumber();i++)    temp+=getAjuste(i);
        return temp/(float)getPopulationNumber();
        }
    
    //********** GET FITNESS **************
    public double getFitness(int pos)
        {
        return 1.0/getAjuste(pos);
        }
    
    //************ GET BEST FITNESS ***********
    public double getBestFitness()
        {
        double temp=getFitness(0);
        for(int i=0;i<populationNumber;i++)  if(getFitness(i)>temp) temp=getFitness(i);
        return temp;
        }
    
    //************** GET SUM FITNESS ************
    public double getSumFitness()
        {
        double temp=0;
        for(int i=0;i<populationNumber;i++) temp+=getFitness(i);
        return temp;
        }
    
    /**
     * Computes the fitness for each individual (this function will depend on each specific problem)
     */
    public void computeFitness()
        {
        /*maxAjuste=0;
		for(int i=0;i<population.length;i++)//Para cada elemento de la población
			{
			double chi=0;
			float errorCuadrado=0;
			float Fx=0;
			int li=limInferior;
			double c=0, a=0, g=0, total=0;
				
			Chromosome individuo=population[i];
			float sigma=individuo.getSigma();
			for(int j=0;j<y.length;j++)//Para cada canal del intervalo le restamos los valores de los parámetros
				{
				for(int k=0;k<individuo.getNumberOfParameters();k++)//Para cada parámetro calculamos su convolución y la restamos
					{
					c=individuo.getCentroid(k);
					a=individuo.getAmplitude(k);
	                                g = a*Math.exp( (-Math.pow(j+limInferior-c+1,2))/(2*sigma*sigma) );
	          //                     System.out.println(a+"*e(-("+(j+limInferior)+"-"+(c+1)+")²/2*"+sigma+"²)=a*e"+(-Math.pow(j+limInferior-c+1,2))/(2*sigma*sigma)+"="+g );
					Fx+=g;
					}
				errorCuadrado+=Math.pow(y[j]-Fx, 2);
	              //          System.out.println("\t\t"+y[j]+"-"+Fx+"²="+errorCuadrado);
	                        total+=espectro[j] + sigmaContinuo[j]*sigmaContinuo[j];//Ni+sci² //NOTA: esta operación con hacerla la primera vez valdría para todos!!!
	                //        System.out.println("total+="+espectro[j]+" + "+sigmaContinuo[j]*sigmaContinuo[j]);
	                        //NOTA: Aquí arriba se supone que no deberíamos sumar el límInferior no???
				Fx=0;
				}
		    chi=errorCuadrado / total;
	        individuo.setAjuste((float)chi);
			maxAjuste+=chi;
			}
			*/
        }
        
   //******** Get methods
    public int getPopulationNumber()
        {
        return populationNumber;
        }
    public int getParentsNumber()
        {
        return parentsNumber;
        }
    public int getMutationNumber()
        {
        return mutationNumber;
        }
    public double getMutationFactor()
        {
        return mutationFactor;
        }
    public int getGeneration()
        {
        return generation;
        }
    public Chromosome[] getPopulation()
        {
        return population;
        }
    
    public Chromosome getCitizen(int pos)
        {
        return population[pos];
        }
    
    public double getAjuste(int numCitizen)
        {
        //System.out.println("EL ajuste del ciudadano "+numCitizen+" es: "+population[numCitizen].getAjuste());
        return population[numCitizen].getAjuste();
        }

    public double[] getAjustes()
        {
        double [] ajustes=new double[populationNumber];
        for(int i=0;i<populationNumber;i++) ajustes[i]=population[i].getAjuste();
        return ajustes;
        }
    
    //*********** Set methods
    public void setPopulationNumber(int NewPn)
        {
        populationNumber=NewPn;
        }
    public void setParentsNumber(int NewParN)
        {
        parentsNumber=NewParN;
        }
    public void setMutationNumber(int NewMn)
        {
        mutationNumber=NewMn;
        }
    public void setMutationFactor(double NewMf)
        {
        mutationFactor=NewMf;
        }
    public void setPopulation(Chromosome[] NewPopulation)
        {
        population=NewPopulation;
        }
    
    /**
     * Getter for property maxAjuste.
     * @return Value of property maxAjuste.
     */
    public float getMaxAjuste() {
        return maxAjuste;
    }
    
    /**
     * Setter for property maxAjuste.
     * @param maxAjuste New value of property maxAjuste.
     */
    public void setMaxAjuste(float maxAjuste) {
        this.maxAjuste = maxAjuste;
    }
}
