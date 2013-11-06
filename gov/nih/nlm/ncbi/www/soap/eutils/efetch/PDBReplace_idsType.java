/**
 * PDBReplace_idsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PDBReplace_idsType  implements java.io.Serializable {
    private java.lang.String[] PDBReplace_ids_E;

    public PDBReplace_idsType() {
    }

    public PDBReplace_idsType(
           java.lang.String[] PDBReplace_ids_E) {
           this.PDBReplace_ids_E = PDBReplace_ids_E;
    }


    /**
     * Gets the PDBReplace_ids_E value for this PDBReplace_idsType.
     * 
     * @return PDBReplace_ids_E
     */
    public java.lang.String[] getPDBReplace_ids_E() {
        return PDBReplace_ids_E;
    }


    /**
     * Sets the PDBReplace_ids_E value for this PDBReplace_idsType.
     * 
     * @param PDBReplace_ids_E
     */
    public void setPDBReplace_ids_E(java.lang.String[] PDBReplace_ids_E) {
        this.PDBReplace_ids_E = PDBReplace_ids_E;
    }

    public java.lang.String getPDBReplace_ids_E(int i) {
        return this.PDBReplace_ids_E[i];
    }

    public void setPDBReplace_ids_E(int i, java.lang.String _value) {
        this.PDBReplace_ids_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PDBReplace_idsType)) return false;
        PDBReplace_idsType other = (PDBReplace_idsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PDBReplace_ids_E==null && other.getPDBReplace_ids_E()==null) || 
             (this.PDBReplace_ids_E!=null &&
              java.util.Arrays.equals(this.PDBReplace_ids_E, other.getPDBReplace_ids_E())));
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
        if (getPDBReplace_ids_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPDBReplace_ids_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPDBReplace_ids_E(), i);
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
        new org.apache.axis.description.TypeDesc(PDBReplace_idsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-replace_idsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PDBReplace_ids_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-replace_ids_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PDB-replace_ids_E"));
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
