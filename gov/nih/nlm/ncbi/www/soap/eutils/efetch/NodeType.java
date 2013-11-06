/**
 * NodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class NodeType  implements java.io.Serializable {
    private java.lang.String node_id;

    private java.lang.String node_parent;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Node_featuresType node_features;

    public NodeType() {
    }

    public NodeType(
           java.lang.String node_id,
           java.lang.String node_parent,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Node_featuresType node_features) {
           this.node_id = node_id;
           this.node_parent = node_parent;
           this.node_features = node_features;
    }


    /**
     * Gets the node_id value for this NodeType.
     * 
     * @return node_id
     */
    public java.lang.String getNode_id() {
        return node_id;
    }


    /**
     * Sets the node_id value for this NodeType.
     * 
     * @param node_id
     */
    public void setNode_id(java.lang.String node_id) {
        this.node_id = node_id;
    }


    /**
     * Gets the node_parent value for this NodeType.
     * 
     * @return node_parent
     */
    public java.lang.String getNode_parent() {
        return node_parent;
    }


    /**
     * Sets the node_parent value for this NodeType.
     * 
     * @param node_parent
     */
    public void setNode_parent(java.lang.String node_parent) {
        this.node_parent = node_parent;
    }


    /**
     * Gets the node_features value for this NodeType.
     * 
     * @return node_features
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Node_featuresType getNode_features() {
        return node_features;
    }


    /**
     * Sets the node_features value for this NodeType.
     * 
     * @param node_features
     */
    public void setNode_features(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Node_featuresType node_features) {
        this.node_features = node_features;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NodeType)) return false;
        NodeType other = (NodeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.node_id==null && other.getNode_id()==null) || 
             (this.node_id!=null &&
              this.node_id.equals(other.getNode_id()))) &&
            ((this.node_parent==null && other.getNode_parent()==null) || 
             (this.node_parent!=null &&
              this.node_parent.equals(other.getNode_parent()))) &&
            ((this.node_features==null && other.getNode_features()==null) || 
             (this.node_features!=null &&
              this.node_features.equals(other.getNode_features())));
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
        if (getNode_id() != null) {
            _hashCode += getNode_id().hashCode();
        }
        if (getNode_parent() != null) {
            _hashCode += getNode_parent().hashCode();
        }
        if (getNode_features() != null) {
            _hashCode += getNode_features().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NodeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NodeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("node_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Node_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("node_parent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Node_parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("node_features");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Node_features"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Node_featuresType"));
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
