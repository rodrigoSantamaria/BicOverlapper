#Binarize by the input threshold or using the mean if no treshold given
#Values strictly above the threshold are set to 1, the rest to 0
#If low is TRUE, then values below or equal to the threshold are set to 1 and the rest to 0
binarize2=function(x,threshold=NA, low=FALSE)
{
	matd=x
	if(is.na(threshold))
	{
		threshold=mean(x)
		print(paste("Threshold: ",threshold))
	}
	
	if(!low)
	{
		ind=which(matd<=threshold)
		matd[ind]=0
		matd[-ind]=1
	}
	else
	{
		ind=which(matd>=threshold)
		matd[ind]=0
		matd[-ind]=1
	}
	
	matd
}

#Binarize to get the input percentage of 1s over 0s
#The algorithm stops when it gets a density in [percentage-error, percentage+error]
#Gap is the initial increment taken in iterative search
binarizeByPercentage2=function(x,percentage,error=0.2,gap=0.1, low=FALSE)
{
	threshold=mean(x)
	dens=percentage
	#print(paste("Threshold es:",threshold))
	slope=0
	slopeAnt=0
	repeat
	{
		matd=binarize2(x,threshold, low)
		densNew=densityOnes(matd)
		#print(paste("Dens:", dens, "new", densNew))
		if(densNew==0)
		{
			matd=binarize2(x,threshold-gap, low)
			break
		}
		if(slope!=slopeAnt && dens==densNew)
			{
				#print(paste("Best result possible"))
				break
			}
		dens=densNew
		print(dens)
		if(dens>percentage)
		{
			slopeAnt=slope
			if(!low)
			{	
				slope=1
				threshold=threshold+gap
			}
			else
			{	
				slope=-1
				threshold=threshold-gap
			}
		}
		else
		{
			slopeAnt=slope
			if(!low)
			{
				slope=-1
				threshold=threshold-gap
			}
			else
			{
				slope=1
				threshold=threshold+gap
			}
		}
		if(dens>=(percentage-error) && dens<=(percentage+error))
		{
		#	print("nos metemos aqui")
			break
		}
		if(slopeAnt!=0 && slope!=slopeAnt)	gap=gap/2
	}
	matd
}

#---------------------- DENSITY -------------------------
#Percentage of 1s in the matrix
densityOnes=function(x)
{
	num1=length(x[x==1])
	num0=length(x[x==0])
	if((num1+num0)!=prod(dim(x))) print("Error: x must be a binary matrix")
	else
	{
		den=(num1/prod(dim(x)))*100  #Density of 1s over 0s
		den
	}
}