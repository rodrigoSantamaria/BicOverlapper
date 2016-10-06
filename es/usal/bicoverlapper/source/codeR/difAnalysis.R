# Performs a differential analysis, returning the group of genes that are
# both among the ones with maximum differential expression and maximum pvalue
# It also draws the corresponding volcano plot
# mt -  expression matrix
# g1 - first group for the differential analysis (column numbers of mt)
# nameG1 - name of the first group to appear in the volcano plot
# g2 - second group for the differential analysis (column numbers of mt) - control group
# nameG2 - name of the second group, to appear in the volcano plot
# interestingNames - names of genes that the user want always to be highlighted on the plot

# pvalT - threshold for the negative log of p values (if you want the threshold in p-values of 10e-7 you must use 7). Default 7
#		  Note that p-value can be a tricky measure if the number of measured p-values is not taken into account.
#		  A p-value of 0.001 for 100 measures means 100*0.001=0.1 -> 10% of false positives
# diffT - threshold for the differential expression (absolute values)
# byRank - if true, the above thresholds are ignored and the threshold is set by the top numRank genes in differential expression and pvalue. Default false
# numRank - number of top genes to consider in order to set the thresholds if byRank is true. Default 50

# yliminf - line for the minimum level of pvalue, in log10 (a pvalue of 10e-7 should be marked as -7).
# yliminf - line for the maximum level of pvalue, in log10 (a pvalue of 10e-7 should be marked as -7).
# limsup - line for the maximum level of differential expression (default 0.2)
# liminf - line for the minimum level of differential expression (default -0.2)\
# BH.correct - if true, Benjamini and Hochberg's method to control the false discovery rate is applied to p-values. Default TRUE
#				(non-controlled p-values mean that, for 6000 genes, a p-value of 0.0001 gives us a % of false negatives of 6000*0.0001=0.6%
#				a BH corrected p-value of 0.0001 means a real probability of 0.0001% (or less) of being a false possitive.
# print - if TRUE, the volcano plot is drawn
# return - determines is all the DEGs are returned ("all") or only the up ("up") or down ("down") regulated. Default "all"
# 
# Returns the row numbers of the differentially expressed genes
#
# Author: Rodrigo Santamar’a rodri@usal.es
###############################################################################
diffAnalysis2=function(mt, g, g1="Group 1", g2, interestingNames=c(), pvalT=7, diffT=0.2, byRank=FALSE, numRank=50, adjustMethod="BH", BH.correct=TRUE, print=TRUE, return ="all", colorPoints="black", differentialHighlight=TRUE, significantHighlight=TRUE, namesHighlight=TRUE, lines=TRUE)
{
	Difference <- rowMeans(mt[,grep(g1, g), drop=FALSE])-rowMeans(mt[,grep(g2,g), drop=FALSE])#Ratio of expression of good prognosis against bad prognosis
	#Average <- rowMeans(mt[,union(g1,g2)])
		
	#Limma analysis
	require(limma)
	population.groups=factor(make.names(g))
	design=model.matrix(~0+population.groups)
	colnames(design)=levels(population.groups)
	fit=lmFit(mt, design)
	
	#trick to be able to use parameters as values for expression
	mycontrast=paste(make.names(g1),"-",make.names(g2), sep="")
	cmd <- paste("contrasts <- makeContrasts(", mycontrast, ", levels = design)", sep ='"')
	eval(parse(text = cmd))	
	
	fit2=contrasts.fit(fit, contrasts)
	fit2.eBayes=eBayes(fit2)
	
	
	lodd =  -log10(topTable(fit2.eBayes, sort.by="none", number=dim(mt)[1])[,"adj.P.Val"])
	names(lodd)=rownames(mt)
	if(byRank==FALSE)
		{
		tt=topTable(fit2.eBayes, p.value=pvalT, adjust=adjustMethod, lfc=diffT, number=dim(mt)[1])
		o1=which(abs(Difference)>diffT)
		oo2=which(lodd>-log10(pvalT))
		}
	else
		{
		o1 <- order(abs(Difference),decreasing=TRUE)[1:numRank]
		oo2 <- order(abs(fit2.eBayes$t[,2]),decreasing=TRUE)[1:numRank]
		tt=topTable(fit2.eBayes, adjust=adjustMethod, lfc=difft, number=numRank)
		}
	
	oo <- union(o1,oo2)
	ii <- intersect(o1,oo2)
	if(print)
		{
		plot(Difference,lodd,cex=.25,
				xlim=range(Difference), #c(-2,3),
				ylim=range(lodd),xlab="Average (log) Fold-Change",
				ylab="LOD score - Negative log 10 of P-value", col=colorPoints)
		if(differentialHighlight)	points(Difference[o1],lodd[o1],pch=18,col="blue",cex=1.5) 
		if(significantHighlight)	points(Difference[oo2],lodd[oo2],pch=1,col="red",cex=2,lwd=2) 
		points(Difference[interestingNames],lodd[interestingNames],pch=1,col="red",cex=2,lwd=2)
		if(lines)
			{
			if(byRank==FALSE)
				{
				abline(h=-log10(pvalT),col="green")
				abline(v=diffT,col="red")
				abline(v=-diffT,col="red")
				}
			else
				{
				print(paste("max o1",max(Difference[which(Difference[ii]<0)]), "min o1", min(Difference[which(Difference[ii]>0)]), "min oo2", min(lodd[ii])))
				abline(h=min(lodd[ii]),col="green")
				abline(v=max(Difference[intersect(ii, which(Difference<0))]),col="red")
				abline(v=min(Difference[intersect(ii, which(Difference>0))]),col="red")
				}
			}
		title(paste("Volcano plot: ", g1, "vs.", g2))
		if(namesHighlight)	text(Difference[ii], lodd[ii], labels=rownames(mt)[ii], cex=0.5, pos=3)
		if(length(interestingNames)>0)	text(Difference[interestingNames], lodd[interestingNames], labels=rownames(mt)[interestingNames], cex=0.5, pos=3, col="red")
		}
	if(return=="all")
		list(ids=ii, dif=Difference, pval=lodd)
	else
		{
		if(return=="up")
			{
			ii[which(Difference[ii]>0)]	
			}
		else
			{
			ii[which(Difference[ii]<0)]	
			}
		}	
	}

