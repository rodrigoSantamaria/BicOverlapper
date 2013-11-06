/**
 * ObjectIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ObjectIdType  implements java.io.Serializable {
    private java.lang.String objectId_id;

    private java.lang.String objectId_str;

    public ObjectIdType() {
    }

    public ObjectIdType(
           java.lang.String objectId_id,
           java.lang.String objectId_str) {
           this.objectId_id = objectId_id;
           this.objectId_str = objectId_str;
    }


    /**
     * Gets the objectId_id value for this ObjectIdType.
     * 
     * @return objectId_id
     */
    public java.lang.String getObjectId_id() {
        return objectId_id;
    }


    /**
     * Sets the objectId_id value for this ObjectIdType.
     * 
     * @param objectId_id
     */
    public void setObjectId_id(java.lang.String objectId_id) {
        this.objectId_id = objectId_id;
    }


    /**
     * Gets the objectId_str value for this ObjectIdType.
     * 
     * @return objectId_str
     */
    public java.lang.String getObjectId_str() {
        return objectId_str;
    }


    /**
     * Sets the objectId_str value for this ObjectIdType.
     * 
     * @param objectId_str
     */
    public void setObjectId_str(java.lang.String objectId_str) {
        this.objectId_str = objectId_str;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjectIdType)) return false;
        ObjectIdType other = (ObjectIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.objectId_id==null && other.getObjectId_id()==null) || 
             (this.objectId_id!=null &&
              this.objectId_id.equals(other.getObjectId_id()))) &&
            ((this.objectId_str==null && other.getObjectId_str()==null) || 
             (this.objectId_str!=null &&
              this.objectId_str.equals(other.getObjectId_str())));
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
        if (getObjectId_id() != null) {
            _hashCode += getObjectId_id().hashCode();
        }
        if (getObjectId_str() != null) {
            _hashCode += getObjectId_str().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjectIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Object-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectId_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Object-id_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectId_str");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Object-id_str"));
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
