/**
 * ID1ServerMaxcomplex_maxplexType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID1ServerMaxcomplex_maxplexType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.EntryComplexitiesType entryComplexities;

    public ID1ServerMaxcomplex_maxplexType() {
    }

    public ID1ServerMaxcomplex_maxplexType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.EntryComplexitiesType entryComplexities) {
           this.entryComplexities = entryComplexities;
    }


    /**
     * Gets the entryComplexities value for this ID1ServerMaxcomplex_maxplexType.
     * 
     * @return entryComplexities
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.EntryComplexitiesType getEntryComplexities() {
        return entryComplexities;
    }


    /**
     * Sets the entryComplexities value for this ID1ServerMaxcomplex_maxplexType.
     * 
     * @param entryComplexities
     */
    public void setEntryComplexities(gov.nih.nlm.ncbi.www.soap.eutils.efetch.EntryComplexitiesType entryComplexities) {
        this.entryComplexities = entryComplexities;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID1ServerMaxcomplex_maxplexType)) return false;
        ID1ServerMaxcomplex_maxplexType other = (ID1ServerMaxcomplex_maxplexType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entryComplexities==null && other.getEntryComplexities()==null) || 
             (this.entryComplexities!=null &&
              this.entryComplexities.equals(other.getEntryComplexities())));
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
        if (getEntryComplexities() != null) {
            _hashCode += getEntryComplexities().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID1ServerMaxcomplex_maxplexType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID1server-maxcomplex_maxplexType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entryComplexities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entry-complexities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Entry-complexitiesType"));
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
