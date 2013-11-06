/**
 * MSSearch_requestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class MSSearch_requestType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSRequestType[] MSRequest;

    public MSSearch_requestType() {
    }

    public MSSearch_requestType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSRequestType[] MSRequest) {
           this.MSRequest = MSRequest;
    }


    /**
     * Gets the MSRequest value for this MSSearch_requestType.
     * 
     * @return MSRequest
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSRequestType[] getMSRequest() {
        return MSRequest;
    }


    /**
     * Sets the MSRequest value for this MSSearch_requestType.
     * 
     * @param MSRequest
     */
    public void setMSRequest(gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSRequestType[] MSRequest) {
        this.MSRequest = MSRequest;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSRequestType getMSRequest(int i) {
        return this.MSRequest[i];
    }

    public void setMSRequest(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.MSRequestType _value) {
        this.MSRequest[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSSearch_requestType)) return false;
        MSSearch_requestType other = (MSSearch_requestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSRequest==null && other.getMSRequest()==null) || 
             (this.MSRequest!=null &&
              java.util.Arrays.equals(this.MSRequest, other.getMSRequest())));
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
        if (getMSRequest() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMSRequest());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMSRequest(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MSSearch_requestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSSearch_requestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "MSRequestType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
