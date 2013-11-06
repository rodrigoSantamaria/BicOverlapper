/**
 * PCIntegerMinMaxType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCIntegerMinMaxType  implements java.io.Serializable {
    private java.lang.String PCIntegerMinMax_min;

    private java.lang.String PCIntegerMinMax_max;

    public PCIntegerMinMaxType() {
    }

    public PCIntegerMinMaxType(
           java.lang.String PCIntegerMinMax_min,
           java.lang.String PCIntegerMinMax_max) {
           this.PCIntegerMinMax_min = PCIntegerMinMax_min;
           this.PCIntegerMinMax_max = PCIntegerMinMax_max;
    }


    /**
     * Gets the PCIntegerMinMax_min value for this PCIntegerMinMaxType.
     * 
     * @return PCIntegerMinMax_min
     */
    public java.lang.String getPCIntegerMinMax_min() {
        return PCIntegerMinMax_min;
    }


    /**
     * Sets the PCIntegerMinMax_min value for this PCIntegerMinMaxType.
     * 
     * @param PCIntegerMinMax_min
     */
    public void setPCIntegerMinMax_min(java.lang.String PCIntegerMinMax_min) {
        this.PCIntegerMinMax_min = PCIntegerMinMax_min;
    }


    /**
     * Gets the PCIntegerMinMax_max value for this PCIntegerMinMaxType.
     * 
     * @return PCIntegerMinMax_max
     */
    public java.lang.String getPCIntegerMinMax_max() {
        return PCIntegerMinMax_max;
    }


    /**
     * Sets the PCIntegerMinMax_max value for this PCIntegerMinMaxType.
     * 
     * @param PCIntegerMinMax_max
     */
    public void setPCIntegerMinMax_max(java.lang.String PCIntegerMinMax_max) {
        this.PCIntegerMinMax_max = PCIntegerMinMax_max;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCIntegerMinMaxType)) return false;
        PCIntegerMinMaxType other = (PCIntegerMinMaxType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCIntegerMinMax_min==null && other.getPCIntegerMinMax_min()==null) || 
             (this.PCIntegerMinMax_min!=null &&
              this.PCIntegerMinMax_min.equals(other.getPCIntegerMinMax_min()))) &&
            ((this.PCIntegerMinMax_max==null && other.getPCIntegerMinMax_max()==null) || 
             (this.PCIntegerMinMax_max!=null &&
              this.PCIntegerMinMax_max.equals(other.getPCIntegerMinMax_max())));
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
        if (getPCIntegerMinMax_min() != null) {
            _hashCode += getPCIntegerMinMax_min().hashCode();
        }
        if (getPCIntegerMinMax_max() != null) {
            _hashCode += getPCIntegerMinMax_max().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCIntegerMinMaxType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-IntegerMinMaxType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCIntegerMinMax_min");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-IntegerMinMax_min"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCIntegerMinMax_max");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-IntegerMinMax_max"));
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
