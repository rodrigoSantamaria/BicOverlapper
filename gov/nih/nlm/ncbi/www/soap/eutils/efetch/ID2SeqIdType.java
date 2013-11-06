/**
 * ID2SeqIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SeqIdType  implements java.io.Serializable {
    private java.lang.String ID2SeqId_string;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SeqId_seqIdType ID2SeqId_seqId;

    public ID2SeqIdType() {
    }

    public ID2SeqIdType(
           java.lang.String ID2SeqId_string,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SeqId_seqIdType ID2SeqId_seqId) {
           this.ID2SeqId_string = ID2SeqId_string;
           this.ID2SeqId_seqId = ID2SeqId_seqId;
    }


    /**
     * Gets the ID2SeqId_string value for this ID2SeqIdType.
     * 
     * @return ID2SeqId_string
     */
    public java.lang.String getID2SeqId_string() {
        return ID2SeqId_string;
    }


    /**
     * Sets the ID2SeqId_string value for this ID2SeqIdType.
     * 
     * @param ID2SeqId_string
     */
    public void setID2SeqId_string(java.lang.String ID2SeqId_string) {
        this.ID2SeqId_string = ID2SeqId_string;
    }


    /**
     * Gets the ID2SeqId_seqId value for this ID2SeqIdType.
     * 
     * @return ID2SeqId_seqId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SeqId_seqIdType getID2SeqId_seqId() {
        return ID2SeqId_seqId;
    }


    /**
     * Sets the ID2SeqId_seqId value for this ID2SeqIdType.
     * 
     * @param ID2SeqId_seqId
     */
    public void setID2SeqId_seqId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SeqId_seqIdType ID2SeqId_seqId) {
        this.ID2SeqId_seqId = ID2SeqId_seqId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SeqIdType)) return false;
        ID2SeqIdType other = (ID2SeqIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SeqId_string==null && other.getID2SeqId_string()==null) || 
             (this.ID2SeqId_string!=null &&
              this.ID2SeqId_string.equals(other.getID2SeqId_string()))) &&
            ((this.ID2SeqId_seqId==null && other.getID2SeqId_seqId()==null) || 
             (this.ID2SeqId_seqId!=null &&
              this.ID2SeqId_seqId.equals(other.getID2SeqId_seqId())));
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
        if (getID2SeqId_string() != null) {
            _hashCode += getID2SeqId_string().hashCode();
        }
        if (getID2SeqId_seqId() != null) {
            _hashCode += getID2SeqId_seqId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SeqIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Seq-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SeqId_string");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Seq-id_string"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SeqId_seqId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Seq-id_seq-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Seq-id_seq-idType"));
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
