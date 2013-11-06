package es.usal.bicoverlapper.view.configuration.panel;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import es.usal.bicoverlapper.controller.kernel.Session;
import es.usal.bicoverlapper.view.diagram.kegg.KEGGDiagram;

public class KeggParameterConfigurationPanel extends javax.swing.JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ButtonGroup group;
	private JRadioButton quantileButton;
	private JRadioButton numericalButton;
	private String quantile = "Quantile scale";
	private String numerical = "Numerical scale";
	private int scaleModeSelected;
	private Session sesion;
	
	public KeggParameterConfigurationPanel(Session _sesion) {
		super();
		this.sesion = _sesion;
		//el valor por defecto será el que haya en la sesión
		scaleModeSelected = sesion.getScaleMode();
		initGUI();
	}
	
	private void initGUI() {
		this.setPreferredSize(new Dimension(300, 50));
		
		quantileButton = new JRadioButton(quantile);
		quantileButton.setActionCommand(quantile);
		if(sesion.getScaleMode() == Session.quantile){
			quantileButton.setSelected(true);
		}
		quantileButton.addActionListener(this);
		numericalButton = new JRadioButton(numerical);
		numericalButton.setActionCommand(numerical);
		if(sesion.getScaleMode() == Session.numerical){
			numericalButton.setSelected(true);
		}
		numericalButton.addActionListener(this);
		
		group = new ButtonGroup();
		group.add(quantileButton);
		group.add(numericalButton);
		
		this.add(quantileButton);
		this.add(numericalButton);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals(quantile)){
			scaleModeSelected = Session.quantile;
		}
		else if(ae.getActionCommand().equals(numerical)){
			scaleModeSelected = Session.numerical;
		}
	}

	/**
	 * @return the modeSelected
	 */
	public int getScaleModeSelected() {
		return scaleModeSelected;
	}
}
