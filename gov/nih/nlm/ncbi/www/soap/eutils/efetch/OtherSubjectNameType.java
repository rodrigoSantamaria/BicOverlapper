/**
 * OtherSubjectNameType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class OtherSubjectNameType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSubjectNameTypeMajorTopicYN majorTopicYN;  // attribute

    private java.lang.String subjectType;  // attribute

    public OtherSubjectNameType() {
    }

    // Simple Types must have a String constructor
    public OtherSubjectNameType(java.lang.String _value) {
        this._value = _value;
    }
    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the _value value for this OtherSubjectNameType.
     * 
     * @return _value
     */
    public java.lang.String get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this OtherSubjectNameType.
     * 
     * @param _value
     */
    public void set_value(java.lang.String _value) {
        this._value = _value;
    }


    /**
     * Gets the majorTopicYN value for this OtherSubjectNameType.
     * 
     * @return majorTopicYN
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSubjectNameTypeMajorTopicYN getMajorTopicYN() {
        return majorTopicYN;
    }


    /**
     * Sets the majorTopicYN value for this OtherSubjectNameType.
     * 
     * @param majorTopicYN
     */
    public void setMajorTopicYN(gov.nih.nlm.ncbi.www.soap.eutils.efetch.OtherSubjectNameTypeMajorTopicYN majorTopicYN) {
        this.majorTopicYN = majorTopicYN;
    }


    /**
     * Gets the subjectType value for this OtherSubjectNameType.
     * 
     * @return subjectType
     */
    public java.lang.String getSubjectType() {
        return subjectType;
    }


    /**
     * Sets the subjectType value for this OtherSubjectNameType.
     * 
     * @param subjectType
     */
    public void setSubjectType(java.lang.String subjectType) {
        this.subjectType = subjectType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OtherSubjectNameType)) return false;
        OtherSubjectNameType other = (OtherSubjectNameType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._value==null && other.get_value()==null) || 
             (this._value!=null &&
              this._value.equals(other.get_value()))) &&
            ((this.majorTopicYN==null && other.getMajorTopicYN()==null) || 
             (this.majorTopicYN!=null &&
              this.majorTopicYN.equals(other.getMajorTopicYN()))) &&
            ((this.subjectType==null && other.getSubjectType()==null) || 
             (this.subjectType!=null &&
              this.subjectType.equals(other.getSubjectType())));
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
        if (get_value() != null) {
            _hashCode += get_value().hashCode();
        }
        if (getMajorTopicYN() != null) {
            _hashCode += getMajorTopicYN().hashCode();
        }
        if (getSubjectType() != null) {
            _hashCode += getSubjectType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OtherSubjectNameType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OtherSubjectNameType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("majorTopicYN");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MajorTopicYN"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">OtherSubjectNameType>MajorTopicYN"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("subjectType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SubjectType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_value"));
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
