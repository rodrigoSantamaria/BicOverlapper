/**
 * HGNodeIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class HGNodeIdType  implements java.io.Serializable {
    private java.lang.String HGNodeId_id;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGNodeId_idTypeType HGNodeId_idType;

    public HGNodeIdType() {
    }

    public HGNodeIdType(
           java.lang.String HGNodeId_id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGNodeId_idTypeType HGNodeId_idType) {
           this.HGNodeId_id = HGNodeId_id;
           this.HGNodeId_idType = HGNodeId_idType;
    }


    /**
     * Gets the HGNodeId_id value for this HGNodeIdType.
     * 
     * @return HGNodeId_id
     */
    public java.lang.String getHGNodeId_id() {
        return HGNodeId_id;
    }


    /**
     * Sets the HGNodeId_id value for this HGNodeIdType.
     * 
     * @param HGNodeId_id
     */
    public void setHGNodeId_id(java.lang.String HGNodeId_id) {
        this.HGNodeId_id = HGNodeId_id;
    }


    /**
     * Gets the HGNodeId_idType value for this HGNodeIdType.
     * 
     * @return HGNodeId_idType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGNodeId_idTypeType getHGNodeId_idType() {
        return HGNodeId_idType;
    }


    /**
     * Sets the HGNodeId_idType value for this HGNodeIdType.
     * 
     * @param HGNodeId_idType
     */
    public void setHGNodeId_idType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGNodeId_idTypeType HGNodeId_idType) {
        this.HGNodeId_idType = HGNodeId_idType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HGNodeIdType)) return false;
        HGNodeIdType other = (HGNodeIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.HGNodeId_id==null && other.getHGNodeId_id()==null) || 
             (this.HGNodeId_id!=null &&
              this.HGNodeId_id.equals(other.getHGNodeId_id()))) &&
            ((this.HGNodeId_idType==null && other.getHGNodeId_idType()==null) || 
             (this.HGNodeId_idType!=null &&
              this.HGNodeId_idType.equals(other.getHGNodeId_idType())));
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
        if (getHGNodeId_id() != null) {
            _hashCode += getHGNodeId_id().hashCode();
        }
        if (getHGNodeId_idType() != null) {
            _hashCode += getHGNodeId_idType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HGNodeIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Node-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGNodeId_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Node-id_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGNodeId_idType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Node-id_id-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Node-id_id-typeType"));
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
