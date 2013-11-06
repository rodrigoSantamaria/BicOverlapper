/**
 * ID2ReplyReGetBlobType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2ReplyReGetBlobType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyReGetBlob_blobIdType ID2ReplyReGetBlob_blobId;

    private java.lang.String ID2ReplyReGetBlob_splitVersion;

    private java.lang.String ID2ReplyReGetBlob_offset;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyReGetBlob_dataType ID2ReplyReGetBlob_data;

    public ID2ReplyReGetBlobType() {
    }

    public ID2ReplyReGetBlobType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyReGetBlob_blobIdType ID2ReplyReGetBlob_blobId,
           java.lang.String ID2ReplyReGetBlob_splitVersion,
           java.lang.String ID2ReplyReGetBlob_offset,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyReGetBlob_dataType ID2ReplyReGetBlob_data) {
           this.ID2ReplyReGetBlob_blobId = ID2ReplyReGetBlob_blobId;
           this.ID2ReplyReGetBlob_splitVersion = ID2ReplyReGetBlob_splitVersion;
           this.ID2ReplyReGetBlob_offset = ID2ReplyReGetBlob_offset;
           this.ID2ReplyReGetBlob_data = ID2ReplyReGetBlob_data;
    }


    /**
     * Gets the ID2ReplyReGetBlob_blobId value for this ID2ReplyReGetBlobType.
     * 
     * @return ID2ReplyReGetBlob_blobId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyReGetBlob_blobIdType getID2ReplyReGetBlob_blobId() {
        return ID2ReplyReGetBlob_blobId;
    }


    /**
     * Sets the ID2ReplyReGetBlob_blobId value for this ID2ReplyReGetBlobType.
     * 
     * @param ID2ReplyReGetBlob_blobId
     */
    public void setID2ReplyReGetBlob_blobId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyReGetBlob_blobIdType ID2ReplyReGetBlob_blobId) {
        this.ID2ReplyReGetBlob_blobId = ID2ReplyReGetBlob_blobId;
    }


    /**
     * Gets the ID2ReplyReGetBlob_splitVersion value for this ID2ReplyReGetBlobType.
     * 
     * @return ID2ReplyReGetBlob_splitVersion
     */
    public java.lang.String getID2ReplyReGetBlob_splitVersion() {
        return ID2ReplyReGetBlob_splitVersion;
    }


    /**
     * Sets the ID2ReplyReGetBlob_splitVersion value for this ID2ReplyReGetBlobType.
     * 
     * @param ID2ReplyReGetBlob_splitVersion
     */
    public void setID2ReplyReGetBlob_splitVersion(java.lang.String ID2ReplyReGetBlob_splitVersion) {
        this.ID2ReplyReGetBlob_splitVersion = ID2ReplyReGetBlob_splitVersion;
    }


    /**
     * Gets the ID2ReplyReGetBlob_offset value for this ID2ReplyReGetBlobType.
     * 
     * @return ID2ReplyReGetBlob_offset
     */
    public java.lang.String getID2ReplyReGetBlob_offset() {
        return ID2ReplyReGetBlob_offset;
    }


    /**
     * Sets the ID2ReplyReGetBlob_offset value for this ID2ReplyReGetBlobType.
     * 
     * @param ID2ReplyReGetBlob_offset
     */
    public void setID2ReplyReGetBlob_offset(java.lang.String ID2ReplyReGetBlob_offset) {
        this.ID2ReplyReGetBlob_offset = ID2ReplyReGetBlob_offset;
    }


    /**
     * Gets the ID2ReplyReGetBlob_data value for this ID2ReplyReGetBlobType.
     * 
     * @return ID2ReplyReGetBlob_data
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyReGetBlob_dataType getID2ReplyReGetBlob_data() {
        return ID2ReplyReGetBlob_data;
    }


    /**
     * Sets the ID2ReplyReGetBlob_data value for this ID2ReplyReGetBlobType.
     * 
     * @param ID2ReplyReGetBlob_data
     */
    public void setID2ReplyReGetBlob_data(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyReGetBlob_dataType ID2ReplyReGetBlob_data) {
        this.ID2ReplyReGetBlob_data = ID2ReplyReGetBlob_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2ReplyReGetBlobType)) return false;
        ID2ReplyReGetBlobType other = (ID2ReplyReGetBlobType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2ReplyReGetBlob_blobId==null && other.getID2ReplyReGetBlob_blobId()==null) || 
             (this.ID2ReplyReGetBlob_blobId!=null &&
              this.ID2ReplyReGetBlob_blobId.equals(other.getID2ReplyReGetBlob_blobId()))) &&
            ((this.ID2ReplyReGetBlob_splitVersion==null && other.getID2ReplyReGetBlob_splitVersion()==null) || 
             (this.ID2ReplyReGetBlob_splitVersion!=null &&
              this.ID2ReplyReGetBlob_splitVersion.equals(other.getID2ReplyReGetBlob_splitVersion()))) &&
            ((this.ID2ReplyReGetBlob_offset==null && other.getID2ReplyReGetBlob_offset()==null) || 
             (this.ID2ReplyReGetBlob_offset!=null &&
              this.ID2ReplyReGetBlob_offset.equals(other.getID2ReplyReGetBlob_offset()))) &&
            ((this.ID2ReplyReGetBlob_data==null && other.getID2ReplyReGetBlob_data()==null) || 
             (this.ID2ReplyReGetBlob_data!=null &&
              this.ID2ReplyReGetBlob_data.equals(other.getID2ReplyReGetBlob_data())));
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
        if (getID2ReplyReGetBlob_blobId() != null) {
            _hashCode += getID2ReplyReGetBlob_blobId().hashCode();
        }
        if (getID2ReplyReGetBlob_splitVersion() != null) {
            _hashCode += getID2ReplyReGetBlob_splitVersion().hashCode();
        }
        if (getID2ReplyReGetBlob_offset() != null) {
            _hashCode += getID2ReplyReGetBlob_offset().hashCode();
        }
        if (getID2ReplyReGetBlob_data() != null) {
            _hashCode += getID2ReplyReGetBlob_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2ReplyReGetBlobType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-ReGet-BlobType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2ReplyReGetBlob_blobId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-ReGet-Blob_blob-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-ReGet-Blob_blob-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2ReplyReGetBlob_splitVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-ReGet-Blob_split-version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2ReplyReGetBlob_offset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-ReGet-Blob_offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2ReplyReGetBlob_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-ReGet-Blob_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-ReGet-Blob_dataType"));
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
