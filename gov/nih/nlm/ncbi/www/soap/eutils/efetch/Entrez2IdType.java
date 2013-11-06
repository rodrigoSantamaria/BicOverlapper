/**
 * Entrez2IdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2IdType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Id_dbType entrez2Id_db;

    private java.lang.String entrez2Id_uid;

    public Entrez2IdType() {
    }

    public Entrez2IdType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Id_dbType entrez2Id_db,
           java.lang.String entrez2Id_uid) {
           this.entrez2Id_db = entrez2Id_db;
           this.entrez2Id_uid = entrez2Id_uid;
    }


    /**
     * Gets the entrez2Id_db value for this Entrez2IdType.
     * 
     * @return entrez2Id_db
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Id_dbType getEntrez2Id_db() {
        return entrez2Id_db;
    }


    /**
     * Sets the entrez2Id_db value for this Entrez2IdType.
     * 
     * @param entrez2Id_db
     */
    public void setEntrez2Id_db(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2Id_dbType entrez2Id_db) {
        this.entrez2Id_db = entrez2Id_db;
    }


    /**
     * Gets the entrez2Id_uid value for this Entrez2IdType.
     * 
     * @return entrez2Id_uid
     */
    public java.lang.String getEntrez2Id_uid() {
        return entrez2Id_uid;
    }


    /**
     * Sets the entrez2Id_uid value for this Entrez2IdType.
     * 
     * @param entrez2Id_uid
     */
    public void setEntrez2Id_uid(java.lang.String entrez2Id_uid) {
        this.entrez2Id_uid = entrez2Id_uid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2IdType)) return false;
        Entrez2IdType other = (Entrez2IdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2Id_db==null && other.getEntrez2Id_db()==null) || 
             (this.entrez2Id_db!=null &&
              this.entrez2Id_db.equals(other.getEntrez2Id_db()))) &&
            ((this.entrez2Id_uid==null && other.getEntrez2Id_uid()==null) || 
             (this.entrez2Id_uid!=null &&
              this.entrez2Id_uid.equals(other.getEntrez2Id_uid())));
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
        if (getEntrez2Id_db() != null) {
            _hashCode += getEntrez2Id_db().hashCode();
        }
        if (getEntrez2Id_uid() != null) {
            _hashCode += getEntrez2Id_uid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2IdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Id_db");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-id_db"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-id_dbType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2Id_uid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-id_uid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
