/**
 * PrintTemplateSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PrintTemplateSet  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintTemplateType[] printTemplate;

    public PrintTemplateSet() {
    }

    public PrintTemplateSet(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintTemplateType[] printTemplate) {
           this.printTemplate = printTemplate;
    }


    /**
     * Gets the printTemplate value for this PrintTemplateSet.
     * 
     * @return printTemplate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintTemplateType[] getPrintTemplate() {
        return printTemplate;
    }


    /**
     * Sets the printTemplate value for this PrintTemplateSet.
     * 
     * @param printTemplate
     */
    public void setPrintTemplate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintTemplateType[] printTemplate) {
        this.printTemplate = printTemplate;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintTemplateType getPrintTemplate(int i) {
        return this.printTemplate[i];
    }

    public void setPrintTemplate(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintTemplateType _value) {
        this.printTemplate[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrintTemplateSet)) return false;
        PrintTemplateSet other = (PrintTemplateSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.printTemplate==null && other.getPrintTemplate()==null) || 
             (this.printTemplate!=null &&
              java.util.Arrays.equals(this.printTemplate, other.getPrintTemplate())));
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
        if (getPrintTemplate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrintTemplate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrintTemplate(), i);
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
        new org.apache.axis.description.TypeDesc(PrintTemplateSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">PrintTemplateSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintTemplateType"));
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
