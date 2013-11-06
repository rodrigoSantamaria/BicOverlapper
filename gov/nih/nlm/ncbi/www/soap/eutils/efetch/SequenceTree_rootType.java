/**
 * SequenceTree_rootType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SequenceTree_rootType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNodeType seqTreeNode;

    public SequenceTree_rootType() {
    }

    public SequenceTree_rootType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNodeType seqTreeNode) {
           this.seqTreeNode = seqTreeNode;
    }


    /**
     * Gets the seqTreeNode value for this SequenceTree_rootType.
     * 
     * @return seqTreeNode
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNodeType getSeqTreeNode() {
        return seqTreeNode;
    }


    /**
     * Sets the seqTreeNode value for this SequenceTree_rootType.
     * 
     * @param seqTreeNode
     */
    public void setSeqTreeNode(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNodeType seqTreeNode) {
        this.seqTreeNode = seqTreeNode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SequenceTree_rootType)) return false;
        SequenceTree_rootType other = (SequenceTree_rootType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqTreeNode==null && other.getSeqTreeNode()==null) || 
             (this.seqTreeNode!=null &&
              this.seqTreeNode.equals(other.getSeqTreeNode())));
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
        if (getSeqTreeNode() != null) {
            _hashCode += getSeqTreeNode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SequenceTree_rootType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Sequence-tree_rootType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqTreeNode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqTree-node"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqTree-nodeType"));
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
