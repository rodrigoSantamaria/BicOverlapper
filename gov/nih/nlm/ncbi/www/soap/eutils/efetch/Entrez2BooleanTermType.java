/**
 * Entrez2BooleanTermType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2BooleanTermType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanTerm_fieldType entrez2BooleanTerm_field;

    private java.lang.String entrez2BooleanTerm_term;

    private java.lang.String entrez2BooleanTerm_termCount;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanTerm_doNotExplodeType entrez2BooleanTerm_doNotExplode;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanTerm_doNotTranslateType entrez2BooleanTerm_doNotTranslate;

    public Entrez2BooleanTermType() {
    }

    public Entrez2BooleanTermType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanTerm_fieldType entrez2BooleanTerm_field,
           java.lang.String entrez2BooleanTerm_term,
           java.lang.String entrez2BooleanTerm_termCount,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanTerm_doNotExplodeType entrez2BooleanTerm_doNotExplode,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanTerm_doNotTranslateType entrez2BooleanTerm_doNotTranslate) {
           this.entrez2BooleanTerm_field = entrez2BooleanTerm_field;
           this.entrez2BooleanTerm_term = entrez2BooleanTerm_term;
           this.entrez2BooleanTerm_termCount = entrez2BooleanTerm_termCount;
           this.entrez2BooleanTerm_doNotExplode = entrez2BooleanTerm_doNotExplode;
           this.entrez2BooleanTerm_doNotTranslate = entrez2BooleanTerm_doNotTranslate;
    }


    /**
     * Gets the entrez2BooleanTerm_field value for this Entrez2BooleanTermType.
     * 
     * @return entrez2BooleanTerm_field
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanTerm_fieldType getEntrez2BooleanTerm_field() {
        return entrez2BooleanTerm_field;
    }


    /**
     * Sets the entrez2BooleanTerm_field value for this Entrez2BooleanTermType.
     * 
     * @param entrez2BooleanTerm_field
     */
    public void setEntrez2BooleanTerm_field(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanTerm_fieldType entrez2BooleanTerm_field) {
        this.entrez2BooleanTerm_field = entrez2BooleanTerm_field;
    }


    /**
     * Gets the entrez2BooleanTerm_term value for this Entrez2BooleanTermType.
     * 
     * @return entrez2BooleanTerm_term
     */
    public java.lang.String getEntrez2BooleanTerm_term() {
        return entrez2BooleanTerm_term;
    }


    /**
     * Sets the entrez2BooleanTerm_term value for this Entrez2BooleanTermType.
     * 
     * @param entrez2BooleanTerm_term
     */
    public void setEntrez2BooleanTerm_term(java.lang.String entrez2BooleanTerm_term) {
        this.entrez2BooleanTerm_term = entrez2BooleanTerm_term;
    }


    /**
     * Gets the entrez2BooleanTerm_termCount value for this Entrez2BooleanTermType.
     * 
     * @return entrez2BooleanTerm_termCount
     */
    public java.lang.String getEntrez2BooleanTerm_termCount() {
        return entrez2BooleanTerm_termCount;
    }


    /**
     * Sets the entrez2BooleanTerm_termCount value for this Entrez2BooleanTermType.
     * 
     * @param entrez2BooleanTerm_termCount
     */
    public void setEntrez2BooleanTerm_termCount(java.lang.String entrez2BooleanTerm_termCount) {
        this.entrez2BooleanTerm_termCount = entrez2BooleanTerm_termCount;
    }


    /**
     * Gets the entrez2BooleanTerm_doNotExplode value for this Entrez2BooleanTermType.
     * 
     * @return entrez2BooleanTerm_doNotExplode
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanTerm_doNotExplodeType getEntrez2BooleanTerm_doNotExplode() {
        return entrez2BooleanTerm_doNotExplode;
    }


    /**
     * Sets the entrez2BooleanTerm_doNotExplode value for this Entrez2BooleanTermType.
     * 
     * @param entrez2BooleanTerm_doNotExplode
     */
    public void setEntrez2BooleanTerm_doNotExplode(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanTerm_doNotExplodeType entrez2BooleanTerm_doNotExplode) {
        this.entrez2BooleanTerm_doNotExplode = entrez2BooleanTerm_doNotExplode;
    }


    /**
     * Gets the entrez2BooleanTerm_doNotTranslate value for this Entrez2BooleanTermType.
     * 
     * @return entrez2BooleanTerm_doNotTranslate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanTerm_doNotTranslateType getEntrez2BooleanTerm_doNotTranslate() {
        return entrez2BooleanTerm_doNotTranslate;
    }


    /**
     * Sets the entrez2BooleanTerm_doNotTranslate value for this Entrez2BooleanTermType.
     * 
     * @param entrez2BooleanTerm_doNotTranslate
     */
    public void setEntrez2BooleanTerm_doNotTranslate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanTerm_doNotTranslateType entrez2BooleanTerm_doNotTranslate) {
        this.entrez2BooleanTerm_doNotTranslate = entrez2BooleanTerm_doNotTranslate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2BooleanTermType)) return false;
        Entrez2BooleanTermType other = (Entrez2BooleanTermType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2BooleanTerm_field==null && other.getEntrez2BooleanTerm_field()==null) || 
             (this.entrez2BooleanTerm_field!=null &&
              this.entrez2BooleanTerm_field.equals(other.getEntrez2BooleanTerm_field()))) &&
            ((this.entrez2BooleanTerm_term==null && other.getEntrez2BooleanTerm_term()==null) || 
             (this.entrez2BooleanTerm_term!=null &&
              this.entrez2BooleanTerm_term.equals(other.getEntrez2BooleanTerm_term()))) &&
            ((this.entrez2BooleanTerm_termCount==null && other.getEntrez2BooleanTerm_termCount()==null) || 
             (this.entrez2BooleanTerm_termCount!=null &&
              this.entrez2BooleanTerm_termCount.equals(other.getEntrez2BooleanTerm_termCount()))) &&
            ((this.entrez2BooleanTerm_doNotExplode==null && other.getEntrez2BooleanTerm_doNotExplode()==null) || 
             (this.entrez2BooleanTerm_doNotExplode!=null &&
              this.entrez2BooleanTerm_doNotExplode.equals(other.getEntrez2BooleanTerm_doNotExplode()))) &&
            ((this.entrez2BooleanTerm_doNotTranslate==null && other.getEntrez2BooleanTerm_doNotTranslate()==null) || 
             (this.entrez2BooleanTerm_doNotTranslate!=null &&
              this.entrez2BooleanTerm_doNotTranslate.equals(other.getEntrez2BooleanTerm_doNotTranslate())));
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
        if (getEntrez2BooleanTerm_field() != null) {
            _hashCode += getEntrez2BooleanTerm_field().hashCode();
        }
        if (getEntrez2BooleanTerm_term() != null) {
            _hashCode += getEntrez2BooleanTerm_term().hashCode();
        }
        if (getEntrez2BooleanTerm_termCount() != null) {
            _hashCode += getEntrez2BooleanTerm_termCount().hashCode();
        }
        if (getEntrez2BooleanTerm_doNotExplode() != null) {
            _hashCode += getEntrez2BooleanTerm_doNotExplode().hashCode();
        }
        if (getEntrez2BooleanTerm_doNotTranslate() != null) {
            _hashCode += getEntrez2BooleanTerm_doNotTranslate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2BooleanTermType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-termType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2BooleanTerm_field");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-term_field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-term_fieldType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2BooleanTerm_term");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-term_term"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2BooleanTerm_termCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-term_term-count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2BooleanTerm_doNotExplode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-term_do-not-explode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-term_do-not-explodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2BooleanTerm_doNotTranslate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-term_do-not-translate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-term_do-not-translateType"));
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
