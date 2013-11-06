/**
 * RealValueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RealValueType  implements java.io.Serializable {
    private java.lang.String realValue_scaleFactor;

    private java.lang.String realValue_scaledIntegerValue;

    public RealValueType() {
    }

    public RealValueType(
           java.lang.String realValue_scaleFactor,
           java.lang.String realValue_scaledIntegerValue) {
           this.realValue_scaleFactor = realValue_scaleFactor;
           this.realValue_scaledIntegerValue = realValue_scaledIntegerValue;
    }


    /**
     * Gets the realValue_scaleFactor value for this RealValueType.
     * 
     * @return realValue_scaleFactor
     */
    public java.lang.String getRealValue_scaleFactor() {
        return realValue_scaleFactor;
    }


    /**
     * Sets the realValue_scaleFactor value for this RealValueType.
     * 
     * @param realValue_scaleFactor
     */
    public void setRealValue_scaleFactor(java.lang.String realValue_scaleFactor) {
        this.realValue_scaleFactor = realValue_scaleFactor;
    }


    /**
     * Gets the realValue_scaledIntegerValue value for this RealValueType.
     * 
     * @return realValue_scaledIntegerValue
     */
    public java.lang.String getRealValue_scaledIntegerValue() {
        return realValue_scaledIntegerValue;
    }


    /**
     * Sets the realValue_scaledIntegerValue value for this RealValueType.
     * 
     * @param realValue_scaledIntegerValue
     */
    public void setRealValue_scaledIntegerValue(java.lang.String realValue_scaledIntegerValue) {
        this.realValue_scaledIntegerValue = realValue_scaledIntegerValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RealValueType)) return false;
        RealValueType other = (RealValueType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.realValue_scaleFactor==null && other.getRealValue_scaleFactor()==null) || 
             (this.realValue_scaleFactor!=null &&
              this.realValue_scaleFactor.equals(other.getRealValue_scaleFactor()))) &&
            ((this.realValue_scaledIntegerValue==null && other.getRealValue_scaledIntegerValue()==null) || 
             (this.realValue_scaledIntegerValue!=null &&
              this.realValue_scaledIntegerValue.equals(other.getRealValue_scaledIntegerValue())));
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
        if (getRealValue_scaleFactor() != null) {
            _hashCode += getRealValue_scaleFactor().hashCode();
        }
        if (getRealValue_scaledIntegerValue() != null) {
            _hashCode += getRealValue_scaledIntegerValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RealValueType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RealValueType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realValue_scaleFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RealValue_scale-factor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realValue_scaledIntegerValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RealValue_scaled-integer-value"));
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
