/**
 * ID2BlobSeqIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2BlobSeqIdType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2BlobSeqId_seqIdType ID2BlobSeqId_seqId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2BlobSeqId_replaced ID2BlobSeqId_replaced;

    public ID2BlobSeqIdType() {
    }

    public ID2BlobSeqIdType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2BlobSeqId_seqIdType ID2BlobSeqId_seqId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2BlobSeqId_replaced ID2BlobSeqId_replaced) {
           this.ID2BlobSeqId_seqId = ID2BlobSeqId_seqId;
           this.ID2BlobSeqId_replaced = ID2BlobSeqId_replaced;
    }


    /**
     * Gets the ID2BlobSeqId_seqId value for this ID2BlobSeqIdType.
     * 
     * @return ID2BlobSeqId_seqId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2BlobSeqId_seqIdType getID2BlobSeqId_seqId() {
        return ID2BlobSeqId_seqId;
    }


    /**
     * Sets the ID2BlobSeqId_seqId value for this ID2BlobSeqIdType.
     * 
     * @param ID2BlobSeqId_seqId
     */
    public void setID2BlobSeqId_seqId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2BlobSeqId_seqIdType ID2BlobSeqId_seqId) {
        this.ID2BlobSeqId_seqId = ID2BlobSeqId_seqId;
    }


    /**
     * Gets the ID2BlobSeqId_replaced value for this ID2BlobSeqIdType.
     * 
     * @return ID2BlobSeqId_replaced
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2BlobSeqId_replaced getID2BlobSeqId_replaced() {
        return ID2BlobSeqId_replaced;
    }


    /**
     * Sets the ID2BlobSeqId_replaced value for this ID2BlobSeqIdType.
     * 
     * @param ID2BlobSeqId_replaced
     */
    public void setID2BlobSeqId_replaced(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2BlobSeqId_replaced ID2BlobSeqId_replaced) {
        this.ID2BlobSeqId_replaced = ID2BlobSeqId_replaced;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2BlobSeqIdType)) return false;
        ID2BlobSeqIdType other = (ID2BlobSeqIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2BlobSeqId_seqId==null && other.getID2BlobSeqId_seqId()==null) || 
             (this.ID2BlobSeqId_seqId!=null &&
              this.ID2BlobSeqId_seqId.equals(other.getID2BlobSeqId_seqId()))) &&
            ((this.ID2BlobSeqId_replaced==null && other.getID2BlobSeqId_replaced()==null) || 
             (this.ID2BlobSeqId_replaced!=null &&
              this.ID2BlobSeqId_replaced.equals(other.getID2BlobSeqId_replaced())));
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
        if (getID2BlobSeqId_seqId() != null) {
            _hashCode += getID2BlobSeqId_seqId().hashCode();
        }
        if (getID2BlobSeqId_replaced() != null) {
            _hashCode += getID2BlobSeqId_replaced().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2BlobSeqIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Blob-Seq-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2BlobSeqId_seqId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Blob-Seq-id_seq-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Blob-Seq-id_seq-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2BlobSeqId_replaced");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Blob-Seq-id_replaced"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ID2-Blob-Seq-id_replaced"));
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
