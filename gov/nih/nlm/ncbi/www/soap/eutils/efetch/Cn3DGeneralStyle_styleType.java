/**
 * Cn3DGeneralStyle_styleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DGeneralStyle_styleType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DDrawingStyleType cn3DDrawingStyle;

    public Cn3DGeneralStyle_styleType() {
    }

    public Cn3DGeneralStyle_styleType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DDrawingStyleType cn3DDrawingStyle) {
           this.cn3DDrawingStyle = cn3DDrawingStyle;
    }


    /**
     * Gets the cn3DDrawingStyle value for this Cn3DGeneralStyle_styleType.
     * 
     * @return cn3DDrawingStyle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DDrawingStyleType getCn3DDrawingStyle() {
        return cn3DDrawingStyle;
    }


    /**
     * Sets the cn3DDrawingStyle value for this Cn3DGeneralStyle_styleType.
     * 
     * @param cn3DDrawingStyle
     */
    public void setCn3DDrawingStyle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DDrawingStyleType cn3DDrawingStyle) {
        this.cn3DDrawingStyle = cn3DDrawingStyle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DGeneralStyle_styleType)) return false;
        Cn3DGeneralStyle_styleType other = (Cn3DGeneralStyle_styleType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DDrawingStyle==null && other.getCn3DDrawingStyle()==null) || 
             (this.cn3DDrawingStyle!=null &&
              this.cn3DDrawingStyle.equals(other.getCn3DDrawingStyle())));
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
        if (getCn3DDrawingStyle() != null) {
            _hashCode += getCn3DDrawingStyle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cn3DGeneralStyle_styleType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-general-style_styleType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DDrawingStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-drawing-style"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-drawing-styleType"));
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
