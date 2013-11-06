/**
 * PCStereoGroupType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCStereoGroupType  implements java.io.Serializable {
    private java.lang.String[] PCStereoGroup_E;

    public PCStereoGroupType() {
    }

    public PCStereoGroupType(
           java.lang.String[] PCStereoGroup_E) {
           this.PCStereoGroup_E = PCStereoGroup_E;
    }


    /**
     * Gets the PCStereoGroup_E value for this PCStereoGroupType.
     * 
     * @return PCStereoGroup_E
     */
    public java.lang.String[] getPCStereoGroup_E() {
        return PCStereoGroup_E;
    }


    /**
     * Sets the PCStereoGroup_E value for this PCStereoGroupType.
     * 
     * @param PCStereoGroup_E
     */
    public void setPCStereoGroup_E(java.lang.String[] PCStereoGroup_E) {
        this.PCStereoGroup_E = PCStereoGroup_E;
    }

    public java.lang.String getPCStereoGroup_E(int i) {
        return this.PCStereoGroup_E[i];
    }

    public void setPCStereoGroup_E(int i, java.lang.String _value) {
        this.PCStereoGroup_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCStereoGroupType)) return false;
        PCStereoGroupType other = (PCStereoGroupType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCStereoGroup_E==null && other.getPCStereoGroup_E()==null) || 
             (this.PCStereoGroup_E!=null &&
              java.util.Arrays.equals(this.PCStereoGroup_E, other.getPCStereoGroup_E())));
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
        if (getPCStereoGroup_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCStereoGroup_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCStereoGroup_E(), i);
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
        new org.apache.axis.description.TypeDesc(PCStereoGroupType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-StereoGroupType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCStereoGroup_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-StereoGroup_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-StereoGroup_E"));
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
