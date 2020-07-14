# TODO: Add comment
# 
# Author: rodri
###############################################################################


#### Small Helper Functions for preprocessing the Data ########

#principal component analysis for Bicluster groups projection
principalComponents=function(groups=NA, components=c(1,2), log=FALSE)
	{
	total=unique(unlist(groups))
	membership=sapply(groups, function(x){total %in% x})
	pc=prcomp(t(membership))
	coord=pc$x[,components]
	if(log)
		{
		coord[which(coord>0)]=log(1+coord[which(coord>0)])
		coord[which(coord<0)]=-log(abs(-1+coord[which(coord<0)]))
		}
	coord
	}


#### discretize: Discretize a Matrix to wished levels ############
discretize<-function(x,nof=10,quant=FALSE){
	res<-x
	ni<-dim(x)[1]
	nj<-dim(x)[2]
	
	
	if(quant)
	{
		levels<-quantile(x,seq(0+1/nof,1,by=1/nof))
	}
	else
	{
		mindat<-min(x)
		maxdat<-max(x)
		levels<-vector('integer',length=nof)
		diff<-(maxdat-mindat)/nof
		
		for(k in 1:nof)
		{
			levels[k]<-mindat+ k*diff
		}
	}
	
	for(i in 1:ni)
	{
		for(j in 1:nj)
		{
			for(k in 1:nof)
				if(x[i,j] <= levels[nof-k+1])
				{res[i,j]<-k}
		}
	}
	res
}


prequest<-function(mat, level=0,method=c('sd','mean1','mean2'))
{
	if(method=="sd")
	{
		val<-apply(mat,2,sd)
		ident<-val>level
		return(list(mat[ident,],ident))
	}
	if(method=="mean1")
	{
		dat<-mat-apply(mat,2,mean)
		val<-rowSums(dat)
		ident<-val>=level
	}
	if(method=="median")
	{
		dat<-mat!=apply(mat,2,median)
		val<-rowSums(dat)
		ident<-val>=level
	}
	else
	{
		print("Wrong method")
	}
}  

###### Little Helper functions for analysing the Results



##Funktion zur Ausgabe eines Biclusters

writeclust<-function(Biclusterresult,row=TRUE,noC=10){
	
	
	if(row){
		
		x<-rep(0,dim(Biclusterresult@RowxNumber)[1])
		for (i in 1:min(Biclusterresult@Number,noC)){
			x<-x+i*Biclusterresult@RowxNumber[,i]
		}
	}
	else {
		x<-rep(0,dim(Biclusterresult@NumberxCol)[2])
		for (i in 1:min(Biclusterresult@Number,noC)){
			x<-x+i*Biclusterresult@NumberxCol[i,]
		}
	}
	x
}


plotclust <- function(res,x,bicluster=TRUE,legende=FALSE,noC=5,wyld=3,Titel="Plotclust",...)
{
	
	if(bicluster)
	{
		op<-par(mfrow=c(3,2))
		
		for ( i in 1:min(res@Number,noC))
		{
			identq <- res@NumberxCol[i,]
			identper <- res@RowxNumber[,i]
			anz<-sum(identper)
			le <- sum(identq)
			if (anz == 0){
				break
			}
			
			
			mat <- matrix(0,3,le)
			mat[1,] <- colMeans(x[identper,identq])
			mat[2,] <- colMeans(x[!identper,identq])
			mat[3,] <- apply(x[!identper,identq],2,median)
			rownames(mat) <- c("Value","Mean","Median")
			colnames(mat) <- colnames(x[,identq])
			if(legende)
			{
				barplot(mat,beside=T,legend=rownames(mat),main=paste("Cluster",i,"Size:",anz),ylim=c(min(0,min(mat)),(max(5,max(mat)+3))),las=wyld,...)
			}
			else
			{
				barplot(mat,beside=T,main=paste("Cluster",i,"Size:",anz),las=wyld,...)
			}
		}
		par(op)
	}
	
	else
	{
		op<-par(mfrow=c(3,2))
		
		for ( i in 1:min(length(res$size),noC)){
			identper <- res$cluster==i
			anz<-sum(identper)
			if (anz == 0){
				break
			}
			
			
			mat <- matrix(0,3,dim(x)[2])
			mat[1,] <- colMeans(x[identper,])
			mat[2,] <- colMeans(x[!identper,])
			mat[3,] <- apply(x[!identper,],2,median)
			rownames(mat) <- c("Value in Bicluster","Mean in remaining ","Median")
			colnames(mat) <- colnames(x)
			if(legende)
			{
				barplot(mat,beside=T,legend=rownames(mat),main=paste("Cluster",i,"Size:",anz),ylim=c(min(0,min(mat)),(max(5,max(mat)+3))),las=wyld,...)
			}
			else
			{
				barplot(mat,beside=T,main=paste("Cluster",i,"Size:",anz),las=wyld,...)
			}
		}
		
		par(op)
	}
	title(Titel)
}


# Converts a Biclust object to a list of bicluster objects
# A bicluster object has rows and cols fields
# Each one is a list of numbers that represents the rows and columns in the bicluster
# in the same order that they appear in the Biclust object (that is, the order of the original matrix)
# bicResult is a Biclust object
convertclust=function(bicResult)
{
	setClass("bicluster", representation(rows="integer", cols="integer"))
	
	if(class(bicResult)!="Biclust")
	{
		stop("The argument 'bicResult' must be of class Biclust")
	}
	biclusters=c()
	for (i in 1:(bicResult@Number)) 
	{
		listar = which(bicResult@RowxNumber[,i])
		listac = which(bicResult@NumberxCol[i,])
		if(length(listar)==0 || length(listac)==0)	{}
		else{
			bic=new("bicluster")
			bic@rows=listar
			bic@cols=listac
			biclusters=c(biclusters,bic)
		}
	}	
	biclusters
}

