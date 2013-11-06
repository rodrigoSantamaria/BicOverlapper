/**
 * HGAlignmentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class HGAlignmentType  implements java.io.Serializable {
    private java.lang.String HGAlignment_hgId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGAlignment_alignmentType HGAlignment_alignment;

    public HGAlignmentType() {
    }

    public HGAlignmentType(
           java.lang.String HGAlignment_hgId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGAlignment_alignmentType HGAlignment_alignment) {
           this.HGAlignment_hgId = HGAlignment_hgId;
           this.HGAlignment_alignment = HGAlignment_alignment;
    }


    /**
     * Gets the HGAlignment_hgId value for this HGAlignmentType.
     * 
     * @return HGAlignment_hgId
     */
    public java.lang.String getHGAlignment_hgId() {
        return HGAlignment_hgId;
    }


    /**
     * Sets the HGAlignment_hgId value for this HGAlignmentType.
     * 
     * @param HGAlignment_hgId
     */
    public void setHGAlignment_hgId(java.lang.String HGAlignment_hgId) {
        this.HGAlignment_hgId = HGAlignment_hgId;
    }


    /**
     * Gets the HGAlignment_alignment value for this HGAlignmentType.
     * 
     * @return HGAlignment_alignment
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGAlignment_alignmentType getHGAlignment_alignment() {
        return HGAlignment_alignment;
    }


    /**
     * Sets the HGAlignment_alignment value for this HGAlignmentType.
     * 
     * @param HGAlignment_alignment
     */
    public void setHGAlignment_alignment(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGAlignment_alignmentType HGAlignment_alignment) {
        this.HGAlignment_alignment = HGAlignment_alignment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HGAlignmentType)) return false;
        HGAlignmentType other = (HGAlignmentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.HGAlignment_hgId==null && other.getHGAlignment_hgId()==null) || 
             (this.HGAlignment_hgId!=null &&
              this.HGAlignment_hgId.equals(other.getHGAlignment_hgId()))) &&
            ((this.HGAlignment_alignment==null && other.getHGAlignment_alignment()==null) || 
             (this.HGAlignment_alignment!=null &&
              this.HGAlignment_alignment.equals(other.getHGAlignment_alignment())));
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
        if (getHGAlignment_hgId() != null) {
            _hashCode += getHGAlignment_hgId().hashCode();
        }
        if (getHGAlignment_alignment() != null) {
            _hashCode += getHGAlignment_alignment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HGAlignmentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-AlignmentType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGAlignment_hgId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Alignment_hg-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGAlignment_alignment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Alignment_alignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Alignment_alignmentType"));
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
