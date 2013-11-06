/**
 * Rs_validation_otherPopBatchIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class Rs_validation_otherPopBatchIdType  implements java.io.Serializable {
    private java.lang.String[] rs_validation_otherPopBatchId_E;

    public Rs_validation_otherPopBatchIdType() {
    }

    public Rs_validation_otherPopBatchIdType(
           java.lang.String[] rs_validation_otherPopBatchId_E) {
           this.rs_validation_otherPopBatchId_E = rs_validation_otherPopBatchId_E;
    }


    /**
     * Gets the rs_validation_otherPopBatchId_E value for this Rs_validation_otherPopBatchIdType.
     * 
     * @return rs_validation_otherPopBatchId_E
     */
    public java.lang.String[] getRs_validation_otherPopBatchId_E() {
        return rs_validation_otherPopBatchId_E;
    }


    /**
     * Sets the rs_validation_otherPopBatchId_E value for this Rs_validation_otherPopBatchIdType.
     * 
     * @param rs_validation_otherPopBatchId_E
     */
    public void setRs_validation_otherPopBatchId_E(java.lang.String[] rs_validation_otherPopBatchId_E) {
        this.rs_validation_otherPopBatchId_E = rs_validation_otherPopBatchId_E;
    }

    public java.lang.String getRs_validation_otherPopBatchId_E(int i) {
        return this.rs_validation_otherPopBatchId_E[i];
    }

    public void setRs_validation_otherPopBatchId_E(int i, java.lang.String _value) {
        this.rs_validation_otherPopBatchId_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rs_validation_otherPopBatchIdType)) return false;
        Rs_validation_otherPopBatchIdType other = (Rs_validation_otherPopBatchIdType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rs_validation_otherPopBatchId_E==null && other.getRs_validation_otherPopBatchId_E()==null) || 
             (this.rs_validation_otherPopBatchId_E!=null &&
              java.util.Arrays.equals(this.rs_validation_otherPopBatchId_E, other.getRs_validation_otherPopBatchId_E())));
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
        if (getRs_validation_otherPopBatchId_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRs_validation_otherPopBatchId_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRs_validation_otherPopBatchId_E(), i);
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
        new org.apache.axis.description.TypeDesc(Rs_validation_otherPopBatchIdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_validation_otherPopBatchIdType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rs_validation_otherPopBatchId_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_validation_otherPopBatchId_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "Rs_validation_otherPopBatchId_E"));
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
