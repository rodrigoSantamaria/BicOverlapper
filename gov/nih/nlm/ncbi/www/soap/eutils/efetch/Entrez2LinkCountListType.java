/**
 * Entrez2LinkCountListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2LinkCountListType  implements java.io.Serializable {
    private java.lang.String entrez2LinkCountList_linkTypeCount;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkCountList_linksType entrez2LinkCountList_links;

    public Entrez2LinkCountListType() {
    }

    public Entrez2LinkCountListType(
           java.lang.String entrez2LinkCountList_linkTypeCount,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkCountList_linksType entrez2LinkCountList_links) {
           this.entrez2LinkCountList_linkTypeCount = entrez2LinkCountList_linkTypeCount;
           this.entrez2LinkCountList_links = entrez2LinkCountList_links;
    }


    /**
     * Gets the entrez2LinkCountList_linkTypeCount value for this Entrez2LinkCountListType.
     * 
     * @return entrez2LinkCountList_linkTypeCount
     */
    public java.lang.String getEntrez2LinkCountList_linkTypeCount() {
        return entrez2LinkCountList_linkTypeCount;
    }


    /**
     * Sets the entrez2LinkCountList_linkTypeCount value for this Entrez2LinkCountListType.
     * 
     * @param entrez2LinkCountList_linkTypeCount
     */
    public void setEntrez2LinkCountList_linkTypeCount(java.lang.String entrez2LinkCountList_linkTypeCount) {
        this.entrez2LinkCountList_linkTypeCount = entrez2LinkCountList_linkTypeCount;
    }


    /**
     * Gets the entrez2LinkCountList_links value for this Entrez2LinkCountListType.
     * 
     * @return entrez2LinkCountList_links
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkCountList_linksType getEntrez2LinkCountList_links() {
        return entrez2LinkCountList_links;
    }


    /**
     * Sets the entrez2LinkCountList_links value for this Entrez2LinkCountListType.
     * 
     * @param entrez2LinkCountList_links
     */
    public void setEntrez2LinkCountList_links(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkCountList_linksType entrez2LinkCountList_links) {
        this.entrez2LinkCountList_links = entrez2LinkCountList_links;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2LinkCountListType)) return false;
        Entrez2LinkCountListType other = (Entrez2LinkCountListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2LinkCountList_linkTypeCount==null && other.getEntrez2LinkCountList_linkTypeCount()==null) || 
             (this.entrez2LinkCountList_linkTypeCount!=null &&
              this.entrez2LinkCountList_linkTypeCount.equals(other.getEntrez2LinkCountList_linkTypeCount()))) &&
            ((this.entrez2LinkCountList_links==null && other.getEntrez2LinkCountList_links()==null) || 
             (this.entrez2LinkCountList_links!=null &&
              this.entrez2LinkCountList_links.equals(other.getEntrez2LinkCountList_links())));
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
        if (getEntrez2LinkCountList_linkTypeCount() != null) {
            _hashCode += getEntrez2LinkCountList_linkTypeCount().hashCode();
        }
        if (getEntrez2LinkCountList_links() != null) {
            _hashCode += getEntrez2LinkCountList_links().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2LinkCountListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-count-listType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2LinkCountList_linkTypeCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-count-list_link-type-count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2LinkCountList_links");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-count-list_links"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-count-list_linksType"));
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
