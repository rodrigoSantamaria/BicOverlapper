/**
 * ID2SReplyGetChunkType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SReplyGetChunkType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetChunk_blobIdType ID2SReplyGetChunk_blobId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetChunk_chunkIdType ID2SReplyGetChunk_chunkId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetChunk_dataType ID2SReplyGetChunk_data;

    public ID2SReplyGetChunkType() {
    }

    public ID2SReplyGetChunkType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetChunk_blobIdType ID2SReplyGetChunk_blobId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetChunk_chunkIdType ID2SReplyGetChunk_chunkId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetChunk_dataType ID2SReplyGetChunk_data) {
           this.ID2SReplyGetChunk_blobId = ID2SReplyGetChunk_blobId;
           this.ID2SReplyGetChunk_chunkId = ID2SReplyGetChunk_chunkId;
           this.ID2SReplyGetChunk_data = ID2SReplyGetChunk_data;
    }


    /**
     * Gets the ID2SReplyGetChunk_blobId value for this ID2SReplyGetChunkType.
     * 
     * @return ID2SReplyGetChunk_blobId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetChunk_blobIdType getID2SReplyGetChunk_blobId() {
        return ID2SReplyGetChunk_blobId;
    }


    /**
     * Sets the ID2SReplyGetChunk_blobId value for this ID2SReplyGetChunkType.
     * 
     * @param ID2SReplyGetChunk_blobId
     */
    public void setID2SReplyGetChunk_blobId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetChunk_blobIdType ID2SReplyGetChunk_blobId) {
        this.ID2SReplyGetChunk_blobId = ID2SReplyGetChunk_blobId;
    }


    /**
     * Gets the ID2SReplyGetChunk_chunkId value for this ID2SReplyGetChunkType.
     * 
     * @return ID2SReplyGetChunk_chunkId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetChunk_chunkIdType getID2SReplyGetChunk_chunkId() {
        return ID2SReplyGetChunk_chunkId;
    }


    /**
     * Sets the ID2SReplyGetChunk_chunkId value for this ID2SReplyGetChunkType.
     * 
     * @param ID2SReplyGetChunk_chunkId
     */
    public void setID2SReplyGetChunk_chunkId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetChunk_chunkIdType ID2SReplyGetChunk_chunkId) {
        this.ID2SReplyGetChunk_chunkId = ID2SReplyGetChunk_chunkId;
    }


    /**
     * Gets the ID2SReplyGetChunk_data value for this ID2SReplyGetChunkType.
     * 
     * @return ID2SReplyGetChunk_data
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetChunk_dataType getID2SReplyGetChunk_data() {
        return ID2SReplyGetChunk_data;
    }


    /**
     * Sets the ID2SReplyGetChunk_data value for this ID2SReplyGetChunkType.
     * 
     * @param ID2SReplyGetChunk_data
     */
    public void setID2SReplyGetChunk_data(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetChunk_dataType ID2SReplyGetChunk_data) {
        this.ID2SReplyGetChunk_data = ID2SReplyGetChunk_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SReplyGetChunkType)) return false;
        ID2SReplyGetChunkType other = (ID2SReplyGetChunkType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SReplyGetChunk_blobId==null && other.getID2SReplyGetChunk_blobId()==null) || 
             (this.ID2SReplyGetChunk_blobId!=null &&
              this.ID2SReplyGetChunk_blobId.equals(other.getID2SReplyGetChunk_blobId()))) &&
            ((this.ID2SReplyGetChunk_chunkId==null && other.getID2SReplyGetChunk_chunkId()==null) || 
             (this.ID2SReplyGetChunk_chunkId!=null &&
              this.ID2SReplyGetChunk_chunkId.equals(other.getID2SReplyGetChunk_chunkId()))) &&
            ((this.ID2SReplyGetChunk_data==null && other.getID2SReplyGetChunk_data()==null) || 
             (this.ID2SReplyGetChunk_data!=null &&
              this.ID2SReplyGetChunk_data.equals(other.getID2SReplyGetChunk_data())));
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
        if (getID2SReplyGetChunk_blobId() != null) {
            _hashCode += getID2SReplyGetChunk_blobId().hashCode();
        }
        if (getID2SReplyGetChunk_chunkId() != null) {
            _hashCode += getID2SReplyGetChunk_chunkId().hashCode();
        }
        if (getID2SReplyGetChunk_data() != null) {
            _hashCode += getID2SReplyGetChunk_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SReplyGetChunkType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Reply-Get-ChunkType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SReplyGetChunk_blobId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Reply-Get-Chunk_blob-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Reply-Get-Chunk_blob-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SReplyGetChunk_chunkId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Reply-Get-Chunk_chunk-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Reply-Get-Chunk_chunk-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SReplyGetChunk_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Reply-Get-Chunk_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Reply-Get-Chunk_dataType"));
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
