/**
 * Blast4GetRequestInfoRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4GetRequestInfoRequestType  implements java.io.Serializable {
    private java.lang.String blast4GetRequestInfoRequest_requestId;

    public Blast4GetRequestInfoRequestType() {
    }

    public Blast4GetRequestInfoRequestType(
           java.lang.String blast4GetRequestInfoRequest_requestId) {
           this.blast4GetRequestInfoRequest_requestId = blast4GetRequestInfoRequest_requestId;
    }


    /**
     * Gets the blast4GetRequestInfoRequest_requestId value for this Blast4GetRequestInfoRequestType.
     * 
     * @return blast4GetRequestInfoRequest_requestId
     */
    public java.lang.String getBlast4GetRequestInfoRequest_requestId() {
        return blast4GetRequestInfoRequest_requestId;
    }


    /**
     * Sets the blast4GetRequestInfoRequest_requestId value for this Blast4GetRequestInfoRequestType.
     * 
     * @param blast4GetRequestInfoRequest_requestId
     */
    public void setBlast4GetRequestInfoRequest_requestId(java.lang.String blast4GetRequestInfoRequest_requestId) {
        this.blast4GetRequestInfoRequest_requestId = blast4GetRequestInfoRequest_requestId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4GetRequestInfoRequestType)) return false;
        Blast4GetRequestInfoRequestType other = (Blast4GetRequestInfoRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4GetRequestInfoRequest_requestId==null && other.getBlast4GetRequestInfoRequest_requestId()==null) || 
             (this.blast4GetRequestInfoRequest_requestId!=null &&
              this.blast4GetRequestInfoRequest_requestId.equals(other.getBlast4GetRequestInfoRequest_requestId())));
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
        if (getBlast4GetRequestInfoRequest_requestId() != null) {
            _hashCode += getBlast4GetRequestInfoRequest_requestId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4GetRequestInfoRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-request-info-requestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4GetRequestInfoRequest_requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-request-info-request_request-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
