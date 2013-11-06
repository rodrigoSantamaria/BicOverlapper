/**
 * ID2Request_request_getChunksType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2Request_request_getChunksType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SRequestGetChunksType ID2SRequestGetChunks;

    public ID2Request_request_getChunksType() {
    }

    public ID2Request_request_getChunksType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SRequestGetChunksType ID2SRequestGetChunks) {
           this.ID2SRequestGetChunks = ID2SRequestGetChunks;
    }


    /**
     * Gets the ID2SRequestGetChunks value for this ID2Request_request_getChunksType.
     * 
     * @return ID2SRequestGetChunks
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SRequestGetChunksType getID2SRequestGetChunks() {
        return ID2SRequestGetChunks;
    }


    /**
     * Sets the ID2SRequestGetChunks value for this ID2Request_request_getChunksType.
     * 
     * @param ID2SRequestGetChunks
     */
    public void setID2SRequestGetChunks(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SRequestGetChunksType ID2SRequestGetChunks) {
        this.ID2SRequestGetChunks = ID2SRequestGetChunks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2Request_request_getChunksType)) return false;
        ID2Request_request_getChunksType other = (ID2Request_request_getChunksType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SRequestGetChunks==null && other.getID2SRequestGetChunks()==null) || 
             (this.ID2SRequestGetChunks!=null &&
              this.ID2SRequestGetChunks.equals(other.getID2SRequestGetChunks())));
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
        if (getID2SRequestGetChunks() != null) {
            _hashCode += getID2SRequestGetChunks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2Request_request_getChunksType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request_request_get-chunksType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SRequestGetChunks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Request-Get-Chunks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Request-Get-ChunksType"));
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
