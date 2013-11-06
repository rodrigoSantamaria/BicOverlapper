# Enrichment tests via topGO (faster and more flexible than GOstats)
# 
# Author: rodri
###############################################################################

#Computes which should be the p-value threshold to obtain a given FDR (alpha)
fdr=function(pvals=NA, alpha=0.01, retThreshold=TRUE)
{
	sel=pvals[which(pvals < (alpha*order(pvals))/length(pvals))]
	if(length(sel)>0)	max(sel)
	else				NA
}

tal=function()
	{
	return("ola k ase")
	}

#Generates a topGOdata object ready to be used to compute enrichments
#With it created, it is faster to compute enrichments
createTopGO=function(onto="BP", universeGenes=NA, ns=5, lib=NA, map=NA)
	{
		if(is.na(lib) && is.na(map))
			return("Error: must provide a library or map for the GO-gene mappings")
		if(length(universeGenes)<=1)
			return("Error: must provide a universe of gene ids")
	#return("ola k ase")	
	require(topGO)
	selector=function(theScore){ return(theScore==1)}
	universe=rep(0, length(universeGenes))
	names(universe)=universeGenes
	
	if(!is.na(lib))
		{
		data=new("topGOdata", 					
				description = "Bioconductor session", ontology = onto,
				allGenes = universe, geneSel = selector,
				nodeSize = ns,
				annot = annFUN.db, affyLib=lib)
		data
		}
	else if(!is.na(map))
		{
		data=new("topGOdata", 					
				description = "Bioconductor session", ontology = onto,
				allGenes = universe, geneSel = selector,
				nodeSize = ns,
				annot = annFUN.gene2GO, gene2GO = map)
		data
		}
	}

#filter can be either classic, FDR (for false discovery rate) or BH (for Benjamini-Hochberg correction on classic)
#alpha is the thershold for the selected statistical filter
#onto can be either BP, MF or CC

#returns a table with the following columns:
#GO.ID
#Term
#Annotated
#Significant
#Expected
#classic p-val
#BH-corrected p-val
GOenrichment=function(alpha=0.01, filter="classic", sampleGOdata=NA, universeGenes=NA, selectedGenes=NA)
	{
	if(is.na(universeGenes) || is.na(selectedGenes))
		return("Error: universeGenes and selectedGenes should be provided")
	if(is.na(sampleGOdata))
		return("Error: a topGOdata is requires")
		
	require(topGO)
	
	#prepare selector an universe
	selector=function(theScore){ return(theScore==1)}
	
	universe=rep(0, length(universeGenes))
	names(universe)=universeGenes
	universe[which(names(universe) %in% selectedGenes)]=1
	
	sampleGOdata=updateGenes(sampleGOdata,universe, selector)
	
	test.stat <- new("classicCount", testStatistic = GOFisherTest, name = "Fisher test")
	resultFisher <- getSigGroups(sampleGOdata, test.stat)
	table=GenTable(sampleGOdata, classic = resultFisher, orderBy = "weight", ranksOf = "classic", topNodes = length(score(resultFisher)))
	table=cbind(table, classic.BH=as.numeric(table[,"classic"])*length(score(resultFisher)))
	if(filter=="classic")	table[which(table[,"classic"]<alpha),]
	else
		{
		if(filter=="BH")	table[which(table[,"classic.BH"]<alpha),]
		else
			{
			if(filter=="FDR")	
				{
				th=fdr(as.numeric(table[,"classic"]), alpha=alpha)
				if(!is.na(th))	
					{
					table[which(as.numeric(tt[,"classic"])<=th),]
					}
				else			NA
				}
			}
		}
	}

	#Usage example
	#library(GEOquery)
	#eset.geo=getGEO("GSE1000")[[1]]
	
	#source("/Users/rodri/Documents/workspace/BicOverlapper/es/usal/bicoverlapper/source/codeR/enrichment.R")
	#data=createTopGO(onto="BP", universeGenes=featureNames(eset.geo), ns=5, lib="hgu133plus2.db")
	#tab=GOenrichment(alpha=0.01, filter="classic", sampleGOdata=data, universeGenes=featureNames(eset.geo), selectedGenes=sample(featureNames(eset.geo), 50))
	
