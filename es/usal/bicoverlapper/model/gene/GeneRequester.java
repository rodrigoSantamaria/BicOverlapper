package es.usal.bicoverlapper.model.gene;

import java.util.ArrayList;

import es.usal.bicoverlapper.model.annotations.GOTerm;

public interface GeneRequester {
	public void receiveGeneAnnotations(ArrayList<GeneAnnotation> galist);
	public void receiveGOTerms(ArrayList<GOTerm> galist);
	
}
