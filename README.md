To run the code:
1) Include all .jar in the lib folder in the project (some of them might not be necessary, but most all. Anyways, it needs a bit of cleaning)
2) Use VM arguments as follows:
-Xmx1024m -d32 -Xrs -Djava.library.path="/Library/Frameworks/R.framework/Resources/library/rJava/jri"
(-Djava.library.path must point to the jri folder of the rJava package installed in R)
(-d32 is only necessary in 64 bit machines)
3) Add the enrivonment variable R_HOME pointing to the install folder of R (where the lib, bin, etc. are located). For example, in the case of Max OS 10.6, this uses to be /Library/Frameworks/R.framework/Resources
4) Note that several R/Bioconductor packages must be installed in order to get all the functionality of BicOverlapper:

	From R:
	rJava, XML
	
	From BioConductor:
	annotate, GO.db, GOstats - for gene annotation
	biomaRt				- for gene annotation 
	biclust, limma, isa2, GSEAlm	- for analysis
	ArrayExpress, GEOquery - for experiment download (NOTE: GEOquery may require curl)
	Platform annotation packages - for specific platforms (e.g hgu133v2.db or org.Sc.sgd.db)

