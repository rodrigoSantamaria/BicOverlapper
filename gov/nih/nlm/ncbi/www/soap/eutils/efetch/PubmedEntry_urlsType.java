/**
 * PubmedEntry_urlsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PubmedEntry_urlsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedUrlType[] pubmedUrl;

    public PubmedEntry_urlsType() {
    }

    public PubmedEntry_urlsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedUrlType[] pubmedUrl) {
           this.pubmedUrl = pubmedUrl;
    }


    /**
     * Gets the pubmedUrl value for this PubmedEntry_urlsType.
     * 
     * @return pubmedUrl
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedUrlType[] getPubmedUrl() {
        return pubmedUrl;
    }


    /**
     * Sets the pubmedUrl value for this PubmedEntry_urlsType.
     * 
     * @param pubmedUrl
     */
    public void setPubmedUrl(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedUrlType[] pubmedUrl) {
        this.pubmedUrl = pubmedUrl;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedUrlType getPubmedUrl(int i) {
        return this.pubmedUrl[i];
    }

    public void setPubmedUrl(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedUrlType _value) {
        this.pubmedUrl[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PubmedEntry_urlsType)) return false;
        PubmedEntry_urlsType other = (PubmedEntry_urlsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pubmedUrl==null && other.getPubmedUrl()==null) || 
             (this.pubmedUrl!=null &&
              java.util.Arrays.equals(this.pubmedUrl, other.getPubmedUrl())));
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
        if (getPubmedUrl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPubmedUrl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPubmedUrl(), i);
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
        new org.apache.axis.description.TypeDesc(PubmedEntry_urlsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubmed-entry_urlsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubmedUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubmed-url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubmed-urlType"));
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
