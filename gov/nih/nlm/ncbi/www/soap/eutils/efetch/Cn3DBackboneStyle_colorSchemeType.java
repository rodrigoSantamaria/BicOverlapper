/**
 * Cn3DBackboneStyle_colorSchemeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DBackboneStyle_colorSchemeType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DColorSchemeType cn3DColorScheme;

    public Cn3DBackboneStyle_colorSchemeType() {
    }

    public Cn3DBackboneStyle_colorSchemeType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DColorSchemeType cn3DColorScheme) {
           this.cn3DColorScheme = cn3DColorScheme;
    }


    /**
     * Gets the cn3DColorScheme value for this Cn3DBackboneStyle_colorSchemeType.
     * 
     * @return cn3DColorScheme
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DColorSchemeType getCn3DColorScheme() {
        return cn3DColorScheme;
    }


    /**
     * Sets the cn3DColorScheme value for this Cn3DBackboneStyle_colorSchemeType.
     * 
     * @param cn3DColorScheme
     */
    public void setCn3DColorScheme(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DColorSchemeType cn3DColorScheme) {
        this.cn3DColorScheme = cn3DColorScheme;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DBackboneStyle_colorSchemeType)) return false;
        Cn3DBackboneStyle_colorSchemeType other = (Cn3DBackboneStyle_colorSchemeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DColorScheme==null && other.getCn3DColorScheme()==null) || 
             (this.cn3DColorScheme!=null &&
              this.cn3DColorScheme.equals(other.getCn3DColorScheme())));
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
        if (getCn3DColorScheme() != null) {
            _hashCode += getCn3DColorScheme().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cn3DBackboneStyle_colorSchemeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-backbone-style_color-schemeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DColorScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-color-scheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-color-schemeType"));
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
