/**
 * PropertyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PropertyType  implements java.io.Serializable {
    private java.lang.String propName;

    private java.lang.String propValueInt;

    private java.lang.String propValueBool;

    private java.lang.String propValueString;

    public PropertyType() {
    }

    public PropertyType(
           java.lang.String propName,
           java.lang.String propValueInt,
           java.lang.String propValueBool,
           java.lang.String propValueString) {
           this.propName = propName;
           this.propValueInt = propValueInt;
           this.propValueBool = propValueBool;
           this.propValueString = propValueString;
    }


    /**
     * Gets the propName value for this PropertyType.
     * 
     * @return propName
     */
    public java.lang.String getPropName() {
        return propName;
    }


    /**
     * Sets the propName value for this PropertyType.
     * 
     * @param propName
     */
    public void setPropName(java.lang.String propName) {
        this.propName = propName;
    }


    /**
     * Gets the propValueInt value for this PropertyType.
     * 
     * @return propValueInt
     */
    public java.lang.String getPropValueInt() {
        return propValueInt;
    }


    /**
     * Sets the propValueInt value for this PropertyType.
     * 
     * @param propValueInt
     */
    public void setPropValueInt(java.lang.String propValueInt) {
        this.propValueInt = propValueInt;
    }


    /**
     * Gets the propValueBool value for this PropertyType.
     * 
     * @return propValueBool
     */
    public java.lang.String getPropValueBool() {
        return propValueBool;
    }


    /**
     * Sets the propValueBool value for this PropertyType.
     * 
     * @param propValueBool
     */
    public void setPropValueBool(java.lang.String propValueBool) {
        this.propValueBool = propValueBool;
    }


    /**
     * Gets the propValueString value for this PropertyType.
     * 
     * @return propValueString
     */
    public java.lang.String getPropValueString() {
        return propValueString;
    }


    /**
     * Sets the propValueString value for this PropertyType.
     * 
     * @param propValueString
     */
    public void setPropValueString(java.lang.String propValueString) {
        this.propValueString = propValueString;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PropertyType)) return false;
        PropertyType other = (PropertyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.propName==null && other.getPropName()==null) || 
             (this.propName!=null &&
              this.propName.equals(other.getPropName()))) &&
            ((this.propValueInt==null && other.getPropValueInt()==null) || 
             (this.propValueInt!=null &&
              this.propValueInt.equals(other.getPropValueInt()))) &&
            ((this.propValueBool==null && other.getPropValueBool()==null) || 
             (this.propValueBool!=null &&
              this.propValueBool.equals(other.getPropValueBool()))) &&
            ((this.propValueString==null && other.getPropValueString()==null) || 
             (this.propValueString!=null &&
              this.propValueString.equals(other.getPropValueString())));
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
        if (getPropName() != null) {
            _hashCode += getPropName().hashCode();
        }
        if (getPropValueInt() != null) {
            _hashCode += getPropValueInt().hashCode();
        }
        if (getPropValueBool() != null) {
            _hashCode += getPropValueBool().hashCode();
        }
        if (getPropValueString() != null) {
            _hashCode += getPropValueString().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PropertyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PropertyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PropName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propValueInt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PropValueInt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propValueBool");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PropValueBool"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propValueString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PropValueString"));
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
