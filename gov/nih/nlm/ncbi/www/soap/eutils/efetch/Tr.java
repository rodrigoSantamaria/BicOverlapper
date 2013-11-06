/**
 * Tr.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Tr  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Th th;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Td td;

    private org.apache.axis.types.IDRef alternateFormOf;  // attribute

    private java.lang.String contentType;  // attribute

    private org.apache.axis.types.Id id;  // attribute

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrAlign align;  // attribute

    private java.lang.String _char;  // attribute

    private java.lang.String charoff;  // attribute

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrValign valign;  // attribute

    public Tr() {
    }

    public Tr(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Th th,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Td td,
           org.apache.axis.types.IDRef alternateFormOf,
           java.lang.String contentType,
           org.apache.axis.types.Id id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrAlign align,
           java.lang.String _char,
           java.lang.String charoff,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrValign valign) {
           this.th = th;
           this.td = td;
           this.alternateFormOf = alternateFormOf;
           this.contentType = contentType;
           this.id = id;
           this.align = align;
           this._char = _char;
           this.charoff = charoff;
           this.valign = valign;
    }


    /**
     * Gets the th value for this Tr.
     * 
     * @return th
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Th getTh() {
        return th;
    }


    /**
     * Sets the th value for this Tr.
     * 
     * @param th
     */
    public void setTh(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Th th) {
        this.th = th;
    }


    /**
     * Gets the td value for this Tr.
     * 
     * @return td
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Td getTd() {
        return td;
    }


    /**
     * Sets the td value for this Tr.
     * 
     * @param td
     */
    public void setTd(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Td td) {
        this.td = td;
    }


    /**
     * Gets the alternateFormOf value for this Tr.
     * 
     * @return alternateFormOf
     */
    public org.apache.axis.types.IDRef getAlternateFormOf() {
        return alternateFormOf;
    }


    /**
     * Sets the alternateFormOf value for this Tr.
     * 
     * @param alternateFormOf
     */
    public void setAlternateFormOf(org.apache.axis.types.IDRef alternateFormOf) {
        this.alternateFormOf = alternateFormOf;
    }


    /**
     * Gets the contentType value for this Tr.
     * 
     * @return contentType
     */
    public java.lang.String getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this Tr.
     * 
     * @param contentType
     */
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the id value for this Tr.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this Tr.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }


    /**
     * Gets the align value for this Tr.
     * 
     * @return align
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrAlign getAlign() {
        return align;
    }


    /**
     * Sets the align value for this Tr.
     * 
     * @param align
     */
    public void setAlign(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrAlign align) {
        this.align = align;
    }


    /**
     * Gets the _char value for this Tr.
     * 
     * @return _char
     */
    public java.lang.String get_char() {
        return _char;
    }


    /**
     * Sets the _char value for this Tr.
     * 
     * @param _char
     */
    public void set_char(java.lang.String _char) {
        this._char = _char;
    }


    /**
     * Gets the charoff value for this Tr.
     * 
     * @return charoff
     */
    public java.lang.String getCharoff() {
        return charoff;
    }


    /**
     * Sets the charoff value for this Tr.
     * 
     * @param charoff
     */
    public void setCharoff(java.lang.String charoff) {
        this.charoff = charoff;
    }


    /**
     * Gets the valign value for this Tr.
     * 
     * @return valign
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrValign getValign() {
        return valign;
    }


    /**
     * Sets the valign value for this Tr.
     * 
     * @param valign
     */
    public void setValign(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TrValign valign) {
        this.valign = valign;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tr)) return false;
        Tr other = (Tr) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.th==null && other.getTh()==null) || 
             (this.th!=null &&
              this.th.equals(other.getTh()))) &&
            ((this.td==null && other.getTd()==null) || 
             (this.td!=null &&
              this.td.equals(other.getTd()))) &&
            ((this.alternateFormOf==null && other.getAlternateFormOf()==null) || 
             (this.alternateFormOf!=null &&
              this.alternateFormOf.equals(other.getAlternateFormOf()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
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
        if (getTh() != null) {
            _hashCode += getTh().hashCode();
        }
        if (getTd() != null) {
            _hashCode += getTd().hashCode();
        }
        if (getAlternateFormOf() != null) {
            _hashCode += getAlternateFormOf().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
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
        new org.apache.axis.description.TypeDesc(Tr.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">tr"));
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
        attrField.setFieldName("align");
        attrField.setXmlName(new javax.xml.namespace.QName("", "align"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">>tr>align"));
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
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">>tr>valign"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("th");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "th"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">th"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("td");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "td"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">td"));
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
