/**
 * SeqIntervalType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqIntervalType  implements java.io.Serializable {
    private java.lang.String seqInterval_from;

    private java.lang.String seqInterval_to;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInterval_strandType seqInterval_strand;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInterval_idType seqInterval_id;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInterval_fuzzFromType seqInterval_fuzzFrom;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInterval_fuzzToType seqInterval_fuzzTo;

    public SeqIntervalType() {
    }

    public SeqIntervalType(
           java.lang.String seqInterval_from,
           java.lang.String seqInterval_to,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInterval_strandType seqInterval_strand,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInterval_idType seqInterval_id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInterval_fuzzFromType seqInterval_fuzzFrom,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInterval_fuzzToType seqInterval_fuzzTo) {
           this.seqInterval_from = seqInterval_from;
           this.seqInterval_to = seqInterval_to;
           this.seqInterval_strand = seqInterval_strand;
           this.seqInterval_id = seqInterval_id;
           this.seqInterval_fuzzFrom = seqInterval_fuzzFrom;
           this.seqInterval_fuzzTo = seqInterval_fuzzTo;
    }


    /**
     * Gets the seqInterval_from value for this SeqIntervalType.
     * 
     * @return seqInterval_from
     */
    public java.lang.String getSeqInterval_from() {
        return seqInterval_from;
    }


    /**
     * Sets the seqInterval_from value for this SeqIntervalType.
     * 
     * @param seqInterval_from
     */
    public void setSeqInterval_from(java.lang.String seqInterval_from) {
        this.seqInterval_from = seqInterval_from;
    }


    /**
     * Gets the seqInterval_to value for this SeqIntervalType.
     * 
     * @return seqInterval_to
     */
    public java.lang.String getSeqInterval_to() {
        return seqInterval_to;
    }


    /**
     * Sets the seqInterval_to value for this SeqIntervalType.
     * 
     * @param seqInterval_to
     */
    public void setSeqInterval_to(java.lang.String seqInterval_to) {
        this.seqInterval_to = seqInterval_to;
    }


    /**
     * Gets the seqInterval_strand value for this SeqIntervalType.
     * 
     * @return seqInterval_strand
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInterval_strandType getSeqInterval_strand() {
        return seqInterval_strand;
    }


    /**
     * Sets the seqInterval_strand value for this SeqIntervalType.
     * 
     * @param seqInterval_strand
     */
    public void setSeqInterval_strand(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInterval_strandType seqInterval_strand) {
        this.seqInterval_strand = seqInterval_strand;
    }


    /**
     * Gets the seqInterval_id value for this SeqIntervalType.
     * 
     * @return seqInterval_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInterval_idType getSeqInterval_id() {
        return seqInterval_id;
    }


    /**
     * Sets the seqInterval_id value for this SeqIntervalType.
     * 
     * @param seqInterval_id
     */
    public void setSeqInterval_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInterval_idType seqInterval_id) {
        this.seqInterval_id = seqInterval_id;
    }


    /**
     * Gets the seqInterval_fuzzFrom value for this SeqIntervalType.
     * 
     * @return seqInterval_fuzzFrom
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInterval_fuzzFromType getSeqInterval_fuzzFrom() {
        return seqInterval_fuzzFrom;
    }


    /**
     * Sets the seqInterval_fuzzFrom value for this SeqIntervalType.
     * 
     * @param seqInterval_fuzzFrom
     */
    public void setSeqInterval_fuzzFrom(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInterval_fuzzFromType seqInterval_fuzzFrom) {
        this.seqInterval_fuzzFrom = seqInterval_fuzzFrom;
    }


    /**
     * Gets the seqInterval_fuzzTo value for this SeqIntervalType.
     * 
     * @return seqInterval_fuzzTo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInterval_fuzzToType getSeqInterval_fuzzTo() {
        return seqInterval_fuzzTo;
    }


    /**
     * Sets the seqInterval_fuzzTo value for this SeqIntervalType.
     * 
     * @param seqInterval_fuzzTo
     */
    public void setSeqInterval_fuzzTo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqInterval_fuzzToType seqInterval_fuzzTo) {
        this.seqInterval_fuzzTo = seqInterval_fuzzTo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqIntervalType)) return false;
        SeqIntervalType other = (SeqIntervalType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqInterval_from==null && other.getSeqInterval_from()==null) || 
             (this.seqInterval_from!=null &&
              this.seqInterval_from.equals(other.getSeqInterval_from()))) &&
            ((this.seqInterval_to==null && other.getSeqInterval_to()==null) || 
             (this.seqInterval_to!=null &&
              this.seqInterval_to.equals(other.getSeqInterval_to()))) &&
            ((this.seqInterval_strand==null && other.getSeqInterval_strand()==null) || 
             (this.seqInterval_strand!=null &&
              this.seqInterval_strand.equals(other.getSeqInterval_strand()))) &&
            ((this.seqInterval_id==null && other.getSeqInterval_id()==null) || 
             (this.seqInterval_id!=null &&
              this.seqInterval_id.equals(other.getSeqInterval_id()))) &&
            ((this.seqInterval_fuzzFrom==null && other.getSeqInterval_fuzzFrom()==null) || 
             (this.seqInterval_fuzzFrom!=null &&
              this.seqInterval_fuzzFrom.equals(other.getSeqInterval_fuzzFrom()))) &&
            ((this.seqInterval_fuzzTo==null && other.getSeqInterval_fuzzTo()==null) || 
             (this.seqInterval_fuzzTo!=null &&
              this.seqInterval_fuzzTo.equals(other.getSeqInterval_fuzzTo())));
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
        if (getSeqInterval_from() != null) {
            _hashCode += getSeqInterval_from().hashCode();
        }
        if (getSeqInterval_to() != null) {
            _hashCode += getSeqInterval_to().hashCode();
        }
        if (getSeqInterval_strand() != null) {
            _hashCode += getSeqInterval_strand().hashCode();
        }
        if (getSeqInterval_id() != null) {
            _hashCode += getSeqInterval_id().hashCode();
        }
        if (getSeqInterval_fuzzFrom() != null) {
            _hashCode += getSeqInterval_fuzzFrom().hashCode();
        }
        if (getSeqInterval_fuzzTo() != null) {
            _hashCode += getSeqInterval_fuzzTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqIntervalType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-intervalType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqInterval_from");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-interval_from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqInterval_to");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-interval_to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqInterval_strand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-interval_strand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-interval_strandType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqInterval_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-interval_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-interval_idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqInterval_fuzzFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-interval_fuzz-from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-interval_fuzz-fromType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqInterval_fuzzTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-interval_fuzz-to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-interval_fuzz-toType"));
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
