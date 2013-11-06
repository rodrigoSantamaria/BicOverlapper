/**
 * ID2SBioseqsInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SBioseqsInfoType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqsInfo_infoType ID2SBioseqsInfo_info;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqsInfo_bioseqsType ID2SBioseqsInfo_bioseqs;

    public ID2SBioseqsInfoType() {
    }

    public ID2SBioseqsInfoType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqsInfo_infoType ID2SBioseqsInfo_info,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqsInfo_bioseqsType ID2SBioseqsInfo_bioseqs) {
           this.ID2SBioseqsInfo_info = ID2SBioseqsInfo_info;
           this.ID2SBioseqsInfo_bioseqs = ID2SBioseqsInfo_bioseqs;
    }


    /**
     * Gets the ID2SBioseqsInfo_info value for this ID2SBioseqsInfoType.
     * 
     * @return ID2SBioseqsInfo_info
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqsInfo_infoType getID2SBioseqsInfo_info() {
        return ID2SBioseqsInfo_info;
    }


    /**
     * Sets the ID2SBioseqsInfo_info value for this ID2SBioseqsInfoType.
     * 
     * @param ID2SBioseqsInfo_info
     */
    public void setID2SBioseqsInfo_info(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqsInfo_infoType ID2SBioseqsInfo_info) {
        this.ID2SBioseqsInfo_info = ID2SBioseqsInfo_info;
    }


    /**
     * Gets the ID2SBioseqsInfo_bioseqs value for this ID2SBioseqsInfoType.
     * 
     * @return ID2SBioseqsInfo_bioseqs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqsInfo_bioseqsType getID2SBioseqsInfo_bioseqs() {
        return ID2SBioseqsInfo_bioseqs;
    }


    /**
     * Sets the ID2SBioseqsInfo_bioseqs value for this ID2SBioseqsInfoType.
     * 
     * @param ID2SBioseqsInfo_bioseqs
     */
    public void setID2SBioseqsInfo_bioseqs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqsInfo_bioseqsType ID2SBioseqsInfo_bioseqs) {
        this.ID2SBioseqsInfo_bioseqs = ID2SBioseqsInfo_bioseqs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SBioseqsInfoType)) return false;
        ID2SBioseqsInfoType other = (ID2SBioseqsInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SBioseqsInfo_info==null && other.getID2SBioseqsInfo_info()==null) || 
             (this.ID2SBioseqsInfo_info!=null &&
              this.ID2SBioseqsInfo_info.equals(other.getID2SBioseqsInfo_info()))) &&
            ((this.ID2SBioseqsInfo_bioseqs==null && other.getID2SBioseqsInfo_bioseqs()==null) || 
             (this.ID2SBioseqsInfo_bioseqs!=null &&
              this.ID2SBioseqsInfo_bioseqs.equals(other.getID2SBioseqsInfo_bioseqs())));
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
        if (getID2SBioseqsInfo_info() != null) {
            _hashCode += getID2SBioseqsInfo_info().hashCode();
        }
        if (getID2SBioseqsInfo_bioseqs() != null) {
            _hashCode += getID2SBioseqsInfo_bioseqs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SBioseqsInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseqs-InfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SBioseqsInfo_info");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseqs-Info_info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseqs-Info_infoType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SBioseqsInfo_bioseqs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseqs-Info_bioseqs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseqs-Info_bioseqsType"));
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
