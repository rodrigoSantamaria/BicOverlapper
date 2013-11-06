/**
 * Blast4ReplyBody_finishParamsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4ReplyBody_finishParamsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4FinishParamsReplyType blast4FinishParamsReply;

    public Blast4ReplyBody_finishParamsType() {
    }

    public Blast4ReplyBody_finishParamsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4FinishParamsReplyType blast4FinishParamsReply) {
           this.blast4FinishParamsReply = blast4FinishParamsReply;
    }


    /**
     * Gets the blast4FinishParamsReply value for this Blast4ReplyBody_finishParamsType.
     * 
     * @return blast4FinishParamsReply
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4FinishParamsReplyType getBlast4FinishParamsReply() {
        return blast4FinishParamsReply;
    }


    /**
     * Sets the blast4FinishParamsReply value for this Blast4ReplyBody_finishParamsType.
     * 
     * @param blast4FinishParamsReply
     */
    public void setBlast4FinishParamsReply(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4FinishParamsReplyType blast4FinishParamsReply) {
        this.blast4FinishParamsReply = blast4FinishParamsReply;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4ReplyBody_finishParamsType)) return false;
        Blast4ReplyBody_finishParamsType other = (Blast4ReplyBody_finishParamsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4FinishParamsReply==null && other.getBlast4FinishParamsReply()==null) || 
             (this.blast4FinishParamsReply!=null &&
              this.blast4FinishParamsReply.equals(other.getBlast4FinishParamsReply())));
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
        if (getBlast4FinishParamsReply() != null) {
            _hashCode += getBlast4FinishParamsReply().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4ReplyBody_finishParamsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-reply-body_finish-paramsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4FinishParamsReply");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-finish-params-reply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-finish-params-replyType"));
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
