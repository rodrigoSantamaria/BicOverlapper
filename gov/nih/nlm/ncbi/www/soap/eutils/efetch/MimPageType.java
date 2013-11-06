/**
 * MimPageType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MimPageType  implements java.io.Serializable {
    private java.lang.String mimPage_from;

    private java.lang.String mimPage_to;

    public MimPageType() {
    }

    public MimPageType(
           java.lang.String mimPage_from,
           java.lang.String mimPage_to) {
           this.mimPage_from = mimPage_from;
           this.mimPage_to = mimPage_to;
    }


    /**
     * Gets the mimPage_from value for this MimPageType.
     * 
     * @return mimPage_from
     */
    public java.lang.String getMimPage_from() {
        return mimPage_from;
    }


    /**
     * Sets the mimPage_from value for this MimPageType.
     * 
     * @param mimPage_from
     */
    public void setMimPage_from(java.lang.String mimPage_from) {
        this.mimPage_from = mimPage_from;
    }


    /**
     * Gets the mimPage_to value for this MimPageType.
     * 
     * @return mimPage_to
     */
    public java.lang.String getMimPage_to() {
        return mimPage_to;
    }


    /**
     * Sets the mimPage_to value for this MimPageType.
     * 
     * @param mimPage_to
     */
    public void setMimPage_to(java.lang.String mimPage_to) {
        this.mimPage_to = mimPage_to;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MimPageType)) return false;
        MimPageType other = (MimPageType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mimPage_from==null && other.getMimPage_from()==null) || 
             (this.mimPage_from!=null &&
              this.mimPage_from.equals(other.getMimPage_from()))) &&
            ((this.mimPage_to==null && other.getMimPage_to()==null) || 
             (this.mimPage_to!=null &&
              this.mimPage_to.equals(other.getMimPage_to())));
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
        if (getMimPage_from() != null) {
            _hashCode += getMimPage_from().hashCode();
        }
        if (getMimPage_to() != null) {
            _hashCode += getMimPage_to().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MimPageType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-pageType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimPage_from");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-page_from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimPage_to");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-page_to"));
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
