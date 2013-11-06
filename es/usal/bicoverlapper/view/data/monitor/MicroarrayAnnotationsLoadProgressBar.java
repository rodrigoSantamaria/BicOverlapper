package es.usal.bicoverlapper.view.data.monitor;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JPanel;
import javax.swing.JProgressBar;

import es.usal.bicoverlapper.view.main.BicOverlapperWindow;

public class MicroarrayAnnotationsLoadProgressBar implements PropertyChangeListener {

private JProgressBar progressBar;

	public MicroarrayAnnotationsLoadProgressBar(BicOverlapperWindow framePrincipal){
		//creación de la barra de progreso
		progressBar = new JProgressBar(0, 100);
        
		//si en algún momento se opta por la barra de progreso con valores se activaría esto y desactivaría el setInterminate
		//progressBar.setValue(0);
        //progressBar.setStringPainted(false);
        
		progressBar.setPreferredSize(new Dimension(70,10));
		//es indeterminada, es decir, no se puede saber qué porcentaje del trabajo está hecho 
		//esto es debido a que se realiza en un servidor externo ajeno a este programa
		progressBar.setIndeterminate(true);
		progressBar.setToolTipText("Retrieving gene names, analysis options disabled in the meanwhile");
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(progressBar, BorderLayout.EAST);

		progressBar.setVisible(false);
		framePrincipal.getJMenuBar().add(panel);
		framePrincipal.validate();
	}
	
	/**
	 * Make the JProgressBar visible
	 */
	public void visualize(){
		if(!progressBar.isVisible()){
			progressBar.setVisible(true);
		}	
	}
	
	public void hide(){
		//progressBar.setValue(0);
		progressBar.setVisible(false);
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		//si la propiedad progress cambia de valor, se actualiza la barra de progreso
        //en principio no se usará porque la información de las anotaciones no se obtiene progresivamente y se pasa de 0 a 100 de golpe
		//por tanto se opta por la barra indeterminada
		/*
		if ("progress".equals(evt.getPropertyName())) {
    		progressBar.setValue((Integer)evt.getNewValue());
        }
        */
	}
}