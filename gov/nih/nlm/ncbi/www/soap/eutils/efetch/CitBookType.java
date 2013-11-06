/**
 * CitBookType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CitBookType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitBook_titleType citBook_title;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitBook_collType citBook_coll;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitBook_authorsType citBook_authors;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitBook_impType citBook_imp;

    public CitBookType() {
    }

    public CitBookType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitBook_titleType citBook_title,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitBook_collType citBook_coll,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitBook_authorsType citBook_authors,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitBook_impType citBook_imp) {
           this.citBook_title = citBook_title;
           this.citBook_coll = citBook_coll;
           this.citBook_authors = citBook_authors;
           this.citBook_imp = citBook_imp;
    }


    /**
     * Gets the citBook_title value for this CitBookType.
     * 
     * @return citBook_title
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitBook_titleType getCitBook_title() {
        return citBook_title;
    }


    /**
     * Sets the citBook_title value for this CitBookType.
     * 
     * @param citBook_title
     */
    public void setCitBook_title(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitBook_titleType citBook_title) {
        this.citBook_title = citBook_title;
    }


    /**
     * Gets the citBook_coll value for this CitBookType.
     * 
     * @return citBook_coll
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitBook_collType getCitBook_coll() {
        return citBook_coll;
    }


    /**
     * Sets the citBook_coll value for this CitBookType.
     * 
     * @param citBook_coll
     */
    public void setCitBook_coll(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitBook_collType citBook_coll) {
        this.citBook_coll = citBook_coll;
    }


    /**
     * Gets the citBook_authors value for this CitBookType.
     * 
     * @return citBook_authors
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitBook_authorsType getCitBook_authors() {
        return citBook_authors;
    }


    /**
     * Sets the citBook_authors value for this CitBookType.
     * 
     * @param citBook_authors
     */
    public void setCitBook_authors(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitBook_authorsType citBook_authors) {
        this.citBook_authors = citBook_authors;
    }


    /**
     * Gets the citBook_imp value for this CitBookType.
     * 
     * @return citBook_imp
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitBook_impType getCitBook_imp() {
        return citBook_imp;
    }


    /**
     * Sets the citBook_imp value for this CitBookType.
     * 
     * @param citBook_imp
     */
    public void setCitBook_imp(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitBook_impType citBook_imp) {
        this.citBook_imp = citBook_imp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CitBookType)) return false;
        CitBookType other = (CitBookType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.citBook_title==null && other.getCitBook_title()==null) || 
             (this.citBook_title!=null &&
              this.citBook_title.equals(other.getCitBook_title()))) &&
            ((this.citBook_coll==null && other.getCitBook_coll()==null) || 
             (this.citBook_coll!=null &&
              this.citBook_coll.equals(other.getCitBook_coll()))) &&
            ((this.citBook_authors==null && other.getCitBook_authors()==null) || 
             (this.citBook_authors!=null &&
              this.citBook_authors.equals(other.getCitBook_authors()))) &&
            ((this.citBook_imp==null && other.getCitBook_imp()==null) || 
             (this.citBook_imp!=null &&
              this.citBook_imp.equals(other.getCitBook_imp())));
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
        if (getCitBook_title() != null) {
            _hashCode += getCitBook_title().hashCode();
        }
        if (getCitBook_coll() != null) {
            _hashCode += getCitBook_coll().hashCode();
        }
        if (getCitBook_authors() != null) {
            _hashCode += getCitBook_authors().hashCode();
        }
        if (getCitBook_imp() != null) {
            _hashCode += getCitBook_imp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CitBookType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-bookType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citBook_title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-book_title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-book_titleType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citBook_coll");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-book_coll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-book_collType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citBook_authors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-book_authors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-book_authorsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citBook_imp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-book_imp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-book_impType"));
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
