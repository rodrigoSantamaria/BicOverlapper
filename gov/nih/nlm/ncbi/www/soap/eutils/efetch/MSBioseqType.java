/**
 * MSBioseqType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSBioseqType  implements java.io.Serializable {
    private java.lang.String MSBioseq_oid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSBioseq_seqType MSBioseq_seq;

    public MSBioseqType() {
    }

    public MSBioseqType(
           java.lang.String MSBioseq_oid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSBioseq_seqType MSBioseq_seq) {
           this.MSBioseq_oid = MSBioseq_oid;
           this.MSBioseq_seq = MSBioseq_seq;
    }


    /**
     * Gets the MSBioseq_oid value for this MSBioseqType.
     * 
     * @return MSBioseq_oid
     */
    public java.lang.String getMSBioseq_oid() {
        return MSBioseq_oid;
    }


    /**
     * Sets the MSBioseq_oid value for this MSBioseqType.
     * 
     * @param MSBioseq_oid
     */
    public void setMSBioseq_oid(java.lang.String MSBioseq_oid) {
        this.MSBioseq_oid = MSBioseq_oid;
    }


    /**
     * Gets the MSBioseq_seq value for this MSBioseqType.
     * 
     * @return MSBioseq_seq
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSBioseq_seqType getMSBioseq_seq() {
        return MSBioseq_seq;
    }


    /**
     * Sets the MSBioseq_seq value for this MSBioseqType.
     * 
     * @param MSBioseq_seq
     */
    public void setMSBioseq_seq(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSBioseq_seqType MSBioseq_seq) {
        this.MSBioseq_seq = MSBioseq_seq;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSBioseqType)) return false;
        MSBioseqType other = (MSBioseqType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSBioseq_oid==null && other.getMSBioseq_oid()==null) || 
             (this.MSBioseq_oid!=null &&
              this.MSBioseq_oid.equals(other.getMSBioseq_oid()))) &&
            ((this.MSBioseq_seq==null && other.getMSBioseq_seq()==null) || 
             (this.MSBioseq_seq!=null &&
              this.MSBioseq_seq.equals(other.getMSBioseq_seq())));
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
        if (getMSBioseq_oid() != null) {
            _hashCode += getMSBioseq_oid().hashCode();
        }
        if (getMSBioseq_seq() != null) {
            _hashCode += getMSBioseq_seq().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MSBioseqType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSBioseqType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSBioseq_oid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSBioseq_oid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSBioseq_seq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSBioseq_seq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSBioseq_seqType"));
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
