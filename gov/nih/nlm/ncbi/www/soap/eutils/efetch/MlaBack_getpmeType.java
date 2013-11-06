/**
 * MlaBack_getpmeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MlaBack_getpmeType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedEntryType pubmedEntry;

    public MlaBack_getpmeType() {
    }

    public MlaBack_getpmeType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedEntryType pubmedEntry) {
           this.pubmedEntry = pubmedEntry;
    }


    /**
     * Gets the pubmedEntry value for this MlaBack_getpmeType.
     * 
     * @return pubmedEntry
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedEntryType getPubmedEntry() {
        return pubmedEntry;
    }


    /**
     * Sets the pubmedEntry value for this MlaBack_getpmeType.
     * 
     * @param pubmedEntry
     */
    public void setPubmedEntry(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PubmedEntryType pubmedEntry) {
        this.pubmedEntry = pubmedEntry;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MlaBack_getpmeType)) return false;
        MlaBack_getpmeType other = (MlaBack_getpmeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pubmedEntry==null && other.getPubmedEntry()==null) || 
             (this.pubmedEntry!=null &&
              this.pubmedEntry.equals(other.getPubmedEntry())));
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
        if (getPubmedEntry() != null) {
            _hashCode += getPubmedEntry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MlaBack_getpmeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Mla-back_getpmeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pubmedEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubmed-entry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pubmed-entryType"));
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
