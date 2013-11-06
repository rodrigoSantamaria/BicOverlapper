/**
 * ID2ReplyGetBlobType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2ReplyGetBlobType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlob_blobIdType ID2ReplyGetBlob_blobId;

    private java.lang.String ID2ReplyGetBlob_splitVersion;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlob_dataType ID2ReplyGetBlob_data;

    public ID2ReplyGetBlobType() {
    }

    public ID2ReplyGetBlobType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlob_blobIdType ID2ReplyGetBlob_blobId,
           java.lang.String ID2ReplyGetBlob_splitVersion,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlob_dataType ID2ReplyGetBlob_data) {
           this.ID2ReplyGetBlob_blobId = ID2ReplyGetBlob_blobId;
           this.ID2ReplyGetBlob_splitVersion = ID2ReplyGetBlob_splitVersion;
           this.ID2ReplyGetBlob_data = ID2ReplyGetBlob_data;
    }


    /**
     * Gets the ID2ReplyGetBlob_blobId value for this ID2ReplyGetBlobType.
     * 
     * @return ID2ReplyGetBlob_blobId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlob_blobIdType getID2ReplyGetBlob_blobId() {
        return ID2ReplyGetBlob_blobId;
    }


    /**
     * Sets the ID2ReplyGetBlob_blobId value for this ID2ReplyGetBlobType.
     * 
     * @param ID2ReplyGetBlob_blobId
     */
    public void setID2ReplyGetBlob_blobId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlob_blobIdType ID2ReplyGetBlob_blobId) {
        this.ID2ReplyGetBlob_blobId = ID2ReplyGetBlob_blobId;
    }


    /**
     * Gets the ID2ReplyGetBlob_splitVersion value for this ID2ReplyGetBlobType.
     * 
     * @return ID2ReplyGetBlob_splitVersion
     */
    public java.lang.String getID2ReplyGetBlob_splitVersion() {
        return ID2ReplyGetBlob_splitVersion;
    }


    /**
     * Sets the ID2ReplyGetBlob_splitVersion value for this ID2ReplyGetBlobType.
     * 
     * @param ID2ReplyGetBlob_splitVersion
     */
    public void setID2ReplyGetBlob_splitVersion(java.lang.String ID2ReplyGetBlob_splitVersion) {
        this.ID2ReplyGetBlob_splitVersion = ID2ReplyGetBlob_splitVersion;
    }


    /**
     * Gets the ID2ReplyGetBlob_data value for this ID2ReplyGetBlobType.
     * 
     * @return ID2ReplyGetBlob_data
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlob_dataType getID2ReplyGetBlob_data() {
        return ID2ReplyGetBlob_data;
    }


    /**
     * Sets the ID2ReplyGetBlob_data value for this ID2ReplyGetBlobType.
     * 
     * @param ID2ReplyGetBlob_data
     */
    public void setID2ReplyGetBlob_data(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlob_dataType ID2ReplyGetBlob_data) {
        this.ID2ReplyGetBlob_data = ID2ReplyGetBlob_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2ReplyGetBlobType)) return false;
        ID2ReplyGetBlobType other = (ID2ReplyGetBlobType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2ReplyGetBlob_blobId==null && other.getID2ReplyGetBlob_blobId()==null) || 
             (this.ID2ReplyGetBlob_blobId!=null &&
              this.ID2ReplyGetBlob_blobId.equals(other.getID2ReplyGetBlob_blobId()))) &&
            ((this.ID2ReplyGetBlob_splitVersion==null && other.getID2ReplyGetBlob_splitVersion()==null) || 
             (this.ID2ReplyGetBlob_splitVersion!=null &&
              this.ID2ReplyGetBlob_splitVersion.equals(other.getID2ReplyGetBlob_splitVersion()))) &&
            ((this.ID2ReplyGetBlob_data==null && other.getID2ReplyGetBlob_data()==null) || 
             (this.ID2ReplyGetBlob_data!=null &&
              this.ID2ReplyGetBlob_data.equals(other.getID2ReplyGetBlob_data())));
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
        if (getID2ReplyGetBlob_blobId() != null) {
            _hashCode += getID2ReplyGetBlob_blobId().hashCode();
        }
        if (getID2ReplyGetBlob_splitVersion() != null) {
            _hashCode += getID2ReplyGetBlob_splitVersion().hashCode();
        }
        if (getID2ReplyGetBlob_data() != null) {
            _hashCode += getID2ReplyGetBlob_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2ReplyGetBlobType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-BlobType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2ReplyGetBlob_blobId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Blob_blob-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Blob_blob-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2ReplyGetBlob_splitVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Blob_split-version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2ReplyGetBlob_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Blob_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Blob_dataType"));
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
