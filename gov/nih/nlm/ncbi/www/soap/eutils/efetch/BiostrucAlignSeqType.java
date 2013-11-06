/**
 * BiostrucAlignSeqType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucAlignSeqType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAlignSeq_sequencesType biostrucAlignSeq_sequences;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAlignSeq_seqalignType biostrucAlignSeq_seqalign;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAlignSeq_styleDictionaryType biostrucAlignSeq_styleDictionary;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAlignSeq_userAnnotationsType biostrucAlignSeq_userAnnotations;

    public BiostrucAlignSeqType() {
    }

    public BiostrucAlignSeqType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAlignSeq_sequencesType biostrucAlignSeq_sequences,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAlignSeq_seqalignType biostrucAlignSeq_seqalign,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAlignSeq_styleDictionaryType biostrucAlignSeq_styleDictionary,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAlignSeq_userAnnotationsType biostrucAlignSeq_userAnnotations) {
           this.biostrucAlignSeq_sequences = biostrucAlignSeq_sequences;
           this.biostrucAlignSeq_seqalign = biostrucAlignSeq_seqalign;
           this.biostrucAlignSeq_styleDictionary = biostrucAlignSeq_styleDictionary;
           this.biostrucAlignSeq_userAnnotations = biostrucAlignSeq_userAnnotations;
    }


    /**
     * Gets the biostrucAlignSeq_sequences value for this BiostrucAlignSeqType.
     * 
     * @return biostrucAlignSeq_sequences
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAlignSeq_sequencesType getBiostrucAlignSeq_sequences() {
        return biostrucAlignSeq_sequences;
    }


    /**
     * Sets the biostrucAlignSeq_sequences value for this BiostrucAlignSeqType.
     * 
     * @param biostrucAlignSeq_sequences
     */
    public void setBiostrucAlignSeq_sequences(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAlignSeq_sequencesType biostrucAlignSeq_sequences) {
        this.biostrucAlignSeq_sequences = biostrucAlignSeq_sequences;
    }


    /**
     * Gets the biostrucAlignSeq_seqalign value for this BiostrucAlignSeqType.
     * 
     * @return biostrucAlignSeq_seqalign
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAlignSeq_seqalignType getBiostrucAlignSeq_seqalign() {
        return biostrucAlignSeq_seqalign;
    }


    /**
     * Sets the biostrucAlignSeq_seqalign value for this BiostrucAlignSeqType.
     * 
     * @param biostrucAlignSeq_seqalign
     */
    public void setBiostrucAlignSeq_seqalign(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAlignSeq_seqalignType biostrucAlignSeq_seqalign) {
        this.biostrucAlignSeq_seqalign = biostrucAlignSeq_seqalign;
    }


    /**
     * Gets the biostrucAlignSeq_styleDictionary value for this BiostrucAlignSeqType.
     * 
     * @return biostrucAlignSeq_styleDictionary
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAlignSeq_styleDictionaryType getBiostrucAlignSeq_styleDictionary() {
        return biostrucAlignSeq_styleDictionary;
    }


    /**
     * Sets the biostrucAlignSeq_styleDictionary value for this BiostrucAlignSeqType.
     * 
     * @param biostrucAlignSeq_styleDictionary
     */
    public void setBiostrucAlignSeq_styleDictionary(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAlignSeq_styleDictionaryType biostrucAlignSeq_styleDictionary) {
        this.biostrucAlignSeq_styleDictionary = biostrucAlignSeq_styleDictionary;
    }


    /**
     * Gets the biostrucAlignSeq_userAnnotations value for this BiostrucAlignSeqType.
     * 
     * @return biostrucAlignSeq_userAnnotations
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAlignSeq_userAnnotationsType getBiostrucAlignSeq_userAnnotations() {
        return biostrucAlignSeq_userAnnotations;
    }


    /**
     * Sets the biostrucAlignSeq_userAnnotations value for this BiostrucAlignSeqType.
     * 
     * @param biostrucAlignSeq_userAnnotations
     */
    public void setBiostrucAlignSeq_userAnnotations(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucAlignSeq_userAnnotationsType biostrucAlignSeq_userAnnotations) {
        this.biostrucAlignSeq_userAnnotations = biostrucAlignSeq_userAnnotations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucAlignSeqType)) return false;
        BiostrucAlignSeqType other = (BiostrucAlignSeqType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucAlignSeq_sequences==null && other.getBiostrucAlignSeq_sequences()==null) || 
             (this.biostrucAlignSeq_sequences!=null &&
              this.biostrucAlignSeq_sequences.equals(other.getBiostrucAlignSeq_sequences()))) &&
            ((this.biostrucAlignSeq_seqalign==null && other.getBiostrucAlignSeq_seqalign()==null) || 
             (this.biostrucAlignSeq_seqalign!=null &&
              this.biostrucAlignSeq_seqalign.equals(other.getBiostrucAlignSeq_seqalign()))) &&
            ((this.biostrucAlignSeq_styleDictionary==null && other.getBiostrucAlignSeq_styleDictionary()==null) || 
             (this.biostrucAlignSeq_styleDictionary!=null &&
              this.biostrucAlignSeq_styleDictionary.equals(other.getBiostrucAlignSeq_styleDictionary()))) &&
            ((this.biostrucAlignSeq_userAnnotations==null && other.getBiostrucAlignSeq_userAnnotations()==null) || 
             (this.biostrucAlignSeq_userAnnotations!=null &&
              this.biostrucAlignSeq_userAnnotations.equals(other.getBiostrucAlignSeq_userAnnotations())));
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
        if (getBiostrucAlignSeq_sequences() != null) {
            _hashCode += getBiostrucAlignSeq_sequences().hashCode();
        }
        if (getBiostrucAlignSeq_seqalign() != null) {
            _hashCode += getBiostrucAlignSeq_seqalign().hashCode();
        }
        if (getBiostrucAlignSeq_styleDictionary() != null) {
            _hashCode += getBiostrucAlignSeq_styleDictionary().hashCode();
        }
        if (getBiostrucAlignSeq_userAnnotations() != null) {
            _hashCode += getBiostrucAlignSeq_userAnnotations().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucAlignSeqType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-align-seqType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucAlignSeq_sequences");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-align-seq_sequences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-align-seq_sequencesType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucAlignSeq_seqalign");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-align-seq_seqalign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-align-seq_seqalignType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucAlignSeq_styleDictionary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-align-seq_style-dictionary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-align-seq_style-dictionaryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucAlignSeq_userAnnotations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-align-seq_user-annotations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-align-seq_user-annotationsType"));
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
