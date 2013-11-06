/**
 * PrintFormEnumType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PrintFormEnumType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintFormEnum_valuesType printFormEnum_values;

    public PrintFormEnumType() {
    }

    public PrintFormEnumType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintFormEnum_valuesType printFormEnum_values) {
           this.printFormEnum_values = printFormEnum_values;
    }


    /**
     * Gets the printFormEnum_values value for this PrintFormEnumType.
     * 
     * @return printFormEnum_values
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintFormEnum_valuesType getPrintFormEnum_values() {
        return printFormEnum_values;
    }


    /**
     * Sets the printFormEnum_values value for this PrintFormEnumType.
     * 
     * @param printFormEnum_values
     */
    public void setPrintFormEnum_values(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintFormEnum_valuesType printFormEnum_values) {
        this.printFormEnum_values = printFormEnum_values;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrintFormEnumType)) return false;
        PrintFormEnumType other = (PrintFormEnumType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.printFormEnum_values==null && other.getPrintFormEnum_values()==null) || 
             (this.printFormEnum_values!=null &&
              this.printFormEnum_values.equals(other.getPrintFormEnum_values())));
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
        if (getPrintFormEnum_values() != null) {
            _hashCode += getPrintFormEnum_values().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrintFormEnumType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormEnumType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printFormEnum_values");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormEnum_values"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormEnum_valuesType"));
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
