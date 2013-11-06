/**
 * Blast4Subject_sequencesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4Subject_sequencesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqType[] bioseq;

    public Blast4Subject_sequencesType() {
    }

    public Blast4Subject_sequencesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqType[] bioseq) {
           this.bioseq = bioseq;
    }


    /**
     * Gets the bioseq value for this Blast4Subject_sequencesType.
     * 
     * @return bioseq
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqType[] getBioseq() {
        return bioseq;
    }


    /**
     * Sets the bioseq value for this Blast4Subject_sequencesType.
     * 
     * @param bioseq
     */
    public void setBioseq(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqType[] bioseq) {
        this.bioseq = bioseq;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqType getBioseq(int i) {
        return this.bioseq[i];
    }

    public void setBioseq(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqType _value) {
        this.bioseq[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4Subject_sequencesType)) return false;
        Blast4Subject_sequencesType other = (Blast4Subject_sequencesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bioseq==null && other.getBioseq()==null) || 
             (this.bioseq!=null &&
              java.util.Arrays.equals(this.bioseq, other.getBioseq())));
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
        if (getBioseq() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBioseq());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBioseq(), i);
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
        new org.apache.axis.description.TypeDesc(Blast4Subject_sequencesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-subject_sequencesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bioseq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BioseqType"));
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
