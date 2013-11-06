/**
 * ID2Reply_reply_getChunkType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2Reply_reply_getChunkType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetChunkType ID2SReplyGetChunk;

    public ID2Reply_reply_getChunkType() {
    }

    public ID2Reply_reply_getChunkType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetChunkType ID2SReplyGetChunk) {
           this.ID2SReplyGetChunk = ID2SReplyGetChunk;
    }


    /**
     * Gets the ID2SReplyGetChunk value for this ID2Reply_reply_getChunkType.
     * 
     * @return ID2SReplyGetChunk
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetChunkType getID2SReplyGetChunk() {
        return ID2SReplyGetChunk;
    }


    /**
     * Sets the ID2SReplyGetChunk value for this ID2Reply_reply_getChunkType.
     * 
     * @param ID2SReplyGetChunk
     */
    public void setID2SReplyGetChunk(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetChunkType ID2SReplyGetChunk) {
        this.ID2SReplyGetChunk = ID2SReplyGetChunk;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2Reply_reply_getChunkType)) return false;
        ID2Reply_reply_getChunkType other = (ID2Reply_reply_getChunkType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SReplyGetChunk==null && other.getID2SReplyGetChunk()==null) || 
             (this.ID2SReplyGetChunk!=null &&
              this.ID2SReplyGetChunk.equals(other.getID2SReplyGetChunk())));
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
        if (getID2SReplyGetChunk() != null) {
            _hashCode += getID2SReplyGetChunk().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2Reply_reply_getChunkType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply_reply_get-chunkType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SReplyGetChunk");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Reply-Get-Chunk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Reply-Get-ChunkType"));
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
