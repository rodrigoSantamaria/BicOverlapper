/**
 * ID2RequestReGetBlobType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2RequestReGetBlobType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestReGetBlob_blobIdType ID2RequestReGetBlob_blobId;

    private java.lang.String ID2RequestReGetBlob_splitVersion;

    private java.lang.String ID2RequestReGetBlob_offset;

    public ID2RequestReGetBlobType() {
    }

    public ID2RequestReGetBlobType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestReGetBlob_blobIdType ID2RequestReGetBlob_blobId,
           java.lang.String ID2RequestReGetBlob_splitVersion,
           java.lang.String ID2RequestReGetBlob_offset) {
           this.ID2RequestReGetBlob_blobId = ID2RequestReGetBlob_blobId;
           this.ID2RequestReGetBlob_splitVersion = ID2RequestReGetBlob_splitVersion;
           this.ID2RequestReGetBlob_offset = ID2RequestReGetBlob_offset;
    }


    /**
     * Gets the ID2RequestReGetBlob_blobId value for this ID2RequestReGetBlobType.
     * 
     * @return ID2RequestReGetBlob_blobId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestReGetBlob_blobIdType getID2RequestReGetBlob_blobId() {
        return ID2RequestReGetBlob_blobId;
    }


    /**
     * Sets the ID2RequestReGetBlob_blobId value for this ID2RequestReGetBlobType.
     * 
     * @param ID2RequestReGetBlob_blobId
     */
    public void setID2RequestReGetBlob_blobId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestReGetBlob_blobIdType ID2RequestReGetBlob_blobId) {
        this.ID2RequestReGetBlob_blobId = ID2RequestReGetBlob_blobId;
    }


    /**
     * Gets the ID2RequestReGetBlob_splitVersion value for this ID2RequestReGetBlobType.
     * 
     * @return ID2RequestReGetBlob_splitVersion
     */
    public java.lang.String getID2RequestReGetBlob_splitVersion() {
        return ID2RequestReGetBlob_splitVersion;
    }


    /**
     * Sets the ID2RequestReGetBlob_splitVersion value for this ID2RequestReGetBlobType.
     * 
     * @param ID2RequestReGetBlob_splitVersion
     */
    public void setID2RequestReGetBlob_splitVersion(java.lang.String ID2RequestReGetBlob_splitVersion) {
        this.ID2RequestReGetBlob_splitVersion = ID2RequestReGetBlob_splitVersion;
    }


    /**
     * Gets the ID2RequestReGetBlob_offset value for this ID2RequestReGetBlobType.
     * 
     * @return ID2RequestReGetBlob_offset
     */
    public java.lang.String getID2RequestReGetBlob_offset() {
        return ID2RequestReGetBlob_offset;
    }


    /**
     * Sets the ID2RequestReGetBlob_offset value for this ID2RequestReGetBlobType.
     * 
     * @param ID2RequestReGetBlob_offset
     */
    public void setID2RequestReGetBlob_offset(java.lang.String ID2RequestReGetBlob_offset) {
        this.ID2RequestReGetBlob_offset = ID2RequestReGetBlob_offset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2RequestReGetBlobType)) return false;
        ID2RequestReGetBlobType other = (ID2RequestReGetBlobType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2RequestReGetBlob_blobId==null && other.getID2RequestReGetBlob_blobId()==null) || 
             (this.ID2RequestReGetBlob_blobId!=null &&
              this.ID2RequestReGetBlob_blobId.equals(other.getID2RequestReGetBlob_blobId()))) &&
            ((this.ID2RequestReGetBlob_splitVersion==null && other.getID2RequestReGetBlob_splitVersion()==null) || 
             (this.ID2RequestReGetBlob_splitVersion!=null &&
              this.ID2RequestReGetBlob_splitVersion.equals(other.getID2RequestReGetBlob_splitVersion()))) &&
            ((this.ID2RequestReGetBlob_offset==null && other.getID2RequestReGetBlob_offset()==null) || 
             (this.ID2RequestReGetBlob_offset!=null &&
              this.ID2RequestReGetBlob_offset.equals(other.getID2RequestReGetBlob_offset())));
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
        if (getID2RequestReGetBlob_blobId() != null) {
            _hashCode += getID2RequestReGetBlob_blobId().hashCode();
        }
        if (getID2RequestReGetBlob_splitVersion() != null) {
            _hashCode += getID2RequestReGetBlob_splitVersion().hashCode();
        }
        if (getID2RequestReGetBlob_offset() != null) {
            _hashCode += getID2RequestReGetBlob_offset().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2RequestReGetBlobType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-ReGet-BlobType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2RequestReGetBlob_blobId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-ReGet-Blob_blob-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-ReGet-Blob_blob-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2RequestReGetBlob_splitVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-ReGet-Blob_split-version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2RequestReGetBlob_offset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-ReGet-Blob_offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
