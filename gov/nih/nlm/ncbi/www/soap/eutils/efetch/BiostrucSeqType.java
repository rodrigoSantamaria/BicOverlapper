/**
 * BiostrucSeqType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucSeqType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeq_structureType biostrucSeq_structure;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeq_sequencesType biostrucSeq_sequences;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeq_styleDictionaryType biostrucSeq_styleDictionary;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeq_userAnnotationsType biostrucSeq_userAnnotations;

    public BiostrucSeqType() {
    }

    public BiostrucSeqType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeq_structureType biostrucSeq_structure,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeq_sequencesType biostrucSeq_sequences,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeq_styleDictionaryType biostrucSeq_styleDictionary,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeq_userAnnotationsType biostrucSeq_userAnnotations) {
           this.biostrucSeq_structure = biostrucSeq_structure;
           this.biostrucSeq_sequences = biostrucSeq_sequences;
           this.biostrucSeq_styleDictionary = biostrucSeq_styleDictionary;
           this.biostrucSeq_userAnnotations = biostrucSeq_userAnnotations;
    }


    /**
     * Gets the biostrucSeq_structure value for this BiostrucSeqType.
     * 
     * @return biostrucSeq_structure
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeq_structureType getBiostrucSeq_structure() {
        return biostrucSeq_structure;
    }


    /**
     * Sets the biostrucSeq_structure value for this BiostrucSeqType.
     * 
     * @param biostrucSeq_structure
     */
    public void setBiostrucSeq_structure(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeq_structureType biostrucSeq_structure) {
        this.biostrucSeq_structure = biostrucSeq_structure;
    }


    /**
     * Gets the biostrucSeq_sequences value for this BiostrucSeqType.
     * 
     * @return biostrucSeq_sequences
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeq_sequencesType getBiostrucSeq_sequences() {
        return biostrucSeq_sequences;
    }


    /**
     * Sets the biostrucSeq_sequences value for this BiostrucSeqType.
     * 
     * @param biostrucSeq_sequences
     */
    public void setBiostrucSeq_sequences(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeq_sequencesType biostrucSeq_sequences) {
        this.biostrucSeq_sequences = biostrucSeq_sequences;
    }


    /**
     * Gets the biostrucSeq_styleDictionary value for this BiostrucSeqType.
     * 
     * @return biostrucSeq_styleDictionary
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeq_styleDictionaryType getBiostrucSeq_styleDictionary() {
        return biostrucSeq_styleDictionary;
    }


    /**
     * Sets the biostrucSeq_styleDictionary value for this BiostrucSeqType.
     * 
     * @param biostrucSeq_styleDictionary
     */
    public void setBiostrucSeq_styleDictionary(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeq_styleDictionaryType biostrucSeq_styleDictionary) {
        this.biostrucSeq_styleDictionary = biostrucSeq_styleDictionary;
    }


    /**
     * Gets the biostrucSeq_userAnnotations value for this BiostrucSeqType.
     * 
     * @return biostrucSeq_userAnnotations
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeq_userAnnotationsType getBiostrucSeq_userAnnotations() {
        return biostrucSeq_userAnnotations;
    }


    /**
     * Sets the biostrucSeq_userAnnotations value for this BiostrucSeqType.
     * 
     * @param biostrucSeq_userAnnotations
     */
    public void setBiostrucSeq_userAnnotations(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeq_userAnnotationsType biostrucSeq_userAnnotations) {
        this.biostrucSeq_userAnnotations = biostrucSeq_userAnnotations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucSeqType)) return false;
        BiostrucSeqType other = (BiostrucSeqType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucSeq_structure==null && other.getBiostrucSeq_structure()==null) || 
             (this.biostrucSeq_structure!=null &&
              this.biostrucSeq_structure.equals(other.getBiostrucSeq_structure()))) &&
            ((this.biostrucSeq_sequences==null && other.getBiostrucSeq_sequences()==null) || 
             (this.biostrucSeq_sequences!=null &&
              this.biostrucSeq_sequences.equals(other.getBiostrucSeq_sequences()))) &&
            ((this.biostrucSeq_styleDictionary==null && other.getBiostrucSeq_styleDictionary()==null) || 
             (this.biostrucSeq_styleDictionary!=null &&
              this.biostrucSeq_styleDictionary.equals(other.getBiostrucSeq_styleDictionary()))) &&
            ((this.biostrucSeq_userAnnotations==null && other.getBiostrucSeq_userAnnotations()==null) || 
             (this.biostrucSeq_userAnnotations!=null &&
              this.biostrucSeq_userAnnotations.equals(other.getBiostrucSeq_userAnnotations())));
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
        if (getBiostrucSeq_structure() != null) {
            _hashCode += getBiostrucSeq_structure().hashCode();
        }
        if (getBiostrucSeq_sequences() != null) {
            _hashCode += getBiostrucSeq_sequences().hashCode();
        }
        if (getBiostrucSeq_styleDictionary() != null) {
            _hashCode += getBiostrucSeq_styleDictionary().hashCode();
        }
        if (getBiostrucSeq_userAnnotations() != null) {
            _hashCode += getBiostrucSeq_userAnnotations().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucSeqType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSeq_structure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seq_structure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seq_structureType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSeq_sequences");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seq_sequences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seq_sequencesType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSeq_styleDictionary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seq_style-dictionary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seq_style-dictionaryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSeq_userAnnotations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seq_user-annotations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seq_user-annotationsType"));
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
