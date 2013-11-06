/**
 * BiostrucSeqsAlignsCdd_seqAlignData_bundleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucSeqsAlignsCdd_seqAlignData_bundleType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BundleSeqsAlignsType bundleSeqsAligns;

    public BiostrucSeqsAlignsCdd_seqAlignData_bundleType() {
    }

    public BiostrucSeqsAlignsCdd_seqAlignData_bundleType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BundleSeqsAlignsType bundleSeqsAligns) {
           this.bundleSeqsAligns = bundleSeqsAligns;
    }


    /**
     * Gets the bundleSeqsAligns value for this BiostrucSeqsAlignsCdd_seqAlignData_bundleType.
     * 
     * @return bundleSeqsAligns
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BundleSeqsAlignsType getBundleSeqsAligns() {
        return bundleSeqsAligns;
    }


    /**
     * Sets the bundleSeqsAligns value for this BiostrucSeqsAlignsCdd_seqAlignData_bundleType.
     * 
     * @param bundleSeqsAligns
     */
    public void setBundleSeqsAligns(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BundleSeqsAlignsType bundleSeqsAligns) {
        this.bundleSeqsAligns = bundleSeqsAligns;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucSeqsAlignsCdd_seqAlignData_bundleType)) return false;
        BiostrucSeqsAlignsCdd_seqAlignData_bundleType other = (BiostrucSeqsAlignsCdd_seqAlignData_bundleType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bundleSeqsAligns==null && other.getBundleSeqsAligns()==null) || 
             (this.bundleSeqsAligns!=null &&
              this.bundleSeqsAligns.equals(other.getBundleSeqsAligns())));
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
        if (getBundleSeqsAligns() != null) {
            _hashCode += getBundleSeqsAligns().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucSeqsAlignsCdd_seqAlignData_bundleType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-seqs-aligns-cdd_seq-align-data_bundleType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundleSeqsAligns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bundle-seqs-aligns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bundle-seqs-alignsType"));
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
