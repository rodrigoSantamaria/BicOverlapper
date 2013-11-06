/**
 * MSSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSSearch  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearch_requestType MSSearch_request;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearch_responseType MSSearch_response;

    public MSSearch() {
    }

    public MSSearch(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearch_requestType MSSearch_request,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearch_responseType MSSearch_response) {
           this.MSSearch_request = MSSearch_request;
           this.MSSearch_response = MSSearch_response;
    }


    /**
     * Gets the MSSearch_request value for this MSSearch.
     * 
     * @return MSSearch_request
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearch_requestType getMSSearch_request() {
        return MSSearch_request;
    }


    /**
     * Sets the MSSearch_request value for this MSSearch.
     * 
     * @param MSSearch_request
     */
    public void setMSSearch_request(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearch_requestType MSSearch_request) {
        this.MSSearch_request = MSSearch_request;
    }


    /**
     * Gets the MSSearch_response value for this MSSearch.
     * 
     * @return MSSearch_response
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearch_responseType getMSSearch_response() {
        return MSSearch_response;
    }


    /**
     * Sets the MSSearch_response value for this MSSearch.
     * 
     * @param MSSearch_response
     */
    public void setMSSearch_response(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSSearch_responseType MSSearch_response) {
        this.MSSearch_response = MSSearch_response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSSearch)) return false;
        MSSearch other = (MSSearch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSSearch_request==null && other.getMSSearch_request()==null) || 
             (this.MSSearch_request!=null &&
              this.MSSearch_request.equals(other.getMSSearch_request()))) &&
            ((this.MSSearch_response==null && other.getMSSearch_response()==null) || 
             (this.MSSearch_response!=null &&
              this.MSSearch_response.equals(other.getMSSearch_response())));
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
        if (getMSSearch_request() != null) {
            _hashCode += getMSSearch_request().hashCode();
        }
        if (getMSSearch_response() != null) {
            _hashCode += getMSSearch_response().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MSSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">MSSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearch_request");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearch_request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearch_requestType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSSearch_response");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearch_response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearch_responseType"));
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
