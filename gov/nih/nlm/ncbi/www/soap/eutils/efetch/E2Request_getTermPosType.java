/**
 * E2Request_getTermPosType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class E2Request_getTermPosType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermQueryType entrez2TermQuery;

    public E2Request_getTermPosType() {
    }

    public E2Request_getTermPosType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermQueryType entrez2TermQuery) {
           this.entrez2TermQuery = entrez2TermQuery;
    }


    /**
     * Gets the entrez2TermQuery value for this E2Request_getTermPosType.
     * 
     * @return entrez2TermQuery
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermQueryType getEntrez2TermQuery() {
        return entrez2TermQuery;
    }


    /**
     * Sets the entrez2TermQuery value for this E2Request_getTermPosType.
     * 
     * @param entrez2TermQuery
     */
    public void setEntrez2TermQuery(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermQueryType entrez2TermQuery) {
        this.entrez2TermQuery = entrez2TermQuery;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof E2Request_getTermPosType)) return false;
        E2Request_getTermPosType other = (E2Request_getTermPosType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2TermQuery==null && other.getEntrez2TermQuery()==null) || 
             (this.entrez2TermQuery!=null &&
              this.entrez2TermQuery.equals(other.getEntrez2TermQuery())));
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
        if (getEntrez2TermQuery() != null) {
            _hashCode += getEntrez2TermQuery().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(E2Request_getTermPosType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "E2Request_get-term-posType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2TermQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term-query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term-queryType"));
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
