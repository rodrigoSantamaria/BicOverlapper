package es.usal.bicoverlapper.model.annotations;

/**
 * GOTerm refers to a GO Term annotated to a gene or a group of genes.
 * @author Rodrigo
 *
 */
public class GOTerm {
	/**
	 * Name of the GO term
	 */
	private String term;
	/**
	 * GO ID
	 */
	private String id;
	/**
	 * Further definition of the GO Term. It's available in R packages, but not in QuickGO
	 */
	private String definition;
	/**
	 * Ontology, either BP, MF or CC
	 */
	private String ontology;
	/**
	 * Type of evidence, for example IEA
	 */
	private String evidence;
	/**
	 * In the case of a GOTerm associated to a single gene, it conveys the number of times that
	 * these GOTerm has been associated to the gene. It's usually 1, but, for example in QuickGO,
	 * GOTerms can be repeated several times, each time referring to a different institution or 
	 * author annotating the gene with this GO term
	 * 
	 * In the case of a GOTerm associated to a group of genes, it conveys the number of genes that 
	 * have this GO Term
	 */
	public int occurences;//In case of hypergeometric test, t
	/**
	 * In the case of a GOTerm associated to a single gene, it means nothing, and is usually 
	 * undefined
	 * 
	 * In the case of a GOTerm associated to a group of genes, it is the p-value of a hypergeometric
	 * test against all the genes in the microarray data matrix.
	 */
	private double pvalue;//In case of hypergeometric tests
	
	public GOTerm()
		{
		term="";
		id="";
		definition="";
		ontology="";
		evidence="";
		occurences=0;
		}
	
	public GOTerm(String t, String i,String d,String o, String e, int oc)
		{
		term=t;
		id=i;
		definition=d;
		ontology=o;
		evidence=e;
		occurences=oc;
		}

	/**
	 * @return the term
	 */
	public String getTerm() {
		return term;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the definition
	 */
	public String getDefinition() {
		return definition;
	}

	/**
	 * @return the ontology
	 */
	public String getOntology() {
		return ontology;
	}

	/**
	 * @return the evidence
	 */
	public String getEvidence() {
		return evidence;
	}

	/**
	 * @return the occurences
	 */
	public int getOccurences() {
		return occurences;
	}

	/**
	 * @return the pvalue
	 */
	public double getPvalue() {
		return pvalue;
	}

	/**
	 * @param term the term to set
	 */
	public void setTerm(String term) {
		this.term = term;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @param definition the definition to set
	 */
	public void setDefinition(String definition) {
		this.definition = definition;
	}

	/**
	 * @param ontology the ontology to set
	 */
	public void setOntology(String ontology) {
		this.ontology = ontology;
	}

	/**
	 * @param evidence the evidence to set
	 */
	public void setEvidence(String evidence) {
		this.evidence = evidence;
	}

	/**
	 * @param occurences the occurences to set
	 */
	public void setOccurences(int occurences) {
		this.occurences = occurences;
	}

	/**
	 * @param pvalue the pvalue to set
	 */
	public void setPvalue(double pvalue) {
		this.pvalue = pvalue;
	}
}
