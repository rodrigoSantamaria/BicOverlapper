/**
 * RealGraph_valuesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RealGraph_valuesType  implements java.io.Serializable {
    private java.lang.String[] realGraph_values_E;

    public RealGraph_valuesType() {
    }

    public RealGraph_valuesType(
           java.lang.String[] realGraph_values_E) {
           this.realGraph_values_E = realGraph_values_E;
    }


    /**
     * Gets the realGraph_values_E value for this RealGraph_valuesType.
     * 
     * @return realGraph_values_E
     */
    public java.lang.String[] getRealGraph_values_E() {
        return realGraph_values_E;
    }


    /**
     * Sets the realGraph_values_E value for this RealGraph_valuesType.
     * 
     * @param realGraph_values_E
     */
    public void setRealGraph_values_E(java.lang.String[] realGraph_values_E) {
        this.realGraph_values_E = realGraph_values_E;
    }

    public java.lang.String getRealGraph_values_E(int i) {
        return this.realGraph_values_E[i];
    }

    public void setRealGraph_values_E(int i, java.lang.String _value) {
        this.realGraph_values_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RealGraph_valuesType)) return false;
        RealGraph_valuesType other = (RealGraph_valuesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.realGraph_values_E==null && other.getRealGraph_values_E()==null) || 
             (this.realGraph_values_E!=null &&
              java.util.Arrays.equals(this.realGraph_values_E, other.getRealGraph_values_E())));
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
        if (getRealGraph_values_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRealGraph_values_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRealGraph_values_E(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RealGraph_valuesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Real-graph_valuesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realGraph_values_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Real-graph_values_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Real-graph_values_E"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
