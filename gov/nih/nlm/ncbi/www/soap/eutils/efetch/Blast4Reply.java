/**
 * Blast4Reply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4Reply  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Reply_errorsType blast4Reply_errors;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Reply_bodyType blast4Reply_body;

    public Blast4Reply() {
    }

    public Blast4Reply(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Reply_errorsType blast4Reply_errors,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Reply_bodyType blast4Reply_body) {
           this.blast4Reply_errors = blast4Reply_errors;
           this.blast4Reply_body = blast4Reply_body;
    }


    /**
     * Gets the blast4Reply_errors value for this Blast4Reply.
     * 
     * @return blast4Reply_errors
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Reply_errorsType getBlast4Reply_errors() {
        return blast4Reply_errors;
    }


    /**
     * Sets the blast4Reply_errors value for this Blast4Reply.
     * 
     * @param blast4Reply_errors
     */
    public void setBlast4Reply_errors(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Reply_errorsType blast4Reply_errors) {
        this.blast4Reply_errors = blast4Reply_errors;
    }


    /**
     * Gets the blast4Reply_body value for this Blast4Reply.
     * 
     * @return blast4Reply_body
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Reply_bodyType getBlast4Reply_body() {
        return blast4Reply_body;
    }


    /**
     * Sets the blast4Reply_body value for this Blast4Reply.
     * 
     * @param blast4Reply_body
     */
    public void setBlast4Reply_body(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4Reply_bodyType blast4Reply_body) {
        this.blast4Reply_body = blast4Reply_body;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4Reply)) return false;
        Blast4Reply other = (Blast4Reply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4Reply_errors==null && other.getBlast4Reply_errors()==null) || 
             (this.blast4Reply_errors!=null &&
              this.blast4Reply_errors.equals(other.getBlast4Reply_errors()))) &&
            ((this.blast4Reply_body==null && other.getBlast4Reply_body()==null) || 
             (this.blast4Reply_body!=null &&
              this.blast4Reply_body.equals(other.getBlast4Reply_body())));
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
        if (getBlast4Reply_errors() != null) {
            _hashCode += getBlast4Reply_errors().hashCode();
        }
        if (getBlast4Reply_body() != null) {
            _hashCode += getBlast4Reply_body().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4Reply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Blast4-reply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Reply_errors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-reply_errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-reply_errorsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Reply_body");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-reply_body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-reply_bodyType"));
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
