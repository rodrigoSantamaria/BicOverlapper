/**
 * Taxon1NameType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Taxon1NameType  implements java.io.Serializable {
    private java.lang.String taxon1Name_taxid;

    private java.lang.String taxon1Name_cde;

    private java.lang.String taxon1Name_oname;

    private java.lang.String taxon1Name_uname;

    public Taxon1NameType() {
    }

    public Taxon1NameType(
           java.lang.String taxon1Name_taxid,
           java.lang.String taxon1Name_cde,
           java.lang.String taxon1Name_oname,
           java.lang.String taxon1Name_uname) {
           this.taxon1Name_taxid = taxon1Name_taxid;
           this.taxon1Name_cde = taxon1Name_cde;
           this.taxon1Name_oname = taxon1Name_oname;
           this.taxon1Name_uname = taxon1Name_uname;
    }


    /**
     * Gets the taxon1Name_taxid value for this Taxon1NameType.
     * 
     * @return taxon1Name_taxid
     */
    public java.lang.String getTaxon1Name_taxid() {
        return taxon1Name_taxid;
    }


    /**
     * Sets the taxon1Name_taxid value for this Taxon1NameType.
     * 
     * @param taxon1Name_taxid
     */
    public void setTaxon1Name_taxid(java.lang.String taxon1Name_taxid) {
        this.taxon1Name_taxid = taxon1Name_taxid;
    }


    /**
     * Gets the taxon1Name_cde value for this Taxon1NameType.
     * 
     * @return taxon1Name_cde
     */
    public java.lang.String getTaxon1Name_cde() {
        return taxon1Name_cde;
    }


    /**
     * Sets the taxon1Name_cde value for this Taxon1NameType.
     * 
     * @param taxon1Name_cde
     */
    public void setTaxon1Name_cde(java.lang.String taxon1Name_cde) {
        this.taxon1Name_cde = taxon1Name_cde;
    }


    /**
     * Gets the taxon1Name_oname value for this Taxon1NameType.
     * 
     * @return taxon1Name_oname
     */
    public java.lang.String getTaxon1Name_oname() {
        return taxon1Name_oname;
    }


    /**
     * Sets the taxon1Name_oname value for this Taxon1NameType.
     * 
     * @param taxon1Name_oname
     */
    public void setTaxon1Name_oname(java.lang.String taxon1Name_oname) {
        this.taxon1Name_oname = taxon1Name_oname;
    }


    /**
     * Gets the taxon1Name_uname value for this Taxon1NameType.
     * 
     * @return taxon1Name_uname
     */
    public java.lang.String getTaxon1Name_uname() {
        return taxon1Name_uname;
    }


    /**
     * Sets the taxon1Name_uname value for this Taxon1NameType.
     * 
     * @param taxon1Name_uname
     */
    public void setTaxon1Name_uname(java.lang.String taxon1Name_uname) {
        this.taxon1Name_uname = taxon1Name_uname;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Taxon1NameType)) return false;
        Taxon1NameType other = (Taxon1NameType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxon1Name_taxid==null && other.getTaxon1Name_taxid()==null) || 
             (this.taxon1Name_taxid!=null &&
              this.taxon1Name_taxid.equals(other.getTaxon1Name_taxid()))) &&
            ((this.taxon1Name_cde==null && other.getTaxon1Name_cde()==null) || 
             (this.taxon1Name_cde!=null &&
              this.taxon1Name_cde.equals(other.getTaxon1Name_cde()))) &&
            ((this.taxon1Name_oname==null && other.getTaxon1Name_oname()==null) || 
             (this.taxon1Name_oname!=null &&
              this.taxon1Name_oname.equals(other.getTaxon1Name_oname()))) &&
            ((this.taxon1Name_uname==null && other.getTaxon1Name_uname()==null) || 
             (this.taxon1Name_uname!=null &&
              this.taxon1Name_uname.equals(other.getTaxon1Name_uname())));
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
        if (getTaxon1Name_taxid() != null) {
            _hashCode += getTaxon1Name_taxid().hashCode();
        }
        if (getTaxon1Name_cde() != null) {
            _hashCode += getTaxon1Name_cde().hashCode();
        }
        if (getTaxon1Name_oname() != null) {
            _hashCode += getTaxon1Name_oname().hashCode();
        }
        if (getTaxon1Name_uname() != null) {
            _hashCode += getTaxon1Name_uname().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Taxon1NameType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-nameType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Name_taxid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-name_taxid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Name_cde");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-name_cde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Name_oname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-name_oname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Name_uname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-name_uname"));
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
