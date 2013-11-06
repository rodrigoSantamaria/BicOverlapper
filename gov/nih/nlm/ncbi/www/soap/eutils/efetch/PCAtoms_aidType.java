/**
 * PCAtoms_aidType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCAtoms_aidType  implements java.io.Serializable {
    private java.lang.String[] PCAtoms_aid_E;

    public PCAtoms_aidType() {
    }

    public PCAtoms_aidType(
           java.lang.String[] PCAtoms_aid_E) {
           this.PCAtoms_aid_E = PCAtoms_aid_E;
    }


    /**
     * Gets the PCAtoms_aid_E value for this PCAtoms_aidType.
     * 
     * @return PCAtoms_aid_E
     */
    public java.lang.String[] getPCAtoms_aid_E() {
        return PCAtoms_aid_E;
    }


    /**
     * Sets the PCAtoms_aid_E value for this PCAtoms_aidType.
     * 
     * @param PCAtoms_aid_E
     */
    public void setPCAtoms_aid_E(java.lang.String[] PCAtoms_aid_E) {
        this.PCAtoms_aid_E = PCAtoms_aid_E;
    }

    public java.lang.String getPCAtoms_aid_E(int i) {
        return this.PCAtoms_aid_E[i];
    }

    public void setPCAtoms_aid_E(int i, java.lang.String _value) {
        this.PCAtoms_aid_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCAtoms_aidType)) return false;
        PCAtoms_aidType other = (PCAtoms_aidType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCAtoms_aid_E==null && other.getPCAtoms_aid_E()==null) || 
             (this.PCAtoms_aid_E!=null &&
              java.util.Arrays.equals(this.PCAtoms_aid_E, other.getPCAtoms_aid_E())));
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
        if (getPCAtoms_aid_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCAtoms_aid_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCAtoms_aid_E(), i);
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
        new org.apache.axis.description.TypeDesc(PCAtoms_aidType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Atoms_aidType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAtoms_aid_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Atoms_aid_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Atoms_aid_E"));
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
