/**
 * SeqCodeTable_table_EType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqCodeTable_table_EType  implements java.io.Serializable {
    private java.lang.String seqCodeTable_table_E_symbol;

    private java.lang.String seqCodeTable_table_E_name;

    public SeqCodeTable_table_EType() {
    }

    public SeqCodeTable_table_EType(
           java.lang.String seqCodeTable_table_E_symbol,
           java.lang.String seqCodeTable_table_E_name) {
           this.seqCodeTable_table_E_symbol = seqCodeTable_table_E_symbol;
           this.seqCodeTable_table_E_name = seqCodeTable_table_E_name;
    }


    /**
     * Gets the seqCodeTable_table_E_symbol value for this SeqCodeTable_table_EType.
     * 
     * @return seqCodeTable_table_E_symbol
     */
    public java.lang.String getSeqCodeTable_table_E_symbol() {
        return seqCodeTable_table_E_symbol;
    }


    /**
     * Sets the seqCodeTable_table_E_symbol value for this SeqCodeTable_table_EType.
     * 
     * @param seqCodeTable_table_E_symbol
     */
    public void setSeqCodeTable_table_E_symbol(java.lang.String seqCodeTable_table_E_symbol) {
        this.seqCodeTable_table_E_symbol = seqCodeTable_table_E_symbol;
    }


    /**
     * Gets the seqCodeTable_table_E_name value for this SeqCodeTable_table_EType.
     * 
     * @return seqCodeTable_table_E_name
     */
    public java.lang.String getSeqCodeTable_table_E_name() {
        return seqCodeTable_table_E_name;
    }


    /**
     * Sets the seqCodeTable_table_E_name value for this SeqCodeTable_table_EType.
     * 
     * @param seqCodeTable_table_E_name
     */
    public void setSeqCodeTable_table_E_name(java.lang.String seqCodeTable_table_E_name) {
        this.seqCodeTable_table_E_name = seqCodeTable_table_E_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqCodeTable_table_EType)) return false;
        SeqCodeTable_table_EType other = (SeqCodeTable_table_EType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqCodeTable_table_E_symbol==null && other.getSeqCodeTable_table_E_symbol()==null) || 
             (this.seqCodeTable_table_E_symbol!=null &&
              this.seqCodeTable_table_E_symbol.equals(other.getSeqCodeTable_table_E_symbol()))) &&
            ((this.seqCodeTable_table_E_name==null && other.getSeqCodeTable_table_E_name()==null) || 
             (this.seqCodeTable_table_E_name!=null &&
              this.seqCodeTable_table_E_name.equals(other.getSeqCodeTable_table_E_name())));
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
        if (getSeqCodeTable_table_E_symbol() != null) {
            _hashCode += getSeqCodeTable_table_E_symbol().hashCode();
        }
        if (getSeqCodeTable_table_E_name() != null) {
            _hashCode += getSeqCodeTable_table_E_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqCodeTable_table_EType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-code-table_table_EType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqCodeTable_table_E_symbol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-code-table_table_E_symbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqCodeTable_table_E_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-code-table_table_E_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
