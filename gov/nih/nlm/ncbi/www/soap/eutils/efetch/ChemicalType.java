/**
 * ChemicalType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ChemicalType  implements java.io.Serializable {
    private java.lang.String registryNumber;

    private java.lang.String nameOfSubstance;

    public ChemicalType() {
    }

    public ChemicalType(
           java.lang.String registryNumber,
           java.lang.String nameOfSubstance) {
           this.registryNumber = registryNumber;
           this.nameOfSubstance = nameOfSubstance;
    }


    /**
     * Gets the registryNumber value for this ChemicalType.
     * 
     * @return registryNumber
     */
    public java.lang.String getRegistryNumber() {
        return registryNumber;
    }


    /**
     * Sets the registryNumber value for this ChemicalType.
     * 
     * @param registryNumber
     */
    public void setRegistryNumber(java.lang.String registryNumber) {
        this.registryNumber = registryNumber;
    }


    /**
     * Gets the nameOfSubstance value for this ChemicalType.
     * 
     * @return nameOfSubstance
     */
    public java.lang.String getNameOfSubstance() {
        return nameOfSubstance;
    }


    /**
     * Sets the nameOfSubstance value for this ChemicalType.
     * 
     * @param nameOfSubstance
     */
    public void setNameOfSubstance(java.lang.String nameOfSubstance) {
        this.nameOfSubstance = nameOfSubstance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChemicalType)) return false;
        ChemicalType other = (ChemicalType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registryNumber==null && other.getRegistryNumber()==null) || 
             (this.registryNumber!=null &&
              this.registryNumber.equals(other.getRegistryNumber()))) &&
            ((this.nameOfSubstance==null && other.getNameOfSubstance()==null) || 
             (this.nameOfSubstance!=null &&
              this.nameOfSubstance.equals(other.getNameOfSubstance())));
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
        if (getRegistryNumber() != null) {
            _hashCode += getRegistryNumber().hashCode();
        }
        if (getNameOfSubstance() != null) {
            _hashCode += getNameOfSubstance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChemicalType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ChemicalType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registryNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RegistryNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameOfSubstance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NameOfSubstance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
