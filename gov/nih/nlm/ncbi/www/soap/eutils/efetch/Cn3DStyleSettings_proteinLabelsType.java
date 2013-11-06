/**
 * Cn3DStyleSettings_proteinLabelsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DStyleSettings_proteinLabelsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneLabelStyleType cn3DBackboneLabelStyle;

    public Cn3DStyleSettings_proteinLabelsType() {
    }

    public Cn3DStyleSettings_proteinLabelsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneLabelStyleType cn3DBackboneLabelStyle) {
           this.cn3DBackboneLabelStyle = cn3DBackboneLabelStyle;
    }


    /**
     * Gets the cn3DBackboneLabelStyle value for this Cn3DStyleSettings_proteinLabelsType.
     * 
     * @return cn3DBackboneLabelStyle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneLabelStyleType getCn3DBackboneLabelStyle() {
        return cn3DBackboneLabelStyle;
    }


    /**
     * Sets the cn3DBackboneLabelStyle value for this Cn3DStyleSettings_proteinLabelsType.
     * 
     * @param cn3DBackboneLabelStyle
     */
    public void setCn3DBackboneLabelStyle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DBackboneLabelStyleType cn3DBackboneLabelStyle) {
        this.cn3DBackboneLabelStyle = cn3DBackboneLabelStyle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DStyleSettings_proteinLabelsType)) return false;
        Cn3DStyleSettings_proteinLabelsType other = (Cn3DStyleSettings_proteinLabelsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DBackboneLabelStyle==null && other.getCn3DBackboneLabelStyle()==null) || 
             (this.cn3DBackboneLabelStyle!=null &&
              this.cn3DBackboneLabelStyle.equals(other.getCn3DBackboneLabelStyle())));
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
        if (getCn3DBackboneLabelStyle() != null) {
            _hashCode += getCn3DBackboneLabelStyle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cn3DStyleSettings_proteinLabelsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-settings_protein-labelsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DBackboneLabelStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-backbone-label-style"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-backbone-label-styleType"));
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
