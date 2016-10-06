# Write bicluster results to a text file
# fileName - path to the file were biclusters are written
# bicResult - biclsuters results as a bicluster class
# geneNames - array with strings with gene Names
# arrayNames - array with string with condition names
# append - if true, adds the bicluster results to previous information in the text file, if this exists. Default false.
# delimiter - delimiter string between gene and condition names. Default " ".
writeBiclusterResults=function(fileName, bicResult, bicDesc, bicNames, geneNames, arrayNames, append=FALSE, delimiter="\t")
  {
  write(length(bicResult), file=fileName, append=append)
  write(bicDesc, file=fileName, append=TRUE)
  c=1
  for(i in bicResult)
    {
		print(paste(c, bicNames[c]))
    write(c(paste(bicNames[c],length(i@rows), sep=":"), length(i@cols)), file=fileName, ncolumns=2, append=TRUE, sep =delimiter)
    write(geneNames[i@rows], file=fileName, ncolumns=length(i@rows), append=TRUE, sep =delimiter)
    write(arrayNames[i@cols], file=fileName, ncolumns=length(i@cols), append=TRUE, sep =delimiter)
	c=c+1
    }
  }
  
# Write bicluster results to a text file
# fileName - path to the file were biclusters are written
# bicResult - biclsuters results as a bicluster class
# geneNames - array with strings with gene Names
# arrayNames - array with string with condition names
# append - if true, adds the bicluster results to previous information in the text file, if this exists. Default false.
# delimiter - delimiter string between gene and condition names. Default " ".
writeBiclusterResults2=function(fileName, bicResult, bicName, geneNames, arrayNames, append=FALSE, delimiter=" ")
  {
  write(bicResult@Number, file = fileName, append = append)
  write(bicName, file = fileName, append = TRUE)
  for (i in 1:bicResult@Number) {
	  listar = row(matrix(bicResult@RowxNumber[, i]))[bicResult@RowxNumber[,i] == T]
	  listac = row(matrix(bicResult@NumberxCol[i, ]))[bicResult@NumberxCol[i,] == T]
	  write(c(length(listar), length(listac)), file = fileName, ncolumns = 2, append = TRUE, sep = delimiter)
	  write(geneNames[listar], file = fileName, ncolumns = length(listar), append = TRUE, sep = delimiter)
	  write(arrayNames[listac], file = fileName, ncolumns = length(listac), append = TRUE, sep = delimiter)
	  }
  }

  
# Write bicluster results to a text file from a list of rows and colums on each
# fileName - path to the file were biclusters are written
# listRows - list of rows for the biclusters
# listColumns - list of columns for the biclusters
# bicNames - names of the biclusters, if any
# biclusteringDescription - description of the biclustering
# append - if true, adds the bicluster results to previous information in the text file, if this exists. Default false.
# delimiter - delimiter string between gene and condition names. Default " ".
writeBiclusterResultsFromList=function(fileName, listRows, listColumns=NA, bicNames=NA, biclusteringDescription="Biclusters", append=FALSE, delimiter="\t")
  {
	  if(!is.na(listColumns) && length(listRows)!=length(listColumns))
		  stop("Number of groups must be the same for columns and rows")
	  
	  else if(!is.na(bicNames) && length(listRows)!=length(bicNames))
	      stop("The number of bicluster names must be equal to the number of biclusters, or NA")
	  
	  write(length(listRows), file = fileName, append = append)
	  write(biclusteringDescription, file = fileName, append = TRUE)
	  for (i in 1:length(listRows)) {
		  listar = listRows[[i]]
		  cat(i,bicNames[i],":",listar, "\n")
		  if(!is.na(listColumns))
			  {
			  listac = listColumns[[i]]
			  if(!is.na(listar) && !is.na(listac))
			  	{
				  if(is.na(bicNames))	write(c(length(listar), length(listac)), file = fileName, ncolumns = 2, append = TRUE, sep = delimiter)
				  else					write(c(paste(bicNames[i], ":", length(listar)), length(listac)), file = fileName, ncolumns = 2, append = TRUE, sep = delimiter)
				  write(listar, file = fileName, ncolumns = length(listar), append = TRUE, sep = delimiter)
				  write(listac, file = fileName, ncolumns = length(listac), append = TRUE, sep = delimiter)
			  	}
			 }
		  else
		  	{
			if(length(listar)>0 && !is.na(listar))
				{
					listac=c()
					if(is.na(bicNames))	write(c(length(listar), length(listac)), file = fileName, ncolumns = 2, append = TRUE, sep = delimiter)
					else					write(c(paste(bicNames[i], ":", length(listar)), length(listac)), file = fileName, ncolumns = 2, append = TRUE, sep = delimiter)
					write(listar, file = fileName, ncolumns = length(listar), append = TRUE, sep = delimiter)
					write(listac, file = fileName, append = TRUE, sep = delimiter)
				}
			}
	  }
  }
  
  
