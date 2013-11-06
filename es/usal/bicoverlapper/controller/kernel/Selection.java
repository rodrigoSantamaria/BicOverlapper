package es.usal.bicoverlapper.controller.kernel;

import java.util.LinkedList;

/*
 * Contiene todos los genes contenidos en una burbuja seleccionada pinchando sobre ella
 * (NOTA: de momento no funciona, pero el tema sería que si con ctrl+click selecciono 2+
 * burbujas, me haga una intersección de los genes que contiene y sea eso lo que pase aquí)
 */
/**
 * Class with genes and conditions selected, as lists of integers. In case that
 * only a genes are selected. You can choose to leave the condition list empty
 * or to fill it with all the conditions (analogous for conditions)
 * 
 */
public class Selection {
	private LinkedList<Integer> genes;
	private LinkedList<Integer> conditions;

	/**
	 * Constructor for a Bicluster selection.
	 * 
	 * @param g
	 *            Genes in the bicluster as a LinkedList of Integers that are
	 *            genes internal ids
	 * @param c
	 *            Conditions in the bicluster as a LinkedList of Integers that
	 *            are conditions internal ids
	 */
	public Selection(LinkedList<Integer> g, LinkedList<Integer> c) {
		genes = g;
		conditions = c;
		// Eliminamos el primero de una de las dos si vale cero, para evitar la
		// mierdilla de las listas
		if (genes.size() > 0 && genes.get(0) == -333)
			genes.remove(0);
		if (conditions.size() > 0 && conditions.get(0) == -333)
			conditions.remove(0);

	}

	/**
	 * Return the list of gene ids selected
	 * 
	 * @return the LinkedList<Integer> of gene ids
	 */
	public LinkedList<Integer> getGenes() {
		return genes;
	}

	/**
	 * Sets the list of genes selected
	 * 
	 * @param genes
	 *            LinedList<Integer> of gene ids selected
	 */
	public void setGenes(LinkedList<Integer> genes) {
		this.genes = genes;
		if (this.genes.size() > 0 && this.genes.get(0) == -333)
			this.genes.remove(0);
	}

	/**
	 * Return the list of condition ids selected
	 * 
	 * @return the LinkedList<Integer> of condition ids
	 */
	public LinkedList<Integer> getConditions() {
		return conditions;
	}

	/**
	 * Sets the list of conditions selected
	 * 
	 * @param conditions
	 *            LinedList<Integer> of condition ids selected
	 */
	public void setConditions(LinkedList<Integer> conditions) {
		this.conditions = conditions;
		if (this.conditions.size() > 0 && this.conditions.get(0) == -333)
			this.conditions.remove(0);
	}

}
