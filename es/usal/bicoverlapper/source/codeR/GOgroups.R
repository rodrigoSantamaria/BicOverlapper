# TODO: Add comment
# 
# Author: Rodrigo
###############################################################################

#Returns a goterms object with the attributes:
#ids: GOIDs annotated for the specified group of genes in the specified database
#evidences: number of times that the GOID is found in the specified group of genes. Note that a gene can
#			be annotated more than once with the same GOID, if it comes from different evidences
#			(for example, inferred from electronic annotation and inferred from mutant phenotype)
#terms: GO term
#ontologies: GO ontology in which the term is in
#definitions: natural text with a definition of the term
getGOTerms=function(group, database)
	{
	setClass("goterms", representation(ids="character", evidences="integer", terms="character", ontologies="character", definitions="character"))
	terms=c()
	terms=sapply(group, function(x){
			names(get(x, database))	
			})
	terms=as.character(unlist(terms))
	terms=rle(sort(terms))
	goterms=new("goterms")
	goterms@ids=terms$values
	#goterms@evidences=terms$lengths
	#desc=sapply(goterms@ids, function(x){get(x, GOTERM)})
	#goterms@terms=sapply(desc, function(x){Term(x)})
	#goterms@ontologies=sapply(desc, function(x){Ontology(x)})
	#goterms@definitions=sapply(desc, function(x){Definition(x)})
	goterms
	}
	
getGOIDS=function(group, database)
	{
	terms=c()
	terms=sapply(group, function(x){
				names(get(x, database))	
			})
	terms
	}
	
getGOTerm=function(id)
	{
	setClass("goterms", representation(ids="character", evidences="integer", terms="character", ontologies="character", definitions="character"))
	goterm=new("goterms")
	goterm@ids=id
	desc=get(goterm@ids, GOTERM)
	goterm@terms=Term(desc)
	goterm@ontologies=Ontology(desc)
	goterm@definitions=Definition(desc)
	goterm	
	}
	
#Returns a goterms object from GOIDs with the attributes:
#ids: GOIDs annotated for the specified group of genes in the specified database
#evidences: number of times that the GOID is found in the specified group of genes. Note that a gene can
#			be annotated more than once with the same GOID, if it comes from different evidences
#			(for example, inferred from electronic annotation and inferred from mutant phenotype)
#terms: GO term
#ontologies: GO ontology in which the term is in
#definitions: natural text with a definition of the term
getGOTermsByGOID=function(goids)
	{
	require("GO.db")
	setClass("goterms", representation(ids="character", evidences="integer", terms="character", ontologies="character", definitions="character"))
	goterms=new("goterms")
	
	goterms@ids=goids
	#t1=Sys.time()
	desc=mget(goterms@ids, GOTERM, ifnotfound=NA)
	#t2=Sys.time()
	#print(paste("time en mget", t2-t1))
	goterms@terms=sapply(desc, function(x){
				if(!identical(x, NA)) Term(x) 
				else NA
			})
	goterms@ontologies=sapply(desc, function(x){
				if(!identical(x, NA)) Ontology(x) 
				else NA
			})
	goterms@definitions=sapply(desc, function(x){
				if(!identical(x, NA)) Definition(x) 
				else NA
			})
	
	#t1=Sys.time()
	#print(paste("time en sapplies", t1-t2))
	goterms
	}
	
	
getGOTerms2=function(group, database)
	{
	setClass("goterms", representation(ids="character", evidences="integer", terms="character", ontologies="character", definitions="character"))
	terms=c()
	terms=sapply(group, function(x){names(get(x, database))})
	sapply(names(terms), function(x)
			{
			t=unlist(terms[x])
			if(is.null(t)==FALSE)
				{
				save=mget(t,GOTERM)
				ttt=sapply(save, function(y)
					{
					ar=c(GOID(y), Term(y), Ontology(y), Definition(y))
					})
			
				gt=new("goterms")
				gt@ids=ttt[1,]
				gt@terms=ttt[2,]
				gt@ontologies=ttt[3,]
				gt@definitions=ttt[4,]
				gt
				}
			else
				{
				NULL
				}
			})
	}