/**
 * SeqGraph_graph_byteType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqGraph_graph_byteType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ByteGraphType byteGraph;

    public SeqGraph_graph_byteType() {
    }

    public SeqGraph_graph_byteType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ByteGraphType byteGraph) {
           this.byteGraph = byteGraph;
    }


    /**
     * Gets the byteGraph value for this SeqGraph_graph_byteType.
     * 
     * @return byteGraph
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ByteGraphType getByteGraph() {
        return byteGraph;
    }


    /**
     * Sets the byteGraph value for this SeqGraph_graph_byteType.
     * 
     * @param byteGraph
     */
    public void setByteGraph(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ByteGraphType byteGraph) {
        this.byteGraph = byteGraph;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqGraph_graph_byteType)) return false;
        SeqGraph_graph_byteType other = (SeqGraph_graph_byteType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.byteGraph==null && other.getByteGraph()==null) || 
             (this.byteGraph!=null &&
              this.byteGraph.equals(other.getByteGraph())));
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
        if (getByteGraph() != null) {
            _hashCode += getByteGraph().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqGraph_graph_byteType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-graph_graph_byteType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byteGraph");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Byte-graph"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Byte-graphType"));
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
