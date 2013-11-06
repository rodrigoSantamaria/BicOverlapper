/**
 * SubmitBlock_contactType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class SubmitBlock_contactType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ContactInfoType contactInfo;

    public SubmitBlock_contactType() {
    }

    public SubmitBlock_contactType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ContactInfoType contactInfo) {
           this.contactInfo = contactInfo;
    }


    /**
     * Gets the contactInfo value for this SubmitBlock_contactType.
     * 
     * @return contactInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ContactInfoType getContactInfo() {
        return contactInfo;
    }


    /**
     * Sets the contactInfo value for this SubmitBlock_contactType.
     * 
     * @param contactInfo
     */
    public void setContactInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ContactInfoType contactInfo) {
        this.contactInfo = contactInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitBlock_contactType)) return false;
        SubmitBlock_contactType other = (SubmitBlock_contactType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contactInfo==null && other.getContactInfo()==null) || 
             (this.contactInfo!=null &&
              this.contactInfo.equals(other.getContactInfo())));
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
        if (getContactInfo() != null) {
            _hashCode += getContactInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmitBlock_contactType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Submit-block_contactType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Contact-info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Contact-infoType"));
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
