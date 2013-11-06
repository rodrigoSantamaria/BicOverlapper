/**
 * Entrez2DocsumDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2DocsumDataType  implements java.io.Serializable {
    private java.lang.String entrez2DocsumData_fieldName;

    private java.lang.String entrez2DocsumData_fieldValue;

    public Entrez2DocsumDataType() {
    }

    public Entrez2DocsumDataType(
           java.lang.String entrez2DocsumData_fieldName,
           java.lang.String entrez2DocsumData_fieldValue) {
           this.entrez2DocsumData_fieldName = entrez2DocsumData_fieldName;
           this.entrez2DocsumData_fieldValue = entrez2DocsumData_fieldValue;
    }


    /**
     * Gets the entrez2DocsumData_fieldName value for this Entrez2DocsumDataType.
     * 
     * @return entrez2DocsumData_fieldName
     */
    public java.lang.String getEntrez2DocsumData_fieldName() {
        return entrez2DocsumData_fieldName;
    }


    /**
     * Sets the entrez2DocsumData_fieldName value for this Entrez2DocsumDataType.
     * 
     * @param entrez2DocsumData_fieldName
     */
    public void setEntrez2DocsumData_fieldName(java.lang.String entrez2DocsumData_fieldName) {
        this.entrez2DocsumData_fieldName = entrez2DocsumData_fieldName;
    }


    /**
     * Gets the entrez2DocsumData_fieldValue value for this Entrez2DocsumDataType.
     * 
     * @return entrez2DocsumData_fieldValue
     */
    public java.lang.String getEntrez2DocsumData_fieldValue() {
        return entrez2DocsumData_fieldValue;
    }


    /**
     * Sets the entrez2DocsumData_fieldValue value for this Entrez2DocsumDataType.
     * 
     * @param entrez2DocsumData_fieldValue
     */
    public void setEntrez2DocsumData_fieldValue(java.lang.String entrez2DocsumData_fieldValue) {
        this.entrez2DocsumData_fieldValue = entrez2DocsumData_fieldValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2DocsumDataType)) return false;
        Entrez2DocsumDataType other = (Entrez2DocsumDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2DocsumData_fieldName==null && other.getEntrez2DocsumData_fieldName()==null) || 
             (this.entrez2DocsumData_fieldName!=null &&
              this.entrez2DocsumData_fieldName.equals(other.getEntrez2DocsumData_fieldName()))) &&
            ((this.entrez2DocsumData_fieldValue==null && other.getEntrez2DocsumData_fieldValue()==null) || 
             (this.entrez2DocsumData_fieldValue!=null &&
              this.entrez2DocsumData_fieldValue.equals(other.getEntrez2DocsumData_fieldValue())));
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
        if (getEntrez2DocsumData_fieldName() != null) {
            _hashCode += getEntrez2DocsumData_fieldName().hashCode();
        }
        if (getEntrez2DocsumData_fieldValue() != null) {
            _hashCode += getEntrez2DocsumData_fieldValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2DocsumDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum-dataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2DocsumData_fieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum-data_field-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2DocsumData_fieldValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum-data_field-value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
