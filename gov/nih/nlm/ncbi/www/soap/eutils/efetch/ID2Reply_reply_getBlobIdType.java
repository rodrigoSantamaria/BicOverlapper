/**
 * ID2Reply_reply_getBlobIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2Reply_reply_getBlobIdType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlobIdType ID2ReplyGetBlobId;

    public ID2Reply_reply_getBlobIdType() {
    }

    public ID2Reply_reply_getBlobIdType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlobIdType ID2ReplyGetBlobId) {
           this.ID2ReplyGetBlobId = ID2ReplyGetBlobId;
    }


    /**
     * Gets the ID2ReplyGetBlobId value for this ID2Reply_reply_getBlobIdType.
     * 
     * @return ID2ReplyGetBlobId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlobIdType getID2ReplyGetBlobId() {
        return ID2ReplyGetBlobId;
    }


    /**
     * Sets the ID2ReplyGetBlobId value for this ID2Reply_reply_getBlobIdType.
     * 
     * @param ID2ReplyGetBlobId
     */
    public void setID2ReplyGetBlobId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlobIdType ID2ReplyGetBlobId) {
        this.ID2ReplyGetBlobId = ID2ReplyGetBlobId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2Reply_reply_getBlobIdType)) return false;
        ID2Reply_reply_getBlobIdType other = (ID2Reply_reply_getBlobIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2ReplyGetBlobId==null && other.getID2ReplyGetBlobId()==null) || 
             (this.ID2ReplyGetBlobId!=null &&
              this.ID2ReplyGetBlobId.equals(other.getID2ReplyGetBlobId())));
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
        if (getID2ReplyGetBlobId() != null) {
            _hashCode += getID2ReplyGetBlobId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2Reply_reply_getBlobIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply_reply_get-blob-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2ReplyGetBlobId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Blob-Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Blob-IdType"));
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
