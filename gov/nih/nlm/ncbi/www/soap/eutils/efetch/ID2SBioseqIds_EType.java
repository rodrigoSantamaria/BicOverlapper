/**
 * ID2SBioseqIds_EType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SBioseqIds_EType  implements java.io.Serializable {
    private java.lang.String ID2SBioseqIds_E_gi;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqIds_E_seqIdType ID2SBioseqIds_E_seqId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqIds_E_giRangeType ID2SBioseqIds_E_giRange;

    public ID2SBioseqIds_EType() {
    }

    public ID2SBioseqIds_EType(
           java.lang.String ID2SBioseqIds_E_gi,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqIds_E_seqIdType ID2SBioseqIds_E_seqId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqIds_E_giRangeType ID2SBioseqIds_E_giRange) {
           this.ID2SBioseqIds_E_gi = ID2SBioseqIds_E_gi;
           this.ID2SBioseqIds_E_seqId = ID2SBioseqIds_E_seqId;
           this.ID2SBioseqIds_E_giRange = ID2SBioseqIds_E_giRange;
    }


    /**
     * Gets the ID2SBioseqIds_E_gi value for this ID2SBioseqIds_EType.
     * 
     * @return ID2SBioseqIds_E_gi
     */
    public java.lang.String getID2SBioseqIds_E_gi() {
        return ID2SBioseqIds_E_gi;
    }


    /**
     * Sets the ID2SBioseqIds_E_gi value for this ID2SBioseqIds_EType.
     * 
     * @param ID2SBioseqIds_E_gi
     */
    public void setID2SBioseqIds_E_gi(java.lang.String ID2SBioseqIds_E_gi) {
        this.ID2SBioseqIds_E_gi = ID2SBioseqIds_E_gi;
    }


    /**
     * Gets the ID2SBioseqIds_E_seqId value for this ID2SBioseqIds_EType.
     * 
     * @return ID2SBioseqIds_E_seqId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqIds_E_seqIdType getID2SBioseqIds_E_seqId() {
        return ID2SBioseqIds_E_seqId;
    }


    /**
     * Sets the ID2SBioseqIds_E_seqId value for this ID2SBioseqIds_EType.
     * 
     * @param ID2SBioseqIds_E_seqId
     */
    public void setID2SBioseqIds_E_seqId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqIds_E_seqIdType ID2SBioseqIds_E_seqId) {
        this.ID2SBioseqIds_E_seqId = ID2SBioseqIds_E_seqId;
    }


    /**
     * Gets the ID2SBioseqIds_E_giRange value for this ID2SBioseqIds_EType.
     * 
     * @return ID2SBioseqIds_E_giRange
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqIds_E_giRangeType getID2SBioseqIds_E_giRange() {
        return ID2SBioseqIds_E_giRange;
    }


    /**
     * Sets the ID2SBioseqIds_E_giRange value for this ID2SBioseqIds_EType.
     * 
     * @param ID2SBioseqIds_E_giRange
     */
    public void setID2SBioseqIds_E_giRange(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SBioseqIds_E_giRangeType ID2SBioseqIds_E_giRange) {
        this.ID2SBioseqIds_E_giRange = ID2SBioseqIds_E_giRange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SBioseqIds_EType)) return false;
        ID2SBioseqIds_EType other = (ID2SBioseqIds_EType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SBioseqIds_E_gi==null && other.getID2SBioseqIds_E_gi()==null) || 
             (this.ID2SBioseqIds_E_gi!=null &&
              this.ID2SBioseqIds_E_gi.equals(other.getID2SBioseqIds_E_gi()))) &&
            ((this.ID2SBioseqIds_E_seqId==null && other.getID2SBioseqIds_E_seqId()==null) || 
             (this.ID2SBioseqIds_E_seqId!=null &&
              this.ID2SBioseqIds_E_seqId.equals(other.getID2SBioseqIds_E_seqId()))) &&
            ((this.ID2SBioseqIds_E_giRange==null && other.getID2SBioseqIds_E_giRange()==null) || 
             (this.ID2SBioseqIds_E_giRange!=null &&
              this.ID2SBioseqIds_E_giRange.equals(other.getID2SBioseqIds_E_giRange())));
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
        if (getID2SBioseqIds_E_gi() != null) {
            _hashCode += getID2SBioseqIds_E_gi().hashCode();
        }
        if (getID2SBioseqIds_E_seqId() != null) {
            _hashCode += getID2SBioseqIds_E_seqId().hashCode();
        }
        if (getID2SBioseqIds_E_giRange() != null) {
            _hashCode += getID2SBioseqIds_E_giRange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SBioseqIds_EType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseq-Ids_EType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SBioseqIds_E_gi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseq-Ids_E_gi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SBioseqIds_E_seqId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseq-Ids_E_seq-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseq-Ids_E_seq-idType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SBioseqIds_E_giRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseq-Ids_E_gi-range"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Bioseq-Ids_E_gi-rangeType"));
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
