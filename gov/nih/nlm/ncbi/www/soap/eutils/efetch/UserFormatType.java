/**
 * UserFormatType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class UserFormatType  implements java.io.Serializable {
    private java.lang.String userFormat_printfunc;

    private java.lang.String userFormat_defaultfunc;

    public UserFormatType() {
    }

    public UserFormatType(
           java.lang.String userFormat_printfunc,
           java.lang.String userFormat_defaultfunc) {
           this.userFormat_printfunc = userFormat_printfunc;
           this.userFormat_defaultfunc = userFormat_defaultfunc;
    }


    /**
     * Gets the userFormat_printfunc value for this UserFormatType.
     * 
     * @return userFormat_printfunc
     */
    public java.lang.String getUserFormat_printfunc() {
        return userFormat_printfunc;
    }


    /**
     * Sets the userFormat_printfunc value for this UserFormatType.
     * 
     * @param userFormat_printfunc
     */
    public void setUserFormat_printfunc(java.lang.String userFormat_printfunc) {
        this.userFormat_printfunc = userFormat_printfunc;
    }


    /**
     * Gets the userFormat_defaultfunc value for this UserFormatType.
     * 
     * @return userFormat_defaultfunc
     */
    public java.lang.String getUserFormat_defaultfunc() {
        return userFormat_defaultfunc;
    }


    /**
     * Sets the userFormat_defaultfunc value for this UserFormatType.
     * 
     * @param userFormat_defaultfunc
     */
    public void setUserFormat_defaultfunc(java.lang.String userFormat_defaultfunc) {
        this.userFormat_defaultfunc = userFormat_defaultfunc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserFormatType)) return false;
        UserFormatType other = (UserFormatType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userFormat_printfunc==null && other.getUserFormat_printfunc()==null) || 
             (this.userFormat_printfunc!=null &&
              this.userFormat_printfunc.equals(other.getUserFormat_printfunc()))) &&
            ((this.userFormat_defaultfunc==null && other.getUserFormat_defaultfunc()==null) || 
             (this.userFormat_defaultfunc!=null &&
              this.userFormat_defaultfunc.equals(other.getUserFormat_defaultfunc())));
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
        if (getUserFormat_printfunc() != null) {
            _hashCode += getUserFormat_printfunc().hashCode();
        }
        if (getUserFormat_defaultfunc() != null) {
            _hashCode += getUserFormat_defaultfunc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserFormatType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "UserFormatType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userFormat_printfunc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "UserFormat_printfunc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userFormat_defaultfunc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "UserFormat_defaultfunc"));
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
