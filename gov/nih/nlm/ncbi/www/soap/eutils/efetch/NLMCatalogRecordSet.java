/**
 * NLMCatalogRecordSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class NLMCatalogRecordSet  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.NLMCatalogRecordType[] NLMCatalogRecord;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.DeleteCatalogRecordType deleteCatalogRecord;

    public NLMCatalogRecordSet() {
    }

    public NLMCatalogRecordSet(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.NLMCatalogRecordType[] NLMCatalogRecord,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.DeleteCatalogRecordType deleteCatalogRecord) {
           this.NLMCatalogRecord = NLMCatalogRecord;
           this.deleteCatalogRecord = deleteCatalogRecord;
    }


    /**
     * Gets the NLMCatalogRecord value for this NLMCatalogRecordSet.
     * 
     * @return NLMCatalogRecord
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.NLMCatalogRecordType[] getNLMCatalogRecord() {
        return NLMCatalogRecord;
    }


    /**
     * Sets the NLMCatalogRecord value for this NLMCatalogRecordSet.
     * 
     * @param NLMCatalogRecord
     */
    public void setNLMCatalogRecord(gov.nih.nlm.ncbi.www.soap.eutils.efetch.NLMCatalogRecordType[] NLMCatalogRecord) {
        this.NLMCatalogRecord = NLMCatalogRecord;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.NLMCatalogRecordType getNLMCatalogRecord(int i) {
        return this.NLMCatalogRecord[i];
    }

    public void setNLMCatalogRecord(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.NLMCatalogRecordType _value) {
        this.NLMCatalogRecord[i] = _value;
    }


    /**
     * Gets the deleteCatalogRecord value for this NLMCatalogRecordSet.
     * 
     * @return deleteCatalogRecord
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.DeleteCatalogRecordType getDeleteCatalogRecord() {
        return deleteCatalogRecord;
    }


    /**
     * Sets the deleteCatalogRecord value for this NLMCatalogRecordSet.
     * 
     * @param deleteCatalogRecord
     */
    public void setDeleteCatalogRecord(gov.nih.nlm.ncbi.www.soap.eutils.efetch.DeleteCatalogRecordType deleteCatalogRecord) {
        this.deleteCatalogRecord = deleteCatalogRecord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NLMCatalogRecordSet)) return false;
        NLMCatalogRecordSet other = (NLMCatalogRecordSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.NLMCatalogRecord==null && other.getNLMCatalogRecord()==null) || 
             (this.NLMCatalogRecord!=null &&
              java.util.Arrays.equals(this.NLMCatalogRecord, other.getNLMCatalogRecord()))) &&
            ((this.deleteCatalogRecord==null && other.getDeleteCatalogRecord()==null) || 
             (this.deleteCatalogRecord!=null &&
              this.deleteCatalogRecord.equals(other.getDeleteCatalogRecord())));
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
        if (getNLMCatalogRecord() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNLMCatalogRecord());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNLMCatalogRecord(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeleteCatalogRecord() != null) {
            _hashCode += getDeleteCatalogRecord().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NLMCatalogRecordSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">NLMCatalogRecordSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NLMCatalogRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NLMCatalogRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "NLMCatalogRecordType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteCatalogRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DeleteCatalogRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "DeleteCatalogRecordType"));
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
