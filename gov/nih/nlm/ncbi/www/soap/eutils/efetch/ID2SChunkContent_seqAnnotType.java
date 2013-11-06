/**
 * ID2SChunkContent_seqAnnotType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SChunkContent_seqAnnotType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotInfoType ID2SSeqAnnotInfo;

    public ID2SChunkContent_seqAnnotType() {
    }

    public ID2SChunkContent_seqAnnotType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotInfoType ID2SSeqAnnotInfo) {
           this.ID2SSeqAnnotInfo = ID2SSeqAnnotInfo;
    }


    /**
     * Gets the ID2SSeqAnnotInfo value for this ID2SChunkContent_seqAnnotType.
     * 
     * @return ID2SSeqAnnotInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotInfoType getID2SSeqAnnotInfo() {
        return ID2SSeqAnnotInfo;
    }


    /**
     * Sets the ID2SSeqAnnotInfo value for this ID2SChunkContent_seqAnnotType.
     * 
     * @param ID2SSeqAnnotInfo
     */
    public void setID2SSeqAnnotInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAnnotInfoType ID2SSeqAnnotInfo) {
        this.ID2SSeqAnnotInfo = ID2SSeqAnnotInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SChunkContent_seqAnnotType)) return false;
        ID2SChunkContent_seqAnnotType other = (ID2SChunkContent_seqAnnotType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SSeqAnnotInfo==null && other.getID2SSeqAnnotInfo()==null) || 
             (this.ID2SSeqAnnotInfo!=null &&
              this.ID2SSeqAnnotInfo.equals(other.getID2SSeqAnnotInfo())));
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
        if (getID2SSeqAnnotInfo() != null) {
            _hashCode += getID2SSeqAnnotInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SChunkContent_seqAnnotType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk-Content_seq-annotType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqAnnotInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-annot-Info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-annot-InfoType"));
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
