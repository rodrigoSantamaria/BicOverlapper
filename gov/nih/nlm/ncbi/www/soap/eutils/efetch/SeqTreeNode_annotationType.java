/**
 * SeqTreeNode_annotationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqTreeNode_annotationType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.NodeAnnotationType nodeAnnotation;

    public SeqTreeNode_annotationType() {
    }

    public SeqTreeNode_annotationType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.NodeAnnotationType nodeAnnotation) {
           this.nodeAnnotation = nodeAnnotation;
    }


    /**
     * Gets the nodeAnnotation value for this SeqTreeNode_annotationType.
     * 
     * @return nodeAnnotation
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.NodeAnnotationType getNodeAnnotation() {
        return nodeAnnotation;
    }


    /**
     * Sets the nodeAnnotation value for this SeqTreeNode_annotationType.
     * 
     * @param nodeAnnotation
     */
    public void setNodeAnnotation(gov.nih.nlm.ncbi.www.soap.eutils.efetch.NodeAnnotationType nodeAnnotation) {
        this.nodeAnnotation = nodeAnnotation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqTreeNode_annotationType)) return false;
        SeqTreeNode_annotationType other = (SeqTreeNode_annotationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nodeAnnotation==null && other.getNodeAnnotation()==null) || 
             (this.nodeAnnotation!=null &&
              this.nodeAnnotation.equals(other.getNodeAnnotation())));
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
        if (getNodeAnnotation() != null) {
            _hashCode += getNodeAnnotation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqTreeNode_annotationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SeqTree-node_annotationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeAnnotation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Node-annotation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Node-annotationType"));
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
