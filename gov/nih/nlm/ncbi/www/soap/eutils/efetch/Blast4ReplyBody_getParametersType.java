/**
 * Blast4ReplyBody_getParametersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4ReplyBody_getParametersType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetParametersReplyType blast4GetParametersReply;

    public Blast4ReplyBody_getParametersType() {
    }

    public Blast4ReplyBody_getParametersType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetParametersReplyType blast4GetParametersReply) {
           this.blast4GetParametersReply = blast4GetParametersReply;
    }


    /**
     * Gets the blast4GetParametersReply value for this Blast4ReplyBody_getParametersType.
     * 
     * @return blast4GetParametersReply
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetParametersReplyType getBlast4GetParametersReply() {
        return blast4GetParametersReply;
    }


    /**
     * Sets the blast4GetParametersReply value for this Blast4ReplyBody_getParametersType.
     * 
     * @param blast4GetParametersReply
     */
    public void setBlast4GetParametersReply(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetParametersReplyType blast4GetParametersReply) {
        this.blast4GetParametersReply = blast4GetParametersReply;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4ReplyBody_getParametersType)) return false;
        Blast4ReplyBody_getParametersType other = (Blast4ReplyBody_getParametersType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4GetParametersReply==null && other.getBlast4GetParametersReply()==null) || 
             (this.blast4GetParametersReply!=null &&
              this.blast4GetParametersReply.equals(other.getBlast4GetParametersReply())));
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
        if (getBlast4GetParametersReply() != null) {
            _hashCode += getBlast4GetParametersReply().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4ReplyBody_getParametersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-reply-body_get-parametersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4GetParametersReply");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-parameters-reply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-parameters-replyType"));
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
