/**
 * Taxon1Resp_errorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Taxon1Resp_errorType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1ErrorType taxon1Error;

    public Taxon1Resp_errorType() {
    }

    public Taxon1Resp_errorType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1ErrorType taxon1Error) {
           this.taxon1Error = taxon1Error;
    }


    /**
     * Gets the taxon1Error value for this Taxon1Resp_errorType.
     * 
     * @return taxon1Error
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1ErrorType getTaxon1Error() {
        return taxon1Error;
    }


    /**
     * Sets the taxon1Error value for this Taxon1Resp_errorType.
     * 
     * @param taxon1Error
     */
    public void setTaxon1Error(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1ErrorType taxon1Error) {
        this.taxon1Error = taxon1Error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Taxon1Resp_errorType)) return false;
        Taxon1Resp_errorType other = (Taxon1Resp_errorType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxon1Error==null && other.getTaxon1Error()==null) || 
             (this.taxon1Error!=null &&
              this.taxon1Error.equals(other.getTaxon1Error())));
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
        if (getTaxon1Error() != null) {
            _hashCode += getTaxon1Error().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Taxon1Resp_errorType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-resp_errorType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-errorType"));
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
