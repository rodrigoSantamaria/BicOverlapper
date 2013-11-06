/**
 * DbtagType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class DbtagType  implements java.io.Serializable {
    private java.lang.String dbtag_db;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Dbtag_tagType dbtag_tag;

    public DbtagType() {
    }

    public DbtagType(
           java.lang.String dbtag_db,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Dbtag_tagType dbtag_tag) {
           this.dbtag_db = dbtag_db;
           this.dbtag_tag = dbtag_tag;
    }


    /**
     * Gets the dbtag_db value for this DbtagType.
     * 
     * @return dbtag_db
     */
    public java.lang.String getDbtag_db() {
        return dbtag_db;
    }


    /**
     * Sets the dbtag_db value for this DbtagType.
     * 
     * @param dbtag_db
     */
    public void setDbtag_db(java.lang.String dbtag_db) {
        this.dbtag_db = dbtag_db;
    }


    /**
     * Gets the dbtag_tag value for this DbtagType.
     * 
     * @return dbtag_tag
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Dbtag_tagType getDbtag_tag() {
        return dbtag_tag;
    }


    /**
     * Sets the dbtag_tag value for this DbtagType.
     * 
     * @param dbtag_tag
     */
    public void setDbtag_tag(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Dbtag_tagType dbtag_tag) {
        this.dbtag_tag = dbtag_tag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DbtagType)) return false;
        DbtagType other = (DbtagType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dbtag_db==null && other.getDbtag_db()==null) || 
             (this.dbtag_db!=null &&
              this.dbtag_db.equals(other.getDbtag_db()))) &&
            ((this.dbtag_tag==null && other.getDbtag_tag()==null) || 
             (this.dbtag_tag!=null &&
              this.dbtag_tag.equals(other.getDbtag_tag())));
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
        if (getDbtag_db() != null) {
            _hashCode += getDbtag_db().hashCode();
        }
        if (getDbtag_tag() != null) {
            _hashCode += getDbtag_tag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DbtagType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DbtagType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dbtag_db");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dbtag_db"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dbtag_tag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dbtag_tag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Dbtag_tagType"));
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
