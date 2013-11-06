/**
 * ID2RequestGetSeqId_seqIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2RequestGetSeqId_seqIdType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SeqIdType ID2SeqId;

    public ID2RequestGetSeqId_seqIdType() {
    }

    public ID2RequestGetSeqId_seqIdType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SeqIdType ID2SeqId) {
           this.ID2SeqId = ID2SeqId;
    }


    /**
     * Gets the ID2SeqId value for this ID2RequestGetSeqId_seqIdType.
     * 
     * @return ID2SeqId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SeqIdType getID2SeqId() {
        return ID2SeqId;
    }


    /**
     * Sets the ID2SeqId value for this ID2RequestGetSeqId_seqIdType.
     * 
     * @param ID2SeqId
     */
    public void setID2SeqId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SeqIdType ID2SeqId) {
        this.ID2SeqId = ID2SeqId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2RequestGetSeqId_seqIdType)) return false;
        ID2RequestGetSeqId_seqIdType other = (ID2RequestGetSeqId_seqIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SeqId==null && other.getID2SeqId()==null) || 
             (this.ID2SeqId!=null &&
              this.ID2SeqId.equals(other.getID2SeqId())));
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
        if (getID2SeqId() != null) {
            _hashCode += getID2SeqId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2RequestGetSeqId_seqIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Seq-id_seq-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SeqId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Seq-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Seq-idType"));
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
