/**
 * ElectronicAccessType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ElectronicAccessType  implements java.io.Serializable {
    private java.lang.String electronicAddress;

    private java.lang.String descriptiveInformation;

    public ElectronicAccessType() {
    }

    public ElectronicAccessType(
           java.lang.String electronicAddress,
           java.lang.String descriptiveInformation) {
           this.electronicAddress = electronicAddress;
           this.descriptiveInformation = descriptiveInformation;
    }


    /**
     * Gets the electronicAddress value for this ElectronicAccessType.
     * 
     * @return electronicAddress
     */
    public java.lang.String getElectronicAddress() {
        return electronicAddress;
    }


    /**
     * Sets the electronicAddress value for this ElectronicAccessType.
     * 
     * @param electronicAddress
     */
    public void setElectronicAddress(java.lang.String electronicAddress) {
        this.electronicAddress = electronicAddress;
    }


    /**
     * Gets the descriptiveInformation value for this ElectronicAccessType.
     * 
     * @return descriptiveInformation
     */
    public java.lang.String getDescriptiveInformation() {
        return descriptiveInformation;
    }


    /**
     * Sets the descriptiveInformation value for this ElectronicAccessType.
     * 
     * @param descriptiveInformation
     */
    public void setDescriptiveInformation(java.lang.String descriptiveInformation) {
        this.descriptiveInformation = descriptiveInformation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElectronicAccessType)) return false;
        ElectronicAccessType other = (ElectronicAccessType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.electronicAddress==null && other.getElectronicAddress()==null) || 
             (this.electronicAddress!=null &&
              this.electronicAddress.equals(other.getElectronicAddress()))) &&
            ((this.descriptiveInformation==null && other.getDescriptiveInformation()==null) || 
             (this.descriptiveInformation!=null &&
              this.descriptiveInformation.equals(other.getDescriptiveInformation())));
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
        if (getElectronicAddress() != null) {
            _hashCode += getElectronicAddress().hashCode();
        }
        if (getDescriptiveInformation() != null) {
            _hashCode += getDescriptiveInformation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ElectronicAccessType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ElectronicAccessType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("electronicAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ElectronicAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptiveInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DescriptiveInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
