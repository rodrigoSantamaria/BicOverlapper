/**
 * PCInfoDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCInfoDataType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCInfoData_urnType PCInfoData_urn;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCInfoData_valueType PCInfoData_value;

    public PCInfoDataType() {
    }

    public PCInfoDataType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCInfoData_urnType PCInfoData_urn,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCInfoData_valueType PCInfoData_value) {
           this.PCInfoData_urn = PCInfoData_urn;
           this.PCInfoData_value = PCInfoData_value;
    }


    /**
     * Gets the PCInfoData_urn value for this PCInfoDataType.
     * 
     * @return PCInfoData_urn
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCInfoData_urnType getPCInfoData_urn() {
        return PCInfoData_urn;
    }


    /**
     * Sets the PCInfoData_urn value for this PCInfoDataType.
     * 
     * @param PCInfoData_urn
     */
    public void setPCInfoData_urn(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCInfoData_urnType PCInfoData_urn) {
        this.PCInfoData_urn = PCInfoData_urn;
    }


    /**
     * Gets the PCInfoData_value value for this PCInfoDataType.
     * 
     * @return PCInfoData_value
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCInfoData_valueType getPCInfoData_value() {
        return PCInfoData_value;
    }


    /**
     * Sets the PCInfoData_value value for this PCInfoDataType.
     * 
     * @param PCInfoData_value
     */
    public void setPCInfoData_value(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCInfoData_valueType PCInfoData_value) {
        this.PCInfoData_value = PCInfoData_value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCInfoDataType)) return false;
        PCInfoDataType other = (PCInfoDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCInfoData_urn==null && other.getPCInfoData_urn()==null) || 
             (this.PCInfoData_urn!=null &&
              this.PCInfoData_urn.equals(other.getPCInfoData_urn()))) &&
            ((this.PCInfoData_value==null && other.getPCInfoData_value()==null) || 
             (this.PCInfoData_value!=null &&
              this.PCInfoData_value.equals(other.getPCInfoData_value())));
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
        if (getPCInfoData_urn() != null) {
            _hashCode += getPCInfoData_urn().hashCode();
        }
        if (getPCInfoData_value() != null) {
            _hashCode += getPCInfoData_value().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCInfoDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-InfoDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCInfoData_urn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-InfoData_urn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-InfoData_urnType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCInfoData_value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-InfoData_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-InfoData_valueType"));
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
