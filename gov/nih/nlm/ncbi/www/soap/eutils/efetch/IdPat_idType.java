/**
 * IdPat_idType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class IdPat_idType  implements java.io.Serializable {
    private java.lang.String idPat_id_number;

    private java.lang.String idPat_id_appNumber;

    public IdPat_idType() {
    }

    public IdPat_idType(
           java.lang.String idPat_id_number,
           java.lang.String idPat_id_appNumber) {
           this.idPat_id_number = idPat_id_number;
           this.idPat_id_appNumber = idPat_id_appNumber;
    }


    /**
     * Gets the idPat_id_number value for this IdPat_idType.
     * 
     * @return idPat_id_number
     */
    public java.lang.String getIdPat_id_number() {
        return idPat_id_number;
    }


    /**
     * Sets the idPat_id_number value for this IdPat_idType.
     * 
     * @param idPat_id_number
     */
    public void setIdPat_id_number(java.lang.String idPat_id_number) {
        this.idPat_id_number = idPat_id_number;
    }


    /**
     * Gets the idPat_id_appNumber value for this IdPat_idType.
     * 
     * @return idPat_id_appNumber
     */
    public java.lang.String getIdPat_id_appNumber() {
        return idPat_id_appNumber;
    }


    /**
     * Sets the idPat_id_appNumber value for this IdPat_idType.
     * 
     * @param idPat_id_appNumber
     */
    public void setIdPat_id_appNumber(java.lang.String idPat_id_appNumber) {
        this.idPat_id_appNumber = idPat_id_appNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdPat_idType)) return false;
        IdPat_idType other = (IdPat_idType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idPat_id_number==null && other.getIdPat_id_number()==null) || 
             (this.idPat_id_number!=null &&
              this.idPat_id_number.equals(other.getIdPat_id_number()))) &&
            ((this.idPat_id_appNumber==null && other.getIdPat_id_appNumber()==null) || 
             (this.idPat_id_appNumber!=null &&
              this.idPat_id_appNumber.equals(other.getIdPat_id_appNumber())));
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
        if (getIdPat_id_number() != null) {
            _hashCode += getIdPat_id_number().hashCode();
        }
        if (getIdPat_id_appNumber() != null) {
            _hashCode += getIdPat_id_appNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdPat_idType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Id-pat_idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPat_id_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Id-pat_id_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPat_id_appNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Id-pat_id_app-number"));
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
