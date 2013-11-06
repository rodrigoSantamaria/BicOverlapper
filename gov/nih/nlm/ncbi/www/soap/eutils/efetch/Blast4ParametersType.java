/**
 * Blast4ParametersType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4ParametersType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ParameterType[] blast4Parameter;

    public Blast4ParametersType() {
    }

    public Blast4ParametersType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ParameterType[] blast4Parameter) {
           this.blast4Parameter = blast4Parameter;
    }


    /**
     * Gets the blast4Parameter value for this Blast4ParametersType.
     * 
     * @return blast4Parameter
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ParameterType[] getBlast4Parameter() {
        return blast4Parameter;
    }


    /**
     * Sets the blast4Parameter value for this Blast4ParametersType.
     * 
     * @param blast4Parameter
     */
    public void setBlast4Parameter(gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ParameterType[] blast4Parameter) {
        this.blast4Parameter = blast4Parameter;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ParameterType getBlast4Parameter(int i) {
        return this.blast4Parameter[i];
    }

    public void setBlast4Parameter(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.Blast4ParameterType _value) {
        this.blast4Parameter[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4ParametersType)) return false;
        Blast4ParametersType other = (Blast4ParametersType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blast4Parameter==null && other.getBlast4Parameter()==null) || 
             (this.blast4Parameter!=null &&
              java.util.Arrays.equals(this.blast4Parameter, other.getBlast4Parameter())));
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
        if (getBlast4Parameter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBlast4Parameter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBlast4Parameter(), i);
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
        new org.apache.axis.description.TypeDesc(Blast4ParametersType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-parametersType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blast4Parameter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-parameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-parameterType"));
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
