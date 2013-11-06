/**
 * Pssm_intermediateDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Pssm_intermediateDataType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmIntermediateDataType pssmIntermediateData;

    public Pssm_intermediateDataType() {
    }

    public Pssm_intermediateDataType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmIntermediateDataType pssmIntermediateData) {
           this.pssmIntermediateData = pssmIntermediateData;
    }


    /**
     * Gets the pssmIntermediateData value for this Pssm_intermediateDataType.
     * 
     * @return pssmIntermediateData
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmIntermediateDataType getPssmIntermediateData() {
        return pssmIntermediateData;
    }


    /**
     * Sets the pssmIntermediateData value for this Pssm_intermediateDataType.
     * 
     * @param pssmIntermediateData
     */
    public void setPssmIntermediateData(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmIntermediateDataType pssmIntermediateData) {
        this.pssmIntermediateData = pssmIntermediateData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pssm_intermediateDataType)) return false;
        Pssm_intermediateDataType other = (Pssm_intermediateDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pssmIntermediateData==null && other.getPssmIntermediateData()==null) || 
             (this.pssmIntermediateData!=null &&
              this.pssmIntermediateData.equals(other.getPssmIntermediateData())));
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
        if (getPssmIntermediateData() != null) {
            _hashCode += getPssmIntermediateData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pssm_intermediateDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pssm_intermediateDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssmIntermediateData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmIntermediateData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmIntermediateDataType"));
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
