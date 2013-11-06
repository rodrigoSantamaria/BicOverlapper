/**
 * Cdd_scoreparamsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Cdd_scoreparamsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmWithParametersType pssmWithParameters;

    public Cdd_scoreparamsType() {
    }

    public Cdd_scoreparamsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmWithParametersType pssmWithParameters) {
           this.pssmWithParameters = pssmWithParameters;
    }


    /**
     * Gets the pssmWithParameters value for this Cdd_scoreparamsType.
     * 
     * @return pssmWithParameters
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmWithParametersType getPssmWithParameters() {
        return pssmWithParameters;
    }


    /**
     * Sets the pssmWithParameters value for this Cdd_scoreparamsType.
     * 
     * @param pssmWithParameters
     */
    public void setPssmWithParameters(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmWithParametersType pssmWithParameters) {
        this.pssmWithParameters = pssmWithParameters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cdd_scoreparamsType)) return false;
        Cdd_scoreparamsType other = (Cdd_scoreparamsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pssmWithParameters==null && other.getPssmWithParameters()==null) || 
             (this.pssmWithParameters!=null &&
              this.pssmWithParameters.equals(other.getPssmWithParameters())));
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
        if (getPssmWithParameters() != null) {
            _hashCode += getPssmWithParameters().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cdd_scoreparamsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Cdd_scoreparamsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssmWithParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmWithParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmWithParametersType"));
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
