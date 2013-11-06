/**
 * GlobalIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class GlobalIdType  implements java.io.Serializable {
    private java.lang.String globalId_accession;

    private java.lang.String globalId_release;

    private java.lang.String globalId_version;

    private java.lang.String globalId_database;

    public GlobalIdType() {
    }

    public GlobalIdType(
           java.lang.String globalId_accession,
           java.lang.String globalId_release,
           java.lang.String globalId_version,
           java.lang.String globalId_database) {
           this.globalId_accession = globalId_accession;
           this.globalId_release = globalId_release;
           this.globalId_version = globalId_version;
           this.globalId_database = globalId_database;
    }


    /**
     * Gets the globalId_accession value for this GlobalIdType.
     * 
     * @return globalId_accession
     */
    public java.lang.String getGlobalId_accession() {
        return globalId_accession;
    }


    /**
     * Sets the globalId_accession value for this GlobalIdType.
     * 
     * @param globalId_accession
     */
    public void setGlobalId_accession(java.lang.String globalId_accession) {
        this.globalId_accession = globalId_accession;
    }


    /**
     * Gets the globalId_release value for this GlobalIdType.
     * 
     * @return globalId_release
     */
    public java.lang.String getGlobalId_release() {
        return globalId_release;
    }


    /**
     * Sets the globalId_release value for this GlobalIdType.
     * 
     * @param globalId_release
     */
    public void setGlobalId_release(java.lang.String globalId_release) {
        this.globalId_release = globalId_release;
    }


    /**
     * Gets the globalId_version value for this GlobalIdType.
     * 
     * @return globalId_version
     */
    public java.lang.String getGlobalId_version() {
        return globalId_version;
    }


    /**
     * Sets the globalId_version value for this GlobalIdType.
     * 
     * @param globalId_version
     */
    public void setGlobalId_version(java.lang.String globalId_version) {
        this.globalId_version = globalId_version;
    }


    /**
     * Gets the globalId_database value for this GlobalIdType.
     * 
     * @return globalId_database
     */
    public java.lang.String getGlobalId_database() {
        return globalId_database;
    }


    /**
     * Sets the globalId_database value for this GlobalIdType.
     * 
     * @param globalId_database
     */
    public void setGlobalId_database(java.lang.String globalId_database) {
        this.globalId_database = globalId_database;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalIdType)) return false;
        GlobalIdType other = (GlobalIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.globalId_accession==null && other.getGlobalId_accession()==null) || 
             (this.globalId_accession!=null &&
              this.globalId_accession.equals(other.getGlobalId_accession()))) &&
            ((this.globalId_release==null && other.getGlobalId_release()==null) || 
             (this.globalId_release!=null &&
              this.globalId_release.equals(other.getGlobalId_release()))) &&
            ((this.globalId_version==null && other.getGlobalId_version()==null) || 
             (this.globalId_version!=null &&
              this.globalId_version.equals(other.getGlobalId_version()))) &&
            ((this.globalId_database==null && other.getGlobalId_database()==null) || 
             (this.globalId_database!=null &&
              this.globalId_database.equals(other.getGlobalId_database())));
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
        if (getGlobalId_accession() != null) {
            _hashCode += getGlobalId_accession().hashCode();
        }
        if (getGlobalId_release() != null) {
            _hashCode += getGlobalId_release().hashCode();
        }
        if (getGlobalId_version() != null) {
            _hashCode += getGlobalId_version().hashCode();
        }
        if (getGlobalId_database() != null) {
            _hashCode += getGlobalId_database().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlobalIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Global-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalId_accession");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Global-id_accession"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalId_release");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Global-id_release"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalId_version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Global-id_version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalId_database");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Global-id_database"));
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
