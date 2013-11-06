/**
 * ID2SBioseqsInfo_bioseqsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SBioseqsInfo_bioseqsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqIdsType ID2SBioseqIds;

    public ID2SBioseqsInfo_bioseqsType() {
    }

    public ID2SBioseqsInfo_bioseqsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqIdsType ID2SBioseqIds) {
           this.ID2SBioseqIds = ID2SBioseqIds;
    }


    /**
     * Gets the ID2SBioseqIds value for this ID2SBioseqsInfo_bioseqsType.
     * 
     * @return ID2SBioseqIds
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqIdsType getID2SBioseqIds() {
        return ID2SBioseqIds;
    }


    /**
     * Sets the ID2SBioseqIds value for this ID2SBioseqsInfo_bioseqsType.
     * 
     * @param ID2SBioseqIds
     */
    public void setID2SBioseqIds(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqIdsType ID2SBioseqIds) {
        this.ID2SBioseqIds = ID2SBioseqIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SBioseqsInfo_bioseqsType)) return false;
        ID2SBioseqsInfo_bioseqsType other = (ID2SBioseqsInfo_bioseqsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SBioseqIds==null && other.getID2SBioseqIds()==null) || 
             (this.ID2SBioseqIds!=null &&
              this.ID2SBioseqIds.equals(other.getID2SBioseqIds())));
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
        if (getID2SBioseqIds() != null) {
            _hashCode += getID2SBioseqIds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SBioseqsInfo_bioseqsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseqs-Info_bioseqsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SBioseqIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseq-Ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseq-IdsType"));
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
