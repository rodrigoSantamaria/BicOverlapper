/**
 * Cn3DBackboneStyleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DBackboneStyleType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneStyle_typeType cn3DBackboneStyle_type;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneStyle_styleType cn3DBackboneStyle_style;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneStyle_colorSchemeType cn3DBackboneStyle_colorScheme;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneStyle_userColorType cn3DBackboneStyle_userColor;

    public Cn3DBackboneStyleType() {
    }

    public Cn3DBackboneStyleType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneStyle_typeType cn3DBackboneStyle_type,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneStyle_styleType cn3DBackboneStyle_style,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneStyle_colorSchemeType cn3DBackboneStyle_colorScheme,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneStyle_userColorType cn3DBackboneStyle_userColor) {
           this.cn3DBackboneStyle_type = cn3DBackboneStyle_type;
           this.cn3DBackboneStyle_style = cn3DBackboneStyle_style;
           this.cn3DBackboneStyle_colorScheme = cn3DBackboneStyle_colorScheme;
           this.cn3DBackboneStyle_userColor = cn3DBackboneStyle_userColor;
    }


    /**
     * Gets the cn3DBackboneStyle_type value for this Cn3DBackboneStyleType.
     * 
     * @return cn3DBackboneStyle_type
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneStyle_typeType getCn3DBackboneStyle_type() {
        return cn3DBackboneStyle_type;
    }


    /**
     * Sets the cn3DBackboneStyle_type value for this Cn3DBackboneStyleType.
     * 
     * @param cn3DBackboneStyle_type
     */
    public void setCn3DBackboneStyle_type(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneStyle_typeType cn3DBackboneStyle_type) {
        this.cn3DBackboneStyle_type = cn3DBackboneStyle_type;
    }


    /**
     * Gets the cn3DBackboneStyle_style value for this Cn3DBackboneStyleType.
     * 
     * @return cn3DBackboneStyle_style
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneStyle_styleType getCn3DBackboneStyle_style() {
        return cn3DBackboneStyle_style;
    }


    /**
     * Sets the cn3DBackboneStyle_style value for this Cn3DBackboneStyleType.
     * 
     * @param cn3DBackboneStyle_style
     */
    public void setCn3DBackboneStyle_style(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneStyle_styleType cn3DBackboneStyle_style) {
        this.cn3DBackboneStyle_style = cn3DBackboneStyle_style;
    }


    /**
     * Gets the cn3DBackboneStyle_colorScheme value for this Cn3DBackboneStyleType.
     * 
     * @return cn3DBackboneStyle_colorScheme
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneStyle_colorSchemeType getCn3DBackboneStyle_colorScheme() {
        return cn3DBackboneStyle_colorScheme;
    }


    /**
     * Sets the cn3DBackboneStyle_colorScheme value for this Cn3DBackboneStyleType.
     * 
     * @param cn3DBackboneStyle_colorScheme
     */
    public void setCn3DBackboneStyle_colorScheme(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneStyle_colorSchemeType cn3DBackboneStyle_colorScheme) {
        this.cn3DBackboneStyle_colorScheme = cn3DBackboneStyle_colorScheme;
    }


    /**
     * Gets the cn3DBackboneStyle_userColor value for this Cn3DBackboneStyleType.
     * 
     * @return cn3DBackboneStyle_userColor
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneStyle_userColorType getCn3DBackboneStyle_userColor() {
        return cn3DBackboneStyle_userColor;
    }


    /**
     * Sets the cn3DBackboneStyle_userColor value for this Cn3DBackboneStyleType.
     * 
     * @param cn3DBackboneStyle_userColor
     */
    public void setCn3DBackboneStyle_userColor(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneStyle_userColorType cn3DBackboneStyle_userColor) {
        this.cn3DBackboneStyle_userColor = cn3DBackboneStyle_userColor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DBackboneStyleType)) return false;
        Cn3DBackboneStyleType other = (Cn3DBackboneStyleType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DBackboneStyle_type==null && other.getCn3DBackboneStyle_type()==null) || 
             (this.cn3DBackboneStyle_type!=null &&
              this.cn3DBackboneStyle_type.equals(other.getCn3DBackboneStyle_type()))) &&
            ((this.cn3DBackboneStyle_style==null && other.getCn3DBackboneStyle_style()==null) || 
             (this.cn3DBackboneStyle_style!=null &&
              this.cn3DBackboneStyle_style.equals(other.getCn3DBackboneStyle_style()))) &&
            ((this.cn3DBackboneStyle_colorScheme==null && other.getCn3DBackboneStyle_colorScheme()==null) || 
             (this.cn3DBackboneStyle_colorScheme!=null &&
              this.cn3DBackboneStyle_colorScheme.equals(other.getCn3DBackboneStyle_colorScheme()))) &&
            ((this.cn3DBackboneStyle_userColor==null && other.getCn3DBackboneStyle_userColor()==null) || 
             (this.cn3DBackboneStyle_userColor!=null &&
              this.cn3DBackboneStyle_userColor.equals(other.getCn3DBackboneStyle_userColor())));
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
        if (getCn3DBackboneStyle_type() != null) {
            _hashCode += getCn3DBackboneStyle_type().hashCode();
        }
        if (getCn3DBackboneStyle_style() != null) {
            _hashCode += getCn3DBackboneStyle_style().hashCode();
        }
        if (getCn3DBackboneStyle_colorScheme() != null) {
            _hashCode += getCn3DBackboneStyle_colorScheme().hashCode();
        }
        if (getCn3DBackboneStyle_userColor() != null) {
            _hashCode += getCn3DBackboneStyle_userColor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cn3DBackboneStyleType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-backbone-styleType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DBackboneStyle_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-backbone-style_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-backbone-style_typeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DBackboneStyle_style");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-backbone-style_style"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-backbone-style_styleType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DBackboneStyle_colorScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-backbone-style_color-scheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-backbone-style_color-schemeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DBackboneStyle_userColor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-backbone-style_user-color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-backbone-style_user-colorType"));
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