# Simplified version of diffAnalysis. No volcano plot print option. Limma without filtering columns out of g1 and g2.
# mt - numeric matrix
# pvalT - now it is not a -log but a normal value (e.g. 0.05, 0.001, 0.000001, etc.). It is corrected by adjustMethod
# diffT - filter out genes with lower differential expression than diffT
# g - experimental factor values (for example: "0 min", "0 min", "60 min", "60 min", "180 min", "180 min")
# g1 - first group name (for example "0 min")
# g2 - second group name ("for example "180 min")
diffAnalysis=function(mt, g, g1, g2, pvalT=0.01, diffT=0, adjustMethod="BH", byRank=FALSE, numRank=50, return ="all", retType="names")
	{
		#Limma analysis
		require(limma)
		population.groups=factor(make.names(g))
		design=model.matrix(~0+population.groups)
		colnames(design)=levels(population.groups)
		fit=lmFit(mt, design)
		
		#trick to be able to use parameters as values for expression
		mycontrast=paste(make.names(g1),"-",make.names(g2), sep="")
		cmd <- paste("contrasts <- makeContrasts(", mycontrast, ", levels = design)", sep ='"')
		eval(parse(text = cmd))	
		
		fit2=contrasts.fit(fit, contrasts)
		fit2.eBayes=eBayes(fit2)
		
		if(byRank==FALSE)
			tt=topTable(fit2.eBayes, p.value=pvalT, adjust=adjustMethod, lfc=diffT, number=dim(mt)[1])
		else
			tt=topTable(fit2.eBayes, adjust=adjustMethod, lfc=difft, number=numRank)
		
		if(length(grep("ID",colnames(tt)))>=1) #limma up to R 3.0 (numeric rownames)
			{
			degs=as.numeric(rownames(tt))
			if(return=="all" || dim(tt)[1]==0) 
				if(retType=="names")	degs
				else					tt
			else
				{
				if(return=="up")
					{
					if(retType=="names")	degs[which(tt[,"logFC"]>0)]
					else					tt[which(tt[,"logFC"]>0),]
					}
				else
					{
					if(retType=="names")	degs[which(tt[,"logFC"]<0)]	
					else					tt[which(tt[,"logFC"]<0),]
					}
				}		
			}
		else	#limma on R 3.0 (no ID column, text rownames)
			{
			if(return=="all" || dim(tt)[1]==0) 
				if(retType=="names")	which(rownames(mt) %in% rownames(tt))
				else					tt
			else
				{
				if(return=="up")
				   {
				   if(retType=="names")	which(rownames(mt) %in% rownames(tt[which(tt[,"logFC"]>0),]))
				   else					tt[which(tt[,"logFC"]>0),]
			       }
				else
				   {
				   if(retType=="names")	which(rownames(mt) %in% rownames(tt[which(tt[,"logFC"]<0),]))
				   else					tt[which(tt[,"logFC"]>0),]
			       }
				}
			}
	}
	
	
	
