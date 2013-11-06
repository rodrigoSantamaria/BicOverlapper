/**
 * E2Reply_getTermListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class E2Reply_getTermListType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermListType entrez2TermList;

    public E2Reply_getTermListType() {
    }

    public E2Reply_getTermListType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermListType entrez2TermList) {
           this.entrez2TermList = entrez2TermList;
    }


    /**
     * Gets the entrez2TermList value for this E2Reply_getTermListType.
     * 
     * @return entrez2TermList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermListType getEntrez2TermList() {
        return entrez2TermList;
    }


    /**
     * Sets the entrez2TermList value for this E2Reply_getTermListType.
     * 
     * @param entrez2TermList
     */
    public void setEntrez2TermList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermListType entrez2TermList) {
        this.entrez2TermList = entrez2TermList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof E2Reply_getTermListType)) return false;
        E2Reply_getTermListType other = (E2Reply_getTermListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2TermList==null && other.getEntrez2TermList()==null) || 
             (this.entrez2TermList!=null &&
              this.entrez2TermList.equals(other.getEntrez2TermList())));
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
        if (getEntrez2TermList() != null) {
            _hashCode += getEntrez2TermList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(E2Reply_getTermListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "E2Reply_get-term-listType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2TermList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term-list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term-listType"));
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
