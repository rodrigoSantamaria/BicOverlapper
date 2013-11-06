/**
 * Hit_hspsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Hit_hspsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HspType[] hsp;

    public Hit_hspsType() {
    }

    public Hit_hspsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HspType[] hsp) {
           this.hsp = hsp;
    }


    /**
     * Gets the hsp value for this Hit_hspsType.
     * 
     * @return hsp
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HspType[] getHsp() {
        return hsp;
    }


    /**
     * Sets the hsp value for this Hit_hspsType.
     * 
     * @param hsp
     */
    public void setHsp(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HspType[] hsp) {
        this.hsp = hsp;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HspType getHsp(int i) {
        return this.hsp[i];
    }

    public void setHsp(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.HspType _value) {
        this.hsp[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Hit_hspsType)) return false;
        Hit_hspsType other = (Hit_hspsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hsp==null && other.getHsp()==null) || 
             (this.hsp!=null &&
              java.util.Arrays.equals(this.hsp, other.getHsp())));
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
        if (getHsp() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHsp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHsp(), i);
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
        new org.apache.axis.description.TypeDesc(Hit_hspsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Hit_hspsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hsp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Hsp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HspType"));
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