# Like above, but in this case several differential expression analyses are performed, 
# between a target experimental factor value (efv) and every efv in its experimental 
# factor (ef) except itself.
# ef - character array with the efv for each sample (column) in matrix m (e.g. healthy healthy cancer1 cancer1 cancer2 cancer2)
# efv - efv to check against the rest (e.g. cancer 1)
# Returns a list of arrays with the DEGs on each of these comparisons
# TODO: Grep errors with regular expression symbols (e.g. "CD14+ mo" because of the +)
diffAnalysisEF=function(m, ef, efv, interestingNames=c(),
		pvalT=0.01, diffT=0.2, byRank=FALSE, numRank=50, return ="all")
    {
	conds=unique(ef)
	conds=conds[-grep(paste("^",efv,"$",sep=""),conds)] #not to compare with itself
	
	degs=lapply(conds, function(y){
				print(paste(efv,"vs", y))
				#rownames(m)[diffAnalysis(m, g1=efv, g2=y, pvalT=pvalT, return=return)]
				rownames(m)[diffAnalysis(m, g=ef, g1=efv, g2=y, pvalT=pvalT, diffT=diffT, byRank=byRank, numRank=numRank, return=return)]
			})
	names=paste(efv, "vs", conds)
	
	#temp=list()
	#for(i in 1:length(degs))
	#	{
	#	temp=c(temp,list(degs[[i]]))
	#	}
	#degs=temp
	
	names(degs)=names
	degs
    }
	
	
# As above, but in this case every possible differential expression analysis is performed, 
# between every combination of efvs for a given ef
# ef - character array with the efv for each sample (column) in matrix m (e.g. healthy healthy cancer1 cancer1 cancer2 cancer2)
# retType - Returns a list of arrays with the DEGs on each of these comparisons ("names") or a table from limma with logFC, p-values, etc ("table")

