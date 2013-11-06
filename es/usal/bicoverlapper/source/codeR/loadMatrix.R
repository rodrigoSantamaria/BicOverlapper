# Methods to load matrices into ExpressionSets
# 
# Author: rodri
###############################################################################


#Returns a ExpressionSet from a BicOverlapper format matrix
#duplicates determines the procedure in case of finding duplicated rows. Either average their expression profiles ("average"),
#take the expression of the first one ("first") or rename adding (a), (b), etc. ("rename")
loadMatrix=function(filePath=NULL, numEFs=0, duplicates="first")
	{
	require(Biobase)
	require(utils)
	#require(stringr)
	
	#Read file
	m=read.csv(filePath, sep="\t", header=FALSE)#, stringsAsFactors=FALSE)
	colnames(m)=gsub("[ ]+$", "", as.character(unlist(m[1,])))
	m=m[-1,]
		
	#Parse experimental factors
	efs=c()
	efvs=list()
	if(numEFs>0)
		for(i in 1:numEFs)
		{
			row=gsub("[ ]+$", "", as.character(unlist(m[1,])))
			efvs=c(efvs,list(row[-1]))
			efs=c(efs,row[1])
			m=m[-1,]
		}
	
	#Parse gene names and expression values
	geneNames=gsub("[ ]+", "", as.character(m[,1]))
	ann=gsub("^.*/", "", colnames(m)[1])
	
	m=m[,-1]
		
	m=apply(m, 2,function(x){as.numeric(x)})
	rownames(m)=geneNames
	
	#NEW: produce average on unique rows?
	dup=which(duplicated(geneNames))
	if(duplicates=="average")
		m=t(sapply(unique(geneNames), function(x)
				{
				colMeans(m[which(rownames(m)==x),,drop=F])	
				}))
	else if(duplicates=="remove" & length(dup)>0)
		{
		m=m[-which(geneNames %in% geneNames[dup]),]	
		}
	else if(duplicates=="rename")
		{
		geneNames2=(sapply(1:length(geneNames), function(x)
						{
						id=geneNames[x]
						ids=which(rownames(m)==id)
						if(length(ids)==1)		id
						else	
							paste(id, paste(paste("(",which(ids==x),sep=""),")",sep=""))	
						}))
		rownames(m)=geneNames2
		}
	else if(duplicates=="first" & length(dup)>0)
		{
		m=m[-dup,]	
		}
		
	#Build ExpressionSet
	if(is.null(efs)==FALSE)	
		{
		df=data.frame(efvs)
		colnames(df)=paste("FactorValue.",efs,sep="")
		rownames(df)=colnames(m)
		es=new("ExpressionSet", exprs=m, annotation=ann, phenoData=new("AnnotatedDataFrame", data=df))
		}
	else
		{
		es=new("ExpressionSet", exprs=m, annotation=ann)
		}
	es
	}

	#Saves ExpressionSet to a BicOverlapper expression format. Expression set must have annotation, sampleNames and (optionally) pData.
	saveMatrix=function(es=NA, organism=NA, fileName=NA)
		{
		header=c(paste(organism, paste(annotation(es), "db", sep="."),sep="/"), make.names(sampleNames(es)))
		write(header,file=fileName, ncolumns=length(header), append=FALSE,sep="\t")
		write(rbind(names(pData(es)),as.matrix(pData(es))), file=fileName, ncolumns=length(header), append=TRUE, sep="\t")
		write(t(cbind(featureNames(es), round(exprs(es), digits=2))), file=fileName, ncolumns=length(header), append=TRUE, sep="\t")
		}
		
	
	#Merges a expression set columns by averaging all the samples with the same efv
	merge=function(es=NA, efv=NA)
		{
		aess=sapply(unique(efv), function(x) {  rowMeans(exprs(es)[,which(efv==x),drop=F])  })
		colnames(aess)=unique(efv)
		es=new("ExpressionSet", exprs=aess, annotation=annotation(es))
		es
		}
