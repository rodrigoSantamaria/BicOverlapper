/**
 * ExchangeSet_baseURLType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ExchangeSet_baseURLType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BaseURLType[] baseURL;

    public ExchangeSet_baseURLType() {
    }

    public ExchangeSet_baseURLType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BaseURLType[] baseURL) {
           this.baseURL = baseURL;
    }


    /**
     * Gets the baseURL value for this ExchangeSet_baseURLType.
     * 
     * @return baseURL
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BaseURLType[] getBaseURL() {
        return baseURL;
    }


    /**
     * Sets the baseURL value for this ExchangeSet_baseURLType.
     * 
     * @param baseURL
     */
    public void setBaseURL(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BaseURLType[] baseURL) {
        this.baseURL = baseURL;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BaseURLType getBaseURL(int i) {
        return this.baseURL[i];
    }

    public void setBaseURL(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.BaseURLType _value) {
        this.baseURL[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExchangeSet_baseURLType)) return false;
        ExchangeSet_baseURLType other = (ExchangeSet_baseURLType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baseURL==null && other.getBaseURL()==null) || 
             (this.baseURL!=null &&
              java.util.Arrays.equals(this.baseURL, other.getBaseURL())));
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
        if (getBaseURL() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBaseURL());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBaseURL(), i);
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
        new org.apache.axis.description.TypeDesc(ExchangeSet_baseURLType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ExchangeSet_baseURLType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BaseURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BaseURLType"));
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