# TODO: Grep errors with expression symbols (e.g. "CD14+ mo" because of the +)
diffAnalysisEFall=function(m, ef, interestingNames=c(),
			pvalT=7, diffT=0.8, byRank=FALSE, numRank=50, return ="all", retType="names")
	{
		conds=unique(ef)
		
		#1) perform differential expression analysis
		if(return!="all")
			degs=lapply(conds, function(x)
					{
					g1=grep(paste("^",x,"$",sep=""),ef)
					lapply(conds[-which(conds==x)], function(y)
						{
						g2=grep(paste("^",y,"$",sep=""),ef)
						print(paste(x,"vs",y))
						print(g1)
						print(g2)
						if(retType=="names")	rownames(m)[diffAnalysis(m, g=ef,g1=x, g2=y, pvalT=pvalT, diffT=diffT, return=return, retType=retType)]
						else					diffAnalysis(m, g=ef,g1=x, g2=y, pvalT=pvalT, diffT=diffT, return=return, retType=retType)
						})
					})
		else
			{
			degs=lapply(1:(length(conds)-1), function(xi)
				{
				x=conds[xi]
				lapply((xi+1):length(conds), function(yi)
						{
						y=conds[yi]
						print(paste(x,"vs",y))
						if(retType=="names")	rownames(m)[diffAnalysis(m, g=ef,g1=x, g2=y, pvalT=pvalT, diffT=diffT, return=return, retType=retType)]
						else					diffAnalysis(m, g=ef,g1=x, g2=y, pvalT=pvalT, diffT=diffT, return=return, retType=retType)
					})
				})
			}
			
	 #2) set names for each group
	if(return!="all")
		names=lapply(conds, function(x)
				{
				lapply(conds[-which(conds==x)], function(y)
						{
						paste(x,"vs",y)
						})
				})
	else
		{
		names=lapply(1:(length(conds)-1), function(xi)
				{
				x=conds[xi]
				lapply((xi+1):length(conds), function(yi)
						{
						y=conds[yi]
						paste(x,"vs",y)
						})
				})
		}
	#3) Unlist the second level of the list, give names, return
	dl=list()
	for(i in degs)
		{
			for(j in i)
			{
			if(retType=="names")	dl=c(dl,list(j))
			else					dl=c(dl,list(as.matrix(j)))
			}
		}
	ret=c()
	ret$names=unlist(names)
	ret$degs=dl
	ret	
	}


# As above, but in this case se select just a list of EFVs in which to do the combinations between 
# between every combination of efvs for a given ef
# ef - character array with the efv for each sample (column) in matrix m (e.g. healthy healthy cancer1 cancer1 cancer2 cancer2)
# efv1 - list with the efvs to compare against all the efvs on efv2 (e.g. c("healthy"))
# efv2 - list with the efvs to be compared against all the efvs on efv1 (e.g. c("cancer1", "cancer2"))
# Returns a list of arrays with the DEGs on each of these comparisons
# TODO: Grep errors with expression symbols (e.g. "CD14+ mo" because of the +)
diffAnalysisEFsel=function(m, ef, efv1=c(), efv2=c(), interestingNames=c(),
			pvalT=7, diffT=0.8, byRank=FALSE, numRank=50, return ="all")
	{
		conds1=unique(efv1)
		conds2=unique(efv2)
		
		#1) perform differential expression analysis
		degs=lapply(conds1, function(x)
				{
				conds2t=conds2
				if(length(grep(x,conds2))==1)
					conds2t=conds2t[-grep(x,conds2)]
				g1=grep(paste("^",x,"$",sep=""),ef)
				lapply(conds2t, function(y)
						{
							g2=grep(paste("^",y,"$",sep=""),ef)
							print(paste(x,"vs",y))
							print(g1)
							print(g2)
							rownames(m)[diffAnalysis(m, g=ef,g1=x, g2=y, pvalT=pvalT, diffT=diffT, return=return)]
						})
				})
		#2) set names for each group
		names=lapply(conds1, function(x)
				{
					lapply(conds2, function(y)
							{
								paste(x,"vs",y)
							})
				})
		#3) Unlist the second level of the list, give names, return
		dl=list()
		for(i in degs)
		{
			for(j in i)
			{
				dl=c(dl,list(j))
			}
		}
		ret=c()
		ret$names=unlist(names)
		ret$degs=dl
		ret	
	}
	
# As above, but in this case every possible differential expression analysis is performed, 
# between every combination of efvs for A LIST OF EFS
# ef - list of character arrays. Each character array corresponds to the efvs for a given ef, for each sample (column) in matrix m (e.g. healthy healthy cancer1 cancer1 cancer2 cancer2)
# efNames - list with the names of the Experimental Factors
# Returns a list where each element is a list of arrays, with the DEGs on each of these efs
diffAnalysisAll=function(m, ef=list(), efNames=c(),
			pvalT=7, diffT=0.8, byRank=FALSE, numRank=50, return ="all")
	{
	ret=lapply(ef, function(x){
		diffAnalysisEFall(m=m, ef=x, pvalT=pvalT, diffT=diffT, byRank=byRank, numRank=numRank, return=return)
		})
	names(ret)=efNames
	ret
	}