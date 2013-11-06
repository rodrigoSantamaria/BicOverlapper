/**
 * PCAtoms_labelType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCAtoms_labelType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAtomStringType[] PCAtomString;

    public PCAtoms_labelType() {
    }

    public PCAtoms_labelType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAtomStringType[] PCAtomString) {
           this.PCAtomString = PCAtomString;
    }


    /**
     * Gets the PCAtomString value for this PCAtoms_labelType.
     * 
     * @return PCAtomString
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAtomStringType[] getPCAtomString() {
        return PCAtomString;
    }


    /**
     * Sets the PCAtomString value for this PCAtoms_labelType.
     * 
     * @param PCAtomString
     */
    public void setPCAtomString(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAtomStringType[] PCAtomString) {
        this.PCAtomString = PCAtomString;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAtomStringType getPCAtomString(int i) {
        return this.PCAtomString[i];
    }

    public void setPCAtomString(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAtomStringType _value) {
        this.PCAtomString[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCAtoms_labelType)) return false;
        PCAtoms_labelType other = (PCAtoms_labelType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCAtomString==null && other.getPCAtomString()==null) || 
             (this.PCAtomString!=null &&
              java.util.Arrays.equals(this.PCAtomString, other.getPCAtomString())));
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
        if (getPCAtomString() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCAtomString());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCAtomString(), i);
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
        new org.apache.axis.description.TypeDesc(PCAtoms_labelType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Atoms_labelType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAtomString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AtomString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AtomStringType"));
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
