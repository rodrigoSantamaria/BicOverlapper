/**
 * PssmWithParameters_paramsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PssmWithParameters_paramsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmParametersType pssmParameters;

    public PssmWithParameters_paramsType() {
    }

    public PssmWithParameters_paramsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmParametersType pssmParameters) {
           this.pssmParameters = pssmParameters;
    }


    /**
     * Gets the pssmParameters value for this PssmWithParameters_paramsType.
     * 
     * @return pssmParameters
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmParametersType getPssmParameters() {
        return pssmParameters;
    }


    /**
     * Sets the pssmParameters value for this PssmWithParameters_paramsType.
     * 
     * @param pssmParameters
     */
    public void setPssmParameters(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmParametersType pssmParameters) {
        this.pssmParameters = pssmParameters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PssmWithParameters_paramsType)) return false;
        PssmWithParameters_paramsType other = (PssmWithParameters_paramsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pssmParameters==null && other.getPssmParameters()==null) || 
             (this.pssmParameters!=null &&
              this.pssmParameters.equals(other.getPssmParameters())));
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
        if (getPssmParameters() != null) {
            _hashCode += getPssmParameters().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PssmWithParameters_paramsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmWithParameters_paramsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssmParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmParametersType"));
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
