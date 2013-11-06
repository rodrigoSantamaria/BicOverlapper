/**
 * BiomolDescrType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiomolDescrType  implements java.io.Serializable {
    private java.lang.String biomolDescr_name;

    private java.lang.String biomolDescr_pdbClass;

    private java.lang.String biomolDescr_pdbSource;

    private java.lang.String biomolDescr_pdbComment;

    private java.lang.String biomolDescr_otherComment;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiomolDescr_organismType biomolDescr_organism;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiomolDescr_attributionType biomolDescr_attribution;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiomolDescr_assemblyTypeType biomolDescr_assemblyType;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiomolDescr_moleculeTypeType biomolDescr_moleculeType;

    public BiomolDescrType() {
    }

    public BiomolDescrType(
           java.lang.String biomolDescr_name,
           java.lang.String biomolDescr_pdbClass,
           java.lang.String biomolDescr_pdbSource,
           java.lang.String biomolDescr_pdbComment,
           java.lang.String biomolDescr_otherComment,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiomolDescr_organismType biomolDescr_organism,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiomolDescr_attributionType biomolDescr_attribution,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiomolDescr_assemblyTypeType biomolDescr_assemblyType,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiomolDescr_moleculeTypeType biomolDescr_moleculeType) {
           this.biomolDescr_name = biomolDescr_name;
           this.biomolDescr_pdbClass = biomolDescr_pdbClass;
           this.biomolDescr_pdbSource = biomolDescr_pdbSource;
           this.biomolDescr_pdbComment = biomolDescr_pdbComment;
           this.biomolDescr_otherComment = biomolDescr_otherComment;
           this.biomolDescr_organism = biomolDescr_organism;
           this.biomolDescr_attribution = biomolDescr_attribution;
           this.biomolDescr_assemblyType = biomolDescr_assemblyType;
           this.biomolDescr_moleculeType = biomolDescr_moleculeType;
    }


    /**
     * Gets the biomolDescr_name value for this BiomolDescrType.
     * 
     * @return biomolDescr_name
     */
    public java.lang.String getBiomolDescr_name() {
        return biomolDescr_name;
    }


    /**
     * Sets the biomolDescr_name value for this BiomolDescrType.
     * 
     * @param biomolDescr_name
     */
    public void setBiomolDescr_name(java.lang.String biomolDescr_name) {
        this.biomolDescr_name = biomolDescr_name;
    }


    /**
     * Gets the biomolDescr_pdbClass value for this BiomolDescrType.
     * 
     * @return biomolDescr_pdbClass
     */
    public java.lang.String getBiomolDescr_pdbClass() {
        return biomolDescr_pdbClass;
    }


    /**
     * Sets the biomolDescr_pdbClass value for this BiomolDescrType.
     * 
     * @param biomolDescr_pdbClass
     */
    public void setBiomolDescr_pdbClass(java.lang.String biomolDescr_pdbClass) {
        this.biomolDescr_pdbClass = biomolDescr_pdbClass;
    }


    /**
     * Gets the biomolDescr_pdbSource value for this BiomolDescrType.
     * 
     * @return biomolDescr_pdbSource
     */
    public java.lang.String getBiomolDescr_pdbSource() {
        return biomolDescr_pdbSource;
    }


    /**
     * Sets the biomolDescr_pdbSource value for this BiomolDescrType.
     * 
     * @param biomolDescr_pdbSource
     */
    public void setBiomolDescr_pdbSource(java.lang.String biomolDescr_pdbSource) {
        this.biomolDescr_pdbSource = biomolDescr_pdbSource;
    }


    /**
     * Gets the biomolDescr_pdbComment value for this BiomolDescrType.
     * 
     * @return biomolDescr_pdbComment
     */
    public java.lang.String getBiomolDescr_pdbComment() {
        return biomolDescr_pdbComment;
    }


    /**
     * Sets the biomolDescr_pdbComment value for this BiomolDescrType.
     * 
     * @param biomolDescr_pdbComment
     */
    public void setBiomolDescr_pdbComment(java.lang.String biomolDescr_pdbComment) {
        this.biomolDescr_pdbComment = biomolDescr_pdbComment;
    }


    /**
     * Gets the biomolDescr_otherComment value for this BiomolDescrType.
     * 
     * @return biomolDescr_otherComment
     */
    public java.lang.String getBiomolDescr_otherComment() {
        return biomolDescr_otherComment;
    }


    /**
     * Sets the biomolDescr_otherComment value for this BiomolDescrType.
     * 
     * @param biomolDescr_otherComment
     */
    public void setBiomolDescr_otherComment(java.lang.String biomolDescr_otherComment) {
        this.biomolDescr_otherComment = biomolDescr_otherComment;
    }


    /**
     * Gets the biomolDescr_organism value for this BiomolDescrType.
     * 
     * @return biomolDescr_organism
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiomolDescr_organismType getBiomolDescr_organism() {
        return biomolDescr_organism;
    }


    /**
     * Sets the biomolDescr_organism value for this BiomolDescrType.
     * 
     * @param biomolDescr_organism
     */
    public void setBiomolDescr_organism(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiomolDescr_organismType biomolDescr_organism) {
        this.biomolDescr_organism = biomolDescr_organism;
    }


    /**
     * Gets the biomolDescr_attribution value for this BiomolDescrType.
     * 
     * @return biomolDescr_attribution
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiomolDescr_attributionType getBiomolDescr_attribution() {
        return biomolDescr_attribution;
    }


    /**
     * Sets the biomolDescr_attribution value for this BiomolDescrType.
     * 
     * @param biomolDescr_attribution
     */
    public void setBiomolDescr_attribution(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiomolDescr_attributionType biomolDescr_attribution) {
        this.biomolDescr_attribution = biomolDescr_attribution;
    }


    /**
     * Gets the biomolDescr_assemblyType value for this BiomolDescrType.
     * 
     * @return biomolDescr_assemblyType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiomolDescr_assemblyTypeType getBiomolDescr_assemblyType() {
        return biomolDescr_assemblyType;
    }


    /**
     * Sets the biomolDescr_assemblyType value for this BiomolDescrType.
     * 
     * @param biomolDescr_assemblyType
     */
    public void setBiomolDescr_assemblyType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiomolDescr_assemblyTypeType biomolDescr_assemblyType) {
        this.biomolDescr_assemblyType = biomolDescr_assemblyType;
    }


    /**
     * Gets the biomolDescr_moleculeType value for this BiomolDescrType.
     * 
     * @return biomolDescr_moleculeType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiomolDescr_moleculeTypeType getBiomolDescr_moleculeType() {
        return biomolDescr_moleculeType;
    }


    /**
     * Sets the biomolDescr_moleculeType value for this BiomolDescrType.
     * 
     * @param biomolDescr_moleculeType
     */
    public void setBiomolDescr_moleculeType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiomolDescr_moleculeTypeType biomolDescr_moleculeType) {
        this.biomolDescr_moleculeType = biomolDescr_moleculeType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiomolDescrType)) return false;
        BiomolDescrType other = (BiomolDescrType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biomolDescr_name==null && other.getBiomolDescr_name()==null) || 
             (this.biomolDescr_name!=null &&
              this.biomolDescr_name.equals(other.getBiomolDescr_name()))) &&
            ((this.biomolDescr_pdbClass==null && other.getBiomolDescr_pdbClass()==null) || 
             (this.biomolDescr_pdbClass!=null &&
              this.biomolDescr_pdbClass.equals(other.getBiomolDescr_pdbClass()))) &&
            ((this.biomolDescr_pdbSource==null && other.getBiomolDescr_pdbSource()==null) || 
             (this.biomolDescr_pdbSource!=null &&
              this.biomolDescr_pdbSource.equals(other.getBiomolDescr_pdbSource()))) &&
            ((this.biomolDescr_pdbComment==null && other.getBiomolDescr_pdbComment()==null) || 
             (this.biomolDescr_pdbComment!=null &&
              this.biomolDescr_pdbComment.equals(other.getBiomolDescr_pdbComment()))) &&
            ((this.biomolDescr_otherComment==null && other.getBiomolDescr_otherComment()==null) || 
             (this.biomolDescr_otherComment!=null &&
              this.biomolDescr_otherComment.equals(other.getBiomolDescr_otherComment()))) &&
            ((this.biomolDescr_organism==null && other.getBiomolDescr_organism()==null) || 
             (this.biomolDescr_organism!=null &&
              this.biomolDescr_organism.equals(other.getBiomolDescr_organism()))) &&
            ((this.biomolDescr_attribution==null && other.getBiomolDescr_attribution()==null) || 
             (this.biomolDescr_attribution!=null &&
              this.biomolDescr_attribution.equals(other.getBiomolDescr_attribution()))) &&
            ((this.biomolDescr_assemblyType==null && other.getBiomolDescr_assemblyType()==null) || 
             (this.biomolDescr_assemblyType!=null &&
              this.biomolDescr_assemblyType.equals(other.getBiomolDescr_assemblyType()))) &&
            ((this.biomolDescr_moleculeType==null && other.getBiomolDescr_moleculeType()==null) || 
             (this.biomolDescr_moleculeType!=null &&
              this.biomolDescr_moleculeType.equals(other.getBiomolDescr_moleculeType())));
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
        if (getBiomolDescr_name() != null) {
            _hashCode += getBiomolDescr_name().hashCode();
        }
        if (getBiomolDescr_pdbClass() != null) {
            _hashCode += getBiomolDescr_pdbClass().hashCode();
        }
        if (getBiomolDescr_pdbSource() != null) {
            _hashCode += getBiomolDescr_pdbSource().hashCode();
        }
        if (getBiomolDescr_pdbComment() != null) {
            _hashCode += getBiomolDescr_pdbComment().hashCode();
        }
        if (getBiomolDescr_otherComment() != null) {
            _hashCode += getBiomolDescr_otherComment().hashCode();
        }
        if (getBiomolDescr_organism() != null) {
            _hashCode += getBiomolDescr_organism().hashCode();
        }
        if (getBiomolDescr_attribution() != null) {
            _hashCode += getBiomolDescr_attribution().hashCode();
        }
        if (getBiomolDescr_assemblyType() != null) {
            _hashCode += getBiomolDescr_assemblyType().hashCode();
        }
        if (getBiomolDescr_moleculeType() != null) {
            _hashCode += getBiomolDescr_moleculeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiomolDescrType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biomol-descrType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biomolDescr_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biomol-descr_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biomolDescr_pdbClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biomol-descr_pdb-class"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biomolDescr_pdbSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biomol-descr_pdb-source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biomolDescr_pdbComment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biomol-descr_pdb-comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biomolDescr_otherComment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biomol-descr_other-comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biomolDescr_organism");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biomol-descr_organism"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biomol-descr_organismType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biomolDescr_attribution");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biomol-descr_attribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biomol-descr_attributionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biomolDescr_assemblyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biomol-descr_assembly-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biomol-descr_assembly-typeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biomolDescr_moleculeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biomol-descr_molecule-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biomol-descr_molecule-typeType"));
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
