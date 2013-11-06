/**
 * MedlarsEntryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MedlarsEntryType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlarsEntry_pmidType medlarsEntry_pmid;

    private java.lang.String medlarsEntry_muid;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlarsEntry_recsType medlarsEntry_recs;

    public MedlarsEntryType() {
    }

    public MedlarsEntryType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlarsEntry_pmidType medlarsEntry_pmid,
           java.lang.String medlarsEntry_muid,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlarsEntry_recsType medlarsEntry_recs) {
           this.medlarsEntry_pmid = medlarsEntry_pmid;
           this.medlarsEntry_muid = medlarsEntry_muid;
           this.medlarsEntry_recs = medlarsEntry_recs;
    }


    /**
     * Gets the medlarsEntry_pmid value for this MedlarsEntryType.
     * 
     * @return medlarsEntry_pmid
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlarsEntry_pmidType getMedlarsEntry_pmid() {
        return medlarsEntry_pmid;
    }


    /**
     * Sets the medlarsEntry_pmid value for this MedlarsEntryType.
     * 
     * @param medlarsEntry_pmid
     */
    public void setMedlarsEntry_pmid(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlarsEntry_pmidType medlarsEntry_pmid) {
        this.medlarsEntry_pmid = medlarsEntry_pmid;
    }


    /**
     * Gets the medlarsEntry_muid value for this MedlarsEntryType.
     * 
     * @return medlarsEntry_muid
     */
    public java.lang.String getMedlarsEntry_muid() {
        return medlarsEntry_muid;
    }


    /**
     * Sets the medlarsEntry_muid value for this MedlarsEntryType.
     * 
     * @param medlarsEntry_muid
     */
    public void setMedlarsEntry_muid(java.lang.String medlarsEntry_muid) {
        this.medlarsEntry_muid = medlarsEntry_muid;
    }


    /**
     * Gets the medlarsEntry_recs value for this MedlarsEntryType.
     * 
     * @return medlarsEntry_recs
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlarsEntry_recsType getMedlarsEntry_recs() {
        return medlarsEntry_recs;
    }


    /**
     * Sets the medlarsEntry_recs value for this MedlarsEntryType.
     * 
     * @param medlarsEntry_recs
     */
    public void setMedlarsEntry_recs(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlarsEntry_recsType medlarsEntry_recs) {
        this.medlarsEntry_recs = medlarsEntry_recs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MedlarsEntryType)) return false;
        MedlarsEntryType other = (MedlarsEntryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.medlarsEntry_pmid==null && other.getMedlarsEntry_pmid()==null) || 
             (this.medlarsEntry_pmid!=null &&
              this.medlarsEntry_pmid.equals(other.getMedlarsEntry_pmid()))) &&
            ((this.medlarsEntry_muid==null && other.getMedlarsEntry_muid()==null) || 
             (this.medlarsEntry_muid!=null &&
              this.medlarsEntry_muid.equals(other.getMedlarsEntry_muid()))) &&
            ((this.medlarsEntry_recs==null && other.getMedlarsEntry_recs()==null) || 
             (this.medlarsEntry_recs!=null &&
              this.medlarsEntry_recs.equals(other.getMedlarsEntry_recs())));
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
        if (getMedlarsEntry_pmid() != null) {
            _hashCode += getMedlarsEntry_pmid().hashCode();
        }
        if (getMedlarsEntry_muid() != null) {
            _hashCode += getMedlarsEntry_muid().hashCode();
        }
        if (getMedlarsEntry_recs() != null) {
            _hashCode += getMedlarsEntry_recs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MedlarsEntryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medlars-entryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlarsEntry_pmid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medlars-entry_pmid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medlars-entry_pmidType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlarsEntry_muid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medlars-entry_muid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlarsEntry_recs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medlars-entry_recs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medlars-entry_recsType"));
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
