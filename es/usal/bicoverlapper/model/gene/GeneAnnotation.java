package es.usal.bicoverlapper.model.gene;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import es.usal.bicoverlapper.model.annotations.GOTerm;
import es.usal.bicoverlapper.model.annotations.KEGGPath;

public class GeneAnnotation {

	/**
	 * Internal id used only by BicOverlapper
	 */
	private int internalId;
	// From NCBI, obtained by eUtils
	/**
	 * Gene name as in NCBI
	 */
	private String name;
	/**
	 * NCBI gene symbol
	 */
	private String symbol;
	/**
	 * Gene ID in the loaded data matrix
	 */
	private String id;
	/**
	 * NCBI gene id (entrezId)
	 */
	private String entrezId;
	/**
	 * Ensembl gene id (entrezId)
	 */
	private String ensemblId;

	/**
	 * Gene type as in NCBI (by now not taken)
	 */
	private String type;
	/**
	 * Locus tag as in NCBI (by now not taken)
	 */
	private String locus;
	/**
	 * NCBI gene short description
	 */
	private String description;
	/**
	 * Gene organism as in NCBI
	 */
	private String organism;

	/**
	 * NCBI identified aliases
	 */
	private ArrayList<String> aliases;

	private ArrayList<GOTerm> goTerms;
	private ArrayList<KEGGPath> keggPaths;

	public GeneAnnotation() {
		aliases = new ArrayList<String>();
		// goTerms=new ArrayList<GOTerm>();//null if they haven't been searched
		// yet, empty if they were searched and not found
	}

	public String getDetailedForm() {
		String form = "";
		if (name != null && name.length() > 0)
			form = form.concat("Name: " + name + "\n");
		if (id != null && id.length() > 0)
			form = form.concat("ID:      " + id + "\n");
		if (type != null && type.length() > 0)
			form = form.concat("Type:  " + type + "\n");
		if (locus != null && locus.length() > 0)
			form = form.concat("Loc.:  " + locus + "\n");
		if (aliases != null && aliases.size() > 0) {
			String al = "";
			for (int i = 0; i < aliases.size(); i++)
				al = al.concat(aliases.get(i) + ", ");
			form = form.concat("Alias:  " + al.substring(0, al.length() - 2)
					+ "\n");
		}
		if (organism != null && organism.length() > 0)
			form = form.concat("Species:   " + organism + "\n");
		if (description != null && description.length() > 0) {
			form = form.concat("Desc.:  ");
			String[] tok = description.split(" ");
			int cont = 0;
			for (int i = 0; i < tok.length; i++) {
				form = form.concat(tok[i] + " ");
				if (cont++ >= 5 || i == tok.length - 1) {
					form = form.concat("\n      ");
					cont = 0;
				}
			}
		}
		if (goTerms != null && goTerms.size() > 0) {
			// 1) Sort terms
			List<String> terms = new ArrayList<String>();
			for (GOTerm go : goTerms)
				terms.add(go.getTerm());
			Collections.sort(terms);
			ArrayList<GOTerm> newgo = new ArrayList<GOTerm>();
			for (String term : terms)
				for (GOTerm go : goTerms)
					if (go.getTerm().equals(term))
						newgo.add(go);

			goTerms = newgo;

			// 2) Add them
			form = form.concat("\nGO Terms:  ");
			boolean add = false;
			for (GOTerm go : goTerms)
				if (go.getOntology().equals("CC")) {
					add = true;
					break;
				}
			if (add) {
				form = form.concat("\n  Cellular component");
				for (GOTerm go : goTerms)
					if (go.getOntology().equals("CC"))
						form = form.concat("\n     " + go.getTerm());
			}
			add = false;
			for (GOTerm go : goTerms)
				if (go.getOntology().equals("BP")) {
					add = true;
					break;
				}
			if (add) {
				form = form.concat("\n  Biological process");
				for (GOTerm go : goTerms)
					if (go.getOntology().equals("BP"))
						form = form.concat("\n     " + go.getTerm());
			}
			add = false;
			for (GOTerm go : goTerms)
				if (go.getOntology().equals("MF")) {
					add = true;
					break;
				}
			if (add) {
				form = form.concat("\n  Molecular function");
				for (GOTerm go : goTerms)
					if (go.getOntology().equals("MF"))
						form = form.concat("\n     " + go.getTerm());
			}
		}
		return form;
	}

	/**
	 * @return the internalId
	 */
	public int getInternalId() {
		return internalId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the entrezId
	 */
	public String getEntrezId() {
		return entrezId;
	}

	/**
	 * @return the ensemblId
	 */
	public String getEnsemblId() {
		return ensemblId;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the locus
	 */
	public String getLocus() {
		return locus;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the organism
	 */
	public String getOrganism() {
		return organism;
	}

	/**
	 * @return the aliases
	 */
	public ArrayList<String> getAliases() {
		return aliases;
	}

	/**
	 * @return the goTerms
	 */
	public ArrayList<GOTerm> getGoTerms() {
		return goTerms;
	}

	/**
	 * @return the keggPaths
	 */
	public ArrayList<KEGGPath> getKeggPaths() {
		return keggPaths;
	}

	/**
	 * @param internalId the internalId to set
	 */
	public void setInternalId(int internalId) {
		this.internalId = internalId;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @param entrezId the entrezId to set
	 */
	public void setEntrezId(String entrezId) {
		this.entrezId = entrezId;
	}

	/**
	 * @param ensemblId the ensemblId to set
	 */
	public void setEnsemblId(String ensemblId) {
		this.ensemblId = ensemblId;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @param locus the locus to set
	 */
	public void setLocus(String locus) {
		this.locus = locus;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param organism the organism to set
	 */
	public void setOrganism(String organism) {
		this.organism = organism;
	}

	/**
	 * @param aliases the aliases to set
	 */
	public void setAliases(ArrayList<String> aliases) {
		this.aliases = aliases;
	}

	/**
	 * @param goTerms the goTerms to set
	 */
	public void setGoTerms(ArrayList<GOTerm> goTerms) {
		this.goTerms = goTerms;
	}

	/**
	 * @param keggPaths the keggPaths to set
	 */
	public void setKeggPaths(ArrayList<KEGGPath> keggPaths) {
		this.keggPaths = keggPaths;
	}
}
