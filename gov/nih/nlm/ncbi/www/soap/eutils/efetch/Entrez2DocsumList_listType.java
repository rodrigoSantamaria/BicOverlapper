/**
 * Entrez2DocsumList_listType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2DocsumList_listType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumType[] entrez2Docsum;

    public Entrez2DocsumList_listType() {
    }

    public Entrez2DocsumList_listType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumType[] entrez2Docsum) {
           this.entrez2Docsum = entrez2Docsum;
    }


    /**
     * Gets the entrez2Docsum value for this Entrez2DocsumList_listType.
     * 
     * @return entrez2Docsum
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumType[] getEntrez2Docsum() {
        return entrez2Docsum;
    }


    /**
     * Sets the entrez2Docsum value for this Entrez2DocsumList_listType.
     * 
     * @param entrez2Docsum
     */
    public void setEntrez2Docsum(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumType[] entrez2Docsum) {
        this.entrez2Docsum = entrez2Docsum;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumType getEntrez2Docsum(int i) {
        return this.entrez2Docsum[i];
    }

    public void setEntrez2Docsum(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumType _value) {
        this.entrez2Docsum[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2DocsumList_listType)) return false;
        Entrez2DocsumList_listType other = (Entrez2DocsumList_listType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2Docsum==null && other.getEntrez2Docsum()==null) || 
             (this.entrez2Docsum!=null &&
              java.util.Arrays.equals(this.entrez2Docsum, other.getEntrez2Docsum())));
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
        if (getEntrez2Docsum() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntrez2Docsum());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntrez2Docsum(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2DocsumList_listType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum-list_listType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Docsum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsumType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
