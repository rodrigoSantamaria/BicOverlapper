/**
 * BiostrucSeqsAlignsCddType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucSeqsAlignsCddType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCdd_seqAlignDataType biostrucSeqsAlignsCdd_seqAlignData;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCdd_structuresType biostrucSeqsAlignsCdd_structures;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCdd_structureTypeType biostrucSeqsAlignsCdd_structureType;

    public BiostrucSeqsAlignsCddType() {
    }

    public BiostrucSeqsAlignsCddType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCdd_seqAlignDataType biostrucSeqsAlignsCdd_seqAlignData,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCdd_structuresType biostrucSeqsAlignsCdd_structures,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCdd_structureTypeType biostrucSeqsAlignsCdd_structureType) {
           this.biostrucSeqsAlignsCdd_seqAlignData = biostrucSeqsAlignsCdd_seqAlignData;
           this.biostrucSeqsAlignsCdd_structures = biostrucSeqsAlignsCdd_structures;
           this.biostrucSeqsAlignsCdd_structureType = biostrucSeqsAlignsCdd_structureType;
    }


    /**
     * Gets the biostrucSeqsAlignsCdd_seqAlignData value for this BiostrucSeqsAlignsCddType.
     * 
     * @return biostrucSeqsAlignsCdd_seqAlignData
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCdd_seqAlignDataType getBiostrucSeqsAlignsCdd_seqAlignData() {
        return biostrucSeqsAlignsCdd_seqAlignData;
    }


    /**
     * Sets the biostrucSeqsAlignsCdd_seqAlignData value for this BiostrucSeqsAlignsCddType.
     * 
     * @param biostrucSeqsAlignsCdd_seqAlignData
     */
    public void setBiostrucSeqsAlignsCdd_seqAlignData(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCdd_seqAlignDataType biostrucSeqsAlignsCdd_seqAlignData) {
        this.biostrucSeqsAlignsCdd_seqAlignData = biostrucSeqsAlignsCdd_seqAlignData;
    }


    /**
     * Gets the biostrucSeqsAlignsCdd_structures value for this BiostrucSeqsAlignsCddType.
     * 
     * @return biostrucSeqsAlignsCdd_structures
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCdd_structuresType getBiostrucSeqsAlignsCdd_structures() {
        return biostrucSeqsAlignsCdd_structures;
    }


    /**
     * Sets the biostrucSeqsAlignsCdd_structures value for this BiostrucSeqsAlignsCddType.
     * 
     * @param biostrucSeqsAlignsCdd_structures
     */
    public void setBiostrucSeqsAlignsCdd_structures(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCdd_structuresType biostrucSeqsAlignsCdd_structures) {
        this.biostrucSeqsAlignsCdd_structures = biostrucSeqsAlignsCdd_structures;
    }


    /**
     * Gets the biostrucSeqsAlignsCdd_structureType value for this BiostrucSeqsAlignsCddType.
     * 
     * @return biostrucSeqsAlignsCdd_structureType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCdd_structureTypeType getBiostrucSeqsAlignsCdd_structureType() {
        return biostrucSeqsAlignsCdd_structureType;
    }


    /**
     * Sets the biostrucSeqsAlignsCdd_structureType value for this BiostrucSeqsAlignsCddType.
     * 
     * @param biostrucSeqsAlignsCdd_structureType
     */
    public void setBiostrucSeqsAlignsCdd_structureType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCdd_structureTypeType biostrucSeqsAlignsCdd_structureType) {
        this.biostrucSeqsAlignsCdd_structureType = biostrucSeqsAlignsCdd_structureType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucSeqsAlignsCddType)) return false;
        BiostrucSeqsAlignsCddType other = (BiostrucSeqsAlignsCddType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucSeqsAlignsCdd_seqAlignData==null && other.getBiostrucSeqsAlignsCdd_seqAlignData()==null) || 
             (this.biostrucSeqsAlignsCdd_seqAlignData!=null &&
              this.biostrucSeqsAlignsCdd_seqAlignData.equals(other.getBiostrucSeqsAlignsCdd_seqAlignData()))) &&
            ((this.biostrucSeqsAlignsCdd_structures==null && other.getBiostrucSeqsAlignsCdd_structures()==null) || 
             (this.biostrucSeqsAlignsCdd_structures!=null &&
              this.biostrucSeqsAlignsCdd_structures.equals(other.getBiostrucSeqsAlignsCdd_structures()))) &&
            ((this.biostrucSeqsAlignsCdd_structureType==null && other.getBiostrucSeqsAlignsCdd_structureType()==null) || 
             (this.biostrucSeqsAlignsCdd_structureType!=null &&
              this.biostrucSeqsAlignsCdd_structureType.equals(other.getBiostrucSeqsAlignsCdd_structureType())));
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
        if (getBiostrucSeqsAlignsCdd_seqAlignData() != null) {
            _hashCode += getBiostrucSeqsAlignsCdd_seqAlignData().hashCode();
        }
        if (getBiostrucSeqsAlignsCdd_structures() != null) {
            _hashCode += getBiostrucSeqsAlignsCdd_structures().hashCode();
        }
        if (getBiostrucSeqsAlignsCdd_structureType() != null) {
            _hashCode += getBiostrucSeqsAlignsCdd_structureType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucSeqsAlignsCddType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs-aligns-cddType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSeqsAlignsCdd_seqAlignData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs-aligns-cdd_seq-align-data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs-aligns-cdd_seq-align-dataType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSeqsAlignsCdd_structures");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs-aligns-cdd_structures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs-aligns-cdd_structuresType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSeqsAlignsCdd_structureType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs-aligns-cdd_structure-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs-aligns-cdd_structure-typeType"));
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
