/**
 * PCRealMinMaxType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCRealMinMaxType  implements java.io.Serializable {
    private java.lang.String PCRealMinMax_min;

    private java.lang.String PCRealMinMax_max;

    public PCRealMinMaxType() {
    }

    public PCRealMinMaxType(
           java.lang.String PCRealMinMax_min,
           java.lang.String PCRealMinMax_max) {
           this.PCRealMinMax_min = PCRealMinMax_min;
           this.PCRealMinMax_max = PCRealMinMax_max;
    }


    /**
     * Gets the PCRealMinMax_min value for this PCRealMinMaxType.
     * 
     * @return PCRealMinMax_min
     */
    public java.lang.String getPCRealMinMax_min() {
        return PCRealMinMax_min;
    }


    /**
     * Sets the PCRealMinMax_min value for this PCRealMinMaxType.
     * 
     * @param PCRealMinMax_min
     */
    public void setPCRealMinMax_min(java.lang.String PCRealMinMax_min) {
        this.PCRealMinMax_min = PCRealMinMax_min;
    }


    /**
     * Gets the PCRealMinMax_max value for this PCRealMinMaxType.
     * 
     * @return PCRealMinMax_max
     */
    public java.lang.String getPCRealMinMax_max() {
        return PCRealMinMax_max;
    }


    /**
     * Sets the PCRealMinMax_max value for this PCRealMinMaxType.
     * 
     * @param PCRealMinMax_max
     */
    public void setPCRealMinMax_max(java.lang.String PCRealMinMax_max) {
        this.PCRealMinMax_max = PCRealMinMax_max;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCRealMinMaxType)) return false;
        PCRealMinMaxType other = (PCRealMinMaxType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCRealMinMax_min==null && other.getPCRealMinMax_min()==null) || 
             (this.PCRealMinMax_min!=null &&
              this.PCRealMinMax_min.equals(other.getPCRealMinMax_min()))) &&
            ((this.PCRealMinMax_max==null && other.getPCRealMinMax_max()==null) || 
             (this.PCRealMinMax_max!=null &&
              this.PCRealMinMax_max.equals(other.getPCRealMinMax_max())));
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
        if (getPCRealMinMax_min() != null) {
            _hashCode += getPCRealMinMax_min().hashCode();
        }
        if (getPCRealMinMax_max() != null) {
            _hashCode += getPCRealMinMax_max().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCRealMinMaxType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-RealMinMaxType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCRealMinMax_min");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-RealMinMax_min"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCRealMinMax_max");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-RealMinMax_max"));
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
