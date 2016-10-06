package es.usal.bicoverlapper.model.stats;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

import cern.jet.math.tdouble.DoubleArithmetic;
import es.usal.bicoverlapper.model.annotations.GOTerm;
//import es.usal.voronto.model.voronoi.Cell;
public class Stats 
	{
	public BigDecimal fn;
	public int totalGenes;
	
	
	
	public static double fisherTest(int termGenes, int relevantGenes, int relevantGenesInTerm, int totalGenes)
	{
		int n=totalGenes;
		int a=relevantGenesInTerm;//relevant genes in the ontology term genes
		int b=relevantGenes-a;//rest of relevant genes
		int c=termGenes-a;//term genes NOT relevant
		int d=totalGenes-a-b-c;//genes not relevant not in the term
		
		long t0=System.currentTimeMillis();
		//1) Fisher's test:
		double n1=Math.min(Double.MAX_VALUE, DoubleArithmetic.binomial(a+b,a));	
		double n2=Math.min(Double.MAX_VALUE, DoubleArithmetic.binomial(c+d,c));
		double den=Math.min(Double.MAX_VALUE, DoubleArithmetic.binomial(n, a+c));
		//System.out.println(n1+"*"+n2+"/"+den);
		double p=n1*(n2/den);
//		System.out.println("Took: "+(System.currentTimeMillis()-t0));
//		System.out.println(p);
		return p;
		}//13.5s para KEGG

	/**
	 * Returns the p-value threshold to get a Bonferroni of alpha
	 * (i.e. if alpha=0.05 probability of getting at most 5% false positives) 
	 * @param alpha
	 * @param numTests
	 * @return
	 */
	public static double bonferroni(double alpha, int numTests)
		{
		return alpha/numTests;
		}
	
	/**
	 * Returns the p-value threshold to get an FWER (controlled by the Holm-Bonferroni method) 
	 * of alpha	(i.e. if alpha=0.05 probability of 5% of getting at least 1 false positive) 
	 * @param alpha
	 * @param cc
	 * @return
	 */
	public static double fwer(double alpha, Set<GOTerm> ot)
		{
		ArrayList<Double> pvals=new ArrayList<Double>();
		for(GOTerm term:ot)
			pvals.add(new Double(term.pvalue));
		java.util.Collections.sort(pvals);
		//Collections.reverse(pvals);
		int k=0;
		for(k=0;k<pvals.size();k++)
			{
			//System.out.println(pvals.get(k)+"\t"+(alpha/(pvals.size()+1-k)));
			if(pvals.get(k)>alpha/(pvals.size()-k+1))
				{
				if(k>0)	return pvals.get(k-1).doubleValue();
				else	return -1;
				}
			}
		return -1;//no value fits fwer
		}
	
	/**
	 * Returns the p-value threshold to get an FDR (controlled by the Benjamini-Hochberg method) 
	 * of alpha	(i.e. if alpha=0.05 probability of having exactly a 5% false positives) 
	 * @param alpha
	 * @param cc
	 * @return
	 */
	public static double fdr(double alpha, Set<GOTerm> ot)
		{
		ArrayList<Double> pvals=new ArrayList<Double>();
		for(GOTerm term:ot)
			pvals.add(new Double(term.pvalue));
		Collections.sort(pvals);
		Collections.reverse(pvals);
		int k=0;
		for(k=0;k<pvals.size();k++)
			{
			//System.out.println(pvals.get(k)+"\t"+alpha*k/pvals.size());
			if(pvals.get(k)<=alpha*k/pvals.size())
				return pvals.get(k).doubleValue();
			}
		return -1;
		}
	}
