/**
 * KwdGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class KwdGroup  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title title;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Kwd kwd;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.X x;

    private org.apache.axis.types.Id id;  // attribute

    private java.lang.String kwdGroupType;  // attribute

    public KwdGroup() {
    }

    public KwdGroup(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title title,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Kwd kwd,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.X x,
           org.apache.axis.types.Id id,
           java.lang.String kwdGroupType) {
           this.title = title;
           this.kwd = kwd;
           this.x = x;
           this.id = id;
           this.kwdGroupType = kwdGroupType;
    }


    /**
     * Gets the title value for this KwdGroup.
     * 
     * @return title
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title getTitle() {
        return title;
    }


    /**
     * Sets the title value for this KwdGroup.
     * 
     * @param title
     */
    public void setTitle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Title title) {
        this.title = title;
    }


    /**
     * Gets the kwd value for this KwdGroup.
     * 
     * @return kwd
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Kwd getKwd() {
        return kwd;
    }


    /**
     * Sets the kwd value for this KwdGroup.
     * 
     * @param kwd
     */
    public void setKwd(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Kwd kwd) {
        this.kwd = kwd;
    }


    /**
     * Gets the x value for this KwdGroup.
     * 
     * @return x
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.X getX() {
        return x;
    }


    /**
     * Sets the x value for this KwdGroup.
     * 
     * @param x
     */
    public void setX(gov.nih.nlm.ncbi.www.soap.eutils.efetch.X x) {
        this.x = x;
    }


    /**
     * Gets the id value for this KwdGroup.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this KwdGroup.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }


    /**
     * Gets the kwdGroupType value for this KwdGroup.
     * 
     * @return kwdGroupType
     */
    public java.lang.String getKwdGroupType() {
        return kwdGroupType;
    }


    /**
     * Sets the kwdGroupType value for this KwdGroup.
     * 
     * @param kwdGroupType
     */
    public void setKwdGroupType(java.lang.String kwdGroupType) {
        this.kwdGroupType = kwdGroupType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KwdGroup)) return false;
        KwdGroup other = (KwdGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.kwd==null && other.getKwd()==null) || 
             (this.kwd!=null &&
              this.kwd.equals(other.getKwd()))) &&
            ((this.x==null && other.getX()==null) || 
             (this.x!=null &&
              this.x.equals(other.getX()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.kwdGroupType==null && other.getKwdGroupType()==null) || 
             (this.kwdGroupType!=null &&
              this.kwdGroupType.equals(other.getKwdGroupType())));
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
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getKwd() != null) {
            _hashCode += getKwd().hashCode();
        }
        if (getX() != null) {
            _hashCode += getX().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getKwdGroupType() != null) {
            _hashCode += getKwdGroupType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KwdGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">kwd-group"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("kwdGroupType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "kwd-group-type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">title"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kwd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "kwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">kwd"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("x");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "x"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">x"));
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
