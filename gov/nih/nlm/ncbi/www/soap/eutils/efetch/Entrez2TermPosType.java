/**
 * Entrez2TermPosType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2TermPosType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermPos_dbType entrez2TermPos_db;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermPos_fieldType entrez2TermPos_field;

    private java.lang.String entrez2TermPos_firstTermPos;

    private java.lang.String entrez2TermPos_numberOfTerms;

    public Entrez2TermPosType() {
    }

    public Entrez2TermPosType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermPos_dbType entrez2TermPos_db,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermPos_fieldType entrez2TermPos_field,
           java.lang.String entrez2TermPos_firstTermPos,
           java.lang.String entrez2TermPos_numberOfTerms) {
           this.entrez2TermPos_db = entrez2TermPos_db;
           this.entrez2TermPos_field = entrez2TermPos_field;
           this.entrez2TermPos_firstTermPos = entrez2TermPos_firstTermPos;
           this.entrez2TermPos_numberOfTerms = entrez2TermPos_numberOfTerms;
    }


    /**
     * Gets the entrez2TermPos_db value for this Entrez2TermPosType.
     * 
     * @return entrez2TermPos_db
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermPos_dbType getEntrez2TermPos_db() {
        return entrez2TermPos_db;
    }


    /**
     * Sets the entrez2TermPos_db value for this Entrez2TermPosType.
     * 
     * @param entrez2TermPos_db
     */
    public void setEntrez2TermPos_db(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermPos_dbType entrez2TermPos_db) {
        this.entrez2TermPos_db = entrez2TermPos_db;
    }


    /**
     * Gets the entrez2TermPos_field value for this Entrez2TermPosType.
     * 
     * @return entrez2TermPos_field
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermPos_fieldType getEntrez2TermPos_field() {
        return entrez2TermPos_field;
    }


    /**
     * Sets the entrez2TermPos_field value for this Entrez2TermPosType.
     * 
     * @param entrez2TermPos_field
     */
    public void setEntrez2TermPos_field(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2TermPos_fieldType entrez2TermPos_field) {
        this.entrez2TermPos_field = entrez2TermPos_field;
    }


    /**
     * Gets the entrez2TermPos_firstTermPos value for this Entrez2TermPosType.
     * 
     * @return entrez2TermPos_firstTermPos
     */
    public java.lang.String getEntrez2TermPos_firstTermPos() {
        return entrez2TermPos_firstTermPos;
    }


    /**
     * Sets the entrez2TermPos_firstTermPos value for this Entrez2TermPosType.
     * 
     * @param entrez2TermPos_firstTermPos
     */
    public void setEntrez2TermPos_firstTermPos(java.lang.String entrez2TermPos_firstTermPos) {
        this.entrez2TermPos_firstTermPos = entrez2TermPos_firstTermPos;
    }


    /**
     * Gets the entrez2TermPos_numberOfTerms value for this Entrez2TermPosType.
     * 
     * @return entrez2TermPos_numberOfTerms
     */
    public java.lang.String getEntrez2TermPos_numberOfTerms() {
        return entrez2TermPos_numberOfTerms;
    }


    /**
     * Sets the entrez2TermPos_numberOfTerms value for this Entrez2TermPosType.
     * 
     * @param entrez2TermPos_numberOfTerms
     */
    public void setEntrez2TermPos_numberOfTerms(java.lang.String entrez2TermPos_numberOfTerms) {
        this.entrez2TermPos_numberOfTerms = entrez2TermPos_numberOfTerms;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2TermPosType)) return false;
        Entrez2TermPosType other = (Entrez2TermPosType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2TermPos_db==null && other.getEntrez2TermPos_db()==null) || 
             (this.entrez2TermPos_db!=null &&
              this.entrez2TermPos_db.equals(other.getEntrez2TermPos_db()))) &&
            ((this.entrez2TermPos_field==null && other.getEntrez2TermPos_field()==null) || 
             (this.entrez2TermPos_field!=null &&
              this.entrez2TermPos_field.equals(other.getEntrez2TermPos_field()))) &&
            ((this.entrez2TermPos_firstTermPos==null && other.getEntrez2TermPos_firstTermPos()==null) || 
             (this.entrez2TermPos_firstTermPos!=null &&
              this.entrez2TermPos_firstTermPos.equals(other.getEntrez2TermPos_firstTermPos()))) &&
            ((this.entrez2TermPos_numberOfTerms==null && other.getEntrez2TermPos_numberOfTerms()==null) || 
             (this.entrez2TermPos_numberOfTerms!=null &&
              this.entrez2TermPos_numberOfTerms.equals(other.getEntrez2TermPos_numberOfTerms())));
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
        if (getEntrez2TermPos_db() != null) {
            _hashCode += getEntrez2TermPos_db().hashCode();
        }
        if (getEntrez2TermPos_field() != null) {
            _hashCode += getEntrez2TermPos_field().hashCode();
        }
        if (getEntrez2TermPos_firstTermPos() != null) {
            _hashCode += getEntrez2TermPos_firstTermPos().hashCode();
        }
        if (getEntrez2TermPos_numberOfTerms() != null) {
            _hashCode += getEntrez2TermPos_numberOfTerms().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2TermPosType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term-posType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2TermPos_db");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term-pos_db"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term-pos_dbType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2TermPos_field");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term-pos_field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term-pos_fieldType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2TermPos_firstTermPos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term-pos_first-term-pos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2TermPos_numberOfTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-term-pos_number-of-terms"));
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
