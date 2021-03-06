/**
 * Taxon1Resp_findnameType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Taxon1Resp_findnameType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1NameType[] taxon1Name;

    public Taxon1Resp_findnameType() {
    }

    public Taxon1Resp_findnameType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1NameType[] taxon1Name) {
           this.taxon1Name = taxon1Name;
    }


    /**
     * Gets the taxon1Name value for this Taxon1Resp_findnameType.
     * 
     * @return taxon1Name
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1NameType[] getTaxon1Name() {
        return taxon1Name;
    }


    /**
     * Sets the taxon1Name value for this Taxon1Resp_findnameType.
     * 
     * @param taxon1Name
     */
    public void setTaxon1Name(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1NameType[] taxon1Name) {
        this.taxon1Name = taxon1Name;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1NameType getTaxon1Name(int i) {
        return this.taxon1Name[i];
    }

    public void setTaxon1Name(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1NameType _value) {
        this.taxon1Name[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Taxon1Resp_findnameType)) return false;
        Taxon1Resp_findnameType other = (Taxon1Resp_findnameType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxon1Name==null && other.getTaxon1Name()==null) || 
             (this.taxon1Name!=null &&
              java.util.Arrays.equals(this.taxon1Name, other.getTaxon1Name())));
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
        if (getTaxon1Name() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxon1Name());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxon1Name(), i);
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
        new org.apache.axis.description.TypeDesc(Taxon1Resp_findnameType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_findnameType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-nameType"));
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