# Converts an ISA biclust list to a list of bicluster objects
# An ISA bicluster list has rows and columns fields
# Each one is a list of numbers that represents the rows and columns in the bicluster
# in the same order that they appear in the Biclust object (that is, the order of the original matrix)
# bicResult is a Biclust object
convertISAclust=function(ISAlist, row.thr=0.5, col.thr=0.5)
{
	setClass("bicluster", representation(rows="integer", cols="integer"))
	
	if(class(ISAlist)!="list" || length(ISAlist)!=4)
	{
		stop("The argument 'ISAlist' must be a list with 4 elements")
	}
	if(dim(ISAlist$columns)[2]==0)
	{
		stop("The result has no biclusters")
	}
	
	biclusters=c()
	for (i in 1:(dim(ISAlist$rows)[2])) 
	{
		listar = which(abs(ISAlist$rows[,i])>row.thr)
		listac = which(abs(ISAlist$columns[,i])>col.thr)
		if(length(listar)<=1 || length(listac)<=1)	{}
		else{
			bic=new("bicluster")
			bic@rows=listar
			bic@cols=listac
			biclusters=c(biclusters,bic)
		}
	}	
	biclusters
}



#Takes a list of biclusters and returns a list of the largest maxNumber biclusters
#with less overlap than "overlapThreshold"  (or a number < maxNumber if there are not enough biclusters
#that satisfy the overlap criterium). maxNumber default is 100.
# overlapThreshold must be in [0,1], representing the percentage of overlap (default 0.25)
# bics is a list of "bicluster" objects
filterclust=function(bics, overlapThreshold=0.25, maxNumber=100, maxRows=100, maxCols=10)
{
	cont=0
	sizes=as.numeric(lapply(1:length(bics), function(i) length(bics[[i]]@rows)*length(bics[[i]]@cols)))
	bics2=c()
	for(i in bics[order(sizes, decreasing=T)])
	{
		if(cont>=maxNumber)	break
		insert=TRUE
		if(length(i@rows)>maxRows || length(i@cols)>maxCols)	
			{
			#print(paste("size", length(i@rows), length(i@cols)))
			insert=FALSE
		}
		if(insert)
			for(j in bics2)
			{
				#print(paste("overlap:", overlap(i,j)))
				if(overlap(i,j)>=overlapThreshold)
				{
					print("filter out")
					insert=FALSE
					break
				}
			}
		if(insert)	
		{
			#print("keep in")
			bics2=c(bics2,i)
			cont=cont+1
		}
	}
	bics2
}

#Returns the amount of overlap between two biclusters, measured in terms of 
#percentage respect to bic1 (bic1 and bic2 are bicluster objects with fields rows and cols)
overlap=function(bic1,bic2)
{
	length(intersect(bic1@rows,bic2@rows))/length(bic1@rows)*length(intersect(bic1@cols,bic2@cols))/length(bic1@cols)	
}

#Writes biclusters results from a list of objects of type 'bicluster'. Row and column names are provided by a matrix object mat
writeclust2=function(bic, mat,path, summary="Bicluster results")
{
  fileConn<-file(path)
  lines=c(length(bic), summary)
  cont=0
  for(i in bic)
    {
    entry=paste("B", cont, ":", length(i@rows), "\t", length(i@cols), sep="", collapse="")
    genes=paste(rownames(mb2)[i@rows], collapse="\t")
    conds=paste(colnames(mb2)[i@cols], collapse="\t")
    lines=c(lines, entry, genes, conds)
    cont=cont+1
    }
  writeLines(lines, fileConn)
  close(fileConn)
}


#Writes biclusters results from a list of rows and conditions for each group
writeclust3=function(rows, cols=NA,path, summary="Bicluster results")
{
  fileConn<-file(path)
  lines=c(length(rows), summary)
  if(is.na(cols)[1])
    {
    cols=list()
    for(i in c(1:length(rows)))
      cols[[i]]=list()
    }
  cont=0
  for(i in c(1:length(rows)))
  {
    if(is.null(names(rows)))
      entry=paste("B", cont, ":", length(rows[[i]]), "\t", length(cols[[i]]), sep="", collapse="")
    else
      entry=paste(names(rows)[i], ":", length(rows[[i]]), "\t", length(cols[[i]]), sep="", collapse="")
    genes=paste(rows[[i]], collapse="\t")
    conds=paste(cols[[i]], collapse="\t")
    lines=c(lines, entry, genes, conds)
    cont=cont+1
  }
  writeLines(lines, fileConn)
  close(fileConn)
}


readclust=function(path)
{
  setClass("bicluster", representation(rows="list", cols="list"))
  bc=list()
  
  fileConn=file(path)
  lines=readLines(fileConn)
  
  for(i in seq(3,length(lines),3))
    {
    b=new("bicluster")
    b@rows=strsplit(lines[[i+1]], "\t")
    b@cols=strsplit(lines[[i+2]], "\t")
    bc=c(bc, b)
  }
  
  bc
}

