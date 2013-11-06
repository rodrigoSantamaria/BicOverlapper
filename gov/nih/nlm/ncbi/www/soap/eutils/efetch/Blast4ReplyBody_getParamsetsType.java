/**
 * Blast4ReplyBody_getParamsetsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4ReplyBody_getParamsetsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetParamsetsReplyType blast4GetParamsetsReply;

    public Blast4ReplyBody_getParamsetsType() {
    }

    public Blast4ReplyBody_getParamsetsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetParamsetsReplyType blast4GetParamsetsReply) {
           this.blast4GetParamsetsReply = blast4GetParamsetsReply;
    }


    /**
     * Gets the blast4GetParamsetsReply value for this Blast4ReplyBody_getParamsetsType.
     * 
     * @return blast4GetParamsetsReply
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetParamsetsReplyType getBlast4GetParamsetsReply() {
        return blast4GetParamsetsReply;
    }


    /**
     * Sets the blast4GetParamsetsReply value for this Blast4ReplyBody_getParamsetsType.
     * 
     * @param blast4GetParamsetsReply
     */
    public void setBlast4GetParamsetsReply(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetParamsetsReplyType blast4GetParamsetsReply) {
        this.blast4GetParamsetsReply = blast4GetParamsetsReply;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4ReplyBody_getParamsetsType)) return false;
        Blast4ReplyBody_getParamsetsType other = (Blast4ReplyBody_getParamsetsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4GetParamsetsReply==null && other.getBlast4GetParamsetsReply()==null) || 
             (this.blast4GetParamsetsReply!=null &&
              this.blast4GetParamsetsReply.equals(other.getBlast4GetParamsetsReply())));
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
        if (getBlast4GetParamsetsReply() != null) {
            _hashCode += getBlast4GetParamsetsReply().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4ReplyBody_getParamsetsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-reply-body_get-paramsetsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4GetParamsetsReply");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-paramsets-reply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-paramsets-replyType"));
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
