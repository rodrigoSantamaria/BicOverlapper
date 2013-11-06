/**
 * Blast4GetSeqPartsReply_dataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4GetSeqPartsReply_dataType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqDataType seqData;

    public Blast4GetSeqPartsReply_dataType() {
    }

    public Blast4GetSeqPartsReply_dataType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqDataType seqData) {
           this.seqData = seqData;
    }


    /**
     * Gets the seqData value for this Blast4GetSeqPartsReply_dataType.
     * 
     * @return seqData
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqDataType getSeqData() {
        return seqData;
    }


    /**
     * Sets the seqData value for this Blast4GetSeqPartsReply_dataType.
     * 
     * @param seqData
     */
    public void setSeqData(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqDataType seqData) {
        this.seqData = seqData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4GetSeqPartsReply_dataType)) return false;
        Blast4GetSeqPartsReply_dataType other = (Blast4GetSeqPartsReply_dataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqData==null && other.getSeqData()==null) || 
             (this.seqData!=null &&
              this.seqData.equals(other.getSeqData())));
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
        if (getSeqData() != null) {
            _hashCode += getSeqData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4GetSeqPartsReply_dataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-seq-parts-reply_dataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-dataType"));
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
