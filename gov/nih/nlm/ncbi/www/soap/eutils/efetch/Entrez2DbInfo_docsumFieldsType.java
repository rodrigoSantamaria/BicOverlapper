/**
 * Entrez2DbInfo_docsumFieldsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2DbInfo_docsumFieldsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumFieldInfoType[] entrez2DocsumFieldInfo;

    public Entrez2DbInfo_docsumFieldsType() {
    }

    public Entrez2DbInfo_docsumFieldsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumFieldInfoType[] entrez2DocsumFieldInfo) {
           this.entrez2DocsumFieldInfo = entrez2DocsumFieldInfo;
    }


    /**
     * Gets the entrez2DocsumFieldInfo value for this Entrez2DbInfo_docsumFieldsType.
     * 
     * @return entrez2DocsumFieldInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumFieldInfoType[] getEntrez2DocsumFieldInfo() {
        return entrez2DocsumFieldInfo;
    }


    /**
     * Sets the entrez2DocsumFieldInfo value for this Entrez2DbInfo_docsumFieldsType.
     * 
     * @param entrez2DocsumFieldInfo
     */
    public void setEntrez2DocsumFieldInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumFieldInfoType[] entrez2DocsumFieldInfo) {
        this.entrez2DocsumFieldInfo = entrez2DocsumFieldInfo;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumFieldInfoType getEntrez2DocsumFieldInfo(int i) {
        return this.entrez2DocsumFieldInfo[i];
    }

    public void setEntrez2DocsumFieldInfo(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumFieldInfoType _value) {
        this.entrez2DocsumFieldInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2DbInfo_docsumFieldsType)) return false;
        Entrez2DbInfo_docsumFieldsType other = (Entrez2DbInfo_docsumFieldsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2DocsumFieldInfo==null && other.getEntrez2DocsumFieldInfo()==null) || 
             (this.entrez2DocsumFieldInfo!=null &&
              java.util.Arrays.equals(this.entrez2DocsumFieldInfo, other.getEntrez2DocsumFieldInfo())));
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
        if (getEntrez2DocsumFieldInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntrez2DocsumFieldInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntrez2DocsumFieldInfo(), i);
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
        new org.apache.axis.description.TypeDesc(Entrez2DbInfo_docsumFieldsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-db-info_docsum-fieldsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2DocsumFieldInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum-field-info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum-field-infoType"));
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
