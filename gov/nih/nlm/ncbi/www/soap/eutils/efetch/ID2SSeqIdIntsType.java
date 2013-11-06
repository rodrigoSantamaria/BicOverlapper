/**
 * ID2SSeqIdIntsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SSeqIdIntsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqIdInts_seqIdType ID2SSeqIdInts_seqId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqIdInts_intsType ID2SSeqIdInts_ints;

    public ID2SSeqIdIntsType() {
    }

    public ID2SSeqIdIntsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqIdInts_seqIdType ID2SSeqIdInts_seqId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqIdInts_intsType ID2SSeqIdInts_ints) {
           this.ID2SSeqIdInts_seqId = ID2SSeqIdInts_seqId;
           this.ID2SSeqIdInts_ints = ID2SSeqIdInts_ints;
    }


    /**
     * Gets the ID2SSeqIdInts_seqId value for this ID2SSeqIdIntsType.
     * 
     * @return ID2SSeqIdInts_seqId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqIdInts_seqIdType getID2SSeqIdInts_seqId() {
        return ID2SSeqIdInts_seqId;
    }


    /**
     * Sets the ID2SSeqIdInts_seqId value for this ID2SSeqIdIntsType.
     * 
     * @param ID2SSeqIdInts_seqId
     */
    public void setID2SSeqIdInts_seqId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqIdInts_seqIdType ID2SSeqIdInts_seqId) {
        this.ID2SSeqIdInts_seqId = ID2SSeqIdInts_seqId;
    }


    /**
     * Gets the ID2SSeqIdInts_ints value for this ID2SSeqIdIntsType.
     * 
     * @return ID2SSeqIdInts_ints
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqIdInts_intsType getID2SSeqIdInts_ints() {
        return ID2SSeqIdInts_ints;
    }


    /**
     * Sets the ID2SSeqIdInts_ints value for this ID2SSeqIdIntsType.
     * 
     * @param ID2SSeqIdInts_ints
     */
    public void setID2SSeqIdInts_ints(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqIdInts_intsType ID2SSeqIdInts_ints) {
        this.ID2SSeqIdInts_ints = ID2SSeqIdInts_ints;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SSeqIdIntsType)) return false;
        ID2SSeqIdIntsType other = (ID2SSeqIdIntsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SSeqIdInts_seqId==null && other.getID2SSeqIdInts_seqId()==null) || 
             (this.ID2SSeqIdInts_seqId!=null &&
              this.ID2SSeqIdInts_seqId.equals(other.getID2SSeqIdInts_seqId()))) &&
            ((this.ID2SSeqIdInts_ints==null && other.getID2SSeqIdInts_ints()==null) || 
             (this.ID2SSeqIdInts_ints!=null &&
              this.ID2SSeqIdInts_ints.equals(other.getID2SSeqIdInts_ints())));
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
        if (getID2SSeqIdInts_seqId() != null) {
            _hashCode += getID2SSeqIdInts_seqId().hashCode();
        }
        if (getID2SSeqIdInts_ints() != null) {
            _hashCode += getID2SSeqIdInts_ints().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SSeqIdIntsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-id-IntsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqIdInts_seqId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-id-Ints_seq-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-id-Ints_seq-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqIdInts_ints");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-id-Ints_ints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-id-Ints_intsType"));
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
