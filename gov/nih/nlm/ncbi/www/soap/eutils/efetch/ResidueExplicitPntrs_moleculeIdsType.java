/**
 * ResidueExplicitPntrs_moleculeIdsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ResidueExplicitPntrs_moleculeIdsType  implements java.io.Serializable {
    private java.lang.String[] moleculeId;

    public ResidueExplicitPntrs_moleculeIdsType() {
    }

    public ResidueExplicitPntrs_moleculeIdsType(
           java.lang.String[] moleculeId) {
           this.moleculeId = moleculeId;
    }


    /**
     * Gets the moleculeId value for this ResidueExplicitPntrs_moleculeIdsType.
     * 
     * @return moleculeId
     */
    public java.lang.String[] getMoleculeId() {
        return moleculeId;
    }


    /**
     * Sets the moleculeId value for this ResidueExplicitPntrs_moleculeIdsType.
     * 
     * @param moleculeId
     */
    public void setMoleculeId(java.lang.String[] moleculeId) {
        this.moleculeId = moleculeId;
    }

    public java.lang.String getMoleculeId(int i) {
        return this.moleculeId[i];
    }

    public void setMoleculeId(int i, java.lang.String _value) {
        this.moleculeId[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResidueExplicitPntrs_moleculeIdsType)) return false;
        ResidueExplicitPntrs_moleculeIdsType other = (ResidueExplicitPntrs_moleculeIdsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.moleculeId==null && other.getMoleculeId()==null) || 
             (this.moleculeId!=null &&
              java.util.Arrays.equals(this.moleculeId, other.getMoleculeId())));
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
        if (getMoleculeId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMoleculeId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMoleculeId(), i);
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
        new org.apache.axis.description.TypeDesc(ResidueExplicitPntrs_moleculeIdsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Residue-explicit-pntrs_molecule-idsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moleculeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Molecule-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Molecule-id"));
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
