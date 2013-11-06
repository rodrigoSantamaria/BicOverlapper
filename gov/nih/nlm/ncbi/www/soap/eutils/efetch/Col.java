/**
 * Col.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Col  implements java.io.Serializable {
    private org.apache.axis.types.IDRef alternateFormOf;  // attribute

    private java.lang.String contentType;  // attribute

    private org.apache.axis.types.Id id;  // attribute

    private java.lang.String span;  // attribute

    private java.lang.String width;  // attribute

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ColAlign align;  // attribute

    private java.lang.String _char;  // attribute

    private java.lang.String charoff;  // attribute

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ColValign valign;  // attribute

    public Col() {
    }

    public Col(
           org.apache.axis.types.IDRef alternateFormOf,
           java.lang.String contentType,
           org.apache.axis.types.Id id,
           java.lang.String span,
           java.lang.String width,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ColAlign align,
           java.lang.String _char,
           java.lang.String charoff,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ColValign valign) {
           this.alternateFormOf = alternateFormOf;
           this.contentType = contentType;
           this.id = id;
           this.span = span;
           this.width = width;
           this.align = align;
           this._char = _char;
           this.charoff = charoff;
           this.valign = valign;
    }


    /**
     * Gets the alternateFormOf value for this Col.
     * 
     * @return alternateFormOf
     */
    public org.apache.axis.types.IDRef getAlternateFormOf() {
        return alternateFormOf;
    }


    /**
     * Sets the alternateFormOf value for this Col.
     * 
     * @param alternateFormOf
     */
    public void setAlternateFormOf(org.apache.axis.types.IDRef alternateFormOf) {
        this.alternateFormOf = alternateFormOf;
    }


    /**
     * Gets the contentType value for this Col.
     * 
     * @return contentType
     */
    public java.lang.String getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this Col.
     * 
     * @param contentType
     */
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the id value for this Col.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this Col.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }


    /**
     * Gets the span value for this Col.
     * 
     * @return span
     */
    public java.lang.String getSpan() {
        return span;
    }


    /**
     * Sets the span value for this Col.
     * 
     * @param span
     */
    public void setSpan(java.lang.String span) {
        this.span = span;
    }


    /**
     * Gets the width value for this Col.
     * 
     * @return width
     */
    public java.lang.String getWidth() {
        return width;
    }


    /**
     * Sets the width value for this Col.
     * 
     * @param width
     */
    public void setWidth(java.lang.String width) {
        this.width = width;
    }


    /**
     * Gets the align value for this Col.
     * 
     * @return align
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ColAlign getAlign() {
        return align;
    }


    /**
     * Sets the align value for this Col.
     * 
     * @param align
     */
    public void setAlign(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ColAlign align) {
        this.align = align;
    }


    /**
     * Gets the _char value for this Col.
     * 
     * @return _char
     */
    public java.lang.String get_char() {
        return _char;
    }


    /**
     * Sets the _char value for this Col.
     * 
     * @param _char
     */
    public void set_char(java.lang.String _char) {
        this._char = _char;
    }


    /**
     * Gets the charoff value for this Col.
     * 
     * @return charoff
     */
    public java.lang.String getCharoff() {
        return charoff;
    }


    /**
     * Sets the charoff value for this Col.
     * 
     * @param charoff
     */
    public void setCharoff(java.lang.String charoff) {
        this.charoff = charoff;
    }


    /**
     * Gets the valign value for this Col.
     * 
     * @return valign
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ColValign getValign() {
        return valign;
    }


    /**
     * Sets the valign value for this Col.
     * 
     * @param valign
     */
    public void setValign(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ColValign valign) {
        this.valign = valign;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Col)) return false;
        Col other = (Col) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alternateFormOf==null && other.getAlternateFormOf()==null) || 
             (this.alternateFormOf!=null &&
              this.alternateFormOf.equals(other.getAlternateFormOf()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.span==null && other.getSpan()==null) || 
             (this.span!=null &&
              this.span.equals(other.getSpan()))) &&
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth()))) &&
            ((this.align==null && other.getAlign()==null) || 
             (this.align!=null &&
              this.align.equals(other.getAlign()))) &&
            ((this._char==null && other.get_char()==null) || 
             (this._char!=null &&
              this._char.equals(other.get_char()))) &&
            ((this.charoff==null && other.getCharoff()==null) || 
             (this.charoff!=null &&
              this.charoff.equals(other.getCharoff()))) &&
            ((this.valign==null && other.getValign()==null) || 
             (this.valign!=null &&
              this.valign.equals(other.getValign())));
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
        if (getAlternateFormOf() != null) {
            _hashCode += getAlternateFormOf().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getSpan() != null) {
            _hashCode += getSpan().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        if (getAlign() != null) {
            _hashCode += getAlign().hashCode();
        }
        if (get_char() != null) {
            _hashCode += get_char().hashCode();
        }
        if (getCharoff() != null) {
            _hashCode += getCharoff().hashCode();
        }
        if (getValign() != null) {
            _hashCode += getValign().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Col.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">col"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("alternateFormOf");
        attrField.setXmlName(new javax.xml.namespace.QName("", "alternate-form-of"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "IDREF"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("contentType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "content-type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("span");
        attrField.setXmlName(new javax.xml.namespace.QName("", "span"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("width");
        attrField.setXmlName(new javax.xml.namespace.QName("", "width"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("align");
        attrField.setXmlName(new javax.xml.namespace.QName("", "align"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">>col>align"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("_char");
        attrField.setXmlName(new javax.xml.namespace.QName("", "char"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("charoff");
        attrField.setXmlName(new javax.xml.namespace.QName("", "charoff"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("valign");
        attrField.setXmlName(new javax.xml.namespace.QName("", "valign"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">>col>valign"));
        typeDesc.addFieldDesc(attrField);
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
