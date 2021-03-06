/**
 * ID2SSplitInfo_chunksType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SSplitInfo_chunksType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkInfoType[] ID2SChunkInfo;

    public ID2SSplitInfo_chunksType() {
    }

    public ID2SSplitInfo_chunksType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkInfoType[] ID2SChunkInfo) {
           this.ID2SChunkInfo = ID2SChunkInfo;
    }


    /**
     * Gets the ID2SChunkInfo value for this ID2SSplitInfo_chunksType.
     * 
     * @return ID2SChunkInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkInfoType[] getID2SChunkInfo() {
        return ID2SChunkInfo;
    }


    /**
     * Sets the ID2SChunkInfo value for this ID2SSplitInfo_chunksType.
     * 
     * @param ID2SChunkInfo
     */
    public void setID2SChunkInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkInfoType[] ID2SChunkInfo) {
        this.ID2SChunkInfo = ID2SChunkInfo;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkInfoType getID2SChunkInfo(int i) {
        return this.ID2SChunkInfo[i];
    }

    public void setID2SChunkInfo(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkInfoType _value) {
        this.ID2SChunkInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SSplitInfo_chunksType)) return false;
        ID2SSplitInfo_chunksType other = (ID2SSplitInfo_chunksType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SChunkInfo==null && other.getID2SChunkInfo()==null) || 
             (this.ID2SChunkInfo!=null &&
              java.util.Arrays.equals(this.ID2SChunkInfo, other.getID2SChunkInfo())));
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
        if (getID2SChunkInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getID2SChunkInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getID2SChunkInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ID2SSplitInfo_chunksType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Split-Info_chunksType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SChunkInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk-Info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk-InfoType"));
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
