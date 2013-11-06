/**
 * CodeBreak_aaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CodeBreak_aaType  implements java.io.Serializable {
    private java.lang.String codeBreak_aa_ncbieaa;

    private java.lang.String codeBreak_aa_ncbi8Aa;

    private java.lang.String codeBreak_aa_ncbistdaa;

    public CodeBreak_aaType() {
    }

    public CodeBreak_aaType(
           java.lang.String codeBreak_aa_ncbieaa,
           java.lang.String codeBreak_aa_ncbi8Aa,
           java.lang.String codeBreak_aa_ncbistdaa) {
           this.codeBreak_aa_ncbieaa = codeBreak_aa_ncbieaa;
           this.codeBreak_aa_ncbi8Aa = codeBreak_aa_ncbi8Aa;
           this.codeBreak_aa_ncbistdaa = codeBreak_aa_ncbistdaa;
    }


    /**
     * Gets the codeBreak_aa_ncbieaa value for this CodeBreak_aaType.
     * 
     * @return codeBreak_aa_ncbieaa
     */
    public java.lang.String getCodeBreak_aa_ncbieaa() {
        return codeBreak_aa_ncbieaa;
    }


    /**
     * Sets the codeBreak_aa_ncbieaa value for this CodeBreak_aaType.
     * 
     * @param codeBreak_aa_ncbieaa
     */
    public void setCodeBreak_aa_ncbieaa(java.lang.String codeBreak_aa_ncbieaa) {
        this.codeBreak_aa_ncbieaa = codeBreak_aa_ncbieaa;
    }


    /**
     * Gets the codeBreak_aa_ncbi8Aa value for this CodeBreak_aaType.
     * 
     * @return codeBreak_aa_ncbi8Aa
     */
    public java.lang.String getCodeBreak_aa_ncbi8Aa() {
        return codeBreak_aa_ncbi8Aa;
    }


    /**
     * Sets the codeBreak_aa_ncbi8Aa value for this CodeBreak_aaType.
     * 
     * @param codeBreak_aa_ncbi8Aa
     */
    public void setCodeBreak_aa_ncbi8Aa(java.lang.String codeBreak_aa_ncbi8Aa) {
        this.codeBreak_aa_ncbi8Aa = codeBreak_aa_ncbi8Aa;
    }


    /**
     * Gets the codeBreak_aa_ncbistdaa value for this CodeBreak_aaType.
     * 
     * @return codeBreak_aa_ncbistdaa
     */
    public java.lang.String getCodeBreak_aa_ncbistdaa() {
        return codeBreak_aa_ncbistdaa;
    }


    /**
     * Sets the codeBreak_aa_ncbistdaa value for this CodeBreak_aaType.
     * 
     * @param codeBreak_aa_ncbistdaa
     */
    public void setCodeBreak_aa_ncbistdaa(java.lang.String codeBreak_aa_ncbistdaa) {
        this.codeBreak_aa_ncbistdaa = codeBreak_aa_ncbistdaa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodeBreak_aaType)) return false;
        CodeBreak_aaType other = (CodeBreak_aaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codeBreak_aa_ncbieaa==null && other.getCodeBreak_aa_ncbieaa()==null) || 
             (this.codeBreak_aa_ncbieaa!=null &&
              this.codeBreak_aa_ncbieaa.equals(other.getCodeBreak_aa_ncbieaa()))) &&
            ((this.codeBreak_aa_ncbi8Aa==null && other.getCodeBreak_aa_ncbi8Aa()==null) || 
             (this.codeBreak_aa_ncbi8Aa!=null &&
              this.codeBreak_aa_ncbi8Aa.equals(other.getCodeBreak_aa_ncbi8Aa()))) &&
            ((this.codeBreak_aa_ncbistdaa==null && other.getCodeBreak_aa_ncbistdaa()==null) || 
             (this.codeBreak_aa_ncbistdaa!=null &&
              this.codeBreak_aa_ncbistdaa.equals(other.getCodeBreak_aa_ncbistdaa())));
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
        if (getCodeBreak_aa_ncbieaa() != null) {
            _hashCode += getCodeBreak_aa_ncbieaa().hashCode();
        }
        if (getCodeBreak_aa_ncbi8Aa() != null) {
            _hashCode += getCodeBreak_aa_ncbi8Aa().hashCode();
        }
        if (getCodeBreak_aa_ncbistdaa() != null) {
            _hashCode += getCodeBreak_aa_ncbistdaa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CodeBreak_aaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Code-break_aaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeBreak_aa_ncbieaa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Code-break_aa_ncbieaa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeBreak_aa_ncbi8Aa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Code-break_aa_ncbi8aa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeBreak_aa_ncbistdaa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Code-break_aa_ncbistdaa"));
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
