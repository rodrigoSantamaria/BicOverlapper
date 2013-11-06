/**
 * ID2RequestGetBlobInfo_blobId_blobIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2RequestGetBlobInfo_blobId_blobIdType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2BlobIdType ID2BlobId;

    public ID2RequestGetBlobInfo_blobId_blobIdType() {
    }

    public ID2RequestGetBlobInfo_blobId_blobIdType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2BlobIdType ID2BlobId) {
           this.ID2BlobId = ID2BlobId;
    }


    /**
     * Gets the ID2BlobId value for this ID2RequestGetBlobInfo_blobId_blobIdType.
     * 
     * @return ID2BlobId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2BlobIdType getID2BlobId() {
        return ID2BlobId;
    }


    /**
     * Sets the ID2BlobId value for this ID2RequestGetBlobInfo_blobId_blobIdType.
     * 
     * @param ID2BlobId
     */
    public void setID2BlobId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2BlobIdType ID2BlobId) {
        this.ID2BlobId = ID2BlobId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2RequestGetBlobInfo_blobId_blobIdType)) return false;
        ID2RequestGetBlobInfo_blobId_blobIdType other = (ID2RequestGetBlobInfo_blobId_blobIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2BlobId==null && other.getID2BlobId()==null) || 
             (this.ID2BlobId!=null &&
              this.ID2BlobId.equals(other.getID2BlobId())));
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
        if (getID2BlobId() != null) {
            _hashCode += getID2BlobId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2RequestGetBlobInfo_blobId_blobIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Info_blob-id_blob-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2BlobId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Blob-Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Blob-IdType"));
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
