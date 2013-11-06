/**
 * Blast4GetSeqPartsReplyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4GetSeqPartsReplyType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsReply_bioseqType blast4GetSeqPartsReply_bioseq;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsReply_idsType blast4GetSeqPartsReply_ids;

    private java.lang.String blast4GetSeqPartsReply_length;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsReply_dataType blast4GetSeqPartsReply_data;

    public Blast4GetSeqPartsReplyType() {
    }

    public Blast4GetSeqPartsReplyType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsReply_bioseqType blast4GetSeqPartsReply_bioseq,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsReply_idsType blast4GetSeqPartsReply_ids,
           java.lang.String blast4GetSeqPartsReply_length,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsReply_dataType blast4GetSeqPartsReply_data) {
           this.blast4GetSeqPartsReply_bioseq = blast4GetSeqPartsReply_bioseq;
           this.blast4GetSeqPartsReply_ids = blast4GetSeqPartsReply_ids;
           this.blast4GetSeqPartsReply_length = blast4GetSeqPartsReply_length;
           this.blast4GetSeqPartsReply_data = blast4GetSeqPartsReply_data;
    }


    /**
     * Gets the blast4GetSeqPartsReply_bioseq value for this Blast4GetSeqPartsReplyType.
     * 
     * @return blast4GetSeqPartsReply_bioseq
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsReply_bioseqType getBlast4GetSeqPartsReply_bioseq() {
        return blast4GetSeqPartsReply_bioseq;
    }


    /**
     * Sets the blast4GetSeqPartsReply_bioseq value for this Blast4GetSeqPartsReplyType.
     * 
     * @param blast4GetSeqPartsReply_bioseq
     */
    public void setBlast4GetSeqPartsReply_bioseq(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsReply_bioseqType blast4GetSeqPartsReply_bioseq) {
        this.blast4GetSeqPartsReply_bioseq = blast4GetSeqPartsReply_bioseq;
    }


    /**
     * Gets the blast4GetSeqPartsReply_ids value for this Blast4GetSeqPartsReplyType.
     * 
     * @return blast4GetSeqPartsReply_ids
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsReply_idsType getBlast4GetSeqPartsReply_ids() {
        return blast4GetSeqPartsReply_ids;
    }


    /**
     * Sets the blast4GetSeqPartsReply_ids value for this Blast4GetSeqPartsReplyType.
     * 
     * @param blast4GetSeqPartsReply_ids
     */
    public void setBlast4GetSeqPartsReply_ids(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsReply_idsType blast4GetSeqPartsReply_ids) {
        this.blast4GetSeqPartsReply_ids = blast4GetSeqPartsReply_ids;
    }


    /**
     * Gets the blast4GetSeqPartsReply_length value for this Blast4GetSeqPartsReplyType.
     * 
     * @return blast4GetSeqPartsReply_length
     */
    public java.lang.String getBlast4GetSeqPartsReply_length() {
        return blast4GetSeqPartsReply_length;
    }


    /**
     * Sets the blast4GetSeqPartsReply_length value for this Blast4GetSeqPartsReplyType.
     * 
     * @param blast4GetSeqPartsReply_length
     */
    public void setBlast4GetSeqPartsReply_length(java.lang.String blast4GetSeqPartsReply_length) {
        this.blast4GetSeqPartsReply_length = blast4GetSeqPartsReply_length;
    }


    /**
     * Gets the blast4GetSeqPartsReply_data value for this Blast4GetSeqPartsReplyType.
     * 
     * @return blast4GetSeqPartsReply_data
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsReply_dataType getBlast4GetSeqPartsReply_data() {
        return blast4GetSeqPartsReply_data;
    }


    /**
     * Sets the blast4GetSeqPartsReply_data value for this Blast4GetSeqPartsReplyType.
     * 
     * @param blast4GetSeqPartsReply_data
     */
    public void setBlast4GetSeqPartsReply_data(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsReply_dataType blast4GetSeqPartsReply_data) {
        this.blast4GetSeqPartsReply_data = blast4GetSeqPartsReply_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4GetSeqPartsReplyType)) return false;
        Blast4GetSeqPartsReplyType other = (Blast4GetSeqPartsReplyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4GetSeqPartsReply_bioseq==null && other.getBlast4GetSeqPartsReply_bioseq()==null) || 
             (this.blast4GetSeqPartsReply_bioseq!=null &&
              this.blast4GetSeqPartsReply_bioseq.equals(other.getBlast4GetSeqPartsReply_bioseq()))) &&
            ((this.blast4GetSeqPartsReply_ids==null && other.getBlast4GetSeqPartsReply_ids()==null) || 
             (this.blast4GetSeqPartsReply_ids!=null &&
              this.blast4GetSeqPartsReply_ids.equals(other.getBlast4GetSeqPartsReply_ids()))) &&
            ((this.blast4GetSeqPartsReply_length==null && other.getBlast4GetSeqPartsReply_length()==null) || 
             (this.blast4GetSeqPartsReply_length!=null &&
              this.blast4GetSeqPartsReply_length.equals(other.getBlast4GetSeqPartsReply_length()))) &&
            ((this.blast4GetSeqPartsReply_data==null && other.getBlast4GetSeqPartsReply_data()==null) || 
             (this.blast4GetSeqPartsReply_data!=null &&
              this.blast4GetSeqPartsReply_data.equals(other.getBlast4GetSeqPartsReply_data())));
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
        if (getBlast4GetSeqPartsReply_bioseq() != null) {
            _hashCode += getBlast4GetSeqPartsReply_bioseq().hashCode();
        }
        if (getBlast4GetSeqPartsReply_ids() != null) {
            _hashCode += getBlast4GetSeqPartsReply_ids().hashCode();
        }
        if (getBlast4GetSeqPartsReply_length() != null) {
            _hashCode += getBlast4GetSeqPartsReply_length().hashCode();
        }
        if (getBlast4GetSeqPartsReply_data() != null) {
            _hashCode += getBlast4GetSeqPartsReply_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4GetSeqPartsReplyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-seq-parts-replyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4GetSeqPartsReply_bioseq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-seq-parts-reply_bioseq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-seq-parts-reply_bioseqType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4GetSeqPartsReply_ids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-seq-parts-reply_ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-seq-parts-reply_idsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4GetSeqPartsReply_length");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-seq-parts-reply_length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4GetSeqPartsReply_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-seq-parts-reply_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-seq-parts-reply_dataType"));
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
