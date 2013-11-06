/**
 * ID2Reply_reply_getBlobSeqIdsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2Reply_reply_getBlobSeqIdsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlobSeqIdsType ID2ReplyGetBlobSeqIds;

    public ID2Reply_reply_getBlobSeqIdsType() {
    }

    public ID2Reply_reply_getBlobSeqIdsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlobSeqIdsType ID2ReplyGetBlobSeqIds) {
           this.ID2ReplyGetBlobSeqIds = ID2ReplyGetBlobSeqIds;
    }


    /**
     * Gets the ID2ReplyGetBlobSeqIds value for this ID2Reply_reply_getBlobSeqIdsType.
     * 
     * @return ID2ReplyGetBlobSeqIds
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlobSeqIdsType getID2ReplyGetBlobSeqIds() {
        return ID2ReplyGetBlobSeqIds;
    }


    /**
     * Sets the ID2ReplyGetBlobSeqIds value for this ID2Reply_reply_getBlobSeqIdsType.
     * 
     * @param ID2ReplyGetBlobSeqIds
     */
    public void setID2ReplyGetBlobSeqIds(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlobSeqIdsType ID2ReplyGetBlobSeqIds) {
        this.ID2ReplyGetBlobSeqIds = ID2ReplyGetBlobSeqIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2Reply_reply_getBlobSeqIdsType)) return false;
        ID2Reply_reply_getBlobSeqIdsType other = (ID2Reply_reply_getBlobSeqIdsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2ReplyGetBlobSeqIds==null && other.getID2ReplyGetBlobSeqIds()==null) || 
             (this.ID2ReplyGetBlobSeqIds!=null &&
              this.ID2ReplyGetBlobSeqIds.equals(other.getID2ReplyGetBlobSeqIds())));
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
        if (getID2ReplyGetBlobSeqIds() != null) {
            _hashCode += getID2ReplyGetBlobSeqIds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2Reply_reply_getBlobSeqIdsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply_reply_get-blob-seq-idsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2ReplyGetBlobSeqIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Blob-Seq-ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Blob-Seq-idsType"));
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
