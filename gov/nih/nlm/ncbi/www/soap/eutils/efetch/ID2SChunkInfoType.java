/**
 * ID2SChunkInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SChunkInfoType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkInfo_idType ID2SChunkInfo_id;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkInfo_contentType ID2SChunkInfo_content;

    public ID2SChunkInfoType() {
    }

    public ID2SChunkInfoType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkInfo_idType ID2SChunkInfo_id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkInfo_contentType ID2SChunkInfo_content) {
           this.ID2SChunkInfo_id = ID2SChunkInfo_id;
           this.ID2SChunkInfo_content = ID2SChunkInfo_content;
    }


    /**
     * Gets the ID2SChunkInfo_id value for this ID2SChunkInfoType.
     * 
     * @return ID2SChunkInfo_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkInfo_idType getID2SChunkInfo_id() {
        return ID2SChunkInfo_id;
    }


    /**
     * Sets the ID2SChunkInfo_id value for this ID2SChunkInfoType.
     * 
     * @param ID2SChunkInfo_id
     */
    public void setID2SChunkInfo_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkInfo_idType ID2SChunkInfo_id) {
        this.ID2SChunkInfo_id = ID2SChunkInfo_id;
    }


    /**
     * Gets the ID2SChunkInfo_content value for this ID2SChunkInfoType.
     * 
     * @return ID2SChunkInfo_content
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkInfo_contentType getID2SChunkInfo_content() {
        return ID2SChunkInfo_content;
    }


    /**
     * Sets the ID2SChunkInfo_content value for this ID2SChunkInfoType.
     * 
     * @param ID2SChunkInfo_content
     */
    public void setID2SChunkInfo_content(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkInfo_contentType ID2SChunkInfo_content) {
        this.ID2SChunkInfo_content = ID2SChunkInfo_content;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SChunkInfoType)) return false;
        ID2SChunkInfoType other = (ID2SChunkInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SChunkInfo_id==null && other.getID2SChunkInfo_id()==null) || 
             (this.ID2SChunkInfo_id!=null &&
              this.ID2SChunkInfo_id.equals(other.getID2SChunkInfo_id()))) &&
            ((this.ID2SChunkInfo_content==null && other.getID2SChunkInfo_content()==null) || 
             (this.ID2SChunkInfo_content!=null &&
              this.ID2SChunkInfo_content.equals(other.getID2SChunkInfo_content())));
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
        if (getID2SChunkInfo_id() != null) {
            _hashCode += getID2SChunkInfo_id().hashCode();
        }
        if (getID2SChunkInfo_content() != null) {
            _hashCode += getID2SChunkInfo_content().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SChunkInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk-InfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SChunkInfo_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk-Info_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk-Info_idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SChunkInfo_content");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk-Info_content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk-Info_contentType"));
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
