/**
 * Cn3DStyleSettings_proteinBackboneType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DStyleSettings_proteinBackboneType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneStyleType cn3DBackboneStyle;

    public Cn3DStyleSettings_proteinBackboneType() {
    }

    public Cn3DStyleSettings_proteinBackboneType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneStyleType cn3DBackboneStyle) {
           this.cn3DBackboneStyle = cn3DBackboneStyle;
    }


    /**
     * Gets the cn3DBackboneStyle value for this Cn3DStyleSettings_proteinBackboneType.
     * 
     * @return cn3DBackboneStyle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneStyleType getCn3DBackboneStyle() {
        return cn3DBackboneStyle;
    }


    /**
     * Sets the cn3DBackboneStyle value for this Cn3DStyleSettings_proteinBackboneType.
     * 
     * @param cn3DBackboneStyle
     */
    public void setCn3DBackboneStyle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneStyleType cn3DBackboneStyle) {
        this.cn3DBackboneStyle = cn3DBackboneStyle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DStyleSettings_proteinBackboneType)) return false;
        Cn3DStyleSettings_proteinBackboneType other = (Cn3DStyleSettings_proteinBackboneType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DBackboneStyle==null && other.getCn3DBackboneStyle()==null) || 
             (this.cn3DBackboneStyle!=null &&
              this.cn3DBackboneStyle.equals(other.getCn3DBackboneStyle())));
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
        if (getCn3DBackboneStyle() != null) {
            _hashCode += getCn3DBackboneStyle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cn3DStyleSettings_proteinBackboneType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_protein-backboneType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DBackboneStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-backbone-style"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-backbone-styleType"));
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
