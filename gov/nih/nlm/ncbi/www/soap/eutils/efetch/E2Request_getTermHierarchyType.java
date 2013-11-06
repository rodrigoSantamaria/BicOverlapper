/**
 * E2Request_getTermHierarchyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class E2Request_getTermHierarchyType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2HierQueryType entrez2HierQuery;

    public E2Request_getTermHierarchyType() {
    }

    public E2Request_getTermHierarchyType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2HierQueryType entrez2HierQuery) {
           this.entrez2HierQuery = entrez2HierQuery;
    }


    /**
     * Gets the entrez2HierQuery value for this E2Request_getTermHierarchyType.
     * 
     * @return entrez2HierQuery
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2HierQueryType getEntrez2HierQuery() {
        return entrez2HierQuery;
    }


    /**
     * Sets the entrez2HierQuery value for this E2Request_getTermHierarchyType.
     * 
     * @param entrez2HierQuery
     */
    public void setEntrez2HierQuery(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2HierQueryType entrez2HierQuery) {
        this.entrez2HierQuery = entrez2HierQuery;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof E2Request_getTermHierarchyType)) return false;
        E2Request_getTermHierarchyType other = (E2Request_getTermHierarchyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2HierQuery==null && other.getEntrez2HierQuery()==null) || 
             (this.entrez2HierQuery!=null &&
              this.entrez2HierQuery.equals(other.getEntrez2HierQuery())));
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
        if (getEntrez2HierQuery() != null) {
            _hashCode += getEntrez2HierQuery().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(E2Request_getTermHierarchyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "E2Request_get-term-hierarchyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2HierQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-hier-query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-hier-queryType"));
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
