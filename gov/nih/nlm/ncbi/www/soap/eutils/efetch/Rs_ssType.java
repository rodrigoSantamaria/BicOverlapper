/**
 * Rs_ssType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Rs_ssType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SsType[] ss;

    public Rs_ssType() {
    }

    public Rs_ssType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SsType[] ss) {
           this.ss = ss;
    }


    /**
     * Gets the ss value for this Rs_ssType.
     * 
     * @return ss
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SsType[] getSs() {
        return ss;
    }


    /**
     * Sets the ss value for this Rs_ssType.
     * 
     * @param ss
     */
    public void setSs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SsType[] ss) {
        this.ss = ss;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SsType getSs(int i) {
        return this.ss[i];
    }

    public void setSs(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.SsType _value) {
        this.ss[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rs_ssType)) return false;
        Rs_ssType other = (Rs_ssType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ss==null && other.getSs()==null) || 
             (this.ss!=null &&
              java.util.Arrays.equals(this.ss, other.getSs())));
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
        if (getSs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSs(), i);
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
        new org.apache.axis.description.TypeDesc(Rs_ssType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_ssType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ss");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "SsType"));
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
