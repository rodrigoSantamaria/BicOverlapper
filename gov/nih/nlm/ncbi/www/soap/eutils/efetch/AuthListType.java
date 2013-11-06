/**
 * AuthListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AuthListType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthList_namesType authList_names;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthList_affilType authList_affil;

    public AuthListType() {
    }

    public AuthListType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthList_namesType authList_names,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthList_affilType authList_affil) {
           this.authList_names = authList_names;
           this.authList_affil = authList_affil;
    }


    /**
     * Gets the authList_names value for this AuthListType.
     * 
     * @return authList_names
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthList_namesType getAuthList_names() {
        return authList_names;
    }


    /**
     * Sets the authList_names value for this AuthListType.
     * 
     * @param authList_names
     */
    public void setAuthList_names(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthList_namesType authList_names) {
        this.authList_names = authList_names;
    }


    /**
     * Gets the authList_affil value for this AuthListType.
     * 
     * @return authList_affil
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthList_affilType getAuthList_affil() {
        return authList_affil;
    }


    /**
     * Sets the authList_affil value for this AuthListType.
     * 
     * @param authList_affil
     */
    public void setAuthList_affil(gov.nih.nlm.ncbi.www.soap.eutils.efetch.AuthList_affilType authList_affil) {
        this.authList_affil = authList_affil;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthListType)) return false;
        AuthListType other = (AuthListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authList_names==null && other.getAuthList_names()==null) || 
             (this.authList_names!=null &&
              this.authList_names.equals(other.getAuthList_names()))) &&
            ((this.authList_affil==null && other.getAuthList_affil()==null) || 
             (this.authList_affil!=null &&
              this.authList_affil.equals(other.getAuthList_affil())));
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
        if (getAuthList_names() != null) {
            _hashCode += getAuthList_names().hashCode();
        }
        if (getAuthList_affil() != null) {
            _hashCode += getAuthList_affil().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Auth-listType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authList_names");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Auth-list_names"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Auth-list_namesType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authList_affil");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Auth-list_affil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Auth-list_affilType"));
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
