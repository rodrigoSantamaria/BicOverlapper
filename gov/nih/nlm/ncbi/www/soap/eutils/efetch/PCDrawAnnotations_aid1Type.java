/**
 * PCDrawAnnotations_aid1Type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCDrawAnnotations_aid1Type  implements java.io.Serializable {
    private java.lang.String[] PCDrawAnnotations_aid1_E;

    public PCDrawAnnotations_aid1Type() {
    }

    public PCDrawAnnotations_aid1Type(
           java.lang.String[] PCDrawAnnotations_aid1_E) {
           this.PCDrawAnnotations_aid1_E = PCDrawAnnotations_aid1_E;
    }


    /**
     * Gets the PCDrawAnnotations_aid1_E value for this PCDrawAnnotations_aid1Type.
     * 
     * @return PCDrawAnnotations_aid1_E
     */
    public java.lang.String[] getPCDrawAnnotations_aid1_E() {
        return PCDrawAnnotations_aid1_E;
    }


    /**
     * Sets the PCDrawAnnotations_aid1_E value for this PCDrawAnnotations_aid1Type.
     * 
     * @param PCDrawAnnotations_aid1_E
     */
    public void setPCDrawAnnotations_aid1_E(java.lang.String[] PCDrawAnnotations_aid1_E) {
        this.PCDrawAnnotations_aid1_E = PCDrawAnnotations_aid1_E;
    }

    public java.lang.String getPCDrawAnnotations_aid1_E(int i) {
        return this.PCDrawAnnotations_aid1_E[i];
    }

    public void setPCDrawAnnotations_aid1_E(int i, java.lang.String _value) {
        this.PCDrawAnnotations_aid1_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCDrawAnnotations_aid1Type)) return false;
        PCDrawAnnotations_aid1Type other = (PCDrawAnnotations_aid1Type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCDrawAnnotations_aid1_E==null && other.getPCDrawAnnotations_aid1_E()==null) || 
             (this.PCDrawAnnotations_aid1_E!=null &&
              java.util.Arrays.equals(this.PCDrawAnnotations_aid1_E, other.getPCDrawAnnotations_aid1_E())));
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
        if (getPCDrawAnnotations_aid1_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCDrawAnnotations_aid1_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCDrawAnnotations_aid1_E(), i);
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
        new org.apache.axis.description.TypeDesc(PCDrawAnnotations_aid1Type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-DrawAnnotations_aid1Type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCDrawAnnotations_aid1_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-DrawAnnotations_aid1_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-DrawAnnotations_aid1_E"));
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
