/**
 * E2Reply_getLinkCountsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class E2Reply_getLinkCountsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkCountListType entrez2LinkCountList;

    public E2Reply_getLinkCountsType() {
    }

    public E2Reply_getLinkCountsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkCountListType entrez2LinkCountList) {
           this.entrez2LinkCountList = entrez2LinkCountList;
    }


    /**
     * Gets the entrez2LinkCountList value for this E2Reply_getLinkCountsType.
     * 
     * @return entrez2LinkCountList
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkCountListType getEntrez2LinkCountList() {
        return entrez2LinkCountList;
    }


    /**
     * Sets the entrez2LinkCountList value for this E2Reply_getLinkCountsType.
     * 
     * @param entrez2LinkCountList
     */
    public void setEntrez2LinkCountList(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkCountListType entrez2LinkCountList) {
        this.entrez2LinkCountList = entrez2LinkCountList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof E2Reply_getLinkCountsType)) return false;
        E2Reply_getLinkCountsType other = (E2Reply_getLinkCountsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2LinkCountList==null && other.getEntrez2LinkCountList()==null) || 
             (this.entrez2LinkCountList!=null &&
              this.entrez2LinkCountList.equals(other.getEntrez2LinkCountList())));
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
        if (getEntrez2LinkCountList() != null) {
            _hashCode += getEntrez2LinkCountList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(E2Reply_getLinkCountsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "E2Reply_get-link-countsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2LinkCountList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-count-list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-count-listType"));
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
