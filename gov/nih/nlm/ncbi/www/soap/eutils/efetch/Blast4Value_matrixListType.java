/**
 * Blast4Value_matrixListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Blast4Value_matrixListType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmWithParametersType[] pssmWithParameters;

    public Blast4Value_matrixListType() {
    }

    public Blast4Value_matrixListType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmWithParametersType[] pssmWithParameters) {
           this.pssmWithParameters = pssmWithParameters;
    }


    /**
     * Gets the pssmWithParameters value for this Blast4Value_matrixListType.
     * 
     * @return pssmWithParameters
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmWithParametersType[] getPssmWithParameters() {
        return pssmWithParameters;
    }


    /**
     * Sets the pssmWithParameters value for this Blast4Value_matrixListType.
     * 
     * @param pssmWithParameters
     */
    public void setPssmWithParameters(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmWithParametersType[] pssmWithParameters) {
        this.pssmWithParameters = pssmWithParameters;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmWithParametersType getPssmWithParameters(int i) {
        return this.pssmWithParameters[i];
    }

    public void setPssmWithParameters(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PssmWithParametersType _value) {
        this.pssmWithParameters[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Blast4Value_matrixListType)) return false;
        Blast4Value_matrixListType other = (Blast4Value_matrixListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pssmWithParameters==null && other.getPssmWithParameters()==null) || 
             (this.pssmWithParameters!=null &&
              java.util.Arrays.equals(this.pssmWithParameters, other.getPssmWithParameters())));
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
        if (getPssmWithParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPssmWithParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPssmWithParameters(), i);
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
        new org.apache.axis.description.TypeDesc(Blast4Value_matrixListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Blast4-value_matrix-listType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pssmWithParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmWithParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PssmWithParametersType"));
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
