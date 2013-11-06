/**
 * EMBLBlock_extraAccType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package gov.nih.nlm.ncbi.www.soap.eutils.efetch;

public class EMBLBlock_extraAccType  implements java.io.Serializable {
    private java.lang.String[] EMBLBlock_extraAcc_E;

    public EMBLBlock_extraAccType() {
    }

    public EMBLBlock_extraAccType(
           java.lang.String[] EMBLBlock_extraAcc_E) {
           this.EMBLBlock_extraAcc_E = EMBLBlock_extraAcc_E;
    }


    /**
     * Gets the EMBLBlock_extraAcc_E value for this EMBLBlock_extraAccType.
     * 
     * @return EMBLBlock_extraAcc_E
     */
    public java.lang.String[] getEMBLBlock_extraAcc_E() {
        return EMBLBlock_extraAcc_E;
    }


    /**
     * Sets the EMBLBlock_extraAcc_E value for this EMBLBlock_extraAccType.
     * 
     * @param EMBLBlock_extraAcc_E
     */
    public void setEMBLBlock_extraAcc_E(java.lang.String[] EMBLBlock_extraAcc_E) {
        this.EMBLBlock_extraAcc_E = EMBLBlock_extraAcc_E;
    }

    public java.lang.String getEMBLBlock_extraAcc_E(int i) {
        return this.EMBLBlock_extraAcc_E[i];
    }

    public void setEMBLBlock_extraAcc_E(int i, java.lang.String _value) {
        this.EMBLBlock_extraAcc_E[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EMBLBlock_extraAccType)) return false;
        EMBLBlock_extraAccType other = (EMBLBlock_extraAccType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EMBLBlock_extraAcc_E==null && other.getEMBLBlock_extraAcc_E()==null) || 
             (this.EMBLBlock_extraAcc_E!=null &&
              java.util.Arrays.equals(this.EMBLBlock_extraAcc_E, other.getEMBLBlock_extraAcc_E())));
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
        if (getEMBLBlock_extraAcc_E() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEMBLBlock_extraAcc_E());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEMBLBlock_extraAcc_E(), i);
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
        new org.apache.axis.description.TypeDesc(EMBLBlock_extraAccType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "EMBL-block_extra-accType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMBLBlock_extraAcc_E");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "EMBL-block_extra-acc_E"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ncbi.nlm.nih.gov/soap/eutils/efetch", "EMBL-block_extra-acc_E"));
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
