/**
 * ID2RequestGetBlobInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2RequestGetBlobInfoType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_blobIdType ID2RequestGetBlobInfo_blobId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_getSeqIds ID2RequestGetBlobInfo_getSeqIds;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_getDataType ID2RequestGetBlobInfo_getData;

    public ID2RequestGetBlobInfoType() {
    }

    public ID2RequestGetBlobInfoType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_blobIdType ID2RequestGetBlobInfo_blobId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_getSeqIds ID2RequestGetBlobInfo_getSeqIds,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_getDataType ID2RequestGetBlobInfo_getData) {
           this.ID2RequestGetBlobInfo_blobId = ID2RequestGetBlobInfo_blobId;
           this.ID2RequestGetBlobInfo_getSeqIds = ID2RequestGetBlobInfo_getSeqIds;
           this.ID2RequestGetBlobInfo_getData = ID2RequestGetBlobInfo_getData;
    }


    /**
     * Gets the ID2RequestGetBlobInfo_blobId value for this ID2RequestGetBlobInfoType.
     * 
     * @return ID2RequestGetBlobInfo_blobId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_blobIdType getID2RequestGetBlobInfo_blobId() {
        return ID2RequestGetBlobInfo_blobId;
    }


    /**
     * Sets the ID2RequestGetBlobInfo_blobId value for this ID2RequestGetBlobInfoType.
     * 
     * @param ID2RequestGetBlobInfo_blobId
     */
    public void setID2RequestGetBlobInfo_blobId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_blobIdType ID2RequestGetBlobInfo_blobId) {
        this.ID2RequestGetBlobInfo_blobId = ID2RequestGetBlobInfo_blobId;
    }


    /**
     * Gets the ID2RequestGetBlobInfo_getSeqIds value for this ID2RequestGetBlobInfoType.
     * 
     * @return ID2RequestGetBlobInfo_getSeqIds
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_getSeqIds getID2RequestGetBlobInfo_getSeqIds() {
        return ID2RequestGetBlobInfo_getSeqIds;
    }


    /**
     * Sets the ID2RequestGetBlobInfo_getSeqIds value for this ID2RequestGetBlobInfoType.
     * 
     * @param ID2RequestGetBlobInfo_getSeqIds
     */
    public void setID2RequestGetBlobInfo_getSeqIds(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_getSeqIds ID2RequestGetBlobInfo_getSeqIds) {
        this.ID2RequestGetBlobInfo_getSeqIds = ID2RequestGetBlobInfo_getSeqIds;
    }


    /**
     * Gets the ID2RequestGetBlobInfo_getData value for this ID2RequestGetBlobInfoType.
     * 
     * @return ID2RequestGetBlobInfo_getData
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_getDataType getID2RequestGetBlobInfo_getData() {
        return ID2RequestGetBlobInfo_getData;
    }


    /**
     * Sets the ID2RequestGetBlobInfo_getData value for this ID2RequestGetBlobInfoType.
     * 
     * @param ID2RequestGetBlobInfo_getData
     */
    public void setID2RequestGetBlobInfo_getData(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfo_getDataType ID2RequestGetBlobInfo_getData) {
        this.ID2RequestGetBlobInfo_getData = ID2RequestGetBlobInfo_getData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2RequestGetBlobInfoType)) return false;
        ID2RequestGetBlobInfoType other = (ID2RequestGetBlobInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2RequestGetBlobInfo_blobId==null && other.getID2RequestGetBlobInfo_blobId()==null) || 
             (this.ID2RequestGetBlobInfo_blobId!=null &&
              this.ID2RequestGetBlobInfo_blobId.equals(other.getID2RequestGetBlobInfo_blobId()))) &&
            ((this.ID2RequestGetBlobInfo_getSeqIds==null && other.getID2RequestGetBlobInfo_getSeqIds()==null) || 
             (this.ID2RequestGetBlobInfo_getSeqIds!=null &&
              this.ID2RequestGetBlobInfo_getSeqIds.equals(other.getID2RequestGetBlobInfo_getSeqIds()))) &&
            ((this.ID2RequestGetBlobInfo_getData==null && other.getID2RequestGetBlobInfo_getData()==null) || 
             (this.ID2RequestGetBlobInfo_getData!=null &&
              this.ID2RequestGetBlobInfo_getData.equals(other.getID2RequestGetBlobInfo_getData())));
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
        if (getID2RequestGetBlobInfo_blobId() != null) {
            _hashCode += getID2RequestGetBlobInfo_blobId().hashCode();
        }
        if (getID2RequestGetBlobInfo_getSeqIds() != null) {
            _hashCode += getID2RequestGetBlobInfo_getSeqIds().hashCode();
        }
        if (getID2RequestGetBlobInfo_getData() != null) {
            _hashCode += getID2RequestGetBlobInfo_getData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2RequestGetBlobInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-InfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2RequestGetBlobInfo_blobId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Info_blob-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Info_blob-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2RequestGetBlobInfo_getSeqIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Info_get-seq-ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ID2-Request-Get-Blob-Info_get-seq-ids"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2RequestGetBlobInfo_getData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Info_get-data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Info_get-dataType"));
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
