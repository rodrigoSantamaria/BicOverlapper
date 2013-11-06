/**
 * BiostrucAlign_seqalignType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucAlign_seqalignType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnotType[] seqAnnot;

    public BiostrucAlign_seqalignType() {
    }

    public BiostrucAlign_seqalignType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnotType[] seqAnnot) {
           this.seqAnnot = seqAnnot;
    }


    /**
     * Gets the seqAnnot value for this BiostrucAlign_seqalignType.
     * 
     * @return seqAnnot
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnotType[] getSeqAnnot() {
        return seqAnnot;
    }


    /**
     * Sets the seqAnnot value for this BiostrucAlign_seqalignType.
     * 
     * @param seqAnnot
     */
    public void setSeqAnnot(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnotType[] seqAnnot) {
        this.seqAnnot = seqAnnot;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnotType getSeqAnnot(int i) {
        return this.seqAnnot[i];
    }

    public void setSeqAnnot(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqAnnotType _value) {
        this.seqAnnot[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucAlign_seqalignType)) return false;
        BiostrucAlign_seqalignType other = (BiostrucAlign_seqalignType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqAnnot==null && other.getSeqAnnot()==null) || 
             (this.seqAnnot!=null &&
              java.util.Arrays.equals(this.seqAnnot, other.getSeqAnnot())));
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
        if (getSeqAnnot() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeqAnnot());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeqAnnot(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucAlign_seqalignType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-align_seqalignType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqAnnot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-annotType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
