# This method builds a co-regulation network from an expression matrix
# gmlFile - path to a GML file where the network will be stored
#?mat - expression matrix
# sdThreshold - rows with sd lower than this threshold will be discarded
#				genes with deviation below averageDeviation+deviationThreshold*sdDeviaiton will be discarded 
# distanceMethod - method to compute the distance. Anyone used by dist() can be chosen
#					TODO: add "mutual information" as distance method
#?distanceThreshold - the method adds an edge for every two nodes with a distance lower
#					  than mean(distances)-distanceThreshold*sd(distances)
# Author: Rodrigo Santamar?a Vicente
###############################################################################
buildCorrelationNetwork0=function(gmlFile=NA, mat=NA, distanceMethod="euclidean", deviationThreshold=2, distanceThreshold=2)
	{
	#0) Select only elements with some change
	#TODO: mutual information?
	if(length(which(c("euclidean", "maximum", "manhattan", "canberra", "binary", "minkowsky", "mutualinfo")==distanceMethod))!=1)
		return(paste("Error: distance must be one of the following:", cat(c("euclidean", "maximum", "manhattan", "canberra", "binary", "minkowsky", "mutualinfo"), sep=", ")))
	if(distanceMethod=="mutualinfo")
		require(bioDist)
	
	sds=apply(mat, 1,sd)
	dt=mean(sds)+deviationThreshold*sd(sds)
	mat0=mat[which(sds>dt),]
	dim(mat0)
	print(c("Nodes considered: ", dim(mat0)[1]))
	print(c("Min. value in nodes considered: ", min(rowSums(mat0))))
	
	if(dim(mat0)[1]>4000)#Temporarily set to 4000.
		return("Error: networks with more than 2000 nodes are not allowed, rise up the filtering threshold")
	
	#1) Perform distance computations
	#euclidean, maximum, manhattan, canberra, binary, minkowsky, mutualinfo
	if(distanceMethod=="mutualinfo")
		dd=mutualInfo(mat0)
	else
		dd=dist(mat0, method=distanceMethod)
	
	attr(dd, "Size")
	dt=mean(dd)-distanceThreshold*sd(dd)
	
	#list relationships below distance threshold
	t0=proc.time()
	dm=as.matrix(dd)
	tal=apply(dm,1,function(x)
			{
			selec=which(x<dt)
			})
	if(length(tal)==0)
		return(paste("Error: no nodes with distance below", distanceThreshold, "deviations of average distance for nodes deviated above", deviationThreshold," from average expression. Either raise deviation or distance thresholds."))
	
	st=which(as.array(sapply(tal, function(x){length(x)}))>1)
	tal=tal[st]
	ic=c(); jc=c()
	for(i in 1:(length(tal)))
		{
		notj=which(names(tal[[i]])==names(tal)[[i]])#not to include itself
		if(length(tal[[i]])>1)
			{
			notj=c(notj,which(names(tal[[i]][-notj]) %in% ic))#neither mirror relationships
			ic=c(ic, rep(names(tal)[[i]], length(tal[[i]])-length(notj)))
			jc=c(jc, names(tal[[i]][-notj]))
			}
		}
	
	#cat("building network takes" , round(proc.time()[3] - t0[3], 3), "sec\n") 
	length(ic)
	length(unique(c(ic,jc)))
	
	#3) save to GML file
	if(!is.na(gmlFile))
		{
		ids=which(rownames(mat0) %in% unique(c(ic,jc)))
		names=unique(c(ic,jc))
		#writeGML(gmlFile=gmlFile, nodeids=ids, nodenames=names, edges=list(n1=ic, n2=jc))
		writeGML(gmlFile=gmlFile, nodeids=names, edges=list(n1=ic, n2=jc))
		rm(mat0,dm,dd)
		#return("Network built")
		return(list(n1=ic, n2=jc))
	  }
	else
		return(list(n1=ic, n2=jc))
	}
	

