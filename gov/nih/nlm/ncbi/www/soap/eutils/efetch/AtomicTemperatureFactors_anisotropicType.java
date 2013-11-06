/**
 * AtomicTemperatureFactors_anisotropicType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AtomicTemperatureFactors_anisotropicType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AnisotropicTemperatureFactorsType anisotropicTemperatureFactors;

    public AtomicTemperatureFactors_anisotropicType() {
    }

    public AtomicTemperatureFactors_anisotropicType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AnisotropicTemperatureFactorsType anisotropicTemperatureFactors) {
           this.anisotropicTemperatureFactors = anisotropicTemperatureFactors;
    }


    /**
     * Gets the anisotropicTemperatureFactors value for this AtomicTemperatureFactors_anisotropicType.
     * 
     * @return anisotropicTemperatureFactors
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AnisotropicTemperatureFactorsType getAnisotropicTemperatureFactors() {
        return anisotropicTemperatureFactors;
    }


    /**
     * Sets the anisotropicTemperatureFactors value for this AtomicTemperatureFactors_anisotropicType.
     * 
     * @param anisotropicTemperatureFactors
     */
    public void setAnisotropicTemperatureFactors(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AnisotropicTemperatureFactorsType anisotropicTemperatureFactors) {
        this.anisotropicTemperatureFactors = anisotropicTemperatureFactors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtomicTemperatureFactors_anisotropicType)) return false;
        AtomicTemperatureFactors_anisotropicType other = (AtomicTemperatureFactors_anisotropicType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.anisotropicTemperatureFactors==null && other.getAnisotropicTemperatureFactors()==null) || 
             (this.anisotropicTemperatureFactors!=null &&
              this.anisotropicTemperatureFactors.equals(other.getAnisotropicTemperatureFactors())));
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
        if (getAnisotropicTemperatureFactors() != null) {
            _hashCode += getAnisotropicTemperatureFactors().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AtomicTemperatureFactors_anisotropicType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atomic-temperature-factors_anisotropicType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anisotropicTemperatureFactors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Anisotropic-temperature-factors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Anisotropic-temperature-factorsType"));
        elemField.setNillable(false);
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
