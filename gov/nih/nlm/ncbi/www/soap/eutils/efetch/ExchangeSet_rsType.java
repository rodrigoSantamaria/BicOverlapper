/**
 * ExchangeSet_rsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ExchangeSet_rsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RsType[] rs;

    public ExchangeSet_rsType() {
    }

    public ExchangeSet_rsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RsType[] rs) {
           this.rs = rs;
    }


    /**
     * Gets the rs value for this ExchangeSet_rsType.
     * 
     * @return rs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RsType[] getRs() {
        return rs;
    }


    /**
     * Sets the rs value for this ExchangeSet_rsType.
     * 
     * @param rs
     */
    public void setRs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RsType[] rs) {
        this.rs = rs;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RsType getRs(int i) {
        return this.rs[i];
    }

    public void setRs(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.RsType _value) {
        this.rs[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExchangeSet_rsType)) return false;
        ExchangeSet_rsType other = (ExchangeSet_rsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rs==null && other.getRs()==null) || 
             (this.rs!=null &&
              java.util.Arrays.equals(this.rs, other.getRs())));
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
        if (getRs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRs(), i);
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
        new org.apache.axis.description.TypeDesc(ExchangeSet_rsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ExchangeSet_rsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RsType"));
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
