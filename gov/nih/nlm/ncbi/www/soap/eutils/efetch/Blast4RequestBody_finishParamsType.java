/**
 * Blast4RequestBody_finishParamsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4RequestBody_finishParamsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4FinishParamsRequestType blast4FinishParamsRequest;

    public Blast4RequestBody_finishParamsType() {
    }

    public Blast4RequestBody_finishParamsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4FinishParamsRequestType blast4FinishParamsRequest) {
           this.blast4FinishParamsRequest = blast4FinishParamsRequest;
    }


    /**
     * Gets the blast4FinishParamsRequest value for this Blast4RequestBody_finishParamsType.
     * 
     * @return blast4FinishParamsRequest
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4FinishParamsRequestType getBlast4FinishParamsRequest() {
        return blast4FinishParamsRequest;
    }


    /**
     * Sets the blast4FinishParamsRequest value for this Blast4RequestBody_finishParamsType.
     * 
     * @param blast4FinishParamsRequest
     */
    public void setBlast4FinishParamsRequest(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4FinishParamsRequestType blast4FinishParamsRequest) {
        this.blast4FinishParamsRequest = blast4FinishParamsRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4RequestBody_finishParamsType)) return false;
        Blast4RequestBody_finishParamsType other = (Blast4RequestBody_finishParamsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4FinishParamsRequest==null && other.getBlast4FinishParamsRequest()==null) || 
             (this.blast4FinishParamsRequest!=null &&
              this.blast4FinishParamsRequest.equals(other.getBlast4FinishParamsRequest())));
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
        if (getBlast4FinishParamsRequest() != null) {
            _hashCode += getBlast4FinishParamsRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4RequestBody_finishParamsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-request-body_finish-paramsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4FinishParamsRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-finish-params-request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-finish-params-requestType"));
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
