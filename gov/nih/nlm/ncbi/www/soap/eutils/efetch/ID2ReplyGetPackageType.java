/**
 * ID2ReplyGetPackageType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2ReplyGetPackageType  implements java.io.Serializable {
    private java.lang.String ID2ReplyGetPackage_name;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetPackage_paramsType ID2ReplyGetPackage_params;

    public ID2ReplyGetPackageType() {
    }

    public ID2ReplyGetPackageType(
           java.lang.String ID2ReplyGetPackage_name,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetPackage_paramsType ID2ReplyGetPackage_params) {
           this.ID2ReplyGetPackage_name = ID2ReplyGetPackage_name;
           this.ID2ReplyGetPackage_params = ID2ReplyGetPackage_params;
    }


    /**
     * Gets the ID2ReplyGetPackage_name value for this ID2ReplyGetPackageType.
     * 
     * @return ID2ReplyGetPackage_name
     */
    public java.lang.String getID2ReplyGetPackage_name() {
        return ID2ReplyGetPackage_name;
    }


    /**
     * Sets the ID2ReplyGetPackage_name value for this ID2ReplyGetPackageType.
     * 
     * @param ID2ReplyGetPackage_name
     */
    public void setID2ReplyGetPackage_name(java.lang.String ID2ReplyGetPackage_name) {
        this.ID2ReplyGetPackage_name = ID2ReplyGetPackage_name;
    }


    /**
     * Gets the ID2ReplyGetPackage_params value for this ID2ReplyGetPackageType.
     * 
     * @return ID2ReplyGetPackage_params
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetPackage_paramsType getID2ReplyGetPackage_params() {
        return ID2ReplyGetPackage_params;
    }


    /**
     * Sets the ID2ReplyGetPackage_params value for this ID2ReplyGetPackageType.
     * 
     * @param ID2ReplyGetPackage_params
     */
    public void setID2ReplyGetPackage_params(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetPackage_paramsType ID2ReplyGetPackage_params) {
        this.ID2ReplyGetPackage_params = ID2ReplyGetPackage_params;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2ReplyGetPackageType)) return false;
        ID2ReplyGetPackageType other = (ID2ReplyGetPackageType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2ReplyGetPackage_name==null && other.getID2ReplyGetPackage_name()==null) || 
             (this.ID2ReplyGetPackage_name!=null &&
              this.ID2ReplyGetPackage_name.equals(other.getID2ReplyGetPackage_name()))) &&
            ((this.ID2ReplyGetPackage_params==null && other.getID2ReplyGetPackage_params()==null) || 
             (this.ID2ReplyGetPackage_params!=null &&
              this.ID2ReplyGetPackage_params.equals(other.getID2ReplyGetPackage_params())));
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
        if (getID2ReplyGetPackage_name() != null) {
            _hashCode += getID2ReplyGetPackage_name().hashCode();
        }
        if (getID2ReplyGetPackage_params() != null) {
            _hashCode += getID2ReplyGetPackage_params().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2ReplyGetPackageType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-PackageType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2ReplyGetPackage_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Package_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2ReplyGetPackage_params");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Package_params"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Package_paramsType"));
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
