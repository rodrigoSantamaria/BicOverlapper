/**
 * Taxon1Resp_taxabyidType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Taxon1Resp_taxabyidType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon2DataType taxon2Data;

    public Taxon1Resp_taxabyidType() {
    }

    public Taxon1Resp_taxabyidType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon2DataType taxon2Data) {
           this.taxon2Data = taxon2Data;
    }


    /**
     * Gets the taxon2Data value for this Taxon1Resp_taxabyidType.
     * 
     * @return taxon2Data
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon2DataType getTaxon2Data() {
        return taxon2Data;
    }


    /**
     * Sets the taxon2Data value for this Taxon1Resp_taxabyidType.
     * 
     * @param taxon2Data
     */
    public void setTaxon2Data(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon2DataType taxon2Data) {
        this.taxon2Data = taxon2Data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Taxon1Resp_taxabyidType)) return false;
        Taxon1Resp_taxabyidType other = (Taxon1Resp_taxabyidType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxon2Data==null && other.getTaxon2Data()==null) || 
             (this.taxon2Data!=null &&
              this.taxon2Data.equals(other.getTaxon2Data())));
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
        if (getTaxon2Data() != null) {
            _hashCode += getTaxon2Data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Taxon1Resp_taxabyidType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_taxabyidType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon2Data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon2-data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon2-dataType"));
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
