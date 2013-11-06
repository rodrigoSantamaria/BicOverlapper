/**
 * Cdd_seqtreeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cdd_seqtreeType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SequenceTreeType sequenceTree;

    public Cdd_seqtreeType() {
    }

    public Cdd_seqtreeType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SequenceTreeType sequenceTree) {
           this.sequenceTree = sequenceTree;
    }


    /**
     * Gets the sequenceTree value for this Cdd_seqtreeType.
     * 
     * @return sequenceTree
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SequenceTreeType getSequenceTree() {
        return sequenceTree;
    }


    /**
     * Sets the sequenceTree value for this Cdd_seqtreeType.
     * 
     * @param sequenceTree
     */
    public void setSequenceTree(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SequenceTreeType sequenceTree) {
        this.sequenceTree = sequenceTree;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cdd_seqtreeType)) return false;
        Cdd_seqtreeType other = (Cdd_seqtreeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sequenceTree==null && other.getSequenceTree()==null) || 
             (this.sequenceTree!=null &&
              this.sequenceTree.equals(other.getSequenceTree())));
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
        if (getSequenceTree() != null) {
            _hashCode += getSequenceTree().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cdd_seqtreeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_seqtreeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceTree");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Sequence-tree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Sequence-treeType"));
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
