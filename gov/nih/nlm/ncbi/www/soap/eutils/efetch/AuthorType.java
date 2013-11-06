/**
 * AuthorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AuthorType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Author_nameType author_name;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Author_levelType author_level;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Author_roleType author_role;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Author_affilType author_affil;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Author_isCorrType author_isCorr;

    public AuthorType() {
    }

    public AuthorType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Author_nameType author_name,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Author_levelType author_level,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Author_roleType author_role,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Author_affilType author_affil,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Author_isCorrType author_isCorr) {
           this.author_name = author_name;
           this.author_level = author_level;
           this.author_role = author_role;
           this.author_affil = author_affil;
           this.author_isCorr = author_isCorr;
    }


    /**
     * Gets the author_name value for this AuthorType.
     * 
     * @return author_name
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Author_nameType getAuthor_name() {
        return author_name;
    }


    /**
     * Sets the author_name value for this AuthorType.
     * 
     * @param author_name
     */
    public void setAuthor_name(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Author_nameType author_name) {
        this.author_name = author_name;
    }


    /**
     * Gets the author_level value for this AuthorType.
     * 
     * @return author_level
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Author_levelType getAuthor_level() {
        return author_level;
    }


    /**
     * Sets the author_level value for this AuthorType.
     * 
     * @param author_level
     */
    public void setAuthor_level(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Author_levelType author_level) {
        this.author_level = author_level;
    }


    /**
     * Gets the author_role value for this AuthorType.
     * 
     * @return author_role
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Author_roleType getAuthor_role() {
        return author_role;
    }


    /**
     * Sets the author_role value for this AuthorType.
     * 
     * @param author_role
     */
    public void setAuthor_role(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Author_roleType author_role) {
        this.author_role = author_role;
    }


    /**
     * Gets the author_affil value for this AuthorType.
     * 
     * @return author_affil
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Author_affilType getAuthor_affil() {
        return author_affil;
    }


    /**
     * Sets the author_affil value for this AuthorType.
     * 
     * @param author_affil
     */
    public void setAuthor_affil(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Author_affilType author_affil) {
        this.author_affil = author_affil;
    }


    /**
     * Gets the author_isCorr value for this AuthorType.
     * 
     * @return author_isCorr
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Author_isCorrType getAuthor_isCorr() {
        return author_isCorr;
    }


    /**
     * Sets the author_isCorr value for this AuthorType.
     * 
     * @param author_isCorr
     */
    public void setAuthor_isCorr(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Author_isCorrType author_isCorr) {
        this.author_isCorr = author_isCorr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthorType)) return false;
        AuthorType other = (AuthorType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.author_name==null && other.getAuthor_name()==null) || 
             (this.author_name!=null &&
              this.author_name.equals(other.getAuthor_name()))) &&
            ((this.author_level==null && other.getAuthor_level()==null) || 
             (this.author_level!=null &&
              this.author_level.equals(other.getAuthor_level()))) &&
            ((this.author_role==null && other.getAuthor_role()==null) || 
             (this.author_role!=null &&
              this.author_role.equals(other.getAuthor_role()))) &&
            ((this.author_affil==null && other.getAuthor_affil()==null) || 
             (this.author_affil!=null &&
              this.author_affil.equals(other.getAuthor_affil()))) &&
            ((this.author_isCorr==null && other.getAuthor_isCorr()==null) || 
             (this.author_isCorr!=null &&
              this.author_isCorr.equals(other.getAuthor_isCorr())));
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
        if (getAuthor_name() != null) {
            _hashCode += getAuthor_name().hashCode();
        }
        if (getAuthor_level() != null) {
            _hashCode += getAuthor_level().hashCode();
        }
        if (getAuthor_role() != null) {
            _hashCode += getAuthor_role().hashCode();
        }
        if (getAuthor_affil() != null) {
            _hashCode += getAuthor_affil().hashCode();
        }
        if (getAuthor_isCorr() != null) {
            _hashCode += getAuthor_isCorr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthorType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AuthorType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Author_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Author_nameType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author_level");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Author_level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Author_levelType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author_role");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Author_role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Author_roleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author_affil");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Author_affil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Author_affilType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author_isCorr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Author_is-corr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Author_is-corrType"));
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
