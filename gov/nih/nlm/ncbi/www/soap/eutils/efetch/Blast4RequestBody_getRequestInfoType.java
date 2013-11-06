/**
 * Blast4RequestBody_getRequestInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4RequestBody_getRequestInfoType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetRequestInfoRequestType blast4GetRequestInfoRequest;

    public Blast4RequestBody_getRequestInfoType() {
    }

    public Blast4RequestBody_getRequestInfoType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetRequestInfoRequestType blast4GetRequestInfoRequest) {
           this.blast4GetRequestInfoRequest = blast4GetRequestInfoRequest;
    }


    /**
     * Gets the blast4GetRequestInfoRequest value for this Blast4RequestBody_getRequestInfoType.
     * 
     * @return blast4GetRequestInfoRequest
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetRequestInfoRequestType getBlast4GetRequestInfoRequest() {
        return blast4GetRequestInfoRequest;
    }


    /**
     * Sets the blast4GetRequestInfoRequest value for this Blast4RequestBody_getRequestInfoType.
     * 
     * @param blast4GetRequestInfoRequest
     */
    public void setBlast4GetRequestInfoRequest(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetRequestInfoRequestType blast4GetRequestInfoRequest) {
        this.blast4GetRequestInfoRequest = blast4GetRequestInfoRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4RequestBody_getRequestInfoType)) return false;
        Blast4RequestBody_getRequestInfoType other = (Blast4RequestBody_getRequestInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4GetRequestInfoRequest==null && other.getBlast4GetRequestInfoRequest()==null) || 
             (this.blast4GetRequestInfoRequest!=null &&
              this.blast4GetRequestInfoRequest.equals(other.getBlast4GetRequestInfoRequest())));
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
        if (getBlast4GetRequestInfoRequest() != null) {
            _hashCode += getBlast4GetRequestInfoRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4RequestBody_getRequestInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-request-body_get-request-infoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4GetRequestInfoRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-request-info-request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-request-info-requestType"));
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
