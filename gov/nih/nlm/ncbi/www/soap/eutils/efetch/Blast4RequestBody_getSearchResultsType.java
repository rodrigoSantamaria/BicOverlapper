/**
 * Blast4RequestBody_getSearchResultsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4RequestBody_getSearchResultsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSearchResultsRequestType blast4GetSearchResultsRequest;

    public Blast4RequestBody_getSearchResultsType() {
    }

    public Blast4RequestBody_getSearchResultsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSearchResultsRequestType blast4GetSearchResultsRequest) {
           this.blast4GetSearchResultsRequest = blast4GetSearchResultsRequest;
    }


    /**
     * Gets the blast4GetSearchResultsRequest value for this Blast4RequestBody_getSearchResultsType.
     * 
     * @return blast4GetSearchResultsRequest
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSearchResultsRequestType getBlast4GetSearchResultsRequest() {
        return blast4GetSearchResultsRequest;
    }


    /**
     * Sets the blast4GetSearchResultsRequest value for this Blast4RequestBody_getSearchResultsType.
     * 
     * @param blast4GetSearchResultsRequest
     */
    public void setBlast4GetSearchResultsRequest(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSearchResultsRequestType blast4GetSearchResultsRequest) {
        this.blast4GetSearchResultsRequest = blast4GetSearchResultsRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4RequestBody_getSearchResultsType)) return false;
        Blast4RequestBody_getSearchResultsType other = (Blast4RequestBody_getSearchResultsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4GetSearchResultsRequest==null && other.getBlast4GetSearchResultsRequest()==null) || 
             (this.blast4GetSearchResultsRequest!=null &&
              this.blast4GetSearchResultsRequest.equals(other.getBlast4GetSearchResultsRequest())));
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
        if (getBlast4GetSearchResultsRequest() != null) {
            _hashCode += getBlast4GetSearchResultsRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4RequestBody_getSearchResultsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-request-body_get-search-resultsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4GetSearchResultsRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-search-results-request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-search-results-requestType"));
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
