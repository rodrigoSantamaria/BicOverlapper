/**
 * PCAssayDescription_resultsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCAssayDescription_resultsType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCResultTypeType[] PCResultType;

    public PCAssayDescription_resultsType() {
    }

    public PCAssayDescription_resultsType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCResultTypeType[] PCResultType) {
           this.PCResultType = PCResultType;
    }


    /**
     * Gets the PCResultType value for this PCAssayDescription_resultsType.
     * 
     * @return PCResultType
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCResultTypeType[] getPCResultType() {
        return PCResultType;
    }


    /**
     * Sets the PCResultType value for this PCAssayDescription_resultsType.
     * 
     * @param PCResultType
     */
    public void setPCResultType(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCResultTypeType[] PCResultType) {
        this.PCResultType = PCResultType;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCResultTypeType getPCResultType(int i) {
        return this.PCResultType[i];
    }

    public void setPCResultType(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCResultTypeType _value) {
        this.PCResultType[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCAssayDescription_resultsType)) return false;
        PCAssayDescription_resultsType other = (PCAssayDescription_resultsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCResultType==null && other.getPCResultType()==null) || 
             (this.PCResultType!=null &&
              java.util.Arrays.equals(this.PCResultType, other.getPCResultType())));
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
        if (getPCResultType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCResultType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCResultType(), i);
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
        new org.apache.axis.description.TypeDesc(PCAssayDescription_resultsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-AssayDescription_resultsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCResultType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-ResultType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-ResultTypeType"));
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
