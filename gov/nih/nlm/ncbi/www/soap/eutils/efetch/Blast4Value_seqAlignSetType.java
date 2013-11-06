/**
 * Blast4Value_seqAlignSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4Value_seqAlignSetType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlignSetType seqAlignSet;

    public Blast4Value_seqAlignSetType() {
    }

    public Blast4Value_seqAlignSetType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlignSetType seqAlignSet) {
           this.seqAlignSet = seqAlignSet;
    }


    /**
     * Gets the seqAlignSet value for this Blast4Value_seqAlignSetType.
     * 
     * @return seqAlignSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlignSetType getSeqAlignSet() {
        return seqAlignSet;
    }


    /**
     * Sets the seqAlignSet value for this Blast4Value_seqAlignSetType.
     * 
     * @param seqAlignSet
     */
    public void setSeqAlignSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAlignSetType seqAlignSet) {
        this.seqAlignSet = seqAlignSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4Value_seqAlignSetType)) return false;
        Blast4Value_seqAlignSetType other = (Blast4Value_seqAlignSetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqAlignSet==null && other.getSeqAlignSet()==null) || 
             (this.seqAlignSet!=null &&
              this.seqAlignSet.equals(other.getSeqAlignSet())));
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
        if (getSeqAlignSet() != null) {
            _hashCode += getSeqAlignSet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4Value_seqAlignSetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-value_seq-align-setType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqAlignSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align-set"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-align-setType"));
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
