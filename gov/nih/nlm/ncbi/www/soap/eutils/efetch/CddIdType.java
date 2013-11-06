/**
 * CddIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class CddIdType  implements java.io.Serializable {
    private java.lang.String cddId_uid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddId_gidType cddId_gid;

    public CddIdType() {
    }

    public CddIdType(
           java.lang.String cddId_uid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddId_gidType cddId_gid) {
           this.cddId_uid = cddId_uid;
           this.cddId_gid = cddId_gid;
    }


    /**
     * Gets the cddId_uid value for this CddIdType.
     * 
     * @return cddId_uid
     */
    public java.lang.String getCddId_uid() {
        return cddId_uid;
    }


    /**
     * Sets the cddId_uid value for this CddIdType.
     * 
     * @param cddId_uid
     */
    public void setCddId_uid(java.lang.String cddId_uid) {
        this.cddId_uid = cddId_uid;
    }


    /**
     * Gets the cddId_gid value for this CddIdType.
     * 
     * @return cddId_gid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddId_gidType getCddId_gid() {
        return cddId_gid;
    }


    /**
     * Sets the cddId_gid value for this CddIdType.
     * 
     * @param cddId_gid
     */
    public void setCddId_gid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CddId_gidType cddId_gid) {
        this.cddId_gid = cddId_gid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CddIdType)) return false;
        CddIdType other = (CddIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cddId_uid==null && other.getCddId_uid()==null) || 
             (this.cddId_uid!=null &&
              this.cddId_uid.equals(other.getCddId_uid()))) &&
            ((this.cddId_gid==null && other.getCddId_gid()==null) || 
             (this.cddId_gid!=null &&
              this.cddId_gid.equals(other.getCddId_gid())));
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
        if (getCddId_uid() != null) {
            _hashCode += getCddId_uid().hashCode();
        }
        if (getCddId_gid() != null) {
            _hashCode += getCddId_gid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CddIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddId_uid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-id_uid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cddId_gid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-id_gid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd-id_gidType"));
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
