/**
 * SeqCodeTable_tableType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqCodeTable_tableType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTable_table_EType[] seqCodeTable_table_E;

    public SeqCodeTable_tableType() {
    }

    public SeqCodeTable_tableType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTable_table_EType[] seqCodeTable_table_E) {
           this.seqCodeTable_table_E = seqCodeTable_table_E;
    }


    /**
     * Gets the seqCodeTable_table_E value for this SeqCodeTable_tableType.
     * 
     * @return seqCodeTable_table_E
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTable_table_EType[] getSeqCodeTable_table_E() {
        return seqCodeTable_table_E;
    }


    /**
     * Sets the seqCodeTable_table_E value for this SeqCodeTable_tableType.
     * 
     * @param seqCodeTable_table_E
     */
    public void setSeqCodeTable_table_E(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTable_table_EType[] seqCodeTable_table_E) {
        this.seqCodeTable_table_E = seqCodeTable_table_E;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTable_table_EType getSeqCodeTable_table_E(int i) {
        return this.seqCodeTable_table_E[i];
    }

    public void setSeqCodeTable_table_E(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTable_table_EType _value) {
        this.seqCodeTable_table_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqCodeTable_tableType)) return false;
        SeqCodeTable_tableType other = (SeqCodeTable_tableType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqCodeTable_table_E==null && other.getSeqCodeTable_table_E()==null) || 
             (this.seqCodeTable_table_E!=null &&
              java.util.Arrays.equals(this.seqCodeTable_table_E, other.getSeqCodeTable_table_E())));
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
        if (getSeqCodeTable_table_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeqCodeTable_table_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeqCodeTable_table_E(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqCodeTable_tableType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-code-table_tableType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqCodeTable_table_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-code-table_table_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-code-table_table_EType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
