/**
 * Blast4RequestBody_queueSearchType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4RequestBody_queueSearchType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4QueueSearchRequestType blast4QueueSearchRequest;

    public Blast4RequestBody_queueSearchType() {
    }

    public Blast4RequestBody_queueSearchType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4QueueSearchRequestType blast4QueueSearchRequest) {
           this.blast4QueueSearchRequest = blast4QueueSearchRequest;
    }


    /**
     * Gets the blast4QueueSearchRequest value for this Blast4RequestBody_queueSearchType.
     * 
     * @return blast4QueueSearchRequest
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4QueueSearchRequestType getBlast4QueueSearchRequest() {
        return blast4QueueSearchRequest;
    }


    /**
     * Sets the blast4QueueSearchRequest value for this Blast4RequestBody_queueSearchType.
     * 
     * @param blast4QueueSearchRequest
     */
    public void setBlast4QueueSearchRequest(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4QueueSearchRequestType blast4QueueSearchRequest) {
        this.blast4QueueSearchRequest = blast4QueueSearchRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4RequestBody_queueSearchType)) return false;
        Blast4RequestBody_queueSearchType other = (Blast4RequestBody_queueSearchType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4QueueSearchRequest==null && other.getBlast4QueueSearchRequest()==null) || 
             (this.blast4QueueSearchRequest!=null &&
              this.blast4QueueSearchRequest.equals(other.getBlast4QueueSearchRequest())));
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
        if (getBlast4QueueSearchRequest() != null) {
            _hashCode += getBlast4QueueSearchRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4RequestBody_queueSearchType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-request-body_queue-searchType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4QueueSearchRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-queue-search-request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-queue-search-requestType"));
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
