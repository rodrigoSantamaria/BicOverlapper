/**
 * PrintForm_booleanType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PrintForm_booleanType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintFormBooleanType printFormBoolean;

    public PrintForm_booleanType() {
    }

    public PrintForm_booleanType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintFormBooleanType printFormBoolean) {
           this.printFormBoolean = printFormBoolean;
    }


    /**
     * Gets the printFormBoolean value for this PrintForm_booleanType.
     * 
     * @return printFormBoolean
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintFormBooleanType getPrintFormBoolean() {
        return printFormBoolean;
    }


    /**
     * Sets the printFormBoolean value for this PrintForm_booleanType.
     * 
     * @param printFormBoolean
     */
    public void setPrintFormBoolean(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintFormBooleanType printFormBoolean) {
        this.printFormBoolean = printFormBoolean;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrintForm_booleanType)) return false;
        PrintForm_booleanType other = (PrintForm_booleanType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.printFormBoolean==null && other.getPrintFormBoolean()==null) || 
             (this.printFormBoolean!=null &&
              this.printFormBoolean.equals(other.getPrintFormBoolean())));
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
        if (getPrintFormBoolean() != null) {
            _hashCode += getPrintFormBoolean().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrintForm_booleanType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintForm_booleanType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printFormBoolean");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormBoolean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormBooleanType"));
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
