/**
 * ID2SReplyGetSplitInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SReplyGetSplitInfoType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetSplitInfo_blobIdType ID2SReplyGetSplitInfo_blobId;

    private java.lang.String ID2SReplyGetSplitInfo_splitVersion;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetSplitInfo_dataType ID2SReplyGetSplitInfo_data;

    public ID2SReplyGetSplitInfoType() {
    }

    public ID2SReplyGetSplitInfoType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetSplitInfo_blobIdType ID2SReplyGetSplitInfo_blobId,
           java.lang.String ID2SReplyGetSplitInfo_splitVersion,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetSplitInfo_dataType ID2SReplyGetSplitInfo_data) {
           this.ID2SReplyGetSplitInfo_blobId = ID2SReplyGetSplitInfo_blobId;
           this.ID2SReplyGetSplitInfo_splitVersion = ID2SReplyGetSplitInfo_splitVersion;
           this.ID2SReplyGetSplitInfo_data = ID2SReplyGetSplitInfo_data;
    }


    /**
     * Gets the ID2SReplyGetSplitInfo_blobId value for this ID2SReplyGetSplitInfoType.
     * 
     * @return ID2SReplyGetSplitInfo_blobId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetSplitInfo_blobIdType getID2SReplyGetSplitInfo_blobId() {
        return ID2SReplyGetSplitInfo_blobId;
    }


    /**
     * Sets the ID2SReplyGetSplitInfo_blobId value for this ID2SReplyGetSplitInfoType.
     * 
     * @param ID2SReplyGetSplitInfo_blobId
     */
    public void setID2SReplyGetSplitInfo_blobId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetSplitInfo_blobIdType ID2SReplyGetSplitInfo_blobId) {
        this.ID2SReplyGetSplitInfo_blobId = ID2SReplyGetSplitInfo_blobId;
    }


    /**
     * Gets the ID2SReplyGetSplitInfo_splitVersion value for this ID2SReplyGetSplitInfoType.
     * 
     * @return ID2SReplyGetSplitInfo_splitVersion
     */
    public java.lang.String getID2SReplyGetSplitInfo_splitVersion() {
        return ID2SReplyGetSplitInfo_splitVersion;
    }


    /**
     * Sets the ID2SReplyGetSplitInfo_splitVersion value for this ID2SReplyGetSplitInfoType.
     * 
     * @param ID2SReplyGetSplitInfo_splitVersion
     */
    public void setID2SReplyGetSplitInfo_splitVersion(java.lang.String ID2SReplyGetSplitInfo_splitVersion) {
        this.ID2SReplyGetSplitInfo_splitVersion = ID2SReplyGetSplitInfo_splitVersion;
    }


    /**
     * Gets the ID2SReplyGetSplitInfo_data value for this ID2SReplyGetSplitInfoType.
     * 
     * @return ID2SReplyGetSplitInfo_data
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetSplitInfo_dataType getID2SReplyGetSplitInfo_data() {
        return ID2SReplyGetSplitInfo_data;
    }


    /**
     * Sets the ID2SReplyGetSplitInfo_data value for this ID2SReplyGetSplitInfoType.
     * 
     * @param ID2SReplyGetSplitInfo_data
     */
    public void setID2SReplyGetSplitInfo_data(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SReplyGetSplitInfo_dataType ID2SReplyGetSplitInfo_data) {
        this.ID2SReplyGetSplitInfo_data = ID2SReplyGetSplitInfo_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SReplyGetSplitInfoType)) return false;
        ID2SReplyGetSplitInfoType other = (ID2SReplyGetSplitInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SReplyGetSplitInfo_blobId==null && other.getID2SReplyGetSplitInfo_blobId()==null) || 
             (this.ID2SReplyGetSplitInfo_blobId!=null &&
              this.ID2SReplyGetSplitInfo_blobId.equals(other.getID2SReplyGetSplitInfo_blobId()))) &&
            ((this.ID2SReplyGetSplitInfo_splitVersion==null && other.getID2SReplyGetSplitInfo_splitVersion()==null) || 
             (this.ID2SReplyGetSplitInfo_splitVersion!=null &&
              this.ID2SReplyGetSplitInfo_splitVersion.equals(other.getID2SReplyGetSplitInfo_splitVersion()))) &&
            ((this.ID2SReplyGetSplitInfo_data==null && other.getID2SReplyGetSplitInfo_data()==null) || 
             (this.ID2SReplyGetSplitInfo_data!=null &&
              this.ID2SReplyGetSplitInfo_data.equals(other.getID2SReplyGetSplitInfo_data())));
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
        if (getID2SReplyGetSplitInfo_blobId() != null) {
            _hashCode += getID2SReplyGetSplitInfo_blobId().hashCode();
        }
        if (getID2SReplyGetSplitInfo_splitVersion() != null) {
            _hashCode += getID2SReplyGetSplitInfo_splitVersion().hashCode();
        }
        if (getID2SReplyGetSplitInfo_data() != null) {
            _hashCode += getID2SReplyGetSplitInfo_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SReplyGetSplitInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Reply-Get-Split-InfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SReplyGetSplitInfo_blobId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Reply-Get-Split-Info_blob-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Reply-Get-Split-Info_blob-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SReplyGetSplitInfo_splitVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Reply-Get-Split-Info_split-version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SReplyGetSplitInfo_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Reply-Get-Split-Info_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Reply-Get-Split-Info_dataType"));
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
