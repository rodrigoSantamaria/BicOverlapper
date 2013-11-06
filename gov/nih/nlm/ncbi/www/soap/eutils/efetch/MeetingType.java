/**
 * MeetingType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MeetingType  implements java.io.Serializable {
    private java.lang.String meeting_number;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Meeting_dateType meeting_date;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Meeting_placeType meeting_place;

    public MeetingType() {
    }

    public MeetingType(
           java.lang.String meeting_number,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Meeting_dateType meeting_date,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Meeting_placeType meeting_place) {
           this.meeting_number = meeting_number;
           this.meeting_date = meeting_date;
           this.meeting_place = meeting_place;
    }


    /**
     * Gets the meeting_number value for this MeetingType.
     * 
     * @return meeting_number
     */
    public java.lang.String getMeeting_number() {
        return meeting_number;
    }


    /**
     * Sets the meeting_number value for this MeetingType.
     * 
     * @param meeting_number
     */
    public void setMeeting_number(java.lang.String meeting_number) {
        this.meeting_number = meeting_number;
    }


    /**
     * Gets the meeting_date value for this MeetingType.
     * 
     * @return meeting_date
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Meeting_dateType getMeeting_date() {
        return meeting_date;
    }


    /**
     * Sets the meeting_date value for this MeetingType.
     * 
     * @param meeting_date
     */
    public void setMeeting_date(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Meeting_dateType meeting_date) {
        this.meeting_date = meeting_date;
    }


    /**
     * Gets the meeting_place value for this MeetingType.
     * 
     * @return meeting_place
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Meeting_placeType getMeeting_place() {
        return meeting_place;
    }


    /**
     * Sets the meeting_place value for this MeetingType.
     * 
     * @param meeting_place
     */
    public void setMeeting_place(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Meeting_placeType meeting_place) {
        this.meeting_place = meeting_place;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MeetingType)) return false;
        MeetingType other = (MeetingType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.meeting_number==null && other.getMeeting_number()==null) || 
             (this.meeting_number!=null &&
              this.meeting_number.equals(other.getMeeting_number()))) &&
            ((this.meeting_date==null && other.getMeeting_date()==null) || 
             (this.meeting_date!=null &&
              this.meeting_date.equals(other.getMeeting_date()))) &&
            ((this.meeting_place==null && other.getMeeting_place()==null) || 
             (this.meeting_place!=null &&
              this.meeting_place.equals(other.getMeeting_place())));
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
        if (getMeeting_number() != null) {
            _hashCode += getMeeting_number().hashCode();
        }
        if (getMeeting_date() != null) {
            _hashCode += getMeeting_date().hashCode();
        }
        if (getMeeting_place() != null) {
            _hashCode += getMeeting_place().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MeetingType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MeetingType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meeting_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Meeting_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meeting_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Meeting_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Meeting_dateType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meeting_place");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Meeting_place"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Meeting_placeType"));
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
