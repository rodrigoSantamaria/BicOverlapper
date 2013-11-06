/**
 * PCAtoms_sourceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCAtoms_sourceType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAtomSourceType[] PCAtomSource;

    public PCAtoms_sourceType() {
    }

    public PCAtoms_sourceType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAtomSourceType[] PCAtomSource) {
           this.PCAtomSource = PCAtomSource;
    }


    /**
     * Gets the PCAtomSource value for this PCAtoms_sourceType.
     * 
     * @return PCAtomSource
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAtomSourceType[] getPCAtomSource() {
        return PCAtomSource;
    }


    /**
     * Sets the PCAtomSource value for this PCAtoms_sourceType.
     * 
     * @param PCAtomSource
     */
    public void setPCAtomSource(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAtomSourceType[] PCAtomSource) {
        this.PCAtomSource = PCAtomSource;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAtomSourceType getPCAtomSource(int i) {
        return this.PCAtomSource[i];
    }

    public void setPCAtomSource(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAtomSourceType _value) {
        this.PCAtomSource[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCAtoms_sourceType)) return false;
        PCAtoms_sourceType other = (PCAtoms_sourceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCAtomSource==null && other.getPCAtomSource()==null) || 
             (this.PCAtomSource!=null &&
              java.util.Arrays.equals(this.PCAtomSource, other.getPCAtomSource())));
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
        if (getPCAtomSource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCAtomSource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCAtomSource(), i);
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
        new org.apache.axis.description.TypeDesc(PCAtoms_sourceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Atoms_sourceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAtomSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AtomSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AtomSourceType"));
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
