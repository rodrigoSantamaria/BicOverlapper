/**
 * Entrez2HierQuery_fieldType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2HierQuery_fieldType  implements java.io.Serializable {
    private java.lang.String entrez2FieldId;

    public Entrez2HierQuery_fieldType() {
    }

    public Entrez2HierQuery_fieldType(
           java.lang.String entrez2FieldId) {
           this.entrez2FieldId = entrez2FieldId;
    }


    /**
     * Gets the entrez2FieldId value for this Entrez2HierQuery_fieldType.
     * 
     * @return entrez2FieldId
     */
    public java.lang.String getEntrez2FieldId() {
        return entrez2FieldId;
    }


    /**
     * Sets the entrez2FieldId value for this Entrez2HierQuery_fieldType.
     * 
     * @param entrez2FieldId
     */
    public void setEntrez2FieldId(java.lang.String entrez2FieldId) {
        this.entrez2FieldId = entrez2FieldId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2HierQuery_fieldType)) return false;
        Entrez2HierQuery_fieldType other = (Entrez2HierQuery_fieldType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2FieldId==null && other.getEntrez2FieldId()==null) || 
             (this.entrez2FieldId!=null &&
              this.entrez2FieldId.equals(other.getEntrez2FieldId())));
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
        if (getEntrez2FieldId() != null) {
            _hashCode += getEntrez2FieldId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2HierQuery_fieldType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-hier-query_fieldType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2FieldId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-field-id"));
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
