/**
 * EntrezGeneral_data_protType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class EntrezGeneral_data_protType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqEntryType seqEntry;

    public EntrezGeneral_data_protType() {
    }

    public EntrezGeneral_data_protType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqEntryType seqEntry) {
           this.seqEntry = seqEntry;
    }


    /**
     * Gets the seqEntry value for this EntrezGeneral_data_protType.
     * 
     * @return seqEntry
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqEntryType getSeqEntry() {
        return seqEntry;
    }


    /**
     * Sets the seqEntry value for this EntrezGeneral_data_protType.
     * 
     * @param seqEntry
     */
    public void setSeqEntry(gov.nih.nlm.ncbi.www.soap.eutils.efetch.SeqEntryType seqEntry) {
        this.seqEntry = seqEntry;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntrezGeneral_data_protType)) return false;
        EntrezGeneral_data_protType other = (EntrezGeneral_data_protType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seqEntry==null && other.getSeqEntry()==null) || 
             (this.seqEntry!=null &&
              this.seqEntry.equals(other.getSeqEntry())));
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
        if (getSeqEntry() != null) {
            _hashCode += getSeqEntry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntrezGeneral_data_protType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entrez-general_data_protType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-entry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Seq-entryType"));
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
