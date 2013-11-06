/**
 * EMBLXref_idType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class EMBLXref_idType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ObjectIdType[] objectId;

    public EMBLXref_idType() {
    }

    public EMBLXref_idType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ObjectIdType[] objectId) {
           this.objectId = objectId;
    }


    /**
     * Gets the objectId value for this EMBLXref_idType.
     * 
     * @return objectId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ObjectIdType[] getObjectId() {
        return objectId;
    }


    /**
     * Sets the objectId value for this EMBLXref_idType.
     * 
     * @param objectId
     */
    public void setObjectId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ObjectIdType[] objectId) {
        this.objectId = objectId;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ObjectIdType getObjectId(int i) {
        return this.objectId[i];
    }

    public void setObjectId(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ObjectIdType _value) {
        this.objectId[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EMBLXref_idType)) return false;
        EMBLXref_idType other = (EMBLXref_idType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.objectId==null && other.getObjectId()==null) || 
             (this.objectId!=null &&
              java.util.Arrays.equals(this.objectId, other.getObjectId())));
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
        if (getObjectId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObjectId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObjectId(), i);
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
        new org.apache.axis.description.TypeDesc(EMBLXref_idType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "EMBL-xref_idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Object-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Object-idType"));
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
