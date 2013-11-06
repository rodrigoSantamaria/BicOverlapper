/**
 * PCConformer_yType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCConformer_yType  implements java.io.Serializable {
    private java.lang.String[] PCConformer_y_E;

    public PCConformer_yType() {
    }

    public PCConformer_yType(
           java.lang.String[] PCConformer_y_E) {
           this.PCConformer_y_E = PCConformer_y_E;
    }


    /**
     * Gets the PCConformer_y_E value for this PCConformer_yType.
     * 
     * @return PCConformer_y_E
     */
    public java.lang.String[] getPCConformer_y_E() {
        return PCConformer_y_E;
    }


    /**
     * Sets the PCConformer_y_E value for this PCConformer_yType.
     * 
     * @param PCConformer_y_E
     */
    public void setPCConformer_y_E(java.lang.String[] PCConformer_y_E) {
        this.PCConformer_y_E = PCConformer_y_E;
    }

    public java.lang.String getPCConformer_y_E(int i) {
        return this.PCConformer_y_E[i];
    }

    public void setPCConformer_y_E(int i, java.lang.String _value) {
        this.PCConformer_y_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCConformer_yType)) return false;
        PCConformer_yType other = (PCConformer_yType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCConformer_y_E==null && other.getPCConformer_y_E()==null) || 
             (this.PCConformer_y_E!=null &&
              java.util.Arrays.equals(this.PCConformer_y_E, other.getPCConformer_y_E())));
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
        if (getPCConformer_y_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCConformer_y_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCConformer_y_E(), i);
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
        new org.apache.axis.description.TypeDesc(PCConformer_yType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Conformer_yType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCConformer_y_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Conformer_y_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Conformer_y_E"));
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
