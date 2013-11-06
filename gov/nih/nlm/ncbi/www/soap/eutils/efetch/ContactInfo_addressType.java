/**
 * ContactInfo_addressType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ContactInfo_addressType  implements java.io.Serializable {
    private java.lang.String[] contactInfo_address_E;

    public ContactInfo_addressType() {
    }

    public ContactInfo_addressType(
           java.lang.String[] contactInfo_address_E) {
           this.contactInfo_address_E = contactInfo_address_E;
    }


    /**
     * Gets the contactInfo_address_E value for this ContactInfo_addressType.
     * 
     * @return contactInfo_address_E
     */
    public java.lang.String[] getContactInfo_address_E() {
        return contactInfo_address_E;
    }


    /**
     * Sets the contactInfo_address_E value for this ContactInfo_addressType.
     * 
     * @param contactInfo_address_E
     */
    public void setContactInfo_address_E(java.lang.String[] contactInfo_address_E) {
        this.contactInfo_address_E = contactInfo_address_E;
    }

    public java.lang.String getContactInfo_address_E(int i) {
        return this.contactInfo_address_E[i];
    }

    public void setContactInfo_address_E(int i, java.lang.String _value) {
        this.contactInfo_address_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContactInfo_addressType)) return false;
        ContactInfo_addressType other = (ContactInfo_addressType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contactInfo_address_E==null && other.getContactInfo_address_E()==null) || 
             (this.contactInfo_address_E!=null &&
              java.util.Arrays.equals(this.contactInfo_address_E, other.getContactInfo_address_E())));
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
        if (getContactInfo_address_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContactInfo_address_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContactInfo_address_E(), i);
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
        new org.apache.axis.description.TypeDesc(ContactInfo_addressType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Contact-info_addressType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactInfo_address_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Contact-info_address_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Contact-info_address_E"));
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
