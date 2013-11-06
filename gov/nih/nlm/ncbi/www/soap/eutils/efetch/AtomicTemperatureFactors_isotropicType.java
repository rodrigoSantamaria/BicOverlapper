/**
 * AtomicTemperatureFactors_isotropicType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AtomicTemperatureFactors_isotropicType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.IsotropicTemperatureFactorsType isotropicTemperatureFactors;

    public AtomicTemperatureFactors_isotropicType() {
    }

    public AtomicTemperatureFactors_isotropicType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.IsotropicTemperatureFactorsType isotropicTemperatureFactors) {
           this.isotropicTemperatureFactors = isotropicTemperatureFactors;
    }


    /**
     * Gets the isotropicTemperatureFactors value for this AtomicTemperatureFactors_isotropicType.
     * 
     * @return isotropicTemperatureFactors
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.IsotropicTemperatureFactorsType getIsotropicTemperatureFactors() {
        return isotropicTemperatureFactors;
    }


    /**
     * Sets the isotropicTemperatureFactors value for this AtomicTemperatureFactors_isotropicType.
     * 
     * @param isotropicTemperatureFactors
     */
    public void setIsotropicTemperatureFactors(gov.nih.nlm.ncbi.www.soap.eutils.efetch.IsotropicTemperatureFactorsType isotropicTemperatureFactors) {
        this.isotropicTemperatureFactors = isotropicTemperatureFactors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtomicTemperatureFactors_isotropicType)) return false;
        AtomicTemperatureFactors_isotropicType other = (AtomicTemperatureFactors_isotropicType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isotropicTemperatureFactors==null && other.getIsotropicTemperatureFactors()==null) || 
             (this.isotropicTemperatureFactors!=null &&
              this.isotropicTemperatureFactors.equals(other.getIsotropicTemperatureFactors())));
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
        if (getIsotropicTemperatureFactors() != null) {
            _hashCode += getIsotropicTemperatureFactors().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AtomicTemperatureFactors_isotropicType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atomic-temperature-factors_isotropicType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isotropicTemperatureFactors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Isotropic-temperature-factors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Isotropic-temperature-factorsType"));
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
