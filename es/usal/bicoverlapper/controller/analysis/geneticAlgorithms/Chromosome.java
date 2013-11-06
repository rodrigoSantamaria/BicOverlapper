/**
 * Chromosome.java
 *
 * Created on 20 de noviembre de 2004, 12:15
 * @author Rodrigo Santamaría
 */

package es.usal.bicoverlapper.controller.analysis.geneticAlgorithms;

/**
 * This class implements the chromosome for an individual in the Genetic Algorithm population
 * All genes are treated as equal, if they correspond to different entities is up to the user
 * to extend this class and change this, or to treat genes at each position different 
 * @author  Rodrigo Santamaría
 */
public class Chromosome {
    private float[] genes;
    private int numberOfParameters;
    private float ajuste;
    private int generation;
    private int number;
    private int father;
    private int mother;
    
    /** Creates a new instance of Chromosome */
    public Chromosome(int numberOfParameters) 
        {
        this.numberOfParameters=numberOfParameters;
        genes=new float[numberOfParameters];
        
        double aleatorio=Math.random()*450;
        aleatorio=aleatorio%450;
        aleatorio=aleatorio/100.0;
        }
    
    public Chromosome(Chromosome clone)
        {
        numberOfParameters=clone.getGenes().length;
        genes=new float[numberOfParameters];
        genes=clone.getGenes();
        }
    
    public Chromosome(float c[])
        {
        numberOfParameters=c.length;
        genes=c;
        }
    
    public Chromosome(float c[], int padre, int madre)
        {
        numberOfParameters=c.length;
        genes=c;
        father=padre;
        mother=madre;
        }

    //GET Methods
    public float[] getGenes()
        {
        return genes;
        }
    public float getGene(int i)
        {
        return genes[i];
        }
    
    //SET Methods
    public void setGenes(float[] a)
        {
        genes=a;
        }
    public void setGene(float a, int i)
        {
        genes[i]=a;
        }
    
    /**
     * Getter for property ajuste.
     * @return Value of property ajuste.
     */
    public float getAjuste() {
        return ajuste;
    }
    
    /**
     * Setter for property ajuste.
     * @param ajuste New value of property ajuste.
     */
    public void setAjuste(float ajuste) {
        this.ajuste = ajuste;
    }
    
    public int getGeneration()
        {
        return generation;
        }
    
    public void setGeneration(int generation)
        {
        this.generation=generation;
        }
    
    public int getNumber()
        {
        return number;
        }
    
    public void setNumber(int number)
        {
        this.number=number;
        }

    public int getFather()
        {
        return father;
        }
    
    public void setFather(int father)
        {
        this.father=father;
        }
   
    public int getMother()
        {
        return mother;
        }
    
    public void setMother(int mother)
        {
        this.mother=mother;
        }
    
    /**
     * Getter for property numberOfParameters.
     * @return Value of property numberOfParameters.
     */
    public int getNumberOfParameters() {
        return numberOfParameters;
    }
    
    /**
     * Setter for property numberOfParameters.
     * @param numberOfParameters New value of property numberOfParameters.
     */
    public void setNumberOfParameters(int numberOfParameters) {
        this.numberOfParameters = numberOfParameters;
    }
    
}
