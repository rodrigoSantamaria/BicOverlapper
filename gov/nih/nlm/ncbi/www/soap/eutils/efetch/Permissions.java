/**
 * Permissions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Permissions  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CopyrightStatement copyrightStatement;

    private java.lang.String copyrightYear;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.CopyrightHolder copyrightHolder;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.License license;

    public Permissions() {
    }

    public Permissions(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CopyrightStatement copyrightStatement,
           java.lang.String copyrightYear,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.CopyrightHolder copyrightHolder,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.License license) {
           this.copyrightStatement = copyrightStatement;
           this.copyrightYear = copyrightYear;
           this.copyrightHolder = copyrightHolder;
           this.license = license;
    }


    /**
     * Gets the copyrightStatement value for this Permissions.
     * 
     * @return copyrightStatement
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CopyrightStatement getCopyrightStatement() {
        return copyrightStatement;
    }


    /**
     * Sets the copyrightStatement value for this Permissions.
     * 
     * @param copyrightStatement
     */
    public void setCopyrightStatement(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CopyrightStatement copyrightStatement) {
        this.copyrightStatement = copyrightStatement;
    }


    /**
     * Gets the copyrightYear value for this Permissions.
     * 
     * @return copyrightYear
     */
    public java.lang.String getCopyrightYear() {
        return copyrightYear;
    }


    /**
     * Sets the copyrightYear value for this Permissions.
     * 
     * @param copyrightYear
     */
    public void setCopyrightYear(java.lang.String copyrightYear) {
        this.copyrightYear = copyrightYear;
    }


    /**
     * Gets the copyrightHolder value for this Permissions.
     * 
     * @return copyrightHolder
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.CopyrightHolder getCopyrightHolder() {
        return copyrightHolder;
    }


    /**
     * Sets the copyrightHolder value for this Permissions.
     * 
     * @param copyrightHolder
     */
    public void setCopyrightHolder(gov.nih.nlm.ncbi.www.soap.eutils.efetch.CopyrightHolder copyrightHolder) {
        this.copyrightHolder = copyrightHolder;
    }


    /**
     * Gets the license value for this Permissions.
     * 
     * @return license
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.License getLicense() {
        return license;
    }


    /**
     * Sets the license value for this Permissions.
     * 
     * @param license
     */
    public void setLicense(gov.nih.nlm.ncbi.www.soap.eutils.efetch.License license) {
        this.license = license;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Permissions)) return false;
        Permissions other = (Permissions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.copyrightStatement==null && other.getCopyrightStatement()==null) || 
             (this.copyrightStatement!=null &&
              this.copyrightStatement.equals(other.getCopyrightStatement()))) &&
            ((this.copyrightYear==null && other.getCopyrightYear()==null) || 
             (this.copyrightYear!=null &&
              this.copyrightYear.equals(other.getCopyrightYear()))) &&
            ((this.copyrightHolder==null && other.getCopyrightHolder()==null) || 
             (this.copyrightHolder!=null &&
              this.copyrightHolder.equals(other.getCopyrightHolder()))) &&
            ((this.license==null && other.getLicense()==null) || 
             (this.license!=null &&
              this.license.equals(other.getLicense())));
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
        if (getCopyrightStatement() != null) {
            _hashCode += getCopyrightStatement().hashCode();
        }
        if (getCopyrightYear() != null) {
            _hashCode += getCopyrightYear().hashCode();
        }
        if (getCopyrightHolder() != null) {
            _hashCode += getCopyrightHolder().hashCode();
        }
        if (getLicense() != null) {
            _hashCode += getLicense().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Permissions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">permissions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copyrightStatement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "copyright-statement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">copyright-statement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copyrightYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "copyright-year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copyrightHolder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "copyright-holder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">copyright-holder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("license");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "license"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">license"));
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
