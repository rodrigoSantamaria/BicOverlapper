/**
 * Cn3DStyleSettings_virtualDisulfideColorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DStyleSettings_virtualDisulfideColorType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DColorType cn3DColor;

    public Cn3DStyleSettings_virtualDisulfideColorType() {
    }

    public Cn3DStyleSettings_virtualDisulfideColorType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DColorType cn3DColor) {
           this.cn3DColor = cn3DColor;
    }


    /**
     * Gets the cn3DColor value for this Cn3DStyleSettings_virtualDisulfideColorType.
     * 
     * @return cn3DColor
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DColorType getCn3DColor() {
        return cn3DColor;
    }


    /**
     * Sets the cn3DColor value for this Cn3DStyleSettings_virtualDisulfideColorType.
     * 
     * @param cn3DColor
     */
    public void setCn3DColor(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DColorType cn3DColor) {
        this.cn3DColor = cn3DColor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DStyleSettings_virtualDisulfideColorType)) return false;
        Cn3DStyleSettings_virtualDisulfideColorType other = (Cn3DStyleSettings_virtualDisulfideColorType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DColor==null && other.getCn3DColor()==null) || 
             (this.cn3DColor!=null &&
              this.cn3DColor.equals(other.getCn3DColor())));
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
        if (getCn3DColor() != null) {
            _hashCode += getCn3DColor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cn3DStyleSettings_virtualDisulfideColorType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_virtual-disulfide-colorType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DColor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-colorType"));
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
