/**
 * PIRBlock_keywordsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PIRBlock_keywordsType  implements java.io.Serializable {
    private java.lang.String[] PIRBlock_keywords_E;

    public PIRBlock_keywordsType() {
    }

    public PIRBlock_keywordsType(
           java.lang.String[] PIRBlock_keywords_E) {
           this.PIRBlock_keywords_E = PIRBlock_keywords_E;
    }


    /**
     * Gets the PIRBlock_keywords_E value for this PIRBlock_keywordsType.
     * 
     * @return PIRBlock_keywords_E
     */
    public java.lang.String[] getPIRBlock_keywords_E() {
        return PIRBlock_keywords_E;
    }


    /**
     * Sets the PIRBlock_keywords_E value for this PIRBlock_keywordsType.
     * 
     * @param PIRBlock_keywords_E
     */
    public void setPIRBlock_keywords_E(java.lang.String[] PIRBlock_keywords_E) {
        this.PIRBlock_keywords_E = PIRBlock_keywords_E;
    }

    public java.lang.String getPIRBlock_keywords_E(int i) {
        return this.PIRBlock_keywords_E[i];
    }

    public void setPIRBlock_keywords_E(int i, java.lang.String _value) {
        this.PIRBlock_keywords_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PIRBlock_keywordsType)) return false;
        PIRBlock_keywordsType other = (PIRBlock_keywordsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PIRBlock_keywords_E==null && other.getPIRBlock_keywords_E()==null) || 
             (this.PIRBlock_keywords_E!=null &&
              java.util.Arrays.equals(this.PIRBlock_keywords_E, other.getPIRBlock_keywords_E())));
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
        if (getPIRBlock_keywords_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPIRBlock_keywords_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPIRBlock_keywords_E(), i);
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
        new org.apache.axis.description.TypeDesc(PIRBlock_keywordsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PIR-block_keywordsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PIRBlock_keywords_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PIR-block_keywords_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PIR-block_keywords_E"));
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
