/**
 * PCAnnotatedXRefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCAnnotatedXRefType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAnnotatedXRef_xrefType PCAnnotatedXRef_xref;

    private java.lang.String PCAnnotatedXRef_comment;

    public PCAnnotatedXRefType() {
    }

    public PCAnnotatedXRefType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAnnotatedXRef_xrefType PCAnnotatedXRef_xref,
           java.lang.String PCAnnotatedXRef_comment) {
           this.PCAnnotatedXRef_xref = PCAnnotatedXRef_xref;
           this.PCAnnotatedXRef_comment = PCAnnotatedXRef_comment;
    }


    /**
     * Gets the PCAnnotatedXRef_xref value for this PCAnnotatedXRefType.
     * 
     * @return PCAnnotatedXRef_xref
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAnnotatedXRef_xrefType getPCAnnotatedXRef_xref() {
        return PCAnnotatedXRef_xref;
    }


    /**
     * Sets the PCAnnotatedXRef_xref value for this PCAnnotatedXRefType.
     * 
     * @param PCAnnotatedXRef_xref
     */
    public void setPCAnnotatedXRef_xref(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCAnnotatedXRef_xrefType PCAnnotatedXRef_xref) {
        this.PCAnnotatedXRef_xref = PCAnnotatedXRef_xref;
    }


    /**
     * Gets the PCAnnotatedXRef_comment value for this PCAnnotatedXRefType.
     * 
     * @return PCAnnotatedXRef_comment
     */
    public java.lang.String getPCAnnotatedXRef_comment() {
        return PCAnnotatedXRef_comment;
    }


    /**
     * Sets the PCAnnotatedXRef_comment value for this PCAnnotatedXRefType.
     * 
     * @param PCAnnotatedXRef_comment
     */
    public void setPCAnnotatedXRef_comment(java.lang.String PCAnnotatedXRef_comment) {
        this.PCAnnotatedXRef_comment = PCAnnotatedXRef_comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCAnnotatedXRefType)) return false;
        PCAnnotatedXRefType other = (PCAnnotatedXRefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCAnnotatedXRef_xref==null && other.getPCAnnotatedXRef_xref()==null) || 
             (this.PCAnnotatedXRef_xref!=null &&
              this.PCAnnotatedXRef_xref.equals(other.getPCAnnotatedXRef_xref()))) &&
            ((this.PCAnnotatedXRef_comment==null && other.getPCAnnotatedXRef_comment()==null) || 
             (this.PCAnnotatedXRef_comment!=null &&
              this.PCAnnotatedXRef_comment.equals(other.getPCAnnotatedXRef_comment())));
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
        if (getPCAnnotatedXRef_xref() != null) {
            _hashCode += getPCAnnotatedXRef_xref().hashCode();
        }
        if (getPCAnnotatedXRef_comment() != null) {
            _hashCode += getPCAnnotatedXRef_comment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCAnnotatedXRefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AnnotatedXRefType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAnnotatedXRef_xref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AnnotatedXRef_xref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AnnotatedXRef_xrefType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCAnnotatedXRef_comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AnnotatedXRef_comment"));
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
