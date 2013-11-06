/**
 * UserObject_dataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class UserObject_dataType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserFieldType[] userField;

    public UserObject_dataType() {
    }

    public UserObject_dataType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserFieldType[] userField) {
           this.userField = userField;
    }


    /**
     * Gets the userField value for this UserObject_dataType.
     * 
     * @return userField
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserFieldType[] getUserField() {
        return userField;
    }


    /**
     * Sets the userField value for this UserObject_dataType.
     * 
     * @param userField
     */
    public void setUserField(gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserFieldType[] userField) {
        this.userField = userField;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserFieldType getUserField(int i) {
        return this.userField[i];
    }

    public void setUserField(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserFieldType _value) {
        this.userField[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserObject_dataType)) return false;
        UserObject_dataType other = (UserObject_dataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userField==null && other.getUserField()==null) || 
             (this.userField!=null &&
              java.util.Arrays.equals(this.userField, other.getUserField())));
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
        if (getUserField() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserField());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserField(), i);
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
        new org.apache.axis.description.TypeDesc(UserObject_dataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "User-object_dataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "User-field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "User-fieldType"));
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
