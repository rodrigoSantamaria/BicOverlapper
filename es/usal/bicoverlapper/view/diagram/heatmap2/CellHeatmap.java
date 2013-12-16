package es.usal.bicoverlapper.view.diagram.heatmap2;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ScrollPaneConstants;

import net.sf.epsgraphics.ColorMode;
import net.sf.epsgraphics.EpsGraphics;

import org.w3c.dom.Document;
import org.w3c.dom.DOMImplementation;

import com.sun.tools.internal.ws.processor.generator.Names;

import ch.usi.inf.sape.hac.HierarchicalAgglomerativeClusterer;
import ch.usi.inf.sape.hac.agglomeration.AgglomerationMethod;
import ch.usi.inf.sape.hac.agglomeration.CentroidLinkage;
import ch.usi.inf.sape.hac.dendrogram.Dendrogram;
import ch.usi.inf.sape.hac.dendrogram.DendrogramBuilder;
import ch.usi.inf.sape.hac.dendrogram.DendrogramNode;
import ch.usi.inf.sape.hac.dendrogram.ObservationNode;
import ch.usi.inf.sape.hac.experiment.DissimilarityMeasure;

import es.usal.bicoverlapper.controller.analysis.AnalysisProgressMonitor;
import es.usal.bicoverlapper.controller.kernel.Selection;
import es.usal.bicoverlapper.controller.kernel.Session;
import es.usal.bicoverlapper.controller.manager.configurationManager.ConfigurationMenuManager;
import es.usal.bicoverlapper.controller.util.Translator;
import es.usal.bicoverlapper.model.microarray.ExpressionData;
import es.usal.bicoverlapper.view.configuration.panel.HeatmapParameterConfigurationPanel;
import es.usal.bicoverlapper.view.configuration.panel.KeggParameterConfigurationPanel;
import es.usal.bicoverlapper.view.diagram.overlapper.JProcessingPanel;


import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PGraphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.awt.image.BufferedImage;
import java.beans.PropertyVetoException;

/**
 * Class to display static, simple heatmaps for the genes in a given term.
 * It is invoked from VoronoiVisualization when a term is double clicked with Alt key down
 * TODO: make a previous hierarchical clustering on rows.
 * @author rodri
 *
 */
