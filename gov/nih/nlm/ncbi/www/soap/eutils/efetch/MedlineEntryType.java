/**
 * MedlineEntryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MedlineEntryType  implements java.io.Serializable {
    private java.lang.String medlineEntry_uid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_emType medlineEntry_em;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_citType medlineEntry_cit;

    private java.lang.String medlineEntry_abstract;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_meshType medlineEntry_mesh;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_substanceType medlineEntry_substance;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_xrefType medlineEntry_xref;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_idnumType medlineEntry_idnum;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_geneType medlineEntry_gene;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_pmidType medlineEntry_pmid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_pubTypeType medlineEntry_pubType;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_mlfieldType medlineEntry_mlfield;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_statusType medlineEntry_status;

    public MedlineEntryType() {
    }

    public MedlineEntryType(
           java.lang.String medlineEntry_uid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_emType medlineEntry_em,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_citType medlineEntry_cit,
           java.lang.String medlineEntry_abstract,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_meshType medlineEntry_mesh,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_substanceType medlineEntry_substance,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_xrefType medlineEntry_xref,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_idnumType medlineEntry_idnum,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_geneType medlineEntry_gene,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_pmidType medlineEntry_pmid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_pubTypeType medlineEntry_pubType,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_mlfieldType medlineEntry_mlfield,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_statusType medlineEntry_status) {
           this.medlineEntry_uid = medlineEntry_uid;
           this.medlineEntry_em = medlineEntry_em;
           this.medlineEntry_cit = medlineEntry_cit;
           this.medlineEntry_abstract = medlineEntry_abstract;
           this.medlineEntry_mesh = medlineEntry_mesh;
           this.medlineEntry_substance = medlineEntry_substance;
           this.medlineEntry_xref = medlineEntry_xref;
           this.medlineEntry_idnum = medlineEntry_idnum;
           this.medlineEntry_gene = medlineEntry_gene;
           this.medlineEntry_pmid = medlineEntry_pmid;
           this.medlineEntry_pubType = medlineEntry_pubType;
           this.medlineEntry_mlfield = medlineEntry_mlfield;
           this.medlineEntry_status = medlineEntry_status;
    }


    /**
     * Gets the medlineEntry_uid value for this MedlineEntryType.
     * 
     * @return medlineEntry_uid
     */
    public java.lang.String getMedlineEntry_uid() {
        return medlineEntry_uid;
    }


    /**
     * Sets the medlineEntry_uid value for this MedlineEntryType.
     * 
     * @param medlineEntry_uid
     */
    public void setMedlineEntry_uid(java.lang.String medlineEntry_uid) {
        this.medlineEntry_uid = medlineEntry_uid;
    }


    /**
     * Gets the medlineEntry_em value for this MedlineEntryType.
     * 
     * @return medlineEntry_em
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_emType getMedlineEntry_em() {
        return medlineEntry_em;
    }


    /**
     * Sets the medlineEntry_em value for this MedlineEntryType.
     * 
     * @param medlineEntry_em
     */
    public void setMedlineEntry_em(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_emType medlineEntry_em) {
        this.medlineEntry_em = medlineEntry_em;
    }


    /**
     * Gets the medlineEntry_cit value for this MedlineEntryType.
     * 
     * @return medlineEntry_cit
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_citType getMedlineEntry_cit() {
        return medlineEntry_cit;
    }


    /**
     * Sets the medlineEntry_cit value for this MedlineEntryType.
     * 
     * @param medlineEntry_cit
     */
    public void setMedlineEntry_cit(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_citType medlineEntry_cit) {
        this.medlineEntry_cit = medlineEntry_cit;
    }


    /**
     * Gets the medlineEntry_abstract value for this MedlineEntryType.
     * 
     * @return medlineEntry_abstract
     */
    public java.lang.String getMedlineEntry_abstract() {
        return medlineEntry_abstract;
    }


    /**
     * Sets the medlineEntry_abstract value for this MedlineEntryType.
     * 
     * @param medlineEntry_abstract
     */
    public void setMedlineEntry_abstract(java.lang.String medlineEntry_abstract) {
        this.medlineEntry_abstract = medlineEntry_abstract;
    }


    /**
     * Gets the medlineEntry_mesh value for this MedlineEntryType.
     * 
     * @return medlineEntry_mesh
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_meshType getMedlineEntry_mesh() {
        return medlineEntry_mesh;
    }


    /**
     * Sets the medlineEntry_mesh value for this MedlineEntryType.
     * 
     * @param medlineEntry_mesh
     */
    public void setMedlineEntry_mesh(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_meshType medlineEntry_mesh) {
        this.medlineEntry_mesh = medlineEntry_mesh;
    }


    /**
     * Gets the medlineEntry_substance value for this MedlineEntryType.
     * 
     * @return medlineEntry_substance
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_substanceType getMedlineEntry_substance() {
        return medlineEntry_substance;
    }


    /**
     * Sets the medlineEntry_substance value for this MedlineEntryType.
     * 
     * @param medlineEntry_substance
     */
    public void setMedlineEntry_substance(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_substanceType medlineEntry_substance) {
        this.medlineEntry_substance = medlineEntry_substance;
    }


    /**
     * Gets the medlineEntry_xref value for this MedlineEntryType.
     * 
     * @return medlineEntry_xref
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_xrefType getMedlineEntry_xref() {
        return medlineEntry_xref;
    }


    /**
     * Sets the medlineEntry_xref value for this MedlineEntryType.
     * 
     * @param medlineEntry_xref
     */
    public void setMedlineEntry_xref(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_xrefType medlineEntry_xref) {
        this.medlineEntry_xref = medlineEntry_xref;
    }


    /**
     * Gets the medlineEntry_idnum value for this MedlineEntryType.
     * 
     * @return medlineEntry_idnum
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_idnumType getMedlineEntry_idnum() {
        return medlineEntry_idnum;
    }


    /**
     * Sets the medlineEntry_idnum value for this MedlineEntryType.
     * 
     * @param medlineEntry_idnum
     */
    public void setMedlineEntry_idnum(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_idnumType medlineEntry_idnum) {
        this.medlineEntry_idnum = medlineEntry_idnum;
    }


    /**
     * Gets the medlineEntry_gene value for this MedlineEntryType.
     * 
     * @return medlineEntry_gene
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_geneType getMedlineEntry_gene() {
        return medlineEntry_gene;
    }


    /**
     * Sets the medlineEntry_gene value for this MedlineEntryType.
     * 
     * @param medlineEntry_gene
     */
    public void setMedlineEntry_gene(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_geneType medlineEntry_gene) {
        this.medlineEntry_gene = medlineEntry_gene;
    }


    /**
     * Gets the medlineEntry_pmid value for this MedlineEntryType.
     * 
     * @return medlineEntry_pmid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_pmidType getMedlineEntry_pmid() {
        return medlineEntry_pmid;
    }


    /**
     * Sets the medlineEntry_pmid value for this MedlineEntryType.
     * 
     * @param medlineEntry_pmid
     */
    public void setMedlineEntry_pmid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_pmidType medlineEntry_pmid) {
        this.medlineEntry_pmid = medlineEntry_pmid;
    }


    /**
     * Gets the medlineEntry_pubType value for this MedlineEntryType.
     * 
     * @return medlineEntry_pubType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_pubTypeType getMedlineEntry_pubType() {
        return medlineEntry_pubType;
    }


    /**
     * Sets the medlineEntry_pubType value for this MedlineEntryType.
     * 
     * @param medlineEntry_pubType
     */
    public void setMedlineEntry_pubType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_pubTypeType medlineEntry_pubType) {
        this.medlineEntry_pubType = medlineEntry_pubType;
    }


    /**
     * Gets the medlineEntry_mlfield value for this MedlineEntryType.
     * 
     * @return medlineEntry_mlfield
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_mlfieldType getMedlineEntry_mlfield() {
        return medlineEntry_mlfield;
    }


    /**
     * Sets the medlineEntry_mlfield value for this MedlineEntryType.
     * 
     * @param medlineEntry_mlfield
     */
    public void setMedlineEntry_mlfield(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_mlfieldType medlineEntry_mlfield) {
        this.medlineEntry_mlfield = medlineEntry_mlfield;
    }


    /**
     * Gets the medlineEntry_status value for this MedlineEntryType.
     * 
     * @return medlineEntry_status
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_statusType getMedlineEntry_status() {
        return medlineEntry_status;
    }


    /**
     * Sets the medlineEntry_status value for this MedlineEntryType.
     * 
     * @param medlineEntry_status
     */
    public void setMedlineEntry_status(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntry_statusType medlineEntry_status) {
        this.medlineEntry_status = medlineEntry_status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MedlineEntryType)) return false;
        MedlineEntryType other = (MedlineEntryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.medlineEntry_uid==null && other.getMedlineEntry_uid()==null) || 
             (this.medlineEntry_uid!=null &&
              this.medlineEntry_uid.equals(other.getMedlineEntry_uid()))) &&
            ((this.medlineEntry_em==null && other.getMedlineEntry_em()==null) || 
             (this.medlineEntry_em!=null &&
              this.medlineEntry_em.equals(other.getMedlineEntry_em()))) &&
            ((this.medlineEntry_cit==null && other.getMedlineEntry_cit()==null) || 
             (this.medlineEntry_cit!=null &&
              this.medlineEntry_cit.equals(other.getMedlineEntry_cit()))) &&
            ((this.medlineEntry_abstract==null && other.getMedlineEntry_abstract()==null) || 
             (this.medlineEntry_abstract!=null &&
              this.medlineEntry_abstract.equals(other.getMedlineEntry_abstract()))) &&
            ((this.medlineEntry_mesh==null && other.getMedlineEntry_mesh()==null) || 
             (this.medlineEntry_mesh!=null &&
              this.medlineEntry_mesh.equals(other.getMedlineEntry_mesh()))) &&
            ((this.medlineEntry_substance==null && other.getMedlineEntry_substance()==null) || 
             (this.medlineEntry_substance!=null &&
              this.medlineEntry_substance.equals(other.getMedlineEntry_substance()))) &&
            ((this.medlineEntry_xref==null && other.getMedlineEntry_xref()==null) || 
             (this.medlineEntry_xref!=null &&
              this.medlineEntry_xref.equals(other.getMedlineEntry_xref()))) &&
            ((this.medlineEntry_idnum==null && other.getMedlineEntry_idnum()==null) || 
             (this.medlineEntry_idnum!=null &&
              this.medlineEntry_idnum.equals(other.getMedlineEntry_idnum()))) &&
            ((this.medlineEntry_gene==null && other.getMedlineEntry_gene()==null) || 
             (this.medlineEntry_gene!=null &&
              this.medlineEntry_gene.equals(other.getMedlineEntry_gene()))) &&
            ((this.medlineEntry_pmid==null && other.getMedlineEntry_pmid()==null) || 
             (this.medlineEntry_pmid!=null &&
              this.medlineEntry_pmid.equals(other.getMedlineEntry_pmid()))) &&
            ((this.medlineEntry_pubType==null && other.getMedlineEntry_pubType()==null) || 
             (this.medlineEntry_pubType!=null &&
              this.medlineEntry_pubType.equals(other.getMedlineEntry_pubType()))) &&
            ((this.medlineEntry_mlfield==null && other.getMedlineEntry_mlfield()==null) || 
             (this.medlineEntry_mlfield!=null &&
              this.medlineEntry_mlfield.equals(other.getMedlineEntry_mlfield()))) &&
            ((this.medlineEntry_status==null && other.getMedlineEntry_status()==null) || 
             (this.medlineEntry_status!=null &&
              this.medlineEntry_status.equals(other.getMedlineEntry_status())));
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
        if (getMedlineEntry_uid() != null) {
            _hashCode += getMedlineEntry_uid().hashCode();
        }
        if (getMedlineEntry_em() != null) {
            _hashCode += getMedlineEntry_em().hashCode();
        }
        if (getMedlineEntry_cit() != null) {
            _hashCode += getMedlineEntry_cit().hashCode();
        }
        if (getMedlineEntry_abstract() != null) {
            _hashCode += getMedlineEntry_abstract().hashCode();
        }
        if (getMedlineEntry_mesh() != null) {
            _hashCode += getMedlineEntry_mesh().hashCode();
        }
        if (getMedlineEntry_substance() != null) {
            _hashCode += getMedlineEntry_substance().hashCode();
        }
        if (getMedlineEntry_xref() != null) {
            _hashCode += getMedlineEntry_xref().hashCode();
        }
        if (getMedlineEntry_idnum() != null) {
            _hashCode += getMedlineEntry_idnum().hashCode();
        }
        if (getMedlineEntry_gene() != null) {
            _hashCode += getMedlineEntry_gene().hashCode();
        }
        if (getMedlineEntry_pmid() != null) {
            _hashCode += getMedlineEntry_pmid().hashCode();
        }
        if (getMedlineEntry_pubType() != null) {
            _hashCode += getMedlineEntry_pubType().hashCode();
        }
        if (getMedlineEntry_mlfield() != null) {
            _hashCode += getMedlineEntry_mlfield().hashCode();
        }
        if (getMedlineEntry_status() != null) {
            _hashCode += getMedlineEntry_status().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MedlineEntryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineEntry_uid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_uid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineEntry_em");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_em"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_emType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineEntry_cit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_cit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_citType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineEntry_abstract");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_abstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineEntry_mesh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_mesh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_meshType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineEntry_substance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_substance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_substanceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineEntry_xref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_xref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_xrefType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineEntry_idnum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_idnum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_idnumType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineEntry_gene");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_gene"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_geneType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineEntry_pmid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_pmid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_pmidType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineEntry_pubType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_pub-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_pub-typeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineEntry_mlfield");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_mlfield"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_mlfieldType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineEntry_status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry_statusType"));
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
