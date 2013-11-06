/**
 * MimDateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MimDateType  implements java.io.Serializable {
    private java.lang.String mimDate_year;

    private java.lang.String mimDate_month;

    private java.lang.String mimDate_day;

    public MimDateType() {
    }

    public MimDateType(
           java.lang.String mimDate_year,
           java.lang.String mimDate_month,
           java.lang.String mimDate_day) {
           this.mimDate_year = mimDate_year;
           this.mimDate_month = mimDate_month;
           this.mimDate_day = mimDate_day;
    }


    /**
     * Gets the mimDate_year value for this MimDateType.
     * 
     * @return mimDate_year
     */
    public java.lang.String getMimDate_year() {
        return mimDate_year;
    }


    /**
     * Sets the mimDate_year value for this MimDateType.
     * 
     * @param mimDate_year
     */
    public void setMimDate_year(java.lang.String mimDate_year) {
        this.mimDate_year = mimDate_year;
    }


    /**
     * Gets the mimDate_month value for this MimDateType.
     * 
     * @return mimDate_month
     */
    public java.lang.String getMimDate_month() {
        return mimDate_month;
    }


    /**
     * Sets the mimDate_month value for this MimDateType.
     * 
     * @param mimDate_month
     */
    public void setMimDate_month(java.lang.String mimDate_month) {
        this.mimDate_month = mimDate_month;
    }


    /**
     * Gets the mimDate_day value for this MimDateType.
     * 
     * @return mimDate_day
     */
    public java.lang.String getMimDate_day() {
        return mimDate_day;
    }


    /**
     * Sets the mimDate_day value for this MimDateType.
     * 
     * @param mimDate_day
     */
    public void setMimDate_day(java.lang.String mimDate_day) {
        this.mimDate_day = mimDate_day;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MimDateType)) return false;
        MimDateType other = (MimDateType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mimDate_year==null && other.getMimDate_year()==null) || 
             (this.mimDate_year!=null &&
              this.mimDate_year.equals(other.getMimDate_year()))) &&
            ((this.mimDate_month==null && other.getMimDate_month()==null) || 
             (this.mimDate_month!=null &&
              this.mimDate_month.equals(other.getMimDate_month()))) &&
            ((this.mimDate_day==null && other.getMimDate_day()==null) || 
             (this.mimDate_day!=null &&
              this.mimDate_day.equals(other.getMimDate_day())));
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
        if (getMimDate_year() != null) {
            _hashCode += getMimDate_year().hashCode();
        }
        if (getMimDate_month() != null) {
            _hashCode += getMimDate_month().hashCode();
        }
        if (getMimDate_day() != null) {
            _hashCode += getMimDate_day().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MimDateType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-dateType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimDate_year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-date_year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimDate_month");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-date_month"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimDate_day");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-date_day"));
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
