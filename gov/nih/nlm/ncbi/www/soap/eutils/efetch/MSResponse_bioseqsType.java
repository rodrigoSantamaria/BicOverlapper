/**
 * MSResponse_bioseqsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSResponse_bioseqsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSBioseqSetType MSBioseqSet;

    public MSResponse_bioseqsType() {
    }

    public MSResponse_bioseqsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSBioseqSetType MSBioseqSet) {
           this.MSBioseqSet = MSBioseqSet;
    }


    /**
     * Gets the MSBioseqSet value for this MSResponse_bioseqsType.
     * 
     * @return MSBioseqSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSBioseqSetType getMSBioseqSet() {
        return MSBioseqSet;
    }


    /**
     * Sets the MSBioseqSet value for this MSResponse_bioseqsType.
     * 
     * @param MSBioseqSet
     */
    public void setMSBioseqSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSBioseqSetType MSBioseqSet) {
        this.MSBioseqSet = MSBioseqSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSResponse_bioseqsType)) return false;
        MSResponse_bioseqsType other = (MSResponse_bioseqsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSBioseqSet==null && other.getMSBioseqSet()==null) || 
             (this.MSBioseqSet!=null &&
              this.MSBioseqSet.equals(other.getMSBioseqSet())));
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
        if (getMSBioseqSet() != null) {
            _hashCode += getMSBioseqSet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MSResponse_bioseqsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSResponse_bioseqsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSBioseqSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSBioseqSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSBioseqSetType"));
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