# Write bicluster results to a text file from an array with different result sets list of rows and colums on each
# fileName - path to the file were biclusters are written
# listArrayRows - array list with information about rows. Each element of the list correspond to the the rows of the groups on a result set
# listArrayColumns - array list with information about columns. Each element of the list correspond to the the columns of the groups on a result set
# listArrayNames - array list with information about group names. Each element of the list correspond to the the names of the groups on a result set
# biclusteringDescription - list of descriptions for each result set
# append - if true, adds the bicluster results to previous information in the text file, if this exists. Default false.
# delimiter - delimiter string between gene and condition names. Default " ".
  writeBiclusterResultsFromListArray=function(fileName, listArrayRows, listArrayColumns=NA, listArrayNames=NA, descriptions=c(), append=FALSE, delimiter="\t")
  {
	  if(!is.na(listArrayColumns) && length(listArrayRows)!=length(listArrayColumns))
		  stop("Number of result sets must be the same for columns and rows")
	  
	  else if(!is.na(listArrayNames) && length(listArrayRows)!=length(listArrayNames))
		  stop("The number of result sets must be same for rows and group names")
	  
	  write(sum(sapply(listArrayRows, function(x){length(x)})), file = fileName, append = append)
	  for(k in 1:length(listArrayRows))
		  {
		  if(length(descriptions)==length(listArrayRows))	biclusteringDescription=descriptions[k]
		  else												biclusteringDescription=paste("ResultSet",k)
		  
		  
		  listRows=listArrayRows[[k]]
		  listColumns=NA
		  if(!is.na(listArrayColumns))	listColumns=listArrayColumns[[k]]
		  
		  listNames=NA
		  if(!is.na(listArrayNames))		listNames=listArrayNames[[k]]
		  
		  
		  if(TRUE)
		  {
	      write(biclusteringDescription, file = fileName, append = TRUE)
		  for (i in 1:length(listRows)) {
			  listar = listRows[[i]]
			  cat(listar, "\n")
			  if(!is.na(listColumns))
			  {
				  listac = listColumns[[i]]
				  if(!is.na(listar) && !is.na(listac))
				  {
					  if(is.na(listNames))	write(c(length(listar), length(listac)), file = fileName, ncolumns = 2, append = TRUE, sep = delimiter)
					  else					write(c(paste(listNames[[i]], ":", length(listar)), length(listac)), file = fileName, ncolumns = 2, append = TRUE, sep = delimiter)
					  write(listar, file = fileName, ncolumns = length(listar), append = TRUE, sep = delimiter)
					  write(listac, file = fileName, ncolumns = length(listac), append = TRUE, sep = delimiter)
				  }
			  }
			  else
			  {
				  if(length(listar)>0 && !is.na(listar))
				  {
					  listac=c()
					  if(is.na(listNames))	write(c(length(listar), length(listac)), file = fileName, ncolumns = 2, append = TRUE, sep = delimiter)
					  else					write(c(paste(listNames[[i]], ":", length(listar)), length(listac)), file = fileName, ncolumns = 2, append = TRUE, sep = delimiter)
					  write(listar, file = fileName, ncolumns = length(listar), append = TRUE, sep = delimiter)
					  write(listac, file = fileName, append = TRUE, sep = delimiter)
				  }
			  }
		  }
	  }#if(FALSE) -> better to make it with the previous function
	  }
  }
  
######################################
#Reads a biclustering file into a list 
######################################
#readGroups=function(file=NA)
#  	{
#	  if(is.na(file))
#		  stop("Error: a file name should be provided")
#	  text=scan(file, what="character", sep="\t")
#	  names=gsub(" ?: ?.*$", "", text[grep(" ?: ?", text)])
#	  starts=grep(" ?: ?", text)+2
#	  groups=sapply(1:(length(starts)-1), function(x){text[starts[x]:(starts[x+1]-3)]})
#	  groups=c(groups,list(text[starts[length(starts)]:length(text)]))
#	  names(groups)=names
#	  groups
 # 	}
	
readGroups=function(file=NA, onlyGenes=TRUE)
	{
		if(is.na(file))
			stop("Error: a file name should be provided")
		text=scan(file, what="character", sep="\n")
		locs=grep(" ?: ?", text)
		names=gsub(" ?: ?.*$", "", text[locs])
		starts=locs+1
		groups=strsplit(text[starts], "\t")
		if(onlyGenes==FALSE)
			{
			starts=locs+2
			groups=c(groups,strsplit(text[starts], "\t"))
			}
		names(groups)=names
		groups
	}
