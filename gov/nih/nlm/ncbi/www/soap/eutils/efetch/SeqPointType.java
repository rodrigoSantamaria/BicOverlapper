/**
 * SeqPointType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqPointType  implements java.io.Serializable {
    private java.lang.String seqPoint_point;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqPoint_strandType seqPoint_strand;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqPoint_idType seqPoint_id;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqPoint_fuzzType seqPoint_fuzz;

    public SeqPointType() {
    }

    public SeqPointType(
           java.lang.String seqPoint_point,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqPoint_strandType seqPoint_strand,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqPoint_idType seqPoint_id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqPoint_fuzzType seqPoint_fuzz) {
           this.seqPoint_point = seqPoint_point;
           this.seqPoint_strand = seqPoint_strand;
           this.seqPoint_id = seqPoint_id;
           this.seqPoint_fuzz = seqPoint_fuzz;
    }


    /**
     * Gets the seqPoint_point value for this SeqPointType.
     * 
     * @return seqPoint_point
     */
    public java.lang.String getSeqPoint_point() {
        return seqPoint_point;
    }


    /**
     * Sets the seqPoint_point value for this SeqPointType.
     * 
     * @param seqPoint_point
     */
    public void setSeqPoint_point(java.lang.String seqPoint_point) {
        this.seqPoint_point = seqPoint_point;
    }


    /**
     * Gets the seqPoint_strand value for this SeqPointType.
     * 
     * @return seqPoint_strand
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqPoint_strandType getSeqPoint_strand() {
        return seqPoint_strand;
    }


    /**
     * Sets the seqPoint_strand value for this SeqPointType.
     * 
     * @param seqPoint_strand
     */
    public void setSeqPoint_strand(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqPoint_strandType seqPoint_strand) {
        this.seqPoint_strand = seqPoint_strand;
    }


    /**
     * Gets the seqPoint_id value for this SeqPointType.
     * 
     * @return seqPoint_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqPoint_idType getSeqPoint_id() {
        return seqPoint_id;
    }


    /**
     * Sets the seqPoint_id value for this SeqPointType.
     * 
     * @param seqPoint_id
     */
    public void setSeqPoint_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqPoint_idType seqPoint_id) {
        this.seqPoint_id = seqPoint_id;
    }


    /**
     * Gets the seqPoint_fuzz value for this SeqPointType.
     * 
     * @return seqPoint_fuzz
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqPoint_fuzzType getSeqPoint_fuzz() {
        return seqPoint_fuzz;
    }


    /**
     * Sets the seqPoint_fuzz value for this SeqPointType.
     * 
     * @param seqPoint_fuzz
     */
    public void setSeqPoint_fuzz(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqPoint_fuzzType seqPoint_fuzz) {
        this.seqPoint_fuzz = seqPoint_fuzz;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqPointType)) return false;
        SeqPointType other = (SeqPointType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqPoint_point==null && other.getSeqPoint_point()==null) || 
             (this.seqPoint_point!=null &&
              this.seqPoint_point.equals(other.getSeqPoint_point()))) &&
            ((this.seqPoint_strand==null && other.getSeqPoint_strand()==null) || 
             (this.seqPoint_strand!=null &&
              this.seqPoint_strand.equals(other.getSeqPoint_strand()))) &&
            ((this.seqPoint_id==null && other.getSeqPoint_id()==null) || 
             (this.seqPoint_id!=null &&
              this.seqPoint_id.equals(other.getSeqPoint_id()))) &&
            ((this.seqPoint_fuzz==null && other.getSeqPoint_fuzz()==null) || 
             (this.seqPoint_fuzz!=null &&
              this.seqPoint_fuzz.equals(other.getSeqPoint_fuzz())));
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
        if (getSeqPoint_point() != null) {
            _hashCode += getSeqPoint_point().hashCode();
        }
        if (getSeqPoint_strand() != null) {
            _hashCode += getSeqPoint_strand().hashCode();
        }
        if (getSeqPoint_id() != null) {
            _hashCode += getSeqPoint_id().hashCode();
        }
        if (getSeqPoint_fuzz() != null) {
            _hashCode += getSeqPoint_fuzz().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqPointType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-pointType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqPoint_point");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-point_point"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqPoint_strand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-point_strand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-point_strandType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqPoint_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-point_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-point_idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqPoint_fuzz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-point_fuzz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-point_fuzzType"));
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
