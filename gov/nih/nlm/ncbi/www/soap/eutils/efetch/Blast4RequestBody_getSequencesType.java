/**
 * Blast4RequestBody_getSequencesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4RequestBody_getSequencesType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSequencesRequestType blast4GetSequencesRequest;

    public Blast4RequestBody_getSequencesType() {
    }

    public Blast4RequestBody_getSequencesType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSequencesRequestType blast4GetSequencesRequest) {
           this.blast4GetSequencesRequest = blast4GetSequencesRequest;
    }


    /**
     * Gets the blast4GetSequencesRequest value for this Blast4RequestBody_getSequencesType.
     * 
     * @return blast4GetSequencesRequest
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSequencesRequestType getBlast4GetSequencesRequest() {
        return blast4GetSequencesRequest;
    }


    /**
     * Sets the blast4GetSequencesRequest value for this Blast4RequestBody_getSequencesType.
     * 
     * @param blast4GetSequencesRequest
     */
    public void setBlast4GetSequencesRequest(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSequencesRequestType blast4GetSequencesRequest) {
        this.blast4GetSequencesRequest = blast4GetSequencesRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4RequestBody_getSequencesType)) return false;
        Blast4RequestBody_getSequencesType other = (Blast4RequestBody_getSequencesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4GetSequencesRequest==null && other.getBlast4GetSequencesRequest()==null) || 
             (this.blast4GetSequencesRequest!=null &&
              this.blast4GetSequencesRequest.equals(other.getBlast4GetSequencesRequest())));
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
        if (getBlast4GetSequencesRequest() != null) {
            _hashCode += getBlast4GetSequencesRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4RequestBody_getSequencesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-request-body_get-sequencesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4GetSequencesRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-sequences-request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-sequences-requestType"));
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
