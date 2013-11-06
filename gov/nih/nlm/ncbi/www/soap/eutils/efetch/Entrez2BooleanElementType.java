/**
 * Entrez2BooleanElementType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2BooleanElementType  implements java.io.Serializable {
    private java.lang.String entrez2BooleanElement_str;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanElement_opType entrez2BooleanElement_op;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanElement_termType entrez2BooleanElement_term;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanElement_idsType entrez2BooleanElement_ids;

    private java.lang.String entrez2BooleanElement_key;

    public Entrez2BooleanElementType() {
    }

    public Entrez2BooleanElementType(
           java.lang.String entrez2BooleanElement_str,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanElement_opType entrez2BooleanElement_op,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanElement_termType entrez2BooleanElement_term,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanElement_idsType entrez2BooleanElement_ids,
           java.lang.String entrez2BooleanElement_key) {
           this.entrez2BooleanElement_str = entrez2BooleanElement_str;
           this.entrez2BooleanElement_op = entrez2BooleanElement_op;
           this.entrez2BooleanElement_term = entrez2BooleanElement_term;
           this.entrez2BooleanElement_ids = entrez2BooleanElement_ids;
           this.entrez2BooleanElement_key = entrez2BooleanElement_key;
    }


    /**
     * Gets the entrez2BooleanElement_str value for this Entrez2BooleanElementType.
     * 
     * @return entrez2BooleanElement_str
     */
    public java.lang.String getEntrez2BooleanElement_str() {
        return entrez2BooleanElement_str;
    }


    /**
     * Sets the entrez2BooleanElement_str value for this Entrez2BooleanElementType.
     * 
     * @param entrez2BooleanElement_str
     */
    public void setEntrez2BooleanElement_str(java.lang.String entrez2BooleanElement_str) {
        this.entrez2BooleanElement_str = entrez2BooleanElement_str;
    }


    /**
     * Gets the entrez2BooleanElement_op value for this Entrez2BooleanElementType.
     * 
     * @return entrez2BooleanElement_op
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanElement_opType getEntrez2BooleanElement_op() {
        return entrez2BooleanElement_op;
    }


    /**
     * Sets the entrez2BooleanElement_op value for this Entrez2BooleanElementType.
     * 
     * @param entrez2BooleanElement_op
     */
    public void setEntrez2BooleanElement_op(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanElement_opType entrez2BooleanElement_op) {
        this.entrez2BooleanElement_op = entrez2BooleanElement_op;
    }


    /**
     * Gets the entrez2BooleanElement_term value for this Entrez2BooleanElementType.
     * 
     * @return entrez2BooleanElement_term
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanElement_termType getEntrez2BooleanElement_term() {
        return entrez2BooleanElement_term;
    }


    /**
     * Sets the entrez2BooleanElement_term value for this Entrez2BooleanElementType.
     * 
     * @param entrez2BooleanElement_term
     */
    public void setEntrez2BooleanElement_term(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanElement_termType entrez2BooleanElement_term) {
        this.entrez2BooleanElement_term = entrez2BooleanElement_term;
    }


    /**
     * Gets the entrez2BooleanElement_ids value for this Entrez2BooleanElementType.
     * 
     * @return entrez2BooleanElement_ids
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanElement_idsType getEntrez2BooleanElement_ids() {
        return entrez2BooleanElement_ids;
    }


    /**
     * Sets the entrez2BooleanElement_ids value for this Entrez2BooleanElementType.
     * 
     * @param entrez2BooleanElement_ids
     */
    public void setEntrez2BooleanElement_ids(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanElement_idsType entrez2BooleanElement_ids) {
        this.entrez2BooleanElement_ids = entrez2BooleanElement_ids;
    }


    /**
     * Gets the entrez2BooleanElement_key value for this Entrez2BooleanElementType.
     * 
     * @return entrez2BooleanElement_key
     */
    public java.lang.String getEntrez2BooleanElement_key() {
        return entrez2BooleanElement_key;
    }


    /**
     * Sets the entrez2BooleanElement_key value for this Entrez2BooleanElementType.
     * 
     * @param entrez2BooleanElement_key
     */
    public void setEntrez2BooleanElement_key(java.lang.String entrez2BooleanElement_key) {
        this.entrez2BooleanElement_key = entrez2BooleanElement_key;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2BooleanElementType)) return false;
        Entrez2BooleanElementType other = (Entrez2BooleanElementType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2BooleanElement_str==null && other.getEntrez2BooleanElement_str()==null) || 
             (this.entrez2BooleanElement_str!=null &&
              this.entrez2BooleanElement_str.equals(other.getEntrez2BooleanElement_str()))) &&
            ((this.entrez2BooleanElement_op==null && other.getEntrez2BooleanElement_op()==null) || 
             (this.entrez2BooleanElement_op!=null &&
              this.entrez2BooleanElement_op.equals(other.getEntrez2BooleanElement_op()))) &&
            ((this.entrez2BooleanElement_term==null && other.getEntrez2BooleanElement_term()==null) || 
             (this.entrez2BooleanElement_term!=null &&
              this.entrez2BooleanElement_term.equals(other.getEntrez2BooleanElement_term()))) &&
            ((this.entrez2BooleanElement_ids==null && other.getEntrez2BooleanElement_ids()==null) || 
             (this.entrez2BooleanElement_ids!=null &&
              this.entrez2BooleanElement_ids.equals(other.getEntrez2BooleanElement_ids()))) &&
            ((this.entrez2BooleanElement_key==null && other.getEntrez2BooleanElement_key()==null) || 
             (this.entrez2BooleanElement_key!=null &&
              this.entrez2BooleanElement_key.equals(other.getEntrez2BooleanElement_key())));
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
        if (getEntrez2BooleanElement_str() != null) {
            _hashCode += getEntrez2BooleanElement_str().hashCode();
        }
        if (getEntrez2BooleanElement_op() != null) {
            _hashCode += getEntrez2BooleanElement_op().hashCode();
        }
        if (getEntrez2BooleanElement_term() != null) {
            _hashCode += getEntrez2BooleanElement_term().hashCode();
        }
        if (getEntrez2BooleanElement_ids() != null) {
            _hashCode += getEntrez2BooleanElement_ids().hashCode();
        }
        if (getEntrez2BooleanElement_key() != null) {
            _hashCode += getEntrez2BooleanElement_key().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2BooleanElementType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-elementType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2BooleanElement_str");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-element_str"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2BooleanElement_op");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-element_op"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-element_opType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2BooleanElement_term");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-element_term"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-element_termType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2BooleanElement_ids");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-element_ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-element_idsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2BooleanElement_key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-element_key"));
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
