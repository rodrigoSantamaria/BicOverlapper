/**
 * Blast4ErrorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4ErrorType  implements java.io.Serializable {
    private java.lang.String blast4Error_code;

    private java.lang.String blast4Error_message;

    public Blast4ErrorType() {
    }

    public Blast4ErrorType(
           java.lang.String blast4Error_code,
           java.lang.String blast4Error_message) {
           this.blast4Error_code = blast4Error_code;
           this.blast4Error_message = blast4Error_message;
    }


    /**
     * Gets the blast4Error_code value for this Blast4ErrorType.
     * 
     * @return blast4Error_code
     */
    public java.lang.String getBlast4Error_code() {
        return blast4Error_code;
    }


    /**
     * Sets the blast4Error_code value for this Blast4ErrorType.
     * 
     * @param blast4Error_code
     */
    public void setBlast4Error_code(java.lang.String blast4Error_code) {
        this.blast4Error_code = blast4Error_code;
    }


    /**
     * Gets the blast4Error_message value for this Blast4ErrorType.
     * 
     * @return blast4Error_message
     */
    public java.lang.String getBlast4Error_message() {
        return blast4Error_message;
    }


    /**
     * Sets the blast4Error_message value for this Blast4ErrorType.
     * 
     * @param blast4Error_message
     */
    public void setBlast4Error_message(java.lang.String blast4Error_message) {
        this.blast4Error_message = blast4Error_message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4ErrorType)) return false;
        Blast4ErrorType other = (Blast4ErrorType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4Error_code==null && other.getBlast4Error_code()==null) || 
             (this.blast4Error_code!=null &&
              this.blast4Error_code.equals(other.getBlast4Error_code()))) &&
            ((this.blast4Error_message==null && other.getBlast4Error_message()==null) || 
             (this.blast4Error_message!=null &&
              this.blast4Error_message.equals(other.getBlast4Error_message())));
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
        if (getBlast4Error_code() != null) {
            _hashCode += getBlast4Error_code().hashCode();
        }
        if (getBlast4Error_message() != null) {
            _hashCode += getBlast4Error_message().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Blast4ErrorType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-errorType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Error_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-error_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Error_message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-error_message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
