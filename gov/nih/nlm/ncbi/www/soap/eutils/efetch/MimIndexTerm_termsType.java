/**
 * MimIndexTerm_termsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MimIndexTerm_termsType  implements java.io.Serializable {
    private java.lang.String[] mimIndexTerm_terms_E;

    public MimIndexTerm_termsType() {
    }

    public MimIndexTerm_termsType(
           java.lang.String[] mimIndexTerm_terms_E) {
           this.mimIndexTerm_terms_E = mimIndexTerm_terms_E;
    }


    /**
     * Gets the mimIndexTerm_terms_E value for this MimIndexTerm_termsType.
     * 
     * @return mimIndexTerm_terms_E
     */
    public java.lang.String[] getMimIndexTerm_terms_E() {
        return mimIndexTerm_terms_E;
    }


    /**
     * Sets the mimIndexTerm_terms_E value for this MimIndexTerm_termsType.
     * 
     * @param mimIndexTerm_terms_E
     */
    public void setMimIndexTerm_terms_E(java.lang.String[] mimIndexTerm_terms_E) {
        this.mimIndexTerm_terms_E = mimIndexTerm_terms_E;
    }

    public java.lang.String getMimIndexTerm_terms_E(int i) {
        return this.mimIndexTerm_terms_E[i];
    }

    public void setMimIndexTerm_terms_E(int i, java.lang.String _value) {
        this.mimIndexTerm_terms_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MimIndexTerm_termsType)) return false;
        MimIndexTerm_termsType other = (MimIndexTerm_termsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mimIndexTerm_terms_E==null && other.getMimIndexTerm_terms_E()==null) || 
             (this.mimIndexTerm_terms_E!=null &&
              java.util.Arrays.equals(this.mimIndexTerm_terms_E, other.getMimIndexTerm_terms_E())));
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
        if (getMimIndexTerm_terms_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMimIndexTerm_terms_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMimIndexTerm_terms_E(), i);
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
        new org.apache.axis.description.TypeDesc(MimIndexTerm_termsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-index-term_termsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimIndexTerm_terms_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-index-term_terms_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-index-term_terms_E"));
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
