/**
 * BiostrucGraph_moleculeGraphsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucGraph_moleculeGraphsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MoleculeGraphType[] moleculeGraph;

    public BiostrucGraph_moleculeGraphsType() {
    }

    public BiostrucGraph_moleculeGraphsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MoleculeGraphType[] moleculeGraph) {
           this.moleculeGraph = moleculeGraph;
    }


    /**
     * Gets the moleculeGraph value for this BiostrucGraph_moleculeGraphsType.
     * 
     * @return moleculeGraph
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MoleculeGraphType[] getMoleculeGraph() {
        return moleculeGraph;
    }


    /**
     * Sets the moleculeGraph value for this BiostrucGraph_moleculeGraphsType.
     * 
     * @param moleculeGraph
     */
    public void setMoleculeGraph(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MoleculeGraphType[] moleculeGraph) {
        this.moleculeGraph = moleculeGraph;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MoleculeGraphType getMoleculeGraph(int i) {
        return this.moleculeGraph[i];
    }

    public void setMoleculeGraph(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.MoleculeGraphType _value) {
        this.moleculeGraph[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucGraph_moleculeGraphsType)) return false;
        BiostrucGraph_moleculeGraphsType other = (BiostrucGraph_moleculeGraphsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.moleculeGraph==null && other.getMoleculeGraph()==null) || 
             (this.moleculeGraph!=null &&
              java.util.Arrays.equals(this.moleculeGraph, other.getMoleculeGraph())));
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
        if (getMoleculeGraph() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMoleculeGraph());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMoleculeGraph(), i);
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
        new org.apache.axis.description.TypeDesc(BiostrucGraph_moleculeGraphsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-graph_molecule-graphsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moleculeGraph");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Molecule-graph"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Molecule-graphType"));
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
