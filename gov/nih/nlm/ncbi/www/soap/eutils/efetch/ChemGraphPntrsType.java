/**
 * ChemGraphPntrsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ChemGraphPntrsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphPntrs_atomsType chemGraphPntrs_atoms;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphPntrs_residuesType chemGraphPntrs_residues;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphPntrs_moleculesType chemGraphPntrs_molecules;

    public ChemGraphPntrsType() {
    }

    public ChemGraphPntrsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphPntrs_atomsType chemGraphPntrs_atoms,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphPntrs_residuesType chemGraphPntrs_residues,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphPntrs_moleculesType chemGraphPntrs_molecules) {
           this.chemGraphPntrs_atoms = chemGraphPntrs_atoms;
           this.chemGraphPntrs_residues = chemGraphPntrs_residues;
           this.chemGraphPntrs_molecules = chemGraphPntrs_molecules;
    }


    /**
     * Gets the chemGraphPntrs_atoms value for this ChemGraphPntrsType.
     * 
     * @return chemGraphPntrs_atoms
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphPntrs_atomsType getChemGraphPntrs_atoms() {
        return chemGraphPntrs_atoms;
    }


    /**
     * Sets the chemGraphPntrs_atoms value for this ChemGraphPntrsType.
     * 
     * @param chemGraphPntrs_atoms
     */
    public void setChemGraphPntrs_atoms(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphPntrs_atomsType chemGraphPntrs_atoms) {
        this.chemGraphPntrs_atoms = chemGraphPntrs_atoms;
    }


    /**
     * Gets the chemGraphPntrs_residues value for this ChemGraphPntrsType.
     * 
     * @return chemGraphPntrs_residues
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphPntrs_residuesType getChemGraphPntrs_residues() {
        return chemGraphPntrs_residues;
    }


    /**
     * Sets the chemGraphPntrs_residues value for this ChemGraphPntrsType.
     * 
     * @param chemGraphPntrs_residues
     */
    public void setChemGraphPntrs_residues(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphPntrs_residuesType chemGraphPntrs_residues) {
        this.chemGraphPntrs_residues = chemGraphPntrs_residues;
    }


    /**
     * Gets the chemGraphPntrs_molecules value for this ChemGraphPntrsType.
     * 
     * @return chemGraphPntrs_molecules
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphPntrs_moleculesType getChemGraphPntrs_molecules() {
        return chemGraphPntrs_molecules;
    }


    /**
     * Sets the chemGraphPntrs_molecules value for this ChemGraphPntrsType.
     * 
     * @param chemGraphPntrs_molecules
     */
    public void setChemGraphPntrs_molecules(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ChemGraphPntrs_moleculesType chemGraphPntrs_molecules) {
        this.chemGraphPntrs_molecules = chemGraphPntrs_molecules;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChemGraphPntrsType)) return false;
        ChemGraphPntrsType other = (ChemGraphPntrsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chemGraphPntrs_atoms==null && other.getChemGraphPntrs_atoms()==null) || 
             (this.chemGraphPntrs_atoms!=null &&
              this.chemGraphPntrs_atoms.equals(other.getChemGraphPntrs_atoms()))) &&
            ((this.chemGraphPntrs_residues==null && other.getChemGraphPntrs_residues()==null) || 
             (this.chemGraphPntrs_residues!=null &&
              this.chemGraphPntrs_residues.equals(other.getChemGraphPntrs_residues()))) &&
            ((this.chemGraphPntrs_molecules==null && other.getChemGraphPntrs_molecules()==null) || 
             (this.chemGraphPntrs_molecules!=null &&
              this.chemGraphPntrs_molecules.equals(other.getChemGraphPntrs_molecules())));
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
        if (getChemGraphPntrs_atoms() != null) {
            _hashCode += getChemGraphPntrs_atoms().hashCode();
        }
        if (getChemGraphPntrs_residues() != null) {
            _hashCode += getChemGraphPntrs_residues().hashCode();
        }
        if (getChemGraphPntrs_molecules() != null) {
            _hashCode += getChemGraphPntrs_molecules().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChemGraphPntrsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-pntrsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chemGraphPntrs_atoms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-pntrs_atoms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-pntrs_atomsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chemGraphPntrs_residues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-pntrs_residues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-pntrs_residuesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chemGraphPntrs_molecules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-pntrs_molecules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Chem-graph-pntrs_moleculesType"));
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
