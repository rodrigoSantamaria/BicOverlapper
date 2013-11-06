/**
 * SeqTreeNode_childrenType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqTreeNode_childrenType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNode_children_childrenType seqTreeNode_children_children;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNode_children_footprintType seqTreeNode_children_footprint;

    public SeqTreeNode_childrenType() {
    }

    public SeqTreeNode_childrenType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNode_children_childrenType seqTreeNode_children_children,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNode_children_footprintType seqTreeNode_children_footprint) {
           this.seqTreeNode_children_children = seqTreeNode_children_children;
           this.seqTreeNode_children_footprint = seqTreeNode_children_footprint;
    }


    /**
     * Gets the seqTreeNode_children_children value for this SeqTreeNode_childrenType.
     * 
     * @return seqTreeNode_children_children
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNode_children_childrenType getSeqTreeNode_children_children() {
        return seqTreeNode_children_children;
    }


    /**
     * Sets the seqTreeNode_children_children value for this SeqTreeNode_childrenType.
     * 
     * @param seqTreeNode_children_children
     */
    public void setSeqTreeNode_children_children(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNode_children_childrenType seqTreeNode_children_children) {
        this.seqTreeNode_children_children = seqTreeNode_children_children;
    }


    /**
     * Gets the seqTreeNode_children_footprint value for this SeqTreeNode_childrenType.
     * 
     * @return seqTreeNode_children_footprint
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNode_children_footprintType getSeqTreeNode_children_footprint() {
        return seqTreeNode_children_footprint;
    }


    /**
     * Sets the seqTreeNode_children_footprint value for this SeqTreeNode_childrenType.
     * 
     * @param seqTreeNode_children_footprint
     */
    public void setSeqTreeNode_children_footprint(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNode_children_footprintType seqTreeNode_children_footprint) {
        this.seqTreeNode_children_footprint = seqTreeNode_children_footprint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqTreeNode_childrenType)) return false;
        SeqTreeNode_childrenType other = (SeqTreeNode_childrenType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqTreeNode_children_children==null && other.getSeqTreeNode_children_children()==null) || 
             (this.seqTreeNode_children_children!=null &&
              this.seqTreeNode_children_children.equals(other.getSeqTreeNode_children_children()))) &&
            ((this.seqTreeNode_children_footprint==null && other.getSeqTreeNode_children_footprint()==null) || 
             (this.seqTreeNode_children_footprint!=null &&
              this.seqTreeNode_children_footprint.equals(other.getSeqTreeNode_children_footprint())));
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
        if (getSeqTreeNode_children_children() != null) {
            _hashCode += getSeqTreeNode_children_children().hashCode();
        }
        if (getSeqTreeNode_children_footprint() != null) {
            _hashCode += getSeqTreeNode_children_footprint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqTreeNode_childrenType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqTree-node_childrenType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqTreeNode_children_children");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqTree-node_children_children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqTree-node_children_childrenType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqTreeNode_children_footprint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqTree-node_children_footprint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqTree-node_children_footprintType"));
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
