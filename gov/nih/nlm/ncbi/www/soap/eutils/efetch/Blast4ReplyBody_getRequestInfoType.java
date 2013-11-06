/**
 * Blast4ReplyBody_getRequestInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4ReplyBody_getRequestInfoType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetRequestInfoReplyType blast4GetRequestInfoReply;

    public Blast4ReplyBody_getRequestInfoType() {
    }

    public Blast4ReplyBody_getRequestInfoType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetRequestInfoReplyType blast4GetRequestInfoReply) {
           this.blast4GetRequestInfoReply = blast4GetRequestInfoReply;
    }


    /**
     * Gets the blast4GetRequestInfoReply value for this Blast4ReplyBody_getRequestInfoType.
     * 
     * @return blast4GetRequestInfoReply
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetRequestInfoReplyType getBlast4GetRequestInfoReply() {
        return blast4GetRequestInfoReply;
    }


    /**
     * Sets the blast4GetRequestInfoReply value for this Blast4ReplyBody_getRequestInfoType.
     * 
     * @param blast4GetRequestInfoReply
     */
    public void setBlast4GetRequestInfoReply(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetRequestInfoReplyType blast4GetRequestInfoReply) {
        this.blast4GetRequestInfoReply = blast4GetRequestInfoReply;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4ReplyBody_getRequestInfoType)) return false;
        Blast4ReplyBody_getRequestInfoType other = (Blast4ReplyBody_getRequestInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4GetRequestInfoReply==null && other.getBlast4GetRequestInfoReply()==null) || 
             (this.blast4GetRequestInfoReply!=null &&
              this.blast4GetRequestInfoReply.equals(other.getBlast4GetRequestInfoReply())));
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
        if (getBlast4GetRequestInfoReply() != null) {
            _hashCode += getBlast4GetRequestInfoReply().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4ReplyBody_getRequestInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-reply-body_get-request-infoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4GetRequestInfoReply");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-request-info-reply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-request-info-replyType"));
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
