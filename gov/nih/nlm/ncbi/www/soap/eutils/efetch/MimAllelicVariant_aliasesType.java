/**
 * MimAllelicVariant_aliasesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MimAllelicVariant_aliasesType  implements java.io.Serializable {
    private java.lang.String[] mimAllelicVariant_aliases_E;

    public MimAllelicVariant_aliasesType() {
    }

    public MimAllelicVariant_aliasesType(
           java.lang.String[] mimAllelicVariant_aliases_E) {
           this.mimAllelicVariant_aliases_E = mimAllelicVariant_aliases_E;
    }


    /**
     * Gets the mimAllelicVariant_aliases_E value for this MimAllelicVariant_aliasesType.
     * 
     * @return mimAllelicVariant_aliases_E
     */
    public java.lang.String[] getMimAllelicVariant_aliases_E() {
        return mimAllelicVariant_aliases_E;
    }


    /**
     * Sets the mimAllelicVariant_aliases_E value for this MimAllelicVariant_aliasesType.
     * 
     * @param mimAllelicVariant_aliases_E
     */
    public void setMimAllelicVariant_aliases_E(java.lang.String[] mimAllelicVariant_aliases_E) {
        this.mimAllelicVariant_aliases_E = mimAllelicVariant_aliases_E;
    }

    public java.lang.String getMimAllelicVariant_aliases_E(int i) {
        return this.mimAllelicVariant_aliases_E[i];
    }

    public void setMimAllelicVariant_aliases_E(int i, java.lang.String _value) {
        this.mimAllelicVariant_aliases_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MimAllelicVariant_aliasesType)) return false;
        MimAllelicVariant_aliasesType other = (MimAllelicVariant_aliasesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mimAllelicVariant_aliases_E==null && other.getMimAllelicVariant_aliases_E()==null) || 
             (this.mimAllelicVariant_aliases_E!=null &&
              java.util.Arrays.equals(this.mimAllelicVariant_aliases_E, other.getMimAllelicVariant_aliases_E())));
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
        if (getMimAllelicVariant_aliases_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMimAllelicVariant_aliases_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMimAllelicVariant_aliases_E(), i);
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
        new org.apache.axis.description.TypeDesc(MimAllelicVariant_aliasesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-allelic-variant_aliasesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimAllelicVariant_aliases_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-allelic-variant_aliases_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-allelic-variant_aliases_E"));
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
