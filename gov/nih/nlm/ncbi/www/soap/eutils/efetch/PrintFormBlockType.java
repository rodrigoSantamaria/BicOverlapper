/**
 * PrintFormBlockType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PrintFormBlockType  implements java.io.Serializable {
    private java.lang.String printFormBlock_separator;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintFormBlock_componentsType printFormBlock_components;

    public PrintFormBlockType() {
    }

    public PrintFormBlockType(
           java.lang.String printFormBlock_separator,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintFormBlock_componentsType printFormBlock_components) {
           this.printFormBlock_separator = printFormBlock_separator;
           this.printFormBlock_components = printFormBlock_components;
    }


    /**
     * Gets the printFormBlock_separator value for this PrintFormBlockType.
     * 
     * @return printFormBlock_separator
     */
    public java.lang.String getPrintFormBlock_separator() {
        return printFormBlock_separator;
    }


    /**
     * Sets the printFormBlock_separator value for this PrintFormBlockType.
     * 
     * @param printFormBlock_separator
     */
    public void setPrintFormBlock_separator(java.lang.String printFormBlock_separator) {
        this.printFormBlock_separator = printFormBlock_separator;
    }


    /**
     * Gets the printFormBlock_components value for this PrintFormBlockType.
     * 
     * @return printFormBlock_components
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintFormBlock_componentsType getPrintFormBlock_components() {
        return printFormBlock_components;
    }


    /**
     * Sets the printFormBlock_components value for this PrintFormBlockType.
     * 
     * @param printFormBlock_components
     */
    public void setPrintFormBlock_components(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintFormBlock_componentsType printFormBlock_components) {
        this.printFormBlock_components = printFormBlock_components;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrintFormBlockType)) return false;
        PrintFormBlockType other = (PrintFormBlockType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.printFormBlock_separator==null && other.getPrintFormBlock_separator()==null) || 
             (this.printFormBlock_separator!=null &&
              this.printFormBlock_separator.equals(other.getPrintFormBlock_separator()))) &&
            ((this.printFormBlock_components==null && other.getPrintFormBlock_components()==null) || 
             (this.printFormBlock_components!=null &&
              this.printFormBlock_components.equals(other.getPrintFormBlock_components())));
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
        if (getPrintFormBlock_separator() != null) {
            _hashCode += getPrintFormBlock_separator().hashCode();
        }
        if (getPrintFormBlock_components() != null) {
            _hashCode += getPrintFormBlock_components().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrintFormBlockType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormBlockType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printFormBlock_separator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormBlock_separator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printFormBlock_components");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormBlock_components"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormBlock_componentsType"));
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
