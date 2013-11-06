/**
 * Blast4ReplyBody_getSequencesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4ReplyBody_getSequencesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSequencesReplyType blast4GetSequencesReply;

    public Blast4ReplyBody_getSequencesType() {
    }

    public Blast4ReplyBody_getSequencesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSequencesReplyType blast4GetSequencesReply) {
           this.blast4GetSequencesReply = blast4GetSequencesReply;
    }


    /**
     * Gets the blast4GetSequencesReply value for this Blast4ReplyBody_getSequencesType.
     * 
     * @return blast4GetSequencesReply
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSequencesReplyType getBlast4GetSequencesReply() {
        return blast4GetSequencesReply;
    }


    /**
     * Sets the blast4GetSequencesReply value for this Blast4ReplyBody_getSequencesType.
     * 
     * @param blast4GetSequencesReply
     */
    public void setBlast4GetSequencesReply(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSequencesReplyType blast4GetSequencesReply) {
        this.blast4GetSequencesReply = blast4GetSequencesReply;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4ReplyBody_getSequencesType)) return false;
        Blast4ReplyBody_getSequencesType other = (Blast4ReplyBody_getSequencesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4GetSequencesReply==null && other.getBlast4GetSequencesReply()==null) || 
             (this.blast4GetSequencesReply!=null &&
              this.blast4GetSequencesReply.equals(other.getBlast4GetSequencesReply())));
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
        if (getBlast4GetSequencesReply() != null) {
            _hashCode += getBlast4GetSequencesReply().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4ReplyBody_getSequencesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-reply-body_get-sequencesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4GetSequencesReply");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-sequences-reply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-sequences-replyType"));
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
