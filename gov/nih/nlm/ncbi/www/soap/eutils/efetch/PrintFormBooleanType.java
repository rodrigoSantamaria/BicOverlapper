/**
 * PrintFormBooleanType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PrintFormBooleanType  implements java.io.Serializable {
    private java.lang.String printFormBoolean_true;

    private java.lang.String printFormBoolean_false;

    public PrintFormBooleanType() {
    }

    public PrintFormBooleanType(
           java.lang.String printFormBoolean_true,
           java.lang.String printFormBoolean_false) {
           this.printFormBoolean_true = printFormBoolean_true;
           this.printFormBoolean_false = printFormBoolean_false;
    }


    /**
     * Gets the printFormBoolean_true value for this PrintFormBooleanType.
     * 
     * @return printFormBoolean_true
     */
    public java.lang.String getPrintFormBoolean_true() {
        return printFormBoolean_true;
    }


    /**
     * Sets the printFormBoolean_true value for this PrintFormBooleanType.
     * 
     * @param printFormBoolean_true
     */
    public void setPrintFormBoolean_true(java.lang.String printFormBoolean_true) {
        this.printFormBoolean_true = printFormBoolean_true;
    }


    /**
     * Gets the printFormBoolean_false value for this PrintFormBooleanType.
     * 
     * @return printFormBoolean_false
     */
    public java.lang.String getPrintFormBoolean_false() {
        return printFormBoolean_false;
    }


    /**
     * Sets the printFormBoolean_false value for this PrintFormBooleanType.
     * 
     * @param printFormBoolean_false
     */
    public void setPrintFormBoolean_false(java.lang.String printFormBoolean_false) {
        this.printFormBoolean_false = printFormBoolean_false;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrintFormBooleanType)) return false;
        PrintFormBooleanType other = (PrintFormBooleanType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.printFormBoolean_true==null && other.getPrintFormBoolean_true()==null) || 
             (this.printFormBoolean_true!=null &&
              this.printFormBoolean_true.equals(other.getPrintFormBoolean_true()))) &&
            ((this.printFormBoolean_false==null && other.getPrintFormBoolean_false()==null) || 
             (this.printFormBoolean_false!=null &&
              this.printFormBoolean_false.equals(other.getPrintFormBoolean_false())));
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
        if (getPrintFormBoolean_true() != null) {
            _hashCode += getPrintFormBoolean_true().hashCode();
        }
        if (getPrintFormBoolean_false() != null) {
            _hashCode += getPrintFormBoolean_false().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrintFormBooleanType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormBooleanType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printFormBoolean_true");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormBoolean_true"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printFormBoolean_false");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormBoolean_false"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
