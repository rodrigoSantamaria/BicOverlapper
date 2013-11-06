/**
 * Entrez2Request_requestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2Request_requestType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.E2RequestType e2Request;

    public Entrez2Request_requestType() {
    }

    public Entrez2Request_requestType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.E2RequestType e2Request) {
           this.e2Request = e2Request;
    }


    /**
     * Gets the e2Request value for this Entrez2Request_requestType.
     * 
     * @return e2Request
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.E2RequestType getE2Request() {
        return e2Request;
    }


    /**
     * Sets the e2Request value for this Entrez2Request_requestType.
     * 
     * @param e2Request
     */
    public void setE2Request(gov.nih.nlm.ncbi.www.soap.eutils.efetch.E2RequestType e2Request) {
        this.e2Request = e2Request;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2Request_requestType)) return false;
        Entrez2Request_requestType other = (Entrez2Request_requestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.e2Request==null && other.getE2Request()==null) || 
             (this.e2Request!=null &&
              this.e2Request.equals(other.getE2Request())));
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
        if (getE2Request() != null) {
            _hashCode += getE2Request().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2Request_requestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-request_requestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("e2Request");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "E2Request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "E2RequestType"));
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
