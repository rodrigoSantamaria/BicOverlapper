# Function similar to GeneSetCollection on GSEABase, but this one will allow us
# to load gene sets from other sources
# Returns a geneset x gene matrix with element ij = 1 if the geneset i contains gene j, 0 otherwise
# Author: rodri
###############################################################################

getGeneSet=function(geneNames,environment)
    {
    t1=Sys.time()
    gl=mget(geneNames, environment, ifnotfound=NA) #GO for human has about 20000 terms (about 6s in the mget), PATH for human has abut 7000
    print(paste("time in getting terms from the environment", Sys.time()-t1))  
    
    #In R (slightly more than 2s for 10000x100 matrix) (for hgu133plus2 + GO it crashes: too much memory, about 50000 genes and about 10000 terms -> a matrix of more than 640á10e6 values)
    t1=Sys.time()
    u <- unique(unlist(gl))
    u <- u[!is.na(u)]
	
	#--
	#mm <- sapply(gl,function(x) u[match(unique(unlist(x)), u, nomatch=0)])#using lists
	mm <- sapply(gl,function(x) match(u,unlist(x), nomatch=0))
	mm[mm>0]=1
    colnames(mm)=geneNames
    rownames(mm)=u
    #--
	print(paste("time in building the matrix", Sys.time()-t1))  
    
    mm
    }
    
getFuncatGeneSet=function(geneNames, species="Homo sapiens")
    {
    if(species=="Homo sapiens")
        funcat=read.table("/Users/rodri/Documents/workspace/sybaris/analysis/FunCat/p3_p168_Hom_sapie.txt", header=TRUE, sep="\t") #h sapiens
    else if(species=="Aspergillus fumigatus")
        funcat=read.table("/Users/rodri/Documents/workspace/sybaris/analysis/FunCat/p3_p131_Asp_fumig.txt", header=TRUE, sep="\t") #a fumigatus
    else
        {print("Error: only Aspergillus fumigatus and Homo sapiens are available"); return(NA);}
        
    funcat=funcat[which(funcat[,"value"]!="-"),]
        
    #Build the matrix adding the super terms to each gene in a subterm (8s for fumigatus)
    t1=Sys.time()
    terms=unique(funcat[,"value"])
    genes <- unique(funcat[,"gene.code"])
    mm=matrix(0, nrow=length(genes), ncol=length(terms), dimnames=list(genes,terms))
    sapply(terms, function(x)
            {
                gt=funcat[which(funcat[,"value"]==x), "gene.code"]
                mm[as.character(gt),as.character(x)]<<-1
                while(nchar(x)>2)
                {
                    x=gsub("...$", "", x)
                    if(length(which(terms==as.character(x)))>0)
                        mm[as.character(gt),as.character(x)]<<-1
                }
            })
    print(paste("time in building the matrix", Sys.time()-t1))
    rm(funcat)
    mm
    }
    
#This version returns the genes in geneNames that are in the geneSet of the environment
getGenesInGeneSet=function(geneNames, environment, geneSet)
    {
        
    }
   