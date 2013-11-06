package es.usal.bicoverlapper.model.annotations;

/**
 * KEGGPath refers to a KEGG Pathway annotated to a gene or a group of genes.
 * @author Rodrigo
 *
 */
public class KEGGPath {
	/**
	 * Name of the KEGG pathway
	 */
	public String name;
	/**
	 * KEGG ID
	 */
	public String id;
	/**
	 * Organism of the KEGG pathway
	 */
	public String organism;
	
	/**
	 * In the case of a KEGGPath associated to a single gene, it conveys the number of times that
	 * it appears in the path. It's usually 1, but in some cases it might appear several times with
	 * different functions or just for clarity on the graph
	 * 
	 * In the case of a GOTerm associated to a group of genes, it conveys the number of genes that 
	 * are in this KEGG path
	 */
	public int occurences;
	
	/**
	 * In the case of a KEGGPath associated to a single gene, it means nothing, and is usually 
	 * undefined
	 * 
	 * In the case of a KEGGPath associated to a group of genes, it is the p-value of a hypergeometric
	 * test against all the genes in the microarray data matrix.
	 */
	public double pvalue;//In case of hypergeometric tests
	
	public KEGGPath()
		{
		name="";
		id="";
		organism="";
		occurences=0;
		}
	
	public KEGGPath(String t, String i,String o, int oc)
		{
		name=t;
		id=i;
		organism=o;
		occurences=oc;
		}
}