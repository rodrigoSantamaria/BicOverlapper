/**
 * PCIDType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCIDType  implements java.io.Serializable {
    private java.lang.String PCID_id;

    private java.lang.String PCID_version;

    public PCIDType() {
    }

    public PCIDType(
           java.lang.String PCID_id,
           java.lang.String PCID_version) {
           this.PCID_id = PCID_id;
           this.PCID_version = PCID_version;
    }


    /**
     * Gets the PCID_id value for this PCIDType.
     * 
     * @return PCID_id
     */
    public java.lang.String getPCID_id() {
        return PCID_id;
    }


    /**
     * Sets the PCID_id value for this PCIDType.
     * 
     * @param PCID_id
     */
    public void setPCID_id(java.lang.String PCID_id) {
        this.PCID_id = PCID_id;
    }


    /**
     * Gets the PCID_version value for this PCIDType.
     * 
     * @return PCID_version
     */
    public java.lang.String getPCID_version() {
        return PCID_version;
    }


    /**
     * Sets the PCID_version value for this PCIDType.
     * 
     * @param PCID_version
     */
    public void setPCID_version(java.lang.String PCID_version) {
        this.PCID_version = PCID_version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCIDType)) return false;
        PCIDType other = (PCIDType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCID_id==null && other.getPCID_id()==null) || 
             (this.PCID_id!=null &&
              this.PCID_id.equals(other.getPCID_id()))) &&
            ((this.PCID_version==null && other.getPCID_version()==null) || 
             (this.PCID_version!=null &&
              this.PCID_version.equals(other.getPCID_version())));
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
        if (getPCID_id() != null) {
            _hashCode += getPCID_id().hashCode();
        }
        if (getPCID_version() != null) {
            _hashCode += getPCID_version().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCIDType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-IDType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCID_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-ID_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCID_version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-ID_version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
