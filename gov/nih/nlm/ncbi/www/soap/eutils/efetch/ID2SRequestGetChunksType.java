/**
 * ID2SRequestGetChunksType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SRequestGetChunksType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SRequestGetChunks_blobIdType ID2SRequestGetChunks_blobId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SRequestGetChunks_chunksType ID2SRequestGetChunks_chunks;

    private java.lang.String ID2SRequestGetChunks_splitVersion;

    public ID2SRequestGetChunksType() {
    }

    public ID2SRequestGetChunksType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SRequestGetChunks_blobIdType ID2SRequestGetChunks_blobId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SRequestGetChunks_chunksType ID2SRequestGetChunks_chunks,
           java.lang.String ID2SRequestGetChunks_splitVersion) {
           this.ID2SRequestGetChunks_blobId = ID2SRequestGetChunks_blobId;
           this.ID2SRequestGetChunks_chunks = ID2SRequestGetChunks_chunks;
           this.ID2SRequestGetChunks_splitVersion = ID2SRequestGetChunks_splitVersion;
    }


    /**
     * Gets the ID2SRequestGetChunks_blobId value for this ID2SRequestGetChunksType.
     * 
     * @return ID2SRequestGetChunks_blobId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SRequestGetChunks_blobIdType getID2SRequestGetChunks_blobId() {
        return ID2SRequestGetChunks_blobId;
    }


    /**
     * Sets the ID2SRequestGetChunks_blobId value for this ID2SRequestGetChunksType.
     * 
     * @param ID2SRequestGetChunks_blobId
     */
    public void setID2SRequestGetChunks_blobId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SRequestGetChunks_blobIdType ID2SRequestGetChunks_blobId) {
        this.ID2SRequestGetChunks_blobId = ID2SRequestGetChunks_blobId;
    }


    /**
     * Gets the ID2SRequestGetChunks_chunks value for this ID2SRequestGetChunksType.
     * 
     * @return ID2SRequestGetChunks_chunks
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SRequestGetChunks_chunksType getID2SRequestGetChunks_chunks() {
        return ID2SRequestGetChunks_chunks;
    }


    /**
     * Sets the ID2SRequestGetChunks_chunks value for this ID2SRequestGetChunksType.
     * 
     * @param ID2SRequestGetChunks_chunks
     */
    public void setID2SRequestGetChunks_chunks(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SRequestGetChunks_chunksType ID2SRequestGetChunks_chunks) {
        this.ID2SRequestGetChunks_chunks = ID2SRequestGetChunks_chunks;
    }


    /**
     * Gets the ID2SRequestGetChunks_splitVersion value for this ID2SRequestGetChunksType.
     * 
     * @return ID2SRequestGetChunks_splitVersion
     */
    public java.lang.String getID2SRequestGetChunks_splitVersion() {
        return ID2SRequestGetChunks_splitVersion;
    }


    /**
     * Sets the ID2SRequestGetChunks_splitVersion value for this ID2SRequestGetChunksType.
     * 
     * @param ID2SRequestGetChunks_splitVersion
     */
    public void setID2SRequestGetChunks_splitVersion(java.lang.String ID2SRequestGetChunks_splitVersion) {
        this.ID2SRequestGetChunks_splitVersion = ID2SRequestGetChunks_splitVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SRequestGetChunksType)) return false;
        ID2SRequestGetChunksType other = (ID2SRequestGetChunksType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SRequestGetChunks_blobId==null && other.getID2SRequestGetChunks_blobId()==null) || 
             (this.ID2SRequestGetChunks_blobId!=null &&
              this.ID2SRequestGetChunks_blobId.equals(other.getID2SRequestGetChunks_blobId()))) &&
            ((this.ID2SRequestGetChunks_chunks==null && other.getID2SRequestGetChunks_chunks()==null) || 
             (this.ID2SRequestGetChunks_chunks!=null &&
              this.ID2SRequestGetChunks_chunks.equals(other.getID2SRequestGetChunks_chunks()))) &&
            ((this.ID2SRequestGetChunks_splitVersion==null && other.getID2SRequestGetChunks_splitVersion()==null) || 
             (this.ID2SRequestGetChunks_splitVersion!=null &&
              this.ID2SRequestGetChunks_splitVersion.equals(other.getID2SRequestGetChunks_splitVersion())));
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
        if (getID2SRequestGetChunks_blobId() != null) {
            _hashCode += getID2SRequestGetChunks_blobId().hashCode();
        }
        if (getID2SRequestGetChunks_chunks() != null) {
            _hashCode += getID2SRequestGetChunks_chunks().hashCode();
        }
        if (getID2SRequestGetChunks_splitVersion() != null) {
            _hashCode += getID2SRequestGetChunks_splitVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SRequestGetChunksType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Request-Get-ChunksType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SRequestGetChunks_blobId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Request-Get-Chunks_blob-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Request-Get-Chunks_blob-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SRequestGetChunks_chunks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Request-Get-Chunks_chunks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Request-Get-Chunks_chunksType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SRequestGetChunks_splitVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Request-Get-Chunks_split-version"));
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
