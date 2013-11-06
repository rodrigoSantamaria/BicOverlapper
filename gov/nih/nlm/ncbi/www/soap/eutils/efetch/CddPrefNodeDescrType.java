/**
 * CddPrefNodeDescrType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CddPrefNodeDescrType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodeDescr_createDateType cddPrefNodeDescr_createDate;

    private java.lang.String cddPrefNodeDescr_description;

    public CddPrefNodeDescrType() {
    }

    public CddPrefNodeDescrType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodeDescr_createDateType cddPrefNodeDescr_createDate,
           java.lang.String cddPrefNodeDescr_description) {
           this.cddPrefNodeDescr_createDate = cddPrefNodeDescr_createDate;
           this.cddPrefNodeDescr_description = cddPrefNodeDescr_description;
    }


    /**
     * Gets the cddPrefNodeDescr_createDate value for this CddPrefNodeDescrType.
     * 
     * @return cddPrefNodeDescr_createDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodeDescr_createDateType getCddPrefNodeDescr_createDate() {
        return cddPrefNodeDescr_createDate;
    }


    /**
     * Sets the cddPrefNodeDescr_createDate value for this CddPrefNodeDescrType.
     * 
     * @param cddPrefNodeDescr_createDate
     */
    public void setCddPrefNodeDescr_createDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddPrefNodeDescr_createDateType cddPrefNodeDescr_createDate) {
        this.cddPrefNodeDescr_createDate = cddPrefNodeDescr_createDate;
    }


    /**
     * Gets the cddPrefNodeDescr_description value for this CddPrefNodeDescrType.
     * 
     * @return cddPrefNodeDescr_description
     */
    public java.lang.String getCddPrefNodeDescr_description() {
        return cddPrefNodeDescr_description;
    }


    /**
     * Sets the cddPrefNodeDescr_description value for this CddPrefNodeDescrType.
     * 
     * @param cddPrefNodeDescr_description
     */
    public void setCddPrefNodeDescr_description(java.lang.String cddPrefNodeDescr_description) {
        this.cddPrefNodeDescr_description = cddPrefNodeDescr_description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CddPrefNodeDescrType)) return false;
        CddPrefNodeDescrType other = (CddPrefNodeDescrType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cddPrefNodeDescr_createDate==null && other.getCddPrefNodeDescr_createDate()==null) || 
             (this.cddPrefNodeDescr_createDate!=null &&
              this.cddPrefNodeDescr_createDate.equals(other.getCddPrefNodeDescr_createDate()))) &&
            ((this.cddPrefNodeDescr_description==null && other.getCddPrefNodeDescr_description()==null) || 
             (this.cddPrefNodeDescr_description!=null &&
              this.cddPrefNodeDescr_description.equals(other.getCddPrefNodeDescr_description())));
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
        if (getCddPrefNodeDescr_createDate() != null) {
            _hashCode += getCddPrefNodeDescr_createDate().hashCode();
        }
        if (getCddPrefNodeDescr_description() != null) {
            _hashCode += getCddPrefNodeDescr_description().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CddPrefNodeDescrType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-pref-node-descrType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddPrefNodeDescr_createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-pref-node-descr_create-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-pref-node-descr_create-dateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddPrefNodeDescr_description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-pref-node-descr_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
