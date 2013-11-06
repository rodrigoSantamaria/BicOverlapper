/**
 * ID2SBioseqInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SBioseqInfoType  implements java.io.Serializable {
    private java.lang.String ID2SBioseqInfo_gapCount;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqInfo_seqMapHasRefType ID2SBioseqInfo_seqMapHasRef;

    public ID2SBioseqInfoType() {
    }

    public ID2SBioseqInfoType(
           java.lang.String ID2SBioseqInfo_gapCount,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqInfo_seqMapHasRefType ID2SBioseqInfo_seqMapHasRef) {
           this.ID2SBioseqInfo_gapCount = ID2SBioseqInfo_gapCount;
           this.ID2SBioseqInfo_seqMapHasRef = ID2SBioseqInfo_seqMapHasRef;
    }


    /**
     * Gets the ID2SBioseqInfo_gapCount value for this ID2SBioseqInfoType.
     * 
     * @return ID2SBioseqInfo_gapCount
     */
    public java.lang.String getID2SBioseqInfo_gapCount() {
        return ID2SBioseqInfo_gapCount;
    }


    /**
     * Sets the ID2SBioseqInfo_gapCount value for this ID2SBioseqInfoType.
     * 
     * @param ID2SBioseqInfo_gapCount
     */
    public void setID2SBioseqInfo_gapCount(java.lang.String ID2SBioseqInfo_gapCount) {
        this.ID2SBioseqInfo_gapCount = ID2SBioseqInfo_gapCount;
    }


    /**
     * Gets the ID2SBioseqInfo_seqMapHasRef value for this ID2SBioseqInfoType.
     * 
     * @return ID2SBioseqInfo_seqMapHasRef
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqInfo_seqMapHasRefType getID2SBioseqInfo_seqMapHasRef() {
        return ID2SBioseqInfo_seqMapHasRef;
    }


    /**
     * Sets the ID2SBioseqInfo_seqMapHasRef value for this ID2SBioseqInfoType.
     * 
     * @param ID2SBioseqInfo_seqMapHasRef
     */
    public void setID2SBioseqInfo_seqMapHasRef(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqInfo_seqMapHasRefType ID2SBioseqInfo_seqMapHasRef) {
        this.ID2SBioseqInfo_seqMapHasRef = ID2SBioseqInfo_seqMapHasRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SBioseqInfoType)) return false;
        ID2SBioseqInfoType other = (ID2SBioseqInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SBioseqInfo_gapCount==null && other.getID2SBioseqInfo_gapCount()==null) || 
             (this.ID2SBioseqInfo_gapCount!=null &&
              this.ID2SBioseqInfo_gapCount.equals(other.getID2SBioseqInfo_gapCount()))) &&
            ((this.ID2SBioseqInfo_seqMapHasRef==null && other.getID2SBioseqInfo_seqMapHasRef()==null) || 
             (this.ID2SBioseqInfo_seqMapHasRef!=null &&
              this.ID2SBioseqInfo_seqMapHasRef.equals(other.getID2SBioseqInfo_seqMapHasRef())));
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
        if (getID2SBioseqInfo_gapCount() != null) {
            _hashCode += getID2SBioseqInfo_gapCount().hashCode();
        }
        if (getID2SBioseqInfo_seqMapHasRef() != null) {
            _hashCode += getID2SBioseqInfo_seqMapHasRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SBioseqInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseq-InfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SBioseqInfo_gapCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseq-Info_gap-count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SBioseqInfo_seqMapHasRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseq-Info_seq-map-has-ref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseq-Info_seq-map-has-refType"));
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
