/**
 * PDBBlock_sourceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PDBBlock_sourceType  implements java.io.Serializable {
    private java.lang.String[] PDBBlock_source_E;

    public PDBBlock_sourceType() {
    }

    public PDBBlock_sourceType(
           java.lang.String[] PDBBlock_source_E) {
           this.PDBBlock_source_E = PDBBlock_source_E;
    }


    /**
     * Gets the PDBBlock_source_E value for this PDBBlock_sourceType.
     * 
     * @return PDBBlock_source_E
     */
    public java.lang.String[] getPDBBlock_source_E() {
        return PDBBlock_source_E;
    }


    /**
     * Sets the PDBBlock_source_E value for this PDBBlock_sourceType.
     * 
     * @param PDBBlock_source_E
     */
    public void setPDBBlock_source_E(java.lang.String[] PDBBlock_source_E) {
        this.PDBBlock_source_E = PDBBlock_source_E;
    }

    public java.lang.String getPDBBlock_source_E(int i) {
        return this.PDBBlock_source_E[i];
    }

    public void setPDBBlock_source_E(int i, java.lang.String _value) {
        this.PDBBlock_source_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PDBBlock_sourceType)) return false;
        PDBBlock_sourceType other = (PDBBlock_sourceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PDBBlock_source_E==null && other.getPDBBlock_source_E()==null) || 
             (this.PDBBlock_source_E!=null &&
              java.util.Arrays.equals(this.PDBBlock_source_E, other.getPDBBlock_source_E())));
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
        if (getPDBBlock_source_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPDBBlock_source_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPDBBlock_source_E(), i);
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
        new org.apache.axis.description.TypeDesc(PDBBlock_sourceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-block_sourceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PDBBlock_source_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-block_source_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-block_source_E"));
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
