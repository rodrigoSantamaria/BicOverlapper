/**
 * XtraTermsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class XtraTermsType  implements java.io.Serializable {
    private java.lang.String xtraTerms_tag;

    private java.lang.String xtraTerms_value;

    public XtraTermsType() {
    }

    public XtraTermsType(
           java.lang.String xtraTerms_tag,
           java.lang.String xtraTerms_value) {
           this.xtraTerms_tag = xtraTerms_tag;
           this.xtraTerms_value = xtraTerms_value;
    }


    /**
     * Gets the xtraTerms_tag value for this XtraTermsType.
     * 
     * @return xtraTerms_tag
     */
    public java.lang.String getXtraTerms_tag() {
        return xtraTerms_tag;
    }


    /**
     * Sets the xtraTerms_tag value for this XtraTermsType.
     * 
     * @param xtraTerms_tag
     */
    public void setXtraTerms_tag(java.lang.String xtraTerms_tag) {
        this.xtraTerms_tag = xtraTerms_tag;
    }


    /**
     * Gets the xtraTerms_value value for this XtraTermsType.
     * 
     * @return xtraTerms_value
     */
    public java.lang.String getXtraTerms_value() {
        return xtraTerms_value;
    }


    /**
     * Sets the xtraTerms_value value for this XtraTermsType.
     * 
     * @param xtraTerms_value
     */
    public void setXtraTerms_value(java.lang.String xtraTerms_value) {
        this.xtraTerms_value = xtraTerms_value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XtraTermsType)) return false;
        XtraTermsType other = (XtraTermsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.xtraTerms_tag==null && other.getXtraTerms_tag()==null) || 
             (this.xtraTerms_tag!=null &&
              this.xtraTerms_tag.equals(other.getXtraTerms_tag()))) &&
            ((this.xtraTerms_value==null && other.getXtraTerms_value()==null) || 
             (this.xtraTerms_value!=null &&
              this.xtraTerms_value.equals(other.getXtraTerms_value())));
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
        if (getXtraTerms_tag() != null) {
            _hashCode += getXtraTerms_tag().hashCode();
        }
        if (getXtraTerms_value() != null) {
            _hashCode += getXtraTerms_value().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XtraTermsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Xtra-TermsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xtraTerms_tag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Xtra-Terms_tag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xtraTerms_value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Xtra-Terms_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
