/**
 * PubmedUrlType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PubmedUrlType  implements java.io.Serializable {
    private java.lang.String pubmedUrl_location;

    private java.lang.String pubmedUrl_url;

    public PubmedUrlType() {
    }

    public PubmedUrlType(
           java.lang.String pubmedUrl_location,
           java.lang.String pubmedUrl_url) {
           this.pubmedUrl_location = pubmedUrl_location;
           this.pubmedUrl_url = pubmedUrl_url;
    }


    /**
     * Gets the pubmedUrl_location value for this PubmedUrlType.
     * 
     * @return pubmedUrl_location
     */
    public java.lang.String getPubmedUrl_location() {
        return pubmedUrl_location;
    }


    /**
     * Sets the pubmedUrl_location value for this PubmedUrlType.
     * 
     * @param pubmedUrl_location
     */
    public void setPubmedUrl_location(java.lang.String pubmedUrl_location) {
        this.pubmedUrl_location = pubmedUrl_location;
    }


    /**
     * Gets the pubmedUrl_url value for this PubmedUrlType.
     * 
     * @return pubmedUrl_url
     */
    public java.lang.String getPubmedUrl_url() {
        return pubmedUrl_url;
    }


    /**
     * Sets the pubmedUrl_url value for this PubmedUrlType.
     * 
     * @param pubmedUrl_url
     */
    public void setPubmedUrl_url(java.lang.String pubmedUrl_url) {
        this.pubmedUrl_url = pubmedUrl_url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PubmedUrlType)) return false;
        PubmedUrlType other = (PubmedUrlType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pubmedUrl_location==null && other.getPubmedUrl_location()==null) || 
             (this.pubmedUrl_location!=null &&
              this.pubmedUrl_location.equals(other.getPubmedUrl_location()))) &&
            ((this.pubmedUrl_url==null && other.getPubmedUrl_url()==null) || 
             (this.pubmedUrl_url!=null &&
              this.pubmedUrl_url.equals(other.getPubmedUrl_url())));
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
        if (getPubmedUrl_location() != null) {
            _hashCode += getPubmedUrl_location().hashCode();
        }
        if (getPubmedUrl_url() != null) {
            _hashCode += getPubmedUrl_url().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PubmedUrlType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubmed-urlType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubmedUrl_location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubmed-url_location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubmedUrl_url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubmed-url_url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
