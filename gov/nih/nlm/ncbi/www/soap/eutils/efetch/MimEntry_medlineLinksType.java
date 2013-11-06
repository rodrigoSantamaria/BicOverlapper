/**
 * MimEntry_medlineLinksType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MimEntry_medlineLinksType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimLinkType mimLink;

    public MimEntry_medlineLinksType() {
    }

    public MimEntry_medlineLinksType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimLinkType mimLink) {
           this.mimLink = mimLink;
    }


    /**
     * Gets the mimLink value for this MimEntry_medlineLinksType.
     * 
     * @return mimLink
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimLinkType getMimLink() {
        return mimLink;
    }


    /**
     * Sets the mimLink value for this MimEntry_medlineLinksType.
     * 
     * @param mimLink
     */
    public void setMimLink(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimLinkType mimLink) {
        this.mimLink = mimLink;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MimEntry_medlineLinksType)) return false;
        MimEntry_medlineLinksType other = (MimEntry_medlineLinksType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mimLink==null && other.getMimLink()==null) || 
             (this.mimLink!=null &&
              this.mimLink.equals(other.getMimLink())));
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
        if (getMimLink() != null) {
            _hashCode += getMimLink().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MimEntry_medlineLinksType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry_medlineLinksType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimLink");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-link"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-linkType"));
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
