/**
 * NcbiMimeAsn1_strucseqsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class NcbiMimeAsn1_strucseqsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsType biostrucSeqs;

    public NcbiMimeAsn1_strucseqsType() {
    }

    public NcbiMimeAsn1_strucseqsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsType biostrucSeqs) {
           this.biostrucSeqs = biostrucSeqs;
    }


    /**
     * Gets the biostrucSeqs value for this NcbiMimeAsn1_strucseqsType.
     * 
     * @return biostrucSeqs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsType getBiostrucSeqs() {
        return biostrucSeqs;
    }


    /**
     * Sets the biostrucSeqs value for this NcbiMimeAsn1_strucseqsType.
     * 
     * @param biostrucSeqs
     */
    public void setBiostrucSeqs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsType biostrucSeqs) {
        this.biostrucSeqs = biostrucSeqs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NcbiMimeAsn1_strucseqsType)) return false;
        NcbiMimeAsn1_strucseqsType other = (NcbiMimeAsn1_strucseqsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucSeqs==null && other.getBiostrucSeqs()==null) || 
             (this.biostrucSeqs!=null &&
              this.biostrucSeqs.equals(other.getBiostrucSeqs())));
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
        if (getBiostrucSeqs() != null) {
            _hashCode += getBiostrucSeqs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NcbiMimeAsn1_strucseqsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ncbi-mime-asn1_strucseqsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSeqs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqsType"));
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
