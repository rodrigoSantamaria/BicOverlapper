/**
 * E2Reply_getDocsumType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class E2Reply_getDocsumType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumListType entrez2DocsumList;

    public E2Reply_getDocsumType() {
    }

    public E2Reply_getDocsumType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumListType entrez2DocsumList) {
           this.entrez2DocsumList = entrez2DocsumList;
    }


    /**
     * Gets the entrez2DocsumList value for this E2Reply_getDocsumType.
     * 
     * @return entrez2DocsumList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumListType getEntrez2DocsumList() {
        return entrez2DocsumList;
    }


    /**
     * Sets the entrez2DocsumList value for this E2Reply_getDocsumType.
     * 
     * @param entrez2DocsumList
     */
    public void setEntrez2DocsumList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumListType entrez2DocsumList) {
        this.entrez2DocsumList = entrez2DocsumList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof E2Reply_getDocsumType)) return false;
        E2Reply_getDocsumType other = (E2Reply_getDocsumType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2DocsumList==null && other.getEntrez2DocsumList()==null) || 
             (this.entrez2DocsumList!=null &&
              this.entrez2DocsumList.equals(other.getEntrez2DocsumList())));
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
        if (getEntrez2DocsumList() != null) {
            _hashCode += getEntrez2DocsumList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(E2Reply_getDocsumType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "E2Reply_get-docsumType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2DocsumList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum-list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum-listType"));
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
