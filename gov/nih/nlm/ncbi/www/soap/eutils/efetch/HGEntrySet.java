/**
 * HGEntrySet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class HGEntrySet  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntrySet_entriesType HGEntrySet_entries;

    public HGEntrySet() {
    }

    public HGEntrySet(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntrySet_entriesType HGEntrySet_entries) {
           this.HGEntrySet_entries = HGEntrySet_entries;
    }


    /**
     * Gets the HGEntrySet_entries value for this HGEntrySet.
     * 
     * @return HGEntrySet_entries
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntrySet_entriesType getHGEntrySet_entries() {
        return HGEntrySet_entries;
    }


    /**
     * Sets the HGEntrySet_entries value for this HGEntrySet.
     * 
     * @param HGEntrySet_entries
     */
    public void setHGEntrySet_entries(gov.nih.nlm.ncbi.www.soap.eutils.efetch.HGEntrySet_entriesType HGEntrySet_entries) {
        this.HGEntrySet_entries = HGEntrySet_entries;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HGEntrySet)) return false;
        HGEntrySet other = (HGEntrySet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.HGEntrySet_entries==null && other.getHGEntrySet_entries()==null) || 
             (this.HGEntrySet_entries!=null &&
              this.HGEntrySet_entries.equals(other.getHGEntrySet_entries())));
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
        if (getHGEntrySet_entries() != null) {
            _hashCode += getHGEntrySet_entries().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HGEntrySet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">HG-EntrySet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HGEntrySet_entries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-EntrySet_entries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "HG-EntrySet_entriesType"));
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
