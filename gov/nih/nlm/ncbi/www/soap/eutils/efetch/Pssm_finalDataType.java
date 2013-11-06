/**
 * Pssm_finalDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Pssm_finalDataType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmFinalDataType pssmFinalData;

    public Pssm_finalDataType() {
    }

    public Pssm_finalDataType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmFinalDataType pssmFinalData) {
           this.pssmFinalData = pssmFinalData;
    }


    /**
     * Gets the pssmFinalData value for this Pssm_finalDataType.
     * 
     * @return pssmFinalData
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmFinalDataType getPssmFinalData() {
        return pssmFinalData;
    }


    /**
     * Sets the pssmFinalData value for this Pssm_finalDataType.
     * 
     * @param pssmFinalData
     */
    public void setPssmFinalData(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmFinalDataType pssmFinalData) {
        this.pssmFinalData = pssmFinalData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pssm_finalDataType)) return false;
        Pssm_finalDataType other = (Pssm_finalDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pssmFinalData==null && other.getPssmFinalData()==null) || 
             (this.pssmFinalData!=null &&
              this.pssmFinalData.equals(other.getPssmFinalData())));
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
        if (getPssmFinalData() != null) {
            _hashCode += getPssmFinalData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pssm_finalDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Pssm_finalDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssmFinalData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmFinalData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmFinalDataType"));
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
