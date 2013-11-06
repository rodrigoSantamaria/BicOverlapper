/**
 * MedlineJournalInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MedlineJournalInfoType  implements java.io.Serializable {
    private java.lang.String country;

    private java.lang.String medlineTA;

    private java.lang.String nlmUniqueID;

    public MedlineJournalInfoType() {
    }

    public MedlineJournalInfoType(
           java.lang.String country,
           java.lang.String medlineTA,
           java.lang.String nlmUniqueID) {
           this.country = country;
           this.medlineTA = medlineTA;
           this.nlmUniqueID = nlmUniqueID;
    }


    /**
     * Gets the country value for this MedlineJournalInfoType.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this MedlineJournalInfoType.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the medlineTA value for this MedlineJournalInfoType.
     * 
     * @return medlineTA
     */
    public java.lang.String getMedlineTA() {
        return medlineTA;
    }


    /**
     * Sets the medlineTA value for this MedlineJournalInfoType.
     * 
     * @param medlineTA
     */
    public void setMedlineTA(java.lang.String medlineTA) {
        this.medlineTA = medlineTA;
    }


    /**
     * Gets the nlmUniqueID value for this MedlineJournalInfoType.
     * 
     * @return nlmUniqueID
     */
    public java.lang.String getNlmUniqueID() {
        return nlmUniqueID;
    }


    /**
     * Sets the nlmUniqueID value for this MedlineJournalInfoType.
     * 
     * @param nlmUniqueID
     */
    public void setNlmUniqueID(java.lang.String nlmUniqueID) {
        this.nlmUniqueID = nlmUniqueID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MedlineJournalInfoType)) return false;
        MedlineJournalInfoType other = (MedlineJournalInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.medlineTA==null && other.getMedlineTA()==null) || 
             (this.medlineTA!=null &&
              this.medlineTA.equals(other.getMedlineTA()))) &&
            ((this.nlmUniqueID==null && other.getNlmUniqueID()==null) || 
             (this.nlmUniqueID!=null &&
              this.nlmUniqueID.equals(other.getNlmUniqueID())));
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
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getMedlineTA() != null) {
            _hashCode += getMedlineTA().hashCode();
        }
        if (getNlmUniqueID() != null) {
            _hashCode += getNlmUniqueID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MedlineJournalInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MedlineJournalInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineTA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MedlineTA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nlmUniqueID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NlmUniqueID"));
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
