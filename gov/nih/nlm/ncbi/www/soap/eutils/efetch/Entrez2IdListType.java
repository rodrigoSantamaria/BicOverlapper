/**
 * Entrez2IdListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2IdListType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2IdList_dbType entrez2IdList_db;

    private java.lang.String entrez2IdList_num;

    private java.lang.String entrez2IdList_uids;

    public Entrez2IdListType() {
    }

    public Entrez2IdListType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2IdList_dbType entrez2IdList_db,
           java.lang.String entrez2IdList_num,
           java.lang.String entrez2IdList_uids) {
           this.entrez2IdList_db = entrez2IdList_db;
           this.entrez2IdList_num = entrez2IdList_num;
           this.entrez2IdList_uids = entrez2IdList_uids;
    }


    /**
     * Gets the entrez2IdList_db value for this Entrez2IdListType.
     * 
     * @return entrez2IdList_db
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2IdList_dbType getEntrez2IdList_db() {
        return entrez2IdList_db;
    }


    /**
     * Sets the entrez2IdList_db value for this Entrez2IdListType.
     * 
     * @param entrez2IdList_db
     */
    public void setEntrez2IdList_db(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2IdList_dbType entrez2IdList_db) {
        this.entrez2IdList_db = entrez2IdList_db;
    }


    /**
     * Gets the entrez2IdList_num value for this Entrez2IdListType.
     * 
     * @return entrez2IdList_num
     */
    public java.lang.String getEntrez2IdList_num() {
        return entrez2IdList_num;
    }


    /**
     * Sets the entrez2IdList_num value for this Entrez2IdListType.
     * 
     * @param entrez2IdList_num
     */
    public void setEntrez2IdList_num(java.lang.String entrez2IdList_num) {
        this.entrez2IdList_num = entrez2IdList_num;
    }


    /**
     * Gets the entrez2IdList_uids value for this Entrez2IdListType.
     * 
     * @return entrez2IdList_uids
     */
    public java.lang.String getEntrez2IdList_uids() {
        return entrez2IdList_uids;
    }


    /**
     * Sets the entrez2IdList_uids value for this Entrez2IdListType.
     * 
     * @param entrez2IdList_uids
     */
    public void setEntrez2IdList_uids(java.lang.String entrez2IdList_uids) {
        this.entrez2IdList_uids = entrez2IdList_uids;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2IdListType)) return false;
        Entrez2IdListType other = (Entrez2IdListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2IdList_db==null && other.getEntrez2IdList_db()==null) || 
             (this.entrez2IdList_db!=null &&
              this.entrez2IdList_db.equals(other.getEntrez2IdList_db()))) &&
            ((this.entrez2IdList_num==null && other.getEntrez2IdList_num()==null) || 
             (this.entrez2IdList_num!=null &&
              this.entrez2IdList_num.equals(other.getEntrez2IdList_num()))) &&
            ((this.entrez2IdList_uids==null && other.getEntrez2IdList_uids()==null) || 
             (this.entrez2IdList_uids!=null &&
              this.entrez2IdList_uids.equals(other.getEntrez2IdList_uids())));
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
        if (getEntrez2IdList_db() != null) {
            _hashCode += getEntrez2IdList_db().hashCode();
        }
        if (getEntrez2IdList_num() != null) {
            _hashCode += getEntrez2IdList_num().hashCode();
        }
        if (getEntrez2IdList_uids() != null) {
            _hashCode += getEntrez2IdList_uids().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2IdListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-id-listType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2IdList_db");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-id-list_db"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-id-list_dbType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2IdList_num");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-id-list_num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2IdList_uids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-id-list_uids"));
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
