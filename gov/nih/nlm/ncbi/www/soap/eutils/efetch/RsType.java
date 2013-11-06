/**
 * RsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RsType  implements java.io.Serializable {
    private java.lang.String rs_rsId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_snpClassType rs_snpClass;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_snpTypeType rs_snpType;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_molTypeType rs_molType;

    private java.lang.String rs_validProbMin;

    private java.lang.String rs_validProbMax;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_genotypeType rs_genotype;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_hetType rs_het;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_validationType rs_validation;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_createType rs_create;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_updateType rs_update;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_sequenceType rs_sequence;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_ssType rs_ss;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_assemblyType rs_assembly;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_primarySequenceType rs_primarySequence;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_rsStructType rs_rsStruct;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_rsLinkoutType rs_rsLinkout;

    public RsType() {
    }

    public RsType(
           java.lang.String rs_rsId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_snpClassType rs_snpClass,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_snpTypeType rs_snpType,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_molTypeType rs_molType,
           java.lang.String rs_validProbMin,
           java.lang.String rs_validProbMax,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_genotypeType rs_genotype,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_hetType rs_het,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_validationType rs_validation,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_createType rs_create,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_updateType rs_update,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_sequenceType rs_sequence,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_ssType rs_ss,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_assemblyType rs_assembly,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_primarySequenceType rs_primarySequence,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_rsStructType rs_rsStruct,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_rsLinkoutType rs_rsLinkout) {
           this.rs_rsId = rs_rsId;
           this.rs_snpClass = rs_snpClass;
           this.rs_snpType = rs_snpType;
           this.rs_molType = rs_molType;
           this.rs_validProbMin = rs_validProbMin;
           this.rs_validProbMax = rs_validProbMax;
           this.rs_genotype = rs_genotype;
           this.rs_het = rs_het;
           this.rs_validation = rs_validation;
           this.rs_create = rs_create;
           this.rs_update = rs_update;
           this.rs_sequence = rs_sequence;
           this.rs_ss = rs_ss;
           this.rs_assembly = rs_assembly;
           this.rs_primarySequence = rs_primarySequence;
           this.rs_rsStruct = rs_rsStruct;
           this.rs_rsLinkout = rs_rsLinkout;
    }


    /**
     * Gets the rs_rsId value for this RsType.
     * 
     * @return rs_rsId
     */
    public java.lang.String getRs_rsId() {
        return rs_rsId;
    }


    /**
     * Sets the rs_rsId value for this RsType.
     * 
     * @param rs_rsId
     */
    public void setRs_rsId(java.lang.String rs_rsId) {
        this.rs_rsId = rs_rsId;
    }


    /**
     * Gets the rs_snpClass value for this RsType.
     * 
     * @return rs_snpClass
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_snpClassType getRs_snpClass() {
        return rs_snpClass;
    }


    /**
     * Sets the rs_snpClass value for this RsType.
     * 
     * @param rs_snpClass
     */
    public void setRs_snpClass(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_snpClassType rs_snpClass) {
        this.rs_snpClass = rs_snpClass;
    }


    /**
     * Gets the rs_snpType value for this RsType.
     * 
     * @return rs_snpType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_snpTypeType getRs_snpType() {
        return rs_snpType;
    }


    /**
     * Sets the rs_snpType value for this RsType.
     * 
     * @param rs_snpType
     */
    public void setRs_snpType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_snpTypeType rs_snpType) {
        this.rs_snpType = rs_snpType;
    }


    /**
     * Gets the rs_molType value for this RsType.
     * 
     * @return rs_molType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_molTypeType getRs_molType() {
        return rs_molType;
    }


    /**
     * Sets the rs_molType value for this RsType.
     * 
     * @param rs_molType
     */
    public void setRs_molType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_molTypeType rs_molType) {
        this.rs_molType = rs_molType;
    }


    /**
     * Gets the rs_validProbMin value for this RsType.
     * 
     * @return rs_validProbMin
     */
    public java.lang.String getRs_validProbMin() {
        return rs_validProbMin;
    }


    /**
     * Sets the rs_validProbMin value for this RsType.
     * 
     * @param rs_validProbMin
     */
    public void setRs_validProbMin(java.lang.String rs_validProbMin) {
        this.rs_validProbMin = rs_validProbMin;
    }


    /**
     * Gets the rs_validProbMax value for this RsType.
     * 
     * @return rs_validProbMax
     */
    public java.lang.String getRs_validProbMax() {
        return rs_validProbMax;
    }


    /**
     * Sets the rs_validProbMax value for this RsType.
     * 
     * @param rs_validProbMax
     */
    public void setRs_validProbMax(java.lang.String rs_validProbMax) {
        this.rs_validProbMax = rs_validProbMax;
    }


    /**
     * Gets the rs_genotype value for this RsType.
     * 
     * @return rs_genotype
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_genotypeType getRs_genotype() {
        return rs_genotype;
    }


    /**
     * Sets the rs_genotype value for this RsType.
     * 
     * @param rs_genotype
     */
    public void setRs_genotype(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_genotypeType rs_genotype) {
        this.rs_genotype = rs_genotype;
    }


    /**
     * Gets the rs_het value for this RsType.
     * 
     * @return rs_het
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_hetType getRs_het() {
        return rs_het;
    }


    /**
     * Sets the rs_het value for this RsType.
     * 
     * @param rs_het
     */
    public void setRs_het(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_hetType rs_het) {
        this.rs_het = rs_het;
    }


    /**
     * Gets the rs_validation value for this RsType.
     * 
     * @return rs_validation
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_validationType getRs_validation() {
        return rs_validation;
    }


    /**
     * Sets the rs_validation value for this RsType.
     * 
     * @param rs_validation
     */
    public void setRs_validation(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_validationType rs_validation) {
        this.rs_validation = rs_validation;
    }


    /**
     * Gets the rs_create value for this RsType.
     * 
     * @return rs_create
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_createType getRs_create() {
        return rs_create;
    }


    /**
     * Sets the rs_create value for this RsType.
     * 
     * @param rs_create
     */
    public void setRs_create(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_createType rs_create) {
        this.rs_create = rs_create;
    }


    /**
     * Gets the rs_update value for this RsType.
     * 
     * @return rs_update
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_updateType getRs_update() {
        return rs_update;
    }


    /**
     * Sets the rs_update value for this RsType.
     * 
     * @param rs_update
     */
    public void setRs_update(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_updateType rs_update) {
        this.rs_update = rs_update;
    }


    /**
     * Gets the rs_sequence value for this RsType.
     * 
     * @return rs_sequence
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_sequenceType getRs_sequence() {
        return rs_sequence;
    }


    /**
     * Sets the rs_sequence value for this RsType.
     * 
     * @param rs_sequence
     */
    public void setRs_sequence(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_sequenceType rs_sequence) {
        this.rs_sequence = rs_sequence;
    }


    /**
     * Gets the rs_ss value for this RsType.
     * 
     * @return rs_ss
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_ssType getRs_ss() {
        return rs_ss;
    }


    /**
     * Sets the rs_ss value for this RsType.
     * 
     * @param rs_ss
     */
    public void setRs_ss(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_ssType rs_ss) {
        this.rs_ss = rs_ss;
    }


    /**
     * Gets the rs_assembly value for this RsType.
     * 
     * @return rs_assembly
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_assemblyType getRs_assembly() {
        return rs_assembly;
    }


    /**
     * Sets the rs_assembly value for this RsType.
     * 
     * @param rs_assembly
     */
    public void setRs_assembly(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_assemblyType rs_assembly) {
        this.rs_assembly = rs_assembly;
    }


    /**
     * Gets the rs_primarySequence value for this RsType.
     * 
     * @return rs_primarySequence
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_primarySequenceType getRs_primarySequence() {
        return rs_primarySequence;
    }


    /**
     * Sets the rs_primarySequence value for this RsType.
     * 
     * @param rs_primarySequence
     */
    public void setRs_primarySequence(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_primarySequenceType rs_primarySequence) {
        this.rs_primarySequence = rs_primarySequence;
    }


    /**
     * Gets the rs_rsStruct value for this RsType.
     * 
     * @return rs_rsStruct
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_rsStructType getRs_rsStruct() {
        return rs_rsStruct;
    }


    /**
     * Sets the rs_rsStruct value for this RsType.
     * 
     * @param rs_rsStruct
     */
    public void setRs_rsStruct(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_rsStructType rs_rsStruct) {
        this.rs_rsStruct = rs_rsStruct;
    }


    /**
     * Gets the rs_rsLinkout value for this RsType.
     * 
     * @return rs_rsLinkout
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_rsLinkoutType getRs_rsLinkout() {
        return rs_rsLinkout;
    }


    /**
     * Sets the rs_rsLinkout value for this RsType.
     * 
     * @param rs_rsLinkout
     */
    public void setRs_rsLinkout(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Rs_rsLinkoutType rs_rsLinkout) {
        this.rs_rsLinkout = rs_rsLinkout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RsType)) return false;
        RsType other = (RsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rs_rsId==null && other.getRs_rsId()==null) || 
             (this.rs_rsId!=null &&
              this.rs_rsId.equals(other.getRs_rsId()))) &&
            ((this.rs_snpClass==null && other.getRs_snpClass()==null) || 
             (this.rs_snpClass!=null &&
              this.rs_snpClass.equals(other.getRs_snpClass()))) &&
            ((this.rs_snpType==null && other.getRs_snpType()==null) || 
             (this.rs_snpType!=null &&
              this.rs_snpType.equals(other.getRs_snpType()))) &&
            ((this.rs_molType==null && other.getRs_molType()==null) || 
             (this.rs_molType!=null &&
              this.rs_molType.equals(other.getRs_molType()))) &&
            ((this.rs_validProbMin==null && other.getRs_validProbMin()==null) || 
             (this.rs_validProbMin!=null &&
              this.rs_validProbMin.equals(other.getRs_validProbMin()))) &&
            ((this.rs_validProbMax==null && other.getRs_validProbMax()==null) || 
             (this.rs_validProbMax!=null &&
              this.rs_validProbMax.equals(other.getRs_validProbMax()))) &&
            ((this.rs_genotype==null && other.getRs_genotype()==null) || 
             (this.rs_genotype!=null &&
              this.rs_genotype.equals(other.getRs_genotype()))) &&
            ((this.rs_het==null && other.getRs_het()==null) || 
             (this.rs_het!=null &&
              this.rs_het.equals(other.getRs_het()))) &&
            ((this.rs_validation==null && other.getRs_validation()==null) || 
             (this.rs_validation!=null &&
              this.rs_validation.equals(other.getRs_validation()))) &&
            ((this.rs_create==null && other.getRs_create()==null) || 
             (this.rs_create!=null &&
              this.rs_create.equals(other.getRs_create()))) &&
            ((this.rs_update==null && other.getRs_update()==null) || 
             (this.rs_update!=null &&
              this.rs_update.equals(other.getRs_update()))) &&
            ((this.rs_sequence==null && other.getRs_sequence()==null) || 
             (this.rs_sequence!=null &&
              this.rs_sequence.equals(other.getRs_sequence()))) &&
            ((this.rs_ss==null && other.getRs_ss()==null) || 
             (this.rs_ss!=null &&
              this.rs_ss.equals(other.getRs_ss()))) &&
            ((this.rs_assembly==null && other.getRs_assembly()==null) || 
             (this.rs_assembly!=null &&
              this.rs_assembly.equals(other.getRs_assembly()))) &&
            ((this.rs_primarySequence==null && other.getRs_primarySequence()==null) || 
             (this.rs_primarySequence!=null &&
              this.rs_primarySequence.equals(other.getRs_primarySequence()))) &&
            ((this.rs_rsStruct==null && other.getRs_rsStruct()==null) || 
             (this.rs_rsStruct!=null &&
              this.rs_rsStruct.equals(other.getRs_rsStruct()))) &&
            ((this.rs_rsLinkout==null && other.getRs_rsLinkout()==null) || 
             (this.rs_rsLinkout!=null &&
              this.rs_rsLinkout.equals(other.getRs_rsLinkout())));
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
        if (getRs_rsId() != null) {
            _hashCode += getRs_rsId().hashCode();
        }
        if (getRs_snpClass() != null) {
            _hashCode += getRs_snpClass().hashCode();
        }
        if (getRs_snpType() != null) {
            _hashCode += getRs_snpType().hashCode();
        }
        if (getRs_molType() != null) {
            _hashCode += getRs_molType().hashCode();
        }
        if (getRs_validProbMin() != null) {
            _hashCode += getRs_validProbMin().hashCode();
        }
        if (getRs_validProbMax() != null) {
            _hashCode += getRs_validProbMax().hashCode();
        }
        if (getRs_genotype() != null) {
            _hashCode += getRs_genotype().hashCode();
        }
        if (getRs_het() != null) {
            _hashCode += getRs_het().hashCode();
        }
        if (getRs_validation() != null) {
            _hashCode += getRs_validation().hashCode();
        }
        if (getRs_create() != null) {
            _hashCode += getRs_create().hashCode();
        }
        if (getRs_update() != null) {
            _hashCode += getRs_update().hashCode();
        }
        if (getRs_sequence() != null) {
            _hashCode += getRs_sequence().hashCode();
        }
        if (getRs_ss() != null) {
            _hashCode += getRs_ss().hashCode();
        }
        if (getRs_assembly() != null) {
            _hashCode += getRs_assembly().hashCode();
        }
        if (getRs_primarySequence() != null) {
            _hashCode += getRs_primarySequence().hashCode();
        }
        if (getRs_rsStruct() != null) {
            _hashCode += getRs_rsStruct().hashCode();
        }
        if (getRs_rsLinkout() != null) {
            _hashCode += getRs_rsLinkout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_rsId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_rsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_snpClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_snpClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_snpClassType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_snpType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_snpType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_snpTypeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_molType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_molType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_molTypeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_validProbMin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_validProbMin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_validProbMax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_validProbMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_genotype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_genotype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_genotypeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_het");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_het"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_hetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_validation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_validation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_validationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_create");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_create"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_createType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_update");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_update"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_updateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_sequenceType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_ss");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_ss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_ssType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_assembly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_assembly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_assemblyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_primarySequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_primarySequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_primarySequenceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_rsStruct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_rsStruct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_rsStructType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_rsLinkout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_rsLinkout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_rsLinkoutType"));
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
