/**
 * MimEditItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MimEditItemType  implements java.io.Serializable {
    private java.lang.String mimEditItem_author;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEditItem_modDateType mimEditItem_modDate;

    public MimEditItemType() {
    }

    public MimEditItemType(
           java.lang.String mimEditItem_author,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEditItem_modDateType mimEditItem_modDate) {
           this.mimEditItem_author = mimEditItem_author;
           this.mimEditItem_modDate = mimEditItem_modDate;
    }


    /**
     * Gets the mimEditItem_author value for this MimEditItemType.
     * 
     * @return mimEditItem_author
     */
    public java.lang.String getMimEditItem_author() {
        return mimEditItem_author;
    }


    /**
     * Sets the mimEditItem_author value for this MimEditItemType.
     * 
     * @param mimEditItem_author
     */
    public void setMimEditItem_author(java.lang.String mimEditItem_author) {
        this.mimEditItem_author = mimEditItem_author;
    }


    /**
     * Gets the mimEditItem_modDate value for this MimEditItemType.
     * 
     * @return mimEditItem_modDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEditItem_modDateType getMimEditItem_modDate() {
        return mimEditItem_modDate;
    }


    /**
     * Sets the mimEditItem_modDate value for this MimEditItemType.
     * 
     * @param mimEditItem_modDate
     */
    public void setMimEditItem_modDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEditItem_modDateType mimEditItem_modDate) {
        this.mimEditItem_modDate = mimEditItem_modDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MimEditItemType)) return false;
        MimEditItemType other = (MimEditItemType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mimEditItem_author==null && other.getMimEditItem_author()==null) || 
             (this.mimEditItem_author!=null &&
              this.mimEditItem_author.equals(other.getMimEditItem_author()))) &&
            ((this.mimEditItem_modDate==null && other.getMimEditItem_modDate()==null) || 
             (this.mimEditItem_modDate!=null &&
              this.mimEditItem_modDate.equals(other.getMimEditItem_modDate())));
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
        if (getMimEditItem_author() != null) {
            _hashCode += getMimEditItem_author().hashCode();
        }
        if (getMimEditItem_modDate() != null) {
            _hashCode += getMimEditItem_modDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MimEditItemType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-edit-itemType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEditItem_author");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-edit-item_author"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEditItem_modDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-edit-item_modDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-edit-item_modDateType"));
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
