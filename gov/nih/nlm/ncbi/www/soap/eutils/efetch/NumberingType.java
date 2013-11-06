/**
 * NumberingType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class NumberingType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Numbering_contType numbering_cont;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Numbering_enumType numbering_enum;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Numbering_refType numbering_ref;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Numbering_realType numbering_real;

    public NumberingType() {
    }

    public NumberingType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Numbering_contType numbering_cont,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Numbering_enumType numbering_enum,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Numbering_refType numbering_ref,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Numbering_realType numbering_real) {
           this.numbering_cont = numbering_cont;
           this.numbering_enum = numbering_enum;
           this.numbering_ref = numbering_ref;
           this.numbering_real = numbering_real;
    }


    /**
     * Gets the numbering_cont value for this NumberingType.
     * 
     * @return numbering_cont
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Numbering_contType getNumbering_cont() {
        return numbering_cont;
    }


    /**
     * Sets the numbering_cont value for this NumberingType.
     * 
     * @param numbering_cont
     */
    public void setNumbering_cont(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Numbering_contType numbering_cont) {
        this.numbering_cont = numbering_cont;
    }


    /**
     * Gets the numbering_enum value for this NumberingType.
     * 
     * @return numbering_enum
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Numbering_enumType getNumbering_enum() {
        return numbering_enum;
    }


    /**
     * Sets the numbering_enum value for this NumberingType.
     * 
     * @param numbering_enum
     */
    public void setNumbering_enum(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Numbering_enumType numbering_enum) {
        this.numbering_enum = numbering_enum;
    }


    /**
     * Gets the numbering_ref value for this NumberingType.
     * 
     * @return numbering_ref
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Numbering_refType getNumbering_ref() {
        return numbering_ref;
    }


    /**
     * Sets the numbering_ref value for this NumberingType.
     * 
     * @param numbering_ref
     */
    public void setNumbering_ref(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Numbering_refType numbering_ref) {
        this.numbering_ref = numbering_ref;
    }


    /**
     * Gets the numbering_real value for this NumberingType.
     * 
     * @return numbering_real
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Numbering_realType getNumbering_real() {
        return numbering_real;
    }


    /**
     * Sets the numbering_real value for this NumberingType.
     * 
     * @param numbering_real
     */
    public void setNumbering_real(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Numbering_realType numbering_real) {
        this.numbering_real = numbering_real;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NumberingType)) return false;
        NumberingType other = (NumberingType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numbering_cont==null && other.getNumbering_cont()==null) || 
             (this.numbering_cont!=null &&
              this.numbering_cont.equals(other.getNumbering_cont()))) &&
            ((this.numbering_enum==null && other.getNumbering_enum()==null) || 
             (this.numbering_enum!=null &&
              this.numbering_enum.equals(other.getNumbering_enum()))) &&
            ((this.numbering_ref==null && other.getNumbering_ref()==null) || 
             (this.numbering_ref!=null &&
              this.numbering_ref.equals(other.getNumbering_ref()))) &&
            ((this.numbering_real==null && other.getNumbering_real()==null) || 
             (this.numbering_real!=null &&
              this.numbering_real.equals(other.getNumbering_real())));
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
        if (getNumbering_cont() != null) {
            _hashCode += getNumbering_cont().hashCode();
        }
        if (getNumbering_enum() != null) {
            _hashCode += getNumbering_enum().hashCode();
        }
        if (getNumbering_ref() != null) {
            _hashCode += getNumbering_ref().hashCode();
        }
        if (getNumbering_real() != null) {
            _hashCode += getNumbering_real().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NumberingType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NumberingType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numbering_cont");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Numbering_cont"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Numbering_contType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numbering_enum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Numbering_enum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Numbering_enumType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numbering_ref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Numbering_ref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Numbering_refType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numbering_real");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Numbering_real"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Numbering_realType"));
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
