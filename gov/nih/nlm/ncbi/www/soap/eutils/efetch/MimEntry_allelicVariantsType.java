/**
 * MimEntry_allelicVariantsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MimEntry_allelicVariantsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAllelicVariantType[] mimAllelicVariant;

    public MimEntry_allelicVariantsType() {
    }

    public MimEntry_allelicVariantsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAllelicVariantType[] mimAllelicVariant) {
           this.mimAllelicVariant = mimAllelicVariant;
    }


    /**
     * Gets the mimAllelicVariant value for this MimEntry_allelicVariantsType.
     * 
     * @return mimAllelicVariant
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAllelicVariantType[] getMimAllelicVariant() {
        return mimAllelicVariant;
    }


    /**
     * Sets the mimAllelicVariant value for this MimEntry_allelicVariantsType.
     * 
     * @param mimAllelicVariant
     */
    public void setMimAllelicVariant(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAllelicVariantType[] mimAllelicVariant) {
        this.mimAllelicVariant = mimAllelicVariant;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAllelicVariantType getMimAllelicVariant(int i) {
        return this.mimAllelicVariant[i];
    }

    public void setMimAllelicVariant(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAllelicVariantType _value) {
        this.mimAllelicVariant[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MimEntry_allelicVariantsType)) return false;
        MimEntry_allelicVariantsType other = (MimEntry_allelicVariantsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mimAllelicVariant==null && other.getMimAllelicVariant()==null) || 
             (this.mimAllelicVariant!=null &&
              java.util.Arrays.equals(this.mimAllelicVariant, other.getMimAllelicVariant())));
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
        if (getMimAllelicVariant() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMimAllelicVariant());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMimAllelicVariant(), i);
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
        new org.apache.axis.description.TypeDesc(MimEntry_allelicVariantsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_allelicVariantsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimAllelicVariant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-allelic-variant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-allelic-variantType"));
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
