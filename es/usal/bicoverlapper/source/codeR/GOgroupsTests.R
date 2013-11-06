# TODO: Add comment
# 
# Author: Rodrigo
###############################################################################


library(hgu95av2.db)
library(YEAST)
library(GO.db)
library(annotate)

#YEAST()
#hgu95av2()

yeastGroup=c("YCR012W", "YGR192C", "YJR009C", "YKL060C", "YKL152C")
homoGroup=c("738_at", "40840_at", "41668_r_at")

get(yeastGroup,YEASTGENENAME)
n=names(mget(yeastGroup, YEASTGO))
all=mget(yeastGroup, YEASTGO)
names(mget(homoGroup, hgu95av2GO))

l=getGOTerms(yeastGroup, YEASTGO)
l=getGOTerms(c("36780_at"), hgu95av2GO)
l=unique(unlist(tal))
l=l[grep("GO:.*", l)]
gt=getGOTermsByGOID(l)

terms=c()
terms=sapply(homoGroup, function(x){names(get(x, hgu95av2GO))})
#sapply(names(terms), function(x){print(paste("Este es ",terms[x])) })
#sapply(names(terms), function(x){print(paste("Este es ",mget(unlist(terms[x]),GOTERM) )) })
tal=sapply(names(terms), function(x)
		{
		save=mget(unlist(terms[x]),GOTERM)
		setClass("goterms", representation(ids="character", evidences="integer", terms="character", ontologies="character", definitions="character"))
		goterms=new("goterms")
		goterms@ids=sapply(save, function(y){GOID(y)})
		goterms@terms=sapply(save, function(y){Term(y)})
		goterms@ontologies=sapply(save, function(y){Ontology(y)})
		goterms@definitions=sapply(save, function(y){Definition(y)})
		goterms
		})
Term(tal[[1]][[1]])

