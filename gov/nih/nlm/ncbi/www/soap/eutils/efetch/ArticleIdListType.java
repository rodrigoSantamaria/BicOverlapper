/**
 * ArticleIdListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ArticleIdListType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleIdType_pubmed[] articleId;

    public ArticleIdListType() {
    }

    public ArticleIdListType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleIdType_pubmed[] articleId) {
           this.articleId = articleId;
    }


    /**
     * Gets the articleId value for this ArticleIdListType.
     * 
     * @return articleId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleIdType_pubmed[] getArticleId() {
        return articleId;
    }


    /**
     * Sets the articleId value for this ArticleIdListType.
     * 
     * @param articleId
     */
    public void setArticleId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleIdType_pubmed[] articleId) {
        this.articleId = articleId;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleIdType_pubmed getArticleId(int i) {
        return this.articleId[i];
    }

    public void setArticleId(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ArticleIdType_pubmed _value) {
        this.articleId[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArticleIdListType)) return false;
        ArticleIdListType other = (ArticleIdListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.articleId==null && other.getArticleId()==null) || 
             (this.articleId!=null &&
              java.util.Arrays.equals(this.articleId, other.getArticleId())));
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
        if (getArticleId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArticleId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArticleId(), i);
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
        new org.apache.axis.description.TypeDesc(ArticleIdListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleIdListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ArticleIdType_pubmed"));
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
