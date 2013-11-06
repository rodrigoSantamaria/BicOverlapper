/**
 * MoleculeGraph_interResidueBondsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MoleculeGraph_interResidueBondsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.InterResidueBondType[] interResidueBond;

    public MoleculeGraph_interResidueBondsType() {
    }

    public MoleculeGraph_interResidueBondsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.InterResidueBondType[] interResidueBond) {
           this.interResidueBond = interResidueBond;
    }


    /**
     * Gets the interResidueBond value for this MoleculeGraph_interResidueBondsType.
     * 
     * @return interResidueBond
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.InterResidueBondType[] getInterResidueBond() {
        return interResidueBond;
    }


    /**
     * Sets the interResidueBond value for this MoleculeGraph_interResidueBondsType.
     * 
     * @param interResidueBond
     */
    public void setInterResidueBond(gov.nih.nlm.ncbi.www.soap.eutils.efetch.InterResidueBondType[] interResidueBond) {
        this.interResidueBond = interResidueBond;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.InterResidueBondType getInterResidueBond(int i) {
        return this.interResidueBond[i];
    }

    public void setInterResidueBond(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.InterResidueBondType _value) {
        this.interResidueBond[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MoleculeGraph_interResidueBondsType)) return false;
        MoleculeGraph_interResidueBondsType other = (MoleculeGraph_interResidueBondsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.interResidueBond==null && other.getInterResidueBond()==null) || 
             (this.interResidueBond!=null &&
              java.util.Arrays.equals(this.interResidueBond, other.getInterResidueBond())));
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
        if (getInterResidueBond() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInterResidueBond());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInterResidueBond(), i);
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
        new org.apache.axis.description.TypeDesc(MoleculeGraph_interResidueBondsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Molecule-graph_inter-residue-bondsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interResidueBond");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Inter-residue-bond"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Inter-residue-bondType"));
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
