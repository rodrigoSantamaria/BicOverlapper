/**
 * PrintFormatType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PrintFormatType  implements java.io.Serializable {
    private java.lang.String printFormat_asn1;

    private java.lang.String printFormat_label;

    private java.lang.String printFormat_prefix;

    private java.lang.String printFormat_suffix;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintFormat_formType printFormat_form;

    public PrintFormatType() {
    }

    public PrintFormatType(
           java.lang.String printFormat_asn1,
           java.lang.String printFormat_label,
           java.lang.String printFormat_prefix,
           java.lang.String printFormat_suffix,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintFormat_formType printFormat_form) {
           this.printFormat_asn1 = printFormat_asn1;
           this.printFormat_label = printFormat_label;
           this.printFormat_prefix = printFormat_prefix;
           this.printFormat_suffix = printFormat_suffix;
           this.printFormat_form = printFormat_form;
    }


    /**
     * Gets the printFormat_asn1 value for this PrintFormatType.
     * 
     * @return printFormat_asn1
     */
    public java.lang.String getPrintFormat_asn1() {
        return printFormat_asn1;
    }


    /**
     * Sets the printFormat_asn1 value for this PrintFormatType.
     * 
     * @param printFormat_asn1
     */
    public void setPrintFormat_asn1(java.lang.String printFormat_asn1) {
        this.printFormat_asn1 = printFormat_asn1;
    }


    /**
     * Gets the printFormat_label value for this PrintFormatType.
     * 
     * @return printFormat_label
     */
    public java.lang.String getPrintFormat_label() {
        return printFormat_label;
    }


    /**
     * Sets the printFormat_label value for this PrintFormatType.
     * 
     * @param printFormat_label
     */
    public void setPrintFormat_label(java.lang.String printFormat_label) {
        this.printFormat_label = printFormat_label;
    }


    /**
     * Gets the printFormat_prefix value for this PrintFormatType.
     * 
     * @return printFormat_prefix
     */
    public java.lang.String getPrintFormat_prefix() {
        return printFormat_prefix;
    }


    /**
     * Sets the printFormat_prefix value for this PrintFormatType.
     * 
     * @param printFormat_prefix
     */
    public void setPrintFormat_prefix(java.lang.String printFormat_prefix) {
        this.printFormat_prefix = printFormat_prefix;
    }


    /**
     * Gets the printFormat_suffix value for this PrintFormatType.
     * 
     * @return printFormat_suffix
     */
    public java.lang.String getPrintFormat_suffix() {
        return printFormat_suffix;
    }


    /**
     * Sets the printFormat_suffix value for this PrintFormatType.
     * 
     * @param printFormat_suffix
     */
    public void setPrintFormat_suffix(java.lang.String printFormat_suffix) {
        this.printFormat_suffix = printFormat_suffix;
    }


    /**
     * Gets the printFormat_form value for this PrintFormatType.
     * 
     * @return printFormat_form
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintFormat_formType getPrintFormat_form() {
        return printFormat_form;
    }


    /**
     * Sets the printFormat_form value for this PrintFormatType.
     * 
     * @param printFormat_form
     */
    public void setPrintFormat_form(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintFormat_formType printFormat_form) {
        this.printFormat_form = printFormat_form;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrintFormatType)) return false;
        PrintFormatType other = (PrintFormatType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.printFormat_asn1==null && other.getPrintFormat_asn1()==null) || 
             (this.printFormat_asn1!=null &&
              this.printFormat_asn1.equals(other.getPrintFormat_asn1()))) &&
            ((this.printFormat_label==null && other.getPrintFormat_label()==null) || 
             (this.printFormat_label!=null &&
              this.printFormat_label.equals(other.getPrintFormat_label()))) &&
            ((this.printFormat_prefix==null && other.getPrintFormat_prefix()==null) || 
             (this.printFormat_prefix!=null &&
              this.printFormat_prefix.equals(other.getPrintFormat_prefix()))) &&
            ((this.printFormat_suffix==null && other.getPrintFormat_suffix()==null) || 
             (this.printFormat_suffix!=null &&
              this.printFormat_suffix.equals(other.getPrintFormat_suffix()))) &&
            ((this.printFormat_form==null && other.getPrintFormat_form()==null) || 
             (this.printFormat_form!=null &&
              this.printFormat_form.equals(other.getPrintFormat_form())));
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
        if (getPrintFormat_asn1() != null) {
            _hashCode += getPrintFormat_asn1().hashCode();
        }
        if (getPrintFormat_label() != null) {
            _hashCode += getPrintFormat_label().hashCode();
        }
        if (getPrintFormat_prefix() != null) {
            _hashCode += getPrintFormat_prefix().hashCode();
        }
        if (getPrintFormat_suffix() != null) {
            _hashCode += getPrintFormat_suffix().hashCode();
        }
        if (getPrintFormat_form() != null) {
            _hashCode += getPrintFormat_form().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrintFormatType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormatType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printFormat_asn1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormat_asn1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printFormat_label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormat_label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printFormat_prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormat_prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printFormat_suffix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormat_suffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printFormat_form");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormat_form"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormat_formType"));
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
