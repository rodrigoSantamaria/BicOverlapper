/**
 * GBSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GBSet  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSeqType[] GBSeq;

    public GBSet() {
    }

    public GBSet(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSeqType[] GBSeq) {
           this.GBSeq = GBSeq;
    }


    /**
     * Gets the GBSeq value for this GBSet.
     * 
     * @return GBSeq
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSeqType[] getGBSeq() {
        return GBSeq;
    }


    /**
     * Sets the GBSeq value for this GBSet.
     * 
     * @param GBSeq
     */
    public void setGBSeq(gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSeqType[] GBSeq) {
        this.GBSeq = GBSeq;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSeqType getGBSeq(int i) {
        return this.GBSeq[i];
    }

    public void setGBSeq(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.GBSeqType _value) {
        this.GBSeq[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GBSet)) return false;
        GBSet other = (GBSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GBSeq==null && other.getGBSeq()==null) || 
             (this.GBSeq!=null &&
              java.util.Arrays.equals(this.GBSeq, other.getGBSeq())));
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
        if (getGBSeq() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGBSeq());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGBSeq(), i);
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
        new org.apache.axis.description.TypeDesc(GBSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">GBSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "GBSeqType"));
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
