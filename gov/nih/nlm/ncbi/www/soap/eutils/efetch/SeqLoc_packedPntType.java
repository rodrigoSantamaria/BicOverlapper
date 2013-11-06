/**
 * SeqLoc_packedPntType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqLoc_packedPntType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeqpntType packedSeqpnt;

    public SeqLoc_packedPntType() {
    }

    public SeqLoc_packedPntType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeqpntType packedSeqpnt) {
           this.packedSeqpnt = packedSeqpnt;
    }


    /**
     * Gets the packedSeqpnt value for this SeqLoc_packedPntType.
     * 
     * @return packedSeqpnt
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeqpntType getPackedSeqpnt() {
        return packedSeqpnt;
    }


    /**
     * Sets the packedSeqpnt value for this SeqLoc_packedPntType.
     * 
     * @param packedSeqpnt
     */
    public void setPackedSeqpnt(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeqpntType packedSeqpnt) {
        this.packedSeqpnt = packedSeqpnt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqLoc_packedPntType)) return false;
        SeqLoc_packedPntType other = (SeqLoc_packedPntType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packedSeqpnt==null && other.getPackedSeqpnt()==null) || 
             (this.packedSeqpnt!=null &&
              this.packedSeqpnt.equals(other.getPackedSeqpnt())));
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
        if (getPackedSeqpnt() != null) {
            _hashCode += getPackedSeqpnt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqLoc_packedPntType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-loc_packed-pntType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packedSeqpnt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seqpnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seqpntType"));
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
