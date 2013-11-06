/**
 * MSBioseqSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSBioseqSetType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSBioseqType[] MSBioseq;

    public MSBioseqSetType() {
    }

    public MSBioseqSetType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSBioseqType[] MSBioseq) {
           this.MSBioseq = MSBioseq;
    }


    /**
     * Gets the MSBioseq value for this MSBioseqSetType.
     * 
     * @return MSBioseq
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSBioseqType[] getMSBioseq() {
        return MSBioseq;
    }


    /**
     * Sets the MSBioseq value for this MSBioseqSetType.
     * 
     * @param MSBioseq
     */
    public void setMSBioseq(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSBioseqType[] MSBioseq) {
        this.MSBioseq = MSBioseq;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSBioseqType getMSBioseq(int i) {
        return this.MSBioseq[i];
    }

    public void setMSBioseq(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSBioseqType _value) {
        this.MSBioseq[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSBioseqSetType)) return false;
        MSBioseqSetType other = (MSBioseqSetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSBioseq==null && other.getMSBioseq()==null) || 
             (this.MSBioseq!=null &&
              java.util.Arrays.equals(this.MSBioseq, other.getMSBioseq())));
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
        if (getMSBioseq() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMSBioseq());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMSBioseq(), i);
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
        new org.apache.axis.description.TypeDesc(MSBioseqSetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSBioseqSetType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSBioseq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSBioseq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSBioseqType"));
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
