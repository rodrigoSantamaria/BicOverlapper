/**
 * Entrez2TermQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2TermQueryType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermQuery_dbType entrez2TermQuery_db;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermQuery_fieldType entrez2TermQuery_field;

    private java.lang.String entrez2TermQuery_term;

    public Entrez2TermQueryType() {
    }

    public Entrez2TermQueryType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermQuery_dbType entrez2TermQuery_db,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermQuery_fieldType entrez2TermQuery_field,
           java.lang.String entrez2TermQuery_term) {
           this.entrez2TermQuery_db = entrez2TermQuery_db;
           this.entrez2TermQuery_field = entrez2TermQuery_field;
           this.entrez2TermQuery_term = entrez2TermQuery_term;
    }


    /**
     * Gets the entrez2TermQuery_db value for this Entrez2TermQueryType.
     * 
     * @return entrez2TermQuery_db
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermQuery_dbType getEntrez2TermQuery_db() {
        return entrez2TermQuery_db;
    }


    /**
     * Sets the entrez2TermQuery_db value for this Entrez2TermQueryType.
     * 
     * @param entrez2TermQuery_db
     */
    public void setEntrez2TermQuery_db(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermQuery_dbType entrez2TermQuery_db) {
        this.entrez2TermQuery_db = entrez2TermQuery_db;
    }


    /**
     * Gets the entrez2TermQuery_field value for this Entrez2TermQueryType.
     * 
     * @return entrez2TermQuery_field
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermQuery_fieldType getEntrez2TermQuery_field() {
        return entrez2TermQuery_field;
    }


    /**
     * Sets the entrez2TermQuery_field value for this Entrez2TermQueryType.
     * 
     * @param entrez2TermQuery_field
     */
    public void setEntrez2TermQuery_field(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermQuery_fieldType entrez2TermQuery_field) {
        this.entrez2TermQuery_field = entrez2TermQuery_field;
    }


    /**
     * Gets the entrez2TermQuery_term value for this Entrez2TermQueryType.
     * 
     * @return entrez2TermQuery_term
     */
    public java.lang.String getEntrez2TermQuery_term() {
        return entrez2TermQuery_term;
    }


    /**
     * Sets the entrez2TermQuery_term value for this Entrez2TermQueryType.
     * 
     * @param entrez2TermQuery_term
     */
    public void setEntrez2TermQuery_term(java.lang.String entrez2TermQuery_term) {
        this.entrez2TermQuery_term = entrez2TermQuery_term;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2TermQueryType)) return false;
        Entrez2TermQueryType other = (Entrez2TermQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2TermQuery_db==null && other.getEntrez2TermQuery_db()==null) || 
             (this.entrez2TermQuery_db!=null &&
              this.entrez2TermQuery_db.equals(other.getEntrez2TermQuery_db()))) &&
            ((this.entrez2TermQuery_field==null && other.getEntrez2TermQuery_field()==null) || 
             (this.entrez2TermQuery_field!=null &&
              this.entrez2TermQuery_field.equals(other.getEntrez2TermQuery_field()))) &&
            ((this.entrez2TermQuery_term==null && other.getEntrez2TermQuery_term()==null) || 
             (this.entrez2TermQuery_term!=null &&
              this.entrez2TermQuery_term.equals(other.getEntrez2TermQuery_term())));
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
        if (getEntrez2TermQuery_db() != null) {
            _hashCode += getEntrez2TermQuery_db().hashCode();
        }
        if (getEntrez2TermQuery_field() != null) {
            _hashCode += getEntrez2TermQuery_field().hashCode();
        }
        if (getEntrez2TermQuery_term() != null) {
            _hashCode += getEntrez2TermQuery_term().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2TermQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term-queryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2TermQuery_db");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term-query_db"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term-query_dbType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2TermQuery_field");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term-query_field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term-query_fieldType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2TermQuery_term");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term-query_term"));
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
