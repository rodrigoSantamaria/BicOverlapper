/**
 * Taxon1DataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Taxon1DataType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Data_orgType taxon1Data_org;

    private java.lang.String taxon1Data_div;

    private java.lang.String taxon1Data_emblCode;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Data_isSpeciesLevelType taxon1Data_isSpeciesLevel;

    public Taxon1DataType() {
    }

    public Taxon1DataType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Data_orgType taxon1Data_org,
           java.lang.String taxon1Data_div,
           java.lang.String taxon1Data_emblCode,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Data_isSpeciesLevelType taxon1Data_isSpeciesLevel) {
           this.taxon1Data_org = taxon1Data_org;
           this.taxon1Data_div = taxon1Data_div;
           this.taxon1Data_emblCode = taxon1Data_emblCode;
           this.taxon1Data_isSpeciesLevel = taxon1Data_isSpeciesLevel;
    }


    /**
     * Gets the taxon1Data_org value for this Taxon1DataType.
     * 
     * @return taxon1Data_org
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Data_orgType getTaxon1Data_org() {
        return taxon1Data_org;
    }


    /**
     * Sets the taxon1Data_org value for this Taxon1DataType.
     * 
     * @param taxon1Data_org
     */
    public void setTaxon1Data_org(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Data_orgType taxon1Data_org) {
        this.taxon1Data_org = taxon1Data_org;
    }


    /**
     * Gets the taxon1Data_div value for this Taxon1DataType.
     * 
     * @return taxon1Data_div
     */
    public java.lang.String getTaxon1Data_div() {
        return taxon1Data_div;
    }


    /**
     * Sets the taxon1Data_div value for this Taxon1DataType.
     * 
     * @param taxon1Data_div
     */
    public void setTaxon1Data_div(java.lang.String taxon1Data_div) {
        this.taxon1Data_div = taxon1Data_div;
    }


    /**
     * Gets the taxon1Data_emblCode value for this Taxon1DataType.
     * 
     * @return taxon1Data_emblCode
     */
    public java.lang.String getTaxon1Data_emblCode() {
        return taxon1Data_emblCode;
    }


    /**
     * Sets the taxon1Data_emblCode value for this Taxon1DataType.
     * 
     * @param taxon1Data_emblCode
     */
    public void setTaxon1Data_emblCode(java.lang.String taxon1Data_emblCode) {
        this.taxon1Data_emblCode = taxon1Data_emblCode;
    }


    /**
     * Gets the taxon1Data_isSpeciesLevel value for this Taxon1DataType.
     * 
     * @return taxon1Data_isSpeciesLevel
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Data_isSpeciesLevelType getTaxon1Data_isSpeciesLevel() {
        return taxon1Data_isSpeciesLevel;
    }


    /**
     * Sets the taxon1Data_isSpeciesLevel value for this Taxon1DataType.
     * 
     * @param taxon1Data_isSpeciesLevel
     */
    public void setTaxon1Data_isSpeciesLevel(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Data_isSpeciesLevelType taxon1Data_isSpeciesLevel) {
        this.taxon1Data_isSpeciesLevel = taxon1Data_isSpeciesLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Taxon1DataType)) return false;
        Taxon1DataType other = (Taxon1DataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxon1Data_org==null && other.getTaxon1Data_org()==null) || 
             (this.taxon1Data_org!=null &&
              this.taxon1Data_org.equals(other.getTaxon1Data_org()))) &&
            ((this.taxon1Data_div==null && other.getTaxon1Data_div()==null) || 
             (this.taxon1Data_div!=null &&
              this.taxon1Data_div.equals(other.getTaxon1Data_div()))) &&
            ((this.taxon1Data_emblCode==null && other.getTaxon1Data_emblCode()==null) || 
             (this.taxon1Data_emblCode!=null &&
              this.taxon1Data_emblCode.equals(other.getTaxon1Data_emblCode()))) &&
            ((this.taxon1Data_isSpeciesLevel==null && other.getTaxon1Data_isSpeciesLevel()==null) || 
             (this.taxon1Data_isSpeciesLevel!=null &&
              this.taxon1Data_isSpeciesLevel.equals(other.getTaxon1Data_isSpeciesLevel())));
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
        if (getTaxon1Data_org() != null) {
            _hashCode += getTaxon1Data_org().hashCode();
        }
        if (getTaxon1Data_div() != null) {
            _hashCode += getTaxon1Data_div().hashCode();
        }
        if (getTaxon1Data_emblCode() != null) {
            _hashCode += getTaxon1Data_emblCode().hashCode();
        }
        if (getTaxon1Data_isSpeciesLevel() != null) {
            _hashCode += getTaxon1Data_isSpeciesLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Taxon1DataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-dataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Data_org");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-data_org"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-data_orgType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Data_div");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-data_div"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Data_emblCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-data_embl-code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Data_isSpeciesLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-data_is-species-level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-data_is-species-levelType"));
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
