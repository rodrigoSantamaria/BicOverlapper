/**
 * ID2RequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2RequestType  implements java.io.Serializable {
    private java.lang.String ID2Request_serialNumber;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Request_paramsType ID2Request_params;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Request_requestType ID2Request_request;

    public ID2RequestType() {
    }

    public ID2RequestType(
           java.lang.String ID2Request_serialNumber,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Request_paramsType ID2Request_params,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Request_requestType ID2Request_request) {
           this.ID2Request_serialNumber = ID2Request_serialNumber;
           this.ID2Request_params = ID2Request_params;
           this.ID2Request_request = ID2Request_request;
    }


    /**
     * Gets the ID2Request_serialNumber value for this ID2RequestType.
     * 
     * @return ID2Request_serialNumber
     */
    public java.lang.String getID2Request_serialNumber() {
        return ID2Request_serialNumber;
    }


    /**
     * Sets the ID2Request_serialNumber value for this ID2RequestType.
     * 
     * @param ID2Request_serialNumber
     */
    public void setID2Request_serialNumber(java.lang.String ID2Request_serialNumber) {
        this.ID2Request_serialNumber = ID2Request_serialNumber;
    }


    /**
     * Gets the ID2Request_params value for this ID2RequestType.
     * 
     * @return ID2Request_params
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Request_paramsType getID2Request_params() {
        return ID2Request_params;
    }


    /**
     * Sets the ID2Request_params value for this ID2RequestType.
     * 
     * @param ID2Request_params
     */
    public void setID2Request_params(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Request_paramsType ID2Request_params) {
        this.ID2Request_params = ID2Request_params;
    }


    /**
     * Gets the ID2Request_request value for this ID2RequestType.
     * 
     * @return ID2Request_request
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Request_requestType getID2Request_request() {
        return ID2Request_request;
    }


    /**
     * Sets the ID2Request_request value for this ID2RequestType.
     * 
     * @param ID2Request_request
     */
    public void setID2Request_request(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2Request_requestType ID2Request_request) {
        this.ID2Request_request = ID2Request_request;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2RequestType)) return false;
        ID2RequestType other = (ID2RequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2Request_serialNumber==null && other.getID2Request_serialNumber()==null) || 
             (this.ID2Request_serialNumber!=null &&
              this.ID2Request_serialNumber.equals(other.getID2Request_serialNumber()))) &&
            ((this.ID2Request_params==null && other.getID2Request_params()==null) || 
             (this.ID2Request_params!=null &&
              this.ID2Request_params.equals(other.getID2Request_params()))) &&
            ((this.ID2Request_request==null && other.getID2Request_request()==null) || 
             (this.ID2Request_request!=null &&
              this.ID2Request_request.equals(other.getID2Request_request())));
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
        if (getID2Request_serialNumber() != null) {
            _hashCode += getID2Request_serialNumber().hashCode();
        }
        if (getID2Request_params() != null) {
            _hashCode += getID2Request_params().hashCode();
        }
        if (getID2Request_request() != null) {
            _hashCode += getID2Request_request().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2RequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-RequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2Request_serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request_serial-number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2Request_params");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request_params"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request_paramsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2Request_request");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request_request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request_requestType"));
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
