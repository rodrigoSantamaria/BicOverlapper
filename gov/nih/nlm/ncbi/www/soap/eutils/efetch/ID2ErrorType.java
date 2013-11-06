/**
 * ID2ErrorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2ErrorType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Error_severityType ID2Error_severity;

    private java.lang.String ID2Error_retryDelay;

    private java.lang.String ID2Error_message;

    public ID2ErrorType() {
    }

    public ID2ErrorType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Error_severityType ID2Error_severity,
           java.lang.String ID2Error_retryDelay,
           java.lang.String ID2Error_message) {
           this.ID2Error_severity = ID2Error_severity;
           this.ID2Error_retryDelay = ID2Error_retryDelay;
           this.ID2Error_message = ID2Error_message;
    }


    /**
     * Gets the ID2Error_severity value for this ID2ErrorType.
     * 
     * @return ID2Error_severity
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Error_severityType getID2Error_severity() {
        return ID2Error_severity;
    }


    /**
     * Sets the ID2Error_severity value for this ID2ErrorType.
     * 
     * @param ID2Error_severity
     */
    public void setID2Error_severity(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Error_severityType ID2Error_severity) {
        this.ID2Error_severity = ID2Error_severity;
    }


    /**
     * Gets the ID2Error_retryDelay value for this ID2ErrorType.
     * 
     * @return ID2Error_retryDelay
     */
    public java.lang.String getID2Error_retryDelay() {
        return ID2Error_retryDelay;
    }


    /**
     * Sets the ID2Error_retryDelay value for this ID2ErrorType.
     * 
     * @param ID2Error_retryDelay
     */
    public void setID2Error_retryDelay(java.lang.String ID2Error_retryDelay) {
        this.ID2Error_retryDelay = ID2Error_retryDelay;
    }


    /**
     * Gets the ID2Error_message value for this ID2ErrorType.
     * 
     * @return ID2Error_message
     */
    public java.lang.String getID2Error_message() {
        return ID2Error_message;
    }


    /**
     * Sets the ID2Error_message value for this ID2ErrorType.
     * 
     * @param ID2Error_message
     */
    public void setID2Error_message(java.lang.String ID2Error_message) {
        this.ID2Error_message = ID2Error_message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2ErrorType)) return false;
        ID2ErrorType other = (ID2ErrorType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2Error_severity==null && other.getID2Error_severity()==null) || 
             (this.ID2Error_severity!=null &&
              this.ID2Error_severity.equals(other.getID2Error_severity()))) &&
            ((this.ID2Error_retryDelay==null && other.getID2Error_retryDelay()==null) || 
             (this.ID2Error_retryDelay!=null &&
              this.ID2Error_retryDelay.equals(other.getID2Error_retryDelay()))) &&
            ((this.ID2Error_message==null && other.getID2Error_message()==null) || 
             (this.ID2Error_message!=null &&
              this.ID2Error_message.equals(other.getID2Error_message())));
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
        if (getID2Error_severity() != null) {
            _hashCode += getID2Error_severity().hashCode();
        }
        if (getID2Error_retryDelay() != null) {
            _hashCode += getID2Error_retryDelay().hashCode();
        }
        if (getID2Error_message() != null) {
            _hashCode += getID2Error_message().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2ErrorType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-ErrorType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2Error_severity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Error_severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Error_severityType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2Error_retryDelay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Error_retry-delay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2Error_message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Error_message"));
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