#Version where deviation and distance thresholds are used as is, not as standard deivation of something
buildCorrelationNetwork=function(gmlFile=NA, mat=NA, distanceMethod="euclidean", deviationThreshold=0.5, distanceThreshold=1)
	{
		cat("in\n") 
		#0) Select only elements with some change
		#TODO: mutual information?
		if(length(which(c("euclidean", "maximum", "manhattan", "canberra", "binary", "minkowsky", "mutualinfo")==distanceMethod))!=1)
			return(paste("Error: distance must be one of the following:", cat(c("euclidean", "maximum", "manhattan", "canberra", "binary", "minkowsky", "mutualinfo"), sep=", ")))
		if(distanceMethod=="mutualinfo")
			require(bioDist)
		
		sds=apply(mat, 1,sd)
		#dt=mean(sds)+deviationThreshold*sd(sds)
		mat0=mat[which(sds>deviationThreshold),]
		#mat0=mat[which(abs(rowMeans(mat))>deviationThreshold),]
		dim(mat0)
		if(dim(mat0)[1]>2000)
			return("Error: networks with more than 2000 nodes are not allowed, rise up the filtering threshold")
		
		#1) Perform distance computations
		#euclidean, maximum, manhattan, canberra, binary, minkowsky, mutualinfo
		if(distanceMethod=="mutualinfo")
			dd=mutualInfo(mat0)
		else
			dd=dist(mat0, method=distanceMethod)
		
		attr(dd, "Size")
		#dt=mean(dd)-distanceThreshold*sd(dd)
		
		#list relationships below distance threshold
		t0=proc.time()
		dm=as.matrix(dd)
		tal=apply(dm,1,function(x)
				{
					selec=which(x<distanceThreshold)
				})
		if(length(tal)==0)
			return(paste("Error: no nodes with", distanceMethod,"distance below", distanceThreshold, "for nodes with expression variation above", deviationThreshold,". Either raise distance threshold or lower expression threshold."))
		
		st=which(as.array(sapply(tal, function(x){length(x)}))>1)
		tal=tal[st]
		ic=c(); jc=c()
		for(i in 1:(length(tal)))
		{
			notj=which(names(tal[[i]])==names(tal)[[i]])#not to include itself
			if(length(tal[[i]])>1)
			{
				notj=c(notj,which(names(tal[[i]][-notj]) %in% ic))#neither mirror relationships
				ic=c(ic, rep(names(tal)[[i]], length(tal[[i]])-length(notj)))
				jc=c(jc, names(tal[[i]][-notj]))
			}
		}
		
		cat("building network takes" , round(proc.time()[3] - t0[3], 3), "sec\n") 
		length(ic)
		length(unique(c(ic,jc)))
		
		#3) save to GML file
		if(!is.na(gmlFile))
			{
			ids=which(rownames(mat0) %in% unique(c(ic,jc)))
			names=unique(c(ic,jc))
		
			writeGML(gmlFile=gmlFile, nodeids=ids, nodenames=names, edges=list(n1=ic, n2=jc))
			rm(mat0,dm,dd)
			return("Network built")
			}
		else
			return(list(n1=ic, n2=jc))
			
	}
	
	
#This method builds a GML network file from information about nodes and edges 
#
#gmlFile - path where the file will be written
#nodeids - integer array with node identifiers
#nodenames - character array with node names (optional, if not provided, nodeids are taken as nodenames)
#edges - list with two elements of equal length, n1 and n2, that are int lists of node ids
#sizes - list of node sizes (optional)
#values - a matrix of nodeids rows and columns with numerical values that will be stored separately as attributes with the name of the column
writeGML=function(gmlFile=NA, nodeids, nodenames=NA, edges, sizes=NA, types=NA, values=NA)
	{
	#if(length(nodenames)>0 && length(nodenames)==length(nodeids))	nodes=nodenames
	#else	nodes=nodeids
	if(length(edges)==0)	break
	if(length(edges$n1)!=length(edges$n2)) break
	  
	write(file=gmlFile, 
	"<?xml version=\"1.0\" encoding=\"UTF-8\"?>
		<graphml xmlns=\"http://graphml.graphdrawing.org/xmlns\"
			xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"
			xsi:schemaLocation=\"http://graphml.graphdrawing.org/xmlns
			http://graphml.graphdrawing.org/xmlns/1.0/graphml.xsd\">
		<key id=\"d0\" for=\"node\" attr.name=\"id\" attr.type=\"string\">
			</key>
			<key id=\"d1\" for=\"node\" attr.name=\"type\" attr.type=\"string\">
			<default>node</default>
			</key>
			<key id=\"d2\" for=\"node\" attr.name=\"size\" attr.type=\"int\">
			<default>1</default>
      </key>
		<key id=\"d3\" for=\"node\" attr.name=\"name\" attr.type=\"string\">
			<default>unknown</default>
			</key>
	", append=FALSE)
	
	if(is.na(values)==FALSE & length(values)==1)
  	{
  	sapply(colnames(values), function(x){ 
  	  write(file=gmlFile, paste("<key id=\"", x,"\" for=\"node\" attr.name=\"type\" attr.type=\"string\">
			</key>", sep=""))})  
  	}
	write(file=gmlFile,
		"<graph id=\"Gene Network\" edgedefault=\"undirected\">", append=TRUE)
	
	for(i in 1:length(nodeids))
		{
		write(file=gmlFile, paste("	<node id=\"", (i), "\">", sep=""), append=TRUE)
		write(file=gmlFile, paste("		<data key=\"d0\">",nodeids[i],"</data>", sep=""), append=TRUE)
		if(!is.na(types))
		  write(file=gmlFile, paste("		<data key=\"d1\">",types[i],"</data>", sep=""), append=TRUE)
		if(!is.na(sizes))
		  write(file=gmlFile, paste("		<data key=\"d2\">",sizes[i],"</data>",sep=""), append=TRUE)
		if(!is.na(names))
		  write(file=gmlFile, paste("		<data key=\"d3\">",nodenames[i],"</data>",sep=""), append=TRUE)
		if(is.na(values)==FALSE)
		  sapply(colnames(values), function(x)
		    {
		    write(file=gmlFile, paste("		<data key=\"",x,"\">",values[i,x],"</data>",sep=""), append=TRUE)
		    })
		  
		write(file=gmlFile, "	</node>", append=TRUE)
	 	}
			
	for(i in 1:length(edges$n1))
		{
		write(file=gmlFile, paste("	<edge source=\"", (which(nodeids %in% edges$n1[i])), "\" target=\"", (which(nodeids %in% edges$n2[i])), "\">", sep=""), append=TRUE)
		write(file=gmlFile, "		<data key=\"d3\">co-regulation</data>", append=TRUE)
		write(file=gmlFile, "	</edge>", append=TRUE)
		}
	write(file=gmlFile, "</graph></graphml>", append=TRUE)
	}