public class CellHeatmap extends JProcessingPanel
	{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4416622212260260249L;
	Selection cell=null;
	int margin=10;//margin at the sides of the Frame
	int marginRows=100;//space for gene names		//TODO: compute from gene names' max width
	int marginCols=100;//space for condition names	//TODO: compute from condition names' max width
	int numRows=-1;
	int numCols=-1;
	HeatmapDiagram2 vv=null;
	String hoveredGene=null;
	ArrayList<String> selectedGenes=new ArrayList<String>();//For the selection box
	LinkedList<Integer> selectedConditions=new LinkedList<Integer>();//For the selection box
	HashMap<String, ArrayList<Color>> colors=new HashMap<String, ArrayList<Color>>();
	
	PFont pfont;
	Font font;
	int size=12;//size of each expression level TODO: check if it becomes superlarge...
	private int maxItemsHeight;
	private int basicWidth;
	private ArrayList<Integer> order;
	private static int titleHeight=22;
	
	int nameType=1;
	private int scaleFactor=1;
	private double minExp;
	private double maxExp;
	private double avgExp;
	private double medianExp;
	private ExpressionSubset subset;
	public int width, height;
	private boolean update;
	private BufferedImage bi;
	private int cursorX0=-1;
	private int cursorY0=-1;
	private boolean externalHovering=false;
	private boolean configurando;
	private int hoveredCondition;
	private boolean printing=false;
	
	public Selection getSelection()
		{
		return cell;
		}
	public void setSelection(Selection c)
		{
		cell=c;
		if(cell==null || cell.getGenes()==null || cell.getGenes().size()==0)
			{
			this.setSize(vv.getWidth()-vv.sp.getVerticalScrollBar().getWidth(), vv.getHeight()-vv.sp.getHorizontalScrollBar().getHeight());
			this.setPreferredSize(new Dimension(vv.getWidth()-margin, vv.getHeight()-margin));
			width=vv.getWidth()-margin;
			height=vv.getHeight()-margin;
			
			updateSize();
			System.err.println("No single gene expression for this term, please choose another one");
			update=true;
			return;
			}
		numRows=cell.getGenes().size();
		
		marginRows=100*scaleFactor;
	//	for(Integer i:cell.getGenes())
	//		{
	//		String g=vv.md.getGeneName(i);
	//		marginRows=Math.max((int)textWidth(g),marginRows);
	//		}
			
		basicWidth=width=marginRows+margin*2+size*numCols;
		this.height=marginCols+margin*2+size*numRows;
		int screenHeight=(Toolkit.getDefaultToolkit().getScreenSize().height-60)*scaleFactor;
		
		maxItemsHeight=(int)Math.floor((screenHeight-marginCols-margin*2-(double)titleHeight)/size)-2;
		
		if(height>screenHeight-titleHeight)
			{
			height=marginCols+margin*2+size*maxItemsHeight;
					
			int numItems=numRows;
			while(numItems>maxItemsHeight)
				{
				width+=basicWidth;
				numItems-=maxItemsHeight;
				}
			
			if(width>Toolkit.getDefaultToolkit().getScreenSize().width)
				{
				computeOrder();
				computeColors();
				update=true;
				updateSize();
				
				return;
				}
			}
		
		computeOrder();
		computeColors();
		
		updateSize();
		update=true;
		}
	
	private void updateSize()
		{
		this.setSize(width, height);
		this.setPreferredSize(new Dimension(width, height));
		
		if(this.width>vv.sp.getWidth() && vv.sp.getWidth()>0)	vv.sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		else							vv.sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		if(this.height>vv.sp.getHeight() && vv.sp.getHeight()>0)	vv.sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		else								vv.sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		}
	
	public void computeColors()
		{
		colors.clear();
		
	
		for(int i=0;i<this.cell.getGenes().size();i++)
			{
			String gene;
			ArrayList<String> names=vv.md.getGeneNames(cell.getGenes());
			
			if(order!=null)	
				{
				if(order.get(i)<0 || order.get(i)>names.size())
					System.out.println("here error");
				gene=names.get(order.get(i));
				}
			else			gene=names.get(i);
			
			ArrayList<Color> geneCols=new ArrayList<Color>();
			for(int j=0;j<numCols;j++)
				{
				this.setScale(vv.session.getMicroarrayData(), j);
				geneCols.add(this.getColor(this.vv.session.getMicroarrayData().getExpressionAt(this.vv.session.getMicroarrayData().getGeneId(gene), j),j));
				}
			colors.put(gene, geneCols);
			}
		}
	
	public CellHeatmap(Selection c, HeatmapDiagram2 v)
		{
		super();
		setup();
		pfont=loadFont("es/usal/bicoverlapper/utils/font/AppleSymbols-14.vlw");
		vv=v;
		numCols=vv.md.getNumConditions();
		scaleFactor=1;
		this.setSize(v.getWidth(), v.getHeight());
		setSelection(c);
		
		avgExp=vv.session.getMicroarrayData().average;
		minExp=vv.session.getMicroarrayData().min;
		maxExp=vv.session.getMicroarrayData().max;
		computeOrder();
		}
	
	public CellHeatmap(HeatmapDiagram2 v)
		{
		super();
		setup();
		pfont=loadFont("es/usal/bicoverlapper/utils/font/AppleSymbols-14.vlw");
		vv=v;
		numCols=vv.md.getNumConditions();
		scaleFactor=1;
		computeOrder();
		}
	
	public void setup()
		{
		//smooth();
		this.noLoop();
		}

	/* This method is not considering which side is better to add first in the 
	 * conext of other branches, it always goes first for left, then for right*/
	public void retrieveOrder(ArrayList<Integer> order, DendrogramNode dn)
		{
		if(dn.getLeft().getClass().toString().contains("ObservationNode"))
			order.add(((ObservationNode)dn.getLeft()).getObservation());
		else
			retrieveOrder(order, dn.getLeft());
		
		if(dn.getRight().getClass().toString().contains("ObservationNode"))
			order.add(((ObservationNode)dn.getRight()).getObservation());
		else
			retrieveOrder(order, dn.getRight());
		}
	
	public void sortDendrogram(DendrogramNode dn)
		{
		if(dn.getClass().toString().contains("ObservationNode"))	
			return;
		//If both are leaf nodes, nothing to do
		if(dn.getLeft().getClass().toString().contains("ObservationNode") && dn.getRight().getClass().toString().contains("ObservationNode"))
			return;
		else
			{
			
			//Check order of the two left branches depending on the right node
			if(!dn.getLeft().getClass().toString().contains("ObervationNode"))
				{
				if(dn.getLeft().getLeft()!=null && dn.getLeft().getRight()!=null)
					{
					ArrayList<Float> rp=getAverageProfile(dn.getRight());
					ArrayList<Float> llp=getAverageProfile(dn.getLeft().getLeft());
					ArrayList<Float> lrp=getAverageProfile(dn.getLeft().getRight());
					double dll=subset.computeDissimilarity(rp, llp);
					double dlr=subset.computeDissimilarity(rp, lrp);
					if(dll<dlr)	//switch the branches
						{
						DendrogramNode temp=dn.getLeft().getRight();
						dn.getLeft().setRight(dn.getLeft().getLeft());
						dn.getLeft().setLeft(temp);
						}
					sortDendrogram(dn.getLeft());
					if(!dn.getRight().getClass().toString().contains("ObervationNode"))
						sortDendrogram(dn.getRight());
					}
				}
			//Check order of the two right branches depending on left node
			else
				{
				ArrayList<Float> lp=getAverageProfile(dn.getLeft());
				ArrayList<Float> rlp=getAverageProfile(dn.getRight().getLeft());
				ArrayList<Float> rrp=getAverageProfile(dn.getRight().getRight());
				double drl=subset.computeDissimilarity(lp, rlp);
				double drr=subset.computeDissimilarity(lp, rrp);
				if(drr<drl)	//switch the branches
					{
					DendrogramNode temp=dn.getRight().getLeft();
					dn.getRight().setLeft(dn.getRight().getRight());
					dn.getRight().setRight(temp);
					}
				sortDendrogram(dn.getRight());
				}
			}
		}

	public ArrayList<Float> getAverageProfile(DendrogramNode dn)
		{
		String[] names=vv.session.getMicroarrayData().getGeneNamesArray(cell.getGenes());
		
		if(dn.getClass().toString().contains("ObservationNode"))
			return vv.session.getMicroarrayData().getExpressionProfileArray(vv.session.getMicroarrayData().getGeneId(names[((ObservationNode)dn).getObservation()]));
		else
			{
			ArrayList<Float> lp=getAverageProfile(dn.getRight());
			ArrayList<Float> rp=getAverageProfile(dn.getLeft());
			ArrayList<Float> ap=new ArrayList<Float>();
			for(int i=0;i<lp.size();i++)
				ap.add((float)((lp.get(i)+rp.get(i))/2.0));
			return ap;
			}
		}
		
	
	public synchronized void computeOrder()
		{
		if(cell==null)	return;
		String[] names=this.vv.md.getGeneNames(cell.getGenes()).toArray(new String[0]);
		order=new ArrayList<Integer>();
		
		if(names.length>1)
			{
			subset= new ExpressionSubset(vv.md.getExpressionProfileMap(cell.getGenes()), names);
			DissimilarityMeasure dissimilarityMeasure = (DissimilarityMeasure)subset;
			AgglomerationMethod agglomerationMethod = new CentroidLinkage();
			//AgglomerationMethod agglomerationMethod = new WeightedAverageLinkage();
			//AgglomerationMethod agglomerationMethod = new CompleteLinkage();
			DendrogramBuilder dendrogramBuilder = new DendrogramBuilder(subset.getNumberOfObservations());
			HierarchicalAgglomerativeClusterer clusterer = new HierarchicalAgglomerativeClusterer(subset, dissimilarityMeasure, agglomerationMethod);
			clusterer.cluster(dendrogramBuilder);
			Dendrogram dendrogram = dendrogramBuilder.getDendrogram();
			
			//dendrogram.dump();
			
			DendrogramNode dn=dendrogram.getRoot();
			sortDendrogram(dn);
			retrieveOrder(order, dn);
			}
		else
			{
			order.add(0);
			}
		}
	
	
	public void mouseMoved() 
		{
		update=true;
		repaint();
		}
	public void mouseReleased()
		{
		cursorX0=cursorY0=-1;
		if(mouseButton>MouseEvent.BUTTON1)
			{
			vv.configure();
			repaint();
			return;
			}
		
		if(!selectedGenes.isEmpty())
			{
			LinkedList<Integer> conditions=new LinkedList<Integer>();
			for (int j = 0; j < vv.session.getMicroarrayData().getNumConditions(); j++)
				conditions.add(Integer.valueOf(j));
			LinkedList<Integer> genes=new LinkedList<Integer>();
			for(String g:selectedGenes)	genes.add(vv.session.getMicroarrayData().getGeneId(g));
			
			selectedGenes.clear();
			vv.session.setSelectionAndUpdate(new Selection(genes, conditions), null);
			return;
			}
		else if(!selectedConditions.isEmpty())
			{
			LinkedList<Integer> conditions=new LinkedList<Integer>();
			for (int j = 0; j < selectedConditions.size(); j++)
				conditions.add(selectedConditions.get(j));
			LinkedList<Integer> genes=new LinkedList<Integer>();
			for (int j = 0; j < cell.getGenes().size(); j++)
				genes.add(cell.getGenes().get(j));
			
			vv.session.setSelectionAndUpdate(new Selection(genes, conditions), null);
			selectedGenes.clear();
			selectedConditions.clear();
			return;
			}
		
		if(hoveredGene!=null && keyPressed==true && keyCode==18) //alt+click: Search on NCBI
			{
			vv.session.getMicroarrayData().browseEntrezGene(vv.session.getMicroarrayData().getGeneId(hoveredGene));
			}
		else if(hoveredGene!=null && keyPressed==true && keyCode==17)//alt+ctrl: get similar profiles
			{
			vv.session.getMicroarrayData().getSimilarPatterns(vv.session.getMicroarrayData().getGeneId(hoveredGene));
			}
		else if(mouseClicks==1 && hoveredGene!=null)	//Select single gene
			{
			LinkedList<Integer> genes=new LinkedList<Integer>();
			LinkedList<Integer> conditions=new LinkedList<Integer>();
			genes.add(vv.session.getMicroarrayData().getGeneId(hoveredGene));
			for (int j = 0; j < vv.session.getMicroarrayData().getNumConditions(); j++)
				conditions.add(Integer.valueOf(j));
			vv.session.setSelectionAndUpdate(new Selection(genes, conditions), null);
			repaint();
			}
		else if(mouseClicks==1 && hoveredCondition!=-1)
			{
			LinkedList<Integer> conditions=new LinkedList<Integer>();
			conditions.add(hoveredCondition);
			LinkedList<Integer> genes=new LinkedList<Integer>();
			for (int j = 0; j < cell.getGenes().size(); j++)
				genes.add(cell.getGenes().get(j));
			
			vv.session.setSelectionAndUpdate(new Selection(genes, conditions), null);
			repaint();
			}
		
		update=true;
		}
	
		
	public synchronized void paintComponent(Graphics g) {
		{
		if(!update)	
				{
				gr=(Graphics2D)g;
				fill(vv.session.getBackgroundColor());
				noStroke();
				rect(1,1,width*10,height*10);
				gr.drawImage(bi, 0, 0, this);
				return;
				}
		
			
		bi=(BufferedImage) createImage(this.width, this.height);
		gr=bi.createGraphics();
		RenderingHints qualityHints = new RenderingHints(null);
		qualityHints.put(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		//qualityHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_SPEED);
		qualityHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		gr.setRenderingHints(qualityHints);
		
		fill(vv.session.getBackgroundColor());
		noStroke();
		textFont(pfont);
		rect(1,1,width*10,height*10);
		
		if(vv.session.isTooManyGenes() || (vv.session!=null && vv.session.getSelectedBicluster()!=null && vv.session.getSelectedGenesBicluster().size()>vv.md.getNumSparseGenes()))
			{
			fill(vv.session.getForegroundColor());
			textAlign(LEFT);
			text("Too many selected genes, please select up to "+vv.md.getNumSparseGenes()+" genes",marginRows, margin+marginCols);
			
			endPaint(g);
			return;
			}
		else if(cell==null || cell.getGenes()==null || cell.getGenes().size()==0)
			{
			fill(vv.session.getForegroundColor());
			textAlign(LEFT);
			text("No selection, please select some genes",marginRows, margin+marginCols);
			endPaint(g);
			return;
			}
		noFill();
		
		
		//----------drawHeatmap
		stroke(vv.session.getForegroundColor());
		
		ArrayList<String> names=vv.md.getGeneNames(cell.getGenes());
		int cont=0;
		int xDisplacement=0;
		int[]	columnOrder=getColumnOrder();
		
		if(order==null || order.size()!=names.size())	
			{
			System.err.println("Order different from number of genes");
			return;
			}
		if(!externalHovering)	hoveredGene=null;
		
		//long t0=System.currentTimeMillis();

		while(cont<names.size())
			{
			if(cont % maxItemsHeight==0)
				{
				if(cont>0)	xDisplacement+=basicWidth;
				
				//------------------------------------------------draw column labels
				fill(5);
				textAlign(LEFT, CENTER);
				for(int i=0;i<this.numCols;i++)
					{
					if(mouseX>(margin+marginRows+xDisplacement+i*size) && mouseX<(margin+marginRows+xDisplacement+(i+1)*size))
						{
						fill(vv.session.getHoverColor());
						hoveredCondition=columnOrder[i];
						}
					else
						fill(vv.session.getForegroundColor());
					
					synchronized(this)
						{
						pushMatrix();
						translate((float)(margin+marginRows+xDisplacement+(i+0.5)*size), marginCols);
						rotate((float)(1.5*PI));
						text(vv.md.columnLabels[columnOrder[i]],0, 0);
					//	text(vv.md.columnLabels[i],0, 0);
						popMatrix();
						
						if(cursorY0!=-1)
							{
							Rectangle2D.Double selRect=new Rectangle2D.Double(cursorX0,cursorY0, mouseX-cursorX0,mouseY-cursorY0);
							
							//if(selRect.intersects(margin+marginRows+xDisplacement+(i+0.5)*size, 0, 1.5*size, marginCols))
							if(selRect.intersects(margin+marginRows+xDisplacement+i*size, 0, size, marginCols))
									if(!selectedConditions.contains(columnOrder[i]))
									selectedConditions.add(columnOrder[i]);
							}
						
						}
					}
				}
			
			//System.out.println("column labels: "+(System.currentTimeMillis()-t0));
			//t0=System.currentTimeMillis();
			
			textAlign(RIGHT, CENTER);
			
			//-----------------------------------draw gene labels and expression levels
			int i=0;
			for(i=0;i<Math.min(names.size(), maxItemsHeight) && i+cont<names.size();i++)//for each gene
				{
				String gene=null;
			
				if(order!=null)	gene=names.get(order.get(i+cont));
				else			gene=names.get(i+cont);
				//System.out.println("get gene name: "+(System.currentTimeMillis()-t0));
				//t0=System.currentTimeMillis();
				
				if(cursorX0!=-1)
					{
					Rectangle2D.Double selRect=new Rectangle2D.Double(cursorX0,cursorY0, mouseX-cursorX0,mouseY-cursorY0);
					if(selRect.intersects(xDisplacement, margin+marginCols+(i)*size, basicWidth, size))
						{
						fill(vv.session.getSelectionColor());
						if(!selectedGenes.contains(gene))
							selectedGenes.add(gene);
						}
					else
						{
						if(selectedGenes.contains(gene))	selectedGenes.remove(gene);
						fill(vv.session.getForegroundColor());
						}
					
					}
				else 
					{
					if(!externalHovering)
						{
						if(mouseY>(margin+marginCols+(i)*size) && mouseY<(margin+marginCols+(i+1)*size) && mouseX>xDisplacement && mouseX<xDisplacement+basicWidth)
							{
							fill(vv.session.getHoverColor());
							hoveredGene=gene;
							}
						else
							fill(vv.session.getForegroundColor());
						}
					else
						{
						if(hoveredGene!=null && hoveredGene.equals(gene))
							fill(vv.session.getHoverColor());
						else
							fill(vv.session.getForegroundColor());
						}
					}
				
				String geneLabel=vv.session.getMicroarrayData().rowLabels[vv.session.getMicroarrayData().getGeneId(gene)];
				if(geneLabel==null)	geneLabel=gene;
				text(geneLabel.substring(geneLabel.indexOf(":")+1),marginRows+xDisplacement, (float)(margin+marginCols+(i+0.5)*size));
				//System.out.println("draw gene text: "+(System.currentTimeMillis()-t0));
				//t0=System.currentTimeMillis();

				for(int j=0;j<numCols;j++)
					{
					//this.setScale(vv.session.getMicroarrayData(), j);
					//Color co=this.getColor(this.vv.session.getMicroarrayData().getExpressionAt(this.vv.session.getMicroarrayData().getGeneId(gene), columnOrder[j]));
					Color co=colors.get(gene).get(columnOrder[j]);
					
					fill(co.getRed(), co.getGreen(), co.getBlue());
					
					float xcell=(float)(margin+marginRows+xDisplacement+j*size);
					float ycell=(float)(margin+marginCols+i*size);
					
					rect(xcell,ycell, size,size);
					}//for each col
				
				//System.out.println("draw gene color: "+(System.currentTimeMillis()-t0));
				//t0=System.currentTimeMillis();

				}//for each gene
			if(i==0)
				{System.out.println("infinite loop!");i++;}
			cont+=i;
			
			
			}
		
		//System.out.println("gene labels and expression: "+(System.currentTimeMillis()-t0));
		//t0=System.currentTimeMillis();
		
		
		
		//--------------------------------------- Draw selection box
		if(cursorX0!=-1)
			{
			strokeWeight(2);
			noFill();
			stroke(vv.session.getSelectionColor());
			rect(cursorX0,cursorY0, mouseX-cursorX0,mouseY-cursorY0);
			}
		else
			{
			//--------------------------------- Draw hovered cell
			cont=0;
			xDisplacement=0;
			while(cont<names.size())
				{
				if(cont % maxItemsHeight==0)
					if(cont>0)	xDisplacement+=basicWidth;
			
				int i=0;
				for(i=0;i<Math.min(names.size(), maxItemsHeight) && i+cont<names.size();i++)//for each gene
					{
					noFill();
					
					stroke(vv.session.getHoverColor());
					if(externalHovering)
						{
						String gene=null;
						
						if(order!=null)	gene=names.get(order.get(i+cont));
						else			gene=names.get(i+cont);
						if(hoveredGene!=null && hoveredGene.equals(gene))
							{
							strokeWeight(3);
							float xcell=(float)(margin+marginRows+xDisplacement);
							float ycell=(float)(margin+marginCols+i*size);
							rect(xcell,ycell, size*numCols,size);
							strokeWeight(1);
							cont=numRows;
							break;
							}
						}
					else
						{
						for(int j=0;j<numCols;j++)
							{
							float xcell=(float)(margin+marginRows+xDisplacement+j*size);
							float xend=(float)(margin+marginRows+xDisplacement-basicWidth+j*size);
							float ycell=(float)(margin+marginCols+i*size);
							if(j==0 && (mouseY>ycell && mouseY<ycell+size) && mouseX<xcell && mouseX>xend)	//gene hovering
								{
								strokeWeight(3);
								rect(xcell,ycell, size*numCols,size);
								strokeWeight(1);
								cont=numRows;
								
								LinkedList<Integer> genes=new LinkedList<Integer>();
								genes.add(vv.session.getMicroarrayData().getGeneId(hoveredGene));
								LinkedList<Integer> conditions=new LinkedList<Integer>();
								vv.session.setHoveredBicluster(new Selection(genes,conditions), "eatmap");
								
								break;
								}
							if(i==0 && (mouseX>xcell && mouseX<xcell+size) && mouseY<ycell)//condition hovering
								{
								strokeWeight(3);
								rect(xcell,ycell, size,size*Math.min(maxItemsHeight, numRows-cont));
								strokeWeight(1);
								cont=numRows;
								break;
								}
							if((mouseX>xcell && mouseX<xcell+size) && (mouseY>ycell && mouseY<ycell+size))//expression hovering
								{	
								strokeWeight(3);
								rect(xcell,ycell, size,size);
								strokeWeight(1);
								cont=numRows;
								break;
								}
							}
						}
					}
				cont+=i;
				}
			}
			
	//	System.out.println("hovered: "+(System.currentTimeMillis()-t0));
	//	t0=System.currentTimeMillis();

		
		endPaint(g);
		return;
		}
		}

	public void endPaint(Graphics g)
		{
		gr=(Graphics2D)g;
		fill(vv.session.getBackgroundColor());
		noStroke();
		rect(1,1,width*10,height*10);
		gr.drawImage(bi, 0, 0, this);
		
		update=false;
		externalHovering=false;
		}
	
	public Color getColor(double ex)
		{/*
		int h=0;
		if(ex>avgExp)
			{
			h=(int)Math.round(255-((ex-avgExp)/(maxExp-avgExp)*255));
			return new Color(255,h,h);
			
			}
		else
			{
			h=(int)Math.round(255-(Math.abs(ex-avgExp)/Math.abs(minExp-avgExp))*255);
			return new Color(h,h,255);
			}
		return new Color(vv.getPalette()[(int)((ex-avgExp)/((maxExp-avgExp))*l)]);*/
		
		int l=vv.getPalette().length-1;
		return new Color(vv.getPalette()[(int)((ex-minExp)/((maxExp-minExp))*l)]);
		}
	
	
	public void setHoveredGene(String gene)
		{
		this.hoveredGene=gene;
		externalHovering=true;
		update=true;
		}
	
	public int[] getColumnOrder()
		{
		if(vv!=null && vv.session!=null && vv.session.getSelectedConditionsBicluster()!=null)
			{
			LinkedList<Integer> sc=vv.session.getSelectedConditionsBicluster();
			if(sc==null || sc.size()==0)// || sc.size()==this.numCols)
				return vv.session.getMicroarrayData().getColumnOrder();
			else
				{
				int [] co=new int[numCols];
				int i=0;
				for(int c:sc)	co[i++]=c;
				int[] oco=vv.session.getMicroarrayData().getColumnOrder();
				for(int j=0;j<numCols;j++)
					if(!sc.contains(oco[j]))	co[i++]=j;
				return co;
				}
			}
		else
			{
			int [] co=new int[numCols];
			for(int i=0;i<numCols;i++)	co[i]=i;
			return co;
			}
		}
/**
 * Returns the color for the given expression array, corresponding to the given column
 * @param exs
 * @param col
 * @return
 */
public Color getColor(double ex, int col)
	{
	setScale(vv.md, col);
	int h=-1;
	int size=vv.session.getExpPalette().length-1;
	
	Color c=null;
	if(vv.scaleModeHeatMap==Session.numerical)	//raw coloring
		h=(int)Math.round(((ex-minExp)/(maxExp-minExp)*size));
	else										//quantile
		{
		int q=vv.md.getQuantile((float)ex);
		h=(int)Math.round(((q)/(100.0)*size));
		}
	c=new Color(vv.session.getExpPalette()[h]);
	return c;
	}

public Color getColor(ArrayList<Float> exs, int col)
	{
	if(exs==null)	return null;
	return getColor(exs.get(col), col);
	}

	public void setScale(ExpressionData md, int col)
		{
		minExp=vv.md.minCols[col];
		maxExp=md.maxCols[col];
		avgExp=md.averageCols[col];
		medianExp=md.medianCols[col];
		}
public void keyPressed(){}
public void mouseDragged()
	{
	update=true;
	repaint();
	}
public void mouseExited(){}
public void mousePressed()
	{
	cursorX0=mouseX;
	cursorY0=mouseY;
	}
public void setUpdate(boolean b) {
	update=true;
	}

public void scaleUp(int s)
	{
	scaleFactor=s;
	size*=scaleFactor;
	margin*=scaleFactor;
	marginCols*=scaleFactor;
	setSelection(cell);
	pfont=loadFont("es/usal/bicoverlapper/utils/font/AppleSymbols-28.vlw");//TODO: proportional label sizes 
	}

public void scaleDown(int s)
	{
	size/=s;
    margin/=s;
	marginCols/=s;
	pfont=loadFont("es/usal/bicoverlapper/utils/font/AppleSymbols-14.vlw");
	scaleFactor/=s;
    setSelection(cell);
    }

public void printImage(File f, boolean png)
	{
	try {
		scaleUp(2);
		update=true;
		if(png)	//for PNG
			{
		        BufferedImage bim= new BufferedImage(this.width, this.height, BufferedImage.TYPE_INT_RGB);
		        paintComponent(bim.getGraphics());
	            ImageIO.write(bim, "png", new File(f.getAbsolutePath()));
	    	}
		else 
			{//for EPS
				Graphics2D eps=new EpsGraphics(f.getName(),new FileOutputStream(f),0,0,this.width,this.height, ColorMode.COLOR_RGB);
			    paintComponent(eps);
			}
		scaleDown(2);
		}catch(Exception e){e.printStackTrace(); return;}
			
	}
}


