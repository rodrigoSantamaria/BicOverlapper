package es.usal.bicoverlapper.view.diagram.heatmap2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.io.File;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

//import prefuse.Display;
import prefuse.util.ColorLib;

import es.usal.bicoverlapper.controller.kernel.Selection;
import es.usal.bicoverlapper.controller.kernel.Session;
import es.usal.bicoverlapper.controller.manager.configurationManager.ConfigurationMenuManager;
import es.usal.bicoverlapper.controller.util.Translator;
import es.usal.bicoverlapper.model.microarray.ExpressionData;
import es.usal.bicoverlapper.view.configuration.panel.HeatmapParameterConfigurationPanel;
import es.usal.bicoverlapper.view.configuration.panel.KeggParameterConfigurationPanel;
import es.usal.bicoverlapper.view.diagram.Diagram;
import es.usal.bicoverlapper.view.main.DiagramWindow;

/**
 * This diagram represents a Microarray data matrix as the typical expression
 * level heatmap. It implements bifocal distortion to see gene and expression
 * profiles and it is linked to other views by the session layer. The structure
 * of the heatmap is based in Prefuse library.
 * 
 * @author Rodrigo Santamaria
 * 
 */
public class HeatmapDiagram2 extends Diagram {
	private static final long serialVersionUID = 1L;

	// atributos del panel del diagrama
	public Session session;
	// MultidimensionalData datos; // @jve:decl-index=0:
	private int alto;
	private int ancho;
	boolean atributosIniciados = false, configurando = false,
			diagramaPintado = false;

	// definicion de margenes del diagrama

	final int margenDer = 40;
	final int margenIzq = 40;
	final int margenSup = 25;
	final int margenInf = 40;
	final int margenDiagrama = 10; // porcentaje de exceso en intervalo de
									// representacion del diagrama

	// configuracion de color
	static final int lowColor = 0;
	static final int zeroColor = 1;
	static final int highColor = 2;
	static final int selectionColor = 3;
	static final int hoverColor = 4;
	// private Color[] paleta = {Color.BLUE, Color.WHITE, Color.RED, Color.BLUE,
	// Color.YELLOW};
	private Color[] paleta;
	String[] textoLabel = { "Lowest Expression", "Average Expression",
			"Highest expression", "Selection", "Hover" };
	// JTextField[] muestraColor =new JTextField[paleta.length];
	JTextField[] muestraColor;

	// atributos de configuracion anclajes
	DiagramWindow itemToAdd, itemToRemove;

	// Información propia del heatmap
	ExpressionData md;
	CellHeatmap v; // Visualization
	
	int contName = 0;
	int geneMargin = 100;
	int conditionMargin = 100;
	private double m_scale = 2 * 4; // OJOOO: Importantísimo: m_scale*rango debe
									// ser inexorablemente < 1, o salen escalas
									// negativas y todo se va a la mierda
	private int[] palette;

	Selection bicAnt = null;// para evitar bucles infinitos create-update

	private boolean resort;
	public int scaleModeHeatMap;

	private JScrollPane scrollPane;

	public JScrollPane sp;

	private KeggParameterConfigurationPanel panelEscala;

	/**
	 * Default constructor
	 */
	public HeatmapDiagram2() {
		super();
	}

	/**
	 * Session Constructor
	 * 
	 * @param sesion
	 *            Session to which this diagram is linked
	 * @param dim
	 *            Default dimensions for the diagram
	 */
	public HeatmapDiagram2(Session sesion, Dimension dim) {
		super(new BorderLayout());
		int num = sesion.getNumHeatmapDiagrams();
		this.setName("Microarray Heatmap " + num);
		this.session = sesion;
		this.md = sesion.getMicroarrayData();
		this.alto = (int) dim.getHeight();
		this.ancho = (int) dim.getWidth();
		this.setPreferredSize(new Dimension(ancho, alto));
		this.setSize(ancho, alto);
		this.paleta = new Color[] { sesion.getLowExpColor(),
				sesion.getAvgExpColor(), sesion.getHiExpColor(),
				sesion.getSelectionColor(), sesion.getHoverColor() };
		endConfig(true);//to set palette, etc.
		muestraColor = new JTextField[paleta.length];
		
		this.v=new CellHeatmap(this);
		
		
		sp=new JScrollPane(v);
		sp.setPreferredSize(dim);
		//sp.setSize(dim);
		//sp.setAutoscrolls(true);
		//sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		//sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		this.add(sp);
		v.addKeyListener(session);	
		v.setSelection(session.getSelectedBicluster());
		v.init();
		v.repaint();
		
		
		scaleModeHeatMap = sesion.getScaleMode();
		this.setVisible(true);
		this.revalidate();
		}


