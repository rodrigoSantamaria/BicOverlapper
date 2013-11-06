/**
 * PackedSeqpnt_pointsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PackedSeqpnt_pointsType  implements java.io.Serializable {
    private java.lang.String[] packedSeqpnt_points_E;

    public PackedSeqpnt_pointsType() {
    }

    public PackedSeqpnt_pointsType(
           java.lang.String[] packedSeqpnt_points_E) {
           this.packedSeqpnt_points_E = packedSeqpnt_points_E;
    }


    /**
     * Gets the packedSeqpnt_points_E value for this PackedSeqpnt_pointsType.
     * 
     * @return packedSeqpnt_points_E
     */
    public java.lang.String[] getPackedSeqpnt_points_E() {
        return packedSeqpnt_points_E;
    }


    /**
     * Sets the packedSeqpnt_points_E value for this PackedSeqpnt_pointsType.
     * 
     * @param packedSeqpnt_points_E
     */
    public void setPackedSeqpnt_points_E(java.lang.String[] packedSeqpnt_points_E) {
        this.packedSeqpnt_points_E = packedSeqpnt_points_E;
    }

    public java.lang.String getPackedSeqpnt_points_E(int i) {
        return this.packedSeqpnt_points_E[i];
    }

    public void setPackedSeqpnt_points_E(int i, java.lang.String _value) {
        this.packedSeqpnt_points_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackedSeqpnt_pointsType)) return false;
        PackedSeqpnt_pointsType other = (PackedSeqpnt_pointsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packedSeqpnt_points_E==null && other.getPackedSeqpnt_points_E()==null) || 
             (this.packedSeqpnt_points_E!=null &&
              java.util.Arrays.equals(this.packedSeqpnt_points_E, other.getPackedSeqpnt_points_E())));
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
        if (getPackedSeqpnt_points_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPackedSeqpnt_points_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPackedSeqpnt_points_E(), i);
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
        new org.apache.axis.description.TypeDesc(PackedSeqpnt_pointsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seqpnt_pointsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packedSeqpnt_points_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seqpnt_points_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seqpnt_points_E"));
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
