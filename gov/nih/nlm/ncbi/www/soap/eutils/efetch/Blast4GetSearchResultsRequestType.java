/**
 * Blast4GetSearchResultsRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4GetSearchResultsRequestType  implements java.io.Serializable {
    private java.lang.String blast4GetSearchResultsRequest_requestId;

    public Blast4GetSearchResultsRequestType() {
    }

    public Blast4GetSearchResultsRequestType(
           java.lang.String blast4GetSearchResultsRequest_requestId) {
           this.blast4GetSearchResultsRequest_requestId = blast4GetSearchResultsRequest_requestId;
    }


    /**
     * Gets the blast4GetSearchResultsRequest_requestId value for this Blast4GetSearchResultsRequestType.
     * 
     * @return blast4GetSearchResultsRequest_requestId
     */
    public java.lang.String getBlast4GetSearchResultsRequest_requestId() {
        return blast4GetSearchResultsRequest_requestId;
    }


    /**
     * Sets the blast4GetSearchResultsRequest_requestId value for this Blast4GetSearchResultsRequestType.
     * 
     * @param blast4GetSearchResultsRequest_requestId
     */
    public void setBlast4GetSearchResultsRequest_requestId(java.lang.String blast4GetSearchResultsRequest_requestId) {
        this.blast4GetSearchResultsRequest_requestId = blast4GetSearchResultsRequest_requestId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4GetSearchResultsRequestType)) return false;
        Blast4GetSearchResultsRequestType other = (Blast4GetSearchResultsRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4GetSearchResultsRequest_requestId==null && other.getBlast4GetSearchResultsRequest_requestId()==null) || 
             (this.blast4GetSearchResultsRequest_requestId!=null &&
              this.blast4GetSearchResultsRequest_requestId.equals(other.getBlast4GetSearchResultsRequest_requestId())));
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
        if (getBlast4GetSearchResultsRequest_requestId() != null) {
            _hashCode += getBlast4GetSearchResultsRequest_requestId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4GetSearchResultsRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-search-results-requestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4GetSearchResultsRequest_requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-search-results-request_request-id"));
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
