/**
 * ID2SFeatTypeInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2SFeatTypeInfoType  implements java.io.Serializable {
    private java.lang.String ID2SFeatTypeInfo_type;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SFeatTypeInfo_subtypesType ID2SFeatTypeInfo_subtypes;

    public ID2SFeatTypeInfoType() {
    }

    public ID2SFeatTypeInfoType(
           java.lang.String ID2SFeatTypeInfo_type,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SFeatTypeInfo_subtypesType ID2SFeatTypeInfo_subtypes) {
           this.ID2SFeatTypeInfo_type = ID2SFeatTypeInfo_type;
           this.ID2SFeatTypeInfo_subtypes = ID2SFeatTypeInfo_subtypes;
    }


    /**
     * Gets the ID2SFeatTypeInfo_type value for this ID2SFeatTypeInfoType.
     * 
     * @return ID2SFeatTypeInfo_type
     */
    public java.lang.String getID2SFeatTypeInfo_type() {
        return ID2SFeatTypeInfo_type;
    }


    /**
     * Sets the ID2SFeatTypeInfo_type value for this ID2SFeatTypeInfoType.
     * 
     * @param ID2SFeatTypeInfo_type
     */
    public void setID2SFeatTypeInfo_type(java.lang.String ID2SFeatTypeInfo_type) {
        this.ID2SFeatTypeInfo_type = ID2SFeatTypeInfo_type;
    }


    /**
     * Gets the ID2SFeatTypeInfo_subtypes value for this ID2SFeatTypeInfoType.
     * 
     * @return ID2SFeatTypeInfo_subtypes
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SFeatTypeInfo_subtypesType getID2SFeatTypeInfo_subtypes() {
        return ID2SFeatTypeInfo_subtypes;
    }


    /**
     * Sets the ID2SFeatTypeInfo_subtypes value for this ID2SFeatTypeInfoType.
     * 
     * @param ID2SFeatTypeInfo_subtypes
     */
    public void setID2SFeatTypeInfo_subtypes(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2SFeatTypeInfo_subtypesType ID2SFeatTypeInfo_subtypes) {
        this.ID2SFeatTypeInfo_subtypes = ID2SFeatTypeInfo_subtypes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2SFeatTypeInfoType)) return false;
        ID2SFeatTypeInfoType other = (ID2SFeatTypeInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2SFeatTypeInfo_type==null && other.getID2SFeatTypeInfo_type()==null) || 
             (this.ID2SFeatTypeInfo_type!=null &&
              this.ID2SFeatTypeInfo_type.equals(other.getID2SFeatTypeInfo_type()))) &&
            ((this.ID2SFeatTypeInfo_subtypes==null && other.getID2SFeatTypeInfo_subtypes()==null) || 
             (this.ID2SFeatTypeInfo_subtypes!=null &&
              this.ID2SFeatTypeInfo_subtypes.equals(other.getID2SFeatTypeInfo_subtypes())));
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
        if (getID2SFeatTypeInfo_type() != null) {
            _hashCode += getID2SFeatTypeInfo_type().hashCode();
        }
        if (getID2SFeatTypeInfo_subtypes() != null) {
            _hashCode += getID2SFeatTypeInfo_subtypes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2SFeatTypeInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Feat-type-InfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SFeatTypeInfo_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Feat-type-Info_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2SFeatTypeInfo_subtypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Feat-type-Info_subtypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2S-Feat-type-Info_subtypesType"));
        elemField.setMinOccurs(0);
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
