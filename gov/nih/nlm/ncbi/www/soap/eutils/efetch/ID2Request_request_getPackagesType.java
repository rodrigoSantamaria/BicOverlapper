/**
 * ID2Request_request_getPackagesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2Request_request_getPackagesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetPackagesType ID2RequestGetPackages;

    public ID2Request_request_getPackagesType() {
    }

    public ID2Request_request_getPackagesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetPackagesType ID2RequestGetPackages) {
           this.ID2RequestGetPackages = ID2RequestGetPackages;
    }


    /**
     * Gets the ID2RequestGetPackages value for this ID2Request_request_getPackagesType.
     * 
     * @return ID2RequestGetPackages
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetPackagesType getID2RequestGetPackages() {
        return ID2RequestGetPackages;
    }


    /**
     * Sets the ID2RequestGetPackages value for this ID2Request_request_getPackagesType.
     * 
     * @param ID2RequestGetPackages
     */
    public void setID2RequestGetPackages(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2RequestGetPackagesType ID2RequestGetPackages) {
        this.ID2RequestGetPackages = ID2RequestGetPackages;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2Request_request_getPackagesType)) return false;
        ID2Request_request_getPackagesType other = (ID2Request_request_getPackagesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2RequestGetPackages==null && other.getID2RequestGetPackages()==null) || 
             (this.ID2RequestGetPackages!=null &&
              this.ID2RequestGetPackages.equals(other.getID2RequestGetPackages())));
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
        if (getID2RequestGetPackages() != null) {
            _hashCode += getID2RequestGetPackages().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2Request_request_getPackagesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request_request_get-packagesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2RequestGetPackages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-Packages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Request-Get-PackagesType"));
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
