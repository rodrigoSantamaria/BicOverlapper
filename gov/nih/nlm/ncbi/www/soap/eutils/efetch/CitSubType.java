/**
 * CitSubType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CitSubType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitSub_authorsType citSub_authors;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitSub_impType citSub_imp;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitSub_mediumType citSub_medium;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitSub_dateType citSub_date;

    private java.lang.String citSub_descr;

    public CitSubType() {
    }

    public CitSubType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitSub_authorsType citSub_authors,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitSub_impType citSub_imp,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitSub_mediumType citSub_medium,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitSub_dateType citSub_date,
           java.lang.String citSub_descr) {
           this.citSub_authors = citSub_authors;
           this.citSub_imp = citSub_imp;
           this.citSub_medium = citSub_medium;
           this.citSub_date = citSub_date;
           this.citSub_descr = citSub_descr;
    }


    /**
     * Gets the citSub_authors value for this CitSubType.
     * 
     * @return citSub_authors
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitSub_authorsType getCitSub_authors() {
        return citSub_authors;
    }


    /**
     * Sets the citSub_authors value for this CitSubType.
     * 
     * @param citSub_authors
     */
    public void setCitSub_authors(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitSub_authorsType citSub_authors) {
        this.citSub_authors = citSub_authors;
    }


    /**
     * Gets the citSub_imp value for this CitSubType.
     * 
     * @return citSub_imp
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitSub_impType getCitSub_imp() {
        return citSub_imp;
    }


    /**
     * Sets the citSub_imp value for this CitSubType.
     * 
     * @param citSub_imp
     */
    public void setCitSub_imp(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitSub_impType citSub_imp) {
        this.citSub_imp = citSub_imp;
    }


    /**
     * Gets the citSub_medium value for this CitSubType.
     * 
     * @return citSub_medium
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitSub_mediumType getCitSub_medium() {
        return citSub_medium;
    }


    /**
     * Sets the citSub_medium value for this CitSubType.
     * 
     * @param citSub_medium
     */
    public void setCitSub_medium(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitSub_mediumType citSub_medium) {
        this.citSub_medium = citSub_medium;
    }


    /**
     * Gets the citSub_date value for this CitSubType.
     * 
     * @return citSub_date
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitSub_dateType getCitSub_date() {
        return citSub_date;
    }


    /**
     * Sets the citSub_date value for this CitSubType.
     * 
     * @param citSub_date
     */
    public void setCitSub_date(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitSub_dateType citSub_date) {
        this.citSub_date = citSub_date;
    }


    /**
     * Gets the citSub_descr value for this CitSubType.
     * 
     * @return citSub_descr
     */
    public java.lang.String getCitSub_descr() {
        return citSub_descr;
    }


    /**
     * Sets the citSub_descr value for this CitSubType.
     * 
     * @param citSub_descr
     */
    public void setCitSub_descr(java.lang.String citSub_descr) {
        this.citSub_descr = citSub_descr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CitSubType)) return false;
        CitSubType other = (CitSubType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.citSub_authors==null && other.getCitSub_authors()==null) || 
             (this.citSub_authors!=null &&
              this.citSub_authors.equals(other.getCitSub_authors()))) &&
            ((this.citSub_imp==null && other.getCitSub_imp()==null) || 
             (this.citSub_imp!=null &&
              this.citSub_imp.equals(other.getCitSub_imp()))) &&
            ((this.citSub_medium==null && other.getCitSub_medium()==null) || 
             (this.citSub_medium!=null &&
              this.citSub_medium.equals(other.getCitSub_medium()))) &&
            ((this.citSub_date==null && other.getCitSub_date()==null) || 
             (this.citSub_date!=null &&
              this.citSub_date.equals(other.getCitSub_date()))) &&
            ((this.citSub_descr==null && other.getCitSub_descr()==null) || 
             (this.citSub_descr!=null &&
              this.citSub_descr.equals(other.getCitSub_descr())));
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
        if (getCitSub_authors() != null) {
            _hashCode += getCitSub_authors().hashCode();
        }
        if (getCitSub_imp() != null) {
            _hashCode += getCitSub_imp().hashCode();
        }
        if (getCitSub_medium() != null) {
            _hashCode += getCitSub_medium().hashCode();
        }
        if (getCitSub_date() != null) {
            _hashCode += getCitSub_date().hashCode();
        }
        if (getCitSub_descr() != null) {
            _hashCode += getCitSub_descr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CitSubType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-subType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citSub_authors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-sub_authors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-sub_authorsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citSub_imp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-sub_imp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-sub_impType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citSub_medium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-sub_medium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-sub_mediumType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citSub_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-sub_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-sub_dateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citSub_descr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-sub_descr"));
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
