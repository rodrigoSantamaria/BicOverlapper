/**
 * ESearchResultMS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.esearch;

public class ESearchResultMS  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultType eSearchResult;

    public ESearchResultMS() {
    }

    public ESearchResultMS(
           gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultType eSearchResult) {
           this.eSearchResult = eSearchResult;
    }


    /**
     * Gets the eSearchResult value for this ESearchResultMS.
     * 
     * @return eSearchResult
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultType getESearchResult() {
        return eSearchResult;
    }


    /**
     * Sets the eSearchResult value for this ESearchResultMS.
     * 
     * @param eSearchResult
     */
    public void setESearchResult(gov.nih.nlm.ncbi.www.soap.eutils.esearch.ESearchResultType eSearchResult) {
        this.eSearchResult = eSearchResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ESearchResultMS)) return false;
        ESearchResultMS other = (ESearchResultMS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eSearchResult==null && other.getESearchResult()==null) || 
             (this.eSearchResult!=null &&
              this.eSearchResult.equals(other.getESearchResult())));
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
        if (getESearchResult() != null) {
            _hashCode += getESearchResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ESearchResultMS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", ">eSearchResultMS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESearchResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "eSearchResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esearch", "eSearchResultType"));
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
