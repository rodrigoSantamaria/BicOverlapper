/**
 * ESummaryResultMS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.esummary;

public class ESummaryResultMS  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryResultType eSummaryResult;

    public ESummaryResultMS() {
    }

    public ESummaryResultMS(
           gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryResultType eSummaryResult) {
           this.eSummaryResult = eSummaryResult;
    }


    /**
     * Gets the eSummaryResult value for this ESummaryResultMS.
     * 
     * @return eSummaryResult
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryResultType getESummaryResult() {
        return eSummaryResult;
    }


    /**
     * Sets the eSummaryResult value for this ESummaryResultMS.
     * 
     * @param eSummaryResult
     */
    public void setESummaryResult(gov.nih.nlm.ncbi.www.soap.eutils.esummary.ESummaryResultType eSummaryResult) {
        this.eSummaryResult = eSummaryResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ESummaryResultMS)) return false;
        ESummaryResultMS other = (ESummaryResultMS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eSummaryResult==null && other.getESummaryResult()==null) || 
             (this.eSummaryResult!=null &&
              this.eSummaryResult.equals(other.getESummaryResult())));
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
        if (getESummaryResult() != null) {
            _hashCode += getESummaryResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ESummaryResultMS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esummary", ">eSummaryResultMS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESummaryResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esummary", "eSummaryResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/esummary", "eSummaryResultType"));
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
