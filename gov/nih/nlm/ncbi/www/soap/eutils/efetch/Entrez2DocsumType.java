/**
 * Entrez2DocsumType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2DocsumType  implements java.io.Serializable {
    private java.lang.String entrez2Docsum_uid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Docsum_docsumDataType entrez2Docsum_docsumData;

    public Entrez2DocsumType() {
    }

    public Entrez2DocsumType(
           java.lang.String entrez2Docsum_uid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Docsum_docsumDataType entrez2Docsum_docsumData) {
           this.entrez2Docsum_uid = entrez2Docsum_uid;
           this.entrez2Docsum_docsumData = entrez2Docsum_docsumData;
    }


    /**
     * Gets the entrez2Docsum_uid value for this Entrez2DocsumType.
     * 
     * @return entrez2Docsum_uid
     */
    public java.lang.String getEntrez2Docsum_uid() {
        return entrez2Docsum_uid;
    }


    /**
     * Sets the entrez2Docsum_uid value for this Entrez2DocsumType.
     * 
     * @param entrez2Docsum_uid
     */
    public void setEntrez2Docsum_uid(java.lang.String entrez2Docsum_uid) {
        this.entrez2Docsum_uid = entrez2Docsum_uid;
    }


    /**
     * Gets the entrez2Docsum_docsumData value for this Entrez2DocsumType.
     * 
     * @return entrez2Docsum_docsumData
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Docsum_docsumDataType getEntrez2Docsum_docsumData() {
        return entrez2Docsum_docsumData;
    }


    /**
     * Sets the entrez2Docsum_docsumData value for this Entrez2DocsumType.
     * 
     * @param entrez2Docsum_docsumData
     */
    public void setEntrez2Docsum_docsumData(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Docsum_docsumDataType entrez2Docsum_docsumData) {
        this.entrez2Docsum_docsumData = entrez2Docsum_docsumData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2DocsumType)) return false;
        Entrez2DocsumType other = (Entrez2DocsumType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2Docsum_uid==null && other.getEntrez2Docsum_uid()==null) || 
             (this.entrez2Docsum_uid!=null &&
              this.entrez2Docsum_uid.equals(other.getEntrez2Docsum_uid()))) &&
            ((this.entrez2Docsum_docsumData==null && other.getEntrez2Docsum_docsumData()==null) || 
             (this.entrez2Docsum_docsumData!=null &&
              this.entrez2Docsum_docsumData.equals(other.getEntrez2Docsum_docsumData())));
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
        if (getEntrez2Docsum_uid() != null) {
            _hashCode += getEntrez2Docsum_uid().hashCode();
        }
        if (getEntrez2Docsum_docsumData() != null) {
            _hashCode += getEntrez2Docsum_docsumData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2DocsumType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsumType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Docsum_uid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum_uid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Docsum_docsumData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum_docsum-data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum_docsum-dataType"));
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
