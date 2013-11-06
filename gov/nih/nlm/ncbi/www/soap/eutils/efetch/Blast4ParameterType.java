/**
 * Blast4ParameterType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4ParameterType  implements java.io.Serializable {
    private java.lang.String blast4Parameter_name;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Parameter_valueType blast4Parameter_value;

    public Blast4ParameterType() {
    }

    public Blast4ParameterType(
           java.lang.String blast4Parameter_name,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Parameter_valueType blast4Parameter_value) {
           this.blast4Parameter_name = blast4Parameter_name;
           this.blast4Parameter_value = blast4Parameter_value;
    }


    /**
     * Gets the blast4Parameter_name value for this Blast4ParameterType.
     * 
     * @return blast4Parameter_name
     */
    public java.lang.String getBlast4Parameter_name() {
        return blast4Parameter_name;
    }


    /**
     * Sets the blast4Parameter_name value for this Blast4ParameterType.
     * 
     * @param blast4Parameter_name
     */
    public void setBlast4Parameter_name(java.lang.String blast4Parameter_name) {
        this.blast4Parameter_name = blast4Parameter_name;
    }


    /**
     * Gets the blast4Parameter_value value for this Blast4ParameterType.
     * 
     * @return blast4Parameter_value
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Parameter_valueType getBlast4Parameter_value() {
        return blast4Parameter_value;
    }


    /**
     * Sets the blast4Parameter_value value for this Blast4ParameterType.
     * 
     * @param blast4Parameter_value
     */
    public void setBlast4Parameter_value(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Parameter_valueType blast4Parameter_value) {
        this.blast4Parameter_value = blast4Parameter_value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4ParameterType)) return false;
        Blast4ParameterType other = (Blast4ParameterType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4Parameter_name==null && other.getBlast4Parameter_name()==null) || 
             (this.blast4Parameter_name!=null &&
              this.blast4Parameter_name.equals(other.getBlast4Parameter_name()))) &&
            ((this.blast4Parameter_value==null && other.getBlast4Parameter_value()==null) || 
             (this.blast4Parameter_value!=null &&
              this.blast4Parameter_value.equals(other.getBlast4Parameter_value())));
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
        if (getBlast4Parameter_name() != null) {
            _hashCode += getBlast4Parameter_name().hashCode();
        }
        if (getBlast4Parameter_value() != null) {
            _hashCode += getBlast4Parameter_value().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4ParameterType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-parameterType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Parameter_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-parameter_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Parameter_value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-parameter_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-parameter_valueType"));
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
