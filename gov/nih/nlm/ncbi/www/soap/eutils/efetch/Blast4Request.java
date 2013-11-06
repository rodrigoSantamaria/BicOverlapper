/**
 * Blast4Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4Request  implements java.io.Serializable {
    private java.lang.String blast4Request_ident;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Request_bodyType blast4Request_body;

    public Blast4Request() {
    }

    public Blast4Request(
           java.lang.String blast4Request_ident,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Request_bodyType blast4Request_body) {
           this.blast4Request_ident = blast4Request_ident;
           this.blast4Request_body = blast4Request_body;
    }


    /**
     * Gets the blast4Request_ident value for this Blast4Request.
     * 
     * @return blast4Request_ident
     */
    public java.lang.String getBlast4Request_ident() {
        return blast4Request_ident;
    }


    /**
     * Sets the blast4Request_ident value for this Blast4Request.
     * 
     * @param blast4Request_ident
     */
    public void setBlast4Request_ident(java.lang.String blast4Request_ident) {
        this.blast4Request_ident = blast4Request_ident;
    }


    /**
     * Gets the blast4Request_body value for this Blast4Request.
     * 
     * @return blast4Request_body
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Request_bodyType getBlast4Request_body() {
        return blast4Request_body;
    }


    /**
     * Sets the blast4Request_body value for this Blast4Request.
     * 
     * @param blast4Request_body
     */
    public void setBlast4Request_body(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Request_bodyType blast4Request_body) {
        this.blast4Request_body = blast4Request_body;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4Request)) return false;
        Blast4Request other = (Blast4Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4Request_ident==null && other.getBlast4Request_ident()==null) || 
             (this.blast4Request_ident!=null &&
              this.blast4Request_ident.equals(other.getBlast4Request_ident()))) &&
            ((this.blast4Request_body==null && other.getBlast4Request_body()==null) || 
             (this.blast4Request_body!=null &&
              this.blast4Request_body.equals(other.getBlast4Request_body())));
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
        if (getBlast4Request_ident() != null) {
            _hashCode += getBlast4Request_ident().hashCode();
        }
        if (getBlast4Request_body() != null) {
            _hashCode += getBlast4Request_body().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4Request.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Blast4-request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Request_ident");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-request_ident"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Request_body");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-request_body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-request_bodyType"));
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
