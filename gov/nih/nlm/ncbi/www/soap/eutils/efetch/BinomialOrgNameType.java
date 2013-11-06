/**
 * BinomialOrgNameType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BinomialOrgNameType  implements java.io.Serializable {
    private java.lang.String binomialOrgName_genus;

    private java.lang.String binomialOrgName_species;

    private java.lang.String binomialOrgName_subspecies;

    public BinomialOrgNameType() {
    }

    public BinomialOrgNameType(
           java.lang.String binomialOrgName_genus,
           java.lang.String binomialOrgName_species,
           java.lang.String binomialOrgName_subspecies) {
           this.binomialOrgName_genus = binomialOrgName_genus;
           this.binomialOrgName_species = binomialOrgName_species;
           this.binomialOrgName_subspecies = binomialOrgName_subspecies;
    }


    /**
     * Gets the binomialOrgName_genus value for this BinomialOrgNameType.
     * 
     * @return binomialOrgName_genus
     */
    public java.lang.String getBinomialOrgName_genus() {
        return binomialOrgName_genus;
    }


    /**
     * Sets the binomialOrgName_genus value for this BinomialOrgNameType.
     * 
     * @param binomialOrgName_genus
     */
    public void setBinomialOrgName_genus(java.lang.String binomialOrgName_genus) {
        this.binomialOrgName_genus = binomialOrgName_genus;
    }


    /**
     * Gets the binomialOrgName_species value for this BinomialOrgNameType.
     * 
     * @return binomialOrgName_species
     */
    public java.lang.String getBinomialOrgName_species() {
        return binomialOrgName_species;
    }


    /**
     * Sets the binomialOrgName_species value for this BinomialOrgNameType.
     * 
     * @param binomialOrgName_species
     */
    public void setBinomialOrgName_species(java.lang.String binomialOrgName_species) {
        this.binomialOrgName_species = binomialOrgName_species;
    }


    /**
     * Gets the binomialOrgName_subspecies value for this BinomialOrgNameType.
     * 
     * @return binomialOrgName_subspecies
     */
    public java.lang.String getBinomialOrgName_subspecies() {
        return binomialOrgName_subspecies;
    }


    /**
     * Sets the binomialOrgName_subspecies value for this BinomialOrgNameType.
     * 
     * @param binomialOrgName_subspecies
     */
    public void setBinomialOrgName_subspecies(java.lang.String binomialOrgName_subspecies) {
        this.binomialOrgName_subspecies = binomialOrgName_subspecies;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BinomialOrgNameType)) return false;
        BinomialOrgNameType other = (BinomialOrgNameType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.binomialOrgName_genus==null && other.getBinomialOrgName_genus()==null) || 
             (this.binomialOrgName_genus!=null &&
              this.binomialOrgName_genus.equals(other.getBinomialOrgName_genus()))) &&
            ((this.binomialOrgName_species==null && other.getBinomialOrgName_species()==null) || 
             (this.binomialOrgName_species!=null &&
              this.binomialOrgName_species.equals(other.getBinomialOrgName_species()))) &&
            ((this.binomialOrgName_subspecies==null && other.getBinomialOrgName_subspecies()==null) || 
             (this.binomialOrgName_subspecies!=null &&
              this.binomialOrgName_subspecies.equals(other.getBinomialOrgName_subspecies())));
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
        if (getBinomialOrgName_genus() != null) {
            _hashCode += getBinomialOrgName_genus().hashCode();
        }
        if (getBinomialOrgName_species() != null) {
            _hashCode += getBinomialOrgName_species().hashCode();
        }
        if (getBinomialOrgName_subspecies() != null) {
            _hashCode += getBinomialOrgName_subspecies().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BinomialOrgNameType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BinomialOrgNameType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binomialOrgName_genus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BinomialOrgName_genus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binomialOrgName_species");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BinomialOrgName_species"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binomialOrgName_subspecies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BinomialOrgName_subspecies"));
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
