/**
 * IsotropicTemperatureFactorsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class IsotropicTemperatureFactorsType  implements java.io.Serializable {
    private java.lang.String isotropicTemperatureFactors_scaleFactor;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.IsotropicTemperatureFactors_bType isotropicTemperatureFactors_b;

    public IsotropicTemperatureFactorsType() {
    }

    public IsotropicTemperatureFactorsType(
           java.lang.String isotropicTemperatureFactors_scaleFactor,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.IsotropicTemperatureFactors_bType isotropicTemperatureFactors_b) {
           this.isotropicTemperatureFactors_scaleFactor = isotropicTemperatureFactors_scaleFactor;
           this.isotropicTemperatureFactors_b = isotropicTemperatureFactors_b;
    }


    /**
     * Gets the isotropicTemperatureFactors_scaleFactor value for this IsotropicTemperatureFactorsType.
     * 
     * @return isotropicTemperatureFactors_scaleFactor
     */
    public java.lang.String getIsotropicTemperatureFactors_scaleFactor() {
        return isotropicTemperatureFactors_scaleFactor;
    }


    /**
     * Sets the isotropicTemperatureFactors_scaleFactor value for this IsotropicTemperatureFactorsType.
     * 
     * @param isotropicTemperatureFactors_scaleFactor
     */
    public void setIsotropicTemperatureFactors_scaleFactor(java.lang.String isotropicTemperatureFactors_scaleFactor) {
        this.isotropicTemperatureFactors_scaleFactor = isotropicTemperatureFactors_scaleFactor;
    }


    /**
     * Gets the isotropicTemperatureFactors_b value for this IsotropicTemperatureFactorsType.
     * 
     * @return isotropicTemperatureFactors_b
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.IsotropicTemperatureFactors_bType getIsotropicTemperatureFactors_b() {
        return isotropicTemperatureFactors_b;
    }


    /**
     * Sets the isotropicTemperatureFactors_b value for this IsotropicTemperatureFactorsType.
     * 
     * @param isotropicTemperatureFactors_b
     */
    public void setIsotropicTemperatureFactors_b(gov.nih.nlm.ncbi.www.soap.eutils.efetch.IsotropicTemperatureFactors_bType isotropicTemperatureFactors_b) {
        this.isotropicTemperatureFactors_b = isotropicTemperatureFactors_b;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsotropicTemperatureFactorsType)) return false;
        IsotropicTemperatureFactorsType other = (IsotropicTemperatureFactorsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isotropicTemperatureFactors_scaleFactor==null && other.getIsotropicTemperatureFactors_scaleFactor()==null) || 
             (this.isotropicTemperatureFactors_scaleFactor!=null &&
              this.isotropicTemperatureFactors_scaleFactor.equals(other.getIsotropicTemperatureFactors_scaleFactor()))) &&
            ((this.isotropicTemperatureFactors_b==null && other.getIsotropicTemperatureFactors_b()==null) || 
             (this.isotropicTemperatureFactors_b!=null &&
              this.isotropicTemperatureFactors_b.equals(other.getIsotropicTemperatureFactors_b())));
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
        if (getIsotropicTemperatureFactors_scaleFactor() != null) {
            _hashCode += getIsotropicTemperatureFactors_scaleFactor().hashCode();
        }
        if (getIsotropicTemperatureFactors_b() != null) {
            _hashCode += getIsotropicTemperatureFactors_b().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IsotropicTemperatureFactorsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Isotropic-temperature-factorsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isotropicTemperatureFactors_scaleFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Isotropic-temperature-factors_scale-factor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isotropicTemperatureFactors_b");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Isotropic-temperature-factors_b"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Isotropic-temperature-factors_bType"));
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
