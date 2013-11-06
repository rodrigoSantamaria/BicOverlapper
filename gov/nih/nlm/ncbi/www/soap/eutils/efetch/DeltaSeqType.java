/**
 * DeltaSeqType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class DeltaSeqType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DeltaSeq_locType deltaSeq_loc;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DeltaSeq_literalType deltaSeq_literal;

    public DeltaSeqType() {
    }

    public DeltaSeqType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DeltaSeq_locType deltaSeq_loc,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DeltaSeq_literalType deltaSeq_literal) {
           this.deltaSeq_loc = deltaSeq_loc;
           this.deltaSeq_literal = deltaSeq_literal;
    }


    /**
     * Gets the deltaSeq_loc value for this DeltaSeqType.
     * 
     * @return deltaSeq_loc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DeltaSeq_locType getDeltaSeq_loc() {
        return deltaSeq_loc;
    }


    /**
     * Sets the deltaSeq_loc value for this DeltaSeqType.
     * 
     * @param deltaSeq_loc
     */
    public void setDeltaSeq_loc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DeltaSeq_locType deltaSeq_loc) {
        this.deltaSeq_loc = deltaSeq_loc;
    }


    /**
     * Gets the deltaSeq_literal value for this DeltaSeqType.
     * 
     * @return deltaSeq_literal
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DeltaSeq_literalType getDeltaSeq_literal() {
        return deltaSeq_literal;
    }


    /**
     * Sets the deltaSeq_literal value for this DeltaSeqType.
     * 
     * @param deltaSeq_literal
     */
    public void setDeltaSeq_literal(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DeltaSeq_literalType deltaSeq_literal) {
        this.deltaSeq_literal = deltaSeq_literal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeltaSeqType)) return false;
        DeltaSeqType other = (DeltaSeqType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deltaSeq_loc==null && other.getDeltaSeq_loc()==null) || 
             (this.deltaSeq_loc!=null &&
              this.deltaSeq_loc.equals(other.getDeltaSeq_loc()))) &&
            ((this.deltaSeq_literal==null && other.getDeltaSeq_literal()==null) || 
             (this.deltaSeq_literal!=null &&
              this.deltaSeq_literal.equals(other.getDeltaSeq_literal())));
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
        if (getDeltaSeq_loc() != null) {
            _hashCode += getDeltaSeq_loc().hashCode();
        }
        if (getDeltaSeq_literal() != null) {
            _hashCode += getDeltaSeq_literal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeltaSeqType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Delta-seqType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deltaSeq_loc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Delta-seq_loc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Delta-seq_locType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deltaSeq_literal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Delta-seq_literal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Delta-seq_literalType"));
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
