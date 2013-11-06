/**
 * HGAlignment_alignmentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class HGAlignment_alignmentType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlignType seqAlign;

    public HGAlignment_alignmentType() {
    }

    public HGAlignment_alignmentType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlignType seqAlign) {
           this.seqAlign = seqAlign;
    }


    /**
     * Gets the seqAlign value for this HGAlignment_alignmentType.
     * 
     * @return seqAlign
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlignType getSeqAlign() {
        return seqAlign;
    }


    /**
     * Sets the seqAlign value for this HGAlignment_alignmentType.
     * 
     * @param seqAlign
     */
    public void setSeqAlign(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlignType seqAlign) {
        this.seqAlign = seqAlign;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HGAlignment_alignmentType)) return false;
        HGAlignment_alignmentType other = (HGAlignment_alignmentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqAlign==null && other.getSeqAlign()==null) || 
             (this.seqAlign!=null &&
              this.seqAlign.equals(other.getSeqAlign())));
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
        if (getSeqAlign() != null) {
            _hashCode += getSeqAlign().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HGAlignment_alignmentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Alignment_alignmentType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqAlign");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-alignType"));
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
