/**
 * ID2SSeqDescrInfo_bioseqSetsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SSeqDescrInfo_bioseqSetsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqSetIdsType ID2SBioseqSetIds;

    public ID2SSeqDescrInfo_bioseqSetsType() {
    }

    public ID2SSeqDescrInfo_bioseqSetsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqSetIdsType ID2SBioseqSetIds) {
           this.ID2SBioseqSetIds = ID2SBioseqSetIds;
    }


    /**
     * Gets the ID2SBioseqSetIds value for this ID2SSeqDescrInfo_bioseqSetsType.
     * 
     * @return ID2SBioseqSetIds
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqSetIdsType getID2SBioseqSetIds() {
        return ID2SBioseqSetIds;
    }


    /**
     * Sets the ID2SBioseqSetIds value for this ID2SSeqDescrInfo_bioseqSetsType.
     * 
     * @param ID2SBioseqSetIds
     */
    public void setID2SBioseqSetIds(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqSetIdsType ID2SBioseqSetIds) {
        this.ID2SBioseqSetIds = ID2SBioseqSetIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SSeqDescrInfo_bioseqSetsType)) return false;
        ID2SSeqDescrInfo_bioseqSetsType other = (ID2SSeqDescrInfo_bioseqSetsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SBioseqSetIds==null && other.getID2SBioseqSetIds()==null) || 
             (this.ID2SBioseqSetIds!=null &&
              this.ID2SBioseqSetIds.equals(other.getID2SBioseqSetIds())));
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
        if (getID2SBioseqSetIds() != null) {
            _hashCode += getID2SBioseqSetIds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SSeqDescrInfo_bioseqSetsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Seq-descr-Info_bioseq-setsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SBioseqSetIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseq-set-Ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseq-set-IdsType"));
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
