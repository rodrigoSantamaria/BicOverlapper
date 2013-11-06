/**
 * PrintTemplateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PrintTemplateType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintTemplate_nameType printTemplate_name;

    private java.lang.String printTemplate_labelfrom;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintTemplate_formatType printTemplate_format;

    public PrintTemplateType() {
    }

    public PrintTemplateType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintTemplate_nameType printTemplate_name,
           java.lang.String printTemplate_labelfrom,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintTemplate_formatType printTemplate_format) {
           this.printTemplate_name = printTemplate_name;
           this.printTemplate_labelfrom = printTemplate_labelfrom;
           this.printTemplate_format = printTemplate_format;
    }


    /**
     * Gets the printTemplate_name value for this PrintTemplateType.
     * 
     * @return printTemplate_name
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintTemplate_nameType getPrintTemplate_name() {
        return printTemplate_name;
    }


    /**
     * Sets the printTemplate_name value for this PrintTemplateType.
     * 
     * @param printTemplate_name
     */
    public void setPrintTemplate_name(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintTemplate_nameType printTemplate_name) {
        this.printTemplate_name = printTemplate_name;
    }


    /**
     * Gets the printTemplate_labelfrom value for this PrintTemplateType.
     * 
     * @return printTemplate_labelfrom
     */
    public java.lang.String getPrintTemplate_labelfrom() {
        return printTemplate_labelfrom;
    }


    /**
     * Sets the printTemplate_labelfrom value for this PrintTemplateType.
     * 
     * @param printTemplate_labelfrom
     */
    public void setPrintTemplate_labelfrom(java.lang.String printTemplate_labelfrom) {
        this.printTemplate_labelfrom = printTemplate_labelfrom;
    }


    /**
     * Gets the printTemplate_format value for this PrintTemplateType.
     * 
     * @return printTemplate_format
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintTemplate_formatType getPrintTemplate_format() {
        return printTemplate_format;
    }


    /**
     * Sets the printTemplate_format value for this PrintTemplateType.
     * 
     * @param printTemplate_format
     */
    public void setPrintTemplate_format(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PrintTemplate_formatType printTemplate_format) {
        this.printTemplate_format = printTemplate_format;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrintTemplateType)) return false;
        PrintTemplateType other = (PrintTemplateType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.printTemplate_name==null && other.getPrintTemplate_name()==null) || 
             (this.printTemplate_name!=null &&
              this.printTemplate_name.equals(other.getPrintTemplate_name()))) &&
            ((this.printTemplate_labelfrom==null && other.getPrintTemplate_labelfrom()==null) || 
             (this.printTemplate_labelfrom!=null &&
              this.printTemplate_labelfrom.equals(other.getPrintTemplate_labelfrom()))) &&
            ((this.printTemplate_format==null && other.getPrintTemplate_format()==null) || 
             (this.printTemplate_format!=null &&
              this.printTemplate_format.equals(other.getPrintTemplate_format())));
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
        if (getPrintTemplate_name() != null) {
            _hashCode += getPrintTemplate_name().hashCode();
        }
        if (getPrintTemplate_labelfrom() != null) {
            _hashCode += getPrintTemplate_labelfrom().hashCode();
        }
        if (getPrintTemplate_format() != null) {
            _hashCode += getPrintTemplate_format().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrintTemplateType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintTemplateType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printTemplate_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintTemplate_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintTemplate_nameType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printTemplate_labelfrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintTemplate_labelfrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printTemplate_format");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintTemplate_format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PrintTemplate_formatType"));
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
