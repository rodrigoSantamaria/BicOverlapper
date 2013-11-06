/**
 * Numbering_enumType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Numbering_enumType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.NumEnumType numEnum;

    public Numbering_enumType() {
    }

    public Numbering_enumType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.NumEnumType numEnum) {
           this.numEnum = numEnum;
    }


    /**
     * Gets the numEnum value for this Numbering_enumType.
     * 
     * @return numEnum
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.NumEnumType getNumEnum() {
        return numEnum;
    }


    /**
     * Sets the numEnum value for this Numbering_enumType.
     * 
     * @param numEnum
     */
    public void setNumEnum(gov.nih.nlm.ncbi.www.soap.eutils.efetch.NumEnumType numEnum) {
        this.numEnum = numEnum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Numbering_enumType)) return false;
        Numbering_enumType other = (Numbering_enumType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numEnum==null && other.getNumEnum()==null) || 
             (this.numEnum!=null &&
              this.numEnum.equals(other.getNumEnum())));
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
        if (getNumEnum() != null) {
            _hashCode += getNumEnum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Numbering_enumType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Numbering_enumType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numEnum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Num-enum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Num-enumType"));
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
