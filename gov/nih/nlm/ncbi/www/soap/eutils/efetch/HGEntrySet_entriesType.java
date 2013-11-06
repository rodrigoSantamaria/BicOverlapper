/**
 * HGEntrySet_entriesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class HGEntrySet_entriesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntryType[] HGEntry;

    public HGEntrySet_entriesType() {
    }

    public HGEntrySet_entriesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntryType[] HGEntry) {
           this.HGEntry = HGEntry;
    }


    /**
     * Gets the HGEntry value for this HGEntrySet_entriesType.
     * 
     * @return HGEntry
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntryType[] getHGEntry() {
        return HGEntry;
    }


    /**
     * Sets the HGEntry value for this HGEntrySet_entriesType.
     * 
     * @param HGEntry
     */
    public void setHGEntry(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntryType[] HGEntry) {
        this.HGEntry = HGEntry;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntryType getHGEntry(int i) {
        return this.HGEntry[i];
    }

    public void setHGEntry(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntryType _value) {
        this.HGEntry[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HGEntrySet_entriesType)) return false;
        HGEntrySet_entriesType other = (HGEntrySet_entriesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.HGEntry==null && other.getHGEntry()==null) || 
             (this.HGEntry!=null &&
              java.util.Arrays.equals(this.HGEntry, other.getHGEntry())));
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
        if (getHGEntry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHGEntry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHGEntry(), i);
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
        new org.apache.axis.description.TypeDesc(HGEntrySet_entriesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-EntrySet_entriesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-Entry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-EntryType"));
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
