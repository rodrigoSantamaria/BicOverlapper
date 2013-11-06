/**
 * Blast4Reply_errorsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4Reply_errorsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ErrorType[] blast4Error;

    public Blast4Reply_errorsType() {
    }

    public Blast4Reply_errorsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ErrorType[] blast4Error) {
           this.blast4Error = blast4Error;
    }


    /**
     * Gets the blast4Error value for this Blast4Reply_errorsType.
     * 
     * @return blast4Error
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ErrorType[] getBlast4Error() {
        return blast4Error;
    }


    /**
     * Sets the blast4Error value for this Blast4Reply_errorsType.
     * 
     * @param blast4Error
     */
    public void setBlast4Error(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ErrorType[] blast4Error) {
        this.blast4Error = blast4Error;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ErrorType getBlast4Error(int i) {
        return this.blast4Error[i];
    }

    public void setBlast4Error(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ErrorType _value) {
        this.blast4Error[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4Reply_errorsType)) return false;
        Blast4Reply_errorsType other = (Blast4Reply_errorsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4Error==null && other.getBlast4Error()==null) || 
             (this.blast4Error!=null &&
              java.util.Arrays.equals(this.blast4Error, other.getBlast4Error())));
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
        if (getBlast4Error() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBlast4Error());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBlast4Error(), i);
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
        new org.apache.axis.description.TypeDesc(Blast4Reply_errorsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-reply_errorsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-errorType"));
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
