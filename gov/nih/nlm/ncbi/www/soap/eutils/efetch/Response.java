/**
 * Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Response  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Front front;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Body body;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Back back;

    private java.lang.String responseType;  // attribute

    public Response() {
    }

    public Response(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Front front,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Body body,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Back back,
           java.lang.String responseType) {
           this.front = front;
           this.body = body;
           this.back = back;
           this.responseType = responseType;
    }


    /**
     * Gets the front value for this Response.
     * 
     * @return front
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Front getFront() {
        return front;
    }


    /**
     * Sets the front value for this Response.
     * 
     * @param front
     */
    public void setFront(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Front front) {
        this.front = front;
    }


    /**
     * Gets the body value for this Response.
     * 
     * @return body
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Body getBody() {
        return body;
    }


    /**
     * Sets the body value for this Response.
     * 
     * @param body
     */
    public void setBody(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Body body) {
        this.body = body;
    }


    /**
     * Gets the back value for this Response.
     * 
     * @return back
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Back getBack() {
        return back;
    }


    /**
     * Sets the back value for this Response.
     * 
     * @param back
     */
    public void setBack(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Back back) {
        this.back = back;
    }


    /**
     * Gets the responseType value for this Response.
     * 
     * @return responseType
     */
    public java.lang.String getResponseType() {
        return responseType;
    }


    /**
     * Sets the responseType value for this Response.
     * 
     * @param responseType
     */
    public void setResponseType(java.lang.String responseType) {
        this.responseType = responseType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Response)) return false;
        Response other = (Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.front==null && other.getFront()==null) || 
             (this.front!=null &&
              this.front.equals(other.getFront()))) &&
            ((this.body==null && other.getBody()==null) || 
             (this.body!=null &&
              this.body.equals(other.getBody()))) &&
            ((this.back==null && other.getBack()==null) || 
             (this.back!=null &&
              this.back.equals(other.getBack()))) &&
            ((this.responseType==null && other.getResponseType()==null) || 
             (this.responseType!=null &&
              this.responseType.equals(other.getResponseType())));
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
        if (getFront() != null) {
            _hashCode += getFront().hashCode();
        }
        if (getBody() != null) {
            _hashCode += getBody().hashCode();
        }
        if (getBack() != null) {
            _hashCode += getBack().hashCode();
        }
        if (getResponseType() != null) {
            _hashCode += getResponseType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">response"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("responseType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "response-type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("front");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "front"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">front"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">body"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("back");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "back"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">back"));
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
