/**
 * ID2RequestGetBlobInfo_blobIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2RequestGetBlobInfo_blobIdType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_blobId_blobIdType ID2RequestGetBlobInfo_blobId_blobId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_blobId_resolveType ID2RequestGetBlobInfo_blobId_resolve;

    public ID2RequestGetBlobInfo_blobIdType() {
    }

    public ID2RequestGetBlobInfo_blobIdType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_blobId_blobIdType ID2RequestGetBlobInfo_blobId_blobId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_blobId_resolveType ID2RequestGetBlobInfo_blobId_resolve) {
           this.ID2RequestGetBlobInfo_blobId_blobId = ID2RequestGetBlobInfo_blobId_blobId;
           this.ID2RequestGetBlobInfo_blobId_resolve = ID2RequestGetBlobInfo_blobId_resolve;
    }


    /**
     * Gets the ID2RequestGetBlobInfo_blobId_blobId value for this ID2RequestGetBlobInfo_blobIdType.
     * 
     * @return ID2RequestGetBlobInfo_blobId_blobId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_blobId_blobIdType getID2RequestGetBlobInfo_blobId_blobId() {
        return ID2RequestGetBlobInfo_blobId_blobId;
    }


    /**
     * Sets the ID2RequestGetBlobInfo_blobId_blobId value for this ID2RequestGetBlobInfo_blobIdType.
     * 
     * @param ID2RequestGetBlobInfo_blobId_blobId
     */
    public void setID2RequestGetBlobInfo_blobId_blobId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_blobId_blobIdType ID2RequestGetBlobInfo_blobId_blobId) {
        this.ID2RequestGetBlobInfo_blobId_blobId = ID2RequestGetBlobInfo_blobId_blobId;
    }


    /**
     * Gets the ID2RequestGetBlobInfo_blobId_resolve value for this ID2RequestGetBlobInfo_blobIdType.
     * 
     * @return ID2RequestGetBlobInfo_blobId_resolve
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_blobId_resolveType getID2RequestGetBlobInfo_blobId_resolve() {
        return ID2RequestGetBlobInfo_blobId_resolve;
    }


    /**
     * Sets the ID2RequestGetBlobInfo_blobId_resolve value for this ID2RequestGetBlobInfo_blobIdType.
     * 
     * @param ID2RequestGetBlobInfo_blobId_resolve
     */
    public void setID2RequestGetBlobInfo_blobId_resolve(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_blobId_resolveType ID2RequestGetBlobInfo_blobId_resolve) {
        this.ID2RequestGetBlobInfo_blobId_resolve = ID2RequestGetBlobInfo_blobId_resolve;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2RequestGetBlobInfo_blobIdType)) return false;
        ID2RequestGetBlobInfo_blobIdType other = (ID2RequestGetBlobInfo_blobIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2RequestGetBlobInfo_blobId_blobId==null && other.getID2RequestGetBlobInfo_blobId_blobId()==null) || 
             (this.ID2RequestGetBlobInfo_blobId_blobId!=null &&
              this.ID2RequestGetBlobInfo_blobId_blobId.equals(other.getID2RequestGetBlobInfo_blobId_blobId()))) &&
            ((this.ID2RequestGetBlobInfo_blobId_resolve==null && other.getID2RequestGetBlobInfo_blobId_resolve()==null) || 
             (this.ID2RequestGetBlobInfo_blobId_resolve!=null &&
              this.ID2RequestGetBlobInfo_blobId_resolve.equals(other.getID2RequestGetBlobInfo_blobId_resolve())));
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
        if (getID2RequestGetBlobInfo_blobId_blobId() != null) {
            _hashCode += getID2RequestGetBlobInfo_blobId_blobId().hashCode();
        }
        if (getID2RequestGetBlobInfo_blobId_resolve() != null) {
            _hashCode += getID2RequestGetBlobInfo_blobId_resolve().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2RequestGetBlobInfo_blobIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Info_blob-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2RequestGetBlobInfo_blobId_blobId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Info_blob-id_blob-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Info_blob-id_blob-idType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2RequestGetBlobInfo_blobId_resolve");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Info_blob-id_resolve"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Info_blob-id_resolveType"));
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
