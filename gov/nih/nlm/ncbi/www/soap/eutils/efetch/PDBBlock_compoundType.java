/**
 * PDBBlock_compoundType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PDBBlock_compoundType  implements java.io.Serializable {
    private java.lang.String[] PDBBlock_compound_E;

    public PDBBlock_compoundType() {
    }

    public PDBBlock_compoundType(
           java.lang.String[] PDBBlock_compound_E) {
           this.PDBBlock_compound_E = PDBBlock_compound_E;
    }


    /**
     * Gets the PDBBlock_compound_E value for this PDBBlock_compoundType.
     * 
     * @return PDBBlock_compound_E
     */
    public java.lang.String[] getPDBBlock_compound_E() {
        return PDBBlock_compound_E;
    }


    /**
     * Sets the PDBBlock_compound_E value for this PDBBlock_compoundType.
     * 
     * @param PDBBlock_compound_E
     */
    public void setPDBBlock_compound_E(java.lang.String[] PDBBlock_compound_E) {
        this.PDBBlock_compound_E = PDBBlock_compound_E;
    }

    public java.lang.String getPDBBlock_compound_E(int i) {
        return this.PDBBlock_compound_E[i];
    }

    public void setPDBBlock_compound_E(int i, java.lang.String _value) {
        this.PDBBlock_compound_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PDBBlock_compoundType)) return false;
        PDBBlock_compoundType other = (PDBBlock_compoundType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PDBBlock_compound_E==null && other.getPDBBlock_compound_E()==null) || 
             (this.PDBBlock_compound_E!=null &&
              java.util.Arrays.equals(this.PDBBlock_compound_E, other.getPDBBlock_compound_E())));
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
        if (getPDBBlock_compound_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPDBBlock_compound_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPDBBlock_compound_E(), i);
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
        new org.apache.axis.description.TypeDesc(PDBBlock_compoundType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-block_compoundType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PDBBlock_compound_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-block_compound_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-block_compound_E"));
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
