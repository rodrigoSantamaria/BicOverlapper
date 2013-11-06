/**
 * ID2Reply_errorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class ID2Reply_errorType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ErrorType[] ID2Error;

    public ID2Reply_errorType() {
    }

    public ID2Reply_errorType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ErrorType[] ID2Error) {
           this.ID2Error = ID2Error;
    }


    /**
     * Gets the ID2Error value for this ID2Reply_errorType.
     * 
     * @return ID2Error
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ErrorType[] getID2Error() {
        return ID2Error;
    }


    /**
     * Sets the ID2Error value for this ID2Reply_errorType.
     * 
     * @param ID2Error
     */
    public void setID2Error(gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ErrorType[] ID2Error) {
        this.ID2Error = ID2Error;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ErrorType getID2Error(int i) {
        return this.ID2Error[i];
    }

    public void setID2Error(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.ID2ErrorType _value) {
        this.ID2Error[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID2Reply_errorType)) return false;
        ID2Reply_errorType other = (ID2Reply_errorType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID2Error==null && other.getID2Error()==null) || 
             (this.ID2Error!=null &&
              java.util.Arrays.equals(this.ID2Error, other.getID2Error())));
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
        if (getID2Error() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getID2Error());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getID2Error(), i);
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
        new org.apache.axis.description.TypeDesc(ID2Reply_errorType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Reply_errorType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID2Error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-Error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "ID2-ErrorType"));
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
