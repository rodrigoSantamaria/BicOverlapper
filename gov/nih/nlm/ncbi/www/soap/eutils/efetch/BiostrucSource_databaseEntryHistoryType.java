/**
 * BiostrucSource_databaseEntryHistoryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class BiostrucSource_databaseEntryHistoryType  implements java.io.Serializable {
    private java.lang.String[] biostrucSource_databaseEntryHistory_E;

    public BiostrucSource_databaseEntryHistoryType() {
    }

    public BiostrucSource_databaseEntryHistoryType(
           java.lang.String[] biostrucSource_databaseEntryHistory_E) {
           this.biostrucSource_databaseEntryHistory_E = biostrucSource_databaseEntryHistory_E;
    }


    /**
     * Gets the biostrucSource_databaseEntryHistory_E value for this BiostrucSource_databaseEntryHistoryType.
     * 
     * @return biostrucSource_databaseEntryHistory_E
     */
    public java.lang.String[] getBiostrucSource_databaseEntryHistory_E() {
        return biostrucSource_databaseEntryHistory_E;
    }


    /**
     * Sets the biostrucSource_databaseEntryHistory_E value for this BiostrucSource_databaseEntryHistoryType.
     * 
     * @param biostrucSource_databaseEntryHistory_E
     */
    public void setBiostrucSource_databaseEntryHistory_E(java.lang.String[] biostrucSource_databaseEntryHistory_E) {
        this.biostrucSource_databaseEntryHistory_E = biostrucSource_databaseEntryHistory_E;
    }

    public java.lang.String getBiostrucSource_databaseEntryHistory_E(int i) {
        return this.biostrucSource_databaseEntryHistory_E[i];
    }

    public void setBiostrucSource_databaseEntryHistory_E(int i, java.lang.String _value) {
        this.biostrucSource_databaseEntryHistory_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiostrucSource_databaseEntryHistoryType)) return false;
        BiostrucSource_databaseEntryHistoryType other = (BiostrucSource_databaseEntryHistoryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biostrucSource_databaseEntryHistory_E==null && other.getBiostrucSource_databaseEntryHistory_E()==null) || 
             (this.biostrucSource_databaseEntryHistory_E!=null &&
              java.util.Arrays.equals(this.biostrucSource_databaseEntryHistory_E, other.getBiostrucSource_databaseEntryHistory_E())));
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
        if (getBiostrucSource_databaseEntryHistory_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBiostrucSource_databaseEntryHistory_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBiostrucSource_databaseEntryHistory_E(), i);
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
        new org.apache.axis.description.TypeDesc(BiostrucSource_databaseEntryHistoryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-source_database-entry-historyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biostrucSource_databaseEntryHistory_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-source_database-entry-history_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Biostruc-source_database-entry-history_E"));
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
