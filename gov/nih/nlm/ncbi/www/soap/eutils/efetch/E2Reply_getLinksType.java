/**
 * E2Reply_getLinksType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class E2Reply_getLinksType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkSetType entrez2LinkSet;

    public E2Reply_getLinksType() {
    }

    public E2Reply_getLinksType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkSetType entrez2LinkSet) {
           this.entrez2LinkSet = entrez2LinkSet;
    }


    /**
     * Gets the entrez2LinkSet value for this E2Reply_getLinksType.
     * 
     * @return entrez2LinkSet
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkSetType getEntrez2LinkSet() {
        return entrez2LinkSet;
    }


    /**
     * Sets the entrez2LinkSet value for this E2Reply_getLinksType.
     * 
     * @param entrez2LinkSet
     */
    public void setEntrez2LinkSet(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2LinkSetType entrez2LinkSet) {
        this.entrez2LinkSet = entrez2LinkSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof E2Reply_getLinksType)) return false;
        E2Reply_getLinksType other = (E2Reply_getLinksType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2LinkSet==null && other.getEntrez2LinkSet()==null) || 
             (this.entrez2LinkSet!=null &&
              this.entrez2LinkSet.equals(other.getEntrez2LinkSet())));
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
        if (getEntrez2LinkSet() != null) {
            _hashCode += getEntrez2LinkSet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(E2Reply_getLinksType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "E2Reply_get-linksType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2LinkSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-set"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-link-setType"));
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
