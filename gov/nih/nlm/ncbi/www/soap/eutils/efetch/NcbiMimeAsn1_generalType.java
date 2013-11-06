/**
 * NcbiMimeAsn1_generalType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class NcbiMimeAsn1_generalType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCddType biostrucSeqsAlignsCdd;

    public NcbiMimeAsn1_generalType() {
    }

    public NcbiMimeAsn1_generalType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCddType biostrucSeqsAlignsCdd) {
           this.biostrucSeqsAlignsCdd = biostrucSeqsAlignsCdd;
    }


    /**
     * Gets the biostrucSeqsAlignsCdd value for this NcbiMimeAsn1_generalType.
     * 
     * @return biostrucSeqsAlignsCdd
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCddType getBiostrucSeqsAlignsCdd() {
        return biostrucSeqsAlignsCdd;
    }


    /**
     * Sets the biostrucSeqsAlignsCdd value for this NcbiMimeAsn1_generalType.
     * 
     * @param biostrucSeqsAlignsCdd
     */
    public void setBiostrucSeqsAlignsCdd(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSeqsAlignsCddType biostrucSeqsAlignsCdd) {
        this.biostrucSeqsAlignsCdd = biostrucSeqsAlignsCdd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NcbiMimeAsn1_generalType)) return false;
        NcbiMimeAsn1_generalType other = (NcbiMimeAsn1_generalType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucSeqsAlignsCdd==null && other.getBiostrucSeqsAlignsCdd()==null) || 
             (this.biostrucSeqsAlignsCdd!=null &&
              this.biostrucSeqsAlignsCdd.equals(other.getBiostrucSeqsAlignsCdd())));
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
        if (getBiostrucSeqsAlignsCdd() != null) {
            _hashCode += getBiostrucSeqsAlignsCdd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NcbiMimeAsn1_generalType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Ncbi-mime-asn1_generalType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSeqsAlignsCdd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs-aligns-cdd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs-aligns-cddType"));
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
