/**
 * MimEntries.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MimEntries  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntryType[] mimEntry;

    public MimEntries() {
    }

    public MimEntries(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntryType[] mimEntry) {
           this.mimEntry = mimEntry;
    }


    /**
     * Gets the mimEntry value for this MimEntries.
     * 
     * @return mimEntry
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntryType[] getMimEntry() {
        return mimEntry;
    }


    /**
     * Sets the mimEntry value for this MimEntries.
     * 
     * @param mimEntry
     */
    public void setMimEntry(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntryType[] mimEntry) {
        this.mimEntry = mimEntry;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntryType getMimEntry(int i) {
        return this.mimEntry[i];
    }

    public void setMimEntry(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.MimEntryType _value) {
        this.mimEntry[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MimEntries)) return false;
        MimEntries other = (MimEntries) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mimEntry==null && other.getMimEntry()==null) || 
             (this.mimEntry!=null &&
              java.util.Arrays.equals(this.mimEntry, other.getMimEntry())));
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
        if (getMimEntry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMimEntry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMimEntry(), i);
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
        new org.apache.axis.description.TypeDesc(MimEntries.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">Mim-entries"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mim-entryType"));
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
