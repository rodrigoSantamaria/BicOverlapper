/**
 * EInfoResultMS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.einfo;

public class EInfoResultMS  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultType eInfoResult;

    public EInfoResultMS() {
    }

    public EInfoResultMS(
           gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultType eInfoResult) {
           this.eInfoResult = eInfoResult;
    }


    /**
     * Gets the eInfoResult value for this EInfoResultMS.
     * 
     * @return eInfoResult
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultType getEInfoResult() {
        return eInfoResult;
    }


    /**
     * Sets the eInfoResult value for this EInfoResultMS.
     * 
     * @param eInfoResult
     */
    public void setEInfoResult(gov.nih.nlm.ncbi.www.soap.eutils.einfo.EInfoResultType eInfoResult) {
        this.eInfoResult = eInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EInfoResultMS)) return false;
        EInfoResultMS other = (EInfoResultMS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eInfoResult==null && other.getEInfoResult()==null) || 
             (this.eInfoResult!=null &&
              this.eInfoResult.equals(other.getEInfoResult())));
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
        if (getEInfoResult() != null) {
            _hashCode += getEInfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EInfoResultMS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", ">eInfoResultMS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "eInfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/einfo", "eInfoResultType"));
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
