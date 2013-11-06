/**
 * Blast4FinishParamsRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4FinishParamsRequestType  implements java.io.Serializable {
    private java.lang.String blast4FinishParamsRequest_program;

    private java.lang.String blast4FinishParamsRequest_service;

    private java.lang.String blast4FinishParamsRequest_paramset;

    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4FinishParamsRequest_paramsType blast4FinishParamsRequest_params;

    public Blast4FinishParamsRequestType() {
    }

    public Blast4FinishParamsRequestType(
           java.lang.String blast4FinishParamsRequest_program,
           java.lang.String blast4FinishParamsRequest_service,
           java.lang.String blast4FinishParamsRequest_paramset,
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4FinishParamsRequest_paramsType blast4FinishParamsRequest_params) {
           this.blast4FinishParamsRequest_program = blast4FinishParamsRequest_program;
           this.blast4FinishParamsRequest_service = blast4FinishParamsRequest_service;
           this.blast4FinishParamsRequest_paramset = blast4FinishParamsRequest_paramset;
           this.blast4FinishParamsRequest_params = blast4FinishParamsRequest_params;
    }


    /**
     * Gets the blast4FinishParamsRequest_program value for this Blast4FinishParamsRequestType.
     * 
     * @return blast4FinishParamsRequest_program
     */
    public java.lang.String getBlast4FinishParamsRequest_program() {
        return blast4FinishParamsRequest_program;
    }


    /**
     * Sets the blast4FinishParamsRequest_program value for this Blast4FinishParamsRequestType.
     * 
     * @param blast4FinishParamsRequest_program
     */
    public void setBlast4FinishParamsRequest_program(java.lang.String blast4FinishParamsRequest_program) {
        this.blast4FinishParamsRequest_program = blast4FinishParamsRequest_program;
    }


    /**
     * Gets the blast4FinishParamsRequest_service value for this Blast4FinishParamsRequestType.
     * 
     * @return blast4FinishParamsRequest_service
     */
    public java.lang.String getBlast4FinishParamsRequest_service() {
        return blast4FinishParamsRequest_service;
    }


    /**
     * Sets the blast4FinishParamsRequest_service value for this Blast4FinishParamsRequestType.
     * 
     * @param blast4FinishParamsRequest_service
     */
    public void setBlast4FinishParamsRequest_service(java.lang.String blast4FinishParamsRequest_service) {
        this.blast4FinishParamsRequest_service = blast4FinishParamsRequest_service;
    }


    /**
     * Gets the blast4FinishParamsRequest_paramset value for this Blast4FinishParamsRequestType.
     * 
     * @return blast4FinishParamsRequest_paramset
     */
    public java.lang.String getBlast4FinishParamsRequest_paramset() {
        return blast4FinishParamsRequest_paramset;
    }


    /**
     * Sets the blast4FinishParamsRequest_paramset value for this Blast4FinishParamsRequestType.
     * 
     * @param blast4FinishParamsRequest_paramset
     */
    public void setBlast4FinishParamsRequest_paramset(java.lang.String blast4FinishParamsRequest_paramset) {
        this.blast4FinishParamsRequest_paramset = blast4FinishParamsRequest_paramset;
    }


    /**
     * Gets the blast4FinishParamsRequest_params value for this Blast4FinishParamsRequestType.
     * 
     * @return blast4FinishParamsRequest_params
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4FinishParamsRequest_paramsType getBlast4FinishParamsRequest_params() {
        return blast4FinishParamsRequest_params;
    }


    /**
     * Sets the blast4FinishParamsRequest_params value for this Blast4FinishParamsRequestType.
     * 
     * @param blast4FinishParamsRequest_params
     */
    public void setBlast4FinishParamsRequest_params(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4FinishParamsRequest_paramsType blast4FinishParamsRequest_params) {
        this.blast4FinishParamsRequest_params = blast4FinishParamsRequest_params;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4FinishParamsRequestType)) return false;
        Blast4FinishParamsRequestType other = (Blast4FinishParamsRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4FinishParamsRequest_program==null && other.getBlast4FinishParamsRequest_program()==null) || 
             (this.blast4FinishParamsRequest_program!=null &&
              this.blast4FinishParamsRequest_program.equals(other.getBlast4FinishParamsRequest_program()))) &&
            ((this.blast4FinishParamsRequest_service==null && other.getBlast4FinishParamsRequest_service()==null) || 
             (this.blast4FinishParamsRequest_service!=null &&
              this.blast4FinishParamsRequest_service.equals(other.getBlast4FinishParamsRequest_service()))) &&
            ((this.blast4FinishParamsRequest_paramset==null && other.getBlast4FinishParamsRequest_paramset()==null) || 
             (this.blast4FinishParamsRequest_paramset!=null &&
              this.blast4FinishParamsRequest_paramset.equals(other.getBlast4FinishParamsRequest_paramset()))) &&
            ((this.blast4FinishParamsRequest_params==null && other.getBlast4FinishParamsRequest_params()==null) || 
             (this.blast4FinishParamsRequest_params!=null &&
              this.blast4FinishParamsRequest_params.equals(other.getBlast4FinishParamsRequest_params())));
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
        if (getBlast4FinishParamsRequest_program() != null) {
            _hashCode += getBlast4FinishParamsRequest_program().hashCode();
        }
        if (getBlast4FinishParamsRequest_service() != null) {
            _hashCode += getBlast4FinishParamsRequest_service().hashCode();
        }
        if (getBlast4FinishParamsRequest_paramset() != null) {
            _hashCode += getBlast4FinishParamsRequest_paramset().hashCode();
        }
        if (getBlast4FinishParamsRequest_params() != null) {
            _hashCode += getBlast4FinishParamsRequest_params().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4FinishParamsRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-finish-params-requestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4FinishParamsRequest_program");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-finish-params-request_program"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4FinishParamsRequest_service");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-finish-params-request_service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4FinishParamsRequest_paramset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-finish-params-request_paramset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4FinishParamsRequest_params");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-finish-params-request_params"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-finish-params-request_paramsType"));
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
