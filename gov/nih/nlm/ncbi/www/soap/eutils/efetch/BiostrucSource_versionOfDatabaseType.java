/**
 * BiostrucSource_versionOfDatabaseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucSource_versionOfDatabaseType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSource_versionOfDatabase_releaseDateType biostrucSource_versionOfDatabase_releaseDate;

    private java.lang.String biostrucSource_versionOfDatabase_releaseCode;

    public BiostrucSource_versionOfDatabaseType() {
    }

    public BiostrucSource_versionOfDatabaseType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSource_versionOfDatabase_releaseDateType biostrucSource_versionOfDatabase_releaseDate,
           java.lang.String biostrucSource_versionOfDatabase_releaseCode) {
           this.biostrucSource_versionOfDatabase_releaseDate = biostrucSource_versionOfDatabase_releaseDate;
           this.biostrucSource_versionOfDatabase_releaseCode = biostrucSource_versionOfDatabase_releaseCode;
    }


    /**
     * Gets the biostrucSource_versionOfDatabase_releaseDate value for this BiostrucSource_versionOfDatabaseType.
     * 
     * @return biostrucSource_versionOfDatabase_releaseDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSource_versionOfDatabase_releaseDateType getBiostrucSource_versionOfDatabase_releaseDate() {
        return biostrucSource_versionOfDatabase_releaseDate;
    }


    /**
     * Sets the biostrucSource_versionOfDatabase_releaseDate value for this BiostrucSource_versionOfDatabaseType.
     * 
     * @param biostrucSource_versionOfDatabase_releaseDate
     */
    public void setBiostrucSource_versionOfDatabase_releaseDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSource_versionOfDatabase_releaseDateType biostrucSource_versionOfDatabase_releaseDate) {
        this.biostrucSource_versionOfDatabase_releaseDate = biostrucSource_versionOfDatabase_releaseDate;
    }


    /**
     * Gets the biostrucSource_versionOfDatabase_releaseCode value for this BiostrucSource_versionOfDatabaseType.
     * 
     * @return biostrucSource_versionOfDatabase_releaseCode
     */
    public java.lang.String getBiostrucSource_versionOfDatabase_releaseCode() {
        return biostrucSource_versionOfDatabase_releaseCode;
    }


    /**
     * Sets the biostrucSource_versionOfDatabase_releaseCode value for this BiostrucSource_versionOfDatabaseType.
     * 
     * @param biostrucSource_versionOfDatabase_releaseCode
     */
    public void setBiostrucSource_versionOfDatabase_releaseCode(java.lang.String biostrucSource_versionOfDatabase_releaseCode) {
        this.biostrucSource_versionOfDatabase_releaseCode = biostrucSource_versionOfDatabase_releaseCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucSource_versionOfDatabaseType)) return false;
        BiostrucSource_versionOfDatabaseType other = (BiostrucSource_versionOfDatabaseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucSource_versionOfDatabase_releaseDate==null && other.getBiostrucSource_versionOfDatabase_releaseDate()==null) || 
             (this.biostrucSource_versionOfDatabase_releaseDate!=null &&
              this.biostrucSource_versionOfDatabase_releaseDate.equals(other.getBiostrucSource_versionOfDatabase_releaseDate()))) &&
            ((this.biostrucSource_versionOfDatabase_releaseCode==null && other.getBiostrucSource_versionOfDatabase_releaseCode()==null) || 
             (this.biostrucSource_versionOfDatabase_releaseCode!=null &&
              this.biostrucSource_versionOfDatabase_releaseCode.equals(other.getBiostrucSource_versionOfDatabase_releaseCode())));
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
        if (getBiostrucSource_versionOfDatabase_releaseDate() != null) {
            _hashCode += getBiostrucSource_versionOfDatabase_releaseDate().hashCode();
        }
        if (getBiostrucSource_versionOfDatabase_releaseCode() != null) {
            _hashCode += getBiostrucSource_versionOfDatabase_releaseCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucSource_versionOfDatabaseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-source_version-of-databaseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSource_versionOfDatabase_releaseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-source_version-of-database_release-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-source_version-of-database_release-dateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSource_versionOfDatabase_releaseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-source_version-of-database_release-code"));
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
