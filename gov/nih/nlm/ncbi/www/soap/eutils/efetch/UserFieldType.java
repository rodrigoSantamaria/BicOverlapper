/**
 * UserFieldType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class UserFieldType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserField_labelType userField_label;

    private java.lang.String userField_num;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserField_dataType userField_data;

    public UserFieldType() {
    }

    public UserFieldType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserField_labelType userField_label,
           java.lang.String userField_num,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserField_dataType userField_data) {
           this.userField_label = userField_label;
           this.userField_num = userField_num;
           this.userField_data = userField_data;
    }


    /**
     * Gets the userField_label value for this UserFieldType.
     * 
     * @return userField_label
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserField_labelType getUserField_label() {
        return userField_label;
    }


    /**
     * Sets the userField_label value for this UserFieldType.
     * 
     * @param userField_label
     */
    public void setUserField_label(gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserField_labelType userField_label) {
        this.userField_label = userField_label;
    }


    /**
     * Gets the userField_num value for this UserFieldType.
     * 
     * @return userField_num
     */
    public java.lang.String getUserField_num() {
        return userField_num;
    }


    /**
     * Sets the userField_num value for this UserFieldType.
     * 
     * @param userField_num
     */
    public void setUserField_num(java.lang.String userField_num) {
        this.userField_num = userField_num;
    }


    /**
     * Gets the userField_data value for this UserFieldType.
     * 
     * @return userField_data
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserField_dataType getUserField_data() {
        return userField_data;
    }


    /**
     * Sets the userField_data value for this UserFieldType.
     * 
     * @param userField_data
     */
    public void setUserField_data(gov.nih.nlm.ncbi.www.soap.eutils.efetch.UserField_dataType userField_data) {
        this.userField_data = userField_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserFieldType)) return false;
        UserFieldType other = (UserFieldType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userField_label==null && other.getUserField_label()==null) || 
             (this.userField_label!=null &&
              this.userField_label.equals(other.getUserField_label()))) &&
            ((this.userField_num==null && other.getUserField_num()==null) || 
             (this.userField_num!=null &&
              this.userField_num.equals(other.getUserField_num()))) &&
            ((this.userField_data==null && other.getUserField_data()==null) || 
             (this.userField_data!=null &&
              this.userField_data.equals(other.getUserField_data())));
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
        if (getUserField_label() != null) {
            _hashCode += getUserField_label().hashCode();
        }
        if (getUserField_num() != null) {
            _hashCode += getUserField_num().hashCode();
        }
        if (getUserField_data() != null) {
            _hashCode += getUserField_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserFieldType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "User-fieldType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userField_label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "User-field_label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "User-field_labelType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userField_num");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "User-field_num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userField_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "User-field_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "User-field_dataType"));
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
