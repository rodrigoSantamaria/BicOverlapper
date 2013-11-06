/**
 * ID1SeqEntryInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID1SeqEntryInfoType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1SeqEntryInfo_blobInfoType ID1SeqEntryInfo_blobInfo;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1SeqEntryInfo_blobType ID1SeqEntryInfo_blob;

    public ID1SeqEntryInfoType() {
    }

    public ID1SeqEntryInfoType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1SeqEntryInfo_blobInfoType ID1SeqEntryInfo_blobInfo,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1SeqEntryInfo_blobType ID1SeqEntryInfo_blob) {
           this.ID1SeqEntryInfo_blobInfo = ID1SeqEntryInfo_blobInfo;
           this.ID1SeqEntryInfo_blob = ID1SeqEntryInfo_blob;
    }


    /**
     * Gets the ID1SeqEntryInfo_blobInfo value for this ID1SeqEntryInfoType.
     * 
     * @return ID1SeqEntryInfo_blobInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1SeqEntryInfo_blobInfoType getID1SeqEntryInfo_blobInfo() {
        return ID1SeqEntryInfo_blobInfo;
    }


    /**
     * Sets the ID1SeqEntryInfo_blobInfo value for this ID1SeqEntryInfoType.
     * 
     * @param ID1SeqEntryInfo_blobInfo
     */
    public void setID1SeqEntryInfo_blobInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1SeqEntryInfo_blobInfoType ID1SeqEntryInfo_blobInfo) {
        this.ID1SeqEntryInfo_blobInfo = ID1SeqEntryInfo_blobInfo;
    }


    /**
     * Gets the ID1SeqEntryInfo_blob value for this ID1SeqEntryInfoType.
     * 
     * @return ID1SeqEntryInfo_blob
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1SeqEntryInfo_blobType getID1SeqEntryInfo_blob() {
        return ID1SeqEntryInfo_blob;
    }


    /**
     * Sets the ID1SeqEntryInfo_blob value for this ID1SeqEntryInfoType.
     * 
     * @param ID1SeqEntryInfo_blob
     */
    public void setID1SeqEntryInfo_blob(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID1SeqEntryInfo_blobType ID1SeqEntryInfo_blob) {
        this.ID1SeqEntryInfo_blob = ID1SeqEntryInfo_blob;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID1SeqEntryInfoType)) return false;
        ID1SeqEntryInfoType other = (ID1SeqEntryInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID1SeqEntryInfo_blobInfo==null && other.getID1SeqEntryInfo_blobInfo()==null) || 
             (this.ID1SeqEntryInfo_blobInfo!=null &&
              this.ID1SeqEntryInfo_blobInfo.equals(other.getID1SeqEntryInfo_blobInfo()))) &&
            ((this.ID1SeqEntryInfo_blob==null && other.getID1SeqEntryInfo_blob()==null) || 
             (this.ID1SeqEntryInfo_blob!=null &&
              this.ID1SeqEntryInfo_blob.equals(other.getID1SeqEntryInfo_blob())));
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
        if (getID1SeqEntryInfo_blobInfo() != null) {
            _hashCode += getID1SeqEntryInfo_blobInfo().hashCode();
        }
        if (getID1SeqEntryInfo_blob() != null) {
            _hashCode += getID1SeqEntryInfo_blob().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID1SeqEntryInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID1SeqEntry-infoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID1SeqEntryInfo_blobInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID1SeqEntry-info_blob-info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID1SeqEntry-info_blob-infoType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID1SeqEntryInfo_blob");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID1SeqEntry-info_blob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID1SeqEntry-info_blobType"));
        elemField.setMinOccurs(0);
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
