/**
 * INSDSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class INSDSet  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDSeqType[] INSDSeq;

    public INSDSet() {
    }

    public INSDSet(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDSeqType[] INSDSeq) {
           this.INSDSeq = INSDSeq;
    }


    /**
     * Gets the INSDSeq value for this INSDSet.
     * 
     * @return INSDSeq
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDSeqType[] getINSDSeq() {
        return INSDSeq;
    }


    /**
     * Sets the INSDSeq value for this INSDSet.
     * 
     * @param INSDSeq
     */
    public void setINSDSeq(gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDSeqType[] INSDSeq) {
        this.INSDSeq = INSDSeq;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDSeqType getINSDSeq(int i) {
        return this.INSDSeq[i];
    }

    public void setINSDSeq(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.INSDSeqType _value) {
        this.INSDSeq[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof INSDSet)) return false;
        INSDSet other = (INSDSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.INSDSeq==null && other.getINSDSeq()==null) || 
             (this.INSDSeq!=null &&
              java.util.Arrays.equals(this.INSDSeq, other.getINSDSeq())));
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
        if (getINSDSeq() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getINSDSeq());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getINSDSeq(), i);
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
        new org.apache.axis.description.TypeDesc(INSDSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">INSDSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSDSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "INSDSeqType"));
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
