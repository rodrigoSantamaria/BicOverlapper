/**
 * MimIndexTermType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MimIndexTermType  implements java.io.Serializable {
    private java.lang.String mimIndexTerm_key;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimIndexTerm_termsType mimIndexTerm_terms;

    public MimIndexTermType() {
    }

    public MimIndexTermType(
           java.lang.String mimIndexTerm_key,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimIndexTerm_termsType mimIndexTerm_terms) {
           this.mimIndexTerm_key = mimIndexTerm_key;
           this.mimIndexTerm_terms = mimIndexTerm_terms;
    }


    /**
     * Gets the mimIndexTerm_key value for this MimIndexTermType.
     * 
     * @return mimIndexTerm_key
     */
    public java.lang.String getMimIndexTerm_key() {
        return mimIndexTerm_key;
    }


    /**
     * Sets the mimIndexTerm_key value for this MimIndexTermType.
     * 
     * @param mimIndexTerm_key
     */
    public void setMimIndexTerm_key(java.lang.String mimIndexTerm_key) {
        this.mimIndexTerm_key = mimIndexTerm_key;
    }


    /**
     * Gets the mimIndexTerm_terms value for this MimIndexTermType.
     * 
     * @return mimIndexTerm_terms
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimIndexTerm_termsType getMimIndexTerm_terms() {
        return mimIndexTerm_terms;
    }


    /**
     * Sets the mimIndexTerm_terms value for this MimIndexTermType.
     * 
     * @param mimIndexTerm_terms
     */
    public void setMimIndexTerm_terms(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimIndexTerm_termsType mimIndexTerm_terms) {
        this.mimIndexTerm_terms = mimIndexTerm_terms;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MimIndexTermType)) return false;
        MimIndexTermType other = (MimIndexTermType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mimIndexTerm_key==null && other.getMimIndexTerm_key()==null) || 
             (this.mimIndexTerm_key!=null &&
              this.mimIndexTerm_key.equals(other.getMimIndexTerm_key()))) &&
            ((this.mimIndexTerm_terms==null && other.getMimIndexTerm_terms()==null) || 
             (this.mimIndexTerm_terms!=null &&
              this.mimIndexTerm_terms.equals(other.getMimIndexTerm_terms())));
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
        if (getMimIndexTerm_key() != null) {
            _hashCode += getMimIndexTerm_key().hashCode();
        }
        if (getMimIndexTerm_terms() != null) {
            _hashCode += getMimIndexTerm_terms().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MimIndexTermType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-index-termType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimIndexTerm_key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-index-term_key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimIndexTerm_terms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-index-term_terms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-index-term_termsType"));
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
