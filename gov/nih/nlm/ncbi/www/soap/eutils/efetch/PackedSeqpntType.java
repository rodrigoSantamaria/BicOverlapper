/**
 * PackedSeqpntType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PackedSeqpntType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeqpnt_strandType packedSeqpnt_strand;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeqpnt_idType packedSeqpnt_id;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeqpnt_fuzzType packedSeqpnt_fuzz;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeqpnt_pointsType packedSeqpnt_points;

    public PackedSeqpntType() {
    }

    public PackedSeqpntType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeqpnt_strandType packedSeqpnt_strand,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeqpnt_idType packedSeqpnt_id,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeqpnt_fuzzType packedSeqpnt_fuzz,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeqpnt_pointsType packedSeqpnt_points) {
           this.packedSeqpnt_strand = packedSeqpnt_strand;
           this.packedSeqpnt_id = packedSeqpnt_id;
           this.packedSeqpnt_fuzz = packedSeqpnt_fuzz;
           this.packedSeqpnt_points = packedSeqpnt_points;
    }


    /**
     * Gets the packedSeqpnt_strand value for this PackedSeqpntType.
     * 
     * @return packedSeqpnt_strand
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeqpnt_strandType getPackedSeqpnt_strand() {
        return packedSeqpnt_strand;
    }


    /**
     * Sets the packedSeqpnt_strand value for this PackedSeqpntType.
     * 
     * @param packedSeqpnt_strand
     */
    public void setPackedSeqpnt_strand(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeqpnt_strandType packedSeqpnt_strand) {
        this.packedSeqpnt_strand = packedSeqpnt_strand;
    }


    /**
     * Gets the packedSeqpnt_id value for this PackedSeqpntType.
     * 
     * @return packedSeqpnt_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeqpnt_idType getPackedSeqpnt_id() {
        return packedSeqpnt_id;
    }


    /**
     * Sets the packedSeqpnt_id value for this PackedSeqpntType.
     * 
     * @param packedSeqpnt_id
     */
    public void setPackedSeqpnt_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeqpnt_idType packedSeqpnt_id) {
        this.packedSeqpnt_id = packedSeqpnt_id;
    }


    /**
     * Gets the packedSeqpnt_fuzz value for this PackedSeqpntType.
     * 
     * @return packedSeqpnt_fuzz
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeqpnt_fuzzType getPackedSeqpnt_fuzz() {
        return packedSeqpnt_fuzz;
    }


    /**
     * Sets the packedSeqpnt_fuzz value for this PackedSeqpntType.
     * 
     * @param packedSeqpnt_fuzz
     */
    public void setPackedSeqpnt_fuzz(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeqpnt_fuzzType packedSeqpnt_fuzz) {
        this.packedSeqpnt_fuzz = packedSeqpnt_fuzz;
    }


    /**
     * Gets the packedSeqpnt_points value for this PackedSeqpntType.
     * 
     * @return packedSeqpnt_points
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeqpnt_pointsType getPackedSeqpnt_points() {
        return packedSeqpnt_points;
    }


    /**
     * Sets the packedSeqpnt_points value for this PackedSeqpntType.
     * 
     * @param packedSeqpnt_points
     */
    public void setPackedSeqpnt_points(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeqpnt_pointsType packedSeqpnt_points) {
        this.packedSeqpnt_points = packedSeqpnt_points;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackedSeqpntType)) return false;
        PackedSeqpntType other = (PackedSeqpntType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packedSeqpnt_strand==null && other.getPackedSeqpnt_strand()==null) || 
             (this.packedSeqpnt_strand!=null &&
              this.packedSeqpnt_strand.equals(other.getPackedSeqpnt_strand()))) &&
            ((this.packedSeqpnt_id==null && other.getPackedSeqpnt_id()==null) || 
             (this.packedSeqpnt_id!=null &&
              this.packedSeqpnt_id.equals(other.getPackedSeqpnt_id()))) &&
            ((this.packedSeqpnt_fuzz==null && other.getPackedSeqpnt_fuzz()==null) || 
             (this.packedSeqpnt_fuzz!=null &&
              this.packedSeqpnt_fuzz.equals(other.getPackedSeqpnt_fuzz()))) &&
            ((this.packedSeqpnt_points==null && other.getPackedSeqpnt_points()==null) || 
             (this.packedSeqpnt_points!=null &&
              this.packedSeqpnt_points.equals(other.getPackedSeqpnt_points())));
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
        if (getPackedSeqpnt_strand() != null) {
            _hashCode += getPackedSeqpnt_strand().hashCode();
        }
        if (getPackedSeqpnt_id() != null) {
            _hashCode += getPackedSeqpnt_id().hashCode();
        }
        if (getPackedSeqpnt_fuzz() != null) {
            _hashCode += getPackedSeqpnt_fuzz().hashCode();
        }
        if (getPackedSeqpnt_points() != null) {
            _hashCode += getPackedSeqpnt_points().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PackedSeqpntType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seqpntType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packedSeqpnt_strand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seqpnt_strand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seqpnt_strandType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packedSeqpnt_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seqpnt_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seqpnt_idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packedSeqpnt_fuzz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seqpnt_fuzz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seqpnt_fuzzType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packedSeqpnt_points");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seqpnt_points"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seqpnt_pointsType"));
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
