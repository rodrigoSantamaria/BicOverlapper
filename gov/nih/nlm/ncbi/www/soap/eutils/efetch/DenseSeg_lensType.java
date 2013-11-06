/**
 * DenseSeg_lensType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class DenseSeg_lensType  implements java.io.Serializable {
    private java.lang.String[] denseSeg_lens_E;

    public DenseSeg_lensType() {
    }

    public DenseSeg_lensType(
           java.lang.String[] denseSeg_lens_E) {
           this.denseSeg_lens_E = denseSeg_lens_E;
    }


    /**
     * Gets the denseSeg_lens_E value for this DenseSeg_lensType.
     * 
     * @return denseSeg_lens_E
     */
    public java.lang.String[] getDenseSeg_lens_E() {
        return denseSeg_lens_E;
    }


    /**
     * Sets the denseSeg_lens_E value for this DenseSeg_lensType.
     * 
     * @param denseSeg_lens_E
     */
    public void setDenseSeg_lens_E(java.lang.String[] denseSeg_lens_E) {
        this.denseSeg_lens_E = denseSeg_lens_E;
    }

    public java.lang.String getDenseSeg_lens_E(int i) {
        return this.denseSeg_lens_E[i];
    }

    public void setDenseSeg_lens_E(int i, java.lang.String _value) {
        this.denseSeg_lens_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DenseSeg_lensType)) return false;
        DenseSeg_lensType other = (DenseSeg_lensType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.denseSeg_lens_E==null && other.getDenseSeg_lens_E()==null) || 
             (this.denseSeg_lens_E!=null &&
              java.util.Arrays.equals(this.denseSeg_lens_E, other.getDenseSeg_lens_E())));
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
        if (getDenseSeg_lens_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDenseSeg_lens_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDenseSeg_lens_E(), i);
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
        new org.apache.axis.description.TypeDesc(DenseSeg_lensType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-seg_lensType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denseSeg_lens_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-seg_lens_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dense-seg_lens_E"));
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