	public int getId() {
		return es.usal.bicoverlapper.controller.kernel.Configuration.HEATMAP_ID;
	}

	 
	public void update() 
		{
		if (session != null) 
			{
			if (session.isOnlyHover()) // HOVER
				{
				if(session.getHoveredBicluster()!=null && session.getHoveredBicluster().getGenes().size()==1  && !session.isTooManyGenes())
					v.setHoveredGene(session.getMicroarrayData().getGeneName(session.getHoveredBicluster().getGenes().get(0)));
				} 
			else // SELECTION
				{
				if (session.getSelectedBicluster() != null) 
					{
					if(!session.isTooManyGenes() && session.getSelectedGenesBicluster().size() <= session.getMicroarrayData().getNumSparseGenes())
						{
						md.sortColumns();
						v.setSelection(session.getSelectedBicluster());
						}
					else
						v.setUpdate(true);
					}
				else
					v.setSelection(null);
				
				}
			v.repaint();
			this.repaint();
			this.revalidate();
			}
		}

	public void updateConfig() {
		paleta[HeatmapDiagram2.selectionColor] = session.getSelectionColor();
		paleta[HeatmapDiagram2.hoverColor] = session.getHoverColor();

		scaleModeHeatMap = session.getScaleMode();

		int paletteTemp[] = ColorLib.getInterpolatedPalette(255,
				paleta[HeatmapDiagram2.lowColor].getRGB(),
				paleta[HeatmapDiagram2.zeroColor].getRGB());
		int paletteTemp2[] = ColorLib.getInterpolatedPalette(255,
				paleta[HeatmapDiagram2.zeroColor].getRGB(),
				paleta[HeatmapDiagram2.highColor].getRGB());
		palette = new int[paletteTemp.length + paletteTemp2.length];
		for (int i = 0; i < paletteTemp.length; i++)
			palette[i] = paletteTemp[i];
		for (int i = paletteTemp.length; i < palette.length; i++)
			palette[i] = paletteTemp2[i - paletteTemp.length];

		// en función del tipo de escala seleccionado se entrará por un camino u
		// otro
		if (session.getScaleMode() == Session.quantile) {
		} else {
		}

		//run();
		this.repaint();
		this.configurando = false;
	}


	/**
	 * Sets the expression level palette. About a hundred colors are enough for
	 * a nice palette
	 * 
	 * @param palette
	 *            the colors of the palette
	 */
	void setPalette(int[] palette) {
		this.palette = palette;
	}

	/**
	 * Pops up a configuration panel for heatmap visual properties
	 */
	public void configure() {
		if (!configurando) {
			configurando = true;
			JInternalFrame ventanaConfig = this.getVentanaConfig();

			// Obtenemos el gestor de eventos de configuracion
			ConfigurationMenuManager gestor = new ConfigurationMenuManager(
					this, ventanaConfig, paleta, muestraColor);

			JPanel panelColor = this.getPanelPaleta(paleta, textoLabel,
					muestraColor);
			JPanel panelParametros = new HeatmapParameterConfigurationPanel();
			this.setPanelParametros(panelParametros);
			
			panelEscala = new KeggParameterConfigurationPanel(session);
			this.setPanelEscala(panelEscala);
			JPanel panelBotones = this.getPanelBotones(gestor);

			// Configuramos la ventana de configuracion
			// this.initPanelConfig(panelColor, null, panelParametros,
			// panelBotones);
			this.initPanelConfig(panelColor, null, panelParametros,
					panelBotones, panelEscala);

			// Mostramos la ventana de configuracion
			ventanaConfig.setLocation(getPosition());
			ventanaConfig.setTitle(Translator.instance.configureLabels
					.getString("s1") + " " + this.getName());
			session.getDesktop().add(ventanaConfig);
			try {
				ventanaConfig.setSelected(true);
			} catch (PropertyVetoException e) {
				e.printStackTrace();
			}
			ventanaConfig.pack();
			ventanaConfig.setVisible(true);
		}
	}

	public int[] getPalette()
		{
		return palette;
		}
	/**
	 * Notifies the end of configuration
	 */
	public void endConfig(boolean ok) {
		if (!ok) {
			configurando = false;
			return;
		}
		session.setSelectionColor(paleta[HeatmapDiagram2.selectionColor]);
		session.setHoverColor(paleta[HeatmapDiagram2.hoverColor]);
		
		session.setAvgExpColor(paleta[HeatmapDiagram2.zeroColor]);
		session.setLowExpColor(paleta[HeatmapDiagram2.lowColor]);
		session.setHiExpColor(paleta[HeatmapDiagram2.highColor]);
		session.buildPalette();
		
			//TODO: scales....
		if(panelEscala!=null)
			session.setScaleMode(panelEscala.getScaleModeSelected());
		this.scaleModeHeatMap=session.getScaleMode();
		
		
		session.updateConfigExcept(this.getName());
		if(v!=null)
			{
			v.computeColors();
			v.repaint();
			this.repaint();
			this.revalidate();
			}
		this.configurando = false;
	}

	public void printFigure(File f, int type)
		{
		if(type==0)
			this.v.printImage(f, true);
		else
			this.v.printImage(f, false);
		}
}
