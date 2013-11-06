/**
 * ID2SChunkContent_seqDescrType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SChunkContent_seqDescrType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqDescrInfoType ID2SSeqDescrInfo;

    public ID2SChunkContent_seqDescrType() {
    }

    public ID2SChunkContent_seqDescrType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqDescrInfoType ID2SSeqDescrInfo) {
           this.ID2SSeqDescrInfo = ID2SSeqDescrInfo;
    }


    /**
     * Gets the ID2SSeqDescrInfo value for this ID2SChunkContent_seqDescrType.
     * 
     * @return ID2SSeqDescrInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqDescrInfoType getID2SSeqDescrInfo() {
        return ID2SSeqDescrInfo;
    }


    /**
     * Sets the ID2SSeqDescrInfo value for this ID2SChunkContent_seqDescrType.
     * 
     * @param ID2SSeqDescrInfo
     */
    public void setID2SSeqDescrInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqDescrInfoType ID2SSeqDescrInfo) {
        this.ID2SSeqDescrInfo = ID2SSeqDescrInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SChunkContent_seqDescrType)) return false;
        ID2SChunkContent_seqDescrType other = (ID2SChunkContent_seqDescrType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SSeqDescrInfo==null && other.getID2SSeqDescrInfo()==null) || 
             (this.ID2SSeqDescrInfo!=null &&
              this.ID2SSeqDescrInfo.equals(other.getID2SSeqDescrInfo())));
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
        if (getID2SSeqDescrInfo() != null) {
            _hashCode += getID2SSeqDescrInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SChunkContent_seqDescrType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk-Content_seq-descrType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqDescrInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-descr-Info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-descr-InfoType"));
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
