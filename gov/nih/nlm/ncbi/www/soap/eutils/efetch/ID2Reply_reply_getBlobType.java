/**
 * ID2Reply_reply_getBlobType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2Reply_reply_getBlobType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlobType ID2ReplyGetBlob;

    public ID2Reply_reply_getBlobType() {
    }

    public ID2Reply_reply_getBlobType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlobType ID2ReplyGetBlob) {
           this.ID2ReplyGetBlob = ID2ReplyGetBlob;
    }


    /**
     * Gets the ID2ReplyGetBlob value for this ID2Reply_reply_getBlobType.
     * 
     * @return ID2ReplyGetBlob
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlobType getID2ReplyGetBlob() {
        return ID2ReplyGetBlob;
    }


    /**
     * Sets the ID2ReplyGetBlob value for this ID2Reply_reply_getBlobType.
     * 
     * @param ID2ReplyGetBlob
     */
    public void setID2ReplyGetBlob(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetBlobType ID2ReplyGetBlob) {
        this.ID2ReplyGetBlob = ID2ReplyGetBlob;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2Reply_reply_getBlobType)) return false;
        ID2Reply_reply_getBlobType other = (ID2Reply_reply_getBlobType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2ReplyGetBlob==null && other.getID2ReplyGetBlob()==null) || 
             (this.ID2ReplyGetBlob!=null &&
              this.ID2ReplyGetBlob.equals(other.getID2ReplyGetBlob())));
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
        if (getID2ReplyGetBlob() != null) {
            _hashCode += getID2ReplyGetBlob().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2Reply_reply_getBlobType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply_reply_get-blobType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2ReplyGetBlob");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Blob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-BlobType"));
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
