/**
 * MSHitSet_idsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSHitSet_idsType  implements java.io.Serializable {
    private java.lang.String[] MSHitSet_ids_E;

    public MSHitSet_idsType() {
    }

    public MSHitSet_idsType(
           java.lang.String[] MSHitSet_ids_E) {
           this.MSHitSet_ids_E = MSHitSet_ids_E;
    }


    /**
     * Gets the MSHitSet_ids_E value for this MSHitSet_idsType.
     * 
     * @return MSHitSet_ids_E
     */
    public java.lang.String[] getMSHitSet_ids_E() {
        return MSHitSet_ids_E;
    }


    /**
     * Sets the MSHitSet_ids_E value for this MSHitSet_idsType.
     * 
     * @param MSHitSet_ids_E
     */
    public void setMSHitSet_ids_E(java.lang.String[] MSHitSet_ids_E) {
        this.MSHitSet_ids_E = MSHitSet_ids_E;
    }

    public java.lang.String getMSHitSet_ids_E(int i) {
        return this.MSHitSet_ids_E[i];
    }

    public void setMSHitSet_ids_E(int i, java.lang.String _value) {
        this.MSHitSet_ids_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSHitSet_idsType)) return false;
        MSHitSet_idsType other = (MSHitSet_idsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSHitSet_ids_E==null && other.getMSHitSet_ids_E()==null) || 
             (this.MSHitSet_ids_E!=null &&
              java.util.Arrays.equals(this.MSHitSet_ids_E, other.getMSHitSet_ids_E())));
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
        if (getMSHitSet_ids_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMSHitSet_ids_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMSHitSet_ids_E(), i);
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
        new org.apache.axis.description.TypeDesc(MSHitSet_idsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHitSet_idsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSHitSet_ids_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHitSet_ids_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHitSet_ids_E"));
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
