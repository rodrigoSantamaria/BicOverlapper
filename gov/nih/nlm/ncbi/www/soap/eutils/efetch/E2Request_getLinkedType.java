/**
 * E2Request_getLinkedType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class E2Request_getLinkedType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2GetLinksType entrez2GetLinks;

    public E2Request_getLinkedType() {
    }

    public E2Request_getLinkedType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2GetLinksType entrez2GetLinks) {
           this.entrez2GetLinks = entrez2GetLinks;
    }


    /**
     * Gets the entrez2GetLinks value for this E2Request_getLinkedType.
     * 
     * @return entrez2GetLinks
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2GetLinksType getEntrez2GetLinks() {
        return entrez2GetLinks;
    }


    /**
     * Sets the entrez2GetLinks value for this E2Request_getLinkedType.
     * 
     * @param entrez2GetLinks
     */
    public void setEntrez2GetLinks(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2GetLinksType entrez2GetLinks) {
        this.entrez2GetLinks = entrez2GetLinks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof E2Request_getLinkedType)) return false;
        E2Request_getLinkedType other = (E2Request_getLinkedType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2GetLinks==null && other.getEntrez2GetLinks()==null) || 
             (this.entrez2GetLinks!=null &&
              this.entrez2GetLinks.equals(other.getEntrez2GetLinks())));
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
        if (getEntrez2GetLinks() != null) {
            _hashCode += getEntrez2GetLinks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(E2Request_getLinkedType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "E2Request_get-linkedType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2GetLinks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-get-links"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-get-linksType"));
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
