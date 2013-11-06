/**
 * SeqLiteralType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqLiteralType  implements java.io.Serializable {
    private java.lang.String seqLiteral_length;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqLiteral_fuzzType seqLiteral_fuzz;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqLiteral_seqDataType seqLiteral_seqData;

    public SeqLiteralType() {
    }

    public SeqLiteralType(
           java.lang.String seqLiteral_length,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqLiteral_fuzzType seqLiteral_fuzz,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqLiteral_seqDataType seqLiteral_seqData) {
           this.seqLiteral_length = seqLiteral_length;
           this.seqLiteral_fuzz = seqLiteral_fuzz;
           this.seqLiteral_seqData = seqLiteral_seqData;
    }


    /**
     * Gets the seqLiteral_length value for this SeqLiteralType.
     * 
     * @return seqLiteral_length
     */
    public java.lang.String getSeqLiteral_length() {
        return seqLiteral_length;
    }


    /**
     * Sets the seqLiteral_length value for this SeqLiteralType.
     * 
     * @param seqLiteral_length
     */
    public void setSeqLiteral_length(java.lang.String seqLiteral_length) {
        this.seqLiteral_length = seqLiteral_length;
    }


    /**
     * Gets the seqLiteral_fuzz value for this SeqLiteralType.
     * 
     * @return seqLiteral_fuzz
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqLiteral_fuzzType getSeqLiteral_fuzz() {
        return seqLiteral_fuzz;
    }


    /**
     * Sets the seqLiteral_fuzz value for this SeqLiteralType.
     * 
     * @param seqLiteral_fuzz
     */
    public void setSeqLiteral_fuzz(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqLiteral_fuzzType seqLiteral_fuzz) {
        this.seqLiteral_fuzz = seqLiteral_fuzz;
    }


    /**
     * Gets the seqLiteral_seqData value for this SeqLiteralType.
     * 
     * @return seqLiteral_seqData
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqLiteral_seqDataType getSeqLiteral_seqData() {
        return seqLiteral_seqData;
    }


    /**
     * Sets the seqLiteral_seqData value for this SeqLiteralType.
     * 
     * @param seqLiteral_seqData
     */
    public void setSeqLiteral_seqData(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqLiteral_seqDataType seqLiteral_seqData) {
        this.seqLiteral_seqData = seqLiteral_seqData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqLiteralType)) return false;
        SeqLiteralType other = (SeqLiteralType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqLiteral_length==null && other.getSeqLiteral_length()==null) || 
             (this.seqLiteral_length!=null &&
              this.seqLiteral_length.equals(other.getSeqLiteral_length()))) &&
            ((this.seqLiteral_fuzz==null && other.getSeqLiteral_fuzz()==null) || 
             (this.seqLiteral_fuzz!=null &&
              this.seqLiteral_fuzz.equals(other.getSeqLiteral_fuzz()))) &&
            ((this.seqLiteral_seqData==null && other.getSeqLiteral_seqData()==null) || 
             (this.seqLiteral_seqData!=null &&
              this.seqLiteral_seqData.equals(other.getSeqLiteral_seqData())));
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
        if (getSeqLiteral_length() != null) {
            _hashCode += getSeqLiteral_length().hashCode();
        }
        if (getSeqLiteral_fuzz() != null) {
            _hashCode += getSeqLiteral_fuzz().hashCode();
        }
        if (getSeqLiteral_seqData() != null) {
            _hashCode += getSeqLiteral_seqData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqLiteralType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-literalType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqLiteral_length");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-literal_length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqLiteral_fuzz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-literal_fuzz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-literal_fuzzType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqLiteral_seqData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-literal_seq-data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-literal_seq-dataType"));
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
