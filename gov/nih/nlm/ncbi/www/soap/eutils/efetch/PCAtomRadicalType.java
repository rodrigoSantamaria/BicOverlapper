/**
 * PCAtomRadicalType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCAtomRadicalType  implements java.io.Serializable {
    private java.lang.String PCAtomRadical_aid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAtomRadical_typeType PCAtomRadical_type;

    public PCAtomRadicalType() {
    }

    public PCAtomRadicalType(
           java.lang.String PCAtomRadical_aid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAtomRadical_typeType PCAtomRadical_type) {
           this.PCAtomRadical_aid = PCAtomRadical_aid;
           this.PCAtomRadical_type = PCAtomRadical_type;
    }


    /**
     * Gets the PCAtomRadical_aid value for this PCAtomRadicalType.
     * 
     * @return PCAtomRadical_aid
     */
    public java.lang.String getPCAtomRadical_aid() {
        return PCAtomRadical_aid;
    }


    /**
     * Sets the PCAtomRadical_aid value for this PCAtomRadicalType.
     * 
     * @param PCAtomRadical_aid
     */
    public void setPCAtomRadical_aid(java.lang.String PCAtomRadical_aid) {
        this.PCAtomRadical_aid = PCAtomRadical_aid;
    }


    /**
     * Gets the PCAtomRadical_type value for this PCAtomRadicalType.
     * 
     * @return PCAtomRadical_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAtomRadical_typeType getPCAtomRadical_type() {
        return PCAtomRadical_type;
    }


    /**
     * Sets the PCAtomRadical_type value for this PCAtomRadicalType.
     * 
     * @param PCAtomRadical_type
     */
    public void setPCAtomRadical_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAtomRadical_typeType PCAtomRadical_type) {
        this.PCAtomRadical_type = PCAtomRadical_type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCAtomRadicalType)) return false;
        PCAtomRadicalType other = (PCAtomRadicalType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCAtomRadical_aid==null && other.getPCAtomRadical_aid()==null) || 
             (this.PCAtomRadical_aid!=null &&
              this.PCAtomRadical_aid.equals(other.getPCAtomRadical_aid()))) &&
            ((this.PCAtomRadical_type==null && other.getPCAtomRadical_type()==null) || 
             (this.PCAtomRadical_type!=null &&
              this.PCAtomRadical_type.equals(other.getPCAtomRadical_type())));
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
        if (getPCAtomRadical_aid() != null) {
            _hashCode += getPCAtomRadical_aid().hashCode();
        }
        if (getPCAtomRadical_type() != null) {
            _hashCode += getPCAtomRadical_type().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCAtomRadicalType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AtomRadicalType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAtomRadical_aid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AtomRadical_aid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAtomRadical_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AtomRadical_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AtomRadical_typeType"));
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
