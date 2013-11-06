/**
 * BiostrucSourceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucSourceType  implements java.io.Serializable {
    private java.lang.String biostrucSource_nameOfDatabase;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSource_versionOfDatabaseType biostrucSource_versionOfDatabase;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSource_databaseEntryIdType biostrucSource_databaseEntryId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSource_databaseEntryDateType biostrucSource_databaseEntryDate;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSource_databaseEntryHistoryType biostrucSource_databaseEntryHistory;

    public BiostrucSourceType() {
    }

    public BiostrucSourceType(
           java.lang.String biostrucSource_nameOfDatabase,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSource_versionOfDatabaseType biostrucSource_versionOfDatabase,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSource_databaseEntryIdType biostrucSource_databaseEntryId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSource_databaseEntryDateType biostrucSource_databaseEntryDate,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSource_databaseEntryHistoryType biostrucSource_databaseEntryHistory) {
           this.biostrucSource_nameOfDatabase = biostrucSource_nameOfDatabase;
           this.biostrucSource_versionOfDatabase = biostrucSource_versionOfDatabase;
           this.biostrucSource_databaseEntryId = biostrucSource_databaseEntryId;
           this.biostrucSource_databaseEntryDate = biostrucSource_databaseEntryDate;
           this.biostrucSource_databaseEntryHistory = biostrucSource_databaseEntryHistory;
    }


    /**
     * Gets the biostrucSource_nameOfDatabase value for this BiostrucSourceType.
     * 
     * @return biostrucSource_nameOfDatabase
     */
    public java.lang.String getBiostrucSource_nameOfDatabase() {
        return biostrucSource_nameOfDatabase;
    }


    /**
     * Sets the biostrucSource_nameOfDatabase value for this BiostrucSourceType.
     * 
     * @param biostrucSource_nameOfDatabase
     */
    public void setBiostrucSource_nameOfDatabase(java.lang.String biostrucSource_nameOfDatabase) {
        this.biostrucSource_nameOfDatabase = biostrucSource_nameOfDatabase;
    }


    /**
     * Gets the biostrucSource_versionOfDatabase value for this BiostrucSourceType.
     * 
     * @return biostrucSource_versionOfDatabase
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSource_versionOfDatabaseType getBiostrucSource_versionOfDatabase() {
        return biostrucSource_versionOfDatabase;
    }


    /**
     * Sets the biostrucSource_versionOfDatabase value for this BiostrucSourceType.
     * 
     * @param biostrucSource_versionOfDatabase
     */
    public void setBiostrucSource_versionOfDatabase(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSource_versionOfDatabaseType biostrucSource_versionOfDatabase) {
        this.biostrucSource_versionOfDatabase = biostrucSource_versionOfDatabase;
    }


    /**
     * Gets the biostrucSource_databaseEntryId value for this BiostrucSourceType.
     * 
     * @return biostrucSource_databaseEntryId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSource_databaseEntryIdType getBiostrucSource_databaseEntryId() {
        return biostrucSource_databaseEntryId;
    }


    /**
     * Sets the biostrucSource_databaseEntryId value for this BiostrucSourceType.
     * 
     * @param biostrucSource_databaseEntryId
     */
    public void setBiostrucSource_databaseEntryId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSource_databaseEntryIdType biostrucSource_databaseEntryId) {
        this.biostrucSource_databaseEntryId = biostrucSource_databaseEntryId;
    }


    /**
     * Gets the biostrucSource_databaseEntryDate value for this BiostrucSourceType.
     * 
     * @return biostrucSource_databaseEntryDate
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSource_databaseEntryDateType getBiostrucSource_databaseEntryDate() {
        return biostrucSource_databaseEntryDate;
    }


    /**
     * Sets the biostrucSource_databaseEntryDate value for this BiostrucSourceType.
     * 
     * @param biostrucSource_databaseEntryDate
     */
    public void setBiostrucSource_databaseEntryDate(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSource_databaseEntryDateType biostrucSource_databaseEntryDate) {
        this.biostrucSource_databaseEntryDate = biostrucSource_databaseEntryDate;
    }


    /**
     * Gets the biostrucSource_databaseEntryHistory value for this BiostrucSourceType.
     * 
     * @return biostrucSource_databaseEntryHistory
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSource_databaseEntryHistoryType getBiostrucSource_databaseEntryHistory() {
        return biostrucSource_databaseEntryHistory;
    }


    /**
     * Sets the biostrucSource_databaseEntryHistory value for this BiostrucSourceType.
     * 
     * @param biostrucSource_databaseEntryHistory
     */
    public void setBiostrucSource_databaseEntryHistory(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucSource_databaseEntryHistoryType biostrucSource_databaseEntryHistory) {
        this.biostrucSource_databaseEntryHistory = biostrucSource_databaseEntryHistory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucSourceType)) return false;
        BiostrucSourceType other = (BiostrucSourceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucSource_nameOfDatabase==null && other.getBiostrucSource_nameOfDatabase()==null) || 
             (this.biostrucSource_nameOfDatabase!=null &&
              this.biostrucSource_nameOfDatabase.equals(other.getBiostrucSource_nameOfDatabase()))) &&
            ((this.biostrucSource_versionOfDatabase==null && other.getBiostrucSource_versionOfDatabase()==null) || 
             (this.biostrucSource_versionOfDatabase!=null &&
              this.biostrucSource_versionOfDatabase.equals(other.getBiostrucSource_versionOfDatabase()))) &&
            ((this.biostrucSource_databaseEntryId==null && other.getBiostrucSource_databaseEntryId()==null) || 
             (this.biostrucSource_databaseEntryId!=null &&
              this.biostrucSource_databaseEntryId.equals(other.getBiostrucSource_databaseEntryId()))) &&
            ((this.biostrucSource_databaseEntryDate==null && other.getBiostrucSource_databaseEntryDate()==null) || 
             (this.biostrucSource_databaseEntryDate!=null &&
              this.biostrucSource_databaseEntryDate.equals(other.getBiostrucSource_databaseEntryDate()))) &&
            ((this.biostrucSource_databaseEntryHistory==null && other.getBiostrucSource_databaseEntryHistory()==null) || 
             (this.biostrucSource_databaseEntryHistory!=null &&
              this.biostrucSource_databaseEntryHistory.equals(other.getBiostrucSource_databaseEntryHistory())));
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
        if (getBiostrucSource_nameOfDatabase() != null) {
            _hashCode += getBiostrucSource_nameOfDatabase().hashCode();
        }
        if (getBiostrucSource_versionOfDatabase() != null) {
            _hashCode += getBiostrucSource_versionOfDatabase().hashCode();
        }
        if (getBiostrucSource_databaseEntryId() != null) {
            _hashCode += getBiostrucSource_databaseEntryId().hashCode();
        }
        if (getBiostrucSource_databaseEntryDate() != null) {
            _hashCode += getBiostrucSource_databaseEntryDate().hashCode();
        }
        if (getBiostrucSource_databaseEntryHistory() != null) {
            _hashCode += getBiostrucSource_databaseEntryHistory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucSourceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-sourceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSource_nameOfDatabase");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-source_name-of-database"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSource_versionOfDatabase");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-source_version-of-database"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-source_version-of-databaseType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSource_databaseEntryId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-source_database-entry-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-source_database-entry-idType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSource_databaseEntryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-source_database-entry-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-source_database-entry-dateType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSource_databaseEntryHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-source_database-entry-history"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-source_database-entry-historyType"));
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
