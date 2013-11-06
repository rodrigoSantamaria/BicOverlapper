/**
 * MedlineRnType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MedlineRnType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineRn_typeType medlineRn_type;

    private java.lang.String medlineRn_cit;

    private java.lang.String medlineRn_name;

    public MedlineRnType() {
    }

    public MedlineRnType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineRn_typeType medlineRn_type,
           java.lang.String medlineRn_cit,
           java.lang.String medlineRn_name) {
           this.medlineRn_type = medlineRn_type;
           this.medlineRn_cit = medlineRn_cit;
           this.medlineRn_name = medlineRn_name;
    }


    /**
     * Gets the medlineRn_type value for this MedlineRnType.
     * 
     * @return medlineRn_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineRn_typeType getMedlineRn_type() {
        return medlineRn_type;
    }


    /**
     * Sets the medlineRn_type value for this MedlineRnType.
     * 
     * @param medlineRn_type
     */
    public void setMedlineRn_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineRn_typeType medlineRn_type) {
        this.medlineRn_type = medlineRn_type;
    }


    /**
     * Gets the medlineRn_cit value for this MedlineRnType.
     * 
     * @return medlineRn_cit
     */
    public java.lang.String getMedlineRn_cit() {
        return medlineRn_cit;
    }


    /**
     * Sets the medlineRn_cit value for this MedlineRnType.
     * 
     * @param medlineRn_cit
     */
    public void setMedlineRn_cit(java.lang.String medlineRn_cit) {
        this.medlineRn_cit = medlineRn_cit;
    }


    /**
     * Gets the medlineRn_name value for this MedlineRnType.
     * 
     * @return medlineRn_name
     */
    public java.lang.String getMedlineRn_name() {
        return medlineRn_name;
    }


    /**
     * Sets the medlineRn_name value for this MedlineRnType.
     * 
     * @param medlineRn_name
     */
    public void setMedlineRn_name(java.lang.String medlineRn_name) {
        this.medlineRn_name = medlineRn_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MedlineRnType)) return false;
        MedlineRnType other = (MedlineRnType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.medlineRn_type==null && other.getMedlineRn_type()==null) || 
             (this.medlineRn_type!=null &&
              this.medlineRn_type.equals(other.getMedlineRn_type()))) &&
            ((this.medlineRn_cit==null && other.getMedlineRn_cit()==null) || 
             (this.medlineRn_cit!=null &&
              this.medlineRn_cit.equals(other.getMedlineRn_cit()))) &&
            ((this.medlineRn_name==null && other.getMedlineRn_name()==null) || 
             (this.medlineRn_name!=null &&
              this.medlineRn_name.equals(other.getMedlineRn_name())));
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
        if (getMedlineRn_type() != null) {
            _hashCode += getMedlineRn_type().hashCode();
        }
        if (getMedlineRn_cit() != null) {
            _hashCode += getMedlineRn_cit().hashCode();
        }
        if (getMedlineRn_name() != null) {
            _hashCode += getMedlineRn_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MedlineRnType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-rnType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineRn_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-rn_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-rn_typeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineRn_cit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-rn_cit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineRn_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-rn_name"));
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
