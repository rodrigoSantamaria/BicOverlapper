/**
 * ID2RequestGetBlobInfo_blobId_resolve_requestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2RequestGetBlobInfo_blobId_resolve_requestType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobIdType ID2RequestGetBlobId;

    public ID2RequestGetBlobInfo_blobId_resolve_requestType() {
    }

    public ID2RequestGetBlobInfo_blobId_resolve_requestType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobIdType ID2RequestGetBlobId) {
           this.ID2RequestGetBlobId = ID2RequestGetBlobId;
    }


    /**
     * Gets the ID2RequestGetBlobId value for this ID2RequestGetBlobInfo_blobId_resolve_requestType.
     * 
     * @return ID2RequestGetBlobId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobIdType getID2RequestGetBlobId() {
        return ID2RequestGetBlobId;
    }


    /**
     * Sets the ID2RequestGetBlobId value for this ID2RequestGetBlobInfo_blobId_resolve_requestType.
     * 
     * @param ID2RequestGetBlobId
     */
    public void setID2RequestGetBlobId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobIdType ID2RequestGetBlobId) {
        this.ID2RequestGetBlobId = ID2RequestGetBlobId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2RequestGetBlobInfo_blobId_resolve_requestType)) return false;
        ID2RequestGetBlobInfo_blobId_resolve_requestType other = (ID2RequestGetBlobInfo_blobId_resolve_requestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2RequestGetBlobId==null && other.getID2RequestGetBlobId()==null) || 
             (this.ID2RequestGetBlobId!=null &&
              this.ID2RequestGetBlobId.equals(other.getID2RequestGetBlobId())));
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
        if (getID2RequestGetBlobId() != null) {
            _hashCode += getID2RequestGetBlobId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2RequestGetBlobInfo_blobId_resolve_requestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Info_blob-id_resolve_requestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2RequestGetBlobId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-IdType"));
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
