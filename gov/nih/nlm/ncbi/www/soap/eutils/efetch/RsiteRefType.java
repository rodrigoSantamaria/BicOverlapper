/**
 * RsiteRefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RsiteRefType  implements java.io.Serializable {
    private java.lang.String rsiteRef_str;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RsiteRef_dbType rsiteRef_db;

    public RsiteRefType() {
    }

    public RsiteRefType(
           java.lang.String rsiteRef_str,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RsiteRef_dbType rsiteRef_db) {
           this.rsiteRef_str = rsiteRef_str;
           this.rsiteRef_db = rsiteRef_db;
    }


    /**
     * Gets the rsiteRef_str value for this RsiteRefType.
     * 
     * @return rsiteRef_str
     */
    public java.lang.String getRsiteRef_str() {
        return rsiteRef_str;
    }


    /**
     * Sets the rsiteRef_str value for this RsiteRefType.
     * 
     * @param rsiteRef_str
     */
    public void setRsiteRef_str(java.lang.String rsiteRef_str) {
        this.rsiteRef_str = rsiteRef_str;
    }


    /**
     * Gets the rsiteRef_db value for this RsiteRefType.
     * 
     * @return rsiteRef_db
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RsiteRef_dbType getRsiteRef_db() {
        return rsiteRef_db;
    }


    /**
     * Sets the rsiteRef_db value for this RsiteRefType.
     * 
     * @param rsiteRef_db
     */
    public void setRsiteRef_db(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RsiteRef_dbType rsiteRef_db) {
        this.rsiteRef_db = rsiteRef_db;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RsiteRefType)) return false;
        RsiteRefType other = (RsiteRefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rsiteRef_str==null && other.getRsiteRef_str()==null) || 
             (this.rsiteRef_str!=null &&
              this.rsiteRef_str.equals(other.getRsiteRef_str()))) &&
            ((this.rsiteRef_db==null && other.getRsiteRef_db()==null) || 
             (this.rsiteRef_db!=null &&
              this.rsiteRef_db.equals(other.getRsiteRef_db())));
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
        if (getRsiteRef_str() != null) {
            _hashCode += getRsiteRef_str().hashCode();
        }
        if (getRsiteRef_db() != null) {
            _hashCode += getRsiteRef_db().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RsiteRefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rsite-refType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsiteRef_str");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rsite-ref_str"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsiteRef_db");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rsite-ref_db"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rsite-ref_dbType"));
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
