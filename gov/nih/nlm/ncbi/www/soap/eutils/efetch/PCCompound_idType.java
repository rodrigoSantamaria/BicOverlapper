/**
 * PCCompound_idType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCCompound_idType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCompoundTypeType PCCompoundType;

    public PCCompound_idType() {
    }

    public PCCompound_idType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCompoundTypeType PCCompoundType) {
           this.PCCompoundType = PCCompoundType;
    }


    /**
     * Gets the PCCompoundType value for this PCCompound_idType.
     * 
     * @return PCCompoundType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCompoundTypeType getPCCompoundType() {
        return PCCompoundType;
    }


    /**
     * Sets the PCCompoundType value for this PCCompound_idType.
     * 
     * @param PCCompoundType
     */
    public void setPCCompoundType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCompoundTypeType PCCompoundType) {
        this.PCCompoundType = PCCompoundType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCCompound_idType)) return false;
        PCCompound_idType other = (PCCompound_idType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCCompoundType==null && other.getPCCompoundType()==null) || 
             (this.PCCompoundType!=null &&
              this.PCCompoundType.equals(other.getPCCompoundType())));
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
        if (getPCCompoundType() != null) {
            _hashCode += getPCCompoundType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCCompound_idType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Compound_idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCCompoundType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-CompoundType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-CompoundTypeType"));
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
