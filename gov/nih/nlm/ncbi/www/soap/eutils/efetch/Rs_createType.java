/**
 * Rs_createType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Rs_createType  implements java.io.Serializable {
    private java.lang.String rs_create_build;

    private java.lang.String rs_create_date;

    public Rs_createType() {
    }

    public Rs_createType(
           java.lang.String rs_create_build,
           java.lang.String rs_create_date) {
           this.rs_create_build = rs_create_build;
           this.rs_create_date = rs_create_date;
    }


    /**
     * Gets the rs_create_build value for this Rs_createType.
     * 
     * @return rs_create_build
     */
    public java.lang.String getRs_create_build() {
        return rs_create_build;
    }


    /**
     * Sets the rs_create_build value for this Rs_createType.
     * 
     * @param rs_create_build
     */
    public void setRs_create_build(java.lang.String rs_create_build) {
        this.rs_create_build = rs_create_build;
    }


    /**
     * Gets the rs_create_date value for this Rs_createType.
     * 
     * @return rs_create_date
     */
    public java.lang.String getRs_create_date() {
        return rs_create_date;
    }


    /**
     * Sets the rs_create_date value for this Rs_createType.
     * 
     * @param rs_create_date
     */
    public void setRs_create_date(java.lang.String rs_create_date) {
        this.rs_create_date = rs_create_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rs_createType)) return false;
        Rs_createType other = (Rs_createType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rs_create_build==null && other.getRs_create_build()==null) || 
             (this.rs_create_build!=null &&
              this.rs_create_build.equals(other.getRs_create_build()))) &&
            ((this.rs_create_date==null && other.getRs_create_date()==null) || 
             (this.rs_create_date!=null &&
              this.rs_create_date.equals(other.getRs_create_date())));
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
        if (getRs_create_build() != null) {
            _hashCode += getRs_create_build().hashCode();
        }
        if (getRs_create_date() != null) {
            _hashCode += getRs_create_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Rs_createType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_createType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_create_build");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_create_build"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_create_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_create_date"));
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
