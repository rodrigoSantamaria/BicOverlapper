/**
 * MedlarsEntry_recsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MedlarsEntry_recsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlarsRecordType[] medlarsRecord;

    public MedlarsEntry_recsType() {
    }

    public MedlarsEntry_recsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlarsRecordType[] medlarsRecord) {
           this.medlarsRecord = medlarsRecord;
    }


    /**
     * Gets the medlarsRecord value for this MedlarsEntry_recsType.
     * 
     * @return medlarsRecord
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlarsRecordType[] getMedlarsRecord() {
        return medlarsRecord;
    }


    /**
     * Sets the medlarsRecord value for this MedlarsEntry_recsType.
     * 
     * @param medlarsRecord
     */
    public void setMedlarsRecord(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlarsRecordType[] medlarsRecord) {
        this.medlarsRecord = medlarsRecord;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlarsRecordType getMedlarsRecord(int i) {
        return this.medlarsRecord[i];
    }

    public void setMedlarsRecord(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlarsRecordType _value) {
        this.medlarsRecord[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MedlarsEntry_recsType)) return false;
        MedlarsEntry_recsType other = (MedlarsEntry_recsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.medlarsRecord==null && other.getMedlarsRecord()==null) || 
             (this.medlarsRecord!=null &&
              java.util.Arrays.equals(this.medlarsRecord, other.getMedlarsRecord())));
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
        if (getMedlarsRecord() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMedlarsRecord());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMedlarsRecord(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MedlarsEntry_recsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medlars-entry_recsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlarsRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medlars-record"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medlars-recordType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
