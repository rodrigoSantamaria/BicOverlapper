/**
 * CodeBreakType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CodeBreakType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CodeBreak_locType codeBreak_loc;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CodeBreak_aaType codeBreak_aa;

    public CodeBreakType() {
    }

    public CodeBreakType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CodeBreak_locType codeBreak_loc,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CodeBreak_aaType codeBreak_aa) {
           this.codeBreak_loc = codeBreak_loc;
           this.codeBreak_aa = codeBreak_aa;
    }


    /**
     * Gets the codeBreak_loc value for this CodeBreakType.
     * 
     * @return codeBreak_loc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CodeBreak_locType getCodeBreak_loc() {
        return codeBreak_loc;
    }


    /**
     * Sets the codeBreak_loc value for this CodeBreakType.
     * 
     * @param codeBreak_loc
     */
    public void setCodeBreak_loc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CodeBreak_locType codeBreak_loc) {
        this.codeBreak_loc = codeBreak_loc;
    }


    /**
     * Gets the codeBreak_aa value for this CodeBreakType.
     * 
     * @return codeBreak_aa
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CodeBreak_aaType getCodeBreak_aa() {
        return codeBreak_aa;
    }


    /**
     * Sets the codeBreak_aa value for this CodeBreakType.
     * 
     * @param codeBreak_aa
     */
    public void setCodeBreak_aa(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CodeBreak_aaType codeBreak_aa) {
        this.codeBreak_aa = codeBreak_aa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodeBreakType)) return false;
        CodeBreakType other = (CodeBreakType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codeBreak_loc==null && other.getCodeBreak_loc()==null) || 
             (this.codeBreak_loc!=null &&
              this.codeBreak_loc.equals(other.getCodeBreak_loc()))) &&
            ((this.codeBreak_aa==null && other.getCodeBreak_aa()==null) || 
             (this.codeBreak_aa!=null &&
              this.codeBreak_aa.equals(other.getCodeBreak_aa())));
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
        if (getCodeBreak_loc() != null) {
            _hashCode += getCodeBreak_loc().hashCode();
        }
        if (getCodeBreak_aa() != null) {
            _hashCode += getCodeBreak_aa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CodeBreakType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Code-breakType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeBreak_loc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Code-break_loc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Code-break_locType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeBreak_aa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Code-break_aa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Code-break_aaType"));
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
