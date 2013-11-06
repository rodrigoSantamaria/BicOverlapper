/**
 * AtomicTemperatureFactorsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AtomicTemperatureFactorsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomicTemperatureFactors_isotropicType atomicTemperatureFactors_isotropic;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomicTemperatureFactors_anisotropicType atomicTemperatureFactors_anisotropic;

    public AtomicTemperatureFactorsType() {
    }

    public AtomicTemperatureFactorsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomicTemperatureFactors_isotropicType atomicTemperatureFactors_isotropic,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomicTemperatureFactors_anisotropicType atomicTemperatureFactors_anisotropic) {
           this.atomicTemperatureFactors_isotropic = atomicTemperatureFactors_isotropic;
           this.atomicTemperatureFactors_anisotropic = atomicTemperatureFactors_anisotropic;
    }


    /**
     * Gets the atomicTemperatureFactors_isotropic value for this AtomicTemperatureFactorsType.
     * 
     * @return atomicTemperatureFactors_isotropic
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomicTemperatureFactors_isotropicType getAtomicTemperatureFactors_isotropic() {
        return atomicTemperatureFactors_isotropic;
    }


    /**
     * Sets the atomicTemperatureFactors_isotropic value for this AtomicTemperatureFactorsType.
     * 
     * @param atomicTemperatureFactors_isotropic
     */
    public void setAtomicTemperatureFactors_isotropic(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomicTemperatureFactors_isotropicType atomicTemperatureFactors_isotropic) {
        this.atomicTemperatureFactors_isotropic = atomicTemperatureFactors_isotropic;
    }


    /**
     * Gets the atomicTemperatureFactors_anisotropic value for this AtomicTemperatureFactorsType.
     * 
     * @return atomicTemperatureFactors_anisotropic
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomicTemperatureFactors_anisotropicType getAtomicTemperatureFactors_anisotropic() {
        return atomicTemperatureFactors_anisotropic;
    }


    /**
     * Sets the atomicTemperatureFactors_anisotropic value for this AtomicTemperatureFactorsType.
     * 
     * @param atomicTemperatureFactors_anisotropic
     */
    public void setAtomicTemperatureFactors_anisotropic(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AtomicTemperatureFactors_anisotropicType atomicTemperatureFactors_anisotropic) {
        this.atomicTemperatureFactors_anisotropic = atomicTemperatureFactors_anisotropic;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtomicTemperatureFactorsType)) return false;
        AtomicTemperatureFactorsType other = (AtomicTemperatureFactorsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.atomicTemperatureFactors_isotropic==null && other.getAtomicTemperatureFactors_isotropic()==null) || 
             (this.atomicTemperatureFactors_isotropic!=null &&
              this.atomicTemperatureFactors_isotropic.equals(other.getAtomicTemperatureFactors_isotropic()))) &&
            ((this.atomicTemperatureFactors_anisotropic==null && other.getAtomicTemperatureFactors_anisotropic()==null) || 
             (this.atomicTemperatureFactors_anisotropic!=null &&
              this.atomicTemperatureFactors_anisotropic.equals(other.getAtomicTemperatureFactors_anisotropic())));
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
        if (getAtomicTemperatureFactors_isotropic() != null) {
            _hashCode += getAtomicTemperatureFactors_isotropic().hashCode();
        }
        if (getAtomicTemperatureFactors_anisotropic() != null) {
            _hashCode += getAtomicTemperatureFactors_anisotropic().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AtomicTemperatureFactorsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atomic-temperature-factorsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atomicTemperatureFactors_isotropic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atomic-temperature-factors_isotropic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atomic-temperature-factors_isotropicType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atomicTemperatureFactors_anisotropic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atomic-temperature-factors_anisotropic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Atomic-temperature-factors_anisotropicType"));
        elemField.setMinOccurs(0);
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
