/**
 * GBQualifierType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GBQualifierType  implements java.io.Serializable {
    private java.lang.String GBQualifier_name;

    private java.lang.String GBQualifier_value;

    public GBQualifierType() {
    }

    public GBQualifierType(
           java.lang.String GBQualifier_name,
           java.lang.String GBQualifier_value) {
           this.GBQualifier_name = GBQualifier_name;
           this.GBQualifier_value = GBQualifier_value;
    }


    /**
     * Gets the GBQualifier_name value for this GBQualifierType.
     * 
     * @return GBQualifier_name
     */
    public java.lang.String getGBQualifier_name() {
        return GBQualifier_name;
    }


    /**
     * Sets the GBQualifier_name value for this GBQualifierType.
     * 
     * @param GBQualifier_name
     */
    public void setGBQualifier_name(java.lang.String GBQualifier_name) {
        this.GBQualifier_name = GBQualifier_name;
    }


    /**
     * Gets the GBQualifier_value value for this GBQualifierType.
     * 
     * @return GBQualifier_value
     */
    public java.lang.String getGBQualifier_value() {
        return GBQualifier_value;
    }


    /**
     * Sets the GBQualifier_value value for this GBQualifierType.
     * 
     * @param GBQualifier_value
     */
    public void setGBQualifier_value(java.lang.String GBQualifier_value) {
        this.GBQualifier_value = GBQualifier_value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GBQualifierType)) return false;
        GBQualifierType other = (GBQualifierType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GBQualifier_name==null && other.getGBQualifier_name()==null) || 
             (this.GBQualifier_name!=null &&
              this.GBQualifier_name.equals(other.getGBQualifier_name()))) &&
            ((this.GBQualifier_value==null && other.getGBQualifier_value()==null) || 
             (this.GBQualifier_value!=null &&
              this.GBQualifier_value.equals(other.getGBQualifier_value())));
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
        if (getGBQualifier_name() != null) {
            _hashCode += getGBQualifier_name().hashCode();
        }
        if (getGBQualifier_value() != null) {
            _hashCode += getGBQualifier_value().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GBQualifierType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBQualifierType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBQualifier_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBQualifier_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBQualifier_value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBQualifier_value"));
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
