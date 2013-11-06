/**
 * Rs_updateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Rs_updateType  implements java.io.Serializable {
    private java.lang.String rs_update_build;

    private java.lang.String rs_update_date;

    public Rs_updateType() {
    }

    public Rs_updateType(
           java.lang.String rs_update_build,
           java.lang.String rs_update_date) {
           this.rs_update_build = rs_update_build;
           this.rs_update_date = rs_update_date;
    }


    /**
     * Gets the rs_update_build value for this Rs_updateType.
     * 
     * @return rs_update_build
     */
    public java.lang.String getRs_update_build() {
        return rs_update_build;
    }


    /**
     * Sets the rs_update_build value for this Rs_updateType.
     * 
     * @param rs_update_build
     */
    public void setRs_update_build(java.lang.String rs_update_build) {
        this.rs_update_build = rs_update_build;
    }


    /**
     * Gets the rs_update_date value for this Rs_updateType.
     * 
     * @return rs_update_date
     */
    public java.lang.String getRs_update_date() {
        return rs_update_date;
    }


    /**
     * Sets the rs_update_date value for this Rs_updateType.
     * 
     * @param rs_update_date
     */
    public void setRs_update_date(java.lang.String rs_update_date) {
        this.rs_update_date = rs_update_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rs_updateType)) return false;
        Rs_updateType other = (Rs_updateType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rs_update_build==null && other.getRs_update_build()==null) || 
             (this.rs_update_build!=null &&
              this.rs_update_build.equals(other.getRs_update_build()))) &&
            ((this.rs_update_date==null && other.getRs_update_date()==null) || 
             (this.rs_update_date!=null &&
              this.rs_update_date.equals(other.getRs_update_date())));
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
        if (getRs_update_build() != null) {
            _hashCode += getRs_update_build().hashCode();
        }
        if (getRs_update_date() != null) {
            _hashCode += getRs_update_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Rs_updateType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_updateType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_update_build");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_update_build"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_update_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_update_date"));
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
