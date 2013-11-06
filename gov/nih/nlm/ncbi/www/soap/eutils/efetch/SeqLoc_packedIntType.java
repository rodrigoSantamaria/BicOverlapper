/**
 * SeqLoc_packedIntType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqLoc_packedIntType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeqintType packedSeqint;

    public SeqLoc_packedIntType() {
    }

    public SeqLoc_packedIntType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeqintType packedSeqint) {
           this.packedSeqint = packedSeqint;
    }


    /**
     * Gets the packedSeqint value for this SeqLoc_packedIntType.
     * 
     * @return packedSeqint
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeqintType getPackedSeqint() {
        return packedSeqint;
    }


    /**
     * Sets the packedSeqint value for this SeqLoc_packedIntType.
     * 
     * @param packedSeqint
     */
    public void setPackedSeqint(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PackedSeqintType packedSeqint) {
        this.packedSeqint = packedSeqint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqLoc_packedIntType)) return false;
        SeqLoc_packedIntType other = (SeqLoc_packedIntType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packedSeqint==null && other.getPackedSeqint()==null) || 
             (this.packedSeqint!=null &&
              this.packedSeqint.equals(other.getPackedSeqint())));
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
        if (getPackedSeqint() != null) {
            _hashCode += getPackedSeqint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqLoc_packedIntType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-loc_packed-intType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packedSeqint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seqint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seqintType"));
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
