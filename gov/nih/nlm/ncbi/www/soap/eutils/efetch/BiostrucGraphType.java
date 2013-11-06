/**
 * BiostrucGraphType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucGraphType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraph_descrType biostrucGraph_descr;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraph_moleculeGraphsType biostrucGraph_moleculeGraphs;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraph_interMoleculeBondsType biostrucGraph_interMoleculeBonds;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraph_residueGraphsType biostrucGraph_residueGraphs;

    public BiostrucGraphType() {
    }

    public BiostrucGraphType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraph_descrType biostrucGraph_descr,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraph_moleculeGraphsType biostrucGraph_moleculeGraphs,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraph_interMoleculeBondsType biostrucGraph_interMoleculeBonds,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraph_residueGraphsType biostrucGraph_residueGraphs) {
           this.biostrucGraph_descr = biostrucGraph_descr;
           this.biostrucGraph_moleculeGraphs = biostrucGraph_moleculeGraphs;
           this.biostrucGraph_interMoleculeBonds = biostrucGraph_interMoleculeBonds;
           this.biostrucGraph_residueGraphs = biostrucGraph_residueGraphs;
    }


    /**
     * Gets the biostrucGraph_descr value for this BiostrucGraphType.
     * 
     * @return biostrucGraph_descr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraph_descrType getBiostrucGraph_descr() {
        return biostrucGraph_descr;
    }


    /**
     * Sets the biostrucGraph_descr value for this BiostrucGraphType.
     * 
     * @param biostrucGraph_descr
     */
    public void setBiostrucGraph_descr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraph_descrType biostrucGraph_descr) {
        this.biostrucGraph_descr = biostrucGraph_descr;
    }


    /**
     * Gets the biostrucGraph_moleculeGraphs value for this BiostrucGraphType.
     * 
     * @return biostrucGraph_moleculeGraphs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraph_moleculeGraphsType getBiostrucGraph_moleculeGraphs() {
        return biostrucGraph_moleculeGraphs;
    }


    /**
     * Sets the biostrucGraph_moleculeGraphs value for this BiostrucGraphType.
     * 
     * @param biostrucGraph_moleculeGraphs
     */
    public void setBiostrucGraph_moleculeGraphs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraph_moleculeGraphsType biostrucGraph_moleculeGraphs) {
        this.biostrucGraph_moleculeGraphs = biostrucGraph_moleculeGraphs;
    }


    /**
     * Gets the biostrucGraph_interMoleculeBonds value for this BiostrucGraphType.
     * 
     * @return biostrucGraph_interMoleculeBonds
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraph_interMoleculeBondsType getBiostrucGraph_interMoleculeBonds() {
        return biostrucGraph_interMoleculeBonds;
    }


    /**
     * Sets the biostrucGraph_interMoleculeBonds value for this BiostrucGraphType.
     * 
     * @param biostrucGraph_interMoleculeBonds
     */
    public void setBiostrucGraph_interMoleculeBonds(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraph_interMoleculeBondsType biostrucGraph_interMoleculeBonds) {
        this.biostrucGraph_interMoleculeBonds = biostrucGraph_interMoleculeBonds;
    }


    /**
     * Gets the biostrucGraph_residueGraphs value for this BiostrucGraphType.
     * 
     * @return biostrucGraph_residueGraphs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraph_residueGraphsType getBiostrucGraph_residueGraphs() {
        return biostrucGraph_residueGraphs;
    }


    /**
     * Sets the biostrucGraph_residueGraphs value for this BiostrucGraphType.
     * 
     * @param biostrucGraph_residueGraphs
     */
    public void setBiostrucGraph_residueGraphs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucGraph_residueGraphsType biostrucGraph_residueGraphs) {
        this.biostrucGraph_residueGraphs = biostrucGraph_residueGraphs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucGraphType)) return false;
        BiostrucGraphType other = (BiostrucGraphType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucGraph_descr==null && other.getBiostrucGraph_descr()==null) || 
             (this.biostrucGraph_descr!=null &&
              this.biostrucGraph_descr.equals(other.getBiostrucGraph_descr()))) &&
            ((this.biostrucGraph_moleculeGraphs==null && other.getBiostrucGraph_moleculeGraphs()==null) || 
             (this.biostrucGraph_moleculeGraphs!=null &&
              this.biostrucGraph_moleculeGraphs.equals(other.getBiostrucGraph_moleculeGraphs()))) &&
            ((this.biostrucGraph_interMoleculeBonds==null && other.getBiostrucGraph_interMoleculeBonds()==null) || 
             (this.biostrucGraph_interMoleculeBonds!=null &&
              this.biostrucGraph_interMoleculeBonds.equals(other.getBiostrucGraph_interMoleculeBonds()))) &&
            ((this.biostrucGraph_residueGraphs==null && other.getBiostrucGraph_residueGraphs()==null) || 
             (this.biostrucGraph_residueGraphs!=null &&
              this.biostrucGraph_residueGraphs.equals(other.getBiostrucGraph_residueGraphs())));
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
        if (getBiostrucGraph_descr() != null) {
            _hashCode += getBiostrucGraph_descr().hashCode();
        }
        if (getBiostrucGraph_moleculeGraphs() != null) {
            _hashCode += getBiostrucGraph_moleculeGraphs().hashCode();
        }
        if (getBiostrucGraph_interMoleculeBonds() != null) {
            _hashCode += getBiostrucGraph_interMoleculeBonds().hashCode();
        }
        if (getBiostrucGraph_residueGraphs() != null) {
            _hashCode += getBiostrucGraph_residueGraphs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucGraphType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-graphType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucGraph_descr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-graph_descr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-graph_descrType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucGraph_moleculeGraphs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-graph_molecule-graphs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-graph_molecule-graphsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucGraph_interMoleculeBonds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-graph_inter-molecule-bonds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-graph_inter-molecule-bondsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucGraph_residueGraphs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-graph_residue-graphs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-graph_residue-graphsType"));
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
