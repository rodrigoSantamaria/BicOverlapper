/**
 * ID2SBioseqPlaceInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SBioseqPlaceInfoType  implements java.io.Serializable {
    private java.lang.String ID2SBioseqPlaceInfo_bioseqSet;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqPlaceInfo_seqIdsType ID2SBioseqPlaceInfo_seqIds;

    public ID2SBioseqPlaceInfoType() {
    }

    public ID2SBioseqPlaceInfoType(
           java.lang.String ID2SBioseqPlaceInfo_bioseqSet,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqPlaceInfo_seqIdsType ID2SBioseqPlaceInfo_seqIds) {
           this.ID2SBioseqPlaceInfo_bioseqSet = ID2SBioseqPlaceInfo_bioseqSet;
           this.ID2SBioseqPlaceInfo_seqIds = ID2SBioseqPlaceInfo_seqIds;
    }


    /**
     * Gets the ID2SBioseqPlaceInfo_bioseqSet value for this ID2SBioseqPlaceInfoType.
     * 
     * @return ID2SBioseqPlaceInfo_bioseqSet
     */
    public java.lang.String getID2SBioseqPlaceInfo_bioseqSet() {
        return ID2SBioseqPlaceInfo_bioseqSet;
    }


    /**
     * Sets the ID2SBioseqPlaceInfo_bioseqSet value for this ID2SBioseqPlaceInfoType.
     * 
     * @param ID2SBioseqPlaceInfo_bioseqSet
     */
    public void setID2SBioseqPlaceInfo_bioseqSet(java.lang.String ID2SBioseqPlaceInfo_bioseqSet) {
        this.ID2SBioseqPlaceInfo_bioseqSet = ID2SBioseqPlaceInfo_bioseqSet;
    }


    /**
     * Gets the ID2SBioseqPlaceInfo_seqIds value for this ID2SBioseqPlaceInfoType.
     * 
     * @return ID2SBioseqPlaceInfo_seqIds
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqPlaceInfo_seqIdsType getID2SBioseqPlaceInfo_seqIds() {
        return ID2SBioseqPlaceInfo_seqIds;
    }


    /**
     * Sets the ID2SBioseqPlaceInfo_seqIds value for this ID2SBioseqPlaceInfoType.
     * 
     * @param ID2SBioseqPlaceInfo_seqIds
     */
    public void setID2SBioseqPlaceInfo_seqIds(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqPlaceInfo_seqIdsType ID2SBioseqPlaceInfo_seqIds) {
        this.ID2SBioseqPlaceInfo_seqIds = ID2SBioseqPlaceInfo_seqIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SBioseqPlaceInfoType)) return false;
        ID2SBioseqPlaceInfoType other = (ID2SBioseqPlaceInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SBioseqPlaceInfo_bioseqSet==null && other.getID2SBioseqPlaceInfo_bioseqSet()==null) || 
             (this.ID2SBioseqPlaceInfo_bioseqSet!=null &&
              this.ID2SBioseqPlaceInfo_bioseqSet.equals(other.getID2SBioseqPlaceInfo_bioseqSet()))) &&
            ((this.ID2SBioseqPlaceInfo_seqIds==null && other.getID2SBioseqPlaceInfo_seqIds()==null) || 
             (this.ID2SBioseqPlaceInfo_seqIds!=null &&
              this.ID2SBioseqPlaceInfo_seqIds.equals(other.getID2SBioseqPlaceInfo_seqIds())));
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
        if (getID2SBioseqPlaceInfo_bioseqSet() != null) {
            _hashCode += getID2SBioseqPlaceInfo_bioseqSet().hashCode();
        }
        if (getID2SBioseqPlaceInfo_seqIds() != null) {
            _hashCode += getID2SBioseqPlaceInfo_seqIds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SBioseqPlaceInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseq-place-InfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SBioseqPlaceInfo_bioseqSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseq-place-Info_bioseq-set"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SBioseqPlaceInfo_seqIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseq-place-Info_seq-ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseq-place-Info_seq-idsType"));
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
