/**
 * MSSearchSettingsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSSearchSettingsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_precursorsearchtypeType MSSearchSettings_precursorsearchtype;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_productsearchtypeType MSSearchSettings_productsearchtype;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_ionstosearchType MSSearchSettings_ionstosearch;

    private java.lang.String MSSearchSettings_peptol;

    private java.lang.String MSSearchSettings_msmstol;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_zdepType MSSearchSettings_zdep;

    private java.lang.String MSSearchSettings_cutoff;

    private java.lang.String MSSearchSettings_cutlo;

    private java.lang.String MSSearchSettings_cuthi;

    private java.lang.String MSSearchSettings_cutinc;

    private java.lang.String MSSearchSettings_singlewin;

    private java.lang.String MSSearchSettings_doublewin;

    private java.lang.String MSSearchSettings_singlenum;

    private java.lang.String MSSearchSettings_doublenum;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_fixedType MSSearchSettings_fixed;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_variableType MSSearchSettings_variable;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_enzymeType MSSearchSettings_enzyme;

    private java.lang.String MSSearchSettings_missedcleave;

    private java.lang.String MSSearchSettings_hitlistlen;

    private java.lang.String MSSearchSettings_db;

    private java.lang.String MSSearchSettings_tophitnum;

    private java.lang.String MSSearchSettings_minhit;

    private java.lang.String MSSearchSettings_minspectra;

    private java.lang.String MSSearchSettings_scale;

    private java.lang.String MSSearchSettings_maxmods;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_taxidsType MSSearchSettings_taxids;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_chargehandlingType MSSearchSettings_chargehandling;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_usermodsType MSSearchSettings_usermods;

    private java.lang.String MSSearchSettings_pseudocount;

    private java.lang.String MSSearchSettings_searchb1;

    private java.lang.String MSSearchSettings_searchctermproduct;

    private java.lang.String MSSearchSettings_maxproductions;

    private java.lang.String MSSearchSettings_minnoenzyme;

    private java.lang.String MSSearchSettings_maxnoenzyme;

    private java.lang.String MSSearchSettings_exactmass;

    private java.lang.String MSSearchSettings_settingid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_iterativesettingsType MSSearchSettings_iterativesettings;

    public MSSearchSettingsType() {
    }

    public MSSearchSettingsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_precursorsearchtypeType MSSearchSettings_precursorsearchtype,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_productsearchtypeType MSSearchSettings_productsearchtype,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_ionstosearchType MSSearchSettings_ionstosearch,
           java.lang.String MSSearchSettings_peptol,
           java.lang.String MSSearchSettings_msmstol,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_zdepType MSSearchSettings_zdep,
           java.lang.String MSSearchSettings_cutoff,
           java.lang.String MSSearchSettings_cutlo,
           java.lang.String MSSearchSettings_cuthi,
           java.lang.String MSSearchSettings_cutinc,
           java.lang.String MSSearchSettings_singlewin,
           java.lang.String MSSearchSettings_doublewin,
           java.lang.String MSSearchSettings_singlenum,
           java.lang.String MSSearchSettings_doublenum,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_fixedType MSSearchSettings_fixed,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_variableType MSSearchSettings_variable,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_enzymeType MSSearchSettings_enzyme,
           java.lang.String MSSearchSettings_missedcleave,
           java.lang.String MSSearchSettings_hitlistlen,
           java.lang.String MSSearchSettings_db,
           java.lang.String MSSearchSettings_tophitnum,
           java.lang.String MSSearchSettings_minhit,
           java.lang.String MSSearchSettings_minspectra,
           java.lang.String MSSearchSettings_scale,
           java.lang.String MSSearchSettings_maxmods,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_taxidsType MSSearchSettings_taxids,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_chargehandlingType MSSearchSettings_chargehandling,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_usermodsType MSSearchSettings_usermods,
           java.lang.String MSSearchSettings_pseudocount,
           java.lang.String MSSearchSettings_searchb1,
           java.lang.String MSSearchSettings_searchctermproduct,
           java.lang.String MSSearchSettings_maxproductions,
           java.lang.String MSSearchSettings_minnoenzyme,
           java.lang.String MSSearchSettings_maxnoenzyme,
           java.lang.String MSSearchSettings_exactmass,
           java.lang.String MSSearchSettings_settingid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_iterativesettingsType MSSearchSettings_iterativesettings) {
           this.MSSearchSettings_precursorsearchtype = MSSearchSettings_precursorsearchtype;
           this.MSSearchSettings_productsearchtype = MSSearchSettings_productsearchtype;
           this.MSSearchSettings_ionstosearch = MSSearchSettings_ionstosearch;
           this.MSSearchSettings_peptol = MSSearchSettings_peptol;
           this.MSSearchSettings_msmstol = MSSearchSettings_msmstol;
           this.MSSearchSettings_zdep = MSSearchSettings_zdep;
           this.MSSearchSettings_cutoff = MSSearchSettings_cutoff;
           this.MSSearchSettings_cutlo = MSSearchSettings_cutlo;
           this.MSSearchSettings_cuthi = MSSearchSettings_cuthi;
           this.MSSearchSettings_cutinc = MSSearchSettings_cutinc;
           this.MSSearchSettings_singlewin = MSSearchSettings_singlewin;
           this.MSSearchSettings_doublewin = MSSearchSettings_doublewin;
           this.MSSearchSettings_singlenum = MSSearchSettings_singlenum;
           this.MSSearchSettings_doublenum = MSSearchSettings_doublenum;
           this.MSSearchSettings_fixed = MSSearchSettings_fixed;
           this.MSSearchSettings_variable = MSSearchSettings_variable;
           this.MSSearchSettings_enzyme = MSSearchSettings_enzyme;
           this.MSSearchSettings_missedcleave = MSSearchSettings_missedcleave;
           this.MSSearchSettings_hitlistlen = MSSearchSettings_hitlistlen;
           this.MSSearchSettings_db = MSSearchSettings_db;
           this.MSSearchSettings_tophitnum = MSSearchSettings_tophitnum;
           this.MSSearchSettings_minhit = MSSearchSettings_minhit;
           this.MSSearchSettings_minspectra = MSSearchSettings_minspectra;
           this.MSSearchSettings_scale = MSSearchSettings_scale;
           this.MSSearchSettings_maxmods = MSSearchSettings_maxmods;
           this.MSSearchSettings_taxids = MSSearchSettings_taxids;
           this.MSSearchSettings_chargehandling = MSSearchSettings_chargehandling;
           this.MSSearchSettings_usermods = MSSearchSettings_usermods;
           this.MSSearchSettings_pseudocount = MSSearchSettings_pseudocount;
           this.MSSearchSettings_searchb1 = MSSearchSettings_searchb1;
           this.MSSearchSettings_searchctermproduct = MSSearchSettings_searchctermproduct;
           this.MSSearchSettings_maxproductions = MSSearchSettings_maxproductions;
           this.MSSearchSettings_minnoenzyme = MSSearchSettings_minnoenzyme;
           this.MSSearchSettings_maxnoenzyme = MSSearchSettings_maxnoenzyme;
           this.MSSearchSettings_exactmass = MSSearchSettings_exactmass;
           this.MSSearchSettings_settingid = MSSearchSettings_settingid;
           this.MSSearchSettings_iterativesettings = MSSearchSettings_iterativesettings;
    }


    /**
     * Gets the MSSearchSettings_precursorsearchtype value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_precursorsearchtype
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_precursorsearchtypeType getMSSearchSettings_precursorsearchtype() {
        return MSSearchSettings_precursorsearchtype;
    }


    /**
     * Sets the MSSearchSettings_precursorsearchtype value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_precursorsearchtype
     */
    public void setMSSearchSettings_precursorsearchtype(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_precursorsearchtypeType MSSearchSettings_precursorsearchtype) {
        this.MSSearchSettings_precursorsearchtype = MSSearchSettings_precursorsearchtype;
    }


    /**
     * Gets the MSSearchSettings_productsearchtype value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_productsearchtype
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_productsearchtypeType getMSSearchSettings_productsearchtype() {
        return MSSearchSettings_productsearchtype;
    }


    /**
     * Sets the MSSearchSettings_productsearchtype value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_productsearchtype
     */
    public void setMSSearchSettings_productsearchtype(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_productsearchtypeType MSSearchSettings_productsearchtype) {
        this.MSSearchSettings_productsearchtype = MSSearchSettings_productsearchtype;
    }


    /**
     * Gets the MSSearchSettings_ionstosearch value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_ionstosearch
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_ionstosearchType getMSSearchSettings_ionstosearch() {
        return MSSearchSettings_ionstosearch;
    }


    /**
     * Sets the MSSearchSettings_ionstosearch value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_ionstosearch
     */
    public void setMSSearchSettings_ionstosearch(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_ionstosearchType MSSearchSettings_ionstosearch) {
        this.MSSearchSettings_ionstosearch = MSSearchSettings_ionstosearch;
    }


    /**
     * Gets the MSSearchSettings_peptol value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_peptol
     */
    public java.lang.String getMSSearchSettings_peptol() {
        return MSSearchSettings_peptol;
    }


    /**
     * Sets the MSSearchSettings_peptol value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_peptol
     */
    public void setMSSearchSettings_peptol(java.lang.String MSSearchSettings_peptol) {
        this.MSSearchSettings_peptol = MSSearchSettings_peptol;
    }


    /**
     * Gets the MSSearchSettings_msmstol value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_msmstol
     */
    public java.lang.String getMSSearchSettings_msmstol() {
        return MSSearchSettings_msmstol;
    }


    /**
     * Sets the MSSearchSettings_msmstol value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_msmstol
     */
    public void setMSSearchSettings_msmstol(java.lang.String MSSearchSettings_msmstol) {
        this.MSSearchSettings_msmstol = MSSearchSettings_msmstol;
    }


    /**
     * Gets the MSSearchSettings_zdep value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_zdep
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_zdepType getMSSearchSettings_zdep() {
        return MSSearchSettings_zdep;
    }


    /**
     * Sets the MSSearchSettings_zdep value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_zdep
     */
    public void setMSSearchSettings_zdep(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_zdepType MSSearchSettings_zdep) {
        this.MSSearchSettings_zdep = MSSearchSettings_zdep;
    }


    /**
     * Gets the MSSearchSettings_cutoff value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_cutoff
     */
    public java.lang.String getMSSearchSettings_cutoff() {
        return MSSearchSettings_cutoff;
    }


    /**
     * Sets the MSSearchSettings_cutoff value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_cutoff
     */
    public void setMSSearchSettings_cutoff(java.lang.String MSSearchSettings_cutoff) {
        this.MSSearchSettings_cutoff = MSSearchSettings_cutoff;
    }


    /**
     * Gets the MSSearchSettings_cutlo value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_cutlo
     */
    public java.lang.String getMSSearchSettings_cutlo() {
        return MSSearchSettings_cutlo;
    }


    /**
     * Sets the MSSearchSettings_cutlo value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_cutlo
     */
    public void setMSSearchSettings_cutlo(java.lang.String MSSearchSettings_cutlo) {
        this.MSSearchSettings_cutlo = MSSearchSettings_cutlo;
    }


    /**
     * Gets the MSSearchSettings_cuthi value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_cuthi
     */
    public java.lang.String getMSSearchSettings_cuthi() {
        return MSSearchSettings_cuthi;
    }


    /**
     * Sets the MSSearchSettings_cuthi value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_cuthi
     */
    public void setMSSearchSettings_cuthi(java.lang.String MSSearchSettings_cuthi) {
        this.MSSearchSettings_cuthi = MSSearchSettings_cuthi;
    }


    /**
     * Gets the MSSearchSettings_cutinc value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_cutinc
     */
    public java.lang.String getMSSearchSettings_cutinc() {
        return MSSearchSettings_cutinc;
    }


    /**
     * Sets the MSSearchSettings_cutinc value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_cutinc
     */
    public void setMSSearchSettings_cutinc(java.lang.String MSSearchSettings_cutinc) {
        this.MSSearchSettings_cutinc = MSSearchSettings_cutinc;
    }


    /**
     * Gets the MSSearchSettings_singlewin value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_singlewin
     */
    public java.lang.String getMSSearchSettings_singlewin() {
        return MSSearchSettings_singlewin;
    }


    /**
     * Sets the MSSearchSettings_singlewin value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_singlewin
     */
    public void setMSSearchSettings_singlewin(java.lang.String MSSearchSettings_singlewin) {
        this.MSSearchSettings_singlewin = MSSearchSettings_singlewin;
    }


    /**
     * Gets the MSSearchSettings_doublewin value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_doublewin
     */
    public java.lang.String getMSSearchSettings_doublewin() {
        return MSSearchSettings_doublewin;
    }


    /**
     * Sets the MSSearchSettings_doublewin value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_doublewin
     */
    public void setMSSearchSettings_doublewin(java.lang.String MSSearchSettings_doublewin) {
        this.MSSearchSettings_doublewin = MSSearchSettings_doublewin;
    }


    /**
     * Gets the MSSearchSettings_singlenum value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_singlenum
     */
    public java.lang.String getMSSearchSettings_singlenum() {
        return MSSearchSettings_singlenum;
    }


    /**
     * Sets the MSSearchSettings_singlenum value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_singlenum
     */
    public void setMSSearchSettings_singlenum(java.lang.String MSSearchSettings_singlenum) {
        this.MSSearchSettings_singlenum = MSSearchSettings_singlenum;
    }


    /**
     * Gets the MSSearchSettings_doublenum value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_doublenum
     */
    public java.lang.String getMSSearchSettings_doublenum() {
        return MSSearchSettings_doublenum;
    }


    /**
     * Sets the MSSearchSettings_doublenum value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_doublenum
     */
    public void setMSSearchSettings_doublenum(java.lang.String MSSearchSettings_doublenum) {
        this.MSSearchSettings_doublenum = MSSearchSettings_doublenum;
    }


    /**
     * Gets the MSSearchSettings_fixed value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_fixed
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_fixedType getMSSearchSettings_fixed() {
        return MSSearchSettings_fixed;
    }


    /**
     * Sets the MSSearchSettings_fixed value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_fixed
     */
    public void setMSSearchSettings_fixed(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_fixedType MSSearchSettings_fixed) {
        this.MSSearchSettings_fixed = MSSearchSettings_fixed;
    }


    /**
     * Gets the MSSearchSettings_variable value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_variable
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_variableType getMSSearchSettings_variable() {
        return MSSearchSettings_variable;
    }


    /**
     * Sets the MSSearchSettings_variable value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_variable
     */
    public void setMSSearchSettings_variable(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_variableType MSSearchSettings_variable) {
        this.MSSearchSettings_variable = MSSearchSettings_variable;
    }


    /**
     * Gets the MSSearchSettings_enzyme value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_enzyme
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_enzymeType getMSSearchSettings_enzyme() {
        return MSSearchSettings_enzyme;
    }


    /**
     * Sets the MSSearchSettings_enzyme value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_enzyme
     */
    public void setMSSearchSettings_enzyme(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_enzymeType MSSearchSettings_enzyme) {
        this.MSSearchSettings_enzyme = MSSearchSettings_enzyme;
    }


    /**
     * Gets the MSSearchSettings_missedcleave value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_missedcleave
     */
    public java.lang.String getMSSearchSettings_missedcleave() {
        return MSSearchSettings_missedcleave;
    }


    /**
     * Sets the MSSearchSettings_missedcleave value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_missedcleave
     */
    public void setMSSearchSettings_missedcleave(java.lang.String MSSearchSettings_missedcleave) {
        this.MSSearchSettings_missedcleave = MSSearchSettings_missedcleave;
    }


    /**
     * Gets the MSSearchSettings_hitlistlen value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_hitlistlen
     */
    public java.lang.String getMSSearchSettings_hitlistlen() {
        return MSSearchSettings_hitlistlen;
    }


    /**
     * Sets the MSSearchSettings_hitlistlen value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_hitlistlen
     */
    public void setMSSearchSettings_hitlistlen(java.lang.String MSSearchSettings_hitlistlen) {
        this.MSSearchSettings_hitlistlen = MSSearchSettings_hitlistlen;
    }


    /**
     * Gets the MSSearchSettings_db value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_db
     */
    public java.lang.String getMSSearchSettings_db() {
        return MSSearchSettings_db;
    }


    /**
     * Sets the MSSearchSettings_db value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_db
     */
    public void setMSSearchSettings_db(java.lang.String MSSearchSettings_db) {
        this.MSSearchSettings_db = MSSearchSettings_db;
    }


    /**
     * Gets the MSSearchSettings_tophitnum value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_tophitnum
     */
    public java.lang.String getMSSearchSettings_tophitnum() {
        return MSSearchSettings_tophitnum;
    }


    /**
     * Sets the MSSearchSettings_tophitnum value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_tophitnum
     */
    public void setMSSearchSettings_tophitnum(java.lang.String MSSearchSettings_tophitnum) {
        this.MSSearchSettings_tophitnum = MSSearchSettings_tophitnum;
    }


    /**
     * Gets the MSSearchSettings_minhit value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_minhit
     */
    public java.lang.String getMSSearchSettings_minhit() {
        return MSSearchSettings_minhit;
    }


    /**
     * Sets the MSSearchSettings_minhit value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_minhit
     */
    public void setMSSearchSettings_minhit(java.lang.String MSSearchSettings_minhit) {
        this.MSSearchSettings_minhit = MSSearchSettings_minhit;
    }


    /**
     * Gets the MSSearchSettings_minspectra value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_minspectra
     */
    public java.lang.String getMSSearchSettings_minspectra() {
        return MSSearchSettings_minspectra;
    }


    /**
     * Sets the MSSearchSettings_minspectra value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_minspectra
     */
    public void setMSSearchSettings_minspectra(java.lang.String MSSearchSettings_minspectra) {
        this.MSSearchSettings_minspectra = MSSearchSettings_minspectra;
    }


    /**
     * Gets the MSSearchSettings_scale value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_scale
     */
    public java.lang.String getMSSearchSettings_scale() {
        return MSSearchSettings_scale;
    }


    /**
     * Sets the MSSearchSettings_scale value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_scale
     */
    public void setMSSearchSettings_scale(java.lang.String MSSearchSettings_scale) {
        this.MSSearchSettings_scale = MSSearchSettings_scale;
    }


    /**
     * Gets the MSSearchSettings_maxmods value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_maxmods
     */
    public java.lang.String getMSSearchSettings_maxmods() {
        return MSSearchSettings_maxmods;
    }


    /**
     * Sets the MSSearchSettings_maxmods value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_maxmods
     */
    public void setMSSearchSettings_maxmods(java.lang.String MSSearchSettings_maxmods) {
        this.MSSearchSettings_maxmods = MSSearchSettings_maxmods;
    }


    /**
     * Gets the MSSearchSettings_taxids value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_taxids
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_taxidsType getMSSearchSettings_taxids() {
        return MSSearchSettings_taxids;
    }


    /**
     * Sets the MSSearchSettings_taxids value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_taxids
     */
    public void setMSSearchSettings_taxids(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_taxidsType MSSearchSettings_taxids) {
        this.MSSearchSettings_taxids = MSSearchSettings_taxids;
    }


    /**
     * Gets the MSSearchSettings_chargehandling value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_chargehandling
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_chargehandlingType getMSSearchSettings_chargehandling() {
        return MSSearchSettings_chargehandling;
    }


    /**
     * Sets the MSSearchSettings_chargehandling value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_chargehandling
     */
    public void setMSSearchSettings_chargehandling(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_chargehandlingType MSSearchSettings_chargehandling) {
        this.MSSearchSettings_chargehandling = MSSearchSettings_chargehandling;
    }


    /**
     * Gets the MSSearchSettings_usermods value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_usermods
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_usermodsType getMSSearchSettings_usermods() {
        return MSSearchSettings_usermods;
    }


    /**
     * Sets the MSSearchSettings_usermods value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_usermods
     */
    public void setMSSearchSettings_usermods(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_usermodsType MSSearchSettings_usermods) {
        this.MSSearchSettings_usermods = MSSearchSettings_usermods;
    }


    /**
     * Gets the MSSearchSettings_pseudocount value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_pseudocount
     */
    public java.lang.String getMSSearchSettings_pseudocount() {
        return MSSearchSettings_pseudocount;
    }


    /**
     * Sets the MSSearchSettings_pseudocount value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_pseudocount
     */
    public void setMSSearchSettings_pseudocount(java.lang.String MSSearchSettings_pseudocount) {
        this.MSSearchSettings_pseudocount = MSSearchSettings_pseudocount;
    }


    /**
     * Gets the MSSearchSettings_searchb1 value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_searchb1
     */
    public java.lang.String getMSSearchSettings_searchb1() {
        return MSSearchSettings_searchb1;
    }


    /**
     * Sets the MSSearchSettings_searchb1 value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_searchb1
     */
    public void setMSSearchSettings_searchb1(java.lang.String MSSearchSettings_searchb1) {
        this.MSSearchSettings_searchb1 = MSSearchSettings_searchb1;
    }


    /**
     * Gets the MSSearchSettings_searchctermproduct value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_searchctermproduct
     */
    public java.lang.String getMSSearchSettings_searchctermproduct() {
        return MSSearchSettings_searchctermproduct;
    }


    /**
     * Sets the MSSearchSettings_searchctermproduct value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_searchctermproduct
     */
    public void setMSSearchSettings_searchctermproduct(java.lang.String MSSearchSettings_searchctermproduct) {
        this.MSSearchSettings_searchctermproduct = MSSearchSettings_searchctermproduct;
    }


    /**
     * Gets the MSSearchSettings_maxproductions value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_maxproductions
     */
    public java.lang.String getMSSearchSettings_maxproductions() {
        return MSSearchSettings_maxproductions;
    }


    /**
     * Sets the MSSearchSettings_maxproductions value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_maxproductions
     */
    public void setMSSearchSettings_maxproductions(java.lang.String MSSearchSettings_maxproductions) {
        this.MSSearchSettings_maxproductions = MSSearchSettings_maxproductions;
    }


    /**
     * Gets the MSSearchSettings_minnoenzyme value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_minnoenzyme
     */
    public java.lang.String getMSSearchSettings_minnoenzyme() {
        return MSSearchSettings_minnoenzyme;
    }


    /**
     * Sets the MSSearchSettings_minnoenzyme value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_minnoenzyme
     */
    public void setMSSearchSettings_minnoenzyme(java.lang.String MSSearchSettings_minnoenzyme) {
        this.MSSearchSettings_minnoenzyme = MSSearchSettings_minnoenzyme;
    }


    /**
     * Gets the MSSearchSettings_maxnoenzyme value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_maxnoenzyme
     */
    public java.lang.String getMSSearchSettings_maxnoenzyme() {
        return MSSearchSettings_maxnoenzyme;
    }


    /**
     * Sets the MSSearchSettings_maxnoenzyme value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_maxnoenzyme
     */
    public void setMSSearchSettings_maxnoenzyme(java.lang.String MSSearchSettings_maxnoenzyme) {
        this.MSSearchSettings_maxnoenzyme = MSSearchSettings_maxnoenzyme;
    }


    /**
     * Gets the MSSearchSettings_exactmass value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_exactmass
     */
    public java.lang.String getMSSearchSettings_exactmass() {
        return MSSearchSettings_exactmass;
    }


    /**
     * Sets the MSSearchSettings_exactmass value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_exactmass
     */
    public void setMSSearchSettings_exactmass(java.lang.String MSSearchSettings_exactmass) {
        this.MSSearchSettings_exactmass = MSSearchSettings_exactmass;
    }


    /**
     * Gets the MSSearchSettings_settingid value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_settingid
     */
    public java.lang.String getMSSearchSettings_settingid() {
        return MSSearchSettings_settingid;
    }


    /**
     * Sets the MSSearchSettings_settingid value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_settingid
     */
    public void setMSSearchSettings_settingid(java.lang.String MSSearchSettings_settingid) {
        this.MSSearchSettings_settingid = MSSearchSettings_settingid;
    }


    /**
     * Gets the MSSearchSettings_iterativesettings value for this MSSearchSettingsType.
     * 
     * @return MSSearchSettings_iterativesettings
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_iterativesettingsType getMSSearchSettings_iterativesettings() {
        return MSSearchSettings_iterativesettings;
    }


    /**
     * Sets the MSSearchSettings_iterativesettings value for this MSSearchSettingsType.
     * 
     * @param MSSearchSettings_iterativesettings
     */
    public void setMSSearchSettings_iterativesettings(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearchSettings_iterativesettingsType MSSearchSettings_iterativesettings) {
        this.MSSearchSettings_iterativesettings = MSSearchSettings_iterativesettings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSSearchSettingsType)) return false;
        MSSearchSettingsType other = (MSSearchSettingsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSSearchSettings_precursorsearchtype==null && other.getMSSearchSettings_precursorsearchtype()==null) || 
             (this.MSSearchSettings_precursorsearchtype!=null &&
              this.MSSearchSettings_precursorsearchtype.equals(other.getMSSearchSettings_precursorsearchtype()))) &&
            ((this.MSSearchSettings_productsearchtype==null && other.getMSSearchSettings_productsearchtype()==null) || 
             (this.MSSearchSettings_productsearchtype!=null &&
              this.MSSearchSettings_productsearchtype.equals(other.getMSSearchSettings_productsearchtype()))) &&
            ((this.MSSearchSettings_ionstosearch==null && other.getMSSearchSettings_ionstosearch()==null) || 
             (this.MSSearchSettings_ionstosearch!=null &&
              this.MSSearchSettings_ionstosearch.equals(other.getMSSearchSettings_ionstosearch()))) &&
            ((this.MSSearchSettings_peptol==null && other.getMSSearchSettings_peptol()==null) || 
             (this.MSSearchSettings_peptol!=null &&
              this.MSSearchSettings_peptol.equals(other.getMSSearchSettings_peptol()))) &&
            ((this.MSSearchSettings_msmstol==null && other.getMSSearchSettings_msmstol()==null) || 
             (this.MSSearchSettings_msmstol!=null &&
              this.MSSearchSettings_msmstol.equals(other.getMSSearchSettings_msmstol()))) &&
            ((this.MSSearchSettings_zdep==null && other.getMSSearchSettings_zdep()==null) || 
             (this.MSSearchSettings_zdep!=null &&
              this.MSSearchSettings_zdep.equals(other.getMSSearchSettings_zdep()))) &&
            ((this.MSSearchSettings_cutoff==null && other.getMSSearchSettings_cutoff()==null) || 
             (this.MSSearchSettings_cutoff!=null &&
              this.MSSearchSettings_cutoff.equals(other.getMSSearchSettings_cutoff()))) &&
            ((this.MSSearchSettings_cutlo==null && other.getMSSearchSettings_cutlo()==null) || 
             (this.MSSearchSettings_cutlo!=null &&
              this.MSSearchSettings_cutlo.equals(other.getMSSearchSettings_cutlo()))) &&
            ((this.MSSearchSettings_cuthi==null && other.getMSSearchSettings_cuthi()==null) || 
             (this.MSSearchSettings_cuthi!=null &&
              this.MSSearchSettings_cuthi.equals(other.getMSSearchSettings_cuthi()))) &&
            ((this.MSSearchSettings_cutinc==null && other.getMSSearchSettings_cutinc()==null) || 
             (this.MSSearchSettings_cutinc!=null &&
              this.MSSearchSettings_cutinc.equals(other.getMSSearchSettings_cutinc()))) &&
            ((this.MSSearchSettings_singlewin==null && other.getMSSearchSettings_singlewin()==null) || 
             (this.MSSearchSettings_singlewin!=null &&
              this.MSSearchSettings_singlewin.equals(other.getMSSearchSettings_singlewin()))) &&
            ((this.MSSearchSettings_doublewin==null && other.getMSSearchSettings_doublewin()==null) || 
             (this.MSSearchSettings_doublewin!=null &&
              this.MSSearchSettings_doublewin.equals(other.getMSSearchSettings_doublewin()))) &&
            ((this.MSSearchSettings_singlenum==null && other.getMSSearchSettings_singlenum()==null) || 
             (this.MSSearchSettings_singlenum!=null &&
              this.MSSearchSettings_singlenum.equals(other.getMSSearchSettings_singlenum()))) &&
            ((this.MSSearchSettings_doublenum==null && other.getMSSearchSettings_doublenum()==null) || 
             (this.MSSearchSettings_doublenum!=null &&
              this.MSSearchSettings_doublenum.equals(other.getMSSearchSettings_doublenum()))) &&
            ((this.MSSearchSettings_fixed==null && other.getMSSearchSettings_fixed()==null) || 
             (this.MSSearchSettings_fixed!=null &&
              this.MSSearchSettings_fixed.equals(other.getMSSearchSettings_fixed()))) &&
            ((this.MSSearchSettings_variable==null && other.getMSSearchSettings_variable()==null) || 
             (this.MSSearchSettings_variable!=null &&
              this.MSSearchSettings_variable.equals(other.getMSSearchSettings_variable()))) &&
            ((this.MSSearchSettings_enzyme==null && other.getMSSearchSettings_enzyme()==null) || 
             (this.MSSearchSettings_enzyme!=null &&
              this.MSSearchSettings_enzyme.equals(other.getMSSearchSettings_enzyme()))) &&
            ((this.MSSearchSettings_missedcleave==null && other.getMSSearchSettings_missedcleave()==null) || 
             (this.MSSearchSettings_missedcleave!=null &&
              this.MSSearchSettings_missedcleave.equals(other.getMSSearchSettings_missedcleave()))) &&
            ((this.MSSearchSettings_hitlistlen==null && other.getMSSearchSettings_hitlistlen()==null) || 
             (this.MSSearchSettings_hitlistlen!=null &&
              this.MSSearchSettings_hitlistlen.equals(other.getMSSearchSettings_hitlistlen()))) &&
            ((this.MSSearchSettings_db==null && other.getMSSearchSettings_db()==null) || 
             (this.MSSearchSettings_db!=null &&
              this.MSSearchSettings_db.equals(other.getMSSearchSettings_db()))) &&
            ((this.MSSearchSettings_tophitnum==null && other.getMSSearchSettings_tophitnum()==null) || 
             (this.MSSearchSettings_tophitnum!=null &&
              this.MSSearchSettings_tophitnum.equals(other.getMSSearchSettings_tophitnum()))) &&
            ((this.MSSearchSettings_minhit==null && other.getMSSearchSettings_minhit()==null) || 
             (this.MSSearchSettings_minhit!=null &&
              this.MSSearchSettings_minhit.equals(other.getMSSearchSettings_minhit()))) &&
            ((this.MSSearchSettings_minspectra==null && other.getMSSearchSettings_minspectra()==null) || 
             (this.MSSearchSettings_minspectra!=null &&
              this.MSSearchSettings_minspectra.equals(other.getMSSearchSettings_minspectra()))) &&
            ((this.MSSearchSettings_scale==null && other.getMSSearchSettings_scale()==null) || 
             (this.MSSearchSettings_scale!=null &&
              this.MSSearchSettings_scale.equals(other.getMSSearchSettings_scale()))) &&
            ((this.MSSearchSettings_maxmods==null && other.getMSSearchSettings_maxmods()==null) || 
             (this.MSSearchSettings_maxmods!=null &&
              this.MSSearchSettings_maxmods.equals(other.getMSSearchSettings_maxmods()))) &&
            ((this.MSSearchSettings_taxids==null && other.getMSSearchSettings_taxids()==null) || 
             (this.MSSearchSettings_taxids!=null &&
              this.MSSearchSettings_taxids.equals(other.getMSSearchSettings_taxids()))) &&
            ((this.MSSearchSettings_chargehandling==null && other.getMSSearchSettings_chargehandling()==null) || 
             (this.MSSearchSettings_chargehandling!=null &&
              this.MSSearchSettings_chargehandling.equals(other.getMSSearchSettings_chargehandling()))) &&
            ((this.MSSearchSettings_usermods==null && other.getMSSearchSettings_usermods()==null) || 
             (this.MSSearchSettings_usermods!=null &&
              this.MSSearchSettings_usermods.equals(other.getMSSearchSettings_usermods()))) &&
            ((this.MSSearchSettings_pseudocount==null && other.getMSSearchSettings_pseudocount()==null) || 
             (this.MSSearchSettings_pseudocount!=null &&
              this.MSSearchSettings_pseudocount.equals(other.getMSSearchSettings_pseudocount()))) &&
            ((this.MSSearchSettings_searchb1==null && other.getMSSearchSettings_searchb1()==null) || 
             (this.MSSearchSettings_searchb1!=null &&
              this.MSSearchSettings_searchb1.equals(other.getMSSearchSettings_searchb1()))) &&
            ((this.MSSearchSettings_searchctermproduct==null && other.getMSSearchSettings_searchctermproduct()==null) || 
             (this.MSSearchSettings_searchctermproduct!=null &&
              this.MSSearchSettings_searchctermproduct.equals(other.getMSSearchSettings_searchctermproduct()))) &&
            ((this.MSSearchSettings_maxproductions==null && other.getMSSearchSettings_maxproductions()==null) || 
             (this.MSSearchSettings_maxproductions!=null &&
              this.MSSearchSettings_maxproductions.equals(other.getMSSearchSettings_maxproductions()))) &&
            ((this.MSSearchSettings_minnoenzyme==null && other.getMSSearchSettings_minnoenzyme()==null) || 
             (this.MSSearchSettings_minnoenzyme!=null &&
              this.MSSearchSettings_minnoenzyme.equals(other.getMSSearchSettings_minnoenzyme()))) &&
            ((this.MSSearchSettings_maxnoenzyme==null && other.getMSSearchSettings_maxnoenzyme()==null) || 
             (this.MSSearchSettings_maxnoenzyme!=null &&
              this.MSSearchSettings_maxnoenzyme.equals(other.getMSSearchSettings_maxnoenzyme()))) &&
            ((this.MSSearchSettings_exactmass==null && other.getMSSearchSettings_exactmass()==null) || 
             (this.MSSearchSettings_exactmass!=null &&
              this.MSSearchSettings_exactmass.equals(other.getMSSearchSettings_exactmass()))) &&
            ((this.MSSearchSettings_settingid==null && other.getMSSearchSettings_settingid()==null) || 
             (this.MSSearchSettings_settingid!=null &&
              this.MSSearchSettings_settingid.equals(other.getMSSearchSettings_settingid()))) &&
            ((this.MSSearchSettings_iterativesettings==null && other.getMSSearchSettings_iterativesettings()==null) || 
             (this.MSSearchSettings_iterativesettings!=null &&
              this.MSSearchSettings_iterativesettings.equals(other.getMSSearchSettings_iterativesettings())));
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
        if (getMSSearchSettings_precursorsearchtype() != null) {
            _hashCode += getMSSearchSettings_precursorsearchtype().hashCode();
        }
        if (getMSSearchSettings_productsearchtype() != null) {
            _hashCode += getMSSearchSettings_productsearchtype().hashCode();
        }
        if (getMSSearchSettings_ionstosearch() != null) {
            _hashCode += getMSSearchSettings_ionstosearch().hashCode();
        }
        if (getMSSearchSettings_peptol() != null) {
            _hashCode += getMSSearchSettings_peptol().hashCode();
        }
        if (getMSSearchSettings_msmstol() != null) {
            _hashCode += getMSSearchSettings_msmstol().hashCode();
        }
        if (getMSSearchSettings_zdep() != null) {
            _hashCode += getMSSearchSettings_zdep().hashCode();
        }
        if (getMSSearchSettings_cutoff() != null) {
            _hashCode += getMSSearchSettings_cutoff().hashCode();
        }
        if (getMSSearchSettings_cutlo() != null) {
            _hashCode += getMSSearchSettings_cutlo().hashCode();
        }
        if (getMSSearchSettings_cuthi() != null) {
            _hashCode += getMSSearchSettings_cuthi().hashCode();
        }
        if (getMSSearchSettings_cutinc() != null) {
            _hashCode += getMSSearchSettings_cutinc().hashCode();
        }
        if (getMSSearchSettings_singlewin() != null) {
            _hashCode += getMSSearchSettings_singlewin().hashCode();
        }
        if (getMSSearchSettings_doublewin() != null) {
            _hashCode += getMSSearchSettings_doublewin().hashCode();
        }
        if (getMSSearchSettings_singlenum() != null) {
            _hashCode += getMSSearchSettings_singlenum().hashCode();
        }
        if (getMSSearchSettings_doublenum() != null) {
            _hashCode += getMSSearchSettings_doublenum().hashCode();
        }
        if (getMSSearchSettings_fixed() != null) {
            _hashCode += getMSSearchSettings_fixed().hashCode();
        }
        if (getMSSearchSettings_variable() != null) {
            _hashCode += getMSSearchSettings_variable().hashCode();
        }
        if (getMSSearchSettings_enzyme() != null) {
            _hashCode += getMSSearchSettings_enzyme().hashCode();
        }
        if (getMSSearchSettings_missedcleave() != null) {
            _hashCode += getMSSearchSettings_missedcleave().hashCode();
        }
        if (getMSSearchSettings_hitlistlen() != null) {
            _hashCode += getMSSearchSettings_hitlistlen().hashCode();
        }
        if (getMSSearchSettings_db() != null) {
            _hashCode += getMSSearchSettings_db().hashCode();
        }
        if (getMSSearchSettings_tophitnum() != null) {
            _hashCode += getMSSearchSettings_tophitnum().hashCode();
        }
        if (getMSSearchSettings_minhit() != null) {
            _hashCode += getMSSearchSettings_minhit().hashCode();
        }
        if (getMSSearchSettings_minspectra() != null) {
            _hashCode += getMSSearchSettings_minspectra().hashCode();
        }
        if (getMSSearchSettings_scale() != null) {
            _hashCode += getMSSearchSettings_scale().hashCode();
        }
        if (getMSSearchSettings_maxmods() != null) {
            _hashCode += getMSSearchSettings_maxmods().hashCode();
        }
        if (getMSSearchSettings_taxids() != null) {
            _hashCode += getMSSearchSettings_taxids().hashCode();
        }
        if (getMSSearchSettings_chargehandling() != null) {
            _hashCode += getMSSearchSettings_chargehandling().hashCode();
        }
        if (getMSSearchSettings_usermods() != null) {
            _hashCode += getMSSearchSettings_usermods().hashCode();
        }
        if (getMSSearchSettings_pseudocount() != null) {
            _hashCode += getMSSearchSettings_pseudocount().hashCode();
        }
        if (getMSSearchSettings_searchb1() != null) {
            _hashCode += getMSSearchSettings_searchb1().hashCode();
        }
        if (getMSSearchSettings_searchctermproduct() != null) {
            _hashCode += getMSSearchSettings_searchctermproduct().hashCode();
        }
        if (getMSSearchSettings_maxproductions() != null) {
            _hashCode += getMSSearchSettings_maxproductions().hashCode();
        }
        if (getMSSearchSettings_minnoenzyme() != null) {
            _hashCode += getMSSearchSettings_minnoenzyme().hashCode();
        }
        if (getMSSearchSettings_maxnoenzyme() != null) {
            _hashCode += getMSSearchSettings_maxnoenzyme().hashCode();
        }
        if (getMSSearchSettings_exactmass() != null) {
            _hashCode += getMSSearchSettings_exactmass().hashCode();
        }
        if (getMSSearchSettings_settingid() != null) {
            _hashCode += getMSSearchSettings_settingid().hashCode();
        }
        if (getMSSearchSettings_iterativesettings() != null) {
            _hashCode += getMSSearchSettings_iterativesettings().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MSSearchSettingsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettingsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_precursorsearchtype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_precursorsearchtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_precursorsearchtypeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_productsearchtype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_productsearchtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_productsearchtypeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_ionstosearch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_ionstosearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_ionstosearchType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_peptol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_peptol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_msmstol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_msmstol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_zdep");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_zdep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_zdepType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_cutoff");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_cutoff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_cutlo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_cutlo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_cuthi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_cuthi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_cutinc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_cutinc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_singlewin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_singlewin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_doublewin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_doublewin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_singlenum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_singlenum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_doublenum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_doublenum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_fixed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_fixed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_fixedType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_variable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_variable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_variableType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_enzyme");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_enzyme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_enzymeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_missedcleave");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_missedcleave"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_hitlistlen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_hitlistlen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_db");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_db"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_tophitnum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_tophitnum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_minhit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_minhit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_minspectra");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_minspectra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_scale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_scale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_maxmods");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_maxmods"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_taxids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_taxids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_taxidsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_chargehandling");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_chargehandling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_chargehandlingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_usermods");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_usermods"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_usermodsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_pseudocount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_pseudocount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_searchb1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_searchb1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_searchctermproduct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_searchctermproduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_maxproductions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_maxproductions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_minnoenzyme");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_minnoenzyme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_maxnoenzyme");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_maxnoenzyme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_exactmass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_exactmass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_settingid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_settingid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearchSettings_iterativesettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_iterativesettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearchSettings_iterativesettingsType"));
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
