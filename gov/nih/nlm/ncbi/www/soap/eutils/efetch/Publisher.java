/**
 * Publisher.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Publisher  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublisherName publisherName;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublisherLoc publisherLoc;

    public Publisher() {
    }

    public Publisher(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublisherName publisherName,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublisherLoc publisherLoc) {
           this.publisherName = publisherName;
           this.publisherLoc = publisherLoc;
    }


    /**
     * Gets the publisherName value for this Publisher.
     * 
     * @return publisherName
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublisherName getPublisherName() {
        return publisherName;
    }


    /**
     * Sets the publisherName value for this Publisher.
     * 
     * @param publisherName
     */
    public void setPublisherName(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublisherName publisherName) {
        this.publisherName = publisherName;
    }


    /**
     * Gets the publisherLoc value for this Publisher.
     * 
     * @return publisherLoc
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublisherLoc getPublisherLoc() {
        return publisherLoc;
    }


    /**
     * Sets the publisherLoc value for this Publisher.
     * 
     * @param publisherLoc
     */
    public void setPublisherLoc(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PublisherLoc publisherLoc) {
        this.publisherLoc = publisherLoc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Publisher)) return false;
        Publisher other = (Publisher) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.publisherName==null && other.getPublisherName()==null) || 
             (this.publisherName!=null &&
              this.publisherName.equals(other.getPublisherName()))) &&
            ((this.publisherLoc==null && other.getPublisherLoc()==null) || 
             (this.publisherLoc!=null &&
              this.publisherLoc.equals(other.getPublisherLoc())));
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
        if (getPublisherName() != null) {
            _hashCode += getPublisherName().hashCode();
        }
        if (getPublisherLoc() != null) {
            _hashCode += getPublisherLoc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Publisher.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">publisher"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisherName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "publisher-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">publisher-name"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisherLoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "publisher-loc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">publisher-loc"));
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
