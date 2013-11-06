/**
 * TranslationSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.esearch;

public class TranslationSetType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationType[] translation;

    public TranslationSetType() {
    }

    public TranslationSetType(
           gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationType[] translation) {
           this.translation = translation;
    }


    /**
     * Gets the translation value for this TranslationSetType.
     * 
     * @return translation
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationType[] getTranslation() {
        return translation;
    }


    /**
     * Sets the translation value for this TranslationSetType.
     * 
     * @param translation
     */
    public void setTranslation(gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationType[] translation) {
        this.translation = translation;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationType getTranslation(int i) {
        return this.translation[i];
    }

    public void setTranslation(int i, gov.nih.nlm.ncbi.www.soap.eutils.esearch.TranslationType _value) {
        this.translation[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TranslationSetType)) return false;
        TranslationSetType other = (TranslationSetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.translation==null && other.getTranslation()==null) || 
             (this.translation!=null &&
              java.util.Arrays.equals(this.translation, other.getTranslation())));
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
        if (getTranslation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranslation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranslation(), i);
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
        new org.apache.axis.description.TypeDesc(TranslationSetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "TranslationSetType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "Translation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "TranslationType"));
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
