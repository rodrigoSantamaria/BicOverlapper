/**
 * ID2RequestGetSeqIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2RequestGetSeqIdType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetSeqId_seqIdType ID2RequestGetSeqId_seqId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetSeqId_seqIdTypeType ID2RequestGetSeqId_seqIdType;

    public ID2RequestGetSeqIdType() {
    }

    public ID2RequestGetSeqIdType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetSeqId_seqIdType ID2RequestGetSeqId_seqId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetSeqId_seqIdTypeType ID2RequestGetSeqId_seqIdType) {
           this.ID2RequestGetSeqId_seqId = ID2RequestGetSeqId_seqId;
           this.ID2RequestGetSeqId_seqIdType = ID2RequestGetSeqId_seqIdType;
    }


    /**
     * Gets the ID2RequestGetSeqId_seqId value for this ID2RequestGetSeqIdType.
     * 
     * @return ID2RequestGetSeqId_seqId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetSeqId_seqIdType getID2RequestGetSeqId_seqId() {
        return ID2RequestGetSeqId_seqId;
    }


    /**
     * Sets the ID2RequestGetSeqId_seqId value for this ID2RequestGetSeqIdType.
     * 
     * @param ID2RequestGetSeqId_seqId
     */
    public void setID2RequestGetSeqId_seqId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetSeqId_seqIdType ID2RequestGetSeqId_seqId) {
        this.ID2RequestGetSeqId_seqId = ID2RequestGetSeqId_seqId;
    }


    /**
     * Gets the ID2RequestGetSeqId_seqIdType value for this ID2RequestGetSeqIdType.
     * 
     * @return ID2RequestGetSeqId_seqIdType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetSeqId_seqIdTypeType getID2RequestGetSeqId_seqIdType() {
        return ID2RequestGetSeqId_seqIdType;
    }


    /**
     * Sets the ID2RequestGetSeqId_seqIdType value for this ID2RequestGetSeqIdType.
     * 
     * @param ID2RequestGetSeqId_seqIdType
     */
    public void setID2RequestGetSeqId_seqIdType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetSeqId_seqIdTypeType ID2RequestGetSeqId_seqIdType) {
        this.ID2RequestGetSeqId_seqIdType = ID2RequestGetSeqId_seqIdType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2RequestGetSeqIdType)) return false;
        ID2RequestGetSeqIdType other = (ID2RequestGetSeqIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2RequestGetSeqId_seqId==null && other.getID2RequestGetSeqId_seqId()==null) || 
             (this.ID2RequestGetSeqId_seqId!=null &&
              this.ID2RequestGetSeqId_seqId.equals(other.getID2RequestGetSeqId_seqId()))) &&
            ((this.ID2RequestGetSeqId_seqIdType==null && other.getID2RequestGetSeqId_seqIdType()==null) || 
             (this.ID2RequestGetSeqId_seqIdType!=null &&
              this.ID2RequestGetSeqId_seqIdType.equals(other.getID2RequestGetSeqId_seqIdType())));
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
        if (getID2RequestGetSeqId_seqId() != null) {
            _hashCode += getID2RequestGetSeqId_seqId().hashCode();
        }
        if (getID2RequestGetSeqId_seqIdType() != null) {
            _hashCode += getID2RequestGetSeqId_seqIdType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2RequestGetSeqIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Seq-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2RequestGetSeqId_seqId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Seq-id_seq-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Seq-id_seq-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2RequestGetSeqId_seqIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Seq-id_seq-id-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Seq-id_seq-id-typeType"));
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
