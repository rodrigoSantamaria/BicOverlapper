/**
 * MlaBack_getmlrType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MlaBack_getmlrType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlarsEntryType medlarsEntry;

    public MlaBack_getmlrType() {
    }

    public MlaBack_getmlrType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlarsEntryType medlarsEntry) {
           this.medlarsEntry = medlarsEntry;
    }


    /**
     * Gets the medlarsEntry value for this MlaBack_getmlrType.
     * 
     * @return medlarsEntry
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlarsEntryType getMedlarsEntry() {
        return medlarsEntry;
    }


    /**
     * Sets the medlarsEntry value for this MlaBack_getmlrType.
     * 
     * @param medlarsEntry
     */
    public void setMedlarsEntry(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlarsEntryType medlarsEntry) {
        this.medlarsEntry = medlarsEntry;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MlaBack_getmlrType)) return false;
        MlaBack_getmlrType other = (MlaBack_getmlrType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.medlarsEntry==null && other.getMedlarsEntry()==null) || 
             (this.medlarsEntry!=null &&
              this.medlarsEntry.equals(other.getMedlarsEntry())));
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
        if (getMedlarsEntry() != null) {
            _hashCode += getMedlarsEntry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MlaBack_getmlrType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-back_getmlrType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlarsEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medlars-entry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medlars-entryType"));
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
