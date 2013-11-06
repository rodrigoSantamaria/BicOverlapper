/**
 * PrivateChar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PrivateChar  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GlyphData glyphData;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GlyphRef glyphRef;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineGraphic[] inlineGraphic;

    private java.lang.String description;  // attribute

    private java.lang.String name;  // attribute

    public PrivateChar() {
    }

    public PrivateChar(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GlyphData glyphData,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GlyphRef glyphRef,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineGraphic[] inlineGraphic,
           java.lang.String description,
           java.lang.String name) {
           this.glyphData = glyphData;
           this.glyphRef = glyphRef;
           this.inlineGraphic = inlineGraphic;
           this.description = description;
           this.name = name;
    }


    /**
     * Gets the glyphData value for this PrivateChar.
     * 
     * @return glyphData
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GlyphData getGlyphData() {
        return glyphData;
    }


    /**
     * Sets the glyphData value for this PrivateChar.
     * 
     * @param glyphData
     */
    public void setGlyphData(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GlyphData glyphData) {
        this.glyphData = glyphData;
    }


    /**
     * Gets the glyphRef value for this PrivateChar.
     * 
     * @return glyphRef
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GlyphRef getGlyphRef() {
        return glyphRef;
    }


    /**
     * Sets the glyphRef value for this PrivateChar.
     * 
     * @param glyphRef
     */
    public void setGlyphRef(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GlyphRef glyphRef) {
        this.glyphRef = glyphRef;
    }


    /**
     * Gets the inlineGraphic value for this PrivateChar.
     * 
     * @return inlineGraphic
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineGraphic[] getInlineGraphic() {
        return inlineGraphic;
    }


    /**
     * Sets the inlineGraphic value for this PrivateChar.
     * 
     * @param inlineGraphic
     */
    public void setInlineGraphic(gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineGraphic[] inlineGraphic) {
        this.inlineGraphic = inlineGraphic;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineGraphic getInlineGraphic(int i) {
        return this.inlineGraphic[i];
    }

    public void setInlineGraphic(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.InlineGraphic _value) {
        this.inlineGraphic[i] = _value;
    }


    /**
     * Gets the description value for this PrivateChar.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PrivateChar.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the name value for this PrivateChar.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PrivateChar.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrivateChar)) return false;
        PrivateChar other = (PrivateChar) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.glyphData==null && other.getGlyphData()==null) || 
             (this.glyphData!=null &&
              this.glyphData.equals(other.getGlyphData()))) &&
            ((this.glyphRef==null && other.getGlyphRef()==null) || 
             (this.glyphRef!=null &&
              this.glyphRef.equals(other.getGlyphRef()))) &&
            ((this.inlineGraphic==null && other.getInlineGraphic()==null) || 
             (this.inlineGraphic!=null &&
              java.util.Arrays.equals(this.inlineGraphic, other.getInlineGraphic()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getGlyphData() != null) {
            _hashCode += getGlyphData().hashCode();
        }
        if (getGlyphRef() != null) {
            _hashCode += getGlyphRef().hashCode();
        }
        if (getInlineGraphic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInlineGraphic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInlineGraphic(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrivateChar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">private-char"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("description");
        attrField.setXmlName(new javax.xml.namespace.QName("", "description"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("name");
        attrField.setXmlName(new javax.xml.namespace.QName("", "name"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("glyphData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "glyph-data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">glyph-data"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("glyphRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "glyph-ref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">glyph-ref"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inlineGraphic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "inline-graphic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "inline-graphic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
