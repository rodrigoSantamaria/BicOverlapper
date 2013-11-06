/**
 * RealGraphType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RealGraphType  implements java.io.Serializable {
    private java.lang.String realGraph_max;

    private java.lang.String realGraph_min;

    private java.lang.String realGraph_axis;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RealGraph_valuesType realGraph_values;

    public RealGraphType() {
    }

    public RealGraphType(
           java.lang.String realGraph_max,
           java.lang.String realGraph_min,
           java.lang.String realGraph_axis,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RealGraph_valuesType realGraph_values) {
           this.realGraph_max = realGraph_max;
           this.realGraph_min = realGraph_min;
           this.realGraph_axis = realGraph_axis;
           this.realGraph_values = realGraph_values;
    }


    /**
     * Gets the realGraph_max value for this RealGraphType.
     * 
     * @return realGraph_max
     */
    public java.lang.String getRealGraph_max() {
        return realGraph_max;
    }


    /**
     * Sets the realGraph_max value for this RealGraphType.
     * 
     * @param realGraph_max
     */
    public void setRealGraph_max(java.lang.String realGraph_max) {
        this.realGraph_max = realGraph_max;
    }


    /**
     * Gets the realGraph_min value for this RealGraphType.
     * 
     * @return realGraph_min
     */
    public java.lang.String getRealGraph_min() {
        return realGraph_min;
    }


    /**
     * Sets the realGraph_min value for this RealGraphType.
     * 
     * @param realGraph_min
     */
    public void setRealGraph_min(java.lang.String realGraph_min) {
        this.realGraph_min = realGraph_min;
    }


    /**
     * Gets the realGraph_axis value for this RealGraphType.
     * 
     * @return realGraph_axis
     */
    public java.lang.String getRealGraph_axis() {
        return realGraph_axis;
    }


    /**
     * Sets the realGraph_axis value for this RealGraphType.
     * 
     * @param realGraph_axis
     */
    public void setRealGraph_axis(java.lang.String realGraph_axis) {
        this.realGraph_axis = realGraph_axis;
    }


    /**
     * Gets the realGraph_values value for this RealGraphType.
     * 
     * @return realGraph_values
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RealGraph_valuesType getRealGraph_values() {
        return realGraph_values;
    }


    /**
     * Sets the realGraph_values value for this RealGraphType.
     * 
     * @param realGraph_values
     */
    public void setRealGraph_values(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RealGraph_valuesType realGraph_values) {
        this.realGraph_values = realGraph_values;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RealGraphType)) return false;
        RealGraphType other = (RealGraphType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.realGraph_max==null && other.getRealGraph_max()==null) || 
             (this.realGraph_max!=null &&
              this.realGraph_max.equals(other.getRealGraph_max()))) &&
            ((this.realGraph_min==null && other.getRealGraph_min()==null) || 
             (this.realGraph_min!=null &&
              this.realGraph_min.equals(other.getRealGraph_min()))) &&
            ((this.realGraph_axis==null && other.getRealGraph_axis()==null) || 
             (this.realGraph_axis!=null &&
              this.realGraph_axis.equals(other.getRealGraph_axis()))) &&
            ((this.realGraph_values==null && other.getRealGraph_values()==null) || 
             (this.realGraph_values!=null &&
              this.realGraph_values.equals(other.getRealGraph_values())));
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
        if (getRealGraph_max() != null) {
            _hashCode += getRealGraph_max().hashCode();
        }
        if (getRealGraph_min() != null) {
            _hashCode += getRealGraph_min().hashCode();
        }
        if (getRealGraph_axis() != null) {
            _hashCode += getRealGraph_axis().hashCode();
        }
        if (getRealGraph_values() != null) {
            _hashCode += getRealGraph_values().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RealGraphType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Real-graphType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realGraph_max");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Real-graph_max"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realGraph_min");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Real-graph_min"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realGraph_axis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Real-graph_axis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realGraph_values");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Real-graph_values"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Real-graph_valuesType"));
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
