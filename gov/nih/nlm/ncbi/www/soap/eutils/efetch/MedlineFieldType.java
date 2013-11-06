/**
 * MedlineFieldType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MedlineFieldType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineField_typeType medlineField_type;

    private java.lang.String medlineField_str;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineField_idsType medlineField_ids;

    public MedlineFieldType() {
    }

    public MedlineFieldType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineField_typeType medlineField_type,
           java.lang.String medlineField_str,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineField_idsType medlineField_ids) {
           this.medlineField_type = medlineField_type;
           this.medlineField_str = medlineField_str;
           this.medlineField_ids = medlineField_ids;
    }


    /**
     * Gets the medlineField_type value for this MedlineFieldType.
     * 
     * @return medlineField_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineField_typeType getMedlineField_type() {
        return medlineField_type;
    }


    /**
     * Sets the medlineField_type value for this MedlineFieldType.
     * 
     * @param medlineField_type
     */
    public void setMedlineField_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineField_typeType medlineField_type) {
        this.medlineField_type = medlineField_type;
    }


    /**
     * Gets the medlineField_str value for this MedlineFieldType.
     * 
     * @return medlineField_str
     */
    public java.lang.String getMedlineField_str() {
        return medlineField_str;
    }


    /**
     * Sets the medlineField_str value for this MedlineFieldType.
     * 
     * @param medlineField_str
     */
    public void setMedlineField_str(java.lang.String medlineField_str) {
        this.medlineField_str = medlineField_str;
    }


    /**
     * Gets the medlineField_ids value for this MedlineFieldType.
     * 
     * @return medlineField_ids
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineField_idsType getMedlineField_ids() {
        return medlineField_ids;
    }


    /**
     * Sets the medlineField_ids value for this MedlineFieldType.
     * 
     * @param medlineField_ids
     */
    public void setMedlineField_ids(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineField_idsType medlineField_ids) {
        this.medlineField_ids = medlineField_ids;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MedlineFieldType)) return false;
        MedlineFieldType other = (MedlineFieldType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.medlineField_type==null && other.getMedlineField_type()==null) || 
             (this.medlineField_type!=null &&
              this.medlineField_type.equals(other.getMedlineField_type()))) &&
            ((this.medlineField_str==null && other.getMedlineField_str()==null) || 
             (this.medlineField_str!=null &&
              this.medlineField_str.equals(other.getMedlineField_str()))) &&
            ((this.medlineField_ids==null && other.getMedlineField_ids()==null) || 
             (this.medlineField_ids!=null &&
              this.medlineField_ids.equals(other.getMedlineField_ids())));
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
        if (getMedlineField_type() != null) {
            _hashCode += getMedlineField_type().hashCode();
        }
        if (getMedlineField_str() != null) {
            _hashCode += getMedlineField_str().hashCode();
        }
        if (getMedlineField_ids() != null) {
            _hashCode += getMedlineField_ids().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MedlineFieldType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-fieldType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineField_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-field_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-field_typeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineField_str");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-field_str"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineField_ids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-field_ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-field_idsType"));
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
