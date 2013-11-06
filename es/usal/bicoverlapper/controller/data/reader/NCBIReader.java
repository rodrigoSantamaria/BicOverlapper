package es.usal.bicoverlapper.controller.data.reader;

import gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceLocator;
import gov.nih.nlm.ncbi.www.soap.eutils.EUtilsServiceSoap;
import gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGqueryRequest;
import gov.nih.nlm.ncbi.www.soap.eutils.egquery.Result;
import gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequest;
import gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResult;
import gov.nih.nlm.ncbi.www.soap.eutils.esearch.IdListType;
import gov.nih.nlm.ncbi.www.soap.eutils.esummary.DocSumType;
import gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequest;
import gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryResult;

/**
 * NCBI Entrez database reader
 * @author Rodrigo rodri@usal.es
 *
 */
public class NCBIReader {
	public static void eGquery(String query)
		{
        // run_eGquery_MS provides Entrez database counts for a single search 
        try
        {
            EUtilsServiceLocator service = new EUtilsServiceLocator();
            EUtilsServiceSoap utils = service.geteUtilsServiceSoap();
            // call NCBI EGQuery utility
            Result res = utils.run_eGquery(new EGqueryRequest(query, "bicOverlapper", "rodri@usal.es"));
            // results output
            System.out.println("Search term: " + res.getTerm());
            System.out.println("Results: ");
            for(int i=0; i<res.getEGQueryResult().getResultItem().length; i++) 
            {
                System.out.println( "  " + res.getEGQueryResult().getResultItem()[i].getDbName() + 
                                    ": " + res.getEGQueryResult().getResultItem()[i].getCount() );
            }
        }
        catch(Exception e) { System.out.println(e.toString()); }
		}
	
	//funciona bien, pero es un poco lenta (10seg)
	public static IdListType eGeneQuery(String query)
	{
	       // search in PubMed Central for stem cells in free fulltext articles
        try
        {
            EUtilsServiceLocator service = new EUtilsServiceLocator();
            EUtilsServiceSoap utils = service.geteUtilsServiceSoap();//Esto tarda bastante
            // call NCBI ESearch utility
            // NOTE: search term should be URL encoded 
            ESearchRequest parameters = new ESearchRequest();
            parameters.setDb("gene");
            //parameters.setDb("genome");
            parameters.setTerm(query);
            parameters.setTool("BicOverlapper");
            parameters.setEmail("rodri@usal.es");
            parameters.setRetMax("10");
            
            ESearchResult res = utils.run_eSearch(parameters);//Pero esto es lógicamente lo que más tarda
            // results output
          //  System.out.println("Original query: "+query);
          //  System.out.println("Found ids: " + res.getCount());
         //   System.out.print("First " + res.getRetMax() +" ids: ");
           
            return res.getIdList();
        }
        catch(Exception e) { System.out.println(e.toString()); }
        return null;
	}
	
	//TODO: funciona bien, pero no toma nada de GO!!!
	//ids pueden ser varios separados por comas
	public static DocSumType[] eGeneSummary(String ids)
		{
		// retrieves document Summaries by list of primary IDs
        try
        {
            EUtilsServiceLocator service = new EUtilsServiceLocator();
            EUtilsServiceSoap utils = service.geteUtilsServiceSoap();
            // call NCBI ESummary utility
            ESummaryRequest params = new ESummaryRequest();
            params.setDb("gene");
            //params.setDb("genome");
            //params.setDb("go");
            params.setId(ids);
            ESummaryResult res = utils.run_eSummary(params);
            // results output
          
            return res.getDocSum();
        }catch(Exception e) { e.printStackTrace(); }
		return null;
		}

}

