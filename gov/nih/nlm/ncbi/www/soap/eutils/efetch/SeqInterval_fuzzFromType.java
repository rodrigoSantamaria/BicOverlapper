/**
 * SeqInterval_fuzzFromType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SeqInterval_fuzzFromType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntFuzzType intFuzz;

    public SeqInterval_fuzzFromType() {
    }

    public SeqInterval_fuzzFromType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntFuzzType intFuzz) {
           this.intFuzz = intFuzz;
    }


    /**
     * Gets the intFuzz value for this SeqInterval_fuzzFromType.
     * 
     * @return intFuzz
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntFuzzType getIntFuzz() {
        return intFuzz;
    }


    /**
     * Sets the intFuzz value for this SeqInterval_fuzzFromType.
     * 
     * @param intFuzz
     */
    public void setIntFuzz(gov.nih.nlm.ncbi.www.soap.eutils.efetch.IntFuzzType intFuzz) {
        this.intFuzz = intFuzz;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeqInterval_fuzzFromType)) return false;
        SeqInterval_fuzzFromType other = (SeqInterval_fuzzFromType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.intFuzz==null && other.getIntFuzz()==null) || 
             (this.intFuzz!=null &&
              this.intFuzz.equals(other.getIntFuzz())));
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
        if (getIntFuzz() != null) {
            _hashCode += getIntFuzz().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeqInterval_fuzzFromType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-interval_fuzz-fromType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intFuzz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Int-fuzz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Int-fuzzType"));
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
