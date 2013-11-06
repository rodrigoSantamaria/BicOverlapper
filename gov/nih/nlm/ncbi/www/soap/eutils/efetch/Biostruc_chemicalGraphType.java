/**
 * Biostruc_chemicalGraphType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Biostruc_chemicalGraphType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraphType biostrucGraph;

    public Biostruc_chemicalGraphType() {
    }

    public Biostruc_chemicalGraphType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraphType biostrucGraph) {
           this.biostrucGraph = biostrucGraph;
    }


    /**
     * Gets the biostrucGraph value for this Biostruc_chemicalGraphType.
     * 
     * @return biostrucGraph
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraphType getBiostrucGraph() {
        return biostrucGraph;
    }


    /**
     * Sets the biostrucGraph value for this Biostruc_chemicalGraphType.
     * 
     * @param biostrucGraph
     */
    public void setBiostrucGraph(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraphType biostrucGraph) {
        this.biostrucGraph = biostrucGraph;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Biostruc_chemicalGraphType)) return false;
        Biostruc_chemicalGraphType other = (Biostruc_chemicalGraphType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucGraph==null && other.getBiostrucGraph()==null) || 
             (this.biostrucGraph!=null &&
              this.biostrucGraph.equals(other.getBiostrucGraph())));
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
        if (getBiostrucGraph() != null) {
            _hashCode += getBiostrucGraph().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Biostruc_chemicalGraphType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc_chemical-graphType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucGraph");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-graph"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-graphType"));
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
