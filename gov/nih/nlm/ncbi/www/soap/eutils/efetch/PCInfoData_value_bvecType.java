/**
 * PCInfoData_value_bvecType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class PCInfoData_value_bvecType  implements java.io.Serializable {
    private gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCInfoData_value_bvec_EType[] PCInfoData_value_bvec_E;

    public PCInfoData_value_bvecType() {
    }

    public PCInfoData_value_bvecType(
           gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCInfoData_value_bvec_EType[] PCInfoData_value_bvec_E) {
           this.PCInfoData_value_bvec_E = PCInfoData_value_bvec_E;
    }


    /**
     * Gets the PCInfoData_value_bvec_E value for this PCInfoData_value_bvecType.
     * 
     * @return PCInfoData_value_bvec_E
     */
    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCInfoData_value_bvec_EType[] getPCInfoData_value_bvec_E() {
        return PCInfoData_value_bvec_E;
    }


    /**
     * Sets the PCInfoData_value_bvec_E value for this PCInfoData_value_bvecType.
     * 
     * @param PCInfoData_value_bvec_E
     */
    public void setPCInfoData_value_bvec_E(gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCInfoData_value_bvec_EType[] PCInfoData_value_bvec_E) {
        this.PCInfoData_value_bvec_E = PCInfoData_value_bvec_E;
    }

    public gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCInfoData_value_bvec_EType getPCInfoData_value_bvec_E(int i) {
        return this.PCInfoData_value_bvec_E[i];
    }

    public void setPCInfoData_value_bvec_E(int i, gov.nih.nlm.ncbi.www.soap.eutils.efetch.PCInfoData_value_bvec_EType _value) {
        this.PCInfoData_value_bvec_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PCInfoData_value_bvecType)) return false;
        PCInfoData_value_bvecType other = (PCInfoData_value_bvecType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PCInfoData_value_bvec_E==null && other.getPCInfoData_value_bvec_E()==null) || 
             (this.PCInfoData_value_bvec_E!=null &&
              java.util.Arrays.equals(this.PCInfoData_value_bvec_E, other.getPCInfoData_value_bvec_E())));
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
        if (getPCInfoData_value_bvec_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCInfoData_value_bvec_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCInfoData_value_bvec_E(), i);
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
        new org.apache.axis.description.TypeDesc(PCInfoData_value_bvecType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-InfoData_value_bvecType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCInfoData_value_bvec_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-InfoData_value_bvec_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "PC-InfoData_value_bvec_EType"));
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
