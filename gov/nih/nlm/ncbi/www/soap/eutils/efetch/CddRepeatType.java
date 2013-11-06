/**
 * CddRepeatType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CddRepeatType  implements java.io.Serializable {
    private java.lang.String cddRepeat_count;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddRepeat_locationType cddRepeat_location;

    private java.lang.String cddRepeat_avglen;

    public CddRepeatType() {
    }

    public CddRepeatType(
           java.lang.String cddRepeat_count,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddRepeat_locationType cddRepeat_location,
           java.lang.String cddRepeat_avglen) {
           this.cddRepeat_count = cddRepeat_count;
           this.cddRepeat_location = cddRepeat_location;
           this.cddRepeat_avglen = cddRepeat_avglen;
    }


    /**
     * Gets the cddRepeat_count value for this CddRepeatType.
     * 
     * @return cddRepeat_count
     */
    public java.lang.String getCddRepeat_count() {
        return cddRepeat_count;
    }


    /**
     * Sets the cddRepeat_count value for this CddRepeatType.
     * 
     * @param cddRepeat_count
     */
    public void setCddRepeat_count(java.lang.String cddRepeat_count) {
        this.cddRepeat_count = cddRepeat_count;
    }


    /**
     * Gets the cddRepeat_location value for this CddRepeatType.
     * 
     * @return cddRepeat_location
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddRepeat_locationType getCddRepeat_location() {
        return cddRepeat_location;
    }


    /**
     * Sets the cddRepeat_location value for this CddRepeatType.
     * 
     * @param cddRepeat_location
     */
    public void setCddRepeat_location(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddRepeat_locationType cddRepeat_location) {
        this.cddRepeat_location = cddRepeat_location;
    }


    /**
     * Gets the cddRepeat_avglen value for this CddRepeatType.
     * 
     * @return cddRepeat_avglen
     */
    public java.lang.String getCddRepeat_avglen() {
        return cddRepeat_avglen;
    }


    /**
     * Sets the cddRepeat_avglen value for this CddRepeatType.
     * 
     * @param cddRepeat_avglen
     */
    public void setCddRepeat_avglen(java.lang.String cddRepeat_avglen) {
        this.cddRepeat_avglen = cddRepeat_avglen;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CddRepeatType)) return false;
        CddRepeatType other = (CddRepeatType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cddRepeat_count==null && other.getCddRepeat_count()==null) || 
             (this.cddRepeat_count!=null &&
              this.cddRepeat_count.equals(other.getCddRepeat_count()))) &&
            ((this.cddRepeat_location==null && other.getCddRepeat_location()==null) || 
             (this.cddRepeat_location!=null &&
              this.cddRepeat_location.equals(other.getCddRepeat_location()))) &&
            ((this.cddRepeat_avglen==null && other.getCddRepeat_avglen()==null) || 
             (this.cddRepeat_avglen!=null &&
              this.cddRepeat_avglen.equals(other.getCddRepeat_avglen())));
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
        if (getCddRepeat_count() != null) {
            _hashCode += getCddRepeat_count().hashCode();
        }
        if (getCddRepeat_location() != null) {
            _hashCode += getCddRepeat_location().hashCode();
        }
        if (getCddRepeat_avglen() != null) {
            _hashCode += getCddRepeat_avglen().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CddRepeatType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-repeatType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddRepeat_count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-repeat_count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddRepeat_location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-repeat_location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-repeat_locationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddRepeat_avglen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-repeat_avglen"));
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
