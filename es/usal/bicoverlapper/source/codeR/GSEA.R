getGSMatrix=function(gnames=NA, envir=NA, type="GO")
{
	gs0=getGeneSet(gnames,envir)
	if(type=="GO") 
		gs0=gs0[grep("^GO:", rownames(gs0)),]
		#gs0=lapply(gs0, function(x) { x[grep("^GO:", x)]}) #using lists
	gs0
}

#Light version of GSEA that acts upon an already filtered ExpressionSet (eset) and the 
# genes x geneSets matrix geneSets, where geneSets(i,j)=1 if gene i belongs to geneSet j,
# 0 otherwise
gseaLite=function(eset=NA, geneSets=NA, model=NA, sdThreshold=2.0, type="GO")
{
	require(GSEAlm)
	lmPhen=lmPerGene(eset, model)
	lmPhenRes=getResidPerGene(lmPhen)
	
	#Returns a matrix of genesignature x sample, M, where Mij is the sum of all the ttest residues for sample j of genes in the gene set i (divided by the sqrt of the gene set size)
	enrichedGS=GSNormalize(exprs(lmPhenRes), geneSets, removeShift=TRUE)
	sdMean=mean(sd(enrichedGS))
	me=mean(enrichedGS)
	
	#3) Write enrichedGS to BicOverlapper format
	if(dim(enrichedGS)[1]==0)
		return("Error: no enriched sets found.")
	
	lr=apply(geneSets,1,function(x){names(which(x==1))})#Returns all the genes in the filtered expression set related to each enriched term
	
	####
	#VIA enrichedGS difference
	dif=rowMeans(enrichedGS[,which(eset$targetPhenotype %in% "class1")])-rowMeans(enrichedGS[,which(eset$targetPhenotype %in% "class2")])
	selNames=names(dif[which(abs(dif)>mean(dif)+sdThreshold*sd(dif))])
	elr=lr[which(names(lr) %in% selNames)] 
	
	if(length(elr)==0)
		return("Error: no enriched sets found.")
	if(type=="PATH")
		names(elr)=unlist(mget(selNames, KEGGPATHID2NAME, ifnotfound=NA))
	else
	{
		if(type=="GO")
		{
			terms=unlist(mget(selNames, GOTERM, ifnotfound=NA))
			elr=elr[which(!is.na(terms))]
			terms=terms[which(!is.na(terms))]
			names(elr)=sapply(terms, function(x){x@Term})
			elr=elr[which(!names(elr) %in% c("molecular_function", "biological_process", "cellular_component"))] #remove these uninformative terms
		}
	}
	elr
}


# This method take a filtered ExpressionSet (for example, from gseaI) and an
#lmPhen list and extracts the most enriched gene sets, storing them into a file
#Êeset         - ExpressionSet to analyze via GSEA
# filterCutoff - this percentage of lowest differentially expressed genes will be filter out from eset for the GSEA
# minGenesInGS - the minimum number of genes in the highest diffexp genes in the ExpressionSet that must
#			   - must be into a GeneSet in orde to consider it for GSEA
# ouputPath    - path to the file where the groups should be stored
# ef           - experimental factor from the eset to use for the GSEA, given as an array of strings (e.g c("0 min", "0 min", ..., "180 min", 180 min"))
#Êefv1		   - value for one of the experimental factors to check (e.g. "0 min")
#Êefv2		   - value for one of the experimental factors to check (e.g. "180 min")
# model		   - model to fit with in GSEAlm, typically the experimental factor (e.g. ~as.factor(FactorValue.Time) if eset has an EF called FactorValue.Time)
# type         - string specifying the genesets that are being tested. By now, only "GO" or "PATH" are available. Note that envir must
#	             refer to the corresponding environment in the ExpressionSet annotation platform
# sdThreshold  - only the gene sets with an absolute difference in enrichment between the classes compared (see gseaI) above the mean plus 
#				 sdThreshold times the average standard deviation of that differences for the whole set of gene sets will be returned
# envir        - environment from which to get the gene sets (e.g. org.Sc.sgdPATH for saccaromyces cerevisiae on KEGG pathways)
#                NOTE that the corresponding annotation package(e.g. org.Sc.sgd.db) should be loaded previously to call this method
#				 NOTE that also the corresponding gene set package (e.g. KEGG.db) should be installed previously to call this method
# gs0          - matrix A of N genes x M gene sets where Aij is 1 if gene i belongs to gene set j
gsea=function(eset=NA, filterCutoff=0.5, minGenesInGS=5, envir=NA, membership=NA, model=NA, ef=NA, efv1=NA, efv2=NA, type="GO", sdThreshold=2.0, outputPath=NA, gs0=NA)
	{
	#0) Check params
	if(type=="PATH")
		require(KEGG.db)
	else
	{
		if(type=="GO")
			require(GO.db)
		else
			return(paste("Error: type",type,"not supported. Try GO or PATH (for KEGG)."))
	}
	
	if(filterCutoff>=1 || filterCutoff<0)
		return(paste("Error: filter cutoff must be a value in [0,1), typically between 0.4 and 0.6"))
	
	
	
	#1) Prepare expression matrix
	eset$targetPhenotype=gsub("[ ]+$","", as.character(ef))
	#eset$targetPhenotype=ef
	
	#eset=eset[,which(eset$targetPhenotype %in% c(efv1, efv2))]	#size should not be reduced or the matrix won't be invertible (necessary fro lmPerGene)
	eset$targetPhenotype[which(eset$targetPhenotype %in% efv1)]="class1"
	eset$targetPhenotype[which(eset$targetPhenotype %in% efv2)]="class2"
	
	#1.a) Filter genes with low differential expression ----------------------------------
	require("genefilter")
	filt = nsFilter(eset, var.cutoff = filterCutoff)$eset #Some people uses 60%, under the assumption that only about 40% of the genes are expressed on a given tissue (cutoff in default is by quantiles)
	
	#1.c) Get the relevant set for our matrix
	if(!is.na(gs0))
		{
		gs0=gs0[,featureNames(filt)]
		}
	else
		{
		gs0=getGSMatrix(gnames=featureNames(filt), envir=envir, type=type)
		}
		
	
	#1.d) Filter out genes in the expression matrix not in any of the GSs
	
	#--
	haveGS = which(apply(gs0,2,sum)>0) #Take all genes at least in one path
	workingEset = filt[haveGS, ]  #reduce the expr matrix to only genes with at least one path
	gs=gs0[rowSums(gs0)>=minGenesInGS,]
	rm(gs0)
	gs = gs[, featureNames(workingEset)] 	
	
	#working with lists till the last moment (might save some memory, but will be slower...
	#haveGS=sapply(gs0, function(x) length(x))
	#workingEset=filt[names(haveGS)[which(haveGS>0)],]
	#gs = gs0[featureNames(workingEset)] 	
	#ug=unlist(gs)
	#sizes=sapply(unique(ug), function(x) length(which(ug==x)) )
	#gs=lapply(gs, function(x) x [which(x %in% names(sizes)[which(sizes>=minGenesInGS)])])
	#now, finally, convert it to a matrix (much smaller, in the case of hgu133plus2+GO, it is a matrix of 6767x8492 instead of 54675x11708)
	#mat=matrix(0, length(gs), length(unique(unlist(gs))))
	#rownames(mat)=names((gs))
	#colnames(mat)=unique(unlist(gs))
	#mat2=sapply(rownames(mat), function(x){ mat[x,which(colnames(mat) %in% gs[[x]])]=1; mat[x,] })
	#--


	
	#2) Gene Set Enrichment Analysis
	ret=gseaLite(workingEset, geneSets=gs, model=model, sdThreshold=sdThreshold, type=type)
	ret
	}	

	
