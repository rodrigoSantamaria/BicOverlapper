/**
 * AffilType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class AffilType  implements java.io.Serializable {
    private java.lang.String affil_str;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Affil_stdType affil_std;

    public AffilType() {
    }

    public AffilType(
           java.lang.String affil_str,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Affil_stdType affil_std) {
           this.affil_str = affil_str;
           this.affil_std = affil_std;
    }


    /**
     * Gets the affil_str value for this AffilType.
     * 
     * @return affil_str
     */
    public java.lang.String getAffil_str() {
        return affil_str;
    }


    /**
     * Sets the affil_str value for this AffilType.
     * 
     * @param affil_str
     */
    public void setAffil_str(java.lang.String affil_str) {
        this.affil_str = affil_str;
    }


    /**
     * Gets the affil_std value for this AffilType.
     * 
     * @return affil_std
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Affil_stdType getAffil_std() {
        return affil_std;
    }


    /**
     * Sets the affil_std value for this AffilType.
     * 
     * @param affil_std
     */
    public void setAffil_std(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Affil_stdType affil_std) {
        this.affil_std = affil_std;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AffilType)) return false;
        AffilType other = (AffilType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.affil_str==null && other.getAffil_str()==null) || 
             (this.affil_str!=null &&
              this.affil_str.equals(other.getAffil_str()))) &&
            ((this.affil_std==null && other.getAffil_std()==null) || 
             (this.affil_std!=null &&
              this.affil_std.equals(other.getAffil_std())));
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
        if (getAffil_str() != null) {
            _hashCode += getAffil_str().hashCode();
        }
        if (getAffil_std() != null) {
            _hashCode += getAffil_std().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AffilType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "AffilType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affil_str");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Affil_str"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affil_std");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Affil_std"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Affil_stdType"));
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
