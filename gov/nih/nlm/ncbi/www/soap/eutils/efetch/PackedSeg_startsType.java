/**
 * PackedSeg_startsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PackedSeg_startsType  implements java.io.Serializable {
    private java.lang.String[] packedSeg_starts_E;

    public PackedSeg_startsType() {
    }

    public PackedSeg_startsType(
           java.lang.String[] packedSeg_starts_E) {
           this.packedSeg_starts_E = packedSeg_starts_E;
    }


    /**
     * Gets the packedSeg_starts_E value for this PackedSeg_startsType.
     * 
     * @return packedSeg_starts_E
     */
    public java.lang.String[] getPackedSeg_starts_E() {
        return packedSeg_starts_E;
    }


    /**
     * Sets the packedSeg_starts_E value for this PackedSeg_startsType.
     * 
     * @param packedSeg_starts_E
     */
    public void setPackedSeg_starts_E(java.lang.String[] packedSeg_starts_E) {
        this.packedSeg_starts_E = packedSeg_starts_E;
    }

    public java.lang.String getPackedSeg_starts_E(int i) {
        return this.packedSeg_starts_E[i];
    }

    public void setPackedSeg_starts_E(int i, java.lang.String _value) {
        this.packedSeg_starts_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackedSeg_startsType)) return false;
        PackedSeg_startsType other = (PackedSeg_startsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packedSeg_starts_E==null && other.getPackedSeg_starts_E()==null) || 
             (this.packedSeg_starts_E!=null &&
              java.util.Arrays.equals(this.packedSeg_starts_E, other.getPackedSeg_starts_E())));
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
        if (getPackedSeg_starts_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPackedSeg_starts_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPackedSeg_starts_E(), i);
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
        new org.apache.axis.description.TypeDesc(PackedSeg_startsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seg_startsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packedSeg_starts_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seg_starts_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seg_starts_E"));
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
