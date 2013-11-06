/**
 * BiostrucSeqsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucSeqsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqs_structureType biostrucSeqs_structure;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqs_sequencesType biostrucSeqs_sequences;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqs_seqalignType biostrucSeqs_seqalign;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqs_styleDictionaryType biostrucSeqs_styleDictionary;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqs_userAnnotationsType biostrucSeqs_userAnnotations;

    public BiostrucSeqsType() {
    }

    public BiostrucSeqsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqs_structureType biostrucSeqs_structure,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqs_sequencesType biostrucSeqs_sequences,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqs_seqalignType biostrucSeqs_seqalign,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqs_styleDictionaryType biostrucSeqs_styleDictionary,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqs_userAnnotationsType biostrucSeqs_userAnnotations) {
           this.biostrucSeqs_structure = biostrucSeqs_structure;
           this.biostrucSeqs_sequences = biostrucSeqs_sequences;
           this.biostrucSeqs_seqalign = biostrucSeqs_seqalign;
           this.biostrucSeqs_styleDictionary = biostrucSeqs_styleDictionary;
           this.biostrucSeqs_userAnnotations = biostrucSeqs_userAnnotations;
    }


    /**
     * Gets the biostrucSeqs_structure value for this BiostrucSeqsType.
     * 
     * @return biostrucSeqs_structure
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqs_structureType getBiostrucSeqs_structure() {
        return biostrucSeqs_structure;
    }


    /**
     * Sets the biostrucSeqs_structure value for this BiostrucSeqsType.
     * 
     * @param biostrucSeqs_structure
     */
    public void setBiostrucSeqs_structure(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqs_structureType biostrucSeqs_structure) {
        this.biostrucSeqs_structure = biostrucSeqs_structure;
    }


    /**
     * Gets the biostrucSeqs_sequences value for this BiostrucSeqsType.
     * 
     * @return biostrucSeqs_sequences
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqs_sequencesType getBiostrucSeqs_sequences() {
        return biostrucSeqs_sequences;
    }


    /**
     * Sets the biostrucSeqs_sequences value for this BiostrucSeqsType.
     * 
     * @param biostrucSeqs_sequences
     */
    public void setBiostrucSeqs_sequences(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqs_sequencesType biostrucSeqs_sequences) {
        this.biostrucSeqs_sequences = biostrucSeqs_sequences;
    }


    /**
     * Gets the biostrucSeqs_seqalign value for this BiostrucSeqsType.
     * 
     * @return biostrucSeqs_seqalign
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqs_seqalignType getBiostrucSeqs_seqalign() {
        return biostrucSeqs_seqalign;
    }


    /**
     * Sets the biostrucSeqs_seqalign value for this BiostrucSeqsType.
     * 
     * @param biostrucSeqs_seqalign
     */
    public void setBiostrucSeqs_seqalign(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqs_seqalignType biostrucSeqs_seqalign) {
        this.biostrucSeqs_seqalign = biostrucSeqs_seqalign;
    }


    /**
     * Gets the biostrucSeqs_styleDictionary value for this BiostrucSeqsType.
     * 
     * @return biostrucSeqs_styleDictionary
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqs_styleDictionaryType getBiostrucSeqs_styleDictionary() {
        return biostrucSeqs_styleDictionary;
    }


    /**
     * Sets the biostrucSeqs_styleDictionary value for this BiostrucSeqsType.
     * 
     * @param biostrucSeqs_styleDictionary
     */
    public void setBiostrucSeqs_styleDictionary(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqs_styleDictionaryType biostrucSeqs_styleDictionary) {
        this.biostrucSeqs_styleDictionary = biostrucSeqs_styleDictionary;
    }


    /**
     * Gets the biostrucSeqs_userAnnotations value for this BiostrucSeqsType.
     * 
     * @return biostrucSeqs_userAnnotations
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqs_userAnnotationsType getBiostrucSeqs_userAnnotations() {
        return biostrucSeqs_userAnnotations;
    }


    /**
     * Sets the biostrucSeqs_userAnnotations value for this BiostrucSeqsType.
     * 
     * @param biostrucSeqs_userAnnotations
     */
    public void setBiostrucSeqs_userAnnotations(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqs_userAnnotationsType biostrucSeqs_userAnnotations) {
        this.biostrucSeqs_userAnnotations = biostrucSeqs_userAnnotations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucSeqsType)) return false;
        BiostrucSeqsType other = (BiostrucSeqsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucSeqs_structure==null && other.getBiostrucSeqs_structure()==null) || 
             (this.biostrucSeqs_structure!=null &&
              this.biostrucSeqs_structure.equals(other.getBiostrucSeqs_structure()))) &&
            ((this.biostrucSeqs_sequences==null && other.getBiostrucSeqs_sequences()==null) || 
             (this.biostrucSeqs_sequences!=null &&
              this.biostrucSeqs_sequences.equals(other.getBiostrucSeqs_sequences()))) &&
            ((this.biostrucSeqs_seqalign==null && other.getBiostrucSeqs_seqalign()==null) || 
             (this.biostrucSeqs_seqalign!=null &&
              this.biostrucSeqs_seqalign.equals(other.getBiostrucSeqs_seqalign()))) &&
            ((this.biostrucSeqs_styleDictionary==null && other.getBiostrucSeqs_styleDictionary()==null) || 
             (this.biostrucSeqs_styleDictionary!=null &&
              this.biostrucSeqs_styleDictionary.equals(other.getBiostrucSeqs_styleDictionary()))) &&
            ((this.biostrucSeqs_userAnnotations==null && other.getBiostrucSeqs_userAnnotations()==null) || 
             (this.biostrucSeqs_userAnnotations!=null &&
              this.biostrucSeqs_userAnnotations.equals(other.getBiostrucSeqs_userAnnotations())));
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
        if (getBiostrucSeqs_structure() != null) {
            _hashCode += getBiostrucSeqs_structure().hashCode();
        }
        if (getBiostrucSeqs_sequences() != null) {
            _hashCode += getBiostrucSeqs_sequences().hashCode();
        }
        if (getBiostrucSeqs_seqalign() != null) {
            _hashCode += getBiostrucSeqs_seqalign().hashCode();
        }
        if (getBiostrucSeqs_styleDictionary() != null) {
            _hashCode += getBiostrucSeqs_styleDictionary().hashCode();
        }
        if (getBiostrucSeqs_userAnnotations() != null) {
            _hashCode += getBiostrucSeqs_userAnnotations().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucSeqsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSeqs_structure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs_structure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs_structureType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSeqs_sequences");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs_sequences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs_sequencesType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSeqs_seqalign");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs_seqalign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs_seqalignType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSeqs_styleDictionary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs_style-dictionary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs_style-dictionaryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSeqs_userAnnotations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs_user-annotations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs_user-annotationsType"));
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
