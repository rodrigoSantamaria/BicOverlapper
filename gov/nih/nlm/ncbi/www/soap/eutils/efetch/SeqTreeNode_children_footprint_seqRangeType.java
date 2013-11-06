/**
 * SeqTreeNode_children_footprint_seqRangeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqTreeNode_children_footprint_seqRangeType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqIntervalType seqInterval;

    public SeqTreeNode_children_footprint_seqRangeType() {
    }

    public SeqTreeNode_children_footprint_seqRangeType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqIntervalType seqInterval) {
           this.seqInterval = seqInterval;
    }


    /**
     * Gets the seqInterval value for this SeqTreeNode_children_footprint_seqRangeType.
     * 
     * @return seqInterval
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqIntervalType getSeqInterval() {
        return seqInterval;
    }


    /**
     * Sets the seqInterval value for this SeqTreeNode_children_footprint_seqRangeType.
     * 
     * @param seqInterval
     */
    public void setSeqInterval(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqIntervalType seqInterval) {
        this.seqInterval = seqInterval;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqTreeNode_children_footprint_seqRangeType)) return false;
        SeqTreeNode_children_footprint_seqRangeType other = (SeqTreeNode_children_footprint_seqRangeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqInterval==null && other.getSeqInterval()==null) || 
             (this.seqInterval!=null &&
              this.seqInterval.equals(other.getSeqInterval())));
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
        if (getSeqInterval() != null) {
            _hashCode += getSeqInterval().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqTreeNode_children_footprint_seqRangeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqTree-node_children_footprint_seqRangeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-interval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-intervalType"));
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
