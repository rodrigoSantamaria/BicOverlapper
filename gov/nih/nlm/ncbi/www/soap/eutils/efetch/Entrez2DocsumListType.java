/**
 * Entrez2DocsumListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2DocsumListType  implements java.io.Serializable {
    private java.lang.String entrez2DocsumList_count;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumList_listType entrez2DocsumList_list;

    public Entrez2DocsumListType() {
    }

    public Entrez2DocsumListType(
           java.lang.String entrez2DocsumList_count,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumList_listType entrez2DocsumList_list) {
           this.entrez2DocsumList_count = entrez2DocsumList_count;
           this.entrez2DocsumList_list = entrez2DocsumList_list;
    }


    /**
     * Gets the entrez2DocsumList_count value for this Entrez2DocsumListType.
     * 
     * @return entrez2DocsumList_count
     */
    public java.lang.String getEntrez2DocsumList_count() {
        return entrez2DocsumList_count;
    }


    /**
     * Sets the entrez2DocsumList_count value for this Entrez2DocsumListType.
     * 
     * @param entrez2DocsumList_count
     */
    public void setEntrez2DocsumList_count(java.lang.String entrez2DocsumList_count) {
        this.entrez2DocsumList_count = entrez2DocsumList_count;
    }


    /**
     * Gets the entrez2DocsumList_list value for this Entrez2DocsumListType.
     * 
     * @return entrez2DocsumList_list
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumList_listType getEntrez2DocsumList_list() {
        return entrez2DocsumList_list;
    }


    /**
     * Sets the entrez2DocsumList_list value for this Entrez2DocsumListType.
     * 
     * @param entrez2DocsumList_list
     */
    public void setEntrez2DocsumList_list(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumList_listType entrez2DocsumList_list) {
        this.entrez2DocsumList_list = entrez2DocsumList_list;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2DocsumListType)) return false;
        Entrez2DocsumListType other = (Entrez2DocsumListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2DocsumList_count==null && other.getEntrez2DocsumList_count()==null) || 
             (this.entrez2DocsumList_count!=null &&
              this.entrez2DocsumList_count.equals(other.getEntrez2DocsumList_count()))) &&
            ((this.entrez2DocsumList_list==null && other.getEntrez2DocsumList_list()==null) || 
             (this.entrez2DocsumList_list!=null &&
              this.entrez2DocsumList_list.equals(other.getEntrez2DocsumList_list())));
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
        if (getEntrez2DocsumList_count() != null) {
            _hashCode += getEntrez2DocsumList_count().hashCode();
        }
        if (getEntrez2DocsumList_list() != null) {
            _hashCode += getEntrez2DocsumList_list().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2DocsumListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum-listType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2DocsumList_count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum-list_count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2DocsumList_list");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum-list_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum-list_listType"));
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
