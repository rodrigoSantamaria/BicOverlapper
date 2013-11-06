/**
 * ID2Request_request_getBlobInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2Request_request_getBlobInfoType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfoType ID2RequestGetBlobInfo;

    public ID2Request_request_getBlobInfoType() {
    }

    public ID2Request_request_getBlobInfoType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfoType ID2RequestGetBlobInfo) {
           this.ID2RequestGetBlobInfo = ID2RequestGetBlobInfo;
    }


    /**
     * Gets the ID2RequestGetBlobInfo value for this ID2Request_request_getBlobInfoType.
     * 
     * @return ID2RequestGetBlobInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfoType getID2RequestGetBlobInfo() {
        return ID2RequestGetBlobInfo;
    }


    /**
     * Sets the ID2RequestGetBlobInfo value for this ID2Request_request_getBlobInfoType.
     * 
     * @param ID2RequestGetBlobInfo
     */
    public void setID2RequestGetBlobInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetBlobInfoType ID2RequestGetBlobInfo) {
        this.ID2RequestGetBlobInfo = ID2RequestGetBlobInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2Request_request_getBlobInfoType)) return false;
        ID2Request_request_getBlobInfoType other = (ID2Request_request_getBlobInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2RequestGetBlobInfo==null && other.getID2RequestGetBlobInfo()==null) || 
             (this.ID2RequestGetBlobInfo!=null &&
              this.ID2RequestGetBlobInfo.equals(other.getID2RequestGetBlobInfo())));
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
        if (getID2RequestGetBlobInfo() != null) {
            _hashCode += getID2RequestGetBlobInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2Request_request_getBlobInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request_request_get-blob-infoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2RequestGetBlobInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-Info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Blob-InfoType"));
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
