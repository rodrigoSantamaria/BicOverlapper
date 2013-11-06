/**
 * Blast4Request_bodyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4Request_bodyType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4RequestBodyType blast4RequestBody;

    public Blast4Request_bodyType() {
    }

    public Blast4Request_bodyType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4RequestBodyType blast4RequestBody) {
           this.blast4RequestBody = blast4RequestBody;
    }


    /**
     * Gets the blast4RequestBody value for this Blast4Request_bodyType.
     * 
     * @return blast4RequestBody
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4RequestBodyType getBlast4RequestBody() {
        return blast4RequestBody;
    }


    /**
     * Sets the blast4RequestBody value for this Blast4Request_bodyType.
     * 
     * @param blast4RequestBody
     */
    public void setBlast4RequestBody(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4RequestBodyType blast4RequestBody) {
        this.blast4RequestBody = blast4RequestBody;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4Request_bodyType)) return false;
        Blast4Request_bodyType other = (Blast4Request_bodyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4RequestBody==null && other.getBlast4RequestBody()==null) || 
             (this.blast4RequestBody!=null &&
              this.blast4RequestBody.equals(other.getBlast4RequestBody())));
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
        if (getBlast4RequestBody() != null) {
            _hashCode += getBlast4RequestBody().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4Request_bodyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-request_bodyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4RequestBody");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-request-body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-request-bodyType"));
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
