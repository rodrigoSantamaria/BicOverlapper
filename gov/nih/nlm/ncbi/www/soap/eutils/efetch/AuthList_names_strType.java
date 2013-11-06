/**
 * AuthList_names_strType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AuthList_names_strType  implements java.io.Serializable {
    private java.lang.String[] authList_names_str_E;

    public AuthList_names_strType() {
    }

    public AuthList_names_strType(
           java.lang.String[] authList_names_str_E) {
           this.authList_names_str_E = authList_names_str_E;
    }


    /**
     * Gets the authList_names_str_E value for this AuthList_names_strType.
     * 
     * @return authList_names_str_E
     */
    public java.lang.String[] getAuthList_names_str_E() {
        return authList_names_str_E;
    }


    /**
     * Sets the authList_names_str_E value for this AuthList_names_strType.
     * 
     * @param authList_names_str_E
     */
    public void setAuthList_names_str_E(java.lang.String[] authList_names_str_E) {
        this.authList_names_str_E = authList_names_str_E;
    }

    public java.lang.String getAuthList_names_str_E(int i) {
        return this.authList_names_str_E[i];
    }

    public void setAuthList_names_str_E(int i, java.lang.String _value) {
        this.authList_names_str_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthList_names_strType)) return false;
        AuthList_names_strType other = (AuthList_names_strType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authList_names_str_E==null && other.getAuthList_names_str_E()==null) || 
             (this.authList_names_str_E!=null &&
              java.util.Arrays.equals(this.authList_names_str_E, other.getAuthList_names_str_E())));
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
        if (getAuthList_names_str_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthList_names_str_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthList_names_str_E(), i);
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
        new org.apache.axis.description.TypeDesc(AuthList_names_strType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Auth-list_names_strType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authList_names_str_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Auth-list_names_str_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Auth-list_names_str_E"));
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
