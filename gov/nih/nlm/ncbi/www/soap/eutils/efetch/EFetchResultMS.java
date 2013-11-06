/**
 * EFetchResultMS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class EFetchResultMS  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.EFetchResultType eFetchResult;

    public EFetchResultMS() {
    }

    public EFetchResultMS(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.EFetchResultType eFetchResult) {
           this.eFetchResult = eFetchResult;
    }


    /**
     * Gets the eFetchResult value for this EFetchResultMS.
     * 
     * @return eFetchResult
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.EFetchResultType getEFetchResult() {
        return eFetchResult;
    }


    /**
     * Sets the eFetchResult value for this EFetchResultMS.
     * 
     * @param eFetchResult
     */
    public void setEFetchResult(gov.nih.nlm.ncbi.www.soap.eutils.efetch.EFetchResultType eFetchResult) {
        this.eFetchResult = eFetchResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EFetchResultMS)) return false;
        EFetchResultMS other = (EFetchResultMS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eFetchResult==null && other.getEFetchResult()==null) || 
             (this.eFetchResult!=null &&
              this.eFetchResult.equals(other.getEFetchResult())));
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
        if (getEFetchResult() != null) {
            _hashCode += getEFetchResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EFetchResultMS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", ">eFetchResultMS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EFetchResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "eFetchResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "eFetchResultType"));
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
