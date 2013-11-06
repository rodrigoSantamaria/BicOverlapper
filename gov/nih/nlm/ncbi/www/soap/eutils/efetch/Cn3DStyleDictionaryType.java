/**
 * Cn3DStyleDictionaryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cn3DStyleDictionaryType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleDictionary_globalStyleType cn3DStyleDictionary_globalStyle;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleDictionary_styleTableType cn3DStyleDictionary_styleTable;

    public Cn3DStyleDictionaryType() {
    }

    public Cn3DStyleDictionaryType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleDictionary_globalStyleType cn3DStyleDictionary_globalStyle,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleDictionary_styleTableType cn3DStyleDictionary_styleTable) {
           this.cn3DStyleDictionary_globalStyle = cn3DStyleDictionary_globalStyle;
           this.cn3DStyleDictionary_styleTable = cn3DStyleDictionary_styleTable;
    }


    /**
     * Gets the cn3DStyleDictionary_globalStyle value for this Cn3DStyleDictionaryType.
     * 
     * @return cn3DStyleDictionary_globalStyle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleDictionary_globalStyleType getCn3DStyleDictionary_globalStyle() {
        return cn3DStyleDictionary_globalStyle;
    }


    /**
     * Sets the cn3DStyleDictionary_globalStyle value for this Cn3DStyleDictionaryType.
     * 
     * @param cn3DStyleDictionary_globalStyle
     */
    public void setCn3DStyleDictionary_globalStyle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleDictionary_globalStyleType cn3DStyleDictionary_globalStyle) {
        this.cn3DStyleDictionary_globalStyle = cn3DStyleDictionary_globalStyle;
    }


    /**
     * Gets the cn3DStyleDictionary_styleTable value for this Cn3DStyleDictionaryType.
     * 
     * @return cn3DStyleDictionary_styleTable
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleDictionary_styleTableType getCn3DStyleDictionary_styleTable() {
        return cn3DStyleDictionary_styleTable;
    }


    /**
     * Sets the cn3DStyleDictionary_styleTable value for this Cn3DStyleDictionaryType.
     * 
     * @param cn3DStyleDictionary_styleTable
     */
    public void setCn3DStyleDictionary_styleTable(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Cn3DStyleDictionary_styleTableType cn3DStyleDictionary_styleTable) {
        this.cn3DStyleDictionary_styleTable = cn3DStyleDictionary_styleTable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cn3DStyleDictionaryType)) return false;
        Cn3DStyleDictionaryType other = (Cn3DStyleDictionaryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cn3DStyleDictionary_globalStyle==null && other.getCn3DStyleDictionary_globalStyle()==null) || 
             (this.cn3DStyleDictionary_globalStyle!=null &&
              this.cn3DStyleDictionary_globalStyle.equals(other.getCn3DStyleDictionary_globalStyle()))) &&
            ((this.cn3DStyleDictionary_styleTable==null && other.getCn3DStyleDictionary_styleTable()==null) || 
             (this.cn3DStyleDictionary_styleTable!=null &&
              this.cn3DStyleDictionary_styleTable.equals(other.getCn3DStyleDictionary_styleTable())));
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
        if (getCn3DStyleDictionary_globalStyle() != null) {
            _hashCode += getCn3DStyleDictionary_globalStyle().hashCode();
        }
        if (getCn3DStyleDictionary_styleTable() != null) {
            _hashCode += getCn3DStyleDictionary_styleTable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cn3DStyleDictionaryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-dictionaryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleDictionary_globalStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-dictionary_global-style"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-dictionary_global-styleType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cn3DStyleDictionary_styleTable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-dictionary_style-table"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cn3d-style-dictionary_style-tableType"));
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
