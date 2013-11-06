/**
 * PCAnnotatedXRef_xrefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCAnnotatedXRef_xrefType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCXRefDataType PCXRefData;

    public PCAnnotatedXRef_xrefType() {
    }

    public PCAnnotatedXRef_xrefType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCXRefDataType PCXRefData) {
           this.PCXRefData = PCXRefData;
    }


    /**
     * Gets the PCXRefData value for this PCAnnotatedXRef_xrefType.
     * 
     * @return PCXRefData
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCXRefDataType getPCXRefData() {
        return PCXRefData;
    }


    /**
     * Sets the PCXRefData value for this PCAnnotatedXRef_xrefType.
     * 
     * @param PCXRefData
     */
    public void setPCXRefData(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCXRefDataType PCXRefData) {
        this.PCXRefData = PCXRefData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCAnnotatedXRef_xrefType)) return false;
        PCAnnotatedXRef_xrefType other = (PCAnnotatedXRef_xrefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCXRefData==null && other.getPCXRefData()==null) || 
             (this.PCXRefData!=null &&
              this.PCXRefData.equals(other.getPCXRefData())));
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
        if (getPCXRefData() != null) {
            _hashCode += getPCXRefData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PCAnnotatedXRef_xrefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AnnotatedXRef_xrefType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCXRefData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-XRefData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-XRefDataType"));
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
