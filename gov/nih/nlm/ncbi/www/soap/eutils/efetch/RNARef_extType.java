/**
 * RNARef_extType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class RNARef_extType  implements java.io.Serializable {
    private java.lang.String RNARef_ext_name;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.RNARef_ext_tRNAType RNARef_ext_tRNA;

    public RNARef_extType() {
    }

    public RNARef_extType(
           java.lang.String RNARef_ext_name,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.RNARef_ext_tRNAType RNARef_ext_tRNA) {
           this.RNARef_ext_name = RNARef_ext_name;
           this.RNARef_ext_tRNA = RNARef_ext_tRNA;
    }


    /**
     * Gets the RNARef_ext_name value for this RNARef_extType.
     * 
     * @return RNARef_ext_name
     */
    public java.lang.String getRNARef_ext_name() {
        return RNARef_ext_name;
    }


    /**
     * Sets the RNARef_ext_name value for this RNARef_extType.
     * 
     * @param RNARef_ext_name
     */
    public void setRNARef_ext_name(java.lang.String RNARef_ext_name) {
        this.RNARef_ext_name = RNARef_ext_name;
    }


    /**
     * Gets the RNARef_ext_tRNA value for this RNARef_extType.
     * 
     * @return RNARef_ext_tRNA
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.RNARef_ext_tRNAType getRNARef_ext_tRNA() {
        return RNARef_ext_tRNA;
    }


    /**
     * Sets the RNARef_ext_tRNA value for this RNARef_extType.
     * 
     * @param RNARef_ext_tRNA
     */
    public void setRNARef_ext_tRNA(gov.nih.nlm.ncbi.www.soap.eutils.efetch.RNARef_ext_tRNAType RNARef_ext_tRNA) {
        this.RNARef_ext_tRNA = RNARef_ext_tRNA;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RNARef_extType)) return false;
        RNARef_extType other = (RNARef_extType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.RNARef_ext_name==null && other.getRNARef_ext_name()==null) || 
             (this.RNARef_ext_name!=null &&
              this.RNARef_ext_name.equals(other.getRNARef_ext_name()))) &&
            ((this.RNARef_ext_tRNA==null && other.getRNARef_ext_tRNA()==null) || 
             (this.RNARef_ext_tRNA!=null &&
              this.RNARef_ext_tRNA.equals(other.getRNARef_ext_tRNA())));
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
        if (getRNARef_ext_name() != null) {
            _hashCode += getRNARef_ext_name().hashCode();
        }
        if (getRNARef_ext_tRNA() != null) {
            _hashCode += getRNARef_ext_tRNA().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RNARef_extType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RNA-ref_extType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RNARef_ext_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RNA-ref_ext_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RNARef_ext_tRNA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RNA-ref_ext_tRNA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "RNA-ref_ext_tRNAType"));
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
