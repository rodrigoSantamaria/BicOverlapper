/**
 * PubMedPubDateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PubMedPubDateType  implements java.io.Serializable {
    private java.lang.String year;

    private java.lang.String month;

    private java.lang.String day;

    private java.lang.String hour;

    private java.lang.String minute;

    private java.lang.String second;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubMedPubDateTypePubStatus pubStatus;  // attribute

    public PubMedPubDateType() {
    }

    public PubMedPubDateType(
           java.lang.String year,
           java.lang.String month,
           java.lang.String day,
           java.lang.String hour,
           java.lang.String minute,
           java.lang.String second,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubMedPubDateTypePubStatus pubStatus) {
           this.year = year;
           this.month = month;
           this.day = day;
           this.hour = hour;
           this.minute = minute;
           this.second = second;
           this.pubStatus = pubStatus;
    }


    /**
     * Gets the year value for this PubMedPubDateType.
     * 
     * @return year
     */
    public java.lang.String getYear() {
        return year;
    }


    /**
     * Sets the year value for this PubMedPubDateType.
     * 
     * @param year
     */
    public void setYear(java.lang.String year) {
        this.year = year;
    }


    /**
     * Gets the month value for this PubMedPubDateType.
     * 
     * @return month
     */
    public java.lang.String getMonth() {
        return month;
    }


    /**
     * Sets the month value for this PubMedPubDateType.
     * 
     * @param month
     */
    public void setMonth(java.lang.String month) {
        this.month = month;
    }


    /**
     * Gets the day value for this PubMedPubDateType.
     * 
     * @return day
     */
    public java.lang.String getDay() {
        return day;
    }


    /**
     * Sets the day value for this PubMedPubDateType.
     * 
     * @param day
     */
    public void setDay(java.lang.String day) {
        this.day = day;
    }


    /**
     * Gets the hour value for this PubMedPubDateType.
     * 
     * @return hour
     */
    public java.lang.String getHour() {
        return hour;
    }


    /**
     * Sets the hour value for this PubMedPubDateType.
     * 
     * @param hour
     */
    public void setHour(java.lang.String hour) {
        this.hour = hour;
    }


    /**
     * Gets the minute value for this PubMedPubDateType.
     * 
     * @return minute
     */
    public java.lang.String getMinute() {
        return minute;
    }


    /**
     * Sets the minute value for this PubMedPubDateType.
     * 
     * @param minute
     */
    public void setMinute(java.lang.String minute) {
        this.minute = minute;
    }


    /**
     * Gets the second value for this PubMedPubDateType.
     * 
     * @return second
     */
    public java.lang.String getSecond() {
        return second;
    }


    /**
     * Sets the second value for this PubMedPubDateType.
     * 
     * @param second
     */
    public void setSecond(java.lang.String second) {
        this.second = second;
    }


    /**
     * Gets the pubStatus value for this PubMedPubDateType.
     * 
     * @return pubStatus
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubMedPubDateTypePubStatus getPubStatus() {
        return pubStatus;
    }


    /**
     * Sets the pubStatus value for this PubMedPubDateType.
     * 
     * @param pubStatus
     */
    public void setPubStatus(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubMedPubDateTypePubStatus pubStatus) {
        this.pubStatus = pubStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PubMedPubDateType)) return false;
        PubMedPubDateType other = (PubMedPubDateType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.year==null && other.getYear()==null) || 
             (this.year!=null &&
              this.year.equals(other.getYear()))) &&
            ((this.month==null && other.getMonth()==null) || 
             (this.month!=null &&
              this.month.equals(other.getMonth()))) &&
            ((this.day==null && other.getDay()==null) || 
             (this.day!=null &&
              this.day.equals(other.getDay()))) &&
            ((this.hour==null && other.getHour()==null) || 
             (this.hour!=null &&
              this.hour.equals(other.getHour()))) &&
            ((this.minute==null && other.getMinute()==null) || 
             (this.minute!=null &&
              this.minute.equals(other.getMinute()))) &&
            ((this.second==null && other.getSecond()==null) || 
             (this.second!=null &&
              this.second.equals(other.getSecond()))) &&
            ((this.pubStatus==null && other.getPubStatus()==null) || 
             (this.pubStatus!=null &&
              this.pubStatus.equals(other.getPubStatus())));
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
        if (getYear() != null) {
            _hashCode += getYear().hashCode();
        }
        if (getMonth() != null) {
            _hashCode += getMonth().hashCode();
        }
        if (getDay() != null) {
            _hashCode += getDay().hashCode();
        }
        if (getHour() != null) {
            _hashCode += getHour().hashCode();
        }
        if (getMinute() != null) {
            _hashCode += getMinute().hashCode();
        }
        if (getSecond() != null) {
            _hashCode += getSecond().hashCode();
        }
        if (getPubStatus() != null) {
            _hashCode += getPubStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PubMedPubDateType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PubMedPubDateType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("pubStatus");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PubStatus"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">PubMedPubDateType>PubStatus"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("month");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Month"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hour");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Hour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Minute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("second");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Second"));
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
