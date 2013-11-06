/*
 * GAThread.java
 *
 * Created on 24 de noviembre de 2004, 11:13
 */

package es.usal.bicoverlapper.controller.analysis.geneticAlgorithms;

/**
 *
 * @author  Rodrigo Santamaría
 */
public class GAThread extends Thread
    {
    private GeneticAlgorithm GA;
    private int numIterations;
    private float minError;
    
    /** Creates a new instance of GAThread */
    public GAThread() 
        {
        super();
        }

    public GAThread(GeneticAlgorithm GA, int numIterations, float minError) 
        {
        super();
        this.GA=GA;
        this.numIterations=numIterations;
        this.minError=minError;
        }
    
    public void run()
        {
     //     try{
             GA.ejecutar(numIterations, minError);
      //    }catch(InterruptedException e){System.out.println("Hilo parado: "+e.getMessage()); return;}
        }
}
