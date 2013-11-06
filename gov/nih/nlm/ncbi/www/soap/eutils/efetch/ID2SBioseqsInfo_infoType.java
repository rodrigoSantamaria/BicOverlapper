/**
 * ID2SBioseqsInfo_infoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SBioseqsInfo_infoType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqInfoType ID2SBioseqInfo;

    public ID2SBioseqsInfo_infoType() {
    }

    public ID2SBioseqsInfo_infoType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqInfoType ID2SBioseqInfo) {
           this.ID2SBioseqInfo = ID2SBioseqInfo;
    }


    /**
     * Gets the ID2SBioseqInfo value for this ID2SBioseqsInfo_infoType.
     * 
     * @return ID2SBioseqInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqInfoType getID2SBioseqInfo() {
        return ID2SBioseqInfo;
    }


    /**
     * Sets the ID2SBioseqInfo value for this ID2SBioseqsInfo_infoType.
     * 
     * @param ID2SBioseqInfo
     */
    public void setID2SBioseqInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqInfoType ID2SBioseqInfo) {
        this.ID2SBioseqInfo = ID2SBioseqInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SBioseqsInfo_infoType)) return false;
        ID2SBioseqsInfo_infoType other = (ID2SBioseqsInfo_infoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SBioseqInfo==null && other.getID2SBioseqInfo()==null) || 
             (this.ID2SBioseqInfo!=null &&
              this.ID2SBioseqInfo.equals(other.getID2SBioseqInfo())));
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
        if (getID2SBioseqInfo() != null) {
            _hashCode += getID2SBioseqInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SBioseqsInfo_infoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseqs-Info_infoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SBioseqInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseq-Info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseq-InfoType"));
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
