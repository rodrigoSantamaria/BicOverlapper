/**
 * ID2RequestGetPackagesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2RequestGetPackagesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetPackages_namesType ID2RequestGetPackages_names;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetPackages_noContents ID2RequestGetPackages_noContents;

    public ID2RequestGetPackagesType() {
    }

    public ID2RequestGetPackagesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetPackages_namesType ID2RequestGetPackages_names,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetPackages_noContents ID2RequestGetPackages_noContents) {
           this.ID2RequestGetPackages_names = ID2RequestGetPackages_names;
           this.ID2RequestGetPackages_noContents = ID2RequestGetPackages_noContents;
    }


    /**
     * Gets the ID2RequestGetPackages_names value for this ID2RequestGetPackagesType.
     * 
     * @return ID2RequestGetPackages_names
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetPackages_namesType getID2RequestGetPackages_names() {
        return ID2RequestGetPackages_names;
    }


    /**
     * Sets the ID2RequestGetPackages_names value for this ID2RequestGetPackagesType.
     * 
     * @param ID2RequestGetPackages_names
     */
    public void setID2RequestGetPackages_names(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetPackages_namesType ID2RequestGetPackages_names) {
        this.ID2RequestGetPackages_names = ID2RequestGetPackages_names;
    }


    /**
     * Gets the ID2RequestGetPackages_noContents value for this ID2RequestGetPackagesType.
     * 
     * @return ID2RequestGetPackages_noContents
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetPackages_noContents getID2RequestGetPackages_noContents() {
        return ID2RequestGetPackages_noContents;
    }


    /**
     * Sets the ID2RequestGetPackages_noContents value for this ID2RequestGetPackagesType.
     * 
     * @param ID2RequestGetPackages_noContents
     */
    public void setID2RequestGetPackages_noContents(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetPackages_noContents ID2RequestGetPackages_noContents) {
        this.ID2RequestGetPackages_noContents = ID2RequestGetPackages_noContents;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2RequestGetPackagesType)) return false;
        ID2RequestGetPackagesType other = (ID2RequestGetPackagesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2RequestGetPackages_names==null && other.getID2RequestGetPackages_names()==null) || 
             (this.ID2RequestGetPackages_names!=null &&
              this.ID2RequestGetPackages_names.equals(other.getID2RequestGetPackages_names()))) &&
            ((this.ID2RequestGetPackages_noContents==null && other.getID2RequestGetPackages_noContents()==null) || 
             (this.ID2RequestGetPackages_noContents!=null &&
              this.ID2RequestGetPackages_noContents.equals(other.getID2RequestGetPackages_noContents())));
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
        if (getID2RequestGetPackages_names() != null) {
            _hashCode += getID2RequestGetPackages_names().hashCode();
        }
        if (getID2RequestGetPackages_noContents() != null) {
            _hashCode += getID2RequestGetPackages_noContents().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2RequestGetPackagesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-PackagesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2RequestGetPackages_names");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Packages_names"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Packages_namesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2RequestGetPackages_noContents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Packages_no-contents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">ID2-Request-Get-Packages_no-contents"));
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
