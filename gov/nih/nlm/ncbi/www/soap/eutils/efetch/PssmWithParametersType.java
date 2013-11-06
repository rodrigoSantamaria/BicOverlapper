/**
 * PssmWithParametersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PssmWithParametersType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmWithParameters_pssmType pssmWithParameters_pssm;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmWithParameters_paramsType pssmWithParameters_params;

    public PssmWithParametersType() {
    }

    public PssmWithParametersType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmWithParameters_pssmType pssmWithParameters_pssm,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmWithParameters_paramsType pssmWithParameters_params) {
           this.pssmWithParameters_pssm = pssmWithParameters_pssm;
           this.pssmWithParameters_params = pssmWithParameters_params;
    }


    /**
     * Gets the pssmWithParameters_pssm value for this PssmWithParametersType.
     * 
     * @return pssmWithParameters_pssm
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmWithParameters_pssmType getPssmWithParameters_pssm() {
        return pssmWithParameters_pssm;
    }


    /**
     * Sets the pssmWithParameters_pssm value for this PssmWithParametersType.
     * 
     * @param pssmWithParameters_pssm
     */
    public void setPssmWithParameters_pssm(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmWithParameters_pssmType pssmWithParameters_pssm) {
        this.pssmWithParameters_pssm = pssmWithParameters_pssm;
    }


    /**
     * Gets the pssmWithParameters_params value for this PssmWithParametersType.
     * 
     * @return pssmWithParameters_params
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmWithParameters_paramsType getPssmWithParameters_params() {
        return pssmWithParameters_params;
    }


    /**
     * Sets the pssmWithParameters_params value for this PssmWithParametersType.
     * 
     * @param pssmWithParameters_params
     */
    public void setPssmWithParameters_params(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmWithParameters_paramsType pssmWithParameters_params) {
        this.pssmWithParameters_params = pssmWithParameters_params;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PssmWithParametersType)) return false;
        PssmWithParametersType other = (PssmWithParametersType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pssmWithParameters_pssm==null && other.getPssmWithParameters_pssm()==null) || 
             (this.pssmWithParameters_pssm!=null &&
              this.pssmWithParameters_pssm.equals(other.getPssmWithParameters_pssm()))) &&
            ((this.pssmWithParameters_params==null && other.getPssmWithParameters_params()==null) || 
             (this.pssmWithParameters_params!=null &&
              this.pssmWithParameters_params.equals(other.getPssmWithParameters_params())));
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
        if (getPssmWithParameters_pssm() != null) {
            _hashCode += getPssmWithParameters_pssm().hashCode();
        }
        if (getPssmWithParameters_params() != null) {
            _hashCode += getPssmWithParameters_params().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PssmWithParametersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmWithParametersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssmWithParameters_pssm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmWithParameters_pssm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmWithParameters_pssmType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssmWithParameters_params");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmWithParameters_params"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmWithParameters_paramsType"));
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
