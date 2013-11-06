/**
 * PackedSeqintType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PackedSeqintType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqIntervalType[] seqInterval;

    public PackedSeqintType() {
    }

    public PackedSeqintType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqIntervalType[] seqInterval) {
           this.seqInterval = seqInterval;
    }


    /**
     * Gets the seqInterval value for this PackedSeqintType.
     * 
     * @return seqInterval
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqIntervalType[] getSeqInterval() {
        return seqInterval;
    }


    /**
     * Sets the seqInterval value for this PackedSeqintType.
     * 
     * @param seqInterval
     */
    public void setSeqInterval(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqIntervalType[] seqInterval) {
        this.seqInterval = seqInterval;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqIntervalType getSeqInterval(int i) {
        return this.seqInterval[i];
    }

    public void setSeqInterval(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqIntervalType _value) {
        this.seqInterval[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackedSeqintType)) return false;
        PackedSeqintType other = (PackedSeqintType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqInterval==null && other.getSeqInterval()==null) || 
             (this.seqInterval!=null &&
              java.util.Arrays.equals(this.seqInterval, other.getSeqInterval())));
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
        if (getSeqInterval() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeqInterval());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeqInterval(), i);
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
        new org.apache.axis.description.TypeDesc(PackedSeqintType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Packed-seqintType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-interval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-intervalType"));
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
