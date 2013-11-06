/**
 * UserField_data_objectsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class UserField_data_objectsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserObjectType[] userObject;

    public UserField_data_objectsType() {
    }

    public UserField_data_objectsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserObjectType[] userObject) {
           this.userObject = userObject;
    }


    /**
     * Gets the userObject value for this UserField_data_objectsType.
     * 
     * @return userObject
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserObjectType[] getUserObject() {
        return userObject;
    }


    /**
     * Sets the userObject value for this UserField_data_objectsType.
     * 
     * @param userObject
     */
    public void setUserObject(gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserObjectType[] userObject) {
        this.userObject = userObject;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserObjectType getUserObject(int i) {
        return this.userObject[i];
    }

    public void setUserObject(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserObjectType _value) {
        this.userObject[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserField_data_objectsType)) return false;
        UserField_data_objectsType other = (UserField_data_objectsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userObject==null && other.getUserObject()==null) || 
             (this.userObject!=null &&
              java.util.Arrays.equals(this.userObject, other.getUserObject())));
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
        if (getUserObject() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserObject());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserObject(), i);
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
        new org.apache.axis.description.TypeDesc(UserField_data_objectsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "User-field_data_objectsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userObject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "User-object"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "User-objectType"));
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
