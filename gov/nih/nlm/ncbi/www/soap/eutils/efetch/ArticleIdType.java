/**
 * ArticleIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ArticleIdType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_pubmedType articleId_pubmed;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_medlineType articleId_medline;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_doiType articleId_doi;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_piiType articleId_pii;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_pmcidType articleId_pmcid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_pmcpidType articleId_pmcpid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_pmpidType articleId_pmpid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_otherType articleId_other;

    public ArticleIdType() {
    }

    public ArticleIdType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_pubmedType articleId_pubmed,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_medlineType articleId_medline,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_doiType articleId_doi,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_piiType articleId_pii,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_pmcidType articleId_pmcid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_pmcpidType articleId_pmcpid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_pmpidType articleId_pmpid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_otherType articleId_other) {
           this.articleId_pubmed = articleId_pubmed;
           this.articleId_medline = articleId_medline;
           this.articleId_doi = articleId_doi;
           this.articleId_pii = articleId_pii;
           this.articleId_pmcid = articleId_pmcid;
           this.articleId_pmcpid = articleId_pmcpid;
           this.articleId_pmpid = articleId_pmpid;
           this.articleId_other = articleId_other;
    }


    /**
     * Gets the articleId_pubmed value for this ArticleIdType.
     * 
     * @return articleId_pubmed
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_pubmedType getArticleId_pubmed() {
        return articleId_pubmed;
    }


    /**
     * Sets the articleId_pubmed value for this ArticleIdType.
     * 
     * @param articleId_pubmed
     */
    public void setArticleId_pubmed(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_pubmedType articleId_pubmed) {
        this.articleId_pubmed = articleId_pubmed;
    }


    /**
     * Gets the articleId_medline value for this ArticleIdType.
     * 
     * @return articleId_medline
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_medlineType getArticleId_medline() {
        return articleId_medline;
    }


    /**
     * Sets the articleId_medline value for this ArticleIdType.
     * 
     * @param articleId_medline
     */
    public void setArticleId_medline(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_medlineType articleId_medline) {
        this.articleId_medline = articleId_medline;
    }


    /**
     * Gets the articleId_doi value for this ArticleIdType.
     * 
     * @return articleId_doi
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_doiType getArticleId_doi() {
        return articleId_doi;
    }


    /**
     * Sets the articleId_doi value for this ArticleIdType.
     * 
     * @param articleId_doi
     */
    public void setArticleId_doi(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_doiType articleId_doi) {
        this.articleId_doi = articleId_doi;
    }


    /**
     * Gets the articleId_pii value for this ArticleIdType.
     * 
     * @return articleId_pii
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_piiType getArticleId_pii() {
        return articleId_pii;
    }


    /**
     * Sets the articleId_pii value for this ArticleIdType.
     * 
     * @param articleId_pii
     */
    public void setArticleId_pii(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_piiType articleId_pii) {
        this.articleId_pii = articleId_pii;
    }


    /**
     * Gets the articleId_pmcid value for this ArticleIdType.
     * 
     * @return articleId_pmcid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_pmcidType getArticleId_pmcid() {
        return articleId_pmcid;
    }


    /**
     * Sets the articleId_pmcid value for this ArticleIdType.
     * 
     * @param articleId_pmcid
     */
    public void setArticleId_pmcid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_pmcidType articleId_pmcid) {
        this.articleId_pmcid = articleId_pmcid;
    }


    /**
     * Gets the articleId_pmcpid value for this ArticleIdType.
     * 
     * @return articleId_pmcpid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_pmcpidType getArticleId_pmcpid() {
        return articleId_pmcpid;
    }


    /**
     * Sets the articleId_pmcpid value for this ArticleIdType.
     * 
     * @param articleId_pmcpid
     */
    public void setArticleId_pmcpid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_pmcpidType articleId_pmcpid) {
        this.articleId_pmcpid = articleId_pmcpid;
    }


    /**
     * Gets the articleId_pmpid value for this ArticleIdType.
     * 
     * @return articleId_pmpid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_pmpidType getArticleId_pmpid() {
        return articleId_pmpid;
    }


    /**
     * Sets the articleId_pmpid value for this ArticleIdType.
     * 
     * @param articleId_pmpid
     */
    public void setArticleId_pmpid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_pmpidType articleId_pmpid) {
        this.articleId_pmpid = articleId_pmpid;
    }


    /**
     * Gets the articleId_other value for this ArticleIdType.
     * 
     * @return articleId_other
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_otherType getArticleId_other() {
        return articleId_other;
    }


    /**
     * Sets the articleId_other value for this ArticleIdType.
     * 
     * @param articleId_other
     */
    public void setArticleId_other(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleId_otherType articleId_other) {
        this.articleId_other = articleId_other;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArticleIdType)) return false;
        ArticleIdType other = (ArticleIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.articleId_pubmed==null && other.getArticleId_pubmed()==null) || 
             (this.articleId_pubmed!=null &&
              this.articleId_pubmed.equals(other.getArticleId_pubmed()))) &&
            ((this.articleId_medline==null && other.getArticleId_medline()==null) || 
             (this.articleId_medline!=null &&
              this.articleId_medline.equals(other.getArticleId_medline()))) &&
            ((this.articleId_doi==null && other.getArticleId_doi()==null) || 
             (this.articleId_doi!=null &&
              this.articleId_doi.equals(other.getArticleId_doi()))) &&
            ((this.articleId_pii==null && other.getArticleId_pii()==null) || 
             (this.articleId_pii!=null &&
              this.articleId_pii.equals(other.getArticleId_pii()))) &&
            ((this.articleId_pmcid==null && other.getArticleId_pmcid()==null) || 
             (this.articleId_pmcid!=null &&
              this.articleId_pmcid.equals(other.getArticleId_pmcid()))) &&
            ((this.articleId_pmcpid==null && other.getArticleId_pmcpid()==null) || 
             (this.articleId_pmcpid!=null &&
              this.articleId_pmcpid.equals(other.getArticleId_pmcpid()))) &&
            ((this.articleId_pmpid==null && other.getArticleId_pmpid()==null) || 
             (this.articleId_pmpid!=null &&
              this.articleId_pmpid.equals(other.getArticleId_pmpid()))) &&
            ((this.articleId_other==null && other.getArticleId_other()==null) || 
             (this.articleId_other!=null &&
              this.articleId_other.equals(other.getArticleId_other())));
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
        if (getArticleId_pubmed() != null) {
            _hashCode += getArticleId_pubmed().hashCode();
        }
        if (getArticleId_medline() != null) {
            _hashCode += getArticleId_medline().hashCode();
        }
        if (getArticleId_doi() != null) {
            _hashCode += getArticleId_doi().hashCode();
        }
        if (getArticleId_pii() != null) {
            _hashCode += getArticleId_pii().hashCode();
        }
        if (getArticleId_pmcid() != null) {
            _hashCode += getArticleId_pmcid().hashCode();
        }
        if (getArticleId_pmcpid() != null) {
            _hashCode += getArticleId_pmcpid().hashCode();
        }
        if (getArticleId_pmpid() != null) {
            _hashCode += getArticleId_pmpid().hashCode();
        }
        if (getArticleId_other() != null) {
            _hashCode += getArticleId_other().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArticleIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleIdType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleId_pubmed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleId_pubmed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleId_pubmedType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleId_medline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleId_medline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleId_medlineType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleId_doi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleId_doi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleId_doiType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleId_pii");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleId_pii"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleId_piiType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleId_pmcid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleId_pmcid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleId_pmcidType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleId_pmcpid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleId_pmcpid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleId_pmcpidType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleId_pmpid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleId_pmpid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleId_pmpidType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleId_other");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleId_other"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleId_otherType"));
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
