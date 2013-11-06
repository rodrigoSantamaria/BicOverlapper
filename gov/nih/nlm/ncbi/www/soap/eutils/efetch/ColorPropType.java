/**
 * ColorPropType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ColorPropType  implements java.io.Serializable {
    private java.lang.String colorProp_r;

    private java.lang.String colorProp_g;

    private java.lang.String colorProp_b;

    private java.lang.String colorProp_name;

    public ColorPropType() {
    }

    public ColorPropType(
           java.lang.String colorProp_r,
           java.lang.String colorProp_g,
           java.lang.String colorProp_b,
           java.lang.String colorProp_name) {
           this.colorProp_r = colorProp_r;
           this.colorProp_g = colorProp_g;
           this.colorProp_b = colorProp_b;
           this.colorProp_name = colorProp_name;
    }


    /**
     * Gets the colorProp_r value for this ColorPropType.
     * 
     * @return colorProp_r
     */
    public java.lang.String getColorProp_r() {
        return colorProp_r;
    }


    /**
     * Sets the colorProp_r value for this ColorPropType.
     * 
     * @param colorProp_r
     */
    public void setColorProp_r(java.lang.String colorProp_r) {
        this.colorProp_r = colorProp_r;
    }


    /**
     * Gets the colorProp_g value for this ColorPropType.
     * 
     * @return colorProp_g
     */
    public java.lang.String getColorProp_g() {
        return colorProp_g;
    }


    /**
     * Sets the colorProp_g value for this ColorPropType.
     * 
     * @param colorProp_g
     */
    public void setColorProp_g(java.lang.String colorProp_g) {
        this.colorProp_g = colorProp_g;
    }


    /**
     * Gets the colorProp_b value for this ColorPropType.
     * 
     * @return colorProp_b
     */
    public java.lang.String getColorProp_b() {
        return colorProp_b;
    }


    /**
     * Sets the colorProp_b value for this ColorPropType.
     * 
     * @param colorProp_b
     */
    public void setColorProp_b(java.lang.String colorProp_b) {
        this.colorProp_b = colorProp_b;
    }


    /**
     * Gets the colorProp_name value for this ColorPropType.
     * 
     * @return colorProp_name
     */
    public java.lang.String getColorProp_name() {
        return colorProp_name;
    }


    /**
     * Sets the colorProp_name value for this ColorPropType.
     * 
     * @param colorProp_name
     */
    public void setColorProp_name(java.lang.String colorProp_name) {
        this.colorProp_name = colorProp_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ColorPropType)) return false;
        ColorPropType other = (ColorPropType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.colorProp_r==null && other.getColorProp_r()==null) || 
             (this.colorProp_r!=null &&
              this.colorProp_r.equals(other.getColorProp_r()))) &&
            ((this.colorProp_g==null && other.getColorProp_g()==null) || 
             (this.colorProp_g!=null &&
              this.colorProp_g.equals(other.getColorProp_g()))) &&
            ((this.colorProp_b==null && other.getColorProp_b()==null) || 
             (this.colorProp_b!=null &&
              this.colorProp_b.equals(other.getColorProp_b()))) &&
            ((this.colorProp_name==null && other.getColorProp_name()==null) || 
             (this.colorProp_name!=null &&
              this.colorProp_name.equals(other.getColorProp_name())));
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
        if (getColorProp_r() != null) {
            _hashCode += getColorProp_r().hashCode();
        }
        if (getColorProp_g() != null) {
            _hashCode += getColorProp_g().hashCode();
        }
        if (getColorProp_b() != null) {
            _hashCode += getColorProp_b().hashCode();
        }
        if (getColorProp_name() != null) {
            _hashCode += getColorProp_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ColorPropType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Color-propType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colorProp_r");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Color-prop_r"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colorProp_g");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Color-prop_g"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colorProp_b");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Color-prop_b"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colorProp_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Color-prop_name"));
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
