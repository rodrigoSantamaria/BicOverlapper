/**
 * PCAtomSource_sourceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCAtomSource_sourceType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCMMDBSourceType PCMMDBSource;

    public PCAtomSource_sourceType() {
    }

    public PCAtomSource_sourceType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCMMDBSourceType PCMMDBSource) {
           this.PCMMDBSource = PCMMDBSource;
    }


    /**
     * Gets the PCMMDBSource value for this PCAtomSource_sourceType.
     * 
     * @return PCMMDBSource
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCMMDBSourceType getPCMMDBSource() {
        return PCMMDBSource;
    }


    /**
     * Sets the PCMMDBSource value for this PCAtomSource_sourceType.
     * 
     * @param PCMMDBSource
     */
    public void setPCMMDBSource(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCMMDBSourceType PCMMDBSource) {
        this.PCMMDBSource = PCMMDBSource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCAtomSource_sourceType)) return false;
        PCAtomSource_sourceType other = (PCAtomSource_sourceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCMMDBSource==null && other.getPCMMDBSource()==null) || 
             (this.PCMMDBSource!=null &&
              this.PCMMDBSource.equals(other.getPCMMDBSource())));
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
        if (getPCMMDBSource() != null) {
            _hashCode += getPCMMDBSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCAtomSource_sourceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AtomSource_sourceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCMMDBSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-MMDBSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-MMDBSourceType"));
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
