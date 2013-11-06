/**
 * Blast4Value_bioseqSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4Value_bioseqSetType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSetType bioseqSet;

    public Blast4Value_bioseqSetType() {
    }

    public Blast4Value_bioseqSetType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSetType bioseqSet) {
           this.bioseqSet = bioseqSet;
    }


    /**
     * Gets the bioseqSet value for this Blast4Value_bioseqSetType.
     * 
     * @return bioseqSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSetType getBioseqSet() {
        return bioseqSet;
    }


    /**
     * Sets the bioseqSet value for this Blast4Value_bioseqSetType.
     * 
     * @param bioseqSet
     */
    public void setBioseqSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BioseqSetType bioseqSet) {
        this.bioseqSet = bioseqSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4Value_bioseqSetType)) return false;
        Blast4Value_bioseqSetType other = (Blast4Value_bioseqSetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bioseqSet==null && other.getBioseqSet()==null) || 
             (this.bioseqSet!=null &&
              this.bioseqSet.equals(other.getBioseqSet())));
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
        if (getBioseqSet() != null) {
            _hashCode += getBioseqSet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4Value_bioseqSetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-value_bioseq-setType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bioseqSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq-set"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Bioseq-setType"));
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
