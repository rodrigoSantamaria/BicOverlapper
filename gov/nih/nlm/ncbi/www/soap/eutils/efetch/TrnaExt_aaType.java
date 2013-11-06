/**
 * TrnaExt_aaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TrnaExt_aaType  implements java.io.Serializable {
    private java.lang.String trnaExt_aa_iupacaa;

    private java.lang.String trnaExt_aa_ncbieaa;

    private java.lang.String trnaExt_aa_ncbi8Aa;

    private java.lang.String trnaExt_aa_ncbistdaa;

    public TrnaExt_aaType() {
    }

    public TrnaExt_aaType(
           java.lang.String trnaExt_aa_iupacaa,
           java.lang.String trnaExt_aa_ncbieaa,
           java.lang.String trnaExt_aa_ncbi8Aa,
           java.lang.String trnaExt_aa_ncbistdaa) {
           this.trnaExt_aa_iupacaa = trnaExt_aa_iupacaa;
           this.trnaExt_aa_ncbieaa = trnaExt_aa_ncbieaa;
           this.trnaExt_aa_ncbi8Aa = trnaExt_aa_ncbi8Aa;
           this.trnaExt_aa_ncbistdaa = trnaExt_aa_ncbistdaa;
    }


    /**
     * Gets the trnaExt_aa_iupacaa value for this TrnaExt_aaType.
     * 
     * @return trnaExt_aa_iupacaa
     */
    public java.lang.String getTrnaExt_aa_iupacaa() {
        return trnaExt_aa_iupacaa;
    }


    /**
     * Sets the trnaExt_aa_iupacaa value for this TrnaExt_aaType.
     * 
     * @param trnaExt_aa_iupacaa
     */
    public void setTrnaExt_aa_iupacaa(java.lang.String trnaExt_aa_iupacaa) {
        this.trnaExt_aa_iupacaa = trnaExt_aa_iupacaa;
    }


    /**
     * Gets the trnaExt_aa_ncbieaa value for this TrnaExt_aaType.
     * 
     * @return trnaExt_aa_ncbieaa
     */
    public java.lang.String getTrnaExt_aa_ncbieaa() {
        return trnaExt_aa_ncbieaa;
    }


    /**
     * Sets the trnaExt_aa_ncbieaa value for this TrnaExt_aaType.
     * 
     * @param trnaExt_aa_ncbieaa
     */
    public void setTrnaExt_aa_ncbieaa(java.lang.String trnaExt_aa_ncbieaa) {
        this.trnaExt_aa_ncbieaa = trnaExt_aa_ncbieaa;
    }


    /**
     * Gets the trnaExt_aa_ncbi8Aa value for this TrnaExt_aaType.
     * 
     * @return trnaExt_aa_ncbi8Aa
     */
    public java.lang.String getTrnaExt_aa_ncbi8Aa() {
        return trnaExt_aa_ncbi8Aa;
    }


    /**
     * Sets the trnaExt_aa_ncbi8Aa value for this TrnaExt_aaType.
     * 
     * @param trnaExt_aa_ncbi8Aa
     */
    public void setTrnaExt_aa_ncbi8Aa(java.lang.String trnaExt_aa_ncbi8Aa) {
        this.trnaExt_aa_ncbi8Aa = trnaExt_aa_ncbi8Aa;
    }


    /**
     * Gets the trnaExt_aa_ncbistdaa value for this TrnaExt_aaType.
     * 
     * @return trnaExt_aa_ncbistdaa
     */
    public java.lang.String getTrnaExt_aa_ncbistdaa() {
        return trnaExt_aa_ncbistdaa;
    }


    /**
     * Sets the trnaExt_aa_ncbistdaa value for this TrnaExt_aaType.
     * 
     * @param trnaExt_aa_ncbistdaa
     */
    public void setTrnaExt_aa_ncbistdaa(java.lang.String trnaExt_aa_ncbistdaa) {
        this.trnaExt_aa_ncbistdaa = trnaExt_aa_ncbistdaa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrnaExt_aaType)) return false;
        TrnaExt_aaType other = (TrnaExt_aaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.trnaExt_aa_iupacaa==null && other.getTrnaExt_aa_iupacaa()==null) || 
             (this.trnaExt_aa_iupacaa!=null &&
              this.trnaExt_aa_iupacaa.equals(other.getTrnaExt_aa_iupacaa()))) &&
            ((this.trnaExt_aa_ncbieaa==null && other.getTrnaExt_aa_ncbieaa()==null) || 
             (this.trnaExt_aa_ncbieaa!=null &&
              this.trnaExt_aa_ncbieaa.equals(other.getTrnaExt_aa_ncbieaa()))) &&
            ((this.trnaExt_aa_ncbi8Aa==null && other.getTrnaExt_aa_ncbi8Aa()==null) || 
             (this.trnaExt_aa_ncbi8Aa!=null &&
              this.trnaExt_aa_ncbi8Aa.equals(other.getTrnaExt_aa_ncbi8Aa()))) &&
            ((this.trnaExt_aa_ncbistdaa==null && other.getTrnaExt_aa_ncbistdaa()==null) || 
             (this.trnaExt_aa_ncbistdaa!=null &&
              this.trnaExt_aa_ncbistdaa.equals(other.getTrnaExt_aa_ncbistdaa())));
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
        if (getTrnaExt_aa_iupacaa() != null) {
            _hashCode += getTrnaExt_aa_iupacaa().hashCode();
        }
        if (getTrnaExt_aa_ncbieaa() != null) {
            _hashCode += getTrnaExt_aa_ncbieaa().hashCode();
        }
        if (getTrnaExt_aa_ncbi8Aa() != null) {
            _hashCode += getTrnaExt_aa_ncbi8Aa().hashCode();
        }
        if (getTrnaExt_aa_ncbistdaa() != null) {
            _hashCode += getTrnaExt_aa_ncbistdaa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrnaExt_aaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Trna-ext_aaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trnaExt_aa_iupacaa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Trna-ext_aa_iupacaa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trnaExt_aa_ncbieaa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Trna-ext_aa_ncbieaa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trnaExt_aa_ncbi8Aa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Trna-ext_aa_ncbi8aa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trnaExt_aa_ncbistdaa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Trna-ext_aa_ncbistdaa"));
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
