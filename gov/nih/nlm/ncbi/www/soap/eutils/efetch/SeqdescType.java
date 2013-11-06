/**
 * SeqdescType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqdescType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_molTypeType seqdesc_molType;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_modifType seqdesc_modif;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_methodType seqdesc_method;

    private java.lang.String seqdesc_name;

    private java.lang.String seqdesc_title;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_orgType seqdesc_org;

    private java.lang.String seqdesc_comment;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_numType seqdesc_num;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_maplocType seqdesc_maploc;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_pirType seqdesc_pir;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_genbankType seqdesc_genbank;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_pubType seqdesc_pub;

    private java.lang.String seqdesc_region;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_userType seqdesc_user;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_spType seqdesc_sp;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_dbxrefType seqdesc_dbxref;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_emblType seqdesc_embl;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_createDateType seqdesc_createDate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_updateDateType seqdesc_updateDate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_prfType seqdesc_prf;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_pdbType seqdesc_pdb;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_hetType seqdesc_het;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_sourceType seqdesc_source;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_molinfoType seqdesc_molinfo;

    public SeqdescType() {
    }

    public SeqdescType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_molTypeType seqdesc_molType,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_modifType seqdesc_modif,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_methodType seqdesc_method,
           java.lang.String seqdesc_name,
           java.lang.String seqdesc_title,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_orgType seqdesc_org,
           java.lang.String seqdesc_comment,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_numType seqdesc_num,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_maplocType seqdesc_maploc,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_pirType seqdesc_pir,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_genbankType seqdesc_genbank,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_pubType seqdesc_pub,
           java.lang.String seqdesc_region,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_userType seqdesc_user,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_spType seqdesc_sp,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_dbxrefType seqdesc_dbxref,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_emblType seqdesc_embl,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_createDateType seqdesc_createDate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_updateDateType seqdesc_updateDate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_prfType seqdesc_prf,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_pdbType seqdesc_pdb,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_hetType seqdesc_het,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_sourceType seqdesc_source,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_molinfoType seqdesc_molinfo) {
           this.seqdesc_molType = seqdesc_molType;
           this.seqdesc_modif = seqdesc_modif;
           this.seqdesc_method = seqdesc_method;
           this.seqdesc_name = seqdesc_name;
           this.seqdesc_title = seqdesc_title;
           this.seqdesc_org = seqdesc_org;
           this.seqdesc_comment = seqdesc_comment;
           this.seqdesc_num = seqdesc_num;
           this.seqdesc_maploc = seqdesc_maploc;
           this.seqdesc_pir = seqdesc_pir;
           this.seqdesc_genbank = seqdesc_genbank;
           this.seqdesc_pub = seqdesc_pub;
           this.seqdesc_region = seqdesc_region;
           this.seqdesc_user = seqdesc_user;
           this.seqdesc_sp = seqdesc_sp;
           this.seqdesc_dbxref = seqdesc_dbxref;
           this.seqdesc_embl = seqdesc_embl;
           this.seqdesc_createDate = seqdesc_createDate;
           this.seqdesc_updateDate = seqdesc_updateDate;
           this.seqdesc_prf = seqdesc_prf;
           this.seqdesc_pdb = seqdesc_pdb;
           this.seqdesc_het = seqdesc_het;
           this.seqdesc_source = seqdesc_source;
           this.seqdesc_molinfo = seqdesc_molinfo;
    }


    /**
     * Gets the seqdesc_molType value for this SeqdescType.
     * 
     * @return seqdesc_molType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_molTypeType getSeqdesc_molType() {
        return seqdesc_molType;
    }


    /**
     * Sets the seqdesc_molType value for this SeqdescType.
     * 
     * @param seqdesc_molType
     */
    public void setSeqdesc_molType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_molTypeType seqdesc_molType) {
        this.seqdesc_molType = seqdesc_molType;
    }


    /**
     * Gets the seqdesc_modif value for this SeqdescType.
     * 
     * @return seqdesc_modif
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_modifType getSeqdesc_modif() {
        return seqdesc_modif;
    }


    /**
     * Sets the seqdesc_modif value for this SeqdescType.
     * 
     * @param seqdesc_modif
     */
    public void setSeqdesc_modif(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_modifType seqdesc_modif) {
        this.seqdesc_modif = seqdesc_modif;
    }


    /**
     * Gets the seqdesc_method value for this SeqdescType.
     * 
     * @return seqdesc_method
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_methodType getSeqdesc_method() {
        return seqdesc_method;
    }


    /**
     * Sets the seqdesc_method value for this SeqdescType.
     * 
     * @param seqdesc_method
     */
    public void setSeqdesc_method(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_methodType seqdesc_method) {
        this.seqdesc_method = seqdesc_method;
    }


    /**
     * Gets the seqdesc_name value for this SeqdescType.
     * 
     * @return seqdesc_name
     */
    public java.lang.String getSeqdesc_name() {
        return seqdesc_name;
    }


    /**
     * Sets the seqdesc_name value for this SeqdescType.
     * 
     * @param seqdesc_name
     */
    public void setSeqdesc_name(java.lang.String seqdesc_name) {
        this.seqdesc_name = seqdesc_name;
    }


    /**
     * Gets the seqdesc_title value for this SeqdescType.
     * 
     * @return seqdesc_title
     */
    public java.lang.String getSeqdesc_title() {
        return seqdesc_title;
    }


    /**
     * Sets the seqdesc_title value for this SeqdescType.
     * 
     * @param seqdesc_title
     */
    public void setSeqdesc_title(java.lang.String seqdesc_title) {
        this.seqdesc_title = seqdesc_title;
    }


    /**
     * Gets the seqdesc_org value for this SeqdescType.
     * 
     * @return seqdesc_org
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_orgType getSeqdesc_org() {
        return seqdesc_org;
    }


    /**
     * Sets the seqdesc_org value for this SeqdescType.
     * 
     * @param seqdesc_org
     */
    public void setSeqdesc_org(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_orgType seqdesc_org) {
        this.seqdesc_org = seqdesc_org;
    }


    /**
     * Gets the seqdesc_comment value for this SeqdescType.
     * 
     * @return seqdesc_comment
     */
    public java.lang.String getSeqdesc_comment() {
        return seqdesc_comment;
    }


    /**
     * Sets the seqdesc_comment value for this SeqdescType.
     * 
     * @param seqdesc_comment
     */
    public void setSeqdesc_comment(java.lang.String seqdesc_comment) {
        this.seqdesc_comment = seqdesc_comment;
    }


    /**
     * Gets the seqdesc_num value for this SeqdescType.
     * 
     * @return seqdesc_num
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_numType getSeqdesc_num() {
        return seqdesc_num;
    }


    /**
     * Sets the seqdesc_num value for this SeqdescType.
     * 
     * @param seqdesc_num
     */
    public void setSeqdesc_num(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_numType seqdesc_num) {
        this.seqdesc_num = seqdesc_num;
    }


    /**
     * Gets the seqdesc_maploc value for this SeqdescType.
     * 
     * @return seqdesc_maploc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_maplocType getSeqdesc_maploc() {
        return seqdesc_maploc;
    }


    /**
     * Sets the seqdesc_maploc value for this SeqdescType.
     * 
     * @param seqdesc_maploc
     */
    public void setSeqdesc_maploc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_maplocType seqdesc_maploc) {
        this.seqdesc_maploc = seqdesc_maploc;
    }


    /**
     * Gets the seqdesc_pir value for this SeqdescType.
     * 
     * @return seqdesc_pir
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_pirType getSeqdesc_pir() {
        return seqdesc_pir;
    }


    /**
     * Sets the seqdesc_pir value for this SeqdescType.
     * 
     * @param seqdesc_pir
     */
    public void setSeqdesc_pir(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_pirType seqdesc_pir) {
        this.seqdesc_pir = seqdesc_pir;
    }


    /**
     * Gets the seqdesc_genbank value for this SeqdescType.
     * 
     * @return seqdesc_genbank
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_genbankType getSeqdesc_genbank() {
        return seqdesc_genbank;
    }


    /**
     * Sets the seqdesc_genbank value for this SeqdescType.
     * 
     * @param seqdesc_genbank
     */
    public void setSeqdesc_genbank(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_genbankType seqdesc_genbank) {
        this.seqdesc_genbank = seqdesc_genbank;
    }


    /**
     * Gets the seqdesc_pub value for this SeqdescType.
     * 
     * @return seqdesc_pub
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_pubType getSeqdesc_pub() {
        return seqdesc_pub;
    }


    /**
     * Sets the seqdesc_pub value for this SeqdescType.
     * 
     * @param seqdesc_pub
     */
    public void setSeqdesc_pub(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_pubType seqdesc_pub) {
        this.seqdesc_pub = seqdesc_pub;
    }


    /**
     * Gets the seqdesc_region value for this SeqdescType.
     * 
     * @return seqdesc_region
     */
    public java.lang.String getSeqdesc_region() {
        return seqdesc_region;
    }


    /**
     * Sets the seqdesc_region value for this SeqdescType.
     * 
     * @param seqdesc_region
     */
    public void setSeqdesc_region(java.lang.String seqdesc_region) {
        this.seqdesc_region = seqdesc_region;
    }


    /**
     * Gets the seqdesc_user value for this SeqdescType.
     * 
     * @return seqdesc_user
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_userType getSeqdesc_user() {
        return seqdesc_user;
    }


    /**
     * Sets the seqdesc_user value for this SeqdescType.
     * 
     * @param seqdesc_user
     */
    public void setSeqdesc_user(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_userType seqdesc_user) {
        this.seqdesc_user = seqdesc_user;
    }


    /**
     * Gets the seqdesc_sp value for this SeqdescType.
     * 
     * @return seqdesc_sp
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_spType getSeqdesc_sp() {
        return seqdesc_sp;
    }


    /**
     * Sets the seqdesc_sp value for this SeqdescType.
     * 
     * @param seqdesc_sp
     */
    public void setSeqdesc_sp(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_spType seqdesc_sp) {
        this.seqdesc_sp = seqdesc_sp;
    }


    /**
     * Gets the seqdesc_dbxref value for this SeqdescType.
     * 
     * @return seqdesc_dbxref
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_dbxrefType getSeqdesc_dbxref() {
        return seqdesc_dbxref;
    }


    /**
     * Sets the seqdesc_dbxref value for this SeqdescType.
     * 
     * @param seqdesc_dbxref
     */
    public void setSeqdesc_dbxref(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_dbxrefType seqdesc_dbxref) {
        this.seqdesc_dbxref = seqdesc_dbxref;
    }


    /**
     * Gets the seqdesc_embl value for this SeqdescType.
     * 
     * @return seqdesc_embl
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_emblType getSeqdesc_embl() {
        return seqdesc_embl;
    }


    /**
     * Sets the seqdesc_embl value for this SeqdescType.
     * 
     * @param seqdesc_embl
     */
    public void setSeqdesc_embl(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_emblType seqdesc_embl) {
        this.seqdesc_embl = seqdesc_embl;
    }


    /**
     * Gets the seqdesc_createDate value for this SeqdescType.
     * 
     * @return seqdesc_createDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_createDateType getSeqdesc_createDate() {
        return seqdesc_createDate;
    }


    /**
     * Sets the seqdesc_createDate value for this SeqdescType.
     * 
     * @param seqdesc_createDate
     */
    public void setSeqdesc_createDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_createDateType seqdesc_createDate) {
        this.seqdesc_createDate = seqdesc_createDate;
    }


    /**
     * Gets the seqdesc_updateDate value for this SeqdescType.
     * 
     * @return seqdesc_updateDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_updateDateType getSeqdesc_updateDate() {
        return seqdesc_updateDate;
    }


    /**
     * Sets the seqdesc_updateDate value for this SeqdescType.
     * 
     * @param seqdesc_updateDate
     */
    public void setSeqdesc_updateDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_updateDateType seqdesc_updateDate) {
        this.seqdesc_updateDate = seqdesc_updateDate;
    }


    /**
     * Gets the seqdesc_prf value for this SeqdescType.
     * 
     * @return seqdesc_prf
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_prfType getSeqdesc_prf() {
        return seqdesc_prf;
    }


    /**
     * Sets the seqdesc_prf value for this SeqdescType.
     * 
     * @param seqdesc_prf
     */
    public void setSeqdesc_prf(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_prfType seqdesc_prf) {
        this.seqdesc_prf = seqdesc_prf;
    }


    /**
     * Gets the seqdesc_pdb value for this SeqdescType.
     * 
     * @return seqdesc_pdb
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_pdbType getSeqdesc_pdb() {
        return seqdesc_pdb;
    }


    /**
     * Sets the seqdesc_pdb value for this SeqdescType.
     * 
     * @param seqdesc_pdb
     */
    public void setSeqdesc_pdb(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_pdbType seqdesc_pdb) {
        this.seqdesc_pdb = seqdesc_pdb;
    }


    /**
     * Gets the seqdesc_het value for this SeqdescType.
     * 
     * @return seqdesc_het
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_hetType getSeqdesc_het() {
        return seqdesc_het;
    }


    /**
     * Sets the seqdesc_het value for this SeqdescType.
     * 
     * @param seqdesc_het
     */
    public void setSeqdesc_het(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_hetType seqdesc_het) {
        this.seqdesc_het = seqdesc_het;
    }


    /**
     * Gets the seqdesc_source value for this SeqdescType.
     * 
     * @return seqdesc_source
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_sourceType getSeqdesc_source() {
        return seqdesc_source;
    }


    /**
     * Sets the seqdesc_source value for this SeqdescType.
     * 
     * @param seqdesc_source
     */
    public void setSeqdesc_source(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_sourceType seqdesc_source) {
        this.seqdesc_source = seqdesc_source;
    }


    /**
     * Gets the seqdesc_molinfo value for this SeqdescType.
     * 
     * @return seqdesc_molinfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_molinfoType getSeqdesc_molinfo() {
        return seqdesc_molinfo;
    }


    /**
     * Sets the seqdesc_molinfo value for this SeqdescType.
     * 
     * @param seqdesc_molinfo
     */
    public void setSeqdesc_molinfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Seqdesc_molinfoType seqdesc_molinfo) {
        this.seqdesc_molinfo = seqdesc_molinfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqdescType)) return false;
        SeqdescType other = (SeqdescType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqdesc_molType==null && other.getSeqdesc_molType()==null) || 
             (this.seqdesc_molType!=null &&
              this.seqdesc_molType.equals(other.getSeqdesc_molType()))) &&
            ((this.seqdesc_modif==null && other.getSeqdesc_modif()==null) || 
             (this.seqdesc_modif!=null &&
              this.seqdesc_modif.equals(other.getSeqdesc_modif()))) &&
            ((this.seqdesc_method==null && other.getSeqdesc_method()==null) || 
             (this.seqdesc_method!=null &&
              this.seqdesc_method.equals(other.getSeqdesc_method()))) &&
            ((this.seqdesc_name==null && other.getSeqdesc_name()==null) || 
             (this.seqdesc_name!=null &&
              this.seqdesc_name.equals(other.getSeqdesc_name()))) &&
            ((this.seqdesc_title==null && other.getSeqdesc_title()==null) || 
             (this.seqdesc_title!=null &&
              this.seqdesc_title.equals(other.getSeqdesc_title()))) &&
            ((this.seqdesc_org==null && other.getSeqdesc_org()==null) || 
             (this.seqdesc_org!=null &&
              this.seqdesc_org.equals(other.getSeqdesc_org()))) &&
            ((this.seqdesc_comment==null && other.getSeqdesc_comment()==null) || 
             (this.seqdesc_comment!=null &&
              this.seqdesc_comment.equals(other.getSeqdesc_comment()))) &&
            ((this.seqdesc_num==null && other.getSeqdesc_num()==null) || 
             (this.seqdesc_num!=null &&
              this.seqdesc_num.equals(other.getSeqdesc_num()))) &&
            ((this.seqdesc_maploc==null && other.getSeqdesc_maploc()==null) || 
             (this.seqdesc_maploc!=null &&
              this.seqdesc_maploc.equals(other.getSeqdesc_maploc()))) &&
            ((this.seqdesc_pir==null && other.getSeqdesc_pir()==null) || 
             (this.seqdesc_pir!=null &&
              this.seqdesc_pir.equals(other.getSeqdesc_pir()))) &&
            ((this.seqdesc_genbank==null && other.getSeqdesc_genbank()==null) || 
             (this.seqdesc_genbank!=null &&
              this.seqdesc_genbank.equals(other.getSeqdesc_genbank()))) &&
            ((this.seqdesc_pub==null && other.getSeqdesc_pub()==null) || 
             (this.seqdesc_pub!=null &&
              this.seqdesc_pub.equals(other.getSeqdesc_pub()))) &&
            ((this.seqdesc_region==null && other.getSeqdesc_region()==null) || 
             (this.seqdesc_region!=null &&
              this.seqdesc_region.equals(other.getSeqdesc_region()))) &&
            ((this.seqdesc_user==null && other.getSeqdesc_user()==null) || 
             (this.seqdesc_user!=null &&
              this.seqdesc_user.equals(other.getSeqdesc_user()))) &&
            ((this.seqdesc_sp==null && other.getSeqdesc_sp()==null) || 
             (this.seqdesc_sp!=null &&
              this.seqdesc_sp.equals(other.getSeqdesc_sp()))) &&
            ((this.seqdesc_dbxref==null && other.getSeqdesc_dbxref()==null) || 
             (this.seqdesc_dbxref!=null &&
              this.seqdesc_dbxref.equals(other.getSeqdesc_dbxref()))) &&
            ((this.seqdesc_embl==null && other.getSeqdesc_embl()==null) || 
             (this.seqdesc_embl!=null &&
              this.seqdesc_embl.equals(other.getSeqdesc_embl()))) &&
            ((this.seqdesc_createDate==null && other.getSeqdesc_createDate()==null) || 
             (this.seqdesc_createDate!=null &&
              this.seqdesc_createDate.equals(other.getSeqdesc_createDate()))) &&
            ((this.seqdesc_updateDate==null && other.getSeqdesc_updateDate()==null) || 
             (this.seqdesc_updateDate!=null &&
              this.seqdesc_updateDate.equals(other.getSeqdesc_updateDate()))) &&
            ((this.seqdesc_prf==null && other.getSeqdesc_prf()==null) || 
             (this.seqdesc_prf!=null &&
              this.seqdesc_prf.equals(other.getSeqdesc_prf()))) &&
            ((this.seqdesc_pdb==null && other.getSeqdesc_pdb()==null) || 
             (this.seqdesc_pdb!=null &&
              this.seqdesc_pdb.equals(other.getSeqdesc_pdb()))) &&
            ((this.seqdesc_het==null && other.getSeqdesc_het()==null) || 
             (this.seqdesc_het!=null &&
              this.seqdesc_het.equals(other.getSeqdesc_het()))) &&
            ((this.seqdesc_source==null && other.getSeqdesc_source()==null) || 
             (this.seqdesc_source!=null &&
              this.seqdesc_source.equals(other.getSeqdesc_source()))) &&
            ((this.seqdesc_molinfo==null && other.getSeqdesc_molinfo()==null) || 
             (this.seqdesc_molinfo!=null &&
              this.seqdesc_molinfo.equals(other.getSeqdesc_molinfo())));
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
        if (getSeqdesc_molType() != null) {
            _hashCode += getSeqdesc_molType().hashCode();
        }
        if (getSeqdesc_modif() != null) {
            _hashCode += getSeqdesc_modif().hashCode();
        }
        if (getSeqdesc_method() != null) {
            _hashCode += getSeqdesc_method().hashCode();
        }
        if (getSeqdesc_name() != null) {
            _hashCode += getSeqdesc_name().hashCode();
        }
        if (getSeqdesc_title() != null) {
            _hashCode += getSeqdesc_title().hashCode();
        }
        if (getSeqdesc_org() != null) {
            _hashCode += getSeqdesc_org().hashCode();
        }
        if (getSeqdesc_comment() != null) {
            _hashCode += getSeqdesc_comment().hashCode();
        }
        if (getSeqdesc_num() != null) {
            _hashCode += getSeqdesc_num().hashCode();
        }
        if (getSeqdesc_maploc() != null) {
            _hashCode += getSeqdesc_maploc().hashCode();
        }
        if (getSeqdesc_pir() != null) {
            _hashCode += getSeqdesc_pir().hashCode();
        }
        if (getSeqdesc_genbank() != null) {
            _hashCode += getSeqdesc_genbank().hashCode();
        }
        if (getSeqdesc_pub() != null) {
            _hashCode += getSeqdesc_pub().hashCode();
        }
        if (getSeqdesc_region() != null) {
            _hashCode += getSeqdesc_region().hashCode();
        }
        if (getSeqdesc_user() != null) {
            _hashCode += getSeqdesc_user().hashCode();
        }
        if (getSeqdesc_sp() != null) {
            _hashCode += getSeqdesc_sp().hashCode();
        }
        if (getSeqdesc_dbxref() != null) {
            _hashCode += getSeqdesc_dbxref().hashCode();
        }
        if (getSeqdesc_embl() != null) {
            _hashCode += getSeqdesc_embl().hashCode();
        }
        if (getSeqdesc_createDate() != null) {
            _hashCode += getSeqdesc_createDate().hashCode();
        }
        if (getSeqdesc_updateDate() != null) {
            _hashCode += getSeqdesc_updateDate().hashCode();
        }
        if (getSeqdesc_prf() != null) {
            _hashCode += getSeqdesc_prf().hashCode();
        }
        if (getSeqdesc_pdb() != null) {
            _hashCode += getSeqdesc_pdb().hashCode();
        }
        if (getSeqdesc_het() != null) {
            _hashCode += getSeqdesc_het().hashCode();
        }
        if (getSeqdesc_source() != null) {
            _hashCode += getSeqdesc_source().hashCode();
        }
        if (getSeqdesc_molinfo() != null) {
            _hashCode += getSeqdesc_molinfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqdescType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqdescType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqdesc_molType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_mol-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_mol-typeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqdesc_modif");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_modif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_modifType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqdesc_method");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_method"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_methodType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqdesc_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqdesc_title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqdesc_org");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_org"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_orgType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqdesc_comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqdesc_num");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_numType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqdesc_maploc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_maploc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_maplocType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqdesc_pir");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_pir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_pirType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqdesc_genbank");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_genbank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_genbankType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqdesc_pub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_pub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_pubType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqdesc_region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqdesc_user");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_userType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqdesc_sp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_sp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_spType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqdesc_dbxref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_dbxref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_dbxrefType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqdesc_embl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_embl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_emblType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqdesc_createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_create-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_create-dateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqdesc_updateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_update-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_update-dateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqdesc_prf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_prf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_prfType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqdesc_pdb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_pdb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_pdbType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqdesc_het");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_het"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_hetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqdesc_source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_sourceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqdesc_molinfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_molinfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seqdesc_molinfoType"));
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
