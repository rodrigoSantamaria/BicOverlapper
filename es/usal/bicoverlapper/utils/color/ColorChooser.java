package es.usal.bicoverlapper.utils.color;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JTextField;

/**
 * Action listener to show a JColorChooser and put the selection done in a text field sample
 * STILL IN DEVELOPMENT
 * 
 * @author Javier Molpeceres
 * @version 3.2, 22/3/2007
 */
public class ColorChooser implements ActionListener{
		
	private JButton boton;
	private JTextField muestra;
	Color color;
	
	/**
	 * Builds a ColorChooser with the corresponding button that activates color selection and the corresponding
	 * JTextField to show the sample.
	 * 
	 * @param button Boton que lanza el evento que crea el selector de color.
	 * @param sample TextArea where the color is to be shown after selection.
	 */
	public ColorChooser(JButton button,JTextField sample){
		this.boton = button;
		this.muestra = sample;
	}

	/**
	 * Builds a ColorChooser with the corresponding button that activates color selection and the corresponding
	 * JTextField to show the sample. Also adds a initial color selected
	 * 
	 * @param button Boton que lanza el evento que crea el selector de color.
	 * @param sample TextArea where the color is to be shown after selection.
	 * @param color initial Color for the ColorChooser 
	 */
	public ColorChooser(JButton button,JTextField sample, Color color){
		this.boton = button;
		this.muestra = sample;
		this.color = color;
	}
	
	/**
	 * Shows a JColorChooser and records the color selected, putting it in the sample JTextField
	 */
	public void actionPerformed(ActionEvent e) {
		Color newColor;
		if(boton!=null)
			newColor = JColorChooser.showDialog(boton,
					"Color Chooser",muestra.getBackground());
		else
			newColor = JColorChooser.showDialog(muestra,
				"Color Chooser",muestra.getBackground());
		
		muestra.setBackground(newColor);
		color=newColor;
	}
}