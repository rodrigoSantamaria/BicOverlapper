/**
 * IntFuzz_altType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class IntFuzz_altType  implements java.io.Serializable {
    private java.lang.String[] intFuzz_alt_E;

    public IntFuzz_altType() {
    }

    public IntFuzz_altType(
           java.lang.String[] intFuzz_alt_E) {
           this.intFuzz_alt_E = intFuzz_alt_E;
    }


    /**
     * Gets the intFuzz_alt_E value for this IntFuzz_altType.
     * 
     * @return intFuzz_alt_E
     */
    public java.lang.String[] getIntFuzz_alt_E() {
        return intFuzz_alt_E;
    }


    /**
     * Sets the intFuzz_alt_E value for this IntFuzz_altType.
     * 
     * @param intFuzz_alt_E
     */
    public void setIntFuzz_alt_E(java.lang.String[] intFuzz_alt_E) {
        this.intFuzz_alt_E = intFuzz_alt_E;
    }

    public java.lang.String getIntFuzz_alt_E(int i) {
        return this.intFuzz_alt_E[i];
    }

    public void setIntFuzz_alt_E(int i, java.lang.String _value) {
        this.intFuzz_alt_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntFuzz_altType)) return false;
        IntFuzz_altType other = (IntFuzz_altType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.intFuzz_alt_E==null && other.getIntFuzz_alt_E()==null) || 
             (this.intFuzz_alt_E!=null &&
              java.util.Arrays.equals(this.intFuzz_alt_E, other.getIntFuzz_alt_E())));
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
        if (getIntFuzz_alt_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntFuzz_alt_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIntFuzz_alt_E(), i);
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
        new org.apache.axis.description.TypeDesc(IntFuzz_altType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Int-fuzz_altType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intFuzz_alt_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Int-fuzz_alt_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Int-fuzz_alt_E"));
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
