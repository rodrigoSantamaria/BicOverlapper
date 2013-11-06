/**
 * GeneticCode_Type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GeneticCode_Type  implements java.io.Serializable {
    private java.lang.String GCId;

    private java.lang.String GCName;

    public GeneticCode_Type() {
    }

    public GeneticCode_Type(
           java.lang.String GCId,
           java.lang.String GCName) {
           this.GCId = GCId;
           this.GCName = GCName;
    }


    /**
     * Gets the GCId value for this GeneticCode_Type.
     * 
     * @return GCId
     */
    public java.lang.String getGCId() {
        return GCId;
    }


    /**
     * Sets the GCId value for this GeneticCode_Type.
     * 
     * @param GCId
     */
    public void setGCId(java.lang.String GCId) {
        this.GCId = GCId;
    }


    /**
     * Gets the GCName value for this GeneticCode_Type.
     * 
     * @return GCName
     */
    public java.lang.String getGCName() {
        return GCName;
    }


    /**
     * Sets the GCName value for this GeneticCode_Type.
     * 
     * @param GCName
     */
    public void setGCName(java.lang.String GCName) {
        this.GCName = GCName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeneticCode_Type)) return false;
        GeneticCode_Type other = (GeneticCode_Type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GCId==null && other.getGCId()==null) || 
             (this.GCId!=null &&
              this.GCId.equals(other.getGCId()))) &&
            ((this.GCName==null && other.getGCName()==null) || 
             (this.GCName!=null &&
              this.GCName.equals(other.getGCName())));
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
        if (getGCId() != null) {
            _hashCode += getGCId().hashCode();
        }
        if (getGCName() != null) {
            _hashCode += getGCName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeneticCode_Type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GeneticCode_Type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GCId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GCId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GCName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GCName"));
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
