/**
 * ID2Reply_reply_getSeqIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2Reply_reply_getSeqIdType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetSeqIdType ID2ReplyGetSeqId;

    public ID2Reply_reply_getSeqIdType() {
    }

    public ID2Reply_reply_getSeqIdType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetSeqIdType ID2ReplyGetSeqId) {
           this.ID2ReplyGetSeqId = ID2ReplyGetSeqId;
    }


    /**
     * Gets the ID2ReplyGetSeqId value for this ID2Reply_reply_getSeqIdType.
     * 
     * @return ID2ReplyGetSeqId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetSeqIdType getID2ReplyGetSeqId() {
        return ID2ReplyGetSeqId;
    }


    /**
     * Sets the ID2ReplyGetSeqId value for this ID2Reply_reply_getSeqIdType.
     * 
     * @param ID2ReplyGetSeqId
     */
    public void setID2ReplyGetSeqId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetSeqIdType ID2ReplyGetSeqId) {
        this.ID2ReplyGetSeqId = ID2ReplyGetSeqId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2Reply_reply_getSeqIdType)) return false;
        ID2Reply_reply_getSeqIdType other = (ID2Reply_reply_getSeqIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2ReplyGetSeqId==null && other.getID2ReplyGetSeqId()==null) || 
             (this.ID2ReplyGetSeqId!=null &&
              this.ID2ReplyGetSeqId.equals(other.getID2ReplyGetSeqId())));
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
        if (getID2ReplyGetSeqId() != null) {
            _hashCode += getID2ReplyGetSeqId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2Reply_reply_getSeqIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply_reply_get-seq-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2ReplyGetSeqId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Seq-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Seq-idType"));
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
