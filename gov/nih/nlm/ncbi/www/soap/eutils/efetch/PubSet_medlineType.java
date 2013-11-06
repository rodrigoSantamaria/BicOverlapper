/**
 * PubSet_medlineType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PubSet_medlineType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntryType[] medlineEntry;

    public PubSet_medlineType() {
    }

    public PubSet_medlineType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntryType[] medlineEntry) {
           this.medlineEntry = medlineEntry;
    }


    /**
     * Gets the medlineEntry value for this PubSet_medlineType.
     * 
     * @return medlineEntry
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntryType[] getMedlineEntry() {
        return medlineEntry;
    }


    /**
     * Sets the medlineEntry value for this PubSet_medlineType.
     * 
     * @param medlineEntry
     */
    public void setMedlineEntry(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntryType[] medlineEntry) {
        this.medlineEntry = medlineEntry;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntryType getMedlineEntry(int i) {
        return this.medlineEntry[i];
    }

    public void setMedlineEntry(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.MedlineEntryType _value) {
        this.medlineEntry[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PubSet_medlineType)) return false;
        PubSet_medlineType other = (PubSet_medlineType) obj;
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
              java.util.Arrays.equals(this.medlineEntry, other.getMedlineEntry())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMedlineEntry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMedlineEntry(), i);
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
        new org.apache.axis.description.TypeDesc(PubSet_medlineType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pub-set_medlineType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medlineEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Medline-entryType"));
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
