/**
 * IntGraphType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class IntGraphType  implements java.io.Serializable {
    private java.lang.String intGraph_max;

    private java.lang.String intGraph_min;

    private java.lang.String intGraph_axis;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntGraph_valuesType intGraph_values;

    public IntGraphType() {
    }

    public IntGraphType(
           java.lang.String intGraph_max,
           java.lang.String intGraph_min,
           java.lang.String intGraph_axis,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntGraph_valuesType intGraph_values) {
           this.intGraph_max = intGraph_max;
           this.intGraph_min = intGraph_min;
           this.intGraph_axis = intGraph_axis;
           this.intGraph_values = intGraph_values;
    }


    /**
     * Gets the intGraph_max value for this IntGraphType.
     * 
     * @return intGraph_max
     */
    public java.lang.String getIntGraph_max() {
        return intGraph_max;
    }


    /**
     * Sets the intGraph_max value for this IntGraphType.
     * 
     * @param intGraph_max
     */
    public void setIntGraph_max(java.lang.String intGraph_max) {
        this.intGraph_max = intGraph_max;
    }


    /**
     * Gets the intGraph_min value for this IntGraphType.
     * 
     * @return intGraph_min
     */
    public java.lang.String getIntGraph_min() {
        return intGraph_min;
    }


    /**
     * Sets the intGraph_min value for this IntGraphType.
     * 
     * @param intGraph_min
     */
    public void setIntGraph_min(java.lang.String intGraph_min) {
        this.intGraph_min = intGraph_min;
    }


    /**
     * Gets the intGraph_axis value for this IntGraphType.
     * 
     * @return intGraph_axis
     */
    public java.lang.String getIntGraph_axis() {
        return intGraph_axis;
    }


    /**
     * Sets the intGraph_axis value for this IntGraphType.
     * 
     * @param intGraph_axis
     */
    public void setIntGraph_axis(java.lang.String intGraph_axis) {
        this.intGraph_axis = intGraph_axis;
    }


    /**
     * Gets the intGraph_values value for this IntGraphType.
     * 
     * @return intGraph_values
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntGraph_valuesType getIntGraph_values() {
        return intGraph_values;
    }


    /**
     * Sets the intGraph_values value for this IntGraphType.
     * 
     * @param intGraph_values
     */
    public void setIntGraph_values(gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntGraph_valuesType intGraph_values) {
        this.intGraph_values = intGraph_values;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntGraphType)) return false;
        IntGraphType other = (IntGraphType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.intGraph_max==null && other.getIntGraph_max()==null) || 
             (this.intGraph_max!=null &&
              this.intGraph_max.equals(other.getIntGraph_max()))) &&
            ((this.intGraph_min==null && other.getIntGraph_min()==null) || 
             (this.intGraph_min!=null &&
              this.intGraph_min.equals(other.getIntGraph_min()))) &&
            ((this.intGraph_axis==null && other.getIntGraph_axis()==null) || 
             (this.intGraph_axis!=null &&
              this.intGraph_axis.equals(other.getIntGraph_axis()))) &&
            ((this.intGraph_values==null && other.getIntGraph_values()==null) || 
             (this.intGraph_values!=null &&
              this.intGraph_values.equals(other.getIntGraph_values())));
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
        if (getIntGraph_max() != null) {
            _hashCode += getIntGraph_max().hashCode();
        }
        if (getIntGraph_min() != null) {
            _hashCode += getIntGraph_min().hashCode();
        }
        if (getIntGraph_axis() != null) {
            _hashCode += getIntGraph_axis().hashCode();
        }
        if (getIntGraph_values() != null) {
            _hashCode += getIntGraph_values().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IntGraphType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Int-graphType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intGraph_max");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Int-graph_max"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intGraph_min");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Int-graph_min"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intGraph_axis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Int-graph_axis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intGraph_values");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Int-graph_values"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Int-graph_valuesType"));
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
