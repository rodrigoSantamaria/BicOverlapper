/**
 * LinkListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.einfo;

public class LinkListType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkType[] link;

    public LinkListType() {
    }

    public LinkListType(
           gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkType[] link) {
           this.link = link;
    }


    /**
     * Gets the link value for this LinkListType.
     * 
     * @return link
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkType[] getLink() {
        return link;
    }


    /**
     * Sets the link value for this LinkListType.
     * 
     * @param link
     */
    public void setLink(gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkType[] link) {
        this.link = link;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkType getLink(int i) {
        return this.link[i];
    }

    public void setLink(int i, gov.nih.nlm.ncbi.www.soap.eutils.einfo.LinkType _value) {
        this.link[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LinkListType)) return false;
        LinkListType other = (LinkListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.link==null && other.getLink()==null) || 
             (this.link!=null &&
              java.util.Arrays.equals(this.link, other.getLink())));
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
        if (getLink() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLink());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLink(), i);
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
        new org.apache.axis.description.TypeDesc(LinkListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "LinkListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("link");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "Link"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "LinkType"));
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
