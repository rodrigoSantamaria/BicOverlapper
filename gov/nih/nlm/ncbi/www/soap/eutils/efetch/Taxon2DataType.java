/**
 * Taxon2DataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Taxon2DataType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon2Data_orgType taxon2Data_org;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon2Data_blastNameType taxon2Data_blastName;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon2Data_isUnculturedType taxon2Data_isUncultured;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon2Data_isSpeciesLevelType taxon2Data_isSpeciesLevel;

    public Taxon2DataType() {
    }

    public Taxon2DataType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon2Data_orgType taxon2Data_org,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon2Data_blastNameType taxon2Data_blastName,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon2Data_isUnculturedType taxon2Data_isUncultured,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon2Data_isSpeciesLevelType taxon2Data_isSpeciesLevel) {
           this.taxon2Data_org = taxon2Data_org;
           this.taxon2Data_blastName = taxon2Data_blastName;
           this.taxon2Data_isUncultured = taxon2Data_isUncultured;
           this.taxon2Data_isSpeciesLevel = taxon2Data_isSpeciesLevel;
    }


    /**
     * Gets the taxon2Data_org value for this Taxon2DataType.
     * 
     * @return taxon2Data_org
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon2Data_orgType getTaxon2Data_org() {
        return taxon2Data_org;
    }


    /**
     * Sets the taxon2Data_org value for this Taxon2DataType.
     * 
     * @param taxon2Data_org
     */
    public void setTaxon2Data_org(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon2Data_orgType taxon2Data_org) {
        this.taxon2Data_org = taxon2Data_org;
    }


    /**
     * Gets the taxon2Data_blastName value for this Taxon2DataType.
     * 
     * @return taxon2Data_blastName
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon2Data_blastNameType getTaxon2Data_blastName() {
        return taxon2Data_blastName;
    }


    /**
     * Sets the taxon2Data_blastName value for this Taxon2DataType.
     * 
     * @param taxon2Data_blastName
     */
    public void setTaxon2Data_blastName(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon2Data_blastNameType taxon2Data_blastName) {
        this.taxon2Data_blastName = taxon2Data_blastName;
    }


    /**
     * Gets the taxon2Data_isUncultured value for this Taxon2DataType.
     * 
     * @return taxon2Data_isUncultured
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon2Data_isUnculturedType getTaxon2Data_isUncultured() {
        return taxon2Data_isUncultured;
    }


    /**
     * Sets the taxon2Data_isUncultured value for this Taxon2DataType.
     * 
     * @param taxon2Data_isUncultured
     */
    public void setTaxon2Data_isUncultured(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon2Data_isUnculturedType taxon2Data_isUncultured) {
        this.taxon2Data_isUncultured = taxon2Data_isUncultured;
    }


    /**
     * Gets the taxon2Data_isSpeciesLevel value for this Taxon2DataType.
     * 
     * @return taxon2Data_isSpeciesLevel
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon2Data_isSpeciesLevelType getTaxon2Data_isSpeciesLevel() {
        return taxon2Data_isSpeciesLevel;
    }


    /**
     * Sets the taxon2Data_isSpeciesLevel value for this Taxon2DataType.
     * 
     * @param taxon2Data_isSpeciesLevel
     */
    public void setTaxon2Data_isSpeciesLevel(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon2Data_isSpeciesLevelType taxon2Data_isSpeciesLevel) {
        this.taxon2Data_isSpeciesLevel = taxon2Data_isSpeciesLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Taxon2DataType)) return false;
        Taxon2DataType other = (Taxon2DataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxon2Data_org==null && other.getTaxon2Data_org()==null) || 
             (this.taxon2Data_org!=null &&
              this.taxon2Data_org.equals(other.getTaxon2Data_org()))) &&
            ((this.taxon2Data_blastName==null && other.getTaxon2Data_blastName()==null) || 
             (this.taxon2Data_blastName!=null &&
              this.taxon2Data_blastName.equals(other.getTaxon2Data_blastName()))) &&
            ((this.taxon2Data_isUncultured==null && other.getTaxon2Data_isUncultured()==null) || 
             (this.taxon2Data_isUncultured!=null &&
              this.taxon2Data_isUncultured.equals(other.getTaxon2Data_isUncultured()))) &&
            ((this.taxon2Data_isSpeciesLevel==null && other.getTaxon2Data_isSpeciesLevel()==null) || 
             (this.taxon2Data_isSpeciesLevel!=null &&
              this.taxon2Data_isSpeciesLevel.equals(other.getTaxon2Data_isSpeciesLevel())));
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
        if (getTaxon2Data_org() != null) {
            _hashCode += getTaxon2Data_org().hashCode();
        }
        if (getTaxon2Data_blastName() != null) {
            _hashCode += getTaxon2Data_blastName().hashCode();
        }
        if (getTaxon2Data_isUncultured() != null) {
            _hashCode += getTaxon2Data_isUncultured().hashCode();
        }
        if (getTaxon2Data_isSpeciesLevel() != null) {
            _hashCode += getTaxon2Data_isSpeciesLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Taxon2DataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon2-dataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon2Data_org");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon2-data_org"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon2-data_orgType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon2Data_blastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon2-data_blast-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon2-data_blast-nameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon2Data_isUncultured");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon2-data_is-uncultured"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon2-data_is-unculturedType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon2Data_isSpeciesLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon2-data_is-species-level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon2-data_is-species-levelType"));
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
