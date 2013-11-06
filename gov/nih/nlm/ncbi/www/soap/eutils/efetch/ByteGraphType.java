/**
 * ByteGraphType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ByteGraphType  implements java.io.Serializable {
    private java.lang.String byteGraph_max;

    private java.lang.String byteGraph_min;

    private java.lang.String byteGraph_axis;

    private java.lang.String byteGraph_values;

    public ByteGraphType() {
    }

    public ByteGraphType(
           java.lang.String byteGraph_max,
           java.lang.String byteGraph_min,
           java.lang.String byteGraph_axis,
           java.lang.String byteGraph_values) {
           this.byteGraph_max = byteGraph_max;
           this.byteGraph_min = byteGraph_min;
           this.byteGraph_axis = byteGraph_axis;
           this.byteGraph_values = byteGraph_values;
    }


    /**
     * Gets the byteGraph_max value for this ByteGraphType.
     * 
     * @return byteGraph_max
     */
    public java.lang.String getByteGraph_max() {
        return byteGraph_max;
    }


    /**
     * Sets the byteGraph_max value for this ByteGraphType.
     * 
     * @param byteGraph_max
     */
    public void setByteGraph_max(java.lang.String byteGraph_max) {
        this.byteGraph_max = byteGraph_max;
    }


    /**
     * Gets the byteGraph_min value for this ByteGraphType.
     * 
     * @return byteGraph_min
     */
    public java.lang.String getByteGraph_min() {
        return byteGraph_min;
    }


    /**
     * Sets the byteGraph_min value for this ByteGraphType.
     * 
     * @param byteGraph_min
     */
    public void setByteGraph_min(java.lang.String byteGraph_min) {
        this.byteGraph_min = byteGraph_min;
    }


    /**
     * Gets the byteGraph_axis value for this ByteGraphType.
     * 
     * @return byteGraph_axis
     */
    public java.lang.String getByteGraph_axis() {
        return byteGraph_axis;
    }


    /**
     * Sets the byteGraph_axis value for this ByteGraphType.
     * 
     * @param byteGraph_axis
     */
    public void setByteGraph_axis(java.lang.String byteGraph_axis) {
        this.byteGraph_axis = byteGraph_axis;
    }


    /**
     * Gets the byteGraph_values value for this ByteGraphType.
     * 
     * @return byteGraph_values
     */
    public java.lang.String getByteGraph_values() {
        return byteGraph_values;
    }


    /**
     * Sets the byteGraph_values value for this ByteGraphType.
     * 
     * @param byteGraph_values
     */
    public void setByteGraph_values(java.lang.String byteGraph_values) {
        this.byteGraph_values = byteGraph_values;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ByteGraphType)) return false;
        ByteGraphType other = (ByteGraphType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.byteGraph_max==null && other.getByteGraph_max()==null) || 
             (this.byteGraph_max!=null &&
              this.byteGraph_max.equals(other.getByteGraph_max()))) &&
            ((this.byteGraph_min==null && other.getByteGraph_min()==null) || 
             (this.byteGraph_min!=null &&
              this.byteGraph_min.equals(other.getByteGraph_min()))) &&
            ((this.byteGraph_axis==null && other.getByteGraph_axis()==null) || 
             (this.byteGraph_axis!=null &&
              this.byteGraph_axis.equals(other.getByteGraph_axis()))) &&
            ((this.byteGraph_values==null && other.getByteGraph_values()==null) || 
             (this.byteGraph_values!=null &&
              this.byteGraph_values.equals(other.getByteGraph_values())));
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
        if (getByteGraph_max() != null) {
            _hashCode += getByteGraph_max().hashCode();
        }
        if (getByteGraph_min() != null) {
            _hashCode += getByteGraph_min().hashCode();
        }
        if (getByteGraph_axis() != null) {
            _hashCode += getByteGraph_axis().hashCode();
        }
        if (getByteGraph_values() != null) {
            _hashCode += getByteGraph_values().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ByteGraphType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Byte-graphType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byteGraph_max");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Byte-graph_max"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byteGraph_min");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Byte-graph_min"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byteGraph_axis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Byte-graph_axis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byteGraph_values");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Byte-graph_values"));
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
