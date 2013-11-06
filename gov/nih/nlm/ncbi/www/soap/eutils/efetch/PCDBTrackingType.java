/**
 * PCDBTrackingType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCDBTrackingType  implements java.io.Serializable {
    private java.lang.String PCDBTracking_name;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDBTracking_sourceIdType PCDBTracking_sourceId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDBTracking_dateType PCDBTracking_date;

    private java.lang.String PCDBTracking_description;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDBTracking_pubType PCDBTracking_pub;

    public PCDBTrackingType() {
    }

    public PCDBTrackingType(
           java.lang.String PCDBTracking_name,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDBTracking_sourceIdType PCDBTracking_sourceId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDBTracking_dateType PCDBTracking_date,
           java.lang.String PCDBTracking_description,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDBTracking_pubType PCDBTracking_pub) {
           this.PCDBTracking_name = PCDBTracking_name;
           this.PCDBTracking_sourceId = PCDBTracking_sourceId;
           this.PCDBTracking_date = PCDBTracking_date;
           this.PCDBTracking_description = PCDBTracking_description;
           this.PCDBTracking_pub = PCDBTracking_pub;
    }


    /**
     * Gets the PCDBTracking_name value for this PCDBTrackingType.
     * 
     * @return PCDBTracking_name
     */
    public java.lang.String getPCDBTracking_name() {
        return PCDBTracking_name;
    }


    /**
     * Sets the PCDBTracking_name value for this PCDBTrackingType.
     * 
     * @param PCDBTracking_name
     */
    public void setPCDBTracking_name(java.lang.String PCDBTracking_name) {
        this.PCDBTracking_name = PCDBTracking_name;
    }


    /**
     * Gets the PCDBTracking_sourceId value for this PCDBTrackingType.
     * 
     * @return PCDBTracking_sourceId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDBTracking_sourceIdType getPCDBTracking_sourceId() {
        return PCDBTracking_sourceId;
    }


    /**
     * Sets the PCDBTracking_sourceId value for this PCDBTrackingType.
     * 
     * @param PCDBTracking_sourceId
     */
    public void setPCDBTracking_sourceId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDBTracking_sourceIdType PCDBTracking_sourceId) {
        this.PCDBTracking_sourceId = PCDBTracking_sourceId;
    }


    /**
     * Gets the PCDBTracking_date value for this PCDBTrackingType.
     * 
     * @return PCDBTracking_date
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDBTracking_dateType getPCDBTracking_date() {
        return PCDBTracking_date;
    }


    /**
     * Sets the PCDBTracking_date value for this PCDBTrackingType.
     * 
     * @param PCDBTracking_date
     */
    public void setPCDBTracking_date(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDBTracking_dateType PCDBTracking_date) {
        this.PCDBTracking_date = PCDBTracking_date;
    }


    /**
     * Gets the PCDBTracking_description value for this PCDBTrackingType.
     * 
     * @return PCDBTracking_description
     */
    public java.lang.String getPCDBTracking_description() {
        return PCDBTracking_description;
    }


    /**
     * Sets the PCDBTracking_description value for this PCDBTrackingType.
     * 
     * @param PCDBTracking_description
     */
    public void setPCDBTracking_description(java.lang.String PCDBTracking_description) {
        this.PCDBTracking_description = PCDBTracking_description;
    }


    /**
     * Gets the PCDBTracking_pub value for this PCDBTrackingType.
     * 
     * @return PCDBTracking_pub
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDBTracking_pubType getPCDBTracking_pub() {
        return PCDBTracking_pub;
    }


    /**
     * Sets the PCDBTracking_pub value for this PCDBTrackingType.
     * 
     * @param PCDBTracking_pub
     */
    public void setPCDBTracking_pub(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCDBTracking_pubType PCDBTracking_pub) {
        this.PCDBTracking_pub = PCDBTracking_pub;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCDBTrackingType)) return false;
        PCDBTrackingType other = (PCDBTrackingType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCDBTracking_name==null && other.getPCDBTracking_name()==null) || 
             (this.PCDBTracking_name!=null &&
              this.PCDBTracking_name.equals(other.getPCDBTracking_name()))) &&
            ((this.PCDBTracking_sourceId==null && other.getPCDBTracking_sourceId()==null) || 
             (this.PCDBTracking_sourceId!=null &&
              this.PCDBTracking_sourceId.equals(other.getPCDBTracking_sourceId()))) &&
            ((this.PCDBTracking_date==null && other.getPCDBTracking_date()==null) || 
             (this.PCDBTracking_date!=null &&
              this.PCDBTracking_date.equals(other.getPCDBTracking_date()))) &&
            ((this.PCDBTracking_description==null && other.getPCDBTracking_description()==null) || 
             (this.PCDBTracking_description!=null &&
              this.PCDBTracking_description.equals(other.getPCDBTracking_description()))) &&
            ((this.PCDBTracking_pub==null && other.getPCDBTracking_pub()==null) || 
             (this.PCDBTracking_pub!=null &&
              this.PCDBTracking_pub.equals(other.getPCDBTracking_pub())));
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
        if (getPCDBTracking_name() != null) {
            _hashCode += getPCDBTracking_name().hashCode();
        }
        if (getPCDBTracking_sourceId() != null) {
            _hashCode += getPCDBTracking_sourceId().hashCode();
        }
        if (getPCDBTracking_date() != null) {
            _hashCode += getPCDBTracking_date().hashCode();
        }
        if (getPCDBTracking_description() != null) {
            _hashCode += getPCDBTracking_description().hashCode();
        }
        if (getPCDBTracking_pub() != null) {
            _hashCode += getPCDBTracking_pub().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCDBTrackingType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-DBTrackingType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCDBTracking_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-DBTracking_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCDBTracking_sourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-DBTracking_source-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-DBTracking_source-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCDBTracking_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-DBTracking_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-DBTracking_dateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCDBTracking_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-DBTracking_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCDBTracking_pub");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-DBTracking_pub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-DBTracking_pubType"));
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
