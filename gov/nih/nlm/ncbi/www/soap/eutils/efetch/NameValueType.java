/**
 * NameValueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class NameValueType  implements java.io.Serializable {
    private java.lang.String nameValue_name;

    private java.lang.String nameValue_value;

    public NameValueType() {
    }

    public NameValueType(
           java.lang.String nameValue_name,
           java.lang.String nameValue_value) {
           this.nameValue_name = nameValue_name;
           this.nameValue_value = nameValue_value;
    }


    /**
     * Gets the nameValue_name value for this NameValueType.
     * 
     * @return nameValue_name
     */
    public java.lang.String getNameValue_name() {
        return nameValue_name;
    }


    /**
     * Sets the nameValue_name value for this NameValueType.
     * 
     * @param nameValue_name
     */
    public void setNameValue_name(java.lang.String nameValue_name) {
        this.nameValue_name = nameValue_name;
    }


    /**
     * Gets the nameValue_value value for this NameValueType.
     * 
     * @return nameValue_value
     */
    public java.lang.String getNameValue_value() {
        return nameValue_value;
    }


    /**
     * Sets the nameValue_value value for this NameValueType.
     * 
     * @param nameValue_value
     */
    public void setNameValue_value(java.lang.String nameValue_value) {
        this.nameValue_value = nameValue_value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NameValueType)) return false;
        NameValueType other = (NameValueType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nameValue_name==null && other.getNameValue_name()==null) || 
             (this.nameValue_name!=null &&
              this.nameValue_name.equals(other.getNameValue_name()))) &&
            ((this.nameValue_value==null && other.getNameValue_value()==null) || 
             (this.nameValue_value!=null &&
              this.nameValue_value.equals(other.getNameValue_value())));
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
        if (getNameValue_name() != null) {
            _hashCode += getNameValue_name().hashCode();
        }
        if (getNameValue_value() != null) {
            _hashCode += getNameValue_value().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NameValueType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NameValueType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameValue_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NameValue_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameValue_value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NameValue_value"));
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
