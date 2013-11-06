/**
 * BiostrucSeqsAlignsCdd_seqAlignData_cddType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucSeqsAlignsCdd_seqAlignData_cddType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddType cdd;

    public BiostrucSeqsAlignsCdd_seqAlignData_cddType() {
    }

    public BiostrucSeqsAlignsCdd_seqAlignData_cddType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddType cdd) {
           this.cdd = cdd;
    }


    /**
     * Gets the cdd value for this BiostrucSeqsAlignsCdd_seqAlignData_cddType.
     * 
     * @return cdd
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddType getCdd() {
        return cdd;
    }


    /**
     * Sets the cdd value for this BiostrucSeqsAlignsCdd_seqAlignData_cddType.
     * 
     * @param cdd
     */
    public void setCdd(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddType cdd) {
        this.cdd = cdd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucSeqsAlignsCdd_seqAlignData_cddType)) return false;
        BiostrucSeqsAlignsCdd_seqAlignData_cddType other = (BiostrucSeqsAlignsCdd_seqAlignData_cddType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cdd==null && other.getCdd()==null) || 
             (this.cdd!=null &&
              this.cdd.equals(other.getCdd())));
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
        if (getCdd() != null) {
            _hashCode += getCdd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucSeqsAlignsCdd_seqAlignData_cddType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs-aligns-cdd_seq-align-data_cddType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "CddType"));
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
