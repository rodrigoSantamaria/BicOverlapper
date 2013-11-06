/**
 * EntrezGeneral_data_mlType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class EntrezGeneral_data_mlType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntryType medlineEntry;

    public EntrezGeneral_data_mlType() {
    }

    public EntrezGeneral_data_mlType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntryType medlineEntry) {
           this.medlineEntry = medlineEntry;
    }


    /**
     * Gets the medlineEntry value for this EntrezGeneral_data_mlType.
     * 
     * @return medlineEntry
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntryType getMedlineEntry() {
        return medlineEntry;
    }


    /**
     * Sets the medlineEntry value for this EntrezGeneral_data_mlType.
     * 
     * @param medlineEntry
     */
    public void setMedlineEntry(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntryType medlineEntry) {
        this.medlineEntry = medlineEntry;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntrezGeneral_data_mlType)) return false;
        EntrezGeneral_data_mlType other = (EntrezGeneral_data_mlType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.medlineEntry==null && other.getMedlineEntry()==null) || 
             (this.medlineEntry!=null &&
              this.medlineEntry.equals(other.getMedlineEntry())));
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
        if (getMedlineEntry() != null) {
            _hashCode += getMedlineEntry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntrezGeneral_data_mlType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez-general_data_mlType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entryType"));
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
