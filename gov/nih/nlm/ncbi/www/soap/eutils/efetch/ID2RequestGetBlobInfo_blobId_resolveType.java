/**
 * ID2RequestGetBlobInfo_blobId_resolveType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2RequestGetBlobInfo_blobId_resolveType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_blobId_resolve_requestType ID2RequestGetBlobInfo_blobId_resolve_request;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_blobId_resolve_excludeBlobsType ID2RequestGetBlobInfo_blobId_resolve_excludeBlobs;

    public ID2RequestGetBlobInfo_blobId_resolveType() {
    }

    public ID2RequestGetBlobInfo_blobId_resolveType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_blobId_resolve_requestType ID2RequestGetBlobInfo_blobId_resolve_request,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_blobId_resolve_excludeBlobsType ID2RequestGetBlobInfo_blobId_resolve_excludeBlobs) {
           this.ID2RequestGetBlobInfo_blobId_resolve_request = ID2RequestGetBlobInfo_blobId_resolve_request;
           this.ID2RequestGetBlobInfo_blobId_resolve_excludeBlobs = ID2RequestGetBlobInfo_blobId_resolve_excludeBlobs;
    }


    /**
     * Gets the ID2RequestGetBlobInfo_blobId_resolve_request value for this ID2RequestGetBlobInfo_blobId_resolveType.
     * 
     * @return ID2RequestGetBlobInfo_blobId_resolve_request
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_blobId_resolve_requestType getID2RequestGetBlobInfo_blobId_resolve_request() {
        return ID2RequestGetBlobInfo_blobId_resolve_request;
    }


    /**
     * Sets the ID2RequestGetBlobInfo_blobId_resolve_request value for this ID2RequestGetBlobInfo_blobId_resolveType.
     * 
     * @param ID2RequestGetBlobInfo_blobId_resolve_request
     */
    public void setID2RequestGetBlobInfo_blobId_resolve_request(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_blobId_resolve_requestType ID2RequestGetBlobInfo_blobId_resolve_request) {
        this.ID2RequestGetBlobInfo_blobId_resolve_request = ID2RequestGetBlobInfo_blobId_resolve_request;
    }


    /**
     * Gets the ID2RequestGetBlobInfo_blobId_resolve_excludeBlobs value for this ID2RequestGetBlobInfo_blobId_resolveType.
     * 
     * @return ID2RequestGetBlobInfo_blobId_resolve_excludeBlobs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_blobId_resolve_excludeBlobsType getID2RequestGetBlobInfo_blobId_resolve_excludeBlobs() {
        return ID2RequestGetBlobInfo_blobId_resolve_excludeBlobs;
    }


    /**
     * Sets the ID2RequestGetBlobInfo_blobId_resolve_excludeBlobs value for this ID2RequestGetBlobInfo_blobId_resolveType.
     * 
     * @param ID2RequestGetBlobInfo_blobId_resolve_excludeBlobs
     */
    public void setID2RequestGetBlobInfo_blobId_resolve_excludeBlobs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_blobId_resolve_excludeBlobsType ID2RequestGetBlobInfo_blobId_resolve_excludeBlobs) {
        this.ID2RequestGetBlobInfo_blobId_resolve_excludeBlobs = ID2RequestGetBlobInfo_blobId_resolve_excludeBlobs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2RequestGetBlobInfo_blobId_resolveType)) return false;
        ID2RequestGetBlobInfo_blobId_resolveType other = (ID2RequestGetBlobInfo_blobId_resolveType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2RequestGetBlobInfo_blobId_resolve_request==null && other.getID2RequestGetBlobInfo_blobId_resolve_request()==null) || 
             (this.ID2RequestGetBlobInfo_blobId_resolve_request!=null &&
              this.ID2RequestGetBlobInfo_blobId_resolve_request.equals(other.getID2RequestGetBlobInfo_blobId_resolve_request()))) &&
            ((this.ID2RequestGetBlobInfo_blobId_resolve_excludeBlobs==null && other.getID2RequestGetBlobInfo_blobId_resolve_excludeBlobs()==null) || 
             (this.ID2RequestGetBlobInfo_blobId_resolve_excludeBlobs!=null &&
              this.ID2RequestGetBlobInfo_blobId_resolve_excludeBlobs.equals(other.getID2RequestGetBlobInfo_blobId_resolve_excludeBlobs())));
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
        if (getID2RequestGetBlobInfo_blobId_resolve_request() != null) {
            _hashCode += getID2RequestGetBlobInfo_blobId_resolve_request().hashCode();
        }
        if (getID2RequestGetBlobInfo_blobId_resolve_excludeBlobs() != null) {
            _hashCode += getID2RequestGetBlobInfo_blobId_resolve_excludeBlobs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2RequestGetBlobInfo_blobId_resolveType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Info_blob-id_resolveType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2RequestGetBlobInfo_blobId_resolve_request");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Info_blob-id_resolve_request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Info_blob-id_resolve_requestType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2RequestGetBlobInfo_blobId_resolve_excludeBlobs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Info_blob-id_resolve_exclude-blobs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Info_blob-id_resolve_exclude-blobsType"));
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
