/**
 * PCAtomIntType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCAtomIntType  implements java.io.Serializable {
    private java.lang.String PCAtomInt_aid;

    private java.lang.String PCAtomInt_value;

    public PCAtomIntType() {
    }

    public PCAtomIntType(
           java.lang.String PCAtomInt_aid,
           java.lang.String PCAtomInt_value) {
           this.PCAtomInt_aid = PCAtomInt_aid;
           this.PCAtomInt_value = PCAtomInt_value;
    }


    /**
     * Gets the PCAtomInt_aid value for this PCAtomIntType.
     * 
     * @return PCAtomInt_aid
     */
    public java.lang.String getPCAtomInt_aid() {
        return PCAtomInt_aid;
    }


    /**
     * Sets the PCAtomInt_aid value for this PCAtomIntType.
     * 
     * @param PCAtomInt_aid
     */
    public void setPCAtomInt_aid(java.lang.String PCAtomInt_aid) {
        this.PCAtomInt_aid = PCAtomInt_aid;
    }


    /**
     * Gets the PCAtomInt_value value for this PCAtomIntType.
     * 
     * @return PCAtomInt_value
     */
    public java.lang.String getPCAtomInt_value() {
        return PCAtomInt_value;
    }


    /**
     * Sets the PCAtomInt_value value for this PCAtomIntType.
     * 
     * @param PCAtomInt_value
     */
    public void setPCAtomInt_value(java.lang.String PCAtomInt_value) {
        this.PCAtomInt_value = PCAtomInt_value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCAtomIntType)) return false;
        PCAtomIntType other = (PCAtomIntType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCAtomInt_aid==null && other.getPCAtomInt_aid()==null) || 
             (this.PCAtomInt_aid!=null &&
              this.PCAtomInt_aid.equals(other.getPCAtomInt_aid()))) &&
            ((this.PCAtomInt_value==null && other.getPCAtomInt_value()==null) || 
             (this.PCAtomInt_value!=null &&
              this.PCAtomInt_value.equals(other.getPCAtomInt_value())));
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
        if (getPCAtomInt_aid() != null) {
            _hashCode += getPCAtomInt_aid().hashCode();
        }
        if (getPCAtomInt_value() != null) {
            _hashCode += getPCAtomInt_value().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCAtomIntType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AtomIntType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAtomInt_aid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AtomInt_aid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAtomInt_value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AtomInt_value"));
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
