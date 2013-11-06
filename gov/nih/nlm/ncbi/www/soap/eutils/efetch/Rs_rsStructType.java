/**
 * Rs_rsStructType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Rs_rsStructType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RsStructType[] rsStruct;

    public Rs_rsStructType() {
    }

    public Rs_rsStructType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RsStructType[] rsStruct) {
           this.rsStruct = rsStruct;
    }


    /**
     * Gets the rsStruct value for this Rs_rsStructType.
     * 
     * @return rsStruct
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RsStructType[] getRsStruct() {
        return rsStruct;
    }


    /**
     * Sets the rsStruct value for this Rs_rsStructType.
     * 
     * @param rsStruct
     */
    public void setRsStruct(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RsStructType[] rsStruct) {
        this.rsStruct = rsStruct;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RsStructType getRsStruct(int i) {
        return this.rsStruct[i];
    }

    public void setRsStruct(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.RsStructType _value) {
        this.rsStruct[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rs_rsStructType)) return false;
        Rs_rsStructType other = (Rs_rsStructType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rsStruct==null && other.getRsStruct()==null) || 
             (this.rsStruct!=null &&
              java.util.Arrays.equals(this.rsStruct, other.getRsStruct())));
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
        if (getRsStruct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRsStruct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRsStruct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Rs_rsStructType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_rsStructType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsStruct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RsStruct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RsStructType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
