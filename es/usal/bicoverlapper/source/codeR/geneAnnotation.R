# Functions to convert different formats
# 
# Author: rodri
###############################################################################

getEnsemblMart=function(species="Homo sapiens")
	{
	require(biomaRt)
	spec=c()
	specens=c()
	
	if(length(strsplit(species, " ")[[1]])>=2) 	
	{
			spec=tolower(paste( substr(strsplit(species, " ")[[1]][1],0,1), substr(strsplit(species, " ")[[1]][2],0,2), sep=""))
			speclong=tolower(paste( substr(strsplit(species, " ")[[1]][1],0,1), strsplit(species, " ")[[1]][2], sep=""))
			specens=tolower(paste( substr(strsplit(species, " ")[[1]][1],0,1), strsplit(species, " ")[[1]][2], "_gene_ensembl", sep=""))
	}
	if(length(spec)==0)	stop("Species name is wrong")
	if(species=="Schizosaccharomyces pombe" || length(grep("fuckeliana", species))>0  || length(grep("cinerea", species))>0)
		{
		#marts=listMarts()[,"biomart"]
	  #martName=as.character(marts[grep("fungi_mart", marts)[1]])
	  marts=listMarts(host="fungi.ensembl.org")[,"biomart"]
		martName=as.character(marts[grep("fungi_mart", marts)[1]])
		mart = useMart(martName, dataset=paste(speclong,"_eg_gene",sep=""), host="fungi.ensembl.org")
		}
	else
		{
		if(length(grep("Escherichia coli", species))>0)
			{
			marts=listMarts()[,"biomart"]
			martName=as.character(marts[grep("bacteria_mart", marts)[1]])
			mart=useMart(martName)
			dss=listDatasets(mart)[,"description"]
			dsName=listDatasets(mart)[grep(species, dss),"dataset"] #very convenient to make this in order to save time
			mart = useMart(martName, dataset=as.character(dsName))
			}
		else
			{
			if(species=="Arabidopsis thaliana" || species=="Zea mays")
				{
				marts=listMarts()[,"biomart"]
				martName=as.character(marts[grep("plants_mart", marts)[1]])
				mart = useMart(martName, dataset=paste(speclong, "_eg_gene", sep=""))
				}
			else
				mart = useMart("ensembl", dataset=specens)
			}
		}
	mart
	}
	
#Given a number of gene IDs of a given type (e.g. ensembl gene ids) it returns
#the ids found with biomaRt
#NOTE: it could also returns the GO names, description, etc. but currently biomaRt does not 
#provide them for biological processes, so we discarded that part that should be done by
#getGOTerms in GOgroups.R
#geneids - ids of the genes to search annotations for
#mart    - mart database in use
#type    - type of the ids, in biomaRt format
#GOtypes - type of GO terms to search for, in biomaRt format
#return  - a list of lists, with the corresponding GO ids for each gene in geneids, or NA if no GO terms were found for any of them
#getBMGO=function(geneids, mart, type="ensembl_gene_id", GOtypes=c("go_biological_process_id","go_molecular_function_id","go_cellular_component_id"))
#in version R 2.13+ you have different go identifiers, directly go_id
getBMGO=function(geneids, mart, type="ensembl_gene_id", GOtypes=c("go_id"))
	{
	require(biomaRt)
	geneens=getBM( attributes = c(type, GOtypes), filters = type, values=geneids, mart = mart)
	geneens=geneens[which(nchar(geneens[,GOtypes[1]])>0),]
	golist=lapply(unique(geneens[,type]), function(x){unique(unlist(geneens[which(geneens[,type]==x),GOtypes]))})
	names(golist)=unique(geneens[, type])
	#add the ones not found
	nomatch=which(! geneids %in% names(golist))
	golist[geneids[nomatch]]=NA
	golist[geneids]#return in the same order they came
	#if(class(golist)=="matrix") golist=list(golist)
	#golist
	}

#Obtains basic characteristics of the genes (symbol, description and ensembl id)
getBMGenes=function(geneids, mart, species="Homo sapiens", type)
{
	require(biomaRt)
	if(species=="Homo sapiens")
		geneens=getGene( id = geneids, type = type, mart = mart)[,c(type, "hgnc_symbol","description","ensembl_gene_id")]
	else
		{
		if(length(grep("^symbol$", listAttributes(mart)[,1]))==1)
			geneens=getGene( id = geneids, type = type, mart = mart)[,c(type, "symbol","description","ensembl_gene_id")]
		else if(length(grep("^uniprot_genename$", listAttributes(mart)[,1]))==1)
			geneens=getGene( id = geneids, type = type, mart = mart)[,c(type, "uniprot_genename","description","ensembl_gene_id")]
		else if(length(grep("^external_gene_id$", listAttributes(mart)[,1]))==1)
			geneens=getGene( id = geneids, type = type, mart = mart)[,c(type, "external_gene_id","description","ensembl_gene_id")]
		}
	#there might be duplicated, we remove them
	geneens=geneens[-which(duplicated(geneens[,type])),]
	#they might be unsorted, so we make sure they are returned in the same order
	rownames(geneens)=geneens[, type] 
	#remove source info on description (to make the lines sorter)
	geneens[,"description"]=gsub(" \\[.*\\]", "", geneens[,"description"])
	geneens[geneids,]
}

getBMatts=function(geneids=NA, mart=NA, type="ensembl_gene_id", attributes=c("ensembl_gene_id", "entrezgene", "hgnc_symbol","description","go_biological_process_id","go_molecular_function_id","go_cellular_component_id"))
{
	require(biomaRt)
	geneens=getBM(values=geneids, filters = type, mart = mart, attributes=attributes)
	
	ret=c()
	
	gonames=grep("go_.*_id", colnames(geneens))
	ret$gos=NULL
	ret$gos=sapply(geneids, function(x){go=unique(unlist(geneens[which(geneens[,type] %in% x),gonames])); go[which(nchar(go)>0)]})
	ret$ids=geneens
	if(length(gonames)>0)	ret$ids=geneens[,-gonames]
	
	#there might be duplicated, we remove them
	ret$ids=unique(ret$ids)
	if("entrezgene" %in% attributes)
		ret$ids=ret$ids[order(ret$ids[,"entrezgene"]),] #there might be more duplicated because of entrezgene
	dup=which(duplicated(ret$ids[,type]))
	if(length(dup)>0)
		ret$ids=ret$ids[-dup,]
	#they might be unsorted, so we make sure they are returned in the same order
	rownames(ret$ids)=ret$ids[, type] 
	#remove source info on description (to make the lines sorter)
	ret$ids[,"description"]=gsub(" \\[.*\\]", "", ret$ids[,"description"])
	ret$ids=ret$ids[geneids,]
	
	ret
}


