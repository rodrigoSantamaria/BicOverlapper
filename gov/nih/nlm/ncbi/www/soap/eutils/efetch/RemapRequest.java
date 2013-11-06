/**
 * RemapRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RemapRequest  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RemapRequest_requestType remapRequest_request;

    private java.lang.String remapRequest_version;

    private java.lang.String remapRequest_tool;

    public RemapRequest() {
    }

    public RemapRequest(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RemapRequest_requestType remapRequest_request,
           java.lang.String remapRequest_version,
           java.lang.String remapRequest_tool) {
           this.remapRequest_request = remapRequest_request;
           this.remapRequest_version = remapRequest_version;
           this.remapRequest_tool = remapRequest_tool;
    }


    /**
     * Gets the remapRequest_request value for this RemapRequest.
     * 
     * @return remapRequest_request
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RemapRequest_requestType getRemapRequest_request() {
        return remapRequest_request;
    }


    /**
     * Sets the remapRequest_request value for this RemapRequest.
     * 
     * @param remapRequest_request
     */
    public void setRemapRequest_request(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RemapRequest_requestType remapRequest_request) {
        this.remapRequest_request = remapRequest_request;
    }


    /**
     * Gets the remapRequest_version value for this RemapRequest.
     * 
     * @return remapRequest_version
     */
    public java.lang.String getRemapRequest_version() {
        return remapRequest_version;
    }


    /**
     * Sets the remapRequest_version value for this RemapRequest.
     * 
     * @param remapRequest_version
     */
    public void setRemapRequest_version(java.lang.String remapRequest_version) {
        this.remapRequest_version = remapRequest_version;
    }


    /**
     * Gets the remapRequest_tool value for this RemapRequest.
     * 
     * @return remapRequest_tool
     */
    public java.lang.String getRemapRequest_tool() {
        return remapRequest_tool;
    }


    /**
     * Sets the remapRequest_tool value for this RemapRequest.
     * 
     * @param remapRequest_tool
     */
    public void setRemapRequest_tool(java.lang.String remapRequest_tool) {
        this.remapRequest_tool = remapRequest_tool;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemapRequest)) return false;
        RemapRequest other = (RemapRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.remapRequest_request==null && other.getRemapRequest_request()==null) || 
             (this.remapRequest_request!=null &&
              this.remapRequest_request.equals(other.getRemapRequest_request()))) &&
            ((this.remapRequest_version==null && other.getRemapRequest_version()==null) || 
             (this.remapRequest_version!=null &&
              this.remapRequest_version.equals(other.getRemapRequest_version()))) &&
            ((this.remapRequest_tool==null && other.getRemapRequest_tool()==null) || 
             (this.remapRequest_tool!=null &&
              this.remapRequest_tool.equals(other.getRemapRequest_tool())));
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
        if (getRemapRequest_request() != null) {
            _hashCode += getRemapRequest_request().hashCode();
        }
        if (getRemapRequest_version() != null) {
            _hashCode += getRemapRequest_version().hashCode();
        }
        if (getRemapRequest_tool() != null) {
            _hashCode += getRemapRequest_tool().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemapRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Remap-request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remapRequest_request");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Remap-request_request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Remap-request_requestType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remapRequest_version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Remap-request_version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remapRequest_tool");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Remap-request_tool"));
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
