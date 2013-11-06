/**
 * HGLinkType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class HGLinkType  implements java.io.Serializable {
    private java.lang.String HGLink_hypertext;

    private java.lang.String HGLink_url;

    public HGLinkType() {
    }

    public HGLinkType(
           java.lang.String HGLink_hypertext,
           java.lang.String HGLink_url) {
           this.HGLink_hypertext = HGLink_hypertext;
           this.HGLink_url = HGLink_url;
    }


    /**
     * Gets the HGLink_hypertext value for this HGLinkType.
     * 
     * @return HGLink_hypertext
     */
    public java.lang.String getHGLink_hypertext() {
        return HGLink_hypertext;
    }


    /**
     * Sets the HGLink_hypertext value for this HGLinkType.
     * 
     * @param HGLink_hypertext
     */
    public void setHGLink_hypertext(java.lang.String HGLink_hypertext) {
        this.HGLink_hypertext = HGLink_hypertext;
    }


    /**
     * Gets the HGLink_url value for this HGLinkType.
     * 
     * @return HGLink_url
     */
    public java.lang.String getHGLink_url() {
        return HGLink_url;
    }


    /**
     * Sets the HGLink_url value for this HGLinkType.
     * 
     * @param HGLink_url
     */
    public void setHGLink_url(java.lang.String HGLink_url) {
        this.HGLink_url = HGLink_url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HGLinkType)) return false;
        HGLinkType other = (HGLinkType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.HGLink_hypertext==null && other.getHGLink_hypertext()==null) || 
             (this.HGLink_hypertext!=null &&
              this.HGLink_hypertext.equals(other.getHGLink_hypertext()))) &&
            ((this.HGLink_url==null && other.getHGLink_url()==null) || 
             (this.HGLink_url!=null &&
              this.HGLink_url.equals(other.getHGLink_url())));
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
        if (getHGLink_hypertext() != null) {
            _hashCode += getHGLink_hypertext().hashCode();
        }
        if (getHGLink_url() != null) {
            _hashCode += getHGLink_url().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HGLinkType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-LinkType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGLink_hypertext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Link_hypertext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGLink_url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Link_url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
