/**
 * PCAssaySubmit_assay_aidSourceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCAssaySubmit_assay_aidSourceType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCSourceType PCSource;

    public PCAssaySubmit_assay_aidSourceType() {
    }

    public PCAssaySubmit_assay_aidSourceType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCSourceType PCSource) {
           this.PCSource = PCSource;
    }


    /**
     * Gets the PCSource value for this PCAssaySubmit_assay_aidSourceType.
     * 
     * @return PCSource
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCSourceType getPCSource() {
        return PCSource;
    }


    /**
     * Sets the PCSource value for this PCAssaySubmit_assay_aidSourceType.
     * 
     * @param PCSource
     */
    public void setPCSource(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCSourceType PCSource) {
        this.PCSource = PCSource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCAssaySubmit_assay_aidSourceType)) return false;
        PCAssaySubmit_assay_aidSourceType other = (PCAssaySubmit_assay_aidSourceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCSource==null && other.getPCSource()==null) || 
             (this.PCSource!=null &&
              this.PCSource.equals(other.getPCSource())));
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
        if (getPCSource() != null) {
            _hashCode += getPCSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCAssaySubmit_assay_aidSourceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssaySubmit_assay_aid-sourceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-SourceType"));
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
