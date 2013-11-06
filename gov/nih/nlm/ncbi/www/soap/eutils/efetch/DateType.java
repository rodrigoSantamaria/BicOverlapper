/**
 * DateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class DateType  implements java.io.Serializable {
    private java.lang.String date_str;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Date_stdType date_std;

    public DateType() {
    }

    public DateType(
           java.lang.String date_str,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Date_stdType date_std) {
           this.date_str = date_str;
           this.date_std = date_std;
    }


    /**
     * Gets the date_str value for this DateType.
     * 
     * @return date_str
     */
    public java.lang.String getDate_str() {
        return date_str;
    }


    /**
     * Sets the date_str value for this DateType.
     * 
     * @param date_str
     */
    public void setDate_str(java.lang.String date_str) {
        this.date_str = date_str;
    }


    /**
     * Gets the date_std value for this DateType.
     * 
     * @return date_std
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Date_stdType getDate_std() {
        return date_std;
    }


    /**
     * Sets the date_std value for this DateType.
     * 
     * @param date_std
     */
    public void setDate_std(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Date_stdType date_std) {
        this.date_std = date_std;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DateType)) return false;
        DateType other = (DateType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date_str==null && other.getDate_str()==null) || 
             (this.date_str!=null &&
              this.date_str.equals(other.getDate_str()))) &&
            ((this.date_std==null && other.getDate_std()==null) || 
             (this.date_std!=null &&
              this.date_std.equals(other.getDate_std())));
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
        if (getDate_str() != null) {
            _hashCode += getDate_str().hashCode();
        }
        if (getDate_std() != null) {
            _hashCode += getDate_std().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DateType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DateType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_str");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Date_str"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_std");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Date_std"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Date_stdType"));
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
