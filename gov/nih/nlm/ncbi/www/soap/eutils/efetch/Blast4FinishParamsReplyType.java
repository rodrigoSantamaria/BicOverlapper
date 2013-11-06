/**
 * Blast4FinishParamsReplyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4FinishParamsReplyType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ParametersType blast4Parameters;

    public Blast4FinishParamsReplyType() {
    }

    public Blast4FinishParamsReplyType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ParametersType blast4Parameters) {
           this.blast4Parameters = blast4Parameters;
    }


    /**
     * Gets the blast4Parameters value for this Blast4FinishParamsReplyType.
     * 
     * @return blast4Parameters
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ParametersType getBlast4Parameters() {
        return blast4Parameters;
    }


    /**
     * Sets the blast4Parameters value for this Blast4FinishParamsReplyType.
     * 
     * @param blast4Parameters
     */
    public void setBlast4Parameters(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ParametersType blast4Parameters) {
        this.blast4Parameters = blast4Parameters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4FinishParamsReplyType)) return false;
        Blast4FinishParamsReplyType other = (Blast4FinishParamsReplyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4Parameters==null && other.getBlast4Parameters()==null) || 
             (this.blast4Parameters!=null &&
              this.blast4Parameters.equals(other.getBlast4Parameters())));
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
        if (getBlast4Parameters() != null) {
            _hashCode += getBlast4Parameters().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4FinishParamsReplyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-finish-params-replyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-parametersType"));
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
