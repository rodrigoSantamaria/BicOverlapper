/**
 * Blast4ReplyBody_getSequencePartsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4ReplyBody_getSequencePartsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsReplyType blast4GetSeqPartsReply;

    public Blast4ReplyBody_getSequencePartsType() {
    }

    public Blast4ReplyBody_getSequencePartsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsReplyType blast4GetSeqPartsReply) {
           this.blast4GetSeqPartsReply = blast4GetSeqPartsReply;
    }


    /**
     * Gets the blast4GetSeqPartsReply value for this Blast4ReplyBody_getSequencePartsType.
     * 
     * @return blast4GetSeqPartsReply
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsReplyType getBlast4GetSeqPartsReply() {
        return blast4GetSeqPartsReply;
    }


    /**
     * Sets the blast4GetSeqPartsReply value for this Blast4ReplyBody_getSequencePartsType.
     * 
     * @param blast4GetSeqPartsReply
     */
    public void setBlast4GetSeqPartsReply(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsReplyType blast4GetSeqPartsReply) {
        this.blast4GetSeqPartsReply = blast4GetSeqPartsReply;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4ReplyBody_getSequencePartsType)) return false;
        Blast4ReplyBody_getSequencePartsType other = (Blast4ReplyBody_getSequencePartsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4GetSeqPartsReply==null && other.getBlast4GetSeqPartsReply()==null) || 
             (this.blast4GetSeqPartsReply!=null &&
              this.blast4GetSeqPartsReply.equals(other.getBlast4GetSeqPartsReply())));
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
        if (getBlast4GetSeqPartsReply() != null) {
            _hashCode += getBlast4GetSeqPartsReply().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4ReplyBody_getSequencePartsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-reply-body_get-sequence-partsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4GetSeqPartsReply");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-seq-parts-reply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-seq-parts-replyType"));
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
