/**
 * PrintFormType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PrintFormType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_blockType printForm_block;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_booleanType printForm_boolean;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_enumType printForm_enum;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_textType printForm_text;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_useTemplateType printForm_useTemplate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_userType printForm_user;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_null printForm_null;

    public PrintFormType() {
    }

    public PrintFormType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_blockType printForm_block,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_booleanType printForm_boolean,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_enumType printForm_enum,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_textType printForm_text,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_useTemplateType printForm_useTemplate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_userType printForm_user,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_null printForm_null) {
           this.printForm_block = printForm_block;
           this.printForm_boolean = printForm_boolean;
           this.printForm_enum = printForm_enum;
           this.printForm_text = printForm_text;
           this.printForm_useTemplate = printForm_useTemplate;
           this.printForm_user = printForm_user;
           this.printForm_null = printForm_null;
    }


    /**
     * Gets the printForm_block value for this PrintFormType.
     * 
     * @return printForm_block
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_blockType getPrintForm_block() {
        return printForm_block;
    }


    /**
     * Sets the printForm_block value for this PrintFormType.
     * 
     * @param printForm_block
     */
    public void setPrintForm_block(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_blockType printForm_block) {
        this.printForm_block = printForm_block;
    }


    /**
     * Gets the printForm_boolean value for this PrintFormType.
     * 
     * @return printForm_boolean
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_booleanType getPrintForm_boolean() {
        return printForm_boolean;
    }


    /**
     * Sets the printForm_boolean value for this PrintFormType.
     * 
     * @param printForm_boolean
     */
    public void setPrintForm_boolean(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_booleanType printForm_boolean) {
        this.printForm_boolean = printForm_boolean;
    }


    /**
     * Gets the printForm_enum value for this PrintFormType.
     * 
     * @return printForm_enum
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_enumType getPrintForm_enum() {
        return printForm_enum;
    }


    /**
     * Sets the printForm_enum value for this PrintFormType.
     * 
     * @param printForm_enum
     */
    public void setPrintForm_enum(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_enumType printForm_enum) {
        this.printForm_enum = printForm_enum;
    }


    /**
     * Gets the printForm_text value for this PrintFormType.
     * 
     * @return printForm_text
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_textType getPrintForm_text() {
        return printForm_text;
    }


    /**
     * Sets the printForm_text value for this PrintFormType.
     * 
     * @param printForm_text
     */
    public void setPrintForm_text(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_textType printForm_text) {
        this.printForm_text = printForm_text;
    }


    /**
     * Gets the printForm_useTemplate value for this PrintFormType.
     * 
     * @return printForm_useTemplate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_useTemplateType getPrintForm_useTemplate() {
        return printForm_useTemplate;
    }


    /**
     * Sets the printForm_useTemplate value for this PrintFormType.
     * 
     * @param printForm_useTemplate
     */
    public void setPrintForm_useTemplate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_useTemplateType printForm_useTemplate) {
        this.printForm_useTemplate = printForm_useTemplate;
    }


    /**
     * Gets the printForm_user value for this PrintFormType.
     * 
     * @return printForm_user
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_userType getPrintForm_user() {
        return printForm_user;
    }


    /**
     * Sets the printForm_user value for this PrintFormType.
     * 
     * @param printForm_user
     */
    public void setPrintForm_user(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_userType printForm_user) {
        this.printForm_user = printForm_user;
    }


    /**
     * Gets the printForm_null value for this PrintFormType.
     * 
     * @return printForm_null
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_null getPrintForm_null() {
        return printForm_null;
    }


    /**
     * Sets the printForm_null value for this PrintFormType.
     * 
     * @param printForm_null
     */
    public void setPrintForm_null(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintForm_null printForm_null) {
        this.printForm_null = printForm_null;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrintFormType)) return false;
        PrintFormType other = (PrintFormType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.printForm_block==null && other.getPrintForm_block()==null) || 
             (this.printForm_block!=null &&
              this.printForm_block.equals(other.getPrintForm_block()))) &&
            ((this.printForm_boolean==null && other.getPrintForm_boolean()==null) || 
             (this.printForm_boolean!=null &&
              this.printForm_boolean.equals(other.getPrintForm_boolean()))) &&
            ((this.printForm_enum==null && other.getPrintForm_enum()==null) || 
             (this.printForm_enum!=null &&
              this.printForm_enum.equals(other.getPrintForm_enum()))) &&
            ((this.printForm_text==null && other.getPrintForm_text()==null) || 
             (this.printForm_text!=null &&
              this.printForm_text.equals(other.getPrintForm_text()))) &&
            ((this.printForm_useTemplate==null && other.getPrintForm_useTemplate()==null) || 
             (this.printForm_useTemplate!=null &&
              this.printForm_useTemplate.equals(other.getPrintForm_useTemplate()))) &&
            ((this.printForm_user==null && other.getPrintForm_user()==null) || 
             (this.printForm_user!=null &&
              this.printForm_user.equals(other.getPrintForm_user()))) &&
            ((this.printForm_null==null && other.getPrintForm_null()==null) || 
             (this.printForm_null!=null &&
              this.printForm_null.equals(other.getPrintForm_null())));
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
        if (getPrintForm_block() != null) {
            _hashCode += getPrintForm_block().hashCode();
        }
        if (getPrintForm_boolean() != null) {
            _hashCode += getPrintForm_boolean().hashCode();
        }
        if (getPrintForm_enum() != null) {
            _hashCode += getPrintForm_enum().hashCode();
        }
        if (getPrintForm_text() != null) {
            _hashCode += getPrintForm_text().hashCode();
        }
        if (getPrintForm_useTemplate() != null) {
            _hashCode += getPrintForm_useTemplate().hashCode();
        }
        if (getPrintForm_user() != null) {
            _hashCode += getPrintForm_user().hashCode();
        }
        if (getPrintForm_null() != null) {
            _hashCode += getPrintForm_null().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrintFormType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintFormType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printForm_block");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintForm_block"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintForm_blockType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printForm_boolean");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintForm_boolean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintForm_booleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printForm_enum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintForm_enum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintForm_enumType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printForm_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintForm_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintForm_textType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printForm_useTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintForm_use-template"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintForm_use-templateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printForm_user");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintForm_user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintForm_userType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printForm_null");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintForm_null"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">PrintForm_null"));
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