hg=c("AFFX-BioC-5_st", "AFFX-BioDn-3_at", "AFFX-CreX-3_at", "AFFX-CreX-3_st", "AFFX-CreX-5_at", "AFFX-HSAC07/X00351_3_at", "AFFX-HSAC07/X00351_5_at", "AFFX-HSAC07/X00351_M_at", "AFFX-HUMGAPDH/M33197_3_at", "AFFX-HUMGAPDH/M33197_5_at", "AFFX-HUMGAPDH/M33197_M_at", "AFFX-hum_alu_at", "162_at", "189_s_at", "201_s_at", "209_at", "210_at", "216_at", "239_at", "254_at", "256_s_at", "260_at", "290_s_at", "296_at", "297_g_at", "309_f_at", "327_f_at", "335_r_at", "347_s_at", "428_s_at", "429_f_at", "471_f_at", "556_s_at", "568_at", "608_at", "609_f_at", "627_g_at", "654_at", "657_at", "675_at", "676_g_at", "697_f_at", "718_at", "719_g_at", "729_i_at", "769_s_at", "870_f_at", "878_s_at", "880_at", "882_at", "887_at", "911_s_at", "916_at", "924_s_at", "926_at", "932_i_at", "960_g_at", "970_r_at", "1009_at", "1052_s_at", "1091_at", "1111_at", "1117_at", "1122_f_at", "1134_at", "1161_at", "1173_g_at", "1179_at", "1180_g_at", "1204_at", "1252_at", "1268_at", "1288_s_at", "1315_at", "1323_at", "1346_at", "1366_i_at", "1367_f_at", "1394_at", "1410_at", "1420_s_at", "1424_s_at", "1452_at", "1462_s_at", "1506_at", "1518_at", "1612_s_at", "1651_at", "1653_at", "1659_s_at", "1664_at", "1676_s_at", "1689_at", "1707_g_at", "1718_at", "1748_s_at", "1836_at", "1936_s_at", "1980_s_at", "2016_s_at", "2035_s_at", "2039_s_at", "2082_s_at", "2084_s_at", "2090_i_at", "2092_s_at", "31317_r_at", "31330_at", "31334_at", "31380_at", "31385_at", "31391_at", "31393_r_at", "31396_r_at", "31406_at", "31419_r_at", "31428_at", "31440_at", "31444_s_at", "31481_s_at", "31505_at", "31508_at", "31509_at", "31510_s_at", "31511_at", "31525_s_at", "31527_at", "31536_at", "31538_at", "31545_at", "31546_at", "31557_at", "31568_at", "31573_at", "31583_at", "31584_at", "31597_r_at", "31622_f_at", "31623_f_at", "31637_s_at", "31640_r_at", "31674_s_at", "31687_f_at", "31697_s_at", "31705_at", "31708_at", "31716_at", "31722_at", "31727_at", "31749_f_at", "31815_r_at", "31828_r_at", "31834_r_at", "31841_at", "31846_at", "31901_at", "31907_at", "31933_r_at", "31947_r_at", "31952_at", "31955_at", "31956_f_at", "31957_r_at", "31962_at", "31970_r_at", "31980_at", "31992_f_at", "32007_at", "32052_at", "32062_at", "32092_at", "32093_at", "32100_r_at", "32109_at", "32138_at", "32145_at", "32152_at", "32153_s_at", "32173_at", "32175_at", "32204_at", "32218_at", "32220_at", "32243_g_at", "32251_at", "32254_at", "32260_at", "32272_at", "32276_at", "32315_at", "32316_s_at", "32318_s_at", "32323_at", "32324_at", "32330_at", "32334_f_at", "32335_r_at", "32336_at", "32337_at", "32341_f_at", "32378_at", "32392_s_at", "32394_s_at", "32395_r_at", "32404_at", "32409_at", "32412_at", "32432_f_at", "32435_at", "32436_at", "32437_at", "32438_at", "32440_at", "32444_at", "32458_f_at", "32459_at", "32466_at", "32469_at", "32471_at", "32487_s_at", "32530_at", "32531_at", "32553_at", "32569_at", "32607_at", "32611_at", "32623_at", "32650_at", "32676_at", "32701_at", "32744_at", "32747_at", "32748_at", "32763_r_at", "32774_at", "32794_g_at", "32923_r_at", "32933_r_at", "32949_at", "32964_at", "33045_r_at", "33080_s_at", "33102_at", "33116_f_at", "33182_at", "33267_at", "33341_at", "33357_at", "33398_at", "33438_at", "33443_at", "33449_at", "33451_s_at", "33458_r_at", "33467_at", "33485_at", "33535_at", "33580_r_at", "33614_at", "33619_at", "33656_at", "33657_at", "33659_at", "33660_at", "33666_at", "33667_at", "33668_at", "33674_at", "33676_at", "33677_at", "33678_i_at", "33679_f_at", "33727_r_at", "33779_at", "33782_r_at", "33819_at", "33820_g_at", "33822_at", "33825_at", "33833_at", "33835_at", "33856_at", "33859_at", "33862_at", "33878_at", "33889_s_at", "33913_at", "33925_at", "33942_s_at", "33943_at", "33950_g_at", "33984_at", "33987_at", "33988_at", "33994_g_at", "34008_at", "34085_at", "34091_s_at", "34131_at", "34160_at", "34166_at", "34241_at", "34278_at", "34279_at", "34281_at", "34301_r_at", "34303_at", "34317_g_at", "34342_s_at", "34377_at", "34381_at", "34392_s_at", "34400_at", "34462_at", "34485_r_at", "34495_r_at", "34503_at", "34504_at", "34548_at", "34570_at", "34592_at", "34593_g_at", "34608_at", "34609_g_at", "34639_at", "34643_at", "34644_at", "34645_at", "34646_at", "34679_at", "34727_at", "34728_g_at", "34792_at", "34800_at", "34820_at", "34832_s_at", "34841_at", "34842_at", "34873_at", "34889_at", "34891_at", "34894_r_at", "34912_at", "34951_at", "35027_at", "35028_at", "35047_at", "35083_at", "35112_at", "35119_at", "35125_at", "35147_at", "35154_at", "35174_i_at", "35276_at", "35278_at", "35282_r_at", "35352_at", "35354_at", "35363_at", "35367_at", "35386_at", "35395_at", "35412_at", "35418_at", "35420_r_at", "35443_at", "35444_at", "35450_s_at", "35468_at", "35485_at", "35531_at", "35670_at", "35691_r_at", "35693_at", "35741_at", "35745_f_at", "35746_r_at", "35747_at", "35748_at", "35755_at", "35767_at", "35769_at", "35778_at", "35782_at", "35785_at", "35787_at", "35792_at", "35816_at", "35817_at", "35834_at", "35837_at", "35842_at", "35846_at", "35852_at", "35897_r_at", "35905_s_at", "35917_at", "35941_f_at", "36042_at", "36095_at", "36114_r_at", "36130_f_at", "36138_at", "36140_at", "36148_at", "36152_at", "36155_at", "36159_s_at", "36162_at", "36169_at", "36174_at", "36192_at", "36198_at", "36222_at", "36226_r_at", "36266_at", "36267_at", "36276_at", "36285_at", "36333_at", "36348_r_at", "36358_at", "36449_s_at", "36452_at", "36453_at", "36546_r_at", "36547_r_at", "36555_at", "36563_at", "36572_r_at", "36587_at", "36596_r_at", "36606_at", "36608_at", "36609_at", "36616_at", "36620_at", "36627_at", "36666_at", "36668_at", "36681_at", "36774_f_at", "36780_at", "36785_at", "36795_at", "36815_at", "36881_at", "36931_at", "36938_at", "36939_at", "36941_at", "36948_at", "36975_at", "36986_at", "36994_at", "36996_at", "36999_at", "37003_at", "37005_at", "37027_at", "37033_s_at", "37035_at", "37082_at", "37085_g_at", "37191_at", "37192_at", "37210_at", "37251_s_at", "37268_at", "37270_at", "37272_at", "37298_at", "37307_at", "37309_at", "37321_at", "37383_f_at", "37405_at", "37406_at", "37408_at", "37448_s_at", "37449_i_at", "37450_r_at", "37463_r_at", "37572_at", "37596_at", "37628_at", "37657_at", "37677_at", "37687_i_at", "37692_at", "37710_at", "37720_at", "37743_at", "37746_r_at", "37760_at", "37763_at", "37834_at", "37853_at", "37885_at", "37898_r_at", "37905_r_at", "37967_at", "37970_at", "38003_s_at", "38010_at", "38023_at", "38042_at", "38044_at", "38048_at", "38058_at", "38060_at", "38061_at", "38080_at", "38088_r_at", "38110_at", "38163_at", "38166_r_at", "38174_at", "38308_g_at", "38334_g_at", "38385_at", "38406_f_at", "38407_r_at", "38408_at", "38437_at", "38451_at", "38484_at", "38512_r_at", "38524_at", "38535_at", "38542_at", "38590_r_at", "38612_at", "38657_s_at", "38690_at", "38700_at", "38704_at", "38707_r_at", "38730_at", "38738_at", "38740_at", "38751_i_at", "38752_r_at", "38758_at", "38779_r_at", "38832_r_at", "38840_s_at", "38848_at", "38855_s_at", "38963_i_at", "38967_at", "38971_r_at", "38972_at", "38974_at", "39025_at", "39026_r_at", "39027_at", "39032_at", "39046_at", "39051_at", "39054_at", "39070_at", "39072_at", "39081_at", "39112_at", "39122_at", "39127_f_at", "39128_r_at", "39157_at", "39177_r_at", "39201_r_at", "39294_at", "39308_r_at", "39326_at", "39331_at", "39332_at", "39336_at", "39341_at", "39370_at", "39382_at", "39388_at", "39406_at", "39415_at", "39427_at", "39455_r_at", "39504_at", "39542_at", "39556_at", "39557_at", "39561_at", "39594_f_at", "39624_at", "39630_at", "39633_at", "39689_at", "39709_at", "39712_at", "39714_at", "39726_at", "39739_at", "39740_g_at", "39741_at", "39758_f_at", "39760_at", "39775_at", "39795_at", "39798_at", "39803_s_at", "39830_at", "39854_r_at", "39859_r_at", "39866_at", "39869_at", "39878_at", "39881_at", "39914_r_at", "39916_r_at", "39920_r_at", "39921_at", "39966_at", "40003_at", "40042_r_at", "40055_s_at", "40075_at", "40103_at", "40107_at", "40125_at", "40163_r_at", "40185_at", "40223_r_at", "40234_at", "40240_at", "40281_at", "40295_at", "40299_at", "40309_at", "40324_r_at", "40419_at", "40436_g_at", "40480_s_at", "40482_s_at", "40484_g_at", "40504_at", "40512_at", "40522_at", "40567_at", "40568_at", "40580_r_at", "40594_r_at", "40607_at", "40622_r_at", "40635_at", "40637_at", "40650_r_at", "40746_at", "40752_at", "40771_at", "40783_s_at", "40825_at", "40841_at", "40862_i_at", "40863_r_at", "40864_at", "40875_s_at", "40877_s_at", "40886_at", "40887_g_at", "40898_at", "40926_at", "40953_at", "40959_at", "40961_at", "40995_at", "41036_at", "41042_r_at", "41074_at", "41107_at", "41125_r_at", "41135_at", "41136_s_at", "41143_at", "41152_f_at", "41158_at", "41178_at", "41185_f_at", "41194_at", "41206_r_at", "41213_at", "41220_at", "41221_at", "41231_f_at", "41233_at", "41237_at", "41246_at", "41255_at", "41268_g_at", "41269_r_at", "41273_at", "41279_f_at", "41280_r_at", "41288_at", "41295_at", "41302_at", "41312_r_at", "41338_at", "41383_at", "41446_f_at", "41483_s_at", "41484_r_at", "41492_r_at", "41498_at", "41535_at", "41542_at", "41624_r_at", "41644_at", "41675_at", "41745_at", "41759_at", "41760_at", "41765_at", "41768_at", "41785_at", "41807_at", "160029_at")

