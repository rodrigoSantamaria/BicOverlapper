/**
 * Blast4RequestBody_getSequencePartsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4RequestBody_getSequencePartsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsRequestType blast4GetSeqPartsRequest;

    public Blast4RequestBody_getSequencePartsType() {
    }

    public Blast4RequestBody_getSequencePartsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsRequestType blast4GetSeqPartsRequest) {
           this.blast4GetSeqPartsRequest = blast4GetSeqPartsRequest;
    }


    /**
     * Gets the blast4GetSeqPartsRequest value for this Blast4RequestBody_getSequencePartsType.
     * 
     * @return blast4GetSeqPartsRequest
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsRequestType getBlast4GetSeqPartsRequest() {
        return blast4GetSeqPartsRequest;
    }


    /**
     * Sets the blast4GetSeqPartsRequest value for this Blast4RequestBody_getSequencePartsType.
     * 
     * @param blast4GetSeqPartsRequest
     */
    public void setBlast4GetSeqPartsRequest(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4GetSeqPartsRequestType blast4GetSeqPartsRequest) {
        this.blast4GetSeqPartsRequest = blast4GetSeqPartsRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4RequestBody_getSequencePartsType)) return false;
        Blast4RequestBody_getSequencePartsType other = (Blast4RequestBody_getSequencePartsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4GetSeqPartsRequest==null && other.getBlast4GetSeqPartsRequest()==null) || 
             (this.blast4GetSeqPartsRequest!=null &&
              this.blast4GetSeqPartsRequest.equals(other.getBlast4GetSeqPartsRequest())));
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
        if (getBlast4GetSeqPartsRequest() != null) {
            _hashCode += getBlast4GetSeqPartsRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4RequestBody_getSequencePartsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-request-body_get-sequence-partsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4GetSeqPartsRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-seq-parts-request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-seq-parts-requestType"));
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
