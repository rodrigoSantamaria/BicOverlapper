/**
 * ID2SChunkData_assemblyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SChunkData_assemblyType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlignType[] seqAlign;

    public ID2SChunkData_assemblyType() {
    }

    public ID2SChunkData_assemblyType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlignType[] seqAlign) {
           this.seqAlign = seqAlign;
    }


    /**
     * Gets the seqAlign value for this ID2SChunkData_assemblyType.
     * 
     * @return seqAlign
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlignType[] getSeqAlign() {
        return seqAlign;
    }


    /**
     * Sets the seqAlign value for this ID2SChunkData_assemblyType.
     * 
     * @param seqAlign
     */
    public void setSeqAlign(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlignType[] seqAlign) {
        this.seqAlign = seqAlign;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlignType getSeqAlign(int i) {
        return this.seqAlign[i];
    }

    public void setSeqAlign(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlignType _value) {
        this.seqAlign[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SChunkData_assemblyType)) return false;
        ID2SChunkData_assemblyType other = (ID2SChunkData_assemblyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqAlign==null && other.getSeqAlign()==null) || 
             (this.seqAlign!=null &&
              java.util.Arrays.equals(this.seqAlign, other.getSeqAlign())));
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
        if (getSeqAlign() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeqAlign());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeqAlign(), i);
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
        new org.apache.axis.description.TypeDesc(ID2SChunkData_assemblyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk-Data_assemblyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqAlign");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-alignType"));
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
