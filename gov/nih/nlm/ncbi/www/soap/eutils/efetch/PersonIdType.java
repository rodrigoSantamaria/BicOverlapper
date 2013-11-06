/**
 * PersonIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PersonIdType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PersonId_dbtagType personId_dbtag;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PersonId_nameType personId_name;

    private java.lang.String personId_ml;

    private java.lang.String personId_str;

    private java.lang.String personId_consortium;

    public PersonIdType() {
    }

    public PersonIdType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PersonId_dbtagType personId_dbtag,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PersonId_nameType personId_name,
           java.lang.String personId_ml,
           java.lang.String personId_str,
           java.lang.String personId_consortium) {
           this.personId_dbtag = personId_dbtag;
           this.personId_name = personId_name;
           this.personId_ml = personId_ml;
           this.personId_str = personId_str;
           this.personId_consortium = personId_consortium;
    }


    /**
     * Gets the personId_dbtag value for this PersonIdType.
     * 
     * @return personId_dbtag
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PersonId_dbtagType getPersonId_dbtag() {
        return personId_dbtag;
    }


    /**
     * Sets the personId_dbtag value for this PersonIdType.
     * 
     * @param personId_dbtag
     */
    public void setPersonId_dbtag(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PersonId_dbtagType personId_dbtag) {
        this.personId_dbtag = personId_dbtag;
    }


    /**
     * Gets the personId_name value for this PersonIdType.
     * 
     * @return personId_name
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PersonId_nameType getPersonId_name() {
        return personId_name;
    }


    /**
     * Sets the personId_name value for this PersonIdType.
     * 
     * @param personId_name
     */
    public void setPersonId_name(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PersonId_nameType personId_name) {
        this.personId_name = personId_name;
    }


    /**
     * Gets the personId_ml value for this PersonIdType.
     * 
     * @return personId_ml
     */
    public java.lang.String getPersonId_ml() {
        return personId_ml;
    }


    /**
     * Sets the personId_ml value for this PersonIdType.
     * 
     * @param personId_ml
     */
    public void setPersonId_ml(java.lang.String personId_ml) {
        this.personId_ml = personId_ml;
    }


    /**
     * Gets the personId_str value for this PersonIdType.
     * 
     * @return personId_str
     */
    public java.lang.String getPersonId_str() {
        return personId_str;
    }


    /**
     * Sets the personId_str value for this PersonIdType.
     * 
     * @param personId_str
     */
    public void setPersonId_str(java.lang.String personId_str) {
        this.personId_str = personId_str;
    }


    /**
     * Gets the personId_consortium value for this PersonIdType.
     * 
     * @return personId_consortium
     */
    public java.lang.String getPersonId_consortium() {
        return personId_consortium;
    }


    /**
     * Sets the personId_consortium value for this PersonIdType.
     * 
     * @param personId_consortium
     */
    public void setPersonId_consortium(java.lang.String personId_consortium) {
        this.personId_consortium = personId_consortium;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonIdType)) return false;
        PersonIdType other = (PersonIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.personId_dbtag==null && other.getPersonId_dbtag()==null) || 
             (this.personId_dbtag!=null &&
              this.personId_dbtag.equals(other.getPersonId_dbtag()))) &&
            ((this.personId_name==null && other.getPersonId_name()==null) || 
             (this.personId_name!=null &&
              this.personId_name.equals(other.getPersonId_name()))) &&
            ((this.personId_ml==null && other.getPersonId_ml()==null) || 
             (this.personId_ml!=null &&
              this.personId_ml.equals(other.getPersonId_ml()))) &&
            ((this.personId_str==null && other.getPersonId_str()==null) || 
             (this.personId_str!=null &&
              this.personId_str.equals(other.getPersonId_str()))) &&
            ((this.personId_consortium==null && other.getPersonId_consortium()==null) || 
             (this.personId_consortium!=null &&
              this.personId_consortium.equals(other.getPersonId_consortium())));
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
        if (getPersonId_dbtag() != null) {
            _hashCode += getPersonId_dbtag().hashCode();
        }
        if (getPersonId_name() != null) {
            _hashCode += getPersonId_name().hashCode();
        }
        if (getPersonId_ml() != null) {
            _hashCode += getPersonId_ml().hashCode();
        }
        if (getPersonId_str() != null) {
            _hashCode += getPersonId_str().hashCode();
        }
        if (getPersonId_consortium() != null) {
            _hashCode += getPersonId_consortium().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Person-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personId_dbtag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Person-id_dbtag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Person-id_dbtagType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personId_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Person-id_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Person-id_nameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personId_ml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Person-id_ml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personId_str");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Person-id_str"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personId_consortium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Person-id_consortium"));
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
