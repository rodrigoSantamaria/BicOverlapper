/**
 * IntFuzz_rangeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class IntFuzz_rangeType  implements java.io.Serializable {
    private java.lang.String intFuzz_range_max;

    private java.lang.String intFuzz_range_min;

    public IntFuzz_rangeType() {
    }

    public IntFuzz_rangeType(
           java.lang.String intFuzz_range_max,
           java.lang.String intFuzz_range_min) {
           this.intFuzz_range_max = intFuzz_range_max;
           this.intFuzz_range_min = intFuzz_range_min;
    }


    /**
     * Gets the intFuzz_range_max value for this IntFuzz_rangeType.
     * 
     * @return intFuzz_range_max
     */
    public java.lang.String getIntFuzz_range_max() {
        return intFuzz_range_max;
    }


    /**
     * Sets the intFuzz_range_max value for this IntFuzz_rangeType.
     * 
     * @param intFuzz_range_max
     */
    public void setIntFuzz_range_max(java.lang.String intFuzz_range_max) {
        this.intFuzz_range_max = intFuzz_range_max;
    }


    /**
     * Gets the intFuzz_range_min value for this IntFuzz_rangeType.
     * 
     * @return intFuzz_range_min
     */
    public java.lang.String getIntFuzz_range_min() {
        return intFuzz_range_min;
    }


    /**
     * Sets the intFuzz_range_min value for this IntFuzz_rangeType.
     * 
     * @param intFuzz_range_min
     */
    public void setIntFuzz_range_min(java.lang.String intFuzz_range_min) {
        this.intFuzz_range_min = intFuzz_range_min;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntFuzz_rangeType)) return false;
        IntFuzz_rangeType other = (IntFuzz_rangeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.intFuzz_range_max==null && other.getIntFuzz_range_max()==null) || 
             (this.intFuzz_range_max!=null &&
              this.intFuzz_range_max.equals(other.getIntFuzz_range_max()))) &&
            ((this.intFuzz_range_min==null && other.getIntFuzz_range_min()==null) || 
             (this.intFuzz_range_min!=null &&
              this.intFuzz_range_min.equals(other.getIntFuzz_range_min())));
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
        if (getIntFuzz_range_max() != null) {
            _hashCode += getIntFuzz_range_max().hashCode();
        }
        if (getIntFuzz_range_min() != null) {
            _hashCode += getIntFuzz_range_min().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IntFuzz_rangeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Int-fuzz_rangeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intFuzz_range_max");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Int-fuzz_range_max"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intFuzz_range_min");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Int-fuzz_range_min"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
