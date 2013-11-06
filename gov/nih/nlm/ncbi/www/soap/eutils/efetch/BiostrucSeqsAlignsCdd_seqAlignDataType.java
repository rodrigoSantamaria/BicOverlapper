/**
 * BiostrucSeqsAlignsCdd_seqAlignDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucSeqsAlignsCdd_seqAlignDataType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCdd_seqAlignData_bundleType biostrucSeqsAlignsCdd_seqAlignData_bundle;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCdd_seqAlignData_cddType biostrucSeqsAlignsCdd_seqAlignData_cdd;

    public BiostrucSeqsAlignsCdd_seqAlignDataType() {
    }

    public BiostrucSeqsAlignsCdd_seqAlignDataType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCdd_seqAlignData_bundleType biostrucSeqsAlignsCdd_seqAlignData_bundle,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCdd_seqAlignData_cddType biostrucSeqsAlignsCdd_seqAlignData_cdd) {
           this.biostrucSeqsAlignsCdd_seqAlignData_bundle = biostrucSeqsAlignsCdd_seqAlignData_bundle;
           this.biostrucSeqsAlignsCdd_seqAlignData_cdd = biostrucSeqsAlignsCdd_seqAlignData_cdd;
    }


    /**
     * Gets the biostrucSeqsAlignsCdd_seqAlignData_bundle value for this BiostrucSeqsAlignsCdd_seqAlignDataType.
     * 
     * @return biostrucSeqsAlignsCdd_seqAlignData_bundle
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCdd_seqAlignData_bundleType getBiostrucSeqsAlignsCdd_seqAlignData_bundle() {
        return biostrucSeqsAlignsCdd_seqAlignData_bundle;
    }


    /**
     * Sets the biostrucSeqsAlignsCdd_seqAlignData_bundle value for this BiostrucSeqsAlignsCdd_seqAlignDataType.
     * 
     * @param biostrucSeqsAlignsCdd_seqAlignData_bundle
     */
    public void setBiostrucSeqsAlignsCdd_seqAlignData_bundle(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCdd_seqAlignData_bundleType biostrucSeqsAlignsCdd_seqAlignData_bundle) {
        this.biostrucSeqsAlignsCdd_seqAlignData_bundle = biostrucSeqsAlignsCdd_seqAlignData_bundle;
    }


    /**
     * Gets the biostrucSeqsAlignsCdd_seqAlignData_cdd value for this BiostrucSeqsAlignsCdd_seqAlignDataType.
     * 
     * @return biostrucSeqsAlignsCdd_seqAlignData_cdd
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCdd_seqAlignData_cddType getBiostrucSeqsAlignsCdd_seqAlignData_cdd() {
        return biostrucSeqsAlignsCdd_seqAlignData_cdd;
    }


    /**
     * Sets the biostrucSeqsAlignsCdd_seqAlignData_cdd value for this BiostrucSeqsAlignsCdd_seqAlignDataType.
     * 
     * @param biostrucSeqsAlignsCdd_seqAlignData_cdd
     */
    public void setBiostrucSeqsAlignsCdd_seqAlignData_cdd(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCdd_seqAlignData_cddType biostrucSeqsAlignsCdd_seqAlignData_cdd) {
        this.biostrucSeqsAlignsCdd_seqAlignData_cdd = biostrucSeqsAlignsCdd_seqAlignData_cdd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucSeqsAlignsCdd_seqAlignDataType)) return false;
        BiostrucSeqsAlignsCdd_seqAlignDataType other = (BiostrucSeqsAlignsCdd_seqAlignDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucSeqsAlignsCdd_seqAlignData_bundle==null && other.getBiostrucSeqsAlignsCdd_seqAlignData_bundle()==null) || 
             (this.biostrucSeqsAlignsCdd_seqAlignData_bundle!=null &&
              this.biostrucSeqsAlignsCdd_seqAlignData_bundle.equals(other.getBiostrucSeqsAlignsCdd_seqAlignData_bundle()))) &&
            ((this.biostrucSeqsAlignsCdd_seqAlignData_cdd==null && other.getBiostrucSeqsAlignsCdd_seqAlignData_cdd()==null) || 
             (this.biostrucSeqsAlignsCdd_seqAlignData_cdd!=null &&
              this.biostrucSeqsAlignsCdd_seqAlignData_cdd.equals(other.getBiostrucSeqsAlignsCdd_seqAlignData_cdd())));
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
        if (getBiostrucSeqsAlignsCdd_seqAlignData_bundle() != null) {
            _hashCode += getBiostrucSeqsAlignsCdd_seqAlignData_bundle().hashCode();
        }
        if (getBiostrucSeqsAlignsCdd_seqAlignData_cdd() != null) {
            _hashCode += getBiostrucSeqsAlignsCdd_seqAlignData_cdd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucSeqsAlignsCdd_seqAlignDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs-aligns-cdd_seq-align-dataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSeqsAlignsCdd_seqAlignData_bundle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs-aligns-cdd_seq-align-data_bundle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs-aligns-cdd_seq-align-data_bundleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSeqsAlignsCdd_seqAlignData_cdd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs-aligns-cdd_seq-align-data_cdd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs-aligns-cdd_seq-align-data_cddType"));
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
