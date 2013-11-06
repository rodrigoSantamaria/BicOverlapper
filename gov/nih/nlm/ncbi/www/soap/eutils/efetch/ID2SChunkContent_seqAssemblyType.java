/**
 * ID2SChunkContent_seqAssemblyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SChunkContent_seqAssemblyType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAssemblyInfoType ID2SSeqAssemblyInfo;

    public ID2SChunkContent_seqAssemblyType() {
    }

    public ID2SChunkContent_seqAssemblyType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAssemblyInfoType ID2SSeqAssemblyInfo) {
           this.ID2SSeqAssemblyInfo = ID2SSeqAssemblyInfo;
    }


    /**
     * Gets the ID2SSeqAssemblyInfo value for this ID2SChunkContent_seqAssemblyType.
     * 
     * @return ID2SSeqAssemblyInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAssemblyInfoType getID2SSeqAssemblyInfo() {
        return ID2SSeqAssemblyInfo;
    }


    /**
     * Sets the ID2SSeqAssemblyInfo value for this ID2SChunkContent_seqAssemblyType.
     * 
     * @param ID2SSeqAssemblyInfo
     */
    public void setID2SSeqAssemblyInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SSeqAssemblyInfoType ID2SSeqAssemblyInfo) {
        this.ID2SSeqAssemblyInfo = ID2SSeqAssemblyInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SChunkContent_seqAssemblyType)) return false;
        ID2SChunkContent_seqAssemblyType other = (ID2SChunkContent_seqAssemblyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SSeqAssemblyInfo==null && other.getID2SSeqAssemblyInfo()==null) || 
             (this.ID2SSeqAssemblyInfo!=null &&
              this.ID2SSeqAssemblyInfo.equals(other.getID2SSeqAssemblyInfo())));
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
        if (getID2SSeqAssemblyInfo() != null) {
            _hashCode += getID2SSeqAssemblyInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SChunkContent_seqAssemblyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk-Content_seq-assemblyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SSeqAssemblyInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-assembly-Info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-assembly-InfoType"));
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
