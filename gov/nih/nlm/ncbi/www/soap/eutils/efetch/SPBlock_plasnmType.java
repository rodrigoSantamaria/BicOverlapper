/**
 * SPBlock_plasnmType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SPBlock_plasnmType  implements java.io.Serializable {
    private java.lang.String[] SPBlock_plasnm_E;

    public SPBlock_plasnmType() {
    }

    public SPBlock_plasnmType(
           java.lang.String[] SPBlock_plasnm_E) {
           this.SPBlock_plasnm_E = SPBlock_plasnm_E;
    }


    /**
     * Gets the SPBlock_plasnm_E value for this SPBlock_plasnmType.
     * 
     * @return SPBlock_plasnm_E
     */
    public java.lang.String[] getSPBlock_plasnm_E() {
        return SPBlock_plasnm_E;
    }


    /**
     * Sets the SPBlock_plasnm_E value for this SPBlock_plasnmType.
     * 
     * @param SPBlock_plasnm_E
     */
    public void setSPBlock_plasnm_E(java.lang.String[] SPBlock_plasnm_E) {
        this.SPBlock_plasnm_E = SPBlock_plasnm_E;
    }

    public java.lang.String getSPBlock_plasnm_E(int i) {
        return this.SPBlock_plasnm_E[i];
    }

    public void setSPBlock_plasnm_E(int i, java.lang.String _value) {
        this.SPBlock_plasnm_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SPBlock_plasnmType)) return false;
        SPBlock_plasnmType other = (SPBlock_plasnmType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SPBlock_plasnm_E==null && other.getSPBlock_plasnm_E()==null) || 
             (this.SPBlock_plasnm_E!=null &&
              java.util.Arrays.equals(this.SPBlock_plasnm_E, other.getSPBlock_plasnm_E())));
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
        if (getSPBlock_plasnm_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSPBlock_plasnm_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSPBlock_plasnm_E(), i);
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
        new org.apache.axis.description.TypeDesc(SPBlock_plasnmType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SP-block_plasnmType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPBlock_plasnm_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SP-block_plasnm_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SP-block_plasnm_E"));
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
