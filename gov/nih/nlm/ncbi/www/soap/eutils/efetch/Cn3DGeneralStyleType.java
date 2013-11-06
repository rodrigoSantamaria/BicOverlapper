/**
 * Cn3DGeneralStyleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DGeneralStyleType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DGeneralStyle_isOnType cn3DGeneralStyle_isOn;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DGeneralStyle_styleType cn3DGeneralStyle_style;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DGeneralStyle_colorSchemeType cn3DGeneralStyle_colorScheme;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DGeneralStyle_userColorType cn3DGeneralStyle_userColor;

    public Cn3DGeneralStyleType() {
    }

    public Cn3DGeneralStyleType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DGeneralStyle_isOnType cn3DGeneralStyle_isOn,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DGeneralStyle_styleType cn3DGeneralStyle_style,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DGeneralStyle_colorSchemeType cn3DGeneralStyle_colorScheme,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DGeneralStyle_userColorType cn3DGeneralStyle_userColor) {
           this.cn3DGeneralStyle_isOn = cn3DGeneralStyle_isOn;
           this.cn3DGeneralStyle_style = cn3DGeneralStyle_style;
           this.cn3DGeneralStyle_colorScheme = cn3DGeneralStyle_colorScheme;
           this.cn3DGeneralStyle_userColor = cn3DGeneralStyle_userColor;
    }


    /**
     * Gets the cn3DGeneralStyle_isOn value for this Cn3DGeneralStyleType.
     * 
     * @return cn3DGeneralStyle_isOn
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DGeneralStyle_isOnType getCn3DGeneralStyle_isOn() {
        return cn3DGeneralStyle_isOn;
    }


    /**
     * Sets the cn3DGeneralStyle_isOn value for this Cn3DGeneralStyleType.
     * 
     * @param cn3DGeneralStyle_isOn
     */
    public void setCn3DGeneralStyle_isOn(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DGeneralStyle_isOnType cn3DGeneralStyle_isOn) {
        this.cn3DGeneralStyle_isOn = cn3DGeneralStyle_isOn;
    }


    /**
     * Gets the cn3DGeneralStyle_style value for this Cn3DGeneralStyleType.
     * 
     * @return cn3DGeneralStyle_style
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DGeneralStyle_styleType getCn3DGeneralStyle_style() {
        return cn3DGeneralStyle_style;
    }


    /**
     * Sets the cn3DGeneralStyle_style value for this Cn3DGeneralStyleType.
     * 
     * @param cn3DGeneralStyle_style
     */
    public void setCn3DGeneralStyle_style(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DGeneralStyle_styleType cn3DGeneralStyle_style) {
        this.cn3DGeneralStyle_style = cn3DGeneralStyle_style;
    }


    /**
     * Gets the cn3DGeneralStyle_colorScheme value for this Cn3DGeneralStyleType.
     * 
     * @return cn3DGeneralStyle_colorScheme
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DGeneralStyle_colorSchemeType getCn3DGeneralStyle_colorScheme() {
        return cn3DGeneralStyle_colorScheme;
    }


    /**
     * Sets the cn3DGeneralStyle_colorScheme value for this Cn3DGeneralStyleType.
     * 
     * @param cn3DGeneralStyle_colorScheme
     */
    public void setCn3DGeneralStyle_colorScheme(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DGeneralStyle_colorSchemeType cn3DGeneralStyle_colorScheme) {
        this.cn3DGeneralStyle_colorScheme = cn3DGeneralStyle_colorScheme;
    }


    /**
     * Gets the cn3DGeneralStyle_userColor value for this Cn3DGeneralStyleType.
     * 
     * @return cn3DGeneralStyle_userColor
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DGeneralStyle_userColorType getCn3DGeneralStyle_userColor() {
        return cn3DGeneralStyle_userColor;
    }


    /**
     * Sets the cn3DGeneralStyle_userColor value for this Cn3DGeneralStyleType.
     * 
     * @param cn3DGeneralStyle_userColor
     */
    public void setCn3DGeneralStyle_userColor(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DGeneralStyle_userColorType cn3DGeneralStyle_userColor) {
        this.cn3DGeneralStyle_userColor = cn3DGeneralStyle_userColor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DGeneralStyleType)) return false;
        Cn3DGeneralStyleType other = (Cn3DGeneralStyleType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DGeneralStyle_isOn==null && other.getCn3DGeneralStyle_isOn()==null) || 
             (this.cn3DGeneralStyle_isOn!=null &&
              this.cn3DGeneralStyle_isOn.equals(other.getCn3DGeneralStyle_isOn()))) &&
            ((this.cn3DGeneralStyle_style==null && other.getCn3DGeneralStyle_style()==null) || 
             (this.cn3DGeneralStyle_style!=null &&
              this.cn3DGeneralStyle_style.equals(other.getCn3DGeneralStyle_style()))) &&
            ((this.cn3DGeneralStyle_colorScheme==null && other.getCn3DGeneralStyle_colorScheme()==null) || 
             (this.cn3DGeneralStyle_colorScheme!=null &&
              this.cn3DGeneralStyle_colorScheme.equals(other.getCn3DGeneralStyle_colorScheme()))) &&
            ((this.cn3DGeneralStyle_userColor==null && other.getCn3DGeneralStyle_userColor()==null) || 
             (this.cn3DGeneralStyle_userColor!=null &&
              this.cn3DGeneralStyle_userColor.equals(other.getCn3DGeneralStyle_userColor())));
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
        if (getCn3DGeneralStyle_isOn() != null) {
            _hashCode += getCn3DGeneralStyle_isOn().hashCode();
        }
        if (getCn3DGeneralStyle_style() != null) {
            _hashCode += getCn3DGeneralStyle_style().hashCode();
        }
        if (getCn3DGeneralStyle_colorScheme() != null) {
            _hashCode += getCn3DGeneralStyle_colorScheme().hashCode();
        }
        if (getCn3DGeneralStyle_userColor() != null) {
            _hashCode += getCn3DGeneralStyle_userColor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cn3DGeneralStyleType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-general-styleType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DGeneralStyle_isOn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-general-style_is-on"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-general-style_is-onType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DGeneralStyle_style");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-general-style_style"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-general-style_styleType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DGeneralStyle_colorScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-general-style_color-scheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-general-style_color-schemeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DGeneralStyle_userColor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-general-style_user-color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-general-style_user-colorType"));
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
