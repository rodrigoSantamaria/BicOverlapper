/**
 * PCAssayDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCAssayDataType  implements java.io.Serializable {
    private java.lang.String PCAssayData_tid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayData_valueType PCAssayData_value;

    public PCAssayDataType() {
    }

    public PCAssayDataType(
           java.lang.String PCAssayData_tid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayData_valueType PCAssayData_value) {
           this.PCAssayData_tid = PCAssayData_tid;
           this.PCAssayData_value = PCAssayData_value;
    }


    /**
     * Gets the PCAssayData_tid value for this PCAssayDataType.
     * 
     * @return PCAssayData_tid
     */
    public java.lang.String getPCAssayData_tid() {
        return PCAssayData_tid;
    }


    /**
     * Sets the PCAssayData_tid value for this PCAssayDataType.
     * 
     * @param PCAssayData_tid
     */
    public void setPCAssayData_tid(java.lang.String PCAssayData_tid) {
        this.PCAssayData_tid = PCAssayData_tid;
    }


    /**
     * Gets the PCAssayData_value value for this PCAssayDataType.
     * 
     * @return PCAssayData_value
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayData_valueType getPCAssayData_value() {
        return PCAssayData_value;
    }


    /**
     * Sets the PCAssayData_value value for this PCAssayDataType.
     * 
     * @param PCAssayData_value
     */
    public void setPCAssayData_value(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAssayData_valueType PCAssayData_value) {
        this.PCAssayData_value = PCAssayData_value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCAssayDataType)) return false;
        PCAssayDataType other = (PCAssayDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCAssayData_tid==null && other.getPCAssayData_tid()==null) || 
             (this.PCAssayData_tid!=null &&
              this.PCAssayData_tid.equals(other.getPCAssayData_tid()))) &&
            ((this.PCAssayData_value==null && other.getPCAssayData_value()==null) || 
             (this.PCAssayData_value!=null &&
              this.PCAssayData_value.equals(other.getPCAssayData_value())));
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
        if (getPCAssayData_tid() != null) {
            _hashCode += getPCAssayData_tid().hashCode();
        }
        if (getPCAssayData_value() != null) {
            _hashCode += getPCAssayData_value().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCAssayDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssayData_tid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayData_tid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAssayData_value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayData_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayData_valueType"));
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
