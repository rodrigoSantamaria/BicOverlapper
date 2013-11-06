/**
 * PubmedArticleSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PubmedArticleSetType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedArticleType[] pubmedArticle;

    public PubmedArticleSetType() {
    }

    public PubmedArticleSetType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedArticleType[] pubmedArticle) {
           this.pubmedArticle = pubmedArticle;
    }


    /**
     * Gets the pubmedArticle value for this PubmedArticleSetType.
     * 
     * @return pubmedArticle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedArticleType[] getPubmedArticle() {
        return pubmedArticle;
    }


    /**
     * Sets the pubmedArticle value for this PubmedArticleSetType.
     * 
     * @param pubmedArticle
     */
    public void setPubmedArticle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedArticleType[] pubmedArticle) {
        this.pubmedArticle = pubmedArticle;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedArticleType getPubmedArticle(int i) {
        return this.pubmedArticle[i];
    }

    public void setPubmedArticle(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedArticleType _value) {
        this.pubmedArticle[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PubmedArticleSetType)) return false;
        PubmedArticleSetType other = (PubmedArticleSetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pubmedArticle==null && other.getPubmedArticle()==null) || 
             (this.pubmedArticle!=null &&
              java.util.Arrays.equals(this.pubmedArticle, other.getPubmedArticle())));
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
        if (getPubmedArticle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPubmedArticle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPubmedArticle(), i);
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
        new org.apache.axis.description.TypeDesc(PubmedArticleSetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubmedArticleSetType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubmedArticle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubmedArticle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubmedArticleType"));
        elemField.setMinOccurs(0);
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
