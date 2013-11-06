/**
 * BiostrucIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucIdType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucId_mmdbIdType biostrucId_mmdbId;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucId_otherDatabaseType biostrucId_otherDatabase;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucId_localIdType biostrucId_localId;

    public BiostrucIdType() {
    }

    public BiostrucIdType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucId_mmdbIdType biostrucId_mmdbId,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucId_otherDatabaseType biostrucId_otherDatabase,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucId_localIdType biostrucId_localId) {
           this.biostrucId_mmdbId = biostrucId_mmdbId;
           this.biostrucId_otherDatabase = biostrucId_otherDatabase;
           this.biostrucId_localId = biostrucId_localId;
    }


    /**
     * Gets the biostrucId_mmdbId value for this BiostrucIdType.
     * 
     * @return biostrucId_mmdbId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucId_mmdbIdType getBiostrucId_mmdbId() {
        return biostrucId_mmdbId;
    }


    /**
     * Sets the biostrucId_mmdbId value for this BiostrucIdType.
     * 
     * @param biostrucId_mmdbId
     */
    public void setBiostrucId_mmdbId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucId_mmdbIdType biostrucId_mmdbId) {
        this.biostrucId_mmdbId = biostrucId_mmdbId;
    }


    /**
     * Gets the biostrucId_otherDatabase value for this BiostrucIdType.
     * 
     * @return biostrucId_otherDatabase
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucId_otherDatabaseType getBiostrucId_otherDatabase() {
        return biostrucId_otherDatabase;
    }


    /**
     * Sets the biostrucId_otherDatabase value for this BiostrucIdType.
     * 
     * @param biostrucId_otherDatabase
     */
    public void setBiostrucId_otherDatabase(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucId_otherDatabaseType biostrucId_otherDatabase) {
        this.biostrucId_otherDatabase = biostrucId_otherDatabase;
    }


    /**
     * Gets the biostrucId_localId value for this BiostrucIdType.
     * 
     * @return biostrucId_localId
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucId_localIdType getBiostrucId_localId() {
        return biostrucId_localId;
    }


    /**
     * Sets the biostrucId_localId value for this BiostrucIdType.
     * 
     * @param biostrucId_localId
     */
    public void setBiostrucId_localId(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BiostrucId_localIdType biostrucId_localId) {
        this.biostrucId_localId = biostrucId_localId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucIdType)) return false;
        BiostrucIdType other = (BiostrucIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucId_mmdbId==null && other.getBiostrucId_mmdbId()==null) || 
             (this.biostrucId_mmdbId!=null &&
              this.biostrucId_mmdbId.equals(other.getBiostrucId_mmdbId()))) &&
            ((this.biostrucId_otherDatabase==null && other.getBiostrucId_otherDatabase()==null) || 
             (this.biostrucId_otherDatabase!=null &&
              this.biostrucId_otherDatabase.equals(other.getBiostrucId_otherDatabase()))) &&
            ((this.biostrucId_localId==null && other.getBiostrucId_localId()==null) || 
             (this.biostrucId_localId!=null &&
              this.biostrucId_localId.equals(other.getBiostrucId_localId())));
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
        if (getBiostrucId_mmdbId() != null) {
            _hashCode += getBiostrucId_mmdbId().hashCode();
        }
        if (getBiostrucId_otherDatabase() != null) {
            _hashCode += getBiostrucId_otherDatabase().hashCode();
        }
        if (getBiostrucId_localId() != null) {
            _hashCode += getBiostrucId_localId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiostrucIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-idType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucId_mmdbId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-id_mmdb-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-id_mmdb-idType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucId_otherDatabase");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-id_other-database"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-id_other-databaseType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucId_localId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-id_local-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-id_local-idType"));
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
