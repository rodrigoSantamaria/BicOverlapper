/**
 * SeqCodeSet_codesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqCodeSet_codesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTableType[] seqCodeTable;

    public SeqCodeSet_codesType() {
    }

    public SeqCodeSet_codesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTableType[] seqCodeTable) {
           this.seqCodeTable = seqCodeTable;
    }


    /**
     * Gets the seqCodeTable value for this SeqCodeSet_codesType.
     * 
     * @return seqCodeTable
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTableType[] getSeqCodeTable() {
        return seqCodeTable;
    }


    /**
     * Sets the seqCodeTable value for this SeqCodeSet_codesType.
     * 
     * @param seqCodeTable
     */
    public void setSeqCodeTable(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTableType[] seqCodeTable) {
        this.seqCodeTable = seqCodeTable;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTableType getSeqCodeTable(int i) {
        return this.seqCodeTable[i];
    }

    public void setSeqCodeTable(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeTableType _value) {
        this.seqCodeTable[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqCodeSet_codesType)) return false;
        SeqCodeSet_codesType other = (SeqCodeSet_codesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqCodeTable==null && other.getSeqCodeTable()==null) || 
             (this.seqCodeTable!=null &&
              java.util.Arrays.equals(this.seqCodeTable, other.getSeqCodeTable())));
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
        if (getSeqCodeTable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeqCodeTable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeqCodeTable(), i);
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
        new org.apache.axis.description.TypeDesc(SeqCodeSet_codesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-code-set_codesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqCodeTable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-code-table"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-code-tableType"));
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
