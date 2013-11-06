/**
 * Entrez2LinkCountType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2LinkCountType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkCount_linkTypeType entrez2LinkCount_linkType;

    private java.lang.String entrez2LinkCount_linkCount;

    public Entrez2LinkCountType() {
    }

    public Entrez2LinkCountType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkCount_linkTypeType entrez2LinkCount_linkType,
           java.lang.String entrez2LinkCount_linkCount) {
           this.entrez2LinkCount_linkType = entrez2LinkCount_linkType;
           this.entrez2LinkCount_linkCount = entrez2LinkCount_linkCount;
    }


    /**
     * Gets the entrez2LinkCount_linkType value for this Entrez2LinkCountType.
     * 
     * @return entrez2LinkCount_linkType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkCount_linkTypeType getEntrez2LinkCount_linkType() {
        return entrez2LinkCount_linkType;
    }


    /**
     * Sets the entrez2LinkCount_linkType value for this Entrez2LinkCountType.
     * 
     * @param entrez2LinkCount_linkType
     */
    public void setEntrez2LinkCount_linkType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkCount_linkTypeType entrez2LinkCount_linkType) {
        this.entrez2LinkCount_linkType = entrez2LinkCount_linkType;
    }


    /**
     * Gets the entrez2LinkCount_linkCount value for this Entrez2LinkCountType.
     * 
     * @return entrez2LinkCount_linkCount
     */
    public java.lang.String getEntrez2LinkCount_linkCount() {
        return entrez2LinkCount_linkCount;
    }


    /**
     * Sets the entrez2LinkCount_linkCount value for this Entrez2LinkCountType.
     * 
     * @param entrez2LinkCount_linkCount
     */
    public void setEntrez2LinkCount_linkCount(java.lang.String entrez2LinkCount_linkCount) {
        this.entrez2LinkCount_linkCount = entrez2LinkCount_linkCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2LinkCountType)) return false;
        Entrez2LinkCountType other = (Entrez2LinkCountType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2LinkCount_linkType==null && other.getEntrez2LinkCount_linkType()==null) || 
             (this.entrez2LinkCount_linkType!=null &&
              this.entrez2LinkCount_linkType.equals(other.getEntrez2LinkCount_linkType()))) &&
            ((this.entrez2LinkCount_linkCount==null && other.getEntrez2LinkCount_linkCount()==null) || 
             (this.entrez2LinkCount_linkCount!=null &&
              this.entrez2LinkCount_linkCount.equals(other.getEntrez2LinkCount_linkCount())));
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
        if (getEntrez2LinkCount_linkType() != null) {
            _hashCode += getEntrez2LinkCount_linkType().hashCode();
        }
        if (getEntrez2LinkCount_linkCount() != null) {
            _hashCode += getEntrez2LinkCount_linkCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2LinkCountType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-countType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2LinkCount_linkType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-count_link-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-count_link-typeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2LinkCount_linkCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-count_link-count"));
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
