/**
 * PersonalNameSubjectType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PersonalNameSubjectType  implements java.io.Serializable {
    private java.lang.String lastName;

    private java.lang.String foreName;

    private java.lang.String firstName;

    private java.lang.String middleName;

    private java.lang.String initials;

    private java.lang.String suffix;

    private java.lang.String datesAssociatedWithName;

    private java.lang.String nameQualifier;

    private java.lang.String otherInformation;

    private java.lang.String titleAssociatedWithName;

    public PersonalNameSubjectType() {
    }

    public PersonalNameSubjectType(
           java.lang.String lastName,
           java.lang.String foreName,
           java.lang.String firstName,
           java.lang.String middleName,
           java.lang.String initials,
           java.lang.String suffix,
           java.lang.String datesAssociatedWithName,
           java.lang.String nameQualifier,
           java.lang.String otherInformation,
           java.lang.String titleAssociatedWithName) {
           this.lastName = lastName;
           this.foreName = foreName;
           this.firstName = firstName;
           this.middleName = middleName;
           this.initials = initials;
           this.suffix = suffix;
           this.datesAssociatedWithName = datesAssociatedWithName;
           this.nameQualifier = nameQualifier;
           this.otherInformation = otherInformation;
           this.titleAssociatedWithName = titleAssociatedWithName;
    }


    /**
     * Gets the lastName value for this PersonalNameSubjectType.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this PersonalNameSubjectType.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the foreName value for this PersonalNameSubjectType.
     * 
     * @return foreName
     */
    public java.lang.String getForeName() {
        return foreName;
    }


    /**
     * Sets the foreName value for this PersonalNameSubjectType.
     * 
     * @param foreName
     */
    public void setForeName(java.lang.String foreName) {
        this.foreName = foreName;
    }


    /**
     * Gets the firstName value for this PersonalNameSubjectType.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this PersonalNameSubjectType.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the middleName value for this PersonalNameSubjectType.
     * 
     * @return middleName
     */
    public java.lang.String getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this PersonalNameSubjectType.
     * 
     * @param middleName
     */
    public void setMiddleName(java.lang.String middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the initials value for this PersonalNameSubjectType.
     * 
     * @return initials
     */
    public java.lang.String getInitials() {
        return initials;
    }


    /**
     * Sets the initials value for this PersonalNameSubjectType.
     * 
     * @param initials
     */
    public void setInitials(java.lang.String initials) {
        this.initials = initials;
    }


    /**
     * Gets the suffix value for this PersonalNameSubjectType.
     * 
     * @return suffix
     */
    public java.lang.String getSuffix() {
        return suffix;
    }


    /**
     * Sets the suffix value for this PersonalNameSubjectType.
     * 
     * @param suffix
     */
    public void setSuffix(java.lang.String suffix) {
        this.suffix = suffix;
    }


    /**
     * Gets the datesAssociatedWithName value for this PersonalNameSubjectType.
     * 
     * @return datesAssociatedWithName
     */
    public java.lang.String getDatesAssociatedWithName() {
        return datesAssociatedWithName;
    }


    /**
     * Sets the datesAssociatedWithName value for this PersonalNameSubjectType.
     * 
     * @param datesAssociatedWithName
     */
    public void setDatesAssociatedWithName(java.lang.String datesAssociatedWithName) {
        this.datesAssociatedWithName = datesAssociatedWithName;
    }


    /**
     * Gets the nameQualifier value for this PersonalNameSubjectType.
     * 
     * @return nameQualifier
     */
    public java.lang.String getNameQualifier() {
        return nameQualifier;
    }


    /**
     * Sets the nameQualifier value for this PersonalNameSubjectType.
     * 
     * @param nameQualifier
     */
    public void setNameQualifier(java.lang.String nameQualifier) {
        this.nameQualifier = nameQualifier;
    }


    /**
     * Gets the otherInformation value for this PersonalNameSubjectType.
     * 
     * @return otherInformation
     */
    public java.lang.String getOtherInformation() {
        return otherInformation;
    }


    /**
     * Sets the otherInformation value for this PersonalNameSubjectType.
     * 
     * @param otherInformation
     */
    public void setOtherInformation(java.lang.String otherInformation) {
        this.otherInformation = otherInformation;
    }


    /**
     * Gets the titleAssociatedWithName value for this PersonalNameSubjectType.
     * 
     * @return titleAssociatedWithName
     */
    public java.lang.String getTitleAssociatedWithName() {
        return titleAssociatedWithName;
    }


    /**
     * Sets the titleAssociatedWithName value for this PersonalNameSubjectType.
     * 
     * @param titleAssociatedWithName
     */
    public void setTitleAssociatedWithName(java.lang.String titleAssociatedWithName) {
        this.titleAssociatedWithName = titleAssociatedWithName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonalNameSubjectType)) return false;
        PersonalNameSubjectType other = (PersonalNameSubjectType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.foreName==null && other.getForeName()==null) || 
             (this.foreName!=null &&
              this.foreName.equals(other.getForeName()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.initials==null && other.getInitials()==null) || 
             (this.initials!=null &&
              this.initials.equals(other.getInitials()))) &&
            ((this.suffix==null && other.getSuffix()==null) || 
             (this.suffix!=null &&
              this.suffix.equals(other.getSuffix()))) &&
            ((this.datesAssociatedWithName==null && other.getDatesAssociatedWithName()==null) || 
             (this.datesAssociatedWithName!=null &&
              this.datesAssociatedWithName.equals(other.getDatesAssociatedWithName()))) &&
            ((this.nameQualifier==null && other.getNameQualifier()==null) || 
             (this.nameQualifier!=null &&
              this.nameQualifier.equals(other.getNameQualifier()))) &&
            ((this.otherInformation==null && other.getOtherInformation()==null) || 
             (this.otherInformation!=null &&
              this.otherInformation.equals(other.getOtherInformation()))) &&
            ((this.titleAssociatedWithName==null && other.getTitleAssociatedWithName()==null) || 
             (this.titleAssociatedWithName!=null &&
              this.titleAssociatedWithName.equals(other.getTitleAssociatedWithName())));
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
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getForeName() != null) {
            _hashCode += getForeName().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
        }
        if (getInitials() != null) {
            _hashCode += getInitials().hashCode();
        }
        if (getSuffix() != null) {
            _hashCode += getSuffix().hashCode();
        }
        if (getDatesAssociatedWithName() != null) {
            _hashCode += getDatesAssociatedWithName().hashCode();
        }
        if (getNameQualifier() != null) {
            _hashCode += getNameQualifier().hashCode();
        }
        if (getOtherInformation() != null) {
            _hashCode += getOtherInformation().hashCode();
        }
        if (getTitleAssociatedWithName() != null) {
            _hashCode += getTitleAssociatedWithName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonalNameSubjectType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PersonalNameSubjectType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ForeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MiddleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initials");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Initials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suffix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Suffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datesAssociatedWithName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DatesAssociatedWithName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameQualifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NameQualifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OtherInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titleAssociatedWithName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TitleAssociatedWithName"));
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
