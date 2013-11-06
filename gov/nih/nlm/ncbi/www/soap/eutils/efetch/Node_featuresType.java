/**
 * Node_featuresType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Node_featuresType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.NodeFeatureSetType nodeFeatureSet;

    public Node_featuresType() {
    }

    public Node_featuresType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.NodeFeatureSetType nodeFeatureSet) {
           this.nodeFeatureSet = nodeFeatureSet;
    }


    /**
     * Gets the nodeFeatureSet value for this Node_featuresType.
     * 
     * @return nodeFeatureSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.NodeFeatureSetType getNodeFeatureSet() {
        return nodeFeatureSet;
    }


    /**
     * Sets the nodeFeatureSet value for this Node_featuresType.
     * 
     * @param nodeFeatureSet
     */
    public void setNodeFeatureSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.NodeFeatureSetType nodeFeatureSet) {
        this.nodeFeatureSet = nodeFeatureSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Node_featuresType)) return false;
        Node_featuresType other = (Node_featuresType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nodeFeatureSet==null && other.getNodeFeatureSet()==null) || 
             (this.nodeFeatureSet!=null &&
              this.nodeFeatureSet.equals(other.getNodeFeatureSet())));
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
        if (getNodeFeatureSet() != null) {
            _hashCode += getNodeFeatureSet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Node_featuresType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Node_featuresType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeFeatureSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NodeFeatureSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NodeFeatureSetType"));
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
