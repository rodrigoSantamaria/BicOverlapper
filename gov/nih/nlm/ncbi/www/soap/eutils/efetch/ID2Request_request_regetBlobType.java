/**
 * ID2Request_request_regetBlobType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2Request_request_regetBlobType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestReGetBlobType ID2RequestReGetBlob;

    public ID2Request_request_regetBlobType() {
    }

    public ID2Request_request_regetBlobType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestReGetBlobType ID2RequestReGetBlob) {
           this.ID2RequestReGetBlob = ID2RequestReGetBlob;
    }


    /**
     * Gets the ID2RequestReGetBlob value for this ID2Request_request_regetBlobType.
     * 
     * @return ID2RequestReGetBlob
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestReGetBlobType getID2RequestReGetBlob() {
        return ID2RequestReGetBlob;
    }


    /**
     * Sets the ID2RequestReGetBlob value for this ID2Request_request_regetBlobType.
     * 
     * @param ID2RequestReGetBlob
     */
    public void setID2RequestReGetBlob(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestReGetBlobType ID2RequestReGetBlob) {
        this.ID2RequestReGetBlob = ID2RequestReGetBlob;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2Request_request_regetBlobType)) return false;
        ID2Request_request_regetBlobType other = (ID2Request_request_regetBlobType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2RequestReGetBlob==null && other.getID2RequestReGetBlob()==null) || 
             (this.ID2RequestReGetBlob!=null &&
              this.ID2RequestReGetBlob.equals(other.getID2RequestReGetBlob())));
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
        if (getID2RequestReGetBlob() != null) {
            _hashCode += getID2RequestReGetBlob().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2Request_request_regetBlobType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request_request_reget-blobType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2RequestReGetBlob");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-ReGet-Blob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-ReGet-BlobType"));
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
