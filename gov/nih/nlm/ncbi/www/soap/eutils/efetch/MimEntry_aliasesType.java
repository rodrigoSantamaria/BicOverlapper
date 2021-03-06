/**
 * MimEntry_aliasesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MimEntry_aliasesType  implements java.io.Serializable {
    private java.lang.String[] mimEntry_aliases_E;

    public MimEntry_aliasesType() {
    }

    public MimEntry_aliasesType(
           java.lang.String[] mimEntry_aliases_E) {
           this.mimEntry_aliases_E = mimEntry_aliases_E;
    }


    /**
     * Gets the mimEntry_aliases_E value for this MimEntry_aliasesType.
     * 
     * @return mimEntry_aliases_E
     */
    public java.lang.String[] getMimEntry_aliases_E() {
        return mimEntry_aliases_E;
    }


    /**
     * Sets the mimEntry_aliases_E value for this MimEntry_aliasesType.
     * 
     * @param mimEntry_aliases_E
     */
    public void setMimEntry_aliases_E(java.lang.String[] mimEntry_aliases_E) {
        this.mimEntry_aliases_E = mimEntry_aliases_E;
    }

    public java.lang.String getMimEntry_aliases_E(int i) {
        return this.mimEntry_aliases_E[i];
    }

    public void setMimEntry_aliases_E(int i, java.lang.String _value) {
        this.mimEntry_aliases_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MimEntry_aliasesType)) return false;
        MimEntry_aliasesType other = (MimEntry_aliasesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mimEntry_aliases_E==null && other.getMimEntry_aliases_E()==null) || 
             (this.mimEntry_aliases_E!=null &&
              java.util.Arrays.equals(this.mimEntry_aliases_E, other.getMimEntry_aliases_E())));
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
        if (getMimEntry_aliases_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMimEntry_aliases_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMimEntry_aliases_E(), i);
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
        new org.apache.axis.description.TypeDesc(MimEntry_aliasesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_aliasesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry_aliases_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_aliases_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_aliases_E"));
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
