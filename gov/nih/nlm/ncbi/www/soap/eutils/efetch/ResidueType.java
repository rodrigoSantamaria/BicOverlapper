/**
 * ResidueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ResidueType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Residue_idType residue_id;

    private java.lang.String residue_name;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Residue_residueGraphType residue_residueGraph;

    public ResidueType() {
    }

    public ResidueType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Residue_idType residue_id,
           java.lang.String residue_name,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Residue_residueGraphType residue_residueGraph) {
           this.residue_id = residue_id;
           this.residue_name = residue_name;
           this.residue_residueGraph = residue_residueGraph;
    }


    /**
     * Gets the residue_id value for this ResidueType.
     * 
     * @return residue_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Residue_idType getResidue_id() {
        return residue_id;
    }


    /**
     * Sets the residue_id value for this ResidueType.
     * 
     * @param residue_id
     */
    public void setResidue_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Residue_idType residue_id) {
        this.residue_id = residue_id;
    }


    /**
     * Gets the residue_name value for this ResidueType.
     * 
     * @return residue_name
     */
    public java.lang.String getResidue_name() {
        return residue_name;
    }


    /**
     * Sets the residue_name value for this ResidueType.
     * 
     * @param residue_name
     */
    public void setResidue_name(java.lang.String residue_name) {
        this.residue_name = residue_name;
    }


    /**
     * Gets the residue_residueGraph value for this ResidueType.
     * 
     * @return residue_residueGraph
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Residue_residueGraphType getResidue_residueGraph() {
        return residue_residueGraph;
    }


    /**
     * Sets the residue_residueGraph value for this ResidueType.
     * 
     * @param residue_residueGraph
     */
    public void setResidue_residueGraph(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Residue_residueGraphType residue_residueGraph) {
        this.residue_residueGraph = residue_residueGraph;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResidueType)) return false;
        ResidueType other = (ResidueType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.residue_id==null && other.getResidue_id()==null) || 
             (this.residue_id!=null &&
              this.residue_id.equals(other.getResidue_id()))) &&
            ((this.residue_name==null && other.getResidue_name()==null) || 
             (this.residue_name!=null &&
              this.residue_name.equals(other.getResidue_name()))) &&
            ((this.residue_residueGraph==null && other.getResidue_residueGraph()==null) || 
             (this.residue_residueGraph!=null &&
              this.residue_residueGraph.equals(other.getResidue_residueGraph())));
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
        if (getResidue_id() != null) {
            _hashCode += getResidue_id().hashCode();
        }
        if (getResidue_name() != null) {
            _hashCode += getResidue_name().hashCode();
        }
        if (getResidue_residueGraph() != null) {
            _hashCode += getResidue_residueGraph().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResidueType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ResidueType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residue_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue_idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residue_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residue_residueGraph");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue_residue-graph"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue_residue-graphType"));
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
