/**
 * GiimportIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GiimportIdType  implements java.io.Serializable {
    private java.lang.String giimportId_id;

    private java.lang.String giimportId_db;

    private java.lang.String giimportId_release;

    public GiimportIdType() {
    }

    public GiimportIdType(
           java.lang.String giimportId_id,
           java.lang.String giimportId_db,
           java.lang.String giimportId_release) {
           this.giimportId_id = giimportId_id;
           this.giimportId_db = giimportId_db;
           this.giimportId_release = giimportId_release;
    }


    /**
     * Gets the giimportId_id value for this GiimportIdType.
     * 
     * @return giimportId_id
     */
    public java.lang.String getGiimportId_id() {
        return giimportId_id;
    }


    /**
     * Sets the giimportId_id value for this GiimportIdType.
     * 
     * @param giimportId_id
     */
    public void setGiimportId_id(java.lang.String giimportId_id) {
        this.giimportId_id = giimportId_id;
    }


    /**
     * Gets the giimportId_db value for this GiimportIdType.
     * 
     * @return giimportId_db
     */
    public java.lang.String getGiimportId_db() {
        return giimportId_db;
    }


    /**
     * Sets the giimportId_db value for this GiimportIdType.
     * 
     * @param giimportId_db
     */
    public void setGiimportId_db(java.lang.String giimportId_db) {
        this.giimportId_db = giimportId_db;
    }


    /**
     * Gets the giimportId_release value for this GiimportIdType.
     * 
     * @return giimportId_release
     */
    public java.lang.String getGiimportId_release() {
        return giimportId_release;
    }


    /**
     * Sets the giimportId_release value for this GiimportIdType.
     * 
     * @param giimportId_release
     */
    public void setGiimportId_release(java.lang.String giimportId_release) {
        this.giimportId_release = giimportId_release;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GiimportIdType)) return false;
        GiimportIdType other = (GiimportIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.giimportId_id==null && other.getGiimportId_id()==null) || 
             (this.giimportId_id!=null &&
              this.giimportId_id.equals(other.getGiimportId_id()))) &&
            ((this.giimportId_db==null && other.getGiimportId_db()==null) || 
             (this.giimportId_db!=null &&
              this.giimportId_db.equals(other.getGiimportId_db()))) &&
            ((this.giimportId_release==null && other.getGiimportId_release()==null) || 
             (this.giimportId_release!=null &&
              this.giimportId_release.equals(other.getGiimportId_release())));
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
        if (getGiimportId_id() != null) {
            _hashCode += getGiimportId_id().hashCode();
        }
        if (getGiimportId_db() != null) {
            _hashCode += getGiimportId_db().hashCode();
        }
        if (getGiimportId_release() != null) {
            _hashCode += getGiimportId_release().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GiimportIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Giimport-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giimportId_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Giimport-id_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giimportId_db");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Giimport-id_db"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giimportId_release");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Giimport-id_release"));
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
