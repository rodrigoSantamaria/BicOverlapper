/**
 * Blast4GetParametersReplyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4GetParametersReplyType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ParameterInfoType[] blast4ParameterInfo;

    public Blast4GetParametersReplyType() {
    }

    public Blast4GetParametersReplyType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ParameterInfoType[] blast4ParameterInfo) {
           this.blast4ParameterInfo = blast4ParameterInfo;
    }


    /**
     * Gets the blast4ParameterInfo value for this Blast4GetParametersReplyType.
     * 
     * @return blast4ParameterInfo
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ParameterInfoType[] getBlast4ParameterInfo() {
        return blast4ParameterInfo;
    }


    /**
     * Sets the blast4ParameterInfo value for this Blast4GetParametersReplyType.
     * 
     * @param blast4ParameterInfo
     */
    public void setBlast4ParameterInfo(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ParameterInfoType[] blast4ParameterInfo) {
        this.blast4ParameterInfo = blast4ParameterInfo;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ParameterInfoType getBlast4ParameterInfo(int i) {
        return this.blast4ParameterInfo[i];
    }

    public void setBlast4ParameterInfo(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ParameterInfoType _value) {
        this.blast4ParameterInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4GetParametersReplyType)) return false;
        Blast4GetParametersReplyType other = (Blast4GetParametersReplyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4ParameterInfo==null && other.getBlast4ParameterInfo()==null) || 
             (this.blast4ParameterInfo!=null &&
              java.util.Arrays.equals(this.blast4ParameterInfo, other.getBlast4ParameterInfo())));
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
        if (getBlast4ParameterInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBlast4ParameterInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBlast4ParameterInfo(), i);
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
        new org.apache.axis.description.TypeDesc(Blast4GetParametersReplyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-get-parameters-replyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4ParameterInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-parameter-info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-parameter-infoType"));
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
