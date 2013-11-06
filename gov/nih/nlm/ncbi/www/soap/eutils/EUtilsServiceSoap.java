/**
 * EUtilsServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils;

public interface EUtilsServiceSoap extends java.rmi.Remote {
    public gov.nih.nlm.ncbi.www.soap.eutils.egquery.Result run_eGquery(gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGqueryRequest parameters) throws java.rmi.RemoteException;
    public gov.nih.nlm.ncbi.www.soap.eutils.egquery.ResultMS run_eGquery_MS(gov.nih.nlm.ncbi.www.soap.eutils.egquery.EGqueryRequestMS parameters) throws java.rmi.RemoteException;
    public gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResult run_eInfo(gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoRequest parameters) throws java.rmi.RemoteException;
    public gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultMS run_eInfo_MS(gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoRequestMS parameters) throws java.rmi.RemoteException;
    public gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResult run_eSearch(gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequest parameters) throws java.rmi.RemoteException;
    public gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultMS run_eSearch_MS(gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchRequestMS parameters) throws java.rmi.RemoteException;
    public gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryResult run_eSummary(gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequest parameters) throws java.rmi.RemoteException;
    public gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryResultMS run_eSummary_MS(gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryRequestMS parameters) throws java.rmi.RemoteException;
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkResult run_eLink(gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequest parameters) throws java.rmi.RemoteException;
    public gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkResultMS run_eLink_MS(gov.nih.nlm.ncbi.www.soap.eutils.elink.ELinkRequestMS parameters) throws java.rmi.RemoteException;
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.EFetchResult run_eFetch(gov.nih.nlm.ncbi.www.soap.eutils.efetch.EFetchRequest parameters) throws java.rmi.RemoteException;
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.EFetchResultMS run_eFetch_MS(gov.nih.nlm.ncbi.www.soap.eutils.efetch.EFetchRequestMS parameters) throws java.rmi.RemoteException;
    public gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellResult run_eSpell(gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequest parameters) throws java.rmi.RemoteException;
    public gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellResultMS run_eSpell_MS(gov.nih.nlm.ncbi.www.soap.eutils.espell.ESpellRequestMS parameters) throws java.rmi.RemoteException;
}
