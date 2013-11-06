/**
 * GlyphData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GlyphData  implements java.io.Serializable, org.apache.axis.encoding.MixedContentType {
    private org.apache.axis.message.MessageElement [] _any;  // attribute

    private org.apache.axis.types.Id id;  // attribute

    private org.apache.axis.types.NMToken format;  // attribute

    private java.lang.String resolution;  // attribute

    private java.lang.String xSize;  // attribute

    private java.lang.String ySize;  // attribute

    public GlyphData() {
    }

    public GlyphData(
           org.apache.axis.message.MessageElement [] _any,
           org.apache.axis.types.Id id,
           org.apache.axis.types.NMToken format,
           java.lang.String resolution,
           java.lang.String xSize,
           java.lang.String ySize) {
           this._any = _any;
           this.id = id;
           this.format = format;
           this.resolution = resolution;
           this.xSize = xSize;
           this.ySize = ySize;
    }


    /**
     * Gets the _any value for this GlyphData.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this GlyphData.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }


    /**
     * Gets the id value for this GlyphData.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this GlyphData.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }


    /**
     * Gets the format value for this GlyphData.
     * 
     * @return format
     */
    public org.apache.axis.types.NMToken getFormat() {
        return format;
    }


    /**
     * Sets the format value for this GlyphData.
     * 
     * @param format
     */
    public void setFormat(org.apache.axis.types.NMToken format) {
        this.format = format;
    }


    /**
     * Gets the resolution value for this GlyphData.
     * 
     * @return resolution
     */
    public java.lang.String getResolution() {
        return resolution;
    }


    /**
     * Sets the resolution value for this GlyphData.
     * 
     * @param resolution
     */
    public void setResolution(java.lang.String resolution) {
        this.resolution = resolution;
    }


    /**
     * Gets the xSize value for this GlyphData.
     * 
     * @return xSize
     */
    public java.lang.String getXSize() {
        return xSize;
    }


    /**
     * Sets the xSize value for this GlyphData.
     * 
     * @param xSize
     */
    public void setXSize(java.lang.String xSize) {
        this.xSize = xSize;
    }


    /**
     * Gets the ySize value for this GlyphData.
     * 
     * @return ySize
     */
    public java.lang.String getYSize() {
        return ySize;
    }


    /**
     * Sets the ySize value for this GlyphData.
     * 
     * @param ySize
     */
    public void setYSize(java.lang.String ySize) {
        this.ySize = ySize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlyphData)) return false;
        GlyphData other = (GlyphData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.resolution==null && other.getResolution()==null) || 
             (this.resolution!=null &&
              this.resolution.equals(other.getResolution()))) &&
            ((this.xSize==null && other.getXSize()==null) || 
             (this.xSize!=null &&
              this.xSize.equals(other.getXSize()))) &&
            ((this.ySize==null && other.getYSize()==null) || 
             (this.ySize!=null &&
              this.ySize.equals(other.getYSize())));
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
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getResolution() != null) {
            _hashCode += getResolution().hashCode();
        }
        if (getXSize() != null) {
            _hashCode += getXSize().hashCode();
        }
        if (getYSize() != null) {
            _hashCode += getYSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlyphData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">glyph-data"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("format");
        attrField.setXmlName(new javax.xml.namespace.QName("", "format"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "NMTOKEN"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("resolution");
        attrField.setXmlName(new javax.xml.namespace.QName("", "resolution"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("XSize");
        attrField.setXmlName(new javax.xml.namespace.QName("", "x-size"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("YSize");
        attrField.setXmlName(new javax.xml.namespace.QName("", "y-size"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
