/**
 * SeqGraph_graph_intType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqGraph_graph_intType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntGraphType intGraph;

    public SeqGraph_graph_intType() {
    }

    public SeqGraph_graph_intType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntGraphType intGraph) {
           this.intGraph = intGraph;
    }


    /**
     * Gets the intGraph value for this SeqGraph_graph_intType.
     * 
     * @return intGraph
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntGraphType getIntGraph() {
        return intGraph;
    }


    /**
     * Sets the intGraph value for this SeqGraph_graph_intType.
     * 
     * @param intGraph
     */
    public void setIntGraph(gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntGraphType intGraph) {
        this.intGraph = intGraph;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqGraph_graph_intType)) return false;
        SeqGraph_graph_intType other = (SeqGraph_graph_intType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.intGraph==null && other.getIntGraph()==null) || 
             (this.intGraph!=null &&
              this.intGraph.equals(other.getIntGraph())));
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
        if (getIntGraph() != null) {
            _hashCode += getIntGraph().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqGraph_graph_intType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-graph_graph_intType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intGraph");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Int-graph"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Int-graphType"));
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
