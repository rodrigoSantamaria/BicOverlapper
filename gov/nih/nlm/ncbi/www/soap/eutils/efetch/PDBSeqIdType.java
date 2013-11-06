/**
 * PDBSeqIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PDBSeqIdType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBSeqId_molType PDBSeqId_mol;

    private java.lang.String PDBSeqId_chain;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBSeqId_relType PDBSeqId_rel;

    public PDBSeqIdType() {
    }

    public PDBSeqIdType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBSeqId_molType PDBSeqId_mol,
           java.lang.String PDBSeqId_chain,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBSeqId_relType PDBSeqId_rel) {
           this.PDBSeqId_mol = PDBSeqId_mol;
           this.PDBSeqId_chain = PDBSeqId_chain;
           this.PDBSeqId_rel = PDBSeqId_rel;
    }


    /**
     * Gets the PDBSeqId_mol value for this PDBSeqIdType.
     * 
     * @return PDBSeqId_mol
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBSeqId_molType getPDBSeqId_mol() {
        return PDBSeqId_mol;
    }


    /**
     * Sets the PDBSeqId_mol value for this PDBSeqIdType.
     * 
     * @param PDBSeqId_mol
     */
    public void setPDBSeqId_mol(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBSeqId_molType PDBSeqId_mol) {
        this.PDBSeqId_mol = PDBSeqId_mol;
    }


    /**
     * Gets the PDBSeqId_chain value for this PDBSeqIdType.
     * 
     * @return PDBSeqId_chain
     */
    public java.lang.String getPDBSeqId_chain() {
        return PDBSeqId_chain;
    }


    /**
     * Sets the PDBSeqId_chain value for this PDBSeqIdType.
     * 
     * @param PDBSeqId_chain
     */
    public void setPDBSeqId_chain(java.lang.String PDBSeqId_chain) {
        this.PDBSeqId_chain = PDBSeqId_chain;
    }


    /**
     * Gets the PDBSeqId_rel value for this PDBSeqIdType.
     * 
     * @return PDBSeqId_rel
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBSeqId_relType getPDBSeqId_rel() {
        return PDBSeqId_rel;
    }


    /**
     * Sets the PDBSeqId_rel value for this PDBSeqIdType.
     * 
     * @param PDBSeqId_rel
     */
    public void setPDBSeqId_rel(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PDBSeqId_relType PDBSeqId_rel) {
        this.PDBSeqId_rel = PDBSeqId_rel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PDBSeqIdType)) return false;
        PDBSeqIdType other = (PDBSeqIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PDBSeqId_mol==null && other.getPDBSeqId_mol()==null) || 
             (this.PDBSeqId_mol!=null &&
              this.PDBSeqId_mol.equals(other.getPDBSeqId_mol()))) &&
            ((this.PDBSeqId_chain==null && other.getPDBSeqId_chain()==null) || 
             (this.PDBSeqId_chain!=null &&
              this.PDBSeqId_chain.equals(other.getPDBSeqId_chain()))) &&
            ((this.PDBSeqId_rel==null && other.getPDBSeqId_rel()==null) || 
             (this.PDBSeqId_rel!=null &&
              this.PDBSeqId_rel.equals(other.getPDBSeqId_rel())));
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
        if (getPDBSeqId_mol() != null) {
            _hashCode += getPDBSeqId_mol().hashCode();
        }
        if (getPDBSeqId_chain() != null) {
            _hashCode += getPDBSeqId_chain().hashCode();
        }
        if (getPDBSeqId_rel() != null) {
            _hashCode += getPDBSeqId_rel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PDBSeqIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-seq-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PDBSeqId_mol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-seq-id_mol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-seq-id_molType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PDBSeqId_chain");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-seq-id_chain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PDBSeqId_rel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-seq-id_rel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-seq-id_relType"));
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
