/**
 * ISSNType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ISSNType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ISSNTypeIssnType issnType;  // attribute

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ISSNTypeValidYN validYN;  // attribute

    public ISSNType() {
    }

    // Simple Types must have a String constructor
    public ISSNType(java.lang.String _value) {
        this._value = _value;
    }
    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the _value value for this ISSNType.
     * 
     * @return _value
     */
    public java.lang.String get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this ISSNType.
     * 
     * @param _value
     */
    public void set_value(java.lang.String _value) {
        this._value = _value;
    }


    /**
     * Gets the issnType value for this ISSNType.
     * 
     * @return issnType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ISSNTypeIssnType getIssnType() {
        return issnType;
    }


    /**
     * Sets the issnType value for this ISSNType.
     * 
     * @param issnType
     */
    public void setIssnType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ISSNTypeIssnType issnType) {
        this.issnType = issnType;
    }


    /**
     * Gets the validYN value for this ISSNType.
     * 
     * @return validYN
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ISSNTypeValidYN getValidYN() {
        return validYN;
    }


    /**
     * Sets the validYN value for this ISSNType.
     * 
     * @param validYN
     */
    public void setValidYN(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ISSNTypeValidYN validYN) {
        this.validYN = validYN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ISSNType)) return false;
        ISSNType other = (ISSNType) obj;
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
            ((this.issnType==null && other.getIssnType()==null) || 
             (this.issnType!=null &&
              this.issnType.equals(other.getIssnType()))) &&
            ((this.validYN==null && other.getValidYN()==null) || 
             (this.validYN!=null &&
              this.validYN.equals(other.getValidYN())));
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
        if (getIssnType() != null) {
            _hashCode += getIssnType().hashCode();
        }
        if (getValidYN() != null) {
            _hashCode += getValidYN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ISSNType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ISSNType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("issnType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IssnType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ISSNType>IssnType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("validYN");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ValidYN"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ISSNType>ValidYN"));
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
