/**
 * ID2SChunkInfo_contentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SChunkInfo_contentType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkContentType[] ID2SChunkContent;

    public ID2SChunkInfo_contentType() {
    }

    public ID2SChunkInfo_contentType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkContentType[] ID2SChunkContent) {
           this.ID2SChunkContent = ID2SChunkContent;
    }


    /**
     * Gets the ID2SChunkContent value for this ID2SChunkInfo_contentType.
     * 
     * @return ID2SChunkContent
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkContentType[] getID2SChunkContent() {
        return ID2SChunkContent;
    }


    /**
     * Sets the ID2SChunkContent value for this ID2SChunkInfo_contentType.
     * 
     * @param ID2SChunkContent
     */
    public void setID2SChunkContent(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkContentType[] ID2SChunkContent) {
        this.ID2SChunkContent = ID2SChunkContent;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkContentType getID2SChunkContent(int i) {
        return this.ID2SChunkContent[i];
    }

    public void setID2SChunkContent(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SChunkContentType _value) {
        this.ID2SChunkContent[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SChunkInfo_contentType)) return false;
        ID2SChunkInfo_contentType other = (ID2SChunkInfo_contentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SChunkContent==null && other.getID2SChunkContent()==null) || 
             (this.ID2SChunkContent!=null &&
              java.util.Arrays.equals(this.ID2SChunkContent, other.getID2SChunkContent())));
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
        if (getID2SChunkContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getID2SChunkContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getID2SChunkContent(), i);
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
        new org.apache.axis.description.TypeDesc(ID2SChunkInfo_contentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk-Info_contentType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SChunkContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk-Content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Chunk-ContentType"));
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
