/**
 * MedlineSiType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MedlineSiType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineSi_typeType medlineSi_type;

    private java.lang.String medlineSi_cit;

    public MedlineSiType() {
    }

    public MedlineSiType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineSi_typeType medlineSi_type,
           java.lang.String medlineSi_cit) {
           this.medlineSi_type = medlineSi_type;
           this.medlineSi_cit = medlineSi_cit;
    }


    /**
     * Gets the medlineSi_type value for this MedlineSiType.
     * 
     * @return medlineSi_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineSi_typeType getMedlineSi_type() {
        return medlineSi_type;
    }


    /**
     * Sets the medlineSi_type value for this MedlineSiType.
     * 
     * @param medlineSi_type
     */
    public void setMedlineSi_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineSi_typeType medlineSi_type) {
        this.medlineSi_type = medlineSi_type;
    }


    /**
     * Gets the medlineSi_cit value for this MedlineSiType.
     * 
     * @return medlineSi_cit
     */
    public java.lang.String getMedlineSi_cit() {
        return medlineSi_cit;
    }


    /**
     * Sets the medlineSi_cit value for this MedlineSiType.
     * 
     * @param medlineSi_cit
     */
    public void setMedlineSi_cit(java.lang.String medlineSi_cit) {
        this.medlineSi_cit = medlineSi_cit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MedlineSiType)) return false;
        MedlineSiType other = (MedlineSiType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.medlineSi_type==null && other.getMedlineSi_type()==null) || 
             (this.medlineSi_type!=null &&
              this.medlineSi_type.equals(other.getMedlineSi_type()))) &&
            ((this.medlineSi_cit==null && other.getMedlineSi_cit()==null) || 
             (this.medlineSi_cit!=null &&
              this.medlineSi_cit.equals(other.getMedlineSi_cit())));
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
        if (getMedlineSi_type() != null) {
            _hashCode += getMedlineSi_type().hashCode();
        }
        if (getMedlineSi_cit() != null) {
            _hashCode += getMedlineSi_cit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MedlineSiType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-siType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineSi_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-si_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-si_typeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineSi_cit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-si_cit"));
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
