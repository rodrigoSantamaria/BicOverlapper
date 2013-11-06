/**
 * HGGeneType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class HGGeneType  implements java.io.Serializable {
    private java.lang.String HGGene_geneid;

    private java.lang.String HGGene_otherid;

    private java.lang.String HGGene_symbol;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGGene_aliasesType HGGene_aliases;

    private java.lang.String HGGene_title;

    private java.lang.String HGGene_taxid;

    private java.lang.String HGGene_protGi;

    private java.lang.String HGGene_protAcc;

    private java.lang.String HGGene_protLen;

    private java.lang.String HGGene_nucGi;

    private java.lang.String HGGene_nucAcc;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGGene_geneLinksType HGGene_geneLinks;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGGene_protLinksType HGGene_protLinks;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGGene_domainsType HGGene_domains;

    private java.lang.String HGGene_chr;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGGene_locationType HGGene_location;

    private java.lang.String HGGene_locusTag;

    public HGGeneType() {
    }

    public HGGeneType(
           java.lang.String HGGene_geneid,
           java.lang.String HGGene_otherid,
           java.lang.String HGGene_symbol,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGGene_aliasesType HGGene_aliases,
           java.lang.String HGGene_title,
           java.lang.String HGGene_taxid,
           java.lang.String HGGene_protGi,
           java.lang.String HGGene_protAcc,
           java.lang.String HGGene_protLen,
           java.lang.String HGGene_nucGi,
           java.lang.String HGGene_nucAcc,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGGene_geneLinksType HGGene_geneLinks,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGGene_protLinksType HGGene_protLinks,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGGene_domainsType HGGene_domains,
           java.lang.String HGGene_chr,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGGene_locationType HGGene_location,
           java.lang.String HGGene_locusTag) {
           this.HGGene_geneid = HGGene_geneid;
           this.HGGene_otherid = HGGene_otherid;
           this.HGGene_symbol = HGGene_symbol;
           this.HGGene_aliases = HGGene_aliases;
           this.HGGene_title = HGGene_title;
           this.HGGene_taxid = HGGene_taxid;
           this.HGGene_protGi = HGGene_protGi;
           this.HGGene_protAcc = HGGene_protAcc;
           this.HGGene_protLen = HGGene_protLen;
           this.HGGene_nucGi = HGGene_nucGi;
           this.HGGene_nucAcc = HGGene_nucAcc;
           this.HGGene_geneLinks = HGGene_geneLinks;
           this.HGGene_protLinks = HGGene_protLinks;
           this.HGGene_domains = HGGene_domains;
           this.HGGene_chr = HGGene_chr;
           this.HGGene_location = HGGene_location;
           this.HGGene_locusTag = HGGene_locusTag;
    }


    /**
     * Gets the HGGene_geneid value for this HGGeneType.
     * 
     * @return HGGene_geneid
     */
    public java.lang.String getHGGene_geneid() {
        return HGGene_geneid;
    }


    /**
     * Sets the HGGene_geneid value for this HGGeneType.
     * 
     * @param HGGene_geneid
     */
    public void setHGGene_geneid(java.lang.String HGGene_geneid) {
        this.HGGene_geneid = HGGene_geneid;
    }


    /**
     * Gets the HGGene_otherid value for this HGGeneType.
     * 
     * @return HGGene_otherid
     */
    public java.lang.String getHGGene_otherid() {
        return HGGene_otherid;
    }


    /**
     * Sets the HGGene_otherid value for this HGGeneType.
     * 
     * @param HGGene_otherid
     */
    public void setHGGene_otherid(java.lang.String HGGene_otherid) {
        this.HGGene_otherid = HGGene_otherid;
    }


    /**
     * Gets the HGGene_symbol value for this HGGeneType.
     * 
     * @return HGGene_symbol
     */
    public java.lang.String getHGGene_symbol() {
        return HGGene_symbol;
    }


    /**
     * Sets the HGGene_symbol value for this HGGeneType.
     * 
     * @param HGGene_symbol
     */
    public void setHGGene_symbol(java.lang.String HGGene_symbol) {
        this.HGGene_symbol = HGGene_symbol;
    }


    /**
     * Gets the HGGene_aliases value for this HGGeneType.
     * 
     * @return HGGene_aliases
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGGene_aliasesType getHGGene_aliases() {
        return HGGene_aliases;
    }


    /**
     * Sets the HGGene_aliases value for this HGGeneType.
     * 
     * @param HGGene_aliases
     */
    public void setHGGene_aliases(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGGene_aliasesType HGGene_aliases) {
        this.HGGene_aliases = HGGene_aliases;
    }


    /**
     * Gets the HGGene_title value for this HGGeneType.
     * 
     * @return HGGene_title
     */
    public java.lang.String getHGGene_title() {
        return HGGene_title;
    }


    /**
     * Sets the HGGene_title value for this HGGeneType.
     * 
     * @param HGGene_title
     */
    public void setHGGene_title(java.lang.String HGGene_title) {
        this.HGGene_title = HGGene_title;
    }


    /**
     * Gets the HGGene_taxid value for this HGGeneType.
     * 
     * @return HGGene_taxid
     */
    public java.lang.String getHGGene_taxid() {
        return HGGene_taxid;
    }


    /**
     * Sets the HGGene_taxid value for this HGGeneType.
     * 
     * @param HGGene_taxid
     */
    public void setHGGene_taxid(java.lang.String HGGene_taxid) {
        this.HGGene_taxid = HGGene_taxid;
    }


    /**
     * Gets the HGGene_protGi value for this HGGeneType.
     * 
     * @return HGGene_protGi
     */
    public java.lang.String getHGGene_protGi() {
        return HGGene_protGi;
    }


    /**
     * Sets the HGGene_protGi value for this HGGeneType.
     * 
     * @param HGGene_protGi
     */
    public void setHGGene_protGi(java.lang.String HGGene_protGi) {
        this.HGGene_protGi = HGGene_protGi;
    }


    /**
     * Gets the HGGene_protAcc value for this HGGeneType.
     * 
     * @return HGGene_protAcc
     */
    public java.lang.String getHGGene_protAcc() {
        return HGGene_protAcc;
    }


    /**
     * Sets the HGGene_protAcc value for this HGGeneType.
     * 
     * @param HGGene_protAcc
     */
    public void setHGGene_protAcc(java.lang.String HGGene_protAcc) {
        this.HGGene_protAcc = HGGene_protAcc;
    }


    /**
     * Gets the HGGene_protLen value for this HGGeneType.
     * 
     * @return HGGene_protLen
     */
    public java.lang.String getHGGene_protLen() {
        return HGGene_protLen;
    }


    /**
     * Sets the HGGene_protLen value for this HGGeneType.
     * 
     * @param HGGene_protLen
     */
    public void setHGGene_protLen(java.lang.String HGGene_protLen) {
        this.HGGene_protLen = HGGene_protLen;
    }


    /**
     * Gets the HGGene_nucGi value for this HGGeneType.
     * 
     * @return HGGene_nucGi
     */
    public java.lang.String getHGGene_nucGi() {
        return HGGene_nucGi;
    }


    /**
     * Sets the HGGene_nucGi value for this HGGeneType.
     * 
     * @param HGGene_nucGi
     */
    public void setHGGene_nucGi(java.lang.String HGGene_nucGi) {
        this.HGGene_nucGi = HGGene_nucGi;
    }


    /**
     * Gets the HGGene_nucAcc value for this HGGeneType.
     * 
     * @return HGGene_nucAcc
     */
    public java.lang.String getHGGene_nucAcc() {
        return HGGene_nucAcc;
    }


    /**
     * Sets the HGGene_nucAcc value for this HGGeneType.
     * 
     * @param HGGene_nucAcc
     */
    public void setHGGene_nucAcc(java.lang.String HGGene_nucAcc) {
        this.HGGene_nucAcc = HGGene_nucAcc;
    }


    /**
     * Gets the HGGene_geneLinks value for this HGGeneType.
     * 
     * @return HGGene_geneLinks
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGGene_geneLinksType getHGGene_geneLinks() {
        return HGGene_geneLinks;
    }


    /**
     * Sets the HGGene_geneLinks value for this HGGeneType.
     * 
     * @param HGGene_geneLinks
     */
    public void setHGGene_geneLinks(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGGene_geneLinksType HGGene_geneLinks) {
        this.HGGene_geneLinks = HGGene_geneLinks;
    }


    /**
     * Gets the HGGene_protLinks value for this HGGeneType.
     * 
     * @return HGGene_protLinks
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGGene_protLinksType getHGGene_protLinks() {
        return HGGene_protLinks;
    }


    /**
     * Sets the HGGene_protLinks value for this HGGeneType.
     * 
     * @param HGGene_protLinks
     */
    public void setHGGene_protLinks(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGGene_protLinksType HGGene_protLinks) {
        this.HGGene_protLinks = HGGene_protLinks;
    }


    /**
     * Gets the HGGene_domains value for this HGGeneType.
     * 
     * @return HGGene_domains
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGGene_domainsType getHGGene_domains() {
        return HGGene_domains;
    }


    /**
     * Sets the HGGene_domains value for this HGGeneType.
     * 
     * @param HGGene_domains
     */
    public void setHGGene_domains(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGGene_domainsType HGGene_domains) {
        this.HGGene_domains = HGGene_domains;
    }


    /**
     * Gets the HGGene_chr value for this HGGeneType.
     * 
     * @return HGGene_chr
     */
    public java.lang.String getHGGene_chr() {
        return HGGene_chr;
    }


    /**
     * Sets the HGGene_chr value for this HGGeneType.
     * 
     * @param HGGene_chr
     */
    public void setHGGene_chr(java.lang.String HGGene_chr) {
        this.HGGene_chr = HGGene_chr;
    }


    /**
     * Gets the HGGene_location value for this HGGeneType.
     * 
     * @return HGGene_location
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGGene_locationType getHGGene_location() {
        return HGGene_location;
    }


    /**
     * Sets the HGGene_location value for this HGGeneType.
     * 
     * @param HGGene_location
     */
    public void setHGGene_location(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGGene_locationType HGGene_location) {
        this.HGGene_location = HGGene_location;
    }


    /**
     * Gets the HGGene_locusTag value for this HGGeneType.
     * 
     * @return HGGene_locusTag
     */
    public java.lang.String getHGGene_locusTag() {
        return HGGene_locusTag;
    }


    /**
     * Sets the HGGene_locusTag value for this HGGeneType.
     * 
     * @param HGGene_locusTag
     */
    public void setHGGene_locusTag(java.lang.String HGGene_locusTag) {
        this.HGGene_locusTag = HGGene_locusTag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HGGeneType)) return false;
        HGGeneType other = (HGGeneType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.HGGene_geneid==null && other.getHGGene_geneid()==null) || 
             (this.HGGene_geneid!=null &&
              this.HGGene_geneid.equals(other.getHGGene_geneid()))) &&
            ((this.HGGene_otherid==null && other.getHGGene_otherid()==null) || 
             (this.HGGene_otherid!=null &&
              this.HGGene_otherid.equals(other.getHGGene_otherid()))) &&
            ((this.HGGene_symbol==null && other.getHGGene_symbol()==null) || 
             (this.HGGene_symbol!=null &&
              this.HGGene_symbol.equals(other.getHGGene_symbol()))) &&
            ((this.HGGene_aliases==null && other.getHGGene_aliases()==null) || 
             (this.HGGene_aliases!=null &&
              this.HGGene_aliases.equals(other.getHGGene_aliases()))) &&
            ((this.HGGene_title==null && other.getHGGene_title()==null) || 
             (this.HGGene_title!=null &&
              this.HGGene_title.equals(other.getHGGene_title()))) &&
            ((this.HGGene_taxid==null && other.getHGGene_taxid()==null) || 
             (this.HGGene_taxid!=null &&
              this.HGGene_taxid.equals(other.getHGGene_taxid()))) &&
            ((this.HGGene_protGi==null && other.getHGGene_protGi()==null) || 
             (this.HGGene_protGi!=null &&
              this.HGGene_protGi.equals(other.getHGGene_protGi()))) &&
            ((this.HGGene_protAcc==null && other.getHGGene_protAcc()==null) || 
             (this.HGGene_protAcc!=null &&
              this.HGGene_protAcc.equals(other.getHGGene_protAcc()))) &&
            ((this.HGGene_protLen==null && other.getHGGene_protLen()==null) || 
             (this.HGGene_protLen!=null &&
              this.HGGene_protLen.equals(other.getHGGene_protLen()))) &&
            ((this.HGGene_nucGi==null && other.getHGGene_nucGi()==null) || 
             (this.HGGene_nucGi!=null &&
              this.HGGene_nucGi.equals(other.getHGGene_nucGi()))) &&
            ((this.HGGene_nucAcc==null && other.getHGGene_nucAcc()==null) || 
             (this.HGGene_nucAcc!=null &&
              this.HGGene_nucAcc.equals(other.getHGGene_nucAcc()))) &&
            ((this.HGGene_geneLinks==null && other.getHGGene_geneLinks()==null) || 
             (this.HGGene_geneLinks!=null &&
              this.HGGene_geneLinks.equals(other.getHGGene_geneLinks()))) &&
            ((this.HGGene_protLinks==null && other.getHGGene_protLinks()==null) || 
             (this.HGGene_protLinks!=null &&
              this.HGGene_protLinks.equals(other.getHGGene_protLinks()))) &&
            ((this.HGGene_domains==null && other.getHGGene_domains()==null) || 
             (this.HGGene_domains!=null &&
              this.HGGene_domains.equals(other.getHGGene_domains()))) &&
            ((this.HGGene_chr==null && other.getHGGene_chr()==null) || 
             (this.HGGene_chr!=null &&
              this.HGGene_chr.equals(other.getHGGene_chr()))) &&
            ((this.HGGene_location==null && other.getHGGene_location()==null) || 
             (this.HGGene_location!=null &&
              this.HGGene_location.equals(other.getHGGene_location()))) &&
            ((this.HGGene_locusTag==null && other.getHGGene_locusTag()==null) || 
             (this.HGGene_locusTag!=null &&
              this.HGGene_locusTag.equals(other.getHGGene_locusTag())));
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
        if (getHGGene_geneid() != null) {
            _hashCode += getHGGene_geneid().hashCode();
        }
        if (getHGGene_otherid() != null) {
            _hashCode += getHGGene_otherid().hashCode();
        }
        if (getHGGene_symbol() != null) {
            _hashCode += getHGGene_symbol().hashCode();
        }
        if (getHGGene_aliases() != null) {
            _hashCode += getHGGene_aliases().hashCode();
        }
        if (getHGGene_title() != null) {
            _hashCode += getHGGene_title().hashCode();
        }
        if (getHGGene_taxid() != null) {
            _hashCode += getHGGene_taxid().hashCode();
        }
        if (getHGGene_protGi() != null) {
            _hashCode += getHGGene_protGi().hashCode();
        }
        if (getHGGene_protAcc() != null) {
            _hashCode += getHGGene_protAcc().hashCode();
        }
        if (getHGGene_protLen() != null) {
            _hashCode += getHGGene_protLen().hashCode();
        }
        if (getHGGene_nucGi() != null) {
            _hashCode += getHGGene_nucGi().hashCode();
        }
        if (getHGGene_nucAcc() != null) {
            _hashCode += getHGGene_nucAcc().hashCode();
        }
        if (getHGGene_geneLinks() != null) {
            _hashCode += getHGGene_geneLinks().hashCode();
        }
        if (getHGGene_protLinks() != null) {
            _hashCode += getHGGene_protLinks().hashCode();
        }
        if (getHGGene_domains() != null) {
            _hashCode += getHGGene_domains().hashCode();
        }
        if (getHGGene_chr() != null) {
            _hashCode += getHGGene_chr().hashCode();
        }
        if (getHGGene_location() != null) {
            _hashCode += getHGGene_location().hashCode();
        }
        if (getHGGene_locusTag() != null) {
            _hashCode += getHGGene_locusTag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HGGeneType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-GeneType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGGene_geneid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Gene_geneid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGGene_otherid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Gene_otherid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGGene_symbol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Gene_symbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGGene_aliases");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Gene_aliases"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Gene_aliasesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGGene_title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Gene_title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGGene_taxid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Gene_taxid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGGene_protGi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Gene_prot-gi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGGene_protAcc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Gene_prot-acc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGGene_protLen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Gene_prot-len"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGGene_nucGi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Gene_nuc-gi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGGene_nucAcc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Gene_nuc-acc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGGene_geneLinks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Gene_gene-links"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Gene_gene-linksType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGGene_protLinks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Gene_prot-links"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Gene_prot-linksType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGGene_domains");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Gene_domains"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Gene_domainsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGGene_chr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Gene_chr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGGene_location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Gene_location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Gene_locationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGGene_locusTag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Gene_locus-tag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