t=getGOTerms2(hg, hgu95av2GO)

got=getGOTerms2(homoGroup, hgu95av2GO)
got[[1]]@ids

terms=as.character(unlist(terms))
terms=rle(sort(terms))

setClass("other", representation(gene="character", ids="list", evidences="list", terms="list", ontologies="list", definitions="list"))
goterms=new("other")
goterms@gene=names(terms)

goterms@ids=new("list")
tal=c()
tal=sapply(goterms@gene, function(x){tal=c(tal,get(x,hgu95av2GO))})

tt=c()

goid=sapply(tal,function(y)#para cada gen
			{
			ret=sapply(y, function(x)#para cada t. go asociado al gen
					{
					#print(paste("GOID",x[1]))
					devolver=c(devolver,x[1])
					devolver
					})
			goterms@ids=list(goterms@ids, ret)
			})

sapply(tal$`738_at`, function(x){x})

goterms@ids=terms$values
goterms@evidences=terms$lengths
desc=sapply(goterms@ids, function(x){get(x, GOTERM)})
goterms@terms=sapply(desc, function(x){Term(x)})
goterms@ontologies=sapply(desc, function(x){Ontology(x)})
goterms@definitions=sapply(desc, function(x){Definition(x)})
goterms



tal=getGOIDS(homoGroup, hgu95av2GO)
tal=unlist(tal)
getGOTerm(tal[1])
cual=sapply(tal, function(x) getGOTerm(x))