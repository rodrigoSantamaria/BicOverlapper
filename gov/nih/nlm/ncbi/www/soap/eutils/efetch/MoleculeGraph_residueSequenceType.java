/**
 * MoleculeGraph_residueSequenceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MoleculeGraph_residueSequenceType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueType[] residue;

    public MoleculeGraph_residueSequenceType() {
    }

    public MoleculeGraph_residueSequenceType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueType[] residue) {
           this.residue = residue;
    }


    /**
     * Gets the residue value for this MoleculeGraph_residueSequenceType.
     * 
     * @return residue
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueType[] getResidue() {
        return residue;
    }


    /**
     * Sets the residue value for this MoleculeGraph_residueSequenceType.
     * 
     * @param residue
     */
    public void setResidue(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueType[] residue) {
        this.residue = residue;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueType getResidue(int i) {
        return this.residue[i];
    }

    public void setResidue(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ResidueType _value) {
        this.residue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MoleculeGraph_residueSequenceType)) return false;
        MoleculeGraph_residueSequenceType other = (MoleculeGraph_residueSequenceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.residue==null && other.getResidue()==null) || 
             (this.residue!=null &&
              java.util.Arrays.equals(this.residue, other.getResidue())));
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
        if (getResidue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResidue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResidue(), i);
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
        new org.apache.axis.description.TypeDesc(MoleculeGraph_residueSequenceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Molecule-graph_residue-sequenceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ResidueType"));
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
