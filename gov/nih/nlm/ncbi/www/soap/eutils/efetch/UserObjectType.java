/**
 * UserObjectType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class UserObjectType  implements java.io.Serializable {
    private java.lang.String userObject_class;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserObject_typeType userObject_type;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserObject_dataType userObject_data;

    public UserObjectType() {
    }

    public UserObjectType(
           java.lang.String userObject_class,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserObject_typeType userObject_type,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserObject_dataType userObject_data) {
           this.userObject_class = userObject_class;
           this.userObject_type = userObject_type;
           this.userObject_data = userObject_data;
    }


    /**
     * Gets the userObject_class value for this UserObjectType.
     * 
     * @return userObject_class
     */
    public java.lang.String getUserObject_class() {
        return userObject_class;
    }


    /**
     * Sets the userObject_class value for this UserObjectType.
     * 
     * @param userObject_class
     */
    public void setUserObject_class(java.lang.String userObject_class) {
        this.userObject_class = userObject_class;
    }


    /**
     * Gets the userObject_type value for this UserObjectType.
     * 
     * @return userObject_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserObject_typeType getUserObject_type() {
        return userObject_type;
    }


    /**
     * Sets the userObject_type value for this UserObjectType.
     * 
     * @param userObject_type
     */
    public void setUserObject_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserObject_typeType userObject_type) {
        this.userObject_type = userObject_type;
    }


    /**
     * Gets the userObject_data value for this UserObjectType.
     * 
     * @return userObject_data
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserObject_dataType getUserObject_data() {
        return userObject_data;
    }


    /**
     * Sets the userObject_data value for this UserObjectType.
     * 
     * @param userObject_data
     */
    public void setUserObject_data(gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserObject_dataType userObject_data) {
        this.userObject_data = userObject_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserObjectType)) return false;
        UserObjectType other = (UserObjectType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userObject_class==null && other.getUserObject_class()==null) || 
             (this.userObject_class!=null &&
              this.userObject_class.equals(other.getUserObject_class()))) &&
            ((this.userObject_type==null && other.getUserObject_type()==null) || 
             (this.userObject_type!=null &&
              this.userObject_type.equals(other.getUserObject_type()))) &&
            ((this.userObject_data==null && other.getUserObject_data()==null) || 
             (this.userObject_data!=null &&
              this.userObject_data.equals(other.getUserObject_data())));
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
        if (getUserObject_class() != null) {
            _hashCode += getUserObject_class().hashCode();
        }
        if (getUserObject_type() != null) {
            _hashCode += getUserObject_type().hashCode();
        }
        if (getUserObject_data() != null) {
            _hashCode += getUserObject_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserObjectType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "User-objectType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userObject_class");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "User-object_class"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userObject_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "User-object_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "User-object_typeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userObject_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "User-object_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "User-object_dataType"));
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
