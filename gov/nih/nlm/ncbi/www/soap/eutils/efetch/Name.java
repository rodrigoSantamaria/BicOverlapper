/**
 * Name.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Name  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Surname surname;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GivenNames givenNames;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Prefix prefix;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Suffix suffix;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.NameNameStyle nameStyle;  // attribute

    public Name() {
    }

    public Name(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Surname surname,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GivenNames givenNames,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Prefix prefix,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Suffix suffix,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.NameNameStyle nameStyle) {
           this.surname = surname;
           this.givenNames = givenNames;
           this.prefix = prefix;
           this.suffix = suffix;
           this.nameStyle = nameStyle;
    }


    /**
     * Gets the surname value for this Name.
     * 
     * @return surname
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Surname getSurname() {
        return surname;
    }


    /**
     * Sets the surname value for this Name.
     * 
     * @param surname
     */
    public void setSurname(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Surname surname) {
        this.surname = surname;
    }


    /**
     * Gets the givenNames value for this Name.
     * 
     * @return givenNames
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GivenNames getGivenNames() {
        return givenNames;
    }


    /**
     * Sets the givenNames value for this Name.
     * 
     * @param givenNames
     */
    public void setGivenNames(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GivenNames givenNames) {
        this.givenNames = givenNames;
    }


    /**
     * Gets the prefix value for this Name.
     * 
     * @return prefix
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Prefix getPrefix() {
        return prefix;
    }


    /**
     * Sets the prefix value for this Name.
     * 
     * @param prefix
     */
    public void setPrefix(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Prefix prefix) {
        this.prefix = prefix;
    }


    /**
     * Gets the suffix value for this Name.
     * 
     * @return suffix
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Suffix getSuffix() {
        return suffix;
    }


    /**
     * Sets the suffix value for this Name.
     * 
     * @param suffix
     */
    public void setSuffix(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Suffix suffix) {
        this.suffix = suffix;
    }


    /**
     * Gets the nameStyle value for this Name.
     * 
     * @return nameStyle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.NameNameStyle getNameStyle() {
        return nameStyle;
    }


    /**
     * Sets the nameStyle value for this Name.
     * 
     * @param nameStyle
     */
    public void setNameStyle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.NameNameStyle nameStyle) {
        this.nameStyle = nameStyle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Name)) return false;
        Name other = (Name) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.surname==null && other.getSurname()==null) || 
             (this.surname!=null &&
              this.surname.equals(other.getSurname()))) &&
            ((this.givenNames==null && other.getGivenNames()==null) || 
             (this.givenNames!=null &&
              this.givenNames.equals(other.getGivenNames()))) &&
            ((this.prefix==null && other.getPrefix()==null) || 
             (this.prefix!=null &&
              this.prefix.equals(other.getPrefix()))) &&
            ((this.suffix==null && other.getSuffix()==null) || 
             (this.suffix!=null &&
              this.suffix.equals(other.getSuffix()))) &&
            ((this.nameStyle==null && other.getNameStyle()==null) || 
             (this.nameStyle!=null &&
              this.nameStyle.equals(other.getNameStyle())));
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
        if (getSurname() != null) {
            _hashCode += getSurname().hashCode();
        }
        if (getGivenNames() != null) {
            _hashCode += getGivenNames().hashCode();
        }
        if (getPrefix() != null) {
            _hashCode += getPrefix().hashCode();
        }
        if (getSuffix() != null) {
            _hashCode += getSuffix().hashCode();
        }
        if (getNameStyle() != null) {
            _hashCode += getNameStyle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Name.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">name"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("nameStyle");
        attrField.setXmlName(new javax.xml.namespace.QName("", "name-style"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">>name>name-style"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "surname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">surname"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("givenNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "given-names"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">given-names"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">prefix"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suffix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "suffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">suffix"));
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
