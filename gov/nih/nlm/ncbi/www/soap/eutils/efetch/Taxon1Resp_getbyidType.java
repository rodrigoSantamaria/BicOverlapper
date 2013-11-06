/**
 * Taxon1Resp_getbyidType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Taxon1Resp_getbyidType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1DataType taxon1Data;

    public Taxon1Resp_getbyidType() {
    }

    public Taxon1Resp_getbyidType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1DataType taxon1Data) {
           this.taxon1Data = taxon1Data;
    }


    /**
     * Gets the taxon1Data value for this Taxon1Resp_getbyidType.
     * 
     * @return taxon1Data
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1DataType getTaxon1Data() {
        return taxon1Data;
    }


    /**
     * Sets the taxon1Data value for this Taxon1Resp_getbyidType.
     * 
     * @param taxon1Data
     */
    public void setTaxon1Data(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1DataType taxon1Data) {
        this.taxon1Data = taxon1Data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Taxon1Resp_getbyidType)) return false;
        Taxon1Resp_getbyidType other = (Taxon1Resp_getbyidType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxon1Data==null && other.getTaxon1Data()==null) || 
             (this.taxon1Data!=null &&
              this.taxon1Data.equals(other.getTaxon1Data())));
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
        if (getTaxon1Data() != null) {
            _hashCode += getTaxon1Data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Taxon1Resp_getbyidType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_getbyidType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-dataType"));
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
