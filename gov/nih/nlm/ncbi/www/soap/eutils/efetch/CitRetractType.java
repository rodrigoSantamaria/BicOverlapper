/**
 * CitRetractType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CitRetractType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitRetract_typeType citRetract_type;

    private java.lang.String citRetract_exp;

    public CitRetractType() {
    }

    public CitRetractType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitRetract_typeType citRetract_type,
           java.lang.String citRetract_exp) {
           this.citRetract_type = citRetract_type;
           this.citRetract_exp = citRetract_exp;
    }


    /**
     * Gets the citRetract_type value for this CitRetractType.
     * 
     * @return citRetract_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitRetract_typeType getCitRetract_type() {
        return citRetract_type;
    }


    /**
     * Sets the citRetract_type value for this CitRetractType.
     * 
     * @param citRetract_type
     */
    public void setCitRetract_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitRetract_typeType citRetract_type) {
        this.citRetract_type = citRetract_type;
    }


    /**
     * Gets the citRetract_exp value for this CitRetractType.
     * 
     * @return citRetract_exp
     */
    public java.lang.String getCitRetract_exp() {
        return citRetract_exp;
    }


    /**
     * Sets the citRetract_exp value for this CitRetractType.
     * 
     * @param citRetract_exp
     */
    public void setCitRetract_exp(java.lang.String citRetract_exp) {
        this.citRetract_exp = citRetract_exp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CitRetractType)) return false;
        CitRetractType other = (CitRetractType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.citRetract_type==null && other.getCitRetract_type()==null) || 
             (this.citRetract_type!=null &&
              this.citRetract_type.equals(other.getCitRetract_type()))) &&
            ((this.citRetract_exp==null && other.getCitRetract_exp()==null) || 
             (this.citRetract_exp!=null &&
              this.citRetract_exp.equals(other.getCitRetract_exp())));
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
        if (getCitRetract_type() != null) {
            _hashCode += getCitRetract_type().hashCode();
        }
        if (getCitRetract_exp() != null) {
            _hashCode += getCitRetract_exp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CitRetractType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CitRetractType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citRetract_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CitRetract_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CitRetract_typeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citRetract_exp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CitRetract_exp"));
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
