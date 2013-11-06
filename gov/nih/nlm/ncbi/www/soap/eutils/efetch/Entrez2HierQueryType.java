/**
 * Entrez2HierQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2HierQueryType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2HierQuery_dbType entrez2HierQuery_db;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2HierQuery_fieldType entrez2HierQuery_field;

    private java.lang.String entrez2HierQuery_term;

    private java.lang.String entrez2HierQuery_txid;

    public Entrez2HierQueryType() {
    }

    public Entrez2HierQueryType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2HierQuery_dbType entrez2HierQuery_db,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2HierQuery_fieldType entrez2HierQuery_field,
           java.lang.String entrez2HierQuery_term,
           java.lang.String entrez2HierQuery_txid) {
           this.entrez2HierQuery_db = entrez2HierQuery_db;
           this.entrez2HierQuery_field = entrez2HierQuery_field;
           this.entrez2HierQuery_term = entrez2HierQuery_term;
           this.entrez2HierQuery_txid = entrez2HierQuery_txid;
    }


    /**
     * Gets the entrez2HierQuery_db value for this Entrez2HierQueryType.
     * 
     * @return entrez2HierQuery_db
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2HierQuery_dbType getEntrez2HierQuery_db() {
        return entrez2HierQuery_db;
    }


    /**
     * Sets the entrez2HierQuery_db value for this Entrez2HierQueryType.
     * 
     * @param entrez2HierQuery_db
     */
    public void setEntrez2HierQuery_db(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2HierQuery_dbType entrez2HierQuery_db) {
        this.entrez2HierQuery_db = entrez2HierQuery_db;
    }


    /**
     * Gets the entrez2HierQuery_field value for this Entrez2HierQueryType.
     * 
     * @return entrez2HierQuery_field
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2HierQuery_fieldType getEntrez2HierQuery_field() {
        return entrez2HierQuery_field;
    }


    /**
     * Sets the entrez2HierQuery_field value for this Entrez2HierQueryType.
     * 
     * @param entrez2HierQuery_field
     */
    public void setEntrez2HierQuery_field(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2HierQuery_fieldType entrez2HierQuery_field) {
        this.entrez2HierQuery_field = entrez2HierQuery_field;
    }


    /**
     * Gets the entrez2HierQuery_term value for this Entrez2HierQueryType.
     * 
     * @return entrez2HierQuery_term
     */
    public java.lang.String getEntrez2HierQuery_term() {
        return entrez2HierQuery_term;
    }


    /**
     * Sets the entrez2HierQuery_term value for this Entrez2HierQueryType.
     * 
     * @param entrez2HierQuery_term
     */
    public void setEntrez2HierQuery_term(java.lang.String entrez2HierQuery_term) {
        this.entrez2HierQuery_term = entrez2HierQuery_term;
    }


    /**
     * Gets the entrez2HierQuery_txid value for this Entrez2HierQueryType.
     * 
     * @return entrez2HierQuery_txid
     */
    public java.lang.String getEntrez2HierQuery_txid() {
        return entrez2HierQuery_txid;
    }


    /**
     * Sets the entrez2HierQuery_txid value for this Entrez2HierQueryType.
     * 
     * @param entrez2HierQuery_txid
     */
    public void setEntrez2HierQuery_txid(java.lang.String entrez2HierQuery_txid) {
        this.entrez2HierQuery_txid = entrez2HierQuery_txid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2HierQueryType)) return false;
        Entrez2HierQueryType other = (Entrez2HierQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2HierQuery_db==null && other.getEntrez2HierQuery_db()==null) || 
             (this.entrez2HierQuery_db!=null &&
              this.entrez2HierQuery_db.equals(other.getEntrez2HierQuery_db()))) &&
            ((this.entrez2HierQuery_field==null && other.getEntrez2HierQuery_field()==null) || 
             (this.entrez2HierQuery_field!=null &&
              this.entrez2HierQuery_field.equals(other.getEntrez2HierQuery_field()))) &&
            ((this.entrez2HierQuery_term==null && other.getEntrez2HierQuery_term()==null) || 
             (this.entrez2HierQuery_term!=null &&
              this.entrez2HierQuery_term.equals(other.getEntrez2HierQuery_term()))) &&
            ((this.entrez2HierQuery_txid==null && other.getEntrez2HierQuery_txid()==null) || 
             (this.entrez2HierQuery_txid!=null &&
              this.entrez2HierQuery_txid.equals(other.getEntrez2HierQuery_txid())));
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
        if (getEntrez2HierQuery_db() != null) {
            _hashCode += getEntrez2HierQuery_db().hashCode();
        }
        if (getEntrez2HierQuery_field() != null) {
            _hashCode += getEntrez2HierQuery_field().hashCode();
        }
        if (getEntrez2HierQuery_term() != null) {
            _hashCode += getEntrez2HierQuery_term().hashCode();
        }
        if (getEntrez2HierQuery_txid() != null) {
            _hashCode += getEntrez2HierQuery_txid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2HierQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-hier-queryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2HierQuery_db");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-hier-query_db"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-hier-query_dbType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2HierQuery_field");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-hier-query_field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-hier-query_fieldType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2HierQuery_term");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-hier-query_term"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2HierQuery_txid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-hier-query_txid"));
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
