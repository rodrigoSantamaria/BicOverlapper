/**
 * Bioseq_idType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Bioseq_idType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqIdType[] seqId;

    public Bioseq_idType() {
    }

    public Bioseq_idType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqIdType[] seqId) {
           this.seqId = seqId;
    }


    /**
     * Gets the seqId value for this Bioseq_idType.
     * 
     * @return seqId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqIdType[] getSeqId() {
        return seqId;
    }


    /**
     * Sets the seqId value for this Bioseq_idType.
     * 
     * @param seqId
     */
    public void setSeqId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqIdType[] seqId) {
        this.seqId = seqId;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqIdType getSeqId(int i) {
        return this.seqId[i];
    }

    public void setSeqId(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqIdType _value) {
        this.seqId[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Bioseq_idType)) return false;
        Bioseq_idType other = (Bioseq_idType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqId==null && other.getSeqId()==null) || 
             (this.seqId!=null &&
              java.util.Arrays.equals(this.seqId, other.getSeqId())));
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
        if (getSeqId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeqId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeqId(), i);
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
        new org.apache.axis.description.TypeDesc(Bioseq_idType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq_idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-idType"));
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
