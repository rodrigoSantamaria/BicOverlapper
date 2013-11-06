/**
 * Cdregion_codeBreakType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cdregion_codeBreakType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CodeBreakType[] codeBreak;

    public Cdregion_codeBreakType() {
    }

    public Cdregion_codeBreakType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CodeBreakType[] codeBreak) {
           this.codeBreak = codeBreak;
    }


    /**
     * Gets the codeBreak value for this Cdregion_codeBreakType.
     * 
     * @return codeBreak
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CodeBreakType[] getCodeBreak() {
        return codeBreak;
    }


    /**
     * Sets the codeBreak value for this Cdregion_codeBreakType.
     * 
     * @param codeBreak
     */
    public void setCodeBreak(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CodeBreakType[] codeBreak) {
        this.codeBreak = codeBreak;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CodeBreakType getCodeBreak(int i) {
        return this.codeBreak[i];
    }

    public void setCodeBreak(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.CodeBreakType _value) {
        this.codeBreak[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cdregion_codeBreakType)) return false;
        Cdregion_codeBreakType other = (Cdregion_codeBreakType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codeBreak==null && other.getCodeBreak()==null) || 
             (this.codeBreak!=null &&
              java.util.Arrays.equals(this.codeBreak, other.getCodeBreak())));
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
        if (getCodeBreak() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCodeBreak());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCodeBreak(), i);
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
        new org.apache.axis.description.TypeDesc(Cdregion_codeBreakType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdregion_code-breakType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeBreak");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Code-break"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Code-breakType"));
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
