/**
 * Taxon1ErrorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Taxon1ErrorType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Error_levelType taxon1Error_level;

    private java.lang.String taxon1Error_msg;

    public Taxon1ErrorType() {
    }

    public Taxon1ErrorType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Error_levelType taxon1Error_level,
           java.lang.String taxon1Error_msg) {
           this.taxon1Error_level = taxon1Error_level;
           this.taxon1Error_msg = taxon1Error_msg;
    }


    /**
     * Gets the taxon1Error_level value for this Taxon1ErrorType.
     * 
     * @return taxon1Error_level
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Error_levelType getTaxon1Error_level() {
        return taxon1Error_level;
    }


    /**
     * Sets the taxon1Error_level value for this Taxon1ErrorType.
     * 
     * @param taxon1Error_level
     */
    public void setTaxon1Error_level(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Taxon1Error_levelType taxon1Error_level) {
        this.taxon1Error_level = taxon1Error_level;
    }


    /**
     * Gets the taxon1Error_msg value for this Taxon1ErrorType.
     * 
     * @return taxon1Error_msg
     */
    public java.lang.String getTaxon1Error_msg() {
        return taxon1Error_msg;
    }


    /**
     * Sets the taxon1Error_msg value for this Taxon1ErrorType.
     * 
     * @param taxon1Error_msg
     */
    public void setTaxon1Error_msg(java.lang.String taxon1Error_msg) {
        this.taxon1Error_msg = taxon1Error_msg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Taxon1ErrorType)) return false;
        Taxon1ErrorType other = (Taxon1ErrorType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxon1Error_level==null && other.getTaxon1Error_level()==null) || 
             (this.taxon1Error_level!=null &&
              this.taxon1Error_level.equals(other.getTaxon1Error_level()))) &&
            ((this.taxon1Error_msg==null && other.getTaxon1Error_msg()==null) || 
             (this.taxon1Error_msg!=null &&
              this.taxon1Error_msg.equals(other.getTaxon1Error_msg())));
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
        if (getTaxon1Error_level() != null) {
            _hashCode += getTaxon1Error_level().hashCode();
        }
        if (getTaxon1Error_msg() != null) {
            _hashCode += getTaxon1Error_msg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Taxon1ErrorType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-errorType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Error_level");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-error_level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-error_levelType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon1Error_msg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Taxon1-error_msg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
