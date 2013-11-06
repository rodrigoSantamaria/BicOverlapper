/**
 * PssmParameters_rpsdbparamsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PssmParameters_rpsdbparamsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.FormatRpsDbParametersType formatRpsDbParameters;

    public PssmParameters_rpsdbparamsType() {
    }

    public PssmParameters_rpsdbparamsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.FormatRpsDbParametersType formatRpsDbParameters) {
           this.formatRpsDbParameters = formatRpsDbParameters;
    }


    /**
     * Gets the formatRpsDbParameters value for this PssmParameters_rpsdbparamsType.
     * 
     * @return formatRpsDbParameters
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.FormatRpsDbParametersType getFormatRpsDbParameters() {
        return formatRpsDbParameters;
    }


    /**
     * Sets the formatRpsDbParameters value for this PssmParameters_rpsdbparamsType.
     * 
     * @param formatRpsDbParameters
     */
    public void setFormatRpsDbParameters(gov.nih.nlm.ncbi.www.soap.eutils.efetch.FormatRpsDbParametersType formatRpsDbParameters) {
        this.formatRpsDbParameters = formatRpsDbParameters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PssmParameters_rpsdbparamsType)) return false;
        PssmParameters_rpsdbparamsType other = (PssmParameters_rpsdbparamsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.formatRpsDbParameters==null && other.getFormatRpsDbParameters()==null) || 
             (this.formatRpsDbParameters!=null &&
              this.formatRpsDbParameters.equals(other.getFormatRpsDbParameters())));
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
        if (getFormatRpsDbParameters() != null) {
            _hashCode += getFormatRpsDbParameters().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PssmParameters_rpsdbparamsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmParameters_rpsdbparamsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatRpsDbParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FormatRpsDbParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "FormatRpsDbParametersType"));
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
