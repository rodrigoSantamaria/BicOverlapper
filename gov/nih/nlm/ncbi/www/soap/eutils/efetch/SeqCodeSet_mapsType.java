/**
 * SeqCodeSet_mapsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqCodeSet_mapsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqMapTableType[] seqMapTable;

    public SeqCodeSet_mapsType() {
    }

    public SeqCodeSet_mapsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqMapTableType[] seqMapTable) {
           this.seqMapTable = seqMapTable;
    }


    /**
     * Gets the seqMapTable value for this SeqCodeSet_mapsType.
     * 
     * @return seqMapTable
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqMapTableType[] getSeqMapTable() {
        return seqMapTable;
    }


    /**
     * Sets the seqMapTable value for this SeqCodeSet_mapsType.
     * 
     * @param seqMapTable
     */
    public void setSeqMapTable(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqMapTableType[] seqMapTable) {
        this.seqMapTable = seqMapTable;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqMapTableType getSeqMapTable(int i) {
        return this.seqMapTable[i];
    }

    public void setSeqMapTable(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqMapTableType _value) {
        this.seqMapTable[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqCodeSet_mapsType)) return false;
        SeqCodeSet_mapsType other = (SeqCodeSet_mapsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqMapTable==null && other.getSeqMapTable()==null) || 
             (this.seqMapTable!=null &&
              java.util.Arrays.equals(this.seqMapTable, other.getSeqMapTable())));
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
        if (getSeqMapTable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeqMapTable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeqMapTable(), i);
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
        new org.apache.axis.description.TypeDesc(SeqCodeSet_mapsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-code-set_mapsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqMapTable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-map-table"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-map-tableType"));
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
