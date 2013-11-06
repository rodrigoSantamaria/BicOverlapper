/**
 * FormatRpsDbParametersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class FormatRpsDbParametersType  implements java.io.Serializable {
    private java.lang.String formatRpsDbParameters_matrixName;

    private java.lang.String formatRpsDbParameters_gapOpen;

    private java.lang.String formatRpsDbParameters_gapExtend;

    public FormatRpsDbParametersType() {
    }

    public FormatRpsDbParametersType(
           java.lang.String formatRpsDbParameters_matrixName,
           java.lang.String formatRpsDbParameters_gapOpen,
           java.lang.String formatRpsDbParameters_gapExtend) {
           this.formatRpsDbParameters_matrixName = formatRpsDbParameters_matrixName;
           this.formatRpsDbParameters_gapOpen = formatRpsDbParameters_gapOpen;
           this.formatRpsDbParameters_gapExtend = formatRpsDbParameters_gapExtend;
    }


    /**
     * Gets the formatRpsDbParameters_matrixName value for this FormatRpsDbParametersType.
     * 
     * @return formatRpsDbParameters_matrixName
     */
    public java.lang.String getFormatRpsDbParameters_matrixName() {
        return formatRpsDbParameters_matrixName;
    }


    /**
     * Sets the formatRpsDbParameters_matrixName value for this FormatRpsDbParametersType.
     * 
     * @param formatRpsDbParameters_matrixName
     */
    public void setFormatRpsDbParameters_matrixName(java.lang.String formatRpsDbParameters_matrixName) {
        this.formatRpsDbParameters_matrixName = formatRpsDbParameters_matrixName;
    }


    /**
     * Gets the formatRpsDbParameters_gapOpen value for this FormatRpsDbParametersType.
     * 
     * @return formatRpsDbParameters_gapOpen
     */
    public java.lang.String getFormatRpsDbParameters_gapOpen() {
        return formatRpsDbParameters_gapOpen;
    }


    /**
     * Sets the formatRpsDbParameters_gapOpen value for this FormatRpsDbParametersType.
     * 
     * @param formatRpsDbParameters_gapOpen
     */
    public void setFormatRpsDbParameters_gapOpen(java.lang.String formatRpsDbParameters_gapOpen) {
        this.formatRpsDbParameters_gapOpen = formatRpsDbParameters_gapOpen;
    }


    /**
     * Gets the formatRpsDbParameters_gapExtend value for this FormatRpsDbParametersType.
     * 
     * @return formatRpsDbParameters_gapExtend
     */
    public java.lang.String getFormatRpsDbParameters_gapExtend() {
        return formatRpsDbParameters_gapExtend;
    }


    /**
     * Sets the formatRpsDbParameters_gapExtend value for this FormatRpsDbParametersType.
     * 
     * @param formatRpsDbParameters_gapExtend
     */
    public void setFormatRpsDbParameters_gapExtend(java.lang.String formatRpsDbParameters_gapExtend) {
        this.formatRpsDbParameters_gapExtend = formatRpsDbParameters_gapExtend;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FormatRpsDbParametersType)) return false;
        FormatRpsDbParametersType other = (FormatRpsDbParametersType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.formatRpsDbParameters_matrixName==null && other.getFormatRpsDbParameters_matrixName()==null) || 
             (this.formatRpsDbParameters_matrixName!=null &&
              this.formatRpsDbParameters_matrixName.equals(other.getFormatRpsDbParameters_matrixName()))) &&
            ((this.formatRpsDbParameters_gapOpen==null && other.getFormatRpsDbParameters_gapOpen()==null) || 
             (this.formatRpsDbParameters_gapOpen!=null &&
              this.formatRpsDbParameters_gapOpen.equals(other.getFormatRpsDbParameters_gapOpen()))) &&
            ((this.formatRpsDbParameters_gapExtend==null && other.getFormatRpsDbParameters_gapExtend()==null) || 
             (this.formatRpsDbParameters_gapExtend!=null &&
              this.formatRpsDbParameters_gapExtend.equals(other.getFormatRpsDbParameters_gapExtend())));
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
        if (getFormatRpsDbParameters_matrixName() != null) {
            _hashCode += getFormatRpsDbParameters_matrixName().hashCode();
        }
        if (getFormatRpsDbParameters_gapOpen() != null) {
            _hashCode += getFormatRpsDbParameters_gapOpen().hashCode();
        }
        if (getFormatRpsDbParameters_gapExtend() != null) {
            _hashCode += getFormatRpsDbParameters_gapExtend().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FormatRpsDbParametersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FormatRpsDbParametersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatRpsDbParameters_matrixName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FormatRpsDbParameters_matrixName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatRpsDbParameters_gapOpen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FormatRpsDbParameters_gapOpen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatRpsDbParameters_gapExtend");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FormatRpsDbParameters_gapExtend"));
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
