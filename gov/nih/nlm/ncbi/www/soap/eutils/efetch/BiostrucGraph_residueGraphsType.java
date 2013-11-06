/**
 * BiostrucGraph_residueGraphsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucGraph_residueGraphsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueGraphType[] residueGraph;

    public BiostrucGraph_residueGraphsType() {
    }

    public BiostrucGraph_residueGraphsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueGraphType[] residueGraph) {
           this.residueGraph = residueGraph;
    }


    /**
     * Gets the residueGraph value for this BiostrucGraph_residueGraphsType.
     * 
     * @return residueGraph
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueGraphType[] getResidueGraph() {
        return residueGraph;
    }


    /**
     * Sets the residueGraph value for this BiostrucGraph_residueGraphsType.
     * 
     * @param residueGraph
     */
    public void setResidueGraph(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueGraphType[] residueGraph) {
        this.residueGraph = residueGraph;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueGraphType getResidueGraph(int i) {
        return this.residueGraph[i];
    }

    public void setResidueGraph(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueGraphType _value) {
        this.residueGraph[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucGraph_residueGraphsType)) return false;
        BiostrucGraph_residueGraphsType other = (BiostrucGraph_residueGraphsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.residueGraph==null && other.getResidueGraph()==null) || 
             (this.residueGraph!=null &&
              java.util.Arrays.equals(this.residueGraph, other.getResidueGraph())));
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
        if (getResidueGraph() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResidueGraph());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResidueGraph(), i);
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
        new org.apache.axis.description.TypeDesc(BiostrucGraph_residueGraphsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-graph_residue-graphsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residueGraph");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-graph"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-graphType"));
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
