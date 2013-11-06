########################## PIPELINE
#Pipeline with several experiments related to monocyte dcs under different environments, either fungi in the environment,
#compounds, tumours, or other cells.

# Download an experiment from ArrayExpress
# experimentID - accession name of the experiment (e.g. E-MEXP-1103, E-MTAB-135)
# raw - if TRUE, the experiment raw data are downloaded and normalized by RMA. If not, the
#       processed data submitted to ArrayExpress are returned. Default TRUE
# path - path to the file into which the experiment will be stored, in BicOverlapper format.
downloadAndExpresso=function(experimentID=NA, raw=TRUE, save=FALSE, path=NA)
	{
		###################################################
		#1) Download raw data to temp dir
		###################################################
		require(ArrayExpress)
		require(affy)
		if(raw==TRUE)
		{
			ae=ArrayExpress(accession = experimentID, save=save)
			
			###################################################
			#1b) EF curation
			#in case it is needed
			###################################################
			
			
			###############################################
			#2) Preprocess the experiments (by now, only one an only on serial mode)
			###############################################
			
			t0 <- proc.time()
			es = expresso(ae, 
					bgcorrect.method="rma",#TODO: Check CDF files, affymetrix ones are possibly outdated
					normalize.method = "quantiles.robust", 
					pmcorrect.method = "pmonly", summary.method = "medianpolish")
			cat("*** serial preprocessing takes " , round(proc.time()[3] - t0[3], 3), "sec\n") 
			cat("Allocated memory (MB): ",sum(sapply(ls(), function(x){object.size(get(x))}))/1000000, "\n")
		}
		
		###############################################
		#3) Generate new processed file for BicOverlapper, and if necessary (i.e. if re-curated), change the processed zip to all the sdrfs
		###############################################
		
		outName=paste(path, "/", notes(es)$accession, ".txt", sep="")
		write(c(paste(experimentData(es)@title, paste(annotation(es), "db", sep="."),sep="/"), phenoData(es)$Scan.Name), outName, ncolumns=length(sampleNames(es))+1, sep="\t")
		efs=gsub("\\.", "", gsub("Factor\\.Value\\.\\.", "", varLabels(ae)[grep("Factor\\.Value\\.\\.", varLabels(ae))]))
		efvs=lapply(grep("Factor\\.Value\\.\\.", varLabels(ae)), function(y){ae[[y]]})
		for(i in 1:length(efs))
		{
			values=efvs[[i]]
			invalid=grep("^[^a-zA-z0-9]", values)
			if(length(invalid)>0)
				values[invalid]=paste("X", values[invalid], sep="")
			print(values)
			write(c(efs[[i]], values), outName, ncolumns=length(sampleNames(es))+1, sep="\t", append=TRUE)
		}
		write.table(exprs(es), file=outName, sep="\t", quote=FALSE, row.names=TRUE, col.names=FALSE, append=TRUE)
	}
	
#downloadAndNormalize(experimentID="E-MEXP-328", save=FALSE, path="Z:")

