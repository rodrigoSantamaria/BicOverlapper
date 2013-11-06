/**
 * Entrez2DocsumFieldInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2DocsumFieldInfoType  implements java.io.Serializable {
    private java.lang.String entrez2DocsumFieldInfo_fieldName;

    private java.lang.String entrez2DocsumFieldInfo_fieldDescription;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumFieldInfo_fieldTypeType entrez2DocsumFieldInfo_fieldType;

    public Entrez2DocsumFieldInfoType() {
    }

    public Entrez2DocsumFieldInfoType(
           java.lang.String entrez2DocsumFieldInfo_fieldName,
           java.lang.String entrez2DocsumFieldInfo_fieldDescription,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumFieldInfo_fieldTypeType entrez2DocsumFieldInfo_fieldType) {
           this.entrez2DocsumFieldInfo_fieldName = entrez2DocsumFieldInfo_fieldName;
           this.entrez2DocsumFieldInfo_fieldDescription = entrez2DocsumFieldInfo_fieldDescription;
           this.entrez2DocsumFieldInfo_fieldType = entrez2DocsumFieldInfo_fieldType;
    }


    /**
     * Gets the entrez2DocsumFieldInfo_fieldName value for this Entrez2DocsumFieldInfoType.
     * 
     * @return entrez2DocsumFieldInfo_fieldName
     */
    public java.lang.String getEntrez2DocsumFieldInfo_fieldName() {
        return entrez2DocsumFieldInfo_fieldName;
    }


    /**
     * Sets the entrez2DocsumFieldInfo_fieldName value for this Entrez2DocsumFieldInfoType.
     * 
     * @param entrez2DocsumFieldInfo_fieldName
     */
    public void setEntrez2DocsumFieldInfo_fieldName(java.lang.String entrez2DocsumFieldInfo_fieldName) {
        this.entrez2DocsumFieldInfo_fieldName = entrez2DocsumFieldInfo_fieldName;
    }


    /**
     * Gets the entrez2DocsumFieldInfo_fieldDescription value for this Entrez2DocsumFieldInfoType.
     * 
     * @return entrez2DocsumFieldInfo_fieldDescription
     */
    public java.lang.String getEntrez2DocsumFieldInfo_fieldDescription() {
        return entrez2DocsumFieldInfo_fieldDescription;
    }


    /**
     * Sets the entrez2DocsumFieldInfo_fieldDescription value for this Entrez2DocsumFieldInfoType.
     * 
     * @param entrez2DocsumFieldInfo_fieldDescription
     */
    public void setEntrez2DocsumFieldInfo_fieldDescription(java.lang.String entrez2DocsumFieldInfo_fieldDescription) {
        this.entrez2DocsumFieldInfo_fieldDescription = entrez2DocsumFieldInfo_fieldDescription;
    }


    /**
     * Gets the entrez2DocsumFieldInfo_fieldType value for this Entrez2DocsumFieldInfoType.
     * 
     * @return entrez2DocsumFieldInfo_fieldType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumFieldInfo_fieldTypeType getEntrez2DocsumFieldInfo_fieldType() {
        return entrez2DocsumFieldInfo_fieldType;
    }


    /**
     * Sets the entrez2DocsumFieldInfo_fieldType value for this Entrez2DocsumFieldInfoType.
     * 
     * @param entrez2DocsumFieldInfo_fieldType
     */
    public void setEntrez2DocsumFieldInfo_fieldType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2DocsumFieldInfo_fieldTypeType entrez2DocsumFieldInfo_fieldType) {
        this.entrez2DocsumFieldInfo_fieldType = entrez2DocsumFieldInfo_fieldType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2DocsumFieldInfoType)) return false;
        Entrez2DocsumFieldInfoType other = (Entrez2DocsumFieldInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2DocsumFieldInfo_fieldName==null && other.getEntrez2DocsumFieldInfo_fieldName()==null) || 
             (this.entrez2DocsumFieldInfo_fieldName!=null &&
              this.entrez2DocsumFieldInfo_fieldName.equals(other.getEntrez2DocsumFieldInfo_fieldName()))) &&
            ((this.entrez2DocsumFieldInfo_fieldDescription==null && other.getEntrez2DocsumFieldInfo_fieldDescription()==null) || 
             (this.entrez2DocsumFieldInfo_fieldDescription!=null &&
              this.entrez2DocsumFieldInfo_fieldDescription.equals(other.getEntrez2DocsumFieldInfo_fieldDescription()))) &&
            ((this.entrez2DocsumFieldInfo_fieldType==null && other.getEntrez2DocsumFieldInfo_fieldType()==null) || 
             (this.entrez2DocsumFieldInfo_fieldType!=null &&
              this.entrez2DocsumFieldInfo_fieldType.equals(other.getEntrez2DocsumFieldInfo_fieldType())));
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
        if (getEntrez2DocsumFieldInfo_fieldName() != null) {
            _hashCode += getEntrez2DocsumFieldInfo_fieldName().hashCode();
        }
        if (getEntrez2DocsumFieldInfo_fieldDescription() != null) {
            _hashCode += getEntrez2DocsumFieldInfo_fieldDescription().hashCode();
        }
        if (getEntrez2DocsumFieldInfo_fieldType() != null) {
            _hashCode += getEntrez2DocsumFieldInfo_fieldType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2DocsumFieldInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum-field-infoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2DocsumFieldInfo_fieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum-field-info_field-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2DocsumFieldInfo_fieldDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum-field-info_field-description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2DocsumFieldInfo_fieldType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum-field-info_field-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-docsum-field-info_field-typeType"));
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
