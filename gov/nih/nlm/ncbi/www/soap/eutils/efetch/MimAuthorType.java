/**
 * MimAuthorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MimAuthorType  implements java.io.Serializable {
    private java.lang.String mimAuthor_name;

    private java.lang.String mimAuthor_index;

    public MimAuthorType() {
    }

    public MimAuthorType(
           java.lang.String mimAuthor_name,
           java.lang.String mimAuthor_index) {
           this.mimAuthor_name = mimAuthor_name;
           this.mimAuthor_index = mimAuthor_index;
    }


    /**
     * Gets the mimAuthor_name value for this MimAuthorType.
     * 
     * @return mimAuthor_name
     */
    public java.lang.String getMimAuthor_name() {
        return mimAuthor_name;
    }


    /**
     * Sets the mimAuthor_name value for this MimAuthorType.
     * 
     * @param mimAuthor_name
     */
    public void setMimAuthor_name(java.lang.String mimAuthor_name) {
        this.mimAuthor_name = mimAuthor_name;
    }


    /**
     * Gets the mimAuthor_index value for this MimAuthorType.
     * 
     * @return mimAuthor_index
     */
    public java.lang.String getMimAuthor_index() {
        return mimAuthor_index;
    }


    /**
     * Sets the mimAuthor_index value for this MimAuthorType.
     * 
     * @param mimAuthor_index
     */
    public void setMimAuthor_index(java.lang.String mimAuthor_index) {
        this.mimAuthor_index = mimAuthor_index;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MimAuthorType)) return false;
        MimAuthorType other = (MimAuthorType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mimAuthor_name==null && other.getMimAuthor_name()==null) || 
             (this.mimAuthor_name!=null &&
              this.mimAuthor_name.equals(other.getMimAuthor_name()))) &&
            ((this.mimAuthor_index==null && other.getMimAuthor_index()==null) || 
             (this.mimAuthor_index!=null &&
              this.mimAuthor_index.equals(other.getMimAuthor_index())));
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
        if (getMimAuthor_name() != null) {
            _hashCode += getMimAuthor_name().hashCode();
        }
        if (getMimAuthor_index() != null) {
            _hashCode += getMimAuthor_index().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MimAuthorType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-authorType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimAuthor_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-author_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimAuthor_index");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-author_index"));
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
