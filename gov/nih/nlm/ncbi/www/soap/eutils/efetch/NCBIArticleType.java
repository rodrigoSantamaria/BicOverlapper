/**
 * NCBIArticleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class NCBIArticleType  implements java.io.Serializable {
    private java.lang.String PMID;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleType article;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineJournalInfoType medlineJournalInfo;

    public NCBIArticleType() {
    }

    public NCBIArticleType(
           java.lang.String PMID,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleType article,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineJournalInfoType medlineJournalInfo) {
           this.PMID = PMID;
           this.article = article;
           this.medlineJournalInfo = medlineJournalInfo;
    }


    /**
     * Gets the PMID value for this NCBIArticleType.
     * 
     * @return PMID
     */
    public java.lang.String getPMID() {
        return PMID;
    }


    /**
     * Sets the PMID value for this NCBIArticleType.
     * 
     * @param PMID
     */
    public void setPMID(java.lang.String PMID) {
        this.PMID = PMID;
    }


    /**
     * Gets the article value for this NCBIArticleType.
     * 
     * @return article
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleType getArticle() {
        return article;
    }


    /**
     * Sets the article value for this NCBIArticleType.
     * 
     * @param article
     */
    public void setArticle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleType article) {
        this.article = article;
    }


    /**
     * Gets the medlineJournalInfo value for this NCBIArticleType.
     * 
     * @return medlineJournalInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineJournalInfoType getMedlineJournalInfo() {
        return medlineJournalInfo;
    }


    /**
     * Sets the medlineJournalInfo value for this NCBIArticleType.
     * 
     * @param medlineJournalInfo
     */
    public void setMedlineJournalInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineJournalInfoType medlineJournalInfo) {
        this.medlineJournalInfo = medlineJournalInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NCBIArticleType)) return false;
        NCBIArticleType other = (NCBIArticleType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PMID==null && other.getPMID()==null) || 
             (this.PMID!=null &&
              this.PMID.equals(other.getPMID()))) &&
            ((this.article==null && other.getArticle()==null) || 
             (this.article!=null &&
              this.article.equals(other.getArticle()))) &&
            ((this.medlineJournalInfo==null && other.getMedlineJournalInfo()==null) || 
             (this.medlineJournalInfo!=null &&
              this.medlineJournalInfo.equals(other.getMedlineJournalInfo())));
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
        if (getPMID() != null) {
            _hashCode += getPMID().hashCode();
        }
        if (getArticle() != null) {
            _hashCode += getArticle().hashCode();
        }
        if (getMedlineJournalInfo() != null) {
            _hashCode += getMedlineJournalInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NCBIArticleType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NCBIArticleType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PMID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PMID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("article");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Article"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineJournalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MedlineJournalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MedlineJournalInfoType"));
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
