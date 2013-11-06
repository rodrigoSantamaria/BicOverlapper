/**
 * NodeFeatureType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class NodeFeatureType  implements java.io.Serializable {
    private java.lang.String nodeFeature_featureid;

    private java.lang.String nodeFeature_value;

    public NodeFeatureType() {
    }

    public NodeFeatureType(
           java.lang.String nodeFeature_featureid,
           java.lang.String nodeFeature_value) {
           this.nodeFeature_featureid = nodeFeature_featureid;
           this.nodeFeature_value = nodeFeature_value;
    }


    /**
     * Gets the nodeFeature_featureid value for this NodeFeatureType.
     * 
     * @return nodeFeature_featureid
     */
    public java.lang.String getNodeFeature_featureid() {
        return nodeFeature_featureid;
    }


    /**
     * Sets the nodeFeature_featureid value for this NodeFeatureType.
     * 
     * @param nodeFeature_featureid
     */
    public void setNodeFeature_featureid(java.lang.String nodeFeature_featureid) {
        this.nodeFeature_featureid = nodeFeature_featureid;
    }


    /**
     * Gets the nodeFeature_value value for this NodeFeatureType.
     * 
     * @return nodeFeature_value
     */
    public java.lang.String getNodeFeature_value() {
        return nodeFeature_value;
    }


    /**
     * Sets the nodeFeature_value value for this NodeFeatureType.
     * 
     * @param nodeFeature_value
     */
    public void setNodeFeature_value(java.lang.String nodeFeature_value) {
        this.nodeFeature_value = nodeFeature_value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NodeFeatureType)) return false;
        NodeFeatureType other = (NodeFeatureType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nodeFeature_featureid==null && other.getNodeFeature_featureid()==null) || 
             (this.nodeFeature_featureid!=null &&
              this.nodeFeature_featureid.equals(other.getNodeFeature_featureid()))) &&
            ((this.nodeFeature_value==null && other.getNodeFeature_value()==null) || 
             (this.nodeFeature_value!=null &&
              this.nodeFeature_value.equals(other.getNodeFeature_value())));
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
        if (getNodeFeature_featureid() != null) {
            _hashCode += getNodeFeature_featureid().hashCode();
        }
        if (getNodeFeature_value() != null) {
            _hashCode += getNodeFeature_value().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NodeFeatureType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NodeFeatureType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeFeature_featureid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NodeFeature_featureid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeFeature_value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NodeFeature_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
