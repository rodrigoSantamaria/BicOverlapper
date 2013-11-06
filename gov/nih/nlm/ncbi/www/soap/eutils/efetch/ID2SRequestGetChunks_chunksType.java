/**
 * ID2SRequestGetChunks_chunksType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SRequestGetChunks_chunksType  implements java.io.Serializable {
    private java.lang.String[] ID2SChunkId;

    public ID2SRequestGetChunks_chunksType() {
    }

    public ID2SRequestGetChunks_chunksType(
           java.lang.String[] ID2SChunkId) {
           this.ID2SChunkId = ID2SChunkId;
    }


    /**
     * Gets the ID2SChunkId value for this ID2SRequestGetChunks_chunksType.
     * 
     * @return ID2SChunkId
     */
    public java.lang.String[] getID2SChunkId() {
        return ID2SChunkId;
    }


    /**
     * Sets the ID2SChunkId value for this ID2SRequestGetChunks_chunksType.
     * 
     * @param ID2SChunkId
     */
    public void setID2SChunkId(java.lang.String[] ID2SChunkId) {
        this.ID2SChunkId = ID2SChunkId;
    }

    public java.lang.String getID2SChunkId(int i) {
        return this.ID2SChunkId[i];
    }

    public void setID2SChunkId(int i, java.lang.String _value) {
        this.ID2SChunkId[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SRequestGetChunks_chunksType)) return false;
        ID2SRequestGetChunks_chunksType other = (ID2SRequestGetChunks_chunksType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SChunkId==null && other.getID2SChunkId()==null) || 
             (this.ID2SChunkId!=null &&
              java.util.Arrays.equals(this.ID2SChunkId, other.getID2SChunkId())));
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
        if (getID2SChunkId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getID2SChunkId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getID2SChunkId(), i);
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
        new org.apache.axis.description.TypeDesc(ID2SRequestGetChunks_chunksType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Request-Get-Chunks_chunksType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SChunkId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk-Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk-Id"));
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
