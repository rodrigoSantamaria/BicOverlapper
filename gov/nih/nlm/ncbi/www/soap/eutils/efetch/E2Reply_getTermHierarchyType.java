/**
 * E2Reply_getTermHierarchyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class E2Reply_getTermHierarchyType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2HierNodeType entrez2HierNode;

    public E2Reply_getTermHierarchyType() {
    }

    public E2Reply_getTermHierarchyType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2HierNodeType entrez2HierNode) {
           this.entrez2HierNode = entrez2HierNode;
    }


    /**
     * Gets the entrez2HierNode value for this E2Reply_getTermHierarchyType.
     * 
     * @return entrez2HierNode
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2HierNodeType getEntrez2HierNode() {
        return entrez2HierNode;
    }


    /**
     * Sets the entrez2HierNode value for this E2Reply_getTermHierarchyType.
     * 
     * @param entrez2HierNode
     */
    public void setEntrez2HierNode(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2HierNodeType entrez2HierNode) {
        this.entrez2HierNode = entrez2HierNode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof E2Reply_getTermHierarchyType)) return false;
        E2Reply_getTermHierarchyType other = (E2Reply_getTermHierarchyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2HierNode==null && other.getEntrez2HierNode()==null) || 
             (this.entrez2HierNode!=null &&
              this.entrez2HierNode.equals(other.getEntrez2HierNode())));
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
        if (getEntrez2HierNode() != null) {
            _hashCode += getEntrez2HierNode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(E2Reply_getTermHierarchyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "E2Reply_get-term-hierarchyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2HierNode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-hier-node"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-hier-nodeType"));
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
