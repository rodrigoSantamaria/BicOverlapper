/**
 * INSDQualifierType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class INSDQualifierType  implements java.io.Serializable {
    private java.lang.String INSDQualifier_name;

    private java.lang.String INSDQualifier_value;

    public INSDQualifierType() {
    }

    public INSDQualifierType(
           java.lang.String INSDQualifier_name,
           java.lang.String INSDQualifier_value) {
           this.INSDQualifier_name = INSDQualifier_name;
           this.INSDQualifier_value = INSDQualifier_value;
    }


    /**
     * Gets the INSDQualifier_name value for this INSDQualifierType.
     * 
     * @return INSDQualifier_name
     */
    public java.lang.String getINSDQualifier_name() {
        return INSDQualifier_name;
    }


    /**
     * Sets the INSDQualifier_name value for this INSDQualifierType.
     * 
     * @param INSDQualifier_name
     */
    public void setINSDQualifier_name(java.lang.String INSDQualifier_name) {
        this.INSDQualifier_name = INSDQualifier_name;
    }


    /**
     * Gets the INSDQualifier_value value for this INSDQualifierType.
     * 
     * @return INSDQualifier_value
     */
    public java.lang.String getINSDQualifier_value() {
        return INSDQualifier_value;
    }


    /**
     * Sets the INSDQualifier_value value for this INSDQualifierType.
     * 
     * @param INSDQualifier_value
     */
    public void setINSDQualifier_value(java.lang.String INSDQualifier_value) {
        this.INSDQualifier_value = INSDQualifier_value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof INSDQualifierType)) return false;
        INSDQualifierType other = (INSDQualifierType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.INSDQualifier_name==null && other.getINSDQualifier_name()==null) || 
             (this.INSDQualifier_name!=null &&
              this.INSDQualifier_name.equals(other.getINSDQualifier_name()))) &&
            ((this.INSDQualifier_value==null && other.getINSDQualifier_value()==null) || 
             (this.INSDQualifier_value!=null &&
              this.INSDQualifier_value.equals(other.getINSDQualifier_value())));
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
        if (getINSDQualifier_name() != null) {
            _hashCode += getINSDQualifier_name().hashCode();
        }
        if (getINSDQualifier_value() != null) {
            _hashCode += getINSDQualifier_value().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(INSDQualifierType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDQualifierType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDQualifier_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDQualifier_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDQualifier_value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDQualifier_value"));
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
