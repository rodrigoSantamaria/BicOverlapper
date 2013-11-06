/**
 * PackedSeg_lensType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PackedSeg_lensType  implements java.io.Serializable {
    private java.lang.String[] packedSeg_lens_E;

    public PackedSeg_lensType() {
    }

    public PackedSeg_lensType(
           java.lang.String[] packedSeg_lens_E) {
           this.packedSeg_lens_E = packedSeg_lens_E;
    }


    /**
     * Gets the packedSeg_lens_E value for this PackedSeg_lensType.
     * 
     * @return packedSeg_lens_E
     */
    public java.lang.String[] getPackedSeg_lens_E() {
        return packedSeg_lens_E;
    }


    /**
     * Sets the packedSeg_lens_E value for this PackedSeg_lensType.
     * 
     * @param packedSeg_lens_E
     */
    public void setPackedSeg_lens_E(java.lang.String[] packedSeg_lens_E) {
        this.packedSeg_lens_E = packedSeg_lens_E;
    }

    public java.lang.String getPackedSeg_lens_E(int i) {
        return this.packedSeg_lens_E[i];
    }

    public void setPackedSeg_lens_E(int i, java.lang.String _value) {
        this.packedSeg_lens_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackedSeg_lensType)) return false;
        PackedSeg_lensType other = (PackedSeg_lensType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packedSeg_lens_E==null && other.getPackedSeg_lens_E()==null) || 
             (this.packedSeg_lens_E!=null &&
              java.util.Arrays.equals(this.packedSeg_lens_E, other.getPackedSeg_lens_E())));
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
        if (getPackedSeg_lens_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPackedSeg_lens_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPackedSeg_lens_E(), i);
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
        new org.apache.axis.description.TypeDesc(PackedSeg_lensType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seg_lensType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packedSeg_lens_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seg_lens_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seg_lens_E"));
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
