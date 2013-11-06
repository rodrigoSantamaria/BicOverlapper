/**
 * ID2SChunkContent_seqMapType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SChunkContent_seqMapType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqMapInfoType ID2SSeqMapInfo;

    public ID2SChunkContent_seqMapType() {
    }

    public ID2SChunkContent_seqMapType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqMapInfoType ID2SSeqMapInfo) {
           this.ID2SSeqMapInfo = ID2SSeqMapInfo;
    }


    /**
     * Gets the ID2SSeqMapInfo value for this ID2SChunkContent_seqMapType.
     * 
     * @return ID2SSeqMapInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqMapInfoType getID2SSeqMapInfo() {
        return ID2SSeqMapInfo;
    }


    /**
     * Sets the ID2SSeqMapInfo value for this ID2SChunkContent_seqMapType.
     * 
     * @param ID2SSeqMapInfo
     */
    public void setID2SSeqMapInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqMapInfoType ID2SSeqMapInfo) {
        this.ID2SSeqMapInfo = ID2SSeqMapInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SChunkContent_seqMapType)) return false;
        ID2SChunkContent_seqMapType other = (ID2SChunkContent_seqMapType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SSeqMapInfo==null && other.getID2SSeqMapInfo()==null) || 
             (this.ID2SSeqMapInfo!=null &&
              this.ID2SSeqMapInfo.equals(other.getID2SSeqMapInfo())));
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
        if (getID2SSeqMapInfo() != null) {
            _hashCode += getID2SSeqMapInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SChunkContent_seqMapType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk-Content_seq-mapType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqMapInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-map-Info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-map-InfoType"));
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
