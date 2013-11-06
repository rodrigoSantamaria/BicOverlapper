/**
 * PCAtomSourceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCAtomSourceType  implements java.io.Serializable {
    private java.lang.String PCAtomSource_aid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAtomSource_sourceType PCAtomSource_source;

    public PCAtomSourceType() {
    }

    public PCAtomSourceType(
           java.lang.String PCAtomSource_aid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAtomSource_sourceType PCAtomSource_source) {
           this.PCAtomSource_aid = PCAtomSource_aid;
           this.PCAtomSource_source = PCAtomSource_source;
    }


    /**
     * Gets the PCAtomSource_aid value for this PCAtomSourceType.
     * 
     * @return PCAtomSource_aid
     */
    public java.lang.String getPCAtomSource_aid() {
        return PCAtomSource_aid;
    }


    /**
     * Sets the PCAtomSource_aid value for this PCAtomSourceType.
     * 
     * @param PCAtomSource_aid
     */
    public void setPCAtomSource_aid(java.lang.String PCAtomSource_aid) {
        this.PCAtomSource_aid = PCAtomSource_aid;
    }


    /**
     * Gets the PCAtomSource_source value for this PCAtomSourceType.
     * 
     * @return PCAtomSource_source
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAtomSource_sourceType getPCAtomSource_source() {
        return PCAtomSource_source;
    }


    /**
     * Sets the PCAtomSource_source value for this PCAtomSourceType.
     * 
     * @param PCAtomSource_source
     */
    public void setPCAtomSource_source(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAtomSource_sourceType PCAtomSource_source) {
        this.PCAtomSource_source = PCAtomSource_source;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCAtomSourceType)) return false;
        PCAtomSourceType other = (PCAtomSourceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCAtomSource_aid==null && other.getPCAtomSource_aid()==null) || 
             (this.PCAtomSource_aid!=null &&
              this.PCAtomSource_aid.equals(other.getPCAtomSource_aid()))) &&
            ((this.PCAtomSource_source==null && other.getPCAtomSource_source()==null) || 
             (this.PCAtomSource_source!=null &&
              this.PCAtomSource_source.equals(other.getPCAtomSource_source())));
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
        if (getPCAtomSource_aid() != null) {
            _hashCode += getPCAtomSource_aid().hashCode();
        }
        if (getPCAtomSource_source() != null) {
            _hashCode += getPCAtomSource_source().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCAtomSourceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AtomSourceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAtomSource_aid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AtomSource_aid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAtomSource_source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AtomSource_source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AtomSource_sourceType"));
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
