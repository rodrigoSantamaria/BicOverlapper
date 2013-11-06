/**
 * ID2ReplyGetBlobSeqIdsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2ReplyGetBlobSeqIdsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlobSeqIds_blobIdType ID2ReplyGetBlobSeqIds_blobId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlobSeqIds_idsType ID2ReplyGetBlobSeqIds_ids;

    public ID2ReplyGetBlobSeqIdsType() {
    }

    public ID2ReplyGetBlobSeqIdsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlobSeqIds_blobIdType ID2ReplyGetBlobSeqIds_blobId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlobSeqIds_idsType ID2ReplyGetBlobSeqIds_ids) {
           this.ID2ReplyGetBlobSeqIds_blobId = ID2ReplyGetBlobSeqIds_blobId;
           this.ID2ReplyGetBlobSeqIds_ids = ID2ReplyGetBlobSeqIds_ids;
    }


    /**
     * Gets the ID2ReplyGetBlobSeqIds_blobId value for this ID2ReplyGetBlobSeqIdsType.
     * 
     * @return ID2ReplyGetBlobSeqIds_blobId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlobSeqIds_blobIdType getID2ReplyGetBlobSeqIds_blobId() {
        return ID2ReplyGetBlobSeqIds_blobId;
    }


    /**
     * Sets the ID2ReplyGetBlobSeqIds_blobId value for this ID2ReplyGetBlobSeqIdsType.
     * 
     * @param ID2ReplyGetBlobSeqIds_blobId
     */
    public void setID2ReplyGetBlobSeqIds_blobId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlobSeqIds_blobIdType ID2ReplyGetBlobSeqIds_blobId) {
        this.ID2ReplyGetBlobSeqIds_blobId = ID2ReplyGetBlobSeqIds_blobId;
    }


    /**
     * Gets the ID2ReplyGetBlobSeqIds_ids value for this ID2ReplyGetBlobSeqIdsType.
     * 
     * @return ID2ReplyGetBlobSeqIds_ids
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlobSeqIds_idsType getID2ReplyGetBlobSeqIds_ids() {
        return ID2ReplyGetBlobSeqIds_ids;
    }


    /**
     * Sets the ID2ReplyGetBlobSeqIds_ids value for this ID2ReplyGetBlobSeqIdsType.
     * 
     * @param ID2ReplyGetBlobSeqIds_ids
     */
    public void setID2ReplyGetBlobSeqIds_ids(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlobSeqIds_idsType ID2ReplyGetBlobSeqIds_ids) {
        this.ID2ReplyGetBlobSeqIds_ids = ID2ReplyGetBlobSeqIds_ids;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2ReplyGetBlobSeqIdsType)) return false;
        ID2ReplyGetBlobSeqIdsType other = (ID2ReplyGetBlobSeqIdsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2ReplyGetBlobSeqIds_blobId==null && other.getID2ReplyGetBlobSeqIds_blobId()==null) || 
             (this.ID2ReplyGetBlobSeqIds_blobId!=null &&
              this.ID2ReplyGetBlobSeqIds_blobId.equals(other.getID2ReplyGetBlobSeqIds_blobId()))) &&
            ((this.ID2ReplyGetBlobSeqIds_ids==null && other.getID2ReplyGetBlobSeqIds_ids()==null) || 
             (this.ID2ReplyGetBlobSeqIds_ids!=null &&
              this.ID2ReplyGetBlobSeqIds_ids.equals(other.getID2ReplyGetBlobSeqIds_ids())));
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
        if (getID2ReplyGetBlobSeqIds_blobId() != null) {
            _hashCode += getID2ReplyGetBlobSeqIds_blobId().hashCode();
        }
        if (getID2ReplyGetBlobSeqIds_ids() != null) {
            _hashCode += getID2ReplyGetBlobSeqIds_ids().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2ReplyGetBlobSeqIdsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Blob-Seq-idsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2ReplyGetBlobSeqIds_blobId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Blob-Seq-ids_blob-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Blob-Seq-ids_blob-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2ReplyGetBlobSeqIds_ids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Blob-Seq-ids_ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Blob-Seq-ids_idsType"));
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
