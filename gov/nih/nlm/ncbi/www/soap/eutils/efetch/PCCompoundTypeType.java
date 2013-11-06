/**
 * PCCompoundTypeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCCompoundTypeType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCompoundType_typeType PCCompoundType_type;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCompoundType_idType PCCompoundType_id;

    public PCCompoundTypeType() {
    }

    public PCCompoundTypeType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCompoundType_typeType PCCompoundType_type,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCompoundType_idType PCCompoundType_id) {
           this.PCCompoundType_type = PCCompoundType_type;
           this.PCCompoundType_id = PCCompoundType_id;
    }


    /**
     * Gets the PCCompoundType_type value for this PCCompoundTypeType.
     * 
     * @return PCCompoundType_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCompoundType_typeType getPCCompoundType_type() {
        return PCCompoundType_type;
    }


    /**
     * Sets the PCCompoundType_type value for this PCCompoundTypeType.
     * 
     * @param PCCompoundType_type
     */
    public void setPCCompoundType_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCompoundType_typeType PCCompoundType_type) {
        this.PCCompoundType_type = PCCompoundType_type;
    }


    /**
     * Gets the PCCompoundType_id value for this PCCompoundTypeType.
     * 
     * @return PCCompoundType_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCompoundType_idType getPCCompoundType_id() {
        return PCCompoundType_id;
    }


    /**
     * Sets the PCCompoundType_id value for this PCCompoundTypeType.
     * 
     * @param PCCompoundType_id
     */
    public void setPCCompoundType_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCCompoundType_idType PCCompoundType_id) {
        this.PCCompoundType_id = PCCompoundType_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCCompoundTypeType)) return false;
        PCCompoundTypeType other = (PCCompoundTypeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCCompoundType_type==null && other.getPCCompoundType_type()==null) || 
             (this.PCCompoundType_type!=null &&
              this.PCCompoundType_type.equals(other.getPCCompoundType_type()))) &&
            ((this.PCCompoundType_id==null && other.getPCCompoundType_id()==null) || 
             (this.PCCompoundType_id!=null &&
              this.PCCompoundType_id.equals(other.getPCCompoundType_id())));
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
        if (getPCCompoundType_type() != null) {
            _hashCode += getPCCompoundType_type().hashCode();
        }
        if (getPCCompoundType_id() != null) {
            _hashCode += getPCCompoundType_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCCompoundTypeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-CompoundTypeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCCompoundType_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-CompoundType_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-CompoundType_typeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCCompoundType_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-CompoundType_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-CompoundType_idType"));
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
