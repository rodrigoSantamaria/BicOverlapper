/**
 * TSeqSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class TSeqSet  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.TSeqType[] TSeq;

    public TSeqSet() {
    }

    public TSeqSet(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.TSeqType[] TSeq) {
           this.TSeq = TSeq;
    }


    /**
     * Gets the TSeq value for this TSeqSet.
     * 
     * @return TSeq
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TSeqType[] getTSeq() {
        return TSeq;
    }


    /**
     * Sets the TSeq value for this TSeqSet.
     * 
     * @param TSeq
     */
    public void setTSeq(gov.nih.nlm.ncbi.www.soap.eutils.efetch.TSeqType[] TSeq) {
        this.TSeq = TSeq;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.TSeqType getTSeq(int i) {
        return this.TSeq[i];
    }

    public void setTSeq(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.TSeqType _value) {
        this.TSeq[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TSeqSet)) return false;
        TSeqSet other = (TSeqSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.TSeq==null && other.getTSeq()==null) || 
             (this.TSeq!=null &&
              java.util.Arrays.equals(this.TSeq, other.getTSeq())));
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
        if (getTSeq() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTSeq());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTSeq(), i);
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
        new org.apache.axis.description.TypeDesc(TSeqSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">TSeqSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TSeq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "TSeqType"));
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
