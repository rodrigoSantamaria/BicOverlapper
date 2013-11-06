/**
 * PrintForm_enumType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PrintForm_enumType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintFormEnumType printFormEnum;

    public PrintForm_enumType() {
    }

    public PrintForm_enumType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintFormEnumType printFormEnum) {
           this.printFormEnum = printFormEnum;
    }


    /**
     * Gets the printFormEnum value for this PrintForm_enumType.
     * 
     * @return printFormEnum
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintFormEnumType getPrintFormEnum() {
        return printFormEnum;
    }


    /**
     * Sets the printFormEnum value for this PrintForm_enumType.
     * 
     * @param printFormEnum
     */
    public void setPrintFormEnum(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintFormEnumType printFormEnum) {
        this.printFormEnum = printFormEnum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrintForm_enumType)) return false;
        PrintForm_enumType other = (PrintForm_enumType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.printFormEnum==null && other.getPrintFormEnum()==null) || 
             (this.printFormEnum!=null &&
              this.printFormEnum.equals(other.getPrintFormEnum())));
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
        if (getPrintFormEnum() != null) {
            _hashCode += getPrintFormEnum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrintForm_enumType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintForm_enumType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printFormEnum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormEnum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormEnumType"));
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
