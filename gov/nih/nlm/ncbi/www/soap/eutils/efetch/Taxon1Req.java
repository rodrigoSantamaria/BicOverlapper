/**
 * Taxon1Req.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Taxon1Req  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_init taxon1Req_init;

    private java.lang.String taxon1Req_findname;

    private java.lang.String taxon1Req_getdesignator;

    private java.lang.String taxon1Req_getunique;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getidbyorgType taxon1Req_getidbyorg;

    private java.lang.String taxon1Req_getorgnames;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getcde taxon1Req_getcde;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getranks taxon1Req_getranks;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getdivs taxon1Req_getdivs;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getgcs taxon1Req_getgcs;

    private java.lang.String taxon1Req_getlineage;

    private java.lang.String taxon1Req_getchildren;

    private java.lang.String taxon1Req_getbyid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_lookupType taxon1Req_lookup;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getorgmodType taxon1Req_getorgmod;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_fini taxon1Req_fini;

    private java.lang.String taxon1Req_id4Gi;

    private java.lang.String taxon1Req_taxachildren;

    private java.lang.String taxon1Req_taxalineage;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_maxtaxid taxon1Req_maxtaxid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getproptypes taxon1Req_getproptypes;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getorgpropType taxon1Req_getorgprop;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_searchnameType taxon1Req_searchname;

    public Taxon1Req() {
    }

    public Taxon1Req(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_init taxon1Req_init,
           java.lang.String taxon1Req_findname,
           java.lang.String taxon1Req_getdesignator,
           java.lang.String taxon1Req_getunique,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getidbyorgType taxon1Req_getidbyorg,
           java.lang.String taxon1Req_getorgnames,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getcde taxon1Req_getcde,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getranks taxon1Req_getranks,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getdivs taxon1Req_getdivs,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getgcs taxon1Req_getgcs,
           java.lang.String taxon1Req_getlineage,
           java.lang.String taxon1Req_getchildren,
           java.lang.String taxon1Req_getbyid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_lookupType taxon1Req_lookup,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getorgmodType taxon1Req_getorgmod,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_fini taxon1Req_fini,
           java.lang.String taxon1Req_id4Gi,
           java.lang.String taxon1Req_taxachildren,
           java.lang.String taxon1Req_taxalineage,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_maxtaxid taxon1Req_maxtaxid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getproptypes taxon1Req_getproptypes,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getorgpropType taxon1Req_getorgprop,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_searchnameType taxon1Req_searchname) {
           this.taxon1Req_init = taxon1Req_init;
           this.taxon1Req_findname = taxon1Req_findname;
           this.taxon1Req_getdesignator = taxon1Req_getdesignator;
           this.taxon1Req_getunique = taxon1Req_getunique;
           this.taxon1Req_getidbyorg = taxon1Req_getidbyorg;
           this.taxon1Req_getorgnames = taxon1Req_getorgnames;
           this.taxon1Req_getcde = taxon1Req_getcde;
           this.taxon1Req_getranks = taxon1Req_getranks;
           this.taxon1Req_getdivs = taxon1Req_getdivs;
           this.taxon1Req_getgcs = taxon1Req_getgcs;
           this.taxon1Req_getlineage = taxon1Req_getlineage;
           this.taxon1Req_getchildren = taxon1Req_getchildren;
           this.taxon1Req_getbyid = taxon1Req_getbyid;
           this.taxon1Req_lookup = taxon1Req_lookup;
           this.taxon1Req_getorgmod = taxon1Req_getorgmod;
           this.taxon1Req_fini = taxon1Req_fini;
           this.taxon1Req_id4Gi = taxon1Req_id4Gi;
           this.taxon1Req_taxachildren = taxon1Req_taxachildren;
           this.taxon1Req_taxalineage = taxon1Req_taxalineage;
           this.taxon1Req_maxtaxid = taxon1Req_maxtaxid;
           this.taxon1Req_getproptypes = taxon1Req_getproptypes;
           this.taxon1Req_getorgprop = taxon1Req_getorgprop;
           this.taxon1Req_searchname = taxon1Req_searchname;
    }


    /**
     * Gets the taxon1Req_init value for this Taxon1Req.
     * 
     * @return taxon1Req_init
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_init getTaxon1Req_init() {
        return taxon1Req_init;
    }


    /**
     * Sets the taxon1Req_init value for this Taxon1Req.
     * 
     * @param taxon1Req_init
     */
    public void setTaxon1Req_init(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_init taxon1Req_init) {
        this.taxon1Req_init = taxon1Req_init;
    }


    /**
     * Gets the taxon1Req_findname value for this Taxon1Req.
     * 
     * @return taxon1Req_findname
     */
    public java.lang.String getTaxon1Req_findname() {
        return taxon1Req_findname;
    }


    /**
     * Sets the taxon1Req_findname value for this Taxon1Req.
     * 
     * @param taxon1Req_findname
     */
    public void setTaxon1Req_findname(java.lang.String taxon1Req_findname) {
        this.taxon1Req_findname = taxon1Req_findname;
    }


    /**
     * Gets the taxon1Req_getdesignator value for this Taxon1Req.
     * 
     * @return taxon1Req_getdesignator
     */
    public java.lang.String getTaxon1Req_getdesignator() {
        return taxon1Req_getdesignator;
    }


    /**
     * Sets the taxon1Req_getdesignator value for this Taxon1Req.
     * 
     * @param taxon1Req_getdesignator
     */
    public void setTaxon1Req_getdesignator(java.lang.String taxon1Req_getdesignator) {
        this.taxon1Req_getdesignator = taxon1Req_getdesignator;
    }


    /**
     * Gets the taxon1Req_getunique value for this Taxon1Req.
     * 
     * @return taxon1Req_getunique
     */
    public java.lang.String getTaxon1Req_getunique() {
        return taxon1Req_getunique;
    }


    /**
     * Sets the taxon1Req_getunique value for this Taxon1Req.
     * 
     * @param taxon1Req_getunique
     */
    public void setTaxon1Req_getunique(java.lang.String taxon1Req_getunique) {
        this.taxon1Req_getunique = taxon1Req_getunique;
    }


    /**
     * Gets the taxon1Req_getidbyorg value for this Taxon1Req.
     * 
     * @return taxon1Req_getidbyorg
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getidbyorgType getTaxon1Req_getidbyorg() {
        return taxon1Req_getidbyorg;
    }


    /**
     * Sets the taxon1Req_getidbyorg value for this Taxon1Req.
     * 
     * @param taxon1Req_getidbyorg
     */
    public void setTaxon1Req_getidbyorg(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getidbyorgType taxon1Req_getidbyorg) {
        this.taxon1Req_getidbyorg = taxon1Req_getidbyorg;
    }


    /**
     * Gets the taxon1Req_getorgnames value for this Taxon1Req.
     * 
     * @return taxon1Req_getorgnames
     */
    public java.lang.String getTaxon1Req_getorgnames() {
        return taxon1Req_getorgnames;
    }


    /**
     * Sets the taxon1Req_getorgnames value for this Taxon1Req.
     * 
     * @param taxon1Req_getorgnames
     */
    public void setTaxon1Req_getorgnames(java.lang.String taxon1Req_getorgnames) {
        this.taxon1Req_getorgnames = taxon1Req_getorgnames;
    }


    /**
     * Gets the taxon1Req_getcde value for this Taxon1Req.
     * 
     * @return taxon1Req_getcde
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getcde getTaxon1Req_getcde() {
        return taxon1Req_getcde;
    }


    /**
     * Sets the taxon1Req_getcde value for this Taxon1Req.
     * 
     * @param taxon1Req_getcde
     */
    public void setTaxon1Req_getcde(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getcde taxon1Req_getcde) {
        this.taxon1Req_getcde = taxon1Req_getcde;
    }


    /**
     * Gets the taxon1Req_getranks value for this Taxon1Req.
     * 
     * @return taxon1Req_getranks
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getranks getTaxon1Req_getranks() {
        return taxon1Req_getranks;
    }


    /**
     * Sets the taxon1Req_getranks value for this Taxon1Req.
     * 
     * @param taxon1Req_getranks
     */
    public void setTaxon1Req_getranks(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getranks taxon1Req_getranks) {
        this.taxon1Req_getranks = taxon1Req_getranks;
    }


    /**
     * Gets the taxon1Req_getdivs value for this Taxon1Req.
     * 
     * @return taxon1Req_getdivs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getdivs getTaxon1Req_getdivs() {
        return taxon1Req_getdivs;
    }


    /**
     * Sets the taxon1Req_getdivs value for this Taxon1Req.
     * 
     * @param taxon1Req_getdivs
     */
    public void setTaxon1Req_getdivs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getdivs taxon1Req_getdivs) {
        this.taxon1Req_getdivs = taxon1Req_getdivs;
    }


    /**
     * Gets the taxon1Req_getgcs value for this Taxon1Req.
     * 
     * @return taxon1Req_getgcs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getgcs getTaxon1Req_getgcs() {
        return taxon1Req_getgcs;
    }


    /**
     * Sets the taxon1Req_getgcs value for this Taxon1Req.
     * 
     * @param taxon1Req_getgcs
     */
    public void setTaxon1Req_getgcs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getgcs taxon1Req_getgcs) {
        this.taxon1Req_getgcs = taxon1Req_getgcs;
    }


    /**
     * Gets the taxon1Req_getlineage value for this Taxon1Req.
     * 
     * @return taxon1Req_getlineage
     */
    public java.lang.String getTaxon1Req_getlineage() {
        return taxon1Req_getlineage;
    }


    /**
     * Sets the taxon1Req_getlineage value for this Taxon1Req.
     * 
     * @param taxon1Req_getlineage
     */
    public void setTaxon1Req_getlineage(java.lang.String taxon1Req_getlineage) {
        this.taxon1Req_getlineage = taxon1Req_getlineage;
    }


    /**
     * Gets the taxon1Req_getchildren value for this Taxon1Req.
     * 
     * @return taxon1Req_getchildren
     */
    public java.lang.String getTaxon1Req_getchildren() {
        return taxon1Req_getchildren;
    }


    /**
     * Sets the taxon1Req_getchildren value for this Taxon1Req.
     * 
     * @param taxon1Req_getchildren
     */
    public void setTaxon1Req_getchildren(java.lang.String taxon1Req_getchildren) {
        this.taxon1Req_getchildren = taxon1Req_getchildren;
    }


    /**
     * Gets the taxon1Req_getbyid value for this Taxon1Req.
     * 
     * @return taxon1Req_getbyid
     */
    public java.lang.String getTaxon1Req_getbyid() {
        return taxon1Req_getbyid;
    }


    /**
     * Sets the taxon1Req_getbyid value for this Taxon1Req.
     * 
     * @param taxon1Req_getbyid
     */
    public void setTaxon1Req_getbyid(java.lang.String taxon1Req_getbyid) {
        this.taxon1Req_getbyid = taxon1Req_getbyid;
    }


    /**
     * Gets the taxon1Req_lookup value for this Taxon1Req.
     * 
     * @return taxon1Req_lookup
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_lookupType getTaxon1Req_lookup() {
        return taxon1Req_lookup;
    }


    /**
     * Sets the taxon1Req_lookup value for this Taxon1Req.
     * 
     * @param taxon1Req_lookup
     */
    public void setTaxon1Req_lookup(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_lookupType taxon1Req_lookup) {
        this.taxon1Req_lookup = taxon1Req_lookup;
    }


    /**
     * Gets the taxon1Req_getorgmod value for this Taxon1Req.
     * 
     * @return taxon1Req_getorgmod
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getorgmodType getTaxon1Req_getorgmod() {
        return taxon1Req_getorgmod;
    }


    /**
     * Sets the taxon1Req_getorgmod value for this Taxon1Req.
     * 
     * @param taxon1Req_getorgmod
     */
    public void setTaxon1Req_getorgmod(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getorgmodType taxon1Req_getorgmod) {
        this.taxon1Req_getorgmod = taxon1Req_getorgmod;
    }


    /**
     * Gets the taxon1Req_fini value for this Taxon1Req.
     * 
     * @return taxon1Req_fini
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_fini getTaxon1Req_fini() {
        return taxon1Req_fini;
    }


    /**
     * Sets the taxon1Req_fini value for this Taxon1Req.
     * 
     * @param taxon1Req_fini
     */
    public void setTaxon1Req_fini(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_fini taxon1Req_fini) {
        this.taxon1Req_fini = taxon1Req_fini;
    }


    /**
     * Gets the taxon1Req_id4Gi value for this Taxon1Req.
     * 
     * @return taxon1Req_id4Gi
     */
    public java.lang.String getTaxon1Req_id4Gi() {
        return taxon1Req_id4Gi;
    }


    /**
     * Sets the taxon1Req_id4Gi value for this Taxon1Req.
     * 
     * @param taxon1Req_id4Gi
     */
    public void setTaxon1Req_id4Gi(java.lang.String taxon1Req_id4Gi) {
        this.taxon1Req_id4Gi = taxon1Req_id4Gi;
    }


    /**
     * Gets the taxon1Req_taxachildren value for this Taxon1Req.
     * 
     * @return taxon1Req_taxachildren
     */
    public java.lang.String getTaxon1Req_taxachildren() {
        return taxon1Req_taxachildren;
    }


    /**
     * Sets the taxon1Req_taxachildren value for this Taxon1Req.
     * 
     * @param taxon1Req_taxachildren
     */
    public void setTaxon1Req_taxachildren(java.lang.String taxon1Req_taxachildren) {
        this.taxon1Req_taxachildren = taxon1Req_taxachildren;
    }


    /**
     * Gets the taxon1Req_taxalineage value for this Taxon1Req.
     * 
     * @return taxon1Req_taxalineage
     */
    public java.lang.String getTaxon1Req_taxalineage() {
        return taxon1Req_taxalineage;
    }


    /**
     * Sets the taxon1Req_taxalineage value for this Taxon1Req.
     * 
     * @param taxon1Req_taxalineage
     */
    public void setTaxon1Req_taxalineage(java.lang.String taxon1Req_taxalineage) {
        this.taxon1Req_taxalineage = taxon1Req_taxalineage;
    }


    /**
     * Gets the taxon1Req_maxtaxid value for this Taxon1Req.
     * 
     * @return taxon1Req_maxtaxid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_maxtaxid getTaxon1Req_maxtaxid() {
        return taxon1Req_maxtaxid;
    }


    /**
     * Sets the taxon1Req_maxtaxid value for this Taxon1Req.
     * 
     * @param taxon1Req_maxtaxid
     */
    public void setTaxon1Req_maxtaxid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_maxtaxid taxon1Req_maxtaxid) {
        this.taxon1Req_maxtaxid = taxon1Req_maxtaxid;
    }


    /**
     * Gets the taxon1Req_getproptypes value for this Taxon1Req.
     * 
     * @return taxon1Req_getproptypes
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getproptypes getTaxon1Req_getproptypes() {
        return taxon1Req_getproptypes;
    }


    /**
     * Sets the taxon1Req_getproptypes value for this Taxon1Req.
     * 
     * @param taxon1Req_getproptypes
     */
    public void setTaxon1Req_getproptypes(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getproptypes taxon1Req_getproptypes) {
        this.taxon1Req_getproptypes = taxon1Req_getproptypes;
    }


    /**
     * Gets the taxon1Req_getorgprop value for this Taxon1Req.
     * 
     * @return taxon1Req_getorgprop
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getorgpropType getTaxon1Req_getorgprop() {
        return taxon1Req_getorgprop;
    }


    /**
     * Sets the taxon1Req_getorgprop value for this Taxon1Req.
     * 
     * @param taxon1Req_getorgprop
     */
    public void setTaxon1Req_getorgprop(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_getorgpropType taxon1Req_getorgprop) {
        this.taxon1Req_getorgprop = taxon1Req_getorgprop;
    }


    /**
     * Gets the taxon1Req_searchname value for this Taxon1Req.
     * 
     * @return taxon1Req_searchname
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_searchnameType getTaxon1Req_searchname() {
        return taxon1Req_searchname;
    }


    /**
     * Sets the taxon1Req_searchname value for this Taxon1Req.
     * 
     * @param taxon1Req_searchname
     */
    public void setTaxon1Req_searchname(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Req_searchnameType taxon1Req_searchname) {
        this.taxon1Req_searchname = taxon1Req_searchname;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Taxon1Req)) return false;
        Taxon1Req other = (Taxon1Req) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxon1Req_init==null && other.getTaxon1Req_init()==null) || 
             (this.taxon1Req_init!=null &&
              this.taxon1Req_init.equals(other.getTaxon1Req_init()))) &&
            ((this.taxon1Req_findname==null && other.getTaxon1Req_findname()==null) || 
             (this.taxon1Req_findname!=null &&
              this.taxon1Req_findname.equals(other.getTaxon1Req_findname()))) &&
            ((this.taxon1Req_getdesignator==null && other.getTaxon1Req_getdesignator()==null) || 
             (this.taxon1Req_getdesignator!=null &&
              this.taxon1Req_getdesignator.equals(other.getTaxon1Req_getdesignator()))) &&
            ((this.taxon1Req_getunique==null && other.getTaxon1Req_getunique()==null) || 
             (this.taxon1Req_getunique!=null &&
              this.taxon1Req_getunique.equals(other.getTaxon1Req_getunique()))) &&
            ((this.taxon1Req_getidbyorg==null && other.getTaxon1Req_getidbyorg()==null) || 
             (this.taxon1Req_getidbyorg!=null &&
              this.taxon1Req_getidbyorg.equals(other.getTaxon1Req_getidbyorg()))) &&
            ((this.taxon1Req_getorgnames==null && other.getTaxon1Req_getorgnames()==null) || 
             (this.taxon1Req_getorgnames!=null &&
              this.taxon1Req_getorgnames.equals(other.getTaxon1Req_getorgnames()))) &&
            ((this.taxon1Req_getcde==null && other.getTaxon1Req_getcde()==null) || 
             (this.taxon1Req_getcde!=null &&
              this.taxon1Req_getcde.equals(other.getTaxon1Req_getcde()))) &&
            ((this.taxon1Req_getranks==null && other.getTaxon1Req_getranks()==null) || 
             (this.taxon1Req_getranks!=null &&
              this.taxon1Req_getranks.equals(other.getTaxon1Req_getranks()))) &&
            ((this.taxon1Req_getdivs==null && other.getTaxon1Req_getdivs()==null) || 
             (this.taxon1Req_getdivs!=null &&
              this.taxon1Req_getdivs.equals(other.getTaxon1Req_getdivs()))) &&
            ((this.taxon1Req_getgcs==null && other.getTaxon1Req_getgcs()==null) || 
             (this.taxon1Req_getgcs!=null &&
              this.taxon1Req_getgcs.equals(other.getTaxon1Req_getgcs()))) &&
            ((this.taxon1Req_getlineage==null && other.getTaxon1Req_getlineage()==null) || 
             (this.taxon1Req_getlineage!=null &&
              this.taxon1Req_getlineage.equals(other.getTaxon1Req_getlineage()))) &&
            ((this.taxon1Req_getchildren==null && other.getTaxon1Req_getchildren()==null) || 
             (this.taxon1Req_getchildren!=null &&
              this.taxon1Req_getchildren.equals(other.getTaxon1Req_getchildren()))) &&
            ((this.taxon1Req_getbyid==null && other.getTaxon1Req_getbyid()==null) || 
             (this.taxon1Req_getbyid!=null &&
              this.taxon1Req_getbyid.equals(other.getTaxon1Req_getbyid()))) &&
            ((this.taxon1Req_lookup==null && other.getTaxon1Req_lookup()==null) || 
             (this.taxon1Req_lookup!=null &&
              this.taxon1Req_lookup.equals(other.getTaxon1Req_lookup()))) &&
            ((this.taxon1Req_getorgmod==null && other.getTaxon1Req_getorgmod()==null) || 
             (this.taxon1Req_getorgmod!=null &&
              this.taxon1Req_getorgmod.equals(other.getTaxon1Req_getorgmod()))) &&
            ((this.taxon1Req_fini==null && other.getTaxon1Req_fini()==null) || 
             (this.taxon1Req_fini!=null &&
              this.taxon1Req_fini.equals(other.getTaxon1Req_fini()))) &&
            ((this.taxon1Req_id4Gi==null && other.getTaxon1Req_id4Gi()==null) || 
             (this.taxon1Req_id4Gi!=null &&
              this.taxon1Req_id4Gi.equals(other.getTaxon1Req_id4Gi()))) &&
            ((this.taxon1Req_taxachildren==null && other.getTaxon1Req_taxachildren()==null) || 
             (this.taxon1Req_taxachildren!=null &&
              this.taxon1Req_taxachildren.equals(other.getTaxon1Req_taxachildren()))) &&
            ((this.taxon1Req_taxalineage==null && other.getTaxon1Req_taxalineage()==null) || 
             (this.taxon1Req_taxalineage!=null &&
              this.taxon1Req_taxalineage.equals(other.getTaxon1Req_taxalineage()))) &&
            ((this.taxon1Req_maxtaxid==null && other.getTaxon1Req_maxtaxid()==null) || 
             (this.taxon1Req_maxtaxid!=null &&
              this.taxon1Req_maxtaxid.equals(other.getTaxon1Req_maxtaxid()))) &&
            ((this.taxon1Req_getproptypes==null && other.getTaxon1Req_getproptypes()==null) || 
             (this.taxon1Req_getproptypes!=null &&
              this.taxon1Req_getproptypes.equals(other.getTaxon1Req_getproptypes()))) &&
            ((this.taxon1Req_getorgprop==null && other.getTaxon1Req_getorgprop()==null) || 
             (this.taxon1Req_getorgprop!=null &&
              this.taxon1Req_getorgprop.equals(other.getTaxon1Req_getorgprop()))) &&
            ((this.taxon1Req_searchname==null && other.getTaxon1Req_searchname()==null) || 
             (this.taxon1Req_searchname!=null &&
              this.taxon1Req_searchname.equals(other.getTaxon1Req_searchname())));
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
        if (getTaxon1Req_init() != null) {
            _hashCode += getTaxon1Req_init().hashCode();
        }
        if (getTaxon1Req_findname() != null) {
            _hashCode += getTaxon1Req_findname().hashCode();
        }
        if (getTaxon1Req_getdesignator() != null) {
            _hashCode += getTaxon1Req_getdesignator().hashCode();
        }
        if (getTaxon1Req_getunique() != null) {
            _hashCode += getTaxon1Req_getunique().hashCode();
        }
        if (getTaxon1Req_getidbyorg() != null) {
            _hashCode += getTaxon1Req_getidbyorg().hashCode();
        }
        if (getTaxon1Req_getorgnames() != null) {
            _hashCode += getTaxon1Req_getorgnames().hashCode();
        }
        if (getTaxon1Req_getcde() != null) {
            _hashCode += getTaxon1Req_getcde().hashCode();
        }
        if (getTaxon1Req_getranks() != null) {
            _hashCode += getTaxon1Req_getranks().hashCode();
        }
        if (getTaxon1Req_getdivs() != null) {
            _hashCode += getTaxon1Req_getdivs().hashCode();
        }
        if (getTaxon1Req_getgcs() != null) {
            _hashCode += getTaxon1Req_getgcs().hashCode();
        }
        if (getTaxon1Req_getlineage() != null) {
            _hashCode += getTaxon1Req_getlineage().hashCode();
        }
        if (getTaxon1Req_getchildren() != null) {
            _hashCode += getTaxon1Req_getchildren().hashCode();
        }
        if (getTaxon1Req_getbyid() != null) {
            _hashCode += getTaxon1Req_getbyid().hashCode();
        }
        if (getTaxon1Req_lookup() != null) {
            _hashCode += getTaxon1Req_lookup().hashCode();
        }
        if (getTaxon1Req_getorgmod() != null) {
            _hashCode += getTaxon1Req_getorgmod().hashCode();
        }
        if (getTaxon1Req_fini() != null) {
            _hashCode += getTaxon1Req_fini().hashCode();
        }
        if (getTaxon1Req_id4Gi() != null) {
            _hashCode += getTaxon1Req_id4Gi().hashCode();
        }
        if (getTaxon1Req_taxachildren() != null) {
            _hashCode += getTaxon1Req_taxachildren().hashCode();
        }
        if (getTaxon1Req_taxalineage() != null) {
            _hashCode += getTaxon1Req_taxalineage().hashCode();
        }
        if (getTaxon1Req_maxtaxid() != null) {
            _hashCode += getTaxon1Req_maxtaxid().hashCode();
        }
        if (getTaxon1Req_getproptypes() != null) {
            _hashCode += getTaxon1Req_getproptypes().hashCode();
        }
        if (getTaxon1Req_getorgprop() != null) {
            _hashCode += getTaxon1Req_getorgprop().hashCode();
        }
        if (getTaxon1Req_searchname() != null) {
            _hashCode += getTaxon1Req_searchname().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Taxon1Req.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Taxon1-req"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Req_init");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_init"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Taxon1-req_init"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Req_findname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_findname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Req_getdesignator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_getdesignator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Req_getunique");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_getunique"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Req_getidbyorg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_getidbyorg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_getidbyorgType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Req_getorgnames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_getorgnames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Req_getcde");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_getcde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Taxon1-req_getcde"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Req_getranks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_getranks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Taxon1-req_getranks"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Req_getdivs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_getdivs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Taxon1-req_getdivs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Req_getgcs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_getgcs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Taxon1-req_getgcs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Req_getlineage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_getlineage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Req_getchildren");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_getchildren"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Req_getbyid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_getbyid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Req_lookup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_lookup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_lookupType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Req_getorgmod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_getorgmod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_getorgmodType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Req_fini");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_fini"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Taxon1-req_fini"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Req_id4Gi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_id4gi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Req_taxachildren");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_taxachildren"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Req_taxalineage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_taxalineage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Req_maxtaxid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_maxtaxid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Taxon1-req_maxtaxid"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Req_getproptypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_getproptypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Taxon1-req_getproptypes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Req_getorgprop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_getorgprop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_getorgpropType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Req_searchname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_searchname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-req_searchnameType"));
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
