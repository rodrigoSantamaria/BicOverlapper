/**
 * ID2SChunkContent_seqAnnotPlaceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SChunkContent_seqAnnotPlaceType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotPlaceInfoType ID2SSeqAnnotPlaceInfo;

    public ID2SChunkContent_seqAnnotPlaceType() {
    }

    public ID2SChunkContent_seqAnnotPlaceType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotPlaceInfoType ID2SSeqAnnotPlaceInfo) {
           this.ID2SSeqAnnotPlaceInfo = ID2SSeqAnnotPlaceInfo;
    }


    /**
     * Gets the ID2SSeqAnnotPlaceInfo value for this ID2SChunkContent_seqAnnotPlaceType.
     * 
     * @return ID2SSeqAnnotPlaceInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotPlaceInfoType getID2SSeqAnnotPlaceInfo() {
        return ID2SSeqAnnotPlaceInfo;
    }


    /**
     * Sets the ID2SSeqAnnotPlaceInfo value for this ID2SChunkContent_seqAnnotPlaceType.
     * 
     * @param ID2SSeqAnnotPlaceInfo
     */
    public void setID2SSeqAnnotPlaceInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotPlaceInfoType ID2SSeqAnnotPlaceInfo) {
        this.ID2SSeqAnnotPlaceInfo = ID2SSeqAnnotPlaceInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SChunkContent_seqAnnotPlaceType)) return false;
        ID2SChunkContent_seqAnnotPlaceType other = (ID2SChunkContent_seqAnnotPlaceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SSeqAnnotPlaceInfo==null && other.getID2SSeqAnnotPlaceInfo()==null) || 
             (this.ID2SSeqAnnotPlaceInfo!=null &&
              this.ID2SSeqAnnotPlaceInfo.equals(other.getID2SSeqAnnotPlaceInfo())));
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
        if (getID2SSeqAnnotPlaceInfo() != null) {
            _hashCode += getID2SSeqAnnotPlaceInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SChunkContent_seqAnnotPlaceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk-Content_seq-annot-placeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqAnnotPlaceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-annot-place-Info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-annot-place-InfoType"));
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
