/**
 * MedlarsRecordType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MedlarsRecordType  implements java.io.Serializable {
    private java.lang.String medlarsRecord_code;

    private java.lang.String medlarsRecord_abbr;

    private java.lang.String medlarsRecord_data;

    public MedlarsRecordType() {
    }

    public MedlarsRecordType(
           java.lang.String medlarsRecord_code,
           java.lang.String medlarsRecord_abbr,
           java.lang.String medlarsRecord_data) {
           this.medlarsRecord_code = medlarsRecord_code;
           this.medlarsRecord_abbr = medlarsRecord_abbr;
           this.medlarsRecord_data = medlarsRecord_data;
    }


    /**
     * Gets the medlarsRecord_code value for this MedlarsRecordType.
     * 
     * @return medlarsRecord_code
     */
    public java.lang.String getMedlarsRecord_code() {
        return medlarsRecord_code;
    }


    /**
     * Sets the medlarsRecord_code value for this MedlarsRecordType.
     * 
     * @param medlarsRecord_code
     */
    public void setMedlarsRecord_code(java.lang.String medlarsRecord_code) {
        this.medlarsRecord_code = medlarsRecord_code;
    }


    /**
     * Gets the medlarsRecord_abbr value for this MedlarsRecordType.
     * 
     * @return medlarsRecord_abbr
     */
    public java.lang.String getMedlarsRecord_abbr() {
        return medlarsRecord_abbr;
    }


    /**
     * Sets the medlarsRecord_abbr value for this MedlarsRecordType.
     * 
     * @param medlarsRecord_abbr
     */
    public void setMedlarsRecord_abbr(java.lang.String medlarsRecord_abbr) {
        this.medlarsRecord_abbr = medlarsRecord_abbr;
    }


    /**
     * Gets the medlarsRecord_data value for this MedlarsRecordType.
     * 
     * @return medlarsRecord_data
     */
    public java.lang.String getMedlarsRecord_data() {
        return medlarsRecord_data;
    }


    /**
     * Sets the medlarsRecord_data value for this MedlarsRecordType.
     * 
     * @param medlarsRecord_data
     */
    public void setMedlarsRecord_data(java.lang.String medlarsRecord_data) {
        this.medlarsRecord_data = medlarsRecord_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MedlarsRecordType)) return false;
        MedlarsRecordType other = (MedlarsRecordType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.medlarsRecord_code==null && other.getMedlarsRecord_code()==null) || 
             (this.medlarsRecord_code!=null &&
              this.medlarsRecord_code.equals(other.getMedlarsRecord_code()))) &&
            ((this.medlarsRecord_abbr==null && other.getMedlarsRecord_abbr()==null) || 
             (this.medlarsRecord_abbr!=null &&
              this.medlarsRecord_abbr.equals(other.getMedlarsRecord_abbr()))) &&
            ((this.medlarsRecord_data==null && other.getMedlarsRecord_data()==null) || 
             (this.medlarsRecord_data!=null &&
              this.medlarsRecord_data.equals(other.getMedlarsRecord_data())));
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
        if (getMedlarsRecord_code() != null) {
            _hashCode += getMedlarsRecord_code().hashCode();
        }
        if (getMedlarsRecord_abbr() != null) {
            _hashCode += getMedlarsRecord_abbr().hashCode();
        }
        if (getMedlarsRecord_data() != null) {
            _hashCode += getMedlarsRecord_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MedlarsRecordType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medlars-recordType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlarsRecord_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medlars-record_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlarsRecord_abbr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medlars-record_abbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlarsRecord_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medlars-record_data"));
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
