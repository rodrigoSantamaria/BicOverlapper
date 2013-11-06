/**
 * NodeFeatureSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class NodeFeatureSetType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.NodeFeatureType[] nodeFeature;

    public NodeFeatureSetType() {
    }

    public NodeFeatureSetType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.NodeFeatureType[] nodeFeature) {
           this.nodeFeature = nodeFeature;
    }


    /**
     * Gets the nodeFeature value for this NodeFeatureSetType.
     * 
     * @return nodeFeature
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.NodeFeatureType[] getNodeFeature() {
        return nodeFeature;
    }


    /**
     * Sets the nodeFeature value for this NodeFeatureSetType.
     * 
     * @param nodeFeature
     */
    public void setNodeFeature(gov.nih.nlm.ncbi.www.soap.eutils.efetch.NodeFeatureType[] nodeFeature) {
        this.nodeFeature = nodeFeature;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.NodeFeatureType getNodeFeature(int i) {
        return this.nodeFeature[i];
    }

    public void setNodeFeature(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.NodeFeatureType _value) {
        this.nodeFeature[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NodeFeatureSetType)) return false;
        NodeFeatureSetType other = (NodeFeatureSetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nodeFeature==null && other.getNodeFeature()==null) || 
             (this.nodeFeature!=null &&
              java.util.Arrays.equals(this.nodeFeature, other.getNodeFeature())));
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
        if (getNodeFeature() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNodeFeature());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNodeFeature(), i);
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
        new org.apache.axis.description.TypeDesc(NodeFeatureSetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NodeFeatureSetType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeFeature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NodeFeature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NodeFeatureType"));
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
