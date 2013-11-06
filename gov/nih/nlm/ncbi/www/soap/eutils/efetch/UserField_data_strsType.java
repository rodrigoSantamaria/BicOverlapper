/**
 * UserField_data_strsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class UserField_data_strsType  implements java.io.Serializable {
    private java.lang.String[] userField_data_strs_E;

    public UserField_data_strsType() {
    }

    public UserField_data_strsType(
           java.lang.String[] userField_data_strs_E) {
           this.userField_data_strs_E = userField_data_strs_E;
    }


    /**
     * Gets the userField_data_strs_E value for this UserField_data_strsType.
     * 
     * @return userField_data_strs_E
     */
    public java.lang.String[] getUserField_data_strs_E() {
        return userField_data_strs_E;
    }


    /**
     * Sets the userField_data_strs_E value for this UserField_data_strsType.
     * 
     * @param userField_data_strs_E
     */
    public void setUserField_data_strs_E(java.lang.String[] userField_data_strs_E) {
        this.userField_data_strs_E = userField_data_strs_E;
    }

    public java.lang.String getUserField_data_strs_E(int i) {
        return this.userField_data_strs_E[i];
    }

    public void setUserField_data_strs_E(int i, java.lang.String _value) {
        this.userField_data_strs_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserField_data_strsType)) return false;
        UserField_data_strsType other = (UserField_data_strsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userField_data_strs_E==null && other.getUserField_data_strs_E()==null) || 
             (this.userField_data_strs_E!=null &&
              java.util.Arrays.equals(this.userField_data_strs_E, other.getUserField_data_strs_E())));
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
        if (getUserField_data_strs_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserField_data_strs_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserField_data_strs_E(), i);
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
        new org.apache.axis.description.TypeDesc(UserField_data_strsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "User-field_data_strsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userField_data_strs_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "User-field_data_strs_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "User-field_data_strs_E"));
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
