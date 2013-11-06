/**
 * OrgName_name_binomialType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class OrgName_name_binomialType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.BinomialOrgNameType binomialOrgName;

    public OrgName_name_binomialType() {
    }

    public OrgName_name_binomialType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.BinomialOrgNameType binomialOrgName) {
           this.binomialOrgName = binomialOrgName;
    }


    /**
     * Gets the binomialOrgName value for this OrgName_name_binomialType.
     * 
     * @return binomialOrgName
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.BinomialOrgNameType getBinomialOrgName() {
        return binomialOrgName;
    }


    /**
     * Sets the binomialOrgName value for this OrgName_name_binomialType.
     * 
     * @param binomialOrgName
     */
    public void setBinomialOrgName(gov.nih.nlm.ncbi.www.soap.eutils.efetch.BinomialOrgNameType binomialOrgName) {
        this.binomialOrgName = binomialOrgName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrgName_name_binomialType)) return false;
        OrgName_name_binomialType other = (OrgName_name_binomialType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.binomialOrgName==null && other.getBinomialOrgName()==null) || 
             (this.binomialOrgName!=null &&
              this.binomialOrgName.equals(other.getBinomialOrgName())));
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
        if (getBinomialOrgName() != null) {
            _hashCode += getBinomialOrgName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrgName_name_binomialType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "OrgName_name_binomialType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binomialOrgName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BinomialOrgName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "BinomialOrgNameType"));
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
