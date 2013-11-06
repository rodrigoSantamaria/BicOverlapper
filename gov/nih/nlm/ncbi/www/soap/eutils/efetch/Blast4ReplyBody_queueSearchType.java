/**
 * Blast4ReplyBody_queueSearchType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4ReplyBody_queueSearchType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4QueueSearchReplyType blast4QueueSearchReply;

    public Blast4ReplyBody_queueSearchType() {
    }

    public Blast4ReplyBody_queueSearchType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4QueueSearchReplyType blast4QueueSearchReply) {
           this.blast4QueueSearchReply = blast4QueueSearchReply;
    }


    /**
     * Gets the blast4QueueSearchReply value for this Blast4ReplyBody_queueSearchType.
     * 
     * @return blast4QueueSearchReply
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4QueueSearchReplyType getBlast4QueueSearchReply() {
        return blast4QueueSearchReply;
    }


    /**
     * Sets the blast4QueueSearchReply value for this Blast4ReplyBody_queueSearchType.
     * 
     * @param blast4QueueSearchReply
     */
    public void setBlast4QueueSearchReply(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4QueueSearchReplyType blast4QueueSearchReply) {
        this.blast4QueueSearchReply = blast4QueueSearchReply;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4ReplyBody_queueSearchType)) return false;
        Blast4ReplyBody_queueSearchType other = (Blast4ReplyBody_queueSearchType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4QueueSearchReply==null && other.getBlast4QueueSearchReply()==null) || 
             (this.blast4QueueSearchReply!=null &&
              this.blast4QueueSearchReply.equals(other.getBlast4QueueSearchReply())));
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
        if (getBlast4QueueSearchReply() != null) {
            _hashCode += getBlast4QueueSearchReply().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4ReplyBody_queueSearchType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-reply-body_queue-searchType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4QueueSearchReply");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-queue-search-reply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-queue-search-replyType"));
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
