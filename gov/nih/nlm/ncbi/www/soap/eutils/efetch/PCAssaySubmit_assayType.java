/**
 * PCAssaySubmit_assayType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCAssaySubmit_assayType  implements java.io.Serializable {
    private java.lang.String PCAssaySubmit_assay_aid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmit_assay_aidSourceType PCAssaySubmit_assay_aidSource;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmit_assay_descrType PCAssaySubmit_assay_descr;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmit_assay_aidverType PCAssaySubmit_assay_aidver;

    public PCAssaySubmit_assayType() {
    }

    public PCAssaySubmit_assayType(
           java.lang.String PCAssaySubmit_assay_aid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmit_assay_aidSourceType PCAssaySubmit_assay_aidSource,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmit_assay_descrType PCAssaySubmit_assay_descr,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmit_assay_aidverType PCAssaySubmit_assay_aidver) {
           this.PCAssaySubmit_assay_aid = PCAssaySubmit_assay_aid;
           this.PCAssaySubmit_assay_aidSource = PCAssaySubmit_assay_aidSource;
           this.PCAssaySubmit_assay_descr = PCAssaySubmit_assay_descr;
           this.PCAssaySubmit_assay_aidver = PCAssaySubmit_assay_aidver;
    }


    /**
     * Gets the PCAssaySubmit_assay_aid value for this PCAssaySubmit_assayType.
     * 
     * @return PCAssaySubmit_assay_aid
     */
    public java.lang.String getPCAssaySubmit_assay_aid() {
        return PCAssaySubmit_assay_aid;
    }


    /**
     * Sets the PCAssaySubmit_assay_aid value for this PCAssaySubmit_assayType.
     * 
     * @param PCAssaySubmit_assay_aid
     */
    public void setPCAssaySubmit_assay_aid(java.lang.String PCAssaySubmit_assay_aid) {
        this.PCAssaySubmit_assay_aid = PCAssaySubmit_assay_aid;
    }


    /**
     * Gets the PCAssaySubmit_assay_aidSource value for this PCAssaySubmit_assayType.
     * 
     * @return PCAssaySubmit_assay_aidSource
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmit_assay_aidSourceType getPCAssaySubmit_assay_aidSource() {
        return PCAssaySubmit_assay_aidSource;
    }


    /**
     * Sets the PCAssaySubmit_assay_aidSource value for this PCAssaySubmit_assayType.
     * 
     * @param PCAssaySubmit_assay_aidSource
     */
    public void setPCAssaySubmit_assay_aidSource(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmit_assay_aidSourceType PCAssaySubmit_assay_aidSource) {
        this.PCAssaySubmit_assay_aidSource = PCAssaySubmit_assay_aidSource;
    }


    /**
     * Gets the PCAssaySubmit_assay_descr value for this PCAssaySubmit_assayType.
     * 
     * @return PCAssaySubmit_assay_descr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmit_assay_descrType getPCAssaySubmit_assay_descr() {
        return PCAssaySubmit_assay_descr;
    }


    /**
     * Sets the PCAssaySubmit_assay_descr value for this PCAssaySubmit_assayType.
     * 
     * @param PCAssaySubmit_assay_descr
     */
    public void setPCAssaySubmit_assay_descr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmit_assay_descrType PCAssaySubmit_assay_descr) {
        this.PCAssaySubmit_assay_descr = PCAssaySubmit_assay_descr;
    }


    /**
     * Gets the PCAssaySubmit_assay_aidver value for this PCAssaySubmit_assayType.
     * 
     * @return PCAssaySubmit_assay_aidver
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmit_assay_aidverType getPCAssaySubmit_assay_aidver() {
        return PCAssaySubmit_assay_aidver;
    }


    /**
     * Sets the PCAssaySubmit_assay_aidver value for this PCAssaySubmit_assayType.
     * 
     * @param PCAssaySubmit_assay_aidver
     */
    public void setPCAssaySubmit_assay_aidver(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssaySubmit_assay_aidverType PCAssaySubmit_assay_aidver) {
        this.PCAssaySubmit_assay_aidver = PCAssaySubmit_assay_aidver;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCAssaySubmit_assayType)) return false;
        PCAssaySubmit_assayType other = (PCAssaySubmit_assayType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCAssaySubmit_assay_aid==null && other.getPCAssaySubmit_assay_aid()==null) || 
             (this.PCAssaySubmit_assay_aid!=null &&
              this.PCAssaySubmit_assay_aid.equals(other.getPCAssaySubmit_assay_aid()))) &&
            ((this.PCAssaySubmit_assay_aidSource==null && other.getPCAssaySubmit_assay_aidSource()==null) || 
             (this.PCAssaySubmit_assay_aidSource!=null &&
              this.PCAssaySubmit_assay_aidSource.equals(other.getPCAssaySubmit_assay_aidSource()))) &&
            ((this.PCAssaySubmit_assay_descr==null && other.getPCAssaySubmit_assay_descr()==null) || 
             (this.PCAssaySubmit_assay_descr!=null &&
              this.PCAssaySubmit_assay_descr.equals(other.getPCAssaySubmit_assay_descr()))) &&
            ((this.PCAssaySubmit_assay_aidver==null && other.getPCAssaySubmit_assay_aidver()==null) || 
             (this.PCAssaySubmit_assay_aidver!=null &&
              this.PCAssaySubmit_assay_aidver.equals(other.getPCAssaySubmit_assay_aidver())));
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
        if (getPCAssaySubmit_assay_aid() != null) {
            _hashCode += getPCAssaySubmit_assay_aid().hashCode();
        }
        if (getPCAssaySubmit_assay_aidSource() != null) {
            _hashCode += getPCAssaySubmit_assay_aidSource().hashCode();
        }
        if (getPCAssaySubmit_assay_descr() != null) {
            _hashCode += getPCAssaySubmit_assay_descr().hashCode();
        }
        if (getPCAssaySubmit_assay_aidver() != null) {
            _hashCode += getPCAssaySubmit_assay_aidver().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCAssaySubmit_assayType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssaySubmit_assayType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssaySubmit_assay_aid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssaySubmit_assay_aid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssaySubmit_assay_aidSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssaySubmit_assay_aid-source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssaySubmit_assay_aid-sourceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssaySubmit_assay_descr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssaySubmit_assay_descr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssaySubmit_assay_descrType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssaySubmit_assay_aidver");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssaySubmit_assay_aidver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssaySubmit_assay_aidverType"));
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
