/**
 * Cn3DStyleSettings_proteinSidechainsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DStyleSettings_proteinSidechainsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DGeneralStyleType cn3DGeneralStyle;

    public Cn3DStyleSettings_proteinSidechainsType() {
    }

    public Cn3DStyleSettings_proteinSidechainsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DGeneralStyleType cn3DGeneralStyle) {
           this.cn3DGeneralStyle = cn3DGeneralStyle;
    }


    /**
     * Gets the cn3DGeneralStyle value for this Cn3DStyleSettings_proteinSidechainsType.
     * 
     * @return cn3DGeneralStyle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DGeneralStyleType getCn3DGeneralStyle() {
        return cn3DGeneralStyle;
    }


    /**
     * Sets the cn3DGeneralStyle value for this Cn3DStyleSettings_proteinSidechainsType.
     * 
     * @param cn3DGeneralStyle
     */
    public void setCn3DGeneralStyle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DGeneralStyleType cn3DGeneralStyle) {
        this.cn3DGeneralStyle = cn3DGeneralStyle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DStyleSettings_proteinSidechainsType)) return false;
        Cn3DStyleSettings_proteinSidechainsType other = (Cn3DStyleSettings_proteinSidechainsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DGeneralStyle==null && other.getCn3DGeneralStyle()==null) || 
             (this.cn3DGeneralStyle!=null &&
              this.cn3DGeneralStyle.equals(other.getCn3DGeneralStyle())));
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
        if (getCn3DGeneralStyle() != null) {
            _hashCode += getCn3DGeneralStyle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cn3DStyleSettings_proteinSidechainsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_protein-sidechainsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DGeneralStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-general-style"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-general-styleType"));
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
