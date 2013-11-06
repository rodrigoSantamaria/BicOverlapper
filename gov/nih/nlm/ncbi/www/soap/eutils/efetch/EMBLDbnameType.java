/**
 * EMBLDbnameType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class EMBLDbnameType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.EMBLDbname_codeType EMBLDbname_code;

    private java.lang.String EMBLDbname_name;

    public EMBLDbnameType() {
    }

    public EMBLDbnameType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.EMBLDbname_codeType EMBLDbname_code,
           java.lang.String EMBLDbname_name) {
           this.EMBLDbname_code = EMBLDbname_code;
           this.EMBLDbname_name = EMBLDbname_name;
    }


    /**
     * Gets the EMBLDbname_code value for this EMBLDbnameType.
     * 
     * @return EMBLDbname_code
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.EMBLDbname_codeType getEMBLDbname_code() {
        return EMBLDbname_code;
    }


    /**
     * Sets the EMBLDbname_code value for this EMBLDbnameType.
     * 
     * @param EMBLDbname_code
     */
    public void setEMBLDbname_code(gov.nih.nlm.ncbi.www.soap.eutils.efetch.EMBLDbname_codeType EMBLDbname_code) {
        this.EMBLDbname_code = EMBLDbname_code;
    }


    /**
     * Gets the EMBLDbname_name value for this EMBLDbnameType.
     * 
     * @return EMBLDbname_name
     */
    public java.lang.String getEMBLDbname_name() {
        return EMBLDbname_name;
    }


    /**
     * Sets the EMBLDbname_name value for this EMBLDbnameType.
     * 
     * @param EMBLDbname_name
     */
    public void setEMBLDbname_name(java.lang.String EMBLDbname_name) {
        this.EMBLDbname_name = EMBLDbname_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EMBLDbnameType)) return false;
        EMBLDbnameType other = (EMBLDbnameType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EMBLDbname_code==null && other.getEMBLDbname_code()==null) || 
             (this.EMBLDbname_code!=null &&
              this.EMBLDbname_code.equals(other.getEMBLDbname_code()))) &&
            ((this.EMBLDbname_name==null && other.getEMBLDbname_name()==null) || 
             (this.EMBLDbname_name!=null &&
              this.EMBLDbname_name.equals(other.getEMBLDbname_name())));
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
        if (getEMBLDbname_code() != null) {
            _hashCode += getEMBLDbname_code().hashCode();
        }
        if (getEMBLDbname_name() != null) {
            _hashCode += getEMBLDbname_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EMBLDbnameType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "EMBL-dbnameType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMBLDbname_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "EMBL-dbname_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "EMBL-dbname_codeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMBLDbname_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "EMBL-dbname_name"));
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
