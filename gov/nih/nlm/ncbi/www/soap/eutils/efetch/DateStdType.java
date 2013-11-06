/**
 * DateStdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class DateStdType  implements java.io.Serializable {
    private java.lang.String dateStd_year;

    private java.lang.String dateStd_month;

    private java.lang.String dateStd_day;

    private java.lang.String dateStd_season;

    private java.lang.String dateStd_hour;

    private java.lang.String dateStd_minute;

    private java.lang.String dateStd_second;

    public DateStdType() {
    }

    public DateStdType(
           java.lang.String dateStd_year,
           java.lang.String dateStd_month,
           java.lang.String dateStd_day,
           java.lang.String dateStd_season,
           java.lang.String dateStd_hour,
           java.lang.String dateStd_minute,
           java.lang.String dateStd_second) {
           this.dateStd_year = dateStd_year;
           this.dateStd_month = dateStd_month;
           this.dateStd_day = dateStd_day;
           this.dateStd_season = dateStd_season;
           this.dateStd_hour = dateStd_hour;
           this.dateStd_minute = dateStd_minute;
           this.dateStd_second = dateStd_second;
    }


    /**
     * Gets the dateStd_year value for this DateStdType.
     * 
     * @return dateStd_year
     */
    public java.lang.String getDateStd_year() {
        return dateStd_year;
    }


    /**
     * Sets the dateStd_year value for this DateStdType.
     * 
     * @param dateStd_year
     */
    public void setDateStd_year(java.lang.String dateStd_year) {
        this.dateStd_year = dateStd_year;
    }


    /**
     * Gets the dateStd_month value for this DateStdType.
     * 
     * @return dateStd_month
     */
    public java.lang.String getDateStd_month() {
        return dateStd_month;
    }


    /**
     * Sets the dateStd_month value for this DateStdType.
     * 
     * @param dateStd_month
     */
    public void setDateStd_month(java.lang.String dateStd_month) {
        this.dateStd_month = dateStd_month;
    }


    /**
     * Gets the dateStd_day value for this DateStdType.
     * 
     * @return dateStd_day
     */
    public java.lang.String getDateStd_day() {
        return dateStd_day;
    }


    /**
     * Sets the dateStd_day value for this DateStdType.
     * 
     * @param dateStd_day
     */
    public void setDateStd_day(java.lang.String dateStd_day) {
        this.dateStd_day = dateStd_day;
    }


    /**
     * Gets the dateStd_season value for this DateStdType.
     * 
     * @return dateStd_season
     */
    public java.lang.String getDateStd_season() {
        return dateStd_season;
    }


    /**
     * Sets the dateStd_season value for this DateStdType.
     * 
     * @param dateStd_season
     */
    public void setDateStd_season(java.lang.String dateStd_season) {
        this.dateStd_season = dateStd_season;
    }


    /**
     * Gets the dateStd_hour value for this DateStdType.
     * 
     * @return dateStd_hour
     */
    public java.lang.String getDateStd_hour() {
        return dateStd_hour;
    }


    /**
     * Sets the dateStd_hour value for this DateStdType.
     * 
     * @param dateStd_hour
     */
    public void setDateStd_hour(java.lang.String dateStd_hour) {
        this.dateStd_hour = dateStd_hour;
    }


    /**
     * Gets the dateStd_minute value for this DateStdType.
     * 
     * @return dateStd_minute
     */
    public java.lang.String getDateStd_minute() {
        return dateStd_minute;
    }


    /**
     * Sets the dateStd_minute value for this DateStdType.
     * 
     * @param dateStd_minute
     */
    public void setDateStd_minute(java.lang.String dateStd_minute) {
        this.dateStd_minute = dateStd_minute;
    }


    /**
     * Gets the dateStd_second value for this DateStdType.
     * 
     * @return dateStd_second
     */
    public java.lang.String getDateStd_second() {
        return dateStd_second;
    }


    /**
     * Sets the dateStd_second value for this DateStdType.
     * 
     * @param dateStd_second
     */
    public void setDateStd_second(java.lang.String dateStd_second) {
        this.dateStd_second = dateStd_second;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DateStdType)) return false;
        DateStdType other = (DateStdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateStd_year==null && other.getDateStd_year()==null) || 
             (this.dateStd_year!=null &&
              this.dateStd_year.equals(other.getDateStd_year()))) &&
            ((this.dateStd_month==null && other.getDateStd_month()==null) || 
             (this.dateStd_month!=null &&
              this.dateStd_month.equals(other.getDateStd_month()))) &&
            ((this.dateStd_day==null && other.getDateStd_day()==null) || 
             (this.dateStd_day!=null &&
              this.dateStd_day.equals(other.getDateStd_day()))) &&
            ((this.dateStd_season==null && other.getDateStd_season()==null) || 
             (this.dateStd_season!=null &&
              this.dateStd_season.equals(other.getDateStd_season()))) &&
            ((this.dateStd_hour==null && other.getDateStd_hour()==null) || 
             (this.dateStd_hour!=null &&
              this.dateStd_hour.equals(other.getDateStd_hour()))) &&
            ((this.dateStd_minute==null && other.getDateStd_minute()==null) || 
             (this.dateStd_minute!=null &&
              this.dateStd_minute.equals(other.getDateStd_minute()))) &&
            ((this.dateStd_second==null && other.getDateStd_second()==null) || 
             (this.dateStd_second!=null &&
              this.dateStd_second.equals(other.getDateStd_second())));
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
        if (getDateStd_year() != null) {
            _hashCode += getDateStd_year().hashCode();
        }
        if (getDateStd_month() != null) {
            _hashCode += getDateStd_month().hashCode();
        }
        if (getDateStd_day() != null) {
            _hashCode += getDateStd_day().hashCode();
        }
        if (getDateStd_season() != null) {
            _hashCode += getDateStd_season().hashCode();
        }
        if (getDateStd_hour() != null) {
            _hashCode += getDateStd_hour().hashCode();
        }
        if (getDateStd_minute() != null) {
            _hashCode += getDateStd_minute().hashCode();
        }
        if (getDateStd_second() != null) {
            _hashCode += getDateStd_second().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DateStdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Date-stdType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateStd_year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Date-std_year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateStd_month");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Date-std_month"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateStd_day");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Date-std_day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateStd_season");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Date-std_season"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateStd_hour");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Date-std_hour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateStd_minute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Date-std_minute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateStd_second");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Date-std_second"));
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
