To run the code:
1) Include all .jar in the lib folder in the project (some of them might not be necessary, but most all. Anyways, it needs a bit of cleaning)
2) Use VM arguments as follows:
-Xmx1024m -d64 -Xrs -Djava.library.path="/Library/Frameworks/R.framework/Resources/library/rJava/jri"
(-Djava.library.path must point to the jri folder of the rJava package installed in R)
(-d64 is only necessary in 64 bit machines)
3) Add the environment variable R_HOME pointing to the install folder of R (where the lib, bin, etc. are located). For example, in the case of Max OS 10.6, this uses to be /Library/Frameworks/R.framework/Resources

In the case of Debian:
-Djava.libary.path="/home/xxx/R/x86_64-pc-linux-gnu-library/3.3/rJava/jri" R_HOME=/usr/lib/R
In the case of Debian with anaconda for R:
-Djava.library.path="/home/xxx/anaconda3/lib/R/library/rJava/jri"
R_HOME=/home/xxx/anaconda3/lib/R

4) Note that several R/Bioconductor packages must be installed in order to get all the functionality of BicOverlapper:

	From R:
	rJava, XML
	
	From BioConductor:
	annotate, GO.db, GOstats - for gene annotation
	biomaRt				- for gene annotation 
	biclust, limma, isa2, GSEAlm	- for analysis
	ArrayExpress, GEOquery - for experiment download (NOTE: GEOquery may require curl)
	Platform annotation packages - for specific platforms (e.g hgu133plus2.db or org.Sc.sgd.db)
	
	
	For example in Debian+anaconda:
	
	conda install -c bioconda bioconductor-annotate
	conda install -c bioconda bioconductor-go.db
	conda install -c bioconda bioconductor-gostats
	conda install -c bioconda bioconductor-biomart
	
	conda install -c conda-forge r-biclust 
	conda install -c bioconda bioconductor-limma
	conda install -c bioconda bioconductor-hgu133plus2.db
	conda install -c bioconda bioconductor-org.sc.sgd.db
	 
	
	
	
	
	

