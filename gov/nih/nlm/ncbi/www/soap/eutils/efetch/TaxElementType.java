/**
 * TaxElementType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TaxElementType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TaxElement_fixedLevelType taxElement_fixedLevel;

    private java.lang.String taxElement_level;

    private java.lang.String taxElement_name;

    public TaxElementType() {
    }

    public TaxElementType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TaxElement_fixedLevelType taxElement_fixedLevel,
           java.lang.String taxElement_level,
           java.lang.String taxElement_name) {
           this.taxElement_fixedLevel = taxElement_fixedLevel;
           this.taxElement_level = taxElement_level;
           this.taxElement_name = taxElement_name;
    }


    /**
     * Gets the taxElement_fixedLevel value for this TaxElementType.
     * 
     * @return taxElement_fixedLevel
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TaxElement_fixedLevelType getTaxElement_fixedLevel() {
        return taxElement_fixedLevel;
    }


    /**
     * Sets the taxElement_fixedLevel value for this TaxElementType.
     * 
     * @param taxElement_fixedLevel
     */
    public void setTaxElement_fixedLevel(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TaxElement_fixedLevelType taxElement_fixedLevel) {
        this.taxElement_fixedLevel = taxElement_fixedLevel;
    }


    /**
     * Gets the taxElement_level value for this TaxElementType.
     * 
     * @return taxElement_level
     */
    public java.lang.String getTaxElement_level() {
        return taxElement_level;
    }


    /**
     * Sets the taxElement_level value for this TaxElementType.
     * 
     * @param taxElement_level
     */
    public void setTaxElement_level(java.lang.String taxElement_level) {
        this.taxElement_level = taxElement_level;
    }


    /**
     * Gets the taxElement_name value for this TaxElementType.
     * 
     * @return taxElement_name
     */
    public java.lang.String getTaxElement_name() {
        return taxElement_name;
    }


    /**
     * Sets the taxElement_name value for this TaxElementType.
     * 
     * @param taxElement_name
     */
    public void setTaxElement_name(java.lang.String taxElement_name) {
        this.taxElement_name = taxElement_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxElementType)) return false;
        TaxElementType other = (TaxElementType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxElement_fixedLevel==null && other.getTaxElement_fixedLevel()==null) || 
             (this.taxElement_fixedLevel!=null &&
              this.taxElement_fixedLevel.equals(other.getTaxElement_fixedLevel()))) &&
            ((this.taxElement_level==null && other.getTaxElement_level()==null) || 
             (this.taxElement_level!=null &&
              this.taxElement_level.equals(other.getTaxElement_level()))) &&
            ((this.taxElement_name==null && other.getTaxElement_name()==null) || 
             (this.taxElement_name!=null &&
              this.taxElement_name.equals(other.getTaxElement_name())));
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
        if (getTaxElement_fixedLevel() != null) {
            _hashCode += getTaxElement_fixedLevel().hashCode();
        }
        if (getTaxElement_level() != null) {
            _hashCode += getTaxElement_level().hashCode();
        }
        if (getTaxElement_name() != null) {
            _hashCode += getTaxElement_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxElementType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TaxElementType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxElement_fixedLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TaxElement_fixed-level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TaxElement_fixed-levelType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxElement_level");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TaxElement_level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxElement_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TaxElement_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
