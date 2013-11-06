/**
 * PCUrn_datatypeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCUrn_datatypeType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCUrnDataTypeType PCUrnDataType;

    public PCUrn_datatypeType() {
    }

    public PCUrn_datatypeType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCUrnDataTypeType PCUrnDataType) {
           this.PCUrnDataType = PCUrnDataType;
    }


    /**
     * Gets the PCUrnDataType value for this PCUrn_datatypeType.
     * 
     * @return PCUrnDataType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCUrnDataTypeType getPCUrnDataType() {
        return PCUrnDataType;
    }


    /**
     * Sets the PCUrnDataType value for this PCUrn_datatypeType.
     * 
     * @param PCUrnDataType
     */
    public void setPCUrnDataType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCUrnDataTypeType PCUrnDataType) {
        this.PCUrnDataType = PCUrnDataType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCUrn_datatypeType)) return false;
        PCUrn_datatypeType other = (PCUrn_datatypeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCUrnDataType==null && other.getPCUrnDataType()==null) || 
             (this.PCUrnDataType!=null &&
              this.PCUrnDataType.equals(other.getPCUrnDataType())));
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
        if (getPCUrnDataType() != null) {
            _hashCode += getPCUrnDataType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCUrn_datatypeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Urn_datatypeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCUrnDataType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-UrnDataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-UrnDataTypeType"));
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
