/**
 * SeqFeatDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqFeatDataType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_geneType seqFeatData_gene;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_orgType seqFeatData_org;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_cdregionType seqFeatData_cdregion;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_protType seqFeatData_prot;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_rnaType seqFeatData_rna;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_pubType seqFeatData_pub;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_seqType seqFeatData_seq;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_impType seqFeatData_imp;

    private java.lang.String seqFeatData_region;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_comment seqFeatData_comment;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_bondType seqFeatData_bond;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_siteType seqFeatData_site;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_rsiteType seqFeatData_rsite;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_userType seqFeatData_user;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_txinitType seqFeatData_txinit;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_numType seqFeatData_num;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_psecStrType seqFeatData_psecStr;

    private java.lang.String seqFeatData_nonStdResidue;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_hetType seqFeatData_het;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_biosrcType seqFeatData_biosrc;

    public SeqFeatDataType() {
    }

    public SeqFeatDataType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_geneType seqFeatData_gene,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_orgType seqFeatData_org,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_cdregionType seqFeatData_cdregion,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_protType seqFeatData_prot,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_rnaType seqFeatData_rna,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_pubType seqFeatData_pub,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_seqType seqFeatData_seq,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_impType seqFeatData_imp,
           java.lang.String seqFeatData_region,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_comment seqFeatData_comment,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_bondType seqFeatData_bond,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_siteType seqFeatData_site,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_rsiteType seqFeatData_rsite,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_userType seqFeatData_user,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_txinitType seqFeatData_txinit,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_numType seqFeatData_num,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_psecStrType seqFeatData_psecStr,
           java.lang.String seqFeatData_nonStdResidue,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_hetType seqFeatData_het,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_biosrcType seqFeatData_biosrc) {
           this.seqFeatData_gene = seqFeatData_gene;
           this.seqFeatData_org = seqFeatData_org;
           this.seqFeatData_cdregion = seqFeatData_cdregion;
           this.seqFeatData_prot = seqFeatData_prot;
           this.seqFeatData_rna = seqFeatData_rna;
           this.seqFeatData_pub = seqFeatData_pub;
           this.seqFeatData_seq = seqFeatData_seq;
           this.seqFeatData_imp = seqFeatData_imp;
           this.seqFeatData_region = seqFeatData_region;
           this.seqFeatData_comment = seqFeatData_comment;
           this.seqFeatData_bond = seqFeatData_bond;
           this.seqFeatData_site = seqFeatData_site;
           this.seqFeatData_rsite = seqFeatData_rsite;
           this.seqFeatData_user = seqFeatData_user;
           this.seqFeatData_txinit = seqFeatData_txinit;
           this.seqFeatData_num = seqFeatData_num;
           this.seqFeatData_psecStr = seqFeatData_psecStr;
           this.seqFeatData_nonStdResidue = seqFeatData_nonStdResidue;
           this.seqFeatData_het = seqFeatData_het;
           this.seqFeatData_biosrc = seqFeatData_biosrc;
    }


    /**
     * Gets the seqFeatData_gene value for this SeqFeatDataType.
     * 
     * @return seqFeatData_gene
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_geneType getSeqFeatData_gene() {
        return seqFeatData_gene;
    }


    /**
     * Sets the seqFeatData_gene value for this SeqFeatDataType.
     * 
     * @param seqFeatData_gene
     */
    public void setSeqFeatData_gene(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_geneType seqFeatData_gene) {
        this.seqFeatData_gene = seqFeatData_gene;
    }


    /**
     * Gets the seqFeatData_org value for this SeqFeatDataType.
     * 
     * @return seqFeatData_org
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_orgType getSeqFeatData_org() {
        return seqFeatData_org;
    }


    /**
     * Sets the seqFeatData_org value for this SeqFeatDataType.
     * 
     * @param seqFeatData_org
     */
    public void setSeqFeatData_org(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_orgType seqFeatData_org) {
        this.seqFeatData_org = seqFeatData_org;
    }


    /**
     * Gets the seqFeatData_cdregion value for this SeqFeatDataType.
     * 
     * @return seqFeatData_cdregion
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_cdregionType getSeqFeatData_cdregion() {
        return seqFeatData_cdregion;
    }


    /**
     * Sets the seqFeatData_cdregion value for this SeqFeatDataType.
     * 
     * @param seqFeatData_cdregion
     */
    public void setSeqFeatData_cdregion(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_cdregionType seqFeatData_cdregion) {
        this.seqFeatData_cdregion = seqFeatData_cdregion;
    }


    /**
     * Gets the seqFeatData_prot value for this SeqFeatDataType.
     * 
     * @return seqFeatData_prot
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_protType getSeqFeatData_prot() {
        return seqFeatData_prot;
    }


    /**
     * Sets the seqFeatData_prot value for this SeqFeatDataType.
     * 
     * @param seqFeatData_prot
     */
    public void setSeqFeatData_prot(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_protType seqFeatData_prot) {
        this.seqFeatData_prot = seqFeatData_prot;
    }


    /**
     * Gets the seqFeatData_rna value for this SeqFeatDataType.
     * 
     * @return seqFeatData_rna
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_rnaType getSeqFeatData_rna() {
        return seqFeatData_rna;
    }


    /**
     * Sets the seqFeatData_rna value for this SeqFeatDataType.
     * 
     * @param seqFeatData_rna
     */
    public void setSeqFeatData_rna(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_rnaType seqFeatData_rna) {
        this.seqFeatData_rna = seqFeatData_rna;
    }


    /**
     * Gets the seqFeatData_pub value for this SeqFeatDataType.
     * 
     * @return seqFeatData_pub
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_pubType getSeqFeatData_pub() {
        return seqFeatData_pub;
    }


    /**
     * Sets the seqFeatData_pub value for this SeqFeatDataType.
     * 
     * @param seqFeatData_pub
     */
    public void setSeqFeatData_pub(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_pubType seqFeatData_pub) {
        this.seqFeatData_pub = seqFeatData_pub;
    }


    /**
     * Gets the seqFeatData_seq value for this SeqFeatDataType.
     * 
     * @return seqFeatData_seq
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_seqType getSeqFeatData_seq() {
        return seqFeatData_seq;
    }


    /**
     * Sets the seqFeatData_seq value for this SeqFeatDataType.
     * 
     * @param seqFeatData_seq
     */
    public void setSeqFeatData_seq(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_seqType seqFeatData_seq) {
        this.seqFeatData_seq = seqFeatData_seq;
    }


    /**
     * Gets the seqFeatData_imp value for this SeqFeatDataType.
     * 
     * @return seqFeatData_imp
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_impType getSeqFeatData_imp() {
        return seqFeatData_imp;
    }


    /**
     * Sets the seqFeatData_imp value for this SeqFeatDataType.
     * 
     * @param seqFeatData_imp
     */
    public void setSeqFeatData_imp(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_impType seqFeatData_imp) {
        this.seqFeatData_imp = seqFeatData_imp;
    }


    /**
     * Gets the seqFeatData_region value for this SeqFeatDataType.
     * 
     * @return seqFeatData_region
     */
    public java.lang.String getSeqFeatData_region() {
        return seqFeatData_region;
    }


    /**
     * Sets the seqFeatData_region value for this SeqFeatDataType.
     * 
     * @param seqFeatData_region
     */
    public void setSeqFeatData_region(java.lang.String seqFeatData_region) {
        this.seqFeatData_region = seqFeatData_region;
    }


    /**
     * Gets the seqFeatData_comment value for this SeqFeatDataType.
     * 
     * @return seqFeatData_comment
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_comment getSeqFeatData_comment() {
        return seqFeatData_comment;
    }


    /**
     * Sets the seqFeatData_comment value for this SeqFeatDataType.
     * 
     * @param seqFeatData_comment
     */
    public void setSeqFeatData_comment(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_comment seqFeatData_comment) {
        this.seqFeatData_comment = seqFeatData_comment;
    }


    /**
     * Gets the seqFeatData_bond value for this SeqFeatDataType.
     * 
     * @return seqFeatData_bond
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_bondType getSeqFeatData_bond() {
        return seqFeatData_bond;
    }


    /**
     * Sets the seqFeatData_bond value for this SeqFeatDataType.
     * 
     * @param seqFeatData_bond
     */
    public void setSeqFeatData_bond(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_bondType seqFeatData_bond) {
        this.seqFeatData_bond = seqFeatData_bond;
    }


    /**
     * Gets the seqFeatData_site value for this SeqFeatDataType.
     * 
     * @return seqFeatData_site
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_siteType getSeqFeatData_site() {
        return seqFeatData_site;
    }


    /**
     * Sets the seqFeatData_site value for this SeqFeatDataType.
     * 
     * @param seqFeatData_site
     */
    public void setSeqFeatData_site(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_siteType seqFeatData_site) {
        this.seqFeatData_site = seqFeatData_site;
    }


    /**
     * Gets the seqFeatData_rsite value for this SeqFeatDataType.
     * 
     * @return seqFeatData_rsite
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_rsiteType getSeqFeatData_rsite() {
        return seqFeatData_rsite;
    }


    /**
     * Sets the seqFeatData_rsite value for this SeqFeatDataType.
     * 
     * @param seqFeatData_rsite
     */
    public void setSeqFeatData_rsite(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_rsiteType seqFeatData_rsite) {
        this.seqFeatData_rsite = seqFeatData_rsite;
    }


    /**
     * Gets the seqFeatData_user value for this SeqFeatDataType.
     * 
     * @return seqFeatData_user
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_userType getSeqFeatData_user() {
        return seqFeatData_user;
    }


    /**
     * Sets the seqFeatData_user value for this SeqFeatDataType.
     * 
     * @param seqFeatData_user
     */
    public void setSeqFeatData_user(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_userType seqFeatData_user) {
        this.seqFeatData_user = seqFeatData_user;
    }


    /**
     * Gets the seqFeatData_txinit value for this SeqFeatDataType.
     * 
     * @return seqFeatData_txinit
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_txinitType getSeqFeatData_txinit() {
        return seqFeatData_txinit;
    }


    /**
     * Sets the seqFeatData_txinit value for this SeqFeatDataType.
     * 
     * @param seqFeatData_txinit
     */
    public void setSeqFeatData_txinit(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_txinitType seqFeatData_txinit) {
        this.seqFeatData_txinit = seqFeatData_txinit;
    }


    /**
     * Gets the seqFeatData_num value for this SeqFeatDataType.
     * 
     * @return seqFeatData_num
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_numType getSeqFeatData_num() {
        return seqFeatData_num;
    }


    /**
     * Sets the seqFeatData_num value for this SeqFeatDataType.
     * 
     * @param seqFeatData_num
     */
    public void setSeqFeatData_num(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_numType seqFeatData_num) {
        this.seqFeatData_num = seqFeatData_num;
    }


    /**
     * Gets the seqFeatData_psecStr value for this SeqFeatDataType.
     * 
     * @return seqFeatData_psecStr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_psecStrType getSeqFeatData_psecStr() {
        return seqFeatData_psecStr;
    }


    /**
     * Sets the seqFeatData_psecStr value for this SeqFeatDataType.
     * 
     * @param seqFeatData_psecStr
     */
    public void setSeqFeatData_psecStr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_psecStrType seqFeatData_psecStr) {
        this.seqFeatData_psecStr = seqFeatData_psecStr;
    }


    /**
     * Gets the seqFeatData_nonStdResidue value for this SeqFeatDataType.
     * 
     * @return seqFeatData_nonStdResidue
     */
    public java.lang.String getSeqFeatData_nonStdResidue() {
        return seqFeatData_nonStdResidue;
    }


    /**
     * Sets the seqFeatData_nonStdResidue value for this SeqFeatDataType.
     * 
     * @param seqFeatData_nonStdResidue
     */
    public void setSeqFeatData_nonStdResidue(java.lang.String seqFeatData_nonStdResidue) {
        this.seqFeatData_nonStdResidue = seqFeatData_nonStdResidue;
    }


    /**
     * Gets the seqFeatData_het value for this SeqFeatDataType.
     * 
     * @return seqFeatData_het
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_hetType getSeqFeatData_het() {
        return seqFeatData_het;
    }


    /**
     * Sets the seqFeatData_het value for this SeqFeatDataType.
     * 
     * @param seqFeatData_het
     */
    public void setSeqFeatData_het(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_hetType seqFeatData_het) {
        this.seqFeatData_het = seqFeatData_het;
    }


    /**
     * Gets the seqFeatData_biosrc value for this SeqFeatDataType.
     * 
     * @return seqFeatData_biosrc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_biosrcType getSeqFeatData_biosrc() {
        return seqFeatData_biosrc;
    }


    /**
     * Sets the seqFeatData_biosrc value for this SeqFeatDataType.
     * 
     * @param seqFeatData_biosrc
     */
    public void setSeqFeatData_biosrc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqFeatData_biosrcType seqFeatData_biosrc) {
        this.seqFeatData_biosrc = seqFeatData_biosrc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqFeatDataType)) return false;
        SeqFeatDataType other = (SeqFeatDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqFeatData_gene==null && other.getSeqFeatData_gene()==null) || 
             (this.seqFeatData_gene!=null &&
              this.seqFeatData_gene.equals(other.getSeqFeatData_gene()))) &&
            ((this.seqFeatData_org==null && other.getSeqFeatData_org()==null) || 
             (this.seqFeatData_org!=null &&
              this.seqFeatData_org.equals(other.getSeqFeatData_org()))) &&
            ((this.seqFeatData_cdregion==null && other.getSeqFeatData_cdregion()==null) || 
             (this.seqFeatData_cdregion!=null &&
              this.seqFeatData_cdregion.equals(other.getSeqFeatData_cdregion()))) &&
            ((this.seqFeatData_prot==null && other.getSeqFeatData_prot()==null) || 
             (this.seqFeatData_prot!=null &&
              this.seqFeatData_prot.equals(other.getSeqFeatData_prot()))) &&
            ((this.seqFeatData_rna==null && other.getSeqFeatData_rna()==null) || 
             (this.seqFeatData_rna!=null &&
              this.seqFeatData_rna.equals(other.getSeqFeatData_rna()))) &&
            ((this.seqFeatData_pub==null && other.getSeqFeatData_pub()==null) || 
             (this.seqFeatData_pub!=null &&
              this.seqFeatData_pub.equals(other.getSeqFeatData_pub()))) &&
            ((this.seqFeatData_seq==null && other.getSeqFeatData_seq()==null) || 
             (this.seqFeatData_seq!=null &&
              this.seqFeatData_seq.equals(other.getSeqFeatData_seq()))) &&
            ((this.seqFeatData_imp==null && other.getSeqFeatData_imp()==null) || 
             (this.seqFeatData_imp!=null &&
              this.seqFeatData_imp.equals(other.getSeqFeatData_imp()))) &&
            ((this.seqFeatData_region==null && other.getSeqFeatData_region()==null) || 
             (this.seqFeatData_region!=null &&
              this.seqFeatData_region.equals(other.getSeqFeatData_region()))) &&
            ((this.seqFeatData_comment==null && other.getSeqFeatData_comment()==null) || 
             (this.seqFeatData_comment!=null &&
              this.seqFeatData_comment.equals(other.getSeqFeatData_comment()))) &&
            ((this.seqFeatData_bond==null && other.getSeqFeatData_bond()==null) || 
             (this.seqFeatData_bond!=null &&
              this.seqFeatData_bond.equals(other.getSeqFeatData_bond()))) &&
            ((this.seqFeatData_site==null && other.getSeqFeatData_site()==null) || 
             (this.seqFeatData_site!=null &&
              this.seqFeatData_site.equals(other.getSeqFeatData_site()))) &&
            ((this.seqFeatData_rsite==null && other.getSeqFeatData_rsite()==null) || 
             (this.seqFeatData_rsite!=null &&
              this.seqFeatData_rsite.equals(other.getSeqFeatData_rsite()))) &&
            ((this.seqFeatData_user==null && other.getSeqFeatData_user()==null) || 
             (this.seqFeatData_user!=null &&
              this.seqFeatData_user.equals(other.getSeqFeatData_user()))) &&
            ((this.seqFeatData_txinit==null && other.getSeqFeatData_txinit()==null) || 
             (this.seqFeatData_txinit!=null &&
              this.seqFeatData_txinit.equals(other.getSeqFeatData_txinit()))) &&
            ((this.seqFeatData_num==null && other.getSeqFeatData_num()==null) || 
             (this.seqFeatData_num!=null &&
              this.seqFeatData_num.equals(other.getSeqFeatData_num()))) &&
            ((this.seqFeatData_psecStr==null && other.getSeqFeatData_psecStr()==null) || 
             (this.seqFeatData_psecStr!=null &&
              this.seqFeatData_psecStr.equals(other.getSeqFeatData_psecStr()))) &&
            ((this.seqFeatData_nonStdResidue==null && other.getSeqFeatData_nonStdResidue()==null) || 
             (this.seqFeatData_nonStdResidue!=null &&
              this.seqFeatData_nonStdResidue.equals(other.getSeqFeatData_nonStdResidue()))) &&
            ((this.seqFeatData_het==null && other.getSeqFeatData_het()==null) || 
             (this.seqFeatData_het!=null &&
              this.seqFeatData_het.equals(other.getSeqFeatData_het()))) &&
            ((this.seqFeatData_biosrc==null && other.getSeqFeatData_biosrc()==null) || 
             (this.seqFeatData_biosrc!=null &&
              this.seqFeatData_biosrc.equals(other.getSeqFeatData_biosrc())));
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
        if (getSeqFeatData_gene() != null) {
            _hashCode += getSeqFeatData_gene().hashCode();
        }
        if (getSeqFeatData_org() != null) {
            _hashCode += getSeqFeatData_org().hashCode();
        }
        if (getSeqFeatData_cdregion() != null) {
            _hashCode += getSeqFeatData_cdregion().hashCode();
        }
        if (getSeqFeatData_prot() != null) {
            _hashCode += getSeqFeatData_prot().hashCode();
        }
        if (getSeqFeatData_rna() != null) {
            _hashCode += getSeqFeatData_rna().hashCode();
        }
        if (getSeqFeatData_pub() != null) {
            _hashCode += getSeqFeatData_pub().hashCode();
        }
        if (getSeqFeatData_seq() != null) {
            _hashCode += getSeqFeatData_seq().hashCode();
        }
        if (getSeqFeatData_imp() != null) {
            _hashCode += getSeqFeatData_imp().hashCode();
        }
        if (getSeqFeatData_region() != null) {
            _hashCode += getSeqFeatData_region().hashCode();
        }
        if (getSeqFeatData_comment() != null) {
            _hashCode += getSeqFeatData_comment().hashCode();
        }
        if (getSeqFeatData_bond() != null) {
            _hashCode += getSeqFeatData_bond().hashCode();
        }
        if (getSeqFeatData_site() != null) {
            _hashCode += getSeqFeatData_site().hashCode();
        }
        if (getSeqFeatData_rsite() != null) {
            _hashCode += getSeqFeatData_rsite().hashCode();
        }
        if (getSeqFeatData_user() != null) {
            _hashCode += getSeqFeatData_user().hashCode();
        }
        if (getSeqFeatData_txinit() != null) {
            _hashCode += getSeqFeatData_txinit().hashCode();
        }
        if (getSeqFeatData_num() != null) {
            _hashCode += getSeqFeatData_num().hashCode();
        }
        if (getSeqFeatData_psecStr() != null) {
            _hashCode += getSeqFeatData_psecStr().hashCode();
        }
        if (getSeqFeatData_nonStdResidue() != null) {
            _hashCode += getSeqFeatData_nonStdResidue().hashCode();
        }
        if (getSeqFeatData_het() != null) {
            _hashCode += getSeqFeatData_het().hashCode();
        }
        if (getSeqFeatData_biosrc() != null) {
            _hashCode += getSeqFeatData_biosrc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqFeatDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqFeatData_gene");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_gene"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_geneType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqFeatData_org");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_org"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_orgType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqFeatData_cdregion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_cdregion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_cdregionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqFeatData_prot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_prot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_protType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqFeatData_rna");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_rna"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_rnaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqFeatData_pub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_pub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_pubType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqFeatData_seq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_seq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_seqType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqFeatData_imp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_imp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_impType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqFeatData_region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqFeatData_comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">SeqFeatData_comment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqFeatData_bond");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_bond"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_bondType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqFeatData_site");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_site"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_siteType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqFeatData_rsite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_rsite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_rsiteType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqFeatData_user");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_userType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqFeatData_txinit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_txinit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_txinitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqFeatData_num");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_numType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqFeatData_psecStr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_psec-str"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_psec-strType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqFeatData_nonStdResidue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_non-std-residue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqFeatData_het");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_het"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_hetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqFeatData_biosrc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_biosrc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqFeatData_biosrcType"));
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
