/**
 * NodeAnnotationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class NodeAnnotationType  implements java.io.Serializable {
    private java.lang.String nodeAnnotation_presentInChildCD;

    private java.lang.String nodeAnnotation_note;

    public NodeAnnotationType() {
    }

    public NodeAnnotationType(
           java.lang.String nodeAnnotation_presentInChildCD,
           java.lang.String nodeAnnotation_note) {
           this.nodeAnnotation_presentInChildCD = nodeAnnotation_presentInChildCD;
           this.nodeAnnotation_note = nodeAnnotation_note;
    }


    /**
     * Gets the nodeAnnotation_presentInChildCD value for this NodeAnnotationType.
     * 
     * @return nodeAnnotation_presentInChildCD
     */
    public java.lang.String getNodeAnnotation_presentInChildCD() {
        return nodeAnnotation_presentInChildCD;
    }


    /**
     * Sets the nodeAnnotation_presentInChildCD value for this NodeAnnotationType.
     * 
     * @param nodeAnnotation_presentInChildCD
     */
    public void setNodeAnnotation_presentInChildCD(java.lang.String nodeAnnotation_presentInChildCD) {
        this.nodeAnnotation_presentInChildCD = nodeAnnotation_presentInChildCD;
    }


    /**
     * Gets the nodeAnnotation_note value for this NodeAnnotationType.
     * 
     * @return nodeAnnotation_note
     */
    public java.lang.String getNodeAnnotation_note() {
        return nodeAnnotation_note;
    }


    /**
     * Sets the nodeAnnotation_note value for this NodeAnnotationType.
     * 
     * @param nodeAnnotation_note
     */
    public void setNodeAnnotation_note(java.lang.String nodeAnnotation_note) {
        this.nodeAnnotation_note = nodeAnnotation_note;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NodeAnnotationType)) return false;
        NodeAnnotationType other = (NodeAnnotationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nodeAnnotation_presentInChildCD==null && other.getNodeAnnotation_presentInChildCD()==null) || 
             (this.nodeAnnotation_presentInChildCD!=null &&
              this.nodeAnnotation_presentInChildCD.equals(other.getNodeAnnotation_presentInChildCD()))) &&
            ((this.nodeAnnotation_note==null && other.getNodeAnnotation_note()==null) || 
             (this.nodeAnnotation_note!=null &&
              this.nodeAnnotation_note.equals(other.getNodeAnnotation_note())));
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
        if (getNodeAnnotation_presentInChildCD() != null) {
            _hashCode += getNodeAnnotation_presentInChildCD().hashCode();
        }
        if (getNodeAnnotation_note() != null) {
            _hashCode += getNodeAnnotation_note().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NodeAnnotationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Node-annotationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeAnnotation_presentInChildCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Node-annotation_presentInChildCD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeAnnotation_note");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Node-annotation_note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
