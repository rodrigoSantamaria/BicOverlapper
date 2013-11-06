/**
 * E2Request_getLinkCountsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class E2Request_getLinkCountsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2IdType entrez2Id;

    public E2Request_getLinkCountsType() {
    }

    public E2Request_getLinkCountsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2IdType entrez2Id) {
           this.entrez2Id = entrez2Id;
    }


    /**
     * Gets the entrez2Id value for this E2Request_getLinkCountsType.
     * 
     * @return entrez2Id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2IdType getEntrez2Id() {
        return entrez2Id;
    }


    /**
     * Sets the entrez2Id value for this E2Request_getLinkCountsType.
     * 
     * @param entrez2Id
     */
    public void setEntrez2Id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2IdType entrez2Id) {
        this.entrez2Id = entrez2Id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof E2Request_getLinkCountsType)) return false;
        E2Request_getLinkCountsType other = (E2Request_getLinkCountsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2Id==null && other.getEntrez2Id()==null) || 
             (this.entrez2Id!=null &&
              this.entrez2Id.equals(other.getEntrez2Id())));
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
        if (getEntrez2Id() != null) {
            _hashCode += getEntrez2Id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(E2Request_getLinkCountsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "E2Request_get-link-countsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-idType"));
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
