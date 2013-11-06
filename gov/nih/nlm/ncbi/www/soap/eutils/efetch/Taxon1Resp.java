/**
 * Taxon1Resp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Taxon1Resp  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_errorType taxon1Resp_error;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_init taxon1Resp_init;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_findnameType taxon1Resp_findname;

    private java.lang.String taxon1Resp_getdesignator;

    private java.lang.String taxon1Resp_getunique;

    private java.lang.String taxon1Resp_getidbyorg;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getorgnamesType taxon1Resp_getorgnames;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getcdeType taxon1Resp_getcde;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getranksType taxon1Resp_getranks;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getdivsType taxon1Resp_getdivs;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getgcsType taxon1Resp_getgcs;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getlineageType taxon1Resp_getlineage;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getchildrenType taxon1Resp_getchildren;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getbyidType taxon1Resp_getbyid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_lookupType taxon1Resp_lookup;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getorgmodType taxon1Resp_getorgmod;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_fini taxon1Resp_fini;

    private java.lang.String taxon1Resp_id4Gi;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_taxabyidType taxon1Resp_taxabyid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_taxachildrenType taxon1Resp_taxachildren;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_taxalineageType taxon1Resp_taxalineage;

    private java.lang.String taxon1Resp_maxtaxid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getproptypesType taxon1Resp_getproptypes;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getorgpropType taxon1Resp_getorgprop;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_searchnameType taxon1Resp_searchname;

    public Taxon1Resp() {
    }

    public Taxon1Resp(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_errorType taxon1Resp_error,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_init taxon1Resp_init,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_findnameType taxon1Resp_findname,
           java.lang.String taxon1Resp_getdesignator,
           java.lang.String taxon1Resp_getunique,
           java.lang.String taxon1Resp_getidbyorg,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getorgnamesType taxon1Resp_getorgnames,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getcdeType taxon1Resp_getcde,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getranksType taxon1Resp_getranks,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getdivsType taxon1Resp_getdivs,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getgcsType taxon1Resp_getgcs,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getlineageType taxon1Resp_getlineage,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getchildrenType taxon1Resp_getchildren,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getbyidType taxon1Resp_getbyid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_lookupType taxon1Resp_lookup,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getorgmodType taxon1Resp_getorgmod,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_fini taxon1Resp_fini,
           java.lang.String taxon1Resp_id4Gi,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_taxabyidType taxon1Resp_taxabyid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_taxachildrenType taxon1Resp_taxachildren,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_taxalineageType taxon1Resp_taxalineage,
           java.lang.String taxon1Resp_maxtaxid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getproptypesType taxon1Resp_getproptypes,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getorgpropType taxon1Resp_getorgprop,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_searchnameType taxon1Resp_searchname) {
           this.taxon1Resp_error = taxon1Resp_error;
           this.taxon1Resp_init = taxon1Resp_init;
           this.taxon1Resp_findname = taxon1Resp_findname;
           this.taxon1Resp_getdesignator = taxon1Resp_getdesignator;
           this.taxon1Resp_getunique = taxon1Resp_getunique;
           this.taxon1Resp_getidbyorg = taxon1Resp_getidbyorg;
           this.taxon1Resp_getorgnames = taxon1Resp_getorgnames;
           this.taxon1Resp_getcde = taxon1Resp_getcde;
           this.taxon1Resp_getranks = taxon1Resp_getranks;
           this.taxon1Resp_getdivs = taxon1Resp_getdivs;
           this.taxon1Resp_getgcs = taxon1Resp_getgcs;
           this.taxon1Resp_getlineage = taxon1Resp_getlineage;
           this.taxon1Resp_getchildren = taxon1Resp_getchildren;
           this.taxon1Resp_getbyid = taxon1Resp_getbyid;
           this.taxon1Resp_lookup = taxon1Resp_lookup;
           this.taxon1Resp_getorgmod = taxon1Resp_getorgmod;
           this.taxon1Resp_fini = taxon1Resp_fini;
           this.taxon1Resp_id4Gi = taxon1Resp_id4Gi;
           this.taxon1Resp_taxabyid = taxon1Resp_taxabyid;
           this.taxon1Resp_taxachildren = taxon1Resp_taxachildren;
           this.taxon1Resp_taxalineage = taxon1Resp_taxalineage;
           this.taxon1Resp_maxtaxid = taxon1Resp_maxtaxid;
           this.taxon1Resp_getproptypes = taxon1Resp_getproptypes;
           this.taxon1Resp_getorgprop = taxon1Resp_getorgprop;
           this.taxon1Resp_searchname = taxon1Resp_searchname;
    }


    /**
     * Gets the taxon1Resp_error value for this Taxon1Resp.
     * 
     * @return taxon1Resp_error
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_errorType getTaxon1Resp_error() {
        return taxon1Resp_error;
    }


    /**
     * Sets the taxon1Resp_error value for this Taxon1Resp.
     * 
     * @param taxon1Resp_error
     */
    public void setTaxon1Resp_error(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_errorType taxon1Resp_error) {
        this.taxon1Resp_error = taxon1Resp_error;
    }


    /**
     * Gets the taxon1Resp_init value for this Taxon1Resp.
     * 
     * @return taxon1Resp_init
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_init getTaxon1Resp_init() {
        return taxon1Resp_init;
    }


    /**
     * Sets the taxon1Resp_init value for this Taxon1Resp.
     * 
     * @param taxon1Resp_init
     */
    public void setTaxon1Resp_init(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_init taxon1Resp_init) {
        this.taxon1Resp_init = taxon1Resp_init;
    }


    /**
     * Gets the taxon1Resp_findname value for this Taxon1Resp.
     * 
     * @return taxon1Resp_findname
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_findnameType getTaxon1Resp_findname() {
        return taxon1Resp_findname;
    }


    /**
     * Sets the taxon1Resp_findname value for this Taxon1Resp.
     * 
     * @param taxon1Resp_findname
     */
    public void setTaxon1Resp_findname(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_findnameType taxon1Resp_findname) {
        this.taxon1Resp_findname = taxon1Resp_findname;
    }


    /**
     * Gets the taxon1Resp_getdesignator value for this Taxon1Resp.
     * 
     * @return taxon1Resp_getdesignator
     */
    public java.lang.String getTaxon1Resp_getdesignator() {
        return taxon1Resp_getdesignator;
    }


    /**
     * Sets the taxon1Resp_getdesignator value for this Taxon1Resp.
     * 
     * @param taxon1Resp_getdesignator
     */
    public void setTaxon1Resp_getdesignator(java.lang.String taxon1Resp_getdesignator) {
        this.taxon1Resp_getdesignator = taxon1Resp_getdesignator;
    }


    /**
     * Gets the taxon1Resp_getunique value for this Taxon1Resp.
     * 
     * @return taxon1Resp_getunique
     */
    public java.lang.String getTaxon1Resp_getunique() {
        return taxon1Resp_getunique;
    }


    /**
     * Sets the taxon1Resp_getunique value for this Taxon1Resp.
     * 
     * @param taxon1Resp_getunique
     */
    public void setTaxon1Resp_getunique(java.lang.String taxon1Resp_getunique) {
        this.taxon1Resp_getunique = taxon1Resp_getunique;
    }


    /**
     * Gets the taxon1Resp_getidbyorg value for this Taxon1Resp.
     * 
     * @return taxon1Resp_getidbyorg
     */
    public java.lang.String getTaxon1Resp_getidbyorg() {
        return taxon1Resp_getidbyorg;
    }


    /**
     * Sets the taxon1Resp_getidbyorg value for this Taxon1Resp.
     * 
     * @param taxon1Resp_getidbyorg
     */
    public void setTaxon1Resp_getidbyorg(java.lang.String taxon1Resp_getidbyorg) {
        this.taxon1Resp_getidbyorg = taxon1Resp_getidbyorg;
    }


    /**
     * Gets the taxon1Resp_getorgnames value for this Taxon1Resp.
     * 
     * @return taxon1Resp_getorgnames
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getorgnamesType getTaxon1Resp_getorgnames() {
        return taxon1Resp_getorgnames;
    }


    /**
     * Sets the taxon1Resp_getorgnames value for this Taxon1Resp.
     * 
     * @param taxon1Resp_getorgnames
     */
    public void setTaxon1Resp_getorgnames(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getorgnamesType taxon1Resp_getorgnames) {
        this.taxon1Resp_getorgnames = taxon1Resp_getorgnames;
    }


    /**
     * Gets the taxon1Resp_getcde value for this Taxon1Resp.
     * 
     * @return taxon1Resp_getcde
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getcdeType getTaxon1Resp_getcde() {
        return taxon1Resp_getcde;
    }


    /**
     * Sets the taxon1Resp_getcde value for this Taxon1Resp.
     * 
     * @param taxon1Resp_getcde
     */
    public void setTaxon1Resp_getcde(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getcdeType taxon1Resp_getcde) {
        this.taxon1Resp_getcde = taxon1Resp_getcde;
    }


    /**
     * Gets the taxon1Resp_getranks value for this Taxon1Resp.
     * 
     * @return taxon1Resp_getranks
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getranksType getTaxon1Resp_getranks() {
        return taxon1Resp_getranks;
    }


    /**
     * Sets the taxon1Resp_getranks value for this Taxon1Resp.
     * 
     * @param taxon1Resp_getranks
     */
    public void setTaxon1Resp_getranks(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getranksType taxon1Resp_getranks) {
        this.taxon1Resp_getranks = taxon1Resp_getranks;
    }


    /**
     * Gets the taxon1Resp_getdivs value for this Taxon1Resp.
     * 
     * @return taxon1Resp_getdivs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getdivsType getTaxon1Resp_getdivs() {
        return taxon1Resp_getdivs;
    }


    /**
     * Sets the taxon1Resp_getdivs value for this Taxon1Resp.
     * 
     * @param taxon1Resp_getdivs
     */
    public void setTaxon1Resp_getdivs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getdivsType taxon1Resp_getdivs) {
        this.taxon1Resp_getdivs = taxon1Resp_getdivs;
    }


    /**
     * Gets the taxon1Resp_getgcs value for this Taxon1Resp.
     * 
     * @return taxon1Resp_getgcs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getgcsType getTaxon1Resp_getgcs() {
        return taxon1Resp_getgcs;
    }


    /**
     * Sets the taxon1Resp_getgcs value for this Taxon1Resp.
     * 
     * @param taxon1Resp_getgcs
     */
    public void setTaxon1Resp_getgcs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getgcsType taxon1Resp_getgcs) {
        this.taxon1Resp_getgcs = taxon1Resp_getgcs;
    }


    /**
     * Gets the taxon1Resp_getlineage value for this Taxon1Resp.
     * 
     * @return taxon1Resp_getlineage
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getlineageType getTaxon1Resp_getlineage() {
        return taxon1Resp_getlineage;
    }


    /**
     * Sets the taxon1Resp_getlineage value for this Taxon1Resp.
     * 
     * @param taxon1Resp_getlineage
     */
    public void setTaxon1Resp_getlineage(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getlineageType taxon1Resp_getlineage) {
        this.taxon1Resp_getlineage = taxon1Resp_getlineage;
    }


    /**
     * Gets the taxon1Resp_getchildren value for this Taxon1Resp.
     * 
     * @return taxon1Resp_getchildren
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getchildrenType getTaxon1Resp_getchildren() {
        return taxon1Resp_getchildren;
    }


    /**
     * Sets the taxon1Resp_getchildren value for this Taxon1Resp.
     * 
     * @param taxon1Resp_getchildren
     */
    public void setTaxon1Resp_getchildren(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getchildrenType taxon1Resp_getchildren) {
        this.taxon1Resp_getchildren = taxon1Resp_getchildren;
    }


    /**
     * Gets the taxon1Resp_getbyid value for this Taxon1Resp.
     * 
     * @return taxon1Resp_getbyid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getbyidType getTaxon1Resp_getbyid() {
        return taxon1Resp_getbyid;
    }


    /**
     * Sets the taxon1Resp_getbyid value for this Taxon1Resp.
     * 
     * @param taxon1Resp_getbyid
     */
    public void setTaxon1Resp_getbyid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getbyidType taxon1Resp_getbyid) {
        this.taxon1Resp_getbyid = taxon1Resp_getbyid;
    }


    /**
     * Gets the taxon1Resp_lookup value for this Taxon1Resp.
     * 
     * @return taxon1Resp_lookup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_lookupType getTaxon1Resp_lookup() {
        return taxon1Resp_lookup;
    }


    /**
     * Sets the taxon1Resp_lookup value for this Taxon1Resp.
     * 
     * @param taxon1Resp_lookup
     */
    public void setTaxon1Resp_lookup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_lookupType taxon1Resp_lookup) {
        this.taxon1Resp_lookup = taxon1Resp_lookup;
    }


    /**
     * Gets the taxon1Resp_getorgmod value for this Taxon1Resp.
     * 
     * @return taxon1Resp_getorgmod
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getorgmodType getTaxon1Resp_getorgmod() {
        return taxon1Resp_getorgmod;
    }


    /**
     * Sets the taxon1Resp_getorgmod value for this Taxon1Resp.
     * 
     * @param taxon1Resp_getorgmod
     */
    public void setTaxon1Resp_getorgmod(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getorgmodType taxon1Resp_getorgmod) {
        this.taxon1Resp_getorgmod = taxon1Resp_getorgmod;
    }


    /**
     * Gets the taxon1Resp_fini value for this Taxon1Resp.
     * 
     * @return taxon1Resp_fini
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_fini getTaxon1Resp_fini() {
        return taxon1Resp_fini;
    }


    /**
     * Sets the taxon1Resp_fini value for this Taxon1Resp.
     * 
     * @param taxon1Resp_fini
     */
    public void setTaxon1Resp_fini(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_fini taxon1Resp_fini) {
        this.taxon1Resp_fini = taxon1Resp_fini;
    }


    /**
     * Gets the taxon1Resp_id4Gi value for this Taxon1Resp.
     * 
     * @return taxon1Resp_id4Gi
     */
    public java.lang.String getTaxon1Resp_id4Gi() {
        return taxon1Resp_id4Gi;
    }


    /**
     * Sets the taxon1Resp_id4Gi value for this Taxon1Resp.
     * 
     * @param taxon1Resp_id4Gi
     */
    public void setTaxon1Resp_id4Gi(java.lang.String taxon1Resp_id4Gi) {
        this.taxon1Resp_id4Gi = taxon1Resp_id4Gi;
    }


    /**
     * Gets the taxon1Resp_taxabyid value for this Taxon1Resp.
     * 
     * @return taxon1Resp_taxabyid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_taxabyidType getTaxon1Resp_taxabyid() {
        return taxon1Resp_taxabyid;
    }


    /**
     * Sets the taxon1Resp_taxabyid value for this Taxon1Resp.
     * 
     * @param taxon1Resp_taxabyid
     */
    public void setTaxon1Resp_taxabyid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_taxabyidType taxon1Resp_taxabyid) {
        this.taxon1Resp_taxabyid = taxon1Resp_taxabyid;
    }


    /**
     * Gets the taxon1Resp_taxachildren value for this Taxon1Resp.
     * 
     * @return taxon1Resp_taxachildren
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_taxachildrenType getTaxon1Resp_taxachildren() {
        return taxon1Resp_taxachildren;
    }


    /**
     * Sets the taxon1Resp_taxachildren value for this Taxon1Resp.
     * 
     * @param taxon1Resp_taxachildren
     */
    public void setTaxon1Resp_taxachildren(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_taxachildrenType taxon1Resp_taxachildren) {
        this.taxon1Resp_taxachildren = taxon1Resp_taxachildren;
    }


    /**
     * Gets the taxon1Resp_taxalineage value for this Taxon1Resp.
     * 
     * @return taxon1Resp_taxalineage
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_taxalineageType getTaxon1Resp_taxalineage() {
        return taxon1Resp_taxalineage;
    }


    /**
     * Sets the taxon1Resp_taxalineage value for this Taxon1Resp.
     * 
     * @param taxon1Resp_taxalineage
     */
    public void setTaxon1Resp_taxalineage(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_taxalineageType taxon1Resp_taxalineage) {
        this.taxon1Resp_taxalineage = taxon1Resp_taxalineage;
    }


    /**
     * Gets the taxon1Resp_maxtaxid value for this Taxon1Resp.
     * 
     * @return taxon1Resp_maxtaxid
     */
    public java.lang.String getTaxon1Resp_maxtaxid() {
        return taxon1Resp_maxtaxid;
    }


    /**
     * Sets the taxon1Resp_maxtaxid value for this Taxon1Resp.
     * 
     * @param taxon1Resp_maxtaxid
     */
    public void setTaxon1Resp_maxtaxid(java.lang.String taxon1Resp_maxtaxid) {
        this.taxon1Resp_maxtaxid = taxon1Resp_maxtaxid;
    }


    /**
     * Gets the taxon1Resp_getproptypes value for this Taxon1Resp.
     * 
     * @return taxon1Resp_getproptypes
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getproptypesType getTaxon1Resp_getproptypes() {
        return taxon1Resp_getproptypes;
    }


    /**
     * Sets the taxon1Resp_getproptypes value for this Taxon1Resp.
     * 
     * @param taxon1Resp_getproptypes
     */
    public void setTaxon1Resp_getproptypes(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getproptypesType taxon1Resp_getproptypes) {
        this.taxon1Resp_getproptypes = taxon1Resp_getproptypes;
    }


    /**
     * Gets the taxon1Resp_getorgprop value for this Taxon1Resp.
     * 
     * @return taxon1Resp_getorgprop
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getorgpropType getTaxon1Resp_getorgprop() {
        return taxon1Resp_getorgprop;
    }


    /**
     * Sets the taxon1Resp_getorgprop value for this Taxon1Resp.
     * 
     * @param taxon1Resp_getorgprop
     */
    public void setTaxon1Resp_getorgprop(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_getorgpropType taxon1Resp_getorgprop) {
        this.taxon1Resp_getorgprop = taxon1Resp_getorgprop;
    }


    /**
     * Gets the taxon1Resp_searchname value for this Taxon1Resp.
     * 
     * @return taxon1Resp_searchname
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_searchnameType getTaxon1Resp_searchname() {
        return taxon1Resp_searchname;
    }


    /**
     * Sets the taxon1Resp_searchname value for this Taxon1Resp.
     * 
     * @param taxon1Resp_searchname
     */
    public void setTaxon1Resp_searchname(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Resp_searchnameType taxon1Resp_searchname) {
        this.taxon1Resp_searchname = taxon1Resp_searchname;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Taxon1Resp)) return false;
        Taxon1Resp other = (Taxon1Resp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxon1Resp_error==null && other.getTaxon1Resp_error()==null) || 
             (this.taxon1Resp_error!=null &&
              this.taxon1Resp_error.equals(other.getTaxon1Resp_error()))) &&
            ((this.taxon1Resp_init==null && other.getTaxon1Resp_init()==null) || 
             (this.taxon1Resp_init!=null &&
              this.taxon1Resp_init.equals(other.getTaxon1Resp_init()))) &&
            ((this.taxon1Resp_findname==null && other.getTaxon1Resp_findname()==null) || 
             (this.taxon1Resp_findname!=null &&
              this.taxon1Resp_findname.equals(other.getTaxon1Resp_findname()))) &&
            ((this.taxon1Resp_getdesignator==null && other.getTaxon1Resp_getdesignator()==null) || 
             (this.taxon1Resp_getdesignator!=null &&
              this.taxon1Resp_getdesignator.equals(other.getTaxon1Resp_getdesignator()))) &&
            ((this.taxon1Resp_getunique==null && other.getTaxon1Resp_getunique()==null) || 
             (this.taxon1Resp_getunique!=null &&
              this.taxon1Resp_getunique.equals(other.getTaxon1Resp_getunique()))) &&
            ((this.taxon1Resp_getidbyorg==null && other.getTaxon1Resp_getidbyorg()==null) || 
             (this.taxon1Resp_getidbyorg!=null &&
              this.taxon1Resp_getidbyorg.equals(other.getTaxon1Resp_getidbyorg()))) &&
            ((this.taxon1Resp_getorgnames==null && other.getTaxon1Resp_getorgnames()==null) || 
             (this.taxon1Resp_getorgnames!=null &&
              this.taxon1Resp_getorgnames.equals(other.getTaxon1Resp_getorgnames()))) &&
            ((this.taxon1Resp_getcde==null && other.getTaxon1Resp_getcde()==null) || 
             (this.taxon1Resp_getcde!=null &&
              this.taxon1Resp_getcde.equals(other.getTaxon1Resp_getcde()))) &&
            ((this.taxon1Resp_getranks==null && other.getTaxon1Resp_getranks()==null) || 
             (this.taxon1Resp_getranks!=null &&
              this.taxon1Resp_getranks.equals(other.getTaxon1Resp_getranks()))) &&
            ((this.taxon1Resp_getdivs==null && other.getTaxon1Resp_getdivs()==null) || 
             (this.taxon1Resp_getdivs!=null &&
              this.taxon1Resp_getdivs.equals(other.getTaxon1Resp_getdivs()))) &&
            ((this.taxon1Resp_getgcs==null && other.getTaxon1Resp_getgcs()==null) || 
             (this.taxon1Resp_getgcs!=null &&
              this.taxon1Resp_getgcs.equals(other.getTaxon1Resp_getgcs()))) &&
            ((this.taxon1Resp_getlineage==null && other.getTaxon1Resp_getlineage()==null) || 
             (this.taxon1Resp_getlineage!=null &&
              this.taxon1Resp_getlineage.equals(other.getTaxon1Resp_getlineage()))) &&
            ((this.taxon1Resp_getchildren==null && other.getTaxon1Resp_getchildren()==null) || 
             (this.taxon1Resp_getchildren!=null &&
              this.taxon1Resp_getchildren.equals(other.getTaxon1Resp_getchildren()))) &&
            ((this.taxon1Resp_getbyid==null && other.getTaxon1Resp_getbyid()==null) || 
             (this.taxon1Resp_getbyid!=null &&
              this.taxon1Resp_getbyid.equals(other.getTaxon1Resp_getbyid()))) &&
            ((this.taxon1Resp_lookup==null && other.getTaxon1Resp_lookup()==null) || 
             (this.taxon1Resp_lookup!=null &&
              this.taxon1Resp_lookup.equals(other.getTaxon1Resp_lookup()))) &&
            ((this.taxon1Resp_getorgmod==null && other.getTaxon1Resp_getorgmod()==null) || 
             (this.taxon1Resp_getorgmod!=null &&
              this.taxon1Resp_getorgmod.equals(other.getTaxon1Resp_getorgmod()))) &&
            ((this.taxon1Resp_fini==null && other.getTaxon1Resp_fini()==null) || 
             (this.taxon1Resp_fini!=null &&
              this.taxon1Resp_fini.equals(other.getTaxon1Resp_fini()))) &&
            ((this.taxon1Resp_id4Gi==null && other.getTaxon1Resp_id4Gi()==null) || 
             (this.taxon1Resp_id4Gi!=null &&
              this.taxon1Resp_id4Gi.equals(other.getTaxon1Resp_id4Gi()))) &&
            ((this.taxon1Resp_taxabyid==null && other.getTaxon1Resp_taxabyid()==null) || 
             (this.taxon1Resp_taxabyid!=null &&
              this.taxon1Resp_taxabyid.equals(other.getTaxon1Resp_taxabyid()))) &&
            ((this.taxon1Resp_taxachildren==null && other.getTaxon1Resp_taxachildren()==null) || 
             (this.taxon1Resp_taxachildren!=null &&
              this.taxon1Resp_taxachildren.equals(other.getTaxon1Resp_taxachildren()))) &&
            ((this.taxon1Resp_taxalineage==null && other.getTaxon1Resp_taxalineage()==null) || 
             (this.taxon1Resp_taxalineage!=null &&
              this.taxon1Resp_taxalineage.equals(other.getTaxon1Resp_taxalineage()))) &&
            ((this.taxon1Resp_maxtaxid==null && other.getTaxon1Resp_maxtaxid()==null) || 
             (this.taxon1Resp_maxtaxid!=null &&
              this.taxon1Resp_maxtaxid.equals(other.getTaxon1Resp_maxtaxid()))) &&
            ((this.taxon1Resp_getproptypes==null && other.getTaxon1Resp_getproptypes()==null) || 
             (this.taxon1Resp_getproptypes!=null &&
              this.taxon1Resp_getproptypes.equals(other.getTaxon1Resp_getproptypes()))) &&
            ((this.taxon1Resp_getorgprop==null && other.getTaxon1Resp_getorgprop()==null) || 
             (this.taxon1Resp_getorgprop!=null &&
              this.taxon1Resp_getorgprop.equals(other.getTaxon1Resp_getorgprop()))) &&
            ((this.taxon1Resp_searchname==null && other.getTaxon1Resp_searchname()==null) || 
             (this.taxon1Resp_searchname!=null &&
              this.taxon1Resp_searchname.equals(other.getTaxon1Resp_searchname())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTaxon1Resp_error() != null) {
            _hashCode += getTaxon1Resp_error().hashCode();
        }
        if (getTaxon1Resp_init() != null) {
            _hashCode += getTaxon1Resp_init().hashCode();
        }
        if (getTaxon1Resp_findname() != null) {
            _hashCode += getTaxon1Resp_findname().hashCode();
        }
        if (getTaxon1Resp_getdesignator() != null) {
            _hashCode += getTaxon1Resp_getdesignator().hashCode();
        }
        if (getTaxon1Resp_getunique() != null) {
            _hashCode += getTaxon1Resp_getunique().hashCode();
        }
        if (getTaxon1Resp_getidbyorg() != null) {
            _hashCode += getTaxon1Resp_getidbyorg().hashCode();
        }
        if (getTaxon1Resp_getorgnames() != null) {
            _hashCode += getTaxon1Resp_getorgnames().hashCode();
        }
        if (getTaxon1Resp_getcde() != null) {
            _hashCode += getTaxon1Resp_getcde().hashCode();
        }
        if (getTaxon1Resp_getranks() != null) {
            _hashCode += getTaxon1Resp_getranks().hashCode();
        }
        if (getTaxon1Resp_getdivs() != null) {
            _hashCode += getTaxon1Resp_getdivs().hashCode();
        }
        if (getTaxon1Resp_getgcs() != null) {
            _hashCode += getTaxon1Resp_getgcs().hashCode();
        }
        if (getTaxon1Resp_getlineage() != null) {
            _hashCode += getTaxon1Resp_getlineage().hashCode();
        }
        if (getTaxon1Resp_getchildren() != null) {
            _hashCode += getTaxon1Resp_getchildren().hashCode();
        }
        if (getTaxon1Resp_getbyid() != null) {
            _hashCode += getTaxon1Resp_getbyid().hashCode();
        }
        if (getTaxon1Resp_lookup() != null) {
            _hashCode += getTaxon1Resp_lookup().hashCode();
        }
        if (getTaxon1Resp_getorgmod() != null) {
            _hashCode += getTaxon1Resp_getorgmod().hashCode();
        }
        if (getTaxon1Resp_fini() != null) {
            _hashCode += getTaxon1Resp_fini().hashCode();
        }
        if (getTaxon1Resp_id4Gi() != null) {
            _hashCode += getTaxon1Resp_id4Gi().hashCode();
        }
        if (getTaxon1Resp_taxabyid() != null) {
            _hashCode += getTaxon1Resp_taxabyid().hashCode();
        }
        if (getTaxon1Resp_taxachildren() != null) {
            _hashCode += getTaxon1Resp_taxachildren().hashCode();
        }
        if (getTaxon1Resp_taxalineage() != null) {
            _hashCode += getTaxon1Resp_taxalineage().hashCode();
        }
        if (getTaxon1Resp_maxtaxid() != null) {
            _hashCode += getTaxon1Resp_maxtaxid().hashCode();
        }
        if (getTaxon1Resp_getproptypes() != null) {
            _hashCode += getTaxon1Resp_getproptypes().hashCode();
        }
        if (getTaxon1Resp_getorgprop() != null) {
            _hashCode += getTaxon1Resp_getorgprop().hashCode();
        }
        if (getTaxon1Resp_searchname() != null) {
            _hashCode += getTaxon1Resp_searchname().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Taxon1Resp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Taxon1-resp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Resp_error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_errorType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Resp_init");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_init"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Taxon1-resp_init"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Resp_findname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_findname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_findnameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Resp_getdesignator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_getdesignator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Resp_getunique");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_getunique"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Resp_getidbyorg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_getidbyorg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Resp_getorgnames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_getorgnames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_getorgnamesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Resp_getcde");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_getcde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_getcdeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Resp_getranks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_getranks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_getranksType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Resp_getdivs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_getdivs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_getdivsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Resp_getgcs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_getgcs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_getgcsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Resp_getlineage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_getlineage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_getlineageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Resp_getchildren");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_getchildren"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_getchildrenType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Resp_getbyid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_getbyid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_getbyidType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Resp_lookup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_lookup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_lookupType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Resp_getorgmod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_getorgmod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_getorgmodType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Resp_fini");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_fini"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Taxon1-resp_fini"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Resp_id4Gi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_id4gi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Resp_taxabyid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_taxabyid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_taxabyidType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Resp_taxachildren");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_taxachildren"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_taxachildrenType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Resp_taxalineage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_taxalineage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_taxalineageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Resp_maxtaxid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_maxtaxid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Resp_getproptypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_getproptypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_getproptypesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Resp_getorgprop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_getorgprop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_getorgpropType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Resp_searchname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_searchname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_searchnameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
