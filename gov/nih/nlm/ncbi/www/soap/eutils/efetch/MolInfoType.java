/**
 * MolInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MolInfoType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MolInfo_biomolType molInfo_biomol;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MolInfo_techType molInfo_tech;

    private java.lang.String molInfo_techexp;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MolInfo_completenessType molInfo_completeness;

    public MolInfoType() {
    }

    public MolInfoType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MolInfo_biomolType molInfo_biomol,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MolInfo_techType molInfo_tech,
           java.lang.String molInfo_techexp,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MolInfo_completenessType molInfo_completeness) {
           this.molInfo_biomol = molInfo_biomol;
           this.molInfo_tech = molInfo_tech;
           this.molInfo_techexp = molInfo_techexp;
           this.molInfo_completeness = molInfo_completeness;
    }


    /**
     * Gets the molInfo_biomol value for this MolInfoType.
     * 
     * @return molInfo_biomol
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MolInfo_biomolType getMolInfo_biomol() {
        return molInfo_biomol;
    }


    /**
     * Sets the molInfo_biomol value for this MolInfoType.
     * 
     * @param molInfo_biomol
     */
    public void setMolInfo_biomol(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MolInfo_biomolType molInfo_biomol) {
        this.molInfo_biomol = molInfo_biomol;
    }


    /**
     * Gets the molInfo_tech value for this MolInfoType.
     * 
     * @return molInfo_tech
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MolInfo_techType getMolInfo_tech() {
        return molInfo_tech;
    }


    /**
     * Sets the molInfo_tech value for this MolInfoType.
     * 
     * @param molInfo_tech
     */
    public void setMolInfo_tech(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MolInfo_techType molInfo_tech) {
        this.molInfo_tech = molInfo_tech;
    }


    /**
     * Gets the molInfo_techexp value for this MolInfoType.
     * 
     * @return molInfo_techexp
     */
    public java.lang.String getMolInfo_techexp() {
        return molInfo_techexp;
    }


    /**
     * Sets the molInfo_techexp value for this MolInfoType.
     * 
     * @param molInfo_techexp
     */
    public void setMolInfo_techexp(java.lang.String molInfo_techexp) {
        this.molInfo_techexp = molInfo_techexp;
    }


    /**
     * Gets the molInfo_completeness value for this MolInfoType.
     * 
     * @return molInfo_completeness
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MolInfo_completenessType getMolInfo_completeness() {
        return molInfo_completeness;
    }


    /**
     * Sets the molInfo_completeness value for this MolInfoType.
     * 
     * @param molInfo_completeness
     */
    public void setMolInfo_completeness(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MolInfo_completenessType molInfo_completeness) {
        this.molInfo_completeness = molInfo_completeness;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MolInfoType)) return false;
        MolInfoType other = (MolInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.molInfo_biomol==null && other.getMolInfo_biomol()==null) || 
             (this.molInfo_biomol!=null &&
              this.molInfo_biomol.equals(other.getMolInfo_biomol()))) &&
            ((this.molInfo_tech==null && other.getMolInfo_tech()==null) || 
             (this.molInfo_tech!=null &&
              this.molInfo_tech.equals(other.getMolInfo_tech()))) &&
            ((this.molInfo_techexp==null && other.getMolInfo_techexp()==null) || 
             (this.molInfo_techexp!=null &&
              this.molInfo_techexp.equals(other.getMolInfo_techexp()))) &&
            ((this.molInfo_completeness==null && other.getMolInfo_completeness()==null) || 
             (this.molInfo_completeness!=null &&
              this.molInfo_completeness.equals(other.getMolInfo_completeness())));
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
        if (getMolInfo_biomol() != null) {
            _hashCode += getMolInfo_biomol().hashCode();
        }
        if (getMolInfo_tech() != null) {
            _hashCode += getMolInfo_tech().hashCode();
        }
        if (getMolInfo_techexp() != null) {
            _hashCode += getMolInfo_techexp().hashCode();
        }
        if (getMolInfo_completeness() != null) {
            _hashCode += getMolInfo_completeness().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MolInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MolInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("molInfo_biomol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MolInfo_biomol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MolInfo_biomolType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("molInfo_tech");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MolInfo_tech"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MolInfo_techType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("molInfo_techexp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MolInfo_techexp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("molInfo_completeness");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MolInfo_completeness"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MolInfo_completenessType"));
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
