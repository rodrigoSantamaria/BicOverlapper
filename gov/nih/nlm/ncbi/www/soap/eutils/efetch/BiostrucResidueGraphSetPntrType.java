/**
 * BiostrucResidueGraphSetPntrType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucResidueGraphSetPntrType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucResidueGraphSetPntr_biostrucResidueGraphSetIdType biostrucResidueGraphSetPntr_biostrucResidueGraphSetId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucResidueGraphSetPntr_residueGraphIdType biostrucResidueGraphSetPntr_residueGraphId;

    public BiostrucResidueGraphSetPntrType() {
    }

    public BiostrucResidueGraphSetPntrType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucResidueGraphSetPntr_biostrucResidueGraphSetIdType biostrucResidueGraphSetPntr_biostrucResidueGraphSetId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucResidueGraphSetPntr_residueGraphIdType biostrucResidueGraphSetPntr_residueGraphId) {
           this.biostrucResidueGraphSetPntr_biostrucResidueGraphSetId = biostrucResidueGraphSetPntr_biostrucResidueGraphSetId;
           this.biostrucResidueGraphSetPntr_residueGraphId = biostrucResidueGraphSetPntr_residueGraphId;
    }


    /**
     * Gets the biostrucResidueGraphSetPntr_biostrucResidueGraphSetId value for this BiostrucResidueGraphSetPntrType.
     * 
     * @return biostrucResidueGraphSetPntr_biostrucResidueGraphSetId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucResidueGraphSetPntr_biostrucResidueGraphSetIdType getBiostrucResidueGraphSetPntr_biostrucResidueGraphSetId() {
        return biostrucResidueGraphSetPntr_biostrucResidueGraphSetId;
    }


    /**
     * Sets the biostrucResidueGraphSetPntr_biostrucResidueGraphSetId value for this BiostrucResidueGraphSetPntrType.
     * 
     * @param biostrucResidueGraphSetPntr_biostrucResidueGraphSetId
     */
    public void setBiostrucResidueGraphSetPntr_biostrucResidueGraphSetId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucResidueGraphSetPntr_biostrucResidueGraphSetIdType biostrucResidueGraphSetPntr_biostrucResidueGraphSetId) {
        this.biostrucResidueGraphSetPntr_biostrucResidueGraphSetId = biostrucResidueGraphSetPntr_biostrucResidueGraphSetId;
    }


    /**
     * Gets the biostrucResidueGraphSetPntr_residueGraphId value for this BiostrucResidueGraphSetPntrType.
     * 
     * @return biostrucResidueGraphSetPntr_residueGraphId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucResidueGraphSetPntr_residueGraphIdType getBiostrucResidueGraphSetPntr_residueGraphId() {
        return biostrucResidueGraphSetPntr_residueGraphId;
    }


    /**
     * Sets the biostrucResidueGraphSetPntr_residueGraphId value for this BiostrucResidueGraphSetPntrType.
     * 
     * @param biostrucResidueGraphSetPntr_residueGraphId
     */
    public void setBiostrucResidueGraphSetPntr_residueGraphId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucResidueGraphSetPntr_residueGraphIdType biostrucResidueGraphSetPntr_residueGraphId) {
        this.biostrucResidueGraphSetPntr_residueGraphId = biostrucResidueGraphSetPntr_residueGraphId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucResidueGraphSetPntrType)) return false;
        BiostrucResidueGraphSetPntrType other = (BiostrucResidueGraphSetPntrType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucResidueGraphSetPntr_biostrucResidueGraphSetId==null && other.getBiostrucResidueGraphSetPntr_biostrucResidueGraphSetId()==null) || 
             (this.biostrucResidueGraphSetPntr_biostrucResidueGraphSetId!=null &&
              this.biostrucResidueGraphSetPntr_biostrucResidueGraphSetId.equals(other.getBiostrucResidueGraphSetPntr_biostrucResidueGraphSetId()))) &&
            ((this.biostrucResidueGraphSetPntr_residueGraphId==null && other.getBiostrucResidueGraphSetPntr_residueGraphId()==null) || 
             (this.biostrucResidueGraphSetPntr_residueGraphId!=null &&
              this.biostrucResidueGraphSetPntr_residueGraphId.equals(other.getBiostrucResidueGraphSetPntr_residueGraphId())));
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
        if (getBiostrucResidueGraphSetPntr_biostrucResidueGraphSetId() != null) {
            _hashCode += getBiostrucResidueGraphSetPntr_biostrucResidueGraphSetId().hashCode();
        }
        if (getBiostrucResidueGraphSetPntr_residueGraphId() != null) {
            _hashCode += getBiostrucResidueGraphSetPntr_residueGraphId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucResidueGraphSetPntrType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-residue-graph-set-pntrType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucResidueGraphSetPntr_biostrucResidueGraphSetId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-residue-graph-set-pntr_biostruc-residue-graph-set-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-residue-graph-set-pntr_biostruc-residue-graph-set-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucResidueGraphSetPntr_residueGraphId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-residue-graph-set-pntr_residue-graph-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-residue-graph-set-pntr_residue-graph-idType"));
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
