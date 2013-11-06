/**
 * MSHitSet_namevalueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSHitSet_namevalueType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.NameValueType[] nameValue;

    public MSHitSet_namevalueType() {
    }

    public MSHitSet_namevalueType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.NameValueType[] nameValue) {
           this.nameValue = nameValue;
    }


    /**
     * Gets the nameValue value for this MSHitSet_namevalueType.
     * 
     * @return nameValue
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.NameValueType[] getNameValue() {
        return nameValue;
    }


    /**
     * Sets the nameValue value for this MSHitSet_namevalueType.
     * 
     * @param nameValue
     */
    public void setNameValue(gov.nih.nlm.ncbi.www.soap.eutils.efetch.NameValueType[] nameValue) {
        this.nameValue = nameValue;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.NameValueType getNameValue(int i) {
        return this.nameValue[i];
    }

    public void setNameValue(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.NameValueType _value) {
        this.nameValue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSHitSet_namevalueType)) return false;
        MSHitSet_namevalueType other = (MSHitSet_namevalueType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nameValue==null && other.getNameValue()==null) || 
             (this.nameValue!=null &&
              java.util.Arrays.equals(this.nameValue, other.getNameValue())));
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
        if (getNameValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNameValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNameValue(), i);
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
        new org.apache.axis.description.TypeDesc(MSHitSet_namevalueType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSHitSet_namevalueType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NameValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NameValueType"));
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
