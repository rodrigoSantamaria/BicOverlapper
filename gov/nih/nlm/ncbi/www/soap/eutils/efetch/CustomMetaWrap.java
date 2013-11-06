/**
 * CustomMetaWrap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CustomMetaWrap  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CustomMeta[] customMeta;

    public CustomMetaWrap() {
    }

    public CustomMetaWrap(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CustomMeta[] customMeta) {
           this.customMeta = customMeta;
    }


    /**
     * Gets the customMeta value for this CustomMetaWrap.
     * 
     * @return customMeta
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CustomMeta[] getCustomMeta() {
        return customMeta;
    }


    /**
     * Sets the customMeta value for this CustomMetaWrap.
     * 
     * @param customMeta
     */
    public void setCustomMeta(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CustomMeta[] customMeta) {
        this.customMeta = customMeta;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CustomMeta getCustomMeta(int i) {
        return this.customMeta[i];
    }

    public void setCustomMeta(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.CustomMeta _value) {
        this.customMeta[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomMetaWrap)) return false;
        CustomMetaWrap other = (CustomMetaWrap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customMeta==null && other.getCustomMeta()==null) || 
             (this.customMeta!=null &&
              java.util.Arrays.equals(this.customMeta, other.getCustomMeta())));
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
        if (getCustomMeta() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomMeta());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomMeta(), i);
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
        new org.apache.axis.description.TypeDesc(CustomMetaWrap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">custom-meta-wrap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customMeta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "custom-meta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "custom-meta"));
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
