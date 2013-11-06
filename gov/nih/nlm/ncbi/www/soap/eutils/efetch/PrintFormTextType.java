/**
 * PrintFormTextType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PrintFormTextType  implements java.io.Serializable {
    private java.lang.String printFormText_textfunc;

    public PrintFormTextType() {
    }

    public PrintFormTextType(
           java.lang.String printFormText_textfunc) {
           this.printFormText_textfunc = printFormText_textfunc;
    }


    /**
     * Gets the printFormText_textfunc value for this PrintFormTextType.
     * 
     * @return printFormText_textfunc
     */
    public java.lang.String getPrintFormText_textfunc() {
        return printFormText_textfunc;
    }


    /**
     * Sets the printFormText_textfunc value for this PrintFormTextType.
     * 
     * @param printFormText_textfunc
     */
    public void setPrintFormText_textfunc(java.lang.String printFormText_textfunc) {
        this.printFormText_textfunc = printFormText_textfunc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrintFormTextType)) return false;
        PrintFormTextType other = (PrintFormTextType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.printFormText_textfunc==null && other.getPrintFormText_textfunc()==null) || 
             (this.printFormText_textfunc!=null &&
              this.printFormText_textfunc.equals(other.getPrintFormText_textfunc())));
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
        if (getPrintFormText_textfunc() != null) {
            _hashCode += getPrintFormText_textfunc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrintFormTextType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormTextType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printFormText_textfunc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormText_textfunc"));
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
