/**
 * Entrez2Docsum_docsumDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2Docsum_docsumDataType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumDataType[] entrez2DocsumData;

    public Entrez2Docsum_docsumDataType() {
    }

    public Entrez2Docsum_docsumDataType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumDataType[] entrez2DocsumData) {
           this.entrez2DocsumData = entrez2DocsumData;
    }


    /**
     * Gets the entrez2DocsumData value for this Entrez2Docsum_docsumDataType.
     * 
     * @return entrez2DocsumData
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumDataType[] getEntrez2DocsumData() {
        return entrez2DocsumData;
    }


    /**
     * Sets the entrez2DocsumData value for this Entrez2Docsum_docsumDataType.
     * 
     * @param entrez2DocsumData
     */
    public void setEntrez2DocsumData(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumDataType[] entrez2DocsumData) {
        this.entrez2DocsumData = entrez2DocsumData;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumDataType getEntrez2DocsumData(int i) {
        return this.entrez2DocsumData[i];
    }

    public void setEntrez2DocsumData(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumDataType _value) {
        this.entrez2DocsumData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2Docsum_docsumDataType)) return false;
        Entrez2Docsum_docsumDataType other = (Entrez2Docsum_docsumDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2DocsumData==null && other.getEntrez2DocsumData()==null) || 
             (this.entrez2DocsumData!=null &&
              java.util.Arrays.equals(this.entrez2DocsumData, other.getEntrez2DocsumData())));
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
        if (getEntrez2DocsumData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntrez2DocsumData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntrez2DocsumData(), i);
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
        new org.apache.axis.description.TypeDesc(Entrez2Docsum_docsumDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum_docsum-dataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2DocsumData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum-data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum-dataType"));
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
