/**
 * MimAllelicVariantType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MimAllelicVariantType  implements java.io.Serializable {
    private java.lang.String mimAllelicVariant_number;

    private java.lang.String mimAllelicVariant_name;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAllelicVariant_aliasesType mimAllelicVariant_aliases;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAllelicVariant_mutationType mimAllelicVariant_mutation;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAllelicVariant_descriptionType mimAllelicVariant_description;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAllelicVariant_snpLinksType mimAllelicVariant_snpLinks;

    public MimAllelicVariantType() {
    }

    public MimAllelicVariantType(
           java.lang.String mimAllelicVariant_number,
           java.lang.String mimAllelicVariant_name,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAllelicVariant_aliasesType mimAllelicVariant_aliases,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAllelicVariant_mutationType mimAllelicVariant_mutation,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAllelicVariant_descriptionType mimAllelicVariant_description,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAllelicVariant_snpLinksType mimAllelicVariant_snpLinks) {
           this.mimAllelicVariant_number = mimAllelicVariant_number;
           this.mimAllelicVariant_name = mimAllelicVariant_name;
           this.mimAllelicVariant_aliases = mimAllelicVariant_aliases;
           this.mimAllelicVariant_mutation = mimAllelicVariant_mutation;
           this.mimAllelicVariant_description = mimAllelicVariant_description;
           this.mimAllelicVariant_snpLinks = mimAllelicVariant_snpLinks;
    }


    /**
     * Gets the mimAllelicVariant_number value for this MimAllelicVariantType.
     * 
     * @return mimAllelicVariant_number
     */
    public java.lang.String getMimAllelicVariant_number() {
        return mimAllelicVariant_number;
    }


    /**
     * Sets the mimAllelicVariant_number value for this MimAllelicVariantType.
     * 
     * @param mimAllelicVariant_number
     */
    public void setMimAllelicVariant_number(java.lang.String mimAllelicVariant_number) {
        this.mimAllelicVariant_number = mimAllelicVariant_number;
    }


    /**
     * Gets the mimAllelicVariant_name value for this MimAllelicVariantType.
     * 
     * @return mimAllelicVariant_name
     */
    public java.lang.String getMimAllelicVariant_name() {
        return mimAllelicVariant_name;
    }


    /**
     * Sets the mimAllelicVariant_name value for this MimAllelicVariantType.
     * 
     * @param mimAllelicVariant_name
     */
    public void setMimAllelicVariant_name(java.lang.String mimAllelicVariant_name) {
        this.mimAllelicVariant_name = mimAllelicVariant_name;
    }


    /**
     * Gets the mimAllelicVariant_aliases value for this MimAllelicVariantType.
     * 
     * @return mimAllelicVariant_aliases
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAllelicVariant_aliasesType getMimAllelicVariant_aliases() {
        return mimAllelicVariant_aliases;
    }


    /**
     * Sets the mimAllelicVariant_aliases value for this MimAllelicVariantType.
     * 
     * @param mimAllelicVariant_aliases
     */
    public void setMimAllelicVariant_aliases(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAllelicVariant_aliasesType mimAllelicVariant_aliases) {
        this.mimAllelicVariant_aliases = mimAllelicVariant_aliases;
    }


    /**
     * Gets the mimAllelicVariant_mutation value for this MimAllelicVariantType.
     * 
     * @return mimAllelicVariant_mutation
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAllelicVariant_mutationType getMimAllelicVariant_mutation() {
        return mimAllelicVariant_mutation;
    }


    /**
     * Sets the mimAllelicVariant_mutation value for this MimAllelicVariantType.
     * 
     * @param mimAllelicVariant_mutation
     */
    public void setMimAllelicVariant_mutation(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAllelicVariant_mutationType mimAllelicVariant_mutation) {
        this.mimAllelicVariant_mutation = mimAllelicVariant_mutation;
    }


    /**
     * Gets the mimAllelicVariant_description value for this MimAllelicVariantType.
     * 
     * @return mimAllelicVariant_description
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAllelicVariant_descriptionType getMimAllelicVariant_description() {
        return mimAllelicVariant_description;
    }


    /**
     * Sets the mimAllelicVariant_description value for this MimAllelicVariantType.
     * 
     * @param mimAllelicVariant_description
     */
    public void setMimAllelicVariant_description(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAllelicVariant_descriptionType mimAllelicVariant_description) {
        this.mimAllelicVariant_description = mimAllelicVariant_description;
    }


    /**
     * Gets the mimAllelicVariant_snpLinks value for this MimAllelicVariantType.
     * 
     * @return mimAllelicVariant_snpLinks
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAllelicVariant_snpLinksType getMimAllelicVariant_snpLinks() {
        return mimAllelicVariant_snpLinks;
    }


    /**
     * Sets the mimAllelicVariant_snpLinks value for this MimAllelicVariantType.
     * 
     * @param mimAllelicVariant_snpLinks
     */
    public void setMimAllelicVariant_snpLinks(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimAllelicVariant_snpLinksType mimAllelicVariant_snpLinks) {
        this.mimAllelicVariant_snpLinks = mimAllelicVariant_snpLinks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MimAllelicVariantType)) return false;
        MimAllelicVariantType other = (MimAllelicVariantType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mimAllelicVariant_number==null && other.getMimAllelicVariant_number()==null) || 
             (this.mimAllelicVariant_number!=null &&
              this.mimAllelicVariant_number.equals(other.getMimAllelicVariant_number()))) &&
            ((this.mimAllelicVariant_name==null && other.getMimAllelicVariant_name()==null) || 
             (this.mimAllelicVariant_name!=null &&
              this.mimAllelicVariant_name.equals(other.getMimAllelicVariant_name()))) &&
            ((this.mimAllelicVariant_aliases==null && other.getMimAllelicVariant_aliases()==null) || 
             (this.mimAllelicVariant_aliases!=null &&
              this.mimAllelicVariant_aliases.equals(other.getMimAllelicVariant_aliases()))) &&
            ((this.mimAllelicVariant_mutation==null && other.getMimAllelicVariant_mutation()==null) || 
             (this.mimAllelicVariant_mutation!=null &&
              this.mimAllelicVariant_mutation.equals(other.getMimAllelicVariant_mutation()))) &&
            ((this.mimAllelicVariant_description==null && other.getMimAllelicVariant_description()==null) || 
             (this.mimAllelicVariant_description!=null &&
              this.mimAllelicVariant_description.equals(other.getMimAllelicVariant_description()))) &&
            ((this.mimAllelicVariant_snpLinks==null && other.getMimAllelicVariant_snpLinks()==null) || 
             (this.mimAllelicVariant_snpLinks!=null &&
              this.mimAllelicVariant_snpLinks.equals(other.getMimAllelicVariant_snpLinks())));
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
        if (getMimAllelicVariant_number() != null) {
            _hashCode += getMimAllelicVariant_number().hashCode();
        }
        if (getMimAllelicVariant_name() != null) {
            _hashCode += getMimAllelicVariant_name().hashCode();
        }
        if (getMimAllelicVariant_aliases() != null) {
            _hashCode += getMimAllelicVariant_aliases().hashCode();
        }
        if (getMimAllelicVariant_mutation() != null) {
            _hashCode += getMimAllelicVariant_mutation().hashCode();
        }
        if (getMimAllelicVariant_description() != null) {
            _hashCode += getMimAllelicVariant_description().hashCode();
        }
        if (getMimAllelicVariant_snpLinks() != null) {
            _hashCode += getMimAllelicVariant_snpLinks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MimAllelicVariantType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-allelic-variantType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimAllelicVariant_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-allelic-variant_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimAllelicVariant_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-allelic-variant_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimAllelicVariant_aliases");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-allelic-variant_aliases"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-allelic-variant_aliasesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimAllelicVariant_mutation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-allelic-variant_mutation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-allelic-variant_mutationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimAllelicVariant_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-allelic-variant_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-allelic-variant_descriptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimAllelicVariant_snpLinks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-allelic-variant_snpLinks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-allelic-variant_snpLinksType"));
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