gseaEF=function(eset=NA, filterCutoff=0.5, minGenesInGS=5, envir=NA, model=NA, ef=NA, efv=NA, type="GO", sdThreshold=2.0, outputPath=NA)
	{
	conds=unique(ef)
	conds=conds[-grep(paste("^",efv,"$",sep=""),conds)] #not to compare with itself
	require("genefilter")
	filt = nsFilter(eset, var.cutoff = filterCutoff)$eset #Some people uses 60%, under the assumption that only about 40% of the genes are expressed on a given tissue (cutoff in default is by quantiles)
	
	gs0=getGSMatrix(featureNames(filt), envir, type)
	gs=matrix(0,dim(gs0)[1], dim(eset)[1])
	colnames(gs)=featureNames(eset)
	rownames(gs)=rownames(gs0)
	gs[,featureNames(filt)]=gs0
	rm(filt)
	degs=lapply(conds, function(y){
				print(paste(efv, "vs", y))
				ret=gsea(eset, filter=filterCutoff, minG=minGenesInGS, envir=envir, gs0=gs,
								model=model, ef=ef, efv1=efv, efv2=y, type=type, sdThreshold=sdThreshold, out=outputPath)
			})
	names=paste(efv, "vs", conds)
	
	temp=list()
	for(i in 1:length(degs))
		{
		temp=c(temp,list(degs[[i]]))
		}
	degs=temp
	names(degs)=names
	
	ret=c()
	ret$names=unlist(names)
	ret$degs=degs
	ret	
	}

#As gseaEF, but instead of every factor value against a single one, the comparisons are between every factor value and the following one
gseaProg=function(eset=NA, filterCutoff=0.5, minGenesInGS=5, envir=NA, model=NA, ef=NA, type="GO", sdThreshold=2.0, outputPath=NA)
	{
		conds=unique(ef)
		require("genefilter")
		filt = nsFilter(eset, var.cutoff = filterCutoff)$eset #Some people uses 60%, under the assumption that only about 40% of the genes are expressed on a given tissue (cutoff in default is by quantiles)
		
		gs0=getGSMatrix(featureNames(filt), envir, type)
		gs=matrix(0,dim(gs0)[1], dim(eset)[1])
		colnames(gs)=featureNames(eset)
		rownames(gs)=rownames(gs0)
		gs[,featureNames(filt)]=gs0
		rm(filt)
		degs=lapply((2:length(conds)), function(y){
					print(paste(conds[y-1], "vs", conds[y]))
					ret=gsea(eset, filter=filterCutoff, minG=minGenesInGS, envir=envir, gs0=gs,
							model=model, ef=ef, efv1=conds[y-1], efv2=conds[y], type=type, sdThreshold=sdThreshold, out=outputPath)
				})
		names=paste(conds,"vs", conds[2:length(conds)])
		names=names[-length(names)]
		
		temp=list()
		for(i in 1:length(degs))
		{
			names(degs[[i]])=paste(names(degs[[i]])," (", names[i], ")", sep="")
			temp=c(temp,list(degs[[i]]))
		}
		degs=temp
		names(degs)=names
		
		ret=c()
		ret$names=unlist(names)
		ret$degs=degs
		ret	
	}	