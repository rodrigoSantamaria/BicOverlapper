/**
 * PCAtomStringType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCAtomStringType  implements java.io.Serializable {
    private java.lang.String PCAtomString_aid;

    private java.lang.String PCAtomString_value;

    public PCAtomStringType() {
    }

    public PCAtomStringType(
           java.lang.String PCAtomString_aid,
           java.lang.String PCAtomString_value) {
           this.PCAtomString_aid = PCAtomString_aid;
           this.PCAtomString_value = PCAtomString_value;
    }


    /**
     * Gets the PCAtomString_aid value for this PCAtomStringType.
     * 
     * @return PCAtomString_aid
     */
    public java.lang.String getPCAtomString_aid() {
        return PCAtomString_aid;
    }


    /**
     * Sets the PCAtomString_aid value for this PCAtomStringType.
     * 
     * @param PCAtomString_aid
     */
    public void setPCAtomString_aid(java.lang.String PCAtomString_aid) {
        this.PCAtomString_aid = PCAtomString_aid;
    }


    /**
     * Gets the PCAtomString_value value for this PCAtomStringType.
     * 
     * @return PCAtomString_value
     */
    public java.lang.String getPCAtomString_value() {
        return PCAtomString_value;
    }


    /**
     * Sets the PCAtomString_value value for this PCAtomStringType.
     * 
     * @param PCAtomString_value
     */
    public void setPCAtomString_value(java.lang.String PCAtomString_value) {
        this.PCAtomString_value = PCAtomString_value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCAtomStringType)) return false;
        PCAtomStringType other = (PCAtomStringType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCAtomString_aid==null && other.getPCAtomString_aid()==null) || 
             (this.PCAtomString_aid!=null &&
              this.PCAtomString_aid.equals(other.getPCAtomString_aid()))) &&
            ((this.PCAtomString_value==null && other.getPCAtomString_value()==null) || 
             (this.PCAtomString_value!=null &&
              this.PCAtomString_value.equals(other.getPCAtomString_value())));
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
        if (getPCAtomString_aid() != null) {
            _hashCode += getPCAtomString_aid().hashCode();
        }
        if (getPCAtomString_value() != null) {
            _hashCode += getPCAtomString_value().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCAtomStringType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AtomStringType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAtomString_aid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AtomString_aid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAtomString_value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AtomString_value"));
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
