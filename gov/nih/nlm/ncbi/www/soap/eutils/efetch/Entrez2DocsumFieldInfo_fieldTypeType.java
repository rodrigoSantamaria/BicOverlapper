/**
 * Entrez2DocsumFieldInfo_fieldTypeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2DocsumFieldInfo_fieldTypeType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumFieldTypeType entrez2DocsumFieldType;

    public Entrez2DocsumFieldInfo_fieldTypeType() {
    }

    public Entrez2DocsumFieldInfo_fieldTypeType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumFieldTypeType entrez2DocsumFieldType) {
           this.entrez2DocsumFieldType = entrez2DocsumFieldType;
    }


    /**
     * Gets the entrez2DocsumFieldType value for this Entrez2DocsumFieldInfo_fieldTypeType.
     * 
     * @return entrez2DocsumFieldType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumFieldTypeType getEntrez2DocsumFieldType() {
        return entrez2DocsumFieldType;
    }


    /**
     * Sets the entrez2DocsumFieldType value for this Entrez2DocsumFieldInfo_fieldTypeType.
     * 
     * @param entrez2DocsumFieldType
     */
    public void setEntrez2DocsumFieldType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumFieldTypeType entrez2DocsumFieldType) {
        this.entrez2DocsumFieldType = entrez2DocsumFieldType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2DocsumFieldInfo_fieldTypeType)) return false;
        Entrez2DocsumFieldInfo_fieldTypeType other = (Entrez2DocsumFieldInfo_fieldTypeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2DocsumFieldType==null && other.getEntrez2DocsumFieldType()==null) || 
             (this.entrez2DocsumFieldType!=null &&
              this.entrez2DocsumFieldType.equals(other.getEntrez2DocsumFieldType())));
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
        if (getEntrez2DocsumFieldType() != null) {
            _hashCode += getEntrez2DocsumFieldType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2DocsumFieldInfo_fieldTypeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum-field-info_field-typeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2DocsumFieldType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum-field-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum-field-typeType"));
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
