/**
 * Blast4ParameterInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4ParameterInfoType  implements java.io.Serializable {
    private java.lang.String blast4ParameterInfo_name;

    private java.lang.String blast4ParameterInfo_type;

    public Blast4ParameterInfoType() {
    }

    public Blast4ParameterInfoType(
           java.lang.String blast4ParameterInfo_name,
           java.lang.String blast4ParameterInfo_type) {
           this.blast4ParameterInfo_name = blast4ParameterInfo_name;
           this.blast4ParameterInfo_type = blast4ParameterInfo_type;
    }


    /**
     * Gets the blast4ParameterInfo_name value for this Blast4ParameterInfoType.
     * 
     * @return blast4ParameterInfo_name
     */
    public java.lang.String getBlast4ParameterInfo_name() {
        return blast4ParameterInfo_name;
    }


    /**
     * Sets the blast4ParameterInfo_name value for this Blast4ParameterInfoType.
     * 
     * @param blast4ParameterInfo_name
     */
    public void setBlast4ParameterInfo_name(java.lang.String blast4ParameterInfo_name) {
        this.blast4ParameterInfo_name = blast4ParameterInfo_name;
    }


    /**
     * Gets the blast4ParameterInfo_type value for this Blast4ParameterInfoType.
     * 
     * @return blast4ParameterInfo_type
     */
    public java.lang.String getBlast4ParameterInfo_type() {
        return blast4ParameterInfo_type;
    }


    /**
     * Sets the blast4ParameterInfo_type value for this Blast4ParameterInfoType.
     * 
     * @param blast4ParameterInfo_type
     */
    public void setBlast4ParameterInfo_type(java.lang.String blast4ParameterInfo_type) {
        this.blast4ParameterInfo_type = blast4ParameterInfo_type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4ParameterInfoType)) return false;
        Blast4ParameterInfoType other = (Blast4ParameterInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4ParameterInfo_name==null && other.getBlast4ParameterInfo_name()==null) || 
             (this.blast4ParameterInfo_name!=null &&
              this.blast4ParameterInfo_name.equals(other.getBlast4ParameterInfo_name()))) &&
            ((this.blast4ParameterInfo_type==null && other.getBlast4ParameterInfo_type()==null) || 
             (this.blast4ParameterInfo_type!=null &&
              this.blast4ParameterInfo_type.equals(other.getBlast4ParameterInfo_type())));
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
        if (getBlast4ParameterInfo_name() != null) {
            _hashCode += getBlast4ParameterInfo_name().hashCode();
        }
        if (getBlast4ParameterInfo_type() != null) {
            _hashCode += getBlast4ParameterInfo_type().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4ParameterInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-parameter-infoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4ParameterInfo_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-parameter-info_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4ParameterInfo_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-parameter-info_type"));
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
