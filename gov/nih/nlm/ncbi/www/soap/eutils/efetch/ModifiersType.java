/**
 * ModifiersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ModifiersType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModifierType[] modifier;

    public ModifiersType() {
    }

    public ModifiersType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModifierType[] modifier) {
           this.modifier = modifier;
    }


    /**
     * Gets the modifier value for this ModifiersType.
     * 
     * @return modifier
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModifierType[] getModifier() {
        return modifier;
    }


    /**
     * Sets the modifier value for this ModifiersType.
     * 
     * @param modifier
     */
    public void setModifier(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModifierType[] modifier) {
        this.modifier = modifier;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModifierType getModifier(int i) {
        return this.modifier[i];
    }

    public void setModifier(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ModifierType _value) {
        this.modifier[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifiersType)) return false;
        ModifiersType other = (ModifiersType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.modifier==null && other.getModifier()==null) || 
             (this.modifier!=null &&
              java.util.Arrays.equals(this.modifier, other.getModifier())));
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
        if (getModifier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModifier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModifier(), i);
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
        new org.apache.axis.description.TypeDesc(ModifiersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ModifiersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Modifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ModifierType"));
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
