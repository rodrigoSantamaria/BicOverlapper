/**
 * PCAtoms_elementType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCAtoms_elementType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCElementType[] PCElement;

    public PCAtoms_elementType() {
    }

    public PCAtoms_elementType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCElementType[] PCElement) {
           this.PCElement = PCElement;
    }


    /**
     * Gets the PCElement value for this PCAtoms_elementType.
     * 
     * @return PCElement
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCElementType[] getPCElement() {
        return PCElement;
    }


    /**
     * Sets the PCElement value for this PCAtoms_elementType.
     * 
     * @param PCElement
     */
    public void setPCElement(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCElementType[] PCElement) {
        this.PCElement = PCElement;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCElementType getPCElement(int i) {
        return this.PCElement[i];
    }

    public void setPCElement(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCElementType _value) {
        this.PCElement[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCAtoms_elementType)) return false;
        PCAtoms_elementType other = (PCAtoms_elementType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCElement==null && other.getPCElement()==null) || 
             (this.PCElement!=null &&
              java.util.Arrays.equals(this.PCElement, other.getPCElement())));
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
        if (getPCElement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCElement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCElement(), i);
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
        new org.apache.axis.description.TypeDesc(PCAtoms_elementType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Atoms_elementType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCElement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Element"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-ElementType"));
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
