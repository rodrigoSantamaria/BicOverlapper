/**
 * InlineGraphic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class InlineGraphic  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AltText altText;

    private org.apache.axis.types.IDRef alternateFormOf;  // attribute

    private org.apache.axis.types.Id id;  // attribute

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineGraphicMimetype mimetype;  // attribute

    private java.lang.String mimeSubtype;  // attribute

    public InlineGraphic() {
    }

    public InlineGraphic(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AltText altText,
           org.apache.axis.types.IDRef alternateFormOf,
           org.apache.axis.types.Id id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineGraphicMimetype mimetype,
           java.lang.String mimeSubtype) {
           this.altText = altText;
           this.alternateFormOf = alternateFormOf;
           this.id = id;
           this.mimetype = mimetype;
           this.mimeSubtype = mimeSubtype;
    }


    /**
     * Gets the altText value for this InlineGraphic.
     * 
     * @return altText
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AltText getAltText() {
        return altText;
    }


    /**
     * Sets the altText value for this InlineGraphic.
     * 
     * @param altText
     */
    public void setAltText(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AltText altText) {
        this.altText = altText;
    }


    /**
     * Gets the alternateFormOf value for this InlineGraphic.
     * 
     * @return alternateFormOf
     */
    public org.apache.axis.types.IDRef getAlternateFormOf() {
        return alternateFormOf;
    }


    /**
     * Sets the alternateFormOf value for this InlineGraphic.
     * 
     * @param alternateFormOf
     */
    public void setAlternateFormOf(org.apache.axis.types.IDRef alternateFormOf) {
        this.alternateFormOf = alternateFormOf;
    }


    /**
     * Gets the id value for this InlineGraphic.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this InlineGraphic.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }


    /**
     * Gets the mimetype value for this InlineGraphic.
     * 
     * @return mimetype
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineGraphicMimetype getMimetype() {
        return mimetype;
    }


    /**
     * Sets the mimetype value for this InlineGraphic.
     * 
     * @param mimetype
     */
    public void setMimetype(gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineGraphicMimetype mimetype) {
        this.mimetype = mimetype;
    }


    /**
     * Gets the mimeSubtype value for this InlineGraphic.
     * 
     * @return mimeSubtype
     */
    public java.lang.String getMimeSubtype() {
        return mimeSubtype;
    }


    /**
     * Sets the mimeSubtype value for this InlineGraphic.
     * 
     * @param mimeSubtype
     */
    public void setMimeSubtype(java.lang.String mimeSubtype) {
        this.mimeSubtype = mimeSubtype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InlineGraphic)) return false;
        InlineGraphic other = (InlineGraphic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.altText==null && other.getAltText()==null) || 
             (this.altText!=null &&
              this.altText.equals(other.getAltText()))) &&
            ((this.alternateFormOf==null && other.getAlternateFormOf()==null) || 
             (this.alternateFormOf!=null &&
              this.alternateFormOf.equals(other.getAlternateFormOf()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.mimetype==null && other.getMimetype()==null) || 
             (this.mimetype!=null &&
              this.mimetype.equals(other.getMimetype()))) &&
            ((this.mimeSubtype==null && other.getMimeSubtype()==null) || 
             (this.mimeSubtype!=null &&
              this.mimeSubtype.equals(other.getMimeSubtype())));
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
        if (getAltText() != null) {
            _hashCode += getAltText().hashCode();
        }
        if (getAlternateFormOf() != null) {
            _hashCode += getAlternateFormOf().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getMimetype() != null) {
            _hashCode += getMimetype().hashCode();
        }
        if (getMimeSubtype() != null) {
            _hashCode += getMimeSubtype().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InlineGraphic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">inline-graphic"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("alternateFormOf");
        attrField.setXmlName(new javax.xml.namespace.QName("", "alternate-form-of"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "IDREF"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("mimetype");
        attrField.setXmlName(new javax.xml.namespace.QName("", "mimetype"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">>inline-graphic>mimetype"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("mimeSubtype");
        attrField.setXmlName(new javax.xml.namespace.QName("", "mime-subtype"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "alt-text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">alt-text"));
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
