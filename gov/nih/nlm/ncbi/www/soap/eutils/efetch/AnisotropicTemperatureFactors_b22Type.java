/**
 * AnisotropicTemperatureFactors_b22Type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AnisotropicTemperatureFactors_b22Type  implements java.io.Serializable {
    private java.lang.String[] anisotropicTemperatureFactors_b22_E;

    public AnisotropicTemperatureFactors_b22Type() {
    }

    public AnisotropicTemperatureFactors_b22Type(
           java.lang.String[] anisotropicTemperatureFactors_b22_E) {
           this.anisotropicTemperatureFactors_b22_E = anisotropicTemperatureFactors_b22_E;
    }


    /**
     * Gets the anisotropicTemperatureFactors_b22_E value for this AnisotropicTemperatureFactors_b22Type.
     * 
     * @return anisotropicTemperatureFactors_b22_E
     */
    public java.lang.String[] getAnisotropicTemperatureFactors_b22_E() {
        return anisotropicTemperatureFactors_b22_E;
    }


    /**
     * Sets the anisotropicTemperatureFactors_b22_E value for this AnisotropicTemperatureFactors_b22Type.
     * 
     * @param anisotropicTemperatureFactors_b22_E
     */
    public void setAnisotropicTemperatureFactors_b22_E(java.lang.String[] anisotropicTemperatureFactors_b22_E) {
        this.anisotropicTemperatureFactors_b22_E = anisotropicTemperatureFactors_b22_E;
    }

    public java.lang.String getAnisotropicTemperatureFactors_b22_E(int i) {
        return this.anisotropicTemperatureFactors_b22_E[i];
    }

    public void setAnisotropicTemperatureFactors_b22_E(int i, java.lang.String _value) {
        this.anisotropicTemperatureFactors_b22_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AnisotropicTemperatureFactors_b22Type)) return false;
        AnisotropicTemperatureFactors_b22Type other = (AnisotropicTemperatureFactors_b22Type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.anisotropicTemperatureFactors_b22_E==null && other.getAnisotropicTemperatureFactors_b22_E()==null) || 
             (this.anisotropicTemperatureFactors_b22_E!=null &&
              java.util.Arrays.equals(this.anisotropicTemperatureFactors_b22_E, other.getAnisotropicTemperatureFactors_b22_E())));
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
        if (getAnisotropicTemperatureFactors_b22_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnisotropicTemperatureFactors_b22_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnisotropicTemperatureFactors_b22_E(), i);
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
        new org.apache.axis.description.TypeDesc(AnisotropicTemperatureFactors_b22Type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Anisotropic-temperature-factors_b-22Type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anisotropicTemperatureFactors_b22_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Anisotropic-temperature-factors_b-22_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Anisotropic-temperature-factors_b-22_E"));
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