# Download an experiment from ArrayExpress and normalizes it with justRMA
# (justRMA is reportedly much faster than expresso)
# experimentID - accession name of the experiment (e.g. E-MEXP-1103, E-MTAB-135)
# raw - if TRUE, the experiment raw data are downloaded and normalized by RMA. If not, the
#       processed data submitted to ArrayExpress are returned. Default TRUE
# save - if TRUE, the raw data are saved in the path specified
# path - path to the file into which the processed experiment will be stored, and where temp files will be saved
# fileName - file name for the processed experiment, that will be stored in BicOverlapper format. If fileName is NA
#			 the accession number of the experiment is used, with extension .txt
downloadAndNormalize=function(experimentID=NA, raw=TRUE, save=FALSE, path, fileName=NA)
{
	###################################################
	#1) Download raw data to temp dir
	###################################################
	require(ArrayExpress)
	require(affy)
	
	if(raw==TRUE)
	{
		ae=ArrayExpress(accession = experimentID, save=TRUE, path=path)
		
		###################################################
		#1b) EF curation
		#in case it is needed
		###################################################
		
		
		###############################################
		#2) Preprocess the experiments (by now, only one an only on serial mode)
		###############################################
		
		t0 <- proc.time()
		es = justRMA(celfile.path=path, verbose=TRUE)
		
		if(save==FALSE)
			{
			files=list.files(path)
			torem=files[c(grep("*.CEL", files), grep("*.adf*", files), grep("*.raw.1", files), grep("*.sdrf*", files), grep("*.idf*", files), grep("*.html", files))]
			file.remove(paste(path, torem, sep="/"))
		    }
			
		cat("*** serial preprocessing takes " , round(proc.time()[3] - t0[3], 3), "sec\n") 
		cat("Allocated memory (MB): ",sum(sapply(ls(), function(x){object.size(get(x))}))/1000000, "\n")
	}
	
	###############################################
	#3) Generate new processed file for BicOverlapper, and if necessary (i.e. if re-curated), change the processed zip to all the sdrfs
	###############################################
	
	#outName=paste(path, "/", notes(ae)$accession, ".txt", sep="")
	outName=paste(path, fileName, sep="/")
    write(c(paste(experimentData(ae)@title, paste(annotation(es), "db", sep="."),sep="/"), make.names(phenoData(ae)$Scan.Name)), outName, ncolumns=length(sampleNames(es))+1, sep="\t")
	efs=gsub("\\.", "", gsub("Factor\\.Value\\.", "", varLabels(ae)[grep("Factor\\.Value\\.", varLabels(ae))]))
	efvs=lapply(grep("Factor\\.Value\\.", varLabels(ae)), function(y){ae[[y]]})
	efs=gsub("^\\.", "", efs)
	for(i in 1:length(efs))
		{
			values=efvs[[i]]
			invalid=grep("^[^a-zA-z0-9]", values)
			if(length(invalid)>0)
				values[invalid]=paste("X", values[invalid], sep="")
			print(values)
			write(c(efs[[i]], values), outName, ncolumns=length(sampleNames(es))+1, sep="\t", append=TRUE)
		#write(c(efs[[i]], efvs[[i]]), outName, ncolumns=length(sampleNames(es))+1, sep="\t", append=TRUE)
		}
	write.table(exprs(es), file=outName, sep="\t", quote=FALSE, row.names=TRUE, col.names=FALSE, append=TRUE)
	rm(ae)
	rm(es)
	}
	
	
# Download an experiment from GEO
# experimentID - accession name of the experiment (e.g. E-MEXP-1103, E-MTAB-135)
# path - path to the file into which the processed experiment will be stored, and where temp files will be saved
# fileName - file name for the processed experiment, that will be stored in BicOverlapper format. If fileName is NA
#			 the accession number of the experiment is used, with extension .txt
# log - if log is TRUE, a log transform of the expression set is done
downloadGEO=function(experimentID=NA, path, log=FALSE, fileName=NA)
	{
		###################################################
		#1) Download data
		###################################################
		require(GEOquery)
		require(affy)
		
		t0 <- proc.time()
		es=getGEO(GEO = experimentID, destdir=path)[[1]]
		
		###############################################
		#2) Preprocess the experiments (just a log scaling)
		###############################################
		
		if(log)
			{
			#exprs(es)=log2(min(exprs(es))+exprs(es)+1)	#If 0 means something we might lose it
			exprs(es)[which(exprs(es)<0)]=-log2(abs(exprs(es)[which(exprs(es)<0)]-1))
			exprs(es)[which(exprs(es)>0)]=log2(abs(exprs(es)[which(exprs(es)>0)]+1))
			}
			
		cat("*** download takes " , round(proc.time()[3] - t0[3], 3), "sec\n") 
		cat("Allocated memory (MB): ",sum(sapply(ls(), function(x){object.size(get(x))}))/1000000, "\n")
		
		###############################################
		#3) Generate new processed file for BicOverlapper
		###############################################
		platform=getGEO(annotation(es))
		chip=tolower(gsub("[-_]", "", gsub("\\[", "", gsub("\\].*", "", platform@header$title))))
		
		if(is.na(fileName))	outName=paste(path, experimentID, sep="/")
		else				outName=paste(path, fileName, sep="/")
		
		write(c(paste(platform@header$organism, paste(chip, "db", sep="."),sep="/"), make.names(sampleNames(es))), outName, ncolumns=length(sampleNames(es))+1, sep="\t")
		write(c("Factors", as.character(pData(es)[,"title"])), outName, ncolumns=length(sampleNames(es))+1, sep="\t", append=TRUE)
		write.table(exprs(es), file=outName, sep="\t", quote=FALSE, row.names=TRUE, col.names=FALSE, append=TRUE)
		rm(es)
		rm(platform)
	}

                                                                                                                                                        

#downloadGEO("GSE7561", path="/Users/rodri", log=TRUE)


