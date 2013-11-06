/**
 * ID2SChunk_dataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SChunk_dataType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkDataType[] ID2SChunkData;

    public ID2SChunk_dataType() {
    }

    public ID2SChunk_dataType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkDataType[] ID2SChunkData) {
           this.ID2SChunkData = ID2SChunkData;
    }


    /**
     * Gets the ID2SChunkData value for this ID2SChunk_dataType.
     * 
     * @return ID2SChunkData
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkDataType[] getID2SChunkData() {
        return ID2SChunkData;
    }


    /**
     * Sets the ID2SChunkData value for this ID2SChunk_dataType.
     * 
     * @param ID2SChunkData
     */
    public void setID2SChunkData(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkDataType[] ID2SChunkData) {
        this.ID2SChunkData = ID2SChunkData;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkDataType getID2SChunkData(int i) {
        return this.ID2SChunkData[i];
    }

    public void setID2SChunkData(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkDataType _value) {
        this.ID2SChunkData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SChunk_dataType)) return false;
        ID2SChunk_dataType other = (ID2SChunk_dataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SChunkData==null && other.getID2SChunkData()==null) || 
             (this.ID2SChunkData!=null &&
              java.util.Arrays.equals(this.ID2SChunkData, other.getID2SChunkData())));
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
        if (getID2SChunkData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getID2SChunkData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getID2SChunkData(), i);
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
        new org.apache.axis.description.TypeDesc(ID2SChunk_dataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk_dataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SChunkData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk-Data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk-DataType"));
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
