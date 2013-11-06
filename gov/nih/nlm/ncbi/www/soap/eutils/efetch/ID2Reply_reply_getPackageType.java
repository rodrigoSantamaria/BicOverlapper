/**
 * ID2Reply_reply_getPackageType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2Reply_reply_getPackageType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetPackageType ID2ReplyGetPackage;

    public ID2Reply_reply_getPackageType() {
    }

    public ID2Reply_reply_getPackageType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetPackageType ID2ReplyGetPackage) {
           this.ID2ReplyGetPackage = ID2ReplyGetPackage;
    }


    /**
     * Gets the ID2ReplyGetPackage value for this ID2Reply_reply_getPackageType.
     * 
     * @return ID2ReplyGetPackage
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetPackageType getID2ReplyGetPackage() {
        return ID2ReplyGetPackage;
    }


    /**
     * Sets the ID2ReplyGetPackage value for this ID2Reply_reply_getPackageType.
     * 
     * @param ID2ReplyGetPackage
     */
    public void setID2ReplyGetPackage(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ReplyGetPackageType ID2ReplyGetPackage) {
        this.ID2ReplyGetPackage = ID2ReplyGetPackage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2Reply_reply_getPackageType)) return false;
        ID2Reply_reply_getPackageType other = (ID2Reply_reply_getPackageType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2ReplyGetPackage==null && other.getID2ReplyGetPackage()==null) || 
             (this.ID2ReplyGetPackage!=null &&
              this.ID2ReplyGetPackage.equals(other.getID2ReplyGetPackage())));
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
        if (getID2ReplyGetPackage() != null) {
            _hashCode += getID2ReplyGetPackage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID2Reply_reply_getPackageType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply_reply_get-packageType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2ReplyGetPackage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-Package"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply-Get-PackageType"));
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
