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
diffAnalysis2=function(mt, g1, nameG1="Group 1", g2, nameG2="Group 2", interestingNames=c(), pvalT=7, diffT=0.2, byRank=FALSE, numRank=50, BH.correct=TRUE, print=TRUE, return ="all")
{
	Difference <- rowMeans(mt[,g1, drop=FALSE])-rowMeans(mt[,g2, drop=FALSE])#Ratio of expression of good prognosis against bad prognosis
	Average <- rowMeans(mt[,union(g1,g2)])
		
	#Limma analysis
	library(limma)
	population.groups=factor(c(rep(nameG1, length(g1)),c(rep(nameG2, length(g2)))))
	design=model.matrix(~population.groups)
	fit=lmFit(mt[, union(g1,g2)], design)
	fit
	#proportion -	numeric value between 0 and 1, assumed proportion of genes which are differentially expressed (def 0.01)
	#stdev.coef.lim -	numeric vector of length 2, assumed lower and upper limits for the standard deviation of log2-fold-changes for differentially expressed genes (def. 0.1-4)
	fit.eBayes=eBayes(fit)
	#lodd <- -log10 (fit.eBayes$p.value[,2])
	lodd =  -log10(topTable(fit.eBayes, sort.by="none", number=dim(mt)[1])[,"adj.P.Val"])
	if(byRank==FALSE)
		{
		o1=which(abs(Difference)>diffT)
		oo2=which(lodd>pvalT)
		}
	else
		{
		o1 <- order(abs(Difference),decreasing=TRUE)[1:numRank]
		oo2 <- order(abs(fit.eBayes$t[,2]),decreasing=TRUE)[1:numRank]
		}
	
	oo <- union(o1,oo2)
	ii <- intersect(o1,oo2)
	if(print)
		{
		plot(Difference,lodd,cex=.25,
				xlim=range(Difference), #c(-2,3),
				ylim=range(lodd),xlab="Average (log) Fold-Change",
				ylab="LOD score - Negative log 10 of P-value")
		points(Difference[o1],lodd[o1],pch=18,col="blue",cex=1.5) 
		points(Difference[oo2],lodd[oo2],pch=1,col="red",cex=2,lwd=2) 
		points(Difference[interestingNames],lodd[interestingNames],pch=1,col="red",cex=2,lwd=2) 
		if(byRank==FALSE)
			{
			abline(h=pvalT,col="green")
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
		title(paste("Volcano plot: ", nameG1, "vs.", nameG2))
		text(Difference[ii], lodd[ii], labels=rownames(mt)[ii], cex=0.5, pos=3)
		if(length(interestingNames)>0)	text(Difference[interestingNames], lodd[interestingNames], labels=rownames(mt)[interestingNames], cex=0.5, pos=3, col="red")
		}
	if(return=="all")
		ii
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
# pvalT - now it is not a -log but a normal value (e.g. 0.05, 0.001, 0.000001, etc.). It is corrected by adjustMethod
# diffT - filter out genes with lower differential expression than diffT
# g - experimental factor values (for example: "0 min", "0 min", "60 min", "60 min", "180 min", "180 min")
# g1 - first group name (for example "0 min")
# g2 - second group name ("for example "180 min")
diffAnalysis=function(mt, g, g1, g2, pvalT=0.01, diffT=0, adjustMethod="BH", byRank=FALSE, numRank=50, return ="all")
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
		
		degs=as.numeric(rownames(tt))
		
		if(return=="all" || dim(tt)[1]==0) 
			degs
		else
		{
			if(return=="up")
			{
			degs[which(tt[,"logFC"]>0)]	
			}
			else
			{
			degs[which(tt[,"logFC"]<0)]	
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
# Returns a list of arrays with the DEGs on each of these comparisons
# TODO: Grep errors with expression symbols (e.g. "CD14+ mo" because of the +)
diffAnalysisEFall=function(m, ef, interestingNames=c(),
			pvalT=7, diffT=0.8, byRank=FALSE, numRank=50, return ="all")
	{
		conds=unique(ef)
		
		#1) perform differential expression analysis
		degs=lapply(conds, function(x)
					{
					g1=grep(paste("^",x,"$",sep=""),ef)
					lapply(conds[-which(conds==x)], function(y)
						{
						g2=grep(paste("^",y,"$",sep=""),ef)
						print(paste(x,"vs",y))
						print(g1)
						print(g2)
						rownames(m)[diffAnalysis(m, g=ef,g1=x, g2=y, pvalT=pvalT, diffT=diffT, return=return)]
						})
					})
			
	 #2) set names for each group
	names=lapply(conds, function(x)
			{
				lapply(conds[-which(conds==x)], function(y)
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
	

#Figure for PLOS
	rpls=c("YDR471W", "YKL006W", "YDR447C", "YHR021C", "YJL189W", "YDR500C", "YLR367W", "YLR061W", "YMR142C", "YPL143W", "YMR194W", "YGR148C", "YLR185W", "YLR344W", "YER131W", "YLR448W", "YOL127W", "YGL030W", "YDL130W", "YBR181C", "YGR214W", "YGL123W", "YER074W", "YIL069C", "YLR406C", "YLL045C", "YKL156W", "YDR497C", "YNL067W", "YBR084C-A", "YEL054C", "YER117W")
	rpss=c("YGL253W", "YNL096C", "YKL081W", "YPL079W", "YGR118W", "YER056C-A", "YER043C", "YGL031C", "YDL191W", "YLR167W", "YLR264W", "YPR102C", "YIL018W", "YMR116C", "YLR048W", "YGL135W", "YBR191W", "YJR094W-A", "YKL180W", "YJL136C", "YHR203C", "YMR121C", "YIL052C", "YDR418W", "YDR064W", "YDL082W", "YDL083C", "YPL220W", "YGL076C", "YGR034W", "YDL081C")
	mrps=c("YBR257W", "YBR251W", "YPL013C", "YAL033W", "YMR188C", "YNL306W", "YNL284C", "YKL142W", "YPR166C", "YBL018C", "YDR237W", "YJL096W", "YDL202W", "YPR100W", "YNL282W", "YMR225C", "YNL252C", "YMR158W", "YPR099C", "YML025C", "YNL185C", "YDR322W", "YKL138C", "YBL038W", "YLR145W", "YHL004W", "YBL090W", "YKR085C", "YKL003C", "YDR462W", "YKR103W", "YPL173W", "YMR024W", "YKR006C", "YDR116C", "YNR036C", "YDR347W", "YCR003W", "YKR104W", "YHR062C", "YNR022C", "YLR439W", "YMR193W", "YBR167C", "YLR107W", "YBR268W", "YLR059C", "YGR084C", "YFR049W", "YKL170W", "YDR337W", "YPL118W", "YMR286W", "YGR220C", "YKL169C", "YGR165W", "YGR219W", "YGR076C", "YNL221C", "YBR146W", "YJL063C", "YBR282W", "YKL167C", "YOR150W", "YML009C", "YDL045W-A", "YHR147C", "YLL015W", "YIR015W", "YNL177C", "YDR478W", "YDR405W", "YGR030C", "YLR312W-A", "YBR122C", "YNL005C")
	#fat=c("YJR016C", "YJR143C", "YPL256C", "YCR034W", "YGL055W")
	fat=c("YNR016C", "YKL182W", "YPL231W", "YCR034W", "YGL055W")
	fatRest=c()
	fatNames=c("ACC1", "FAS1", "FAS2", "FEN1", "OLE1")
	tt=topTable(fit2.eBayes, p.value=1, adjust=adjustMethod, lfc=0, number=dim(mt)[1])
	if(print)
	{
		postscript("/Users/rodri/Documents/bioviz/plos/figures/NonEnriched/fatty/R-Bicover/volcano.eps", horizontal=T, width=1024, height=1024, onefile=FALSE)
	#	pdf("/Users/rodri/Documents/bioviz/plos/figures/NonEnriched/fatty/R-Bicover/volcano.pdf")
		#png("/Users/rodri/Documents/bioviz/plos/figures/NonEnriched/fatty/R-Bicover/volcano.png")
		#tiff("/Users/rodri/Documents/bioviz/plos/figures/NonEnriched/fatty/R-Bicover/volcano.tiff")
		par(new=F)
		plot(tt[,"logFC"],-log10(tt[,"adj.P.Val"]),cex=.25, col="grey",
				xlim=range(tt[,"logFC"]),
				ylim=range(-log10(tt[,"adj.P.Val"])),xlab="Average (log) Fold-Change",
				ylab="LOD score - Negative log 10 of P-value")
		#points(Difference[o1],lodd[o1],pch=18,col="blue",cex=1.5) 
		#points(Difference[oo2],lodd[oo2],pch=1,col="red",cex=2,lwd=2) 
		#points(Difference[interestingNames],lodd[interestingNames],pch=1,col="red",cex=2,lwd=2) 
		rplsel=which(tt[,"ID"] %in% rpls)
		par(new=T)
		plot(tt[rplsel,"logFC"],-log10(tt[rplsel,"adj.P.Val"]),cex=.5, col="orange",
				xlim=range(tt[,"logFC"]),
				ylim=range(-log10(tt[,"adj.P.Val"])), xlab="", ylab="")
		rpssel=which(tt[,"ID"] %in% rpss)
		par(new=T)
		plot(tt[rpssel,"logFC"],-log10(tt[rpssel,"adj.P.Val"]),cex=.5, col="orange",
				xlim=range(tt[,"logFC"]),
				ylim=range(-log10(tt[,"adj.P.Val"])), xlab="", ylab="")
		mrpsel=which(tt[,"ID"] %in% mrps)
		par(new=T)
		plot(tt[mrpsel,"logFC"],-log10(tt[mrpsel,"adj.P.Val"]),cex=.5, col="purple",
				xlim=range(tt[,"logFC"]),
				ylim=range(-log10(tt[,"adj.P.Val"])), xlab="", ylab="")
		
		fatsel=which(tt[,"ID"] %in% fat)
		par(new=T)
		plot(tt[fatsel,"logFC"],-log10(tt[fatsel,"adj.P.Val"]),cex=.5, col="black",
				xlim=range(tt[,"logFC"]),
				ylim=range(-log10(tt[,"adj.P.Val"])), xlab="", ylab="")
		
		tt2=topTable(fit2.eBayes, p.value=0.001, adjust=adjustMethod, lfc=diffT, number=dim(mt)[1])
		abline(h=-log10(max(tt2[,"adj.P.Val"])),col="blue", lty=3)
		tt3=topTable(fit2.eBayes, p.value=0.01, adjust=adjustMethod, lfc=diffT, number=dim(mt)[1])
		abline(h=-log10(max(tt3[,"adj.P.Val"])),col="blue", lty=3)
		tt4=topTable(fit2.eBayes, p.value=0.05, adjust=adjustMethod, lfc=diffT, number=dim(mt)[1])
		abline(h=-log10(max(tt4[,"adj.P.Val"])),col="blue", lty=3)
		
		abline(v=1,col="red", lty=3)
		abline(v=-1,col="red", lty=3)
		abline(v=2,col="red", lty=3)
		abline(v=-2,col="red", lty=3)
		abline(v=3,col="red", lty=3)
		abline(v=-3,col="red", lty=3)
		
		title(paste("Volcano plot: 0' vs 180'"))
		
		#text(tt[fatsel, "logFC"], -log10(tt[fatsel,"adj.P.Val"]), labels=tt[fatsel, "ID"], cex=0.5, pos=3)
		#text(tt[fatsel, "logFC"], -log10(tt[fatsel,"adj.P.Val"]), labels=tt[which(tt[, "ID"] %in% fat),"ID"], cex=0.5, pos=3)
text(tt[fatsel, "logFC"], -log10(tt[fatsel,"adj.P.Val"]), labels=c("OLE1", "FAS2", "FEN1", "FAS1", "ACC1"), cex=0.7, pos=3)
	text(5, 3, labels=c("Cyt. ribosome genes of interest"), cex=0.8, pos=3, col="orange")
	text(3, 0, labels=c("Mit. ribosome genes"), cex=0.8, pos=3, col="purple")
#if(length(interestingNames)>0)	text(Difference[interestingNames], lodd[interestingNames], labels=rownames(mt)[interestingNames], cex=0.5, pos=3, col="red")
		dev.off()
		
	}

	g1="0 min"
	lfm=sapply(c("40 min", "60 min", "90 min", "120 min", "180 min"), function(g2)
		{
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
			tt=topTable(fit2.eBayes, p.value=1, adjust=adjustMethod, lfc=0, number=dim(mt)[1])
			tt[order(tt[,"ID"]),"logFC"]
		})
rownames(lfm)=sort(tt[,"ID"])
colnames(lfm)=rownames(unique(pData(ae)))
lfm[c("YNR016C", "YKL182W", "YPL231W", "YCR034W", "YGL055W"),]
esfc=new("ExpressionSet", exprs=lfm, annotation="ensembl_gene_id", phenoData=new("AnnotatedDataFrame", data=unique(pData(ae))[,-1]))
write(x=t(cbind(rownames(lfm),-lfm)), file="/Users/rodri/Documents/bioviz/matrices/E-MTAB-153-FC-limma.txt", ncolumns=6, sep="\t")

