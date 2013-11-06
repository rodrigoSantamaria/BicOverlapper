/**
 * MSMZHitType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSMZHitType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSMZHit_ionType MSMZHit_ion;

    private java.lang.String MSMZHit_charge;

    private java.lang.String MSMZHit_number;

    private java.lang.String MSMZHit_mz;

    public MSMZHitType() {
    }

    public MSMZHitType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSMZHit_ionType MSMZHit_ion,
           java.lang.String MSMZHit_charge,
           java.lang.String MSMZHit_number,
           java.lang.String MSMZHit_mz) {
           this.MSMZHit_ion = MSMZHit_ion;
           this.MSMZHit_charge = MSMZHit_charge;
           this.MSMZHit_number = MSMZHit_number;
           this.MSMZHit_mz = MSMZHit_mz;
    }


    /**
     * Gets the MSMZHit_ion value for this MSMZHitType.
     * 
     * @return MSMZHit_ion
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSMZHit_ionType getMSMZHit_ion() {
        return MSMZHit_ion;
    }


    /**
     * Sets the MSMZHit_ion value for this MSMZHitType.
     * 
     * @param MSMZHit_ion
     */
    public void setMSMZHit_ion(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSMZHit_ionType MSMZHit_ion) {
        this.MSMZHit_ion = MSMZHit_ion;
    }


    /**
     * Gets the MSMZHit_charge value for this MSMZHitType.
     * 
     * @return MSMZHit_charge
     */
    public java.lang.String getMSMZHit_charge() {
        return MSMZHit_charge;
    }


    /**
     * Sets the MSMZHit_charge value for this MSMZHitType.
     * 
     * @param MSMZHit_charge
     */
    public void setMSMZHit_charge(java.lang.String MSMZHit_charge) {
        this.MSMZHit_charge = MSMZHit_charge;
    }


    /**
     * Gets the MSMZHit_number value for this MSMZHitType.
     * 
     * @return MSMZHit_number
     */
    public java.lang.String getMSMZHit_number() {
        return MSMZHit_number;
    }


    /**
     * Sets the MSMZHit_number value for this MSMZHitType.
     * 
     * @param MSMZHit_number
     */
    public void setMSMZHit_number(java.lang.String MSMZHit_number) {
        this.MSMZHit_number = MSMZHit_number;
    }


    /**
     * Gets the MSMZHit_mz value for this MSMZHitType.
     * 
     * @return MSMZHit_mz
     */
    public java.lang.String getMSMZHit_mz() {
        return MSMZHit_mz;
    }


    /**
     * Sets the MSMZHit_mz value for this MSMZHitType.
     * 
     * @param MSMZHit_mz
     */
    public void setMSMZHit_mz(java.lang.String MSMZHit_mz) {
        this.MSMZHit_mz = MSMZHit_mz;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSMZHitType)) return false;
        MSMZHitType other = (MSMZHitType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSMZHit_ion==null && other.getMSMZHit_ion()==null) || 
             (this.MSMZHit_ion!=null &&
              this.MSMZHit_ion.equals(other.getMSMZHit_ion()))) &&
            ((this.MSMZHit_charge==null && other.getMSMZHit_charge()==null) || 
             (this.MSMZHit_charge!=null &&
              this.MSMZHit_charge.equals(other.getMSMZHit_charge()))) &&
            ((this.MSMZHit_number==null && other.getMSMZHit_number()==null) || 
             (this.MSMZHit_number!=null &&
              this.MSMZHit_number.equals(other.getMSMZHit_number()))) &&
            ((this.MSMZHit_mz==null && other.getMSMZHit_mz()==null) || 
             (this.MSMZHit_mz!=null &&
              this.MSMZHit_mz.equals(other.getMSMZHit_mz())));
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
        if (getMSMZHit_ion() != null) {
            _hashCode += getMSMZHit_ion().hashCode();
        }
        if (getMSMZHit_charge() != null) {
            _hashCode += getMSMZHit_charge().hashCode();
        }
        if (getMSMZHit_number() != null) {
            _hashCode += getMSMZHit_number().hashCode();
        }
        if (getMSMZHit_mz() != null) {
            _hashCode += getMSMZHit_mz().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MSMZHitType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSMZHitType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSMZHit_ion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSMZHit_ion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSMZHit_ionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSMZHit_charge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSMZHit_charge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSMZHit_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSMZHit_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSMZHit_mz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSMZHit_mz"));
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
