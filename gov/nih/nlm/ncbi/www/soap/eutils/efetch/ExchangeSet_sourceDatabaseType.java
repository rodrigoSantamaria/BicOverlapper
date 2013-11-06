/**
 * ExchangeSet_sourceDatabaseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ExchangeSet_sourceDatabaseType  implements java.io.Serializable {
    private java.lang.String exchangeSet_sourceDatabase_taxId;

    private java.lang.String exchangeSet_sourceDatabase_organism;

    private java.lang.String exchangeSet_sourceDatabase_dbSnpOrgAbbr;

    private java.lang.String exchangeSet_sourceDatabase_gpipeOrgAbbr;

    public ExchangeSet_sourceDatabaseType() {
    }

    public ExchangeSet_sourceDatabaseType(
           java.lang.String exchangeSet_sourceDatabase_taxId,
           java.lang.String exchangeSet_sourceDatabase_organism,
           java.lang.String exchangeSet_sourceDatabase_dbSnpOrgAbbr,
           java.lang.String exchangeSet_sourceDatabase_gpipeOrgAbbr) {
           this.exchangeSet_sourceDatabase_taxId = exchangeSet_sourceDatabase_taxId;
           this.exchangeSet_sourceDatabase_organism = exchangeSet_sourceDatabase_organism;
           this.exchangeSet_sourceDatabase_dbSnpOrgAbbr = exchangeSet_sourceDatabase_dbSnpOrgAbbr;
           this.exchangeSet_sourceDatabase_gpipeOrgAbbr = exchangeSet_sourceDatabase_gpipeOrgAbbr;
    }


    /**
     * Gets the exchangeSet_sourceDatabase_taxId value for this ExchangeSet_sourceDatabaseType.
     * 
     * @return exchangeSet_sourceDatabase_taxId
     */
    public java.lang.String getExchangeSet_sourceDatabase_taxId() {
        return exchangeSet_sourceDatabase_taxId;
    }


    /**
     * Sets the exchangeSet_sourceDatabase_taxId value for this ExchangeSet_sourceDatabaseType.
     * 
     * @param exchangeSet_sourceDatabase_taxId
     */
    public void setExchangeSet_sourceDatabase_taxId(java.lang.String exchangeSet_sourceDatabase_taxId) {
        this.exchangeSet_sourceDatabase_taxId = exchangeSet_sourceDatabase_taxId;
    }


    /**
     * Gets the exchangeSet_sourceDatabase_organism value for this ExchangeSet_sourceDatabaseType.
     * 
     * @return exchangeSet_sourceDatabase_organism
     */
    public java.lang.String getExchangeSet_sourceDatabase_organism() {
        return exchangeSet_sourceDatabase_organism;
    }


    /**
     * Sets the exchangeSet_sourceDatabase_organism value for this ExchangeSet_sourceDatabaseType.
     * 
     * @param exchangeSet_sourceDatabase_organism
     */
    public void setExchangeSet_sourceDatabase_organism(java.lang.String exchangeSet_sourceDatabase_organism) {
        this.exchangeSet_sourceDatabase_organism = exchangeSet_sourceDatabase_organism;
    }


    /**
     * Gets the exchangeSet_sourceDatabase_dbSnpOrgAbbr value for this ExchangeSet_sourceDatabaseType.
     * 
     * @return exchangeSet_sourceDatabase_dbSnpOrgAbbr
     */
    public java.lang.String getExchangeSet_sourceDatabase_dbSnpOrgAbbr() {
        return exchangeSet_sourceDatabase_dbSnpOrgAbbr;
    }


    /**
     * Sets the exchangeSet_sourceDatabase_dbSnpOrgAbbr value for this ExchangeSet_sourceDatabaseType.
     * 
     * @param exchangeSet_sourceDatabase_dbSnpOrgAbbr
     */
    public void setExchangeSet_sourceDatabase_dbSnpOrgAbbr(java.lang.String exchangeSet_sourceDatabase_dbSnpOrgAbbr) {
        this.exchangeSet_sourceDatabase_dbSnpOrgAbbr = exchangeSet_sourceDatabase_dbSnpOrgAbbr;
    }


    /**
     * Gets the exchangeSet_sourceDatabase_gpipeOrgAbbr value for this ExchangeSet_sourceDatabaseType.
     * 
     * @return exchangeSet_sourceDatabase_gpipeOrgAbbr
     */
    public java.lang.String getExchangeSet_sourceDatabase_gpipeOrgAbbr() {
        return exchangeSet_sourceDatabase_gpipeOrgAbbr;
    }


    /**
     * Sets the exchangeSet_sourceDatabase_gpipeOrgAbbr value for this ExchangeSet_sourceDatabaseType.
     * 
     * @param exchangeSet_sourceDatabase_gpipeOrgAbbr
     */
    public void setExchangeSet_sourceDatabase_gpipeOrgAbbr(java.lang.String exchangeSet_sourceDatabase_gpipeOrgAbbr) {
        this.exchangeSet_sourceDatabase_gpipeOrgAbbr = exchangeSet_sourceDatabase_gpipeOrgAbbr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExchangeSet_sourceDatabaseType)) return false;
        ExchangeSet_sourceDatabaseType other = (ExchangeSet_sourceDatabaseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exchangeSet_sourceDatabase_taxId==null && other.getExchangeSet_sourceDatabase_taxId()==null) || 
             (this.exchangeSet_sourceDatabase_taxId!=null &&
              this.exchangeSet_sourceDatabase_taxId.equals(other.getExchangeSet_sourceDatabase_taxId()))) &&
            ((this.exchangeSet_sourceDatabase_organism==null && other.getExchangeSet_sourceDatabase_organism()==null) || 
             (this.exchangeSet_sourceDatabase_organism!=null &&
              this.exchangeSet_sourceDatabase_organism.equals(other.getExchangeSet_sourceDatabase_organism()))) &&
            ((this.exchangeSet_sourceDatabase_dbSnpOrgAbbr==null && other.getExchangeSet_sourceDatabase_dbSnpOrgAbbr()==null) || 
             (this.exchangeSet_sourceDatabase_dbSnpOrgAbbr!=null &&
              this.exchangeSet_sourceDatabase_dbSnpOrgAbbr.equals(other.getExchangeSet_sourceDatabase_dbSnpOrgAbbr()))) &&
            ((this.exchangeSet_sourceDatabase_gpipeOrgAbbr==null && other.getExchangeSet_sourceDatabase_gpipeOrgAbbr()==null) || 
             (this.exchangeSet_sourceDatabase_gpipeOrgAbbr!=null &&
              this.exchangeSet_sourceDatabase_gpipeOrgAbbr.equals(other.getExchangeSet_sourceDatabase_gpipeOrgAbbr())));
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
        if (getExchangeSet_sourceDatabase_taxId() != null) {
            _hashCode += getExchangeSet_sourceDatabase_taxId().hashCode();
        }
        if (getExchangeSet_sourceDatabase_organism() != null) {
            _hashCode += getExchangeSet_sourceDatabase_organism().hashCode();
        }
        if (getExchangeSet_sourceDatabase_dbSnpOrgAbbr() != null) {
            _hashCode += getExchangeSet_sourceDatabase_dbSnpOrgAbbr().hashCode();
        }
        if (getExchangeSet_sourceDatabase_gpipeOrgAbbr() != null) {
            _hashCode += getExchangeSet_sourceDatabase_gpipeOrgAbbr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExchangeSet_sourceDatabaseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ExchangeSet_sourceDatabaseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeSet_sourceDatabase_taxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ExchangeSet_sourceDatabase_taxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeSet_sourceDatabase_organism");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ExchangeSet_sourceDatabase_organism"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeSet_sourceDatabase_dbSnpOrgAbbr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ExchangeSet_sourceDatabase_dbSnpOrgAbbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeSet_sourceDatabase_gpipeOrgAbbr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ExchangeSet_sourceDatabase_gpipeOrgAbbr"));
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
