/**
 * MitoGeneticCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MitoGeneticCodeType  implements java.io.Serializable {
    private java.lang.String MGCId;

    private java.lang.String MGCName;

    public MitoGeneticCodeType() {
    }

    public MitoGeneticCodeType(
           java.lang.String MGCId,
           java.lang.String MGCName) {
           this.MGCId = MGCId;
           this.MGCName = MGCName;
    }


    /**
     * Gets the MGCId value for this MitoGeneticCodeType.
     * 
     * @return MGCId
     */
    public java.lang.String getMGCId() {
        return MGCId;
    }


    /**
     * Sets the MGCId value for this MitoGeneticCodeType.
     * 
     * @param MGCId
     */
    public void setMGCId(java.lang.String MGCId) {
        this.MGCId = MGCId;
    }


    /**
     * Gets the MGCName value for this MitoGeneticCodeType.
     * 
     * @return MGCName
     */
    public java.lang.String getMGCName() {
        return MGCName;
    }


    /**
     * Sets the MGCName value for this MitoGeneticCodeType.
     * 
     * @param MGCName
     */
    public void setMGCName(java.lang.String MGCName) {
        this.MGCName = MGCName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MitoGeneticCodeType)) return false;
        MitoGeneticCodeType other = (MitoGeneticCodeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MGCId==null && other.getMGCId()==null) || 
             (this.MGCId!=null &&
              this.MGCId.equals(other.getMGCId()))) &&
            ((this.MGCName==null && other.getMGCName()==null) || 
             (this.MGCName!=null &&
              this.MGCName.equals(other.getMGCName())));
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
        if (getMGCId() != null) {
            _hashCode += getMGCId().hashCode();
        }
        if (getMGCName() != null) {
            _hashCode += getMGCName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MitoGeneticCodeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MitoGeneticCodeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MGCId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MGCId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MGCName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MGCName"));
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
