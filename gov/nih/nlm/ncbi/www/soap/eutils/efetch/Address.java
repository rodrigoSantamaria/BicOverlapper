/**
 * Address.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Address  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AddrLine addrLine;

    private java.lang.String country;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fax fax;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Institution institution;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Phone phone;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email email;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink extLink;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri uri;

    private org.apache.axis.types.Id id;  // attribute

    public Address() {
    }

    public Address(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AddrLine addrLine,
           java.lang.String country,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fax fax,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Institution institution,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Phone phone,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email email,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink extLink,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri uri,
           org.apache.axis.types.Id id) {
           this.addrLine = addrLine;
           this.country = country;
           this.fax = fax;
           this.institution = institution;
           this.phone = phone;
           this.email = email;
           this.extLink = extLink;
           this.uri = uri;
           this.id = id;
    }


    /**
     * Gets the addrLine value for this Address.
     * 
     * @return addrLine
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AddrLine getAddrLine() {
        return addrLine;
    }


    /**
     * Sets the addrLine value for this Address.
     * 
     * @param addrLine
     */
    public void setAddrLine(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AddrLine addrLine) {
        this.addrLine = addrLine;
    }


    /**
     * Gets the country value for this Address.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Address.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the fax value for this Address.
     * 
     * @return fax
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fax getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this Address.
     * 
     * @param fax
     */
    public void setFax(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Fax fax) {
        this.fax = fax;
    }


    /**
     * Gets the institution value for this Address.
     * 
     * @return institution
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Institution getInstitution() {
        return institution;
    }


    /**
     * Sets the institution value for this Address.
     * 
     * @param institution
     */
    public void setInstitution(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Institution institution) {
        this.institution = institution;
    }


    /**
     * Gets the phone value for this Address.
     * 
     * @return phone
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Phone getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this Address.
     * 
     * @param phone
     */
    public void setPhone(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Phone phone) {
        this.phone = phone;
    }


    /**
     * Gets the email value for this Address.
     * 
     * @return email
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Address.
     * 
     * @param email
     */
    public void setEmail(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Email email) {
        this.email = email;
    }


    /**
     * Gets the extLink value for this Address.
     * 
     * @return extLink
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink getExtLink() {
        return extLink;
    }


    /**
     * Sets the extLink value for this Address.
     * 
     * @param extLink
     */
    public void setExtLink(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ExtLink extLink) {
        this.extLink = extLink;
    }


    /**
     * Gets the uri value for this Address.
     * 
     * @return uri
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this Address.
     * 
     * @param uri
     */
    public void setUri(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Uri uri) {
        this.uri = uri;
    }


    /**
     * Gets the id value for this Address.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this Address.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Address)) return false;
        Address other = (Address) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addrLine==null && other.getAddrLine()==null) || 
             (this.addrLine!=null &&
              this.addrLine.equals(other.getAddrLine()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.institution==null && other.getInstitution()==null) || 
             (this.institution!=null &&
              this.institution.equals(other.getInstitution()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.extLink==null && other.getExtLink()==null) || 
             (this.extLink!=null &&
              this.extLink.equals(other.getExtLink()))) &&
            ((this.uri==null && other.getUri()==null) || 
             (this.uri!=null &&
              this.uri.equals(other.getUri()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (getAddrLine() != null) {
            _hashCode += getAddrLine().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getInstitution() != null) {
            _hashCode += getInstitution().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getExtLink() != null) {
            _hashCode += getExtLink().hashCode();
        }
        if (getUri() != null) {
            _hashCode += getUri().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Address.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">address"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addrLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "addr-line"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">addr-line"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">fax"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("institution");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "institution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">institution"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">phone"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">email"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extLink");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ext-link"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ext-link"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "uri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">uri"));
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
