/**
 * ID2Reply_reply_regetBlobType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2Reply_reply_regetBlobType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyReGetBlobType ID2ReplyReGetBlob;

    public ID2Reply_reply_regetBlobType() {
    }

    public ID2Reply_reply_regetBlobType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyReGetBlobType ID2ReplyReGetBlob) {
           this.ID2ReplyReGetBlob = ID2ReplyReGetBlob;
    }


    /**
     * Gets the ID2ReplyReGetBlob value for this ID2Reply_reply_regetBlobType.
     * 
     * @return ID2ReplyReGetBlob
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyReGetBlobType getID2ReplyReGetBlob() {
        return ID2ReplyReGetBlob;
    }


    /**
     * Sets the ID2ReplyReGetBlob value for this ID2Reply_reply_regetBlobType.
     * 
     * @param ID2ReplyReGetBlob
     */
    public void setID2ReplyReGetBlob(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyReGetBlobType ID2ReplyReGetBlob) {
        this.ID2ReplyReGetBlob = ID2ReplyReGetBlob;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2Reply_reply_regetBlobType)) return false;
        ID2Reply_reply_regetBlobType other = (ID2Reply_reply_regetBlobType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2ReplyReGetBlob==null && other.getID2ReplyReGetBlob()==null) || 
             (this.ID2ReplyReGetBlob!=null &&
              this.ID2ReplyReGetBlob.equals(other.getID2ReplyReGetBlob())));
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
        if (getID2ReplyReGetBlob() != null) {
            _hashCode += getID2ReplyReGetBlob().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2Reply_reply_regetBlobType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply_reply_reget-blobType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2ReplyReGetBlob");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-ReGet-Blob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-ReGet-BlobType"));
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
