/**
 * ID2ReplyGetBlobId_blobStateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2ReplyGetBlobId_blobStateType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2BlobStateType ID2BlobState;

    public ID2ReplyGetBlobId_blobStateType() {
    }

    public ID2ReplyGetBlobId_blobStateType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2BlobStateType ID2BlobState) {
           this.ID2BlobState = ID2BlobState;
    }


    /**
     * Gets the ID2BlobState value for this ID2ReplyGetBlobId_blobStateType.
     * 
     * @return ID2BlobState
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2BlobStateType getID2BlobState() {
        return ID2BlobState;
    }


    /**
     * Sets the ID2BlobState value for this ID2ReplyGetBlobId_blobStateType.
     * 
     * @param ID2BlobState
     */
    public void setID2BlobState(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2BlobStateType ID2BlobState) {
        this.ID2BlobState = ID2BlobState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2ReplyGetBlobId_blobStateType)) return false;
        ID2ReplyGetBlobId_blobStateType other = (ID2ReplyGetBlobId_blobStateType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2BlobState==null && other.getID2BlobState()==null) || 
             (this.ID2BlobState!=null &&
              this.ID2BlobState.equals(other.getID2BlobState())));
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
        if (getID2BlobState() != null) {
            _hashCode += getID2BlobState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2ReplyGetBlobId_blobStateType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Blob-Id_blob-stateType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2BlobState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Blob-State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Blob-StateType"));
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
