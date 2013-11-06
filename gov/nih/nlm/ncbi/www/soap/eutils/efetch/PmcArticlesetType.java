/**
 * PmcArticlesetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PmcArticlesetType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Article[] article;

    public PmcArticlesetType() {
    }

    public PmcArticlesetType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Article[] article) {
           this.article = article;
    }


    /**
     * Gets the article value for this PmcArticlesetType.
     * 
     * @return article
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Article[] getArticle() {
        return article;
    }


    /**
     * Sets the article value for this PmcArticlesetType.
     * 
     * @param article
     */
    public void setArticle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Article[] article) {
        this.article = article;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Article getArticle(int i) {
        return this.article[i];
    }

    public void setArticle(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Article _value) {
        this.article[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PmcArticlesetType)) return false;
        PmcArticlesetType other = (PmcArticlesetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.article==null && other.getArticle()==null) || 
             (this.article!=null &&
              java.util.Arrays.equals(this.article, other.getArticle())));
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
        if (getArticle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArticle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArticle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PmcArticlesetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "pmc-articlesetType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("article");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "article"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "article"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
