/**
 * ExchangeSet_queryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ExchangeSet_queryType  implements java.io.Serializable {
    private java.lang.String exchangeSet_query_date;

    private java.lang.String exchangeSet_query_string;

    public ExchangeSet_queryType() {
    }

    public ExchangeSet_queryType(
           java.lang.String exchangeSet_query_date,
           java.lang.String exchangeSet_query_string) {
           this.exchangeSet_query_date = exchangeSet_query_date;
           this.exchangeSet_query_string = exchangeSet_query_string;
    }


    /**
     * Gets the exchangeSet_query_date value for this ExchangeSet_queryType.
     * 
     * @return exchangeSet_query_date
     */
    public java.lang.String getExchangeSet_query_date() {
        return exchangeSet_query_date;
    }


    /**
     * Sets the exchangeSet_query_date value for this ExchangeSet_queryType.
     * 
     * @param exchangeSet_query_date
     */
    public void setExchangeSet_query_date(java.lang.String exchangeSet_query_date) {
        this.exchangeSet_query_date = exchangeSet_query_date;
    }


    /**
     * Gets the exchangeSet_query_string value for this ExchangeSet_queryType.
     * 
     * @return exchangeSet_query_string
     */
    public java.lang.String getExchangeSet_query_string() {
        return exchangeSet_query_string;
    }


    /**
     * Sets the exchangeSet_query_string value for this ExchangeSet_queryType.
     * 
     * @param exchangeSet_query_string
     */
    public void setExchangeSet_query_string(java.lang.String exchangeSet_query_string) {
        this.exchangeSet_query_string = exchangeSet_query_string;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExchangeSet_queryType)) return false;
        ExchangeSet_queryType other = (ExchangeSet_queryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exchangeSet_query_date==null && other.getExchangeSet_query_date()==null) || 
             (this.exchangeSet_query_date!=null &&
              this.exchangeSet_query_date.equals(other.getExchangeSet_query_date()))) &&
            ((this.exchangeSet_query_string==null && other.getExchangeSet_query_string()==null) || 
             (this.exchangeSet_query_string!=null &&
              this.exchangeSet_query_string.equals(other.getExchangeSet_query_string())));
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
        if (getExchangeSet_query_date() != null) {
            _hashCode += getExchangeSet_query_date().hashCode();
        }
        if (getExchangeSet_query_string() != null) {
            _hashCode += getExchangeSet_query_string().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExchangeSet_queryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ExchangeSet_queryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeSet_query_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ExchangeSet_query_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeSet_query_string");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ExchangeSet_query_string"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
