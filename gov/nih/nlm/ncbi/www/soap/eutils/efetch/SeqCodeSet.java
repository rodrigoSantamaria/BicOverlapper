/**
 * SeqCodeSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqCodeSet  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeSet_codesType seqCodeSet_codes;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeSet_mapsType seqCodeSet_maps;

    public SeqCodeSet() {
    }

    public SeqCodeSet(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeSet_codesType seqCodeSet_codes,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeSet_mapsType seqCodeSet_maps) {
           this.seqCodeSet_codes = seqCodeSet_codes;
           this.seqCodeSet_maps = seqCodeSet_maps;
    }


    /**
     * Gets the seqCodeSet_codes value for this SeqCodeSet.
     * 
     * @return seqCodeSet_codes
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeSet_codesType getSeqCodeSet_codes() {
        return seqCodeSet_codes;
    }


    /**
     * Sets the seqCodeSet_codes value for this SeqCodeSet.
     * 
     * @param seqCodeSet_codes
     */
    public void setSeqCodeSet_codes(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeSet_codesType seqCodeSet_codes) {
        this.seqCodeSet_codes = seqCodeSet_codes;
    }


    /**
     * Gets the seqCodeSet_maps value for this SeqCodeSet.
     * 
     * @return seqCodeSet_maps
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeSet_mapsType getSeqCodeSet_maps() {
        return seqCodeSet_maps;
    }


    /**
     * Sets the seqCodeSet_maps value for this SeqCodeSet.
     * 
     * @param seqCodeSet_maps
     */
    public void setSeqCodeSet_maps(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqCodeSet_mapsType seqCodeSet_maps) {
        this.seqCodeSet_maps = seqCodeSet_maps;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqCodeSet)) return false;
        SeqCodeSet other = (SeqCodeSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqCodeSet_codes==null && other.getSeqCodeSet_codes()==null) || 
             (this.seqCodeSet_codes!=null &&
              this.seqCodeSet_codes.equals(other.getSeqCodeSet_codes()))) &&
            ((this.seqCodeSet_maps==null && other.getSeqCodeSet_maps()==null) || 
             (this.seqCodeSet_maps!=null &&
              this.seqCodeSet_maps.equals(other.getSeqCodeSet_maps())));
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
        if (getSeqCodeSet_codes() != null) {
            _hashCode += getSeqCodeSet_codes().hashCode();
        }
        if (getSeqCodeSet_maps() != null) {
            _hashCode += getSeqCodeSet_maps().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqCodeSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Seq-code-set"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqCodeSet_codes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-code-set_codes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-code-set_codesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqCodeSet_maps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-code-set_maps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-code-set_mapsType"));
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
