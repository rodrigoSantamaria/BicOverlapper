/**
 * Entrez2BooleanExpType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Entrez2BooleanExpType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanExp_dbType entrez2BooleanExp_db;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanExp_expType entrez2BooleanExp_exp;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanExp_limitsType entrez2BooleanExp_limits;

    public Entrez2BooleanExpType() {
    }

    public Entrez2BooleanExpType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanExp_dbType entrez2BooleanExp_db,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanExp_expType entrez2BooleanExp_exp,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanExp_limitsType entrez2BooleanExp_limits) {
           this.entrez2BooleanExp_db = entrez2BooleanExp_db;
           this.entrez2BooleanExp_exp = entrez2BooleanExp_exp;
           this.entrez2BooleanExp_limits = entrez2BooleanExp_limits;
    }


    /**
     * Gets the entrez2BooleanExp_db value for this Entrez2BooleanExpType.
     * 
     * @return entrez2BooleanExp_db
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanExp_dbType getEntrez2BooleanExp_db() {
        return entrez2BooleanExp_db;
    }


    /**
     * Sets the entrez2BooleanExp_db value for this Entrez2BooleanExpType.
     * 
     * @param entrez2BooleanExp_db
     */
    public void setEntrez2BooleanExp_db(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanExp_dbType entrez2BooleanExp_db) {
        this.entrez2BooleanExp_db = entrez2BooleanExp_db;
    }


    /**
     * Gets the entrez2BooleanExp_exp value for this Entrez2BooleanExpType.
     * 
     * @return entrez2BooleanExp_exp
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanExp_expType getEntrez2BooleanExp_exp() {
        return entrez2BooleanExp_exp;
    }


    /**
     * Sets the entrez2BooleanExp_exp value for this Entrez2BooleanExpType.
     * 
     * @param entrez2BooleanExp_exp
     */
    public void setEntrez2BooleanExp_exp(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanExp_expType entrez2BooleanExp_exp) {
        this.entrez2BooleanExp_exp = entrez2BooleanExp_exp;
    }


    /**
     * Gets the entrez2BooleanExp_limits value for this Entrez2BooleanExpType.
     * 
     * @return entrez2BooleanExp_limits
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanExp_limitsType getEntrez2BooleanExp_limits() {
        return entrez2BooleanExp_limits;
    }


    /**
     * Sets the entrez2BooleanExp_limits value for this Entrez2BooleanExpType.
     * 
     * @param entrez2BooleanExp_limits
     */
    public void setEntrez2BooleanExp_limits(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Entrez2BooleanExp_limitsType entrez2BooleanExp_limits) {
        this.entrez2BooleanExp_limits = entrez2BooleanExp_limits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrez2BooleanExpType)) return false;
        Entrez2BooleanExpType other = (Entrez2BooleanExpType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrez2BooleanExp_db==null && other.getEntrez2BooleanExp_db()==null) || 
             (this.entrez2BooleanExp_db!=null &&
              this.entrez2BooleanExp_db.equals(other.getEntrez2BooleanExp_db()))) &&
            ((this.entrez2BooleanExp_exp==null && other.getEntrez2BooleanExp_exp()==null) || 
             (this.entrez2BooleanExp_exp!=null &&
              this.entrez2BooleanExp_exp.equals(other.getEntrez2BooleanExp_exp()))) &&
            ((this.entrez2BooleanExp_limits==null && other.getEntrez2BooleanExp_limits()==null) || 
             (this.entrez2BooleanExp_limits!=null &&
              this.entrez2BooleanExp_limits.equals(other.getEntrez2BooleanExp_limits())));
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
        if (getEntrez2BooleanExp_db() != null) {
            _hashCode += getEntrez2BooleanExp_db().hashCode();
        }
        if (getEntrez2BooleanExp_exp() != null) {
            _hashCode += getEntrez2BooleanExp_exp().hashCode();
        }
        if (getEntrez2BooleanExp_limits() != null) {
            _hashCode += getEntrez2BooleanExp_limits().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrez2BooleanExpType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-expType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2BooleanExp_db");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-exp_db"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-exp_dbType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2BooleanExp_exp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-exp_exp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-exp_expType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrez2BooleanExp_limits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-exp_limits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez2-boolean-exp_limitsType"));
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
