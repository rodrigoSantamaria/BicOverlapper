/**
 * SeqTreeNode_children_footprintType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqTreeNode_children_footprintType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNode_children_footprint_seqRangeType seqTreeNode_children_footprint_seqRange;

    private java.lang.String seqTreeNode_children_footprint_rowId;

    public SeqTreeNode_children_footprintType() {
    }

    public SeqTreeNode_children_footprintType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNode_children_footprint_seqRangeType seqTreeNode_children_footprint_seqRange,
           java.lang.String seqTreeNode_children_footprint_rowId) {
           this.seqTreeNode_children_footprint_seqRange = seqTreeNode_children_footprint_seqRange;
           this.seqTreeNode_children_footprint_rowId = seqTreeNode_children_footprint_rowId;
    }


    /**
     * Gets the seqTreeNode_children_footprint_seqRange value for this SeqTreeNode_children_footprintType.
     * 
     * @return seqTreeNode_children_footprint_seqRange
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNode_children_footprint_seqRangeType getSeqTreeNode_children_footprint_seqRange() {
        return seqTreeNode_children_footprint_seqRange;
    }


    /**
     * Sets the seqTreeNode_children_footprint_seqRange value for this SeqTreeNode_children_footprintType.
     * 
     * @param seqTreeNode_children_footprint_seqRange
     */
    public void setSeqTreeNode_children_footprint_seqRange(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNode_children_footprint_seqRangeType seqTreeNode_children_footprint_seqRange) {
        this.seqTreeNode_children_footprint_seqRange = seqTreeNode_children_footprint_seqRange;
    }


    /**
     * Gets the seqTreeNode_children_footprint_rowId value for this SeqTreeNode_children_footprintType.
     * 
     * @return seqTreeNode_children_footprint_rowId
     */
    public java.lang.String getSeqTreeNode_children_footprint_rowId() {
        return seqTreeNode_children_footprint_rowId;
    }


    /**
     * Sets the seqTreeNode_children_footprint_rowId value for this SeqTreeNode_children_footprintType.
     * 
     * @param seqTreeNode_children_footprint_rowId
     */
    public void setSeqTreeNode_children_footprint_rowId(java.lang.String seqTreeNode_children_footprint_rowId) {
        this.seqTreeNode_children_footprint_rowId = seqTreeNode_children_footprint_rowId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqTreeNode_children_footprintType)) return false;
        SeqTreeNode_children_footprintType other = (SeqTreeNode_children_footprintType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqTreeNode_children_footprint_seqRange==null && other.getSeqTreeNode_children_footprint_seqRange()==null) || 
             (this.seqTreeNode_children_footprint_seqRange!=null &&
              this.seqTreeNode_children_footprint_seqRange.equals(other.getSeqTreeNode_children_footprint_seqRange()))) &&
            ((this.seqTreeNode_children_footprint_rowId==null && other.getSeqTreeNode_children_footprint_rowId()==null) || 
             (this.seqTreeNode_children_footprint_rowId!=null &&
              this.seqTreeNode_children_footprint_rowId.equals(other.getSeqTreeNode_children_footprint_rowId())));
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
        if (getSeqTreeNode_children_footprint_seqRange() != null) {
            _hashCode += getSeqTreeNode_children_footprint_seqRange().hashCode();
        }
        if (getSeqTreeNode_children_footprint_rowId() != null) {
            _hashCode += getSeqTreeNode_children_footprint_rowId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqTreeNode_children_footprintType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqTree-node_children_footprintType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqTreeNode_children_footprint_seqRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqTree-node_children_footprint_seqRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqTree-node_children_footprint_seqRangeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqTreeNode_children_footprint_rowId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqTree-node_children_footprint_rowId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
