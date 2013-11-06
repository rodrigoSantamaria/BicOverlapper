/**
 * IdPatType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class IdPatType  implements java.io.Serializable {
    private java.lang.String idPat_country;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.IdPat_idType idPat_id;

    private java.lang.String idPat_docType;

    public IdPatType() {
    }

    public IdPatType(
           java.lang.String idPat_country,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.IdPat_idType idPat_id,
           java.lang.String idPat_docType) {
           this.idPat_country = idPat_country;
           this.idPat_id = idPat_id;
           this.idPat_docType = idPat_docType;
    }


    /**
     * Gets the idPat_country value for this IdPatType.
     * 
     * @return idPat_country
     */
    public java.lang.String getIdPat_country() {
        return idPat_country;
    }


    /**
     * Sets the idPat_country value for this IdPatType.
     * 
     * @param idPat_country
     */
    public void setIdPat_country(java.lang.String idPat_country) {
        this.idPat_country = idPat_country;
    }


    /**
     * Gets the idPat_id value for this IdPatType.
     * 
     * @return idPat_id
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.IdPat_idType getIdPat_id() {
        return idPat_id;
    }


    /**
     * Sets the idPat_id value for this IdPatType.
     * 
     * @param idPat_id
     */
    public void setIdPat_id(gov.nih.nlm.ncbi.www.soap.eutils.efetch.IdPat_idType idPat_id) {
        this.idPat_id = idPat_id;
    }


    /**
     * Gets the idPat_docType value for this IdPatType.
     * 
     * @return idPat_docType
     */
    public java.lang.String getIdPat_docType() {
        return idPat_docType;
    }


    /**
     * Sets the idPat_docType value for this IdPatType.
     * 
     * @param idPat_docType
     */
    public void setIdPat_docType(java.lang.String idPat_docType) {
        this.idPat_docType = idPat_docType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdPatType)) return false;
        IdPatType other = (IdPatType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idPat_country==null && other.getIdPat_country()==null) || 
             (this.idPat_country!=null &&
              this.idPat_country.equals(other.getIdPat_country()))) &&
            ((this.idPat_id==null && other.getIdPat_id()==null) || 
             (this.idPat_id!=null &&
              this.idPat_id.equals(other.getIdPat_id()))) &&
            ((this.idPat_docType==null && other.getIdPat_docType()==null) || 
             (this.idPat_docType!=null &&
              this.idPat_docType.equals(other.getIdPat_docType())));
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
        if (getIdPat_country() != null) {
            _hashCode += getIdPat_country().hashCode();
        }
        if (getIdPat_id() != null) {
            _hashCode += getIdPat_id().hashCode();
        }
        if (getIdPat_docType() != null) {
            _hashCode += getIdPat_docType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdPatType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Id-patType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPat_country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Id-pat_country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPat_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Id-pat_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Id-pat_idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPat_docType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Id-pat_doc-type"));
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
