package es.usal.bicoverlapper.view.diagram.kegg;

import java.awt.Dimension;

import es.usal.bicoverlapper.view.configuration.DiagramConfiguration;

/**
 * Class to set the configuration of KEGGDiagram
 * 
 * @author Carlos Martín Casado
 *
 */
public class KEGGDiagramConfiguration extends DiagramConfiguration {

	private int indexCombo1;
	private int indexCombo2;
	private int valorActualCondition;
	
	public KEGGDiagramConfiguration(int id, String name, int posX, int posY, Dimension dim) {
		super(id, name, posX, posY, dim);
	}

	public KEGGDiagramConfiguration(DiagramConfiguration dc) {
		super(dc.getId(), dc.getTitle(), dc.getPosX(), dc.getPosY(), dc.getDim());
	}

	/**
	 * @return the indexCombo1
	 */
	public int getIndexCombo1() {
		return indexCombo1;
	}

	/**
	 * @return the indexCombo2
	 */
	public int getIndexCombo2() {
		return indexCombo2;
	}

	/**
	 * @param indexCombo1 the indexCombo1 to set
	 */
	public void setIndexCombo1(int indexCombo1) {
		this.indexCombo1 = indexCombo1;
	}

	/**
	 * @param indexCombo2 the indexCombo2 to set
	 */
	public void setIndexCombo2(int indexCombo2) {
		this.indexCombo2 = indexCombo2;
	}

	/**
	 * @return the valorActualCondition
	 */
	public int getValorActualCondition() {
		return valorActualCondition;
	}

	/**
	 * @param valorActualCondition the valorActualCondition to set
	 */
	public void setValorActualCondition(int valorActualCondition) {
		this.valorActualCondition = valorActualCondition;
	}
}
