/**
 * SeqHistType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqHistType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHist_assemblyType seqHist_assembly;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHist_replacesType seqHist_replaces;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHist_replacedByType seqHist_replacedBy;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHist_deletedType seqHist_deleted;

    public SeqHistType() {
    }

    public SeqHistType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHist_assemblyType seqHist_assembly,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHist_replacesType seqHist_replaces,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHist_replacedByType seqHist_replacedBy,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHist_deletedType seqHist_deleted) {
           this.seqHist_assembly = seqHist_assembly;
           this.seqHist_replaces = seqHist_replaces;
           this.seqHist_replacedBy = seqHist_replacedBy;
           this.seqHist_deleted = seqHist_deleted;
    }


    /**
     * Gets the seqHist_assembly value for this SeqHistType.
     * 
     * @return seqHist_assembly
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHist_assemblyType getSeqHist_assembly() {
        return seqHist_assembly;
    }


    /**
     * Sets the seqHist_assembly value for this SeqHistType.
     * 
     * @param seqHist_assembly
     */
    public void setSeqHist_assembly(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHist_assemblyType seqHist_assembly) {
        this.seqHist_assembly = seqHist_assembly;
    }


    /**
     * Gets the seqHist_replaces value for this SeqHistType.
     * 
     * @return seqHist_replaces
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHist_replacesType getSeqHist_replaces() {
        return seqHist_replaces;
    }


    /**
     * Sets the seqHist_replaces value for this SeqHistType.
     * 
     * @param seqHist_replaces
     */
    public void setSeqHist_replaces(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHist_replacesType seqHist_replaces) {
        this.seqHist_replaces = seqHist_replaces;
    }


    /**
     * Gets the seqHist_replacedBy value for this SeqHistType.
     * 
     * @return seqHist_replacedBy
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHist_replacedByType getSeqHist_replacedBy() {
        return seqHist_replacedBy;
    }


    /**
     * Sets the seqHist_replacedBy value for this SeqHistType.
     * 
     * @param seqHist_replacedBy
     */
    public void setSeqHist_replacedBy(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHist_replacedByType seqHist_replacedBy) {
        this.seqHist_replacedBy = seqHist_replacedBy;
    }


    /**
     * Gets the seqHist_deleted value for this SeqHistType.
     * 
     * @return seqHist_deleted
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHist_deletedType getSeqHist_deleted() {
        return seqHist_deleted;
    }


    /**
     * Sets the seqHist_deleted value for this SeqHistType.
     * 
     * @param seqHist_deleted
     */
    public void setSeqHist_deleted(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqHist_deletedType seqHist_deleted) {
        this.seqHist_deleted = seqHist_deleted;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqHistType)) return false;
        SeqHistType other = (SeqHistType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqHist_assembly==null && other.getSeqHist_assembly()==null) || 
             (this.seqHist_assembly!=null &&
              this.seqHist_assembly.equals(other.getSeqHist_assembly()))) &&
            ((this.seqHist_replaces==null && other.getSeqHist_replaces()==null) || 
             (this.seqHist_replaces!=null &&
              this.seqHist_replaces.equals(other.getSeqHist_replaces()))) &&
            ((this.seqHist_replacedBy==null && other.getSeqHist_replacedBy()==null) || 
             (this.seqHist_replacedBy!=null &&
              this.seqHist_replacedBy.equals(other.getSeqHist_replacedBy()))) &&
            ((this.seqHist_deleted==null && other.getSeqHist_deleted()==null) || 
             (this.seqHist_deleted!=null &&
              this.seqHist_deleted.equals(other.getSeqHist_deleted())));
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
        if (getSeqHist_assembly() != null) {
            _hashCode += getSeqHist_assembly().hashCode();
        }
        if (getSeqHist_replaces() != null) {
            _hashCode += getSeqHist_replaces().hashCode();
        }
        if (getSeqHist_replacedBy() != null) {
            _hashCode += getSeqHist_replacedBy().hashCode();
        }
        if (getSeqHist_deleted() != null) {
            _hashCode += getSeqHist_deleted().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqHistType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-histType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqHist_assembly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-hist_assembly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-hist_assemblyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqHist_replaces");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-hist_replaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-hist_replacesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqHist_replacedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-hist_replaced-by"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-hist_replaced-byType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqHist_deleted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-hist_deleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-hist_deletedType"));
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
