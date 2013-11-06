/**
 * PrintFormBlock_componentsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PrintFormBlock_componentsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintFormatType[] printFormat;

    public PrintFormBlock_componentsType() {
    }

    public PrintFormBlock_componentsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintFormatType[] printFormat) {
           this.printFormat = printFormat;
    }


    /**
     * Gets the printFormat value for this PrintFormBlock_componentsType.
     * 
     * @return printFormat
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintFormatType[] getPrintFormat() {
        return printFormat;
    }


    /**
     * Sets the printFormat value for this PrintFormBlock_componentsType.
     * 
     * @param printFormat
     */
    public void setPrintFormat(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintFormatType[] printFormat) {
        this.printFormat = printFormat;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintFormatType getPrintFormat(int i) {
        return this.printFormat[i];
    }

    public void setPrintFormat(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintFormatType _value) {
        this.printFormat[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrintFormBlock_componentsType)) return false;
        PrintFormBlock_componentsType other = (PrintFormBlock_componentsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.printFormat==null && other.getPrintFormat()==null) || 
             (this.printFormat!=null &&
              java.util.Arrays.equals(this.printFormat, other.getPrintFormat())));
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
        if (getPrintFormat() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrintFormat());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrintFormat(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrintFormBlock_componentsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormBlock_componentsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormatType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
