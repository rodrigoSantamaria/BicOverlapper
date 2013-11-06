/**
 * PCAtoms_chargeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCAtoms_chargeType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAtomIntType[] PCAtomInt;

    public PCAtoms_chargeType() {
    }

    public PCAtoms_chargeType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAtomIntType[] PCAtomInt) {
           this.PCAtomInt = PCAtomInt;
    }


    /**
     * Gets the PCAtomInt value for this PCAtoms_chargeType.
     * 
     * @return PCAtomInt
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAtomIntType[] getPCAtomInt() {
        return PCAtomInt;
    }


    /**
     * Sets the PCAtomInt value for this PCAtoms_chargeType.
     * 
     * @param PCAtomInt
     */
    public void setPCAtomInt(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAtomIntType[] PCAtomInt) {
        this.PCAtomInt = PCAtomInt;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAtomIntType getPCAtomInt(int i) {
        return this.PCAtomInt[i];
    }

    public void setPCAtomInt(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAtomIntType _value) {
        this.PCAtomInt[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCAtoms_chargeType)) return false;
        PCAtoms_chargeType other = (PCAtoms_chargeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCAtomInt==null && other.getPCAtomInt()==null) || 
             (this.PCAtomInt!=null &&
              java.util.Arrays.equals(this.PCAtomInt, other.getPCAtomInt())));
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
        if (getPCAtomInt() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCAtomInt());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCAtomInt(), i);
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
        new org.apache.axis.description.TypeDesc(PCAtoms_chargeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Atoms_chargeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAtomInt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AtomInt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AtomIntType"));
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
