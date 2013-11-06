/**
 * ID2ParamType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2ParamType  implements java.io.Serializable {
    private java.lang.String ID2Param_name;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Param_valueType ID2Param_value;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Param_typeType ID2Param_type;

    public ID2ParamType() {
    }

    public ID2ParamType(
           java.lang.String ID2Param_name,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Param_valueType ID2Param_value,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Param_typeType ID2Param_type) {
           this.ID2Param_name = ID2Param_name;
           this.ID2Param_value = ID2Param_value;
           this.ID2Param_type = ID2Param_type;
    }


    /**
     * Gets the ID2Param_name value for this ID2ParamType.
     * 
     * @return ID2Param_name
     */
    public java.lang.String getID2Param_name() {
        return ID2Param_name;
    }


    /**
     * Sets the ID2Param_name value for this ID2ParamType.
     * 
     * @param ID2Param_name
     */
    public void setID2Param_name(java.lang.String ID2Param_name) {
        this.ID2Param_name = ID2Param_name;
    }


    /**
     * Gets the ID2Param_value value for this ID2ParamType.
     * 
     * @return ID2Param_value
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Param_valueType getID2Param_value() {
        return ID2Param_value;
    }


    /**
     * Sets the ID2Param_value value for this ID2ParamType.
     * 
     * @param ID2Param_value
     */
    public void setID2Param_value(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Param_valueType ID2Param_value) {
        this.ID2Param_value = ID2Param_value;
    }


    /**
     * Gets the ID2Param_type value for this ID2ParamType.
     * 
     * @return ID2Param_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Param_typeType getID2Param_type() {
        return ID2Param_type;
    }


    /**
     * Sets the ID2Param_type value for this ID2ParamType.
     * 
     * @param ID2Param_type
     */
    public void setID2Param_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Param_typeType ID2Param_type) {
        this.ID2Param_type = ID2Param_type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2ParamType)) return false;
        ID2ParamType other = (ID2ParamType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2Param_name==null && other.getID2Param_name()==null) || 
             (this.ID2Param_name!=null &&
              this.ID2Param_name.equals(other.getID2Param_name()))) &&
            ((this.ID2Param_value==null && other.getID2Param_value()==null) || 
             (this.ID2Param_value!=null &&
              this.ID2Param_value.equals(other.getID2Param_value()))) &&
            ((this.ID2Param_type==null && other.getID2Param_type()==null) || 
             (this.ID2Param_type!=null &&
              this.ID2Param_type.equals(other.getID2Param_type())));
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
        if (getID2Param_name() != null) {
            _hashCode += getID2Param_name().hashCode();
        }
        if (getID2Param_value() != null) {
            _hashCode += getID2Param_value().hashCode();
        }
        if (getID2Param_type() != null) {
            _hashCode += getID2Param_type().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2ParamType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-ParamType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2Param_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Param_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2Param_value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Param_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Param_valueType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2Param_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Param_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Param_typeType"));
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
