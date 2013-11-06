/**
 * Date.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Date  implements java.io.Serializable {
    private java.lang.String day;

    private java.lang.String month;

    private java.lang.String season;

    private java.lang.String year;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.StringDate stringDate;

    private java.lang.String dateType;  // attribute

    public Date() {
    }

    public Date(
           java.lang.String day,
           java.lang.String month,
           java.lang.String season,
           java.lang.String year,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.StringDate stringDate,
           java.lang.String dateType) {
           this.day = day;
           this.month = month;
           this.season = season;
           this.year = year;
           this.stringDate = stringDate;
           this.dateType = dateType;
    }


    /**
     * Gets the day value for this Date.
     * 
     * @return day
     */
    public java.lang.String getDay() {
        return day;
    }


    /**
     * Sets the day value for this Date.
     * 
     * @param day
     */
    public void setDay(java.lang.String day) {
        this.day = day;
    }


    /**
     * Gets the month value for this Date.
     * 
     * @return month
     */
    public java.lang.String getMonth() {
        return month;
    }


    /**
     * Sets the month value for this Date.
     * 
     * @param month
     */
    public void setMonth(java.lang.String month) {
        this.month = month;
    }


    /**
     * Gets the season value for this Date.
     * 
     * @return season
     */
    public java.lang.String getSeason() {
        return season;
    }


    /**
     * Sets the season value for this Date.
     * 
     * @param season
     */
    public void setSeason(java.lang.String season) {
        this.season = season;
    }


    /**
     * Gets the year value for this Date.
     * 
     * @return year
     */
    public java.lang.String getYear() {
        return year;
    }


    /**
     * Sets the year value for this Date.
     * 
     * @param year
     */
    public void setYear(java.lang.String year) {
        this.year = year;
    }


    /**
     * Gets the stringDate value for this Date.
     * 
     * @return stringDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.StringDate getStringDate() {
        return stringDate;
    }


    /**
     * Sets the stringDate value for this Date.
     * 
     * @param stringDate
     */
    public void setStringDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.StringDate stringDate) {
        this.stringDate = stringDate;
    }


    /**
     * Gets the dateType value for this Date.
     * 
     * @return dateType
     */
    public java.lang.String getDateType() {
        return dateType;
    }


    /**
     * Sets the dateType value for this Date.
     * 
     * @param dateType
     */
    public void setDateType(java.lang.String dateType) {
        this.dateType = dateType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Date)) return false;
        Date other = (Date) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.day==null && other.getDay()==null) || 
             (this.day!=null &&
              this.day.equals(other.getDay()))) &&
            ((this.month==null && other.getMonth()==null) || 
             (this.month!=null &&
              this.month.equals(other.getMonth()))) &&
            ((this.season==null && other.getSeason()==null) || 
             (this.season!=null &&
              this.season.equals(other.getSeason()))) &&
            ((this.year==null && other.getYear()==null) || 
             (this.year!=null &&
              this.year.equals(other.getYear()))) &&
            ((this.stringDate==null && other.getStringDate()==null) || 
             (this.stringDate!=null &&
              this.stringDate.equals(other.getStringDate()))) &&
            ((this.dateType==null && other.getDateType()==null) || 
             (this.dateType!=null &&
              this.dateType.equals(other.getDateType())));
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
        if (getDay() != null) {
            _hashCode += getDay().hashCode();
        }
        if (getMonth() != null) {
            _hashCode += getMonth().hashCode();
        }
        if (getSeason() != null) {
            _hashCode += getSeason().hashCode();
        }
        if (getYear() != null) {
            _hashCode += getYear().hashCode();
        }
        if (getStringDate() != null) {
            _hashCode += getStringDate().hashCode();
        }
        if (getDateType() != null) {
            _hashCode += getDateType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Date.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">date"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("dateType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "date-type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("month");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "month"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("season");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "season"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "string-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">string-date"));
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
