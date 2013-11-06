/**
 * SeqAnnot_data_graphType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqAnnot_data_graphType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqGraphType[] seqGraph;

    public SeqAnnot_data_graphType() {
    }

    public SeqAnnot_data_graphType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqGraphType[] seqGraph) {
           this.seqGraph = seqGraph;
    }


    /**
     * Gets the seqGraph value for this SeqAnnot_data_graphType.
     * 
     * @return seqGraph
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqGraphType[] getSeqGraph() {
        return seqGraph;
    }


    /**
     * Sets the seqGraph value for this SeqAnnot_data_graphType.
     * 
     * @param seqGraph
     */
    public void setSeqGraph(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqGraphType[] seqGraph) {
        this.seqGraph = seqGraph;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqGraphType getSeqGraph(int i) {
        return this.seqGraph[i];
    }

    public void setSeqGraph(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqGraphType _value) {
        this.seqGraph[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqAnnot_data_graphType)) return false;
        SeqAnnot_data_graphType other = (SeqAnnot_data_graphType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqGraph==null && other.getSeqGraph()==null) || 
             (this.seqGraph!=null &&
              java.util.Arrays.equals(this.seqGraph, other.getSeqGraph())));
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
        if (getSeqGraph() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeqGraph());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeqGraph(), i);
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
        new org.apache.axis.description.TypeDesc(SeqAnnot_data_graphType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annot_data_graphType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqGraph");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-graph"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-graphType"));
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
