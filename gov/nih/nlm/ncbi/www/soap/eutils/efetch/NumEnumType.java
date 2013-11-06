/**
 * NumEnumType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class NumEnumType  implements java.io.Serializable {
    private java.lang.String numEnum_num;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.NumEnum_namesType numEnum_names;

    public NumEnumType() {
    }

    public NumEnumType(
           java.lang.String numEnum_num,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.NumEnum_namesType numEnum_names) {
           this.numEnum_num = numEnum_num;
           this.numEnum_names = numEnum_names;
    }


    /**
     * Gets the numEnum_num value for this NumEnumType.
     * 
     * @return numEnum_num
     */
    public java.lang.String getNumEnum_num() {
        return numEnum_num;
    }


    /**
     * Sets the numEnum_num value for this NumEnumType.
     * 
     * @param numEnum_num
     */
    public void setNumEnum_num(java.lang.String numEnum_num) {
        this.numEnum_num = numEnum_num;
    }


    /**
     * Gets the numEnum_names value for this NumEnumType.
     * 
     * @return numEnum_names
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.NumEnum_namesType getNumEnum_names() {
        return numEnum_names;
    }


    /**
     * Sets the numEnum_names value for this NumEnumType.
     * 
     * @param numEnum_names
     */
    public void setNumEnum_names(gov.nih.nlm.ncbi.www.soap.eutils.efetch.NumEnum_namesType numEnum_names) {
        this.numEnum_names = numEnum_names;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NumEnumType)) return false;
        NumEnumType other = (NumEnumType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numEnum_num==null && other.getNumEnum_num()==null) || 
             (this.numEnum_num!=null &&
              this.numEnum_num.equals(other.getNumEnum_num()))) &&
            ((this.numEnum_names==null && other.getNumEnum_names()==null) || 
             (this.numEnum_names!=null &&
              this.numEnum_names.equals(other.getNumEnum_names())));
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
        if (getNumEnum_num() != null) {
            _hashCode += getNumEnum_num().hashCode();
        }
        if (getNumEnum_names() != null) {
            _hashCode += getNumEnum_names().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NumEnumType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Num-enumType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numEnum_num");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Num-enum_num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numEnum_names");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Num-enum_names"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Num-enum_namesType"));
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
