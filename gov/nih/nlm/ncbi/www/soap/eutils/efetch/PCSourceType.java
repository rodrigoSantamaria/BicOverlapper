/**
 * PCSourceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCSourceType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCSource_individualType PCSource_individual;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCSource_dbType PCSource_db;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCSource_mmdbType PCSource_mmdb;

    public PCSourceType() {
    }

    public PCSourceType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCSource_individualType PCSource_individual,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCSource_dbType PCSource_db,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCSource_mmdbType PCSource_mmdb) {
           this.PCSource_individual = PCSource_individual;
           this.PCSource_db = PCSource_db;
           this.PCSource_mmdb = PCSource_mmdb;
    }


    /**
     * Gets the PCSource_individual value for this PCSourceType.
     * 
     * @return PCSource_individual
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCSource_individualType getPCSource_individual() {
        return PCSource_individual;
    }


    /**
     * Sets the PCSource_individual value for this PCSourceType.
     * 
     * @param PCSource_individual
     */
    public void setPCSource_individual(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCSource_individualType PCSource_individual) {
        this.PCSource_individual = PCSource_individual;
    }


    /**
     * Gets the PCSource_db value for this PCSourceType.
     * 
     * @return PCSource_db
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCSource_dbType getPCSource_db() {
        return PCSource_db;
    }


    /**
     * Sets the PCSource_db value for this PCSourceType.
     * 
     * @param PCSource_db
     */
    public void setPCSource_db(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCSource_dbType PCSource_db) {
        this.PCSource_db = PCSource_db;
    }


    /**
     * Gets the PCSource_mmdb value for this PCSourceType.
     * 
     * @return PCSource_mmdb
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCSource_mmdbType getPCSource_mmdb() {
        return PCSource_mmdb;
    }


    /**
     * Sets the PCSource_mmdb value for this PCSourceType.
     * 
     * @param PCSource_mmdb
     */
    public void setPCSource_mmdb(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCSource_mmdbType PCSource_mmdb) {
        this.PCSource_mmdb = PCSource_mmdb;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCSourceType)) return false;
        PCSourceType other = (PCSourceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCSource_individual==null && other.getPCSource_individual()==null) || 
             (this.PCSource_individual!=null &&
              this.PCSource_individual.equals(other.getPCSource_individual()))) &&
            ((this.PCSource_db==null && other.getPCSource_db()==null) || 
             (this.PCSource_db!=null &&
              this.PCSource_db.equals(other.getPCSource_db()))) &&
            ((this.PCSource_mmdb==null && other.getPCSource_mmdb()==null) || 
             (this.PCSource_mmdb!=null &&
              this.PCSource_mmdb.equals(other.getPCSource_mmdb())));
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
        if (getPCSource_individual() != null) {
            _hashCode += getPCSource_individual().hashCode();
        }
        if (getPCSource_db() != null) {
            _hashCode += getPCSource_db().hashCode();
        }
        if (getPCSource_mmdb() != null) {
            _hashCode += getPCSource_mmdb().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCSourceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-SourceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCSource_individual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Source_individual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Source_individualType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCSource_db");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Source_db"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Source_dbType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCSource_mmdb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Source_mmdb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-Source_mmdbType"));
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
