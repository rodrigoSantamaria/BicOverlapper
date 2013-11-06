/**
 * CitArtType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CitArtType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_titleType citArt_title;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_authorsType citArt_authors;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_fromType citArt_from;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_idsType citArt_ids;

    public CitArtType() {
    }

    public CitArtType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_titleType citArt_title,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_authorsType citArt_authors,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_fromType citArt_from,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_idsType citArt_ids) {
           this.citArt_title = citArt_title;
           this.citArt_authors = citArt_authors;
           this.citArt_from = citArt_from;
           this.citArt_ids = citArt_ids;
    }


    /**
     * Gets the citArt_title value for this CitArtType.
     * 
     * @return citArt_title
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_titleType getCitArt_title() {
        return citArt_title;
    }


    /**
     * Sets the citArt_title value for this CitArtType.
     * 
     * @param citArt_title
     */
    public void setCitArt_title(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_titleType citArt_title) {
        this.citArt_title = citArt_title;
    }


    /**
     * Gets the citArt_authors value for this CitArtType.
     * 
     * @return citArt_authors
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_authorsType getCitArt_authors() {
        return citArt_authors;
    }


    /**
     * Sets the citArt_authors value for this CitArtType.
     * 
     * @param citArt_authors
     */
    public void setCitArt_authors(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_authorsType citArt_authors) {
        this.citArt_authors = citArt_authors;
    }


    /**
     * Gets the citArt_from value for this CitArtType.
     * 
     * @return citArt_from
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_fromType getCitArt_from() {
        return citArt_from;
    }


    /**
     * Sets the citArt_from value for this CitArtType.
     * 
     * @param citArt_from
     */
    public void setCitArt_from(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_fromType citArt_from) {
        this.citArt_from = citArt_from;
    }


    /**
     * Gets the citArt_ids value for this CitArtType.
     * 
     * @return citArt_ids
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_idsType getCitArt_ids() {
        return citArt_ids;
    }


    /**
     * Sets the citArt_ids value for this CitArtType.
     * 
     * @param citArt_ids
     */
    public void setCitArt_ids(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CitArt_idsType citArt_ids) {
        this.citArt_ids = citArt_ids;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CitArtType)) return false;
        CitArtType other = (CitArtType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.citArt_title==null && other.getCitArt_title()==null) || 
             (this.citArt_title!=null &&
              this.citArt_title.equals(other.getCitArt_title()))) &&
            ((this.citArt_authors==null && other.getCitArt_authors()==null) || 
             (this.citArt_authors!=null &&
              this.citArt_authors.equals(other.getCitArt_authors()))) &&
            ((this.citArt_from==null && other.getCitArt_from()==null) || 
             (this.citArt_from!=null &&
              this.citArt_from.equals(other.getCitArt_from()))) &&
            ((this.citArt_ids==null && other.getCitArt_ids()==null) || 
             (this.citArt_ids!=null &&
              this.citArt_ids.equals(other.getCitArt_ids())));
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
        if (getCitArt_title() != null) {
            _hashCode += getCitArt_title().hashCode();
        }
        if (getCitArt_authors() != null) {
            _hashCode += getCitArt_authors().hashCode();
        }
        if (getCitArt_from() != null) {
            _hashCode += getCitArt_from().hashCode();
        }
        if (getCitArt_ids() != null) {
            _hashCode += getCitArt_ids().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CitArtType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-artType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citArt_title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-art_title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-art_titleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citArt_authors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-art_authors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-art_authorsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citArt_from");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-art_from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-art_fromType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citArt_ids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-art_ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cit-art_idsType"));
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
