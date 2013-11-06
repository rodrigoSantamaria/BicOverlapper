/**
 * Blast4QueueSearchReplyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4QueueSearchReplyType  implements java.io.Serializable {
    private java.lang.String blast4QueueSearchReply_requestId;

    public Blast4QueueSearchReplyType() {
    }

    public Blast4QueueSearchReplyType(
           java.lang.String blast4QueueSearchReply_requestId) {
           this.blast4QueueSearchReply_requestId = blast4QueueSearchReply_requestId;
    }


    /**
     * Gets the blast4QueueSearchReply_requestId value for this Blast4QueueSearchReplyType.
     * 
     * @return blast4QueueSearchReply_requestId
     */
    public java.lang.String getBlast4QueueSearchReply_requestId() {
        return blast4QueueSearchReply_requestId;
    }


    /**
     * Sets the blast4QueueSearchReply_requestId value for this Blast4QueueSearchReplyType.
     * 
     * @param blast4QueueSearchReply_requestId
     */
    public void setBlast4QueueSearchReply_requestId(java.lang.String blast4QueueSearchReply_requestId) {
        this.blast4QueueSearchReply_requestId = blast4QueueSearchReply_requestId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4QueueSearchReplyType)) return false;
        Blast4QueueSearchReplyType other = (Blast4QueueSearchReplyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4QueueSearchReply_requestId==null && other.getBlast4QueueSearchReply_requestId()==null) || 
             (this.blast4QueueSearchReply_requestId!=null &&
              this.blast4QueueSearchReply_requestId.equals(other.getBlast4QueueSearchReply_requestId())));
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
        if (getBlast4QueueSearchReply_requestId() != null) {
            _hashCode += getBlast4QueueSearchReply_requestId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4QueueSearchReplyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-queue-search-replyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4QueueSearchReply_requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-queue-search-reply_request-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
