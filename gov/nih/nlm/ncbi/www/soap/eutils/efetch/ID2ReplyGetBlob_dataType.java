/**
 * ID2ReplyGetBlob_dataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2ReplyGetBlob_dataType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyDataType ID2ReplyData;

    public ID2ReplyGetBlob_dataType() {
    }

    public ID2ReplyGetBlob_dataType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyDataType ID2ReplyData) {
           this.ID2ReplyData = ID2ReplyData;
    }


    /**
     * Gets the ID2ReplyData value for this ID2ReplyGetBlob_dataType.
     * 
     * @return ID2ReplyData
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyDataType getID2ReplyData() {
        return ID2ReplyData;
    }


    /**
     * Sets the ID2ReplyData value for this ID2ReplyGetBlob_dataType.
     * 
     * @param ID2ReplyData
     */
    public void setID2ReplyData(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyDataType ID2ReplyData) {
        this.ID2ReplyData = ID2ReplyData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2ReplyGetBlob_dataType)) return false;
        ID2ReplyGetBlob_dataType other = (ID2ReplyGetBlob_dataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2ReplyData==null && other.getID2ReplyData()==null) || 
             (this.ID2ReplyData!=null &&
              this.ID2ReplyData.equals(other.getID2ReplyData())));
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
        if (getID2ReplyData() != null) {
            _hashCode += getID2ReplyData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2ReplyGetBlob_dataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Blob_dataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2ReplyData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-DataType"));
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
