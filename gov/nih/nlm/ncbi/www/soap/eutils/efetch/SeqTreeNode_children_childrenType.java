/**
 * SeqTreeNode_children_childrenType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqTreeNode_children_childrenType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNodeType[] seqTreeNode;

    public SeqTreeNode_children_childrenType() {
    }

    public SeqTreeNode_children_childrenType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNodeType[] seqTreeNode) {
           this.seqTreeNode = seqTreeNode;
    }


    /**
     * Gets the seqTreeNode value for this SeqTreeNode_children_childrenType.
     * 
     * @return seqTreeNode
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNodeType[] getSeqTreeNode() {
        return seqTreeNode;
    }


    /**
     * Sets the seqTreeNode value for this SeqTreeNode_children_childrenType.
     * 
     * @param seqTreeNode
     */
    public void setSeqTreeNode(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNodeType[] seqTreeNode) {
        this.seqTreeNode = seqTreeNode;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNodeType getSeqTreeNode(int i) {
        return this.seqTreeNode[i];
    }

    public void setSeqTreeNode(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqTreeNodeType _value) {
        this.seqTreeNode[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqTreeNode_children_childrenType)) return false;
        SeqTreeNode_children_childrenType other = (SeqTreeNode_children_childrenType) obj;
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
              java.util.Arrays.equals(this.seqTreeNode, other.getSeqTreeNode())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeqTreeNode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeqTreeNode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqTreeNode_children_childrenType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqTree-node_children_childrenType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqTreeNode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqTree-node"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqTree-nodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
